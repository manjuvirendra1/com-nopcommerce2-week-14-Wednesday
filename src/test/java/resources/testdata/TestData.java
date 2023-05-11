package resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name = "Build Your Own Computer")

    public Object[][] getData() {


        Object[][] data = new Object[3][5];
        {
            data[0][0] = "2.2 GHz Intel Pentium Dual-Core E2200 ";
            data[0][1] = "2 GB";
            data[0][2] = "320 GB";
            data[0][3] = "Vista Home [+$50.00]";
            data[0][4] = "Microsoft Office [+$50.00]";

            data[1][0] = "2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00]";
            data[1][1] = "4GB [+$20.00]";
            data[1][2] = "400 GB [+$100.00]";
            data[1][3] = "Vista Premium [+$60.00]";
            data[1][4] = "Acrobat Reader [+$10.00]";

            data[2][0] = "2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00]";
            data[2][1] = "8GB [+$60.00]";
            data[2][2] = "320 GB";
            data[2][3] = "Vista Home [+$50.00]";
            data[2][4] = "Total Commander [+$5.00]";


            return data;
        }


        }
    }