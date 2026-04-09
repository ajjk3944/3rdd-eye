package com.google.android.material.internal;

import J3.e;
import R.O;
import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import o.C2742v;
import x3.C2996a;

/* loaded from: classes.dex */
public class CheckableImageButton extends C2742v implements Checkable {

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f18383g = {R.attr.state_checked};

    /* renamed from: d, reason: collision with root package name */
    public boolean f18384d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f18385e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f18386f;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.apm.insight.R.attr.imageButtonStyle);
        this.f18385e = true;
        this.f18386f = true;
        O.m(this, new e(4, this));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f18384d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        return this.f18384d ? View.mergeDrawableStates(super.onCreateDrawableState(i + 1), f18383g) : super.onCreateDrawableState(i);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C2996a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C2996a c2996a = (C2996a) parcelable;
        super.onRestoreInstanceState(c2996a.f3954a);
        setChecked(c2996a.f24039c);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C2996a c2996a = new C2996a(super.onSaveInstanceState());
        c2996a.f24039c = this.f18384d;
        return c2996a;
    }

    public void setCheckable(boolean z6) {
        if (this.f18385e != z6) {
            this.f18385e = z6;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z6) {
        if (!this.f18385e || this.f18384d == z6) {
            return;
        }
        this.f18384d = z6;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z6) {
        this.f18386f = z6;
    }

    @Override // android.view.View
    public void setPressed(boolean z6) {
        if (this.f18386f) {
            super.setPressed(z6);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f18384d);
    }
}
