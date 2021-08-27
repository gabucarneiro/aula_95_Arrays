package program;

import java.util.Scanner;
import employee.Employee;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Número de funcionários: ");
		int n = sc.nextInt();
		Employee[] empl = new Employee[n+1];
		
		for(int i=1;i<empl.length; i++) {
			System.out.printf("Empregado #%d:%n", i);
			System.out.print("ID: "+i +"\n");
			System.out.print("Nome: ");
			String name = sc.next();
			System.out.print("Salario: ");
			double salary = sc.nextDouble();
			
			empl[i]= new Employee(i, name, salary);
			System.out.println();
		}
		System.out.println();
		System.out.println("----- ----- FUNCIONÁRIOS ----- -----");
		try {
			for (int i = 1; i < empl.length; i++) {
				if (empl[i].getName() == null) {
					System.out.println("ID: "+ i + " - Não cadastrado");
				}
				else {
					System.out.println(empl[i].toString() + "\n");
				}
				
			} 
		} catch (Exception e) {

			System.out.println("ID: - Não cadastrado");
			//System.out.println(e.getMessage());
		}
		System.out.println();
		System.out.println("ID do funcionário para alteração no salário: ");
		int id_salario = sc.nextInt();
		for(int i = 1; i<empl.length; i++) {
			try {
				if (id_salario == empl[i].getId()) {
					System.out.print("Funcionário encontrado:\n");
					System.out.println(empl[i].toString());
					System.out.print("Porcentagem para aumento: ");
					double valor = sc.nextDouble();
					double newSalary = (empl[i].getSalary() + ((empl[i].getSalary() * valor)/100));
					empl[i].setSalary(newSalary);
					System.out.println("Salário atualizado: ");
					System.out.println(empl[i].toString());				
				}
				else {
					//System.out.println("ID inexistente.");
				}
			} catch (Exception e) {
			}
		}
		System.out.println();
		System.out.println("----- ----- FUNCIONÁRIOS ----- -----");
		try {
			for (int i = 1; i < empl.length; i++) {
				try {
					if (empl[i].getName() == null) {
						System.out.println("ID: "+ i + " - Não cadastrado");
					}
					else {
						System.out.println(empl[i].toString() + "\n");
					}
				} catch (Exception e) {
				}
				
			} 
		} catch (Exception e) {
		}
		
		sc.close();
	}

}
