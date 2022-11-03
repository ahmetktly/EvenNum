import java.util.Scanner;
public class even{
    public static void main(String[] args) {
        
        int i , count = 0 , total = 0 ;

        double average ;
        
        Scanner imp = new Scanner(System.in);

        int x=imp.nextInt();

        for(i=0  ; i<=x; i++ ){

            if(i % 3 == 0 && i % 4 == 0){
                count ++ ;

                total +=i ;

            }
             
        }
        average = total / count ;

        if(average == 0){

            System.out.println("4 ve 3 ile bölünebilen sayı yoktur");
        }
        else{
        
            System.out.println(average);
        }
    }

}
