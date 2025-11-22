import java.text.DecimalFormat;
import java.util.Scanner;

public class Menu
{
    public static void main(String[] args)
    {
        int choix;
        Scanner input = new Scanner(System.in);
        //DecimalFormat decimalFormat = new DecimalFormat("#.##");
        do
        {
            do
            {
                System.out.println("1 - Exercice n°1");
                System.out.println("2 - Exercice n°2");
                System.out.println("3 - Exercice n°3");
                System.out.println("4 - Exercice n°4");
                System.out.println("0 - Quitter");
                System.out.print("Votre choix : ");
                choix = input.nextInt();
            } while (choix > 5);

            switch (choix)
            {
                case 0:
                    System.out.println("Fin du programme");
                    break;

                case 1:
                    //tableau
                    //Ici le tabelau ce nome tab
                    //tableau d'entier de taille 5 (0 a 4)
//                    int[] tab = new int[5];
//
//                    //Remplir le tableau
//                    tab[0]= -1;
//                    tab[1]= 22;
//                    tab[2]= 34;
//                    tab[3]= -4;
//                    tab[4]= 52;
//
//                    //tableau prédéfini
//                    double[] note = new double[]{7.4,12,5.8};
//
//                    // Parcourir le tableau
//                    // note.lenght pour la taille du tableau qui peut etre modifier
//                    double total =0;
//                    for(int i=0 ; i< note.length ; i++)
//                    {
//                        System.out.println(note[i]);
//                        total = total + note[i];
//                    }
//
//                    System.out.println("Moyenne promo : "+ total/3);
//
//                    //Parcourir le tableau
//                    //solution 2
//
//                    for(double uneNote : note)
//                    {
//                        System.out.println("for each"+uneNote);
//                    }


                    int[] exo1 = new int[]{31,6,17,4,9};

                    //Question 1
                    for (int nb : exo1)
                    {
                        System.out.print(nb+" - ");
                    }
                    System.out.println();

                    //Question 1 bis
                    for (int i = 0; i < exo1.length; i++)
                    {
                        System.out.print(exo1[i]+" - ");
                    }
                    System.out.println();

                    //Question 2

                    int max = exo1[0];

                    //si je met max=0 il faut changer i=0

                    for (int i = 1; i < exo1.length; i++)
                    {
                        if (exo1[i] > max)
                        {
                            max = exo1[i];
                        }
                    }

                    System.out.println("Valeur max : "+max);

                    //Question 3

                    System.out.print("Valeur recherche : ");
                    int recherche = input.nextInt();

                    boolean trouve = false;

                    for (int i = 0; i < exo1.length; i++)
                    {
                        if(recherche == exo1[i])
                        {
                            System.out.print("position: "+ i+1);
                            trouve = true;
                            break;
                        }
                    }
                    if (!trouve)
                    {
                        System.out.println("Tu n'a pas trouver");
                    }




                    break;

                case 2:
                    int[] tabExo2 = new int[] {11,32,41,632,10};
                    int tailleP=0;
                    int tailleI=0;


                    for (int nb : tabExo2)
                    {
                        if(nb% 2 == 0)
                        {
                            tailleP=tailleP+1;
                        } else {
                            tailleI=tailleI+1;
                        }
                    }


                    int[] tabP = new int[tailleP];
                    int[] tabI = new int[tailleI];

                    int taille2P=0;
                    int taille2I=0;


                    for (int i = 0; i < tabExo2.length; i++)
                    {
                        if(tabExo2[i]% 2 == 0)
                        {
                            tabP[taille2P] = tabExo2[i];
                            taille2P++;
                        }
                        else
                        {
                            tabI[taille2I] = tabExo2[i];
                            taille2I++;
                        }
                    }

                    int sommeI =0;
                    int sommeP =0;


                    System.out.println("Valeurs pair : ");
                    for (int tab : tabP)
                    {
                        System.out.print(tab+" - ");
                        sommeP += tab;
                    }
                    System.out.println();

                    System.out.println("Valeurs impair : ");
                    for (int tab : tabI)
                    {
                        System.out.print(tab+" - ");
                        sommeI += tab;
                    }
                    System.out.println();

                    System.out.println("Somme pair : "+sommeP);
                    System.out.println("Somme impair : "+sommeI);


                    break;

                case 3:
                    int[] tab1Exo3 = new int[] {4,8,7,12};
                    int[] tab2Exo3 = new int[] {3,6};

                    for(int tab : tab1Exo3)
                    {
                        System.out.print(tab+" - ");
                    }
                    System.out.println();

                    for(int tab : tab2Exo3)
                    {
                        System.out.print(tab+" - ");
                    }
                    System.out.println();

                    int total3=0;

                    for(int i=0 ; i < tab1Exo3.length ; i++ )
                    {
                        int tab3 = tab1Exo3[i];

                        for(int nb : tab2Exo3)
                        {
                            total3+=nb*tab3;
                        }

                    }

                    System.out.println("Le shtroumpf est de : "+total3);





                    break;


                case 4:
                    int[][] tabExo4 = new int[4][4];

                    // Exemple n°1

                    /*
                    tabExo4[0][0] = 1;tabExo4[0][1] = 0;tabExo4[0][2] = 0;tabExo4[0][3] = 0;
                    tabExo4[1][0] = 0;tabExo4[1][1] = 3;tabExo4[1][2] = 0;tabExo4[1][3] = 6;
                    tabExo4[2][0] = 0;tabExo4[2][1] = 0;tabExo4[2][2] = 0;tabExo4[2][3] = 0;
                    tabExo4[3][0] = 0;tabExo4[3][1] = 0;tabExo4[3][2] = 0;tabExo4[3][3] = 0;*/

                    // Exemple n°2

                    tabExo4[0][0] = 1;tabExo4[0][1] = 2;tabExo4[0][2] = 0;tabExo4[0][3] = 0;
                    tabExo4[1][0] = 3;tabExo4[1][1] = 4;tabExo4[1][2] = 0;tabExo4[1][3] = 0;
                    tabExo4[2][0] = 5;tabExo4[2][1] = 6;tabExo4[2][2] = 0;tabExo4[2][3] = 0;
                    tabExo4[3][0] = 7;tabExo4[3][1] = 8;tabExo4[3][2] = 0;tabExo4[3][3] = 0;


                    int nombre = 0;

                    for (int i=0; i <tabExo4.length; i++)
                    {
                        for ( int j=0 ;  j<tabExo4[i].length ; j++ )
                        {
                            System.out.print(tabExo4[i][j]+" - ");

                            if (tabExo4[i][j] !=0)
                            {
                                nombre++;
                            }
                        }
                        System.out.println();
                    }

                    int[] tabvaleur = new int[nombre];
                    int[] tabligne = new int[nombre];
                    int[] tabcolonne = new int[nombre];
                    int taille =0;

                    for (int i=0; i <tabExo4.length; i++)
                    {
                        for ( int j=0 ;  j<tabExo4[i].length ; j++ )
                        {

                            if (tabExo4[i][j] !=0)
                            {
                                tabvaleur[taille]=tabExo4[i][j];
                                tabligne[taille]=i;
                                tabcolonne[taille]=j;
                                taille++;
                            }
                        }

                    }


                    System.out.println("Valeurs");
                    for(int nb : tabvaleur)
                    {
                        System.out.print(nb+" - ");
                    }
                    System.out.println();

                    System.out.println("Lignes : ");
                    for(int nb : tabligne)
                    {
                        System.out.print(nb+" - ");
                    }
                    System.out.println();

                    System.out.println("Colonnes : ");
                    for(int nb : tabcolonne)
                    {
                        System.out.print(nb+" - ");
                    }
                    System.out.println();





                    break;

                case 5:

                    //CASE ENTRAINEMENT

                    int[] case5 = new int[]{10,50,2,3};


                    for (int nb5 : case5){
                        System.out.print(nb5+" - ");
                    }
                    System.out.println();

                    int grand=case5[0];

                    for( int k=1; k<case5.length; k++){

                        if (case5[k]>grand)
                        {
                            grand=case5[k];
                        }

                    }

                    System.out.println("Valeur grand : "+grand);

                    for(int nb55 : case5){
                        System.out.print(nb55+" - ");
                    }
                    System.out.println();

                    System.out.println("Valeur recherhce : ");
                    int cherche = input.nextInt();


                    boolean oui = false;

                    for (int i = 0; i < case5.length ; i++)
                    {
                        if (cherche == case5[i]){
                            System.out.print("position: "+ (i+1));
                            oui = true;
                        }
                    }

                    if (oui == false)
                    {
                        System.out.println("Tu n'a pas trouver");
                    }


                    break;


            }
        }while (choix != 0);
    }
}
