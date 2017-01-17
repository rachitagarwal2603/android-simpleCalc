package app.coaching.com.simplecalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button add, sub, mul, div;
    EditText et1, et2;
    TextView tvresult;
    Float num1, num2, result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        add= (Button) findViewById(R.id.bAdd);
        add.setOnClickListener(this);
        sub= (Button) findViewById(R.id.bSub);
        sub.setOnClickListener(this);
        mul= (Button) findViewById(R.id.bMul);
        mul.setOnClickListener(this);
        div= (Button) findViewById(R.id.bDiv);
        div.setOnClickListener(this);

        et1= (EditText) findViewById(R.id.et1);
        et2= (EditText) findViewById(R.id.et2);

        tvresult= (TextView) findViewById(R.id.tvResult);
    }

    @Override
    public void onClick(View v) {
        num1=Float.parseFloat(et1.getText().toString());
        num2=Float.parseFloat(et2.getText().toString());

        if(v==add)
            result=num1+num2;
            else if(v==sub)
                result=num1-num2;
                else if(v==mul)
                    result=num1*num2;
                    else if(v==div)
                        if(num2!=0)
                            result=num1/num2;
        if(v==div && num2==0)
            tvresult.setText("Infinite");
        else
            tvresult.setText(""+result);
    }
}
