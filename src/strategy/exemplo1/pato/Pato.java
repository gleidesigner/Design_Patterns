package strategy.exemplo1.pato;

import strategy.exemplo1.som.CompSom;
import strategy.exemplo1.voo.CompVoo;

/**
 * Created by gleidesilva on 18/08/16.
 */
public class Pato {
    private String nome;
    private String cores;
    private CompVoo voo;
    private CompSom som;


    public void setSom(CompSom som) {
        this.som = som;
    }

    public void setVoo(CompVoo voo) {
        this.voo = voo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCores() {
        return cores;
    }

    public void setCores(String cores) {
        this.cores = cores;
    }

    public void voo(){
        voo.compVoo();
    }

    public void som(){
        som.compSom();
    }
}
