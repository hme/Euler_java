public class Potenz{

        long potenzBerechnung( int basis, int exponent){
                long potenz = 1;
                if(exponent == 0){
                       return 1;
                }
                else{
                       for(int i = exponent; i >0 ; i--){
                                potenz = potenz * (Long) basis;
                        }
                }

                if( exponent < 0){
                        return 1/potenz;
                }
                else{
                        return potenz;
                }
        }
}

