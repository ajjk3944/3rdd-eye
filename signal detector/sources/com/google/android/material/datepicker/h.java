package com.google.android.material.datepicker;

import android.graphics.Canvas;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.M;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d0;

/* loaded from: classes.dex */
public final class h extends M {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f18278a;

    public h(j jVar) {
        this.f18278a = jVar;
        u.c(null);
        u.c(null);
    }

    @Override // androidx.recyclerview.widget.M
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, d0 d0Var) {
        if ((recyclerView.getAdapter() instanceof w) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            this.f18278a.getClass();
            throw null;
        }
    }
}
