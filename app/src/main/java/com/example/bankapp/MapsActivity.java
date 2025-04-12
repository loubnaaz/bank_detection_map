package com.example.bankapp;

import androidx.fragment.app.FragmentActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import androidx.appcompat.app.AlertDialog;

import java.util.ArrayList;
import java.util.List;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {
    private GoogleMap mMap;
    private List<Agence> agencesList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_maps);

        setupAgences();


        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    private void setupAgences() {
        agencesList.add(new Agence("Banque Populaire Sidi Moumen", "Rue Al Massira, Casablanca", "M. Ahmed", "0600123456", new LatLng(33.5895, -7.5292)));
        agencesList.add(new Agence("Société Générale Al Hamd", "Bd Mohammed Jamal Addorra, Casablanca", "Mme Khadija", "0600789127", new LatLng(33.5712, -7.5749)));
        agencesList.add(new Agence("Attijariwafa Bank Centre-Ville", "Rue Chaouia, Casablanca", "M. Karim", "0600456789", new LatLng(33.5962, -7.6137)));
        agencesList.add(new Agence("BMCI Anfa", "36 Bd d'Anfa, Casablanca", "Mme Salma", "0601234567", new LatLng(33.5888, -7.6355)));
        agencesList.add(new Agence("CIH Bank Maarif", "Rue El Massira Al Khadra, Casablanca", "M. Youssef", "0602345678", new LatLng(33.5802, -7.6367)));
        agencesList.add(new Agence("Crédit du Maroc Oasis", "Rue El Qods, Casablanca", "Mme Fatima", "0603456789", new LatLng(33.5655, -7.6369)));
        agencesList.add(new Agence("Bank of Africa Aïn Chock", "Bd 2 Mars, Casablanca", "M. Rachid", "0604567890", new LatLng(33.5580, -7.5891)));
        agencesList.add(new Agence("CFG Bank Gauthier", "Rue Taha Hussein, Casablanca", "Mme Leila", "0605678901", new LatLng(33.5893, -7.6284)));
        agencesList.add(new Agence("BMCE Bank Belvédère", "Bd Ba Hmad, Casablanca", "M. Hassan", "0606789012", new LatLng(33.5941, -7.5962)));
        agencesList.add(new Agence("Banque Populaire Bourgogne", "Bd Ghandi, Casablanca", "Mme Nadia", "0607890123", new LatLng(33.5827, -7.6513)));
        agencesList.add(new Agence("Al Barid Bank Hay Hassani", "Rue Ouled Ziane, Casablanca", "M. Omar", "0608901234", new LatLng(33.5543, -7.6685)));
        agencesList.add(new Agence("CIH Bank Californie", "Bd Al Qods, Casablanca", "Mme Amina", "0609012345", new LatLng(33.5422, -7.6011)));
        agencesList.add(new Agence("Société Générale Derb Omar", "Rue Ibn Tachfine, Casablanca", "M. Yassine", "0610123456", new LatLng(33.5930, -7.6088)));
        agencesList.add(new Agence("Banque Populaire Oulfa", "Rue 10 Hay Oulfa, Casablanca", "Mme Samira", "0611234567", new LatLng(33.5380, -7.6432)));
        agencesList.add(new Agence("BMCI Sidi Maarouf", "Bd El Qods, Casablanca", "M. Anas", "0612345678", new LatLng(33.5531, -7.5836)));
        agencesList.add(new Agence("Arab Bank Casa Finance City", "CFC, Casablanca", "Mme Zineb", "0613456789", new LatLng(33.5525, -7.5905)));
        agencesList.add(new Agence("Bank Al Yousr Aïn Sebaa", "Bd Chefchaouni, Casablanca", "M. Mehdi", "0614567890", new LatLng(33.6117, -7.5021)));
        agencesList.add(new Agence("Attijariwafa Bank Hay Mohammadi", "Rue El Fida, Casablanca", "Mme Sanae", "0615678901", new LatLng(33.6033, -7.5890)));
        agencesList.add(new Agence("Umnia Bank Derb Ghallef", "Bd Abdelmoumen, Casablanca", "M. Khalid", "0616789012", new LatLng(33.5848, -7.6252)));
        agencesList.add(new Agence("Banque Populaire Sbata", "Rue Sbata, Casablanca", "Mme Hajar", "0617890123", new LatLng(33.5720, -7.5801)));
        agencesList.add(new Agence("Crédit Agricole Maârif", "Rue Goulmima, Casablanca", "M. Nabil", "0618901234", new LatLng(33.5811, -7.6311)));
        agencesList.add(new Agence("Société Générale Hay Hassani", "Bd 2 Mars, Casablanca", "Mme Imane", "0619012345", new LatLng(33.5547, -7.6483)));
        agencesList.add(new Agence("Bank Assafa El Jadida", "Bd El Jadida, Casablanca", "M. Tarik", "0620123456", new LatLng(33.5783, -7.5859)));
        agencesList.add(new Agence("BMCI Casa Port", "Place Casa Port, Casablanca", "Mme Salwa", "0621234567", new LatLng(33.6060, -7.6140)));
        agencesList.add(new Agence("Banque Populaire El Hank", "Bd de la Corniche, Casablanca", "M. Younes", "0622345678", new LatLng(33.5964, -7.6402)));
        agencesList.add(new Agence("CIH Bank Ain Diab", "Bd de l’Océan Atlantique, Casablanca", "Mme Laila", "0623456789", new LatLng(33.5732, -7.6732)));
        agencesList.add(new Agence("Al Barid Bank Hay Riad", "Rue 9 Hay Riad, Casablanca", "M. Reda", "0624567890", new LatLng(33.6021, -7.5472)));
        agencesList.add(new Agence("Attijariwafa Bank Mers Sultan", "Rue El Mers, Casablanca", "Mme Sofia", "0625678901", new LatLng(33.5881, -7.6062)));
        agencesList.add(new Agence("Bank of Africa Hay Mohammadi", "Rue Jorf, Casablanca", "M. Sami", "0626789012", new LatLng(33.6044, -7.5732)));
        agencesList.add(new Agence("Société Générale Aïn Sebaa", "Bd Ahl Loghlam, Casablanca", "Mme Bahia", "0627890123", new LatLng(33.6222, -7.4833)));


    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;


        for (Agence agence : agencesList) {
            LatLng position = agence.getPosition();
            MarkerOptions markerOptions = new MarkerOptions()
                    .position(position)
                    .title(agence.getNom());

            Marker marker = mMap.addMarker(markerOptions);

            mMap.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {
                @Override
                public boolean onMarkerClick(Marker marker) {
                    Agence clickedAgence = null;
                    for (Agence agence : agencesList) {
                        if (marker.getTitle().equals(agence.getNom())) {
                            clickedAgence = agence;
                            break;
                        }
                    }

                    if (clickedAgence != null) {
                        showAgenceInfo(clickedAgence);
                    }

                    return false;
                }
            });
        }


        LatLng casablanca = new LatLng(33.5731, -7.5898);
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(casablanca, 12f));
    }

    private void showAgenceInfo(Agence agence) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.dialog_agence_info, null);
        builder.setView(dialogView);

        TextView infoText = dialogView.findViewById(R.id.infoText);
        Button btnCall = dialogView.findViewById(R.id.btnCall);
        Button btnSMS = dialogView.findViewById(R.id.btnSMS);
        Button btnEmail = dialogView.findViewById(R.id.btnEmail);
        Button btnFermer = dialogView.findViewById(R.id.btnFermer);

        infoText.setText("Adresse : " + agence.getAdresse() + "\nResponsable : " + agence.getResponsable() +
                "\nTéléphone : " + agence.getTelephone());

        AlertDialog dialog = builder.create();

        btnCall.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:0800123456"));
            startActivity(intent);
        });

        btnSMS.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("sms:0800123456"));
            intent.putExtra("sms_body", "Bonjour, je souhaite poser une question sur l'agence " + agence.getNom());
            startActivity(intent);
        });

        btnEmail.setOnClickListener(v -> {
            String email = "reclamation@banque.com";
            String subject = "Réclamation - Agence " + agence.getNom();
            String message = "Bonjour,\nJe souhaite soumettre une réclamation concernant l'agence " + agence.getNom()
                    + " située à " + agence.getAdresse() + ".";

            Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
            emailIntent.setData(Uri.parse("mailto:" + email));
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, subject);
            emailIntent.putExtra(Intent.EXTRA_TEXT, message);

            if (emailIntent.resolveActivity(getPackageManager()) != null) {
                startActivity(emailIntent);
            } else {
                Toast.makeText(this, "Aucune application e-mail trouvée", Toast.LENGTH_SHORT).show();
            }
        });

        btnFermer.setOnClickListener(v -> dialog.dismiss());

        dialog.show();
    }


}