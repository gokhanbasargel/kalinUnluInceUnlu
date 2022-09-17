public class Main {
    public static void main(String[] args) {
       char harf = 'O';

       switch (harf){
           case 'A':
           case 'I':
           case 'O':
           case 'U':

               System.out.println("Kalın Ünlüdür");
            break;
        }
        switch (harf){
            case 'E':
            case 'İ':
            case 'Ü':
            case 'Ö':
                System.out.println("İnce Ünlüdür.");
            break;

        }
    }
}