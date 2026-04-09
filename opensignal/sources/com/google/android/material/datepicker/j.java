package com.google.android.material.datepicker;

import android.graphics.Canvas;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import h7.j1;
import h7.w0;

/* loaded from: classes.dex */
public final class j extends w0 {
    @Override // h7.w0
    public final void d(Canvas canvas, RecyclerView recyclerView, j1 j1Var) {
        if ((recyclerView.getAdapter() instanceof a0) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            throw null;
        }
    }
}
