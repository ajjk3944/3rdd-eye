package com.bytedance.sdk.openadsdk.core.ycc;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* loaded from: classes.dex */
public class bw extends LinearLayout {
    public bw(Context context) {
        super(context);
        init();
    }

    private void init() {
        setLayoutDirection(3);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i3) {
        super.onMeasure(i, i3);
    }

    @Override // android.widget.LinearLayout
    public void setGravity(int i) {
        super.setGravity(zz.emc(i));
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(zz.emc(this, layoutParams));
    }

    @Override // android.view.View
    public void setPadding(int i, int i3, int i6, int i7) {
        super.setPaddingRelative(i, i3, i6, i7);
    }

    public bw(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public bw(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }
}
