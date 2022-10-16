import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Chave extends Boletim {


    private int numChave;

    private int[] numeros;

    private int[] estrelas;

    private int estrelasCertas;


    public Chave() {
        this.numChave = numChave;
        this.numeros = numeros;
        this.estrelas = estrelas;


    }

    public int getNumChave() {
        return numChave;
    }

    public void setNumChave(int numChave) {
        this.numChave = numChave;
    }

    public Chave(int numChave, int[] numeros, int[] estrelas) {

        this.numChave = numChave;
        this.numeros = numeros;
        this.estrelas = estrelas;
        this.estrelasCertas = estrelasCertas;
    }


    public int[] getNumeros() {
        return numeros;
    }


    public int[] getEstrelas() {
        return estrelas;
    }

    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }


    public void setEstrelas(int[] estrelas) {
        this.estrelas = estrelas;
    }

    public int getEstrelasCertas() {
        return estrelasCertas;
    }

    public void setEstrelasCertas(int estrelasCertas) {
        this.estrelasCertas = estrelasCertas;
    }

    @Override
    public String toString() {
        return
                "\n\tNumeros: " + Arrays.toString ( numeros ) +
                        "\t\tEstrelas: " + Arrays.toString ( estrelas );
    }

    public static int NumerosComuns(int[] num,
                                    int[] nums) {
        int contNum = 0;

        if (num.length > 0 && nums.length > 0) {
            Set<Integer> numbs = new HashSet<> (); // ( instanciar uma lista hashset para indicar os duplicados)
            for (int i = 0; i < num.length; i++) { //correr essa mesma lista e add
                numbs.add ( num[i] );
            }

            for (int j = 0; j < nums.length; j++) {
                if (numbs.contains ( nums[j] )) {// se a lista conter elementos duplicados, ira conta-los e imprimir
                    System.out.println ("Numeros em comum: ");
                    System.out.print ( nums[j] + " " );
                    contNum++;
                }


            }

        }
        return contNum; // retonar um numero int para no main saber a qt de numeros repetidos para a atribuiçao de premios
    }

    public static int EstrelasComuns(int[] star,
                                     int[] star1) {
        int contStar = 0;

        if (star.length > 0 && star1.length > 0) {
            Set<Integer> stars = new HashSet<> ();
            for (int i = 0; i < star.length; i++) {
                stars.add ( star[i] );
            }

            for (int j = 0; j < star1.length; j++) {
                if (stars.contains ( star1[j] )) {
                    System.out.println ("\nEstrelas em comum: ");
                    System.out.print ( star1[j] + " " );
                    contStar++;

                }


            }

        }

        return contStar;

    }


}







