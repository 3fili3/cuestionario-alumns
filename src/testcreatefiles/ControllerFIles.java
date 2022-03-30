/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testcreatefiles;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author oem
 */
public class ControllerFIles {

    public static Boolean createFile(ArrayList<Alumns> listContent) {
        try {
            String ruta = "../../sourcesExample/sourcesExample.txt";
            File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            listContent.stream().forEach(alumn -> {
                try {
                    bw.write(alumn.getName().toString() + ",");
                    bw.write(alumn.getEmail().toString() + ",");
                    bw.write(alumn.getCarrera().toString() + ",");
                    bw.write(alumn.getLevel().toString() + ",");
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Existe un error de registro de Alumno");
                    Logger.getLogger(ControllerFIles.class.getName()).log(Level.SEVERE, null, ex);
                }
            });
            bw.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static ArrayList<Alumns> getCollectionAlumns() throws IOException {
        String cadena;
        String data = "";
        FileReader f = new FileReader("../../sourcesExample/sourcesExample.txt");
        BufferedReader b = new BufferedReader(f);
        while ((cadena = b.readLine()) != null) {
            data = data + "" + cadena;
        }
        ArrayList<Alumns> alumnsTemporal = new ArrayList<Alumns>();
        String[] collectionStringAlumns = data.split(",");
        int lengthCollection = (collectionStringAlumns.length / 4);
        for (int i = 0; i < lengthCollection; i++) {
            String name = collectionStringAlumns[i * 4];
            String email = collectionStringAlumns[(i * 4) + 1];
            String level = collectionStringAlumns[(i * 4) + 2];
            String carrera = collectionStringAlumns[(i * 4) + 3];
            Alumns objAlumsTempo = new Alumns(name, email, level, carrera);
            alumnsTemporal.add(objAlumsTempo);
        }
        b.close();
        return alumnsTemporal;
    }
}
