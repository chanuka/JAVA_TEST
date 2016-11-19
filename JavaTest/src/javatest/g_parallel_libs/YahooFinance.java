package javatest.g_parallel_libs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.stream.Collectors;

//START:CLASS
public class YahooFinance {

    public static double getPrice(final String ticker) {
        try {
            final URL url = new URL("http://ichart.finance.yahoo.com/table.csv?s=" + ticker);
            Thread.sleep(1000);
            final BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));

            final String data = reader.lines().collect(Collectors.joining("\n"));

//      final String data = reader.lines().substream(1).findFirst().get();
            final String[] dataItems = data.split(",");
            return Double.parseDouble(dataItems[dataItems.length - 1]);
            //return 12.22;
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }

//    try {
//      Thread.sleep(1000);
//    } catch(Exception ex) {}
//    return Math.random() * 1000;
    }
}
//END:CLASS
