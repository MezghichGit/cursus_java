package com.gk.day4;

public class LesExceptions {

	public static void division(int a, int b) throws ArithmeticException // peut déclencher une exception
	{
		if (b == 0)

			throw new ArithmeticException("Tu as passé un paramètre zéro");

		else
			System.out.println(a / b);
	}

	public static void main(String[] args) {
		System.out.println("Hello GK");
		try {
		   division(10,0);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fin du programme");
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
