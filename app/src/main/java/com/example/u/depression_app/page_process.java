package com.example.u.depression_app;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class page_process extends AppCompatActivity {
    RadioGroup radioSexGroup;
    int total = 0;
    TextView Tmsg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.process_page);

        final EditText ed1 = (EditText) findViewById(R.id.ed1);
        ed1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(page_process.this, R.style.AppCompatAlertDialogStyle);
                LayoutInflater inflater = page_process.this.getLayoutInflater();
                final View dialogView = inflater.inflate(R.layout.custom_radio, null);
                dialogBuilder.setView(dialogView);
                radioSexGroup = (RadioGroup) dialogView.findViewById(R.id.radioSex);

                radioSexGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        switch (checkedId) {
                            case R.id.one:
                                ed1.setText("1");
                                total = total + 1;
                                break;

                            case R.id.two:
                                ed1.setText("2");
                                total = total + 2;
                                break;

                            case R.id.three:
                                ed1.setText("3");
                                total = total + 3;
                                break;
                            case R.id.four:
                                ed1.setText("4");
                                total = total + 4;
                                break;
                            case R.id.five:
                                ed1.setText("5");
                                total = total + 5;
                                break;

                        }
                    }
                });

                dialogBuilder.setTitle("আপনার সম্ভাব্য ৫টি থেকে যেকোনো একটি বেছে নিন ।");

                dialogBuilder.setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {


                    }
                });


                dialogBuilder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        //pass
                    }
                });

                AlertDialog b = dialogBuilder.create();
                b.show();
            }
        });


        final EditText ed2 = (EditText) findViewById(R.id.ed2);
        ed2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(page_process.this,R.style.AppCompatAlertDialogStyle);
                LayoutInflater inflater = page_process.this.getLayoutInflater();
                final View dialogView = inflater.inflate(R.layout.custom_radio, null);
                dialogBuilder.setView(dialogView);
                radioSexGroup = (RadioGroup) dialogView.findViewById(R.id.radioSex);

                radioSexGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        switch (checkedId) {
                            case R.id.one:
                                ed2.setText("1");
                                total = total + 1;
                                break;

                            case R.id.two:
                                ed2.setText("2");
                                total = total + 2;
                                break;

                            case R.id.three:
                                ed2.setText("3");
                                total = total+3;
                                break;
                            case R.id.four:
                                ed2.setText("4");
                                total = total+4;
                                break;
                            case R.id.five:
                                ed2.setText("5");
                                total = total+5;
                                break;

                        }
                    }
                });

                dialogBuilder.setTitle("আপনার সম্ভাব্য ৫টি থেকে যেকোনো একটি বেছে নিন ।");

                dialogBuilder.setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {


                    }
                });


                dialogBuilder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        //pass
                    }
                });

                AlertDialog b = dialogBuilder.create();
                b.show();
            }
        });


        final EditText ed3 = (EditText) findViewById(R.id.ed3);
        ed3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(page_process.this,R.style.AppCompatAlertDialogStyle);
                LayoutInflater inflater = page_process.this.getLayoutInflater();
                final View dialogView = inflater.inflate(R.layout.custom_radio, null);
                dialogBuilder.setView(dialogView);
                radioSexGroup = (RadioGroup) dialogView.findViewById(R.id.radioSex);

                radioSexGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        switch (checkedId) {
                            case R.id.one:
                                ed3.setText("1");
                                total = total + 1;
                                break;

                            case R.id.two:
                                ed3.setText("2");
                                total = total + 2;
                                break;

                            case R.id.three:
                                ed3.setText("3");
                                total = total+3;
                                break;
                            case R.id.four:
                                ed3.setText("4");
                                total = total+4;
                                break;
                            case R.id.five:
                                ed3.setText("5");
                                total = total+5;
                                break;

                        }
                    }
                });

                dialogBuilder.setTitle("আপনার সম্ভাব্য ৫টি থেকে যেকোনো একটি বেছে নিন ।");

                dialogBuilder.setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {


                    }
                });


                dialogBuilder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        //pass
                    }
                });

                AlertDialog b = dialogBuilder.create();
                b.show();
            }
        });


        final EditText ed4 = (EditText) findViewById(R.id.ed4);
        ed4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(page_process.this,R.style.AppCompatAlertDialogStyle);
                LayoutInflater inflater = page_process.this.getLayoutInflater();
                final View dialogView = inflater.inflate(R.layout.custom_radio, null);
                dialogBuilder.setView(dialogView);
                radioSexGroup = (RadioGroup) dialogView.findViewById(R.id.radioSex);

                radioSexGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        switch (checkedId) {
                            case R.id.one:
                                ed4.setText("1");
                                total = total + 1;
                                break;

                            case R.id.two:
                                ed4.setText("2");
                                total = total + 2;
                                break;

                            case R.id.three:
                                ed4.setText("3");
                                total = total+3;
                                break;
                            case R.id.four:
                                ed4.setText("4");
                                total = total+4;
                                break;
                            case R.id.five:
                                ed4.setText("5");
                                total = total+5;
                                break;

                        }
                    }
                });

                dialogBuilder.setTitle("আপনার সম্ভাব্য ৫টি থেকে যেকোনো একটি বেছে নিন ।");

                dialogBuilder.setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {


                    }
                });


                dialogBuilder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        //pass
                    }
                });

                AlertDialog b = dialogBuilder.create();
                b.show();
            }
        });


        final EditText ed5 = (EditText) findViewById(R.id.ed5);
        ed5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(page_process.this,R.style.AppCompatAlertDialogStyle);
                LayoutInflater inflater = page_process.this.getLayoutInflater();
                final View dialogView = inflater.inflate(R.layout.custom_radio, null);
                dialogBuilder.setView(dialogView);
                radioSexGroup = (RadioGroup) dialogView.findViewById(R.id.radioSex);

                radioSexGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        switch (checkedId) {
                            case R.id.one:
                                ed5.setText("1");
                                total = total + 1;
                                break;

                            case R.id.two:
                                ed5.setText("2");
                                total = total + 2;
                                break;

                            case R.id.three:
                                ed5.setText("3");
                                total = total+3;
                                break;
                            case R.id.four:
                                ed5.setText("4");
                                total = total+4;
                                break;
                            case R.id.five:
                                ed5.setText("5");
                                total = total+5;
                                break;

                        }
                    }
                });

                dialogBuilder.setTitle("আপনার সম্ভাব্য ৫টি থেকে যেকোনো একটি বেছে নিন ।");

                dialogBuilder.setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {


                    }
                });


                dialogBuilder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        //pass
                    }
                });

                AlertDialog b = dialogBuilder.create();
                b.show();
            }
        });


        final EditText ed6 = (EditText) findViewById(R.id.ed6);
        ed6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(page_process.this,R.style.AppCompatAlertDialogStyle);
                LayoutInflater inflater = page_process.this.getLayoutInflater();
                final View dialogView = inflater.inflate(R.layout.custom_radio, null);
                dialogBuilder.setView(dialogView);
                radioSexGroup = (RadioGroup) dialogView.findViewById(R.id.radioSex);

                radioSexGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        switch (checkedId) {
                            case R.id.one:
                                ed6.setText("1");
                                total = total + 1;
                                break;

                            case R.id.two:
                                ed6.setText("2");
                                total = total + 2;
                                break;

                            case R.id.three:
                                ed6.setText("3");
                                total = total+3;
                                break;
                            case R.id.four:
                                ed6.setText("4");
                                total = total+4;
                                break;
                            case R.id.five:
                                ed6.setText("5");
                                total = total+5;
                                break;

                        }
                    }
                });

                dialogBuilder.setTitle("আপনার সম্ভাব্য ৫টি থেকে যেকোনো একটি বেছে নিন ।");

                dialogBuilder.setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {


                    }
                });


                dialogBuilder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        //pass
                    }
                });

                AlertDialog b = dialogBuilder.create();
                b.show();
            }
        });


        final EditText ed7 = (EditText) findViewById(R.id.ed7);
        ed7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(page_process.this,R.style.AppCompatAlertDialogStyle);
                LayoutInflater inflater = page_process.this.getLayoutInflater();
                final View dialogView = inflater.inflate(R.layout.custom_radio, null);
                dialogBuilder.setView(dialogView);
                radioSexGroup = (RadioGroup) dialogView.findViewById(R.id.radioSex);

                radioSexGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        switch (checkedId) {
                            case R.id.one:
                                ed7.setText("1");
                                total = total + 1;
                                break;

                            case R.id.two:
                                ed7.setText("2");
                                total = total + 2;
                                break;

                            case R.id.three:
                                ed7.setText("3");
                                total = total+3;
                                break;
                            case R.id.four:
                                ed7.setText("4");
                                total = total+4;
                                break;
                            case R.id.five:
                                ed7.setText("5");
                                total = total+5;
                                break;

                        }
                    }
                });

                dialogBuilder.setTitle("আপনার সম্ভাব্য ৫টি থেকে যেকোনো একটি বেছে নিন ।");

                dialogBuilder.setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {


                    }
                });


                dialogBuilder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        //pass
                    }
                });

                AlertDialog b = dialogBuilder.create();
                b.show();
            }
        });


        final EditText ed8 = (EditText) findViewById(R.id.ed8);
        ed8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(page_process.this,R.style.AppCompatAlertDialogStyle);
                LayoutInflater inflater = page_process.this.getLayoutInflater();
                final View dialogView = inflater.inflate(R.layout.custom_radio, null);
                dialogBuilder.setView(dialogView);
                radioSexGroup = (RadioGroup) dialogView.findViewById(R.id.radioSex);

                radioSexGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        switch (checkedId) {
                            case R.id.one:
                                ed8.setText("1");
                                total = total + 1;
                                break;

                            case R.id.two:
                                ed8.setText("2");
                                total = total + 2;
                                break;

                            case R.id.three:
                                ed8.setText("3");
                                total = total+3;
                                break;
                            case R.id.four:
                                ed8.setText("4");
                                total = total+4;
                                break;
                            case R.id.five:
                                ed8.setText("5");
                                total = total+5;
                                break;

                        }
                    }
                });

                dialogBuilder.setTitle("আপনার সম্ভাব্য ৫টি থেকে যেকোনো একটি বেছে নিন ।");

                dialogBuilder.setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {


                    }
                });


                dialogBuilder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        //pass
                    }
                });

                AlertDialog b = dialogBuilder.create();
                b.show();
            }
        });


        final EditText ed9 = (EditText) findViewById(R.id.ed9);
        ed9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(page_process.this,R.style.AppCompatAlertDialogStyle);
                LayoutInflater inflater = page_process.this.getLayoutInflater();
                final View dialogView = inflater.inflate(R.layout.custom_radio, null);
                dialogBuilder.setView(dialogView);
                radioSexGroup = (RadioGroup) dialogView.findViewById(R.id.radioSex);

                radioSexGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        switch (checkedId) {
                            case R.id.one:
                                ed9.setText("1");
                                total = total + 1;
                                break;

                            case R.id.two:
                                ed9.setText("2");
                                total = total + 2;
                                break;

                            case R.id.three:
                                ed9.setText("3");
                                total = total+3;
                                break;
                            case R.id.four:
                                ed9.setText("4");
                                total = total+4;
                                break;
                            case R.id.five:
                                ed9.setText("5");
                                total = total+5;
                                break;

                        }
                    }
                });

                dialogBuilder.setTitle("আপনার সম্ভাব্য ৫টি থেকে যেকোনো একটি বেছে নিন ।");

                dialogBuilder.setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {


                    }
                });


                dialogBuilder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        //pass
                    }
                });

                AlertDialog b = dialogBuilder.create();
                b.show();
            }
        });


        final EditText ed10 = (EditText) findViewById(R.id.ed10);
        ed10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(page_process.this,R.style.AppCompatAlertDialogStyle);
                LayoutInflater inflater = page_process.this.getLayoutInflater();
                final View dialogView = inflater.inflate(R.layout.custom_radio, null);
                dialogBuilder.setView(dialogView);
                radioSexGroup = (RadioGroup) dialogView.findViewById(R.id.radioSex);

                radioSexGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        switch (checkedId) {
                            case R.id.one:
                                ed10.setText("1");
                                total = total + 1;
                                break;

                            case R.id.two:
                                ed10.setText("2");
                                total = total + 2;
                                break;

                            case R.id.three:
                                ed10.setText("3");
                                total = total+3;
                                break;
                            case R.id.four:
                                ed10.setText("4");
                                total = total+4;
                                break;
                            case R.id.five:
                                ed10.setText("5");
                                total = total+5;
                                break;

                        }
                    }
                });

                dialogBuilder.setTitle("আপনার সম্ভাব্য ৫টি থেকে যেকোনো একটি বেছে নিন ।");

                dialogBuilder.setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {


                    }
                });


                dialogBuilder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        //pass
                    }
                });

                AlertDialog b = dialogBuilder.create();
                b.show();
            }
        });


        final EditText ed11 = (EditText) findViewById(R.id.ed11);
        ed11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(page_process.this,R.style.AppCompatAlertDialogStyle);
                LayoutInflater inflater = page_process.this.getLayoutInflater();
                final View dialogView = inflater.inflate(R.layout.custom_radio, null);
                dialogBuilder.setView(dialogView);
                radioSexGroup = (RadioGroup) dialogView.findViewById(R.id.radioSex);

                radioSexGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        switch (checkedId) {
                            case R.id.one:
                                ed11.setText("1");
                                total = total + 1;
                                break;

                            case R.id.two:
                                ed11.setText("2");
                                total = total + 2;
                                break;

                            case R.id.three:
                                ed11.setText("3");
                                total = total+3;
                                break;
                            case R.id.four:
                                ed11.setText("4");
                                total = total+4;
                                break;
                            case R.id.five:
                                ed11.setText("5");
                                total = total+5;
                                break;

                        }
                    }
                });

                dialogBuilder.setTitle("আপনার সম্ভাব্য ৫টি থেকে যেকোনো একটি বেছে নিন ।");

                dialogBuilder.setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {


                    }
                });


                dialogBuilder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        //pass
                    }
                });

                AlertDialog b = dialogBuilder.create();
                b.show();
            }
        });


        final EditText ed12 = (EditText) findViewById(R.id.ed12);
        ed12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(page_process.this,R.style.AppCompatAlertDialogStyle);
                LayoutInflater inflater = page_process.this.getLayoutInflater();
                final View dialogView = inflater.inflate(R.layout.custom_radio, null);
                dialogBuilder.setView(dialogView);
                radioSexGroup = (RadioGroup) dialogView.findViewById(R.id.radioSex);

                radioSexGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        switch (checkedId) {
                            case R.id.one:
                                ed12.setText("1");
                                total = total + 1;
                                break;

                            case R.id.two:
                                ed12.setText("2");
                                total = total + 2;
                                break;

                            case R.id.three:
                                ed12.setText("3");
                                total = total+3;
                                break;
                            case R.id.four:
                                ed12.setText("4");
                                total = total+4;
                                break;
                            case R.id.five:
                                ed12.setText("5");
                                total = total+5;
                                break;

                        }
                    }
                });

                dialogBuilder.setTitle("আপনার সম্ভাব্য ৫টি থেকে যেকোনো একটি বেছে নিন ।");

                dialogBuilder.setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {


                    }
                });


                dialogBuilder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        //pass
                    }
                });

                AlertDialog b = dialogBuilder.create();
                b.show();
            }
        });


        final EditText ed13 = (EditText) findViewById(R.id.ed13);
        ed13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(page_process.this,R.style.AppCompatAlertDialogStyle);
                LayoutInflater inflater = page_process.this.getLayoutInflater();
                final View dialogView = inflater.inflate(R.layout.custom_radio, null);
                dialogBuilder.setView(dialogView);
                radioSexGroup = (RadioGroup) dialogView.findViewById(R.id.radioSex);

                radioSexGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        switch (checkedId) {
                            case R.id.one:
                                ed13.setText("1");
                                total = total + 1;
                                break;

                            case R.id.two:
                                ed13.setText("2");
                                total = total + 2;
                                break;

                            case R.id.three:
                                ed13.setText("3");
                                total = total+3;
                                break;
                            case R.id.four:
                                ed13.setText("4");
                                total = total+4;
                                break;
                            case R.id.five:
                                ed13.setText("5");
                                total = total+5;
                                break;

                        }
                    }
                });

                dialogBuilder.setTitle("আপনার সম্ভাব্য ৫টি থেকে যেকোনো একটি বেছে নিন ।");

                dialogBuilder.setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {


                    }
                });


                dialogBuilder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        //pass
                    }
                });

                AlertDialog b = dialogBuilder.create();
                b.show();
            }
        });


        final EditText ed14 = (EditText) findViewById(R.id.ed14);
        ed14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(page_process.this,R.style.AppCompatAlertDialogStyle);
                LayoutInflater inflater = page_process.this.getLayoutInflater();
                final View dialogView = inflater.inflate(R.layout.custom_radio, null);
                dialogBuilder.setView(dialogView);
                radioSexGroup = (RadioGroup) dialogView.findViewById(R.id.radioSex);

                radioSexGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        switch (checkedId) {
                            case R.id.one:
                                ed14.setText("1");
                                total = total + 1;
                                break;

                            case R.id.two:
                                ed14.setText("2");
                                total = total + 2;
                                break;

                            case R.id.three:
                                ed14.setText("3");
                                total = total+3;
                                break;
                            case R.id.four:
                                ed14.setText("4");
                                total = total+4;
                                break;
                            case R.id.five:
                                ed14.setText("5");
                                total = total+5;
                                break;

                        }
                    }
                });

                dialogBuilder.setTitle("আপনার সম্ভাব্য ৫টি থেকে যেকোনো একটি বেছে নিন ।");

                dialogBuilder.setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {


                    }
                });


                dialogBuilder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        //pass
                    }
                });

                AlertDialog b = dialogBuilder.create();
                b.show();
            }
        });


        final EditText ed15 = (EditText) findViewById(R.id.ed15);
        ed15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(page_process.this,R.style.AppCompatAlertDialogStyle);
                LayoutInflater inflater = page_process.this.getLayoutInflater();
                final View dialogView = inflater.inflate(R.layout.custom_radio, null);
                dialogBuilder.setView(dialogView);
                radioSexGroup = (RadioGroup) dialogView.findViewById(R.id.radioSex);

                radioSexGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        switch (checkedId) {
                            case R.id.one:
                                ed15.setText("1");
                                total = total + 1;
                                break;

                            case R.id.two:
                                ed15.setText("2");
                                total = total + 2;
                                break;

                            case R.id.three:
                                ed15.setText("3");
                                total = total+3;
                                break;
                            case R.id.four:
                                ed15.setText("4");
                                total = total+4;
                                break;
                            case R.id.five:
                                ed15.setText("5");
                                total = total+5;
                                break;

                        }
                    }
                });

                dialogBuilder.setTitle("আপনার সম্ভাব্য ৫টি থেকে যেকোনো একটি বেছে নিন ।");

                dialogBuilder.setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {


                    }
                });


                dialogBuilder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        //pass
                    }
                });

                AlertDialog b = dialogBuilder.create();
                b.show();
            }
        });


        final EditText ed16 = (EditText) findViewById(R.id.ed16);
        ed16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(page_process.this,R.style.AppCompatAlertDialogStyle);
                LayoutInflater inflater = page_process.this.getLayoutInflater();
                final View dialogView = inflater.inflate(R.layout.custom_radio, null);
                dialogBuilder.setView(dialogView);
                radioSexGroup = (RadioGroup) dialogView.findViewById(R.id.radioSex);

                radioSexGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        switch (checkedId) {
                            case R.id.one:
                                ed16.setText("1");
                                total = total + 1;
                                break;

                            case R.id.two:
                                ed16.setText("2");
                                total = total + 2;
                                break;

                            case R.id.three:
                                ed16.setText("3");
                                total = total+3;
                                break;
                            case R.id.four:
                                ed16.setText("4");
                                total = total+4;
                                break;
                            case R.id.five:
                                ed16.setText("5");
                                total = total+5;
                                break;

                        }
                    }
                });

                dialogBuilder.setTitle("আপনার সম্ভাব্য ৫টি থেকে যেকোনো একটি বেছে নিন ।");

                dialogBuilder.setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {


                    }
                });


                dialogBuilder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        //pass
                    }
                });

                AlertDialog b = dialogBuilder.create();
                b.show();
            }
        });


        final EditText ed17 = (EditText) findViewById(R.id.ed17);
        ed17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(page_process.this,R.style.AppCompatAlertDialogStyle);
                LayoutInflater inflater = page_process.this.getLayoutInflater();
                final View dialogView = inflater.inflate(R.layout.custom_radio, null);
                dialogBuilder.setView(dialogView);
                radioSexGroup = (RadioGroup) dialogView.findViewById(R.id.radioSex);

                radioSexGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        switch (checkedId) {
                            case R.id.one:
                                ed17.setText("1");
                                total = total + 1;
                                break;

                            case R.id.two:
                                ed17.setText("2");
                                total = total + 2;
                                break;

                            case R.id.three:
                                ed17.setText("3");
                                total = total+3;
                                break;
                            case R.id.four:
                                ed17.setText("4");
                                total = total+4;
                                break;
                            case R.id.five:
                                ed17.setText("5");
                                total = total+5;
                                break;

                        }
                    }
                });

                dialogBuilder.setTitle("আপনার সম্ভাব্য ৫টি থেকে যেকোনো একটি বেছে নিন ।");

                dialogBuilder.setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {


                    }
                });


                dialogBuilder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        //pass
                    }
                });

                AlertDialog b = dialogBuilder.create();
                b.show();
            }
        });


        final EditText ed18 = (EditText) findViewById(R.id.ed18);
        ed18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(page_process.this,R.style.AppCompatAlertDialogStyle);
                LayoutInflater inflater = page_process.this.getLayoutInflater();
                final View dialogView = inflater.inflate(R.layout.custom_radio, null);
                dialogBuilder.setView(dialogView);
                radioSexGroup = (RadioGroup) dialogView.findViewById(R.id.radioSex);

                radioSexGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        switch (checkedId) {
                            case R.id.one:
                                ed18.setText("1");
                                total = total + 1;
                                break;

                            case R.id.two:
                                ed18.setText("2");
                                total = total + 2;
                                break;

                            case R.id.three:
                                ed18.setText("3");
                                total = total+3;
                                break;
                            case R.id.four:
                                ed18.setText("4");
                                total = total+4;
                                break;
                            case R.id.five:
                                ed18.setText("5");
                                total = total+5;
                                break;

                        }
                    }
                });

                dialogBuilder.setTitle("আপনার সম্ভাব্য ৫টি থেকে যেকোনো একটি বেছে নিন ।");

                dialogBuilder.setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {


                    }
                });


                dialogBuilder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        //pass
                    }
                });

                AlertDialog b = dialogBuilder.create();
                b.show();
            }
        });


        final EditText ed19 = (EditText) findViewById(R.id.ed19);
        ed19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(page_process.this,R.style.AppCompatAlertDialogStyle);
                LayoutInflater inflater = page_process.this.getLayoutInflater();
                final View dialogView = inflater.inflate(R.layout.custom_radio, null);
                dialogBuilder.setView(dialogView);
                radioSexGroup = (RadioGroup) dialogView.findViewById(R.id.radioSex);

                radioSexGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        switch (checkedId) {
                            case R.id.one:
                                ed19.setText("1");
                                total = total + 1;
                                break;

                            case R.id.two:
                                ed19.setText("2");
                                total = total + 2;
                                break;

                            case R.id.three:
                                ed19.setText("3");
                                total = total+3;
                                break;
                            case R.id.four:
                                ed19.setText("4");
                                total = total+4;
                                break;
                            case R.id.five:
                                ed19.setText("5");
                                total = total+5;
                                break;

                        }
                    }
                });

                dialogBuilder.setTitle("আপনার সম্ভাব্য ৫টি থেকে যেকোনো একটি বেছে নিন ।");

                dialogBuilder.setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {


                    }
                });


                dialogBuilder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        //pass
                    }
                });

                AlertDialog b = dialogBuilder.create();
                b.show();
            }
        });


        final EditText ed20 = (EditText) findViewById(R.id.ed20);
        ed20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(page_process.this,R.style.AppCompatAlertDialogStyle);
                LayoutInflater inflater = page_process.this.getLayoutInflater();
                final View dialogView = inflater.inflate(R.layout.custom_radio, null);
                dialogBuilder.setView(dialogView);
                radioSexGroup = (RadioGroup) dialogView.findViewById(R.id.radioSex);

                radioSexGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        switch (checkedId) {
                            case R.id.one:
                                ed20.setText("1");
                                total = total + 1;
                                break;

                            case R.id.two:
                                ed20.setText("2");
                                total = total + 2;
                                break;

                            case R.id.three:
                                ed20.setText("3");
                                total = total+3;
                                break;
                            case R.id.four:
                                ed20.setText("4");
                                total = total+4;
                                break;
                            case R.id.five:
                                ed20.setText("5");
                                total = total+5;
                                break;

                        }
                    }
                });

                dialogBuilder.setTitle("আপনার সম্ভাব্য ৫টি থেকে যেকোনো একটি বেছে নিন ।");

                dialogBuilder.setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {


                    }
                });


                dialogBuilder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        //pass
                    }
                });

                AlertDialog b = dialogBuilder.create();
                b.show();
            }
        });



        final EditText ed21 = (EditText) findViewById(R.id.ed21);
        ed21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(page_process.this,R.style.AppCompatAlertDialogStyle);
                LayoutInflater inflater = page_process.this.getLayoutInflater();
                final View dialogView = inflater.inflate(R.layout.custom_radio, null);
                dialogBuilder.setView(dialogView);
                radioSexGroup = (RadioGroup) dialogView.findViewById(R.id.radioSex);

                radioSexGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        switch (checkedId) {
                            case R.id.one:
                                ed21.setText("1");
                                total = total + 1;
                                break;

                            case R.id.two:
                                ed21.setText("2");
                                total = total + 2;
                                break;

                            case R.id.three:
                                ed21.setText("3");
                                total = total+3;
                                break;
                            case R.id.four:
                                ed21.setText("4");
                                total = total+4;
                                break;
                            case R.id.five:
                                ed21.setText("5");
                                total = total+5;
                                break;

                        }
                    }
                });

                dialogBuilder.setTitle("আপনার সম্ভাব্য ৫টি থেকে যেকোনো একটি বেছে নিন ।");

                dialogBuilder.setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {


                    }
                });


                dialogBuilder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        //pass
                    }
                });

                AlertDialog b = dialogBuilder.create();
                b.show();
            }
        });


        final EditText ed22 = (EditText) findViewById(R.id.ed22);
        ed22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(page_process.this,R.style.AppCompatAlertDialogStyle);
                LayoutInflater inflater = page_process.this.getLayoutInflater();
                final View dialogView = inflater.inflate(R.layout.custom_radio, null);
                dialogBuilder.setView(dialogView);
                radioSexGroup = (RadioGroup) dialogView.findViewById(R.id.radioSex);

                radioSexGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        switch (checkedId) {
                            case R.id.one:
                                ed22.setText("1");
                                total = total + 1;
                                break;

                            case R.id.two:
                                ed22.setText("2");
                                total = total + 2;
                                break;

                            case R.id.three:
                                ed22.setText("3");
                                total = total+3;
                                break;
                            case R.id.four:
                                ed22.setText("4");
                                total = total+4;
                                break;
                            case R.id.five:
                                ed22.setText("5");
                                total = total+5;
                                break;

                        }
                    }
                });

                dialogBuilder.setTitle("আপনার সম্ভাব্য ৫টি থেকে যেকোনো একটি বেছে নিন ।");

                dialogBuilder.setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {


                    }
                });


                dialogBuilder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        //pass
                    }
                });

                AlertDialog b = dialogBuilder.create();
                b.show();
            }
        });


        final EditText ed23 = (EditText) findViewById(R.id.ed23);
        ed23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(page_process.this,R.style.AppCompatAlertDialogStyle);
                LayoutInflater inflater = page_process.this.getLayoutInflater();
                final View dialogView = inflater.inflate(R.layout.custom_radio, null);
                dialogBuilder.setView(dialogView);
                radioSexGroup = (RadioGroup) dialogView.findViewById(R.id.radioSex);

                radioSexGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        switch (checkedId) {
                            case R.id.one:
                                ed23.setText("1");
                                total = total + 1;
                                break;

                            case R.id.two:
                                ed23.setText("2");
                                total = total + 2;
                                break;

                            case R.id.three:
                                ed23.setText("3");
                                total = total+3;
                                break;
                            case R.id.four:
                                ed23.setText("4");
                                total = total+4;
                                break;
                            case R.id.five:
                                ed23.setText("5");
                                total = total+5;
                                break;

                        }
                    }
                });

                dialogBuilder.setTitle("আপনার সম্ভাব্য ৫টি থেকে যেকোনো একটি বেছে নিন ।");

                dialogBuilder.setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {


                    }
                });


                dialogBuilder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        //pass
                    }
                });

                AlertDialog b = dialogBuilder.create();
                b.show();
            }
        });


        final EditText ed24 = (EditText) findViewById(R.id.ed24);
        ed24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(page_process.this,R.style.AppCompatAlertDialogStyle);
                LayoutInflater inflater = page_process.this.getLayoutInflater();
                final View dialogView = inflater.inflate(R.layout.custom_radio, null);
                dialogBuilder.setView(dialogView);
                radioSexGroup = (RadioGroup) dialogView.findViewById(R.id.radioSex);

                radioSexGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        switch (checkedId) {
                            case R.id.one:
                                ed24.setText("1");
                                total = total + 1;
                                break;

                            case R.id.two:
                                ed24.setText("2");
                                total = total + 2;
                                break;

                            case R.id.three:
                                ed24.setText("3");
                                total = total+3;
                                break;
                            case R.id.four:
                                ed24.setText("4");
                                total = total+4;
                                break;
                            case R.id.five:
                                ed24.setText("5");
                                total = total+5;
                                break;

                        }
                    }
                });

                dialogBuilder.setTitle("আপনার সম্ভাব্য ৫টি থেকে যেকোনো একটি বেছে নিন ।");

                dialogBuilder.setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {


                    }
                });


                dialogBuilder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        //pass
                    }
                });

                AlertDialog b = dialogBuilder.create();
                b.show();
            }
        });


        final EditText ed25 = (EditText) findViewById(R.id.ed25);
        ed25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(page_process.this,R.style.AppCompatAlertDialogStyle);
                LayoutInflater inflater = page_process.this.getLayoutInflater();
                final View dialogView = inflater.inflate(R.layout.custom_radio, null);
                dialogBuilder.setView(dialogView);
                radioSexGroup = (RadioGroup) dialogView.findViewById(R.id.radioSex);

                radioSexGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        switch (checkedId) {
                            case R.id.one:
                                ed25.setText("1");
                                total = total + 1;
                                break;

                            case R.id.two:
                                ed25.setText("2");
                                total = total + 2;
                                break;

                            case R.id.three:
                                ed25.setText("3");
                                total = total+3;
                                break;
                            case R.id.four:
                                ed25.setText("4");
                                total = total+4;
                                break;
                            case R.id.five:
                                ed25.setText("5");
                                total = total+5;
                                break;

                        }
                    }
                });

                dialogBuilder.setTitle("আপনার সম্ভাব্য ৫টি থেকে যেকোনো একটি বেছে নিন ।");

                dialogBuilder.setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {


                    }
                });


                dialogBuilder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        //pass
                    }
                });

                AlertDialog b = dialogBuilder.create();
                b.show();
            }
        });


        final EditText ed26 = (EditText) findViewById(R.id.ed26);
        ed26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(page_process.this,R.style.AppCompatAlertDialogStyle);
                LayoutInflater inflater = page_process.this.getLayoutInflater();
                final View dialogView = inflater.inflate(R.layout.custom_radio, null);
                dialogBuilder.setView(dialogView);
                radioSexGroup = (RadioGroup) dialogView.findViewById(R.id.radioSex);

                radioSexGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        switch (checkedId) {
                            case R.id.one:
                                ed26.setText("1");
                                total = total + 1;
                                break;

                            case R.id.two:
                                ed26.setText("2");
                                total = total + 2;
                                break;

                            case R.id.three:
                                ed26.setText("3");
                                total = total+3;
                                break;
                            case R.id.four:
                                ed26.setText("4");
                                total = total+4;
                                break;
                            case R.id.five:
                                ed26.setText("5");
                                total = total+5;
                                break;

                        }
                    }
                });

                dialogBuilder.setTitle("আপনার সম্ভাব্য ৫টি থেকে যেকোনো একটি বেছে নিন ।");

                dialogBuilder.setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {


                    }
                });


                dialogBuilder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        //pass
                    }
                });

                AlertDialog b = dialogBuilder.create();
                b.show();
            }
        });


        final EditText ed27 = (EditText) findViewById(R.id.ed27);
        ed27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(page_process.this,R.style.AppCompatAlertDialogStyle);
                LayoutInflater inflater = page_process.this.getLayoutInflater();
                final View dialogView = inflater.inflate(R.layout.custom_radio, null);
                dialogBuilder.setView(dialogView);
                radioSexGroup = (RadioGroup) dialogView.findViewById(R.id.radioSex);

                radioSexGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        switch (checkedId) {
                            case R.id.one:
                                ed27.setText("1");
                                total = total + 1;
                                break;

                            case R.id.two:
                                ed27.setText("2");
                                total = total + 2;
                                break;

                            case R.id.three:
                                ed27.setText("3");
                                total = total+3;
                                break;
                            case R.id.four:
                                ed27.setText("4");
                                total = total+4;
                                break;
                            case R.id.five:
                                ed27.setText("5");
                                total = total+5;
                                break;

                        }
                    }
                });

                dialogBuilder.setTitle("আপনার সম্ভাব্য ৫টি থেকে যেকোনো একটি বেছে নিন ।");

                dialogBuilder.setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {


                    }
                });


                dialogBuilder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        //pass
                    }
                });

                AlertDialog b = dialogBuilder.create();
                b.show();
            }
        });


        final EditText ed28 = (EditText) findViewById(R.id.ed28);
        ed28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(page_process.this,R.style.AppCompatAlertDialogStyle);
                LayoutInflater inflater = page_process.this.getLayoutInflater();
                final View dialogView = inflater.inflate(R.layout.custom_radio, null);
                dialogBuilder.setView(dialogView);
                radioSexGroup = (RadioGroup) dialogView.findViewById(R.id.radioSex);

                radioSexGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        switch (checkedId) {
                            case R.id.one:
                                ed28.setText("1");
                                total = total + 1;
                                break;

                            case R.id.two:
                                ed28.setText("2");
                                total = total + 2;
                                break;

                            case R.id.three:
                                ed28.setText("3");
                                total = total+3;
                                break;
                            case R.id.four:
                                ed28.setText("4");
                                total = total+4;
                                break;
                            case R.id.five:
                                ed28.setText("5");
                                total = total+5;
                                break;

                        }
                    }
                });

                dialogBuilder.setTitle("আপনার সম্ভাব্য ৫টি থেকে যেকোনো একটি বেছে নিন ।");

                dialogBuilder.setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {


                    }
                });


                dialogBuilder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        //pass
                    }
                });

                AlertDialog b = dialogBuilder.create();
                b.show();
            }
        });


        final EditText ed29 = (EditText) findViewById(R.id.ed29);
        ed29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(page_process.this,R.style.AppCompatAlertDialogStyle);
                LayoutInflater inflater = page_process.this.getLayoutInflater();
                final View dialogView = inflater.inflate(R.layout.custom_radio, null);
                dialogBuilder.setView(dialogView);
                radioSexGroup = (RadioGroup) dialogView.findViewById(R.id.radioSex);

                radioSexGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        switch (checkedId) {
                            case R.id.one:
                                ed29.setText("1");
                                total = total + 1;
                                break;

                            case R.id.two:
                                ed29.setText("2");
                                total = total + 2;
                                break;

                            case R.id.three:
                                ed29.setText("3");
                                total = total+3;
                                break;
                            case R.id.four:
                                ed29.setText("4");
                                total = total+4;
                                break;
                            case R.id.five:
                                ed29.setText("5");
                                total = total+5;
                                break;

                        }
                    }
                });

                dialogBuilder.setTitle("আপনার সম্ভাব্য ৫টি থেকে যেকোনো একটি বেছে নিন ।");

                dialogBuilder.setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {


                    }
                });


                dialogBuilder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        //pass
                    }
                });

                AlertDialog b = dialogBuilder.create();
                b.show();
            }
        });


        final EditText ed30 = (EditText) findViewById(R.id.ed30);
        ed30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(page_process.this,R.style.AppCompatAlertDialogStyle);
                LayoutInflater inflater = page_process.this.getLayoutInflater();
                final View dialogView = inflater.inflate(R.layout.custom_radio, null);
                dialogBuilder.setView(dialogView);
                radioSexGroup = (RadioGroup) dialogView.findViewById(R.id.radioSex);

                radioSexGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        switch (checkedId) {
                            case R.id.one:
                                ed30.setText("1");
                                total = total + 1;
                                break;

                            case R.id.two:
                                ed30.setText("2");
                                total = total + 2;
                                break;

                            case R.id.three:
                                ed30.setText("3");
                                total = total+3;
                                break;
                            case R.id.four:
                                ed30.setText("4");
                                total = total+4;
                                break;
                            case R.id.five:
                                ed30.setText("5");
                                total = total+5;
                                break;

                        }
                    }
                });

                dialogBuilder.setTitle("আপনার সম্ভাব্য ৫টি থেকে যেকোনো একটি বেছে নিন ।");

                dialogBuilder.setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {


                    }
                });


                dialogBuilder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        //pass
                    }
                });

                AlertDialog b = dialogBuilder.create();
                b.show();
            }
        });



        LayoutInflater li = getLayoutInflater();
        //Getting the View object as defined in the customtoast.xml file
        final View layout = li.inflate(R.layout.custom_toast,
                (ViewGroup) findViewById(R.id.customToast));
             Tmsg = (TextView) layout.findViewById(R.id.custom_toast_message);





        Button btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str ;
                if(total<30){
                    str = "Please answer all the questions first";
                }
                else if(total>=30&&total<=100){
                    str = "Minimum";
                }
                else if(total>=101&&total<=114){
                    str = "Mild";
                }
                else if(total>=115&&total<=123){
                    str = "Moderate";
                }
                else if(total>=124&&total<=150){
                    str = "Severe";
                }
                else {
                    str = "Something Went wrong";
                }

                Tmsg.setText(str);
                Toast toast = new Toast(getApplicationContext());
                toast.setDuration(Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
                toast.setView(layout);//setting the view of custom toast layout
                toast.show();
            }
        });
    }
}
