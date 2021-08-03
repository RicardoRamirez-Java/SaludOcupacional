
package ConexionesBD;

import Clases.BeanReporteGeneral;
import Clases.BeanReporteReUsuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;


public class ReporteGeneral {
  Connection c = null;
  
    public ReporteGeneral() {
    }
    //metodo crud con bean para generar reporte 
    public Vector getReporteGeneral() {

        Vector v=new Vector();
        try {
            c = PollDeConexiones.getInstance().getConnection();
            String s = "select tr.codigo_test,tr.fecha,e.nombres,e.apellidos from testRealizados as tr inner join lc_empleados as e on tr.codigo_usuario=e.id_empleado";
            PreparedStatement p = c.prepareStatement(s);

            ResultSet rS = p.executeQuery();

             while (rS.next())
        {   //SE LLAMA A LA CLASE  Y SE LE PASA LOS PARAMETORS OBTENIDOS DELA BASE
           BeanReporteGeneral rpv=new BeanReporteGeneral(rS.getInt(1), rS.getDate(2),rS.getString(3),rS.getString(4)); 
           v.addElement(rpv);
           
        }

            rS.close();
            p.close();

        } catch (SQLException e) {
            System.out.println("Database Access Error.");
            e.printStackTrace();
        } finally { // Cierra la conexion
            if (c != null) {
                try {
                    PollDeConexiones.getInstance().closeConnection(c);
                } catch (SQLException e) {
                }
            }
        }
        return v;
    }
    public Vector getReporteUsuariosSI() {

        Vector v=new Vector();
        try {
            c = PollDeConexiones.getInstance().getConnection();
            String s = "select tr.codigo_test,tr.fecha,e.nombres,e.apellidos,pr.codigo,pr.pregunta,d.respuesta from testRealizados as tr inner join lc_empleados as e on tr.codigo_usuario=e.id_empleado inner join detalletest as d on tr.codigo_test =d.codigo_test inner join preguntasSalud as pr on d.codigo_pregunta=pr.codigo ORDER BY tr.codigo_test ASC";
            PreparedStatement p = c.prepareStatement(s);

            ResultSet rS = p.executeQuery();

             while (rS.next())
        {   //SE LLAMA A LA CLASE  Y SE LE PASA LOS PARAMETORS OBTENIDOS DELA BASE
           BeanReporteReUsuario rpv=new BeanReporteReUsuario(rS.getInt(1),rS.getDate(2),rS.getString(3),rS.getString(4),rS.getInt(5),rS.getString(6),rS.getString(7)); 
           v.addElement(rpv);
           
        }

            rS.close();
            p.close();

        } catch (SQLException e) {
            System.out.println("Database Access Error.");
            e.printStackTrace();
        } finally { // Cierra la conexion
            if (c != null) {
                try {
                    PollDeConexiones.getInstance().closeConnection(c);
                } catch (SQLException e) {
                }
            }
        }
        return v;
    }

}
