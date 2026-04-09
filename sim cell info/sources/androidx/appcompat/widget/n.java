package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    private final ImageView f1051a;

    /* renamed from: b, reason: collision with root package name */
    private u0 f1052b;

    /* renamed from: c, reason: collision with root package name */
    private u0 f1053c;

    /* renamed from: d, reason: collision with root package name */
    private u0 f1054d;

    public n(ImageView imageView) {
        this.f1051a = imageView;
    }

    private boolean a(Drawable drawable) {
        if (this.f1054d == null) {
            this.f1054d = new u0();
        }
        u0 u0Var = this.f1054d;
        u0Var.a();
        ColorStateList colorStateListA = androidx.core.widget.e.a(this.f1051a);
        if (colorStateListA != null) {
            u0Var.f1135d = true;
            u0Var.f1132a = colorStateListA;
        }
        PorterDuff.Mode modeB = androidx.core.widget.e.b(this.f1051a);
        if (modeB != null) {
            u0Var.f1134c = true;
            u0Var.f1133b = modeB;
        }
        if (!u0Var.f1135d && !u0Var.f1134c) {
            return false;
        }
        j.i(drawable, u0Var, this.f1051a.getDrawableState());
        return true;
    }

    private boolean j() {
        int i2 = Build.VERSION.SDK_INT;
        return i2 > 21 ? this.f1052b != null : i2 == 21;
    }

    void b() {
        Drawable drawable = this.f1051a.getDrawable();
        if (drawable != null) {
            e0.b(drawable);
        }
        if (drawable != null) {
            if (j() && a(drawable)) {
                return;
            }
            u0 u0Var = this.f1053c;
            if (u0Var != null) {
                j.i(drawable, u0Var, this.f1051a.getDrawableState());
                return;
            }
            u0 u0Var2 = this.f1052b;
            if (u0Var2 != null) {
                j.i(drawable, u0Var2, this.f1051a.getDrawableState());
            }
        }
    }

    ColorStateList c() {
        u0 u0Var = this.f1053c;
        if (u0Var != null) {
            return u0Var.f1132a;
        }
        return null;
    }

    PorterDuff.Mode d() {
        u0 u0Var = this.f1053c;
        if (u0Var != null) {
            return u0Var.f1133b;
        }
        return null;
    }

    boolean e() {
        return Build.VERSION.SDK_INT < 21 || !(this.f1051a.getBackground() instanceof RippleDrawable);
    }

    public void f(AttributeSet attributeSet, int i2) {
        int iM;
        w0 w0VarT = w0.t(this.f1051a.getContext(), attributeSet, a.j.R, i2, 0);
        try {
            Drawable drawable = this.f1051a.getDrawable();
            if (drawable == null && (iM = w0VarT.m(a.j.S, -1)) != -1 && (drawable = c.a.d(this.f1051a.getContext(), iM)) != null) {
                this.f1051a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                e0.b(drawable);
            }
            int i3 = a.j.T;
            if (w0VarT.q(i3)) {
                androidx.core.widget.e.c(this.f1051a, w0VarT.c(i3));
            }
            int i4 = a.j.U;
            if (w0VarT.q(i4)) {
                androidx.core.widget.e.d(this.f1051a, e0.d(w0VarT.j(i4, -1), null));
            }
        } finally {
            w0VarT.u();
        }
    }

    public void g(int i2) {
        if (i2 != 0) {
            Drawable drawableD = c.a.d(this.f1051a.getContext(), i2);
            if (drawableD != null) {
                e0.b(drawableD);
            }
            this.f1051a.setImageDrawable(drawableD);
        } else {
            this.f1051a.setImageDrawable(null);
        }
        b();
    }

    void h(ColorStateList colorStateList) {
        if (this.f1053c == null) {
            this.f1053c = new u0();
        }
        u0 u0Var = this.f1053c;
        u0Var.f1132a = colorStateList;
        u0Var.f1135d = true;
        b();
    }

    void i(PorterDuff.Mode mode) {
        if (this.f1053c == null) {
            this.f1053c = new u0();
        }
        u0 u0Var = this.f1053c;
        u0Var.f1133b = mode;
        u0Var.f1134c = true;
        b();
    }
}
