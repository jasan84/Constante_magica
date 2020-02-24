package cubo;

import java.util.Scanner;

public class Constante_magica {
	
	public static void main(String[]args) {
		
		Scanner entrada = new Scanner(System.in);
		int cant_cuadros;
		int numero;
		
		do {
			System.out.println("INGRESA LA CANTIDAD DE CUADROS (IMPAR)");	
			cant_cuadros = entrada.nextInt();
			
			System.out.println("INGRESA EL NÚMERO INICIAL (MAYOR A 0)");
			numero = entrada.nextInt();
			
			int[][] cuadro = new int [cant_cuadros][cant_cuadros];
			
			int cuadro_inicial = (cuadro.length/2+1)-1;

			int hor = cuadro_inicial;
			int vert = 0;
			int suma = 0;	
				
// DA VALOR INICIAL DE -1 A TODOS LOS CUADROS			
			for(int i = 0; i<cuadro.length; i++) {
				for(int j = 0; j<cuadro[i].length; j++) {
	
					cuadro[i][j] = -1;
				}
					
			}
			
// REGLAS DE CARGA DE NÚMEROS			
			for(int i = 0; i < cant_cuadros*cant_cuadros; i++) {
				
				cuadro[hor][vert] = numero;
				hor++;
				vert--;
				numero++;
				
				if(hor==cuadro.length) {
					hor=0;
					if(vert<0) {
						hor=cuadro.length-1;
						vert = vert+2;
					}
				}
				if(vert<0) {
					vert = cuadro[hor].length-1;
				}
				if(cuadro[hor][vert]>-1) {
					hor = hor-1;
					vert = vert+2;
				}
				
			}
			
// RESULTADO DE SUMA			
			for(int i=0;i<cuadro.length;i++) {
				suma = suma+cuadro[i][i];
			}
			
			if(numero != 0 && cant_cuadros != 0) {
				System.out.println(suma);
				
			}
			
		}while(numero != 0 && cant_cuadros != 0);
			
			entrada.close();
	}

}
