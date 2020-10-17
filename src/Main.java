import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;


public class Main {
    public static void main(String[] args) {
     FileCreator fileCreator=new FileCreator(10000,10000);
     fileCreator.create();
     FileReaderToList fileReaderToList = new FileReaderToList(10000);
     ArrayList<Integer> arrayList=fileReaderToList.read();
     Calculator calculator = new Calculator();
     calculator.sum(arrayList);


        calculator.min(arrayList);


        calculator.max(arrayList);



        calculator.min1(arrayList);



        calculator.max1(arrayList);

        calculator.zero(arrayList);


    }



    }