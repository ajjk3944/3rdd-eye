package com.bytedance.sdk.openadsdk.core.le;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.Button;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw extends Button {
    public ouw(Context context) {
        super(context);
        setTextDirection(5);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i4, int i10) {
        super.onMeasure(i4, i10);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i4, int i10, int i11, int i12) {
        setCompoundDrawablesRelativeWithIntrinsicBounds(i4, i10, i11, i12);
    }

    @Override // android.widget.TextView
    public final void setGravity(int i4) {
        super.setGravity(bly.ouw(i4));
    }

    @Override // android.view.View
    public final void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(bly.ouw(this, layoutParams));
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i4, int i10, int i11, int i12) {
        setPaddingRelative(i4, i10, i11, i12);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }
}
