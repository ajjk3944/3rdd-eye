package com.bytedance.sdk.openadsdk.core.le;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class fkw extends LinearLayout {
    public fkw(Context context) {
        super(context);
        init();
    }

    private void init() {
        setLayoutDirection(3);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i4, int i10) {
        super.onMeasure(i4, i10);
    }

    @Override // android.widget.LinearLayout
    public void setGravity(int i4) {
        super.setGravity(bly.ouw(i4));
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(bly.ouw(this, layoutParams));
    }

    @Override // android.view.View
    public void setPadding(int i4, int i10, int i11, int i12) {
        super.setPaddingRelative(i4, i10, i11, i12);
    }

    public fkw(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public fkw(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        init();
    }
}
