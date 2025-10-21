package app;

import entities.*;
import entities.Record;

import java.util.Scanner;

public class test {
        private static final int BROJ_OBJEKATA = 5;

        static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            User[] users = new User[BROJ_OBJEKATA];
            Item[] items = new Item[BROJ_OBJEKATA];
            Booking[] bookings = new Booking[BROJ_OBJEKATA];
            Record[] records = new Record[BROJ_OBJEKATA];

            System.out.println("Unos usera - ");

            for (int i = 0; i < users.length; i++){
                System.out.println("Ime: ");
                String ime = scanner.nextLine();
                System.out.println("Email: ");
                String email = scanner.nextLine();
                System.out.println("Adresa: ");
                String adresa = scanner.nextLine();

                users[i] = new User(ime,email,adresa);
                System.out.println();
            }

            System.out.println("Unos itema - ");

            for (int i = 0; i < items.length; i++){
                System.out.println("Naziv itema: ");
                String naziv = scanner.nextLine();
                System.out.println("Cijena: ");
                double cijena = scanner.nextDouble();
                scanner.nextLine();

                items[i] = new Item(naziv, cijena);
                System.out.println();
            }

            System.out.println("Unos bookinga - ");

            for (int i = 0; i < bookings.length; i++){
                System.out.println("Naziv restorana: ");
                String naziv = scanner.nextLine();
                System.out.println("Datum: ");
                String datum = scanner.nextLine();

                bookings[i] = new Booking(users[i], naziv, datum);
            }

            System.out.println("Unos narudzbi");

            for (int i = 0; i < records.length; i++){
                records[i] = new Record(users[i], items[i], bookings[i]);
            }

            System.out.println("Pretrazivanje usera - ");

            String imePrezime = scanner.nextLine();
            boolean imaUsera = false;

            for (int i = 0; i < users.length; i++){
                if (users[i].getIme().equals(imePrezime)){
                    System.out.println("User " + users[i].getIme() + " postoji");
                    imaUsera = true;
                }
            }
            if (imaUsera == false){
                System.out.println("User " + imePrezime + " ne postoji");
            }

            System.out.println("Najskuplji i najjeftiniji item - ");

            if (items.length > 0){
                Item najskuplji = items[0];
                Item najjeftiniji = items[0];

                int i = 1;
                do {
                    if (items[i].getCijena() > najskuplji.getCijena()) {
                        najskuplji = items[i];
                    }
                    if (items[i].getCijena() < najjeftiniji.getCijena()) {
                        najjeftiniji = items[i];
                    }
                    i++;
                } while (i < items.length);

                System.out.println("Najskuplji item: " + najskuplji.getNaziv() + " " + najskuplji.getCijena() + " EUR");
                System.out.println("Najjeftiniji item: " + najjeftiniji.getNaziv() + " " + najjeftiniji.getCijena() + " EUR");
            }
            else {
                System.out.println("Nema itema za usporedbu");
            }
            scanner.close();
        }
}
