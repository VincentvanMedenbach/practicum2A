package school.oop;

public class Zwembad {
    private double breedte;
    private double lengte;
    private double diepte;
    private double inhoud;


    Zwembad(double breedte, double lengte, double diepte) {
        this.breedte = breedte;
        this.lengte = lengte;
        this.diepte = diepte;
        this.inhoud = this.breedte * this.diepte * this.lengte;
    }

    Zwembad() {
        this.breedte = breedte;
        this.lengte = lengte;
        this.diepte = diepte;
        this.inhoud = this.breedte * this.diepte * this.lengte;
    }

    public double getBreedte() {
        return breedte;
    }

    public double getLengte() {
        return lengte;
    }

    public double getDiepte() {
        return diepte;
    }

    public double inhoud() {
        this.setInhoud();
        return inhoud;
    }

    public void setBreedte(double breedte) {
        this.breedte = breedte;
    }

    public void setLengte(double lengte) {
        this.lengte = lengte;
    }

    public void setDiepte(double diepte) {
        this.diepte = diepte;
    }

    public void setInhoud() {
        this.inhoud = this.breedte * this.diepte * this.lengte;

    }

    @java.lang.Override
    public java.lang.String toString() {
        return " Dit zwembad is " + breedte + " meter breed, " + lengte + " meter lang, en " + diepte + " meter diep";
    }
}