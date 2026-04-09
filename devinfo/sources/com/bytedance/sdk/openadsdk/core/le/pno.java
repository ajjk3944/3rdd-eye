package com.bytedance.sdk.openadsdk.core.le;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.qbp;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class pno extends TextView {
    public pno(Context context) {
        super(context);
        ouw();
    }

    private void ouw() {
        setTextDirection(5);
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i4, int i10) {
        try {
            super.onMeasure(i4, i10);
        } catch (Throwable th2) {
            qbp.lh("PAGTextView", th2.toString());
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i4, int i10, int i11, int i12) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i4, i10, i11, i12);
    }

    @Override // android.widget.TextView
    public void setGravity(int i4) {
        super.setGravity(bly.ouw(i4));
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(bly.ouw(this, layoutParams));
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i4, int i10, int i11, int i12) {
        super.setPaddingRelative(i4, i10, i11, i12);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    public pno(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        ouw();
    }
}
