package com.projeto.main;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.projeto.client.Client;
import com.projeto.exceptions.InputNotAnIntegerException;
import com.projeto.server.ServerExtendido;

/**
 * Classe principal do programa que contém o método main para execução do programa.
 *
 */
public class App 
{

	

    public static void main( String[] args ){
    Scanner ler = new Scanner(System.in);
    int x = 0;
     Client client = null;
    System.out.println("╔═══════════════════════╗");
    System.out.println("║   Menu de Opções      ║");
    System.out.println("╠═══════════════════════╣");
    System.out.println("║  1) - Entrar no       ║");
    System.out.println("║        sistema        ║");
    System.out.println("║                       ║");
    System.out.println("║  0) - Sair do         ║");
    System.out.println("║       programa        ║");
    System.out.println("╚═══════════════════════╝");
    System.out.print("Escolha uma opção: ");
    x = ler.nextInt();
    ler.nextLine();
    switch (x) {
    
    
    }try{
                switch (x) {
                case 1:
                    ServerExtendido server1 = new ServerExtendido();
                   client = new Client(server1);
                   client.client();
                    break;

                case 0:
                    System.out.println("\nFechando o sistema!!");
                    break;
                default:
                    System.out.println("\nOpção inválida");
                    break;
            }
            
            if (x != 0) {
                System.out.print("\nPressione Enter para continuar...");
                ler.nextLine();
            }
		}catch(InputMismatchException e){
            System.out.println("Entrada inválida. Digite um número inteiro.");
        }catch (InputNotAnIntegerException e) {
            System.out.println(e.getMessage());}
 
        }
}	


