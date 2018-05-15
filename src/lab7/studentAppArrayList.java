package lab7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class studentAppArrayList {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("How many data you do have: ");
        int va1 = Integer.parseInt(reader.readLine());
        ArrayList<Student> myList = new ArrayList<Student>();
        inputData (myList,va1);

    }

    private static ArrayList inputData(ArrayList<Student> myList, int va1) {
    }

}//class
