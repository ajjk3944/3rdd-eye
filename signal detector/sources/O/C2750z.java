package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import androidx.recyclerview.widget.C0305b;
import com.apm.insight.R;

/* renamed from: o.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2750z extends RadioButton implements U.j, U.k {

    /* renamed from: a, reason: collision with root package name */
    public final F0.f f22659a;

    /* renamed from: b, reason: collision with root package name */
    public final C0305b f22660b;

    /* renamed from: c, reason: collision with root package name */
    public final U f22661c;

    /* renamed from: d, reason: collision with root package name */
    public C2740u f22662d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2750z(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet, R.attr.radioButtonStyle);
        X0.a(context);
        W0.a(getContext(), this);
        F0.f fVar = new F0.f(this);
        this.f22659a = fVar;
        fVar.e(attributeSet, R.attr.radioButtonStyle);
        C0305b c0305b = new C0305b(this);
        this.f22660b = c0305b;
        c0305b.k(attributeSet, R.attr.radioButtonStyle);
        U u6 = new U(this);
        this.f22661c = u6;
        u6.f(attributeSet, R.attr.radioButtonStyle);
        getEmojiTextViewHelper().b(attributeSet, R.attr.radioButtonStyle);
    }

    private C2740u getEmojiTextViewHelper() {
        if (this.f22662d == null) {
            this.f22662d = new C2740u(this);
        }
        return this.f22662d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0305b c0305b = this.f22660b;
        if (c0305b != null) {
            c0305b.a();
        }
        U u6 = this.f22661c;
        if (u6 != null) {
            u6.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0305b c0305b = this.f22660b;
        if (c0305b != null) {
            return c0305b.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0305b c0305b = this.f22660b;
        if (c0305b != null) {
            return c0305b.i();
        }
        return null;
    }

    @Override // U.j
    public ColorStateList getSupportButtonTintList() {
        F0.f fVar = this.f22659a;
        if (fVar != null) {
            return (ColorStateList) fVar.f1439e;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        F0.f fVar = this.f22659a;
        if (fVar != null) {
            return (PorterDuff.Mode) fVar.f1440f;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f22661c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f22661c.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z6) {
        super.setAllCaps(z6);
        getEmojiTextViewHelper().c(z6);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0305b c0305b = this.f22660b;
        if (c0305b != null) {
            c0305b.m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0305b c0305b = this.f22660b;
        if (c0305b != null) {
            c0305b.n(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        F0.f fVar = this.f22659a;
        if (fVar != null) {
            if (fVar.f1437c) {
                fVar.f1437c = false;
            } else {
                fVar.f1437c = true;
                fVar.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        U u6 = this.f22661c;
        if (u6 != null) {
            u6.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        U u6 = this.f22661c;
        if (u6 != null) {
            u6.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z6) {
        getEmojiTextViewHelper().d(z6);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0305b c0305b = this.f22660b;
        if (c0305b != null) {
            c0305b.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0305b c0305b = this.f22660b;
        if (c0305b != null) {
            c0305b.t(mode);
        }
    }

    @Override // U.j
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        F0.f fVar = this.f22659a;
        if (fVar != null) {
            fVar.f1439e = colorStateList;
            fVar.f1435a = true;
            fVar.a();
        }
    }

    @Override // U.j
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        F0.f fVar = this.f22659a;
        if (fVar != null) {
            fVar.f1440f = mode;
            fVar.f1436b = true;
            fVar.a();
        }
    }

    @Override // U.k
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        U u6 = this.f22661c;
        u6.l(colorStateList);
        u6.b();
    }

    @Override // U.k
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        U u6 = this.f22661c;
        u6.m(mode);
        u6.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(a4.t.i(getContext(), i));
    }
}
