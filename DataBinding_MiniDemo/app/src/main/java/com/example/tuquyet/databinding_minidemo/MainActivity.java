package com.example.tuquyet.databinding_minidemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private UserAdapter mUserAdapter;
    private List<User> mUserList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_user);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        for (int i = 0; i < 10; i++) {
            mUserList.add(new User(R.drawable.tim, "Nguyen Van " + i, "012345678"+String.valueOf
                (i)));
        }
        mUserAdapter = new UserAdapter(mUserList);
        mRecyclerView.setAdapter(mUserAdapter);
    }
}
