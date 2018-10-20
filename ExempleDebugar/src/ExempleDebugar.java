
public class ExempleDebugar {
	public static void main(String[] args) {
		int[] myIntArray = {3,2,3,3,7};
		System.out.println("El numero de pendents és "+sumaElements(myIntArray));
		
	}
	
	public static int sumaElements(int[] vec){
		int esquerra=vec[0]; 
		int pendents = 0;
		
		for (int i=1;i<vec.length;i++){
			if (esquerra > vec[i] ) {
				System.out.printf("Baixada  %d ---> %d \n", esquerra, vec[i]);
				pendents ++;
			}
			
			else if (esquerra < vec [i]) {
			
				System.out.printf("Pujada   %d ---> %d \n", esquerra, vec[i]);
				pendents ++;
			}
			//**resultat = resultat + vec[i];
			esquerra = vec[i];
		}
		return pendents;
	}

}
