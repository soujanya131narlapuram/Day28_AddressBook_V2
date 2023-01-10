package com.bridgelabz;

import java.io.IOException;
import java.util.HashMap;

public interface FileOps {
    void writeDataToDestination(HashMap<String, AddressBook> addressBookHashMap) throws IOException;
    void readDataFromSource() throws IOException;
}
