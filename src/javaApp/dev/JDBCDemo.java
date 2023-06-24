package javaApp.dev;
import java.sql.*;
import java.util.Scanner;
public class JDBCDemo {
	public static void main(String[] args) {
		//Step 1 - Load the driver - In MySQL, this is done automatically
		//Class.forName(<Class Name>)
		Scanner sc=new Scanner(System.in);
		int choice;
		Connection con=null;
		PreparedStatement ps=null;
		try {
			//Step 2 - Create a connection
			con= DriverManager.getConnection( "jdbc:mysql://localhost:3306/sample","root","admin");
		}
		catch (SQLException e) 
		{
			System.out.println(e);
		}
		while (true) {
			System.out.println("===MENU=====");
			System.out.println("1. INSERT Row/s");
			System.out.println("2. SELECT Row/s");
			System.out.println("3. UPDATE Row/s");
			System.out.println("4. DELETE Row/s");
			System.out.println("5. Exit");
			System.out.println("Enter your choice");
			choice =sc.nextInt();
			if(choice == 1) {
				System.out.println("INSERT");
				try {
				//Step 3 - Create a Statement/PreparedStatement
				ps = con.prepareStatement("INSERT INTO employee (emp_id, emp_name, emp_salary) VALUES (?, ?, ?)");
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
				//Step 4 - Execute the query
				ps.executeUpdate();
				}
				catch (SQLException e) 
				{
					System.out.println(e);
				}
			}
			else if (choice == 2)
			 {
			  System.out.println("VIEW ROWS");
			  try {
			      ps = con.prepareStatement("select * from employee");
				  //Step 4 - Execute the query
				  ResultSet rs = ps.executeQuery();
				  System.out.println("==========================");
				  //Step 5 - Process the results
				  while (rs.next()) {
					System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
					System.out.println("==========================");
				  }
			  }
		      catch (SQLException e) {
					System.out.println(e);
					}
			 }
			else if (choice == 3)
				{
				 System.out.println("UPDATE");
				 try {
					ps = con.prepareStatement("update employee set emp_salary = ? where emp_id = ?");
					System.out.println("Enter salary");
					int newsalary = sc.nextInt();
					System.out.println("Enter emp_ID for whom salary has to be changed");
					int emp_id= sc.nextInt();
					ps.setInt(1, newsalary);
					ps.setInt(2, emp_id);
					//Step 4 - Execute the query
					ps.executeUpdate();
					} 
				 catch(SQLException e) {
						System.out.println(e);
						}
				}
			else if (choice == 4)
			    {
				System.out.println("DELETE");
				try {
					ps = con.prepareStatement("delete from employee where emp_id = ?");
					System.out.println("Enter emp_ID to be deleted");
					int emp_id= sc.nextInt();
					ps.setInt(1,emp_id);
					//Step 4 - Execute the query
					ps.executeUpdate();
					}
				catch (SQLException e) {
					System.out.println(e);
					}
				}
			else if(choice == 5)
				break;
	}
   }
}
