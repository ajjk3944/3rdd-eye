package com.lefan.base.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.WindowInsets;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import q5.i;

/* loaded from: classes.dex */
public final class NonConsumingCollapsingToolbarLayout extends CollapsingToolbarLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NonConsumingCollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        i.e(context, "context");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        i.e(windowInsets, "insets");
        super.dispatchApplyWindowInsets(windowInsets);
        return windowInsets;
    }
}
