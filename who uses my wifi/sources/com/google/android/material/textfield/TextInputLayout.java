package com.google.android.material.textfield;

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
import com.google.android.material.internal.CheckableImageButton;
import defpackage.a11;
import defpackage.a9;
import defpackage.b11;
import defpackage.bd2;
import defpackage.bu;
import defpackage.ck;
import defpackage.dk;
import defpackage.e2;
import defpackage.e61;
import defpackage.ex0;
import defpackage.f2;
import defpackage.fr;
import defpackage.gn0;
import defpackage.hd;
import defpackage.hg;
import defpackage.hy0;
import defpackage.i41;
import defpackage.kj;
import defpackage.ko;
import defpackage.l;
import defpackage.l6;
import defpackage.lb0;
import defpackage.lc0;
import defpackage.mb;
import defpackage.nb;
import defpackage.nc0;
import defpackage.ob1;
import defpackage.ou1;
import defpackage.p20;
import defpackage.q20;
import defpackage.qb1;
import defpackage.r4;
import defpackage.s7;
import defpackage.ss;
import defpackage.su0;
import defpackage.tq;
import defpackage.u01;
import defpackage.uk2;
import defpackage.um;
import defpackage.us;
import defpackage.vg0;
import defpackage.vl;
import defpackage.w01;
import defpackage.wa;
import defpackage.wl;
import defpackage.wl2;
import defpackage.wq0;
import defpackage.wx0;
import defpackage.xb4;
import defpackage.xf;
import defpackage.y01;
import defpackage.yb0;
import defpackage.yo;
import defpackage.yp;
import defpackage.z01;
import defpackage.z21;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final int[][] I0 = {new int[]{R.attr.state_pressed}, new int[0]};
    public ColorStateList A;
    public boolean A0;
    public int B;
    public final xf B0;
    public bu C;
    public boolean C0;
    public bu D;
    public boolean D0;
    public ColorStateList E;
    public ValueAnimator E0;
    public ColorStateList F;
    public boolean F0;
    public ColorStateList G;
    public boolean G0;
    public ColorStateList H;
    public boolean H0;
    public boolean I;
    public CharSequence J;
    public boolean K;
    public nc0 L;
    public nc0 M;
    public StateListDrawable N;
    public boolean O;
    public nc0 P;
    public nc0 Q;
    public su0 R;
    public boolean S;
    public final int T;
    public int U;
    public int V;
    public int W;
    public int a0;
    public int b0;
    public int c0;
    public int d0;
    public final Rect e0;
    public final FrameLayout f;
    public final Rect f0;
    public final wx0 g;
    public final RectF g0;
    public final us h;
    public Typeface h0;
    public final int i;
    public ColorDrawable i0;
    public EditText j;
    public int j0;
    public CharSequence k;
    public final LinkedHashSet k0;
    public int l;
    public ColorDrawable l0;
    public int m;
    public int m0;
    public int n;
    public Drawable n0;
    public int o;
    public ColorStateList o0;
    public final q20 p;
    public ColorStateList p0;
    public boolean q;
    public int q0;
    public int r;
    public int r0;
    public boolean s;
    public int s0;
    public a11 t;
    public ColorStateList t0;
    public s7 u;
    public int u0;
    public int v;
    public int v0;
    public int w;
    public int w0;
    public CharSequence x;
    public int x0;
    public boolean y;
    public int y0;
    public s7 z;
    public int z0;

    public TextInputLayout(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(um.z(context, attributeSet, com.phuongpn.whousemywifi.networkscanner.R.attr.textInputStyle, com.phuongpn.whousemywifi.networkscanner.R.style.Widget_Design_TextInputLayout), attributeSet, com.phuongpn.whousemywifi.networkscanner.R.attr.textInputStyle);
        this.l = -1;
        this.m = -1;
        this.n = -1;
        this.o = -1;
        this.p = new q20(this);
        this.t = new yo(3);
        this.e0 = new Rect();
        this.f0 = new Rect();
        this.g0 = new RectF();
        this.k0 = new LinkedHashSet();
        xf xfVar = new xf(this);
        this.B0 = xfVar;
        this.H0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = r4.a;
        xfVar.R = linearInterpolator;
        xfVar.j(false);
        xfVar.Q = linearInterpolator;
        xfVar.j(false);
        if (xfVar.g != 8388659) {
            xfVar.g = 8388659;
            xfVar.j(false);
        }
        uk2.h(context2, attributeSet, com.phuongpn.whousemywifi.networkscanner.R.attr.textInputStyle, com.phuongpn.whousemywifi.networkscanner.R.style.Widget_Design_TextInputLayout);
        int[] iArr = gn0.M;
        uk2.i(context2, attributeSet, iArr, com.phuongpn.whousemywifi.networkscanner.R.attr.textInputStyle, com.phuongpn.whousemywifi.networkscanner.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 50);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.phuongpn.whousemywifi.networkscanner.R.attr.textInputStyle, com.phuongpn.whousemywifi.networkscanner.R.style.Widget_Design_TextInputLayout);
        xb4 xb4Var = new xb4(context2, typedArrayObtainStyledAttributes, 10);
        wx0 wx0Var = new wx0(this, xb4Var);
        this.g = wx0Var;
        this.I = typedArrayObtainStyledAttributes.getBoolean(48, true);
        setHint(typedArrayObtainStyledAttributes.getText(4));
        this.D0 = typedArrayObtainStyledAttributes.getBoolean(47, true);
        this.C0 = typedArrayObtainStyledAttributes.getBoolean(42, true);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            setMinEms(typedArrayObtainStyledAttributes.getInt(6, -1));
        } else if (typedArrayObtainStyledAttributes.hasValue(3)) {
            setMinWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(3, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            setMaxEms(typedArrayObtainStyledAttributes.getInt(5, -1));
        } else if (typedArrayObtainStyledAttributes.hasValue(2)) {
            setMaxWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1));
        }
        this.R = su0.b(context2, attributeSet, com.phuongpn.whousemywifi.networkscanner.R.attr.textInputStyle, com.phuongpn.whousemywifi.networkscanner.R.style.Widget_Design_TextInputLayout).a();
        this.T = context2.getResources().getDimensionPixelOffset(com.phuongpn.whousemywifi.networkscanner.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.V = typedArrayObtainStyledAttributes.getDimensionPixelOffset(9, 0);
        this.i = getResources().getDimensionPixelSize(com.phuongpn.whousemywifi.networkscanner.R.dimen.m3_multiline_hint_filled_text_extra_space);
        this.a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(com.phuongpn.whousemywifi.networkscanner.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(com.phuongpn.whousemywifi.networkscanner.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.W = this.a0;
        float dimension = typedArrayObtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = typedArrayObtainStyledAttributes.getDimension(11, -1.0f);
        f2 f2VarF = this.R.f();
        if (dimension >= 0.0f) {
            f2VarF.e = new l(dimension);
        }
        if (dimension2 >= 0.0f) {
            f2VarF.f = new l(dimension2);
        }
        if (dimension3 >= 0.0f) {
            f2VarF.g = new l(dimension3);
        }
        if (dimension4 >= 0.0f) {
            f2VarF.h = new l(dimension4);
        }
        this.R = f2VarF.a();
        ColorStateList colorStateListF = ob1.f(context2, xb4Var, 7);
        if (colorStateListF != null) {
            int defaultColor = colorStateListF.getDefaultColor();
            this.u0 = defaultColor;
            this.d0 = defaultColor;
            if (colorStateListF.isStateful()) {
                this.v0 = colorStateListF.getColorForState(new int[]{-16842910}, -1);
                this.w0 = colorStateListF.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.x0 = colorStateListF.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.w0 = this.u0;
                ColorStateList colorStateListD = ob1.d(context2, com.phuongpn.whousemywifi.networkscanner.R.color.mtrl_filled_background_color);
                this.v0 = colorStateListD.getColorForState(new int[]{-16842910}, -1);
                this.x0 = colorStateListD.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.d0 = 0;
            this.u0 = 0;
            this.v0 = 0;
            this.w0 = 0;
            this.x0 = 0;
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            ColorStateList colorStateListK = xb4Var.k(1);
            this.p0 = colorStateListK;
            this.o0 = colorStateListK;
        }
        ColorStateList colorStateListF2 = ob1.f(context2, xb4Var, 14);
        this.s0 = typedArrayObtainStyledAttributes.getColor(14, 0);
        this.q0 = kj.a(context2, com.phuongpn.whousemywifi.networkscanner.R.color.mtrl_textinput_default_box_stroke_color);
        this.y0 = kj.a(context2, com.phuongpn.whousemywifi.networkscanner.R.color.mtrl_textinput_disabled_color);
        this.r0 = kj.a(context2, com.phuongpn.whousemywifi.networkscanner.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateListF2 != null) {
            setBoxStrokeColorStateList(colorStateListF2);
        }
        if (typedArrayObtainStyledAttributes.hasValue(15)) {
            setBoxStrokeErrorColor(ob1.f(context2, xb4Var, 15));
        }
        if (typedArrayObtainStyledAttributes.getResourceId(50, -1) != -1) {
            setHintTextAppearance(typedArrayObtainStyledAttributes.getResourceId(50, 0));
        }
        this.G = xb4Var.k(24);
        this.H = xb4Var.k(25);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(40, 0);
        CharSequence text = typedArrayObtainStyledAttributes.getText(35);
        int i = typedArrayObtainStyledAttributes.getInt(34, 1);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(36, false);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(45, 0);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(44, false);
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(43);
        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(58, 0);
        CharSequence text3 = typedArrayObtainStyledAttributes.getText(57);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(18, false);
        setCounterMaxLength(typedArrayObtainStyledAttributes.getInt(19, -1));
        this.w = typedArrayObtainStyledAttributes.getResourceId(22, 0);
        this.v = typedArrayObtainStyledAttributes.getResourceId(20, 0);
        setBoxBackgroundMode(typedArrayObtainStyledAttributes.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i);
        setCounterOverflowTextAppearance(this.v);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.w);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (typedArrayObtainStyledAttributes.hasValue(41)) {
            setErrorTextColor(xb4Var.k(41));
        }
        if (typedArrayObtainStyledAttributes.hasValue(46)) {
            setHelperTextColor(xb4Var.k(46));
        }
        if (typedArrayObtainStyledAttributes.hasValue(51)) {
            setHintTextColor(xb4Var.k(51));
        }
        if (typedArrayObtainStyledAttributes.hasValue(23)) {
            setCounterTextColor(xb4Var.k(23));
        }
        if (typedArrayObtainStyledAttributes.hasValue(21)) {
            setCounterOverflowTextColor(xb4Var.k(21));
        }
        if (typedArrayObtainStyledAttributes.hasValue(59)) {
            setPlaceholderTextColor(xb4Var.k(59));
        }
        us usVar = new us(this, xb4Var);
        this.h = usVar;
        boolean z4 = typedArrayObtainStyledAttributes.getBoolean(0, true);
        setHintMaxLines(typedArrayObtainStyledAttributes.getInt(49, 1));
        xb4Var.z();
        setImportantForAccessibility(2);
        setImportantForAutofill(1);
        frameLayout.addView(wx0Var);
        frameLayout.addView(usVar);
        addView(frameLayout);
        setEnabled(z4);
        setHelperTextEnabled(z2);
        setErrorEnabled(z);
        setCounterEnabled(z3);
        setHelperText(text2);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.j;
        if (!(editText instanceof AutoCompleteTextView) || editText.getInputType() != 0) {
            return this.L;
        }
        int i = i41.i(this.j, com.phuongpn.whousemywifi.networkscanner.R.attr.colorControlHighlight);
        int i2 = this.U;
        int[][] iArr = I0;
        if (i2 != 2) {
            if (i2 != 1) {
                return null;
            }
            nc0 nc0Var = this.L;
            int i3 = this.d0;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{i41.n(0.1f, i, i3), i3}), nc0Var, nc0Var);
        }
        Context context = getContext();
        nc0 nc0Var2 = this.L;
        TypedValue typedValueP = qb1.p(com.phuongpn.whousemywifi.networkscanner.R.attr.colorSurface, context, "TextInputLayout");
        int i4 = typedValueP.resourceId;
        int iA = i4 != 0 ? kj.a(context, i4) : typedValueP.data;
        nc0 nc0Var3 = new nc0(nc0Var2.g.a);
        int iN = i41.n(0.1f, i, iA);
        nc0Var3.q(new ColorStateList(iArr, new int[]{iN, 0}));
        nc0Var3.setTint(iA);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iN, iA});
        nc0 nc0Var4 = new nc0(nc0Var2.g.a);
        nc0Var4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, nc0Var3, nc0Var4), nc0Var2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.N == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.N = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.N.addState(new int[0], h(false));
        }
        return this.N;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.M == null) {
            this.M = h(true);
        }
        return this.M;
    }

    public static void m(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                m((ViewGroup) childAt, z);
            }
        }
    }

    private void setEditText(EditText editText) throws Resources.NotFoundException {
        if (this.j != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        getEndIconMode();
        this.j = editText;
        int i = this.l;
        if (i != -1) {
            setMinEms(i);
        } else {
            setMinWidth(this.n);
        }
        int i2 = this.m;
        if (i2 != -1) {
            setMaxEms(i2);
        } else {
            setMaxWidth(this.o);
        }
        this.O = false;
        k();
        setTextInputAccessibilityDelegate(new z01(this));
        Typeface typeface = this.j.getTypeface();
        xf xfVar = this.B0;
        xfVar.n(typeface);
        float textSize = this.j.getTextSize();
        if (xfVar.h != textSize) {
            xfVar.h = textSize;
            xfVar.j(false);
        }
        float letterSpacing = this.j.getLetterSpacing();
        if (xfVar.X != letterSpacing) {
            xfVar.X = letterSpacing;
            xfVar.j(false);
        }
        int gravity = this.j.getGravity();
        int i3 = (gravity & (-113)) | 48;
        if (xfVar.g != i3) {
            xfVar.g = i3;
            xfVar.j(false);
        }
        if (xfVar.f != gravity) {
            xfVar.f = gravity;
            xfVar.j(false);
        }
        this.z0 = editText.getMinimumHeight();
        this.j.addTextChangedListener(new y01(this, editText));
        if (this.o0 == null) {
            this.o0 = this.j.getHintTextColors();
        }
        if (this.I) {
            if (TextUtils.isEmpty(this.J)) {
                CharSequence hint = this.j.getHint();
                this.k = hint;
                setHint(hint);
                this.j.setHint((CharSequence) null);
            }
            this.K = true;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            r();
        }
        if (this.u != null) {
            p(this.j.getText());
        }
        t();
        this.p.b();
        this.g.bringToFront();
        us usVar = this.h;
        usVar.bringToFront();
        Iterator it = this.k0.iterator();
        while (it.hasNext()) {
            ((ss) it.next()).a(this);
        }
        usVar.m();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        w(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.J)) {
            return;
        }
        this.J = charSequence;
        xf xfVar = this.B0;
        if (charSequence == null || !TextUtils.equals(xfVar.B, charSequence)) {
            xfVar.B = charSequence;
            xfVar.C = null;
            xfVar.j(false);
        }
        if (this.A0) {
            return;
        }
        l();
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.y == z) {
            return;
        }
        if (z) {
            s7 s7Var = this.z;
            if (s7Var != null) {
                this.f.addView(s7Var);
                this.z.setVisibility(0);
            }
        } else {
            s7 s7Var2 = this.z;
            if (s7Var2 != null) {
                s7Var2.setVisibility(8);
            }
            this.z = null;
        }
        this.y = z;
    }

    public final void a() {
        if (this.j == null || this.U != 1) {
            return;
        }
        if (getHintMaxLines() != 1) {
            EditText editText = this.j;
            editText.setPaddingRelative(editText.getPaddingStart(), (int) (this.B0.f() + this.i), this.j.getPaddingEnd(), getResources().getDimensionPixelSize(com.phuongpn.whousemywifi.networkscanner.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
        } else if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
            EditText editText2 = this.j;
            editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(com.phuongpn.whousemywifi.networkscanner.R.dimen.material_filled_edittext_font_2_0_padding_top), this.j.getPaddingEnd(), getResources().getDimensionPixelSize(com.phuongpn.whousemywifi.networkscanner.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
        } else if (ob1.o(getContext())) {
            EditText editText3 = this.j;
            editText3.setPaddingRelative(editText3.getPaddingStart(), getResources().getDimensionPixelSize(com.phuongpn.whousemywifi.networkscanner.R.dimen.material_filled_edittext_font_1_3_padding_top), this.j.getPaddingEnd(), getResources().getDimensionPixelSize(com.phuongpn.whousemywifi.networkscanner.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) throws Resources.NotFoundException {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        v();
        setEditText((EditText) view);
    }

    public final void b(float f) {
        xf xfVar = this.B0;
        if (xfVar.b == f) {
            return;
        }
        int i = 2;
        if (this.E0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.E0 = valueAnimator;
            valueAnimator.setInterpolator(wl2.u(getContext(), com.phuongpn.whousemywifi.networkscanner.R.attr.motionEasingEmphasizedInterpolator, r4.b));
            this.E0.setDuration(wl2.t(getContext(), com.phuongpn.whousemywifi.networkscanner.R.attr.motionDurationMedium4, 167));
            this.E0.addUpdateListener(new mb(i, this));
        }
        this.E0.setFloatValues(xfVar.b, f);
        this.E0.start();
    }

    public final void c() {
        int i;
        int i2;
        nc0 nc0Var = this.L;
        if (nc0Var == null) {
            return;
        }
        su0 su0Var = nc0Var.g.a;
        su0 su0Var2 = this.R;
        if (su0Var != su0Var2) {
            nc0Var.setShapeAppearanceModel(su0Var2);
        }
        if (this.U == 2 && (i = this.W) > -1 && (i2 = this.c0) != 0) {
            nc0 nc0Var2 = this.L;
            nc0Var2.g.k = i;
            nc0Var2.invalidateSelf();
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(i2);
            lc0 lc0Var = nc0Var2.g;
            if (lc0Var.e != colorStateListValueOf) {
                lc0Var.e = colorStateListValueOf;
                nc0Var2.onStateChange(nc0Var2.getState());
            }
        }
        int iB = this.d0;
        if (this.U == 1) {
            iB = hg.b(this.d0, i41.h(getContext(), com.phuongpn.whousemywifi.networkscanner.R.attr.colorSurface, 0));
        }
        this.d0 = iB;
        this.L.q(ColorStateList.valueOf(iB));
        nc0 nc0Var3 = this.P;
        if (nc0Var3 != null && this.Q != null) {
            if (this.W > -1 && this.c0 != 0) {
                nc0Var3.q(this.j.isFocused() ? ColorStateList.valueOf(this.q0) : ColorStateList.valueOf(this.c0));
                this.Q.q(ColorStateList.valueOf(this.c0));
            }
            invalidate();
        }
        u();
    }

    public final Rect d(Rect rect) {
        if (this.j == null) {
            throw new IllegalStateException();
        }
        boolean z = getLayoutDirection() == 1;
        int i = rect.bottom;
        Rect rect2 = this.f0;
        rect2.bottom = i;
        int i2 = this.U;
        if (i2 == 1) {
            rect2.left = i(rect.left, z);
            rect2.top = rect.top + this.V;
            rect2.right = j(rect.right, z);
            return rect2;
        }
        if (i2 != 2) {
            rect2.left = i(rect.left, z);
            rect2.top = getPaddingTop();
            rect2.right = j(rect.right, z);
            return rect2;
        }
        rect2.left = this.j.getPaddingLeft() + rect.left;
        rect2.top = rect.top - e();
        rect2.right = rect.right - this.j.getPaddingRight();
        return rect2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.j;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.k != null) {
            boolean z = this.K;
            this.K = false;
            CharSequence hint = editText.getHint();
            this.j.setHint(this.k);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.j.setHint(hint);
                this.K = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.f;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i2 = 0; i2 < frameLayout.getChildCount(); i2++) {
            View childAt = frameLayout.getChildAt(i2);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i);
            if (childAt == this.j) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.G0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.G0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        nc0 nc0Var;
        super.draw(canvas);
        boolean z = this.I;
        xf xfVar = this.B0;
        if (z) {
            TextPaint textPaint = xfVar.O;
            RectF rectF = xfVar.e;
            int iSave = canvas.save();
            if (xfVar.C != null && rectF.width() > 0.0f && rectF.height() > 0.0f) {
                textPaint.setTextSize(xfVar.G);
                float f = xfVar.q;
                float f2 = xfVar.r;
                float f3 = xfVar.F;
                if (f3 != 1.0f) {
                    canvas.scale(f3, f3, f, f2);
                }
                if ((xfVar.e0 > 1 || xfVar.f0 > 1) && !xfVar.D && xfVar.o()) {
                    float lineStart = xfVar.q - xfVar.Z.getLineStart(0);
                    int alpha = textPaint.getAlpha();
                    canvas.translate(lineStart, f2);
                    float f4 = alpha;
                    textPaint.setAlpha((int) (xfVar.c0 * f4));
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 31) {
                        textPaint.setShadowLayer(xfVar.H, xfVar.I, xfVar.J, i41.b(xfVar.K, textPaint.getAlpha()));
                    }
                    xfVar.Z.draw(canvas);
                    textPaint.setAlpha((int) (xfVar.b0 * f4));
                    if (i >= 31) {
                        textPaint.setShadowLayer(xfVar.H, xfVar.I, xfVar.J, i41.b(xfVar.K, textPaint.getAlpha()));
                    }
                    int lineBaseline = xfVar.Z.getLineBaseline(0);
                    CharSequence charSequence = xfVar.d0;
                    float f5 = lineBaseline;
                    canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f5, textPaint);
                    if (i >= 31) {
                        textPaint.setShadowLayer(xfVar.H, xfVar.I, xfVar.J, xfVar.K);
                    }
                    String strTrim = xfVar.d0.toString().trim();
                    if (strTrim.endsWith("…")) {
                        strTrim = strTrim.substring(0, strTrim.length() - 1);
                    }
                    String str = strTrim;
                    textPaint.setAlpha(alpha);
                    canvas.drawText(str, 0, Math.min(xfVar.Z.getLineEnd(0), str.length()), 0.0f, f5, (Paint) textPaint);
                    canvas = canvas;
                } else {
                    canvas.translate(f, f2);
                    xfVar.Z.draw(canvas);
                }
                canvas.restoreToCount(iSave);
            }
        }
        if (this.Q == null || (nc0Var = this.P) == null) {
            return;
        }
        nc0Var.draw(canvas);
        if (this.j.isFocused()) {
            Rect bounds = this.Q.getBounds();
            Rect bounds2 = this.P.getBounds();
            float f6 = xfVar.b;
            int iCenterX = bounds2.centerX();
            bounds.left = r4.c(f6, iCenterX, bounds2.left);
            bounds.right = r4.c(f6, iCenterX, bounds2.right);
            this.Q.draw(canvas);
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
            boolean r0 = r4.F0
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r4.F0 = r0
            super.drawableStateChanged()
            int[] r1 = r4.getDrawableState()
            r2 = 0
            xf r3 = r4.B0
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
            android.widget.EditText r3 = r4.j
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
            r4.F0 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.drawableStateChanged():void");
    }

    public final int e() {
        if (this.I) {
            int i = this.U;
            xf xfVar = this.B0;
            if (i == 0) {
                return (int) xfVar.f();
            }
            if (i == 2) {
                if (getHintMaxLines() == 1) {
                    return (int) (xfVar.f() / 2.0f);
                }
                float f = xfVar.f();
                TextPaint textPaint = xfVar.P;
                textPaint.setTextSize(xfVar.i);
                textPaint.setTypeface(xfVar.s);
                textPaint.setLetterSpacing(xfVar.W);
                return Math.max(0, (int) (f - ((-textPaint.ascent()) / 2.0f)));
            }
        }
        return 0;
    }

    public final bu f() {
        bu buVar = new bu();
        buVar.h = wl2.t(getContext(), com.phuongpn.whousemywifi.networkscanner.R.attr.motionDurationShort2, 87);
        buVar.i = wl2.u(getContext(), com.phuongpn.whousemywifi.networkscanner.R.attr.motionEasingLinearInterpolator, r4.a);
        return buVar;
    }

    public final boolean g() {
        return this.I && !TextUtils.isEmpty(this.J) && (this.L instanceof wl);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.j;
        if (editText == null) {
            return super.getBaseline();
        }
        return e() + getPaddingTop() + editText.getBaseline();
    }

    public nc0 getBoxBackground() {
        int i = this.U;
        if (i == 1 || i == 2) {
            return this.L;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.d0;
    }

    public int getBoxBackgroundMode() {
        return this.U;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.V;
    }

    public float getBoxCornerRadiusBottomEnd() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.g0;
        return layoutDirection == 1 ? this.R.h.a(rectF) : this.R.g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.g0;
        return layoutDirection == 1 ? this.R.g.a(rectF) : this.R.h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.g0;
        return layoutDirection == 1 ? this.R.e.a(rectF) : this.R.f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.g0;
        return layoutDirection == 1 ? this.R.f.a(rectF) : this.R.e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.s0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.t0;
    }

    public int getBoxStrokeWidth() {
        return this.a0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.b0;
    }

    public int getCounterMaxLength() {
        return this.r;
    }

    public CharSequence getCounterOverflowDescription() {
        s7 s7Var;
        if (this.q && this.s && (s7Var = this.u) != null) {
            return s7Var.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.F;
    }

    public ColorStateList getCounterTextColor() {
        return this.E;
    }

    public ColorStateList getCursorColor() {
        return this.G;
    }

    public ColorStateList getCursorErrorColor() {
        return this.H;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.o0;
    }

    public EditText getEditText() {
        return this.j;
    }

    public CharSequence getEndIconContentDescription() {
        return this.h.l.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.h.l.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.h.r;
    }

    public int getEndIconMode() {
        return this.h.n;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.h.s;
    }

    public CheckableImageButton getEndIconView() {
        return this.h.l;
    }

    public CharSequence getError() {
        q20 q20Var = this.p;
        if (q20Var.q) {
            return q20Var.p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.p.t;
    }

    public CharSequence getErrorContentDescription() {
        return this.p.s;
    }

    public int getErrorCurrentTextColors() {
        s7 s7Var = this.p.r;
        if (s7Var != null) {
            return s7Var.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.h.h.getDrawable();
    }

    public CharSequence getHelperText() {
        q20 q20Var = this.p;
        if (q20Var.x) {
            return q20Var.w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        s7 s7Var = this.p.y;
        if (s7Var != null) {
            return s7Var.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.I) {
            return this.J;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.B0.f();
    }

    public final int getHintCurrentCollapsedTextColor() {
        xf xfVar = this.B0;
        return xfVar.g(xfVar.k);
    }

    public int getHintMaxLines() {
        return this.B0.e0;
    }

    public ColorStateList getHintTextColor() {
        return this.p0;
    }

    public a11 getLengthCounter() {
        return this.t;
    }

    public int getMaxEms() {
        return this.m;
    }

    public int getMaxWidth() {
        return this.o;
    }

    public int getMinEms() {
        return this.l;
    }

    public int getMinWidth() {
        return this.n;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.h.l.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.h.l.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.y) {
            return this.x;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.B;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.A;
    }

    public CharSequence getPrefixText() {
        return this.g.h;
    }

    public ColorStateList getPrefixTextColor() {
        return this.g.g.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.g.g;
    }

    public su0 getShapeAppearanceModel() {
        return this.R;
    }

    public CharSequence getStartIconContentDescription() {
        return this.g.i.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.g.i.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.g.l;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.g.m;
    }

    public CharSequence getSuffixText() {
        return this.h.u;
    }

    public ColorStateList getSuffixTextColor() {
        return this.h.v.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.h.v;
    }

    public Typeface getTypeface() {
        return this.h0;
    }

    public final nc0 h(boolean z) throws Resources.NotFoundException {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(com.phuongpn.whousemywifi.networkscanner.R.dimen.mtrl_shape_corner_size_small_component);
        float f = z ? dimensionPixelOffset : 0.0f;
        EditText editText = this.j;
        float popupElevation = editText instanceof lb0 ? ((lb0) editText).getPopupElevation() : getResources().getDimensionPixelOffset(com.phuongpn.whousemywifi.networkscanner.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.phuongpn.whousemywifi.networkscanner.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        wq0 wq0Var = new wq0();
        wq0 wq0Var2 = new wq0();
        wq0 wq0Var3 = new wq0();
        wq0 wq0Var4 = new wq0();
        int i = 0;
        fr frVar = new fr(i);
        fr frVar2 = new fr(i);
        fr frVar3 = new fr(i);
        fr frVar4 = new fr(i);
        l lVar = new l(f);
        l lVar2 = new l(f);
        l lVar3 = new l(dimensionPixelOffset);
        l lVar4 = new l(dimensionPixelOffset);
        su0 su0Var = new su0();
        su0Var.a = wq0Var;
        su0Var.b = wq0Var2;
        su0Var.c = wq0Var3;
        su0Var.d = wq0Var4;
        su0Var.e = lVar;
        su0Var.f = lVar2;
        su0Var.g = lVar4;
        su0Var.h = lVar3;
        su0Var.i = frVar;
        su0Var.j = frVar2;
        su0Var.k = frVar3;
        su0Var.l = frVar4;
        EditText editText2 = this.j;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof lb0 ? ((lb0) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = nc0.K;
            TypedValue typedValueP = qb1.p(com.phuongpn.whousemywifi.networkscanner.R.attr.colorSurface, context, nc0.class.getSimpleName());
            int i2 = typedValueP.resourceId;
            dropDownBackgroundTintList = ColorStateList.valueOf(i2 != 0 ? kj.a(context, i2) : typedValueP.data);
        }
        nc0 nc0Var = new nc0();
        nc0Var.m(context);
        nc0Var.q(dropDownBackgroundTintList);
        nc0Var.p(popupElevation);
        nc0Var.setShapeAppearanceModel(su0Var);
        lc0 lc0Var = nc0Var.g;
        if (lc0Var.h == null) {
            lc0Var.h = new Rect();
        }
        nc0Var.g.h.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        nc0Var.invalidateSelf();
        return nc0Var;
    }

    public final int i(int i, boolean z) {
        return ((z || getPrefixText() == null) ? (!z || getSuffixText() == null) ? this.j.getCompoundPaddingLeft() : this.h.c() : this.g.a()) + i;
    }

    public final int j(int i, boolean z) {
        return i - ((z || getSuffixText() == null) ? (!z || getPrefixText() == null) ? this.j.getCompoundPaddingRight() : this.g.a() : this.h.c());
    }

    public final void k() throws Resources.NotFoundException {
        int i = this.U;
        if (i == 0) {
            this.L = null;
            this.P = null;
            this.Q = null;
        } else if (i == 1) {
            this.L = new nc0(this.R);
            this.P = new nc0();
            this.Q = new nc0();
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(ex0.i(new StringBuilder(), this.U, " is illegal; only @BoxBackgroundMode constants are supported."));
            }
            if (!this.I || (this.L instanceof wl)) {
                this.L = new nc0(this.R);
            } else {
                su0 su0Var = this.R;
                int i2 = wl.N;
                if (su0Var == null) {
                    su0Var = new su0();
                }
                vl vlVar = new vl(su0Var, new RectF());
                wl wlVar = new wl(vlVar);
                wlVar.M = vlVar;
                this.L = wlVar;
            }
            this.P = null;
            this.Q = null;
        }
        u();
        z();
        if (this.U == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.V = getResources().getDimensionPixelSize(com.phuongpn.whousemywifi.networkscanner.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (ob1.o(getContext())) {
                this.V = getResources().getDimensionPixelSize(com.phuongpn.whousemywifi.networkscanner.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        a();
        if (this.U != 0) {
            v();
        }
        EditText editText = this.j;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i3 = this.U;
                if (i3 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i3 == 1) {
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

    public final void n(s7 s7Var, int i) {
        try {
            s7Var.setTextAppearance(i);
            if (s7Var.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        s7Var.setTextAppearance(com.phuongpn.whousemywifi.networkscanner.R.style.TextAppearance_AppCompat_Caption);
        s7Var.setTextColor(kj.a(getContext(), com.phuongpn.whousemywifi.networkscanner.R.color.design_error));
    }

    public final boolean o() {
        q20 q20Var = this.p;
        return (q20Var.o != 1 || q20Var.r == null || TextUtils.isEmpty(q20Var.p)) ? false : true;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.B0.i(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int iMax;
        us usVar = this.h;
        usVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z = false;
        this.H0 = false;
        if (this.j != null && this.j.getMeasuredHeight() < (iMax = Math.max(usVar.getMeasuredHeight(), this.g.getMeasuredHeight()))) {
            this.j.setMinimumHeight(iMax);
            z = true;
        }
        boolean zS = s();
        if (z || zS) {
            this.j.post(new e2(16, this));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float fDescent;
        int i5;
        int compoundPaddingTop;
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.j;
        if (editText != null) {
            Rect rect = this.e0;
            ko.a(this, editText, rect);
            nc0 nc0Var = this.P;
            if (nc0Var != null) {
                int i6 = rect.bottom;
                nc0Var.setBounds(rect.left, i6 - this.a0, rect.right, i6);
            }
            nc0 nc0Var2 = this.Q;
            if (nc0Var2 != null) {
                int i7 = rect.bottom;
                nc0Var2.setBounds(rect.left, i7 - this.b0, rect.right, i7);
            }
            if (this.I) {
                float textSize = this.j.getTextSize();
                xf xfVar = this.B0;
                float f = xfVar.h;
                TextPaint textPaint = xfVar.P;
                if (f != textSize) {
                    xfVar.h = textSize;
                    xfVar.j(false);
                }
                int gravity = this.j.getGravity();
                int i8 = (gravity & (-113)) | 48;
                if (xfVar.g != i8) {
                    xfVar.g = i8;
                    xfVar.j(false);
                }
                if (xfVar.f != gravity) {
                    xfVar.f = gravity;
                    xfVar.j(false);
                }
                Rect rectD = d(rect);
                int i9 = rectD.left;
                int i10 = rectD.top;
                int i11 = rectD.right;
                int i12 = rectD.bottom;
                Rect rect2 = xfVar.d;
                if (rect2.left != i9 || rect2.top != i10 || rect2.right != i11 || rect2.bottom != i12) {
                    rect2.set(i9, i10, i11, i12);
                    xfVar.N = true;
                }
                if (this.j == null) {
                    throw new IllegalStateException();
                }
                if (getHintMaxLines() == 1) {
                    textPaint.setTextSize(xfVar.h);
                    textPaint.setTypeface(xfVar.v);
                    textPaint.setLetterSpacing(xfVar.X);
                    fDescent = -textPaint.ascent();
                } else {
                    textPaint.setTextSize(xfVar.h);
                    textPaint.setTypeface(xfVar.v);
                    textPaint.setLetterSpacing(xfVar.X);
                    fDescent = xfVar.l * (textPaint.descent() + (-textPaint.ascent()));
                }
                int compoundPaddingLeft = this.j.getCompoundPaddingLeft() + rect.left;
                Rect rect3 = this.f0;
                rect3.left = compoundPaddingLeft;
                if (this.U != 1 || this.j.getMinLines() > 1) {
                    if (this.U != 0 || getHintMaxLines() == 1) {
                        i5 = 0;
                    } else {
                        textPaint.setTextSize(xfVar.h);
                        textPaint.setTypeface(xfVar.v);
                        textPaint.setLetterSpacing(xfVar.X);
                        i5 = (int) ((-textPaint.ascent()) / 2.0f);
                    }
                    compoundPaddingTop = (this.j.getCompoundPaddingTop() + rect.top) - i5;
                } else {
                    compoundPaddingTop = (int) (rect.centerY() - (fDescent / 2.0f));
                }
                rect3.top = compoundPaddingTop;
                rect3.right = rect.right - this.j.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.U != 1 || this.j.getMinLines() > 1) ? rect.bottom - this.j.getCompoundPaddingBottom() : (int) (rect3.top + fDescent);
                rect3.bottom = compoundPaddingBottom;
                int i13 = rect3.left;
                int i14 = rect3.top;
                int i15 = rect3.right;
                Rect rect4 = xfVar.c;
                if (rect4.left != i13 || rect4.top != i14 || rect4.right != i15 || rect4.bottom != compoundPaddingBottom || true != xfVar.k0) {
                    rect4.set(i13, i14, i15, compoundPaddingBottom);
                    xfVar.N = true;
                    xfVar.k0 = true;
                }
                xfVar.j(false);
                if (!g() || this.A0) {
                    return;
                }
                l();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        float f;
        EditText editText;
        super.onMeasure(i, i2);
        boolean z = this.H0;
        us usVar = this.h;
        if (!z) {
            usVar.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.H0 = true;
        }
        if (this.z != null && (editText = this.j) != null) {
            this.z.setGravity(editText.getGravity());
            this.z.setPadding(this.j.getCompoundPaddingLeft(), this.j.getCompoundPaddingTop(), this.j.getCompoundPaddingRight(), this.j.getCompoundPaddingBottom());
        }
        usVar.m();
        if (getHintMaxLines() == 1) {
            return;
        }
        int measuredWidth = (this.j.getMeasuredWidth() - this.j.getCompoundPaddingLeft()) - this.j.getCompoundPaddingRight();
        xf xfVar = this.B0;
        TextPaint textPaint = xfVar.P;
        textPaint.setTextSize(xfVar.i);
        textPaint.setTypeface(xfVar.s);
        textPaint.setLetterSpacing(xfVar.W);
        float f2 = measuredWidth;
        xfVar.i0 = xfVar.e(xfVar.f0, textPaint, xfVar.B, (xfVar.i / xfVar.h) * f2, xfVar.D).getHeight();
        textPaint.setTextSize(xfVar.h);
        textPaint.setTypeface(xfVar.v);
        textPaint.setLetterSpacing(xfVar.X);
        xfVar.j0 = xfVar.e(xfVar.e0, textPaint, xfVar.B, f2, xfVar.D).getHeight();
        EditText editText2 = this.j;
        Rect rect = this.e0;
        ko.a(this, editText2, rect);
        Rect rectD = d(rect);
        int i3 = rectD.left;
        int i4 = rectD.top;
        int i5 = rectD.right;
        int i6 = rectD.bottom;
        Rect rect2 = xfVar.d;
        if (rect2.left != i3 || rect2.top != i4 || rect2.right != i5 || rect2.bottom != i6) {
            rect2.set(i3, i4, i5, i6);
            xfVar.N = true;
        }
        v();
        a();
        if (this.j == null) {
            return;
        }
        int i7 = xfVar.j0;
        if (i7 != -1) {
            f = i7;
        } else {
            TextPaint textPaint2 = xfVar.P;
            textPaint2.setTextSize(xfVar.h);
            textPaint2.setTypeface(xfVar.v);
            textPaint2.setLetterSpacing(xfVar.X);
            f = -textPaint2.ascent();
        }
        if (this.x != null) {
            TextPaint textPaint3 = new TextPaint(129);
            textPaint3.set(this.z.getPaint());
            textPaint3.setTextSize(this.z.getTextSize());
            textPaint3.setTypeface(this.z.getTypeface());
            textPaint3.setLetterSpacing(this.z.getLetterSpacing());
            hy0 hy0Var = new hy0(this.x, textPaint3, measuredWidth);
            hy0Var.k = getLayoutDirection() == 1;
            hy0Var.j = true;
            float lineSpacingExtra = this.z.getLineSpacingExtra();
            float lineSpacingMultiplier = this.z.getLineSpacingMultiplier();
            hy0Var.g = lineSpacingExtra;
            hy0Var.h = lineSpacingMultiplier;
            hy0Var.m = new dk(this);
            f = (this.U == 1 ? xfVar.f() + this.V + this.i : 0.0f) + hy0Var.a().getHeight();
        }
        float fMax = Math.max(f, f);
        if (this.j.getMeasuredHeight() < fMax) {
            this.j.setMinimumHeight(Math.round(fMax));
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) throws Resources.NotFoundException {
        if (!(parcelable instanceof b11)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b11 b11Var = (b11) parcelable;
        super.onRestoreInstanceState(b11Var.f);
        setError(b11Var.h);
        if (b11Var.i) {
            post(new a9(14, this));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = i == 1;
        if (z != this.S) {
            ck ckVar = this.R.e;
            RectF rectF = this.g0;
            float fA = ckVar.a(rectF);
            float fA2 = this.R.f.a(rectF);
            float fA3 = this.R.h.a(rectF);
            float fA4 = this.R.g.a(rectF);
            su0 su0Var = this.R;
            ou1 ou1Var = su0Var.a;
            ou1 ou1Var2 = su0Var.b;
            ou1 ou1Var3 = su0Var.d;
            ou1 ou1Var4 = su0Var.c;
            fr frVar = new fr(0);
            fr frVar2 = new fr(0);
            fr frVar3 = new fr(0);
            fr frVar4 = new fr(0);
            l lVar = new l(fA2);
            l lVar2 = new l(fA);
            l lVar3 = new l(fA4);
            l lVar4 = new l(fA3);
            su0 su0Var2 = new su0();
            su0Var2.a = ou1Var2;
            su0Var2.b = ou1Var;
            su0Var2.c = ou1Var3;
            su0Var2.d = ou1Var4;
            su0Var2.e = lVar;
            su0Var2.f = lVar2;
            su0Var2.g = lVar4;
            su0Var2.h = lVar3;
            su0Var2.i = frVar;
            su0Var2.j = frVar2;
            su0Var2.k = frVar3;
            su0Var2.l = frVar4;
            this.S = z;
            setShapeAppearanceModel(su0Var2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        b11 b11Var = new b11(super.onSaveInstanceState());
        if (o()) {
            b11Var.h = getError();
        }
        us usVar = this.h;
        b11Var.i = usVar.n != 0 && usVar.l.i;
        return b11Var;
    }

    public final void p(Editable editable) throws Resources.NotFoundException {
        ((yo) this.t).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z = this.s;
        int i = this.r;
        if (i == -1) {
            this.u.setText(String.valueOf(length));
            this.u.setContentDescription(null);
            this.s = false;
        } else {
            this.s = length > i;
            Context context = getContext();
            this.u.setContentDescription(context.getString(this.s ? com.phuongpn.whousemywifi.networkscanner.R.string.character_counter_overflowed_content_description : com.phuongpn.whousemywifi.networkscanner.R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.r)));
            if (z != this.s) {
                q();
            }
            String str = wa.b;
            wa waVar = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? wa.e : wa.d;
            s7 s7Var = this.u;
            String string = getContext().getString(com.phuongpn.whousemywifi.networkscanner.R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.r));
            waVar.getClass();
            nb nbVar = w01.a;
            s7Var.setText(string != null ? waVar.c(string).toString() : null);
        }
        if (this.j == null || z == this.s) {
            return;
        }
        w(false, false);
        z();
        t();
    }

    public final void q() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        s7 s7Var = this.u;
        if (s7Var != null) {
            n(s7Var, this.s ? this.v : this.w);
            if (!this.s && (colorStateList2 = this.E) != null) {
                this.u.setTextColor(colorStateList2);
            }
            if (!this.s || (colorStateList = this.F) == null) {
                return;
            }
            this.u.setTextColor(colorStateList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r() throws android.content.res.Resources.NotFoundException {
        /*
            r4 = this;
            android.content.res.ColorStateList r0 = r4.G
            if (r0 == 0) goto L5
            goto L26
        L5:
            android.content.Context r0 = r4.getContext()
            r1 = 2130968847(0x7f04010f, float:1.754636E38)
            android.util.TypedValue r1 = defpackage.qb1.n(r0, r1)
            r2 = 0
            if (r1 != 0) goto L15
        L13:
            r0 = r2
            goto L26
        L15:
            int r3 = r1.resourceId
            if (r3 == 0) goto L1e
            android.content.res.ColorStateList r0 = defpackage.ob1.d(r0, r3)
            goto L26
        L1e:
            int r0 = r1.data
            if (r0 == 0) goto L13
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
        L26:
            android.widget.EditText r1 = r4.j
            if (r1 == 0) goto L51
            android.graphics.drawable.Drawable r1 = defpackage.r0.g(r1)
            if (r1 != 0) goto L31
            goto L51
        L31:
            android.widget.EditText r1 = r4.j
            android.graphics.drawable.Drawable r1 = defpackage.r0.g(r1)
            android.graphics.drawable.Drawable r1 = r1.mutate()
            boolean r2 = r4.o()
            if (r2 != 0) goto L49
            s7 r2 = r4.u
            if (r2 == 0) goto L4e
            boolean r2 = r4.s
            if (r2 == 0) goto L4e
        L49:
            android.content.res.ColorStateList r2 = r4.H
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
        if (this.d0 != i) {
            this.d0 = i;
            this.u0 = i;
            this.w0 = i;
            this.x0 = i;
            c();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(kj.a(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.u0 = defaultColor;
        this.d0 = defaultColor;
        this.v0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.w0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.x0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        c();
    }

    public void setBoxBackgroundMode(int i) throws Resources.NotFoundException {
        if (i == this.U) {
            return;
        }
        this.U = i;
        if (this.j != null) {
            k();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.V = i;
    }

    public void setBoxCornerFamily(int i) {
        f2 f2VarF = this.R.f();
        ck ckVar = this.R.e;
        f2VarF.a = ou1.l(i);
        f2VarF.e = ckVar;
        ck ckVar2 = this.R.f;
        f2VarF.b = ou1.l(i);
        f2VarF.f = ckVar2;
        ck ckVar3 = this.R.h;
        f2VarF.d = ou1.l(i);
        f2VarF.h = ckVar3;
        ck ckVar4 = this.R.g;
        f2VarF.c = ou1.l(i);
        f2VarF.g = ckVar4;
        this.R = f2VarF.a();
        c();
    }

    public void setBoxStrokeColor(int i) throws Resources.NotFoundException {
        if (this.s0 != i) {
            this.s0 = i;
            z();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) throws Resources.NotFoundException {
        if (colorStateList.isStateful()) {
            this.q0 = colorStateList.getDefaultColor();
            this.y0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.r0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.s0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.s0 != colorStateList.getDefaultColor()) {
            this.s0 = colorStateList.getDefaultColor();
        }
        z();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) throws Resources.NotFoundException {
        if (this.t0 != colorStateList) {
            this.t0 = colorStateList;
            z();
        }
    }

    public void setBoxStrokeWidth(int i) throws Resources.NotFoundException {
        this.a0 = i;
        z();
    }

    public void setBoxStrokeWidthFocused(int i) throws Resources.NotFoundException {
        this.b0 = i;
        z();
    }

    public void setBoxStrokeWidthFocusedResource(int i) throws Resources.NotFoundException {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) throws Resources.NotFoundException {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) throws Resources.NotFoundException {
        if (this.q != z) {
            q20 q20Var = this.p;
            if (z) {
                s7 s7Var = new s7(getContext(), null);
                this.u = s7Var;
                s7Var.setId(com.phuongpn.whousemywifi.networkscanner.R.id.textinput_counter);
                Typeface typeface = this.h0;
                if (typeface != null) {
                    this.u.setTypeface(typeface);
                }
                this.u.setMaxLines(1);
                q20Var.a(this.u, 2);
                ((ViewGroup.MarginLayoutParams) this.u.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(com.phuongpn.whousemywifi.networkscanner.R.dimen.mtrl_textinput_counter_margin_start));
                q();
                if (this.u != null) {
                    EditText editText = this.j;
                    p(editText != null ? editText.getText() : null);
                }
            } else {
                q20Var.g(this.u, 2);
                this.u = null;
            }
            this.q = z;
        }
    }

    public void setCounterMaxLength(int i) throws Resources.NotFoundException {
        if (this.r != i) {
            if (i > 0) {
                this.r = i;
            } else {
                this.r = -1;
            }
            if (!this.q || this.u == null) {
                return;
            }
            EditText editText = this.j;
            p(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.v != i) {
            this.v = i;
            q();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.F != colorStateList) {
            this.F = colorStateList;
            q();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.w != i) {
            this.w = i;
            q();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.E != colorStateList) {
            this.E = colorStateList;
            q();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) throws Resources.NotFoundException {
        if (this.G != colorStateList) {
            this.G = colorStateList;
            r();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) throws Resources.NotFoundException {
        if (this.H != colorStateList) {
            this.H = colorStateList;
            if (o() || (this.u != null && this.s)) {
                r();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.o0 = colorStateList;
        this.p0 = colorStateList;
        if (this.j != null) {
            w(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        m(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.h.l.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.h.l.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        us usVar = this.h;
        CharSequence text = i != 0 ? usVar.getResources().getText(i) : null;
        CheckableImageButton checkableImageButton = usVar.l;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i) {
        us usVar = this.h;
        Drawable drawableH = i != 0 ? ob1.h(usVar.getContext(), i) : null;
        TextInputLayout textInputLayout = usVar.f;
        CheckableImageButton checkableImageButton = usVar.l;
        checkableImageButton.setImageDrawable(drawableH);
        if (drawableH != null) {
            bd2.b(textInputLayout, checkableImageButton, usVar.p, usVar.q);
            bd2.t(textInputLayout, checkableImageButton, usVar.p);
        }
    }

    public void setEndIconMinSize(int i) {
        us usVar = this.h;
        if (i < 0) {
            usVar.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i != usVar.r) {
            usVar.r = i;
            CheckableImageButton checkableImageButton = usVar.l;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
            CheckableImageButton checkableImageButton2 = usVar.h;
            checkableImageButton2.setMinimumWidth(i);
            checkableImageButton2.setMinimumHeight(i);
        }
    }

    public void setEndIconMode(int i) {
        this.h.g(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        us usVar = this.h;
        CheckableImageButton checkableImageButton = usVar.l;
        View.OnLongClickListener onLongClickListener = usVar.t;
        checkableImageButton.setOnClickListener(onClickListener);
        bd2.w(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        us usVar = this.h;
        usVar.t = onLongClickListener;
        CheckableImageButton checkableImageButton = usVar.l;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        bd2.w(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        us usVar = this.h;
        usVar.s = scaleType;
        usVar.l.setScaleType(scaleType);
        usVar.h.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        us usVar = this.h;
        if (usVar.p != colorStateList) {
            usVar.p = colorStateList;
            bd2.b(usVar.f, usVar.l, colorStateList, usVar.q);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        us usVar = this.h;
        if (usVar.q != mode) {
            usVar.q = mode;
            bd2.b(usVar.f, usVar.l, usVar.p, mode);
        }
    }

    public void setEndIconVisible(boolean z) {
        this.h.h(z);
    }

    public void setError(CharSequence charSequence) throws Resources.NotFoundException {
        q20 q20Var = this.p;
        if (!q20Var.q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            q20Var.f();
            return;
        }
        q20Var.c();
        q20Var.p = charSequence;
        q20Var.r.setText(charSequence);
        int i = q20Var.n;
        if (i != 1) {
            q20Var.o = 1;
        }
        q20Var.i(i, q20Var.o, q20Var.h(q20Var.r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        q20 q20Var = this.p;
        q20Var.t = i;
        s7 s7Var = q20Var.r;
        if (s7Var != null) {
            s7Var.setAccessibilityLiveRegion(i);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        q20 q20Var = this.p;
        q20Var.s = charSequence;
        s7 s7Var = q20Var.r;
        if (s7Var != null) {
            s7Var.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) throws Resources.NotFoundException {
        q20 q20Var = this.p;
        TextInputLayout textInputLayout = q20Var.h;
        if (q20Var.q == z) {
            return;
        }
        q20Var.c();
        if (z) {
            s7 s7Var = new s7(q20Var.g, null);
            q20Var.r = s7Var;
            s7Var.setId(com.phuongpn.whousemywifi.networkscanner.R.id.textinput_error);
            q20Var.r.setTextAlignment(5);
            Typeface typeface = q20Var.B;
            if (typeface != null) {
                q20Var.r.setTypeface(typeface);
            }
            int i = q20Var.u;
            q20Var.u = i;
            s7 s7Var2 = q20Var.r;
            if (s7Var2 != null) {
                q20Var.h.n(s7Var2, i);
            }
            ColorStateList colorStateList = q20Var.v;
            q20Var.v = colorStateList;
            s7 s7Var3 = q20Var.r;
            if (s7Var3 != null && colorStateList != null) {
                s7Var3.setTextColor(colorStateList);
            }
            CharSequence charSequence = q20Var.s;
            q20Var.s = charSequence;
            s7 s7Var4 = q20Var.r;
            if (s7Var4 != null) {
                s7Var4.setContentDescription(charSequence);
            }
            int i2 = q20Var.t;
            q20Var.t = i2;
            s7 s7Var5 = q20Var.r;
            if (s7Var5 != null) {
                s7Var5.setAccessibilityLiveRegion(i2);
            }
            q20Var.r.setVisibility(4);
            q20Var.a(q20Var.r, 0);
        } else {
            q20Var.f();
            q20Var.g(q20Var.r, 0);
            q20Var.r = null;
            textInputLayout.t();
            textInputLayout.z();
        }
        q20Var.q = z;
    }

    public void setErrorIconDrawable(int i) {
        us usVar = this.h;
        usVar.i(i != 0 ? ob1.h(usVar.getContext(), i) : null);
        bd2.t(usVar.f, usVar.h, usVar.i);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        us usVar = this.h;
        CheckableImageButton checkableImageButton = usVar.h;
        View.OnLongClickListener onLongClickListener = usVar.k;
        checkableImageButton.setOnClickListener(onClickListener);
        bd2.w(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        us usVar = this.h;
        usVar.k = onLongClickListener;
        CheckableImageButton checkableImageButton = usVar.h;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        bd2.w(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        us usVar = this.h;
        if (usVar.i != colorStateList) {
            usVar.i = colorStateList;
            bd2.b(usVar.f, usVar.h, colorStateList, usVar.j);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        us usVar = this.h;
        if (usVar.j != mode) {
            usVar.j = mode;
            bd2.b(usVar.f, usVar.h, usVar.i, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        q20 q20Var = this.p;
        q20Var.u = i;
        s7 s7Var = q20Var.r;
        if (s7Var != null) {
            q20Var.h.n(s7Var, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        q20 q20Var = this.p;
        q20Var.v = colorStateList;
        s7 s7Var = q20Var.r;
        if (s7Var == null || colorStateList == null) {
            return;
        }
        s7Var.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.C0 != z) {
            this.C0 = z;
            w(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) throws Resources.NotFoundException {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        q20 q20Var = this.p;
        if (zIsEmpty) {
            if (q20Var.x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!q20Var.x) {
            setHelperTextEnabled(true);
        }
        q20Var.c();
        q20Var.w = charSequence;
        q20Var.y.setText(charSequence);
        int i = q20Var.n;
        if (i != 2) {
            q20Var.o = 2;
        }
        q20Var.i(i, q20Var.o, q20Var.h(q20Var.y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        q20 q20Var = this.p;
        q20Var.A = colorStateList;
        s7 s7Var = q20Var.y;
        if (s7Var == null || colorStateList == null) {
            return;
        }
        s7Var.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) throws Resources.NotFoundException {
        q20 q20Var = this.p;
        TextInputLayout textInputLayout = q20Var.h;
        if (q20Var.x == z) {
            return;
        }
        q20Var.c();
        if (z) {
            s7 s7Var = new s7(q20Var.g, null);
            q20Var.y = s7Var;
            s7Var.setId(com.phuongpn.whousemywifi.networkscanner.R.id.textinput_helper_text);
            q20Var.y.setTextAlignment(5);
            Typeface typeface = q20Var.B;
            if (typeface != null) {
                q20Var.y.setTypeface(typeface);
            }
            q20Var.y.setVisibility(4);
            q20Var.y.setAccessibilityLiveRegion(1);
            int i = q20Var.z;
            q20Var.z = i;
            s7 s7Var2 = q20Var.y;
            if (s7Var2 != null) {
                s7Var2.setTextAppearance(i);
            }
            ColorStateList colorStateList = q20Var.A;
            q20Var.A = colorStateList;
            s7 s7Var3 = q20Var.y;
            if (s7Var3 != null && colorStateList != null) {
                s7Var3.setTextColor(colorStateList);
            }
            q20Var.a(q20Var.y, 1);
            q20Var.y.setAccessibilityDelegate(new p20(q20Var));
        } else {
            q20Var.c();
            int i2 = q20Var.n;
            if (i2 == 2) {
                q20Var.o = 0;
            }
            q20Var.i(i2, q20Var.o, q20Var.h(q20Var.y, ""));
            q20Var.g(q20Var.y, 1);
            q20Var.y = null;
            textInputLayout.t();
            textInputLayout.z();
        }
        q20Var.x = z;
    }

    public void setHelperTextTextAppearance(int i) {
        q20 q20Var = this.p;
        q20Var.z = i;
        s7 s7Var = q20Var.y;
        if (s7Var != null) {
            s7Var.setTextAppearance(i);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.I) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.D0 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.I) {
            this.I = z;
            if (z) {
                CharSequence hint = this.j.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.J)) {
                        setHint(hint);
                    }
                    this.j.setHint((CharSequence) null);
                }
                this.K = true;
            } else {
                this.K = false;
                if (!TextUtils.isEmpty(this.J) && TextUtils.isEmpty(this.j.getHint())) {
                    this.j.setHint(this.J);
                }
                setHintInternal(null);
            }
            if (this.j != null) {
                v();
            }
        }
    }

    public void setHintMaxLines(int i) {
        xf xfVar = this.B0;
        if (i != xfVar.f0) {
            xfVar.f0 = i;
            xfVar.j(false);
        }
        if (i != xfVar.e0) {
            xfVar.e0 = i;
            xfVar.j(false);
        }
        requestLayout();
    }

    public void setHintTextAppearance(int i) {
        xf xfVar = this.B0;
        TextInputLayout textInputLayout = xfVar.a;
        u01 u01Var = new u01(textInputLayout.getContext(), i);
        ColorStateList colorStateList = u01Var.k;
        if (colorStateList != null) {
            xfVar.k = colorStateList;
        }
        float f = u01Var.l;
        if (f != 0.0f) {
            xfVar.i = f;
        }
        ColorStateList colorStateList2 = u01Var.a;
        if (colorStateList2 != null) {
            xfVar.V = colorStateList2;
        }
        xfVar.T = u01Var.f;
        xfVar.U = u01Var.g;
        xfVar.S = u01Var.h;
        xfVar.W = u01Var.j;
        hd hdVar = xfVar.z;
        if (hdVar != null) {
            hdVar.s = true;
        }
        vg0 vg0Var = new vg0(3, xfVar);
        u01Var.a();
        xfVar.z = new hd(vg0Var, u01Var.p);
        u01Var.b(textInputLayout.getContext(), xfVar.z);
        xfVar.j(false);
        this.p0 = xfVar.k;
        if (this.j != null) {
            w(false, false);
            v();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.p0 != colorStateList) {
            if (this.o0 == null) {
                xf xfVar = this.B0;
                if (xfVar.k != colorStateList) {
                    xfVar.k = colorStateList;
                    xfVar.j(false);
                }
            }
            this.p0 = colorStateList;
            if (this.j != null) {
                w(false, false);
            }
        }
    }

    public void setLengthCounter(a11 a11Var) {
        this.t = a11Var;
    }

    public void setMaxEms(int i) {
        this.m = i;
        EditText editText = this.j;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public void setMaxWidth(int i) {
        this.o = i;
        EditText editText = this.j;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.l = i;
        EditText editText = this.j;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public void setMinWidth(int i) {
        this.n = i;
        EditText editText = this.j;
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
        us usVar = this.h;
        usVar.l.setContentDescription(i != 0 ? usVar.getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        us usVar = this.h;
        usVar.l.setImageDrawable(i != 0 ? ob1.h(usVar.getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        us usVar = this.h;
        if (z && usVar.n != 1) {
            usVar.g(1);
        } else if (z) {
            usVar.getClass();
        } else {
            usVar.g(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        us usVar = this.h;
        usVar.p = colorStateList;
        bd2.b(usVar.f, usVar.l, colorStateList, usVar.q);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        us usVar = this.h;
        usVar.q = mode;
        bd2.b(usVar.f, usVar.l, usVar.p, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.z == null) {
            s7 s7Var = new s7(getContext(), null);
            this.z = s7Var;
            s7Var.setId(com.phuongpn.whousemywifi.networkscanner.R.id.textinput_placeholder);
            this.z.setImportantForAccessibility(1);
            this.z.setAccessibilityLiveRegion(1);
            bu buVarF = f();
            this.C = buVarF;
            buVarF.g = 67L;
            this.D = f();
            setPlaceholderTextAppearance(this.B);
            setPlaceholderTextColor(this.A);
            e61.l(this.z, new yb0(4));
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.y) {
                setPlaceholderTextEnabled(true);
            }
            this.x = charSequence;
        }
        EditText editText = this.j;
        x(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.B = i;
        s7 s7Var = this.z;
        if (s7Var != null) {
            s7Var.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.A != colorStateList) {
            this.A = colorStateList;
            s7 s7Var = this.z;
            if (s7Var == null || colorStateList == null) {
                return;
            }
            s7Var.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        wx0 wx0Var = this.g;
        wx0Var.getClass();
        wx0Var.h = TextUtils.isEmpty(charSequence) ? null : charSequence;
        wx0Var.g.setText(charSequence);
        wx0Var.e();
    }

    public void setPrefixTextAppearance(int i) {
        this.g.g.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.g.g.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(su0 su0Var) {
        nc0 nc0Var = this.L;
        if (nc0Var == null || nc0Var.g.a == su0Var) {
            return;
        }
        this.R = su0Var;
        c();
    }

    public void setStartIconCheckable(boolean z) {
        this.g.i.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? ob1.h(getContext(), i) : null);
    }

    public void setStartIconMinSize(int i) {
        wx0 wx0Var = this.g;
        if (i < 0) {
            wx0Var.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i != wx0Var.l) {
            wx0Var.l = i;
            CheckableImageButton checkableImageButton = wx0Var.i;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        wx0 wx0Var = this.g;
        CheckableImageButton checkableImageButton = wx0Var.i;
        View.OnLongClickListener onLongClickListener = wx0Var.n;
        checkableImageButton.setOnClickListener(onClickListener);
        bd2.w(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        wx0 wx0Var = this.g;
        wx0Var.n = onLongClickListener;
        CheckableImageButton checkableImageButton = wx0Var.i;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        bd2.w(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        wx0 wx0Var = this.g;
        wx0Var.m = scaleType;
        wx0Var.i.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        wx0 wx0Var = this.g;
        if (wx0Var.j != colorStateList) {
            wx0Var.j = colorStateList;
            bd2.b(wx0Var.f, wx0Var.i, colorStateList, wx0Var.k);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        wx0 wx0Var = this.g;
        if (wx0Var.k != mode) {
            wx0Var.k = mode;
            bd2.b(wx0Var.f, wx0Var.i, wx0Var.j, mode);
        }
    }

    public void setStartIconVisible(boolean z) {
        this.g.c(z);
    }

    public void setSuffixText(CharSequence charSequence) {
        us usVar = this.h;
        usVar.getClass();
        usVar.u = TextUtils.isEmpty(charSequence) ? null : charSequence;
        usVar.v.setText(charSequence);
        usVar.n();
    }

    public void setSuffixTextAppearance(int i) {
        this.h.v.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.h.v.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(z01 z01Var) {
        EditText editText = this.j;
        if (editText != null) {
            e61.l(editText, z01Var);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.h0) {
            this.h0 = typeface;
            this.B0.n(typeface);
            q20 q20Var = this.p;
            if (typeface != q20Var.B) {
                q20Var.B = typeface;
                s7 s7Var = q20Var.r;
                if (s7Var != null) {
                    s7Var.setTypeface(typeface);
                }
                s7 s7Var2 = q20Var.y;
                if (s7Var2 != null) {
                    s7Var2.setTypeface(typeface);
                }
            }
            s7 s7Var3 = this.u;
            if (s7Var3 != null) {
                s7Var3.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        Drawable background;
        s7 s7Var;
        EditText editText = this.j;
        if (editText == null || this.U != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = yp.a;
        Drawable drawableMutate = background.mutate();
        if (o()) {
            drawableMutate.setColorFilter(l6.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.s && (s7Var = this.u) != null) {
            drawableMutate.setColorFilter(l6.c(s7Var.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            drawableMutate.clearColorFilter();
            this.j.refreshDrawableState();
        }
    }

    public final void u() {
        EditText editText = this.j;
        if (editText == null || this.L == null) {
            return;
        }
        if ((this.O || editText.getBackground() == null) && this.U != 0) {
            this.j.setBackground(getEditTextBoxBackground());
            this.O = true;
        }
    }

    public final void v() {
        if (this.U != 1) {
            FrameLayout frameLayout = this.f;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int iE = e();
            if (iE != layoutParams.topMargin) {
                layoutParams.topMargin = iE;
                frameLayout.requestLayout();
            }
        }
    }

    public final void w(boolean z, boolean z2) {
        ColorStateList colorStateList;
        s7 s7Var;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.j;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.j;
        boolean z4 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.o0;
        xf xfVar = this.B0;
        if (colorStateList2 != null) {
            xfVar.k(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.o0;
            xfVar.k(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.y0) : this.y0));
        } else if (o()) {
            s7 s7Var2 = this.p.r;
            xfVar.k(s7Var2 != null ? s7Var2.getTextColors() : null);
        } else if (this.s && (s7Var = this.u) != null) {
            xfVar.k(s7Var.getTextColors());
        } else if (z4 && (colorStateList = this.p0) != null && xfVar.k != colorStateList) {
            xfVar.k = colorStateList;
            xfVar.j(false);
        }
        us usVar = this.h;
        wx0 wx0Var = this.g;
        if (z3 || !this.C0 || (isEnabled() && z4)) {
            if (z2 || this.A0) {
                ValueAnimator valueAnimator = this.E0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.E0.cancel();
                }
                if (z && this.D0) {
                    b(1.0f);
                } else {
                    xfVar.m(1.0f);
                }
                this.A0 = false;
                if (g()) {
                    l();
                }
                EditText editText3 = this.j;
                x(editText3 != null ? editText3.getText() : null);
                wx0Var.o = false;
                wx0Var.e();
                usVar.w = false;
                usVar.n();
                return;
            }
            return;
        }
        if (z2 || !this.A0) {
            ValueAnimator valueAnimator2 = this.E0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.E0.cancel();
            }
            if (z && this.D0) {
                b(0.0f);
            } else {
                xfVar.m(0.0f);
            }
            if (g() && !((wl) this.L).M.s.isEmpty() && g()) {
                ((wl) this.L).A(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.A0 = true;
            s7 s7Var3 = this.z;
            if (s7Var3 != null && this.y) {
                s7Var3.setText((CharSequence) null);
                z21.a(this.f, this.D);
                this.z.setVisibility(4);
            }
            wx0Var.o = true;
            wx0Var.e();
            usVar.w = true;
            usVar.n();
        }
    }

    public final void x(Editable editable) {
        ((yo) this.t).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.f;
        if (length != 0 || this.A0) {
            s7 s7Var = this.z;
            if (s7Var == null || !this.y) {
                return;
            }
            s7Var.setText((CharSequence) null);
            z21.a(frameLayout, this.D);
            this.z.setVisibility(4);
            return;
        }
        if (this.z == null || !this.y || TextUtils.isEmpty(this.x)) {
            return;
        }
        this.z.setText(this.x);
        z21.a(frameLayout, this.C);
        this.z.setVisibility(0);
        this.z.bringToFront();
    }

    public final void y(boolean z, boolean z2) {
        int defaultColor = this.t0.getDefaultColor();
        int colorForState = this.t0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.t0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z) {
            this.c0 = colorForState2;
        } else if (z2) {
            this.c0 = colorForState;
        } else {
            this.c0 = defaultColor;
        }
    }

    public final void z() throws Resources.NotFoundException {
        s7 s7Var;
        EditText editText;
        EditText editText2;
        if (this.L == null || this.U == 0) {
            return;
        }
        boolean z = false;
        boolean z2 = isFocused() || ((editText2 = this.j) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.j) != null && editText.isHovered())) {
            z = true;
        }
        if (!isEnabled()) {
            this.c0 = this.y0;
        } else if (o()) {
            if (this.t0 != null) {
                y(z2, z);
            } else {
                this.c0 = getErrorCurrentTextColors();
            }
        } else if (!this.s || (s7Var = this.u) == null) {
            if (z2) {
                this.c0 = this.s0;
            } else if (z) {
                this.c0 = this.r0;
            } else {
                this.c0 = this.q0;
            }
        } else if (this.t0 != null) {
            y(z2, z);
        } else {
            this.c0 = s7Var.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            r();
        }
        us usVar = this.h;
        TextInputLayout textInputLayout = usVar.f;
        CheckableImageButton checkableImageButton = usVar.l;
        TextInputLayout textInputLayout2 = usVar.f;
        usVar.l();
        bd2.t(textInputLayout2, usVar.h, usVar.i);
        bd2.t(textInputLayout2, checkableImageButton, usVar.p);
        if (usVar.b() instanceof tq) {
            if (!textInputLayout.o() || checkableImageButton.getDrawable() == null) {
                bd2.b(textInputLayout, checkableImageButton, usVar.p, usVar.q);
            } else {
                Drawable drawableMutate = checkableImageButton.getDrawable().mutate();
                drawableMutate.setTint(textInputLayout.getErrorCurrentTextColors());
                checkableImageButton.setImageDrawable(drawableMutate);
            }
        }
        wx0 wx0Var = this.g;
        bd2.t(wx0Var.f, wx0Var.i, wx0Var.j);
        if (this.U == 2) {
            int i = this.W;
            if (z2 && isEnabled()) {
                this.W = this.b0;
            } else {
                this.W = this.a0;
            }
            if (this.W != i && g() && !this.A0) {
                if (g()) {
                    ((wl) this.L).A(0.0f, 0.0f, 0.0f, 0.0f);
                }
                l();
            }
        }
        if (this.U == 1) {
            if (!isEnabled()) {
                this.d0 = this.v0;
            } else if (z && !z2) {
                this.d0 = this.x0;
            } else if (z2) {
                this.d0 = this.w0;
            } else {
                this.d0 = this.u0;
            }
        }
        c();
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.g.i;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.g.b(drawable);
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.h.l.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.h.l.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.h.i(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.h.l;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        us usVar = this.h;
        TextInputLayout textInputLayout = usVar.f;
        CheckableImageButton checkableImageButton = usVar.l;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            bd2.b(textInputLayout, checkableImageButton, usVar.p, usVar.q);
            bd2.t(textInputLayout, checkableImageButton, usVar.p);
        }
    }
}
