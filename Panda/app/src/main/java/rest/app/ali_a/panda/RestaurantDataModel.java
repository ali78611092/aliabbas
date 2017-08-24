package rest.app.ali_a.panda;

/**
 * Created by ali_a on 8/23/2017.
 */

public class RestaurantDataModel {
    private String [] names = {"KFC","McDonalds","Kolachi","Kababjees","Rosati Bistro","KFC","McDonalds","Kolachi","Kababjees","Rosati Bistro"};
    private String [] description = {"KFC Description","McDonalds Description","Kolachi Description","Kababjees Description","Rosati Bistro Description","KFC Description","McDonalds Description","Kolachi Description","Kababjees Description","Rosati Bistro Description"};
    private String[] restaurantsRCount ={"44","60","90","10","32","89","17","30","80","50"};
    int [] restaurant_images = {
            R.drawable.burger,
            R.drawable.custard,
            R.drawable.burger,
            R.drawable.fruits,
            R.drawable.steak,
            R.drawable.burger,
            R.drawable.custard,
            R.drawable.burger,
            R.drawable.fruits,
            R.drawable.steak,
    };
    public int get_img(int position)
    {
        return restaurant_images[position];
    }
    public String get_name(int position)
    {
        return names[position];
    }
    public String get_rcount(int position)
    {
        return restaurantsRCount[position];
    }
    public String get_description(int position)
    {
        return description[position];
    }
    public int get_len()
    {
        return restaurant_images.length;
    }
}
