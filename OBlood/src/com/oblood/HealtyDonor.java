package com.oblood;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class HealtyDonor extends Fragment {
	public HealtyDonor(){}
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
	        Bundle savedInstanceState) {

	    View rootView = inflater.inflate(R.layout.fragment_healty_donor, container, false);
	      
	    return rootView;
	}
}
