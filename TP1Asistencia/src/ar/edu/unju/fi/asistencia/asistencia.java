package ar.edu.unju.fi.asistencia;

public class asistencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i =2; 
int j;
boolean	bandera = true ;
int valor =0;
int descuento = 1;
for (j=40 ; j>=0 ; j--){
		if (bandera) {
			valor=j*i;
			bandera=false;
			descuento = descuento + i;
		}
		else {
			System.out.print(valor+ " ");
			valor= valor + (40-descuento);
			descuento=descuento+i;
		}



	}

	}

}



	
	
	
	
	


