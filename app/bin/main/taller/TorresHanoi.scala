package taller

class Torre_hanoi{

    def movsTorresHanoi (n_mov : Int ): BigInt = {
        BigInt(2).pow(n_mov) - 1
    }
    
    def listaTorresHanoi (n_mov: Int): List = {

    List()        
    }

}