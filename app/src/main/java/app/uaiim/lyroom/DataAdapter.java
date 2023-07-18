package app.uaiim.lyroom;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import app.uaiim.lyroom.DataModel;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import java.util.List;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {

	private List<DataModel> items;
	private Context mContext;

	public interface onSelectData {
		void onSelected(DataModel modelListLagu);
	}

	public DataAdapter(Context context, List<DataModel> items) {
		this.mContext = context;
		this.items = items;
	}

	@Override
	public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
		View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_list, parent, false);
		//v.getLayoutParams().height = parent.getMeasuredWidth() / 2 + parent.getMeasuredWidth() / 4;
		return new ViewHolder(v);
	}

	@Override
	public void onBindViewHolder(ViewHolder holder, int position) {
		final DataModel data = items.get(position);
		Glide.with(mContext).load(data.getItemImage()).fitCenter().diskCacheStrategy(DiskCacheStrategy.ALL)
				.into(holder.itemImage);

		holder.itemId.setText(data.getItemId());
		holder.itemTitle.setText(data.getItemTitle());
		holder.itemContent.setText(data.getItemContent());
		holder.itemLabel.setText(data.getItemLabel());
	}

	@Override
	public int getItemCount() {
		return items.size();
	}

	//Class Holder
	class ViewHolder extends RecyclerView.ViewHolder {

		public TextView itemId;
		public TextView itemTitle;
		public TextView itemContent;
		public ImageView itemImage;
		public TextView itemLabel;

		public ViewHolder(View view) {
			super(view);
			itemId = view.findViewById(R.id.itemId);
			itemTitle = view.findViewById(R.id.itemTitle);
			itemContent = view.findViewById(R.id.itemContent);
			itemImage = view.findViewById(R.id.itemImage);
			itemLabel = view.findViewById(R.id.itemLabel);
		}
	}

}
