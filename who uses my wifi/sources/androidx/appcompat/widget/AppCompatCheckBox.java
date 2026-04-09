package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import com.phuongpn.whousemywifi.networkscanner.R;
import defpackage.fw3;
import defpackage.n11;
import defpackage.n5;
import defpackage.o6;
import defpackage.o7;
import defpackage.ob1;
import defpackage.w11;
import defpackage.y11;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class AppCompatCheckBox extends CheckBox implements y11 {
    public final n5 f;
    public final fw3 g;
    public final o7 h;
    public o6 i;

    public AppCompatCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkboxStyle);
    }

    private o6 getEmojiTextViewHelper() {
        if (this.i == null) {
            this.i = new o6(this);
        }
        return this.i;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        fw3 fw3Var = this.g;
        if (fw3Var != null) {
            fw3Var.a();
        }
        o7 o7Var = this.h;
        if (o7Var != null) {
            o7Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        fw3 fw3Var = this.g;
        if (fw3Var != null) {
            return fw3Var.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        fw3 fw3Var = this.g;
        if (fw3Var != null) {
            return fw3Var.i();
        }
        return null;
    }

    @Override // defpackage.y11
    public ColorStateList getSupportButtonTintList() {
        n5 n5Var = this.f;
        if (n5Var != null) {
            return (ColorStateList) n5Var.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        n5 n5Var = this.f;
        if (n5Var != null) {
            return (PorterDuff.Mode) n5Var.b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.h.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.h.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        fw3 fw3Var = this.g;
        if (fw3Var != null) {
            fw3Var.m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        fw3 fw3Var = this.g;
        if (fw3Var != null) {
            fw3Var.n(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        n5 n5Var = this.f;
        if (n5Var != null) {
            if (n5Var.e) {
                n5Var.e = false;
            } else {
                n5Var.e = true;
                n5Var.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        o7 o7Var = this.h;
        if (o7Var != null) {
            o7Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        o7 o7Var = this.h;
        if (o7Var != null) {
            o7Var.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        fw3 fw3Var = this.g;
        if (fw3Var != null) {
            fw3Var.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        fw3 fw3Var = this.g;
        if (fw3Var != null) {
            fw3Var.t(mode);
        }
    }

    @Override // defpackage.y11
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        n5 n5Var = this.f;
        if (n5Var != null) {
            n5Var.a = colorStateList;
            n5Var.c = true;
            n5Var.a();
        }
    }

    @Override // defpackage.y11
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        n5 n5Var = this.f;
        if (n5Var != null) {
            n5Var.b = mode;
            n5Var.d = true;
            n5Var.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        o7 o7Var = this.h;
        o7Var.l(colorStateList);
        o7Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        o7 o7Var = this.h;
        o7Var.m(mode);
        o7Var.b();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatCheckBox(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(context, attributeSet, i);
        w11.a(context);
        n11.a(getContext(), this);
        n5 n5Var = new n5(this);
        this.f = n5Var;
        n5Var.c(attributeSet, i);
        fw3 fw3Var = new fw3(this);
        this.g = fw3Var;
        fw3Var.k(attributeSet, i);
        o7 o7Var = new o7(this);
        this.h = o7Var;
        o7Var.f(attributeSet, i);
        getEmojiTextViewHelper().b(attributeSet, i);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(ob1.h(getContext(), i));
    }
}
