package com.aginskiy.training.report;

import com.aginskiy.training.entity.Library;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LibraryReport {
    public void reportLibrary(Library... library) {
        File file = new File(".//Report//Report.txt");
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file);
            fileWriter.write(library.toString() + "\n\n");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
