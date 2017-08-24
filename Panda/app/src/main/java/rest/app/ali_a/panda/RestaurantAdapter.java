package rest.app.ali_a.panda;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/**
 * Created by ali_a on 8/23/2017.
 */

public class RestaurantAdapter extends RecyclerView.Adapter<RestaurantViewHolder>
{
    private Context context;
    public RestaurantAdapter(Context context)
    {
        this.context = context;
    }
    RestaurantDataModel rdm = new RestaurantDataModel();
    @Override
    public RestaurantViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.singlerestaurant,parent,false);
        return (new RestaurantViewHolder(view));
    }

    @Override
    public void onBindViewHolder(RestaurantViewHolder holder, int position) {
        holder.restaurantName.setText(rdm.get_name(position));
        holder.restaurantDescription.setText(rdm.get_description(position));
        holder.restaurantRCount.setText("("+rdm.get_rcount(position)+")");
        holder.restaurantPicture.setImageResource(rdm.get_img(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), Main2Activity.class);
                view.getContext().startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return rdm.get_len();
    }
}

