package Question_6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Txs {
    public static void main(String[] args) {
        List<Tx> txs = new ArrayList<>();
        txs.add(new Tx(2019,"a",50));
        txs.add(new Tx(2019,"b",150));
        txs.add(new Tx(2019,"c",520));
        txs.add(new Tx(2019,"d",10));
        txs.add(new Tx(2019,"e",140));
        txs.add(new Tx(2018,"a",650));
        txs.add(new Tx(2018,"b",540));
        txs.add(new Tx(2018,"c",530));
        txs.add(new Tx(2018,"d",530));
        txs.add(new Tx(2018,"e",60));
        txs.add(new Tx(2017,"a",540));
        txs.add(new Tx(2017,"b",53));
        txs.add(new Tx(2017,"c",502));
        txs.add(new Tx(2017,"d",503));
        txs.add(new Tx(2017,"e",560));

        Map<Integer, List<String>> earning = txs.stream()
            .collect(Collectors.groupingBy(
                tx -> tx.year,
                Collectors.collectingAndThen(
                    Collectors.groupingBy(
                        tx -> tx.trader,
                        Collectors.summingInt(tx -> tx.value)
                    ),
                    traderTotals -> traderTotals.entrySet().stream()
                        .sorted(
                            Comparator.comparing(Map.Entry<String, Integer>::getValue).reversed().thenComparing(Map.Entry::getKey)
                        )
                        .limit(3)
                        .map(Map.Entry::getKey)
                        .collect(Collectors.toList())
                )
            ));

        System.out.println(earning);
    }
}
