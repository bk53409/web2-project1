package com.auth0.example.model;

public class Mec {
    private Long id;
    private Korisnik korisnik1;
    private Korisnik korisnik2;
    private String rezultat;
    private Natjecanje natjecanje;

    public Mec(Korisnik korisnik1, Korisnik korisnik2, String rezultat, Natjecanje natjecanje) {
        this.korisnik1 = korisnik1;
        this.korisnik2 = korisnik2;
        this.rezultat = rezultat;
        this.natjecanje = natjecanje;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Korisnik getKorisnik1() {
        return korisnik1;
    }

    public void setKorisnik1(Korisnik korisnik1) {
        this.korisnik1 = korisnik1;
    }

    public Korisnik getKorisnik2() {
        return korisnik2;
    }

    public void setKorisnik2(Korisnik korisnik2) {
        this.korisnik2 = korisnik2;
    }

    public String getRezultat() {
        return rezultat;
    }

    public void setRezultat(String rezultat) {
        this.rezultat = rezultat;
    }

    public Natjecanje getNatjecanje() {
        return natjecanje;
    }

    public void setNatjecanje(Natjecanje natjecanje) {
        this.natjecanje = natjecanje;
    }
}
