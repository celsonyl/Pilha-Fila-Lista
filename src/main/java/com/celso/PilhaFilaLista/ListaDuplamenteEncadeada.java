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

    public void add(T conteudo) {
        NoListaDupla<T> novoNo = new NoListaDupla<>(conteudo);
        novoNo.setNoProx(null);
        novoNo.setNoPrevio(noUltimo);

        if (noPrimeiro == null) {
            noPrimeiro = novoNo;
        }
        if (noUltimo != null) {
            noUltimo.setNoProx(novoNo);
        }
        noUltimo = novoNo;
        tamLista++;
    }

    public void add(int index, T conteudo) {
        NoListaDupla<T> noAux = getNo(index);
        NoListaDupla<T> novoNo = new NoListaDupla<>(conteudo);
        novoNo.setNoProx(noAux);

        if (novoNo.getNoProx() != null) {
            novoNo.setNoPrevio(noAux.getNoPrevio());
            novoNo.getNoProx().setNoPrevio(novoNo);
        } else {
            novoNo.setNoPrevio(noUltimo);
            noUltimo = novoNo;
        }

        if (index == 0) {
            noPrimeiro = novoNo;
        } else {
            novoNo.getNoPrevio().setNoProx(novoNo);
        }
        tamLista++;
    }

    public void remove(int index) {
        if (index == 0) {
            noPrimeiro = noPrimeiro.getNoProx();

            if (noPrimeiro != null) {
                noPrimeiro.setNoPrevio(null);
            }
        } else {
            NoListaDupla<T> noAux = getNo(index);
            noAux.getNoPrevio().setNoProx(noAux.getNoProx());

            if (noAux != noUltimo) {
                noAux.getNoProx().setNoPrevio(noAux.getNoPrevio());
            }
        }

        tamLista--;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        NoListaDupla<T> noAux = noPrimeiro;

        for (int i = 0; i < this.size(); i++) {
            str.append("[No { counteudo = ").append(noAux.getCounteudo()).append(" }->");
            noAux = noAux.getNoProx();
        }
        str.append("null");
        return str.toString();
    }
}