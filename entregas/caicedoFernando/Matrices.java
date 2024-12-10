class Matrices {
    public static void main(String[] args) {

        int[][] matriz = {
                { 2, 1, 2, 0, 0, 2, 1, 2, 0, 1 },
                { 3, 0, 0, 3, 0, 3, 3, 3, 1, 3 },
                { 1, 0, 3, 1, 2, 0, 3, 0, 1, 3 },
                { 0, 1, 2, 2, 3, 0, 0, 2, 0, 1 },
                { 0, 1, 2, 1, 2, 0, 0, 3, 3, 0 },
                { 1, 0, 0, 2, 1, 2, 1, 3, 1, 1 },
                { 3, 0, 0, 3, 2, 3, 0, 3, 3, 3 },
                { 1, 3, 1, 2, 0, 2, 2, 1, 2, 0 },
                { 2, 3, 3, 1, 3, 0, 3, 3, 1, 2 },
                { 1, 1, 1, 2, 0, 2, 2, 1, 3, 3 }
        };
        imprime(matriz);
    }

    static void imprime(int[][] matriz) {
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                System.out.print(parse(matriz[fila][columna]) + " ");
            }
            System.out.println();
        }
    }

    static String parse(int valor) {
        final String[] TILES = {
                " ", "#", "``", "@", "```", ":::", ";;;", "&&&", "[[[]]]", "===", "***",
        };
        return TILES[valor];
    }
}