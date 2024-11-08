//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String[][] dnaMatriz = new String[6][6];

        dnaMatriz[0][0] = "G";
        dnaMatriz[0][1] = "A";
        dnaMatriz[0][2] = "G";
        dnaMatriz[0][3] = "A";
        dnaMatriz[0][4] = "A";
        dnaMatriz[0][5] = "A";
        dnaMatriz[1][0] = "T";
        dnaMatriz[1][1] = "T";
        dnaMatriz[1][2] = "A";
        dnaMatriz[1][3] = "G";
        dnaMatriz[1][4] = "T";
        dnaMatriz[1][5] = "A";
        dnaMatriz[2][0] = "G";
        dnaMatriz[2][1] = "A";
        dnaMatriz[2][2] = "G";
        dnaMatriz[2][3] = "A";
        dnaMatriz[2][4] = "A";
        dnaMatriz[2][5] = "A";
        dnaMatriz[3][0] = "G";
        dnaMatriz[3][1] = "A";
        dnaMatriz[3][2] = "G";
        dnaMatriz[3][3] = "A";
        dnaMatriz[3][4] = "A";
        dnaMatriz[3][5] = "A";
        dnaMatriz[4][0] = "T";
        dnaMatriz[4][1] = "T";
        dnaMatriz[4][2] = "A";
        dnaMatriz[4][3] = "G";
        dnaMatriz[4][4] = "T";
        dnaMatriz[4][5] = "A";
        dnaMatriz[5][0] = "G";
        dnaMatriz[5][1] = "A";
        dnaMatriz[5][2] = "G";
        dnaMatriz[5][3] = "A";
        dnaMatriz[5][4] = "A";
        dnaMatriz[5][5] = "A";

        int f, c;

        for (f=0; f < 6 ;f++) {
            for (c=0; c < 6 ;c++) {
                System.out.println("dnaMatriz[" + f + "][" + c + "] = " + dnaMatriz[f][c]);
            }
        }

        String[] dna = {"ATGCGA", "CAGTGC", "TTATGT", "AGAAGG", "CCCTAA", "TCACTG"};

        for (int v=0; v < dna.length ;v++) {
                System.out.println(dna[v]);
        }


    }
}