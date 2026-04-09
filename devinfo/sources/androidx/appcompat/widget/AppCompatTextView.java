package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import c4.c;
import c4.d;
import com.google.android.gms.internal.ads.be1;
import e4.e0;
import g4.b;
import j4.l;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import km.y;
import p.b1;
import p.d3;
import p.e3;
import p.n0;
import p.t0;
import p.u;
import p.u0;
import p.v0;
import p.v3;
import p.w0;
import p.z;
import pk.a;
import v3.e;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class AppCompatTextView extends TextView implements l {

    /* renamed from: a, reason: collision with root package name */
    public final be1 f775a;

    /* renamed from: b, reason: collision with root package name */
    public final t0 f776b;

    /* renamed from: c, reason: collision with root package name */
    public final z f777c;

    /* renamed from: d, reason: collision with root package name */
    public u f778d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f779e;

    /* renamed from: f, reason: collision with root package name */
    public y f780f;
    public Future g;

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private u getEmojiTextViewHelper() {
        if (this.f778d == null) {
            this.f778d = new u(this);
        }
        return this.f778d;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        be1 be1Var = this.f775a;
        if (be1Var != null) {
            be1Var.a();
        }
        t0 t0Var = this.f776b;
        if (t0Var != null) {
            t0Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (v3.f30898c) {
            return super.getAutoSizeMaxTextSize();
        }
        t0 t0Var = this.f776b;
        if (t0Var != null) {
            return Math.round(((b1) t0Var.f30873l).f30626e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (v3.f30898c) {
            return super.getAutoSizeMinTextSize();
        }
        t0 t0Var = this.f776b;
        if (t0Var != null) {
            return Math.round(((b1) t0Var.f30873l).f30625d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (v3.f30898c) {
            return super.getAutoSizeStepGranularity();
        }
        t0 t0Var = this.f776b;
        if (t0Var != null) {
            return Math.round(((b1) t0Var.f30873l).f30624c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (v3.f30898c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        t0 t0Var = this.f776b;
        return t0Var != null ? ((b1) t0Var.f30873l).f30627f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (v3.f30898c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        t0 t0Var = this.f776b;
        if (t0Var != null) {
            return ((b1) t0Var.f30873l).f30622a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return a.w(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public u0 getSuperCaller() {
        if (this.f780f == null) {
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 34) {
                this.f780f = new w0(this);
            } else if (i4 >= 28) {
                this.f780f = new v0(this);
            } else if (i4 >= 26) {
                this.f780f = new y(6, this);
            }
        }
        return this.f780f;
    }

    public ColorStateList getSupportBackgroundTintList() {
        be1 be1Var = this.f775a;
        if (be1Var != null) {
            return be1Var.u();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        be1 be1Var = this.f775a;
        if (be1Var != null) {
            return be1Var.v();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f776b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f776b.e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future future = this.g;
        if (future != null) {
            try {
                this.g = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                a.j(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        z zVar;
        if (Build.VERSION.SDK_INT >= 28 || (zVar = this.f777c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) zVar.f30919c;
        return textClassifier == null ? n0.a((TextView) zVar.f30918b) : textClassifier;
    }

    public c getTextMetricsParamsCompat() {
        return a.j(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i4;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f776b.getClass();
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
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 30 || i4 >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z3, int i4, int i10, int i11, int i12) {
        super.onLayout(z3, i4, i10, i11, i12);
        t0 t0Var = this.f776b;
        if (t0Var == null || v3.f30898c) {
            return;
        }
        ((b1) t0Var.f30873l).a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i4, int i10) {
        Future future = this.g;
        if (future != null) {
            try {
                this.g = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                a.j(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i4, i10);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i4, int i10, int i11) {
        super.onTextChanged(charSequence, i4, i10, i11);
        t0 t0Var = this.f776b;
        if (t0Var != null) {
            b1 b1Var = (b1) t0Var.f30873l;
            if (v3.f30898c || !b1Var.f()) {
                return;
            }
            b1Var.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z3) {
        super.setAllCaps(z3);
        getEmojiTextViewHelper().c(z3);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i4, int i10, int i11, int i12) {
        if (v3.f30898c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i4, i10, i11, i12);
            return;
        }
        t0 t0Var = this.f776b;
        if (t0Var != null) {
            t0Var.h(i4, i10, i11, i12);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i4) {
        if (v3.f30898c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i4);
            return;
        }
        t0 t0Var = this.f776b;
        if (t0Var != null) {
            t0Var.i(iArr, i4);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i4) {
        if (v3.f30898c) {
            super.setAutoSizeTextTypeWithDefaults(i4);
            return;
        }
        t0 t0Var = this.f776b;
        if (t0Var != null) {
            t0Var.j(i4);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        be1 be1Var = this.f775a;
        if (be1Var != null) {
            be1Var.z();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i4) {
        super.setBackgroundResource(i4);
        be1 be1Var = this.f775a;
        if (be1Var != null) {
            be1Var.A(i4);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        t0 t0Var = this.f776b;
        if (t0Var != null) {
            t0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        t0 t0Var = this.f776b;
        if (t0Var != null) {
            t0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        t0 t0Var = this.f776b;
        if (t0Var != null) {
            t0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        t0 t0Var = this.f776b;
        if (t0Var != null) {
            t0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(a.z(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z3) {
        getEmojiTextViewHelper().d(z3);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i4) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().o(i4);
        } else {
            a.t(this, i4);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i4) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().l(i4);
        } else {
            a.u(this, i4);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i4) {
        a.v(this, i4);
    }

    public void setPrecomputedText(d dVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        a.j(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        be1 be1Var = this.f775a;
        if (be1Var != null) {
            be1Var.F(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        be1 be1Var = this.f775a;
        if (be1Var != null) {
            be1Var.G(mode);
        }
    }

    @Override // j4.l
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        t0 t0Var = this.f776b;
        t0Var.k(colorStateList);
        t0Var.b();
    }

    @Override // j4.l
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        t0 t0Var = this.f776b;
        t0Var.l(mode);
        t0Var.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i4) {
        super.setTextAppearance(context, i4);
        t0 t0Var = this.f776b;
        if (t0Var != null) {
            t0Var.g(i4, context);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        z zVar;
        if (Build.VERSION.SDK_INT >= 28 || (zVar = this.f777c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            zVar.f30919c = textClassifier;
        }
    }

    public void setTextFuture(Future<d> future) {
        this.g = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(c cVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = cVar.f2750b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i4 = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i4 = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i4 = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i4 = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i4 = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i4 = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i4 = 7;
            }
        }
        setTextDirection(i4);
        getPaint().set(cVar.f2749a);
        setBreakStrategy(cVar.f2751c);
        setHyphenationFrequency(cVar.f2752d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i4, float f10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        boolean z3 = v3.f30898c;
        if (z3) {
            super.setTextSize(i4, f10);
            return;
        }
        t0 t0Var = this.f776b;
        if (t0Var != null) {
            b1 b1Var = (b1) t0Var.f30873l;
            if (z3 || b1Var.f()) {
                return;
            }
            b1Var.g(i4, f10);
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i4) {
        Typeface typefaceCreate;
        if (this.f779e) {
            return;
        }
        if (typeface == null || i4 <= 0) {
            typefaceCreate = null;
        } else {
            Context context = getContext();
            wd.b bVar = e.f35800a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typefaceCreate = Typeface.create(typeface, i4);
        }
        this.f779e = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i4);
        } finally {
            this.f779e = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatTextView(Context context, AttributeSet attributeSet, int i4) throws Resources.NotFoundException {
        super(context, attributeSet, i4);
        e3.a(context);
        this.f779e = false;
        this.f780f = null;
        d3.a(getContext(), this);
        be1 be1Var = new be1(this);
        this.f775a = be1Var;
        be1Var.x(attributeSet, i4);
        t0 t0Var = new t0(this);
        this.f776b = t0Var;
        t0Var.f(attributeSet, i4);
        t0Var.b();
        z zVar = new z();
        zVar.f30918b = this;
        this.f777c = zVar;
        getEmojiTextViewHelper().b(attributeSet, i4);
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i4, float f10) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            getSuperCaller().s(i4, f10);
        } else if (i10 >= 34) {
            e0.n(this, i4, f10);
        } else {
            a.v(this, Math.round(TypedValue.applyDimension(i4, f10, getResources().getDisplayMetrics())));
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i4, int i10, int i11, int i12) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i4 != 0 ? jm.a.l(i4, context) : null, i10 != 0 ? jm.a.l(i10, context) : null, i11 != 0 ? jm.a.l(i11, context) : null, i12 != 0 ? jm.a.l(i12, context) : null);
        t0 t0Var = this.f776b;
        if (t0Var != null) {
            t0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i4, int i10, int i11, int i12) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i4 != 0 ? jm.a.l(i4, context) : null, i10 != 0 ? jm.a.l(i10, context) : null, i11 != 0 ? jm.a.l(i11, context) : null, i12 != 0 ? jm.a.l(i12, context) : null);
        t0 t0Var = this.f776b;
        if (t0Var != null) {
            t0Var.b();
        }
    }
}
