package repositories;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import models.Empleado;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class RepositoryEmpleados {

    DriverManagerDataSource dataSource;

    public RepositoryEmpleados(DriverManagerDataSource datasource) {
        this.dataSource = datasource;
    }

    public List<Empleado> getEmpleado() throws SQLException {
        Connection cn = this.dataSource.getConnection();
        String sql = "select * from emp";
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        ArrayList<Empleado> empleados = new ArrayList<>();
        while (rs.next()) {
            int id = rs.getInt("emp_no");
            String apellido = rs.getString("apellido");
            String oficio = rs.getString("oficio");
            int Salario = rs.getInt("salario");
            Empleado emp = new Empleado(id, apellido, oficio, Salario);
            empleados.add(emp);
        }
        rs.close();
        cn.close();
        return empleados;
    }

    public List<Empleado> getEmpleadosSession(List<String> listaids) throws SQLException {
        Connection cn = this.dataSource.getConnection();
        //debemos separar los ids por comas
        String data = "";
        for (String id : listaids) {
            data += id + ",";

        }
        data = data.substring(0, data.lastIndexOf(","));
        String sql = "select * from emp where emp_no in(" + data + ")";
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        ArrayList<Empleado> empleados = new ArrayList<>();
        while (rs.next()) {
            int id = rs.getInt("emp_no");
            String apellido = rs.getString("apellido");
            String oficio = rs.getString("oficio");
            int salario = rs.getInt("salario");
            Empleado emp = new Empleado(id, apellido, oficio, salario);
            empleados.add(emp);
        }
        rs.close();
        cn.close();
        return empleados;
    }
}
