package javaApp.dev1;
import java.sql.*;
import java.util.Scanner;
public class JDBCBatchInsert {
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Scanner sc=new Scanner(System.in);
		int choice;
		Connection con=null;
		PreparedStatement ps=null;
		try {
			con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/sample","root","admin");
			} catch (SQLException e) {
				System.out.println(e);
			}
		try {
			ps = con.prepareStatement("INSERT INTO employee (emp_id, emp_name, emp_salary) VALUES (?, ?, ?)");
			System.out.println("How many rows do you want to insert?");
			int numRec = sc.nextInt();
			for(int i = 0; i<numRec;i++) {
				System.out.println("Enter employee ID");
				int emp_id = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter employee name");
				String emp_name = sc.nextLine();
				System.out.println("Enter salary");
				int salary = sc.nextInt();
				ps.setInt(1, emp_id);
				ps.setString(2, emp_name);
				ps.setInt(3, salary);
				ps.addBatch();
			}
			//Executes all the insert statemente in the batch
			ps.executeBatch();
			System.out.println("==========================");
			System.out.println("VIEW ROWS");
			ps = con.prepareStatement("select * from employee");
			ResultSet rs = ps.executeQuery();
			System.out.println("==========================");
			//Step 5 - Process the results
			while (rs.next()) 
			  System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
			System.out.println("==========================");
		  } catch (SQLException e) {
			  System.out.println(e);
			}
	}
}