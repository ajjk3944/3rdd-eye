package androidx.appcompat.widget;

import J.f;
import P.e;
import R.AbstractC0195w;
import U.k;
import a4.t;
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
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.recyclerview.widget.C0305b;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import o.C2706c0;
import o.C2740u;
import o.C2748y;
import o.N;
import o.U;
import o.V;
import o.W;
import o.W0;
import o.X;
import o.X0;
import o.q1;

/* loaded from: classes.dex */
public class AppCompatTextView extends TextView implements k {

    /* renamed from: a, reason: collision with root package name */
    public final C0305b f4866a;

    /* renamed from: b, reason: collision with root package name */
    public final U f4867b;

    /* renamed from: c, reason: collision with root package name */
    public final C2748y f4868c;

    /* renamed from: d, reason: collision with root package name */
    public C2740u f4869d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4870e;

    /* renamed from: f, reason: collision with root package name */
    public h2.d f4871f;

    /* renamed from: g, reason: collision with root package name */
    public Future f4872g;

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private C2740u getEmojiTextViewHelper() {
        if (this.f4869d == null) {
            this.f4869d = new C2740u(this);
        }
        return this.f4869d;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0305b c0305b = this.f4866a;
        if (c0305b != null) {
            c0305b.a();
        }
        U u6 = this.f4867b;
        if (u6 != null) {
            u6.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (q1.f22620c) {
            return super.getAutoSizeMaxTextSize();
        }
        U u6 = this.f4867b;
        if (u6 != null) {
            return Math.round(((C2706c0) u6.f22439l).f22493e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (q1.f22620c) {
            return super.getAutoSizeMinTextSize();
        }
        U u6 = this.f4867b;
        if (u6 != null) {
            return Math.round(((C2706c0) u6.f22439l).f22492d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (q1.f22620c) {
            return super.getAutoSizeStepGranularity();
        }
        U u6 = this.f4867b;
        if (u6 != null) {
            return Math.round(((C2706c0) u6.f22439l).f22491c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (q1.f22620c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        U u6 = this.f4867b;
        return u6 != null ? ((C2706c0) u6.f22439l).f22494f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (q1.f22620c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        U u6 = this.f4867b;
        if (u6 != null) {
            return ((C2706c0) u6.f22439l).f22489a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return t.u(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public V getSuperCaller() {
        if (this.f4871f == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                this.f4871f = new X(this);
            } else if (i >= 28) {
                this.f4871f = new W(this);
            } else if (i >= 26) {
                this.f4871f = new h2.d(this);
            }
        }
        return this.f4871f;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0305b c0305b = this.f4866a;
        if (c0305b != null) {
            return c0305b.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0305b c0305b = this.f4866a;
        if (c0305b != null) {
            return c0305b.i();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f4867b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f4867b.e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future future = this.f4872g;
        if (future != null) {
            try {
                this.f4872g = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                t.j(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C2748y c2748y;
        if (Build.VERSION.SDK_INT >= 28 || (c2748y = this.f4868c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c2748y.f22657c;
        return textClassifier == null ? N.a((TextView) c2748y.f22656b) : textClassifier;
    }

    public P.d getTextMetricsParamsCompat() {
        return t.j(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f4867b.getClass();
        U.h(editorInfo, inputConnectionOnCreateInputConnection, this);
        t.n(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z6, int i, int i3, int i6, int i7) {
        super.onLayout(z6, i, i3, i6, i7);
        U u6 = this.f4867b;
        if (u6 == null || q1.f22620c) {
            return;
        }
        ((C2706c0) u6.f22439l).a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i3) {
        Future future = this.f4872g;
        if (future != null) {
            try {
                this.f4872g = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                t.j(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i, i3);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i3, int i6) {
        super.onTextChanged(charSequence, i, i3, i6);
        U u6 = this.f4867b;
        if (u6 != null) {
            C2706c0 c2706c0 = (C2706c0) u6.f22439l;
            if (q1.f22620c || !c2706c0.f()) {
                return;
            }
            c2706c0.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z6) {
        super.setAllCaps(z6);
        getEmojiTextViewHelper().c(z6);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i3, int i6, int i7) {
        if (q1.f22620c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i3, i6, i7);
            return;
        }
        U u6 = this.f4867b;
        if (u6 != null) {
            u6.i(i, i3, i6, i7);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (q1.f22620c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        U u6 = this.f4867b;
        if (u6 != null) {
            u6.j(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (q1.f22620c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        U u6 = this.f4867b;
        if (u6 != null) {
            u6.k(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0305b c0305b = this.f4866a;
        if (c0305b != null) {
            c0305b.m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0305b c0305b = this.f4866a;
        if (c0305b != null) {
            c0305b.n(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        U u6 = this.f4867b;
        if (u6 != null) {
            u6.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        U u6 = this.f4867b;
        if (u6 != null) {
            u6.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        U u6 = this.f4867b;
        if (u6 != null) {
            u6.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        U u6 = this.f4867b;
        if (u6 != null) {
            u6.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(t.v(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z6) {
        getEmojiTextViewHelper().d(z6);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().h(i);
        } else {
            t.o(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().c(i);
        } else {
            t.p(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        t.q(this, i);
    }

    public void setPrecomputedText(e eVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        t.j(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0305b c0305b = this.f4866a;
        if (c0305b != null) {
            c0305b.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0305b c0305b = this.f4866a;
        if (c0305b != null) {
            c0305b.t(mode);
        }
    }

    @Override // U.k
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        U u6 = this.f4867b;
        u6.l(colorStateList);
        u6.b();
    }

    @Override // U.k
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        U u6 = this.f4867b;
        u6.m(mode);
        u6.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        U u6 = this.f4867b;
        if (u6 != null) {
            u6.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C2748y c2748y;
        if (Build.VERSION.SDK_INT >= 28 || (c2748y = this.f4868c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c2748y.f22657c = textClassifier;
        }
    }

    public void setTextFuture(Future<e> future) {
        this.f4872g = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(P.d dVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = dVar.f3113b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i = 7;
            }
        }
        setTextDirection(i);
        getPaint().set(dVar.f3112a);
        setBreakStrategy(dVar.f3114c);
        setHyphenationFrequency(dVar.f3115d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        boolean z6 = q1.f22620c;
        if (z6) {
            super.setTextSize(i, f2);
            return;
        }
        U u6 = this.f4867b;
        if (u6 != null) {
            C2706c0 c2706c0 = (C2706c0) u6.f22439l;
            if (z6 || c2706c0.f()) {
                return;
            }
            c2706c0.g(i, f2);
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        Typeface typefaceCreate;
        if (this.f4870e) {
            return;
        }
        if (typeface == null || i <= 0) {
            typefaceCreate = null;
        } else {
            Context context = getContext();
            com.bumptech.glide.e eVar = f.f2014a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typefaceCreate = Typeface.create(typeface, i);
        }
        this.f4870e = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.f4870e = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatTextView(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(context, attributeSet, i);
        X0.a(context);
        this.f4870e = false;
        this.f4871f = null;
        W0.a(getContext(), this);
        C0305b c0305b = new C0305b(this);
        this.f4866a = c0305b;
        c0305b.k(attributeSet, i);
        U u6 = new U(this);
        this.f4867b = u6;
        u6.f(attributeSet, i);
        u6.b();
        C2748y c2748y = new C2748y();
        c2748y.f22656b = this;
        this.f4868c = c2748y;
        getEmojiTextViewHelper().b(attributeSet, i);
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i, float f2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 34) {
            getSuperCaller().k(i, f2);
        } else if (i3 >= 34) {
            AbstractC0195w.h(this, i, f2);
        } else {
            t.q(this, Math.round(TypedValue.applyDimension(i, f2, getResources().getDisplayMetrics())));
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i3, int i6, int i7) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? t.i(context, i) : null, i3 != 0 ? t.i(context, i3) : null, i6 != 0 ? t.i(context, i6) : null, i7 != 0 ? t.i(context, i7) : null);
        U u6 = this.f4867b;
        if (u6 != null) {
            u6.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i3, int i6, int i7) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? t.i(context, i) : null, i3 != 0 ? t.i(context, i3) : null, i6 != 0 ? t.i(context, i6) : null, i7 != 0 ? t.i(context, i7) : null);
        U u6 = this.f4867b;
        if (u6 != null) {
            u6.b();
        }
    }
}
