package com.rishi.codepath.taskkeeper.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.rishi.codepath.taskkeeper.model.Task;

import java.util.ArrayList;

/**
 * Created by rishi on 3/20/17.
 */

public class RetainedFragment extends Fragment {

    private ArrayList<Task> data;

    // this method is only called once for this fragment
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // retain this fragment
        setRetainInstance(true);
    }

    public void setData(ArrayList<Task> data) {
        this.data = data;
    }

    public ArrayList<Task> getData() {
        return data;
    }
}
