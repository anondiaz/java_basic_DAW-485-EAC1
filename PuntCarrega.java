public class PuntCarrega {

    // declaració de les constants

    public PENDENT int TYPE2 = 1;
    public PENDENT int CCS = 2;
    public PENDENT int CHADEMO = 3;

    // necessitem tres constants per a indicar que un punt de càrrega està disponible, ocupat o avariat. Els seus valors seran 1, 2 i 3.
    // PENDENT

    // el valor d'aquest atribut és el mateix per a tots els objectes
    private static int numPuntsCarregaGestionats = 0;

    // atributs
    private String identificador;
    private Coordenades ubicacio;
    private double potencia;
    private int connector;
    private int estat;

    // Constructors. Es considera que un punt de càrrega està disponible quan es crea. 

    public PuntCarrega(String identificador, Coordenades ubicacio, double potencia, int connector) {
        this.identificador = identificador;
        this.ubicacio = new Coordenades(ubicacio.getLatitud(), ubicacio.getLongitud());
        this.potencia = potencia;
        this.connector = connector;
        this.estat = PENDENT;
        numPuntsCarregaGestionats++;
    }

    // getters i setters

    public String getIdentificador() {
        return this.identificador;
    }

    public Coordenades getUbicacio() {
        return this.ubicacio;
    }

    public double getPotencia() {
        return this.potencia;
    }

    public int getConnector() {
        // PENDENT
    }

    public int getEstat() {
        // PENDENT
    }

   // setter: métode per assignar un nou valor a l'identificador
   // PENDENT

    public void setUbicacio(Coordenades ubicacio) {
        this.ubicacio = ubicacio;
    }

    public void setPotencia(double potencia) {
        // PENDENT
    }

    public void setConnector(int connector) {
         // PENDENT
    }

    public void setEstat(int estat) {
         // PENDENT
    }

    // mètodes instància
    // obté la distància entre dos punts de càrrega
    public double Distancia(PuntCarrega pc) {
        return this.ubicacio.distancia(pc.getUbicacio());
    }

    // mètodes estàtics

    // mètode per obtenir el nombre de punts de càrrega creats
    // PENDENT

    // toString()
    @Override
    public String toString() {
        return "{Identificador: " + this.identificador + ", Ubicació: " + this.ubicacio.toString()
                + ", Potencia: " + this.potencia + ", Connector: " + this.connector
                + ", Estat: " + this.estat + "}";
    }

}
