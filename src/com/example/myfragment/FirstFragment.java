package com.example.myfragment;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FirstFragment extends ListFragment {

	private String[] list = { "这是第一个fragment", "里面有一个ListView", "看起来挺free的",
			"能通过设置点击响应", "实现标签效果","长了也能滑动","相当于一个小activity" };

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO 自动生成的方法存根

		ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_list_item_1, list);
		setListAdapter(adapter);
		getListView().setChoiceMode(ListView.CHOICE_MODE_SINGLE);

		super.onActivityCreated(savedInstanceState);
	}
}
