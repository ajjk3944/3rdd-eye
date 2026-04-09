package androidx.appcompat.widget;

import U.k;
import a4.t;
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
import androidx.recyclerview.widget.C0305b;
import o.C2748y;
import o.U;
import o.W0;
import o.X0;
import o.a1;

/* loaded from: classes.dex */
public class AppCompatAutoCompleteTextView extends AutoCompleteTextView implements k {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f4856d = {R.attr.popupBackground};

    /* renamed from: a, reason: collision with root package name */
    public final C0305b f4857a;

    /* renamed from: b, reason: collision with root package name */
    public final U f4858b;

    /* renamed from: c, reason: collision with root package name */
    public final C2748y f4859c;

    public AppCompatAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0305b c0305b = this.f4857a;
        if (c0305b != null) {
            c0305b.a();
        }
        U u6 = this.f4858b;
        if (u6 != null) {
            u6.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return t.u(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0305b c0305b = this.f4857a;
        if (c0305b != null) {
            return c0305b.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0305b c0305b = this.f4857a;
        if (c0305b != null) {
            return c0305b.i();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f4858b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f4858b.e();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        t.n(editorInfo, inputConnectionOnCreateInputConnection, this);
        return this.f4859c.c(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0305b c0305b = this.f4857a;
        if (c0305b != null) {
            c0305b.m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0305b c0305b = this.f4857a;
        if (c0305b != null) {
            c0305b.n(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        U u6 = this.f4858b;
        if (u6 != null) {
            u6.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        U u6 = this.f4858b;
        if (u6 != null) {
            u6.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(t.v(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(t.i(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z6) {
        this.f4859c.d(z6);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f4859c.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0305b c0305b = this.f4857a;
        if (c0305b != null) {
            c0305b.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0305b c0305b = this.f4857a;
        if (c0305b != null) {
            c0305b.t(mode);
        }
    }

    @Override // U.k
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        U u6 = this.f4858b;
        u6.l(colorStateList);
        u6.b();
    }

    @Override // U.k
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        U u6 = this.f4858b;
        u6.m(mode);
        u6.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) throws Resources.NotFoundException {
        super.setTextAppearance(context, i);
        U u6 = this.f4858b;
        if (u6 != null) {
            u6.g(context, i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatAutoCompleteTextView(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(context, attributeSet, com.apm.insight.R.attr.autoCompleteTextViewStyle);
        X0.a(context);
        W0.a(getContext(), this);
        a1 a1VarI = a1.i(getContext(), attributeSet, f4856d, com.apm.insight.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) a1VarI.f22480c).hasValue(0)) {
            setDropDownBackgroundDrawable(a1VarI.d(0));
        }
        a1VarI.j();
        C0305b c0305b = new C0305b(this);
        this.f4857a = c0305b;
        c0305b.k(attributeSet, com.apm.insight.R.attr.autoCompleteTextViewStyle);
        U u6 = new U(this);
        this.f4858b = u6;
        u6.f(attributeSet, com.apm.insight.R.attr.autoCompleteTextViewStyle);
        u6.b();
        C2748y c2748y = new C2748y(this);
        this.f4859c = c2748y;
        c2748y.b(attributeSet, com.apm.insight.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerA = c2748y.a(keyListener);
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
