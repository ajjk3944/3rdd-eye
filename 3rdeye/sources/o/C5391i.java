package o;

import L0.C0773d;
import L0.InterfaceC0790v;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
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
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import o.C5403v;

/* compiled from: AppCompatEditText.java */
/* renamed from: o.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5391i extends EditText implements InterfaceC0790v, R0.k {

    /* renamed from: b, reason: collision with root package name */
    public final C5386d f44683b;

    /* renamed from: c, reason: collision with root package name */
    public final C5404w f44684c;

    /* renamed from: d, reason: collision with root package name */
    public final C5403v f44685d;

    /* renamed from: e, reason: collision with root package name */
    public final R0.i f44686e;

    /* renamed from: f, reason: collision with root package name */
    public final E7.b f44687f;

    /* renamed from: g, reason: collision with root package name */
    public a f44688g;

    /* compiled from: AppCompatEditText.java */
    /* renamed from: o.i$a */
    public class a {
        public a() {
        }
    }

    public C5391i(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    private a getSuperCaller() {
        if (this.f44688g == null) {
            this.f44688g = new a();
        }
        return this.f44688g;
    }

    @Override // L0.InterfaceC0790v
    public final C0773d a(C0773d c0773d) {
        return this.f44686e.a(this, c0773d);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C5386d c5386d = this.f44683b;
        if (c5386d != null) {
            c5386d.a();
        }
        C5404w c5404w = this.f44684c;
        if (c5404w != null) {
            c5404w.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return R0.h.f(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C5386d c5386d = this.f44683b;
        if (c5386d != null) {
            return c5386d.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C5386d c5386d = this.f44683b;
        if (c5386d != null) {
            return c5386d.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f44684c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f44684c.e();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C5403v c5403v;
        if (Build.VERSION.SDK_INT >= 28 || (c5403v = this.f44685d) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = c5403v.f44740b;
        return textClassifier == null ? C5403v.a.a(c5403v.f44739a) : textClassifier;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0057 A[PHI: r1
  0x0057: PHI (r1v10 java.lang.String[]) = (r1v5 java.lang.String[]), (r1v11 java.lang.String[]) binds: [B:30:0x006a, B:22:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0071  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r8) {
        /*
            r7 = this;
            android.view.inputmethod.InputConnection r0 = super.onCreateInputConnection(r8)
            o.w r1 = r7.f44684c
            r1.getClass()
            o.C5404w.h(r8, r0, r7)
            B7.d.t(r8, r0, r7)
            if (r0 == 0) goto L77
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 > r2) goto L77
            java.lang.String[] r2 = L0.I.h(r7)
            if (r2 == 0) goto L77
            java.lang.String r3 = "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            java.lang.String r4 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            r5 = 25
            if (r1 < r5) goto L29
            Q0.a.a(r8, r2)
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
            M8.a r2 = new M8.a
            r6 = 4
            r2.<init>(r7, r6)
            if (r1 < r5) goto L4d
            Q0.d r1 = new Q0.d
            r1.<init>(r0, r2)
        L4b:
            r0 = r1
            goto L77
        L4d:
            java.lang.String[] r6 = Q0.c.f10855a
            if (r1 < r5) goto L59
            java.lang.String[] r1 = Q0.b.a(r8)
            if (r1 == 0) goto L6d
        L57:
            r6 = r1
            goto L6d
        L59:
            android.os.Bundle r1 = r8.extras
            if (r1 != 0) goto L5e
            goto L6d
        L5e:
            java.lang.String[] r1 = r1.getStringArray(r4)
            if (r1 != 0) goto L6a
            android.os.Bundle r1 = r8.extras
            java.lang.String[] r1 = r1.getStringArray(r3)
        L6a:
            if (r1 == 0) goto L6d
            goto L57
        L6d:
            int r1 = r6.length
            if (r1 != 0) goto L71
            goto L77
        L71:
            Q0.e r1 = new Q0.e
            r1.<init>(r0, r2)
            goto L4b
        L77:
            E7.b r1 = r7.f44687f
            d1.c r8 = r1.n(r0, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C5391i.onCreateInputConnection(android.view.inputmethod.EditorInfo):android.view.inputmethod.InputConnection");
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
        if (i < 31 && i >= 24 && dragEvent.getLocalState() == null && L0.I.h(this) != null) {
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
                zA = C5399q.a(dragEvent, this, activity);
            }
        }
        if (zA) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        C0773d.b aVar;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31 || L0.I.h(this) == null || !(i == 16908322 || i == 16908337)) {
            return super.onTextContextMenuItem(i);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i10 >= 31) {
                aVar = new C0773d.a(primaryClip, 1);
            } else {
                C0773d.c cVar = new C0773d.c();
                cVar.f3891a = primaryClip;
                cVar.f3892b = 1;
                aVar = cVar;
            }
            aVar.b(i == 16908322 ? 0 : 1);
            L0.I.k(this, aVar.build());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C5386d c5386d = this.f44683b;
        if (c5386d != null) {
            c5386d.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C5386d c5386d = this.f44683b;
        if (c5386d != null) {
            c5386d.f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C5404w c5404w = this.f44684c;
        if (c5404w != null) {
            c5404w.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C5404w c5404w = this.f44684c;
        if (c5404w != null) {
            c5404w.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(R0.h.g(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        this.f44687f.q(z10);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f44687f.j(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C5386d c5386d = this.f44683b;
        if (c5386d != null) {
            c5386d.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C5386d c5386d = this.f44683b;
        if (c5386d != null) {
            c5386d.i(mode);
        }
    }

    @Override // R0.k
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C5404w c5404w = this.f44684c;
        c5404w.l(colorStateList);
        c5404w.b();
    }

    @Override // R0.k
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C5404w c5404w = this.f44684c;
        c5404w.m(mode);
        c5404w.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C5404w c5404w = this.f44684c;
        if (c5404w != null) {
            c5404w.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C5403v c5403v;
        if (Build.VERSION.SDK_INT >= 28 || (c5403v = this.f44685d) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c5403v.f44740b = textClassifier;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5391i(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        U.a(context);
        S.a(this, getContext());
        C5386d c5386d = new C5386d(this);
        this.f44683b = c5386d;
        c5386d.d(attributeSet, i);
        C5404w c5404w = new C5404w(this);
        this.f44684c = c5404w;
        c5404w.f(attributeSet, i);
        c5404w.b();
        C5403v c5403v = new C5403v();
        c5403v.f44739a = this;
        this.f44685d = c5403v;
        this.f44686e = new R0.i();
        E7.b bVar = new E7.b(this);
        this.f44687f = bVar;
        bVar.m(attributeSet, i);
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

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }
}
