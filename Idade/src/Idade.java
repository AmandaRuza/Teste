import java.util.Scanner;

public class Idade {

	public static void main (String[] args) {
		//TODO Auto-generated method stub
		
		//Dica: sout + ctrl + " "
		System.out.println("Idade...");
		
		Scanner scanner = new Scanner(System.in);
		//Scanner scanner = new Scanner(System.in);

		System.out.println("Informe o ano em que vc conheceu o amor da sua vida: ");
		
		try {
			System.out.println("Voc� conheceu o amor da sua vida h�: " + (2018 - scanner.nextInt()) + " anos!");
		}
		catch (Exception e) {
			System.out.println("Ops! Em que momento tudo deu errado, an�o?");
			//e.printStackTrace();
			//System.out.println(e.getLocalizedMessage());
		}
		
		scanner.close();
	}
}
