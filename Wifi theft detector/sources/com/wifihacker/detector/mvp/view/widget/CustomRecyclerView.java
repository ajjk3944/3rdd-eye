package com.wifihacker.detector.mvp.view.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import g8.u;

/* loaded from: classes3.dex */
public class CustomRecyclerView extends RecyclerView {
    public View O0;
    public RecyclerView.i P0;

    public class a extends RecyclerView.i {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void onChanged() {
            RecyclerView.Adapter adapter = CustomRecyclerView.this.getAdapter();
            if (adapter == null || CustomRecyclerView.this.O0 == null) {
                return;
            }
            if (adapter.getItemCount() != 0) {
                CustomRecyclerView.this.O0.setVisibility(8);
                CustomRecyclerView.this.setVisibility(0);
            } else if (u.g(CustomRecyclerView.this.getContext())) {
                CustomRecyclerView.this.O0.setVisibility(0);
                CustomRecyclerView.this.setVisibility(8);
            }
        }
    }

    public CustomRecyclerView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.P0 = new a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(RecyclerView.Adapter adapter) {
        super.setAdapter(adapter);
        if (adapter != null) {
            adapter.registerAdapterDataObserver(this.P0);
        }
        this.P0.onChanged();
    }

    public void setEmptyView(View view) {
        this.O0 = view;
    }

    public CustomRecyclerView(Context context) {
        super(context);
        this.P0 = new a();
    }

    public CustomRecyclerView(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.P0 = new a();
    }
}
