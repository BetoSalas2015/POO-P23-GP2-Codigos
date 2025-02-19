public class TestGenericos {
    
    public static <E> void imprimeArreglo(E[] arregloEntrada) {
        for(E elemento : arregloEntrada) {
            System.out.print( elemento + ", ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Double[] arrDouble = { 2.3, 3.2, 5.4, 6.5, 7.3};
        Integer[] arrInteger = { 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Character[] arrCharacter = { 'a', 'b', 'c', 'd'};
        Boolean[] arrBoolean = { true, true, false, true, false};
        imprimeArreglo(arrDouble); 
        imprimeArreglo(arrInteger);
        imprimeArreglo(arrCharacter);
        imprimeArreglo(arrBoolean);
    }

}


/*                  Wrappers
 *       int    --> Integer
 *       char   --> Character
 *       float  --> Float
 *       double --> Double
 *       byte   --> Byte
 *       boolean --> Boolean
 * 
 */
