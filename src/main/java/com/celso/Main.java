package com.celso;

public class Main {

    public static void main(String[] args) {
        Pilha pilha1 = new Pilha();
        pilha1.push(new No(1));
        pilha1.push(new No(2));
        pilha1.push(new No(3));
        pilha1.push(new No(4));
        pilha1.push(new No(5));
        pilha1.push(new No(6));

        System.out.println(pilha1);
        System.out.println(pilha1.pop());
        System.out.println(pilha1);
    }
}
