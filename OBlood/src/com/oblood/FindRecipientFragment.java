package com.oblood;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FindRecipientFragment extends Fragment {
	public FindRecipientFragment(){}

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
	        Bundle savedInstanceState) {

	    View rootView = inflater.inflate(R.layout.fragment_find_recipient, container, false);
	      
	    return rootView;
	}
}
