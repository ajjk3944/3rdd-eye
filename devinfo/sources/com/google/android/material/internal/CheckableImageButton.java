package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import com.google.android.material.datepicker.j;
import e4.v0;
import p.v;
import zc.a;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class CheckableImageButton extends v implements Checkable {
    public static final int[] g = {R.attr.state_checked};

    /* renamed from: d, reason: collision with root package name */
    public boolean f20533d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f20534e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f20535f;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.liuzh.deviceinfo.R.attr.imageButtonStyle);
        this.f20534e = true;
        this.f20535f = true;
        v0.o(this, new j(4, this));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f20533d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i4) {
        return this.f20533d ? View.mergeDrawableStates(super.onCreateDrawableState(i4 + 1), g) : super.onCreateDrawableState(i4);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.f28876a);
        setChecked(aVar.f38169c);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        aVar.f38169c = this.f20533d;
        return aVar;
    }

    public void setCheckable(boolean z3) {
        if (this.f20534e != z3) {
            this.f20534e = z3;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z3) {
        if (!this.f20534e || this.f20533d == z3) {
            return;
        }
        this.f20533d = z3;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z3) {
        this.f20535f = z3;
    }

    @Override // android.view.View
    public void setPressed(boolean z3) {
        if (this.f20535f) {
            super.setPressed(z3);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f20533d);
    }
}
