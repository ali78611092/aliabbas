package rest.app.ali_a.panda;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by ali_a on 8/24/2017.
 */

public class DealsAdapter extends RecyclerView.Adapter<DealsViewHolder> {

    Context context;
    public DealsAdapter(Context context)
    {
        this.context = context;
    }
    DealsDataModel ddm = new DealsDataModel();
    @Override
    public DealsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View vieww = LayoutInflater.from(context).inflate(R.layout.singledeal,parent,false);
        return (new DealsViewHolder(vieww));
    }

    @Override
    public void onBindViewHolder(DealsViewHolder holder, int position)
    {
        holder.dealName.setText(ddm.get_deal(position));
        holder.dealDescription.setText(ddm.get_deal_description(position));
        holder.dealprice.setText("Rs."+ ddm.get_price(position));
        holder.dealPicture.setImageResource(ddm.get_deal_image(position));
    }

    @Override
    public int getItemCount() {
        return ddm.get_deals_length();
    }
}
