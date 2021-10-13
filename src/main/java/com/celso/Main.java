package com.celso;

import com.celso.No.NoPilha;
import com.celso.PilhaFilaListaArv.*;

public class Main {

    public static void main(String[] args) {
        instanciaPilha();
//        instanciaFila();
//        instanciaListaEncadeada();
//        instanciaListaDuplamenteEncadeada();
//        instanciaListaCircular();
    }

    private static void instanciaListaCircular() {
        ListaCircular<String> list = new ListaCircular<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");

        System.out.println(list.get(2));
        list.add("eee");

        System.out.println(list);

        list.remove(2);

        System.out.println(list);
    }

    private static void instanciaListaDuplamenteEncadeada() {
        ListaDuplamenteEncadeada<String> list = new ListaDuplamenteEncadeada<>();
        list.add("c1");
        list.add("c2");
        list.add("c3");
        list.add("c4");
        list.add("c5");
        list.add("c6");
        list.add("c7");

        System.out.println(list);

        list.remove(3);
        list.add(3, "99");

        System.out.println(list);

        System.out.println(list.get(3));
    }

    private static void instanciaListaEncadeada() {
        ListaEncadeada<String> list1 = new ListaEncadeada<>();
        list1.addList("Oi");
        list1.addList("Deu");
        list1.addList("Certo");
        list1.addList("?");
        System.out.println(list1.get(0));
        System.out.println(list1.get(1));
        System.out.println(list1.get(2));
        System.out.println(list1.get(3));

        System.out.println(list1);

        System.out.println(list1.removeNoList(0));

        System.out.println(list1);
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
