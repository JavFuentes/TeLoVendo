package com.test.telovendo;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity2 extends AppCompatActivity {
    private int currentImageIndex1 = 0;
    private int currentImageIndex2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        EditText descriptionText = findViewById(R.id.et_description);
        descriptionText.setEnabled(false);

        CircleImageView circleImageView1 = findViewById(R.id.product1);
        circleImageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int[] imageResources = {
                        R.drawable.white1,
                        R.drawable.white2,
                        R.drawable.white3,
                        R.drawable.white4
                };

                currentImageIndex1 = (currentImageIndex1 + 1) % imageResources.length;
                circleImageView1.setImageResource(imageResources[currentImageIndex1]);

                // Cambia el contenido del EditText multilínea
                descriptionText.setText("GLAMIRA Anillo Alonnisos\n" +
                        "$ 510.000\n" +
                        "\n" +
                        "Piedra Central: Zafiro blanco\n" +
                        "Piedras Laterales: Cristal de Swarovski\n" +
                        "Metal/Aleación: Oro Amarillo 375");
            }
        });

        CircleImageView circleImageView2 = findViewById(R.id.product2);
        circleImageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int[] imageResources = {
                        R.drawable.pink1,
                        R.drawable.pink2,
                        R.drawable.pink3,
                        R.drawable.pink4
                };

                currentImageIndex2 = (currentImageIndex2 + 1) % imageResources.length;
                circleImageView2.setImageResource(imageResources[currentImageIndex2]);

                // Cambia el contenido del EditText multilínea
                descriptionText.setText("Glamira Anillo Efrata\n" +
                        "$ 320.000\n" +
                        "\n" +
                        "Piedra Central: Topacio Rosa\n" +
                        "Piedras Laterales: Cristal de Swarovski\n" +
                        "Metal/Aleación: Oro Rosa 375");
            }
        });
    }
}
