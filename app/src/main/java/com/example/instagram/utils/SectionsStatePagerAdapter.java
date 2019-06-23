package com.example.instagram.utils;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SectionsStatePagerAdapter extends FragmentStatePagerAdapter {

    private final List<Fragment> mFRagmentList = new ArrayList<>();
    private final HashMap<Fragment, Integer> mFragments = new HashMap<>();
    private final HashMap<String, Integer> mFragmentNumbers = new HashMap<>();
    private final HashMap<Integer, String> mFragmentNames = new HashMap<>();


    public SectionsStatePagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return mFRagmentList.get(position);
    }

    @Override
    public int getCount() {
        return mFRagmentList.size();
    }

    public void addFragment(Fragment fragment, String framgmentNames){
        mFRagmentList.add(fragment);
        mFragments.put(fragment, mFRagmentList.size() - 1);
        mFragmentNumbers.put(framgmentNames, mFRagmentList.size() - 1);
        mFragmentNames.put(mFRagmentList.size()-1, framgmentNames);
    }

    /**
     * return the fragment with the name
     * @param fragmentName
     * @return
     */
    public Integer getFragmentNumber(String fragmentName){
        if (mFragmentNumbers.containsKey(fragmentName)){
            return mFragmentNumbers.get(fragmentName);
        }else{
            return null;
        }
    }

    /**
     * return the fragment with the name
     * @param fragment
     * @return
     */
    public Integer getFragmentNumber(Fragment fragment){
        if (mFragmentNumbers.containsKey(fragment)){
            return mFragmentNumbers.get(fragment);
        }else{
            return null;
        }
    }

    /**
     * return the fragment with the name
     * @param fragmentNumber
     * @return
     */
    public String getFragmentName(Integer fragmentNumber){
        if (mFragmentNames.containsKey(fragmentNumber)){
            return mFragmentNames.get(fragmentNumber);
        }else{
            return null;
        }
    }


}
