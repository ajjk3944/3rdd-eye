package com.yandex.mobile.ads.impl;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.mobile.ads.R;

/* loaded from: classes3.dex */
public final class hx extends RecyclerView.o {
    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.B state) throws Resources.NotFoundException {
        kotlin.jvm.internal.l.f(outRect, "outRect");
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(parent, "parent");
        kotlin.jvm.internal.l.f(state, "state");
        super.getItemOffsets(outRect, view, parent, state);
        Resources resources = view.getResources();
        if (view.getId() == R.id.item_divider) {
            if (parent.getChildAdapterPosition(view) != 0) {
                outRect.top = resources.getDimensionPixelSize(R.dimen.debug_panel_space_medium_large);
            }
        } else {
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.debug_panel_space_small);
            outRect.bottom = dimensionPixelSize;
            outRect.top = dimensionPixelSize;
        }
    }
}
