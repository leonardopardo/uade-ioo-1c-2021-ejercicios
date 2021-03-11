package clase01.libraries;

import java.util.ArrayList;

public class Avion {
    protected ArrayList<Asiento> asientos;
    protected Aerolinea aerolinea;

    public Avion(Aerolinea aerolinea, ArrayList<Asiento> asientos) {
        this.aerolinea = aerolinea;
        this.asientos = asientos;
    }
}
