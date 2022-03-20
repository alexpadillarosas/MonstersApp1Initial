package com.blueradix.android.monstersapp1initial.monster.show;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.blueradix.android.monstersapp1initial.databinding.ShowMonstersFragmentBinding;
import com.blueradix.android.monstersapp1initial.monster.Monster;

import java.util.List;

public class ShowMonstersFragment extends Fragment {

    private ShowMonstersViewModel mViewModel;
    private ShowMonstersFragmentBinding binding;

    public static ShowMonstersFragment newInstance() {
        return new ShowMonstersFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = ShowMonstersFragmentBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(ShowMonstersViewModel.class);
        //TODO: configure the Recycler View

        //TODO: set the adapter to the Recycler View

        final Observer<List<Monster>> allMonstersObserver = new Observer<List<Monster>>() {
            @Override
            public void onChanged(List<Monster> monsters) {
                //TODO: set the list of monster to the adapter
            }
        };
        mViewModel.getAllMonsters().observe(getViewLifecycleOwner(), allMonstersObserver);





    }
}