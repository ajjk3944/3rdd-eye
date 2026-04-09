package com.bytedance.sdk.openadsdk.core.ycc;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

/* loaded from: classes.dex */
public class uym extends RelativeLayout {
    public uym(Context context) {
        super(context);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i, int i3) {
        super.onMeasure(i, i3);
    }

    @Override // android.widget.RelativeLayout
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

    public uym(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
