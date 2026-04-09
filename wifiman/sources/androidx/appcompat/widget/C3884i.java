package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckedTextView;
import h.AbstractC5936j;
import i.AbstractC6050a;
import x1.AbstractC8416a;

/* renamed from: androidx.appcompat.widget.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C3884i {

    /* renamed from: a, reason: collision with root package name */
    private final CheckedTextView f27405a;

    /* renamed from: b, reason: collision with root package name */
    private ColorStateList f27406b = null;

    /* renamed from: c, reason: collision with root package name */
    private PorterDuff.Mode f27407c = null;

    /* renamed from: d, reason: collision with root package name */
    private boolean f27408d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f27409e = false;

    /* renamed from: f, reason: collision with root package name */
    private boolean f27410f;

    C3884i(CheckedTextView checkedTextView) {
        this.f27405a = checkedTextView;
    }

    void a() {
        Drawable drawableA = androidx.core.widget.b.a(this.f27405a);
        if (drawableA != null) {
            if (this.f27408d || this.f27409e) {
                Drawable drawableMutate = AbstractC8416a.r(drawableA).mutate();
                if (this.f27408d) {
                    AbstractC8416a.o(drawableMutate, this.f27406b);
                }
                if (this.f27409e) {
                    AbstractC8416a.p(drawableMutate, this.f27407c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f27405a.getDrawableState());
                }
                this.f27405a.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    ColorStateList b() {
        return this.f27406b;
    }

    PorterDuff.Mode c() {
        return this.f27407c;
    }

    void d(AttributeSet attributeSet, int i10) {
        int iN;
        int iN2;
        Context context = this.f27405a.getContext();
        int[] iArr = AbstractC5936j.f48146P0;
        b0 b0VarV = b0.v(context, attributeSet, iArr, i10, 0);
        CheckedTextView checkedTextView = this.f27405a;
        F1.W.k0(checkedTextView, checkedTextView.getContext(), iArr, attributeSet, b0VarV.r(), i10, 0);
        try {
            int i11 = AbstractC5936j.f48154R0;
            if (!b0VarV.s(i11) || (iN2 = b0VarV.n(i11, 0)) == 0) {
                int i12 = AbstractC5936j.f48150Q0;
                if (b0VarV.s(i12) && (iN = b0VarV.n(i12, 0)) != 0) {
                    CheckedTextView checkedTextView2 = this.f27405a;
                    checkedTextView2.setCheckMarkDrawable(AbstractC6050a.b(checkedTextView2.getContext(), iN));
                }
            } else {
                try {
                    CheckedTextView checkedTextView3 = this.f27405a;
                    checkedTextView3.setCheckMarkDrawable(AbstractC6050a.b(checkedTextView3.getContext(), iN2));
                } catch (Resources.NotFoundException unused) {
                }
            }
            int i13 = AbstractC5936j.f48158S0;
            if (b0VarV.s(i13)) {
                androidx.core.widget.b.b(this.f27405a, b0VarV.c(i13));
            }
            int i14 = AbstractC5936j.f48162T0;
            if (b0VarV.s(i14)) {
                androidx.core.widget.b.c(this.f27405a, K.d(b0VarV.k(i14, -1), null));
            }
        } finally {
            b0VarV.x();
        }
    }

    void e() {
        if (this.f27410f) {
            this.f27410f = false;
        } else {
            this.f27410f = true;
            a();
        }
    }

    void f(ColorStateList colorStateList) {
        this.f27406b = colorStateList;
        this.f27408d = true;
        a();
    }

    void g(PorterDuff.Mode mode) {
        this.f27407c = mode;
        this.f27409e = true;
        a();
    }
}
