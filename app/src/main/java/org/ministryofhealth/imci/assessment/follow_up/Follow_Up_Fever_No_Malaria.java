package org.ministryofhealth.imci.assessment.follow_up;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.ministryofhealth.imci.R;


public class Follow_Up_Fever_No_Malaria extends Fragment{
	

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater
				.inflate(R.layout.follow_up_fevernomalaria, container, false);
		

		return rootView;
	}

}