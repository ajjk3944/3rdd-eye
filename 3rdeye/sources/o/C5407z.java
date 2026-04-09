package o;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* compiled from: AppCompatToggleButton.java */
/* renamed from: o.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5407z extends ToggleButton implements R0.k {

    /* renamed from: b, reason: collision with root package name */
    public final C5386d f44772b;

    /* renamed from: c, reason: collision with root package name */
    public final C5404w f44773c;

    /* renamed from: d, reason: collision with root package name */
    public C5392j f44774d;

    public C5407z(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyleToggle);
        S.a(this, getContext());
        C5386d c5386d = new C5386d(this);
        this.f44772b = c5386d;
        c5386d.d(attributeSet, R.attr.buttonStyleToggle);
        C5404w c5404w = new C5404w(this);
        this.f44773c = c5404w;
        c5404w.f(attributeSet, R.attr.buttonStyleToggle);
        getEmojiTextViewHelper().b(attributeSet, R.attr.buttonStyleToggle);
    }

    private C5392j getEmojiTextViewHelper() {
        if (this.f44774d == null) {
            this.f44774d = new C5392j(this);
        }
        return this.f44774d;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C5386d c5386d = this.f44772b;
        if (c5386d != null) {
            c5386d.a();
        }
        C5404w c5404w = this.f44773c;
        if (c5404w != null) {
            c5404w.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C5386d c5386d = this.f44772b;
        if (c5386d != null) {
            return c5386d.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C5386d c5386d = this.f44772b;
        if (c5386d != null) {
            return c5386d.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f44773c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f44773c.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().c(z10);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C5386d c5386d = this.f44772b;
        if (c5386d != null) {
            c5386d.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C5386d c5386d = this.f44772b;
        if (c5386d != null) {
            c5386d.f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C5404w c5404w = this.f44773c;
        if (c5404w != null) {
            c5404w.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C5404w c5404w = this.f44773c;
        if (c5404w != null) {
            c5404w.b();
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
        C5386d c5386d = this.f44772b;
        if (c5386d != null) {
            c5386d.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C5386d c5386d = this.f44772b;
        if (c5386d != null) {
            c5386d.i(mode);
        }
    }

    @Override // R0.k
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C5404w c5404w = this.f44773c;
        c5404w.l(colorStateList);
        c5404w.b();
    }

    @Override // R0.k
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C5404w c5404w = this.f44773c;
        c5404w.m(mode);
        c5404w.b();
    }
}
