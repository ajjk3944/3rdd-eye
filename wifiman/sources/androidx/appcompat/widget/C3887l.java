package androidx.appcompat.widget;

import F1.C2742d;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import h.AbstractC5927a;

/* renamed from: androidx.appcompat.widget.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3887l extends EditText implements F1.H {

    /* renamed from: a, reason: collision with root package name */
    private final C3880e f27429a;

    /* renamed from: b, reason: collision with root package name */
    private final C f27430b;

    /* renamed from: c, reason: collision with root package name */
    private final B f27431c;

    /* renamed from: d, reason: collision with root package name */
    private final androidx.core.widget.i f27432d;

    /* renamed from: e, reason: collision with root package name */
    private final C3888m f27433e;

    /* renamed from: f, reason: collision with root package name */
    private a f27434f;

    /* renamed from: androidx.appcompat.widget.l$a */
    class a {
        a() {
        }

        public TextClassifier a() {
            return C3887l.super.getTextClassifier();
        }

        public void b(TextClassifier textClassifier) {
            C3887l.super.setTextClassifier(textClassifier);
        }
    }

    public C3887l(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC5927a.f47962y);
    }

    private a getSuperCaller() {
        if (this.f27434f == null) {
            this.f27434f = new a();
        }
        return this.f27434f;
    }

    @Override // F1.H
    public C2742d a(C2742d c2742d) {
        return this.f27432d.a(this, c2742d);
    }

    void d(C3888m c3888m) {
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
        C3880e c3880e = this.f27429a;
        if (c3880e != null) {
            c3880e.b();
        }
        C c10 = this.f27430b;
        if (c10 != null) {
            c10.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.h.q(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C3880e c3880e = this.f27429a;
        if (c3880e != null) {
            return c3880e.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C3880e c3880e = this.f27429a;
        if (c3880e != null) {
            return c3880e.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f27430b.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f27430b.k();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        B b10;
        return (Build.VERSION.SDK_INT >= 28 || (b10 = this.f27431c) == null) ? getSuperCaller().a() : b10.a();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] strArrC;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f27430b.r(this, inputConnectionOnCreateInputConnection, editorInfo);
        InputConnection inputConnectionA = AbstractC3890o.a(inputConnectionOnCreateInputConnection, editorInfo, this);
        if (inputConnectionA != null && Build.VERSION.SDK_INT <= 30 && (strArrC = F1.W.C(this)) != null) {
            I1.a.c(editorInfo, strArrC);
            inputConnectionA = I1.c.c(this, inputConnectionA, editorInfo);
        }
        return this.f27433e.d(inputConnectionA, editorInfo);
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30 || i10 >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        if (AbstractC3898x.a(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i10) {
        if (AbstractC3898x.b(this, i10)) {
            return true;
        }
        return super.onTextContextMenuItem(i10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C3880e c3880e = this.f27429a;
        if (c3880e != null) {
            c3880e.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C3880e c3880e = this.f27429a;
        if (c3880e != null) {
            c3880e.g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C c10 = this.f27430b;
        if (c10 != null) {
            c10.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C c10 = this.f27430b;
        if (c10 != null) {
            c10.p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.h.r(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        this.f27433e.e(z10);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f27433e.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C3880e c3880e = this.f27429a;
        if (c3880e != null) {
            c3880e.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C3880e c3880e = this.f27429a;
        if (c3880e != null) {
            c3880e.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f27430b.w(colorStateList);
        this.f27430b.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f27430b.x(mode);
        this.f27430b.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C c10 = this.f27430b;
        if (c10 != null) {
            c10.q(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        B b10;
        if (Build.VERSION.SDK_INT >= 28 || (b10 = this.f27431c) == null) {
            getSuperCaller().b(textClassifier);
        } else {
            b10.b(textClassifier);
        }
    }

    public C3887l(Context context, AttributeSet attributeSet, int i10) {
        super(Y.b(context), attributeSet, i10);
        X.a(this, getContext());
        C3880e c3880e = new C3880e(this);
        this.f27429a = c3880e;
        c3880e.e(attributeSet, i10);
        C c10 = new C(this);
        this.f27430b = c10;
        c10.m(attributeSet, i10);
        c10.b();
        this.f27431c = new B(this);
        this.f27432d = new androidx.core.widget.i();
        C3888m c3888m = new C3888m(this);
        this.f27433e = c3888m;
        c3888m.c(attributeSet, i10);
        d(c3888m);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }
}
