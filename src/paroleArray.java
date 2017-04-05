import java.io.*;
import java.util.*;

    public class paroleArray
     {

        static String user[][]={{"bogdan","1234"},{"mircea","2345"},{"rares","3456"}};


        public static void main(String[] args) {
            String usercerut,parolacerut;

            boolean nimerit = false;
            while(!nimerit){
                usercerut=readStringConsole("user : ");
                parolacerut=readStringConsole("parola : ");
                nimerit = isCombinatiaBuna(usercerut, parolacerut);
                if(nimerit) {
                    lansez();
                }
            }

        }

        public static void lansez()
        {
            Runtime rs = Runtime.getRuntime();

            try {
                rs.exec("notepad");
            }
            catch (IOException e) {
                System.out.println(e);
            }

        }


        public static boolean isCombinatiaBuna(String uc, String pc )
        {
            for (int i=0;i<=user.length;i++)
                if (user[i][0].equals(uc)&&user[i][1].equals(pc))
                return true;
            return false;
        }
        public static int readIntConsole(String label) {
            System.out.print(label);
            int input = new Scanner(System.in).nextInt();
            return input;
        }

        public static String readStringConsole(String label) {
            System.out.print(label);
            String input = new Scanner(System.in).nextLine();
            return input;
        }
    }



