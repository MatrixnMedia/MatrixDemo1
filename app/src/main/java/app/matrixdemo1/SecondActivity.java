package app.matrixdemo1;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by parna on 20/1/16.
 */
public class SecondActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondactivity);
        Log.d("d", "Parna Second activity line no 15");
        Log.e("Hello","I am in second activity");
    }
}
