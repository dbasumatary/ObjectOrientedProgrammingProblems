package com.deckofcards;
import java.util.Random;
/*Program to distribute 9 cards to 4 players randomly*/
public class DeckOfCards {
    static String[][] cards={
            {"2 Club","3 Club","4 Club","5 Club","6 Club","7 Club","8 Club","9 Club","10 Club","jack(Club)","queen(Club)","king(Club)","ace(Club)"},
            {"2 Diamond","3 Diamond","4 Diamond","5 Diamond","6 Diamond","7 Diamond","8 Diamond","9 Diamond","10 Diamond",
                    "jack(Diamond)","queen(Diamond)","king(Diamond)","ace(Diamond)"},
            {"2 Hearts","3 Hearts","4 Hearts","5 Hearts","6 Hearts","7 Hearts","8 Hearts","9 Hearts","10 Hearts",
                    "jack(Hearts)","queen(Hearts)","king(Hearts)","ace(Hearts)"},
            {"2 Spade","3 Spade","4 Spade","5 Spade","6 Spade","7 Spade","8 Spade","9 Spade","10 Spade","jack(Spade)","queen(Spade)","king(Spade)","ace(Spade)"}
    };
    static String[][] deck = cards;
    public static void selectCard() {                                   //Select cards using random
        Random random = new Random();                                   //Using random class
        int suit = random.nextInt(4);
        int rank = random.nextInt(13);
        if (deck[suit][rank] == null) {
            selectCard();
        } else {
            System.out.print(deck[suit][rank] + ", ");
            deck[suit][rank] = null;
        }
    }
    public static void distribute() {                                  //Method to distribute the cards
        for (int i = 1; i < 5; i++) {
            System.out.print("\nPlayer " + i + ": ");
            for (int j = 1; j < 10; j++) {
                selectCard();
            }
        }
    }
    public static void main(String[] args) {
        distribute();                                              //Calling the method
    }
}