package com.celso.PilhaFilaLista;

import com.celso.No.NoListaCircular;

public class ListaCircular<T> {

    private NoListaCircular<T> cabeca;
    private NoListaCircular<T> back;
    private int tamList;

    public boolean isEmpty() {
        return this.tamList == 0;
    }

    public int size() {
        return this.tamList;
    }
}
