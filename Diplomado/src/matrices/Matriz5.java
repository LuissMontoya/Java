package matrices;

public class Matriz5 {

    public static void main(String[] args) {
        int canTorres = 7, canPisos = 20, canAptos = 6;
        int[][][] complejo = new int[canTorres][canPisos][canAptos];

        //LLenar complejo habitacional con habitantes aleatorios
        for (int i = 0; i < canTorres; i++) {
            for (int j = 0; j < canPisos; j++) {
                for (int k = 0; k < canAptos; k++) {
                    complejo[i][j][k] = (int) Math.round(Math.random() * 10);
                }
            }
        }

        //cantidad total de habitantes del complejo
        int habitantes = 0;
        for (int i = 0; i < canTorres; i++) {
            for (int j = 0; j < canPisos; j++) {
                for (int k = 0; k < canAptos; k++) {
                    habitantes += complejo[i][j][k];
                }
            }
        }
        System.out.println("Total de habitantes del complejo son: " + habitantes);
        System.out.println();
        //Promedio de habitantes por Torre
        int habitantesPiso = 0;
        for (int i = 0; i < canTorres; i++) {
            for (int j = 0; j < canPisos; j++) {
                for (int k = 0; k < canAptos; k++) {
                    habitantesPiso += complejo[i][j][k];
                }
                System.out.printf("El piso [%d] de la torre [%d] tiene en promedio: %d habitantes.\n", 
                        (j + 1), (i + 1), (habitantesPiso / canAptos));
                habitantesPiso = 0;
            }
            System.out.println();
        }
        System.out.println();

        //Promedio de habitantes por Torre
        int habitantesTorre = 0;
        for (int i = 0; i < canTorres; i++) {
            for (int j = 0; j < canPisos; j++) {
                for (int k = 0; k < canAptos; k++) {
                    habitantesTorre += complejo[i][j][k];
                }
            }
            System.out.printf("La torre [ %d ] tiene en promedio %d habitantes. \n", (i + 1), 
                    (habitantesTorre / canTorres));
            habitantesTorre = 0;
        }

    }
}
