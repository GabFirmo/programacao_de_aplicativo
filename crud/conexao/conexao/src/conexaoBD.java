import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexaoBD {
    public Connection Connection(){
        //"con" eh o nome
        Connection con = null;
        try{
            //"bancocorud" eh o nome do banco, tem como trocar dps
            // quando nao ter senha pode apenas deixar em branco
            String url = "jdbc:mysql//localhost:3306//bancocrud?user=root&password=";
            con = DriverManager.getConnection(url);
            
        }catch (SQLException erro){
            JOptionPane.showMessageDialog(null,"Connection" + erro.getMessage());
        }
        return con;
    }
}
