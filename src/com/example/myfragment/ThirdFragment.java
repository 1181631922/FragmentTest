package com.example.myfragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ThirdFragment extends Fragment{

@Override
public View onCreateView(LayoutInflater inflater, ViewGroup container,
		Bundle savedInstanceState) {
	// TODO 自动生成的方法存根
	TextView tv = new TextView(getActivity());
    tv.setText("这是第三个fragment");
    tv.setTextSize(22);
    ImageView iv = new ImageView(getActivity());
    iv.setBackgroundResource(R.drawable.ic_launcher);
    LinearLayout box = new LinearLayout(getActivity());
    box.addView(iv);
    box.addView(tv);
	return box;
}

}
