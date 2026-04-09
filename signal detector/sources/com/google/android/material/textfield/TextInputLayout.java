package com.google.android.material.textfield;

import C0.k;
import F4.b;
import G3.C0147a;
import G3.C0152f;
import G3.C0154h;
import G3.InterfaceC0150d;
import G3.j;
import G3.n;
import G3.o;
import L0.g;
import M3.A;
import M3.B;
import M3.C;
import M3.D;
import M3.f;
import M3.m;
import M3.p;
import M3.s;
import M3.t;
import M3.w;
import M3.y;
import M3.z;
import O3.a;
import P.h;
import R.O;
import a.AbstractC0241a;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.bumptech.glide.c;
import com.bumptech.glide.d;
import com.bumptech.glide.e;
import com.google.android.material.internal.CheckableImageButton;
import d3.AbstractC2266a;
import e3.AbstractC2303a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import o.AbstractC2720j0;
import o.a1;
import o.r;
import o4.AbstractC2763b;
import x3.AbstractC2993B;
import x3.AbstractC2998c;
import x3.C2997b;
import x3.v;

/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: R0, reason: collision with root package name */
    public static final int[][] f18491R0 = {new int[]{R.attr.state_pressed}, new int[0]};

    /* renamed from: A0, reason: collision with root package name */
    public int f18492A0;

    /* renamed from: B0, reason: collision with root package name */
    public int f18493B0;

    /* renamed from: C, reason: collision with root package name */
    public C f18494C;

    /* renamed from: C0, reason: collision with root package name */
    public ColorStateList f18495C0;

    /* renamed from: D, reason: collision with root package name */
    public AppCompatTextView f18496D;

    /* renamed from: D0, reason: collision with root package name */
    public int f18497D0;

    /* renamed from: E, reason: collision with root package name */
    public int f18498E;

    /* renamed from: E0, reason: collision with root package name */
    public int f18499E0;

    /* renamed from: F, reason: collision with root package name */
    public int f18500F;

    /* renamed from: F0, reason: collision with root package name */
    public int f18501F0;

    /* renamed from: G, reason: collision with root package name */
    public CharSequence f18502G;

    /* renamed from: G0, reason: collision with root package name */
    public int f18503G0;

    /* renamed from: H, reason: collision with root package name */
    public boolean f18504H;

    /* renamed from: H0, reason: collision with root package name */
    public int f18505H0;

    /* renamed from: I, reason: collision with root package name */
    public AppCompatTextView f18506I;

    /* renamed from: I0, reason: collision with root package name */
    public int f18507I0;

    /* renamed from: J, reason: collision with root package name */
    public ColorStateList f18508J;

    /* renamed from: J0, reason: collision with root package name */
    public boolean f18509J0;

    /* renamed from: K, reason: collision with root package name */
    public int f18510K;

    /* renamed from: K0, reason: collision with root package name */
    public final C2997b f18511K0;

    /* renamed from: L, reason: collision with root package name */
    public g f18512L;

    /* renamed from: L0, reason: collision with root package name */
    public boolean f18513L0;
    public g M;

    /* renamed from: M0, reason: collision with root package name */
    public boolean f18514M0;

    /* renamed from: N, reason: collision with root package name */
    public ColorStateList f18515N;

    /* renamed from: N0, reason: collision with root package name */
    public ValueAnimator f18516N0;

    /* renamed from: O, reason: collision with root package name */
    public ColorStateList f18517O;

    /* renamed from: O0, reason: collision with root package name */
    public boolean f18518O0;

    /* renamed from: P, reason: collision with root package name */
    public ColorStateList f18519P;

    /* renamed from: P0, reason: collision with root package name */
    public boolean f18520P0;

    /* renamed from: Q, reason: collision with root package name */
    public ColorStateList f18521Q;

    /* renamed from: Q0, reason: collision with root package name */
    public boolean f18522Q0;

    /* renamed from: R, reason: collision with root package name */
    public boolean f18523R;

    /* renamed from: S, reason: collision with root package name */
    public CharSequence f18524S;

    /* renamed from: T, reason: collision with root package name */
    public boolean f18525T;

    /* renamed from: U, reason: collision with root package name */
    public j f18526U;

    /* renamed from: V, reason: collision with root package name */
    public j f18527V;

    /* renamed from: W, reason: collision with root package name */
    public StateListDrawable f18528W;

    /* renamed from: a, reason: collision with root package name */
    public final FrameLayout f18529a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f18530a0;

    /* renamed from: b, reason: collision with root package name */
    public final y f18531b;
    public j b0;

    /* renamed from: c, reason: collision with root package name */
    public final p f18532c;

    /* renamed from: c0, reason: collision with root package name */
    public j f18533c0;

    /* renamed from: d, reason: collision with root package name */
    public final int f18534d;

    /* renamed from: d0, reason: collision with root package name */
    public o f18535d0;

    /* renamed from: e, reason: collision with root package name */
    public EditText f18536e;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f18537e0;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f18538f;

    /* renamed from: f0, reason: collision with root package name */
    public final int f18539f0;

    /* renamed from: g, reason: collision with root package name */
    public int f18540g;

    /* renamed from: g0, reason: collision with root package name */
    public int f18541g0;

    /* renamed from: h, reason: collision with root package name */
    public int f18542h;

    /* renamed from: h0, reason: collision with root package name */
    public int f18543h0;
    public int i;

    /* renamed from: i0, reason: collision with root package name */
    public int f18544i0;

    /* renamed from: j, reason: collision with root package name */
    public int f18545j;

    /* renamed from: j0, reason: collision with root package name */
    public int f18546j0;

    /* renamed from: k, reason: collision with root package name */
    public final t f18547k;

    /* renamed from: k0, reason: collision with root package name */
    public int f18548k0;

    /* renamed from: l, reason: collision with root package name */
    public boolean f18549l;

    /* renamed from: l0, reason: collision with root package name */
    public int f18550l0;

    /* renamed from: m, reason: collision with root package name */
    public int f18551m;

    /* renamed from: m0, reason: collision with root package name */
    public int f18552m0;

    /* renamed from: n, reason: collision with root package name */
    public boolean f18553n;

    /* renamed from: n0, reason: collision with root package name */
    public final Rect f18554n0;

    /* renamed from: o0, reason: collision with root package name */
    public final Rect f18555o0;

    /* renamed from: p0, reason: collision with root package name */
    public final RectF f18556p0;

    /* renamed from: q0, reason: collision with root package name */
    public Typeface f18557q0;

    /* renamed from: r0, reason: collision with root package name */
    public ColorDrawable f18558r0;

    /* renamed from: s0, reason: collision with root package name */
    public int f18559s0;

    /* renamed from: t0, reason: collision with root package name */
    public final LinkedHashSet f18560t0;

    /* renamed from: u0, reason: collision with root package name */
    public ColorDrawable f18561u0;
    public int v0;

    /* renamed from: w0, reason: collision with root package name */
    public Drawable f18562w0;

    /* renamed from: x0, reason: collision with root package name */
    public ColorStateList f18563x0;

    /* renamed from: y0, reason: collision with root package name */
    public ColorStateList f18564y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f18565z0;

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, com.apm.insight.R.attr.textInputStyle, com.apm.insight.R.style.Widget_Design_TextInputLayout), attributeSet, com.apm.insight.R.attr.textInputStyle);
        this.f18540g = -1;
        this.f18542h = -1;
        this.i = -1;
        this.f18545j = -1;
        this.f18547k = new t(this);
        this.f18494C = new b(10);
        this.f18554n0 = new Rect();
        this.f18555o0 = new Rect();
        this.f18556p0 = new RectF();
        this.f18560t0 = new LinkedHashSet();
        C2997b c2997b = new C2997b(this);
        this.f18511K0 = c2997b;
        this.f18522Q0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f18529a = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = AbstractC2303a.f19927a;
        c2997b.f24062X = linearInterpolator;
        c2997b.l(false);
        c2997b.f24061W = linearInterpolator;
        c2997b.l(false);
        c2997b.s(8388659);
        a1 a1VarJ = AbstractC2993B.j(context2, attributeSet, AbstractC2266a.f19744W, com.apm.insight.R.attr.textInputStyle, com.apm.insight.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 50);
        y yVar = new y(this, a1VarJ);
        this.f18531b = yVar;
        TypedArray typedArray = (TypedArray) a1VarJ.f22480c;
        this.f18523R = typedArray.getBoolean(48, true);
        setHint(typedArray.getText(4));
        this.f18514M0 = typedArray.getBoolean(47, true);
        this.f18513L0 = typedArray.getBoolean(42, true);
        if (typedArray.hasValue(6)) {
            setMinEms(typedArray.getInt(6, -1));
        } else if (typedArray.hasValue(3)) {
            setMinWidth(typedArray.getDimensionPixelSize(3, -1));
        }
        if (typedArray.hasValue(5)) {
            setMaxEms(typedArray.getInt(5, -1));
        } else if (typedArray.hasValue(2)) {
            setMaxWidth(typedArray.getDimensionPixelSize(2, -1));
        }
        this.f18535d0 = o.c(context2, attributeSet, com.apm.insight.R.attr.textInputStyle, com.apm.insight.R.style.Widget_Design_TextInputLayout).a();
        this.f18539f0 = context2.getResources().getDimensionPixelOffset(com.apm.insight.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.f18543h0 = typedArray.getDimensionPixelOffset(9, 0);
        this.f18534d = getResources().getDimensionPixelSize(com.apm.insight.R.dimen.m3_multiline_hint_filled_text_extra_space);
        this.f18546j0 = typedArray.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(com.apm.insight.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f18548k0 = typedArray.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(com.apm.insight.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.f18544i0 = this.f18546j0;
        float dimension = typedArray.getDimension(13, -1.0f);
        float dimension2 = typedArray.getDimension(12, -1.0f);
        float dimension3 = typedArray.getDimension(10, -1.0f);
        float dimension4 = typedArray.getDimension(11, -1.0f);
        n nVarG = this.f18535d0.g();
        if (dimension >= 0.0f) {
            nVarG.f1616e = new C0147a(dimension);
        }
        if (dimension2 >= 0.0f) {
            nVarG.f1617f = new C0147a(dimension2);
        }
        if (dimension3 >= 0.0f) {
            nVarG.f1618g = new C0147a(dimension3);
        }
        if (dimension4 >= 0.0f) {
            nVarG.f1619h = new C0147a(dimension4);
        }
        this.f18535d0 = nVarG.a();
        ColorStateList colorStateListO = c.o(context2, a1VarJ, 7);
        if (colorStateListO != null) {
            int defaultColor = colorStateListO.getDefaultColor();
            this.f18497D0 = defaultColor;
            this.f18552m0 = defaultColor;
            if (colorStateListO.isStateful()) {
                this.f18499E0 = colorStateListO.getColorForState(new int[]{-16842910}, -1);
                this.f18501F0 = colorStateListO.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f18503G0 = colorStateListO.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f18501F0 = this.f18497D0;
                ColorStateList colorStateListB = G.c.b(context2, com.apm.insight.R.color.mtrl_filled_background_color);
                this.f18499E0 = colorStateListB.getColorForState(new int[]{-16842910}, -1);
                this.f18503G0 = colorStateListB.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f18552m0 = 0;
            this.f18497D0 = 0;
            this.f18499E0 = 0;
            this.f18501F0 = 0;
            this.f18503G0 = 0;
        }
        if (typedArray.hasValue(1)) {
            ColorStateList colorStateListC = a1VarJ.c(1);
            this.f18564y0 = colorStateListC;
            this.f18563x0 = colorStateListC;
        }
        ColorStateList colorStateListO2 = c.o(context2, a1VarJ, 14);
        this.f18493B0 = typedArray.getColor(14, 0);
        this.f18565z0 = context2.getColor(com.apm.insight.R.color.mtrl_textinput_default_box_stroke_color);
        this.f18505H0 = context2.getColor(com.apm.insight.R.color.mtrl_textinput_disabled_color);
        this.f18492A0 = context2.getColor(com.apm.insight.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateListO2 != null) {
            setBoxStrokeColorStateList(colorStateListO2);
        }
        if (typedArray.hasValue(15)) {
            setBoxStrokeErrorColor(c.o(context2, a1VarJ, 15));
        }
        if (typedArray.getResourceId(50, -1) != -1) {
            setHintTextAppearance(typedArray.getResourceId(50, 0));
        }
        this.f18519P = a1VarJ.c(24);
        this.f18521Q = a1VarJ.c(25);
        int resourceId = typedArray.getResourceId(40, 0);
        CharSequence text = typedArray.getText(35);
        int i = typedArray.getInt(34, 1);
        boolean z6 = typedArray.getBoolean(36, false);
        int resourceId2 = typedArray.getResourceId(45, 0);
        boolean z7 = typedArray.getBoolean(44, false);
        CharSequence text2 = typedArray.getText(43);
        int resourceId3 = typedArray.getResourceId(58, 0);
        CharSequence text3 = typedArray.getText(57);
        boolean z8 = typedArray.getBoolean(18, false);
        setCounterMaxLength(typedArray.getInt(19, -1));
        this.f18500F = typedArray.getResourceId(22, 0);
        this.f18498E = typedArray.getResourceId(20, 0);
        setBoxBackgroundMode(typedArray.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i);
        setCounterOverflowTextAppearance(this.f18498E);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.f18500F);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (typedArray.hasValue(41)) {
            setErrorTextColor(a1VarJ.c(41));
        }
        if (typedArray.hasValue(46)) {
            setHelperTextColor(a1VarJ.c(46));
        }
        if (typedArray.hasValue(51)) {
            setHintTextColor(a1VarJ.c(51));
        }
        if (typedArray.hasValue(23)) {
            setCounterTextColor(a1VarJ.c(23));
        }
        if (typedArray.hasValue(21)) {
            setCounterOverflowTextColor(a1VarJ.c(21));
        }
        if (typedArray.hasValue(59)) {
            setPlaceholderTextColor(a1VarJ.c(59));
        }
        p pVar = new p(this, a1VarJ);
        this.f18532c = pVar;
        boolean z9 = typedArray.getBoolean(0, true);
        setHintMaxLines(typedArray.getInt(49, 1));
        a1VarJ.j();
        setImportantForAccessibility(2);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(1);
        }
        frameLayout.addView(yVar);
        frameLayout.addView(pVar);
        addView(frameLayout);
        setEnabled(z9);
        setHelperTextEnabled(z7);
        setErrorEnabled(z6);
        setCounterEnabled(z8);
        setHelperText(text2);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f18536e;
        if (!(editText instanceof AutoCompleteTextView) || c.C(editText)) {
            return this.f18526U;
        }
        int iM = e.m(com.apm.insight.R.attr.colorControlHighlight, this.f18536e);
        int i = this.f18541g0;
        int[][] iArr = f18491R0;
        if (i != 2) {
            if (i != 1) {
                return null;
            }
            j jVar = this.f18526U;
            int i3 = this.f18552m0;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{e.t(0.1f, iM, i3), i3}), jVar, jVar);
        }
        Context context = getContext();
        j jVar2 = this.f18526U;
        TypedValue typedValueQ = d5.y.q(context, com.apm.insight.R.attr.colorSurface, "TextInputLayout");
        int i6 = typedValueQ.resourceId;
        int color = i6 != 0 ? context.getColor(i6) : typedValueQ.data;
        j jVar3 = new j(jVar2.f1597b.f1560a);
        int iT = e.t(0.1f, iM, color);
        jVar3.q(new ColorStateList(iArr, new int[]{iT, 0}));
        jVar3.setTint(color);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iT, color});
        j jVar4 = new j(jVar2.f1597b.f1560a);
        jVar4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, jVar3, jVar4), jVar2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f18528W == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f18528W = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.f18528W.addState(new int[0], h(false));
        }
        return this.f18528W;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f18527V == null) {
            this.f18527V = h(true);
        }
        return this.f18527V;
    }

    public static void m(ViewGroup viewGroup, boolean z6) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z6);
            if (childAt instanceof ViewGroup) {
                m((ViewGroup) childAt, z6);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.f18536e != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f18536e = editText;
        int i = this.f18540g;
        if (i != -1) {
            setMinEms(i);
        } else {
            setMinWidth(this.i);
        }
        int i3 = this.f18542h;
        if (i3 != -1) {
            setMaxEms(i3);
        } else {
            setMaxWidth(this.f18545j);
        }
        this.f18530a0 = false;
        k();
        setTextInputAccessibilityDelegate(new B(this));
        Typeface typeface = this.f18536e.getTypeface();
        C2997b c2997b = this.f18511K0;
        boolean zT = c2997b.t(typeface);
        boolean z6 = c2997b.z(typeface);
        if (zT || z6) {
            c2997b.l(false);
        }
        c2997b.y(this.f18536e.getTextSize());
        float letterSpacing = this.f18536e.getLetterSpacing();
        if (c2997b.f24079h0 != letterSpacing) {
            c2997b.f24079h0 = letterSpacing;
            c2997b.l(false);
        }
        int gravity = this.f18536e.getGravity();
        c2997b.s((gravity & (-113)) | 48);
        c2997b.x(gravity);
        this.f18507I0 = editText.getMinimumHeight();
        this.f18536e.addTextChangedListener(new z(this, editText));
        if (this.f18563x0 == null) {
            this.f18563x0 = this.f18536e.getHintTextColors();
        }
        if (this.f18523R) {
            if (TextUtils.isEmpty(this.f18524S)) {
                CharSequence hint = this.f18536e.getHint();
                this.f18538f = hint;
                setHint(hint);
                this.f18536e.setHint((CharSequence) null);
            }
            this.f18525T = true;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            r();
        }
        if (this.f18496D != null) {
            p(this.f18536e.getText());
        }
        t();
        this.f18547k.b();
        this.f18531b.bringToFront();
        p pVar = this.f18532c;
        pVar.bringToFront();
        Iterator it = this.f18560t0.iterator();
        while (it.hasNext()) {
            ((m) it.next()).a(this);
        }
        pVar.m();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        w(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f18524S)) {
            return;
        }
        this.f18524S = charSequence;
        this.f18511K0.B(charSequence);
        if (this.f18509J0) {
            return;
        }
        l();
    }

    private void setPlaceholderTextEnabled(boolean z6) {
        if (this.f18504H == z6) {
            return;
        }
        if (z6) {
            AppCompatTextView appCompatTextView = this.f18506I;
            if (appCompatTextView != null) {
                this.f18529a.addView(appCompatTextView);
                this.f18506I.setVisibility(0);
            }
        } else {
            AppCompatTextView appCompatTextView2 = this.f18506I;
            if (appCompatTextView2 != null) {
                appCompatTextView2.setVisibility(8);
            }
            this.f18506I = null;
        }
        this.f18504H = z6;
    }

    public final void a() {
        if (this.f18536e == null || this.f18541g0 != 1) {
            return;
        }
        if (getHintMaxLines() != 1) {
            EditText editText = this.f18536e;
            editText.setPaddingRelative(editText.getPaddingStart(), (int) (this.f18511K0.g() + this.f18534d), this.f18536e.getPaddingEnd(), getResources().getDimensionPixelSize(com.apm.insight.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
        } else if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
            EditText editText2 = this.f18536e;
            editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(com.apm.insight.R.dimen.material_filled_edittext_font_2_0_padding_top), this.f18536e.getPaddingEnd(), getResources().getDimensionPixelSize(com.apm.insight.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
        } else if (c.E(getContext())) {
            EditText editText3 = this.f18536e;
            editText3.setPaddingRelative(editText3.getPaddingStart(), getResources().getDimensionPixelSize(com.apm.insight.R.dimen.material_filled_edittext_font_1_3_padding_top), this.f18536e.getPaddingEnd(), getResources().getDimensionPixelSize(com.apm.insight.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f18529a;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        v();
        setEditText((EditText) view);
    }

    public final void b(float f2) {
        C2997b c2997b = this.f18511K0;
        if (c2997b.f24067b == f2) {
            return;
        }
        int i = 1;
        if (this.f18516N0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f18516N0 = valueAnimator;
            valueAnimator.setInterpolator(d.P(getContext(), com.apm.insight.R.attr.motionEasingEmphasizedInterpolator, AbstractC2303a.f19928b));
            this.f18516N0.setDuration(d.O(getContext(), com.apm.insight.R.attr.motionDurationMedium4, 167));
            this.f18516N0.addUpdateListener(new L3.b(i, this));
        }
        this.f18516N0.setFloatValues(c2997b.f24067b, f2);
        this.f18516N0.start();
    }

    public final void c() {
        int i;
        int i3;
        j jVar = this.f18526U;
        if (jVar == null) {
            return;
        }
        o oVar = jVar.f1597b.f1560a;
        o oVar2 = this.f18535d0;
        if (oVar != oVar2) {
            jVar.setShapeAppearanceModel(oVar2);
        }
        if (this.f18541g0 == 2 && (i = this.f18544i0) > -1 && (i3 = this.f18550l0) != 0) {
            j jVar2 = this.f18526U;
            jVar2.f1597b.f1569k = i;
            jVar2.invalidateSelf();
            jVar2.v(ColorStateList.valueOf(i3));
        }
        int iC = this.f18552m0;
        if (this.f18541g0 == 1) {
            iC = J.a.c(this.f18552m0, e.n(getContext(), com.apm.insight.R.attr.colorSurface, 0));
        }
        this.f18552m0 = iC;
        this.f18526U.q(ColorStateList.valueOf(iC));
        j jVar3 = this.b0;
        if (jVar3 != null && this.f18533c0 != null) {
            if (this.f18544i0 > -1 && this.f18550l0 != 0) {
                jVar3.q(this.f18536e.isFocused() ? ColorStateList.valueOf(this.f18565z0) : ColorStateList.valueOf(this.f18550l0));
                this.f18533c0.q(ColorStateList.valueOf(this.f18550l0));
            }
            invalidate();
        }
        u();
    }

    public final Rect d(Rect rect) {
        if (this.f18536e == null) {
            throw new IllegalStateException();
        }
        boolean z6 = getLayoutDirection() == 1;
        int i = rect.bottom;
        Rect rect2 = this.f18555o0;
        rect2.bottom = i;
        int i3 = this.f18541g0;
        if (i3 == 1) {
            rect2.left = i(rect.left, z6);
            rect2.top = rect.top + this.f18543h0;
            rect2.right = j(rect.right, z6);
            return rect2;
        }
        if (i3 != 2) {
            rect2.left = i(rect.left, z6);
            rect2.top = getPaddingTop();
            rect2.right = j(rect.right, z6);
            return rect2;
        }
        rect2.left = this.f18536e.getPaddingLeft() + rect.left;
        rect2.top = rect.top - e();
        rect2.right = rect.right - this.f18536e.getPaddingRight();
        return rect2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.f18536e;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.f18538f != null) {
            boolean z6 = this.f18525T;
            this.f18525T = false;
            CharSequence hint = editText.getHint();
            this.f18536e.setHint(this.f18538f);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.f18536e.setHint(hint);
                this.f18525T = z6;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.f18529a;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i3 = 0; i3 < frameLayout.getChildCount(); i3++) {
            View childAt = frameLayout.getChildAt(i3);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i3);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i);
            if (childAt == this.f18536e) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f18520P0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f18520P0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        j jVar;
        super.draw(canvas);
        boolean z6 = this.f18523R;
        C2997b c2997b = this.f18511K0;
        if (z6) {
            c2997b.f(canvas);
        }
        if (this.f18533c0 == null || (jVar = this.b0) == null) {
            return;
        }
        jVar.draw(canvas);
        if (this.f18536e.isFocused()) {
            Rect bounds = this.f18533c0.getBounds();
            Rect bounds2 = this.b0.getBounds();
            float f2 = c2997b.f24067b;
            int iCenterX = bounds2.centerX();
            bounds.left = AbstractC2303a.c(f2, iCenterX, bounds2.left);
            bounds.right = AbstractC2303a.c(f2, iCenterX, bounds2.right);
            this.f18533c0.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void drawableStateChanged() {
        /*
            r4 = this;
            boolean r0 = r4.f18518O0
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r4.f18518O0 = r0
            super.drawableStateChanged()
            int[] r1 = r4.getDrawableState()
            r2 = 0
            x3.b r3 = r4.f18511K0
            if (r3 == 0) goto L2f
            r3.f24057S = r1
            android.content.res.ColorStateList r1 = r3.f24093p
            if (r1 == 0) goto L20
            boolean r1 = r1.isStateful()
            if (r1 != 0) goto L2a
        L20:
            android.content.res.ColorStateList r1 = r3.f24091o
            if (r1 == 0) goto L2f
            boolean r1 = r1.isStateful()
            if (r1 == 0) goto L2f
        L2a:
            r3.l(r2)
            r1 = r0
            goto L30
        L2f:
            r1 = r2
        L30:
            android.widget.EditText r3 = r4.f18536e
            if (r3 == 0) goto L45
            boolean r3 = r4.isLaidOut()
            if (r3 == 0) goto L41
            boolean r3 = r4.isEnabled()
            if (r3 == 0) goto L41
            goto L42
        L41:
            r0 = r2
        L42:
            r4.w(r0, r2)
        L45:
            r4.t()
            r4.z()
            if (r1 == 0) goto L50
            r4.invalidate()
        L50:
            r4.f18518O0 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.drawableStateChanged():void");
    }

    public final int e() {
        if (this.f18523R) {
            int i = this.f18541g0;
            C2997b c2997b = this.f18511K0;
            if (i == 0) {
                return (int) c2997b.g();
            }
            if (i == 2) {
                if (getHintMaxLines() == 1) {
                    return (int) (c2997b.g() / 2.0f);
                }
                float fG = c2997b.g();
                TextPaint textPaint = c2997b.f24060V;
                textPaint.setTextSize(c2997b.f24089n);
                textPaint.setTypeface(c2997b.f24107x);
                textPaint.setLetterSpacing(c2997b.f24077g0);
                return Math.max(0, (int) (fG - ((-textPaint.ascent()) / 2.0f)));
            }
        }
        return 0;
    }

    public final g f() {
        g gVar = new g();
        gVar.f2467c = d.O(getContext(), com.apm.insight.R.attr.motionDurationShort2, 87);
        gVar.f2468d = d.P(getContext(), com.apm.insight.R.attr.motionEasingLinearInterpolator, AbstractC2303a.f19927a);
        return gVar;
    }

    public final boolean g() {
        return this.f18523R && !TextUtils.isEmpty(this.f18524S) && (this.f18526U instanceof M3.g);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f18536e;
        if (editText == null) {
            return super.getBaseline();
        }
        return e() + getPaddingTop() + editText.getBaseline();
    }

    public j getBoxBackground() {
        int i = this.f18541g0;
        if (i == 1 || i == 2) {
            return this.f18526U;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f18552m0;
    }

    public int getBoxBackgroundMode() {
        return this.f18541g0;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f18543h0;
    }

    public float getBoxCornerRadiusBottomEnd() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.f18556p0;
        return layoutDirection == 1 ? this.f18535d0.f1631h.a(rectF) : this.f18535d0.f1630g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.f18556p0;
        return layoutDirection == 1 ? this.f18535d0.f1630g.a(rectF) : this.f18535d0.f1631h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.f18556p0;
        return layoutDirection == 1 ? this.f18535d0.f1628e.a(rectF) : this.f18535d0.f1629f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.f18556p0;
        return layoutDirection == 1 ? this.f18535d0.f1629f.a(rectF) : this.f18535d0.f1628e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.f18493B0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f18495C0;
    }

    public int getBoxStrokeWidth() {
        return this.f18546j0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f18548k0;
    }

    public int getCounterMaxLength() {
        return this.f18551m;
    }

    public CharSequence getCounterOverflowDescription() {
        AppCompatTextView appCompatTextView;
        if (this.f18549l && this.f18553n && (appCompatTextView = this.f18496D) != null) {
            return appCompatTextView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f18517O;
    }

    public ColorStateList getCounterTextColor() {
        return this.f18515N;
    }

    public ColorStateList getCursorColor() {
        return this.f18519P;
    }

    public ColorStateList getCursorErrorColor() {
        return this.f18521Q;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f18563x0;
    }

    public EditText getEditText() {
        return this.f18536e;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f18532c.f2888g.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f18532c.f2888g.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f18532c.f2893m;
    }

    public int getEndIconMode() {
        return this.f18532c.i;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f18532c.f2894n;
    }

    public CheckableImageButton getEndIconView() {
        return this.f18532c.f2888g;
    }

    public CharSequence getError() {
        t tVar = this.f18547k;
        if (tVar.f2922q) {
            return tVar.f2921p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f18547k.f2925t;
    }

    public CharSequence getErrorContentDescription() {
        return this.f18547k.f2924s;
    }

    public int getErrorCurrentTextColors() {
        AppCompatTextView appCompatTextView = this.f18547k.f2923r;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f18532c.f2884c.getDrawable();
    }

    public CharSequence getHelperText() {
        t tVar = this.f18547k;
        if (tVar.f2929x) {
            return tVar.f2928w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        AppCompatTextView appCompatTextView = this.f18547k.f2930y;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.f18523R) {
            return this.f18524S;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f18511K0.g();
    }

    public final int getHintCurrentCollapsedTextColor() {
        C2997b c2997b = this.f18511K0;
        return c2997b.h(c2997b.f24093p);
    }

    public int getHintMaxLines() {
        return this.f18511K0.f24092o0;
    }

    public ColorStateList getHintTextColor() {
        return this.f18564y0;
    }

    public C getLengthCounter() {
        return this.f18494C;
    }

    public int getMaxEms() {
        return this.f18542h;
    }

    public int getMaxWidth() {
        return this.f18545j;
    }

    public int getMinEms() {
        return this.f18540g;
    }

    public int getMinWidth() {
        return this.i;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f18532c.f2888g.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f18532c.f2888g.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f18504H) {
            return this.f18502G;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f18510K;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f18508J;
    }

    public CharSequence getPrefixText() {
        return this.f18531b.f2949c;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f18531b.f2948b.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f18531b.f2948b;
    }

    public o getShapeAppearanceModel() {
        return this.f18535d0;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f18531b.f2950d.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f18531b.f2950d.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f18531b.f2953g;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f18531b.f2954h;
    }

    public CharSequence getSuffixText() {
        return this.f18532c.f2875D;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f18532c.f2876E.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f18532c.f2876E;
    }

    public Typeface getTypeface() {
        return this.f18557q0;
    }

    public final j h(boolean z6) throws Resources.NotFoundException {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(com.apm.insight.R.dimen.mtrl_shape_corner_size_small_component);
        float f2 = z6 ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f18536e;
        float popupElevation = editText instanceof w ? ((w) editText).getPopupElevation() : getResources().getDimensionPixelOffset(com.apm.insight.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.apm.insight.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        G3.m mVar = new G3.m();
        G3.m mVar2 = new G3.m();
        G3.m mVar3 = new G3.m();
        G3.m mVar4 = new G3.m();
        int i = 0;
        C0152f c0152f = new C0152f(i);
        C0152f c0152f2 = new C0152f(i);
        C0152f c0152f3 = new C0152f(i);
        C0152f c0152f4 = new C0152f(i);
        C0147a c0147a = new C0147a(f2);
        C0147a c0147a2 = new C0147a(f2);
        C0147a c0147a3 = new C0147a(dimensionPixelOffset);
        C0147a c0147a4 = new C0147a(dimensionPixelOffset);
        o oVar = new o();
        oVar.f1624a = mVar;
        oVar.f1625b = mVar2;
        oVar.f1626c = mVar3;
        oVar.f1627d = mVar4;
        oVar.f1628e = c0147a;
        oVar.f1629f = c0147a2;
        oVar.f1630g = c0147a4;
        oVar.f1631h = c0147a3;
        oVar.i = c0152f;
        oVar.f1632j = c0152f2;
        oVar.f1633k = c0152f3;
        oVar.f1634l = c0152f4;
        EditText editText2 = this.f18536e;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof w ? ((w) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = j.f1578T;
            TypedValue typedValueQ = d5.y.q(context, com.apm.insight.R.attr.colorSurface, j.class.getSimpleName());
            int i3 = typedValueQ.resourceId;
            dropDownBackgroundTintList = ColorStateList.valueOf(i3 != 0 ? context.getColor(i3) : typedValueQ.data);
        }
        j jVar = new j();
        jVar.m(context);
        jVar.q(dropDownBackgroundTintList);
        jVar.p(popupElevation);
        jVar.setShapeAppearanceModel(oVar);
        C0154h c0154h = jVar.f1597b;
        if (c0154h.f1567h == null) {
            c0154h.f1567h = new Rect();
        }
        jVar.f1597b.f1567h.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        jVar.invalidateSelf();
        return jVar;
    }

    public final int i(int i, boolean z6) {
        return ((z6 || getPrefixText() == null) ? (!z6 || getSuffixText() == null) ? this.f18536e.getCompoundPaddingLeft() : this.f18532c.c() : this.f18531b.a()) + i;
    }

    public final int j(int i, boolean z6) {
        return i - ((z6 || getSuffixText() == null) ? (!z6 || getPrefixText() == null) ? this.f18536e.getCompoundPaddingRight() : this.f18531b.a() : this.f18532c.c());
    }

    public final void k() {
        int i = this.f18541g0;
        if (i == 0) {
            this.f18526U = null;
            this.b0 = null;
            this.f18533c0 = null;
        } else if (i == 1) {
            this.f18526U = new j(this.f18535d0);
            this.b0 = new j();
            this.f18533c0 = new j();
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(AbstractC2763b.d(this.f18541g0, " is illegal; only @BoxBackgroundMode constants are supported.", new StringBuilder()));
            }
            if (!this.f18523R || (this.f18526U instanceof M3.g)) {
                this.f18526U = new j(this.f18535d0);
            } else {
                o oVar = this.f18535d0;
                int i3 = M3.g.f2847W;
                if (oVar == null) {
                    oVar = new o();
                }
                f fVar = new f(oVar, new RectF());
                M3.g gVar = new M3.g(fVar);
                gVar.f2848V = fVar;
                this.f18526U = gVar;
            }
            this.b0 = null;
            this.f18533c0 = null;
        }
        u();
        z();
        if (this.f18541g0 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.f18543h0 = getResources().getDimensionPixelSize(com.apm.insight.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (c.E(getContext())) {
                this.f18543h0 = getResources().getDimensionPixelSize(com.apm.insight.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        a();
        if (this.f18541g0 != 0) {
            v();
        }
        EditText editText = this.f18536e;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i6 = this.f18541g0;
                if (i6 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i6 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l() {
        /*
            Method dump skipped, instructions count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.l():void");
    }

    public final void n(AppCompatTextView appCompatTextView, int i) {
        try {
            appCompatTextView.setTextAppearance(i);
            if (appCompatTextView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        appCompatTextView.setTextAppearance(com.apm.insight.R.style.TextAppearance_AppCompat_Caption);
        appCompatTextView.setTextColor(getContext().getColor(com.apm.insight.R.color.design_error));
    }

    public final boolean o() {
        t tVar = this.f18547k;
        return (tVar.f2920o != 1 || tVar.f2923r == null || TextUtils.isEmpty(tVar.f2921p)) ? false : true;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f18511K0.k(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int iMax;
        p pVar = this.f18532c;
        pVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z6 = false;
        this.f18522Q0 = false;
        if (this.f18536e != null && this.f18536e.getMeasuredHeight() < (iMax = Math.max(pVar.getMeasuredHeight(), this.f18531b.getMeasuredHeight()))) {
            this.f18536e.setMinimumHeight(iMax);
            z6 = true;
        }
        boolean zS = s();
        if (z6 || zS) {
            this.f18536e.post(new A3.z(7, this));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i, int i3, int i6, int i7) {
        float fI;
        int i8;
        int compoundPaddingTop;
        super.onLayout(z6, i, i3, i6, i7);
        EditText editText = this.f18536e;
        if (editText != null) {
            Rect rect = this.f18554n0;
            AbstractC2998c.a(this, editText, rect);
            j jVar = this.b0;
            if (jVar != null) {
                int i9 = rect.bottom;
                jVar.setBounds(rect.left, i9 - this.f18546j0, rect.right, i9);
            }
            j jVar2 = this.f18533c0;
            if (jVar2 != null) {
                int i10 = rect.bottom;
                jVar2.setBounds(rect.left, i10 - this.f18548k0, rect.right, i10);
            }
            if (this.f18523R) {
                float textSize = this.f18536e.getTextSize();
                C2997b c2997b = this.f18511K0;
                c2997b.y(textSize);
                TextPaint textPaint = c2997b.f24060V;
                int gravity = this.f18536e.getGravity();
                c2997b.s((gravity & (-113)) | 48);
                c2997b.x(gravity);
                Rect rectD = d(rect);
                c2997b.o(rectD.left, rectD.top, rectD.right, rectD.bottom);
                if (this.f18536e == null) {
                    throw new IllegalStateException();
                }
                if (getHintMaxLines() == 1) {
                    textPaint.setTextSize(c2997b.f24087m);
                    textPaint.setTypeface(c2997b.f24040A);
                    textPaint.setLetterSpacing(c2997b.f24079h0);
                    fI = -textPaint.ascent();
                } else {
                    fI = c2997b.i() * c2997b.f24095q;
                }
                int compoundPaddingLeft = this.f18536e.getCompoundPaddingLeft() + rect.left;
                Rect rect2 = this.f18555o0;
                rect2.left = compoundPaddingLeft;
                if (this.f18541g0 != 1 || this.f18536e.getMinLines() > 1) {
                    if (this.f18541g0 != 0 || getHintMaxLines() == 1) {
                        i8 = 0;
                    } else {
                        textPaint.setTextSize(c2997b.f24087m);
                        textPaint.setTypeface(c2997b.f24040A);
                        textPaint.setLetterSpacing(c2997b.f24079h0);
                        i8 = (int) ((-textPaint.ascent()) / 2.0f);
                    }
                    compoundPaddingTop = (this.f18536e.getCompoundPaddingTop() + rect.top) - i8;
                } else {
                    compoundPaddingTop = (int) (rect.centerY() - (fI / 2.0f));
                }
                rect2.top = compoundPaddingTop;
                rect2.right = rect.right - this.f18536e.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.f18541g0 != 1 || this.f18536e.getMinLines() > 1) ? rect.bottom - this.f18536e.getCompoundPaddingBottom() : (int) (rect2.top + fI);
                rect2.bottom = compoundPaddingBottom;
                c2997b.u(rect2.left, rect2.top, rect2.right, compoundPaddingBottom, true);
                c2997b.l(false);
                if (!g() || this.f18509J0) {
                    return;
                }
                l();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i3) {
        float f2;
        EditText editText;
        super.onMeasure(i, i3);
        boolean z6 = this.f18522Q0;
        p pVar = this.f18532c;
        if (!z6) {
            pVar.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f18522Q0 = true;
        }
        if (this.f18506I != null && (editText = this.f18536e) != null) {
            this.f18506I.setGravity(editText.getGravity());
            this.f18506I.setPadding(this.f18536e.getCompoundPaddingLeft(), this.f18536e.getCompoundPaddingTop(), this.f18536e.getCompoundPaddingRight(), this.f18536e.getCompoundPaddingBottom());
        }
        pVar.m();
        if (getHintMaxLines() == 1) {
            return;
        }
        int measuredWidth = (this.f18536e.getMeasuredWidth() - this.f18536e.getCompoundPaddingLeft()) - this.f18536e.getCompoundPaddingRight();
        C2997b c2997b = this.f18511K0;
        TextPaint textPaint = c2997b.f24060V;
        textPaint.setTextSize(c2997b.f24089n);
        textPaint.setTypeface(c2997b.f24107x);
        textPaint.setLetterSpacing(c2997b.f24077g0);
        float f5 = measuredWidth;
        c2997b.f24102t0 = c2997b.e(c2997b.f24094p0, textPaint, c2997b.f24047H, (c2997b.f24089n / c2997b.f24087m) * f5, c2997b.f24049J).getHeight();
        textPaint.setTextSize(c2997b.f24087m);
        textPaint.setTypeface(c2997b.f24040A);
        textPaint.setLetterSpacing(c2997b.f24079h0);
        c2997b.f24104u0 = c2997b.e(c2997b.f24092o0, textPaint, c2997b.f24047H, f5, c2997b.f24049J).getHeight();
        EditText editText2 = this.f18536e;
        Rect rect = this.f18554n0;
        AbstractC2998c.a(this, editText2, rect);
        Rect rectD = d(rect);
        c2997b.o(rectD.left, rectD.top, rectD.right, rectD.bottom);
        v();
        a();
        if (this.f18536e == null) {
            return;
        }
        int i6 = c2997b.f24104u0;
        if (i6 != -1) {
            f2 = i6;
        } else {
            TextPaint textPaint2 = c2997b.f24060V;
            textPaint2.setTextSize(c2997b.f24087m);
            textPaint2.setTypeface(c2997b.f24040A);
            textPaint2.setLetterSpacing(c2997b.f24079h0);
            f2 = -textPaint2.ascent();
        }
        if (this.f18502G != null) {
            TextPaint textPaint3 = new TextPaint(129);
            textPaint3.set(this.f18506I.getPaint());
            textPaint3.setTextSize(this.f18506I.getTextSize());
            textPaint3.setTypeface(this.f18506I.getTypeface());
            textPaint3.setLetterSpacing(this.f18506I.getLetterSpacing());
            v vVar = new v(this.f18502G, textPaint3, measuredWidth);
            vVar.f24173k = getLayoutDirection() == 1;
            vVar.f24172j = true;
            float lineSpacingExtra = this.f18506I.getLineSpacingExtra();
            float lineSpacingMultiplier = this.f18506I.getLineSpacingMultiplier();
            vVar.f24170g = lineSpacingExtra;
            vVar.f24171h = lineSpacingMultiplier;
            vVar.f24175m = new F4.c(1, this);
            fG = (this.f18541g0 == 1 ? c2997b.g() + this.f18543h0 + this.f18534d : 0.0f) + vVar.a().getHeight();
        }
        float fMax = Math.max(f2, fG);
        if (this.f18536e.getMeasuredHeight() < fMax) {
            this.f18536e.setMinimumHeight(Math.round(fMax));
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof D)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        D d6 = (D) parcelable;
        super.onRestoreInstanceState(d6.f3954a);
        setError(d6.f2829c);
        if (d6.f2830d) {
            post(new k(5, this));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z6 = i == 1;
        if (z6 != this.f18537e0) {
            InterfaceC0150d interfaceC0150d = this.f18535d0.f1628e;
            RectF rectF = this.f18556p0;
            float fA = interfaceC0150d.a(rectF);
            float fA2 = this.f18535d0.f1629f.a(rectF);
            float fA3 = this.f18535d0.f1631h.a(rectF);
            float fA4 = this.f18535d0.f1630g.a(rectF);
            o oVar = this.f18535d0;
            AbstractC0241a abstractC0241a = oVar.f1624a;
            AbstractC0241a abstractC0241a2 = oVar.f1625b;
            AbstractC0241a abstractC0241a3 = oVar.f1627d;
            AbstractC0241a abstractC0241a4 = oVar.f1626c;
            C0152f c0152f = new C0152f(0);
            C0152f c0152f2 = new C0152f(0);
            C0152f c0152f3 = new C0152f(0);
            C0152f c0152f4 = new C0152f(0);
            n.b(abstractC0241a2);
            n.b(abstractC0241a);
            n.b(abstractC0241a4);
            n.b(abstractC0241a3);
            C0147a c0147a = new C0147a(fA2);
            C0147a c0147a2 = new C0147a(fA);
            C0147a c0147a3 = new C0147a(fA4);
            C0147a c0147a4 = new C0147a(fA3);
            o oVar2 = new o();
            oVar2.f1624a = abstractC0241a2;
            oVar2.f1625b = abstractC0241a;
            oVar2.f1626c = abstractC0241a3;
            oVar2.f1627d = abstractC0241a4;
            oVar2.f1628e = c0147a;
            oVar2.f1629f = c0147a2;
            oVar2.f1630g = c0147a4;
            oVar2.f1631h = c0147a3;
            oVar2.i = c0152f;
            oVar2.f1632j = c0152f2;
            oVar2.f1633k = c0152f3;
            oVar2.f1634l = c0152f4;
            this.f18537e0 = z6;
            setShapeAppearanceModel(oVar2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        D d6 = new D(super.onSaveInstanceState());
        if (o()) {
            d6.f2829c = getError();
        }
        p pVar = this.f18532c;
        d6.f2830d = pVar.i != 0 && pVar.f2888g.f18384d;
        return d6;
    }

    public final void p(Editable editable) {
        ((b) this.f18494C).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z6 = this.f18553n;
        int i = this.f18551m;
        if (i == -1) {
            this.f18496D.setText(String.valueOf(length));
            this.f18496D.setContentDescription(null);
            this.f18553n = false;
        } else {
            this.f18553n = length > i;
            Context context = getContext();
            this.f18496D.setContentDescription(context.getString(this.f18553n ? com.apm.insight.R.string.character_counter_overflowed_content_description : com.apm.insight.R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.f18551m)));
            if (z6 != this.f18553n) {
                q();
            }
            String str = P.b.f3106b;
            P.b bVar = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? P.b.f3109e : P.b.f3108d;
            AppCompatTextView appCompatTextView = this.f18496D;
            String string = getContext().getString(com.apm.insight.R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.f18551m));
            bVar.getClass();
            P.g gVar = h.f3119a;
            appCompatTextView.setText(string != null ? bVar.c(string).toString() : null);
        }
        if (this.f18536e == null || z6 == this.f18553n) {
            return;
        }
        w(false, false);
        z();
        t();
    }

    public final void q() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        AppCompatTextView appCompatTextView = this.f18496D;
        if (appCompatTextView != null) {
            n(appCompatTextView, this.f18553n ? this.f18498E : this.f18500F);
            if (!this.f18553n && (colorStateList2 = this.f18515N) != null) {
                this.f18496D.setTextColor(colorStateList2);
            }
            if (!this.f18553n || (colorStateList = this.f18517O) == null) {
                return;
            }
            this.f18496D.setTextColor(colorStateList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r() {
        /*
            r3 = this;
            android.content.res.ColorStateList r0 = r3.f18519P
            if (r0 == 0) goto L5
            goto L26
        L5:
            android.content.Context r0 = r3.getContext()
            r1 = 2130968849(0x7f040111, float:1.7546363E38)
            android.util.TypedValue r1 = d5.y.n(r0, r1)
            if (r1 != 0) goto L13
            goto L25
        L13:
            int r2 = r1.resourceId
            if (r2 == 0) goto L1c
            android.content.res.ColorStateList r0 = G.c.b(r0, r2)
            goto L26
        L1c:
            int r0 = r1.data
            if (r0 == 0) goto L25
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            goto L26
        L25:
            r0 = 0
        L26:
            android.widget.EditText r1 = r3.f18536e
            if (r1 == 0) goto L51
            android.graphics.drawable.Drawable r1 = C4.a.e(r1)
            if (r1 != 0) goto L31
            goto L51
        L31:
            android.widget.EditText r1 = r3.f18536e
            android.graphics.drawable.Drawable r1 = C4.a.e(r1)
            android.graphics.drawable.Drawable r1 = r1.mutate()
            boolean r2 = r3.o()
            if (r2 != 0) goto L49
            androidx.appcompat.widget.AppCompatTextView r2 = r3.f18496D
            if (r2 == 0) goto L4e
            boolean r2 = r3.f18553n
            if (r2 == 0) goto L4e
        L49:
            android.content.res.ColorStateList r2 = r3.f18521Q
            if (r2 == 0) goto L4e
            r0 = r2
        L4e:
            r1.setTintList(r0)
        L51:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.r():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean s() {
        /*
            Method dump skipped, instructions count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.s():boolean");
    }

    public void setBoxBackgroundColor(int i) {
        if (this.f18552m0 != i) {
            this.f18552m0 = i;
            this.f18497D0 = i;
            this.f18501F0 = i;
            this.f18503G0 = i;
            c();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(getContext().getColor(i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f18497D0 = defaultColor;
        this.f18552m0 = defaultColor;
        this.f18499E0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f18501F0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f18503G0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        c();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.f18541g0) {
            return;
        }
        this.f18541g0 = i;
        if (this.f18536e != null) {
            k();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.f18543h0 = i;
    }

    public void setBoxCornerFamily(int i) {
        n nVarG = this.f18535d0.g();
        InterfaceC0150d interfaceC0150d = this.f18535d0.f1628e;
        AbstractC0241a abstractC0241aD = a4.p.d(i);
        nVarG.f1612a = abstractC0241aD;
        n.b(abstractC0241aD);
        nVarG.f1616e = interfaceC0150d;
        InterfaceC0150d interfaceC0150d2 = this.f18535d0.f1629f;
        AbstractC0241a abstractC0241aD2 = a4.p.d(i);
        nVarG.f1613b = abstractC0241aD2;
        n.b(abstractC0241aD2);
        nVarG.f1617f = interfaceC0150d2;
        InterfaceC0150d interfaceC0150d3 = this.f18535d0.f1631h;
        AbstractC0241a abstractC0241aD3 = a4.p.d(i);
        nVarG.f1615d = abstractC0241aD3;
        n.b(abstractC0241aD3);
        nVarG.f1619h = interfaceC0150d3;
        InterfaceC0150d interfaceC0150d4 = this.f18535d0.f1630g;
        AbstractC0241a abstractC0241aD4 = a4.p.d(i);
        nVarG.f1614c = abstractC0241aD4;
        n.b(abstractC0241aD4);
        nVarG.f1618g = interfaceC0150d4;
        this.f18535d0 = nVarG.a();
        c();
    }

    public void setBoxStrokeColor(int i) {
        if (this.f18493B0 != i) {
            this.f18493B0 = i;
            z();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f18565z0 = colorStateList.getDefaultColor();
            this.f18505H0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f18492A0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f18493B0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f18493B0 != colorStateList.getDefaultColor()) {
            this.f18493B0 = colorStateList.getDefaultColor();
        }
        z();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f18495C0 != colorStateList) {
            this.f18495C0 = colorStateList;
            z();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.f18546j0 = i;
        z();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.f18548k0 = i;
        z();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z6) {
        if (this.f18549l != z6) {
            t tVar = this.f18547k;
            if (z6) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
                this.f18496D = appCompatTextView;
                appCompatTextView.setId(com.apm.insight.R.id.textinput_counter);
                Typeface typeface = this.f18557q0;
                if (typeface != null) {
                    this.f18496D.setTypeface(typeface);
                }
                this.f18496D.setMaxLines(1);
                tVar.a(this.f18496D, 2);
                ((ViewGroup.MarginLayoutParams) this.f18496D.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(com.apm.insight.R.dimen.mtrl_textinput_counter_margin_start));
                q();
                if (this.f18496D != null) {
                    EditText editText = this.f18536e;
                    p(editText != null ? editText.getText() : null);
                }
            } else {
                tVar.g(this.f18496D, 2);
                this.f18496D = null;
            }
            this.f18549l = z6;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f18551m != i) {
            if (i > 0) {
                this.f18551m = i;
            } else {
                this.f18551m = -1;
            }
            if (!this.f18549l || this.f18496D == null) {
                return;
            }
            EditText editText = this.f18536e;
            p(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f18498E != i) {
            this.f18498E = i;
            q();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f18517O != colorStateList) {
            this.f18517O = colorStateList;
            q();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.f18500F != i) {
            this.f18500F = i;
            q();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f18515N != colorStateList) {
            this.f18515N = colorStateList;
            q();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.f18519P != colorStateList) {
            this.f18519P = colorStateList;
            r();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.f18521Q != colorStateList) {
            this.f18521Q = colorStateList;
            if (o() || (this.f18496D != null && this.f18553n)) {
                r();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f18563x0 = colorStateList;
        this.f18564y0 = colorStateList;
        if (this.f18536e != null) {
            w(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z6) {
        m(this, z6);
        super.setEnabled(z6);
    }

    public void setEndIconActivated(boolean z6) {
        this.f18532c.f2888g.setActivated(z6);
    }

    public void setEndIconCheckable(boolean z6) {
        this.f18532c.f2888g.setCheckable(z6);
    }

    public void setEndIconContentDescription(int i) {
        p pVar = this.f18532c;
        CharSequence text = i != 0 ? pVar.getResources().getText(i) : null;
        CheckableImageButton checkableImageButton = pVar.f2888g;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i) {
        p pVar = this.f18532c;
        Drawable drawableI = i != 0 ? a4.t.i(pVar.getContext(), i) : null;
        TextInputLayout textInputLayout = pVar.f2882a;
        CheckableImageButton checkableImageButton = pVar.f2888g;
        checkableImageButton.setImageDrawable(drawableI);
        if (drawableI != null) {
            d.e(textInputLayout, checkableImageButton, pVar.f2891k, pVar.f2892l);
            d.N(textInputLayout, checkableImageButton, pVar.f2891k);
        }
    }

    public void setEndIconMinSize(int i) {
        p pVar = this.f18532c;
        if (i < 0) {
            pVar.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i != pVar.f2893m) {
            pVar.f2893m = i;
            CheckableImageButton checkableImageButton = pVar.f2888g;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
            CheckableImageButton checkableImageButton2 = pVar.f2884c;
            checkableImageButton2.setMinimumWidth(i);
            checkableImageButton2.setMinimumHeight(i);
        }
    }

    public void setEndIconMode(int i) {
        this.f18532c.g(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        p pVar = this.f18532c;
        CheckableImageButton checkableImageButton = pVar.f2888g;
        View.OnLongClickListener onLongClickListener = pVar.f2874C;
        checkableImageButton.setOnClickListener(onClickListener);
        d.V(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        p pVar = this.f18532c;
        pVar.f2874C = onLongClickListener;
        CheckableImageButton checkableImageButton = pVar.f2888g;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        d.V(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        p pVar = this.f18532c;
        pVar.f2894n = scaleType;
        pVar.f2888g.setScaleType(scaleType);
        pVar.f2884c.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        p pVar = this.f18532c;
        if (pVar.f2891k != colorStateList) {
            pVar.f2891k = colorStateList;
            d.e(pVar.f2882a, pVar.f2888g, colorStateList, pVar.f2892l);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        p pVar = this.f18532c;
        if (pVar.f2892l != mode) {
            pVar.f2892l = mode;
            d.e(pVar.f2882a, pVar.f2888g, pVar.f2891k, mode);
        }
    }

    public void setEndIconVisible(boolean z6) {
        this.f18532c.h(z6);
    }

    public void setError(CharSequence charSequence) {
        t tVar = this.f18547k;
        if (!tVar.f2922q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            tVar.f();
            return;
        }
        tVar.c();
        tVar.f2921p = charSequence;
        tVar.f2923r.setText(charSequence);
        int i = tVar.f2919n;
        if (i != 1) {
            tVar.f2920o = 1;
        }
        tVar.i(i, tVar.f2920o, tVar.h(tVar.f2923r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        t tVar = this.f18547k;
        tVar.f2925t = i;
        AppCompatTextView appCompatTextView = tVar.f2923r;
        if (appCompatTextView != null) {
            appCompatTextView.setAccessibilityLiveRegion(i);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        t tVar = this.f18547k;
        tVar.f2924s = charSequence;
        AppCompatTextView appCompatTextView = tVar.f2923r;
        if (appCompatTextView != null) {
            appCompatTextView.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z6) {
        t tVar = this.f18547k;
        TextInputLayout textInputLayout = tVar.f2914h;
        if (tVar.f2922q == z6) {
            return;
        }
        tVar.c();
        if (z6) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(tVar.f2913g, null);
            tVar.f2923r = appCompatTextView;
            appCompatTextView.setId(com.apm.insight.R.id.textinput_error);
            tVar.f2923r.setTextAlignment(5);
            Typeface typeface = tVar.f2906B;
            if (typeface != null) {
                tVar.f2923r.setTypeface(typeface);
            }
            int i = tVar.f2926u;
            tVar.f2926u = i;
            AppCompatTextView appCompatTextView2 = tVar.f2923r;
            if (appCompatTextView2 != null) {
                tVar.f2914h.n(appCompatTextView2, i);
            }
            ColorStateList colorStateList = tVar.f2927v;
            tVar.f2927v = colorStateList;
            AppCompatTextView appCompatTextView3 = tVar.f2923r;
            if (appCompatTextView3 != null && colorStateList != null) {
                appCompatTextView3.setTextColor(colorStateList);
            }
            CharSequence charSequence = tVar.f2924s;
            tVar.f2924s = charSequence;
            AppCompatTextView appCompatTextView4 = tVar.f2923r;
            if (appCompatTextView4 != null) {
                appCompatTextView4.setContentDescription(charSequence);
            }
            int i3 = tVar.f2925t;
            tVar.f2925t = i3;
            AppCompatTextView appCompatTextView5 = tVar.f2923r;
            if (appCompatTextView5 != null) {
                appCompatTextView5.setAccessibilityLiveRegion(i3);
            }
            tVar.f2923r.setVisibility(4);
            tVar.a(tVar.f2923r, 0);
        } else {
            tVar.f();
            tVar.g(tVar.f2923r, 0);
            tVar.f2923r = null;
            textInputLayout.t();
            textInputLayout.z();
        }
        tVar.f2922q = z6;
    }

    public void setErrorIconDrawable(int i) {
        p pVar = this.f18532c;
        pVar.i(i != 0 ? a4.t.i(pVar.getContext(), i) : null);
        d.N(pVar.f2882a, pVar.f2884c, pVar.f2885d);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        p pVar = this.f18532c;
        CheckableImageButton checkableImageButton = pVar.f2884c;
        View.OnLongClickListener onLongClickListener = pVar.f2887f;
        checkableImageButton.setOnClickListener(onClickListener);
        d.V(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        p pVar = this.f18532c;
        pVar.f2887f = onLongClickListener;
        CheckableImageButton checkableImageButton = pVar.f2884c;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        d.V(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        p pVar = this.f18532c;
        if (pVar.f2885d != colorStateList) {
            pVar.f2885d = colorStateList;
            d.e(pVar.f2882a, pVar.f2884c, colorStateList, pVar.f2886e);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        p pVar = this.f18532c;
        if (pVar.f2886e != mode) {
            pVar.f2886e = mode;
            d.e(pVar.f2882a, pVar.f2884c, pVar.f2885d, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        t tVar = this.f18547k;
        tVar.f2926u = i;
        AppCompatTextView appCompatTextView = tVar.f2923r;
        if (appCompatTextView != null) {
            tVar.f2914h.n(appCompatTextView, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        t tVar = this.f18547k;
        tVar.f2927v = colorStateList;
        AppCompatTextView appCompatTextView = tVar.f2923r;
        if (appCompatTextView == null || colorStateList == null) {
            return;
        }
        appCompatTextView.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z6) {
        if (this.f18513L0 != z6) {
            this.f18513L0 = z6;
            w(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        t tVar = this.f18547k;
        if (zIsEmpty) {
            if (tVar.f2929x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!tVar.f2929x) {
            setHelperTextEnabled(true);
        }
        tVar.c();
        tVar.f2928w = charSequence;
        tVar.f2930y.setText(charSequence);
        int i = tVar.f2919n;
        if (i != 2) {
            tVar.f2920o = 2;
        }
        tVar.i(i, tVar.f2920o, tVar.h(tVar.f2930y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        t tVar = this.f18547k;
        tVar.f2905A = colorStateList;
        AppCompatTextView appCompatTextView = tVar.f2930y;
        if (appCompatTextView == null || colorStateList == null) {
            return;
        }
        appCompatTextView.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z6) {
        t tVar = this.f18547k;
        TextInputLayout textInputLayout = tVar.f2914h;
        if (tVar.f2929x == z6) {
            return;
        }
        tVar.c();
        if (z6) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(tVar.f2913g, null);
            tVar.f2930y = appCompatTextView;
            appCompatTextView.setId(com.apm.insight.R.id.textinput_helper_text);
            tVar.f2930y.setTextAlignment(5);
            Typeface typeface = tVar.f2906B;
            if (typeface != null) {
                tVar.f2930y.setTypeface(typeface);
            }
            tVar.f2930y.setVisibility(4);
            tVar.f2930y.setAccessibilityLiveRegion(1);
            int i = tVar.f2931z;
            tVar.f2931z = i;
            AppCompatTextView appCompatTextView2 = tVar.f2930y;
            if (appCompatTextView2 != null) {
                appCompatTextView2.setTextAppearance(i);
            }
            ColorStateList colorStateList = tVar.f2905A;
            tVar.f2905A = colorStateList;
            AppCompatTextView appCompatTextView3 = tVar.f2930y;
            if (appCompatTextView3 != null && colorStateList != null) {
                appCompatTextView3.setTextColor(colorStateList);
            }
            tVar.a(tVar.f2930y, 1);
            tVar.f2930y.setAccessibilityDelegate(new s(tVar));
        } else {
            tVar.c();
            int i3 = tVar.f2919n;
            if (i3 == 2) {
                tVar.f2920o = 0;
            }
            tVar.i(i3, tVar.f2920o, tVar.h(tVar.f2930y, ""));
            tVar.g(tVar.f2930y, 1);
            tVar.f2930y = null;
            textInputLayout.t();
            textInputLayout.z();
        }
        tVar.f2929x = z6;
    }

    public void setHelperTextTextAppearance(int i) {
        t tVar = this.f18547k;
        tVar.f2931z = i;
        AppCompatTextView appCompatTextView = tVar.f2930y;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.f18523R) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z6) {
        this.f18514M0 = z6;
    }

    public void setHintEnabled(boolean z6) {
        if (z6 != this.f18523R) {
            this.f18523R = z6;
            if (z6) {
                CharSequence hint = this.f18536e.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f18524S)) {
                        setHint(hint);
                    }
                    this.f18536e.setHint((CharSequence) null);
                }
                this.f18525T = true;
            } else {
                this.f18525T = false;
                if (!TextUtils.isEmpty(this.f18524S) && TextUtils.isEmpty(this.f18536e.getHint())) {
                    this.f18536e.setHint(this.f18524S);
                }
                setHintInternal(null);
            }
            if (this.f18536e != null) {
                v();
            }
        }
    }

    public void setHintMaxLines(int i) {
        C2997b c2997b = this.f18511K0;
        if (i != c2997b.f24094p0) {
            c2997b.f24094p0 = i;
            c2997b.l(false);
        }
        c2997b.v(i);
        requestLayout();
    }

    public void setHintTextAppearance(int i) {
        C2997b c2997b = this.f18511K0;
        c2997b.q(i);
        this.f18564y0 = c2997b.f24093p;
        if (this.f18536e != null) {
            w(false, false);
            v();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f18564y0 != colorStateList) {
            if (this.f18563x0 == null) {
                this.f18511K0.r(colorStateList);
            }
            this.f18564y0 = colorStateList;
            if (this.f18536e != null) {
                w(false, false);
            }
        }
    }

    public void setLengthCounter(C c6) {
        this.f18494C = c6;
    }

    public void setMaxEms(int i) {
        this.f18542h = i;
        EditText editText = this.f18536e;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public void setMaxWidth(int i) {
        this.f18545j = i;
        EditText editText = this.f18536e;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.f18540g = i;
        EditText editText = this.f18536e;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public void setMinWidth(int i) {
        this.i = i;
        EditText editText = this.f18536e;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinWidth(i);
    }

    public void setMinWidthResource(int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        p pVar = this.f18532c;
        pVar.f2888g.setContentDescription(i != 0 ? pVar.getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        p pVar = this.f18532c;
        pVar.f2888g.setImageDrawable(i != 0 ? a4.t.i(pVar.getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z6) {
        p pVar = this.f18532c;
        if (z6 && pVar.i != 1) {
            pVar.g(1);
        } else if (z6) {
            pVar.getClass();
        } else {
            pVar.g(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        p pVar = this.f18532c;
        pVar.f2891k = colorStateList;
        d.e(pVar.f2882a, pVar.f2888g, colorStateList, pVar.f2892l);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        p pVar = this.f18532c;
        pVar.f2892l = mode;
        d.e(pVar.f2882a, pVar.f2888g, pVar.f2891k, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f18506I == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
            this.f18506I = appCompatTextView;
            appCompatTextView.setId(com.apm.insight.R.id.textinput_placeholder);
            this.f18506I.setImportantForAccessibility(1);
            this.f18506I.setAccessibilityLiveRegion(1);
            g gVarF = f();
            this.f18512L = gVarF;
            gVarF.f2466b = 67L;
            this.M = f();
            setPlaceholderTextAppearance(this.f18510K);
            setPlaceholderTextColor(this.f18508J);
            O.m(this.f18506I, new A(0));
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f18504H) {
                setPlaceholderTextEnabled(true);
            }
            this.f18502G = charSequence;
        }
        EditText editText = this.f18536e;
        x(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.f18510K = i;
        AppCompatTextView appCompatTextView = this.f18506I;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f18508J != colorStateList) {
            this.f18508J = colorStateList;
            AppCompatTextView appCompatTextView = this.f18506I;
            if (appCompatTextView == null || colorStateList == null) {
                return;
            }
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        y yVar = this.f18531b;
        yVar.getClass();
        yVar.f2949c = TextUtils.isEmpty(charSequence) ? null : charSequence;
        yVar.f2948b.setText(charSequence);
        yVar.e();
    }

    public void setPrefixTextAppearance(int i) {
        this.f18531b.f2948b.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f18531b.f2948b.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(o oVar) {
        j jVar = this.f18526U;
        if (jVar == null || jVar.f1597b.f1560a == oVar) {
            return;
        }
        this.f18535d0 = oVar;
        c();
    }

    public void setStartIconCheckable(boolean z6) {
        this.f18531b.f2950d.setCheckable(z6);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? a4.t.i(getContext(), i) : null);
    }

    public void setStartIconMinSize(int i) {
        y yVar = this.f18531b;
        if (i < 0) {
            yVar.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i != yVar.f2953g) {
            yVar.f2953g = i;
            CheckableImageButton checkableImageButton = yVar.f2950d;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        y yVar = this.f18531b;
        CheckableImageButton checkableImageButton = yVar.f2950d;
        View.OnLongClickListener onLongClickListener = yVar.i;
        checkableImageButton.setOnClickListener(onClickListener);
        d.V(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        y yVar = this.f18531b;
        yVar.i = onLongClickListener;
        CheckableImageButton checkableImageButton = yVar.f2950d;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        d.V(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        y yVar = this.f18531b;
        yVar.f2954h = scaleType;
        yVar.f2950d.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        y yVar = this.f18531b;
        if (yVar.f2951e != colorStateList) {
            yVar.f2951e = colorStateList;
            d.e(yVar.f2947a, yVar.f2950d, colorStateList, yVar.f2952f);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        y yVar = this.f18531b;
        if (yVar.f2952f != mode) {
            yVar.f2952f = mode;
            d.e(yVar.f2947a, yVar.f2950d, yVar.f2951e, mode);
        }
    }

    public void setStartIconVisible(boolean z6) {
        this.f18531b.c(z6);
    }

    public void setSuffixText(CharSequence charSequence) {
        p pVar = this.f18532c;
        pVar.getClass();
        pVar.f2875D = TextUtils.isEmpty(charSequence) ? null : charSequence;
        pVar.f2876E.setText(charSequence);
        pVar.n();
    }

    public void setSuffixTextAppearance(int i) {
        this.f18532c.f2876E.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f18532c.f2876E.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(B b5) {
        EditText editText = this.f18536e;
        if (editText != null) {
            O.m(editText, b5);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f18557q0) {
            this.f18557q0 = typeface;
            C2997b c2997b = this.f18511K0;
            boolean zT = c2997b.t(typeface);
            boolean z6 = c2997b.z(typeface);
            if (zT || z6) {
                c2997b.l(false);
            }
            t tVar = this.f18547k;
            if (typeface != tVar.f2906B) {
                tVar.f2906B = typeface;
                AppCompatTextView appCompatTextView = tVar.f2923r;
                if (appCompatTextView != null) {
                    appCompatTextView.setTypeface(typeface);
                }
                AppCompatTextView appCompatTextView2 = tVar.f2930y;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTypeface(typeface);
                }
            }
            AppCompatTextView appCompatTextView3 = this.f18496D;
            if (appCompatTextView3 != null) {
                appCompatTextView3.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        Drawable background;
        AppCompatTextView appCompatTextView;
        EditText editText = this.f18536e;
        if (editText == null || this.f18541g0 != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = AbstractC2720j0.f22537a;
        Drawable drawableMutate = background.mutate();
        if (o()) {
            drawableMutate.setColorFilter(r.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f18553n && (appCompatTextView = this.f18496D) != null) {
            drawableMutate.setColorFilter(r.c(appCompatTextView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            drawableMutate.clearColorFilter();
            this.f18536e.refreshDrawableState();
        }
    }

    public final void u() {
        EditText editText = this.f18536e;
        if (editText == null || this.f18526U == null) {
            return;
        }
        if ((this.f18530a0 || editText.getBackground() == null) && this.f18541g0 != 0) {
            this.f18536e.setBackground(getEditTextBoxBackground());
            this.f18530a0 = true;
        }
    }

    public final void v() {
        if (this.f18541g0 != 1) {
            FrameLayout frameLayout = this.f18529a;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int iE = e();
            if (iE != layoutParams.topMargin) {
                layoutParams.topMargin = iE;
                frameLayout.requestLayout();
            }
        }
    }

    public final void w(boolean z6, boolean z7) {
        ColorStateList colorStateList;
        AppCompatTextView appCompatTextView;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f18536e;
        boolean z8 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f18536e;
        boolean z9 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.f18563x0;
        C2997b c2997b = this.f18511K0;
        if (colorStateList2 != null) {
            c2997b.n(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.f18563x0;
            c2997b.n(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f18505H0) : this.f18505H0));
        } else if (o()) {
            AppCompatTextView appCompatTextView2 = this.f18547k.f2923r;
            c2997b.n(appCompatTextView2 != null ? appCompatTextView2.getTextColors() : null);
        } else if (this.f18553n && (appCompatTextView = this.f18496D) != null) {
            c2997b.n(appCompatTextView.getTextColors());
        } else if (z9 && (colorStateList = this.f18564y0) != null) {
            c2997b.r(colorStateList);
        }
        p pVar = this.f18532c;
        y yVar = this.f18531b;
        if (z8 || !this.f18513L0 || (isEnabled() && z9)) {
            if (z7 || this.f18509J0) {
                ValueAnimator valueAnimator = this.f18516N0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f18516N0.cancel();
                }
                if (z6 && this.f18514M0) {
                    b(1.0f);
                } else {
                    c2997b.A(1.0f);
                }
                this.f18509J0 = false;
                if (g()) {
                    l();
                }
                EditText editText3 = this.f18536e;
                x(editText3 != null ? editText3.getText() : null);
                yVar.f2955j = false;
                yVar.e();
                pVar.f2877F = false;
                pVar.n();
                return;
            }
            return;
        }
        if (z7 || !this.f18509J0) {
            ValueAnimator valueAnimator2 = this.f18516N0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f18516N0.cancel();
            }
            if (z6 && this.f18514M0) {
                b(0.0f);
            } else {
                c2997b.A(0.0f);
            }
            if (g() && !((M3.g) this.f18526U).f2848V.f2846s.isEmpty() && g()) {
                ((M3.g) this.f18526U).A(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.f18509J0 = true;
            AppCompatTextView appCompatTextView3 = this.f18506I;
            if (appCompatTextView3 != null && this.f18504H) {
                appCompatTextView3.setText((CharSequence) null);
                L0.p.a(this.f18529a, this.M);
                this.f18506I.setVisibility(4);
            }
            yVar.f2955j = true;
            yVar.e();
            pVar.f2877F = true;
            pVar.n();
        }
    }

    public final void x(Editable editable) {
        ((b) this.f18494C).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.f18529a;
        if (length != 0 || this.f18509J0) {
            AppCompatTextView appCompatTextView = this.f18506I;
            if (appCompatTextView == null || !this.f18504H) {
                return;
            }
            appCompatTextView.setText((CharSequence) null);
            L0.p.a(frameLayout, this.M);
            this.f18506I.setVisibility(4);
            return;
        }
        if (this.f18506I == null || !this.f18504H || TextUtils.isEmpty(this.f18502G)) {
            return;
        }
        this.f18506I.setText(this.f18502G);
        L0.p.a(frameLayout, this.f18512L);
        this.f18506I.setVisibility(0);
        this.f18506I.bringToFront();
    }

    public final void y(boolean z6, boolean z7) {
        int defaultColor = this.f18495C0.getDefaultColor();
        int colorForState = this.f18495C0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f18495C0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z6) {
            this.f18550l0 = colorForState2;
        } else if (z7) {
            this.f18550l0 = colorForState;
        } else {
            this.f18550l0 = defaultColor;
        }
    }

    public final void z() {
        AppCompatTextView appCompatTextView;
        EditText editText;
        EditText editText2;
        if (this.f18526U == null || this.f18541g0 == 0) {
            return;
        }
        boolean z6 = false;
        boolean z7 = isFocused() || ((editText2 = this.f18536e) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f18536e) != null && editText.isHovered())) {
            z6 = true;
        }
        if (!isEnabled()) {
            this.f18550l0 = this.f18505H0;
        } else if (o()) {
            if (this.f18495C0 != null) {
                y(z7, z6);
            } else {
                this.f18550l0 = getErrorCurrentTextColors();
            }
        } else if (!this.f18553n || (appCompatTextView = this.f18496D) == null) {
            if (z7) {
                this.f18550l0 = this.f18493B0;
            } else if (z6) {
                this.f18550l0 = this.f18492A0;
            } else {
                this.f18550l0 = this.f18565z0;
            }
        } else if (this.f18495C0 != null) {
            y(z7, z6);
        } else {
            this.f18550l0 = appCompatTextView.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            r();
        }
        p pVar = this.f18532c;
        TextInputLayout textInputLayout = pVar.f2882a;
        CheckableImageButton checkableImageButton = pVar.f2888g;
        TextInputLayout textInputLayout2 = pVar.f2882a;
        pVar.l();
        d.N(textInputLayout2, pVar.f2884c, pVar.f2885d);
        d.N(textInputLayout2, checkableImageButton, pVar.f2891k);
        if (pVar.b() instanceof M3.k) {
            if (!textInputLayout.o() || checkableImageButton.getDrawable() == null) {
                d.e(textInputLayout, checkableImageButton, pVar.f2891k, pVar.f2892l);
            } else {
                Drawable drawableMutate = checkableImageButton.getDrawable().mutate();
                drawableMutate.setTint(textInputLayout.getErrorCurrentTextColors());
                checkableImageButton.setImageDrawable(drawableMutate);
            }
        }
        y yVar = this.f18531b;
        d.N(yVar.f2947a, yVar.f2950d, yVar.f2951e);
        if (this.f18541g0 == 2) {
            int i = this.f18544i0;
            if (z7 && isEnabled()) {
                this.f18544i0 = this.f18548k0;
            } else {
                this.f18544i0 = this.f18546j0;
            }
            if (this.f18544i0 != i && g() && !this.f18509J0) {
                if (g()) {
                    ((M3.g) this.f18526U).A(0.0f, 0.0f, 0.0f, 0.0f);
                }
                l();
            }
        }
        if (this.f18541g0 == 1) {
            if (!isEnabled()) {
                this.f18552m0 = this.f18499E0;
            } else if (z6 && !z7) {
                this.f18552m0 = this.f18503G0;
            } else if (z7) {
                this.f18552m0 = this.f18501F0;
            } else {
                this.f18552m0 = this.f18497D0;
            }
        }
        c();
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f18531b.f2950d;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f18531b.b(drawable);
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f18532c.f2888g.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f18532c.f2888g.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f18532c.i(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f18532c.f2888g;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        p pVar = this.f18532c;
        TextInputLayout textInputLayout = pVar.f2882a;
        CheckableImageButton checkableImageButton = pVar.f2888g;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            d.e(textInputLayout, checkableImageButton, pVar.f2891k, pVar.f2892l);
            d.N(textInputLayout, checkableImageButton, pVar.f2891k);
        }
    }
}
