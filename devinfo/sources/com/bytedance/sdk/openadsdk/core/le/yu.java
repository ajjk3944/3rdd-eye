package com.bytedance.sdk.openadsdk.core.le;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class yu extends ImageView {
    public yu(Context context) {
        super(context);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i4, int i10) {
        super.onMeasure(i4, i10);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(bly.ouw(this, layoutParams));
    }

    @Override // android.view.View
    public void setPadding(int i4, int i10, int i11, int i12) {
        super.setPaddingRelative(i4, i10, i11, i12);
    }

    public yu(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public yu(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
    }
}
