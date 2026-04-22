package app;

import java.util.ArrayList;
import sales.Sale;
import services.ReportService;
import services.Reportable;

public class Main {
    public static void main(String[] args) {

    
        ArrayList<Sale> salesList = new ArrayList<>();

        salesList.add(new Sale("Electronics", 1200));
        salesList.add(new Sale("Clothing", 300));
        salesList.add(new Sale("Electronics", 800));

        Reportable report = new ReportService(salesList);

        report.printReport();
    }
}