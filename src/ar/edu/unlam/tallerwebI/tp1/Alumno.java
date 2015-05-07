package ar.edu.unlam.tallerwebI.tp1;

public class Alumno {
	
	int primerParcial;
	int segundoParcial;
	boolean estado;
	public void calificarPrimerParcial(int primerParcial){
		
		this.primerParcial = primerParcial;
		
	}
	
	public int getPrimerParcial(){
		return this.primerParcial;
	}
	
	public void calificarSegundoParcial(int segundoParcial){
		
		this.segundoParcial = segundoParcial;
		
	}
	
	public int getSegundoParcial(){
		return this.segundoParcial;
	}
	
	public boolean estaAprobado(){
	
				if(this.primerParcial>=4 && this.segundoParcial>=4)
				{
					estado = true;
				}else{
					estado = false;
				     }
			
			return estado;
	}
	
	public boolean estaPromocionado(){
		
			
				if(this.primerParcial>=7 && this.segundoParcial>=7)
				{
					estado = true;
				}else{
					estado=false;
				}
			
		
		return estado;
}
}
