
public class CharterPattern {

	public static void main(String[] args) {
		int num=3;
		for(int i = 1; i <= num; i++){
            // this loop will print the spaces after which the
            // number has to be printed
            for(int j = 0; j < num - i; j++){
                System.out.print(" ");
            }
            // this loop will print the number ascending part
            for(int k = 1; k < i; k++){
                System.out.print((char)(k+96));
            }
            // this loop will print the number descending part
            for(int l = i; l >=1; l--){
                System.out.print((char)(l+96));
            }
            System.out.println(); 
            
	}
		for(int i = num-1; i >= 1; i--){
		
            // this loop will print the spaces after which the
            // number has to be printed
            for(int j = 1; j <= num - i; j++){
                System.out.print(" ");
            }
            // this loop will print the number ascending part
            for(int k = 1; k < i; k++){
            	
                System.out.print((char)(k+96));
               
            }
            // this loop will print the number descending part
            for(int l = i; l >=1; l--){
                System.out.print((char)(l+96));
                
            }            
            System.out.println();           
        }   
	}
}


