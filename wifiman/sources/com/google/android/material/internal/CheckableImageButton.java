package com.google.android.material.internal;

import F1.C2736a;
import F1.W;
import G1.t;
import android.R;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import androidx.appcompat.widget.C3891p;
import h.AbstractC5927a;

/* loaded from: classes3.dex */
public class CheckableImageButton extends C3891p implements Checkable {

    /* renamed from: g, reason: collision with root package name */
    private static final int[] f37476g = {R.attr.state_checked};

    /* renamed from: d, reason: collision with root package name */
    private boolean f37477d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f37478e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f37479f;

    class a extends C2736a {
        a() {
        }

        @Override // F1.C2736a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        @Override // F1.C2736a
        public void g(View view, t tVar) {
            super.g(view, tVar);
            tVar.e0(CheckableImageButton.this.a());
            tVar.f0(CheckableImageButton.this.isChecked());
        }
    }

    static class b extends L1.a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        boolean f37481c;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i10) {
                return new b[i10];
            }
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }

        private void b(Parcel parcel) {
            this.f37481c = parcel.readInt() == 1;
        }

        @Override // L1.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f37481c ? 1 : 0);
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            b(parcel);
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC5927a.f47963z);
    }

    public boolean a() {
        return this.f37478e;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f37477d;
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i10) {
        if (!this.f37477d) {
            return super.onCreateDrawableState(i10);
        }
        int[] iArr = f37476g;
        return View.mergeDrawableStates(super.onCreateDrawableState(i10 + iArr.length), iArr);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.a());
        setChecked(bVar.f37481c);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f37481c = this.f37477d;
        return bVar;
    }

    public void setCheckable(boolean z10) {
        if (this.f37478e != z10) {
            this.f37478e = z10;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (!this.f37478e || this.f37477d == z10) {
            return;
        }
        this.f37477d = z10;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z10) {
        this.f37479f = z10;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        if (this.f37479f) {
            super.setPressed(z10);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f37477d);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f37478e = true;
        this.f37479f = true;
        W.m0(this, new a());
    }
}
