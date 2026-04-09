package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import com.google.android.gms.internal.ads.be1;
import com.liuzh.deviceinfo.R;
import j4.k;
import j4.l;
import jm.a;
import p.d3;
import p.e3;
import p.r;
import p.t0;
import p.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class AppCompatCheckBox extends CheckBox implements k, l {

    /* renamed from: a, reason: collision with root package name */
    public final r f757a;

    /* renamed from: b, reason: collision with root package name */
    public final be1 f758b;

    /* renamed from: c, reason: collision with root package name */
    public final t0 f759c;

    /* renamed from: d, reason: collision with root package name */
    public u f760d;

    public AppCompatCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkboxStyle);
    }

    private u getEmojiTextViewHelper() {
        if (this.f760d == null) {
            this.f760d = new u(this);
        }
        return this.f760d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        be1 be1Var = this.f758b;
        if (be1Var != null) {
            be1Var.a();
        }
        t0 t0Var = this.f759c;
        if (t0Var != null) {
            t0Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        be1 be1Var = this.f758b;
        if (be1Var != null) {
            return be1Var.u();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        be1 be1Var = this.f758b;
        if (be1Var != null) {
            return be1Var.v();
        }
        return null;
    }

    @Override // j4.k
    public ColorStateList getSupportButtonTintList() {
        r rVar = this.f757a;
        if (rVar != null) {
            return (ColorStateList) rVar.f30835a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        r rVar = this.f757a;
        if (rVar != null) {
            return (PorterDuff.Mode) rVar.f30836b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f759c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f759c.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z3) {
        super.setAllCaps(z3);
        getEmojiTextViewHelper().c(z3);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        be1 be1Var = this.f758b;
        if (be1Var != null) {
            be1Var.z();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i4) {
        super.setBackgroundResource(i4);
        be1 be1Var = this.f758b;
        if (be1Var != null) {
            be1Var.A(i4);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        r rVar = this.f757a;
        if (rVar != null) {
            if (rVar.f30839e) {
                rVar.f30839e = false;
            } else {
                rVar.f30839e = true;
                rVar.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        t0 t0Var = this.f759c;
        if (t0Var != null) {
            t0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        t0 t0Var = this.f759c;
        if (t0Var != null) {
            t0Var.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z3) {
        getEmojiTextViewHelper().d(z3);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        be1 be1Var = this.f758b;
        if (be1Var != null) {
            be1Var.F(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        be1 be1Var = this.f758b;
        if (be1Var != null) {
            be1Var.G(mode);
        }
    }

    @Override // j4.k
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        r rVar = this.f757a;
        if (rVar != null) {
            rVar.f30835a = colorStateList;
            rVar.f30837c = true;
            rVar.a();
        }
    }

    @Override // j4.k
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        r rVar = this.f757a;
        if (rVar != null) {
            rVar.f30836b = mode;
            rVar.f30838d = true;
            rVar.a();
        }
    }

    @Override // j4.l
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        t0 t0Var = this.f759c;
        t0Var.k(colorStateList);
        t0Var.b();
    }

    @Override // j4.l
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        t0 t0Var = this.f759c;
        t0Var.l(mode);
        t0Var.b();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatCheckBox(Context context, AttributeSet attributeSet, int i4) throws Resources.NotFoundException {
        super(context, attributeSet, i4);
        e3.a(context);
        d3.a(getContext(), this);
        r rVar = new r(this);
        this.f757a = rVar;
        rVar.d(attributeSet, i4);
        be1 be1Var = new be1(this);
        this.f758b = be1Var;
        be1Var.x(attributeSet, i4);
        t0 t0Var = new t0(this);
        this.f759c = t0Var;
        t0Var.f(attributeSet, i4);
        getEmojiTextViewHelper().b(attributeSet, i4);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i4) {
        setButtonDrawable(a.l(i4, getContext()));
    }
}
