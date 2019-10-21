package xyz.mmhasanovee.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {



    String [] currency = {"USD","EUR","GBP","AUD","CAD","INR","BDT","JPY"};

    float currency_usd[] = new float[] {.69881f,.61095f,.93188f,.96680f,44.72f,73.14f,80.55f};
    float currency_eur[] = new float[] {1.11089f,0.913548f,1.63346f,1.46681f,77.4423f,93.7858f,118.409f};
    float currency_gbp[] = new float[] {1.21601f,1.09463f,1.78804f,1.60562f,84.7709f,102.661f,129.615f};
    float currency_aud[] = new float[] {0.680080f,0.612196f,0.559270f,0.897976f,47.4098f,57.4153f,72.4896f};
    float currency_cad[] = new float[] {0.757348f,0.681751f,0.622812f,1.11362f,52.7963f,63.9385f,80.7256f};
    float currency_inr[] = new float[] {0.0143447f,0.0129128f,0.0117965f,0.0210927f,0.0189407f,1.21104f,1.52900f};
    float currency_bdt[] = new float[] {0.0118449f,0.0106626f,0.00974079f,0.0174170f,0.0156400f,0.825735f,1.26255f};
    float currency_jpy[] = new float[] {0.00938176f,0.00844529f,0.00771518f,0.0137951f,0.0123876f,0.654022f,0.792048f};

    Spinner spone,sptwo;
    EditText etone,ettwo;
    Button convert,clear,swap;

    int spinneroneposition, spinnertwoposition;
    float converted_result;



    ArrayAdapter<String> adapter1,adapter2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializer();

        spone.setOnItemSelectedListener(this);
        sptwo.setOnItemSelectedListener(this);



        etone=findViewById(R.id.etone);
        ettwo=findViewById(R.id.ettwo);
        clear=findViewById(R.id.clear);
        swap=findViewById(R.id.swap);


        swap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                spone.setSelection(spinnertwoposition);
                sptwo.setSelection(spinneroneposition);
                Toast.makeText(MainActivity.this, "Swapped successfully", Toast.LENGTH_SHORT).show();

            }
        });



        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etone.getText().clear();
                ettwo.getText().clear();
                spone.setSelection(0);
                sptwo.setSelection(6);
                Toast.makeText(MainActivity.this, "All the fields are cleared", Toast.LENGTH_SHORT).show();
            }
        });



        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String etone_input= etone.getText().toString();

                if( TextUtils.isEmpty(etone_input)){

                    Toast.makeText(MainActivity.this, "Please input an amount", Toast.LENGTH_SHORT).show();

                }

                else {


                    int input_value = Integer.parseInt(etone_input);

                    if (spinneroneposition == 0) {

                        if (spinnertwoposition == 0) {


                            converted_result = input_value;

                        } else if (spinnertwoposition == 1) {


                            converted_result = input_value * currency_usd[0];

                        } else if (spinnertwoposition == 2) {


                            converted_result = input_value * currency_usd[1];

                        } else if (spinnertwoposition == 3) {

                            converted_result = input_value * currency_usd[2];
                        } else if (spinnertwoposition == 4) {

                            converted_result = input_value * currency_usd[3];
                        } else if (spinnertwoposition == 5) {

                            converted_result = input_value * currency_usd[4];
                        } else if (spinnertwoposition == 6) {

                            converted_result = input_value * currency_usd[5];
                        } else if (spinnertwoposition == 7) {

                            converted_result = input_value * currency_usd[6];
                        }


                        String numberAsString = Float.toString(converted_result);

                        ettwo.setText(numberAsString + currency[spinnertwoposition]);

                    } else if (spinneroneposition == 1) {

                        if (spinnertwoposition == 0) {

                            converted_result = input_value * currency_eur[0];

                        } else if (spinnertwoposition == 1) {


                            converted_result = input_value;

                        } else if (spinnertwoposition == 2) {


                            converted_result = input_value * currency_eur[1];

                        } else if (spinnertwoposition == 3) {

                            converted_result = input_value * currency_eur[2];
                        } else if (spinnertwoposition == 4) {

                            converted_result = input_value * currency_eur[3];
                        } else if (spinnertwoposition == 5) {

                            converted_result = input_value * currency_eur[4];
                        } else if (spinnertwoposition == 6) {

                            converted_result = input_value * currency_eur[5];
                        } else if (spinnertwoposition == 7) {

                            converted_result = input_value * currency_eur[6];
                        }


                        String numberAsString = Float.toString(converted_result);

                        ettwo.setText(numberAsString + currency[spinnertwoposition]);

                    } else if (spinneroneposition == 2) {

                        if (spinnertwoposition == 0) {

                            converted_result = input_value * currency_gbp[0];

                        } else if (spinnertwoposition == 1) {


                            converted_result = input_value * currency_gbp[1];

                        } else if (spinnertwoposition == 2) {


                            converted_result = input_value;

                        } else if (spinnertwoposition == 3) {

                            converted_result = input_value * currency_gbp[2];
                        } else if (spinnertwoposition == 4) {

                            converted_result = input_value * currency_gbp[3];
                        } else if (spinnertwoposition == 5) {

                            converted_result = input_value * currency_gbp[4];
                        } else if (spinnertwoposition == 6) {

                            converted_result = input_value * currency_gbp[5];
                        } else if (spinnertwoposition == 7) {

                            converted_result = input_value * currency_gbp[6];
                        }


                        String numberAsString = Float.toString(converted_result);

                        ettwo.setText(numberAsString + currency[spinnertwoposition]);

                    } else if (spinneroneposition == 3) {

                        if (spinnertwoposition == 0) {

                            converted_result = input_value * currency_aud[0];

                        } else if (spinnertwoposition == 1) {


                            converted_result = input_value * currency_aud[1];

                        } else if (spinnertwoposition == 2) {


                            converted_result = input_value * currency_aud[2];

                        } else if (spinnertwoposition == 3) {

                            converted_result = input_value;
                        } else if (spinnertwoposition == 4) {

                            converted_result = input_value * currency_aud[3];
                        } else if (spinnertwoposition == 5) {

                            converted_result = input_value * currency_aud[4];
                        } else if (spinnertwoposition == 6) {

                            converted_result = input_value * currency_aud[5];
                        } else if (spinnertwoposition == 7) {

                            converted_result = input_value * currency_aud[6];
                        }


                        String numberAsString = Float.toString(converted_result);

                        ettwo.setText(numberAsString + currency[spinnertwoposition]);

                    } else if (spinneroneposition == 4) {

                        if (spinnertwoposition == 0) {

                            converted_result = input_value * currency_cad[0];

                        } else if (spinnertwoposition == 1) {


                            converted_result = input_value * currency_cad[1];

                        } else if (spinnertwoposition == 2) {


                            converted_result = input_value * currency_cad[2];

                        } else if (spinnertwoposition == 3) {

                            converted_result = input_value * currency_cad[3];
                        } else if (spinnertwoposition == 4) {

                            converted_result = input_value;
                        } else if (spinnertwoposition == 5) {

                            converted_result = input_value * currency_cad[4];
                        } else if (spinnertwoposition == 6) {

                            converted_result = input_value * currency_cad[5];
                        } else if (spinnertwoposition == 7) {

                            converted_result = input_value * currency_cad[6];
                        }


                        String numberAsString = Float.toString(converted_result);

                        ettwo.setText(numberAsString + currency[spinnertwoposition]);

                    } else if (spinneroneposition == 5) {

                        if (spinnertwoposition == 0) {

                            converted_result = input_value * currency_inr[0];

                        } else if (spinnertwoposition == 1) {


                            converted_result = input_value * currency_inr[1];

                        } else if (spinnertwoposition == 2) {


                            converted_result = input_value * currency_inr[2];

                        } else if (spinnertwoposition == 3) {

                            converted_result = input_value * currency_inr[3];
                        } else if (spinnertwoposition == 4) {

                            converted_result = input_value * currency_inr[4];
                        } else if (spinnertwoposition == 5) {

                            converted_result = input_value;
                        } else if (spinnertwoposition == 6) {

                            converted_result = input_value * currency_inr[5];
                        } else if (spinnertwoposition == 7) {

                            converted_result = input_value * currency_inr[6];
                        }


                        String numberAsString = Float.toString(converted_result);

                        ettwo.setText(numberAsString + currency[spinnertwoposition]);

                    } else if (spinneroneposition == 6) {

                        if (spinnertwoposition == 0) {

                            converted_result = input_value * currency_bdt[0];

                        } else if (spinnertwoposition == 1) {


                            converted_result = input_value * currency_bdt[1];

                        } else if (spinnertwoposition == 2) {


                            converted_result = input_value * currency_bdt[2];

                        } else if (spinnertwoposition == 3) {

                            converted_result = input_value * currency_bdt[3];
                        } else if (spinnertwoposition == 4) {

                            converted_result = input_value * currency_bdt[4];
                        } else if (spinnertwoposition == 5) {

                            converted_result = input_value * currency_bdt[5];
                        } else if (spinnertwoposition == 6) {

                            converted_result = input_value;
                        } else if (spinnertwoposition == 7) {

                            converted_result = input_value * currency_bdt[6];
                        }


                        String numberAsString = Float.toString(converted_result);

                        ettwo.setText(numberAsString + currency[spinnertwoposition]);

                    } else if (spinneroneposition == 7) {

                        if (spinnertwoposition == 0) {

                            converted_result = input_value * currency_jpy[0];

                        } else if (spinnertwoposition == 1) {


                            converted_result = input_value * currency_jpy[1];

                        } else if (spinnertwoposition == 2) {


                            converted_result = input_value * currency_jpy[2];

                        } else if (spinnertwoposition == 3) {

                            converted_result = input_value * currency_jpy[3];
                        } else if (spinnertwoposition == 4) {

                            converted_result = input_value * currency_jpy[4];
                        } else if (spinnertwoposition == 5) {

                            converted_result = input_value * currency_jpy[5];
                        } else if (spinnertwoposition == 6) {

                            converted_result = input_value * currency_jpy[6];
                        } else if (spinnertwoposition == 7) {

                            converted_result = input_value;
                        }


                        String numberAsString = Float.toString(converted_result);

                        ettwo.setText(numberAsString + currency[spinnertwoposition]);

                    }


                }

            }
        });
    }


    private void initializer(){

        spone=findViewById(R.id.spone);
        sptwo=findViewById(R.id.sptwo);

        convert=findViewById(R.id.convert);



        adapter1=new ArrayAdapter<>(this,android.R.layout.simple_spinner_item,currency);
        adapter2=new ArrayAdapter<>(this,android.R.layout.simple_spinner_item,currency);


        spone.setAdapter(adapter1);
        sptwo.setAdapter(adapter2);
        sptwo.setSelection(6);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {




        if(parent.getId()==R.id.spone){

            
            spinneroneposition=position;


            //Toast.makeText(this, "Sp one is selected"+spinneroneposition, Toast.LENGTH_SHORT).show();

        }

        else if(parent.getId()==R.id.sptwo){
            spinnertwoposition=position;


            //Toast.makeText(this, "Sp two is selected"+spinnertwoposition, Toast.LENGTH_SHORT).show();

        }




    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
