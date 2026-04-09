package o;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;

/* compiled from: AppCompatAutoCompleteTextView.java */
/* renamed from: o.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5385c extends AutoCompleteTextView implements R0.k {

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f44626e = {R.attr.popupBackground};

    /* renamed from: b, reason: collision with root package name */
    public final C5386d f44627b;

    /* renamed from: c, reason: collision with root package name */
    public final C5404w f44628c;

    /* renamed from: d, reason: collision with root package name */
    public final E7.b f44629d;

    public C5385c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C5386d c5386d = this.f44627b;
        if (c5386d != null) {
            c5386d.a();
        }
        C5404w c5404w = this.f44628c;
        if (c5404w != null) {
            c5404w.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return R0.h.f(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C5386d c5386d = this.f44627b;
        if (c5386d != null) {
            return c5386d.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C5386d c5386d = this.f44627b;
        if (c5386d != null) {
            return c5386d.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f44628c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f44628c.e();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        B7.d.t(editorInfo, inputConnectionOnCreateInputConnection, this);
        return this.f44629d.n(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C5386d c5386d = this.f44627b;
        if (c5386d != null) {
            c5386d.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C5386d c5386d = this.f44627b;
        if (c5386d != null) {
            c5386d.f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C5404w c5404w = this.f44628c;
        if (c5404w != null) {
            c5404w.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C5404w c5404w = this.f44628c;
        if (c5404w != null) {
            c5404w.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(R0.h.g(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(A9.I.w(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        this.f44629d.q(z10);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f44629d.j(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C5386d c5386d = this.f44627b;
        if (c5386d != null) {
            c5386d.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C5386d c5386d = this.f44627b;
        if (c5386d != null) {
            c5386d.i(mode);
        }
    }

    @Override // R0.k
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C5404w c5404w = this.f44628c;
        c5404w.l(colorStateList);
        c5404w.b();
    }

    @Override // R0.k
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C5404w c5404w = this.f44628c;
        c5404w.m(mode);
        c5404w.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C5404w c5404w = this.f44628c;
        if (c5404w != null) {
            c5404w.g(context, i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5385c(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.attr.autoCompleteTextViewStyle);
        U.a(context);
        S.a(this, getContext());
        X xE = X.e(getContext(), attributeSet, f44626e, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.attr.autoCompleteTextViewStyle);
        if (xE.f44608b.hasValue(0)) {
            setDropDownBackgroundDrawable(xE.b(0));
        }
        xE.f();
        C5386d c5386d = new C5386d(this);
        this.f44627b = c5386d;
        c5386d.d(attributeSet, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.attr.autoCompleteTextViewStyle);
        C5404w c5404w = new C5404w(this);
        this.f44628c = c5404w;
        c5404w.f(attributeSet, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.attr.autoCompleteTextViewStyle);
        c5404w.b();
        E7.b bVar = new E7.b(this);
        this.f44629d = bVar;
        bVar.m(attributeSet, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerJ = bVar.j(keyListener);
        if (keyListenerJ == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerJ);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
    }
}
