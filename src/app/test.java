package app;

import entities.*;
import entities.Record;
import java.util.Scanner;

public class test {
        private static final int BROJ_OBJEKATA = 2;

        static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            User[] users = new User[BROJ_OBJEKATA];
            Admin[] admins = new Admin[BROJ_OBJEKATA];
            Item[] items = new Item[BROJ_OBJEKATA];
            Booking[] bookings = new Booking[BROJ_OBJEKATA];
            Record[] records = new Record[BROJ_OBJEKATA];

            System.out.println("Unos usera - ");

            for (int i = 0; i < users.length; i++){
                System.out.println("Ime: ");
                String ime = scanner.nextLine();
                System.out.println("Dob: ");
                int dob = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Email: ");
                String email = scanner.nextLine();


                users[i] = new User(i+1, ime, dob, email);
                System.out.println();
            }

            System.out.println("Unos itema - ");

            for (int i = 0; i < items.length; i++){
                System.out.println("Naziv itema: ");
                String naziv = scanner.nextLine();
                System.out.println("Cijena: ");
                double cijena = scanner.nextDouble();
                scanner.nextLine();

                items[i] = new Item.Builder().setIme(naziv).setCijena(cijena).build();
                System.out.println();
            }

            System.out.println("Unos bookinga - ");

            for (int i = 0; i < bookings.length; i++){
                System.out.println("Datum: ");
                String datum = scanner.nextLine();

                bookings[i] = new Booking(i+1, datum);
            }

            System.out.println("Unos narudzbi");

            for (int i = 0; i < records.length; i++){
                records[i] = new Record(users[i], items[i], bookings[i]);
            }

            // polje osoba sadrzi usere i admine
            Person[] osobe = new Person[BROJ_OBJEKATA * 2];
            for (int i = 0; i < BROJ_OBJEKATA; i++){
                osobe[i] = users[i];
                osobe[i + BROJ_OBJEKATA] = admins[i];
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
