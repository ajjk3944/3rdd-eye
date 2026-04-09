package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.internal.ads.be1;
import com.liuzh.deviceinfo.R;
import e4.e;
import e4.f;
import e4.h;
import e4.t;
import e4.v0;
import g4.b;
import g4.c;
import g4.d;
import j4.j;
import j4.l;
import p.c0;
import p.d3;
import p.e3;
import p.n0;
import p.t0;
import p.z;
import pk.a;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class AppCompatEditText extends EditText implements t, l {

    /* renamed from: a, reason: collision with root package name */
    public final be1 f761a;

    /* renamed from: b, reason: collision with root package name */
    public final t0 f762b;

    /* renamed from: c, reason: collision with root package name */
    public final z f763c;

    /* renamed from: d, reason: collision with root package name */
    public final j f764d;

    /* renamed from: e, reason: collision with root package name */
    public final z f765e;

    /* renamed from: f, reason: collision with root package name */
    public p.t f766f;

    public AppCompatEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private p.t getSuperCaller() {
        if (this.f766f == null) {
            this.f766f = new p.t(this);
        }
        return this.f766f;
    }

    @Override // e4.t
    public final h a(h hVar) {
        this.f764d.getClass();
        return j.a(this, hVar);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        be1 be1Var = this.f761a;
        if (be1Var != null) {
            be1Var.a();
        }
        t0 t0Var = this.f762b;
        if (t0Var != null) {
            t0Var.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return a.w(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        be1 be1Var = this.f761a;
        if (be1Var != null) {
            return be1Var.u();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        be1 be1Var = this.f761a;
        if (be1Var != null) {
            return be1Var.v();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f762b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f762b.e();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        z zVar;
        if (Build.VERSION.SDK_INT >= 28 || (zVar = this.f763c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) zVar.f30919c;
        return textClassifier == null ? n0.a((TextView) zVar.f30918b) : textClassifier;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] strArrH;
        InputConnection dVar;
        int i4;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f762b.getClass();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30 && inputConnectionOnCreateInputConnection != null) {
            CharSequence text = getText();
            if (i10 >= 30) {
                g4.a.a(editorInfo, text);
            } else {
                text.getClass();
                if (i10 >= 30) {
                    g4.a.a(editorInfo, text);
                } else {
                    int i11 = editorInfo.initialSelStart;
                    int i12 = editorInfo.initialSelEnd;
                    int i13 = i11 > i12 ? i12 : i11;
                    if (i11 <= i12) {
                        i11 = i12;
                    }
                    int length = text.length();
                    if (i13 < 0 || i11 > length || (i4 = editorInfo.inputType & 4095) == 129 || i4 == 225 || i4 == 18) {
                        b.c(editorInfo, null, 0, 0);
                    } else if (length <= 2048) {
                        b.c(editorInfo, text, i13, i11);
                    } else {
                        int i14 = i11 - i13;
                        int i15 = i14 > 1024 ? 0 : i14;
                        int i16 = 2048 - i15;
                        int iMin = Math.min(text.length() - i11, i16 - Math.min(i13, (int) (i16 * 0.8d)));
                        int iMin2 = Math.min(i13, i16 - iMin);
                        int i17 = i13 - iMin2;
                        if (Character.isLowSurrogate(text.charAt(i17))) {
                            i17++;
                            iMin2--;
                        }
                        if (Character.isHighSurrogate(text.charAt((i11 + iMin) - 1))) {
                            iMin--;
                        }
                        int i18 = iMin2 + i15;
                        b.c(editorInfo, i15 != i14 ? TextUtils.concat(text.subSequence(i17, i17 + iMin2), text.subSequence(i11, iMin + i11)) : text.subSequence(i17, i18 + iMin + i17), iMin2, i18);
                    }
                }
            }
        }
        nh.a.n(inputConnectionOnCreateInputConnection, editorInfo, this);
        if (inputConnectionOnCreateInputConnection != null && i10 <= 30 && (strArrH = v0.h(this)) != null) {
            b.b(editorInfo, strArrH);
            ca.b bVar = new ca.b(12, this);
            if (i10 >= 25) {
                dVar = new c(inputConnectionOnCreateInputConnection, bVar);
            } else if (b.a(editorInfo).length != 0) {
                dVar = new d(inputConnectionOnCreateInputConnection, bVar);
            }
            inputConnectionOnCreateInputConnection = dVar;
        }
        return this.f765e.c(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 30 || i4 >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        int i4 = Build.VERSION.SDK_INT;
        boolean zA = false;
        if (i4 < 31 && i4 >= 24 && dragEvent.getLocalState() == null && v0.h(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                zA = c0.a(dragEvent, this, activity);
            }
        }
        if (zA) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i4) {
        e dVar;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31 || v0.h(this) == null || !(i4 == 16908322 || i4 == 16908337)) {
            return super.onTextContextMenuItem(i4);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i10 >= 31) {
                dVar = new e4.d(primaryClip, 1);
            } else {
                f fVar = new f();
                fVar.f22329b = primaryClip;
                fVar.f22330c = 1;
                dVar = fVar;
            }
            dVar.b(i4 == 16908322 ? 0 : 1);
            v0.k(this, dVar.build());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        be1 be1Var = this.f761a;
        if (be1Var != null) {
            be1Var.z();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i4) {
        super.setBackgroundResource(i4);
        be1 be1Var = this.f761a;
        if (be1Var != null) {
            be1Var.A(i4);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        t0 t0Var = this.f762b;
        if (t0Var != null) {
            t0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        t0 t0Var = this.f762b;
        if (t0Var != null) {
            t0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(a.z(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z3) {
        this.f765e.d(z3);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f765e.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        be1 be1Var = this.f761a;
        if (be1Var != null) {
            be1Var.F(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        be1 be1Var = this.f761a;
        if (be1Var != null) {
            be1Var.G(mode);
        }
    }

    @Override // j4.l
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        t0 t0Var = this.f762b;
        t0Var.k(colorStateList);
        t0Var.b();
    }

    @Override // j4.l
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        t0 t0Var = this.f762b;
        t0Var.l(mode);
        t0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i4) throws Resources.NotFoundException {
        super.setTextAppearance(context, i4);
        t0 t0Var = this.f762b;
        if (t0Var != null) {
            t0Var.g(i4, context);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        z zVar;
        if (Build.VERSION.SDK_INT >= 28 || (zVar = this.f763c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            zVar.f30919c = textClassifier;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatEditText(Context context, AttributeSet attributeSet, int i4) throws Resources.NotFoundException {
        super(context, attributeSet, R.attr.editTextStyle);
        e3.a(context);
        d3.a(getContext(), this);
        be1 be1Var = new be1(this);
        this.f761a = be1Var;
        be1Var.x(attributeSet, R.attr.editTextStyle);
        t0 t0Var = new t0(this);
        this.f762b = t0Var;
        t0Var.f(attributeSet, R.attr.editTextStyle);
        t0Var.b();
        z zVar = new z();
        zVar.f30918b = this;
        this.f763c = zVar;
        this.f764d = new j();
        z zVar2 = new z(this);
        this.f765e = zVar2;
        zVar2.b(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerA = zVar2.a(keyListener);
        if (keyListenerA == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerA);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }
}
