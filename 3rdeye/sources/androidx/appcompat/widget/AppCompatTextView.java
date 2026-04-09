package androidx.appcompat.widget;

import A9.I;
import C0.n;
import J0.h;
import R0.h;
import R0.k;
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
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import o.C5386d;
import o.C5392j;
import o.C5403v;
import o.C5404w;
import o.C5406y;
import o.S;
import o.U;
import o.f0;

/* loaded from: classes.dex */
public class AppCompatTextView extends TextView implements k {

    /* renamed from: b, reason: collision with root package name */
    public final C5386d f14608b;

    /* renamed from: c, reason: collision with root package name */
    public final C5404w f14609c;

    /* renamed from: d, reason: collision with root package name */
    public final C5403v f14610d;

    /* renamed from: e, reason: collision with root package name */
    public C5392j f14611e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f14612f;

    /* renamed from: g, reason: collision with root package name */
    public b f14613g;

    /* renamed from: h, reason: collision with root package name */
    public Future<h> f14614h;

    public interface a {
        void a(int i);

        void b(int i);

        void c(int i, float f10);
    }

    public class c extends b {
        public c() {
            super();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.b, androidx.appcompat.widget.AppCompatTextView.a
        public final void a(int i) {
            AppCompatTextView.super.setLastBaselineToBottomHeight(i);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.b, androidx.appcompat.widget.AppCompatTextView.a
        public final void b(int i) {
            AppCompatTextView.super.setFirstBaselineToTopHeight(i);
        }
    }

    public class d extends c {
        public d() {
            super();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.b, androidx.appcompat.widget.AppCompatTextView.a
        public final void c(int i, float f10) {
            AppCompatTextView.super.setLineHeight(i, f10);
        }
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private C5392j getEmojiTextViewHelper() {
        if (this.f14611e == null) {
            this.f14611e = new C5392j(this);
        }
        return this.f14611e;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C5386d c5386d = this.f14608b;
        if (c5386d != null) {
            c5386d.a();
        }
        C5404w c5404w = this.f14609c;
        if (c5404w != null) {
            c5404w.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (f0.f44667c) {
            return super.getAutoSizeMaxTextSize();
        }
        C5404w c5404w = this.f14609c;
        if (c5404w != null) {
            return Math.round(c5404w.i.f44766e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (f0.f44667c) {
            return super.getAutoSizeMinTextSize();
        }
        C5404w c5404w = this.f14609c;
        if (c5404w != null) {
            return Math.round(c5404w.i.f44765d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (f0.f44667c) {
            return super.getAutoSizeStepGranularity();
        }
        C5404w c5404w = this.f14609c;
        if (c5404w != null) {
            return Math.round(c5404w.i.f44764c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (f0.f44667c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C5404w c5404w = this.f14609c;
        return c5404w != null ? c5404w.i.f44767f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (f0.f44667c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C5404w c5404w = this.f14609c;
        if (c5404w != null) {
            return c5404w.i.f44762a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return R0.h.f(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public a getSuperCaller() {
        if (this.f14613g == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                this.f14613g = new d();
            } else if (i >= 28) {
                this.f14613g = new c();
            } else if (i >= 26) {
                this.f14613g = new b();
            }
        }
        return this.f14613g;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C5386d c5386d = this.f14608b;
        if (c5386d != null) {
            return c5386d.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C5386d c5386d = this.f14608b;
        if (c5386d != null) {
            return c5386d.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f14609c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f14609c.e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        n();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C5403v c5403v;
        if (Build.VERSION.SDK_INT >= 28 || (c5403v = this.f14610d) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = c5403v.f44740b;
        return textClassifier == null ? C5403v.a.a(c5403v.f44739a) : textClassifier;
    }

    public h.a getTextMetricsParamsCompat() {
        return R0.h.a(this);
    }

    public final void n() {
        Future<h> future = this.f14614h;
        if (future != null) {
            try {
                this.f14614h = null;
                R0.h.e(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f14609c.getClass();
        C5404w.h(editorInfo, inputConnectionOnCreateInputConnection, this);
        B7.d.t(editorInfo, inputConnectionOnCreateInputConnection, this);
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
    public void onLayout(boolean z10, int i, int i10, int i11, int i12) {
        super.onLayout(z10, i, i10, i11, i12);
        C5404w c5404w = this.f14609c;
        if (c5404w == null || f0.f44667c) {
            return;
        }
        c5404w.i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i10) {
        n();
        super.onMeasure(i, i10);
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i10, int i11) {
        super.onTextChanged(charSequence, i, i10, i11);
        C5404w c5404w = this.f14609c;
        if (c5404w == null || f0.f44667c) {
            return;
        }
        C5406y c5406y = c5404w.i;
        if (c5406y.f()) {
            c5406y.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().c(z10);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i10, int i11, int i12) throws IllegalArgumentException {
        if (f0.f44667c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i10, i11, i12);
            return;
        }
        C5404w c5404w = this.f14609c;
        if (c5404w != null) {
            c5404w.i(i, i10, i11, i12);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) throws IllegalArgumentException {
        if (f0.f44667c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C5404w c5404w = this.f14609c;
        if (c5404w != null) {
            c5404w.j(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (f0.f44667c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C5404w c5404w = this.f14609c;
        if (c5404w != null) {
            c5404w.k(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C5386d c5386d = this.f14608b;
        if (c5386d != null) {
            c5386d.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C5386d c5386d = this.f14608b;
        if (c5386d != null) {
            c5386d.f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C5404w c5404w = this.f14609c;
        if (c5404w != null) {
            c5404w.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C5404w c5404w = this.f14609c;
        if (c5404w != null) {
            c5404w.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C5404w c5404w = this.f14609c;
        if (c5404w != null) {
            c5404w.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C5404w c5404w = this.f14609c;
        if (c5404w != null) {
            c5404w.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(R0.h.g(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().b(i);
        } else {
            R0.h.b(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().a(i);
        } else {
            R0.h.c(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        R0.h.d(this, i);
    }

    public void setPrecomputedText(h hVar) {
        R0.h.e(this, hVar);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C5386d c5386d = this.f14608b;
        if (c5386d != null) {
            c5386d.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C5386d c5386d = this.f14608b;
        if (c5386d != null) {
            c5386d.i(mode);
        }
    }

    @Override // R0.k
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C5404w c5404w = this.f14609c;
        c5404w.l(colorStateList);
        c5404w.b();
    }

    @Override // R0.k
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C5404w c5404w = this.f14609c;
        c5404w.m(mode);
        c5404w.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C5404w c5404w = this.f14609c;
        if (c5404w != null) {
            c5404w.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C5403v c5403v;
        if (Build.VERSION.SDK_INT >= 28 || (c5403v = this.f14610d) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c5403v.f44740b = textClassifier;
        }
    }

    public void setTextFuture(Future<h> future) {
        this.f14614h = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(h.a aVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = aVar.f2705b;
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
        getPaint().set(aVar.f2704a);
        h.a.e(this, aVar.f2706c);
        h.a.h(this, aVar.f2707d);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f10) {
        boolean z10 = f0.f44667c;
        if (z10) {
            super.setTextSize(i, f10);
            return;
        }
        C5404w c5404w = this.f14609c;
        if (c5404w == null || z10) {
            return;
        }
        C5406y c5406y = c5404w.i;
        if (c5406y.f()) {
            return;
        }
        c5406y.g(f10, i);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        Typeface typefaceCreate;
        if (this.f14612f) {
            return;
        }
        if (typeface == null || i <= 0) {
            typefaceCreate = null;
        } else {
            Context context = getContext();
            n nVar = C0.h.f808a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typefaceCreate = Typeface.create(typeface, i);
        }
        this.f14612f = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.f14612f = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        U.a(context);
        this.f14612f = false;
        this.f14613g = null;
        S.a(this, getContext());
        C5386d c5386d = new C5386d(this);
        this.f14608b = c5386d;
        c5386d.d(attributeSet, i);
        C5404w c5404w = new C5404w(this);
        this.f14609c = c5404w;
        c5404w.f(attributeSet, i);
        c5404w.b();
        C5403v c5403v = new C5403v();
        c5403v.f44739a = this;
        this.f14610d = c5403v;
        getEmojiTextViewHelper().b(attributeSet, i);
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i, float f10) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            getSuperCaller().c(i, f10);
        } else if (i10 >= 34) {
            h.d.a(this, i, f10);
        } else {
            R0.h.d(this, Math.round(TypedValue.applyDimension(i, f10, getResources().getDisplayMetrics())));
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i10, int i11, int i12) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? I.w(context, i) : null, i10 != 0 ? I.w(context, i10) : null, i11 != 0 ? I.w(context, i11) : null, i12 != 0 ? I.w(context, i12) : null);
        C5404w c5404w = this.f14609c;
        if (c5404w != null) {
            c5404w.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i10, int i11, int i12) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? I.w(context, i) : null, i10 != 0 ? I.w(context, i10) : null, i11 != 0 ? I.w(context, i11) : null, i12 != 0 ? I.w(context, i12) : null);
        C5404w c5404w = this.f14609c;
        if (c5404w != null) {
            c5404w.b();
        }
    }

    public class b implements a {
        public b() {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void a(int i) {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void b(int i) {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void c(int i, float f10) {
        }
    }
}
