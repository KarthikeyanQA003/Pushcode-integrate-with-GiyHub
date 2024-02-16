
import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseTestinhg {

	public static void main(String[] args) throws SQLException, ClassNotFoundException{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection=DriverManager.getConnection("jdbc:mysql://root@localhost/student");
		//"jdbc:mysql://localhost:portnumber/database name","username","password"
		
		Statement statement =connection.createStatement();
		//ResultSet result=statement.executeQuery("SELECT * FROM `students`");
        //while(result.next()){
        	//System.out.println("name:"+result.getString(2));
		String insertQuery ="INSERT INTO students VALUES(13, 'Peter', 3523523, 32)";
		statement.execute(insertQuery );
		connection.close();
		System.out.println("sccess"):
        }
	

}
//String insert ="INSERT INTO `workout`.`workoutlogs`" + " (`SetNumber`, `RepNumber` , `WeightAmount`)"
        //+ "VALUES('" +field_setNumber+"','"+field_repNumber+"','"+field_weightAmount+"')";
//statement.executeUpdate(insert);


