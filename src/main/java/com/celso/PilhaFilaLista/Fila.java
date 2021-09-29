package com.celso.PilhaFilaLista;

import com.celso.No.NoFila;

public class Fila<T> {

    private NoFila<T> refNoFila;

    public Fila() {
        refNoFila = null;
    }

    public boolean isEmpty() {
        return refNoFila == null;
    }

    public void enQueue(T obj) {
        NoFila novoNo = new NoFila(obj);
        novoNo.setRefNoFila(refNoFila);
        refNoFila = novoNo;
    }

    public T firstNoFila() {
        if (!this.isEmpty()) {
            NoFila primeiroNo = refNoFila;

            while (true) {
                if (primeiroNo.getRefNoFila() != null) {
                    primeiroNo = primeiroNo.getRefNoFila();
                } else {
                    break;
                }
            }
            return (T) primeiroNo.getObject();
        }
        return null;
    }

    public T deQueue() {
        if (!this.isEmpty()) {
            NoFila primeiroNo = refNoFila;
            NoFila noAux = refNoFila;

            while (true) {
                if (primeiroNo.getRefNoFila() != null) {
                    noAux = primeiroNo;
                    primeiroNo = primeiroNo.getRefNoFila();
                } else {
                    noAux.setRefNoFila(null);
                    break;
                }
            }
            return (T) primeiroNo.getObject();
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder text = new StringBuilder();
        NoFila noAux = refNoFila;

        if (refNoFila != null) {
            while (true) {
                text.append("[NoFila { Object ->").append(noAux.getObject()).append("}] --->");

                if (noAux.getRefNoFila() != null) {
                    noAux = noAux.getRefNoFila();
                } else {
                    text.append("null");
                    break;
                }
            }
        } else {
            text = new StringBuilder("null");
        }
        return text.toString();
    }
}
