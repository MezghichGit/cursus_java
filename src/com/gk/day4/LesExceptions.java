package com.gk.day4;

import java.util.Scanner;

public class LesExceptions {
	
	public static void getData(Scanner sc) throws Exception
	{
		
		System.out.println("Donner votre nom min 4 lettres");
		String nom = sc.nextLine();
		
		if(nom.length()>4)
			System.out.println("Nom valide : "+nom);
		else
			throw new Exception("Votre nom doit dépasser 4 caractères");
		
		System.out.println("Donner votre age : >0");
		int age = sc.nextInt();
		
		if(age>0)
			System.out.println("Age valide : "+age);
		else
			throw new Exception("Votre age doit être positif");
		
		
	}

	public static void division(int a, int b) throws ArithmeticException // peut déclencher une exception
	{
		if (b == 0)

			throw new ArithmeticException("Tu as passé un paramètre zéro");

		else
			System.out.println(a / b);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			getData(sc);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Problème lors de la saisie de vos données : "+e.getMessage());
		}
		/*
		System.out.println("Hello GK");
		try {
		   division(10,0);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fin du programme");*/
		/*
		 * int x = 10; int y = 5;
		 */
		/*
		 * try { System.out.println(x / y); } catch (Exception e) {
		 * System.out.println("Problème de calcul"); }
		 */
		/*
		 * int tab[]= {10,2,14}; try { System.out.println(tab[10]); } catch(Exception e)
		 * { System.out.println("Problème d'indice : "+e.getMessage());
		 * e.printStackTrace(); }
		 */
		/*
		String nom = null;
		int x = 10;
		int y = 0;
		int tab[] = { 10, 2, 14 };
		
		 * try { System.out.println(nom.length());// System.out.println(x / y);//
		 * System.out.println(tab[10]); } catch (NullPointerException e) {
		 * System.out.println("Vérifier votre nom : "+e.getMessage());
		 * //e.printStackTrace(); } catch(ArithmeticException e) {
		 * System.out.println("Problème de calcul : "+e.getMessage()); } catch
		 * (Exception e) { System.out.println("Un autre beug : "+ e.getMessage());
		 * ///e.printStackTrace(); return; // provoque une sortie immédiate de la
		 * méthode } finally { System.out.println("Fin du programme");
		 * 
		 * //con.close(); // fermeture de la connection avec la BD }
		 */

	}

}
