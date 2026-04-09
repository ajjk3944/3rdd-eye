package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* loaded from: classes.dex */
public class H extends ToggleButton {

    /* renamed from: a, reason: collision with root package name */
    private final C3880e f27113a;

    /* renamed from: b, reason: collision with root package name */
    private final C f27114b;

    /* renamed from: c, reason: collision with root package name */
    private C3889n f27115c;

    public H(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyleToggle);
    }

    private C3889n getEmojiTextViewHelper() {
        if (this.f27115c == null) {
            this.f27115c = new C3889n(this);
        }
        return this.f27115c;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C3880e c3880e = this.f27113a;
        if (c3880e != null) {
            c3880e.b();
        }
        C c10 = this.f27114b;
        if (c10 != null) {
            c10.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C3880e c3880e = this.f27113a;
        if (c3880e != null) {
            return c3880e.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C3880e c3880e = this.f27113a;
        if (c3880e != null) {
            return c3880e.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f27114b.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f27114b.k();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().c(z10);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C3880e c3880e = this.f27113a;
        if (c3880e != null) {
            c3880e.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C3880e c3880e = this.f27113a;
        if (c3880e != null) {
            c3880e.g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C c10 = this.f27114b;
        if (c10 != null) {
            c10.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C c10 = this.f27114b;
        if (c10 != null) {
            c10.p();
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
        C3880e c3880e = this.f27113a;
        if (c3880e != null) {
            c3880e.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C3880e c3880e = this.f27113a;
        if (c3880e != null) {
            c3880e.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f27114b.w(colorStateList);
        this.f27114b.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f27114b.x(mode);
        this.f27114b.b();
    }

    public H(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        X.a(this, getContext());
        C3880e c3880e = new C3880e(this);
        this.f27113a = c3880e;
        c3880e.e(attributeSet, i10);
        C c10 = new C(this);
        this.f27114b = c10;
        c10.m(attributeSet, i10);
        getEmojiTextViewHelper().b(attributeSet, i10);
    }
}
