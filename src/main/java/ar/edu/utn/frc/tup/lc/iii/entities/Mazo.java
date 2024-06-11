package ar.edu.utn.frc.tup.lc.iii.entities;

import java.util.List;

public class Mazo {
    private List<Card> cards;

    public Mazo(List<Card> cards) {
        this.cards = cards;
    }

    public Mazo() {
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    public List<Card> listaHardcodeada(){
        Card card = new Card(Palo.ESPADA,1,1);
        Card card = new Card(Palo.BASTO,1,2);
        //TODO
        return null;
    }
}
