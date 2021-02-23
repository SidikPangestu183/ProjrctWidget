package com.Widget;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class ProjectWidgetActivity extends Activity implements OnClickListener {
    /** Called when the activity is first created. */
	Button btn_Ok, btn_Clear, btn_Exit;
	EditText Edit_Text;
	TextView tv_Hasil;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        btn_Ok = (Button) findViewById (R.id.btnOk);
        btn_Clear = (Button) findViewById (R.id.btnClear);
        btn_Exit = (Button) findViewById (R.id.btnExit);
        Edit_Text = (EditText) findViewById (R.id.editNama);
        tv_Hasil = (TextView) findViewById (R.id.tvHasil);
        
        btn_Ok.setOnClickListener(this);
        btn_Clear.setOnClickListener(this);
        btn_Exit.setOnClickListener(this);
        
    }
    public void onClick(View v) {
    	if (v == btn_Ok){
    		tv_Hasil.setText("Nama Anda Adalah : " + Edit_Text.getText());
    	} else if (v == btn_Clear){
    	Edit_Text.setText("");
    	tv_Hasil.setText("Nama Anda Adalah : ");
    	} else {
    		finish();
    	}
    }
    }
