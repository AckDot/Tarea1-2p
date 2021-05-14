
public class SERIE1
{
    public int RegistrarPosicionNDeLaSErie(int n){
        int aux=1;
        int señal=1;
        int numero=1;
        for(int contador=1 ;contador<n;contador++){
            if(señal==1){
                while(aux<=3){
                    if(aux==1){
                        numero++;
                        aux++;
                        break;
                    }if(aux==2){
                        numero=numero+2;
                        aux++;
                        break;
                    }if(aux==3){
                       
                        señal=-1;
                        break;
                    }
                }
            }if(señal==-1){
                while(aux>=1){
                    if(aux==3){
                        numero=numero+3;
                        aux--;
                        break;
                    }
                    if(aux==2){
                        numero=numero+2;
                        aux--;
                        señal=1;
                        break;
                    }
                   

                }

            }      
           
        }
        return numero;
    }
}
