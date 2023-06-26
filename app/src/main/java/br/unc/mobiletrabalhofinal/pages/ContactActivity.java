package br.unc.mobiletrabalhofinal.pages;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

import br.unc.mobiletrabalhofinal.R;
import br.unc.mobiletrabalhofinal.domain.source.AppEvents;
import mehdi.sakout.aboutpage.AboutPage;

public class ContactActivity extends AppCompatActivity {

    AppEvents appEvents = new AppEvents();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        appEvents.sendScreen(this,"contact");
        ActionBar appBar = Objects.requireNonNull(getSupportActionBar());
        appBar.setDisplayHomeAsUpEnabled(true);
        appBar.setTitle(R.string.appbar_contact);

        setContentView(aboutPage());
    }

    View aboutPage() {
        View about = new AboutPage(this)
                .isRTL(false)
                .setDescription("Veja todas as nossas informações de contato")
                .addGroup("Informações de contato")
                .addEmail("FutSports@gmail.com")
                .addWebsite("https://google.com/")
                .addFacebook("FutSports")
                .addInstagram("FutSports")
                .create();
        return about;
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