package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import h.AbstractC5927a;
import i.AbstractC6050a;

/* renamed from: androidx.appcompat.widget.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3882g extends CheckBox implements androidx.core.widget.j {

    /* renamed from: a, reason: collision with root package name */
    private final C3885j f27395a;

    /* renamed from: b, reason: collision with root package name */
    private final C3880e f27396b;

    /* renamed from: c, reason: collision with root package name */
    private final C f27397c;

    /* renamed from: d, reason: collision with root package name */
    private C3889n f27398d;

    public C3882g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC5927a.f47952o);
    }

    private C3889n getEmojiTextViewHelper() {
        if (this.f27398d == null) {
            this.f27398d = new C3889n(this);
        }
        return this.f27398d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C3880e c3880e = this.f27396b;
        if (c3880e != null) {
            c3880e.b();
        }
        C c10 = this.f27397c;
        if (c10 != null) {
            c10.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C3880e c3880e = this.f27396b;
        if (c3880e != null) {
            return c3880e.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C3880e c3880e = this.f27396b;
        if (c3880e != null) {
            return c3880e.d();
        }
        return null;
    }

    @Override // androidx.core.widget.j
    public ColorStateList getSupportButtonTintList() {
        C3885j c3885j = this.f27395a;
        if (c3885j != null) {
            return c3885j.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C3885j c3885j = this.f27395a;
        if (c3885j != null) {
            return c3885j.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f27397c.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f27397c.k();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().c(z10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C3880e c3880e = this.f27396b;
        if (c3880e != null) {
            c3880e.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C3880e c3880e = this.f27396b;
        if (c3880e != null) {
            c3880e.g(i10);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C3885j c3885j = this.f27395a;
        if (c3885j != null) {
            c3885j.e();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C c10 = this.f27397c;
        if (c10 != null) {
            c10.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C c10 = this.f27397c;
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
        C3880e c3880e = this.f27396b;
        if (c3880e != null) {
            c3880e.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C3880e c3880e = this.f27396b;
        if (c3880e != null) {
            c3880e.j(mode);
        }
    }

    @Override // androidx.core.widget.j
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C3885j c3885j = this.f27395a;
        if (c3885j != null) {
            c3885j.f(colorStateList);
        }
    }

    @Override // androidx.core.widget.j
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C3885j c3885j = this.f27395a;
        if (c3885j != null) {
            c3885j.g(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f27397c.w(colorStateList);
        this.f27397c.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f27397c.x(mode);
        this.f27397c.b();
    }

    public C3882g(Context context, AttributeSet attributeSet, int i10) {
        super(Y.b(context), attributeSet, i10);
        X.a(this, getContext());
        C3885j c3885j = new C3885j(this);
        this.f27395a = c3885j;
        c3885j.d(attributeSet, i10);
        C3880e c3880e = new C3880e(this);
        this.f27396b = c3880e;
        c3880e.e(attributeSet, i10);
        C c10 = new C(this);
        this.f27397c = c10;
        c10.m(attributeSet, i10);
        getEmojiTextViewHelper().b(attributeSet, i10);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i10) {
        setButtonDrawable(AbstractC6050a.b(getContext(), i10));
    }
}
