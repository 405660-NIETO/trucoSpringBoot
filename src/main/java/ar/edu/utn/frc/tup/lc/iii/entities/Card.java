package ar.edu.utn.frc.tup.lc.iii.entities;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Card {
    private Palo palo;
    private Integer numero;
    private Integer valor;

    public Palo getPalo() {
        return palo;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }
}
