package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import o.a0;
import o.m;

/* loaded from: classes.dex */
public class NavigationMenuView extends RecyclerView implements a0 {
    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setLayoutManager(new LinearLayoutManager(1, false));
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // o.a0
    public final void b(m mVar) {
    }
}
