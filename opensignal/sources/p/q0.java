package p;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
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
import com.google.android.gms.internal.measurement.y3;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public class q0 extends TextView {
    public Future B;

    /* renamed from: a, reason: collision with root package name */
    public final h7.b f20135a;

    /* renamed from: d, reason: collision with root package name */
    public final m0 f20136d;

    /* renamed from: g, reason: collision with root package name */
    public final w f20137g;

    /* renamed from: r, reason: collision with root package name */
    public s f20138r;

    /* renamed from: x, reason: collision with root package name */
    public boolean f20139x;

    /* renamed from: y, reason: collision with root package name */
    public oh.p f20140y;

    public q0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private s getEmojiTextViewHelper() {
        if (this.f20138r == null) {
            this.f20138r = new s(this);
        }
        return this.f20138r;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        h7.b bVar = this.f20135a;
        if (bVar != null) {
            bVar.a();
        }
        m0 m0Var = this.f20136d;
        if (m0Var != null) {
            m0Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (z2.f20222c) {
            return super.getAutoSizeMaxTextSize();
        }
        m0 m0Var = this.f20136d;
        if (m0Var != null) {
            return Math.round(m0Var.f20113i.f20195e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (z2.f20222c) {
            return super.getAutoSizeMinTextSize();
        }
        m0 m0Var = this.f20136d;
        if (m0Var != null) {
            return Math.round(m0Var.f20113i.f20194d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (z2.f20222c) {
            return super.getAutoSizeStepGranularity();
        }
        m0 m0Var = this.f20136d;
        if (m0Var != null) {
            return Math.round(m0Var.f20113i.f20193c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (z2.f20222c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        m0 m0Var = this.f20136d;
        return m0Var != null ? m0Var.f20113i.f20196f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (z2.f20222c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        m0 m0Var = this.f20136d;
        if (m0Var != null) {
            return m0Var.f20113i.f20191a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return ic.a.Q(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public n0 getSuperCaller() {
        if (this.f20140y == null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 34) {
                this.f20140y = new p0(this);
            } else if (i10 >= 28) {
                this.f20140y = new o0(this);
            } else if (i10 >= 26) {
                this.f20140y = new oh.p(3, this);
            }
        }
        return this.f20140y;
    }

    public ColorStateList getSupportBackgroundTintList() {
        h7.b bVar = this.f20135a;
        if (bVar != null) {
            return bVar.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        h7.b bVar = this.f20135a;
        if (bVar != null) {
            return bVar.i();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f20136d.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f20136d.e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future future = this.B;
        if (future != null) {
            try {
                this.B = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                ic.a.u(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        w wVar;
        if (Build.VERSION.SDK_INT >= 28 || (wVar = this.f20137g) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) wVar.f20209c;
        return textClassifier == null ? h0.a((TextView) wVar.f20208b) : textClassifier;
    }

    public s3.d getTextMetricsParamsCompat() {
        return ic.a.u(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i10;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f20136d.getClass();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 30 && inputConnectionOnCreateInputConnection != null) {
            CharSequence text = getText();
            if (i11 >= 30) {
                w3.a.a(editorInfo, text);
            } else {
                text.getClass();
                if (i11 >= 30) {
                    w3.a.a(editorInfo, text);
                } else {
                    int i12 = editorInfo.initialSelStart;
                    int i13 = editorInfo.initialSelEnd;
                    int i14 = i12 > i13 ? i13 : i12;
                    if (i12 <= i13) {
                        i12 = i13;
                    }
                    int length = text.length();
                    if (i14 < 0 || i12 > length || (i10 = editorInfo.inputType & 4095) == 129 || i10 == 225 || i10 == 18) {
                        w3.b.a(editorInfo, null, 0, 0);
                    } else if (length <= 2048) {
                        w3.b.a(editorInfo, text, i14, i12);
                    } else {
                        int i15 = i12 - i14;
                        int i16 = i15 > 1024 ? 0 : i15;
                        int i17 = 2048 - i16;
                        int iMin = Math.min(text.length() - i12, i17 - Math.min(i14, (int) (i17 * 0.8d)));
                        int iMin2 = Math.min(i14, i17 - iMin);
                        int i18 = i14 - iMin2;
                        if (Character.isLowSurrogate(text.charAt(i18))) {
                            i18++;
                            iMin2--;
                        }
                        if (Character.isHighSurrogate(text.charAt((i12 + iMin) - 1))) {
                            iMin--;
                        }
                        int i19 = iMin2 + i16;
                        w3.b.a(editorInfo, i16 != i15 ? TextUtils.concat(text.subSequence(i18, i18 + iMin2), text.subSequence(i12, iMin + i12)) : text.subSequence(i18, i19 + iMin + i18), iMin2, i19);
                    }
                }
            }
        }
        ba.m.G(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30 || i10 >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        m0 m0Var = this.f20136d;
        if (m0Var == null || z2.f20222c) {
            return;
        }
        m0Var.f20113i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        Future future = this.B;
        if (future != null) {
            try {
                this.B = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                ic.a.u(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i10, i11);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        m0 m0Var = this.f20136d;
        if (m0Var != null) {
            v0 v0Var = m0Var.f20113i;
            if (z2.f20222c || !v0Var.f()) {
                return;
            }
            v0Var.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().c(z10);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) {
        if (z2.f20222c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
            return;
        }
        m0 m0Var = this.f20136d;
        if (m0Var != null) {
            m0Var.h(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) {
        if (z2.f20222c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
            return;
        }
        m0 m0Var = this.f20136d;
        if (m0Var != null) {
            m0Var.i(iArr, i10);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (z2.f20222c) {
            super.setAutoSizeTextTypeWithDefaults(i10);
            return;
        }
        m0 m0Var = this.f20136d;
        if (m0Var != null) {
            m0Var.j(i10);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        h7.b bVar = this.f20135a;
        if (bVar != null) {
            bVar.m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        h7.b bVar = this.f20135a;
        if (bVar != null) {
            bVar.n(i10);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        m0 m0Var = this.f20136d;
        if (m0Var != null) {
            m0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        m0 m0Var = this.f20136d;
        if (m0Var != null) {
            m0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        m0 m0Var = this.f20136d;
        if (m0Var != null) {
            m0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        m0 m0Var = this.f20136d;
        if (m0Var != null) {
            m0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(ic.a.R(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().q(i10);
        } else {
            ic.a.K(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().m(i10);
        } else {
            ic.a.L(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i10) {
        ic.a.M(this, i10);
    }

    public void setPrecomputedText(s3.e eVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        ic.a.u(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        h7.b bVar = this.f20135a;
        if (bVar != null) {
            bVar.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        h7.b bVar = this.f20135a;
        if (bVar != null) {
            bVar.t(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        m0 m0Var = this.f20136d;
        m0Var.k(colorStateList);
        m0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        m0 m0Var = this.f20136d;
        m0Var.l(mode);
        m0Var.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        m0 m0Var = this.f20136d;
        if (m0Var != null) {
            m0Var.g(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        w wVar;
        if (Build.VERSION.SDK_INT >= 28 || (wVar = this.f20137g) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            wVar.f20209c = textClassifier;
        }
    }

    public void setTextFuture(Future<s3.e> future) {
        this.B = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(s3.d dVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = dVar.f21864b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i10 = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i10 = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i10 = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i10 = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i10 = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i10 = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i10 = 7;
            }
        }
        setTextDirection(i10);
        getPaint().set(dVar.f21863a);
        setBreakStrategy(dVar.f21865c);
        setHyphenationFrequency(dVar.f21866d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i10, float f10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        boolean z10 = z2.f20222c;
        if (z10) {
            super.setTextSize(i10, f10);
            return;
        }
        m0 m0Var = this.f20136d;
        if (m0Var != null) {
            v0 v0Var = m0Var.f20113i;
            if (z10 || v0Var.f()) {
                return;
            }
            v0Var.g(i10, f10);
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i10) {
        Typeface typefaceCreate;
        if (this.f20139x) {
            return;
        }
        if (typeface == null || i10 <= 0) {
            typefaceCreate = null;
        } else {
            Context context = getContext();
            y3 y3Var = k3.g.f14021a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typefaceCreate = Typeface.create(typeface, i10);
        }
        this.f20139x = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i10);
        } finally {
            this.f20139x = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        i2.a(context);
        this.f20139x = false;
        this.f20140y = null;
        h2.a(getContext(), this);
        h7.b bVar = new h7.b(this);
        this.f20135a = bVar;
        bVar.k(attributeSet, i10);
        m0 m0Var = new m0(this);
        this.f20136d = m0Var;
        m0Var.f(attributeSet, i10);
        m0Var.b();
        w wVar = new w();
        wVar.f20208b = this;
        this.f20137g = wVar;
        getEmojiTextViewHelper().b(attributeSet, i10);
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i10, float f10) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 34) {
            getSuperCaller().s(i10, f10);
        } else if (i11 >= 34) {
            u3.r.k(this, i10, f10);
        } else {
            ic.a.M(this, Math.round(TypedValue.applyDimension(i10, f10, getResources().getDisplayMetrics())));
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i10 != 0 ? ic.a.r(context, i10) : null, i11 != 0 ? ic.a.r(context, i11) : null, i12 != 0 ? ic.a.r(context, i12) : null, i13 != 0 ? ic.a.r(context, i13) : null);
        m0 m0Var = this.f20136d;
        if (m0Var != null) {
            m0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i10 != 0 ? ic.a.r(context, i10) : null, i11 != 0 ? ic.a.r(context, i11) : null, i12 != 0 ? ic.a.r(context, i12) : null, i13 != 0 ? ic.a.r(context, i13) : null);
        m0 m0Var = this.f20136d;
        if (m0Var != null) {
            m0Var.b();
        }
    }
}
