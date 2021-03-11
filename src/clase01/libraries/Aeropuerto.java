package clase01.libraries;

import java.util.ArrayList;

public class Aeropuerto {
    protected Ciudad ciudad;
    protected ArrayList<Vuelo> arribos;
    protected ArrayList<Vuelo> despegues;

    public void agregarArribos(Vuelo vuelo) {
        this.arribos.add(vuelo);
    }

    public void agregarDespegues(Vuelo vuelo) {
        this.despegues.add(vuelo);
    }
}
