public class TestArreglos {
    int arreglo1[], arreglo4;           // Definimos manejadores
    int []arreglo2, arreglo5 = { 1,2,3,4,5,6,7,8,9,0};
    int[] arreglo3, arreglo6 = new int[15];
    int matriz[][] = { {1,2}, {3}, {4,5,6}, {7,8,9,0} };
    
    public TestArreglos() {
        arreglo1 = new int[15];
        
        arreglo1[12] = 2000;
        arreglo3 = new int[20];
        
        llenaArreglo(5, arreglo6);
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = i;
            }
        }
    }
    
    public void llenaArreglo(int value) {
        for(int i = 0; i < arreglo3.length; i++) {
            arreglo3[i] = value;
        }
    }
    
    public void llenaArreglo(int value, int[] apodo) {
        for(int i = 0; i < apodo.length; i++) {
            apodo[i] = value;
        }
    }
    
}







