package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.ViewCompat;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final View f1107a;

    /* renamed from: d, reason: collision with root package name */
    public x0 f1110d;

    /* renamed from: e, reason: collision with root package name */
    public x0 f1111e;

    /* renamed from: f, reason: collision with root package name */
    public x0 f1112f;

    /* renamed from: c, reason: collision with root package name */
    public int f1109c = -1;

    /* renamed from: b, reason: collision with root package name */
    public final i f1108b = i.b();

    public d(View view) {
        this.f1107a = view;
    }

    public final boolean a(Drawable drawable) {
        if (this.f1112f == null) {
            this.f1112f = new x0();
        }
        x0 x0Var = this.f1112f;
        x0Var.a();
        ColorStateList colorStateListQ = ViewCompat.q(this.f1107a);
        if (colorStateListQ != null) {
            x0Var.f1385d = true;
            x0Var.f1382a = colorStateListQ;
        }
        PorterDuff.Mode modeR = ViewCompat.r(this.f1107a);
        if (modeR != null) {
            x0Var.f1384c = true;
            x0Var.f1383b = modeR;
        }
        if (!x0Var.f1385d && !x0Var.f1384c) {
            return false;
        }
        i.i(drawable, x0Var, this.f1107a.getDrawableState());
        return true;
    }

    public void b() {
        Drawable background = this.f1107a.getBackground();
        if (background != null) {
            if (k() && a(background)) {
                return;
            }
            x0 x0Var = this.f1111e;
            if (x0Var != null) {
                i.i(background, x0Var, this.f1107a.getDrawableState());
                return;
            }
            x0 x0Var2 = this.f1110d;
            if (x0Var2 != null) {
                i.i(background, x0Var2, this.f1107a.getDrawableState());
            }
        }
    }

    public ColorStateList c() {
        x0 x0Var = this.f1111e;
        if (x0Var != null) {
            return x0Var.f1382a;
        }
        return null;
    }

    public PorterDuff.Mode d() {
        x0 x0Var = this.f1111e;
        if (x0Var != null) {
            return x0Var.f1383b;
        }
        return null;
    }

    public void e(AttributeSet attributeSet, int i10) {
        Context context = this.f1107a.getContext();
        int[] iArr = c.j.ViewBackgroundHelper;
        z0 z0VarV = z0.v(context, attributeSet, iArr, i10, 0);
        View view = this.f1107a;
        ViewCompat.h0(view, view.getContext(), iArr, attributeSet, z0VarV.r(), i10, 0);
        try {
            int i11 = c.j.ViewBackgroundHelper_android_background;
            if (z0VarV.s(i11)) {
                this.f1109c = z0VarV.n(i11, -1);
                ColorStateList colorStateListF = this.f1108b.f(this.f1107a.getContext(), this.f1109c);
                if (colorStateListF != null) {
                    h(colorStateListF);
                }
            }
            int i12 = c.j.ViewBackgroundHelper_backgroundTint;
            if (z0VarV.s(i12)) {
                ViewCompat.n0(this.f1107a, z0VarV.c(i12));
            }
            int i13 = c.j.ViewBackgroundHelper_backgroundTintMode;
            if (z0VarV.s(i13)) {
                ViewCompat.o0(this.f1107a, j0.e(z0VarV.k(i13, -1), null));
            }
            z0VarV.x();
        } catch (Throwable th) {
            z0VarV.x();
            throw th;
        }
    }

    public void f(Drawable drawable) {
        this.f1109c = -1;
        h(null);
        b();
    }

    public void g(int i10) {
        this.f1109c = i10;
        i iVar = this.f1108b;
        h(iVar != null ? iVar.f(this.f1107a.getContext(), i10) : null);
        b();
    }

    public void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f1110d == null) {
                this.f1110d = new x0();
            }
            x0 x0Var = this.f1110d;
            x0Var.f1382a = colorStateList;
            x0Var.f1385d = true;
        } else {
            this.f1110d = null;
        }
        b();
    }

    public void i(ColorStateList colorStateList) {
        if (this.f1111e == null) {
            this.f1111e = new x0();
        }
        x0 x0Var = this.f1111e;
        x0Var.f1382a = colorStateList;
        x0Var.f1385d = true;
        b();
    }

    public void j(PorterDuff.Mode mode) {
        if (this.f1111e == null) {
            this.f1111e = new x0();
        }
        x0 x0Var = this.f1111e;
        x0Var.f1383b = mode;
        x0Var.f1384c = true;
        b();
    }

    public final boolean k() {
        return this.f1110d != null;
    }
}
