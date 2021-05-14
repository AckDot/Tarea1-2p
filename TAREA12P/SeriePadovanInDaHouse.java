
public class SeriePadovanInDaHouse
{
    public SeriePadovanInDaHouse(){
    
    }
    public int DeterminarPosicionenlaserie(int posicion){
        int digitoantepenultimo = 1;
        int digitopenultimo = 1;
        int digitoultimo = 1;
        int resp = 1;
        for (int i = 4; i <= posicion; i = i + 1){
            resp = digitoantepenultimo + digitopenultimo;
            digitoantepenultimo = digitopenultimo;
            digitopenultimo = digitoultimo;
            digitoultimo = resp;
        }
        return digitoultimo;
    }

}
