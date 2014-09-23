package com.commonsware.empublite;

import android.app.Activity;
import android.app.Fragment;
import android.support.v13.app.FragmentStatePagerAdapter;

public class ContentsAdapter extends FragmentStatePagerAdapter {

  public ContentsAdapter(Activity ctxt) {
    super(ctxt.getFragmentManager());

  }

  @Override
  public Fragment getItem(int position) {

  }

  @Override
  public int getCount() {
    return(contents.getChapterCount());
  }
}