package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckedTextView;
import androidx.core.view.ViewCompat;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final CheckedTextView f1144a;

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f1145b = null;

    /* renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f1146c = null;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1147d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1148e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1149f;

    public g(CheckedTextView checkedTextView) {
        this.f1144a = checkedTextView;
    }

    public void a() {
        Drawable drawableA = androidx.core.widget.b.a(this.f1144a);
        if (drawableA != null) {
            if (this.f1147d || this.f1148e) {
                Drawable drawableMutate = k0.a.r(drawableA).mutate();
                if (this.f1147d) {
                    k0.a.o(drawableMutate, this.f1145b);
                }
                if (this.f1148e) {
                    k0.a.p(drawableMutate, this.f1146c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f1144a.getDrawableState());
                }
                this.f1144a.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    public ColorStateList b() {
        return this.f1145b;
    }

    public PorterDuff.Mode c() {
        return this.f1146c;
    }

    public void d(AttributeSet attributeSet, int i10) {
        int iN;
        int iN2;
        Context context = this.f1144a.getContext();
        int[] iArr = c.j.CheckedTextView;
        z0 z0VarV = z0.v(context, attributeSet, iArr, i10, 0);
        CheckedTextView checkedTextView = this.f1144a;
        ViewCompat.h0(checkedTextView, checkedTextView.getContext(), iArr, attributeSet, z0VarV.r(), i10, 0);
        try {
            int i11 = c.j.CheckedTextView_checkMarkCompat;
            if (!z0VarV.s(i11) || (iN2 = z0VarV.n(i11, 0)) == 0) {
                int i12 = c.j.CheckedTextView_android_checkMark;
                if (z0VarV.s(i12) && (iN = z0VarV.n(i12, 0)) != 0) {
                    CheckedTextView checkedTextView2 = this.f1144a;
                    checkedTextView2.setCheckMarkDrawable(d.a.b(checkedTextView2.getContext(), iN));
                }
            } else {
                try {
                    CheckedTextView checkedTextView3 = this.f1144a;
                    checkedTextView3.setCheckMarkDrawable(d.a.b(checkedTextView3.getContext(), iN2));
                } catch (Resources.NotFoundException unused) {
                }
            }
            int i13 = c.j.CheckedTextView_checkMarkTint;
            if (z0VarV.s(i13)) {
                androidx.core.widget.b.b(this.f1144a, z0VarV.c(i13));
            }
            int i14 = c.j.CheckedTextView_checkMarkTintMode;
            if (z0VarV.s(i14)) {
                androidx.core.widget.b.c(this.f1144a, j0.e(z0VarV.k(i14, -1), null));
            }
            z0VarV.x();
        } catch (Throwable th) {
            z0VarV.x();
            throw th;
        }
    }

    public void e() {
        if (this.f1149f) {
            this.f1149f = false;
        } else {
            this.f1149f = true;
            a();
        }
    }

    public void f(ColorStateList colorStateList) {
        this.f1145b = colorStateList;
        this.f1147d = true;
        a();
    }

    public void g(PorterDuff.Mode mode) {
        this.f1146c = mode;
        this.f1148e = true;
        a();
    }
}
