package com.example.taomanhinhtinhbmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edCao, edNang;
    RadioButton rbNam, rbNu;
    Button btnTinhBmi;
    TextView tvBmi, tvNXet;
    double chiSo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edCao = findViewById(R.id.txtHight);
        edNang = findViewById(R.id.txtWeight);
        rbNam = findViewById(R.id.rb_Nam);
        rbNu = findViewById(R.id.rb_Nu);
        btnTinhBmi = findViewById(R.id.btnTinh);
        tvBmi = findViewById(R.id.viewBmi);
        tvNXet = findViewById(R.id.viewCom);

        btnTinhBmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double chieuCao = Double.parseDouble(edCao.getText().toString()) / 100;
                double canNang = Double.parseDouble(edNang.getText().toString());
                chiSo = Math.round(canNang/Math.pow(chieuCao,2)*10.0) / 10.0;
                if (rbNam.isChecked()){
                    if (chiSo < 18.5 ){
                        tvBmi.setText(String.valueOf(chiSo));
                        tvNXet.setText("Bạn cần bổ sung thêm dinh dưỡng");
                    }
                    else if (chiSo >= 18.5 && chiSo <= 24.9 ){
                        tvBmi.setText(String.valueOf(chiSo));
                        tvNXet.setText("Bạn có chỉ số BMI bình thường");
                    }
                    else if (chiSo == 25 ){
                        tvBmi.setText(String.valueOf(chiSo));
                        tvNXet.setText("Bạn đang bị thừa cân");
                    }
                    else if (chiSo > 25 && chiSo <= 29.9 ){
                        tvBmi.setText(String.valueOf(chiSo));
                        tvNXet.setText("Bạn đang bị thừa cân");
                    }
                    else if (chiSo >= 30 && chiSo <= 34.5){
                        tvBmi.setText(String.valueOf(chiSo));
                        tvNXet.setText("Bạn đang béo phì độ I");
                    }
                    else if (chiSo >= 35 && chiSo <= 39.9 ){
                        tvBmi.setText(String.valueOf(chiSo));
                        tvNXet.setText("Bạn đang béo phì độ II");
                    }
                    else if (chiSo == 40 ){
                        tvBmi.setText(String.valueOf(chiSo));
                        tvNXet.setText("Bạn đang béo phì độ III");
                    }
                }
                else if (rbNu.isChecked()){
                    if (chiSo < 18.5 ){
                        tvBmi.setText(String.valueOf(chiSo));
                        tvNXet.setText("Bạn cần bổ sung thêm dinh dưỡng");
                    }
                    else if (chiSo >= 18.5 && chiSo <= 22.9 ){
                        tvBmi.setText(String.valueOf(chiSo));
                        tvNXet.setText("Bạn có chỉ số BMI bình thường");
                    }
                    else if (chiSo == 23 ){
                        tvBmi.setText(String.valueOf(chiSo));
                        tvNXet.setText("Bạn đang bị thừa cân");
                    }
                    else if (chiSo > 23 && chiSo <= 24.9 ){
                        tvBmi.setText(String.valueOf(chiSo));
                        tvNXet.setText("Bạn đang bị thừa cân");
                    }
                    else if (chiSo >= 25 && chiSo <= 29.9){
                        tvBmi.setText(String.valueOf(chiSo));
                        tvNXet.setText("Bạn đang béo phì độ I");
                    }
                    else if (chiSo >= 30 && chiSo <= 39.9 ){
                        tvBmi.setText(String.valueOf(chiSo));
                        tvNXet.setText("Bạn đang béo phì độ II");
                    }
                    else if (chiSo == 40 ){
                        tvBmi.setText(String.valueOf(chiSo));
                        tvNXet.setText("Bạn đang béo phì độ III");
                    }
                }
                else {
                    Toast.makeText(getApplicationContext(),"Vui lòng chọn giới tính!",
                            Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}