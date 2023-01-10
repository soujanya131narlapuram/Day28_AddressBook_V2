package com.bridgelabz;

import com.google.gson.Gson;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class JsonFileOps implements FileOps{
    public static final String FILE_PATH = "C:\\Day_28_Advance_AddressBook\\src\\main\\java\\com\\bridgelabz/addressMap.json";


    public void writeDataToDestination(HashMap<String, AddressBook> addressBookHashMap) throws IOException {
        Gson gson = new Gson();
        Writer writer = Files.newBufferedWriter(Paths.get(FILE_PATH));
        gson.toJson(addressBookHashMap, writer);
        writer.close();
    }

    public void readDataFromSource() throws IOException {
        Gson gson = new Gson();

        Reader reader = Files.newBufferedReader(Paths.get(FILE_PATH));


        HashMap<?, ?> map = gson.fromJson(reader, HashMap.class);

        // print map entries
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }

        // close reader
        reader.close();
    }

}
