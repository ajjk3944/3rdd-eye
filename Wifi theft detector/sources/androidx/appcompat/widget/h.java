package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import androidx.core.view.ViewCompat;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final CompoundButton f1151a;

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f1152b = null;

    /* renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f1153c = null;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1154d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1155e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1156f;

    public h(CompoundButton compoundButton) {
        this.f1151a = compoundButton;
    }

    public void a() {
        Drawable drawableA = androidx.core.widget.c.a(this.f1151a);
        if (drawableA != null) {
            if (this.f1154d || this.f1155e) {
                Drawable drawableMutate = k0.a.r(drawableA).mutate();
                if (this.f1154d) {
                    k0.a.o(drawableMutate, this.f1152b);
                }
                if (this.f1155e) {
                    k0.a.p(drawableMutate, this.f1153c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f1151a.getDrawableState());
                }
                this.f1151a.setButtonDrawable(drawableMutate);
            }
        }
    }

    public ColorStateList b() {
        return this.f1152b;
    }

    public PorterDuff.Mode c() {
        return this.f1153c;
    }

    public void d(AttributeSet attributeSet, int i10) {
        int iN;
        int iN2;
        Context context = this.f1151a.getContext();
        int[] iArr = c.j.CompoundButton;
        z0 z0VarV = z0.v(context, attributeSet, iArr, i10, 0);
        CompoundButton compoundButton = this.f1151a;
        ViewCompat.h0(compoundButton, compoundButton.getContext(), iArr, attributeSet, z0VarV.r(), i10, 0);
        try {
            int i11 = c.j.CompoundButton_buttonCompat;
            if (!z0VarV.s(i11) || (iN2 = z0VarV.n(i11, 0)) == 0) {
                int i12 = c.j.CompoundButton_android_button;
                if (z0VarV.s(i12) && (iN = z0VarV.n(i12, 0)) != 0) {
                    CompoundButton compoundButton2 = this.f1151a;
                    compoundButton2.setButtonDrawable(d.a.b(compoundButton2.getContext(), iN));
                }
            } else {
                try {
                    CompoundButton compoundButton3 = this.f1151a;
                    compoundButton3.setButtonDrawable(d.a.b(compoundButton3.getContext(), iN2));
                } catch (Resources.NotFoundException unused) {
                }
            }
            int i13 = c.j.CompoundButton_buttonTint;
            if (z0VarV.s(i13)) {
                androidx.core.widget.c.d(this.f1151a, z0VarV.c(i13));
            }
            int i14 = c.j.CompoundButton_buttonTintMode;
            if (z0VarV.s(i14)) {
                androidx.core.widget.c.e(this.f1151a, j0.e(z0VarV.k(i14, -1), null));
            }
            z0VarV.x();
        } catch (Throwable th) {
            z0VarV.x();
            throw th;
        }
    }

    public void e() {
        if (this.f1156f) {
            this.f1156f = false;
        } else {
            this.f1156f = true;
            a();
        }
    }

    public void f(ColorStateList colorStateList) {
        this.f1152b = colorStateList;
        this.f1154d = true;
        a();
    }

    public void g(PorterDuff.Mode mode) {
        this.f1153c = mode;
        this.f1155e = true;
        a();
    }
}
