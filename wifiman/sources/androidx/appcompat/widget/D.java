package androidx.appcompat.widget;

import D1.k;
import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import f.AbstractC5487d;
import i.AbstractC6050a;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public class D extends TextView {

    /* renamed from: a, reason: collision with root package name */
    private final C3880e f27088a;

    /* renamed from: b, reason: collision with root package name */
    private final C f27089b;

    /* renamed from: c, reason: collision with root package name */
    private final B f27090c;

    /* renamed from: d, reason: collision with root package name */
    private C3889n f27091d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f27092e;

    /* renamed from: f, reason: collision with root package name */
    private a f27093f;

    /* renamed from: g, reason: collision with root package name */
    private Future f27094g;

    private interface a {
        void a(int[] iArr, int i10);

        int[] b();

        TextClassifier c();

        int d();

        void e(TextClassifier textClassifier);

        void f(int i10);

        void g(int i10, int i11, int i12, int i13);

        int h();

        int i();

        void j(int i10);

        int k();

        void l(int i10);

        void m(int i10, float f10);
    }

    class b implements a {
        b() {
        }

        @Override // androidx.appcompat.widget.D.a
        public void a(int[] iArr, int i10) {
            D.super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
        }

        @Override // androidx.appcompat.widget.D.a
        public int[] b() {
            return D.super.getAutoSizeTextAvailableSizes();
        }

        @Override // androidx.appcompat.widget.D.a
        public TextClassifier c() {
            return D.super.getTextClassifier();
        }

        @Override // androidx.appcompat.widget.D.a
        public int d() {
            return D.super.getAutoSizeMaxTextSize();
        }

        @Override // androidx.appcompat.widget.D.a
        public void e(TextClassifier textClassifier) {
            D.super.setTextClassifier(textClassifier);
        }

        @Override // androidx.appcompat.widget.D.a
        public void f(int i10) {
        }

        @Override // androidx.appcompat.widget.D.a
        public void g(int i10, int i11, int i12, int i13) {
            D.super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
        }

        @Override // androidx.appcompat.widget.D.a
        public int h() {
            return D.super.getAutoSizeTextType();
        }

        @Override // androidx.appcompat.widget.D.a
        public int i() {
            return D.super.getAutoSizeMinTextSize();
        }

        @Override // androidx.appcompat.widget.D.a
        public void j(int i10) {
        }

        @Override // androidx.appcompat.widget.D.a
        public int k() {
            return D.super.getAutoSizeStepGranularity();
        }

        @Override // androidx.appcompat.widget.D.a
        public void l(int i10) {
            D.super.setAutoSizeTextTypeWithDefaults(i10);
        }

        @Override // androidx.appcompat.widget.D.a
        public void m(int i10, float f10) {
        }
    }

    class c extends b {
        c() {
            super();
        }

        @Override // androidx.appcompat.widget.D.b, androidx.appcompat.widget.D.a
        public void f(int i10) {
            D.super.setLastBaselineToBottomHeight(i10);
        }

        @Override // androidx.appcompat.widget.D.b, androidx.appcompat.widget.D.a
        public void j(int i10) {
            D.super.setFirstBaselineToTopHeight(i10);
        }
    }

    class d extends c {
        d() {
            super();
        }

        @Override // androidx.appcompat.widget.D.b, androidx.appcompat.widget.D.a
        public void m(int i10, float f10) {
            D.super.setLineHeight(i10, f10);
        }
    }

    public D(Context context) {
        this(context, null);
    }

    private C3889n getEmojiTextViewHelper() {
        if (this.f27091d == null) {
            this.f27091d = new C3889n(this);
        }
        return this.f27091d;
    }

    private void r() {
        Future future = this.f27094g;
        if (future != null) {
            try {
                this.f27094g = null;
                AbstractC5487d.a(future.get());
                androidx.core.widget.h.n(this, null);
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C3880e c3880e = this.f27088a;
        if (c3880e != null) {
            c3880e.b();
        }
        C c10 = this.f27089b;
        if (c10 != null) {
            c10.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (i0.f27413c) {
            return getSuperCaller().d();
        }
        C c10 = this.f27089b;
        if (c10 != null) {
            return c10.e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (i0.f27413c) {
            return getSuperCaller().i();
        }
        C c10 = this.f27089b;
        if (c10 != null) {
            return c10.f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (i0.f27413c) {
            return getSuperCaller().k();
        }
        C c10 = this.f27089b;
        if (c10 != null) {
            return c10.g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (i0.f27413c) {
            return getSuperCaller().b();
        }
        C c10 = this.f27089b;
        return c10 != null ? c10.h() : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (i0.f27413c) {
            return getSuperCaller().h() == 1 ? 1 : 0;
        }
        C c10 = this.f27089b;
        if (c10 != null) {
            return c10.i();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.h.q(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return androidx.core.widget.h.b(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return androidx.core.widget.h.c(this);
    }

    a getSuperCaller() {
        if (this.f27093f == null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 34) {
                this.f27093f = new d();
            } else if (i10 >= 28) {
                this.f27093f = new c();
            } else {
                this.f27093f = new b();
            }
        }
        return this.f27093f;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C3880e c3880e = this.f27088a;
        if (c3880e != null) {
            return c3880e.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C3880e c3880e = this.f27088a;
        if (c3880e != null) {
            return c3880e.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f27089b.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f27089b.k();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        r();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        B b10;
        return (Build.VERSION.SDK_INT >= 28 || (b10 = this.f27090c) == null) ? getSuperCaller().c() : b10.a();
    }

    public k.a getTextMetricsParamsCompat() {
        return androidx.core.widget.h.f(this);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f27089b.r(this, inputConnectionOnCreateInputConnection, editorInfo);
        return AbstractC3890o.a(inputConnectionOnCreateInputConnection, editorInfo, this);
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30 || i10 >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        C c10 = this.f27089b;
        if (c10 != null) {
            c10.o(z10, i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i10, int i11) {
        r();
        super.onMeasure(i10, i11);
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        C c10 = this.f27089b;
        if (c10 == null || i0.f27413c || !c10.l()) {
            return;
        }
        this.f27089b.c();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().c(z10);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) {
        if (i0.f27413c) {
            getSuperCaller().g(i10, i11, i12, i13);
            return;
        }
        C c10 = this.f27089b;
        if (c10 != null) {
            c10.t(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) {
        if (i0.f27413c) {
            getSuperCaller().a(iArr, i10);
            return;
        }
        C c10 = this.f27089b;
        if (c10 != null) {
            c10.u(iArr, i10);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (i0.f27413c) {
            getSuperCaller().l(i10);
            return;
        }
        C c10 = this.f27089b;
        if (c10 != null) {
            c10.v(i10);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C3880e c3880e = this.f27088a;
        if (c3880e != null) {
            c3880e.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C3880e c3880e = this.f27088a;
        if (c3880e != null) {
            c3880e.g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C c10 = this.f27089b;
        if (c10 != null) {
            c10.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C c10 = this.f27089b;
        if (c10 != null) {
            c10.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C c10 = this.f27089b;
        if (c10 != null) {
            c10.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C c10 = this.f27089b;
        if (c10 != null) {
            c10.p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.h.r(this, callback));
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
            getSuperCaller().j(i10);
        } else {
            androidx.core.widget.h.j(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().f(i10);
        } else {
            androidx.core.widget.h.k(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i10) {
        androidx.core.widget.h.l(this, i10);
    }

    public void setPrecomputedText(D1.k kVar) {
        androidx.core.widget.h.n(this, kVar);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C3880e c3880e = this.f27088a;
        if (c3880e != null) {
            c3880e.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C3880e c3880e = this.f27088a;
        if (c3880e != null) {
            c3880e.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f27089b.w(colorStateList);
        this.f27089b.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f27089b.x(mode);
        this.f27089b.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C c10 = this.f27089b;
        if (c10 != null) {
            c10.q(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        B b10;
        if (Build.VERSION.SDK_INT >= 28 || (b10 = this.f27090c) == null) {
            getSuperCaller().e(textClassifier);
        } else {
            b10.b(textClassifier);
        }
    }

    public void setTextFuture(Future<D1.k> future) {
        this.f27094g = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(k.a aVar) {
        androidx.core.widget.h.p(this, aVar);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f10) {
        if (i0.f27413c) {
            super.setTextSize(i10, f10);
            return;
        }
        C c10 = this.f27089b;
        if (c10 != null) {
            c10.A(i10, f10);
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i10) {
        if (this.f27092e) {
            return;
        }
        Typeface typefaceA = (typeface == null || i10 <= 0) ? null : w1.l.a(getContext(), typeface, i10);
        this.f27092e = true;
        if (typefaceA != null) {
            typeface = typefaceA;
        }
        try {
            super.setTypeface(typeface, i10);
        } finally {
            this.f27092e = false;
        }
    }

    public D(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i10, float f10) {
        if (Build.VERSION.SDK_INT >= 34) {
            getSuperCaller().m(i10, f10);
        } else {
            androidx.core.widget.h.m(this, i10, f10);
        }
    }

    public D(Context context, AttributeSet attributeSet, int i10) {
        super(Y.b(context), attributeSet, i10);
        this.f27092e = false;
        this.f27093f = null;
        X.a(this, getContext());
        C3880e c3880e = new C3880e(this);
        this.f27088a = c3880e;
        c3880e.e(attributeSet, i10);
        C c10 = new C(this);
        this.f27089b = c10;
        c10.m(attributeSet, i10);
        c10.b();
        this.f27090c = new B(this);
        getEmojiTextViewHelper().b(attributeSet, i10);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i10 != 0 ? AbstractC6050a.b(context, i10) : null, i11 != 0 ? AbstractC6050a.b(context, i11) : null, i12 != 0 ? AbstractC6050a.b(context, i12) : null, i13 != 0 ? AbstractC6050a.b(context, i13) : null);
        C c10 = this.f27089b;
        if (c10 != null) {
            c10.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i10 != 0 ? AbstractC6050a.b(context, i10) : null, i11 != 0 ? AbstractC6050a.b(context, i11) : null, i12 != 0 ? AbstractC6050a.b(context, i12) : null, i13 != 0 ? AbstractC6050a.b(context, i13) : null);
        C c10 = this.f27089b;
        if (c10 != null) {
            c10.p();
        }
    }
}
