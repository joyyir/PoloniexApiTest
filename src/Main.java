import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        // Set your API Key
        Map<String, String> apikey = new HashMap<>();
        apikey.put("key", "AAAAAAAA-BBBBBBBB-CCCCCCCC-DDDDDDDD");
        apikey.put("secret", "0123456789abcdef0123456789abcdef0123456789abcdef0123456789abcdef");
        apikey.put("nonce", String.valueOf(0)); // if you get 422 code, you should increase this value.

        PoloniexComm comm = new PoloniexComm(apikey);

        try {
            double xrpBal = comm.getBalance(PoloniexComm.COIN_XRP);
            double totBal = comm.getCompleteBalance();
            double btcPriceUsdt = comm.getMarketPrice(PoloniexComm.COIN_USDT, PoloniexComm.COIN_BTC);

            System.out.println(""
                    + "I have " + xrpBal + " XRP.\n"
                    + "I have " + totBal + " BTC value in Poloniex.\n"
                    + "1 BTC price is " + btcPriceUsdt + " USDT.\n"
            );
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
