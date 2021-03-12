package repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import models.Enfermo;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class RepositoryEnfermos {

    private DriverManagerDataSource datasource;

    public RepositoryEnfermos(DriverManagerDataSource datasource) {
        this.datasource = datasource;
    }

    public List<Enfermo> getEnfermo() throws SQLException {
        Connection cn = this.datasource.getConnection();
        String sql = "select * from enfermo";
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        ArrayList<Enfermo> enfermos
                = new ArrayList<>();
        while (rs.next()) {
            int inscripcion = rs.getInt("inscripcion");
            String apellido = rs.getString("apellido");
            String dir = rs.getString("dirreccion");
            String fecha = rs.getString("fecha_nac");
            String sexo = rs.getString("sexo");
            int nss = rs.getInt("nss");
            Enfermo enfermo = new Enfermo(inscripcion, apellido, dir, fecha, sexo, nss);
            enfermos.add(enfermo);
        }
        rs.close();
        cn.close();
        return enfermos;
    }

    public void eliminarEnfermo(int inscripcion) throws SQLException {
        Connection cn = this.datasource.getConnection();
        String sql = "delete from enfermo where inscripcion=?";
        PreparedStatement pst = cn.prepareStatement(sql);
        pst.setInt(1, inscripcion);
        pst.executeUpdate();
        cn.close();
    }
}
