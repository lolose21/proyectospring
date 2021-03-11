package repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import models.Hospitales;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Repository11Hospitales {

    private DriverManagerDataSource datasource;

    public Repository11Hospitales(DriverManagerDataSource datasource) {
        this.datasource = datasource;
    }

    public Hospitales buscarHospitales(int hospitlcod) throws SQLException {

        Connection cn = datasource.getConnection();
        String sql = "select * from hospital where hospital_cod=?";
        PreparedStatement pst = cn.prepareStatement(sql);
        pst.setInt(1, hospitlcod);
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            int id = rs.getInt("hospital_cod");
            String nombre = rs.getString("nombre");
            String direccion = rs.getString("direccion");
            String telefono = rs.getString("telefono");
            int numcama = rs.getInt("num_cama");
            Hospitales hospital = new Hospitales(id, nombre, direccion, telefono, numcama);
            rs.close();
            cn.close();
            return hospital;
        }
        rs.close();
        cn.close();
        return null;
    }
}
