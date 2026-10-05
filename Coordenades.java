public class Coordenades {

    // constants
    public final double R = 6371.0;

    // Atributs: representem les coordenades amb la latitud i la longitud (números amb decimals)
    private double latitud;
    private double longitud;

    // Constructor: construïm un objecte de tipus Coordenades a partir de la latitud i la longitud
    Coordenades(double latitud, double longitud) {
        this.latitud = latitud;
        this.longitud = longitud;
    }

    // getters i setters

    // mètode per llegir la latitud (getLatitud)
    public double getLatitud() {
        return this.latitud;
    }

    // mètode per llegir la longitud (getLongitud)
    public double getLongitud() {
        return this.longitud;
    }

    // mètode per assignar un nou valor a la latitud (setLatitud)
    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    // mètode per assignar un nou valor a la longitud  (setLongitud)
    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    // mètodes instància

    // Retorna la distància entre dues coordenades en km.
    public double distancia(Coordenades c2) {

        // Convertim les latituds i longituds de graus a radians
        double lat1 = Math.toRadians(this.latitud);
        double lon1 = Math.toRadians(this.longitud);
        double lat2 = Math.toRadians(c2.latitud);
        double lon2 = Math.toRadians(c2.longitud);

        // Diferències entre les coordenades
        double dLat = lat2 - lat1;
        double dLon = lon2 - lon1;

        // Fórmula de Haversine
        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2)
                + Math.cos(lat1) * Math.cos(lat2) * Math.sin(dLon / 2) * Math.sin(dLon / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        // Distància en quilòmetres
        return R * c;
    }

    // toString(): mètode que retorna els valors de l'objecte. Per exemple: {Longitud: 2.1686, Latitud: 41.3874}

    @Override
    public String toString() {
        return "{Latitud: " + this.latitud + ", Longitud: " + this.longitud + "}";
    }
    
}
