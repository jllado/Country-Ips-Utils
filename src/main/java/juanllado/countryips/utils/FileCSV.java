package juanllado.countryips.utils;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import au.com.bytecode.opencsv.CSVReader;

public class FileCSV {

    private String url = "";
    List<String[]> entries;

    public FileCSV(String urlCSV) {
        this.url = urlCSV;
    }

    public void load() throws IOException {
        CSVReader reader = null;
        try {
            reader = new CSVReader(new FileReader(url), ',');
            entries = reader.readAll();
        } finally {
            try { reader.close(); } catch (Exception e) { /* IGNORE */ }
        }
    }

    public int size() {
        return entries.size();
    }

    public List<String[]> entries() {
        return entries;
    }
}
