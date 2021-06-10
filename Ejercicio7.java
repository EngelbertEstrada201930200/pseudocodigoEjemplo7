
public class Ejercicio7 {

	public static void main (String[] args){


		int aleatorio;
		double pares = 0;
		double impares = 0; 
		double ceros = 0;
	

		for ( int i = 1 ; i <= 15 ; i++){

			aleatorio = (int)(Math.random()*36+1);

			System.out.println( aleatorio );

			if ( aleatorio % 2 == 0){

				pares = pares + aleatorio ;

			} else if ( aleatorio % 2 == 1 ) {

				impares = impares+ aleatorio;
			} else {

				ceros =  ceros + aleatorio ;
			}
		}

		System.out.println (" Pares:  "+ pares/100);
		System.out.println (" Impares:  "+ impares/100);
		System.out.println ( " Ceros: "+ ceros/100);


	}
}