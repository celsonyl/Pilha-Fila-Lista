package com.celso.PilhaFilaLista;

import com.celso.No.NoFila;

public class Fila {

    private NoFila refNoFila;

    public Fila() {
        refNoFila = null;
    }

    public boolean isEmpty() {
        return refNoFila == null;
    }

    public void enQueue(NoFila novoNo) {
        novoNo.setRefNoFila(refNoFila);
        refNoFila = novoNo;
    }

    public NoFila firstNoFila() {
        if (!this.isEmpty()) {
            NoFila primeiroNo = refNoFila;

            while (true) {
                if (primeiroNo.getRefNoFila() != null) {
                    primeiroNo = primeiroNo.getRefNoFila();
                } else {
                    break;
                }
            }
            return primeiroNo;
        }
        return null;
    }

    public NoFila deQueue() {
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
            return primeiroNo;
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
