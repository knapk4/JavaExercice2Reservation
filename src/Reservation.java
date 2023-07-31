class Reservation {
    String nomSpectateur;
    int nombrePlaces;
    Spectacle spectacle;

    public Reservation(String nomSpectateur, int nombrePlaces){
        this.nomSpectateur=nomSpectateur;
        this.nombrePlaces=nombrePlaces;
    }

    public String getNomSpectateur(){
        return nomSpectateur;
        }
     public int getNombrePlaces(){
        return nombrePlaces;
     }
    public Spectacle getSpectacle() {
        return spectacle;
    }

    public void setSpectacle(Spectacle spectacle) {
        this.spectacle = spectacle;
    }
}
