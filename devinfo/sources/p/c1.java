package p;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;
import com.google.android.gms.internal.ads.be1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c1 extends ToggleButton implements j4.l {

    /* renamed from: a, reason: collision with root package name */
    public final be1 f30673a;

    /* renamed from: b, reason: collision with root package name */
    public final t0 f30674b;

    /* renamed from: c, reason: collision with root package name */
    public u f30675c;

    public c1(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet, R.attr.buttonStyleToggle);
        d3.a(getContext(), this);
        be1 be1Var = new be1(this);
        this.f30673a = be1Var;
        be1Var.x(attributeSet, R.attr.buttonStyleToggle);
        t0 t0Var = new t0(this);
        this.f30674b = t0Var;
        t0Var.f(attributeSet, R.attr.buttonStyleToggle);
        getEmojiTextViewHelper().b(attributeSet, R.attr.buttonStyleToggle);
    }

    private u getEmojiTextViewHelper() {
        if (this.f30675c == null) {
            this.f30675c = new u(this);
        }
        return this.f30675c;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        be1 be1Var = this.f30673a;
        if (be1Var != null) {
            be1Var.a();
        }
        t0 t0Var = this.f30674b;
        if (t0Var != null) {
            t0Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        be1 be1Var = this.f30673a;
        if (be1Var != null) {
            return be1Var.u();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        be1 be1Var = this.f30673a;
        if (be1Var != null) {
            return be1Var.v();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f30674b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f30674b.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z3) {
        super.setAllCaps(z3);
        getEmojiTextViewHelper().c(z3);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        be1 be1Var = this.f30673a;
        if (be1Var != null) {
            be1Var.z();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i4) {
        super.setBackgroundResource(i4);
        be1 be1Var = this.f30673a;
        if (be1Var != null) {
            be1Var.A(i4);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        t0 t0Var = this.f30674b;
        if (t0Var != null) {
            t0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        t0 t0Var = this.f30674b;
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
        be1 be1Var = this.f30673a;
        if (be1Var != null) {
            be1Var.F(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        be1 be1Var = this.f30673a;
        if (be1Var != null) {
            be1Var.G(mode);
        }
    }

    @Override // j4.l
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        t0 t0Var = this.f30674b;
        t0Var.k(colorStateList);
        t0Var.b();
    }

    @Override // j4.l
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        t0 t0Var = this.f30674b;
        t0Var.l(mode);
        t0Var.b();
    }
}
