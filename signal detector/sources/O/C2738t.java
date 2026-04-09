package o;

import A2.C0117e;
import R.C0177d;
import R.C0179f;
import R.InterfaceC0176c;
import R.InterfaceC0189p;
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
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import androidx.recyclerview.widget.C0305b;
import com.apm.insight.R;

/* renamed from: o.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2738t extends EditText implements InterfaceC0189p, U.k {

    /* renamed from: a, reason: collision with root package name */
    public final C0305b f22635a;

    /* renamed from: b, reason: collision with root package name */
    public final U f22636b;

    /* renamed from: c, reason: collision with root package name */
    public final C2748y f22637c;

    /* renamed from: d, reason: collision with root package name */
    public final U.i f22638d;

    /* renamed from: e, reason: collision with root package name */
    public final C2748y f22639e;

    /* renamed from: f, reason: collision with root package name */
    public C2736s f22640f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2738t(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet, R.attr.editTextStyle);
        X0.a(context);
        W0.a(getContext(), this);
        C0305b c0305b = new C0305b(this);
        this.f22635a = c0305b;
        c0305b.k(attributeSet, R.attr.editTextStyle);
        U u6 = new U(this);
        this.f22636b = u6;
        u6.f(attributeSet, R.attr.editTextStyle);
        u6.b();
        C2748y c2748y = new C2748y();
        c2748y.f22656b = this;
        this.f22637c = c2748y;
        this.f22638d = new U.i();
        C2748y c2748y2 = new C2748y(this);
        this.f22639e = c2748y2;
        c2748y2.b(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerA = c2748y2.a(keyListener);
        if (keyListenerA == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerA);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
    }

    private C2736s getSuperCaller() {
        if (this.f22640f == null) {
            this.f22640f = new C2736s(this);
        }
        return this.f22640f;
    }

    @Override // R.InterfaceC0189p
    public final C0179f a(C0179f c0179f) {
        this.f22638d.getClass();
        return U.i.a(this, c0179f);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0305b c0305b = this.f22635a;
        if (c0305b != null) {
            c0305b.a();
        }
        U u6 = this.f22636b;
        if (u6 != null) {
            u6.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return a4.t.u(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0305b c0305b = this.f22635a;
        if (c0305b != null) {
            return c0305b.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0305b c0305b = this.f22635a;
        if (c0305b != null) {
            return c0305b.i();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f22636b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f22636b.e();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C2748y c2748y;
        if (Build.VERSION.SDK_INT >= 28 || (c2748y = this.f22637c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c2748y.f22657c;
        return textClassifier == null ? N.a((TextView) c2748y.f22656b) : textClassifier;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0058 A[PHI: r1
  0x0058: PHI (r1v10 java.lang.String[]) = (r1v5 java.lang.String[]), (r1v11 java.lang.String[]) binds: [B:30:0x006b, B:22:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0072  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r8) {
        /*
            r7 = this;
            android.view.inputmethod.InputConnection r0 = super.onCreateInputConnection(r8)
            o.U r1 = r7.f22636b
            r1.getClass()
            o.U.h(r8, r0, r7)
            a4.t.n(r8, r0, r7)
            if (r0 == 0) goto L78
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 > r2) goto L78
            java.lang.String[] r2 = R.O.g(r7)
            if (r2 == 0) goto L78
            java.lang.String r3 = "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            java.lang.String r4 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            r5 = 25
            if (r1 < r5) goto L29
            T.a.c(r8, r2)
            goto L3e
        L29:
            android.os.Bundle r6 = r8.extras
            if (r6 != 0) goto L34
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            r8.extras = r6
        L34:
            android.os.Bundle r6 = r8.extras
            r6.putStringArray(r4, r2)
            android.os.Bundle r6 = r8.extras
            r6.putStringArray(r3, r2)
        L3e:
            F4.c r2 = new F4.c
            r6 = 9
            r2.<init>(r6, r7)
            if (r1 < r5) goto L4e
            T.d r1 = new T.d
            r1.<init>(r0, r2)
        L4c:
            r0 = r1
            goto L78
        L4e:
            java.lang.String[] r6 = T.c.f3551a
            if (r1 < r5) goto L5a
            java.lang.String[] r1 = T.a.d(r8)
            if (r1 == 0) goto L6e
        L58:
            r6 = r1
            goto L6e
        L5a:
            android.os.Bundle r1 = r8.extras
            if (r1 != 0) goto L5f
            goto L6e
        L5f:
            java.lang.String[] r1 = r1.getStringArray(r4)
            if (r1 != 0) goto L6b
            android.os.Bundle r1 = r8.extras
            java.lang.String[] r1 = r1.getStringArray(r3)
        L6b:
            if (r1 == 0) goto L6e
            goto L58
        L6e:
            int r1 = r6.length
            if (r1 != 0) goto L72
            goto L78
        L72:
            T.e r1 = new T.e
            r1.<init>(r0, r2)
            goto L4c
        L78:
            o.y r1 = r7.f22639e
            h0.d r8 = r1.c(r0, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2738t.onCreateInputConnection(android.view.inputmethod.EditorInfo):android.view.inputmethod.InputConnection");
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        int i = Build.VERSION.SDK_INT;
        boolean zA = false;
        if (i < 31 && i >= 24 && dragEvent.getLocalState() == null && R.O.g(this) != null) {
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
                zA = AbstractC2691B.a(dragEvent, this, activity);
            }
        }
        if (zA) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        InterfaceC0176c c0117e;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 31 || R.O.g(this) == null || !(i == 16908322 || i == 16908337)) {
            return super.onTextContextMenuItem(i);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i3 >= 31) {
                c0117e = new C0117e(primaryClip, 1);
            } else {
                C0177d c0177d = new C0177d();
                c0177d.f3312b = primaryClip;
                c0177d.f3313c = 1;
                c0117e = c0177d;
            }
            c0117e.g(i == 16908322 ? 0 : 1);
            R.O.i(this, c0117e.build());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0305b c0305b = this.f22635a;
        if (c0305b != null) {
            c0305b.m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0305b c0305b = this.f22635a;
        if (c0305b != null) {
            c0305b.n(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        U u6 = this.f22636b;
        if (u6 != null) {
            u6.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        U u6 = this.f22636b;
        if (u6 != null) {
            u6.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(a4.t.v(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z6) {
        this.f22639e.d(z6);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f22639e.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0305b c0305b = this.f22635a;
        if (c0305b != null) {
            c0305b.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0305b c0305b = this.f22635a;
        if (c0305b != null) {
            c0305b.t(mode);
        }
    }

    @Override // U.k
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        U u6 = this.f22636b;
        u6.l(colorStateList);
        u6.b();
    }

    @Override // U.k
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        U u6 = this.f22636b;
        u6.m(mode);
        u6.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) throws Resources.NotFoundException {
        super.setTextAppearance(context, i);
        U u6 = this.f22636b;
        if (u6 != null) {
            u6.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C2748y c2748y;
        if (Build.VERSION.SDK_INT >= 28 || (c2748y = this.f22637c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c2748y.f22657c = textClassifier;
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }
}
