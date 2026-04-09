package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import h.AbstractC5936j;

/* renamed from: androidx.appcompat.widget.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C3880e {

    /* renamed from: a, reason: collision with root package name */
    private final View f27363a;

    /* renamed from: d, reason: collision with root package name */
    private Z f27366d;

    /* renamed from: e, reason: collision with root package name */
    private Z f27367e;

    /* renamed from: f, reason: collision with root package name */
    private Z f27368f;

    /* renamed from: c, reason: collision with root package name */
    private int f27365c = -1;

    /* renamed from: b, reason: collision with root package name */
    private final C3886k f27364b = C3886k.b();

    C3880e(View view) {
        this.f27363a = view;
    }

    private boolean a(Drawable drawable) {
        if (this.f27368f == null) {
            this.f27368f = new Z();
        }
        Z z10 = this.f27368f;
        z10.a();
        ColorStateList colorStateListR = F1.W.r(this.f27363a);
        if (colorStateListR != null) {
            z10.f27311d = true;
            z10.f27308a = colorStateListR;
        }
        PorterDuff.Mode modeS = F1.W.s(this.f27363a);
        if (modeS != null) {
            z10.f27310c = true;
            z10.f27309b = modeS;
        }
        if (!z10.f27311d && !z10.f27310c) {
            return false;
        }
        C3886k.i(drawable, z10, this.f27363a.getDrawableState());
        return true;
    }

    private boolean k() {
        return this.f27366d != null;
    }

    void b() {
        Drawable background = this.f27363a.getBackground();
        if (background != null) {
            if (k() && a(background)) {
                return;
            }
            Z z10 = this.f27367e;
            if (z10 != null) {
                C3886k.i(background, z10, this.f27363a.getDrawableState());
                return;
            }
            Z z11 = this.f27366d;
            if (z11 != null) {
                C3886k.i(background, z11, this.f27363a.getDrawableState());
            }
        }
    }

    ColorStateList c() {
        Z z10 = this.f27367e;
        if (z10 != null) {
            return z10.f27308a;
        }
        return null;
    }

    PorterDuff.Mode d() {
        Z z10 = this.f27367e;
        if (z10 != null) {
            return z10.f27309b;
        }
        return null;
    }

    void e(AttributeSet attributeSet, int i10) {
        Context context = this.f27363a.getContext();
        int[] iArr = AbstractC5936j.f48213e3;
        b0 b0VarV = b0.v(context, attributeSet, iArr, i10, 0);
        View view = this.f27363a;
        F1.W.k0(view, view.getContext(), iArr, attributeSet, b0VarV.r(), i10, 0);
        try {
            int i11 = AbstractC5936j.f48218f3;
            if (b0VarV.s(i11)) {
                this.f27365c = b0VarV.n(i11, -1);
                ColorStateList colorStateListF = this.f27364b.f(this.f27363a.getContext(), this.f27365c);
                if (colorStateListF != null) {
                    h(colorStateListF);
                }
            }
            int i12 = AbstractC5936j.f48223g3;
            if (b0VarV.s(i12)) {
                F1.W.r0(this.f27363a, b0VarV.c(i12));
            }
            int i13 = AbstractC5936j.f48228h3;
            if (b0VarV.s(i13)) {
                F1.W.s0(this.f27363a, K.d(b0VarV.k(i13, -1), null));
            }
            b0VarV.x();
        } catch (Throwable th2) {
            b0VarV.x();
            throw th2;
        }
    }

    void f(Drawable drawable) {
        this.f27365c = -1;
        h(null);
        b();
    }

    void g(int i10) {
        this.f27365c = i10;
        C3886k c3886k = this.f27364b;
        h(c3886k != null ? c3886k.f(this.f27363a.getContext(), i10) : null);
        b();
    }

    void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f27366d == null) {
                this.f27366d = new Z();
            }
            Z z10 = this.f27366d;
            z10.f27308a = colorStateList;
            z10.f27311d = true;
        } else {
            this.f27366d = null;
        }
        b();
    }

    void i(ColorStateList colorStateList) {
        if (this.f27367e == null) {
            this.f27367e = new Z();
        }
        Z z10 = this.f27367e;
        z10.f27308a = colorStateList;
        z10.f27311d = true;
        b();
    }

    void j(PorterDuff.Mode mode) {
        if (this.f27367e == null) {
            this.f27367e = new Z();
        }
        Z z10 = this.f27367e;
        z10.f27309b = mode;
        z10.f27310c = true;
        b();
    }
}
