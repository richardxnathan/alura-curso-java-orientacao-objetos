package Aula05.DCC.modelos;

public class MinhasPreferidas {

    public void inclui(Audio audio){
        if(audio.getClassificacao() >=9){
            System.out.println(audio.getTitulo() + " é considerado um sucesso!");
        } else {
            System.out.println(audio.getTitulo() + " você deve ouvir depois!");
        }
    }

}
