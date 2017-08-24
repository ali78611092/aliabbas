package rest.app.ali_a.panda;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by ali_a on 8/24/2017.
 */

public class DealsViewHolder extends RecyclerView.ViewHolder {
    ImageView dealPicture;
    TextView dealName, dealDescription, dealprice;
    public DealsViewHolder(View itemvieww)
    {
        super(itemvieww);
        dealPicture = (ImageView) itemvieww.findViewById(R.id.iv_deal_logo);
        dealName = (TextView) itemvieww.findViewById(R.id.tv_deal_name);
        dealDescription = (TextView) itemvieww.findViewById(R.id.tv_deal_description);
        dealprice = (TextView) itemvieww.findViewById(R.id.tv_price);
    }
}
