package sihuan.com.mycookassistant.adapter;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import sihuan.com.mycookassistant.R;
import sihuan.com.mycookassistant.bean.Works;

/**
 * MyCook
 * Created by Jessica0906zjj on 2016-11-09.
 */

public class MyRecyclerAdapter extends RecyclerView.Adapter<MyRecyclerAdapter.MyRecyclerHolder> {
    private Context mContext;
    private List<Works> mList = null;



    public MyRecyclerAdapter(List<Works> list, Context context) {
        this.mContext = context;
        this.mList = list;
    }

    //创建新View，被LayoutManager所调用
    @Override
    public MyRecyclerHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_recycler_list, parent, false);
        return new MyRecyclerHolder(view);
    }
    //将数据与界面进行绑定的操作
    @Override
    public void onBindViewHolder(MyRecyclerHolder holder, int position) {

        holder.mTitle.setText(mList.get(position).getTitle());
       // holder.mName.setText(mList.get(position).getAVUser("owner") == null ? "" : mList.get(position).getAVUser("owner").getUsername());
        Glide.with(mContext).load(mList.get(position).getImage() == null ? "www" : mList.get(position).getImage().getUrl()).into(holder.mPicture);
        holder.mItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO: 2016-11-09 跳转至item详情页

            }
        });
    }
    //获取数据的数量
    @Override
    public int getItemCount() {

            return mList.size();
    }
    //自定义的ViewHolder，持有每个Item的的所有界面元素
   public class MyRecyclerHolder extends RecyclerView.ViewHolder {
      // private TextView mName;
        private TextView mTitle;
        private CardView mItem;
        private ImageView mPicture;
        public MyRecyclerHolder(View itemView) {
            super(itemView);
            //mName = (TextView) itemView.findViewById(R.id.name_item_recycler);
            mTitle = (TextView) itemView.findViewById(R.id.title_item_recycler);
            mPicture = (ImageView) itemView.findViewById(R.id.picture_item_main);
            mItem = (CardView) itemView.findViewById(R.id.item_recycler);
        }
    }
}
