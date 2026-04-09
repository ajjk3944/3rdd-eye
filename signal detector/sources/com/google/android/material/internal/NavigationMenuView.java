package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import n.MenuC2677k;
import n.y;

/* loaded from: classes.dex */
public class NavigationMenuView extends RecyclerView implements y {
    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setLayoutManager(new LinearLayoutManager(1, false));
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // n.y
    public final void b(MenuC2677k menuC2677k) {
    }
}
