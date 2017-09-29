package com.orengesunshine.todowithapi.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.orengesunshine.todowithapi.MainActivity;
import com.orengesunshine.todowithapi.R;
import com.orengesunshine.todowithapi.TaskListActivity;
import com.orengesunshine.todowithapi.model.Task;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TaskListAdapter extends BaseAdapter {

    private Context context;
    private List<Task> tasks;

    @Inject
    public TaskListAdapter(TaskListActivity context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return tasks.size();
    }

    @Override
    public Object getItem(int position) {
        return tasks.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Holder holder; //view holder pattern
        if (convertView==null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.task_list_item,parent,false);
            holder = new Holder(convertView);
            convertView.setTag(holder);
        }else {
            holder = (Holder)convertView.getTag();
        }

        if (tasks!=null){
            holder.task.setText(tasks.get(position).getTask());
            holder.time.setText(tasks.get(position).getCreated_at_date());
        }
        // set texts for each item

        return convertView;
    }

    public void swapData(List<Task> tasks){
        this.tasks = tasks;
        notifyDataSetChanged();
    }

    static class Holder{
        @BindView(R.id.list_item_task)TextView task;
        @BindView(R.id.list_item_time)TextView time;
        Holder(View view){
            ButterKnife.bind(this,view);
        }
    }
}
