package org.example;

class Animal {
    private Reino reino;
    private Filo filo;
    private Classe classe;
    private Ordem ordem;
    private Familia familia;
    private Genero genero;
    private Especie especie;

    public Animal(Reino reino, Filo filo, Classe classe, Ordem ordem, Familia familia, Genero genero, Especie especie) {
        this.reino = reino;
        this.filo = filo;
        this.classe = classe;
        this.ordem = ordem;
        this.familia = familia;
        this.genero = genero;
        this.especie = especie;
    }


    @Override
    public String toString() {
        return String.format("%s ⇒ %s ⇒ %s ⇒ %s ⇒ %s ⇒ %s ⇒ %s",
                reino, filo, classe, ordem, familia, genero, especie);
    }
}
