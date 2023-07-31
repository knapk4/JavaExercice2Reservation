class Concert implements Spectacle {
    private String nomSpectacle;
    private String date;
    private String lieu;

    public Concert(String nomSpectacle, String date, String lieu) {
        this.nomSpectacle=nomSpectacle;
        this.date=date;
        this.lieu=lieu;
    }

    @Override
    public String getNomSpectacle(){
        return nomSpectacle;
    }

    @Override
    public String getDate(){
        return date;
    }

    @Override
    public String getLieu(){
        return lieu;
    }
}