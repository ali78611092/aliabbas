package rest.app.ali_a.panda;

/**
 * Created by ali_a on 8/24/2017.
 */

public class DealsDataModel {
    private String[] deals ={"Deal 1","Deal 2","Deal 3","Deal 4","Deal 5","Deal 6","Deal 7","Deal 8","Deal 9","Deal 10"};
    private  String[] tagLines ={"Description1","Description2","Description3","Description4","Description5","Description6","Description7","Description8","Description9","Description10"};
    private String[] prices = {"4000","300","1000","980","9000","6400","600","1000","5000","4700"};
    private int[] deals_images = {
            R.drawable.burger,
            R.drawable.custard,
            R.drawable.steak,
            R.drawable.fruits,
            R.drawable.burger,
            R.drawable.custard,
            R.drawable.steak,
            R.drawable.fruits,
            R.drawable.burger,
            R.drawable.custard,
    };

    public String get_deal(int position)
    {
        return deals[position];
    }
    public String get_deal_description(int position)
    {
        return tagLines[position];
    }
    public String get_price(int position)
    {
        return prices[position];
    }
    public int get_deal_image(int position)
    {
        return deals_images[position];
    }
    public int get_deals_length()
    {
        return deals.length;
    }
}
