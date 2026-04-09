package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes.dex */
class e {

    /* renamed from: a, reason: collision with root package name */
    private final View f924a;

    /* renamed from: d, reason: collision with root package name */
    private u0 f927d;

    /* renamed from: e, reason: collision with root package name */
    private u0 f928e;

    /* renamed from: f, reason: collision with root package name */
    private u0 f929f;

    /* renamed from: c, reason: collision with root package name */
    private int f926c = -1;

    /* renamed from: b, reason: collision with root package name */
    private final j f925b = j.b();

    e(View view) {
        this.f924a = view;
    }

    private boolean a(Drawable drawable) {
        if (this.f929f == null) {
            this.f929f = new u0();
        }
        u0 u0Var = this.f929f;
        u0Var.a();
        ColorStateList colorStateListM = a0.s.m(this.f924a);
        if (colorStateListM != null) {
            u0Var.f1135d = true;
            u0Var.f1132a = colorStateListM;
        }
        PorterDuff.Mode modeN = a0.s.n(this.f924a);
        if (modeN != null) {
            u0Var.f1134c = true;
            u0Var.f1133b = modeN;
        }
        if (!u0Var.f1135d && !u0Var.f1134c) {
            return false;
        }
        j.i(drawable, u0Var, this.f924a.getDrawableState());
        return true;
    }

    private boolean k() {
        int i2 = Build.VERSION.SDK_INT;
        return i2 > 21 ? this.f927d != null : i2 == 21;
    }

    void b() {
        Drawable background = this.f924a.getBackground();
        if (background != null) {
            if (k() && a(background)) {
                return;
            }
            u0 u0Var = this.f928e;
            if (u0Var != null) {
                j.i(background, u0Var, this.f924a.getDrawableState());
                return;
            }
            u0 u0Var2 = this.f927d;
            if (u0Var2 != null) {
                j.i(background, u0Var2, this.f924a.getDrawableState());
            }
        }
    }

    ColorStateList c() {
        u0 u0Var = this.f928e;
        if (u0Var != null) {
            return u0Var.f1132a;
        }
        return null;
    }

    PorterDuff.Mode d() {
        u0 u0Var = this.f928e;
        if (u0Var != null) {
            return u0Var.f1133b;
        }
        return null;
    }

    void e(AttributeSet attributeSet, int i2) {
        w0 w0VarT = w0.t(this.f924a.getContext(), attributeSet, a.j.D3, i2, 0);
        try {
            int i3 = a.j.E3;
            if (w0VarT.q(i3)) {
                this.f926c = w0VarT.m(i3, -1);
                ColorStateList colorStateListF = this.f925b.f(this.f924a.getContext(), this.f926c);
                if (colorStateListF != null) {
                    h(colorStateListF);
                }
            }
            int i4 = a.j.F3;
            if (w0VarT.q(i4)) {
                a0.s.S(this.f924a, w0VarT.c(i4));
            }
            int i5 = a.j.G3;
            if (w0VarT.q(i5)) {
                a0.s.T(this.f924a, e0.d(w0VarT.j(i5, -1), null));
            }
        } finally {
            w0VarT.u();
        }
    }

    void f(Drawable drawable) {
        this.f926c = -1;
        h(null);
        b();
    }

    void g(int i2) {
        this.f926c = i2;
        j jVar = this.f925b;
        h(jVar != null ? jVar.f(this.f924a.getContext(), i2) : null);
        b();
    }

    void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f927d == null) {
                this.f927d = new u0();
            }
            u0 u0Var = this.f927d;
            u0Var.f1132a = colorStateList;
            u0Var.f1135d = true;
        } else {
            this.f927d = null;
        }
        b();
    }

    void i(ColorStateList colorStateList) {
        if (this.f928e == null) {
            this.f928e = new u0();
        }
        u0 u0Var = this.f928e;
        u0Var.f1132a = colorStateList;
        u0Var.f1135d = true;
        b();
    }

    void j(PorterDuff.Mode mode) {
        if (this.f928e == null) {
            this.f928e = new u0();
        }
        u0 u0Var = this.f928e;
        u0Var.f1133b = mode;
        u0Var.f1134c = true;
        b();
    }
}
