package ju.com.raqeb.Mentors;

import android.app.Dialog;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import ju.com.raqeb.R;

public class Mentors extends AppCompatActivity {
Button addnewmentor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mentors);

        addnewmentor= findViewById(R.id.addNewMentorBtn);

        addnewmentor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dialog=new Dialog(Mentors.this);
                dialog.setContentView(R.layout.add_mentor_dialog);

                Button submit = dialog.findViewById(R.id.sumbitbtn);
                submit.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(),"submitted ",Toast.LENGTH_LONG).show();
                    }
                });
                dialog.show();

            }
        });


    }
}
