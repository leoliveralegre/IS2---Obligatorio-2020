package dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

public final class Ingesta implements Serializable {

    private String fechaDeIngesta;
    private ArrayList<Alimento> listaAlimentosPorFecha;

    public Ingesta(String f, ArrayList<Alimento> LA) {
        setFechaDeIngesta(f);
        setLAPF(LA);
    }

    public String getFechaDeIngesta() {
        return this.fechaDeIngesta;
    }

    public void setFechaDeIngesta(String unaFecha) {
        this.fechaDeIngesta = unaFecha;
    }

    public ArrayList<Alimento> getListaAlimentosPorFecha() {
        if (this.listaAlimentosPorFecha.isEmpty()) {
            return new ArrayList<>();
        } else {
            return this.listaAlimentosPorFecha;
        }
    }

    public void setLAPF(ArrayList<Alimento> list) {
        if (list == null || list.isEmpty()) {
            this.listaAlimentosPorFecha = new ArrayList<>();
        } else {
            this.listaAlimentosPorFecha = list;
        }
    }

    @Override
    public String toString() {
        if (this.listaAlimentosPorFecha.isEmpty()) {
            return "No hay alimentos ingeridos";
        } else {
            return "Lista de alimentos ingeridos" + this.getListaAlimentosPorFecha();
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;

        if (this.getClass() != obj.getClass())
            return false;
        
        final Ingesta otraIngesta = (Ingesta) obj;
        boolean sonIguales = this.getFechaDeIngesta().equals(otraIngesta.getFechaDeIngesta());
        sonIguales = sonIguales && this.getListaAlimentosPorFecha().equals(otraIngesta.getListaAlimentosPorFecha());
        return sonIguales;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.fechaDeIngesta);
        hash = 97 * hash + Objects.hashCode(this.listaAlimentosPorFecha);
        return hash;
    }

}
