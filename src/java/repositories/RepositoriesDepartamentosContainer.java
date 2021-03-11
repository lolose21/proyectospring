package repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletContext;
import models.Departamento;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class RepositoriesDepartamentosContainer {

    //el repository , para poder tebajar , necesita un DriverMAnagerdatasource
    private DriverManagerDataSource datasource;

    public RepositoriesDepartamentosContainer(DriverManagerDataSource datasource) {
        this.datasource = datasource;
    }

    public Departamento BuscarDepartamento(int id) throws SQLException {
        Connection cn = datasource.getConnection();
        String sql = "select * from dept where dept_no=?";
        PreparedStatement pst = cn.prepareStatement(sql);
        pst.setInt(1, id);
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            int iddept = rs.getInt("dept_no");
            String nombre = rs.getString("dnombre");
            String localidad = rs.getString("loc");
            Departamento dept = new Departamento(iddept, nombre, localidad);
            rs.close();
            cn.close();
            return dept;
        }
        rs.close();
        cn.close();
        return null;
    }

}
