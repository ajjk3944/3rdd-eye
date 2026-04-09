package com.yandex.mobile.ads.impl;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.widget.CheckBox;

/* loaded from: classes3.dex */
public final class e52 extends CheckBox {

    /* renamed from: a, reason: collision with root package name */
    private Drawable f26681a;

    /* renamed from: b, reason: collision with root package name */
    private Drawable f26682b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e52(Context context) {
        super(context);
        kotlin.jvm.internal.l.f(context, "context");
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setButtonDrawable((Drawable) null);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        super.setChecked(z10);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, this.f26681a);
        stateListDrawable.addState(new int[0], this.f26682b);
        setBackground(stateListDrawable);
    }

    public final void setCheckedIcon(Drawable drawable) {
        kotlin.jvm.internal.l.f(drawable, "drawable");
        this.f26681a = drawable;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, this.f26681a);
        stateListDrawable.addState(new int[0], this.f26682b);
        setBackground(stateListDrawable);
    }

    public final void setUncheckedIcon(Drawable drawable) {
        kotlin.jvm.internal.l.f(drawable, "drawable");
        this.f26682b = drawable;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, this.f26681a);
        stateListDrawable.addState(new int[0], this.f26682b);
        setBackground(stateListDrawable);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e52(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.l.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e52(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.l.f(context, "context");
    }
}
