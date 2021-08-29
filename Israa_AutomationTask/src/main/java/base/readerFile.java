package base;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class readerFile {
    public static String FIRSTNAME;
    public static String LASTNAME;
    public static String PASSWORD;
    public static String DAYS;
    public static String MONTHS;
    public static String YEARS;
    public static String ADDRESS;
    public static String CITY;
    public static String STATES;
    public static String ZIP;
    public static String COUNTRY;
    public static String MOBILENUMDER;
    public static String ALIAS;

    public static void LoadData() throws IOException {
        Properties reader = new Properties();
        File file = new File("src/main/resources/data.properties");
        FileInputStream fileInputStream = null;
        fileInputStream = new FileInputStream(file);
        reader.load(fileInputStream);
        FIRSTNAME = reader.getProperty("FirstName");
        LASTNAME = reader.getProperty("LastName");
        PASSWORD = reader.getProperty("Password");
        DAYS = reader.getProperty("Day");
        MONTHS = reader.getProperty("Month");
        YEARS = reader.getProperty("Year");
        ADDRESS = reader.getProperty("Address");
        CITY = reader.getProperty("City");
        COUNTRY = reader.getProperty("Country");
        STATES = reader.getProperty("State");
        ZIP = reader.getProperty("Zip");
        ALIAS = reader.getProperty("Alias");
        MOBILENUMDER = reader.getProperty("MobileNumber");

    }

}
