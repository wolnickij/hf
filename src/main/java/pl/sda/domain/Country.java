package pl.sda.domain;

public enum Country {
    POLSKA ("Polska", "Poland"),
    NIEMCY ("Niemcy", "Germany"),
    CZECHY ("Czechy", "Czech Republic");

    private final String countryPL;
    private final String countryEN;

    Country(String countryPL, String countryEN){
        this.countryPL = countryPL;
        this.countryEN = countryEN;
    }

    public String getCountryNamePL() {return countryPL;}
    public String getCountryNameEN() {return countryEN;}


}
