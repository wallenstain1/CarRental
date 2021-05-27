package com.company;

public class Avto {
    private int id_avto;
    private String mark;
    private int cost;
    private String type;
    private int kolvo;


    public int getId_avto() {
        return id_avto;
    }

    public int getKolvo() {
        return kolvo;
    }

    public int getCost() {
        return cost;
    }

    public String getMark() {
        return mark;
    }

    public String getType() {
        return type;
    }

    public void setId_avto(int id_avto) {
        this.id_avto = id_avto;
    }

    public void setKolvo(int kolvo) {
        this.kolvo = kolvo;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setCost(int sallary) {
        this.cost = sallary;
    }

    public void setType(String type) {
        this.type = type;
    }
    public Avto() {
        this.id_avto = id_avto;
        this.mark = mark;
        this.cost = cost;
        this.type = type;
        this.kolvo = kolvo;
    }
}
