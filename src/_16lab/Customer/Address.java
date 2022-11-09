package _16lab.Customer;

public final class Address {
    private String cityName;
    private int zipCode;
    private String streetName;
    private int buildingNumber;
    private char buildingLetter;
    private int apartmentNumber;
    
    public static final Address EMPTY_ADDRESS = new Address("", 0, "", 0, 0);

    public Address(String cityName, int zipCode, String streetName, int buildingNumber, int apartmentNumber){
        this(cityName, zipCode, streetName, buildingNumber, ' ', apartmentNumber);
    }

    public Address(String cityName, int zipCode, String streetName, int buildingNumber, char buildingLetter, int apartmentNumber) {
        this.cityName = cityName;
        this.streetName = streetName;
        this.zipCode = zipCode;
        this.buildingNumber = buildingNumber;
        this.apartmentNumber = apartmentNumber;
        this.buildingLetter = buildingLetter;
    }

    public String getCityName() {
        return cityName;
    }
    public int getZipCode() {
        return zipCode;
    }
    public String getStreetName() {
        return streetName;
    }
    public int getBuildingNumber() {
        return buildingNumber;
    }
    public char getBuildingLetter() {
        return buildingLetter;
    }
    public int getApartmentNumber() {
        return apartmentNumber;
    }
}
