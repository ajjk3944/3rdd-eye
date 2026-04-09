package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import h.AbstractC5936j;
import i.AbstractC6050a;
import x1.AbstractC8416a;

/* renamed from: androidx.appcompat.widget.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C3885j {

    /* renamed from: a, reason: collision with root package name */
    private final CompoundButton f27414a;

    /* renamed from: b, reason: collision with root package name */
    private ColorStateList f27415b = null;

    /* renamed from: c, reason: collision with root package name */
    private PorterDuff.Mode f27416c = null;

    /* renamed from: d, reason: collision with root package name */
    private boolean f27417d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f27418e = false;

    /* renamed from: f, reason: collision with root package name */
    private boolean f27419f;

    C3885j(CompoundButton compoundButton) {
        this.f27414a = compoundButton;
    }

    void a() {
        Drawable drawableA = androidx.core.widget.c.a(this.f27414a);
        if (drawableA != null) {
            if (this.f27417d || this.f27418e) {
                Drawable drawableMutate = AbstractC8416a.r(drawableA).mutate();
                if (this.f27417d) {
                    AbstractC8416a.o(drawableMutate, this.f27415b);
                }
                if (this.f27418e) {
                    AbstractC8416a.p(drawableMutate, this.f27416c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f27414a.getDrawableState());
                }
                this.f27414a.setButtonDrawable(drawableMutate);
            }
        }
    }

    ColorStateList b() {
        return this.f27415b;
    }

    PorterDuff.Mode c() {
        return this.f27416c;
    }

    void d(AttributeSet attributeSet, int i10) {
        int iN;
        int iN2;
        Context context = this.f27414a.getContext();
        int[] iArr = AbstractC5936j.f48166U0;
        b0 b0VarV = b0.v(context, attributeSet, iArr, i10, 0);
        CompoundButton compoundButton = this.f27414a;
        F1.W.k0(compoundButton, compoundButton.getContext(), iArr, attributeSet, b0VarV.r(), i10, 0);
        try {
            int i11 = AbstractC5936j.f48174W0;
            if (!b0VarV.s(i11) || (iN2 = b0VarV.n(i11, 0)) == 0) {
                int i12 = AbstractC5936j.f48170V0;
                if (b0VarV.s(i12) && (iN = b0VarV.n(i12, 0)) != 0) {
                    CompoundButton compoundButton2 = this.f27414a;
                    compoundButton2.setButtonDrawable(AbstractC6050a.b(compoundButton2.getContext(), iN));
                }
            } else {
                try {
                    CompoundButton compoundButton3 = this.f27414a;
                    compoundButton3.setButtonDrawable(AbstractC6050a.b(compoundButton3.getContext(), iN2));
                } catch (Resources.NotFoundException unused) {
                }
            }
            int i13 = AbstractC5936j.f48178X0;
            if (b0VarV.s(i13)) {
                androidx.core.widget.c.d(this.f27414a, b0VarV.c(i13));
            }
            int i14 = AbstractC5936j.f48182Y0;
            if (b0VarV.s(i14)) {
                androidx.core.widget.c.e(this.f27414a, K.d(b0VarV.k(i14, -1), null));
            }
        } finally {
            b0VarV.x();
        }
    }

    void e() {
        if (this.f27419f) {
            this.f27419f = false;
        } else {
            this.f27419f = true;
            a();
        }
    }

    void f(ColorStateList colorStateList) {
        this.f27415b = colorStateList;
        this.f27417d = true;
        a();
    }

    void g(PorterDuff.Mode mode) {
        this.f27416c = mode;
        this.f27418e = true;
        a();
    }
}
