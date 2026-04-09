package p;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;

/* loaded from: classes.dex */
public final class u extends MultiAutoCompleteTextView {

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f20179r = {R.attr.popupBackground};

    /* renamed from: a, reason: collision with root package name */
    public final h7.b f20180a;

    /* renamed from: d, reason: collision with root package name */
    public final m0 f20181d;

    /* renamed from: g, reason: collision with root package name */
    public final w f20182g;

    /* JADX WARN: Illegal instructions before constructor call */
    public u(Context context, AttributeSet attributeSet) {
        int i10 = h.a.autoCompleteTextViewStyle;
        i2.a(context);
        super(context, attributeSet, i10);
        h2.a(getContext(), this);
        io.sentry.k kVarH0 = io.sentry.k.h0(getContext(), attributeSet, f20179r, i10);
        if (((TypedArray) kVarH0.f12398g).hasValue(0)) {
            setDropDownBackgroundDrawable(kVarH0.U(0));
        }
        kVarH0.l0();
        h7.b bVar = new h7.b(this);
        this.f20180a = bVar;
        bVar.k(attributeSet, i10);
        m0 m0Var = new m0(this);
        this.f20181d = m0Var;
        m0Var.f(attributeSet, i10);
        m0Var.b();
        w wVar = new w(this);
        this.f20182g = wVar;
        wVar.b(attributeSet, i10);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = isFocusable();
        boolean zIsClickable = isClickable();
        boolean zIsLongClickable = isLongClickable();
        int inputType = getInputType();
        KeyListener keyListenerA = wVar.a(keyListener);
        if (keyListenerA == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerA);
        setRawInputType(inputType);
        setFocusable(zIsFocusable);
        setClickable(zIsClickable);
        setLongClickable(zIsLongClickable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        h7.b bVar = this.f20180a;
        if (bVar != null) {
            bVar.a();
        }
        m0 m0Var = this.f20181d;
        if (m0Var != null) {
            m0Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        h7.b bVar = this.f20180a;
        if (bVar != null) {
            return bVar.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        h7.b bVar = this.f20180a;
        if (bVar != null) {
            return bVar.i();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f20181d.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f20181d.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        ba.m.G(inputConnectionOnCreateInputConnection, editorInfo, this);
        return this.f20182g.c(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        h7.b bVar = this.f20180a;
        if (bVar != null) {
            bVar.m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        h7.b bVar = this.f20180a;
        if (bVar != null) {
            bVar.n(i10);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        m0 m0Var = this.f20181d;
        if (m0Var != null) {
            m0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        m0 m0Var = this.f20181d;
        if (m0Var != null) {
            m0Var.b();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i10) {
        setDropDownBackgroundDrawable(ic.a.r(getContext(), i10));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        this.f20182g.d(z10);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f20182g.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        h7.b bVar = this.f20180a;
        if (bVar != null) {
            bVar.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        h7.b bVar = this.f20180a;
        if (bVar != null) {
            bVar.t(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        m0 m0Var = this.f20181d;
        m0Var.k(colorStateList);
        m0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        m0 m0Var = this.f20181d;
        m0Var.l(mode);
        m0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        m0 m0Var = this.f20181d;
        if (m0Var != null) {
            m0Var.g(context, i10);
        }
    }
}
