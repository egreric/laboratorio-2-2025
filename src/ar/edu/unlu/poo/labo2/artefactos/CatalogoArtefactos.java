package ar.edu.unlu.poo.labo2.artefactos;

import ar.edu.unlu.poo.labo2.estrategias.EstrategiaDeMejora;

import java.util.*;

public class CatalogoArtefactos {
    Set<Artefacto> catalogo = new HashSet<>();
    private EstrategiaDeMejora estrategia;

    public CatalogoArtefactos(EstrategiaDeMejora estrategia){
        this.estrategia = estrategia;
    }

    public CatalogoArtefactos(){

    }

    public void aplicarMejoras(){
        for (Artefacto a: catalogo){
            estrategia.mejorar(a);
        }
    }

    public void agregarArtefacto(Artefacto artefacto) {
        catalogo.add(artefacto);
    }

    public Set<Artefacto> obtenerArtefactosUnicos(){
        return catalogo;
    }

    public List<Artefacto> buscarArtefactosPorTipo(String tipo){
        ArrayList<Artefacto> listaOrdenada = new ArrayList<>();
        for (Artefacto a: catalogo){
            if (a.getTipo().equals(tipo)){
                listaOrdenada.add(a);
            }
        }
        listaOrdenada.sort(Comparator.comparing(Artefacto::getNivelDePoder).reversed());

        return listaOrdenada;
    }

    public Map<String,Integer> contarArtefactosPorTipo() {
        Map<String, Integer> artefactosPorTipo = new HashMap<>();
        for (Artefacto a : catalogo) {
            artefactosPorTipo.put(a.getTipo(), 0);
        }
        for (Artefacto a : catalogo) {
            artefactosPorTipo.put(a.getTipo(), artefactosPorTipo.get(a.getTipo()) + 1);
        }
        return artefactosPorTipo;
    }

    public Artefacto obtenerArtefactoMasPoderoso(){
        Artefacto artefactoMasPoderoso = null;
        for (Artefacto a : catalogo) {
            if (artefactoMasPoderoso == null){
                artefactoMasPoderoso = a;
            }
            if (a.getNivelDePoder() >= artefactoMasPoderoso.getNivelDePoder()){
                artefactoMasPoderoso = a;
            }
        }

        return artefactoMasPoderoso;

    }
}
