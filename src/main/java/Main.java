import java.util.ArrayList;
import model.Localisations;
import model.Places;
import model.Museums;
import java.util.Scanner;
import java.io.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dawid
 */
public class Main {
    private static final ArrayList<Localisations> localisations = new ArrayList<>();
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner scan = new Scanner(System.in);
        while(true)
        {
        System.out.println("1. Add localisation");
        System.out.println("2. Show the list of localisations");
        System.out.println("3. Statistics");
        System.out.println("4. Save to file");
        System.out.println("5. Close the program");
        
        int choice;
        
        choice = scan.nextInt();
        
        switch(choice){
            case 1:
                addLocalisation();
                break;
            case 2:
                showLocalisations();
                break;
            case 3:
                raport();
                break;
            case 4:
                saveToFile();
                break;
            case 5:
                System.exit(0);
        }        
        }
        
    }
    public static void addLocalisation(){
        Scanner scan = new Scanner (System.in);
        System.out.println("What kind of localisation you wish to add?");
        System.out.println("1. Place?");
        System.out.println("2. Museum?");
        System.out.println("3. Localisation?");
        int choice;
        choice = scan.nextInt();
        if(choice == 1)
        {
            Places place = new Places();
            System.out.println("Please give the name of the place you wish to add.");
            place.setName(scan.next());
            System.out.println("Please give the name of the country where this place is located.");
            place.setCountry(scan.next());
            System.out.println("Pleas11e give the name of the city where this place is located.");
            place.setCity(scan.next());
            System.out.println("Have you visited this place already? Type in true or false.");
            place.setVisited(scan.nextBoolean());
            System.out.println("Please give the longitude of this place.");
            place.setLongitude(scan.nextDouble());
            System.out.println("Please give the latitude of this place.");
            place.setLatitude(scan.nextDouble());
            localisations.add(place);
            return;
        }
        else if(choice == 2)
        {
            Museums museum = new Museums();
            System.out.println("Please give the name of the place you wish to add.");
            museum.setName(scan.next());
            System.out.println("Please give the name of the country where this place is located.");
            museum.setCountry(scan.next());
            System.out.println("Pleas11e give the name of the city where this place is located.");
            museum.setCity(scan.next());
            System.out.println("Have you visited this place already? Type in true or false.");
            museum.setVisited(scan.nextBoolean());
            System.out.println("Please give the opening hours for this place.");
            museum.setOpeningHours(scan.next());
            System.out.println("Please give the price for a ticket.");
            museum.setPrice(scan.nextBigDecimal());
            localisations.add(museum);
            return;
        }
        else if(choice == 3)
        {
            Localisations local = new Localisations();
            System.out.println("Please give the name of the place you wish to add.");
            local.setName(scan.next());
            System.out.println("Please give the name of the country where this place is located.");
            local.setCountry(scan.next());
            System.out.println("Pleas11e give the name of the city where this place is located.");
            local.setCity(scan.next());
            System.out.println("Have you visited this place already? Type in true or false.");
            local.setVisited(scan.nextBoolean());
            localisations.add(local);
            return;
        }
        
       
    }
    public static void showLocalisations()
    {   String name;
        Scanner scan = new Scanner(System.in);
        int id = 1;
        
        for(Localisations local : localisations)
        {
            System.out.println(id + " " + local);
            id++;
        }
        System.out.println(" 1. Change the status (visited/planned)?");
        System.out.println(" 2. Delete a localisation?");   
        System.out.println(" 3. Go back");
        int option;
        option = scan.nextInt();
        switch(option)
        {
            case 1:
            System.out.println("Type the name of the localisation you wish to change: ");    
            
            name = scan.next();
            if(localisations.contains(name))
            {
                System.out.print(localisations.contains(name));
                Boolean visited;
                
                id = scan.nextInt() - 1;
                Object toChange = localisations.get(id);
                System.out.println(toChange.toString());
            }
                
                
            case 2:
                System.out.println("Type the name of the localisation you wish to change: ");    
            
            name = scan.next();
            if(localisations.contains(name))
            {
                
                localisations.remove(localisations.get(0));
            }    
            case 3:
            return;
        }
    }
    public static void saveToFile() throws FileNotFoundException
    {
        PrintWriter save = new PrintWriter("plik.txt");
        for(Localisations local : localisations)
        {
            int id = 1;
            save.print(id + " " + local);
            id++;
        }
        save.close();
        System.out.print("Saved to file.");
        
    }
    private static void raport()
    {
        System.out.println("Number of places " + localisations.stream().filter(local -> local instanceof Places).count());
        System.out.println("Number of museums: " + localisations.stream().filter(local -> local instanceof Museums).count());
        
    }
    
}
