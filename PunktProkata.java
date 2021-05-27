package com.company;

public class PunktProkata {
    private int id_center;

    private int id_client;
    private int numberDogovora;



    public int getId_center() {
        return id_center;
    }

    public int getId_client() {
        return id_client;
    }

    public int getNumberDogovora() {
        return numberDogovora;
    }


    public void setId_center(int id_center) {
        this.id_center = id_center;
    }

    public void setId_client(int id_client) {
        this.id_client = id_client;
    }

    public void setNumberDogovora(int numberDogovora) {
        this.numberDogovora = numberDogovora;
    }

    public PunktProkata() {
        this.id_center = id_center;
        this.id_client = id_client;
        this.numberDogovora = numberDogovora;

    }
}
