import java.util.Scanner;

public class Menu2 {

    public static void main(String[] args)
    {
        int choix;
        Scanner input = new Scanner(System.in);
        //DecimalFormat decimalFormat = new DecimalFormat("#.##");
        do
        {
            do
            {
                System.out.println();
                System.out.println("1 - Exercice n°1");
                System.out.println("2 - Exercice n°2");
                System.out.println("3 - Exercice n°3");
                System.out.println("4 - Exercice n°4");
                System.out.println("0 - Quitter");
                System.out.print("Votre choix : ");
                choix = input.nextInt();
            } while (choix > 7);

            switch (choix)
            {
                case 0:
                    System.out.println("Fin du programme");
                    break;

                case 1:
                    int[] exo1 = new int[]{31,6,17,4,9};

                    int grand =0;

                    for(int nb: exo1)
                    {
                        System.out.print(nb+" - ");
                        if(nb>grand)
                        {
                            grand = nb;
                        }
                    }
                    System.out.println();

                    System.out.println("La + grd est : "+grand);

                    System.out.print("valeurs rechercher : ");
                    int cherche = input.nextInt();
                    boolean trouve = false;

                    for (int i =0; i< exo1.length; i++)
                    {
                        if(cherche==exo1[i])
                        {
                            System.out.println("Valeurs se trouve : "+(i+1));
                            trouve = true;
                        }
                    }

                    if(!trouve)
                    {
                        System.out.println("Valeurs non presente");
                    }


                    break;

                case 2:
                    int[] tabExo2 = new int[] {11,32,41,632,10};

                    int tailleP =0;
                    int tailleI =0;

                    int sommeP =0;
                    int sommeI =0;

                    for(int nb: tabExo2)
                    {
                        if(nb%2==0)
                        {
                            tailleP++;
                            sommeP+=nb;
                        } else {
                            tailleI++;
                            sommeI+=nb;
                        }
                    }

                    int[] tabP2 = new int[tailleP];
                    int[] tabI2 = new int[tailleI];

                    int indiceP = 0;
                    int indiceI = 0;

                    for(int nb: tabExo2)
                    {
                        if(nb%2==0)
                        {
                            tabP2[indiceP]=nb;
                            indiceP++;
                        }else {
                            tabI2[indiceI]=nb;
                            indiceI++;
                        }
                    }

                    System.out.println("tableau pair : ");
                    for(int nb: tabP2)
                    {
                        System.out.print(nb+" - ");
                    }
                    System.out.println();

                    System.out.println("tableau impair : ");
                    for(int nb: tabI2)
                    {
                        System.out.print(nb+" - ");
                    }
                    System.out.println();

                    System.out.println("somme pair : "+sommeP);
                    System.out.println("somme impair : "+sommeI);


                    break;


                case 3:

                    int[] tab1Exo3 = new int[] {4,8,7,12};
                    int[] tab2Exo3 = new int[] {3,6};

                    int schtroumpf =0 ;

                    for(int nb: tab1Exo3)
                    {
                        for(int nb2: tab2Exo3)
                        {
                            schtroumpf+=nb2*nb;
                        }
                    }

                    System.out.println("totallml : "+schtroumpf);


                    break;


                case 4:

                    int[][] tabExo4 = new int[4][4];

                    // Exemple n°1


                    tabExo4[0][0] = 1;tabExo4[0][1] = 0;tabExo4[0][2] = 0;tabExo4[0][3] = 0;
                    tabExo4[1][0] = 0;tabExo4[1][1] = 3;tabExo4[1][2] = 0;tabExo4[1][3] = 6;
                    tabExo4[2][0] = 0;tabExo4[2][1] = 0;tabExo4[2][2] = 0;tabExo4[2][3] = 0;
                    tabExo4[3][0] = 0;tabExo4[3][1] = 0;tabExo4[3][2] = 0;tabExo4[3][3] = 0;

                    // Exemple n°2
                    /*
                    tabExo4[0][0] = 1;tabExo4[0][1] = 2;tabExo4[0][2] = 0;tabExo4[0][3] = 0;
                    tabExo4[1][0] = 3;tabExo4[1][1] = 4;tabExo4[1][2] = 0;tabExo4[1][3] = 0;
                    tabExo4[2][0] = 5;tabExo4[2][1] = 6;tabExo4[2][2] = 0;tabExo4[2][3] = 0;
                    tabExo4[3][0] = 7;tabExo4[3][1] = 8;tabExo4[3][2] = 0;tabExo4[3][3] = 0;*/


                    for (int i = 0; i < tabExo4.length; i++)
                    {
                        for(int j = 0; j < tabExo4[i].length; j++)
                        {
                            System.out.print(tabExo4[i][j]+" - ");
                        }
                        System.out.println();
                    }

                    for (int i = 0; i < tabExo4.length; i++)
                    {
                        for(int j = 0; j < tabExo4[i].length; j++)
                        {
                            if (tabExo4[i][j] != 0)
                            {
                                System.out.print(tabExo4[i][j]+" - ");
                            }
                        }
                        System.out.println();
                    }

                    System.out.println("Valeurs");
                    for (int i = 0; i < tabExo4.length; i++)
                    {
                        for(int j = 0; j < tabExo4[i].length; j++)
                        {
                            if (tabExo4[i][j] != 0)
                            {
                                System.out.print(tabExo4[i][j]+" - ");
                            }
                        }
                    }

                    System.out.println("Lignes");
                    for (int i = 0; i < tabExo4.length; i++)
                    {
                        for(int j = 0; j < tabExo4[i].length; j++)
                        {
                            if (tabExo4[i][j] != 0)
                            {
                                System.out.print(tabExo4[i][j]+" - ");
                            }
                        }
                    }







                    break;




            }
        }while (choix != 0);
    }







}
