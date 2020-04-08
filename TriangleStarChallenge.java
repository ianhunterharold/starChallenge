
public class TriangleStarChallenge {

	public static void main(String[] args) {
		buildStarStructure();
	}

	public static void buildStarStructure() { 
		for (int i = 0; i < 5; i++) { 
		
			for (int j = 0; j < 5 - i; j++) { 
				System.out.print(" "); 
				} 
			for (int k = 0; k <= i; k++) {
				System.out.print("* "); 
				} 
			System.out.println(); 
			} 
	}
		
}
