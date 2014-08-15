package br.edu.ifal.proo.projetofinal.view;

import java.util.Scanner;
import java.util.ArrayList;
import br.edu.ifal.proo.projetofinal.model.*;

public class Secretaria {
	private static Scanner leitor;
	
	public static void main(String[]args) {
			
		leitor = new Scanner (System.in);
		
		int opcaoMenu;
			
		do{
				
			//MENU
			System.out.println("CURSO DE INGL�S 'HOW ARE YOU LEARNING?'");
			System.out.println("MENU");
			System.out.println("1- PARA INSERIR CONTRATANTE");
			System.out.println("2- PARA CADASTRAR UM ALUNO");
			System.out.println("3- PARA INSERIR NOTAS DE UM ALUNO");
			System.out.println("4- PARA EDITAR A NOTA DE UM ALUNO");
			System.out.println("5- PARA MOSTRAR O BOLETIM DE UM ALUNO");
			System.out.println("6- PARA EXCLUIR UM ALUNO");
			System.out.println("7- PARA FECHAR O PROGORAMA");
			
			opcaoMenu = leitor.nextInt();

		switch (opcaoMenu){
		

			case 1:
			//Inserir Contratante 
				System.out.println("Digite o nome do contratante: ");
				String nome = leitor.next();
				System.out.println("Digite o cpf do contratante");
				String cpf = leitor.next();
				System.out.println("Digite o sexo do contratante: ");
				String sexo = leitor.next();
				System.out.println("Digite a idade do contratante: ");
				int idade = leitor.nextInt();
				System.out.println("Digite o endereco do contratante: ");
				String endereco = leitor.next();
				System.out.println("Digite a cidade do contratante: ");
				String cidade = leitor.next();
				System.out.println("Digite o estado do contratante: ");
				String estado = leitor.next();
				Contratante contratante = new Contratante(nome,cpf,sexo,idade,endereco,cidade,estado);
				contratante.cadastrarContratante();
			break;
			
			case 2:
			//Cadastrar aluno
				System.out.println("Digite o nome do aluno: ");
				nome = leitor.next();
				System.out.println("Digite o CPF do aluno: ");
				cpf = leitor.next();
				System.out.println("Digite o sexo do aluno: ");
				sexo = leitor.next();
				System.out.println("Digite a idade do aluno: ");
				idade = leitor.nextInt();
				System.out.println("Digite o endereco do aluno: ");
				endereco = leitor.next();
				System.out.println("Digite o cidade do aluno: ");
				cidade = leitor.next();
				System.out.println("Digite o estado aluno: ");
				estado = leitor.next();
				System.out.println("Digite a matricula do aluno: ");
				String matricula = leitor.next();
				System.out.println("Digite o RG do aluno");
				int rg = leitor.nextInt();
				System.out.println("Digite o nivel em que o aluno se encontra (ex: Basic 1; Basic 2, Inter 2)");
				String nivel = leitor.next();
				Aluno aluno = new Aluno(nome, cpf, sexo, idade, endereco, cidade, estado, matricula, rg, nivel);
			break;
			
			case 3:
			//Procurar Contratante
				System.out.println("Digite o cpf do contratante: ");
				cpf = leitor.next();
				
			break;
			case 4:
			//Editar Nota
				System.out.println("Digite o seu nome");
			break;
			case 5:
			//Mostrar Boletim
				System.out.println("Digite o seu nome");
			break;
			case 6:
			//Excluir Aluno
				System.out.println("Digite o seu nome");
			break;
				
		}
		
		}
		while(opcaoMenu != 7);
	}
}