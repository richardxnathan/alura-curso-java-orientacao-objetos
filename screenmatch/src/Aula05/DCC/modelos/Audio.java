package Aula05.DCC.modelos;

public class Audio {
    private String titulo;
    private int totalDeReproducoes;
    private int totalCurtidas;
    private int classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public void reproduz(){
        this.totalDeReproducoes++;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public void curte() {
        this.totalCurtidas++;
    }

    public int getClassificacao() {
        return classificacao;
    }

//    public void darNota(double nota) {
//        this.classificacao += nota;
//    }

}
