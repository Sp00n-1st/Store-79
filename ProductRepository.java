import java.util.ArrayList;
import java.util.List;

public class ProductRepository {
    private List<Product> Products;
    private List<Product> FaBItem;
    private List<Product> MaterialItem;
    private List<Product> GarmentItem;
    private List<Product> TransportationService;
    private List<Product> TelecommunicationService;
    public ProductRepository() {
        Products = new ArrayList<>();
        FaBItem = new ArrayList<>();
        MaterialItem = new ArrayList<>();
        GarmentItem = new ArrayList<>();
        TransportationService = new ArrayList<>();
        TelecommunicationService = new ArrayList<>();
    }

    public void addProduct(Product Product) {
        Products.add(Product);
    }

    public List<Product> getAllProduct() {
        List<Product> allProducts = new ArrayList<>();
        allProducts.addAll(FaBItem);
        allProducts.addAll(MaterialItem);
        allProducts.addAll(GarmentItem);
        allProducts.addAll(TransportationService);
        allProducts.addAll(TelecommunicationService);
        return allProducts;
    }

    public void addFaBItem(Product Product) {
        FaBItem.add(Product);
    }

    public List<Product> getAllFaBItem() {
        return FaBItem;
    }

    public void addMaterialItem(Product Product) {
        MaterialItem.add(Product);
    }

    public List<Product> getAllMaterialItem() {
        return MaterialItem;
    }

    public void addGarmentItem(Product Product) {
        GarmentItem.add(Product);
    }

    public List<Product> getAllGarmentItem() {
        return GarmentItem;
    }

    public void addTransportationService(Product Product) {
        TransportationService.add(Product);
    }

    public List<Product> getTransportationService() {
        return TransportationService;
    }

    public void addTelecommunicationService(Product Product) {
        TransportationService.add(Product);
    }

    public List<Product> getTelecommunicationService() {
        return TransportationService;
    }



    // public List<Item> getAllFaBItem2() {
    //     return FaBItem;
    // }
    // public static void main(String[] args) {
    //     FoodAndBeverage foodAndBeverage1, foodAndBeverage2, foodAndBeverage3, 
    //                     foodAndBeverage4, foodAndBeverage5, foodAndBeverage6;
    //     Garment garment1, garment2, garment3, garment4, garment5, garment6;
    //     Material material1, material2, material3, material4, material5, material6;
    //     Telecommunication telecomminunication1, telecomminunication2, telecomminunication3, 
    //                         telecomminunication4, telecomminunication5, telecomminunication6;
    //     Transportation transportation1, transportation2, transportation3, 
    //                    transportation4, transportation5, transportation6;
        
    //     ProductRepository productRepository = new ProductRepository();   
    //     ShowMenu showMenu = new ShowMenu();     

    //     foodAndBeverage1 = new FoodAndBeverage("FaB01", "FoodAndBeverage", "Sari Roti Coklat    ", 250, "09 August 2022", "25 December 2024", "Flour & Chocolate", true, 1500, 1650, 2145);
    //     foodAndBeverage2 = new FoodAndBeverage("FaB02", "FoodAndBeverage", "Malkist Roma Keju   ", 500, "09 August 2022", "09 December 2025", "Cracker & Cheese", true, 5000, 5500, 6600);
    //     foodAndBeverage3 = new FoodAndBeverage("FaB03", "FoodAndBeverage", "Samyang Ramen       ", 100, "23 February 2022", "07 July 2027", "Samyang Noodle, Instant Seasoning, Chili Oil", true, 30000, 33000, 49500);
    //     foodAndBeverage4 = new FoodAndBeverage("FaB04", "FoodAndBeverage", "Air Mineral         ", 500, "11 January 2022", "13 October 2026", "Water", true, 3000, 3300, 3960);
    //     foodAndBeverage5 = new FoodAndBeverage("FaB05", "FoodAndBeverage", "Indomilk Pisang     ", 550, "02 March 2022", "25 April 2025", "Milk & Banana Flavour", false, 10000, 11000, 13200);
    //     foodAndBeverage6 = new FoodAndBeverage("FaB06", "FoodAndBeverage", "Fanta Orange        ", 700, "17 May 2022", "24 November 2026", "Soda & Orange Flavour", true, 10000, 11000, 13200);

    //     garment1 = new Garment("Garment01", "Garment", "Uniqlo T-Shirt", 160, "09 August 2022", "T-shirt", "Cotton", "Maroon", "L", 20, 80000, 88000, 114400);
    //     garment2 = new Garment("Garment02", "Garment", "Levis Jean Denim", 540, "31 October 2021", "Jeans", "Denim", "Navy", "L", 14, 100000, 110000, 132000);
    //     garment3 = new Garment("Garment03", "Garment", "R-Adventure PDL", 260, "11 March 2022", "Cargo", "Ripstop", "Green Army", "M", 16, 90000, 99000, 128700);
    //     garment4 = new Garment("Garment04", "Garment", "Erigo Hoodie Red", 650, "01 June 2022", "Hoodie", "Cotton", "Red", "XL", 20, 235000, 258500, 310200);
    //     garment5 = new Garment("Garment05", "Garment", "Eiger Persevance", 120, "30 September 2021", "Zipper", "Polyester", "Navy", "S", 12, 559000, 614900, 799370);
    //     garment6 = new Garment("Garment06", "Garment", "Emporio Dark Grey Shirt", 600, "07 March 2023", "T-shirt", "Cotton", "Dark Grey", "M", 15, 180000, 198000, 237600);

    //     material1 = new Material("Mt01", "Material", "Tepung Segitiga Biru", 600, "09 August 2022", "25 December 2024", "Flour", false, 32000, 35200, 42240);
    //     material2 = new Material("Mt02", "Material", "Gulaku", 200, "10 February 2022", "16 August 2025", "Sugar", false, 15000, 16500, 21450);
    //     material3 = new Material("Mt03", "Material", "Minyak Bimoli", 100, "15 May 2022", "26 April 2024", "Oil", false, 22000, 24200, 36300);
    //     material4 = new Material("Mt04", "Material", "Coklat Batang Chocc", 400, "28 July 2022", "03 June 2026", "Chocolate", true, 32500, 35750, 42900);
    //     material5 = new Material("Mt05", "Material", "Keju Cheddar Craft", 130, "05 September 2022", "07 October 2025", "Cheese", true, 25000, 27500, 35750);
    //     material6 = new Material("Mt06", "Material", "Garam Dolphin", 450, "20 November 2022", "31 May 2026", "Salt", false, 16000, 17600, 21120);

    //     telecomminunication1 = new Telecommunication("Telecom01", "Telecommunication", "Sim Card Telkomsel", 300, "-", "120", 120, "Per Second", 100, 12000, 15600);
    //     telecomminunication2 = new Telecommunication("Telecom02", "Telecommunication", "Package TeleponTelkomsel", 120, "Data", "200", 150, "Per Package", 100, 10500, 12600);
    //     telecomminunication3 = new Telecommunication("Telecom03", "Telecommunication", "Package Telepon XL", 600, "Default", "200", 170, "Per Package", 100,15300, 22950);
    //     telecomminunication4 = new Telecommunication("Telecom04", "Telecommunication", "Package Telepon 3", 200, "Data", "500", 120, "Per Package", 66, 5544, 6652.80);
    //     telecomminunication5 = new Telecommunication("Telecom05", "Telecommunication", "Package Telepon Smartfren", 500, "Default", "240", 90, "Per Package", 80, 6480, 8424.00);
    //     telecomminunication6 = new Telecommunication("Telecom06", "Telecommunication", "Sim Card Indosat", 125, "", "314", 180, "Per Second", 88, 15840, 19008.00);
        
    //     transportation1 = new Transportation("Transport01", "Transportation", "Angkutan Provinsi", 1000, "Mini Bus", "Bandung - Garut", 25, "FixPerRoute", 50000,50000, 75000);
    //     transportation2 = new Transportation("Transport02", "Transportation", "Angkutan Kota", 120, "Angkot", "Cimahi - Lw.Panjang", 4, "PerMile", 1000, 2000, 2400);
    //     transportation3 = new Transportation("Transport03", "Transportation", "Gojek", 200, "Motorcycle", "Bandung Raya", 6, "PerMile", 10000, 30000, 36000);
    //     transportation4 = new Transportation("Transport04", "Transportation", "Grab", 150, "Motorcycle", "DKI Jakarta", 8, "PerMile", 11000, 44000, 52800);
    //     transportation5 = new Transportation("Transport05", "Transportation", "Bus Trans Jakarta", 501, "Bus", "Blok M - Tosari", 40, "FixPerRoute", 10000, 10000, 15000);
    //     transportation6 = new Transportation("Transport06", "Transportation", "Gocar", 300, "Mini bus", "Bandung Raya", 10, "PerMile", 15000, 75000, 97500);

    // }
    
    
}