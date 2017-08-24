package rest.app.ali_a.panda;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class RestaurantViewHolder extends RecyclerView.ViewHolder{
    ImageView restaurantPicture;
    TextView restaurantName, restaurantDescription, restaurantRCount;

    public RestaurantViewHolder(View itemview) {
        super(itemview);

        restaurantPicture = (ImageView) itemview.findViewById(R.id.iv_logo);
        restaurantName = (TextView) itemview.findViewById(R.id.tv_name);
        restaurantDescription = (TextView) itemview.findViewById(R.id.tv_description);
        restaurantRCount  = (TextView) itemview.findViewById(R.id.tv_r_count);
    }
}
