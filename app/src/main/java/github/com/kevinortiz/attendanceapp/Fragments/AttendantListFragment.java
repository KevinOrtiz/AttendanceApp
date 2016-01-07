package github.com.kevinortiz.attendanceapp.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import github.com.kevinortiz.attendanceapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AttendantListFragment extends Fragment {


    public AttendantListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_attendant_list, container, false);
    }

}
