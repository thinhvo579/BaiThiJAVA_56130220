package com.example.thinh.a56130220;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.lang.Math;
import java.text.DecimalFormat;
public class MainActivity extends ActionBarActivity implements View.OnClickListener {
    Button btnTinhBMI, btnReset, btnThoat;
    EditText editChieuCao, editCanNang;
    TextView txtChiSo, txtDanhGia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getControlView();
        btnTinhBMI.setOnClickListener(this);
        btnReset.setOnClickListener(this);
        btnThoat.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        try {

            double chieuCao = Double.parseDouble(editChieuCao.getText().toString());
            double canNang = Double.parseDouble(editCanNang.getText().toString());
            DecimalFormat df = new DecimalFormat("0.00");
            double BMI = canNang / Math.pow(chieuCao, 2) * 10000;
            switch (v.getId())
            {
                case R.id.btnTinh:
                    txtChiSo.setText(df.format(BMI) + "");
                    if (BMI < 18)
                        txtDanhGia.setText("Bạn hơi gầy");
                    else if (18 <= BMI && BMI < 24.9)
                        txtDanhGia.setText("Bạn bình thường");
                    else if (24.9 <= BMI && BMI < 29.9)
                        txtDanhGia.setText("Bạn béo phì độ 1");
                    else if (30 <= BMI && BMI < 34.9)
                        txtDanhGia.setText("Bạn béo phì độ 2");
                    else if (35 <= BMI)
                        txtDanhGia.setText("Bạn béo phì độ 3");
                    break;
                case R.id.btnReset:
                    editChieuCao.setText("");
                    editCanNang.setText("");
                    txtChiSo.setText("");
                    txtDanhGia.setText("");
                    break;
                case R.id.btnThoat:
                    finish();
                    System.exit(0);
            }
        } catch (Exception e) {
            Toast.makeText(getBaseContext(), "Bạn chưa nhập dữ liệu", Toast.LENGTH_SHORT).show();
        }
    }
    private void getControlView() {
        btnTinhBMI = (Button) findViewById(R.id.btnTinh);
        editChieuCao = (EditText) findViewById(R.id.edtChieuCao);
        editCanNang = (EditText) findViewById(R.id.edtCanNang);
        txtChiSo = (TextView) findViewById(R.id.txtChiSo);
        txtDanhGia = (TextView) findViewById(R.id.txtDanhGia);
        btnReset = (Button) findViewById(R.id.btnReset);
        btnThoat = (Button) findViewById(R.id.btnThoat);
    }
}
