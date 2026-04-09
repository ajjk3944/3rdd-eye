package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import defpackage.e61;
import defpackage.p6;
import defpackage.qe;
import defpackage.sb;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class CheckableImageButton extends p6 implements Checkable {
    public static final int[] l = {R.attr.state_checked};
    public boolean i;
    public boolean j;
    public boolean k;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.phuongpn.whousemywifi.networkscanner.R.attr.imageButtonStyle);
        this.j = true;
        this.k = true;
        e61.l(this, new sb(1, this));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.i;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        return this.i ? View.mergeDrawableStates(super.onCreateDrawableState(i + 1), l) : super.onCreateDrawableState(i);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof qe)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        qe qeVar = (qe) parcelable;
        super.onRestoreInstanceState(qeVar.f);
        setChecked(qeVar.h);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        qe qeVar = new qe(super.onSaveInstanceState());
        qeVar.h = this.i;
        return qeVar;
    }

    public void setCheckable(boolean z) {
        if (this.j != z) {
            this.j = z;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (!this.j || this.i == z) {
            return;
        }
        this.i = z;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z) {
        this.k = z;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.k) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.i);
    }
}
