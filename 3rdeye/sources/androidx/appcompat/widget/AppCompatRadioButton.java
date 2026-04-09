package androidx.appcompat.widget;

import A9.I;
import R0.j;
import R0.k;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import o.C5386d;
import o.C5389g;
import o.C5392j;
import o.C5404w;
import o.S;
import o.U;

/* loaded from: classes.dex */
public class AppCompatRadioButton extends RadioButton implements j, k {

    /* renamed from: b, reason: collision with root package name */
    public final C5389g f14604b;

    /* renamed from: c, reason: collision with root package name */
    public final C5386d f14605c;

    /* renamed from: d, reason: collision with root package name */
    public final C5404w f14606d;

    /* renamed from: e, reason: collision with root package name */
    public C5392j f14607e;

    public AppCompatRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private C5392j getEmojiTextViewHelper() {
        if (this.f14607e == null) {
            this.f14607e = new C5392j(this);
        }
        return this.f14607e;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C5386d c5386d = this.f14605c;
        if (c5386d != null) {
            c5386d.a();
        }
        C5404w c5404w = this.f14606d;
        if (c5404w != null) {
            c5404w.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C5386d c5386d = this.f14605c;
        if (c5386d != null) {
            return c5386d.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C5386d c5386d = this.f14605c;
        if (c5386d != null) {
            return c5386d.c();
        }
        return null;
    }

    @Override // R0.j
    public ColorStateList getSupportButtonTintList() {
        C5389g c5389g = this.f14604b;
        if (c5389g != null) {
            return c5389g.f44669b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C5389g c5389g = this.f14604b;
        if (c5389g != null) {
            return c5389g.f44670c;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f14606d.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f14606d.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().c(z10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C5386d c5386d = this.f14605c;
        if (c5386d != null) {
            c5386d.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C5386d c5386d = this.f14605c;
        if (c5386d != null) {
            c5386d.f(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C5389g c5389g = this.f14604b;
        if (c5389g != null) {
            if (c5389g.f44673f) {
                c5389g.f44673f = false;
            } else {
                c5389g.f44673f = true;
                c5389g.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C5404w c5404w = this.f14606d;
        if (c5404w != null) {
            c5404w.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C5404w c5404w = this.f14606d;
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
        C5386d c5386d = this.f14605c;
        if (c5386d != null) {
            c5386d.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C5386d c5386d = this.f14605c;
        if (c5386d != null) {
            c5386d.i(mode);
        }
    }

    @Override // R0.j
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C5389g c5389g = this.f14604b;
        if (c5389g != null) {
            c5389g.f44669b = colorStateList;
            c5389g.f44671d = true;
            c5389g.a();
        }
    }

    @Override // R0.j
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C5389g c5389g = this.f14604b;
        if (c5389g != null) {
            c5389g.f44670c = mode;
            c5389g.f44672e = true;
            c5389g.a();
        }
    }

    @Override // R0.k
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C5404w c5404w = this.f14606d;
        c5404w.l(colorStateList);
        c5404w.b();
    }

    @Override // R0.k
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C5404w c5404w = this.f14606d;
        c5404w.m(mode);
        c5404w.b();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatRadioButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.radioButtonStyle);
        U.a(context);
        S.a(this, getContext());
        C5389g c5389g = new C5389g(this);
        this.f14604b = c5389g;
        c5389g.b(attributeSet, R.attr.radioButtonStyle);
        C5386d c5386d = new C5386d(this);
        this.f14605c = c5386d;
        c5386d.d(attributeSet, R.attr.radioButtonStyle);
        C5404w c5404w = new C5404w(this);
        this.f14606d = c5404w;
        c5404w.f(attributeSet, R.attr.radioButtonStyle);
        getEmojiTextViewHelper().b(attributeSet, R.attr.radioButtonStyle);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(I.w(getContext(), i));
    }
}
