package javaApp.dev;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercise15 {
	
	public class Employee {
		private int id;
		private String name;
		private String designation;
		private float salary;
		
		public Employee() {
		}
		public Employee(int id, String name, String designation, float salary) {
			super();
			this.id = id;
			this.name = name;
			this.designation = designation;
			this.salary = salary;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDesignation() {
			return designation;
		}
		public void setDesignation(String designation) {
			this.designation = designation;
		}
		public float getSalary() {
			return salary;
		}
		public void setSalary(float salary) {
			this.salary = salary;
		}

		public String display() {
			return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", salary=" + salary
					+ ", getId()=" + getId() + ", getName()=" + getName() + ", getDesignation()=" + getDesignation()
					+ ", getSalary()=" + getSalary() + "]";
		}
	}

	public static void main(String[] args) {
		
		Employee[] employee_arr = new Employee[10];
		// Employee emp_arr = new Employee();
		
		Scanner in = new Scanner(System.in);
		int temp_id = 0;
		String temp_name, temp_design;
		float temp_sala = 0f;
		Exercise15 exercise15 = new Exercise15();
		for (int index = 0;index < 10; index++)  {
			System.out.print("Enter employee id  : ");
			temp_id = in.nextInt();
			// employee_arr[index].setId(temp_id);
			System.out.print("Enter employee name  : ");
			temp_name = in.next();
			//employee_arr[index].setName(temp_name);
			System.out.print("Enter designation  : ");
			temp_design = in.next();
			//employee_arr[index].setDesignation(temp_design);
			System.out.print("Enter salary  : ");
			temp_sala = in.nextFloat();
			//employee_arr[index].setSalary(temp_sala);
			employee_arr[index] = exercise15.new Employee();
			employee_arr[index].setId(temp_id);
			employee_arr[index].setName(temp_name);
			employee_arr[index].setDesignation(temp_design);
			employee_arr[index].setSalary(temp_sala);
			employee_arr[index].display();
		
	      }
		
		int emp_id = 0;
		do {
			System.out.println("========== Employee Query =======");
			System.out.print("Key-in employee id : ");
			if (in.hasNextInt())
			    emp_id = in.nextInt();
			else 
				 if ( (in.hasNextLine()) || in.nextLine().equals(""))
		     		 {
						 in.close();
						 System.out.println("Quit Employee Query ");
						 break;
					 }
			for (int i = 0; i < 10;i++) {
				if (emp_id == employee_arr[i].getId()) {
					System.out.println("Employee id : " + employee_arr[i].getId() );
					System.out.println("Employee name : " + employee_arr[i].getName() );
					System.out.println("Employee designation : " + employee_arr[i].getDesignation() );
					System.out.printf("Employee salary : % ,.2f ", employee_arr[i].getSalary());
					System.out.println();
					break;
				}
			}
		} while (true);
	}
}
