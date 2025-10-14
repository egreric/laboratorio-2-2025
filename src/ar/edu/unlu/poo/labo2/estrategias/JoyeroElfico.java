package ar.edu.unlu.poo.labo2.estrategias;

import ar.edu.unlu.poo.labo2.artefactos.Artefacto;

public class JoyeroElfico implements EstrategiaDeMejora{


    @Override
    public void mejorar(Artefacto artefacto) {
        if (artefacto.getTipo().equals("Amuleto")){
            if (artefacto.getNivelDePoder() < 50){
                artefacto.setPoder(artefacto.getNivelDePoder() * 2.0);
            } else {
                artefacto.setPoder(artefacto.getNivelDePoder() * 1.25);
            }
        }
    }
}
