package p;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import com.google.android.gms.internal.ads.be1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class x extends MultiAutoCompleteTextView implements j4.l {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f30903d = {R.attr.popupBackground};

    /* renamed from: a, reason: collision with root package name */
    public final be1 f30904a;

    /* renamed from: b, reason: collision with root package name */
    public final t0 f30905b;

    /* renamed from: c, reason: collision with root package name */
    public final z f30906c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet, com.liuzh.deviceinfo.R.attr.autoCompleteTextViewStyle);
        e3.a(context);
        d3.a(getContext(), this);
        i0.f fVarJ = i0.f.J(getContext(), attributeSet, f30903d, com.liuzh.deviceinfo.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) fVarJ.f25417c).hasValue(0)) {
            setDropDownBackgroundDrawable(fVarJ.A(0));
        }
        fVarJ.M();
        be1 be1Var = new be1(this);
        this.f30904a = be1Var;
        be1Var.x(attributeSet, com.liuzh.deviceinfo.R.attr.autoCompleteTextViewStyle);
        t0 t0Var = new t0(this);
        this.f30905b = t0Var;
        t0Var.f(attributeSet, com.liuzh.deviceinfo.R.attr.autoCompleteTextViewStyle);
        t0Var.b();
        z zVar = new z(this);
        this.f30906c = zVar;
        zVar.b(attributeSet, com.liuzh.deviceinfo.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = isFocusable();
        boolean zIsClickable = isClickable();
        boolean zIsLongClickable = isLongClickable();
        int inputType = getInputType();
        KeyListener keyListenerA = zVar.a(keyListener);
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
        be1 be1Var = this.f30904a;
        if (be1Var != null) {
            be1Var.a();
        }
        t0 t0Var = this.f30905b;
        if (t0Var != null) {
            t0Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        be1 be1Var = this.f30904a;
        if (be1Var != null) {
            return be1Var.u();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        be1 be1Var = this.f30904a;
        if (be1Var != null) {
            return be1Var.v();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f30905b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f30905b.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        nh.a.n(inputConnectionOnCreateInputConnection, editorInfo, this);
        return this.f30906c.c(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        be1 be1Var = this.f30904a;
        if (be1Var != null) {
            be1Var.z();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i4) {
        super.setBackgroundResource(i4);
        be1 be1Var = this.f30904a;
        if (be1Var != null) {
            be1Var.A(i4);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        t0 t0Var = this.f30905b;
        if (t0Var != null) {
            t0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        t0 t0Var = this.f30905b;
        if (t0Var != null) {
            t0Var.b();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i4) {
        setDropDownBackgroundDrawable(jm.a.l(i4, getContext()));
    }

    public void setEmojiCompatEnabled(boolean z3) {
        this.f30906c.d(z3);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f30906c.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        be1 be1Var = this.f30904a;
        if (be1Var != null) {
            be1Var.F(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        be1 be1Var = this.f30904a;
        if (be1Var != null) {
            be1Var.G(mode);
        }
    }

    @Override // j4.l
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        t0 t0Var = this.f30905b;
        t0Var.k(colorStateList);
        t0Var.b();
    }

    @Override // j4.l
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        t0 t0Var = this.f30905b;
        t0Var.l(mode);
        t0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i4) throws Resources.NotFoundException {
        super.setTextAppearance(context, i4);
        t0 t0Var = this.f30905b;
        if (t0Var != null) {
            t0Var.g(i4, context);
        }
    }
}
