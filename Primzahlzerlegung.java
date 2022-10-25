class Primfaktorzerlegung{

        boolean isPrim (int zahl){
                
                boolean isPrim = true;
                for(int a =2; a < zahl; a++){
                        if(zahl%a == 0){
                                isPrim = false;
                                break;
                        }
                }
                return isPrim;
        }

        
}
