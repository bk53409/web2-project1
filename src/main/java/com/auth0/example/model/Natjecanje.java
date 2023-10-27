package com.auth0.example.model;

public class Natjecanje {
    private Long id;
    private String imeNatjecanja;
    private String popisNatejcatelja;
    private String sustavBodovanja;
    private Korisnik korisnik;

    public Natjecanje(String imeNatjecanja, String popisNatejcatelja, String sustavBodovanja, Korisnik korisnik) {
        this.imeNatjecanja = imeNatjecanja;
        this.popisNatejcatelja = popisNatejcatelja;
        this.sustavBodovanja = sustavBodovanja;
        this.korisnik = korisnik;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImeNatjecanja() {
        return imeNatjecanja;
    }

    public void setImeNatjecanja(String imeNatjecanja) {
        this.imeNatjecanja = imeNatjecanja;
    }

    public String getPopisNatejcatelja() {
        return popisNatejcatelja;
    }

    public void setPopisNatejcatelja(String popisNatejcatelja) {
        this.popisNatejcatelja = popisNatejcatelja;
    }

    public String getSustavBodovanja() {
        return sustavBodovanja;
    }

    public void setSustavBodovanja(String sustavBodovanja) {
        this.sustavBodovanja = sustavBodovanja;
    }

    public Korisnik getKorisnik() {
        return korisnik;
    }

    public void setKorisnik(Korisnik korisnik) {
        this.korisnik = korisnik;
    }
}
