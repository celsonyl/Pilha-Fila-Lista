package com.celso.PilhaFilaLista;

import com.celso.No.NoListaDupla;

public class ListaDuplamenteEncadeada<T> {

    private NoListaDupla<T> noPrimeiro;
    private NoListaDupla<T> noUltimo;

    private int tamLista;

    public ListaDuplamenteEncadeada() {
        this.tamLista = 0;
        this.noPrimeiro = null;
        this.noUltimo = null;
    }

    public int size() {
        return tamLista;
    }

    private NoListaDupla<T> getNo(int index) {
        NoListaDupla<T> noAux = noPrimeiro;
        for (int i = 0; (i < index) && (noAux != null); i++) {
            noAux = noAux.getNoProx();
        }

        return noAux;
    }

    public T get(int index) {
        return this.getNo(index).getCounteudo();
    }
}