package br.unc.mobiletrabalhofinal.pages;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

import br.unc.mobiletrabalhofinal.R;
import br.unc.mobiletrabalhofinal.domain.source.AppEvents;

public class ClientActivity extends AppCompatActivity {

    AppEvents appEvents = new AppEvents();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client);

        appEvents.sendScreen(this,"client");
        ActionBar appBar = Objects.requireNonNull(getSupportActionBar());
        appBar.setDisplayHomeAsUpEnabled(true);
        appBar.setTitle(R.string.appbar_client);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        if (item.getItemId() == 16908332){
            onBackPressed();
            return (true);
        }
        return (super.onOptionsItemSelected(item));
    }
}