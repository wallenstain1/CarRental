package com.company;

public class Main {

    public static void main(String[] args) {
        Klient client= new Klient();
        client.setSurname(" Айталиев, ");
        client.setName(" Азамат, ");
        client.setLastname(" Казахович, ");
        client.setAddress(" Казахстан, Нур-Султан, ул.Кошек батыр 21 ");
        client.setPhone(" 8(800)555-35-35 ");

        PunktProkata punkt= new PunktProkata();

        punkt.setId_center(322);
        punkt.setId_client(228);
        punkt.setNumberDogovora(1337);

        Avto avto =new Avto();
        avto.setId_avto(1);
        avto.setKolvo(400);
        avto.setMark("Mazda");
        avto.setCost(500000);
        avto.setType("Седан");

        Avto avto1= new Avto();
        avto1.setId_avto(2);
        avto1.setKolvo(200);
        avto1.setMark("Audi");
        avto1.setCost(900000);
        avto1.setType("Хетчбек");


        System.out.println(client.getAddress()+ client.getLastname()+ client.getName()+ client.getSurname()+client.getPhone());
        System.out.println();
        System.out.println(punkt.getId_center()+" "+ punkt.getId_client()+" "+ punkt.getNumberDogovora());
        System.out.println();
        System.out.println(avto.getId_avto()+" "+ avto.getKolvo()+" "+ avto.getMark()+" "+avto.getCost()+" "+avto.getType());
        System.out.println();
        System.out.println(avto1.getId_avto()+" "+ avto1.getKolvo()+" "+ avto1.getMark()+" "+avto1.getCost()+" "+avto1.getType());

            }
}
