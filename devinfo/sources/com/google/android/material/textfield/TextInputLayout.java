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
import com.facebook.shimmer.d;
import com.google.android.gms.internal.measurement.z3;
import com.google.android.gms.internal.play_billing.m1;
import com.google.android.material.internal.CheckableImageButton;
import e4.v0;
import ed.j;
import ed.n;
import ed.o;
import i0.f;
import ig.l;
import j6.h;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import je.y;
import kd.a0;
import kd.b0;
import kd.g;
import kd.r;
import kd.s;
import kd.v;
import kd.x;
import kd.z;
import md.a;
import nm.d0;
import p.i1;
import r5.c;
import t6.i0;
import zc.b;
import zc.i;
import zc.m;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final int[][] D0 = {new int[]{R.attr.state_pressed}, new int[0]};
    public ColorStateList A;
    public boolean A0;
    public ColorStateList B;
    public boolean B0;
    public ColorStateList C;
    public boolean C0;
    public boolean D;
    public CharSequence E;
    public boolean F;
    public j G;
    public j H;
    public StateListDrawable I;
    public boolean J;
    public j K;
    public j L;
    public o M;
    public boolean N;
    public final int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public final Rect W;

    /* renamed from: a, reason: collision with root package name */
    public final FrameLayout f20595a;

    /* renamed from: a0, reason: collision with root package name */
    public final Rect f20596a0;

    /* renamed from: b, reason: collision with root package name */
    public final x f20597b;

    /* renamed from: b0, reason: collision with root package name */
    public final RectF f20598b0;

    /* renamed from: c, reason: collision with root package name */
    public final kd.o f20599c;

    /* renamed from: c0, reason: collision with root package name */
    public Typeface f20600c0;

    /* renamed from: d, reason: collision with root package name */
    public final int f20601d;

    /* renamed from: d0, reason: collision with root package name */
    public ColorDrawable f20602d0;

    /* renamed from: e, reason: collision with root package name */
    public EditText f20603e;

    /* renamed from: e0, reason: collision with root package name */
    public int f20604e0;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f20605f;

    /* renamed from: f0, reason: collision with root package name */
    public final LinkedHashSet f20606f0;
    public int g;

    /* renamed from: g0, reason: collision with root package name */
    public ColorDrawable f20607g0;

    /* renamed from: h, reason: collision with root package name */
    public int f20608h;

    /* renamed from: h0, reason: collision with root package name */
    public int f20609h0;

    /* renamed from: i, reason: collision with root package name */
    public int f20610i;

    /* renamed from: i0, reason: collision with root package name */
    public Drawable f20611i0;
    public int j;

    /* renamed from: j0, reason: collision with root package name */
    public ColorStateList f20612j0;

    /* renamed from: k, reason: collision with root package name */
    public final s f20613k;

    /* renamed from: k0, reason: collision with root package name */
    public ColorStateList f20614k0;

    /* renamed from: l, reason: collision with root package name */
    public boolean f20615l;

    /* renamed from: l0, reason: collision with root package name */
    public int f20616l0;

    /* renamed from: m, reason: collision with root package name */
    public int f20617m;

    /* renamed from: m0, reason: collision with root package name */
    public int f20618m0;

    /* renamed from: n, reason: collision with root package name */
    public boolean f20619n;

    /* renamed from: n0, reason: collision with root package name */
    public int f20620n0;

    /* renamed from: o, reason: collision with root package name */
    public a0 f20621o;

    /* renamed from: o0, reason: collision with root package name */
    public ColorStateList f20622o0;

    /* renamed from: p, reason: collision with root package name */
    public AppCompatTextView f20623p;

    /* renamed from: p0, reason: collision with root package name */
    public int f20624p0;

    /* renamed from: q, reason: collision with root package name */
    public int f20625q;

    /* renamed from: q0, reason: collision with root package name */
    public int f20626q0;

    /* renamed from: r, reason: collision with root package name */
    public int f20627r;

    /* renamed from: r0, reason: collision with root package name */
    public int f20628r0;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f20629s;

    /* renamed from: s0, reason: collision with root package name */
    public int f20630s0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f20631t;

    /* renamed from: t0, reason: collision with root package name */
    public int f20632t0;

    /* renamed from: u, reason: collision with root package name */
    public AppCompatTextView f20633u;

    /* renamed from: u0, reason: collision with root package name */
    public int f20634u0;

    /* renamed from: v, reason: collision with root package name */
    public ColorStateList f20635v;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f20636v0;

    /* renamed from: w, reason: collision with root package name */
    public int f20637w;

    /* renamed from: w0, reason: collision with root package name */
    public final b f20638w0;

    /* renamed from: x, reason: collision with root package name */
    public h f20639x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f20640x0;

    /* renamed from: y, reason: collision with root package name */
    public h f20641y;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f20642y0;

    /* renamed from: z, reason: collision with root package name */
    public ColorStateList f20643z;

    /* renamed from: z0, reason: collision with root package name */
    public ValueAnimator f20644z0;

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, com.liuzh.deviceinfo.R.attr.textInputStyle, com.liuzh.deviceinfo.R.style.Widget_Design_TextInputLayout), attributeSet, com.liuzh.deviceinfo.R.attr.textInputStyle);
        this.g = -1;
        this.f20608h = -1;
        this.f20610i = -1;
        this.j = -1;
        this.f20613k = new s(this);
        this.f20621o = new y(2);
        this.W = new Rect();
        this.f20596a0 = new Rect();
        this.f20598b0 = new RectF();
        this.f20606f0 = new LinkedHashSet();
        b bVar = new b(this);
        this.f20638w0 = bVar;
        this.C0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f20595a = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = jc.a.f27482a;
        bVar.R = linearInterpolator;
        bVar.j(false);
        bVar.Q = linearInterpolator;
        bVar.j(false);
        if (bVar.g != 8388659) {
            bVar.g = 8388659;
            bVar.j(false);
        }
        m.a(context2, attributeSet, com.liuzh.deviceinfo.R.attr.textInputStyle, com.liuzh.deviceinfo.R.style.Widget_Design_TextInputLayout);
        int[] iArr = ic.a.L;
        m.b(context2, attributeSet, iArr, com.liuzh.deviceinfo.R.attr.textInputStyle, com.liuzh.deviceinfo.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 50);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.liuzh.deviceinfo.R.attr.textInputStyle, com.liuzh.deviceinfo.R.style.Widget_Design_TextInputLayout);
        f fVar = new f(context2, typedArrayObtainStyledAttributes);
        x xVar = new x(this, fVar);
        this.f20597b = xVar;
        this.D = typedArrayObtainStyledAttributes.getBoolean(48, true);
        setHint(typedArrayObtainStyledAttributes.getText(4));
        this.f20642y0 = typedArrayObtainStyledAttributes.getBoolean(47, true);
        this.f20640x0 = typedArrayObtainStyledAttributes.getBoolean(42, true);
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
        this.M = o.c(context2, attributeSet, com.liuzh.deviceinfo.R.attr.textInputStyle, com.liuzh.deviceinfo.R.style.Widget_Design_TextInputLayout).a();
        this.O = context2.getResources().getDimensionPixelOffset(com.liuzh.deviceinfo.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.Q = typedArrayObtainStyledAttributes.getDimensionPixelOffset(9, 0);
        this.f20601d = getResources().getDimensionPixelSize(com.liuzh.deviceinfo.R.dimen.m3_multiline_hint_filled_text_extra_space);
        this.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(com.liuzh.deviceinfo.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.T = typedArrayObtainStyledAttributes.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(com.liuzh.deviceinfo.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.R = this.S;
        float dimension = typedArrayObtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = typedArrayObtainStyledAttributes.getDimension(11, -1.0f);
        n nVarG = this.M.g();
        if (dimension >= 0.0f) {
            nVarG.f23346e = new ed.a(dimension);
        }
        if (dimension2 >= 0.0f) {
            nVarG.f23347f = new ed.a(dimension2);
        }
        if (dimension3 >= 0.0f) {
            nVarG.g = new ed.a(dimension3);
        }
        if (dimension4 >= 0.0f) {
            nVarG.f23348h = new ed.a(dimension4);
        }
        this.M = nVarG.a();
        ColorStateList colorStateListK = jm.a.k(context2, fVar, 7);
        if (colorStateListK != null) {
            int defaultColor = colorStateListK.getDefaultColor();
            this.f20624p0 = defaultColor;
            this.V = defaultColor;
            if (colorStateListK.isStateful()) {
                this.f20626q0 = colorStateListK.getColorForState(new int[]{-16842910}, -1);
                this.f20628r0 = colorStateListK.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f20630s0 = colorStateListK.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f20628r0 = this.f20624p0;
                ColorStateList colorStateListR = wd.b.r(com.liuzh.deviceinfo.R.color.mtrl_filled_background_color, context2);
                this.f20626q0 = colorStateListR.getColorForState(new int[]{-16842910}, -1);
                this.f20630s0 = colorStateListR.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.V = 0;
            this.f20624p0 = 0;
            this.f20626q0 = 0;
            this.f20628r0 = 0;
            this.f20630s0 = 0;
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            ColorStateList colorStateListY = fVar.y(1);
            this.f20614k0 = colorStateListY;
            this.f20612j0 = colorStateListY;
        }
        ColorStateList colorStateListK2 = jm.a.k(context2, fVar, 14);
        this.f20620n0 = typedArrayObtainStyledAttributes.getColor(14, 0);
        this.f20616l0 = context2.getColor(com.liuzh.deviceinfo.R.color.mtrl_textinput_default_box_stroke_color);
        this.f20632t0 = context2.getColor(com.liuzh.deviceinfo.R.color.mtrl_textinput_disabled_color);
        this.f20618m0 = context2.getColor(com.liuzh.deviceinfo.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateListK2 != null) {
            setBoxStrokeColorStateList(colorStateListK2);
        }
        if (typedArrayObtainStyledAttributes.hasValue(15)) {
            setBoxStrokeErrorColor(jm.a.k(context2, fVar, 15));
        }
        if (typedArrayObtainStyledAttributes.getResourceId(50, -1) != -1) {
            setHintTextAppearance(typedArrayObtainStyledAttributes.getResourceId(50, 0));
        }
        this.B = fVar.y(24);
        this.C = fVar.y(25);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(40, 0);
        CharSequence text = typedArrayObtainStyledAttributes.getText(35);
        int i4 = typedArrayObtainStyledAttributes.getInt(34, 1);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(36, false);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(45, 0);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(44, false);
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(43);
        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(58, 0);
        CharSequence text3 = typedArrayObtainStyledAttributes.getText(57);
        boolean z11 = typedArrayObtainStyledAttributes.getBoolean(18, false);
        setCounterMaxLength(typedArrayObtainStyledAttributes.getInt(19, -1));
        this.f20627r = typedArrayObtainStyledAttributes.getResourceId(22, 0);
        this.f20625q = typedArrayObtainStyledAttributes.getResourceId(20, 0);
        setBoxBackgroundMode(typedArrayObtainStyledAttributes.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i4);
        setCounterOverflowTextAppearance(this.f20625q);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.f20627r);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (typedArrayObtainStyledAttributes.hasValue(41)) {
            setErrorTextColor(fVar.y(41));
        }
        if (typedArrayObtainStyledAttributes.hasValue(46)) {
            setHelperTextColor(fVar.y(46));
        }
        if (typedArrayObtainStyledAttributes.hasValue(51)) {
            setHintTextColor(fVar.y(51));
        }
        if (typedArrayObtainStyledAttributes.hasValue(23)) {
            setCounterTextColor(fVar.y(23));
        }
        if (typedArrayObtainStyledAttributes.hasValue(21)) {
            setCounterOverflowTextColor(fVar.y(21));
        }
        if (typedArrayObtainStyledAttributes.hasValue(59)) {
            setPlaceholderTextColor(fVar.y(59));
        }
        kd.o oVar = new kd.o(this, fVar);
        this.f20599c = oVar;
        boolean z12 = typedArrayObtainStyledAttributes.getBoolean(0, true);
        setHintMaxLines(typedArrayObtainStyledAttributes.getInt(49, 1));
        fVar.M();
        setImportantForAccessibility(2);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(1);
        }
        frameLayout.addView(xVar);
        frameLayout.addView(oVar);
        addView(frameLayout);
        setEnabled(z12);
        setHelperTextEnabled(z10);
        setErrorEnabled(z3);
        setCounterEnabled(z11);
        setHelperText(text2);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f20603e;
        if (!(editText instanceof AutoCompleteTextView) || editText.getInputType() != 0) {
            return this.G;
        }
        int i4 = i0.i(com.liuzh.deviceinfo.R.attr.colorControlHighlight, this.f20603e);
        int i10 = this.P;
        int[][] iArr = D0;
        if (i10 != 2) {
            if (i10 != 1) {
                return null;
            }
            j jVar = this.G;
            int i11 = this.V;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{i0.o(0.1f, i4, i11), i11}), jVar, jVar);
        }
        Context context = getContext();
        j jVar2 = this.G;
        TypedValue typedValueB = ii.a.B(context, com.liuzh.deviceinfo.R.attr.colorSurface, "TextInputLayout");
        int i12 = typedValueB.resourceId;
        int color = i12 != 0 ? context.getColor(i12) : typedValueB.data;
        j jVar3 = new j(jVar2.f23316b.f23298a);
        int iO = i0.o(0.1f, i4, color);
        jVar3.o(new ColorStateList(iArr, new int[]{iO, 0}));
        jVar3.setTint(color);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iO, color});
        j jVar4 = new j(jVar2.f23316b.f23298a);
        jVar4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, jVar3, jVar4), jVar2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.I == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.I = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.I.addState(new int[0], h(false));
        }
        return this.I;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.H == null) {
            this.H = h(true);
        }
        return this.H;
    }

    public static void m(ViewGroup viewGroup, boolean z3) {
        int childCount = viewGroup.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = viewGroup.getChildAt(i4);
            childAt.setEnabled(z3);
            if (childAt instanceof ViewGroup) {
                m((ViewGroup) childAt, z3);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.f20603e != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f20603e = editText;
        int i4 = this.g;
        if (i4 != -1) {
            setMinEms(i4);
        } else {
            setMinWidth(this.f20610i);
        }
        int i10 = this.f20608h;
        if (i10 != -1) {
            setMaxEms(i10);
        } else {
            setMaxWidth(this.j);
        }
        this.J = false;
        k();
        setTextInputAccessibilityDelegate(new z(this));
        Typeface typeface = this.f20603e.getTypeface();
        b bVar = this.f20638w0;
        bVar.n(typeface);
        float textSize = this.f20603e.getTextSize();
        if (bVar.f38183h != textSize) {
            bVar.f38183h = textSize;
            bVar.j(false);
        }
        float letterSpacing = this.f20603e.getLetterSpacing();
        if (bVar.X != letterSpacing) {
            bVar.X = letterSpacing;
            bVar.j(false);
        }
        int gravity = this.f20603e.getGravity();
        int i11 = (gravity & (-113)) | 48;
        if (bVar.g != i11) {
            bVar.g = i11;
            bVar.j(false);
        }
        if (bVar.f38180f != gravity) {
            bVar.f38180f = gravity;
            bVar.j(false);
        }
        this.f20634u0 = editText.getMinimumHeight();
        this.f20603e.addTextChangedListener(new kd.y(this, editText));
        if (this.f20612j0 == null) {
            this.f20612j0 = this.f20603e.getHintTextColors();
        }
        if (this.D) {
            if (TextUtils.isEmpty(this.E)) {
                CharSequence hint = this.f20603e.getHint();
                this.f20605f = hint;
                setHint(hint);
                this.f20603e.setHint((CharSequence) null);
            }
            this.F = true;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            r();
        }
        if (this.f20623p != null) {
            p(this.f20603e.getText());
        }
        t();
        this.f20613k.b();
        this.f20597b.bringToFront();
        kd.o oVar = this.f20599c;
        oVar.bringToFront();
        Iterator it = this.f20606f0.iterator();
        while (it.hasNext()) {
            ((kd.n) it.next()).a(this);
        }
        oVar.m();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        w(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.E)) {
            return;
        }
        this.E = charSequence;
        b bVar = this.f20638w0;
        if (charSequence == null || !TextUtils.equals(bVar.B, charSequence)) {
            bVar.B = charSequence;
            bVar.C = null;
            bVar.j(false);
        }
        if (this.f20636v0) {
            return;
        }
        l();
    }

    private void setPlaceholderTextEnabled(boolean z3) {
        if (this.f20631t == z3) {
            return;
        }
        if (z3) {
            AppCompatTextView appCompatTextView = this.f20633u;
            if (appCompatTextView != null) {
                this.f20595a.addView(appCompatTextView);
                this.f20633u.setVisibility(0);
            }
        } else {
            AppCompatTextView appCompatTextView2 = this.f20633u;
            if (appCompatTextView2 != null) {
                appCompatTextView2.setVisibility(8);
            }
            this.f20633u = null;
        }
        this.f20631t = z3;
    }

    public final void a() {
        if (this.f20603e == null || this.P != 1) {
            return;
        }
        if (getHintMaxLines() != 1) {
            EditText editText = this.f20603e;
            editText.setPaddingRelative(editText.getPaddingStart(), (int) (this.f20638w0.f() + this.f20601d), this.f20603e.getPaddingEnd(), getResources().getDimensionPixelSize(com.liuzh.deviceinfo.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
        } else if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
            EditText editText2 = this.f20603e;
            editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(com.liuzh.deviceinfo.R.dimen.material_filled_edittext_font_2_0_padding_top), this.f20603e.getPaddingEnd(), getResources().getDimensionPixelSize(com.liuzh.deviceinfo.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
        } else if (jm.a.q(getContext())) {
            EditText editText3 = this.f20603e;
            editText3.setPaddingRelative(editText3.getPaddingStart(), getResources().getDimensionPixelSize(com.liuzh.deviceinfo.R.dimen.material_filled_edittext_font_1_3_padding_top), this.f20603e.getPaddingEnd(), getResources().getDimensionPixelSize(com.liuzh.deviceinfo.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i4, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f20595a;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        v();
        setEditText((EditText) view);
    }

    public final void b(float f10) {
        b bVar = this.f20638w0;
        if (bVar.f38172b == f10) {
            return;
        }
        if (this.f20644z0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f20644z0 = valueAnimator;
            valueAnimator.setInterpolator(nh.a.w(getContext(), com.liuzh.deviceinfo.R.attr.motionEasingEmphasizedInterpolator, jc.a.f27483b));
            this.f20644z0.setDuration(nh.a.v(getContext(), com.liuzh.deviceinfo.R.attr.motionDurationMedium4, 167));
            this.f20644z0.addUpdateListener(new d(2, this));
        }
        this.f20644z0.setFloatValues(bVar.f38172b, f10);
        this.f20644z0.start();
    }

    public final void c() {
        int i4;
        int i10;
        j jVar = this.G;
        if (jVar == null) {
            return;
        }
        o oVar = jVar.f23316b.f23298a;
        o oVar2 = this.M;
        if (oVar != oVar2) {
            jVar.setShapeAppearanceModel(oVar2);
        }
        if (this.P == 2 && (i4 = this.R) > -1 && (i10 = this.U) != 0) {
            j jVar2 = this.G;
            jVar2.f23316b.f23306k = i4;
            jVar2.invalidateSelf();
            jVar2.r(ColorStateList.valueOf(i10));
        }
        int iB = this.V;
        if (this.P == 1) {
            iB = v3.a.b(this.V, i0.j(getContext(), com.liuzh.deviceinfo.R.attr.colorSurface, 0));
        }
        this.V = iB;
        this.G.o(ColorStateList.valueOf(iB));
        j jVar3 = this.K;
        if (jVar3 != null && this.L != null) {
            if (this.R > -1 && this.U != 0) {
                jVar3.o(this.f20603e.isFocused() ? ColorStateList.valueOf(this.f20616l0) : ColorStateList.valueOf(this.U));
                this.L.o(ColorStateList.valueOf(this.U));
            }
            invalidate();
        }
        u();
    }

    public final Rect d(Rect rect) {
        if (this.f20603e == null) {
            throw new IllegalStateException();
        }
        boolean z3 = getLayoutDirection() == 1;
        int i4 = rect.bottom;
        Rect rect2 = this.f20596a0;
        rect2.bottom = i4;
        int i10 = this.P;
        if (i10 == 1) {
            rect2.left = i(rect.left, z3);
            rect2.top = rect.top + this.Q;
            rect2.right = j(rect.right, z3);
            return rect2;
        }
        if (i10 != 2) {
            rect2.left = i(rect.left, z3);
            rect2.top = getPaddingTop();
            rect2.right = j(rect.right, z3);
            return rect2;
        }
        rect2.left = this.f20603e.getPaddingLeft() + rect.left;
        rect2.top = rect.top - e();
        rect2.right = rect.right - this.f20603e.getPaddingRight();
        return rect2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i4) {
        EditText editText = this.f20603e;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i4);
            return;
        }
        if (this.f20605f != null) {
            boolean z3 = this.F;
            this.F = false;
            CharSequence hint = editText.getHint();
            this.f20603e.setHint(this.f20605f);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i4);
                return;
            } finally {
                this.f20603e.setHint(hint);
                this.F = z3;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i4);
        onProvideAutofillVirtualStructure(viewStructure, i4);
        FrameLayout frameLayout = this.f20595a;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i10 = 0; i10 < frameLayout.getChildCount(); i10++) {
            View childAt = frameLayout.getChildAt(i10);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i10);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i4);
            if (childAt == this.f20603e) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.B0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.B0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        j jVar;
        Canvas canvas2 = canvas;
        super.draw(canvas);
        boolean z3 = this.D;
        b bVar = this.f20638w0;
        if (z3) {
            TextPaint textPaint = bVar.O;
            RectF rectF = bVar.f38178e;
            int iSave = canvas2.save();
            if (bVar.C != null && rectF.width() > 0.0f && rectF.height() > 0.0f) {
                textPaint.setTextSize(bVar.G);
                float f10 = bVar.f38195q;
                float f11 = bVar.f38196r;
                float f12 = bVar.F;
                if (f12 != 1.0f) {
                    canvas2.scale(f12, f12, f10, f11);
                }
                if ((bVar.f38179e0 > 1 || bVar.f38181f0 > 1) && !bVar.D && bVar.o()) {
                    float lineStart = bVar.f38195q - bVar.Z.getLineStart(0);
                    int alpha = textPaint.getAlpha();
                    canvas2.translate(lineStart, f11);
                    float f13 = alpha;
                    textPaint.setAlpha((int) (bVar.f38175c0 * f13));
                    int i4 = Build.VERSION.SDK_INT;
                    if (i4 >= 31) {
                        float f14 = bVar.H;
                        float f15 = bVar.I;
                        float f16 = bVar.J;
                        int i10 = bVar.K;
                        textPaint.setShadowLayer(f14, f15, f16, v3.a.d(i10, (textPaint.getAlpha() * Color.alpha(i10)) / 255));
                    }
                    bVar.Z.draw(canvas2);
                    textPaint.setAlpha((int) (bVar.f38173b0 * f13));
                    if (i4 >= 31) {
                        float f17 = bVar.H;
                        float f18 = bVar.I;
                        float f19 = bVar.J;
                        int i11 = bVar.K;
                        textPaint.setShadowLayer(f17, f18, f19, v3.a.d(i11, (Color.alpha(i11) * textPaint.getAlpha()) / 255));
                    }
                    int lineBaseline = bVar.Z.getLineBaseline(0);
                    CharSequence charSequence = bVar.f38177d0;
                    float f20 = lineBaseline;
                    canvas2.drawText(charSequence, 0, charSequence.length(), 0.0f, f20, textPaint);
                    if (i4 >= 31) {
                        textPaint.setShadowLayer(bVar.H, bVar.I, bVar.J, bVar.K);
                    }
                    String strTrim = bVar.f38177d0.toString().trim();
                    if (strTrim.endsWith("…")) {
                        strTrim = strTrim.substring(0, strTrim.length() - 1);
                    }
                    String str = strTrim;
                    textPaint.setAlpha(alpha);
                    canvas2 = canvas;
                    canvas2.drawText(str, 0, Math.min(bVar.Z.getLineEnd(0), str.length()), 0.0f, f20, (Paint) textPaint);
                } else {
                    canvas2.translate(f10, f11);
                    bVar.Z.draw(canvas2);
                }
                canvas2.restoreToCount(iSave);
            }
        }
        if (this.L == null || (jVar = this.K) == null) {
            return;
        }
        jVar.draw(canvas2);
        if (this.f20603e.isFocused()) {
            Rect bounds = this.L.getBounds();
            Rect bounds2 = this.K.getBounds();
            float f21 = bVar.f38172b;
            int iCenterX = bounds2.centerX();
            bounds.left = jc.a.c(f21, iCenterX, bounds2.left);
            bounds.right = jc.a.c(f21, iCenterX, bounds2.right);
            this.L.draw(canvas2);
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
            boolean r0 = r4.A0
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r4.A0 = r0
            super.drawableStateChanged()
            int[] r1 = r4.getDrawableState()
            r2 = 0
            zc.b r3 = r4.f20638w0
            if (r3 == 0) goto L2f
            r3.M = r1
            android.content.res.ColorStateList r1 = r3.f38188k
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
            android.widget.EditText r3 = r4.f20603e
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
            r4.A0 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.drawableStateChanged():void");
    }

    public final int e() {
        if (this.D) {
            int i4 = this.P;
            b bVar = this.f20638w0;
            if (i4 == 0) {
                return (int) bVar.f();
            }
            if (i4 == 2) {
                if (getHintMaxLines() == 1) {
                    return (int) (bVar.f() / 2.0f);
                }
                float f10 = bVar.f();
                TextPaint textPaint = bVar.P;
                textPaint.setTextSize(bVar.f38185i);
                textPaint.setTypeface(bVar.f38197s);
                textPaint.setLetterSpacing(bVar.W);
                return Math.max(0, (int) (f10 - ((-textPaint.ascent()) / 2.0f)));
            }
        }
        return 0;
    }

    public final h f() {
        h hVar = new h();
        hVar.f27427c = nh.a.v(getContext(), com.liuzh.deviceinfo.R.attr.motionDurationShort2, 87);
        hVar.f27428d = nh.a.w(getContext(), com.liuzh.deviceinfo.R.attr.motionEasingLinearInterpolator, jc.a.f27482a);
        return hVar;
    }

    public final boolean g() {
        return this.D && !TextUtils.isEmpty(this.E) && (this.G instanceof kd.h);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f20603e;
        if (editText == null) {
            return super.getBaseline();
        }
        return e() + getPaddingTop() + editText.getBaseline();
    }

    public j getBoxBackground() {
        int i4 = this.P;
        if (i4 == 1 || i4 == 2) {
            return this.G;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.V;
    }

    public int getBoxBackgroundMode() {
        return this.P;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.Q;
    }

    public float getBoxCornerRadiusBottomEnd() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.f20598b0;
        return layoutDirection == 1 ? this.M.f23359h.a(rectF) : this.M.g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.f20598b0;
        return layoutDirection == 1 ? this.M.g.a(rectF) : this.M.f23359h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.f20598b0;
        return layoutDirection == 1 ? this.M.f23357e.a(rectF) : this.M.f23358f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.f20598b0;
        return layoutDirection == 1 ? this.M.f23358f.a(rectF) : this.M.f23357e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.f20620n0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f20622o0;
    }

    public int getBoxStrokeWidth() {
        return this.S;
    }

    public int getBoxStrokeWidthFocused() {
        return this.T;
    }

    public int getCounterMaxLength() {
        return this.f20617m;
    }

    public CharSequence getCounterOverflowDescription() {
        AppCompatTextView appCompatTextView;
        if (this.f20615l && this.f20619n && (appCompatTextView = this.f20623p) != null) {
            return appCompatTextView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.A;
    }

    public ColorStateList getCounterTextColor() {
        return this.f20643z;
    }

    public ColorStateList getCursorColor() {
        return this.B;
    }

    public ColorStateList getCursorErrorColor() {
        return this.C;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f20612j0;
    }

    public EditText getEditText() {
        return this.f20603e;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f20599c.g.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f20599c.g.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f20599c.f28185m;
    }

    public int getEndIconMode() {
        return this.f20599c.f28182i;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f20599c.f28186n;
    }

    public CheckableImageButton getEndIconView() {
        return this.f20599c.g;
    }

    public CharSequence getError() {
        s sVar = this.f20613k;
        if (sVar.f28219q) {
            return sVar.f28218p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f20613k.f28222t;
    }

    public CharSequence getErrorContentDescription() {
        return this.f20613k.f28221s;
    }

    public int getErrorCurrentTextColors() {
        AppCompatTextView appCompatTextView = this.f20613k.f28220r;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f20599c.f28177c.getDrawable();
    }

    public CharSequence getHelperText() {
        s sVar = this.f20613k;
        if (sVar.f28226x) {
            return sVar.f28225w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        AppCompatTextView appCompatTextView = this.f20613k.f28227y;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.D) {
            return this.E;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f20638w0.f();
    }

    public final int getHintCurrentCollapsedTextColor() {
        b bVar = this.f20638w0;
        return bVar.g(bVar.f38188k);
    }

    public int getHintMaxLines() {
        return this.f20638w0.f38179e0;
    }

    public ColorStateList getHintTextColor() {
        return this.f20614k0;
    }

    public a0 getLengthCounter() {
        return this.f20621o;
    }

    public int getMaxEms() {
        return this.f20608h;
    }

    public int getMaxWidth() {
        return this.j;
    }

    public int getMinEms() {
        return this.g;
    }

    public int getMinWidth() {
        return this.f20610i;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f20599c.g.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f20599c.g.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f20631t) {
            return this.f20629s;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f20637w;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f20635v;
    }

    public CharSequence getPrefixText() {
        return this.f20597b.f28244c;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f20597b.f28243b.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f20597b.f28243b;
    }

    public o getShapeAppearanceModel() {
        return this.M;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f20597b.f28245d.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f20597b.f28245d.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f20597b.g;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f20597b.f28248h;
    }

    public CharSequence getSuffixText() {
        return this.f20599c.f28188p;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f20599c.f28189q.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f20599c.f28189q;
    }

    public Typeface getTypeface() {
        return this.f20600c0;
    }

    public final j h(boolean z3) throws Resources.NotFoundException {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(com.liuzh.deviceinfo.R.dimen.mtrl_shape_corner_size_small_component);
        float f10 = z3 ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f20603e;
        float popupElevation = editText instanceof v ? ((v) editText).getPopupElevation() : getResources().getDimensionPixelOffset(com.liuzh.deviceinfo.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.liuzh.deviceinfo.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        ed.m mVar = new ed.m();
        ed.m mVar2 = new ed.m();
        ed.m mVar3 = new ed.m();
        ed.m mVar4 = new ed.m();
        int i4 = 0;
        ed.f fVar = new ed.f(i4);
        ed.f fVar2 = new ed.f(i4);
        ed.f fVar3 = new ed.f(i4);
        ed.f fVar4 = new ed.f(i4);
        ed.a aVar = new ed.a(f10);
        ed.a aVar2 = new ed.a(f10);
        ed.a aVar3 = new ed.a(dimensionPixelOffset);
        ed.a aVar4 = new ed.a(dimensionPixelOffset);
        o oVar = new o();
        oVar.f23353a = mVar;
        oVar.f23354b = mVar2;
        oVar.f23355c = mVar3;
        oVar.f23356d = mVar4;
        oVar.f23357e = aVar;
        oVar.f23358f = aVar2;
        oVar.g = aVar4;
        oVar.f23359h = aVar3;
        oVar.f23360i = fVar;
        oVar.j = fVar2;
        oVar.f23361k = fVar3;
        oVar.f23362l = fVar4;
        EditText editText2 = this.f20603e;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof v ? ((v) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = j.F;
            TypedValue typedValueB = ii.a.B(context, com.liuzh.deviceinfo.R.attr.colorSurface, j.class.getSimpleName());
            int i10 = typedValueB.resourceId;
            dropDownBackgroundTintList = ColorStateList.valueOf(i10 != 0 ? context.getColor(i10) : typedValueB.data);
        }
        j jVar = new j();
        jVar.l(context);
        jVar.o(dropDownBackgroundTintList);
        jVar.n(popupElevation);
        jVar.setShapeAppearanceModel(oVar);
        ed.h hVar = jVar.f23316b;
        if (hVar.f23304h == null) {
            hVar.f23304h = new Rect();
        }
        jVar.f23316b.f23304h.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        jVar.invalidateSelf();
        return jVar;
    }

    public final int i(int i4, boolean z3) {
        return ((z3 || getPrefixText() == null) ? (!z3 || getSuffixText() == null) ? this.f20603e.getCompoundPaddingLeft() : this.f20599c.c() : this.f20597b.a()) + i4;
    }

    public final int j(int i4, boolean z3) {
        return i4 - ((z3 || getSuffixText() == null) ? (!z3 || getPrefixText() == null) ? this.f20603e.getCompoundPaddingRight() : this.f20597b.a() : this.f20599c.c());
    }

    public final void k() {
        int i4 = this.P;
        if (i4 == 0) {
            this.G = null;
            this.K = null;
            this.L = null;
        } else if (i4 == 1) {
            this.G = new j(this.M);
            this.K = new j();
            this.L = new j();
        } else {
            if (i4 != 2) {
                throw new IllegalArgumentException(c.j(this.P, " is illegal; only @BoxBackgroundMode constants are supported.", new StringBuilder()));
            }
            if (!this.D || (this.G instanceof kd.h)) {
                this.G = new j(this.M);
            } else {
                o oVar = this.M;
                int i10 = kd.h.I;
                if (oVar == null) {
                    oVar = new o();
                }
                kd.f fVar = new kd.f(oVar, new RectF());
                g gVar = new g(fVar);
                gVar.H = fVar;
                this.G = gVar;
            }
            this.K = null;
            this.L = null;
        }
        u();
        z();
        if (this.P == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.Q = getResources().getDimensionPixelSize(com.liuzh.deviceinfo.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (jm.a.q(getContext())) {
                this.Q = getResources().getDimensionPixelSize(com.liuzh.deviceinfo.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        a();
        if (this.P != 0) {
            v();
        }
        EditText editText = this.f20603e;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i11 = this.P;
                if (i11 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i11 == 1) {
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

    public final void n(AppCompatTextView appCompatTextView, int i4) {
        try {
            appCompatTextView.setTextAppearance(i4);
            if (appCompatTextView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        appCompatTextView.setTextAppearance(com.liuzh.deviceinfo.R.style.TextAppearance_AppCompat_Caption);
        appCompatTextView.setTextColor(getContext().getColor(com.liuzh.deviceinfo.R.color.design_error));
    }

    public final boolean o() {
        s sVar = this.f20613k;
        return (sVar.f28217o != 1 || sVar.f28220r == null || TextUtils.isEmpty(sVar.f28218p)) ? false : true;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f20638w0.i(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int iMax;
        kd.o oVar = this.f20599c;
        oVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z3 = false;
        this.C0 = false;
        if (this.f20603e != null && this.f20603e.getMeasuredHeight() < (iMax = Math.max(oVar.getMeasuredHeight(), this.f20597b.getMeasuredHeight()))) {
            this.f20603e.setMinimumHeight(iMax);
            z3 = true;
        }
        boolean zS = s();
        if (z3 || zS) {
            this.f20603e.post(new l(8, this));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i4, int i10, int i11, int i12) {
        float fDescent;
        int i13;
        int compoundPaddingTop;
        super.onLayout(z3, i4, i10, i11, i12);
        EditText editText = this.f20603e;
        if (editText != null) {
            ThreadLocal threadLocal = zc.c.f38205a;
            int width = editText.getWidth();
            int height = editText.getHeight();
            Rect rect = this.W;
            rect.set(0, 0, width, height);
            zc.c.b(this, editText, rect);
            j jVar = this.K;
            if (jVar != null) {
                int i14 = rect.bottom;
                jVar.setBounds(rect.left, i14 - this.S, rect.right, i14);
            }
            j jVar2 = this.L;
            if (jVar2 != null) {
                int i15 = rect.bottom;
                jVar2.setBounds(rect.left, i15 - this.T, rect.right, i15);
            }
            if (this.D) {
                float textSize = this.f20603e.getTextSize();
                b bVar = this.f20638w0;
                float f10 = bVar.f38183h;
                TextPaint textPaint = bVar.P;
                if (f10 != textSize) {
                    bVar.f38183h = textSize;
                    bVar.j(false);
                }
                int gravity = this.f20603e.getGravity();
                int i16 = (gravity & (-113)) | 48;
                if (bVar.g != i16) {
                    bVar.g = i16;
                    bVar.j(false);
                }
                if (bVar.f38180f != gravity) {
                    bVar.f38180f = gravity;
                    bVar.j(false);
                }
                Rect rectD = d(rect);
                int i17 = rectD.left;
                int i18 = rectD.top;
                int i19 = rectD.right;
                int i20 = rectD.bottom;
                Rect rect2 = bVar.f38176d;
                if (rect2.left != i17 || rect2.top != i18 || rect2.right != i19 || rect2.bottom != i20) {
                    rect2.set(i17, i18, i19, i20);
                    bVar.N = true;
                }
                if (this.f20603e == null) {
                    throw new IllegalStateException();
                }
                if (getHintMaxLines() == 1) {
                    textPaint.setTextSize(bVar.f38183h);
                    textPaint.setTypeface(bVar.f38200v);
                    textPaint.setLetterSpacing(bVar.X);
                    fDescent = -textPaint.ascent();
                } else {
                    textPaint.setTextSize(bVar.f38183h);
                    textPaint.setTypeface(bVar.f38200v);
                    textPaint.setLetterSpacing(bVar.X);
                    fDescent = bVar.f38190l * (textPaint.descent() + (-textPaint.ascent()));
                }
                int compoundPaddingLeft = this.f20603e.getCompoundPaddingLeft() + rect.left;
                Rect rect3 = this.f20596a0;
                rect3.left = compoundPaddingLeft;
                if (this.P != 1 || this.f20603e.getMinLines() > 1) {
                    if (this.P != 0 || getHintMaxLines() == 1) {
                        i13 = 0;
                    } else {
                        textPaint.setTextSize(bVar.f38183h);
                        textPaint.setTypeface(bVar.f38200v);
                        textPaint.setLetterSpacing(bVar.X);
                        i13 = (int) ((-textPaint.ascent()) / 2.0f);
                    }
                    compoundPaddingTop = (this.f20603e.getCompoundPaddingTop() + rect.top) - i13;
                } else {
                    compoundPaddingTop = (int) (rect.centerY() - (fDescent / 2.0f));
                }
                rect3.top = compoundPaddingTop;
                rect3.right = rect.right - this.f20603e.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.P != 1 || this.f20603e.getMinLines() > 1) ? rect.bottom - this.f20603e.getCompoundPaddingBottom() : (int) (rect3.top + fDescent);
                rect3.bottom = compoundPaddingBottom;
                int i21 = rect3.left;
                int i22 = rect3.top;
                int i23 = rect3.right;
                Rect rect4 = bVar.f38174c;
                if (rect4.left != i21 || rect4.top != i22 || rect4.right != i23 || rect4.bottom != compoundPaddingBottom || true != bVar.f38189k0) {
                    rect4.set(i21, i22, i23, compoundPaddingBottom);
                    bVar.N = true;
                    bVar.f38189k0 = true;
                }
                bVar.j(false);
                if (!g() || this.f20636v0) {
                    return;
                }
                l();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i4, int i10) {
        float f10;
        EditText editText;
        super.onMeasure(i4, i10);
        boolean z3 = this.C0;
        kd.o oVar = this.f20599c;
        if (!z3) {
            oVar.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.C0 = true;
        }
        if (this.f20633u != null && (editText = this.f20603e) != null) {
            this.f20633u.setGravity(editText.getGravity());
            this.f20633u.setPadding(this.f20603e.getCompoundPaddingLeft(), this.f20603e.getCompoundPaddingTop(), this.f20603e.getCompoundPaddingRight(), this.f20603e.getCompoundPaddingBottom());
        }
        oVar.m();
        if (getHintMaxLines() == 1) {
            return;
        }
        int measuredWidth = (this.f20603e.getMeasuredWidth() - this.f20603e.getCompoundPaddingLeft()) - this.f20603e.getCompoundPaddingRight();
        b bVar = this.f20638w0;
        TextPaint textPaint = bVar.P;
        textPaint.setTextSize(bVar.f38185i);
        textPaint.setTypeface(bVar.f38197s);
        textPaint.setLetterSpacing(bVar.W);
        float f11 = measuredWidth;
        bVar.f38186i0 = bVar.e(bVar.f38181f0, textPaint, bVar.B, (bVar.f38185i / bVar.f38183h) * f11, bVar.D).getHeight();
        textPaint.setTextSize(bVar.f38183h);
        textPaint.setTypeface(bVar.f38200v);
        textPaint.setLetterSpacing(bVar.X);
        bVar.f38187j0 = bVar.e(bVar.f38179e0, textPaint, bVar.B, f11, bVar.D).getHeight();
        EditText editText2 = this.f20603e;
        ThreadLocal threadLocal = zc.c.f38205a;
        int width = editText2.getWidth();
        int height = editText2.getHeight();
        Rect rect = this.W;
        rect.set(0, 0, width, height);
        zc.c.b(this, editText2, rect);
        Rect rectD = d(rect);
        int i11 = rectD.left;
        int i12 = rectD.top;
        int i13 = rectD.right;
        int i14 = rectD.bottom;
        Rect rect2 = bVar.f38176d;
        if (rect2.left != i11 || rect2.top != i12 || rect2.right != i13 || rect2.bottom != i14) {
            rect2.set(i11, i12, i13, i14);
            bVar.N = true;
        }
        v();
        a();
        if (this.f20603e == null) {
            return;
        }
        int i15 = bVar.f38187j0;
        if (i15 != -1) {
            f10 = i15;
        } else {
            TextPaint textPaint2 = bVar.P;
            textPaint2.setTextSize(bVar.f38183h);
            textPaint2.setTypeface(bVar.f38200v);
            textPaint2.setLetterSpacing(bVar.X);
            f10 = -textPaint2.ascent();
        }
        if (this.f20629s != null) {
            TextPaint textPaint3 = new TextPaint(129);
            textPaint3.set(this.f20633u.getPaint());
            textPaint3.setTextSize(this.f20633u.getTextSize());
            textPaint3.setTypeface(this.f20633u.getTypeface());
            textPaint3.setLetterSpacing(this.f20633u.getLetterSpacing());
            i iVar = new i(this.f20629s, textPaint3, measuredWidth);
            iVar.f38225k = getLayoutDirection() == 1;
            iVar.j = true;
            float lineSpacingExtra = this.f20633u.getLineSpacingExtra();
            float lineSpacingMultiplier = this.f20633u.getLineSpacingMultiplier();
            iVar.g = lineSpacingExtra;
            iVar.f38223h = lineSpacingMultiplier;
            iVar.f38227m = new ca.b(26, this);
            f = (this.P == 1 ? bVar.f() + this.Q + this.f20601d : 0.0f) + iVar.a().getHeight();
        }
        float fMax = Math.max(f10, f);
        if (this.f20603e.getMeasuredHeight() < fMax) {
            this.f20603e.setMinimumHeight(Math.round(fMax));
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b0 b0Var = (b0) parcelable;
        super.onRestoreInstanceState(b0Var.f28876a);
        setError(b0Var.f28145c);
        if (b0Var.f28146d) {
            post(new b5.o(24, this));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i4) {
        super.onRtlPropertiesChanged(i4);
        boolean z3 = i4 == 1;
        if (z3 != this.N) {
            ed.d dVar = this.M.f23357e;
            RectF rectF = this.f20598b0;
            float fA = dVar.a(rectF);
            float fA2 = this.M.f23358f.a(rectF);
            float fA3 = this.M.f23359h.a(rectF);
            float fA4 = this.M.g.a(rectF);
            o oVar = this.M;
            m1 m1Var = oVar.f23353a;
            m1 m1Var2 = oVar.f23354b;
            m1 m1Var3 = oVar.f23356d;
            m1 m1Var4 = oVar.f23355c;
            ed.f fVar = new ed.f(0);
            ed.f fVar2 = new ed.f(0);
            ed.f fVar3 = new ed.f(0);
            ed.f fVar4 = new ed.f(0);
            ed.a aVar = new ed.a(fA2);
            ed.a aVar2 = new ed.a(fA);
            ed.a aVar3 = new ed.a(fA4);
            ed.a aVar4 = new ed.a(fA3);
            o oVar2 = new o();
            oVar2.f23353a = m1Var2;
            oVar2.f23354b = m1Var;
            oVar2.f23355c = m1Var3;
            oVar2.f23356d = m1Var4;
            oVar2.f23357e = aVar;
            oVar2.f23358f = aVar2;
            oVar2.g = aVar4;
            oVar2.f23359h = aVar3;
            oVar2.f23360i = fVar;
            oVar2.j = fVar2;
            oVar2.f23361k = fVar3;
            oVar2.f23362l = fVar4;
            this.N = z3;
            setShapeAppearanceModel(oVar2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        b0 b0Var = new b0(super.onSaveInstanceState());
        if (o()) {
            b0Var.f28145c = getError();
        }
        kd.o oVar = this.f20599c;
        b0Var.f28146d = oVar.f28182i != 0 && oVar.g.f20533d;
        return b0Var;
    }

    public final void p(Editable editable) {
        ((y) this.f20621o).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z3 = this.f20619n;
        int i4 = this.f20617m;
        if (i4 == -1) {
            this.f20623p.setText(String.valueOf(length));
            this.f20623p.setContentDescription(null);
            this.f20619n = false;
        } else {
            this.f20619n = length > i4;
            Context context = getContext();
            this.f20623p.setContentDescription(context.getString(this.f20619n ? com.liuzh.deviceinfo.R.string.character_counter_overflowed_content_description : com.liuzh.deviceinfo.R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.f20617m)));
            if (z3 != this.f20619n) {
                q();
            }
            String str = c4.b.f2744b;
            c4.b bVar = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? c4.b.f2747e : c4.b.f2746d;
            AppCompatTextView appCompatTextView = this.f20623p;
            String string = getContext().getString(com.liuzh.deviceinfo.R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.f20617m));
            bVar.getClass();
            a4.d dVar = c4.f.f2754a;
            appCompatTextView.setText(string != null ? bVar.c(string).toString() : null);
        }
        if (this.f20603e == null || z3 == this.f20619n) {
            return;
        }
        w(false, false);
        z();
        t();
    }

    public final void q() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        AppCompatTextView appCompatTextView = this.f20623p;
        if (appCompatTextView != null) {
            n(appCompatTextView, this.f20619n ? this.f20625q : this.f20627r);
            if (!this.f20619n && (colorStateList2 = this.f20643z) != null) {
                this.f20623p.setTextColor(colorStateList2);
            }
            if (!this.f20619n || (colorStateList = this.A) == null) {
                return;
            }
            this.f20623p.setTextColor(colorStateList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r() {
        /*
            r4 = this;
            android.content.res.ColorStateList r0 = r4.B
            if (r0 == 0) goto L5
            goto L26
        L5:
            android.content.Context r0 = r4.getContext()
            r1 = 2130968888(0x7f040138, float:1.7546442E38)
            android.util.TypedValue r1 = ii.a.y(r1, r0)
            r2 = 0
            if (r1 != 0) goto L15
        L13:
            r0 = r2
            goto L26
        L15:
            int r3 = r1.resourceId
            if (r3 == 0) goto L1e
            android.content.res.ColorStateList r0 = wd.b.r(r3, r0)
            goto L26
        L1e:
            int r0 = r1.data
            if (r0 == 0) goto L13
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
        L26:
            android.widget.EditText r1 = r4.f20603e
            if (r1 == 0) goto L51
            android.graphics.drawable.Drawable r1 = r1.getTextCursorDrawable()
            if (r1 != 0) goto L31
            goto L51
        L31:
            android.widget.EditText r1 = r4.f20603e
            android.graphics.drawable.Drawable r1 = r1.getTextCursorDrawable()
            android.graphics.drawable.Drawable r1 = r1.mutate()
            boolean r2 = r4.o()
            if (r2 != 0) goto L49
            androidx.appcompat.widget.AppCompatTextView r2 = r4.f20623p
            if (r2 == 0) goto L4e
            boolean r2 = r4.f20619n
            if (r2 == 0) goto L4e
        L49:
            android.content.res.ColorStateList r2 = r4.C
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

    public void setBoxBackgroundColor(int i4) {
        if (this.V != i4) {
            this.V = i4;
            this.f20624p0 = i4;
            this.f20628r0 = i4;
            this.f20630s0 = i4;
            c();
        }
    }

    public void setBoxBackgroundColorResource(int i4) {
        setBoxBackgroundColor(getContext().getColor(i4));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f20624p0 = defaultColor;
        this.V = defaultColor;
        this.f20626q0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f20628r0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f20630s0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        c();
    }

    public void setBoxBackgroundMode(int i4) {
        if (i4 == this.P) {
            return;
        }
        this.P = i4;
        if (this.f20603e != null) {
            k();
        }
    }

    public void setBoxCollapsedPaddingTop(int i4) {
        this.Q = i4;
    }

    public void setBoxCornerFamily(int i4) {
        n nVarG = this.M.g();
        ed.d dVar = this.M.f23357e;
        nVarG.f23342a = ii.a.i(i4);
        nVarG.f23346e = dVar;
        ed.d dVar2 = this.M.f23358f;
        nVarG.f23343b = ii.a.i(i4);
        nVarG.f23347f = dVar2;
        ed.d dVar3 = this.M.f23359h;
        nVarG.f23345d = ii.a.i(i4);
        nVarG.f23348h = dVar3;
        ed.d dVar4 = this.M.g;
        nVarG.f23344c = ii.a.i(i4);
        nVarG.g = dVar4;
        this.M = nVarG.a();
        c();
    }

    public void setBoxStrokeColor(int i4) {
        if (this.f20620n0 != i4) {
            this.f20620n0 = i4;
            z();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f20616l0 = colorStateList.getDefaultColor();
            this.f20632t0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f20618m0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f20620n0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f20620n0 != colorStateList.getDefaultColor()) {
            this.f20620n0 = colorStateList.getDefaultColor();
        }
        z();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f20622o0 != colorStateList) {
            this.f20622o0 = colorStateList;
            z();
        }
    }

    public void setBoxStrokeWidth(int i4) {
        this.S = i4;
        z();
    }

    public void setBoxStrokeWidthFocused(int i4) {
        this.T = i4;
        z();
    }

    public void setBoxStrokeWidthFocusedResource(int i4) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i4));
    }

    public void setBoxStrokeWidthResource(int i4) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i4));
    }

    public void setCounterEnabled(boolean z3) {
        if (this.f20615l != z3) {
            s sVar = this.f20613k;
            if (z3) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
                this.f20623p = appCompatTextView;
                appCompatTextView.setId(com.liuzh.deviceinfo.R.id.textinput_counter);
                Typeface typeface = this.f20600c0;
                if (typeface != null) {
                    this.f20623p.setTypeface(typeface);
                }
                this.f20623p.setMaxLines(1);
                sVar.a(this.f20623p, 2);
                ((ViewGroup.MarginLayoutParams) this.f20623p.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(com.liuzh.deviceinfo.R.dimen.mtrl_textinput_counter_margin_start));
                q();
                if (this.f20623p != null) {
                    EditText editText = this.f20603e;
                    p(editText != null ? editText.getText() : null);
                }
            } else {
                sVar.g(this.f20623p, 2);
                this.f20623p = null;
            }
            this.f20615l = z3;
        }
    }

    public void setCounterMaxLength(int i4) {
        if (this.f20617m != i4) {
            if (i4 > 0) {
                this.f20617m = i4;
            } else {
                this.f20617m = -1;
            }
            if (!this.f20615l || this.f20623p == null) {
                return;
            }
            EditText editText = this.f20603e;
            p(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i4) {
        if (this.f20625q != i4) {
            this.f20625q = i4;
            q();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.A != colorStateList) {
            this.A = colorStateList;
            q();
        }
    }

    public void setCounterTextAppearance(int i4) {
        if (this.f20627r != i4) {
            this.f20627r = i4;
            q();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f20643z != colorStateList) {
            this.f20643z = colorStateList;
            q();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.B != colorStateList) {
            this.B = colorStateList;
            r();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.C != colorStateList) {
            this.C = colorStateList;
            if (o() || (this.f20623p != null && this.f20619n)) {
                r();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f20612j0 = colorStateList;
        this.f20614k0 = colorStateList;
        if (this.f20603e != null) {
            w(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z3) {
        m(this, z3);
        super.setEnabled(z3);
    }

    public void setEndIconActivated(boolean z3) {
        this.f20599c.g.setActivated(z3);
    }

    public void setEndIconCheckable(boolean z3) {
        this.f20599c.g.setCheckable(z3);
    }

    public void setEndIconContentDescription(int i4) {
        kd.o oVar = this.f20599c;
        CharSequence text = i4 != 0 ? oVar.getResources().getText(i4) : null;
        CheckableImageButton checkableImageButton = oVar.g;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i4) {
        kd.o oVar = this.f20599c;
        Drawable drawableL = i4 != 0 ? jm.a.l(i4, oVar.getContext()) : null;
        TextInputLayout textInputLayout = oVar.f28175a;
        CheckableImageButton checkableImageButton = oVar.g;
        checkableImageButton.setImageDrawable(drawableL);
        if (drawableL != null) {
            z3.a(textInputLayout, checkableImageButton, oVar.f28183k, oVar.f28184l);
            z3.s(textInputLayout, checkableImageButton, oVar.f28183k);
        }
    }

    public void setEndIconMinSize(int i4) {
        kd.o oVar = this.f20599c;
        if (i4 < 0) {
            oVar.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i4 != oVar.f28185m) {
            oVar.f28185m = i4;
            CheckableImageButton checkableImageButton = oVar.g;
            checkableImageButton.setMinimumWidth(i4);
            checkableImageButton.setMinimumHeight(i4);
            CheckableImageButton checkableImageButton2 = oVar.f28177c;
            checkableImageButton2.setMinimumWidth(i4);
            checkableImageButton2.setMinimumHeight(i4);
        }
    }

    public void setEndIconMode(int i4) {
        this.f20599c.g(i4);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        kd.o oVar = this.f20599c;
        CheckableImageButton checkableImageButton = oVar.g;
        View.OnLongClickListener onLongClickListener = oVar.f28187o;
        checkableImageButton.setOnClickListener(onClickListener);
        z3.t(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        kd.o oVar = this.f20599c;
        oVar.f28187o = onLongClickListener;
        CheckableImageButton checkableImageButton = oVar.g;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        z3.t(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        kd.o oVar = this.f20599c;
        oVar.f28186n = scaleType;
        oVar.g.setScaleType(scaleType);
        oVar.f28177c.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        kd.o oVar = this.f20599c;
        if (oVar.f28183k != colorStateList) {
            oVar.f28183k = colorStateList;
            z3.a(oVar.f28175a, oVar.g, colorStateList, oVar.f28184l);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        kd.o oVar = this.f20599c;
        if (oVar.f28184l != mode) {
            oVar.f28184l = mode;
            z3.a(oVar.f28175a, oVar.g, oVar.f28183k, mode);
        }
    }

    public void setEndIconVisible(boolean z3) {
        this.f20599c.h(z3);
    }

    public void setError(CharSequence charSequence) {
        s sVar = this.f20613k;
        if (!sVar.f28219q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            sVar.f();
            return;
        }
        sVar.c();
        sVar.f28218p = charSequence;
        sVar.f28220r.setText(charSequence);
        int i4 = sVar.f28216n;
        if (i4 != 1) {
            sVar.f28217o = 1;
        }
        sVar.i(i4, sVar.f28217o, sVar.h(sVar.f28220r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i4) {
        s sVar = this.f20613k;
        sVar.f28222t = i4;
        AppCompatTextView appCompatTextView = sVar.f28220r;
        if (appCompatTextView != null) {
            appCompatTextView.setAccessibilityLiveRegion(i4);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        s sVar = this.f20613k;
        sVar.f28221s = charSequence;
        AppCompatTextView appCompatTextView = sVar.f28220r;
        if (appCompatTextView != null) {
            appCompatTextView.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z3) {
        s sVar = this.f20613k;
        TextInputLayout textInputLayout = sVar.f28211h;
        if (sVar.f28219q == z3) {
            return;
        }
        sVar.c();
        if (z3) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(sVar.g, null);
            sVar.f28220r = appCompatTextView;
            appCompatTextView.setId(com.liuzh.deviceinfo.R.id.textinput_error);
            sVar.f28220r.setTextAlignment(5);
            Typeface typeface = sVar.B;
            if (typeface != null) {
                sVar.f28220r.setTypeface(typeface);
            }
            int i4 = sVar.f28223u;
            sVar.f28223u = i4;
            AppCompatTextView appCompatTextView2 = sVar.f28220r;
            if (appCompatTextView2 != null) {
                sVar.f28211h.n(appCompatTextView2, i4);
            }
            ColorStateList colorStateList = sVar.f28224v;
            sVar.f28224v = colorStateList;
            AppCompatTextView appCompatTextView3 = sVar.f28220r;
            if (appCompatTextView3 != null && colorStateList != null) {
                appCompatTextView3.setTextColor(colorStateList);
            }
            CharSequence charSequence = sVar.f28221s;
            sVar.f28221s = charSequence;
            AppCompatTextView appCompatTextView4 = sVar.f28220r;
            if (appCompatTextView4 != null) {
                appCompatTextView4.setContentDescription(charSequence);
            }
            int i10 = sVar.f28222t;
            sVar.f28222t = i10;
            AppCompatTextView appCompatTextView5 = sVar.f28220r;
            if (appCompatTextView5 != null) {
                appCompatTextView5.setAccessibilityLiveRegion(i10);
            }
            sVar.f28220r.setVisibility(4);
            sVar.a(sVar.f28220r, 0);
        } else {
            sVar.f();
            sVar.g(sVar.f28220r, 0);
            sVar.f28220r = null;
            textInputLayout.t();
            textInputLayout.z();
        }
        sVar.f28219q = z3;
    }

    public void setErrorIconDrawable(int i4) {
        kd.o oVar = this.f20599c;
        oVar.i(i4 != 0 ? jm.a.l(i4, oVar.getContext()) : null);
        z3.s(oVar.f28175a, oVar.f28177c, oVar.f28178d);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        kd.o oVar = this.f20599c;
        CheckableImageButton checkableImageButton = oVar.f28177c;
        View.OnLongClickListener onLongClickListener = oVar.f28180f;
        checkableImageButton.setOnClickListener(onClickListener);
        z3.t(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        kd.o oVar = this.f20599c;
        oVar.f28180f = onLongClickListener;
        CheckableImageButton checkableImageButton = oVar.f28177c;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        z3.t(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        kd.o oVar = this.f20599c;
        if (oVar.f28178d != colorStateList) {
            oVar.f28178d = colorStateList;
            z3.a(oVar.f28175a, oVar.f28177c, colorStateList, oVar.f28179e);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        kd.o oVar = this.f20599c;
        if (oVar.f28179e != mode) {
            oVar.f28179e = mode;
            z3.a(oVar.f28175a, oVar.f28177c, oVar.f28178d, mode);
        }
    }

    public void setErrorTextAppearance(int i4) {
        s sVar = this.f20613k;
        sVar.f28223u = i4;
        AppCompatTextView appCompatTextView = sVar.f28220r;
        if (appCompatTextView != null) {
            sVar.f28211h.n(appCompatTextView, i4);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        s sVar = this.f20613k;
        sVar.f28224v = colorStateList;
        AppCompatTextView appCompatTextView = sVar.f28220r;
        if (appCompatTextView == null || colorStateList == null) {
            return;
        }
        appCompatTextView.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z3) {
        if (this.f20640x0 != z3) {
            this.f20640x0 = z3;
            w(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        s sVar = this.f20613k;
        if (zIsEmpty) {
            if (sVar.f28226x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!sVar.f28226x) {
            setHelperTextEnabled(true);
        }
        sVar.c();
        sVar.f28225w = charSequence;
        sVar.f28227y.setText(charSequence);
        int i4 = sVar.f28216n;
        if (i4 != 2) {
            sVar.f28217o = 2;
        }
        sVar.i(i4, sVar.f28217o, sVar.h(sVar.f28227y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        s sVar = this.f20613k;
        sVar.A = colorStateList;
        AppCompatTextView appCompatTextView = sVar.f28227y;
        if (appCompatTextView == null || colorStateList == null) {
            return;
        }
        appCompatTextView.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z3) {
        s sVar = this.f20613k;
        TextInputLayout textInputLayout = sVar.f28211h;
        if (sVar.f28226x == z3) {
            return;
        }
        sVar.c();
        if (z3) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(sVar.g, null);
            sVar.f28227y = appCompatTextView;
            appCompatTextView.setId(com.liuzh.deviceinfo.R.id.textinput_helper_text);
            sVar.f28227y.setTextAlignment(5);
            Typeface typeface = sVar.B;
            if (typeface != null) {
                sVar.f28227y.setTypeface(typeface);
            }
            sVar.f28227y.setVisibility(4);
            sVar.f28227y.setAccessibilityLiveRegion(1);
            int i4 = sVar.f28228z;
            sVar.f28228z = i4;
            AppCompatTextView appCompatTextView2 = sVar.f28227y;
            if (appCompatTextView2 != null) {
                appCompatTextView2.setTextAppearance(i4);
            }
            ColorStateList colorStateList = sVar.A;
            sVar.A = colorStateList;
            AppCompatTextView appCompatTextView3 = sVar.f28227y;
            if (appCompatTextView3 != null && colorStateList != null) {
                appCompatTextView3.setTextColor(colorStateList);
            }
            sVar.a(sVar.f28227y, 1);
            sVar.f28227y.setAccessibilityDelegate(new r(sVar));
        } else {
            sVar.c();
            int i10 = sVar.f28216n;
            if (i10 == 2) {
                sVar.f28217o = 0;
            }
            sVar.i(i10, sVar.f28217o, sVar.h(sVar.f28227y, ""));
            sVar.g(sVar.f28227y, 1);
            sVar.f28227y = null;
            textInputLayout.t();
            textInputLayout.z();
        }
        sVar.f28226x = z3;
    }

    public void setHelperTextTextAppearance(int i4) {
        s sVar = this.f20613k;
        sVar.f28228z = i4;
        AppCompatTextView appCompatTextView = sVar.f28227y;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i4);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.D) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z3) {
        this.f20642y0 = z3;
    }

    public void setHintEnabled(boolean z3) {
        if (z3 != this.D) {
            this.D = z3;
            if (z3) {
                CharSequence hint = this.f20603e.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.E)) {
                        setHint(hint);
                    }
                    this.f20603e.setHint((CharSequence) null);
                }
                this.F = true;
            } else {
                this.F = false;
                if (!TextUtils.isEmpty(this.E) && TextUtils.isEmpty(this.f20603e.getHint())) {
                    this.f20603e.setHint(this.E);
                }
                setHintInternal(null);
            }
            if (this.f20603e != null) {
                v();
            }
        }
    }

    public void setHintMaxLines(int i4) {
        b bVar = this.f20638w0;
        if (i4 != bVar.f38181f0) {
            bVar.f38181f0 = i4;
            bVar.j(false);
        }
        if (i4 != bVar.f38179e0) {
            bVar.f38179e0 = i4;
            bVar.j(false);
        }
        requestLayout();
    }

    public void setHintTextAppearance(int i4) {
        b bVar = this.f20638w0;
        TextInputLayout textInputLayout = bVar.f38170a;
        bd.d dVar = new bd.d(textInputLayout.getContext(), i4);
        ColorStateList colorStateList = dVar.f2134k;
        if (colorStateList != null) {
            bVar.f38188k = colorStateList;
        }
        float f10 = dVar.f2135l;
        if (f10 != 0.0f) {
            bVar.f38185i = f10;
        }
        ColorStateList colorStateList2 = dVar.f2126a;
        if (colorStateList2 != null) {
            bVar.V = colorStateList2;
        }
        bVar.T = dVar.f2131f;
        bVar.U = dVar.g;
        bVar.S = dVar.f2132h;
        bVar.W = dVar.j;
        bd.a aVar = bVar.f38204z;
        if (aVar != null) {
            aVar.f2119c = true;
        }
        d0 d0Var = new d0(25, bVar);
        dVar.a();
        bVar.f38204z = new bd.a(d0Var, dVar.f2139p);
        dVar.b(textInputLayout.getContext(), bVar.f38204z);
        bVar.j(false);
        this.f20614k0 = bVar.f38188k;
        if (this.f20603e != null) {
            w(false, false);
            v();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f20614k0 != colorStateList) {
            if (this.f20612j0 == null) {
                b bVar = this.f20638w0;
                if (bVar.f38188k != colorStateList) {
                    bVar.f38188k = colorStateList;
                    bVar.j(false);
                }
            }
            this.f20614k0 = colorStateList;
            if (this.f20603e != null) {
                w(false, false);
            }
        }
    }

    public void setLengthCounter(a0 a0Var) {
        this.f20621o = a0Var;
    }

    public void setMaxEms(int i4) {
        this.f20608h = i4;
        EditText editText = this.f20603e;
        if (editText == null || i4 == -1) {
            return;
        }
        editText.setMaxEms(i4);
    }

    public void setMaxWidth(int i4) {
        this.j = i4;
        EditText editText = this.f20603e;
        if (editText == null || i4 == -1) {
            return;
        }
        editText.setMaxWidth(i4);
    }

    public void setMaxWidthResource(int i4) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i4));
    }

    public void setMinEms(int i4) {
        this.g = i4;
        EditText editText = this.f20603e;
        if (editText == null || i4 == -1) {
            return;
        }
        editText.setMinEms(i4);
    }

    public void setMinWidth(int i4) {
        this.f20610i = i4;
        EditText editText = this.f20603e;
        if (editText == null || i4 == -1) {
            return;
        }
        editText.setMinWidth(i4);
    }

    public void setMinWidthResource(int i4) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i4));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i4) {
        kd.o oVar = this.f20599c;
        oVar.g.setContentDescription(i4 != 0 ? oVar.getResources().getText(i4) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i4) {
        kd.o oVar = this.f20599c;
        oVar.g.setImageDrawable(i4 != 0 ? jm.a.l(i4, oVar.getContext()) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z3) {
        kd.o oVar = this.f20599c;
        if (z3 && oVar.f28182i != 1) {
            oVar.g(1);
        } else if (z3) {
            oVar.getClass();
        } else {
            oVar.g(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        kd.o oVar = this.f20599c;
        oVar.f28183k = colorStateList;
        z3.a(oVar.f28175a, oVar.g, colorStateList, oVar.f28184l);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        kd.o oVar = this.f20599c;
        oVar.f28184l = mode;
        z3.a(oVar.f28175a, oVar.g, oVar.f28183k, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f20633u == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
            this.f20633u = appCompatTextView;
            appCompatTextView.setId(com.liuzh.deviceinfo.R.id.textinput_placeholder);
            this.f20633u.setImportantForAccessibility(1);
            this.f20633u.setAccessibilityLiveRegion(1);
            h hVarF = f();
            this.f20639x = hVarF;
            hVarF.f27426b = 67L;
            this.f20641y = f();
            setPlaceholderTextAppearance(this.f20637w);
            setPlaceholderTextColor(this.f20635v);
            v0.o(this.f20633u, new com.google.android.material.datepicker.g(4));
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f20631t) {
                setPlaceholderTextEnabled(true);
            }
            this.f20629s = charSequence;
        }
        EditText editText = this.f20603e;
        x(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int i4) {
        this.f20637w = i4;
        AppCompatTextView appCompatTextView = this.f20633u;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i4);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f20635v != colorStateList) {
            this.f20635v = colorStateList;
            AppCompatTextView appCompatTextView = this.f20633u;
            if (appCompatTextView == null || colorStateList == null) {
                return;
            }
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        x xVar = this.f20597b;
        xVar.getClass();
        xVar.f28244c = TextUtils.isEmpty(charSequence) ? null : charSequence;
        xVar.f28243b.setText(charSequence);
        xVar.e();
    }

    public void setPrefixTextAppearance(int i4) {
        this.f20597b.f28243b.setTextAppearance(i4);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f20597b.f28243b.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(o oVar) {
        j jVar = this.G;
        if (jVar == null || jVar.f23316b.f23298a == oVar) {
            return;
        }
        this.M = oVar;
        c();
    }

    public void setStartIconCheckable(boolean z3) {
        this.f20597b.f28245d.setCheckable(z3);
    }

    public void setStartIconContentDescription(int i4) {
        setStartIconContentDescription(i4 != 0 ? getResources().getText(i4) : null);
    }

    public void setStartIconDrawable(int i4) {
        setStartIconDrawable(i4 != 0 ? jm.a.l(i4, getContext()) : null);
    }

    public void setStartIconMinSize(int i4) {
        x xVar = this.f20597b;
        if (i4 < 0) {
            xVar.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i4 != xVar.g) {
            xVar.g = i4;
            CheckableImageButton checkableImageButton = xVar.f28245d;
            checkableImageButton.setMinimumWidth(i4);
            checkableImageButton.setMinimumHeight(i4);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        x xVar = this.f20597b;
        CheckableImageButton checkableImageButton = xVar.f28245d;
        View.OnLongClickListener onLongClickListener = xVar.f28249i;
        checkableImageButton.setOnClickListener(onClickListener);
        z3.t(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        x xVar = this.f20597b;
        xVar.f28249i = onLongClickListener;
        CheckableImageButton checkableImageButton = xVar.f28245d;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        z3.t(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        x xVar = this.f20597b;
        xVar.f28248h = scaleType;
        xVar.f28245d.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        x xVar = this.f20597b;
        if (xVar.f28246e != colorStateList) {
            xVar.f28246e = colorStateList;
            z3.a(xVar.f28242a, xVar.f28245d, colorStateList, xVar.f28247f);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        x xVar = this.f20597b;
        if (xVar.f28247f != mode) {
            xVar.f28247f = mode;
            z3.a(xVar.f28242a, xVar.f28245d, xVar.f28246e, mode);
        }
    }

    public void setStartIconVisible(boolean z3) {
        this.f20597b.c(z3);
    }

    public void setSuffixText(CharSequence charSequence) {
        kd.o oVar = this.f20599c;
        oVar.getClass();
        oVar.f28188p = TextUtils.isEmpty(charSequence) ? null : charSequence;
        oVar.f28189q.setText(charSequence);
        oVar.n();
    }

    public void setSuffixTextAppearance(int i4) {
        this.f20599c.f28189q.setTextAppearance(i4);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f20599c.f28189q.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(z zVar) {
        EditText editText = this.f20603e;
        if (editText != null) {
            v0.o(editText, zVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f20600c0) {
            this.f20600c0 = typeface;
            this.f20638w0.n(typeface);
            s sVar = this.f20613k;
            if (typeface != sVar.B) {
                sVar.B = typeface;
                AppCompatTextView appCompatTextView = sVar.f28220r;
                if (appCompatTextView != null) {
                    appCompatTextView.setTypeface(typeface);
                }
                AppCompatTextView appCompatTextView2 = sVar.f28227y;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTypeface(typeface);
                }
            }
            AppCompatTextView appCompatTextView3 = this.f20623p;
            if (appCompatTextView3 != null) {
                appCompatTextView3.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        Drawable background;
        AppCompatTextView appCompatTextView;
        EditText editText = this.f20603e;
        if (editText == null || this.P != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = i1.f30713a;
        Drawable drawableMutate = background.mutate();
        if (o()) {
            drawableMutate.setColorFilter(p.s.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f20619n && (appCompatTextView = this.f20623p) != null) {
            drawableMutate.setColorFilter(p.s.c(appCompatTextView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            drawableMutate.clearColorFilter();
            this.f20603e.refreshDrawableState();
        }
    }

    public final void u() {
        EditText editText = this.f20603e;
        if (editText == null || this.G == null) {
            return;
        }
        if ((this.J || editText.getBackground() == null) && this.P != 0) {
            this.f20603e.setBackground(getEditTextBoxBackground());
            this.J = true;
        }
    }

    public final void v() {
        if (this.P != 1) {
            FrameLayout frameLayout = this.f20595a;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int iE = e();
            if (iE != layoutParams.topMargin) {
                layoutParams.topMargin = iE;
                frameLayout.requestLayout();
            }
        }
    }

    public final void w(boolean z3, boolean z10) {
        ColorStateList colorStateList;
        AppCompatTextView appCompatTextView;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f20603e;
        boolean z11 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f20603e;
        boolean z12 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.f20612j0;
        b bVar = this.f20638w0;
        if (colorStateList2 != null) {
            bVar.k(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.f20612j0;
            bVar.k(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f20632t0) : this.f20632t0));
        } else if (o()) {
            AppCompatTextView appCompatTextView2 = this.f20613k.f28220r;
            bVar.k(appCompatTextView2 != null ? appCompatTextView2.getTextColors() : null);
        } else if (this.f20619n && (appCompatTextView = this.f20623p) != null) {
            bVar.k(appCompatTextView.getTextColors());
        } else if (z12 && (colorStateList = this.f20614k0) != null && bVar.f38188k != colorStateList) {
            bVar.f38188k = colorStateList;
            bVar.j(false);
        }
        kd.o oVar = this.f20599c;
        x xVar = this.f20597b;
        if (z11 || !this.f20640x0 || (isEnabled() && z12)) {
            if (z10 || this.f20636v0) {
                ValueAnimator valueAnimator = this.f20644z0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f20644z0.cancel();
                }
                if (z3 && this.f20642y0) {
                    b(1.0f);
                } else {
                    bVar.m(1.0f);
                }
                this.f20636v0 = false;
                if (g()) {
                    l();
                }
                EditText editText3 = this.f20603e;
                x(editText3 != null ? editText3.getText() : null);
                xVar.j = false;
                xVar.e();
                oVar.f28190r = false;
                oVar.n();
                return;
            }
            return;
        }
        if (z10 || !this.f20636v0) {
            ValueAnimator valueAnimator2 = this.f20644z0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f20644z0.cancel();
            }
            if (z3 && this.f20642y0) {
                b(0.0f);
            } else {
                bVar.m(0.0f);
            }
            if (g() && !((kd.h) this.G).H.f28157s.isEmpty() && g()) {
                ((kd.h) this.G).w(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.f20636v0 = true;
            AppCompatTextView appCompatTextView3 = this.f20633u;
            if (appCompatTextView3 != null && this.f20631t) {
                appCompatTextView3.setText((CharSequence) null);
                j6.s.a(this.f20595a, this.f20641y);
                this.f20633u.setVisibility(4);
            }
            xVar.j = true;
            xVar.e();
            oVar.f28190r = true;
            oVar.n();
        }
    }

    public final void x(Editable editable) {
        ((y) this.f20621o).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.f20595a;
        if (length != 0 || this.f20636v0) {
            AppCompatTextView appCompatTextView = this.f20633u;
            if (appCompatTextView == null || !this.f20631t) {
                return;
            }
            appCompatTextView.setText((CharSequence) null);
            j6.s.a(frameLayout, this.f20641y);
            this.f20633u.setVisibility(4);
            return;
        }
        if (this.f20633u == null || !this.f20631t || TextUtils.isEmpty(this.f20629s)) {
            return;
        }
        this.f20633u.setText(this.f20629s);
        j6.s.a(frameLayout, this.f20639x);
        this.f20633u.setVisibility(0);
        this.f20633u.bringToFront();
    }

    public final void y(boolean z3, boolean z10) {
        int defaultColor = this.f20622o0.getDefaultColor();
        int colorForState = this.f20622o0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f20622o0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z3) {
            this.U = colorForState2;
        } else if (z10) {
            this.U = colorForState;
        } else {
            this.U = defaultColor;
        }
    }

    public final void z() {
        AppCompatTextView appCompatTextView;
        EditText editText;
        EditText editText2;
        if (this.G == null || this.P == 0) {
            return;
        }
        boolean z3 = false;
        boolean z10 = isFocused() || ((editText2 = this.f20603e) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f20603e) != null && editText.isHovered())) {
            z3 = true;
        }
        if (!isEnabled()) {
            this.U = this.f20632t0;
        } else if (o()) {
            if (this.f20622o0 != null) {
                y(z10, z3);
            } else {
                this.U = getErrorCurrentTextColors();
            }
        } else if (!this.f20619n || (appCompatTextView = this.f20623p) == null) {
            if (z10) {
                this.U = this.f20620n0;
            } else if (z3) {
                this.U = this.f20618m0;
            } else {
                this.U = this.f20616l0;
            }
        } else if (this.f20622o0 != null) {
            y(z10, z3);
        } else {
            this.U = appCompatTextView.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            r();
        }
        kd.o oVar = this.f20599c;
        TextInputLayout textInputLayout = oVar.f28175a;
        CheckableImageButton checkableImageButton = oVar.g;
        TextInputLayout textInputLayout2 = oVar.f28175a;
        oVar.l();
        z3.s(textInputLayout2, oVar.f28177c, oVar.f28178d);
        z3.s(textInputLayout2, checkableImageButton, oVar.f28183k);
        if (oVar.b() instanceof kd.l) {
            if (!textInputLayout.o() || checkableImageButton.getDrawable() == null) {
                z3.a(textInputLayout, checkableImageButton, oVar.f28183k, oVar.f28184l);
            } else {
                Drawable drawableMutate = checkableImageButton.getDrawable().mutate();
                drawableMutate.setTint(textInputLayout.getErrorCurrentTextColors());
                checkableImageButton.setImageDrawable(drawableMutate);
            }
        }
        x xVar = this.f20597b;
        z3.s(xVar.f28242a, xVar.f28245d, xVar.f28246e);
        if (this.P == 2) {
            int i4 = this.R;
            if (z10 && isEnabled()) {
                this.R = this.T;
            } else {
                this.R = this.S;
            }
            if (this.R != i4 && g() && !this.f20636v0) {
                if (g()) {
                    ((kd.h) this.G).w(0.0f, 0.0f, 0.0f, 0.0f);
                }
                l();
            }
        }
        if (this.P == 1) {
            if (!isEnabled()) {
                this.V = this.f20626q0;
            } else if (z3 && !z10) {
                this.V = this.f20630s0;
            } else if (z10) {
                this.V = this.f20628r0;
            } else {
                this.V = this.f20624p0;
            }
        }
        c();
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f20597b.f28245d;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f20597b.b(drawable);
    }

    public void setHint(int i4) {
        setHint(i4 != 0 ? getResources().getText(i4) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f20599c.g.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f20599c.g.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f20599c.i(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f20599c.g;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        kd.o oVar = this.f20599c;
        TextInputLayout textInputLayout = oVar.f28175a;
        CheckableImageButton checkableImageButton = oVar.g;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            z3.a(textInputLayout, checkableImageButton, oVar.f28183k, oVar.f28184l);
            z3.s(textInputLayout, checkableImageButton, oVar.f28183k);
        }
    }
}
