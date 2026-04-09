package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.CompoundButton;

/* loaded from: classes.dex */
class i {

    /* renamed from: a, reason: collision with root package name */
    private final CompoundButton f968a;

    /* renamed from: b, reason: collision with root package name */
    private ColorStateList f969b = null;

    /* renamed from: c, reason: collision with root package name */
    private PorterDuff.Mode f970c = null;

    /* renamed from: d, reason: collision with root package name */
    private boolean f971d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f972e = false;

    /* renamed from: f, reason: collision with root package name */
    private boolean f973f;

    i(CompoundButton compoundButton) {
        this.f968a = compoundButton;
    }

    void a() throws NoSuchFieldException {
        Drawable drawableA = androidx.core.widget.c.a(this.f968a);
        if (drawableA != null) {
            if (this.f971d || this.f972e) {
                Drawable drawableMutate = u.a.p(drawableA).mutate();
                if (this.f971d) {
                    u.a.n(drawableMutate, this.f969b);
                }
                if (this.f972e) {
                    u.a.o(drawableMutate, this.f970c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f968a.getDrawableState());
                }
                this.f968a.setButtonDrawable(drawableMutate);
            }
        }
    }

    int b(int i2) {
        Drawable drawableA;
        return (Build.VERSION.SDK_INT >= 17 || (drawableA = androidx.core.widget.c.a(this.f968a)) == null) ? i2 : i2 + drawableA.getIntrinsicWidth();
    }

    ColorStateList c() {
        return this.f969b;
    }

    PorterDuff.Mode d() {
        return this.f970c;
    }

    void e(AttributeSet attributeSet, int i2) {
        boolean z2;
        int resourceId;
        int resourceId2;
        TypedArray typedArrayObtainStyledAttributes = this.f968a.getContext().obtainStyledAttributes(attributeSet, a.j.R0, i2, 0);
        try {
            int i3 = a.j.T0;
            if (!typedArrayObtainStyledAttributes.hasValue(i3) || (resourceId2 = typedArrayObtainStyledAttributes.getResourceId(i3, 0)) == 0) {
                z2 = false;
            } else {
                try {
                    CompoundButton compoundButton = this.f968a;
                    compoundButton.setButtonDrawable(c.a.d(compoundButton.getContext(), resourceId2));
                    z2 = true;
                } catch (Resources.NotFoundException unused) {
                }
            }
            if (!z2) {
                int i4 = a.j.S0;
                if (typedArrayObtainStyledAttributes.hasValue(i4) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(i4, 0)) != 0) {
                    CompoundButton compoundButton2 = this.f968a;
                    compoundButton2.setButtonDrawable(c.a.d(compoundButton2.getContext(), resourceId));
                }
            }
            int i5 = a.j.U0;
            if (typedArrayObtainStyledAttributes.hasValue(i5)) {
                androidx.core.widget.c.b(this.f968a, typedArrayObtainStyledAttributes.getColorStateList(i5));
            }
            int i6 = a.j.V0;
            if (typedArrayObtainStyledAttributes.hasValue(i6)) {
                androidx.core.widget.c.c(this.f968a, e0.d(typedArrayObtainStyledAttributes.getInt(i6, -1), null));
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    void f() throws NoSuchFieldException {
        if (this.f973f) {
            this.f973f = false;
        } else {
            this.f973f = true;
            a();
        }
    }

    void g(ColorStateList colorStateList) throws NoSuchFieldException {
        this.f969b = colorStateList;
        this.f971d = true;
        a();
    }

    void h(PorterDuff.Mode mode) throws NoSuchFieldException {
        this.f970c = mode;
        this.f972e = true;
        a();
    }
}
