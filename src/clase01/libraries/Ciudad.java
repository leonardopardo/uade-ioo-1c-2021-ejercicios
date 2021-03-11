package clase01.libraries;

import java.util.ArrayList;

public class Ciudad {
    protected String nombre;
    protected String pais;
    protected ArrayList<Aeropuerto> aeropuertos;

    /**
     * 6. La cantidad de aeropuertos que tiene una ciudad.
     * @return
     */
    public int cantidadAeropuertos()
    {
        return aeropuertos.size();
    }
}
