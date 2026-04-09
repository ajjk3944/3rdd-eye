package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import h.AbstractC5936j;
import i.AbstractC6050a;

/* renamed from: androidx.appcompat.widget.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3892q {

    /* renamed from: a, reason: collision with root package name */
    private final ImageView f27443a;

    /* renamed from: b, reason: collision with root package name */
    private Z f27444b;

    /* renamed from: c, reason: collision with root package name */
    private Z f27445c;

    /* renamed from: d, reason: collision with root package name */
    private Z f27446d;

    /* renamed from: e, reason: collision with root package name */
    private int f27447e = 0;

    public C3892q(ImageView imageView) {
        this.f27443a = imageView;
    }

    private boolean a(Drawable drawable) {
        if (this.f27446d == null) {
            this.f27446d = new Z();
        }
        Z z10 = this.f27446d;
        z10.a();
        ColorStateList colorStateListA = androidx.core.widget.e.a(this.f27443a);
        if (colorStateListA != null) {
            z10.f27311d = true;
            z10.f27308a = colorStateListA;
        }
        PorterDuff.Mode modeB = androidx.core.widget.e.b(this.f27443a);
        if (modeB != null) {
            z10.f27310c = true;
            z10.f27309b = modeB;
        }
        if (!z10.f27311d && !z10.f27310c) {
            return false;
        }
        C3886k.i(drawable, z10, this.f27443a.getDrawableState());
        return true;
    }

    private boolean l() {
        return this.f27444b != null;
    }

    void b() {
        if (this.f27443a.getDrawable() != null) {
            this.f27443a.getDrawable().setLevel(this.f27447e);
        }
    }

    void c() {
        Drawable drawable = this.f27443a.getDrawable();
        if (drawable != null) {
            K.b(drawable);
        }
        if (drawable != null) {
            if (l() && a(drawable)) {
                return;
            }
            Z z10 = this.f27445c;
            if (z10 != null) {
                C3886k.i(drawable, z10, this.f27443a.getDrawableState());
                return;
            }
            Z z11 = this.f27444b;
            if (z11 != null) {
                C3886k.i(drawable, z11, this.f27443a.getDrawableState());
            }
        }
    }

    ColorStateList d() {
        Z z10 = this.f27445c;
        if (z10 != null) {
            return z10.f27308a;
        }
        return null;
    }

    PorterDuff.Mode e() {
        Z z10 = this.f27445c;
        if (z10 != null) {
            return z10.f27309b;
        }
        return null;
    }

    boolean f() {
        return !(this.f27443a.getBackground() instanceof RippleDrawable);
    }

    public void g(AttributeSet attributeSet, int i10) {
        int iN;
        Context context = this.f27443a.getContext();
        int[] iArr = AbstractC5936j.f48145P;
        b0 b0VarV = b0.v(context, attributeSet, iArr, i10, 0);
        ImageView imageView = this.f27443a;
        F1.W.k0(imageView, imageView.getContext(), iArr, attributeSet, b0VarV.r(), i10, 0);
        try {
            Drawable drawable = this.f27443a.getDrawable();
            if (drawable == null && (iN = b0VarV.n(AbstractC5936j.f48149Q, -1)) != -1 && (drawable = AbstractC6050a.b(this.f27443a.getContext(), iN)) != null) {
                this.f27443a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                K.b(drawable);
            }
            int i11 = AbstractC5936j.f48153R;
            if (b0VarV.s(i11)) {
                androidx.core.widget.e.c(this.f27443a, b0VarV.c(i11));
            }
            int i12 = AbstractC5936j.f48157S;
            if (b0VarV.s(i12)) {
                androidx.core.widget.e.d(this.f27443a, K.d(b0VarV.k(i12, -1), null));
            }
            b0VarV.x();
        } catch (Throwable th2) {
            b0VarV.x();
            throw th2;
        }
    }

    void h(Drawable drawable) {
        this.f27447e = drawable.getLevel();
    }

    public void i(int i10) {
        if (i10 != 0) {
            Drawable drawableB = AbstractC6050a.b(this.f27443a.getContext(), i10);
            if (drawableB != null) {
                K.b(drawableB);
            }
            this.f27443a.setImageDrawable(drawableB);
        } else {
            this.f27443a.setImageDrawable(null);
        }
        c();
    }

    void j(ColorStateList colorStateList) {
        if (this.f27445c == null) {
            this.f27445c = new Z();
        }
        Z z10 = this.f27445c;
        z10.f27308a = colorStateList;
        z10.f27311d = true;
        c();
    }

    void k(PorterDuff.Mode mode) {
        if (this.f27445c == null) {
            this.f27445c = new Z();
        }
        Z z10 = this.f27445c;
        z10.f27309b = mode;
        z10.f27310c = true;
        c();
    }
}
