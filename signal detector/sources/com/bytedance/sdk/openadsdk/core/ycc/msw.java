package com.bytedance.sdk.openadsdk.core.ycc;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.ul;

/* loaded from: classes.dex */
public class msw extends TextView {
    public msw(Context context) {
        super(context);
        emc();
    }

    private void emc() {
        setTextDirection(5);
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i3) {
        try {
            super.onMeasure(i, i3);
        } catch (Throwable th) {
            ul.xq("PAGTextView", th.toString());
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i3, int i6, int i7) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i3, i6, i7);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        super.setGravity(zz.emc(i));
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(zz.emc(this, layoutParams));
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i, int i3, int i6, int i7) {
        super.setPaddingRelative(i, i3, i6, i7);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    public msw(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        emc();
    }
}
