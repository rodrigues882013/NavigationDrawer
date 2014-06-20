package br.com.util;

import android.app.Fragment;
import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import java.util.Arrays;
import java.util.List;


/**
 * Created by frodrigues on 6/20/14.
 */
public class MenuFragment extends ListFragment {
    /*@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return null;
    }*/

    @Override
    public void onStart(){
        super.onStart();
        List<String> viagens = Arrays.asList("Campo Grande", "São Paulo", "Miami");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, viagens);
        setListAdapter(adapter);

    }
}