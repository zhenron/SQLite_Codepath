package com.example.juliancamilomunoz.sqlite_codepath;

import android.app.AlertDialog;
import android.database.Cursor;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.List;


public class SQLiteExampleActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sqlite_example);
        // Create our sqlite database object
        TodoItemDatabase db = new TodoItemDatabase(this);
        // Inserting todo items
        //db.addTodoItem(new TodoItem("Get milk", 3));
        //db.addTodoItem(new TodoItem("Pickup kids", 1));
        // Querying all todo items
        List<TodoItem> items = db.getAllTodoItems();

        StringBuffer buffer = new StringBuffer();       //Added
        // Print out properties
        for (TodoItem ti : items) {
            buffer.append("Id: " + ti.getId() + "\nBody: " + ti.getBody() +
                    "\nPriority: " + ti.getPriority() + "\n\n");
            // Writing Todo Items to log
            //Log.d("Name: ", log);
        }

        //show all the data
        showMessage("Data", buffer.toString());
    }

    public void showMessage(String title, String Message){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(Message);
        builder.show();
    }

}
