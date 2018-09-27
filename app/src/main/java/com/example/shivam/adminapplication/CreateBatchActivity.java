package com.example.shivam.adminapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CreateBatchActivity extends AppCompatActivity {
    //A batch would be created here
    EditText batch_major,stream,start,end;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_batch);
        //Everything would be done here, from adding students to assigning starting and ending dates to the course
        //Name of course
        //Duration
        //Semester Calendar would be uploaded in the form of excel sheet --> first semester, second semester, third semester, etc
        // Semester - > Duration, start date, end date, subjects(where there is no data filled, default has to be written in the excel sheet)
        batch_major = (EditText)findViewById(R.id.batch_major_edit_text);
        stream = (EditText)findViewById(R.id.batch_stream_edit_text);
        start = (EditText)findViewById(R.id.batch_start_year_edit_text);
        end = (EditText)findViewById(R.id.batch_end_year_edit_text);
        //TODO : Among all the steps to be done, this is the first step.
        //Input name of Batch
        //Starting year - Ending Year
        //Stream
        //Jump to next screen on submit and provide the option of adding the students by uploading their data
         submit.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 //Firebase call to store data / create a batch and add its data under its start year node
             }
         });

        // For now, only simple prototype to add students and assign faculty to batch

    }
}
