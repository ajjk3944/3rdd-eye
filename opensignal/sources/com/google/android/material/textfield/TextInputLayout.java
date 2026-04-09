package com.google.android.material.textfield;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
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
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
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
import androidx.customview.view.AbsSavedState;
import bk.f;
import com.google.android.material.internal.CheckableImageButton;
import ed.b;
import ed.d;
import ed.j;
import ed.k;
import ee.i;
import ee.l;
import h3.c;
import io.sentry.android.core.u0;
import ir.f0;
import j4.o;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import je.e;
import je.m;
import je.p;
import je.q;
import je.t;
import je.v;
import je.w;
import je.x;
import je.y;
import lf.t1;
import p.c1;
import p.l2;
import p.q0;
import t7.g;
import t7.u;
import u3.i0;

/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final int Z0 = k.Widget_Design_TextInputLayout;

    /* renamed from: a1, reason: collision with root package name */
    public static final int[][] f5739a1 = {new int[]{R.attr.state_pressed}, new int[0]};
    public int A0;
    public int B;
    public final LinkedHashSet B0;
    public ColorDrawable C0;
    public int D;
    public int D0;
    public int E;
    public Drawable E0;
    public int F;
    public ColorStateList F0;
    public final q G;
    public ColorStateList G0;
    public boolean H;
    public int H0;
    public int I;
    public int I0;
    public boolean J;
    public int J0;
    public y K;
    public ColorStateList K0;
    public q0 L;
    public int L0;
    public int M;
    public int M0;
    public int N;
    public int N0;
    public CharSequence O;
    public int O0;
    public boolean P;
    public int P0;
    public q0 Q;
    public int Q0;
    public ColorStateList R;
    public boolean R0;
    public int S;
    public final xd.a S0;
    public g T;
    public boolean T0;
    public g U;
    public boolean U0;
    public ColorStateList V;
    public ValueAnimator V0;
    public ColorStateList W;
    public boolean W0;
    public boolean X0;
    public boolean Y0;

    /* renamed from: a, reason: collision with root package name */
    public final FrameLayout f5740a;

    /* renamed from: a0, reason: collision with root package name */
    public ColorStateList f5741a0;

    /* renamed from: b0, reason: collision with root package name */
    public ColorStateList f5742b0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f5743c0;

    /* renamed from: d, reason: collision with root package name */
    public final v f5744d;

    /* renamed from: d0, reason: collision with root package name */
    public CharSequence f5745d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f5746e0;

    /* renamed from: f0, reason: collision with root package name */
    public i f5747f0;

    /* renamed from: g, reason: collision with root package name */
    public final m f5748g;

    /* renamed from: g0, reason: collision with root package name */
    public i f5749g0;

    /* renamed from: h0, reason: collision with root package name */
    public StateListDrawable f5750h0;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f5751i0;

    /* renamed from: j0, reason: collision with root package name */
    public i f5752j0;

    /* renamed from: k0, reason: collision with root package name */
    public i f5753k0;

    /* renamed from: l0, reason: collision with root package name */
    public l f5754l0;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f5755m0;

    /* renamed from: n0, reason: collision with root package name */
    public final int f5756n0;

    /* renamed from: o0, reason: collision with root package name */
    public int f5757o0;

    /* renamed from: p0, reason: collision with root package name */
    public int f5758p0;

    /* renamed from: q0, reason: collision with root package name */
    public int f5759q0;

    /* renamed from: r, reason: collision with root package name */
    public final int f5760r;

    /* renamed from: r0, reason: collision with root package name */
    public int f5761r0;

    /* renamed from: s0, reason: collision with root package name */
    public int f5762s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f5763t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f5764u0;

    /* renamed from: v0, reason: collision with root package name */
    public final Rect f5765v0;

    /* renamed from: w0, reason: collision with root package name */
    public final Rect f5766w0;

    /* renamed from: x, reason: collision with root package name */
    public EditText f5767x;

    /* renamed from: x0, reason: collision with root package name */
    public final RectF f5768x0;

    /* renamed from: y, reason: collision with root package name */
    public CharSequence f5769y;

    /* renamed from: y0, reason: collision with root package name */
    public Typeface f5770y0;

    /* renamed from: z0, reason: collision with root package name */
    public ColorDrawable f5771z0;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: g, reason: collision with root package name */
        public CharSequence f5772g;

        /* renamed from: r, reason: collision with root package name */
        public boolean f5773r;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f5772g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f5773r = parcel.readInt() == 1;
        }

        public final String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f5772g) + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            TextUtils.writeToParcel(this.f5772g, parcel, i10);
            parcel.writeInt(this.f5773r ? 1 : 0);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TextInputLayout(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        int i10 = b.textInputStyle;
        int i11 = Z0;
        super(le.a.a(context, attributeSet, i10, i11), attributeSet, i10);
        this.B = -1;
        this.D = -1;
        this.E = -1;
        this.F = -1;
        this.G = new q(this);
        this.K = new u0(8);
        this.f5765v0 = new Rect();
        this.f5766w0 = new Rect();
        this.f5768x0 = new RectF();
        this.B0 = new LinkedHashSet();
        xd.a aVar = new xd.a(this);
        this.S0 = aVar;
        this.Y0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f5740a = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = fd.a.f8822a;
        aVar.R = linearInterpolator;
        aVar.j(false);
        aVar.Q = linearInterpolator;
        aVar.j(false);
        if (aVar.f25252g != 8388659) {
            aVar.f25252g = 8388659;
            aVar.j(false);
        }
        io.sentry.k kVarE = xd.k.e(context2, attributeSet, ed.l.TextInputLayout, i10, i11, ed.l.TextInputLayout_counterTextAppearance, ed.l.TextInputLayout_counterOverflowTextAppearance, ed.l.TextInputLayout_errorTextAppearance, ed.l.TextInputLayout_helperTextTextAppearance, ed.l.TextInputLayout_hintTextAppearance);
        v vVar = new v(this, kVarE);
        this.f5744d = vVar;
        int i12 = ed.l.TextInputLayout_hintEnabled;
        TypedArray typedArray = (TypedArray) kVarE.f12398g;
        this.f5743c0 = typedArray.getBoolean(i12, true);
        setHint(typedArray.getText(ed.l.TextInputLayout_android_hint));
        this.U0 = typedArray.getBoolean(ed.l.TextInputLayout_hintAnimationEnabled, true);
        this.T0 = typedArray.getBoolean(ed.l.TextInputLayout_expandedHintEnabled, true);
        if (typedArray.hasValue(ed.l.TextInputLayout_android_minEms)) {
            setMinEms(typedArray.getInt(ed.l.TextInputLayout_android_minEms, -1));
        } else if (typedArray.hasValue(ed.l.TextInputLayout_android_minWidth)) {
            setMinWidth(typedArray.getDimensionPixelSize(ed.l.TextInputLayout_android_minWidth, -1));
        }
        if (typedArray.hasValue(ed.l.TextInputLayout_android_maxEms)) {
            setMaxEms(typedArray.getInt(ed.l.TextInputLayout_android_maxEms, -1));
        } else if (typedArray.hasValue(ed.l.TextInputLayout_android_maxWidth)) {
            setMaxWidth(typedArray.getDimensionPixelSize(ed.l.TextInputLayout_android_maxWidth, -1));
        }
        this.f5754l0 = l.c(context2, attributeSet, i10, i11).b();
        this.f5756n0 = context2.getResources().getDimensionPixelOffset(d.mtrl_textinput_box_label_cutout_padding);
        this.f5758p0 = typedArray.getDimensionPixelOffset(ed.l.TextInputLayout_boxCollapsedPaddingTop, 0);
        this.f5760r = getResources().getDimensionPixelSize(d.m3_multiline_hint_filled_text_extra_space);
        this.f5761r0 = typedArray.getDimensionPixelSize(ed.l.TextInputLayout_boxStrokeWidth, context2.getResources().getDimensionPixelSize(d.mtrl_textinput_box_stroke_width_default));
        this.f5762s0 = typedArray.getDimensionPixelSize(ed.l.TextInputLayout_boxStrokeWidthFocused, context2.getResources().getDimensionPixelSize(d.mtrl_textinput_box_stroke_width_focused));
        this.f5759q0 = this.f5761r0;
        float dimension = typedArray.getDimension(ed.l.TextInputLayout_boxCornerRadiusTopStart, -1.0f);
        float dimension2 = typedArray.getDimension(ed.l.TextInputLayout_boxCornerRadiusTopEnd, -1.0f);
        float dimension3 = typedArray.getDimension(ed.l.TextInputLayout_boxCornerRadiusBottomEnd, -1.0f);
        float dimension4 = typedArray.getDimension(ed.l.TextInputLayout_boxCornerRadiusBottomStart, -1.0f);
        f fVarG = this.f5754l0.g();
        if (dimension >= 0.0f) {
            fVarG.f2807e = new ee.a(dimension);
        }
        if (dimension2 >= 0.0f) {
            fVarG.f2808f = new ee.a(dimension2);
        }
        if (dimension3 >= 0.0f) {
            fVarG.f2809g = new ee.a(dimension3);
        }
        if (dimension4 >= 0.0f) {
            fVarG.f2810h = new ee.a(dimension4);
        }
        this.f5754l0 = fVarG.b();
        ColorStateList colorStateListR = xu.l.r(context2, kVarE, ed.l.TextInputLayout_boxBackgroundColor);
        if (colorStateListR != null) {
            int defaultColor = colorStateListR.getDefaultColor();
            this.L0 = defaultColor;
            this.f5764u0 = defaultColor;
            if (colorStateListR.isStateful()) {
                this.M0 = colorStateListR.getColorForState(new int[]{-16842910}, -1);
                this.N0 = colorStateListR.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.O0 = colorStateListR.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.N0 = this.L0;
                ColorStateList colorStateListC = c.c(context2, ed.c.mtrl_filled_background_color);
                this.M0 = colorStateListC.getColorForState(new int[]{-16842910}, -1);
                this.O0 = colorStateListC.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f5764u0 = 0;
            this.L0 = 0;
            this.M0 = 0;
            this.N0 = 0;
            this.O0 = 0;
        }
        if (typedArray.hasValue(ed.l.TextInputLayout_android_textColorHint)) {
            ColorStateList colorStateListT = kVarE.T(ed.l.TextInputLayout_android_textColorHint);
            this.G0 = colorStateListT;
            this.F0 = colorStateListT;
        }
        ColorStateList colorStateListR2 = xu.l.r(context2, kVarE, ed.l.TextInputLayout_boxStrokeColor);
        this.J0 = typedArray.getColor(ed.l.TextInputLayout_boxStrokeColor, 0);
        this.H0 = context2.getColor(ed.c.mtrl_textinput_default_box_stroke_color);
        this.P0 = context2.getColor(ed.c.mtrl_textinput_disabled_color);
        this.I0 = context2.getColor(ed.c.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateListR2 != null) {
            setBoxStrokeColorStateList(colorStateListR2);
        }
        if (typedArray.hasValue(ed.l.TextInputLayout_boxStrokeErrorColor)) {
            setBoxStrokeErrorColor(xu.l.r(context2, kVarE, ed.l.TextInputLayout_boxStrokeErrorColor));
        }
        if (typedArray.getResourceId(ed.l.TextInputLayout_hintTextAppearance, -1) != -1) {
            setHintTextAppearance(typedArray.getResourceId(ed.l.TextInputLayout_hintTextAppearance, 0));
        }
        this.f5741a0 = kVarE.T(ed.l.TextInputLayout_cursorColor);
        this.f5742b0 = kVarE.T(ed.l.TextInputLayout_cursorErrorColor);
        int resourceId = typedArray.getResourceId(ed.l.TextInputLayout_errorTextAppearance, 0);
        CharSequence text = typedArray.getText(ed.l.TextInputLayout_errorContentDescription);
        int i13 = typedArray.getInt(ed.l.TextInputLayout_errorAccessibilityLiveRegion, 1);
        boolean z10 = typedArray.getBoolean(ed.l.TextInputLayout_errorEnabled, false);
        int resourceId2 = typedArray.getResourceId(ed.l.TextInputLayout_helperTextTextAppearance, 0);
        boolean z11 = typedArray.getBoolean(ed.l.TextInputLayout_helperTextEnabled, false);
        CharSequence text2 = typedArray.getText(ed.l.TextInputLayout_helperText);
        int resourceId3 = typedArray.getResourceId(ed.l.TextInputLayout_placeholderTextAppearance, 0);
        CharSequence text3 = typedArray.getText(ed.l.TextInputLayout_placeholderText);
        boolean z12 = typedArray.getBoolean(ed.l.TextInputLayout_counterEnabled, false);
        setCounterMaxLength(typedArray.getInt(ed.l.TextInputLayout_counterMaxLength, -1));
        this.N = typedArray.getResourceId(ed.l.TextInputLayout_counterTextAppearance, 0);
        this.M = typedArray.getResourceId(ed.l.TextInputLayout_counterOverflowTextAppearance, 0);
        setBoxBackgroundMode(typedArray.getInt(ed.l.TextInputLayout_boxBackgroundMode, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i13);
        setCounterOverflowTextAppearance(this.M);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.N);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (typedArray.hasValue(ed.l.TextInputLayout_errorTextColor)) {
            setErrorTextColor(kVarE.T(ed.l.TextInputLayout_errorTextColor));
        }
        if (typedArray.hasValue(ed.l.TextInputLayout_helperTextTextColor)) {
            setHelperTextColor(kVarE.T(ed.l.TextInputLayout_helperTextTextColor));
        }
        if (typedArray.hasValue(ed.l.TextInputLayout_hintTextColor)) {
            setHintTextColor(kVarE.T(ed.l.TextInputLayout_hintTextColor));
        }
        if (typedArray.hasValue(ed.l.TextInputLayout_counterTextColor)) {
            setCounterTextColor(kVarE.T(ed.l.TextInputLayout_counterTextColor));
        }
        if (typedArray.hasValue(ed.l.TextInputLayout_counterOverflowTextColor)) {
            setCounterOverflowTextColor(kVarE.T(ed.l.TextInputLayout_counterOverflowTextColor));
        }
        if (typedArray.hasValue(ed.l.TextInputLayout_placeholderTextColor)) {
            setPlaceholderTextColor(kVarE.T(ed.l.TextInputLayout_placeholderTextColor));
        }
        m mVar = new m(this, kVarE);
        this.f5748g = mVar;
        boolean z13 = typedArray.getBoolean(ed.l.TextInputLayout_android_enabled, true);
        setHintMaxLines(typedArray.getInt(ed.l.TextInputLayout_hintMaxLines, 1));
        kVarE.l0();
        setImportantForAccessibility(2);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(1);
        }
        frameLayout.addView(vVar);
        frameLayout.addView(mVar);
        addView(frameLayout);
        setEnabled(z13);
        setHelperTextEnabled(z11);
        setErrorEnabled(z10);
        setCounterEnabled(z12);
        setHelperText(text2);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f5767x;
        if (!(editText instanceof AutoCompleteTextView) || editText.getInputType() != 0) {
            return this.f5747f0;
        }
        int iV = io.sentry.config.a.V(this.f5767x, h.a.colorControlHighlight);
        int i10 = this.f5757o0;
        int[][] iArr = f5739a1;
        if (i10 != 2) {
            if (i10 != 1) {
                return null;
            }
            i iVar = this.f5747f0;
            int i11 = this.f5764u0;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{io.sentry.config.a.b0(iV, 0.1f, i11), i11}), iVar, iVar);
        }
        Context context = getContext();
        i iVar2 = this.f5747f0;
        TypedValue typedValueE0 = xu.d.e0(b.colorSurface, context, "TextInputLayout");
        int i12 = typedValueE0.resourceId;
        int color = i12 != 0 ? context.getColor(i12) : typedValueE0.data;
        i iVar3 = new i(iVar2.f8117d.f8097a);
        int iB0 = io.sentry.config.a.b0(iV, 0.1f, color);
        iVar3.q(new ColorStateList(iArr, new int[]{iB0, 0}));
        iVar3.setTint(color);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iB0, color});
        i iVar4 = new i(iVar2.f8117d.f8097a);
        iVar4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, iVar3, iVar4), iVar2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f5750h0 == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f5750h0 = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.f5750h0.addState(new int[0], h(false));
        }
        return this.f5750h0;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f5749g0 == null) {
            this.f5749g0 = h(true);
        }
        return this.f5749g0;
    }

    public static void m(ViewGroup viewGroup, boolean z10) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            childAt.setEnabled(z10);
            if (childAt instanceof ViewGroup) {
                m((ViewGroup) childAt, z10);
            }
        }
    }

    private void setEditText(EditText editText) throws Resources.NotFoundException {
        if (this.f5767x != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        getEndIconMode();
        this.f5767x = editText;
        int i10 = this.B;
        if (i10 != -1) {
            setMinEms(i10);
        } else {
            setMinWidth(this.E);
        }
        int i11 = this.D;
        if (i11 != -1) {
            setMaxEms(i11);
        } else {
            setMaxWidth(this.F);
        }
        this.f5751i0 = false;
        k();
        setTextInputAccessibilityDelegate(new x(this));
        Typeface typeface = this.f5767x.getTypeface();
        xd.a aVar = this.S0;
        aVar.n(typeface);
        float textSize = this.f5767x.getTextSize();
        if (aVar.f25254h != textSize) {
            aVar.f25254h = textSize;
            aVar.j(false);
        }
        float letterSpacing = this.f5767x.getLetterSpacing();
        if (aVar.X != letterSpacing) {
            aVar.X = letterSpacing;
            aVar.j(false);
        }
        int gravity = this.f5767x.getGravity();
        int i12 = (gravity & (-113)) | 48;
        if (aVar.f25252g != i12) {
            aVar.f25252g = i12;
            aVar.j(false);
        }
        if (aVar.f25250f != gravity) {
            aVar.f25250f = gravity;
            aVar.j(false);
        }
        this.Q0 = editText.getMinimumHeight();
        this.f5767x.addTextChangedListener(new w(this, editText));
        if (this.F0 == null) {
            this.F0 = this.f5767x.getHintTextColors();
        }
        if (this.f5743c0) {
            if (TextUtils.isEmpty(this.f5745d0)) {
                CharSequence hint = this.f5767x.getHint();
                this.f5769y = hint;
                setHint(hint);
                this.f5767x.setHint((CharSequence) null);
            }
            this.f5746e0 = true;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            r();
        }
        if (this.L != null) {
            p(this.f5767x.getText());
        }
        t();
        this.G.b();
        this.f5744d.bringToFront();
        m mVar = this.f5748g;
        mVar.bringToFront();
        Iterator it = this.B0.iterator();
        while (it.hasNext()) {
            ((je.l) it.next()).a(this);
        }
        mVar.m();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        w(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f5745d0)) {
            return;
        }
        this.f5745d0 = charSequence;
        xd.a aVar = this.S0;
        if (charSequence == null || !TextUtils.equals(aVar.B, charSequence)) {
            aVar.B = charSequence;
            aVar.C = null;
            aVar.j(false);
        }
        if (this.R0) {
            return;
        }
        l();
    }

    private void setPlaceholderTextEnabled(boolean z10) {
        if (this.P == z10) {
            return;
        }
        if (z10) {
            q0 q0Var = this.Q;
            if (q0Var != null) {
                this.f5740a.addView(q0Var);
                this.Q.setVisibility(0);
            }
        } else {
            q0 q0Var2 = this.Q;
            if (q0Var2 != null) {
                q0Var2.setVisibility(8);
            }
            this.Q = null;
        }
        this.P = z10;
    }

    public final void a() {
        if (this.f5767x == null || this.f5757o0 != 1) {
            return;
        }
        if (getHintMaxLines() != 1) {
            EditText editText = this.f5767x;
            editText.setPaddingRelative(editText.getPaddingStart(), (int) (this.S0.f() + this.f5760r), this.f5767x.getPaddingEnd(), getResources().getDimensionPixelSize(d.material_filled_edittext_font_1_3_padding_bottom));
        } else if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
            EditText editText2 = this.f5767x;
            editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(d.material_filled_edittext_font_2_0_padding_top), this.f5767x.getPaddingEnd(), getResources().getDimensionPixelSize(d.material_filled_edittext_font_2_0_padding_bottom));
        } else if (xu.l.F(getContext())) {
            EditText editText3 = this.f5767x;
            editText3.setPaddingRelative(editText3.getPaddingStart(), getResources().getDimensionPixelSize(d.material_filled_edittext_font_1_3_padding_top), this.f5767x.getPaddingEnd(), getResources().getDimensionPixelSize(d.material_filled_edittext_font_1_3_padding_bottom));
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) throws Resources.NotFoundException {
        if (!(view instanceof EditText)) {
            super.addView(view, i10, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f5740a;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        v();
        setEditText((EditText) view);
    }

    public final void b(float f10) {
        xd.a aVar = this.S0;
        if (aVar.f25242b == f10) {
            return;
        }
        if (this.V0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.V0 = valueAnimator;
            valueAnimator.setInterpolator(f0.V(getContext(), b.motionEasingEmphasizedInterpolator, fd.a.f8823b));
            this.V0.setDuration(f0.U(getContext(), b.motionDurationMedium4, 167));
            this.V0.addUpdateListener(new bq.f(3, this));
        }
        this.V0.setFloatValues(aVar.f25242b, f10);
        this.V0.start();
    }

    public final void c() {
        int i10;
        int i11;
        i iVar = this.f5747f0;
        if (iVar == null) {
            return;
        }
        l lVar = iVar.f8117d.f8097a;
        l lVar2 = this.f5754l0;
        if (lVar != lVar2) {
            iVar.setShapeAppearanceModel(lVar2);
        }
        if (this.f5757o0 == 2 && (i10 = this.f5759q0) > -1 && (i11 = this.f5763t0) != 0) {
            i iVar2 = this.f5747f0;
            iVar2.f8117d.k = i10;
            iVar2.invalidateSelf();
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(i11);
            ee.g gVar = iVar2.f8117d;
            if (gVar.f8101e != colorStateListValueOf) {
                gVar.f8101e = colorStateListValueOf;
                iVar2.onStateChange(iVar2.getState());
            }
        }
        int iB = this.f5764u0;
        if (this.f5757o0 == 1) {
            iB = k3.c.b(this.f5764u0, io.sentry.config.a.U(getContext(), b.colorSurface, 0));
        }
        this.f5764u0 = iB;
        this.f5747f0.q(ColorStateList.valueOf(iB));
        i iVar3 = this.f5752j0;
        if (iVar3 != null && this.f5753k0 != null) {
            if (this.f5759q0 > -1 && this.f5763t0 != 0) {
                iVar3.q(this.f5767x.isFocused() ? ColorStateList.valueOf(this.H0) : ColorStateList.valueOf(this.f5763t0));
                this.f5753k0.q(ColorStateList.valueOf(this.f5763t0));
            }
            invalidate();
        }
        u();
    }

    public final Rect d(Rect rect) {
        if (this.f5767x == null) {
            throw new IllegalStateException();
        }
        boolean z10 = getLayoutDirection() == 1;
        int i10 = rect.bottom;
        Rect rect2 = this.f5766w0;
        rect2.bottom = i10;
        int i11 = this.f5757o0;
        if (i11 == 1) {
            rect2.left = i(rect.left, z10);
            rect2.top = rect.top + this.f5758p0;
            rect2.right = j(rect.right, z10);
            return rect2;
        }
        if (i11 != 2) {
            rect2.left = i(rect.left, z10);
            rect2.top = getPaddingTop();
            rect2.right = j(rect.right, z10);
            return rect2;
        }
        rect2.left = this.f5767x.getPaddingLeft() + rect.left;
        rect2.top = rect.top - e();
        rect2.right = rect.right - this.f5767x.getPaddingRight();
        return rect2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i10) {
        EditText editText = this.f5767x;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i10);
            return;
        }
        if (this.f5769y != null) {
            boolean z10 = this.f5746e0;
            this.f5746e0 = false;
            CharSequence hint = editText.getHint();
            this.f5767x.setHint(this.f5769y);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i10);
                return;
            } finally {
                this.f5767x.setHint(hint);
                this.f5746e0 = z10;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i10);
        onProvideAutofillVirtualStructure(viewStructure, i10);
        FrameLayout frameLayout = this.f5740a;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i11 = 0; i11 < frameLayout.getChildCount(); i11++) {
            View childAt = frameLayout.getChildAt(i11);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i11);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i10);
            if (childAt == this.f5767x) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.X0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.X0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        i iVar;
        Canvas canvas2 = canvas;
        super.draw(canvas);
        boolean z10 = this.f5743c0;
        xd.a aVar = this.S0;
        if (z10) {
            TextPaint textPaint = aVar.O;
            RectF rectF = aVar.f25248e;
            int iSave = canvas2.save();
            if (aVar.C != null && rectF.width() > 0.0f && rectF.height() > 0.0f) {
                textPaint.setTextSize(aVar.G);
                float f10 = aVar.f25265q;
                float f11 = aVar.f25266r;
                float f12 = aVar.F;
                if (f12 != 1.0f) {
                    canvas2.scale(f12, f12, f10, f11);
                }
                if ((aVar.f25249e0 > 1 || aVar.f25251f0 > 1) && !aVar.D && aVar.o()) {
                    float lineStart = aVar.f25265q - aVar.Z.getLineStart(0);
                    int alpha = textPaint.getAlpha();
                    canvas2.translate(lineStart, f11);
                    float f13 = alpha;
                    textPaint.setAlpha((int) (aVar.f25245c0 * f13));
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 31) {
                        float f14 = aVar.H;
                        float f15 = aVar.I;
                        float f16 = aVar.J;
                        int i11 = aVar.K;
                        textPaint.setShadowLayer(f14, f15, f16, k3.c.d(i11, (textPaint.getAlpha() * Color.alpha(i11)) / 255));
                    }
                    aVar.Z.draw(canvas2);
                    textPaint.setAlpha((int) (aVar.f25243b0 * f13));
                    if (i10 >= 31) {
                        float f17 = aVar.H;
                        float f18 = aVar.I;
                        float f19 = aVar.J;
                        int i12 = aVar.K;
                        textPaint.setShadowLayer(f17, f18, f19, k3.c.d(i12, (Color.alpha(i12) * textPaint.getAlpha()) / 255));
                    }
                    int lineBaseline = aVar.Z.getLineBaseline(0);
                    CharSequence charSequence = aVar.f25247d0;
                    float f20 = lineBaseline;
                    canvas2.drawText(charSequence, 0, charSequence.length(), 0.0f, f20, textPaint);
                    if (i10 >= 31) {
                        textPaint.setShadowLayer(aVar.H, aVar.I, aVar.J, aVar.K);
                    }
                    String strTrim = aVar.f25247d0.toString().trim();
                    if (strTrim.endsWith("…")) {
                        strTrim = strTrim.substring(0, strTrim.length() - 1);
                    }
                    String str = strTrim;
                    textPaint.setAlpha(alpha);
                    canvas2 = canvas;
                    canvas2.drawText(str, 0, Math.min(aVar.Z.getLineEnd(0), str.length()), 0.0f, f20, (Paint) textPaint);
                } else {
                    canvas2.translate(f10, f11);
                    aVar.Z.draw(canvas2);
                }
                canvas2.restoreToCount(iSave);
            }
        }
        if (this.f5753k0 == null || (iVar = this.f5752j0) == null) {
            return;
        }
        iVar.draw(canvas2);
        if (this.f5767x.isFocused()) {
            Rect bounds = this.f5753k0.getBounds();
            Rect bounds2 = this.f5752j0.getBounds();
            float f21 = aVar.f25242b;
            int iCenterX = bounds2.centerX();
            bounds.left = fd.a.c(iCenterX, f21, bounds2.left);
            bounds.right = fd.a.c(iCenterX, f21, bounds2.right);
            this.f5753k0.draw(canvas2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void drawableStateChanged() throws android.content.res.Resources.NotFoundException {
        /*
            r4 = this;
            boolean r0 = r4.W0
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r4.W0 = r0
            super.drawableStateChanged()
            int[] r1 = r4.getDrawableState()
            r2 = 0
            xd.a r3 = r4.S0
            if (r3 == 0) goto L2f
            r3.M = r1
            android.content.res.ColorStateList r1 = r3.k
            if (r1 == 0) goto L20
            boolean r1 = r1.isStateful()
            if (r1 != 0) goto L2a
        L20:
            android.content.res.ColorStateList r1 = r3.j
            if (r1 == 0) goto L2f
            boolean r1 = r1.isStateful()
            if (r1 == 0) goto L2f
        L2a:
            r3.j(r2)
            r1 = r0
            goto L30
        L2f:
            r1 = r2
        L30:
            android.widget.EditText r3 = r4.f5767x
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
            r4.W0 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.drawableStateChanged():void");
    }

    public final int e() {
        if (this.f5743c0) {
            int i10 = this.f5757o0;
            xd.a aVar = this.S0;
            if (i10 == 0) {
                return (int) aVar.f();
            }
            if (i10 == 2) {
                if (getHintMaxLines() == 1) {
                    return (int) (aVar.f() / 2.0f);
                }
                float f10 = aVar.f();
                TextPaint textPaint = aVar.P;
                textPaint.setTextSize(aVar.f25256i);
                textPaint.setTypeface(aVar.f25267s);
                textPaint.setLetterSpacing(aVar.W);
                return Math.max(0, (int) (f10 - ((-textPaint.ascent()) / 2.0f)));
            }
        }
        return 0;
    }

    public final g f() {
        g gVar = new g();
        gVar.f22514g = f0.U(getContext(), b.motionDurationShort2, 87);
        gVar.f22515r = f0.V(getContext(), b.motionEasingLinearInterpolator, fd.a.f8822a);
        return gVar;
    }

    public final boolean g() {
        return this.f5743c0 && !TextUtils.isEmpty(this.f5745d0) && (this.f5747f0 instanceof je.f);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f5767x;
        if (editText == null) {
            return super.getBaseline();
        }
        return e() + getPaddingTop() + editText.getBaseline();
    }

    public i getBoxBackground() {
        int i10 = this.f5757o0;
        if (i10 == 1 || i10 == 2) {
            return this.f5747f0;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f5764u0;
    }

    public int getBoxBackgroundMode() {
        return this.f5757o0;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f5758p0;
    }

    public float getBoxCornerRadiusBottomEnd() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.f5768x0;
        return layoutDirection == 1 ? this.f5754l0.f8131h.a(rectF) : this.f5754l0.f8130g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.f5768x0;
        return layoutDirection == 1 ? this.f5754l0.f8130g.a(rectF) : this.f5754l0.f8131h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.f5768x0;
        return layoutDirection == 1 ? this.f5754l0.f8128e.a(rectF) : this.f5754l0.f8129f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.f5768x0;
        return layoutDirection == 1 ? this.f5754l0.f8129f.a(rectF) : this.f5754l0.f8128e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.J0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.K0;
    }

    public int getBoxStrokeWidth() {
        return this.f5761r0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f5762s0;
    }

    public int getCounterMaxLength() {
        return this.I;
    }

    public CharSequence getCounterOverflowDescription() {
        q0 q0Var;
        if (this.H && this.J && (q0Var = this.L) != null) {
            return q0Var.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.W;
    }

    public ColorStateList getCounterTextColor() {
        return this.V;
    }

    public ColorStateList getCursorColor() {
        return this.f5741a0;
    }

    public ColorStateList getCursorErrorColor() {
        return this.f5742b0;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.F0;
    }

    public EditText getEditText() {
        return this.f5767x;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f5748g.B.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f5748g.B.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f5748g.I;
    }

    public int getEndIconMode() {
        return this.f5748g.E;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f5748g.J;
    }

    public CheckableImageButton getEndIconView() {
        return this.f5748g.B;
    }

    public CharSequence getError() {
        q qVar = this.G;
        if (qVar.f13672q) {
            return qVar.f13671p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.G.f13675t;
    }

    public CharSequence getErrorContentDescription() {
        return this.G.f13674s;
    }

    public int getErrorCurrentTextColors() {
        q0 q0Var = this.G.f13673r;
        if (q0Var != null) {
            return q0Var.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f5748g.f13644g.getDrawable();
    }

    public CharSequence getHelperText() {
        q qVar = this.G;
        if (qVar.f13679x) {
            return qVar.f13678w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        q0 q0Var = this.G.f13680y;
        if (q0Var != null) {
            return q0Var.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.f5743c0) {
            return this.f5745d0;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.S0.f();
    }

    public final int getHintCurrentCollapsedTextColor() {
        xd.a aVar = this.S0;
        return aVar.g(aVar.k);
    }

    public int getHintMaxLines() {
        return this.S0.f25249e0;
    }

    public ColorStateList getHintTextColor() {
        return this.G0;
    }

    public y getLengthCounter() {
        return this.K;
    }

    public int getMaxEms() {
        return this.D;
    }

    public int getMaxWidth() {
        return this.F;
    }

    public int getMinEms() {
        return this.B;
    }

    public int getMinWidth() {
        return this.E;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f5748g.B.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f5748g.B.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.P) {
            return this.O;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.S;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.R;
    }

    public CharSequence getPrefixText() {
        return this.f5744d.f13694g;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f5744d.f13693d.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f5744d.f13693d;
    }

    public l getShapeAppearanceModel() {
        return this.f5754l0;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f5744d.f13695r.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f5744d.f13695r.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f5744d.B;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f5744d.D;
    }

    public CharSequence getSuffixText() {
        return this.f5748g.L;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f5748g.M.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f5748g.M;
    }

    public Typeface getTypeface() {
        return this.f5770y0;
    }

    public final i h(boolean z10) throws Resources.NotFoundException {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(d.mtrl_shape_corner_size_small_component);
        float f10 = z10 ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f5767x;
        float popupElevation = editText instanceof t ? ((t) editText).getPopupElevation() : getResources().getDimensionPixelOffset(d.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(d.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        ee.k kVar = new ee.k();
        ee.k kVar2 = new ee.k();
        ee.k kVar3 = new ee.k();
        ee.k kVar4 = new ee.k();
        int i10 = 0;
        ee.f fVar = new ee.f(i10);
        ee.f fVar2 = new ee.f(i10);
        ee.f fVar3 = new ee.f(i10);
        ee.f fVar4 = new ee.f(i10);
        ee.a aVar = new ee.a(f10);
        ee.a aVar2 = new ee.a(f10);
        ee.a aVar3 = new ee.a(dimensionPixelOffset);
        ee.a aVar4 = new ee.a(dimensionPixelOffset);
        l lVar = new l();
        lVar.f8124a = kVar;
        lVar.f8125b = kVar2;
        lVar.f8126c = kVar3;
        lVar.f8127d = kVar4;
        lVar.f8128e = aVar;
        lVar.f8129f = aVar2;
        lVar.f8130g = aVar4;
        lVar.f8131h = aVar3;
        lVar.f8132i = fVar;
        lVar.j = fVar2;
        lVar.k = fVar3;
        lVar.f8133l = fVar4;
        EditText editText2 = this.f5767x;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof t ? ((t) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = i.f8113b0;
            TypedValue typedValueE0 = xu.d.e0(b.colorSurface, context, i.class.getSimpleName());
            int i11 = typedValueE0.resourceId;
            dropDownBackgroundTintList = ColorStateList.valueOf(i11 != 0 ? context.getColor(i11) : typedValueE0.data);
        }
        i iVar = new i();
        iVar.m(context);
        iVar.q(dropDownBackgroundTintList);
        iVar.p(popupElevation);
        iVar.setShapeAppearanceModel(lVar);
        ee.g gVar = iVar.f8117d;
        if (gVar.f8104h == null) {
            gVar.f8104h = new Rect();
        }
        iVar.f8117d.f8104h.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        iVar.invalidateSelf();
        return iVar;
    }

    public final int i(int i10, boolean z10) {
        return ((z10 || getPrefixText() == null) ? (!z10 || getSuffixText() == null) ? this.f5767x.getCompoundPaddingLeft() : this.f5748g.c() : this.f5744d.a()) + i10;
    }

    public final int j(int i10, boolean z10) {
        return i10 - ((z10 || getSuffixText() == null) ? (!z10 || getPrefixText() == null) ? this.f5767x.getCompoundPaddingRight() : this.f5744d.a() : this.f5748g.c());
    }

    public final void k() throws Resources.NotFoundException {
        int i10 = this.f5757o0;
        if (i10 == 0) {
            this.f5747f0 = null;
            this.f5752j0 = null;
            this.f5753k0 = null;
        } else if (i10 == 1) {
            this.f5747f0 = new i(this.f5754l0);
            this.f5752j0 = new i();
            this.f5753k0 = new i();
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException(h0.b.i(this.f5757o0, " is illegal; only @BoxBackgroundMode constants are supported.", new StringBuilder()));
            }
            if (!this.f5743c0 || (this.f5747f0 instanceof je.f)) {
                this.f5747f0 = new i(this.f5754l0);
            } else {
                l lVar = this.f5754l0;
                int i11 = je.f.f13621e0;
                if (lVar == null) {
                    lVar = new l();
                }
                e eVar = new e(lVar, new RectF());
                je.f fVar = new je.f(eVar);
                fVar.f13622d0 = eVar;
                this.f5747f0 = fVar;
            }
            this.f5752j0 = null;
            this.f5753k0 = null;
        }
        u();
        z();
        if (this.f5757o0 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.f5758p0 = getResources().getDimensionPixelSize(d.material_font_2_0_box_collapsed_padding_top);
            } else if (xu.l.F(getContext())) {
                this.f5758p0 = getResources().getDimensionPixelSize(d.material_font_1_3_box_collapsed_padding_top);
            }
        }
        a();
        if (this.f5757o0 != 0) {
            v();
        }
        EditText editText = this.f5767x;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i12 = this.f5757o0;
                if (i12 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i12 == 1) {
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

    public final void n(q0 q0Var, int i10) {
        try {
            q0Var.setTextAppearance(i10);
            if (q0Var.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        q0Var.setTextAppearance(h.i.TextAppearance_AppCompat_Caption);
        q0Var.setTextColor(getContext().getColor(ed.c.design_error));
    }

    public final boolean o() {
        q qVar = this.G;
        return (qVar.f13670o != 1 || qVar.f13673r == null || TextUtils.isEmpty(qVar.f13671p)) ? false : true;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.S0.i(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int iMax;
        m mVar = this.f5748g;
        mVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z10 = false;
        this.Y0 = false;
        if (this.f5767x != null && this.f5767x.getMeasuredHeight() < (iMax = Math.max(mVar.getMeasuredHeight(), this.f5744d.getMeasuredHeight()))) {
            this.f5767x.setMinimumHeight(iMax);
            z10 = true;
        }
        boolean zS = s();
        if (z10 || zS) {
            this.f5767x.post(new o(4, this));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        float fDescent;
        int i14;
        int compoundPaddingTop;
        super.onLayout(z10, i10, i11, i12, i13);
        EditText editText = this.f5767x;
        if (editText != null) {
            Rect rect = this.f5765v0;
            xd.b.a(this, editText, rect);
            i iVar = this.f5752j0;
            if (iVar != null) {
                int i15 = rect.bottom;
                iVar.setBounds(rect.left, i15 - this.f5761r0, rect.right, i15);
            }
            i iVar2 = this.f5753k0;
            if (iVar2 != null) {
                int i16 = rect.bottom;
                iVar2.setBounds(rect.left, i16 - this.f5762s0, rect.right, i16);
            }
            if (this.f5743c0) {
                float textSize = this.f5767x.getTextSize();
                xd.a aVar = this.S0;
                float f10 = aVar.f25254h;
                TextPaint textPaint = aVar.P;
                if (f10 != textSize) {
                    aVar.f25254h = textSize;
                    aVar.j(false);
                }
                int gravity = this.f5767x.getGravity();
                int i17 = (gravity & (-113)) | 48;
                if (aVar.f25252g != i17) {
                    aVar.f25252g = i17;
                    aVar.j(false);
                }
                if (aVar.f25250f != gravity) {
                    aVar.f25250f = gravity;
                    aVar.j(false);
                }
                Rect rectD = d(rect);
                int i18 = rectD.left;
                int i19 = rectD.top;
                int i20 = rectD.right;
                int i21 = rectD.bottom;
                Rect rect2 = aVar.f25246d;
                if (rect2.left != i18 || rect2.top != i19 || rect2.right != i20 || rect2.bottom != i21) {
                    rect2.set(i18, i19, i20, i21);
                    aVar.N = true;
                }
                if (this.f5767x == null) {
                    throw new IllegalStateException();
                }
                if (getHintMaxLines() == 1) {
                    textPaint.setTextSize(aVar.f25254h);
                    textPaint.setTypeface(aVar.f25270v);
                    textPaint.setLetterSpacing(aVar.X);
                    fDescent = -textPaint.ascent();
                } else {
                    textPaint.setTextSize(aVar.f25254h);
                    textPaint.setTypeface(aVar.f25270v);
                    textPaint.setLetterSpacing(aVar.X);
                    fDescent = aVar.f25260l * (textPaint.descent() + (-textPaint.ascent()));
                }
                int compoundPaddingLeft = this.f5767x.getCompoundPaddingLeft() + rect.left;
                Rect rect3 = this.f5766w0;
                rect3.left = compoundPaddingLeft;
                if (this.f5757o0 != 1 || this.f5767x.getMinLines() > 1) {
                    if (this.f5757o0 != 0 || getHintMaxLines() == 1) {
                        i14 = 0;
                    } else {
                        textPaint.setTextSize(aVar.f25254h);
                        textPaint.setTypeface(aVar.f25270v);
                        textPaint.setLetterSpacing(aVar.X);
                        i14 = (int) ((-textPaint.ascent()) / 2.0f);
                    }
                    compoundPaddingTop = (this.f5767x.getCompoundPaddingTop() + rect.top) - i14;
                } else {
                    compoundPaddingTop = (int) (rect.centerY() - (fDescent / 2.0f));
                }
                rect3.top = compoundPaddingTop;
                rect3.right = rect.right - this.f5767x.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.f5757o0 != 1 || this.f5767x.getMinLines() > 1) ? rect.bottom - this.f5767x.getCompoundPaddingBottom() : (int) (rect3.top + fDescent);
                rect3.bottom = compoundPaddingBottom;
                int i22 = rect3.left;
                int i23 = rect3.top;
                int i24 = rect3.right;
                Rect rect4 = aVar.f25244c;
                if (rect4.left != i22 || rect4.top != i23 || rect4.right != i24 || rect4.bottom != compoundPaddingBottom || true != aVar.f25259k0) {
                    rect4.set(i22, i23, i24, compoundPaddingBottom);
                    aVar.N = true;
                    aVar.f25259k0 = true;
                }
                aVar.j(false);
                if (!g() || this.R0) {
                    return;
                }
                l();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        float f10;
        EditText editText;
        super.onMeasure(i10, i11);
        boolean z10 = this.Y0;
        m mVar = this.f5748g;
        if (!z10) {
            mVar.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.Y0 = true;
        }
        if (this.Q != null && (editText = this.f5767x) != null) {
            this.Q.setGravity(editText.getGravity());
            this.Q.setPadding(this.f5767x.getCompoundPaddingLeft(), this.f5767x.getCompoundPaddingTop(), this.f5767x.getCompoundPaddingRight(), this.f5767x.getCompoundPaddingBottom());
        }
        mVar.m();
        if (getHintMaxLines() == 1) {
            return;
        }
        int measuredWidth = (this.f5767x.getMeasuredWidth() - this.f5767x.getCompoundPaddingLeft()) - this.f5767x.getCompoundPaddingRight();
        xd.a aVar = this.S0;
        TextPaint textPaint = aVar.P;
        textPaint.setTextSize(aVar.f25256i);
        textPaint.setTypeface(aVar.f25267s);
        textPaint.setLetterSpacing(aVar.W);
        float f11 = measuredWidth;
        aVar.f25257i0 = aVar.e(aVar.f25251f0, textPaint, aVar.B, (aVar.f25256i / aVar.f25254h) * f11, aVar.D).getHeight();
        textPaint.setTextSize(aVar.f25254h);
        textPaint.setTypeface(aVar.f25270v);
        textPaint.setLetterSpacing(aVar.X);
        aVar.f25258j0 = aVar.e(aVar.f25249e0, textPaint, aVar.B, f11, aVar.D).getHeight();
        EditText editText2 = this.f5767x;
        Rect rect = this.f5765v0;
        xd.b.a(this, editText2, rect);
        Rect rectD = d(rect);
        int i12 = rectD.left;
        int i13 = rectD.top;
        int i14 = rectD.right;
        int i15 = rectD.bottom;
        Rect rect2 = aVar.f25246d;
        if (rect2.left != i12 || rect2.top != i13 || rect2.right != i14 || rect2.bottom != i15) {
            rect2.set(i12, i13, i14, i15);
            aVar.N = true;
        }
        v();
        a();
        if (this.f5767x == null) {
            return;
        }
        int i16 = aVar.f25258j0;
        if (i16 != -1) {
            f10 = i16;
        } else {
            TextPaint textPaint2 = aVar.P;
            textPaint2.setTextSize(aVar.f25254h);
            textPaint2.setTypeface(aVar.f25270v);
            textPaint2.setLetterSpacing(aVar.X);
            f10 = -textPaint2.ascent();
        }
        if (this.O != null) {
            TextPaint textPaint3 = new TextPaint(129);
            textPaint3.set(this.Q.getPaint());
            textPaint3.setTextSize(this.Q.getTextSize());
            textPaint3.setTypeface(this.Q.getTypeface());
            textPaint3.setLetterSpacing(this.Q.getLetterSpacing());
            xd.f fVar = new xd.f(this.O, textPaint3, measuredWidth);
            fVar.k = getLayoutDirection() == 1;
            fVar.j = true;
            float lineSpacingExtra = this.Q.getLineSpacingExtra();
            float lineSpacingMultiplier = this.Q.getLineSpacingMultiplier();
            fVar.f25283g = lineSpacingExtra;
            fVar.f25284h = lineSpacingMultiplier;
            fVar.f25287m = new io.sentry.android.replay.capture.e(7, this);
            f = (this.f5757o0 == 1 ? aVar.f() + this.f5758p0 + this.f5760r : 0.0f) + fVar.a().getHeight();
        }
        float fMax = Math.max(f10, f);
        if (this.f5767x.getMeasuredHeight() < fMax) {
            this.f5767x.setMinimumHeight(Math.round(fMax));
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) throws Resources.NotFoundException {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f1243a);
        setError(savedState.f5772g);
        if (savedState.f5773r) {
            post(new b4.e(19, this));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        boolean z10 = i10 == 1;
        if (z10 != this.f5755m0) {
            ee.d dVar = this.f5754l0.f8128e;
            RectF rectF = this.f5768x0;
            float fA = dVar.a(rectF);
            float fA2 = this.f5754l0.f8129f.a(rectF);
            float fA3 = this.f5754l0.f8131h.a(rectF);
            float fA4 = this.f5754l0.f8130g.a(rectF);
            l lVar = this.f5754l0;
            t1 t1Var = lVar.f8124a;
            t1 t1Var2 = lVar.f8125b;
            t1 t1Var3 = lVar.f8127d;
            t1 t1Var4 = lVar.f8126c;
            ee.f fVar = new ee.f(0);
            ee.f fVar2 = new ee.f(0);
            ee.f fVar3 = new ee.f(0);
            ee.f fVar4 = new ee.f(0);
            ee.a aVar = new ee.a(fA2);
            ee.a aVar2 = new ee.a(fA);
            ee.a aVar3 = new ee.a(fA4);
            ee.a aVar4 = new ee.a(fA3);
            l lVar2 = new l();
            lVar2.f8124a = t1Var2;
            lVar2.f8125b = t1Var;
            lVar2.f8126c = t1Var3;
            lVar2.f8127d = t1Var4;
            lVar2.f8128e = aVar;
            lVar2.f8129f = aVar2;
            lVar2.f8130g = aVar4;
            lVar2.f8131h = aVar3;
            lVar2.f8132i = fVar;
            lVar2.j = fVar2;
            lVar2.k = fVar3;
            lVar2.f8133l = fVar4;
            this.f5755m0 = z10;
            setShapeAppearanceModel(lVar2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (o()) {
            savedState.f5772g = getError();
        }
        m mVar = this.f5748g;
        savedState.f5773r = mVar.E != 0 && mVar.B.f5657r;
        return savedState;
    }

    public final void p(Editable editable) throws Resources.NotFoundException {
        ((u0) this.K).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z10 = this.J;
        int i10 = this.I;
        if (i10 == -1) {
            this.L.setText(String.valueOf(length));
            this.L.setContentDescription(null);
            this.J = false;
        } else {
            this.J = length > i10;
            Context context = getContext();
            this.L.setContentDescription(context.getString(this.J ? j.character_counter_overflowed_content_description : j.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.I)));
            if (z10 != this.J) {
                q();
            }
            String str = s3.b.f21858b;
            s3.b bVar = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? s3.b.f21861e : s3.b.f21860d;
            q0 q0Var = this.L;
            String string = getContext().getString(j.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.I));
            bVar.getClass();
            ab.g gVar = s3.g.f21868a;
            q0Var.setText(string != null ? bVar.c(string).toString() : null);
        }
        if (this.f5767x == null || z10 == this.J) {
            return;
        }
        w(false, false);
        z();
        t();
    }

    public final void q() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        q0 q0Var = this.L;
        if (q0Var != null) {
            n(q0Var, this.J ? this.M : this.N);
            if (!this.J && (colorStateList2 = this.V) != null) {
                this.L.setTextColor(colorStateList2);
            }
            if (!this.J || (colorStateList = this.W) == null) {
                return;
            }
            this.L.setTextColor(colorStateList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r() throws android.content.res.Resources.NotFoundException {
        /*
            r4 = this;
            android.content.res.ColorStateList r0 = r4.f5741a0
            if (r0 == 0) goto L5
            goto L25
        L5:
            android.content.Context r0 = r4.getContext()
            int r1 = h.a.colorControlActivated
            android.util.TypedValue r1 = xu.d.c0(r0, r1)
            r2 = 0
            if (r1 != 0) goto L14
        L12:
            r0 = r2
            goto L25
        L14:
            int r3 = r1.resourceId
            if (r3 == 0) goto L1d
            android.content.res.ColorStateList r0 = h3.c.c(r0, r3)
            goto L25
        L1d:
            int r0 = r1.data
            if (r0 == 0) goto L12
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
        L25:
            android.widget.EditText r1 = r4.f5767x
            if (r1 == 0) goto L50
            android.graphics.drawable.Drawable r1 = j1.g.b(r1)
            if (r1 != 0) goto L30
            goto L50
        L30:
            android.widget.EditText r1 = r4.f5767x
            android.graphics.drawable.Drawable r1 = j1.g.b(r1)
            android.graphics.drawable.Drawable r1 = r1.mutate()
            boolean r2 = r4.o()
            if (r2 != 0) goto L48
            p.q0 r2 = r4.L
            if (r2 == 0) goto L4d
            boolean r2 = r4.J
            if (r2 == 0) goto L4d
        L48:
            android.content.res.ColorStateList r2 = r4.f5742b0
            if (r2 == 0) goto L4d
            r0 = r2
        L4d:
            r1.setTintList(r0)
        L50:
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

    public void setBoxBackgroundColor(int i10) {
        if (this.f5764u0 != i10) {
            this.f5764u0 = i10;
            this.L0 = i10;
            this.N0 = i10;
            this.O0 = i10;
            c();
        }
    }

    public void setBoxBackgroundColorResource(int i10) {
        setBoxBackgroundColor(getContext().getColor(i10));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.L0 = defaultColor;
        this.f5764u0 = defaultColor;
        this.M0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.N0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.O0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        c();
    }

    public void setBoxBackgroundMode(int i10) throws Resources.NotFoundException {
        if (i10 == this.f5757o0) {
            return;
        }
        this.f5757o0 = i10;
        if (this.f5767x != null) {
            k();
        }
    }

    public void setBoxCollapsedPaddingTop(int i10) {
        this.f5758p0 = i10;
    }

    public void setBoxCornerFamily(int i10) {
        f fVarG = this.f5754l0.g();
        ee.d dVar = this.f5754l0.f8128e;
        fVarG.f2803a = se.b.p(i10);
        fVarG.f2807e = dVar;
        ee.d dVar2 = this.f5754l0.f8129f;
        fVarG.f2804b = se.b.p(i10);
        fVarG.f2808f = dVar2;
        ee.d dVar3 = this.f5754l0.f8131h;
        fVarG.f2806d = se.b.p(i10);
        fVarG.f2810h = dVar3;
        ee.d dVar4 = this.f5754l0.f8130g;
        fVarG.f2805c = se.b.p(i10);
        fVarG.f2809g = dVar4;
        this.f5754l0 = fVarG.b();
        c();
    }

    public void setBoxStrokeColor(int i10) throws Resources.NotFoundException {
        if (this.J0 != i10) {
            this.J0 = i10;
            z();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) throws Resources.NotFoundException {
        if (colorStateList.isStateful()) {
            this.H0 = colorStateList.getDefaultColor();
            this.P0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.I0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.J0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.J0 != colorStateList.getDefaultColor()) {
            this.J0 = colorStateList.getDefaultColor();
        }
        z();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) throws Resources.NotFoundException {
        if (this.K0 != colorStateList) {
            this.K0 = colorStateList;
            z();
        }
    }

    public void setBoxStrokeWidth(int i10) throws Resources.NotFoundException {
        this.f5761r0 = i10;
        z();
    }

    public void setBoxStrokeWidthFocused(int i10) throws Resources.NotFoundException {
        this.f5762s0 = i10;
        z();
    }

    public void setBoxStrokeWidthFocusedResource(int i10) throws Resources.NotFoundException {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i10));
    }

    public void setBoxStrokeWidthResource(int i10) throws Resources.NotFoundException {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i10));
    }

    public void setCounterEnabled(boolean z10) throws Resources.NotFoundException {
        if (this.H != z10) {
            q qVar = this.G;
            if (z10) {
                q0 q0Var = new q0(getContext(), null);
                this.L = q0Var;
                q0Var.setId(ed.f.textinput_counter);
                Typeface typeface = this.f5770y0;
                if (typeface != null) {
                    this.L.setTypeface(typeface);
                }
                this.L.setMaxLines(1);
                qVar.a(this.L, 2);
                ((ViewGroup.MarginLayoutParams) this.L.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(d.mtrl_textinput_counter_margin_start));
                q();
                if (this.L != null) {
                    EditText editText = this.f5767x;
                    p(editText != null ? editText.getText() : null);
                }
            } else {
                qVar.g(this.L, 2);
                this.L = null;
            }
            this.H = z10;
        }
    }

    public void setCounterMaxLength(int i10) throws Resources.NotFoundException {
        if (this.I != i10) {
            if (i10 > 0) {
                this.I = i10;
            } else {
                this.I = -1;
            }
            if (!this.H || this.L == null) {
                return;
            }
            EditText editText = this.f5767x;
            p(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i10) {
        if (this.M != i10) {
            this.M = i10;
            q();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.W != colorStateList) {
            this.W = colorStateList;
            q();
        }
    }

    public void setCounterTextAppearance(int i10) {
        if (this.N != i10) {
            this.N = i10;
            q();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.V != colorStateList) {
            this.V = colorStateList;
            q();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) throws Resources.NotFoundException {
        if (this.f5741a0 != colorStateList) {
            this.f5741a0 = colorStateList;
            r();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) throws Resources.NotFoundException {
        if (this.f5742b0 != colorStateList) {
            this.f5742b0 = colorStateList;
            if (o() || (this.L != null && this.J)) {
                r();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.F0 = colorStateList;
        this.G0 = colorStateList;
        if (this.f5767x != null) {
            w(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        m(this, z10);
        super.setEnabled(z10);
    }

    public void setEndIconActivated(boolean z10) {
        this.f5748g.B.setActivated(z10);
    }

    public void setEndIconCheckable(boolean z10) {
        this.f5748g.B.setCheckable(z10);
    }

    public void setEndIconContentDescription(int i10) {
        m mVar = this.f5748g;
        CharSequence text = i10 != 0 ? mVar.getResources().getText(i10) : null;
        CheckableImageButton checkableImageButton = mVar.B;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i10) {
        m mVar = this.f5748g;
        Drawable drawableR = i10 != 0 ? ic.a.r(mVar.getContext(), i10) : null;
        TextInputLayout textInputLayout = mVar.f13642a;
        CheckableImageButton checkableImageButton = mVar.B;
        checkableImageButton.setImageDrawable(drawableR);
        if (drawableR != null) {
            vc.e.b(textInputLayout, checkableImageButton, mVar.G, mVar.H);
            vc.e.H(textInputLayout, checkableImageButton, mVar.G);
        }
    }

    public void setEndIconMinSize(int i10) {
        m mVar = this.f5748g;
        if (i10 < 0) {
            mVar.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i10 != mVar.I) {
            mVar.I = i10;
            CheckableImageButton checkableImageButton = mVar.B;
            checkableImageButton.setMinimumWidth(i10);
            checkableImageButton.setMinimumHeight(i10);
            CheckableImageButton checkableImageButton2 = mVar.f13644g;
            checkableImageButton2.setMinimumWidth(i10);
            checkableImageButton2.setMinimumHeight(i10);
        }
    }

    public void setEndIconMode(int i10) {
        this.f5748g.g(i10);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        m mVar = this.f5748g;
        CheckableImageButton checkableImageButton = mVar.B;
        View.OnLongClickListener onLongClickListener = mVar.K;
        checkableImageButton.setOnClickListener(onClickListener);
        vc.e.O(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        m mVar = this.f5748g;
        mVar.K = onLongClickListener;
        CheckableImageButton checkableImageButton = mVar.B;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        vc.e.O(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        m mVar = this.f5748g;
        mVar.J = scaleType;
        mVar.B.setScaleType(scaleType);
        mVar.f13644g.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        m mVar = this.f5748g;
        if (mVar.G != colorStateList) {
            mVar.G = colorStateList;
            vc.e.b(mVar.f13642a, mVar.B, colorStateList, mVar.H);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        m mVar = this.f5748g;
        if (mVar.H != mode) {
            mVar.H = mode;
            vc.e.b(mVar.f13642a, mVar.B, mVar.G, mode);
        }
    }

    public void setEndIconVisible(boolean z10) {
        this.f5748g.h(z10);
    }

    public void setError(CharSequence charSequence) throws Resources.NotFoundException {
        q qVar = this.G;
        if (!qVar.f13672q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            qVar.f();
            return;
        }
        qVar.c();
        qVar.f13671p = charSequence;
        qVar.f13673r.setText(charSequence);
        int i10 = qVar.f13669n;
        if (i10 != 1) {
            qVar.f13670o = 1;
        }
        qVar.i(i10, qVar.h(qVar.f13673r, charSequence), qVar.f13670o);
    }

    public void setErrorAccessibilityLiveRegion(int i10) {
        q qVar = this.G;
        qVar.f13675t = i10;
        q0 q0Var = qVar.f13673r;
        if (q0Var != null) {
            q0Var.setAccessibilityLiveRegion(i10);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        q qVar = this.G;
        qVar.f13674s = charSequence;
        q0 q0Var = qVar.f13673r;
        if (q0Var != null) {
            q0Var.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z10) throws Resources.NotFoundException {
        q qVar = this.G;
        TextInputLayout textInputLayout = qVar.f13665h;
        if (qVar.f13672q == z10) {
            return;
        }
        qVar.c();
        if (z10) {
            q0 q0Var = new q0(qVar.f13664g, null);
            qVar.f13673r = q0Var;
            q0Var.setId(ed.f.textinput_error);
            qVar.f13673r.setTextAlignment(5);
            Typeface typeface = qVar.B;
            if (typeface != null) {
                qVar.f13673r.setTypeface(typeface);
            }
            int i10 = qVar.f13676u;
            qVar.f13676u = i10;
            q0 q0Var2 = qVar.f13673r;
            if (q0Var2 != null) {
                qVar.f13665h.n(q0Var2, i10);
            }
            ColorStateList colorStateList = qVar.f13677v;
            qVar.f13677v = colorStateList;
            q0 q0Var3 = qVar.f13673r;
            if (q0Var3 != null && colorStateList != null) {
                q0Var3.setTextColor(colorStateList);
            }
            CharSequence charSequence = qVar.f13674s;
            qVar.f13674s = charSequence;
            q0 q0Var4 = qVar.f13673r;
            if (q0Var4 != null) {
                q0Var4.setContentDescription(charSequence);
            }
            int i11 = qVar.f13675t;
            qVar.f13675t = i11;
            q0 q0Var5 = qVar.f13673r;
            if (q0Var5 != null) {
                q0Var5.setAccessibilityLiveRegion(i11);
            }
            qVar.f13673r.setVisibility(4);
            qVar.a(qVar.f13673r, 0);
        } else {
            qVar.f();
            qVar.g(qVar.f13673r, 0);
            qVar.f13673r = null;
            textInputLayout.t();
            textInputLayout.z();
        }
        qVar.f13672q = z10;
    }

    public void setErrorIconDrawable(int i10) {
        m mVar = this.f5748g;
        mVar.i(i10 != 0 ? ic.a.r(mVar.getContext(), i10) : null);
        vc.e.H(mVar.f13642a, mVar.f13644g, mVar.f13645r);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        m mVar = this.f5748g;
        CheckableImageButton checkableImageButton = mVar.f13644g;
        View.OnLongClickListener onLongClickListener = mVar.f13647y;
        checkableImageButton.setOnClickListener(onClickListener);
        vc.e.O(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        m mVar = this.f5748g;
        mVar.f13647y = onLongClickListener;
        CheckableImageButton checkableImageButton = mVar.f13644g;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        vc.e.O(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        m mVar = this.f5748g;
        if (mVar.f13645r != colorStateList) {
            mVar.f13645r = colorStateList;
            vc.e.b(mVar.f13642a, mVar.f13644g, colorStateList, mVar.f13646x);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        m mVar = this.f5748g;
        if (mVar.f13646x != mode) {
            mVar.f13646x = mode;
            vc.e.b(mVar.f13642a, mVar.f13644g, mVar.f13645r, mode);
        }
    }

    public void setErrorTextAppearance(int i10) {
        q qVar = this.G;
        qVar.f13676u = i10;
        q0 q0Var = qVar.f13673r;
        if (q0Var != null) {
            qVar.f13665h.n(q0Var, i10);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        q qVar = this.G;
        qVar.f13677v = colorStateList;
        q0 q0Var = qVar.f13673r;
        if (q0Var == null || colorStateList == null) {
            return;
        }
        q0Var.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z10) {
        if (this.T0 != z10) {
            this.T0 = z10;
            w(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) throws Resources.NotFoundException {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        q qVar = this.G;
        if (zIsEmpty) {
            if (qVar.f13679x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!qVar.f13679x) {
            setHelperTextEnabled(true);
        }
        qVar.c();
        qVar.f13678w = charSequence;
        qVar.f13680y.setText(charSequence);
        int i10 = qVar.f13669n;
        if (i10 != 2) {
            qVar.f13670o = 2;
        }
        qVar.i(i10, qVar.h(qVar.f13680y, charSequence), qVar.f13670o);
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        q qVar = this.G;
        qVar.A = colorStateList;
        q0 q0Var = qVar.f13680y;
        if (q0Var == null || colorStateList == null) {
            return;
        }
        q0Var.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z10) throws Resources.NotFoundException {
        q qVar = this.G;
        TextInputLayout textInputLayout = qVar.f13665h;
        if (qVar.f13679x == z10) {
            return;
        }
        qVar.c();
        if (z10) {
            q0 q0Var = new q0(qVar.f13664g, null);
            qVar.f13680y = q0Var;
            q0Var.setId(ed.f.textinput_helper_text);
            qVar.f13680y.setTextAlignment(5);
            Typeface typeface = qVar.B;
            if (typeface != null) {
                qVar.f13680y.setTypeface(typeface);
            }
            qVar.f13680y.setVisibility(4);
            qVar.f13680y.setAccessibilityLiveRegion(1);
            int i10 = qVar.f13681z;
            qVar.f13681z = i10;
            q0 q0Var2 = qVar.f13680y;
            if (q0Var2 != null) {
                q0Var2.setTextAppearance(i10);
            }
            ColorStateList colorStateList = qVar.A;
            qVar.A = colorStateList;
            q0 q0Var3 = qVar.f13680y;
            if (q0Var3 != null && colorStateList != null) {
                q0Var3.setTextColor(colorStateList);
            }
            qVar.a(qVar.f13680y, 1);
            qVar.f13680y.setAccessibilityDelegate(new p(qVar));
        } else {
            qVar.c();
            int i11 = qVar.f13669n;
            if (i11 == 2) {
                qVar.f13670o = 0;
            }
            qVar.i(i11, qVar.h(qVar.f13680y, ""), qVar.f13670o);
            qVar.g(qVar.f13680y, 1);
            qVar.f13680y = null;
            textInputLayout.t();
            textInputLayout.z();
        }
        qVar.f13679x = z10;
    }

    public void setHelperTextTextAppearance(int i10) {
        q qVar = this.G;
        qVar.f13681z = i10;
        q0 q0Var = qVar.f13680y;
        if (q0Var != null) {
            q0Var.setTextAppearance(i10);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.f5743c0) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z10) {
        this.U0 = z10;
    }

    public void setHintEnabled(boolean z10) {
        if (z10 != this.f5743c0) {
            this.f5743c0 = z10;
            if (z10) {
                CharSequence hint = this.f5767x.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f5745d0)) {
                        setHint(hint);
                    }
                    this.f5767x.setHint((CharSequence) null);
                }
                this.f5746e0 = true;
            } else {
                this.f5746e0 = false;
                if (!TextUtils.isEmpty(this.f5745d0) && TextUtils.isEmpty(this.f5767x.getHint())) {
                    this.f5767x.setHint(this.f5745d0);
                }
                setHintInternal(null);
            }
            if (this.f5767x != null) {
                v();
            }
        }
    }

    public void setHintMaxLines(int i10) {
        xd.a aVar = this.S0;
        if (i10 != aVar.f25251f0) {
            aVar.f25251f0 = i10;
            aVar.j(false);
        }
        if (i10 != aVar.f25249e0) {
            aVar.f25249e0 = i10;
            aVar.j(false);
        }
        requestLayout();
    }

    public void setHintTextAppearance(int i10) {
        xd.a aVar = this.S0;
        TextInputLayout textInputLayout = aVar.f25240a;
        be.d dVar = new be.d(textInputLayout.getContext(), i10);
        ColorStateList colorStateList = dVar.k;
        if (colorStateList != null) {
            aVar.k = colorStateList;
        }
        float f10 = dVar.f2689l;
        if (f10 != 0.0f) {
            aVar.f25256i = f10;
        }
        ColorStateList colorStateList2 = dVar.f2680a;
        if (colorStateList2 != null) {
            aVar.V = colorStateList2;
        }
        aVar.T = dVar.f2685f;
        aVar.U = dVar.f2686g;
        aVar.S = dVar.f2687h;
        aVar.W = dVar.j;
        be.a aVar2 = aVar.f25274z;
        if (aVar2 != null) {
            aVar2.f2673h = true;
        }
        l2 l2Var = new l2(24, aVar);
        dVar.a();
        aVar.f25274z = new be.a(l2Var, dVar.f2693p);
        dVar.b(textInputLayout.getContext(), aVar.f25274z);
        aVar.j(false);
        this.G0 = aVar.k;
        if (this.f5767x != null) {
            w(false, false);
            v();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.G0 != colorStateList) {
            if (this.F0 == null) {
                xd.a aVar = this.S0;
                if (aVar.k != colorStateList) {
                    aVar.k = colorStateList;
                    aVar.j(false);
                }
            }
            this.G0 = colorStateList;
            if (this.f5767x != null) {
                w(false, false);
            }
        }
    }

    public void setLengthCounter(y yVar) {
        this.K = yVar;
    }

    public void setMaxEms(int i10) {
        this.D = i10;
        EditText editText = this.f5767x;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMaxEms(i10);
    }

    public void setMaxWidth(int i10) {
        this.F = i10;
        EditText editText = this.f5767x;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMaxWidth(i10);
    }

    public void setMaxWidthResource(int i10) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    public void setMinEms(int i10) {
        this.B = i10;
        EditText editText = this.f5767x;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMinEms(i10);
    }

    public void setMinWidth(int i10) {
        this.E = i10;
        EditText editText = this.f5767x;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMinWidth(i10);
    }

    public void setMinWidthResource(int i10) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i10) {
        m mVar = this.f5748g;
        mVar.B.setContentDescription(i10 != 0 ? mVar.getResources().getText(i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i10) {
        m mVar = this.f5748g;
        mVar.B.setImageDrawable(i10 != 0 ? ic.a.r(mVar.getContext(), i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z10) {
        m mVar = this.f5748g;
        if (z10 && mVar.E != 1) {
            mVar.g(1);
        } else if (z10) {
            mVar.getClass();
        } else {
            mVar.g(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        m mVar = this.f5748g;
        mVar.G = colorStateList;
        vc.e.b(mVar.f13642a, mVar.B, colorStateList, mVar.H);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        m mVar = this.f5748g;
        mVar.H = mode;
        vc.e.b(mVar.f13642a, mVar.B, mVar.G, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.Q == null) {
            q0 q0Var = new q0(getContext(), null);
            this.Q = q0Var;
            q0Var.setId(ed.f.textinput_placeholder);
            this.Q.setImportantForAccessibility(1);
            this.Q.setAccessibilityLiveRegion(1);
            g gVarF = f();
            this.T = gVarF;
            gVarF.f22513d = 67L;
            this.U = f();
            setPlaceholderTextAppearance(this.S);
            setPlaceholderTextColor(this.R);
            i0.n(this.Q, new com.google.android.material.datepicker.g(7));
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.P) {
                setPlaceholderTextEnabled(true);
            }
            this.O = charSequence;
        }
        EditText editText = this.f5767x;
        x(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int i10) {
        this.S = i10;
        q0 q0Var = this.Q;
        if (q0Var != null) {
            q0Var.setTextAppearance(i10);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.R != colorStateList) {
            this.R = colorStateList;
            q0 q0Var = this.Q;
            if (q0Var == null || colorStateList == null) {
                return;
            }
            q0Var.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        v vVar = this.f5744d;
        vVar.getClass();
        vVar.f13694g = TextUtils.isEmpty(charSequence) ? null : charSequence;
        vVar.f13693d.setText(charSequence);
        vVar.e();
    }

    public void setPrefixTextAppearance(int i10) {
        this.f5744d.f13693d.setTextAppearance(i10);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f5744d.f13693d.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(l lVar) {
        i iVar = this.f5747f0;
        if (iVar == null || iVar.f8117d.f8097a == lVar) {
            return;
        }
        this.f5754l0 = lVar;
        c();
    }

    public void setStartIconCheckable(boolean z10) {
        this.f5744d.f13695r.setCheckable(z10);
    }

    public void setStartIconContentDescription(int i10) {
        setStartIconContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setStartIconDrawable(int i10) {
        setStartIconDrawable(i10 != 0 ? ic.a.r(getContext(), i10) : null);
    }

    public void setStartIconMinSize(int i10) {
        v vVar = this.f5744d;
        if (i10 < 0) {
            vVar.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i10 != vVar.B) {
            vVar.B = i10;
            CheckableImageButton checkableImageButton = vVar.f13695r;
            checkableImageButton.setMinimumWidth(i10);
            checkableImageButton.setMinimumHeight(i10);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        v vVar = this.f5744d;
        CheckableImageButton checkableImageButton = vVar.f13695r;
        View.OnLongClickListener onLongClickListener = vVar.E;
        checkableImageButton.setOnClickListener(onClickListener);
        vc.e.O(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        v vVar = this.f5744d;
        vVar.E = onLongClickListener;
        CheckableImageButton checkableImageButton = vVar.f13695r;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        vc.e.O(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        v vVar = this.f5744d;
        vVar.D = scaleType;
        vVar.f13695r.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        v vVar = this.f5744d;
        if (vVar.f13696x != colorStateList) {
            vVar.f13696x = colorStateList;
            vc.e.b(vVar.f13692a, vVar.f13695r, colorStateList, vVar.f13697y);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        v vVar = this.f5744d;
        if (vVar.f13697y != mode) {
            vVar.f13697y = mode;
            vc.e.b(vVar.f13692a, vVar.f13695r, vVar.f13696x, mode);
        }
    }

    public void setStartIconVisible(boolean z10) {
        this.f5744d.c(z10);
    }

    public void setSuffixText(CharSequence charSequence) {
        m mVar = this.f5748g;
        mVar.getClass();
        mVar.L = TextUtils.isEmpty(charSequence) ? null : charSequence;
        mVar.M.setText(charSequence);
        mVar.n();
    }

    public void setSuffixTextAppearance(int i10) {
        this.f5748g.M.setTextAppearance(i10);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f5748g.M.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(x xVar) {
        EditText editText = this.f5767x;
        if (editText != null) {
            i0.n(editText, xVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f5770y0) {
            this.f5770y0 = typeface;
            this.S0.n(typeface);
            q qVar = this.G;
            if (typeface != qVar.B) {
                qVar.B = typeface;
                q0 q0Var = qVar.f13673r;
                if (q0Var != null) {
                    q0Var.setTypeface(typeface);
                }
                q0 q0Var2 = qVar.f13680y;
                if (q0Var2 != null) {
                    q0Var2.setTypeface(typeface);
                }
            }
            q0 q0Var3 = this.L;
            if (q0Var3 != null) {
                q0Var3.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        Drawable background;
        q0 q0Var;
        EditText editText = this.f5767x;
        if (editText == null || this.f5757o0 != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = c1.f20034a;
        Drawable drawableMutate = background.mutate();
        if (o()) {
            drawableMutate.setColorFilter(p.p.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.J && (q0Var = this.L) != null) {
            drawableMutate.setColorFilter(p.p.c(q0Var.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            drawableMutate.clearColorFilter();
            this.f5767x.refreshDrawableState();
        }
    }

    public final void u() {
        EditText editText = this.f5767x;
        if (editText == null || this.f5747f0 == null) {
            return;
        }
        if ((this.f5751i0 || editText.getBackground() == null) && this.f5757o0 != 0) {
            this.f5767x.setBackground(getEditTextBoxBackground());
            this.f5751i0 = true;
        }
    }

    public final void v() {
        if (this.f5757o0 != 1) {
            FrameLayout frameLayout = this.f5740a;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int iE = e();
            if (iE != layoutParams.topMargin) {
                layoutParams.topMargin = iE;
                frameLayout.requestLayout();
            }
        }
    }

    public final void w(boolean z10, boolean z11) {
        ColorStateList colorStateList;
        q0 q0Var;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f5767x;
        boolean z12 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f5767x;
        boolean z13 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.F0;
        xd.a aVar = this.S0;
        if (colorStateList2 != null) {
            aVar.k(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.F0;
            aVar.k(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.P0) : this.P0));
        } else if (o()) {
            q0 q0Var2 = this.G.f13673r;
            aVar.k(q0Var2 != null ? q0Var2.getTextColors() : null);
        } else if (this.J && (q0Var = this.L) != null) {
            aVar.k(q0Var.getTextColors());
        } else if (z13 && (colorStateList = this.G0) != null && aVar.k != colorStateList) {
            aVar.k = colorStateList;
            aVar.j(false);
        }
        m mVar = this.f5748g;
        v vVar = this.f5744d;
        if (z12 || !this.T0 || (isEnabled() && z13)) {
            if (z11 || this.R0) {
                ValueAnimator valueAnimator = this.V0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.V0.cancel();
                }
                if (z10 && this.U0) {
                    b(1.0f);
                } else {
                    aVar.m(1.0f);
                }
                this.R0 = false;
                if (g()) {
                    l();
                }
                EditText editText3 = this.f5767x;
                x(editText3 != null ? editText3.getText() : null);
                vVar.F = false;
                vVar.e();
                mVar.N = false;
                mVar.n();
                return;
            }
            return;
        }
        if (z11 || !this.R0) {
            ValueAnimator valueAnimator2 = this.V0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.V0.cancel();
            }
            if (z10 && this.U0) {
                b(0.0f);
            } else {
                aVar.m(0.0f);
            }
            if (g() && !((je.f) this.f5747f0).f13622d0.f13620r.isEmpty() && g()) {
                ((je.f) this.f5747f0).y(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.R0 = true;
            q0 q0Var3 = this.Q;
            if (q0Var3 != null && this.P) {
                q0Var3.setText((CharSequence) null);
                u.a(this.f5740a, this.U);
                this.Q.setVisibility(4);
            }
            vVar.F = true;
            vVar.e();
            mVar.N = true;
            mVar.n();
        }
    }

    public final void x(Editable editable) {
        ((u0) this.K).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.f5740a;
        if (length != 0 || this.R0) {
            q0 q0Var = this.Q;
            if (q0Var == null || !this.P) {
                return;
            }
            q0Var.setText((CharSequence) null);
            u.a(frameLayout, this.U);
            this.Q.setVisibility(4);
            return;
        }
        if (this.Q == null || !this.P || TextUtils.isEmpty(this.O)) {
            return;
        }
        this.Q.setText(this.O);
        u.a(frameLayout, this.T);
        this.Q.setVisibility(0);
        this.Q.bringToFront();
    }

    public final void y(boolean z10, boolean z11) {
        int defaultColor = this.K0.getDefaultColor();
        int colorForState = this.K0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.K0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z10) {
            this.f5763t0 = colorForState2;
        } else if (z11) {
            this.f5763t0 = colorForState;
        } else {
            this.f5763t0 = defaultColor;
        }
    }

    public final void z() throws Resources.NotFoundException {
        q0 q0Var;
        EditText editText;
        EditText editText2;
        if (this.f5747f0 == null || this.f5757o0 == 0) {
            return;
        }
        boolean z10 = false;
        boolean z11 = isFocused() || ((editText2 = this.f5767x) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f5767x) != null && editText.isHovered())) {
            z10 = true;
        }
        if (!isEnabled()) {
            this.f5763t0 = this.P0;
        } else if (o()) {
            if (this.K0 != null) {
                y(z11, z10);
            } else {
                this.f5763t0 = getErrorCurrentTextColors();
            }
        } else if (!this.J || (q0Var = this.L) == null) {
            if (z11) {
                this.f5763t0 = this.J0;
            } else if (z10) {
                this.f5763t0 = this.I0;
            } else {
                this.f5763t0 = this.H0;
            }
        } else if (this.K0 != null) {
            y(z11, z10);
        } else {
            this.f5763t0 = q0Var.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            r();
        }
        m mVar = this.f5748g;
        TextInputLayout textInputLayout = mVar.f13642a;
        CheckableImageButton checkableImageButton = mVar.B;
        TextInputLayout textInputLayout2 = mVar.f13642a;
        mVar.l();
        vc.e.H(textInputLayout2, mVar.f13644g, mVar.f13645r);
        vc.e.H(textInputLayout2, checkableImageButton, mVar.G);
        if (mVar.b() instanceof je.j) {
            if (!textInputLayout.o() || checkableImageButton.getDrawable() == null) {
                vc.e.b(textInputLayout, checkableImageButton, mVar.G, mVar.H);
            } else {
                Drawable drawableMutate = checkableImageButton.getDrawable().mutate();
                drawableMutate.setTint(textInputLayout.getErrorCurrentTextColors());
                checkableImageButton.setImageDrawable(drawableMutate);
            }
        }
        v vVar = this.f5744d;
        vc.e.H(vVar.f13692a, vVar.f13695r, vVar.f13696x);
        if (this.f5757o0 == 2) {
            int i10 = this.f5759q0;
            if (z11 && isEnabled()) {
                this.f5759q0 = this.f5762s0;
            } else {
                this.f5759q0 = this.f5761r0;
            }
            if (this.f5759q0 != i10 && g() && !this.R0) {
                if (g()) {
                    ((je.f) this.f5747f0).y(0.0f, 0.0f, 0.0f, 0.0f);
                }
                l();
            }
        }
        if (this.f5757o0 == 1) {
            if (!isEnabled()) {
                this.f5764u0 = this.M0;
            } else if (z10 && !z11) {
                this.f5764u0 = this.O0;
            } else if (z11) {
                this.f5764u0 = this.N0;
            } else {
                this.f5764u0 = this.L0;
            }
        }
        c();
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f5744d.f13695r;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f5744d.b(drawable);
    }

    public void setHint(int i10) {
        setHint(i10 != 0 ? getResources().getText(i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f5748g.B.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f5748g.B.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f5748g.i(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f5748g.B;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        m mVar = this.f5748g;
        TextInputLayout textInputLayout = mVar.f13642a;
        CheckableImageButton checkableImageButton = mVar.B;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            vc.e.b(textInputLayout, checkableImageButton, mVar.G, mVar.H);
            vc.e.H(textInputLayout, checkableImageButton, mVar.G);
        }
    }
}
