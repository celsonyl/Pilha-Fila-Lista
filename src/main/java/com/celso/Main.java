package com.celso;

public class Main {

    public static void main(String[] args) {
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
}
