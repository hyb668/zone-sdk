package com.example.mylib_test.activity.utils;

import java.util.ArrayList;
import java.util.List;
import com.example.mylib_test.R;
import com.zone.adapter.adapter.Adapter_Zone;
import com.zone.adapter.adapter.core.ViewHolder_Zone;

import android.app.Activity;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;

public class SoftTestActivity extends Activity{
	private List<Integer> list=new ArrayList<Integer>();
	Integer[] a=new Integer[]{ R.drawable.t0, R.drawable.t0,R.drawable.t0,R.drawable.t0, R.drawable.t0};
//	,R.drawable.t5, R.drawable.t6,R.drawable.t7, R.drawable.t8};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		ListView iv = new ListView(this);
		setContentView(iv);
		for (int i = 0; i < 15; i++) {
			list.add( R.drawable.t0);
		}
		iv.setAdapter(new AdapterMecha(this, list));
//		for (int i = 0; i <=8; i++) {
//			list.add(Bitmap.createBitmap(temp,0,0,temp.getWidth(),temp.getHeight(),null,true));
//		}
		System.out.println("...");
	}
	public class AdapterMecha extends Adapter_Zone<Integer> {
		
		public AdapterMecha(Context context, List<Integer> data) {
			super(context, data);
		}
		

		@Override
		public int setLayoutID() {
			return  R.layout.imageitem;
		}

		@Override
		public void setData(ViewHolder_Zone holder, Integer data, int position) {
			ImageView ivD=(ImageView) holder.findViewById(R.id.iv);
			ivD.setImageBitmap(BitmapFactory.decodeResource(getResources(),data));
		}
		
	}
}
