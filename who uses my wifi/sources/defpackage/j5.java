package defpackage;

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
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class j5 extends AutoCompleteTextView {
    public static final int[] i = {R.attr.popupBackground};
    public final fw3 f;
    public final o7 g;
    public final gw3 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet, com.phuongpn.whousemywifi.networkscanner.R.attr.autoCompleteTextViewStyle);
        w11.a(context);
        n11.a(getContext(), this);
        xb4 xb4VarR = xb4.r(getContext(), attributeSet, i, com.phuongpn.whousemywifi.networkscanner.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) xb4VarR.h).hasValue(0)) {
            setDropDownBackgroundDrawable(xb4VarR.m(0));
        }
        xb4VarR.z();
        fw3 fw3Var = new fw3(this);
        this.f = fw3Var;
        fw3Var.k(attributeSet, com.phuongpn.whousemywifi.networkscanner.R.attr.autoCompleteTextViewStyle);
        o7 o7Var = new o7(this);
        this.g = o7Var;
        o7Var.f(attributeSet, com.phuongpn.whousemywifi.networkscanner.R.attr.autoCompleteTextViewStyle);
        o7Var.b();
        gw3 gw3Var = new gw3((EditText) this);
        this.h = gw3Var;
        gw3Var.t(attributeSet, com.phuongpn.whousemywifi.networkscanner.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerO = gw3Var.o(keyListener);
        if (keyListenerO == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerO);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        fw3 fw3Var = this.f;
        if (fw3Var != null) {
            fw3Var.a();
        }
        o7 o7Var = this.g;
        if (o7Var != null) {
            o7Var.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return ou1.B(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        fw3 fw3Var = this.f;
        if (fw3Var != null) {
            return fw3Var.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        fw3 fw3Var = this.f;
        if (fw3Var != null) {
            return fw3Var.i();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.g.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.g.e();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        i41.o(editorInfo, inputConnectionOnCreateInputConnection, this);
        return this.h.u(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        fw3 fw3Var = this.f;
        if (fw3Var != null) {
            fw3Var.m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        fw3 fw3Var = this.f;
        if (fw3Var != null) {
            fw3Var.n(i2);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        o7 o7Var = this.g;
        if (o7Var != null) {
            o7Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        o7 o7Var = this.g;
        if (o7Var != null) {
            o7Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(ou1.D(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i2) {
        setDropDownBackgroundDrawable(ob1.h(getContext(), i2));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.h.C(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.h.o(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        fw3 fw3Var = this.f;
        if (fw3Var != null) {
            fw3Var.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        fw3 fw3Var = this.f;
        if (fw3Var != null) {
            fw3Var.t(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        o7 o7Var = this.g;
        o7Var.l(colorStateList);
        o7Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        o7 o7Var = this.g;
        o7Var.m(mode);
        o7Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i2) throws Resources.NotFoundException {
        super.setTextAppearance(context, i2);
        o7 o7Var = this.g;
        if (o7Var != null) {
            o7Var.g(context, i2);
        }
    }
}
