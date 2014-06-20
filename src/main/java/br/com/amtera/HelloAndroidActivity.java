package br.com.amtera;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.util.MenuFragment;


public class HelloAndroidActivity extends Activity {

    final Logger logger = LoggerFactory.getLogger(HelloAndroidActivity.class);
    private String[] mPlanetTitles;
    private DrawerLayout mDrawerLayout;
    private ListView mDrawerList;

    @Override
    public void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        mPlanetTitles = getResources().getStringArray(R.array.titles);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerList = (ListView) findViewById(R.id.left_drawer);

        // Set the adapter for the list view
        mDrawerList.setAdapter(new ArrayAdapter<String>(this, R.layout.menu, mPlanetTitles));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){

        switch (item.getItemId()) {

            case R.id.action_search:
                logger.info("Destruindo activity");
                finish();
                return true;

            case R.id.action_settings:

                return true;

            case R.id.action_settings2:
                return true;

            case R.id.action_settings3:
                return true;

            case R.id.action_settings4:
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}

