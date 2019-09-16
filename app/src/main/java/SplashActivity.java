import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.criticalroll.MainActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // as soon as THIS Activity loads, we know the APP has loaded, so
        // call for our Main Activity (MovieListActivity, in this case) to load up
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
