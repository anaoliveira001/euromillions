import java.util.*;


public class Main {
    static List<Chave> chaveSorteada;

    static List<Boletim> boletim;

   static int [] numeros = new int[5];
   static int [] estrelas = new int[2] ;

    static int[] numsSorteados = new int[5];
   static int[] estrelasSorteadas = new int[2];


    static int numChave = 1;

    static Random rnd = new Random ();

    public static void main(String[] args) {

        Scanner in = new Scanner ( System.in );

        int op = 1;

        while (op != 0) {

            System.out.println ( "<<<<<<<<<<<< Euromilhoes! Todos as semanas a criar excentricos! >>>>>>>>>>>>>" );
            System.out.println ( "1 - Preencher Boletim" );
            System.out.println ( "2 - Gerar Boletim com chave aleatoria" );
            System.out.println ( "3 - Sorteio" );
            System.out.println ( "4 - Quantas vezes para ganhar o Jackpot? " );
            System.out.println ( "0 - Vou para casa" );
            op = in.nextInt ();

            switch (op) {
                case 0:
                    break;
                case 1:
                    PreencherBoletim ();
                    break;
                case 2:
                    GerarBoletim ();
                    break;
                case 3:
                    Sorteio ();
                    break;
                case 4:
                    GanharJackpot ();
                    break;
                default:
                    System.out.println ( "Opção errada." );
                    break;

            }
        }


    }

    private static void GanharJackpot() {

        int cont = 0;

        /*
        for (int i = 0; i < boletim.size (); i++) {
            while (chaveSorteada.get ( i ) != boletim.get ( i )) {
                cont++;
                System.out.print ( cont + "||" );
            }
            System.out.println ( "***** JACKPOT *****" );
            break;
        }

         */
    }

    private static void Sorteio() {

        Scanner in = new Scanner ( System.in );

        int numCertos = 0;
        int estrelaCerta = 0;

        System.out.println ( "Qual a chave que quer mostrar?" );
        System.out.println ( "1 - Chave escolhida" );
        System.out.println ( "2 - Chave aleatoria" );
        int op = in.nextInt ();

        if (op == 1) {
            System.out.println (" ------------ Chave Escolhida  -------------");
            MostrarChaveEscolhida ();

        } else if (op == 2) {
            System.out.println (" ------------ Chave Aleatoria -------------");
            MostrarChaveAleatoria ();

        }else {
            System.out.println ("Opção inválida!");
            return;
        }

        ChaveSorteada ();


        for (int i = 0; i < boletim.size (); i++) {
            for (int j = 0; j < chaveSorteada.size (); j++) {
                //  Chave.NumerosComuns ( boletim.get ( i ).getNumeros (), chaveSorteada.get ( j ).getNumeros () );
                numCertos = Chave.NumerosComuns ( boletim.get ( i ).getNumeros (), chaveSorteada.get ( j ).getNumeros () );
            }
        }
        System.out.println ("\nAcertou em " + numCertos + " numeros" );

        for (int i = 0; i < boletim.size (); i++) {
            for (int j = 0; j < chaveSorteada.size (); j++) {
                //Chave.EstrelasComuns ( boletim.get ( i ).getEstrelas (), chaveSorteada.get ( j ).getEstrelas () );
                estrelaCerta = Chave.EstrelasComuns ( boletim.get ( i ).getEstrelas (), chaveSorteada.get ( j ).getEstrelas () );

            }
        }
        System.out.println ( "\nAcertou em " + estrelaCerta + " estrelas" );


        System.out.println ("\n");
        if (numCertos == 2 &&  estrelaCerta == 0) {
            System.out.println ( "Parabéns! Ganhou o 13º prémio!" );
        } else if (numCertos == 2 && estrelaCerta == 1) {
            System.out.println ( "Parabéns! Ganhou o 12º prémio!" );
        } else if (numCertos == 1 && estrelaCerta == 2) {
            System.out.println ( "Parabéns! Ganhou o 11º prémio" );
        } else if (numCertos == 3 && estrelaCerta == 0) {
            System.out.println ( "Parabéns! Ganhou 10º prémio!" );
        } else if (numCertos == 3 && estrelaCerta == 1) {
            System.out.println ( "Parabéns! Ganhou o 9º prémio!" );
        } else if (numCertos == 2 && estrelaCerta == 2) {
            System.out.println ( "Parabéns! Ganhou o 8º prémio!" );
        } else if (numCertos == 3 && estrelaCerta == 2) {
            System.out.println ( "Parabéns! Ganhou o 7º prémio!" );
        } else if (numCertos == 4 && estrelaCerta == 0) {
            System.out.println ( "Parabéns! Ganhou o 6º prémio!" );
        } else if (numCertos == 4 && estrelaCerta == 1) {
            System.out.println ( "Parabéns!Ganhou o 5º prémio!" );
        } else if (numCertos == 4 && estrelaCerta == 2) {
            System.out.println ( "Parabéns! Ganhou o 4º prémio!" );
        } else if (numCertos == 5 && estrelaCerta == 0) {
            System.out.println ( "Parabéns! Ganhou o 3º prémio!" );
        } else if (numCertos == 5 && estrelaCerta == 1) {
            System.out.println ( "Parabéns! Ganhou o 2º prémio!" );
        } else if (numCertos == 5 && estrelaCerta == 2) {
            System.out.println ( "***** JACKPOT *****" );
        } else {
            System.out.println ( "UPS! Não foi desta vez! Tente a proxima semana!" );
        }
        System.out.println ("_______________________________________________________");
    }


        private static void GerarBoletim () {

            Scanner in = new Scanner ( System.in );

            boletim = new ArrayList<> ();



            System.out.println ( "------Boletim com chave aleatoria-----" );
            System.out.println ( "Escolheu gerar um boletim com uma chave aleatoria" );

            System.out.println ( "Quantas chaves quer preencher?" );
            int qtChaves = in.nextInt ();


            if (qtChaves > 5) {
                System.out.println ( "Um boletim só tem ate 5 chaves! Tente novamente, por favor" );
            } else {
                for (int i = 0; i < qtChaves; i++) {
                    for (int j = 0; j < 5; j++) {
                        numeros[j] = rnd.nextInt ( 1, 51 );
                        for (int k = 0; k < j; k++) {
                            if (numeros[j] == numeros[k]) { //verificar repetiçoes
                                j--;
                                break;
                            }
                        }

                    }
                    for (int j = 0; j < 2; j++) {
                        estrelas[j] = rnd.nextInt ( 1, 13 );

                        for (int k = 0; k < j; k++) { //verificar repetiçoes
                            if (estrelas[j] == estrelas[k]) {
                                j--;
                                break;
                            }

                        }

                    }

                    //ordenar

                    System.out.println ( "\n------------CHAVE GERADA COM SUCESSO-----------" );
                    //chave = new Chave ( numChave, numeros, estrelas );
                    boletim.add(new Chave ( numChave, numeros, estrelas ));
                    numeros = new int[5];
                    estrelas = new int[2];
                    numChave++;

                }
                MostrarChaveEscolhida ();
            }

            System.out.println ( "\n" );


        }



    private static void MostrarChaveAleatoria() {

        for (int i = 0; i < boletim.size (); i++) {
            System.out.println ( boletim.get ( i ) );

        }

        System.out.println ( "\n" );

    }


    private static void PreencherBoletim() {

        Scanner in = new Scanner ( System.in );

        boletim = new ArrayList<> ();

        int num, estrela;

        System.out.println ( "Preencha o boletim: 5 números (1 a 50) e 2 estrelas (1 a 12)" );

        System.out.println ( "Quantas chaves quer preencher?" );
        int qtChaves = in.nextInt ();

        if (qtChaves > 5 || qtChaves < 0) {
            System.out.println ( "Um boletim só tem ate 5 chaves! Tente novamente, por favor" );
        } else {
            for (int i = 0; i < qtChaves; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.println ( "\nNumero: " );
                    num = in.nextInt ();
                    if (num <= 50 && num >= 1) { // verificar se o input esta dentro do range
                        numeros[j] = num;
                    } else {
                        System.out.println ( "Número fora de alcance. Tente novamente!" );
                        j--;

                    }
                    for (int k = 0; k < j; k++) {
                        if (numeros[k] == numeros[j]) { //verificar repetiçoes
                            System.out.println ( "Numero ja inserido! Insira um outro numero, por favor." );
                            j--;
                            break;
                        }
                    }

                }
                for (int j = 0; j < 2; j++) {
                    System.out.println ( "\nEstrela: " );
                    estrela = in.nextInt ();
                    if (estrela <= 12 && estrela >= 1) { // verificar se o input esta dentro do range
                        estrelas[j] = estrela;
                    } else {
                        System.out.println ( "Estrela fora de alcance. Tente novamente!" );
                        j--;

                    }
                    for (int k = 0; k < j; k++) { //verificar repetiçoes
                        if (estrelas[k] == estrelas[j]) {
                            System.out.println ( "Estrela ja inserida! Insira uma outra estrela, por favor." );
                            j--;
                            break;
                        }

                    }

                }
                boletim.add ( new Chave (  numChave, numeros, estrelas ));
                numChave++;
                numeros = new int[5];
                estrelas = new int[2];
            }
            MostrarChaveEscolhida ();
        }

        System.out.println ( "\n" );


    }


    private static void MostrarChaveEscolhida() {

        for (int i = 0; i < boletim.size (); i++) {
            System.out.println ( boletim.get ( i ) );

        }

        System.out.println ( "\n" );

    }

    private static void ChaveSorteada() {

        chaveSorteada = new ArrayList<> ();



        for (int i = 0; i < 5; i++) {
            numsSorteados[i]  = rnd.nextInt ( 1, 51 );
            for (int k = 0; k < i; k++) { //verificar por repeticoes
                if (numsSorteados[i] == numsSorteados[k]) {
                    i--;
                    break;
                }

            }
        }
        for (int i = 0; i < 2; i++) {
            estrelasSorteadas[i] = rnd.nextInt ( 1, 13 );
            for (int k = 0; k < i; k++) { //verificar por repeticoes
                if (estrelasSorteadas[i] == estrelasSorteadas[k]) {
                    i--;
                    break;
                }
            }
        }

            //ordenar (bubble sort / array.sort)

        Arrays.sort ( numsSorteados );
        Arrays.sort ( estrelasSorteadas );

        chaveSorteada.add ( new Chave ( 1, numsSorteados, estrelasSorteadas ) );




        MostrarChaveSorteada();


    }

    private static void MostrarChaveSorteada() {

        for (int i = 0; i < chaveSorteada.size (); i++) {
            System.out.println ("=========================== Chave Sorteada ==============================" +
                    chaveSorteada.get ( i ) +
                    "\n=========================================================================" );
            break;

        }

    }


}










