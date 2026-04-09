package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.datepicker.k;
import p.t;
import u3.i0;

/* loaded from: classes.dex */
public class CheckableImageButton extends t implements Checkable {
    public static final int[] B = {R.attr.state_checked};

    /* renamed from: r, reason: collision with root package name */
    public boolean f5657r;

    /* renamed from: x, reason: collision with root package name */
    public boolean f5658x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f5659y;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: g, reason: collision with root package name */
        public boolean f5660g;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f5660g = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f5660g ? 1 : 0);
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, h.a.imageButtonStyle);
        this.f5658x = true;
        this.f5659y = true;
        i0.n(this, new k(4, this));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f5657r;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        return this.f5657r ? View.mergeDrawableStates(super.onCreateDrawableState(i10 + 1), B) : super.onCreateDrawableState(i10);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f1243a);
        setChecked(savedState.f5660g);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f5660g = this.f5657r;
        return savedState;
    }

    public void setCheckable(boolean z10) {
        if (this.f5658x != z10) {
            this.f5658x = z10;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (!this.f5658x || this.f5657r == z10) {
            return;
        }
        this.f5657r = z10;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z10) {
        this.f5659y = z10;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        if (this.f5659y) {
            super.setPressed(z10);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f5657r);
    }
}
