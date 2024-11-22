package com.track;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Excel_Shipment{
    static  String csvFile = "C:\\Users\\nld-rolandor\\OneDrive - Expeditors International of Washington Inc\\Desktop\\BACK_UP\\.repo\\resources\\bordercrossing\\src\\main\\java\\com\\track\\Prueba.csv";

    public static void main(String[] args) {
        Read_File();
    }

    public static void Read_File() {
        String line;
        String csvSplitBy = ",";
        List<Shipment> shipments = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(csvSplitBy);
                Shipment shipment = new Shipment();
                shipment.referencia= fields[0];
                shipment.cliente= fields[1];
                shipment.tipoVehiculo= fields[2];
                shipment.numVehiculo= fields[3];
                shipment.estatus= fields[4];
                shipment.scac= fields[5];
                shipment.todFecha= fields[6];
                shipment.todTiempo= fields[7];
                shipment.tnfFecha= fields[8];
                shipment.tnfTiempo= fields[9];
                shipment.dxsFecha= fields[10];
                shipment.dxsTiempo= fields[11];
                shipment.dlyFecha= fields[12];
                shipment.dlyTiempo= fields[13];
                shipment.dlyTipo= fields[14];
                shipment.afsFecha= fields[15];
                shipment.afsTiempo= fields[16];
                shipment.dpuFecha= fields[17];
                shipment.dpuTiempo= fields[18];
                shipment.exrFecha= fields[19];
                shipment.exrHora= fields[20];
                shipment.exrNotas= fields[21];
                shipment.eccFecha= fields[22];
                shipment.eccTiempo= fields[23];
                shipment.ilrFecha= fields[24];
                shipment.ilrTiempo= fields[25];
                shipment.ilrTipo= fields[26];
                shipment.iltNotas= fields[27];
                shipment.clrFecha= fields[28];
                shipment.clrTiempo= fields[29];
                shipment.st1Fecha= fields[30];
                shipment.st1Tiempo= fields[31];
                shipment.st1Notas= fields[32];
                shipment.tscFecha= fields[33];
                shipment.tscTiempo= fields[34];
                shipment.tscNotas= fields[35];
                shipments.add(shipment);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Display the data
        
        for (Shipment shipment : shipments) {
            System.out.println(shipment);
        
    }
}
    /*
public  static void  Capture(Shipment shipment){

    Shipment shipment = new Shipment();
    
    try (FileWriter writer = new FileWriter(csvFile, true)) { // 'true' to append data
        writer.append(shipment.toCSV());
        writer.append("\n");

        System.out.println("Data appended to CSV file successfully.");
    } catch (IOException e) {
        e.printStackTrace();
    }
}*/
}
