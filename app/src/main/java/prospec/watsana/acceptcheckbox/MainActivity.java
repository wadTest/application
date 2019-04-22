package prospec.watsana.acceptcheckbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.CompoundButton;


public class MainActivity extends AppCompatActivity {

    CheckBox cbAccept;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cbAccept=(CheckBox)findViewById(R.id.cbAccept);
        cbAccept.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                ((Button)findViewById(R.id.btnDownload)).setEnabled(isChecked);
            }

        });

    }

}