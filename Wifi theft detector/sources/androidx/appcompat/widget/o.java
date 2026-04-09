package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;

/* loaded from: classes.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public final ImageView f1277a;

    /* renamed from: b, reason: collision with root package name */
    public x0 f1278b;

    /* renamed from: c, reason: collision with root package name */
    public x0 f1279c;

    /* renamed from: d, reason: collision with root package name */
    public x0 f1280d;

    /* renamed from: e, reason: collision with root package name */
    public int f1281e = 0;

    public o(ImageView imageView) {
        this.f1277a = imageView;
    }

    public final boolean a(Drawable drawable) {
        if (this.f1280d == null) {
            this.f1280d = new x0();
        }
        x0 x0Var = this.f1280d;
        x0Var.a();
        ColorStateList colorStateListA = androidx.core.widget.e.a(this.f1277a);
        if (colorStateListA != null) {
            x0Var.f1385d = true;
            x0Var.f1382a = colorStateListA;
        }
        PorterDuff.Mode modeB = androidx.core.widget.e.b(this.f1277a);
        if (modeB != null) {
            x0Var.f1384c = true;
            x0Var.f1383b = modeB;
        }
        if (!x0Var.f1385d && !x0Var.f1384c) {
            return false;
        }
        i.i(drawable, x0Var, this.f1277a.getDrawableState());
        return true;
    }

    public void b() {
        if (this.f1277a.getDrawable() != null) {
            this.f1277a.getDrawable().setLevel(this.f1281e);
        }
    }

    public void c() {
        Drawable drawable = this.f1277a.getDrawable();
        if (drawable != null) {
            j0.b(drawable);
        }
        if (drawable != null) {
            if (l() && a(drawable)) {
                return;
            }
            x0 x0Var = this.f1279c;
            if (x0Var != null) {
                i.i(drawable, x0Var, this.f1277a.getDrawableState());
                return;
            }
            x0 x0Var2 = this.f1278b;
            if (x0Var2 != null) {
                i.i(drawable, x0Var2, this.f1277a.getDrawableState());
            }
        }
    }

    public ColorStateList d() {
        x0 x0Var = this.f1279c;
        if (x0Var != null) {
            return x0Var.f1382a;
        }
        return null;
    }

    public PorterDuff.Mode e() {
        x0 x0Var = this.f1279c;
        if (x0Var != null) {
            return x0Var.f1383b;
        }
        return null;
    }

    public boolean f() {
        return !(this.f1277a.getBackground() instanceof RippleDrawable);
    }

    public void g(AttributeSet attributeSet, int i10) {
        int iN;
        Context context = this.f1277a.getContext();
        int[] iArr = c.j.AppCompatImageView;
        z0 z0VarV = z0.v(context, attributeSet, iArr, i10, 0);
        ImageView imageView = this.f1277a;
        ViewCompat.h0(imageView, imageView.getContext(), iArr, attributeSet, z0VarV.r(), i10, 0);
        try {
            Drawable drawable = this.f1277a.getDrawable();
            if (drawable == null && (iN = z0VarV.n(c.j.AppCompatImageView_srcCompat, -1)) != -1 && (drawable = d.a.b(this.f1277a.getContext(), iN)) != null) {
                this.f1277a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                j0.b(drawable);
            }
            int i11 = c.j.AppCompatImageView_tint;
            if (z0VarV.s(i11)) {
                androidx.core.widget.e.c(this.f1277a, z0VarV.c(i11));
            }
            int i12 = c.j.AppCompatImageView_tintMode;
            if (z0VarV.s(i12)) {
                androidx.core.widget.e.d(this.f1277a, j0.e(z0VarV.k(i12, -1), null));
            }
            z0VarV.x();
        } catch (Throwable th) {
            z0VarV.x();
            throw th;
        }
    }

    public void h(Drawable drawable) {
        this.f1281e = drawable.getLevel();
    }

    public void i(int i10) {
        if (i10 != 0) {
            Drawable drawableB = d.a.b(this.f1277a.getContext(), i10);
            if (drawableB != null) {
                j0.b(drawableB);
            }
            this.f1277a.setImageDrawable(drawableB);
        } else {
            this.f1277a.setImageDrawable(null);
        }
        c();
    }

    public void j(ColorStateList colorStateList) {
        if (this.f1279c == null) {
            this.f1279c = new x0();
        }
        x0 x0Var = this.f1279c;
        x0Var.f1382a = colorStateList;
        x0Var.f1385d = true;
        c();
    }

    public void k(PorterDuff.Mode mode) {
        if (this.f1279c == null) {
            this.f1279c = new x0();
        }
        x0 x0Var = this.f1279c;
        x0Var.f1383b = mode;
        x0Var.f1384c = true;
        c();
    }

    public final boolean l() {
        return this.f1278b != null;
    }
}
