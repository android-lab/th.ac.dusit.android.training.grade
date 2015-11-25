package android.arit.dusit.ac.th.grade;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public EditText editText;
    public EditText editText2;
    public Button button;
    public TextView textView;
    public int n = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);
        textView = (TextView) findViewById(R.id.textView2);
        button = (Button) findViewById(R.id.button2);


        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String n1 = editText.getText().toString();
                String n2 = editText2.getText().toString();
                Integer mySum = Integer.parseInt(n1) + Integer.parseInt(n2);
              if(mySum>100){
                  textView.setText(mySum +"มากกว่า 100 กรุณากรอกใหม่");
              }else if(mySum>90){
                  textView.setText(mySum +"ได้เกรด B");
              }else if(mySum>70){
                  textView.setText(mySum +"ได้เกรด B");
              }else if(mySum>50){
                  textView.setText(mySum +"ได้เกรด C");
              }else if(mySum<=50){
                  textView.setText(mySum + "ได้เกรด F");
              }

            }
        });



    }
}
