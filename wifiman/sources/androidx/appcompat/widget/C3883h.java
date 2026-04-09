package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import h.AbstractC5927a;
import i.AbstractC6050a;

/* renamed from: androidx.appcompat.widget.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3883h extends CheckedTextView {

    /* renamed from: a, reason: collision with root package name */
    private final C3884i f27399a;

    /* renamed from: b, reason: collision with root package name */
    private final C3880e f27400b;

    /* renamed from: c, reason: collision with root package name */
    private final C f27401c;

    /* renamed from: d, reason: collision with root package name */
    private C3889n f27402d;

    public C3883h(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC5927a.f47953p);
    }

    private C3889n getEmojiTextViewHelper() {
        if (this.f27402d == null) {
            this.f27402d = new C3889n(this);
        }
        return this.f27402d;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C c10 = this.f27401c;
        if (c10 != null) {
            c10.b();
        }
        C3880e c3880e = this.f27400b;
        if (c3880e != null) {
            c3880e.b();
        }
        C3884i c3884i = this.f27399a;
        if (c3884i != null) {
            c3884i.a();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.h.q(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C3880e c3880e = this.f27400b;
        if (c3880e != null) {
            return c3880e.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C3880e c3880e = this.f27400b;
        if (c3880e != null) {
            return c3880e.d();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        C3884i c3884i = this.f27399a;
        if (c3884i != null) {
            return c3884i.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C3884i c3884i = this.f27399a;
        if (c3884i != null) {
            return c3884i.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f27401c.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f27401c.k();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return AbstractC3890o.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().c(z10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C3880e c3880e = this.f27400b;
        if (c3880e != null) {
            c3880e.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C3880e c3880e = this.f27400b;
        if (c3880e != null) {
            c3880e.g(i10);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C3884i c3884i = this.f27399a;
        if (c3884i != null) {
            c3884i.e();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C c10 = this.f27401c;
        if (c10 != null) {
            c10.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C c10 = this.f27401c;
        if (c10 != null) {
            c10.p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.h.r(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().d(z10);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C3880e c3880e = this.f27400b;
        if (c3880e != null) {
            c3880e.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C3880e c3880e = this.f27400b;
        if (c3880e != null) {
            c3880e.j(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C3884i c3884i = this.f27399a;
        if (c3884i != null) {
            c3884i.f(colorStateList);
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C3884i c3884i = this.f27399a;
        if (c3884i != null) {
            c3884i.g(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f27401c.w(colorStateList);
        this.f27401c.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f27401c.x(mode);
        this.f27401c.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C c10 = this.f27401c;
        if (c10 != null) {
            c10.q(context, i10);
        }
    }

    public C3883h(Context context, AttributeSet attributeSet, int i10) {
        super(Y.b(context), attributeSet, i10);
        X.a(this, getContext());
        C c10 = new C(this);
        this.f27401c = c10;
        c10.m(attributeSet, i10);
        c10.b();
        C3880e c3880e = new C3880e(this);
        this.f27400b = c3880e;
        c3880e.e(attributeSet, i10);
        C3884i c3884i = new C3884i(this);
        this.f27399a = c3884i;
        c3884i.d(attributeSet, i10);
        getEmojiTextViewHelper().b(attributeSet, i10);
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i10) {
        setCheckMarkDrawable(AbstractC6050a.b(getContext(), i10));
    }
}
