package victhor.gabriel.streetfighterchampion;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int balrogScore = 0;
    int edScore = 0;
    int bisonScore = 0;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Drawable background = getDrawable(R.drawable.streetfighterb);
        background.setAlpha(80);
        balrogScore();
        edScore();
        bisonScore();
    }
    private void balrogScore(){
        Button balrogWon = findViewById(R.id.balrogWonButton);
        Button balrogLose = findViewById(R.id.balrogLoseButton);

        balrogWon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                balrogScore++;

            }
        });
        balrogLose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                balrogScore--;
            }
        });
    }
    private void edScore(){
        Button edWon = findViewById(R.id.edWonButton);
        Button edLose = findViewById(R.id.edLoseButton);

        edWon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                edScore++;

            }
        });
        edLose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edScore--;
            }
        });
    }
    private void bisonScore(){
        Button bisonWon = findViewById(R.id.bisonWonButton);
        Button bisonLose = findViewById(R.id.bisonLoseButton);

        bisonWon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                bisonScore++;

            }
        });
        bisonLose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bisonScore--;
            }
        });
    }
    private void whoWonButton(){
        Button whoWon = findViewById(R.id.whowon);
        whoWon.setOnClickListener(new View.OnClickListener() {
            TextView whoWonText = findViewById(R.id.whoWonText);

            @Override
            public void onClick(View v) {
                if(balrogScore > edScore && balrogScore > bisonScore){
                    whoWonText.setText("Congradulations, Balrog was the champion");
                }
                else if(edScore > balrogScore && edScore > bisonScore){
                    whoWonText.setText("Congradulations, Ed was the champion");
                }
                else if( bisonScore > balrogScore && bisonScore > edScore){
                    whoWonText.setText("Congradulations, Bison was the champion");
                }

            }
        });
    }
}