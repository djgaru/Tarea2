import java.util.*;
import java.io.*;
	
public class Palindromo {
		//Edgar Alfonso Pérez Hernández
		//Carnet: 201021195
static boolean Pali(String a)
		{
		StringBuffer aux = new StringBuffer(a).reverse();

		return a.equals(aux.toString());
}

public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Introduce una palabra: ");
		String a = null;
		try { a = in.readLine();}
		catch (Exception e) {}
		if(Pali(a)) System.out.println(a + " es palindroma");
		else System.out.println(a + " no es palindroma");
	}
} 