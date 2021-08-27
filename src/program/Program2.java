package program;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import employee.Employee2;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Employee2> lista = new ArrayList<>();
		
		System.out.println("Quantos empregados para registrar? ");
		int n = sc.nextInt();
		
		for (int i=1;i<=n;i++) {
			System.out.println();
			System.out.println("Funcionário #"+i+":");
			System.out.println("ID: ");
			int id = sc.nextInt();
			/*while(hasId(lista, id)) {
				System.out.print("ID já cadastrado. Tente novamente.");
				id = sc.nextInt();
			}*/
			System.out.println("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("Salario: ");
			double salario = sc.nextDouble();
			lista.add(new Employee2(id, nome, salario));
		}
		for(Employee2 empregado : lista) {
			System.out.println(empregado);
		}
		
		/*
		int n = sc.nextInt();
		Employee2[] employee = new Employee2[n];
		for(int i=0; i<employee.length; i++) {
			System.out.println("Cadastro do novo funcionário:");
			System.out.print("ID: ");
			Integer id = sc.nextInt();
			System.out.print("Nome: ");
			String name = sc.next();
			System.out.print("Salario: ");
			Double salary = sc.nextDouble();
			
			employee[i] = new Employee2(id, name, salary);
			System.out.println();
			}
	
		for(int i=0; i<employee.length;i++) {
			System.out.println(employee[i].toString());
		}*/
		
		sc.close();
	}
}
