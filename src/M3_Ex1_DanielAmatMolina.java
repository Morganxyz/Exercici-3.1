import java.util.Scanner;

public class M3_Ex1_DanielAmatMolina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Variables:
		String nom, cognom;
		int edat;
		Scanner entrada = new Scanner(System.in);
		
		//Lógica:
		
		System.out.println("Quin es el teu nom?: ");
		nom = entrada.next();
		System.out.println("Quin es el teu primer cognom?: ");
		cognom = entrada.next();
		System.out.println("Quina es la teva edat?: ");
		edat = entrada.nextInt();
		
		System.out.println("Et dius " + nom + " " + cognom + 
				" , i tens " + edat + " anys");
	
	}

}
