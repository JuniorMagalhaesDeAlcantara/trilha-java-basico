public class SmartTv{

    boolean ligada = false;
    int canal = 1;
    int volume = 25;
    
    public void desligar(){
        ligada = false;
    }
    
    public void ligar(){
        ligada= true;
    }

    public void aumentarVolume(){
        volume++;
    }

    public void diminuirVolume(){
        volume--;
    }

    public void mudarCanal(int novoCanal){
        canal= novoCanal;
    }

    public void aumentarCanal(){
        volume++;
    }

    public void diminuirCanal(){
        volume--;
    }
    
    }
