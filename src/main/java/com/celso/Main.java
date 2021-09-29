package com.celso;

import com.celso.No.NoPilha;
import com.celso.PilhaFilaLista.Fila;
import com.celso.PilhaFilaLista.Pilha;

public class Main {

    public static void main(String[] args) {
//        instanciaPilha();
        instanciaFila();
    }

    public static void instanciaPilha() {
        Pilha pilha1 = new Pilha();
        pilha1.push(new NoPilha(1));
        pilha1.push(new NoPilha(2));
        pilha1.push(new NoPilha(3));
        pilha1.push(new NoPilha(4));
        pilha1.push(new NoPilha(5));
        pilha1.push(new NoPilha(6));

        System.out.println(pilha1);

        System.out.println(pilha1.pop());

        System.out.println(pilha1);
    }

    public static void instanciaFila() {
        Fila<String> fila1 = new Fila<>();
        fila1.enQueue("Primeiro");
        fila1.enQueue("Segundo");
        fila1.enQueue("Terceiro");
        fila1.enQueue("Quarto");

        System.out.println(fila1);

        System.out.println(fila1.deQueue());

        System.out.println(fila1);

        fila1.enQueue("Ultimo");

        System.out.println(fila1);

        System.out.println(fila1.firstNoFila());

        System.out.println(fila1);
    }
}
