public class App {
    public static void main(String[] args)   {
        
        int[][] matriz ={ { 6, 4, 1 },
                            { 8, 2, 9 },
                            { 3, 5, 7 } };

        OperacionesMatrices objMatriz = new OperacionesMatrices();

        objMatriz.mostrarMatriz(matriz);
    }
}
