# PoloniexApiTest
Get data using Poloniex API, written in JAVA, IntelliJ Project.

## How to use?
1. Create API Key in Poloniex. https://poloniex.com/apiKeys
2. Set your API Key in Main.java
3. Run Main.java

## Usage example

```
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
```