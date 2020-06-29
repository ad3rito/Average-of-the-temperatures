import java.util.Scanner;

public class Mediadetemp {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        double[] temp = new double[10];
        
        double media = 0, mediaX,cont = 0;
        
        for(int i = 0; i < 10; i++){
            
            System.out.printf("Introduza 10 temperaturas para saber a media");
            temp[i] = in.nextInt();
            
            media = media + temp [i];
        }
        

        System.out.println("A temperatura media e de : "
                + (mediaX = media / temp.length));
        
        for(int i = 0; i < temp.length; i++){
        }
    }
}