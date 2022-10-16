import java.util.HashSet;
import java.util.Set;

public class Boletim {
    private int numBoletim;


    private  int numCertos;
    private Chave chaves;
    private int[] numeros;

    private int[] estrelas;


    public Boletim( Chave chaves) {
        super();
        this.numBoletim = 0;
        this.chaves = new Chave ();

    }
   public  Boletim(int numBoletim, Chave chaves){
        this.numBoletim = numBoletim;
        this.chaves = new Chave ();
   }

    public Boletim(){

    }




    public int[] getNumeros() {
        return this.numeros;
    }
    public int[] getEstrelas() {
        return estrelas;
    }

    public int getNumBoletim() {
        return numBoletim;
    }

    public void setNumBoletim(int numBoletim) {
        this.numBoletim = numBoletim;
    }

    public Chave getChaves() {
        return chaves;
    }



    public void setChaves(Chave chaves) {
        this.chaves = chaves;
    }



    @Override
    public String toString() {
        return "Boletim{" +
                "numBoletim=" + numBoletim +
                ", chaves=" + chaves +
                '}';
    }


    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }

    public void setEstrelas(int[] estrelas) {
        this.estrelas = estrelas;
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
                if (numbs.contains ( nums[j] )) { // se a lista conter elementos duplicados, ira conta-los e imprimir
                    contNum++;
                    System.out.println ( "Numeros em comum: " );
                    System.out.print ( nums[j] + " " );

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

                    contStar++;
                    System.out.println ( "\nEstrelas em comum: " );
                    System.out.print ( star1[j] + " " );

                }

            }

        }


        return  contStar ;
    }





}







