package youn0045.kr.hs.emirim.activitytest;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editName, editPhone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button butmain=(Button)findViewById(R.id.but_main);
        butmain.setOnClickListener(butMainHandler);
        editName=(EditText)findViewById(R.id.edit_name);
        editName=(EditText)findViewById(R.id.edit_phone);
    }
    View.OnClickListener butMainHandler=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            String name = editName.getText().toString();
            String phone = editPhone.getText().toString();
            intent.putExtra("name", name);
            intent.putExtra("phone",phone);
            startActivity(intent);
        }
    };
}
