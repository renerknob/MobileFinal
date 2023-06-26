package br.unc.mobiletrabalhofinal;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import java.util.Objects;

import br.unc.mobiletrabalhofinal.domain.source.AppEvents;
import br.unc.mobiletrabalhofinal.pages.ClientActivity;
import br.unc.mobiletrabalhofinal.pages.ContactActivity;
import br.unc.mobiletrabalhofinal.pages.ServicesActivity;

public class MainActivity extends AppCompatActivity {

    AppEvents appEvents = new AppEvents();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        openClient();
        openContact();
        openServices();

        appEvents.sendScreen(this,"main");
        ActionBar appBar = Objects.requireNonNull(getSupportActionBar());
        appBar.hide();
    }

    void openClient(){
        Bundle bundle = new Bundle ();
        appEvents.globalEvent("main_open_client", bundle);
        ImageView client = findViewById(R.id.btnCliente);
        client.setOnClickListener(
                v-> startActivity(
                        new Intent(
                                this,
                                ClientActivity.class
                        )
                )
        );
    }
    void openContact(){
        Bundle bundle = new Bundle ();
        appEvents.globalEvent("main_open_contact", bundle);
        ImageView contact = findViewById(R.id.btnContact);
        contact.setOnClickListener(
                v-> startActivity(
                        new Intent(
                                this,
                                ContactActivity.class
                        )
                )
        );
    }

    void openServices(){
        ImageView services = findViewById(R.id.btnServices);
        services.setOnClickListener(
                v-> startActivity(
                        new Intent(
                                this,
                                ServicesActivity.class
                        )
                )
        );
    }
}