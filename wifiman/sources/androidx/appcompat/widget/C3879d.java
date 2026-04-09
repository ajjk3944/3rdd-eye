package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import h.AbstractC5927a;
import i.AbstractC6050a;

/* renamed from: androidx.appcompat.widget.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3879d extends AutoCompleteTextView {

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f27358d = {R.attr.popupBackground};

    /* renamed from: a, reason: collision with root package name */
    private final C3880e f27359a;

    /* renamed from: b, reason: collision with root package name */
    private final C f27360b;

    /* renamed from: c, reason: collision with root package name */
    private final C3888m f27361c;

    public C3879d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC5927a.f47950m);
    }

    void a(C3888m c3888m) {
        KeyListener keyListener = getKeyListener();
        if (c3888m.b(keyListener)) {
            boolean zIsFocusable = super.isFocusable();
            boolean zIsClickable = super.isClickable();
            boolean zIsLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener keyListenerA = c3888m.a(keyListener);
            if (keyListenerA == keyListener) {
                return;
            }
            super.setKeyListener(keyListenerA);
            super.setRawInputType(inputType);
            super.setFocusable(zIsFocusable);
            super.setClickable(zIsClickable);
            super.setLongClickable(zIsLongClickable);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C3880e c3880e = this.f27359a;
        if (c3880e != null) {
            c3880e.b();
        }
        C c10 = this.f27360b;
        if (c10 != null) {
            c10.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.h.q(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C3880e c3880e = this.f27359a;
        if (c3880e != null) {
            return c3880e.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C3880e c3880e = this.f27359a;
        if (c3880e != null) {
            return c3880e.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f27360b.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f27360b.k();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return this.f27361c.d(AbstractC3890o.a(super.onCreateInputConnection(editorInfo), editorInfo, this), editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C3880e c3880e = this.f27359a;
        if (c3880e != null) {
            c3880e.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C3880e c3880e = this.f27359a;
        if (c3880e != null) {
            c3880e.g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C c10 = this.f27360b;
        if (c10 != null) {
            c10.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C c10 = this.f27360b;
        if (c10 != null) {
            c10.p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.h.r(this, callback));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i10) {
        setDropDownBackgroundDrawable(AbstractC6050a.b(getContext(), i10));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        this.f27361c.e(z10);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f27361c.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C3880e c3880e = this.f27359a;
        if (c3880e != null) {
            c3880e.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C3880e c3880e = this.f27359a;
        if (c3880e != null) {
            c3880e.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f27360b.w(colorStateList);
        this.f27360b.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f27360b.x(mode);
        this.f27360b.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C c10 = this.f27360b;
        if (c10 != null) {
            c10.q(context, i10);
        }
    }

    public C3879d(Context context, AttributeSet attributeSet, int i10) {
        super(Y.b(context), attributeSet, i10);
        X.a(this, getContext());
        b0 b0VarV = b0.v(getContext(), attributeSet, f27358d, i10, 0);
        if (b0VarV.s(0)) {
            setDropDownBackgroundDrawable(b0VarV.g(0));
        }
        b0VarV.x();
        C3880e c3880e = new C3880e(this);
        this.f27359a = c3880e;
        c3880e.e(attributeSet, i10);
        C c10 = new C(this);
        this.f27360b = c10;
        c10.m(attributeSet, i10);
        c10.b();
        C3888m c3888m = new C3888m(this);
        this.f27361c = c3888m;
        c3888m.c(attributeSet, i10);
        a(c3888m);
    }
}
