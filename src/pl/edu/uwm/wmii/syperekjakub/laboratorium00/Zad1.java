package pl.edu.uwm.wmii.syperekjakub.laboratorium00;

import java.time.LocalDateTime;
import java.util.List;

public class Zad1 {

    //Zad. 1
    abstract class SrodekLokomocji{
        int iloscMiejsc;
        double cenaBiletu;



        void obliczCene(){
            cenaBiletu = 55;
        }

        double Cena(){

            return cenaBiletu;
        }
    }

    //Zad. 2
    class Autobus extends SrodekLokomocji{


        void konstr(int iloscMiejsc){
            obliczCene();
            return;
        }

        @Override
        public String toString(){
            System.out.println("Autobus: ilość miejsc: ");
            System.out.print(iloscMiejsc);
            System.out.println("Cena biletu:");
            System.out.print(cenaBiletu);
            return null;
        }

    }

    //Zad. 3
    class Pociag extends SrodekLokomocji{
        private int dlugoscTrasy;
        @Override
        void obliczCene(){
            if (dlugoscTrasy > 100){
                cenaBiletu = dlugoscTrasy*1.41;
            }
            else{
                cenaBiletu = 55;
            }

        }
        void konstr2(int iloscMiejsc, int dlugoscTrasy){
            obliczCene();
            return;
        }
        @Override
        public String toString(){
            System.out.println("Pociąg: ilość miejsc: ");
            System.out.print(iloscMiejsc);
            System.out.println("Długość trasy: ");
            System.out.print(dlugoscTrasy);
            System.out.println("Cena biletu: ");
            System.out.print(cenaBiletu);
            return null;

        }


    }

    //Zad. 4
    interface IZarzadzaj{
        void DodajAutobus(int iloscMiejsc);
        void DodajPociag(int iloscMiejsc, int dlugoscTrasy);
        void UsunOstatni();
        void Wyczysc();

    }
    interface IData{
        void UstawDate(LocalDateTime data);
        boolean SprawdzDate();

    }

    //Zad. 5
    abstract class Podroz implements IZarzadzaj, IData{
        private LocalDateTime dataPodrozy;
        private List<SrodekLokomocji> planPodrozy;
        private double koszt = 0;


        public void DodajAutobus(int iloscMiejsc) {

        }
        public void DodajPociag(int iloscMiejsc, int dlugoscTrasy){

        }
        public void UsunOstatni(){

        }
        public void Wyczysc(){

        }
        public void UstawDate(LocalDateTime data){

        }
        public boolean SprawdzDate(){

            return false;
        }
        @Override
        public String toString(){

            return null;
        }
    }

}

//info
//Zamiast sugerowanego w zadaniach DataTime użyłem typu danych LocalDateTime, gdyż DataTime nie jest wykrywany jako typ danych
//w Javie (a przynajmniej w wersji którą posiadam), użyłem więc za to typu LocalDateTime, czyli typu danych określającego
//dany punkt w czasie.