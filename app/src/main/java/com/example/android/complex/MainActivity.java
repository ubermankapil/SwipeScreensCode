package com.example.android.complex;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuItem;

;

public class MainActivity extends FragmentActivity {

    ViewPager viewPager=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager= (ViewPager) findViewById(R.id.pager);
        android.support.v4.app.FragmentManager fragmentManager=getSupportFragmentManager();
        viewPager.setAdapter(new MyAdapter(fragmentManager));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
class MyAdapter extends FragmentPagerAdapter
{
    public MyAdapter (FragmentManager fm) {
        super (fm);
    }
    @Override
    public Fragment getItem(int i) {
        Fragment fragment=null;
 //       Log.d("VIVZ", "get Item is called"+i);
        if(i==0)
        {
            fragment=new FragmentA();
        }
        if(i==1)
        {
            fragment=new FragmentB();
        }
        if(i==2)
        {
            fragment=new FragmentC();
        }
        return fragment;

    }

    @Override
    public int getCount() {
 //       Log.d("VIVZ", "get Count is called");
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if(position==0)
        {
            return "Tab 1";
        }
        if(position==1)
        {
            return "Tab 2";
        }
        if(position==2)
        {
            return "Tab 3";
        }
        return null;
    }
}

