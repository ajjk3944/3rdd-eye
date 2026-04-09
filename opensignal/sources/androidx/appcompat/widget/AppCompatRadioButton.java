package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import n0.i1;
import p.h2;
import p.i2;
import p.m0;
import p.s;
import y3.i;

/* loaded from: classes.dex */
public class AppCompatRadioButton extends RadioButton implements i {

    /* renamed from: a, reason: collision with root package name */
    public final i1 f964a;

    /* renamed from: d, reason: collision with root package name */
    public final h7.b f965d;

    /* renamed from: g, reason: collision with root package name */
    public final m0 f966g;

    /* renamed from: r, reason: collision with root package name */
    public s f967r;

    public AppCompatRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, h.a.radioButtonStyle);
    }

    private s getEmojiTextViewHelper() {
        if (this.f967r == null) {
            this.f967r = new s(this);
        }
        return this.f967r;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        h7.b bVar = this.f965d;
        if (bVar != null) {
            bVar.a();
        }
        m0 m0Var = this.f966g;
        if (m0Var != null) {
            m0Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        h7.b bVar = this.f965d;
        if (bVar != null) {
            return bVar.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        h7.b bVar = this.f965d;
        if (bVar != null) {
            return bVar.i();
        }
        return null;
    }

    @Override // y3.i
    public ColorStateList getSupportButtonTintList() {
        i1 i1Var = this.f964a;
        if (i1Var != null) {
            return (ColorStateList) i1Var.f17187e;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        i1 i1Var = this.f964a;
        if (i1Var != null) {
            return (PorterDuff.Mode) i1Var.f17188f;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f966g.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f966g.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().c(z10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        h7.b bVar = this.f965d;
        if (bVar != null) {
            bVar.m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        h7.b bVar = this.f965d;
        if (bVar != null) {
            bVar.n(i10);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        i1 i1Var = this.f964a;
        if (i1Var != null) {
            if (i1Var.f17185c) {
                i1Var.f17185c = false;
            } else {
                i1Var.f17185c = true;
                i1Var.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        m0 m0Var = this.f966g;
        if (m0Var != null) {
            m0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        m0 m0Var = this.f966g;
        if (m0Var != null) {
            m0Var.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        h7.b bVar = this.f965d;
        if (bVar != null) {
            bVar.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        h7.b bVar = this.f965d;
        if (bVar != null) {
            bVar.t(mode);
        }
    }

    @Override // y3.i
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        i1 i1Var = this.f964a;
        if (i1Var != null) {
            i1Var.f17187e = colorStateList;
            i1Var.f17183a = true;
            i1Var.a();
        }
    }

    @Override // y3.i
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        i1 i1Var = this.f964a;
        if (i1Var != null) {
            i1Var.f17188f = mode;
            i1Var.f17184b = true;
            i1Var.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        m0 m0Var = this.f966g;
        m0Var.k(colorStateList);
        m0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        m0 m0Var = this.f966g;
        m0Var.l(mode);
        m0Var.b();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatRadioButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        i2.a(context);
        h2.a(getContext(), this);
        i1 i1Var = new i1(this);
        this.f964a = i1Var;
        i1Var.d(attributeSet, i10);
        h7.b bVar = new h7.b(this);
        this.f965d = bVar;
        bVar.k(attributeSet, i10);
        m0 m0Var = new m0(this);
        this.f966g = m0Var;
        m0Var.f(attributeSet, i10);
        getEmojiTextViewHelper().b(attributeSet, i10);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i10) {
        setButtonDrawable(ic.a.r(getContext(), i10));
    }
}
