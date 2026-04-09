package com.google.android.material.internal;

import L0.I;
import android.R;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import com.google.android.material.datepicker.m;
import o.C5393k;

/* loaded from: classes2.dex */
public class CheckableImageButton extends C5393k implements Checkable {

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f22975h = {R.attr.state_checked};

    /* renamed from: e, reason: collision with root package name */
    public boolean f22976e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f22977f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f22978g;

    public static class a extends U0.a {
        public static final Parcelable.Creator<a> CREATOR = new C0344a();

        /* renamed from: d, reason: collision with root package name */
        public boolean f22979d;

        /* renamed from: com.google.android.material.internal.CheckableImageButton$a$a, reason: collision with other inner class name */
        public class C0344a implements Parcelable.ClassLoaderCreator<a> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final a createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new a(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new a[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new a(parcel, null);
            }
        }

        public a(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f22979d = parcel.readInt() == 1;
        }

        @Override // U0.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f22979d ? 1 : 0);
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.attr.imageButtonStyle);
        this.f22977f = true;
        this.f22978g = true;
        I.o(this, new m(this, 1));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f22976e;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        return this.f22976e ? View.mergeDrawableStates(super.onCreateDrawableState(i + 1), f22975h) : super.onCreateDrawableState(i);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.f12348b);
        setChecked(aVar.f22979d);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        aVar.f22979d = this.f22976e;
        return aVar;
    }

    public void setCheckable(boolean z10) {
        if (this.f22977f != z10) {
            this.f22977f = z10;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (!this.f22977f || this.f22976e == z10) {
            return;
        }
        this.f22976e = z10;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z10) {
        this.f22978g = z10;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        if (this.f22978g) {
            super.setPressed(z10);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f22976e);
    }
}
