package com.example.firstsqlite;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

class ViewHolder {
    ImageView icon = null;

    ViewHolder(View base) {
        this.icon = (ImageView) base.findViewById(R.id.icon);
    }
}
