package com.captainkids.captainkids;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Main2Activity extends AppCompatActivity {

    private String[] prenoms = new String[]{
            "École Jules Ferry", "École Victor Hugo", "École Bayard", "École Jean Chaubet", "École Montaudran", "École Ronsard",
            "École Fontaine Bayonne", "École Paul Dottin", "École Pierre Dupont", "École Gaston Dupouy", "École Fabre", "École Lespinasse",
            "École Jules Julien", "École Jean Jaurès", "École Marcel Pagnol", "École Le Pastel",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ListView mListView = (ListView) findViewById(R.id.listView);

        //android.R.layout.simple_list_item_1 est une vue disponible de base dans le SDK android,
        //Contenant une TextView avec comme identifiant "@android:id/text1"

        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(Main2Activity.this,
                android.R.layout.simple_list_item_1, prenoms);
        mListView.setAdapter(adapter);
    }

}
