abstract class Vehicule {
    public double vitesseMoyenne;
    public double calculerTempsTrajet(double distance) {
        return distance / vitesseMoyenne;

    }    public Vehicule(double vitesseMoyenne) {
        this.vitesseMoyenne = vitesseMoyenne;
    }
}
