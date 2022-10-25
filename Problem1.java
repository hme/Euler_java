// Wenn wir eine Liste aller natürlichen Zahl unter 10, die ein Vielfaches von 3 und 5 sind, bekommen wir 3,5,6,9. Die Summe dieser Vielfaches beträgt 23 Jahre.
// Finden Sie die Summe aller Vielfachen von 3 und 5 Unter 1000
class Problem1{
        public static void main(String[] args){
                int three  = 3;
                int five = 5;
                int summe =0;
                
                System.out.println("Die Vielfachen von 3 und 5 sind: ");
                for(int i = 1; i < 1000; i++){
                        if( teiler(i,three) >-1){
                                System.out.print( i+ ", ");
                                summe=Summe(summe,i);
                        }
                      else if( teiler(i,five) >-1){
                                System.out.print(i+", ");
                               summe=Summe(summe,i);
                        }
                }
                System.out.println("Die Summe diese Vielfaches beträgt "+ summe+ " Jahren");
        }

        static int Summe(int a, int b){
                return a+b;
        }

        static int teiler ( int i, int zahl){
                if( i % zahl == 0){
                        return zahl;
                }
                return -1;
        }
}
