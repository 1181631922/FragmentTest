package com.example.myfragment;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FirstFragment extends ListFragment {

	private String[] list = { "���ǵ�һ��fragment", "������һ��ListView", "������ͦfree��",
			"��ͨ�����õ����Ӧ", "ʵ�ֱ�ǩЧ��","����Ҳ�ܻ���","�൱��һ��Сactivity" };

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO �Զ����ɵķ������

		ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_list_item_1, list);
		setListAdapter(adapter);
		getListView().setChoiceMode(ListView.CHOICE_MODE_SINGLE);

		super.onActivityCreated(savedInstanceState);
	}
}
