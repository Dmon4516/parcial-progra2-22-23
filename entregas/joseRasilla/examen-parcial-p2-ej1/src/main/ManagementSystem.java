package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ManagementSystem {
    private FileHandler fileHandler;

    private List<Client> clients;
    private List<Appointment> appointments;

    public ManagementSystem() {
    }

    public void loadData(String path) {
        /*
            Load clients from file

            // For each line in file

            String[] data = line.split(";");

             // Extract data from line and remove quotes
            String name = data[0].replaceAll("\"", "");
            String surname = data[1].replaceAll("\"", "");
            String address = data[2].replaceAll("\"", "");
            String phoneNumber = data[3].replaceAll("\"", "");


            // Create client and add to list

         */

        //Fills the lines in the file handler with the file content of the path



    }

    public List<Client> getClients() {
        return clients;
    }


    public void addAppointment(Appointment appointment, Client client) {

    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

    boolean isClient(Client client){

        return false;
    }

}
