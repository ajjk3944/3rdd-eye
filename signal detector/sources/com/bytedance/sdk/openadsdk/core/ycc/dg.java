package com.bytedance.sdk.openadsdk.core.ycc;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class dg extends ImageView {
    public dg(Context context) {
        super(context);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i3) {
        super.onMeasure(i, i3);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(zz.emc(this, layoutParams));
    }

    @Override // android.view.View
    public void setPadding(int i, int i3, int i6, int i7) {
        super.setPaddingRelative(i, i3, i6, i7);
    }

    public dg(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public dg(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
