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
    
    }
