

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
        System.out.println("Aumentando Volume : " + volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo Volume : " + volume);
    }

    public void mudarCanal(int novoCanal){
        canal= novoCanal;
        System.out.println("Selecionando Canal : " + canal);
    }

    public void aumentarCanal(){
        canal++;
        System.out.println("Mudando Canal : " + canal);
    }

    public void diminuirCanal(){
        canal--;
        System.out.println("Mudando Canal : " + canal);
    }
    
    }
