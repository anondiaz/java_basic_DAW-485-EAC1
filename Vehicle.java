public class Vehicle {

    // declaració de les constants

    public static final int ATURAT = 1;
    public static final int EN_MOVIMENT = 2;
    public static final int EN_CARREGA = 3;

    // el valor d'aquest atribut és el mateix per a tots els objectes
    private PENDENT int numVehiclesGestionats = 0;

    // atributs

    private String matricula;
    private String marca;
    private String model;
    private int percentatge;
    private int autonomia;
    private int estat;

    // Constructors

    Vehicle(String matricula, String marca, String model, int autonomia) {
        this.matricula = PENDENT;
        this.marca = PENDENT;
        this.model = PENDENT;
        this.percentatge = 100;
        this.autonomia = PENDENT;
        this.estat = ATURAT;
        numVehiclesGestionats++;
    }

    // getters i setters

    public String getMatricula() {
        return this.matricula;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getModel() {
        return this.model;
    }

    public int getPercentatge() {
        return this.percentatge;
    }

    public int getAutonomima() {
        return this.autonomia;
    }

    public int getEstat() {
        return this.estat;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPercentatge(int percentatge) {
        this.percentatge = percentatge;
    }

    public void setAutonomima(int autonomia) {
        this.autonomia = autonomia;
    }

    public void setEstat(int estat) {
        this.estat = estat;
    }

    // mètodes instància

    // canvia l'estat del vehicle a en moviment
    public void engegar() {
        // PENDENT
    }

    // canvia l'estat del vehicle a aturat
    public void aturar() {
        // PENDENT
    }

    // canvia l'estat del vehicle a en càrrega
    public void carregar() {
        // PENDENT
    }

    // mètodes estàtics

    public static int getNumVehiclesGestionats() {
        return numVehiclesGestionats;
    }

    // toString()
    @Override
    public String toString() {
        return "{Matrícula: " + this.matricula + ", Marca: " + this.marca
                + ", Model: " + this.model + ", Percentatge Bateria: " + this.percentatge
                + ", Autonomia: " + this.autonomia + ", Estat: " + this.estat + "}";
    }
}
