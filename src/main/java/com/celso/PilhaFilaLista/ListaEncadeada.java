package com.celso.PilhaFilaLista;

import com.celso.No.NoLista;

public class ListaEncadeada<T> {

    private NoLista<T> refEntrada;

    public ListaEncadeada() {
        this.refEntrada = null;
    }

    public boolean isEmpty() {
        return refEntrada == null;
    }

    public int listSize() {
        int listSize = 0;

        NoLista<T> refAux = refEntrada;
        while (true) {
            if (refAux != null) {
                listSize++;

                if (refAux.getNoLista() != null) {
                    refAux = refAux.getNoLista();
                } else {
                    break;
                }

            } else {
                break;
            }
        }

        return listSize;
    }

}