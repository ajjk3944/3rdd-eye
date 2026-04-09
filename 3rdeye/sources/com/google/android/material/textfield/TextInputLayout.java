package com.google.android.material.textfield;

import B4.i;
import D0.a;
import E.u;
import J0.i;
import K1.m;
import L0.C0770a;
import L0.I;
import L0.S;
import T1.B;
import android.R;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
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
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.internal.CheckableImageButton;
import d4.C4275a;
import d4.j;
import d4.n;
import f4.C4334b;
import h4.C4413a;
import h4.C4414b;
import h4.C4415c;
import h4.C4416d;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.KotlinVersion;
import l4.C5282a;
import l4.C5286e;
import l4.C5287f;
import l4.C5289h;
import l4.C5290i;
import l4.InterfaceC5284c;
import o.C5375C;
import o.C5390h;
import o.X;
import p4.C5454d;
import p4.C5457g;
import p4.C5459i;
import p4.C5460j;
import p4.C5461k;
import p4.C5463m;
import p4.p;
import r4.C5522a;
import z0.C5848a;

/* loaded from: classes2.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: D0, reason: collision with root package name */
    public static final int[][] f23045D0 = {new int[]{R.attr.state_pressed}, new int[0]};

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f23046A;

    /* renamed from: A0, reason: collision with root package name */
    public boolean f23047A0;

    /* renamed from: B, reason: collision with root package name */
    public ColorStateList f23048B;

    /* renamed from: B0, reason: collision with root package name */
    public boolean f23049B0;

    /* renamed from: C, reason: collision with root package name */
    public ColorStateList f23050C;

    /* renamed from: C0, reason: collision with root package name */
    public boolean f23051C0;

    /* renamed from: D, reason: collision with root package name */
    public boolean f23052D;

    /* renamed from: E, reason: collision with root package name */
    public CharSequence f23053E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f23054F;

    /* renamed from: G, reason: collision with root package name */
    public C5287f f23055G;

    /* renamed from: H, reason: collision with root package name */
    public C5287f f23056H;

    /* renamed from: I, reason: collision with root package name */
    public StateListDrawable f23057I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f23058J;

    /* renamed from: K, reason: collision with root package name */
    public C5287f f23059K;

    /* renamed from: L, reason: collision with root package name */
    public C5287f f23060L;

    /* renamed from: M, reason: collision with root package name */
    public C5290i f23061M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f23062N;

    /* renamed from: O, reason: collision with root package name */
    public final int f23063O;

    /* renamed from: P, reason: collision with root package name */
    public int f23064P;

    /* renamed from: Q, reason: collision with root package name */
    public int f23065Q;

    /* renamed from: R, reason: collision with root package name */
    public int f23066R;

    /* renamed from: S, reason: collision with root package name */
    public int f23067S;

    /* renamed from: T, reason: collision with root package name */
    public int f23068T;

    /* renamed from: U, reason: collision with root package name */
    public int f23069U;

    /* renamed from: V, reason: collision with root package name */
    public int f23070V;

    /* renamed from: W, reason: collision with root package name */
    public final Rect f23071W;

    /* renamed from: a0, reason: collision with root package name */
    public final Rect f23072a0;

    /* renamed from: b, reason: collision with root package name */
    public final FrameLayout f23073b;

    /* renamed from: b0, reason: collision with root package name */
    public final RectF f23074b0;

    /* renamed from: c, reason: collision with root package name */
    public final p f23075c;

    /* renamed from: c0, reason: collision with root package name */
    public Typeface f23076c0;

    /* renamed from: d, reason: collision with root package name */
    public final com.google.android.material.textfield.a f23077d;

    /* renamed from: d0, reason: collision with root package name */
    public ColorDrawable f23078d0;

    /* renamed from: e, reason: collision with root package name */
    public EditText f23079e;

    /* renamed from: e0, reason: collision with root package name */
    public int f23080e0;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f23081f;

    /* renamed from: f0, reason: collision with root package name */
    public final LinkedHashSet<f> f23082f0;

    /* renamed from: g, reason: collision with root package name */
    public int f23083g;

    /* renamed from: g0, reason: collision with root package name */
    public ColorDrawable f23084g0;

    /* renamed from: h, reason: collision with root package name */
    public int f23085h;

    /* renamed from: h0, reason: collision with root package name */
    public int f23086h0;
    public int i;

    /* renamed from: i0, reason: collision with root package name */
    public Drawable f23087i0;

    /* renamed from: j, reason: collision with root package name */
    public int f23088j;

    /* renamed from: j0, reason: collision with root package name */
    public ColorStateList f23089j0;

    /* renamed from: k, reason: collision with root package name */
    public final C5460j f23090k;

    /* renamed from: k0, reason: collision with root package name */
    public ColorStateList f23091k0;

    /* renamed from: l, reason: collision with root package name */
    public boolean f23092l;

    /* renamed from: l0, reason: collision with root package name */
    public int f23093l0;

    /* renamed from: m, reason: collision with root package name */
    public int f23094m;

    /* renamed from: m0, reason: collision with root package name */
    public int f23095m0;

    /* renamed from: n, reason: collision with root package name */
    public boolean f23096n;

    /* renamed from: n0, reason: collision with root package name */
    public int f23097n0;

    /* renamed from: o, reason: collision with root package name */
    public e f23098o;

    /* renamed from: o0, reason: collision with root package name */
    public ColorStateList f23099o0;

    /* renamed from: p, reason: collision with root package name */
    public AppCompatTextView f23100p;

    /* renamed from: p0, reason: collision with root package name */
    public int f23101p0;

    /* renamed from: q, reason: collision with root package name */
    public int f23102q;

    /* renamed from: q0, reason: collision with root package name */
    public int f23103q0;

    /* renamed from: r, reason: collision with root package name */
    public int f23104r;

    /* renamed from: r0, reason: collision with root package name */
    public int f23105r0;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f23106s;

    /* renamed from: s0, reason: collision with root package name */
    public int f23107s0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f23108t;

    /* renamed from: t0, reason: collision with root package name */
    public int f23109t0;

    /* renamed from: u, reason: collision with root package name */
    public AppCompatTextView f23110u;

    /* renamed from: u0, reason: collision with root package name */
    public int f23111u0;

    /* renamed from: v, reason: collision with root package name */
    public ColorStateList f23112v;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f23113v0;

    /* renamed from: w, reason: collision with root package name */
    public int f23114w;

    /* renamed from: w0, reason: collision with root package name */
    public final C4275a f23115w0;

    /* renamed from: x, reason: collision with root package name */
    public K1.c f23116x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f23117x0;

    /* renamed from: y, reason: collision with root package name */
    public K1.c f23118y;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f23119y0;

    /* renamed from: z, reason: collision with root package name */
    public ColorStateList f23120z;

    /* renamed from: z0, reason: collision with root package name */
    public ValueAnimator f23121z0;

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            CheckableImageButton checkableImageButton = TextInputLayout.this.f23077d.f23136h;
            checkableImageButton.performClick();
            checkableImageButton.jumpDrawablesToCurrentState();
        }
    }

    public class c implements ValueAnimator.AnimatorUpdateListener {
        public c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.f23115w0.k(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static class d extends C0770a {

        /* renamed from: d, reason: collision with root package name */
        public final TextInputLayout f23127d;

        public d(TextInputLayout textInputLayout) {
            this.f23127d = textInputLayout;
        }

        @Override // L0.C0770a
        public final void d(View view, M0.g gVar) {
            View.AccessibilityDelegate accessibilityDelegate = this.f3883a;
            AccessibilityNodeInfo accessibilityNodeInfo = gVar.f4122a;
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            TextInputLayout textInputLayout = this.f23127d;
            EditText editText = textInputLayout.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            CharSequence hint = textInputLayout.getHint();
            CharSequence error = textInputLayout.getError();
            CharSequence placeholderText = textInputLayout.getPlaceholderText();
            int counterMaxLength = textInputLayout.getCounterMaxLength();
            CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
            boolean zIsEmpty = TextUtils.isEmpty(text);
            boolean zIsEmpty2 = TextUtils.isEmpty(hint);
            boolean z10 = textInputLayout.f23113v0;
            boolean zIsEmpty3 = TextUtils.isEmpty(error);
            boolean z11 = (zIsEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
            String string = !zIsEmpty2 ? hint.toString() : "";
            p pVar = textInputLayout.f23075c;
            AppCompatTextView appCompatTextView = pVar.f45200c;
            if (appCompatTextView.getVisibility() == 0) {
                accessibilityNodeInfo.setLabelFor(appCompatTextView);
                accessibilityNodeInfo.setTraversalAfter(appCompatTextView);
            } else {
                accessibilityNodeInfo.setTraversalAfter(pVar.f45202e);
            }
            if (!zIsEmpty) {
                gVar.n(text);
            } else if (!TextUtils.isEmpty(string)) {
                gVar.n(string);
                if (!z10 && placeholderText != null) {
                    gVar.n(string + ", " + ((Object) placeholderText));
                }
            } else if (placeholderText != null) {
                gVar.n(placeholderText);
            }
            if (!TextUtils.isEmpty(string)) {
                int i = Build.VERSION.SDK_INT;
                if (i >= 26) {
                    gVar.l(string);
                } else {
                    if (!zIsEmpty) {
                        string = ((Object) text) + ", " + string;
                    }
                    gVar.n(string);
                }
                if (i >= 26) {
                    accessibilityNodeInfo.setShowingHintText(zIsEmpty);
                } else {
                    gVar.h(4, zIsEmpty);
                }
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
            if (z11) {
                if (zIsEmpty3) {
                    error = counterOverflowDescription;
                }
                accessibilityNodeInfo.setError(error);
            }
            AppCompatTextView appCompatTextView2 = textInputLayout.f23090k.f45177y;
            if (appCompatTextView2 != null) {
                accessibilityNodeInfo.setLabelFor(appCompatTextView2);
            }
            textInputLayout.f23077d.b().n(gVar);
        }

        @Override // L0.C0770a
        public final void e(View view, AccessibilityEvent accessibilityEvent) {
            super.e(view, accessibilityEvent);
            this.f23127d.f23077d.b().o(accessibilityEvent);
        }
    }

    public interface e {
    }

    public interface f {
        void a(TextInputLayout textInputLayout);
    }

    public interface g {
        void a();
    }

    public static class h extends U0.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: d, reason: collision with root package name */
        public CharSequence f23128d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f23129e;

        public class a implements Parcelable.ClassLoaderCreator<h> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new h[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new h(parcel, null);
            }
        }

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f23128d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f23129e = parcel.readInt() == 1;
        }

        public final String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f23128d) + "}";
        }

        @Override // U0.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.f23128d, parcel, i);
            parcel.writeInt(this.f23129e ? 1 : 0);
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(C5522a.a(context, attributeSet, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.attr.textInputStyle, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.style.Widget_Design_TextInputLayout), attributeSet, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.attr.textInputStyle);
        this.f23083g = -1;
        this.f23085h = -1;
        this.i = -1;
        this.f23088j = -1;
        this.f23090k = new C5460j(this);
        this.f23098o = new com.google.android.gms.measurement.internal.a();
        this.f23071W = new Rect();
        this.f23072a0 = new Rect();
        this.f23074b0 = new RectF();
        this.f23082f0 = new LinkedHashSet<>();
        C4275a c4275a = new C4275a(this);
        this.f23115w0 = c4275a;
        this.f23051C0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f23073b = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = L3.a.f4034a;
        c4275a.f37443Q = linearInterpolator;
        c4275a.h(false);
        c4275a.f37442P = linearInterpolator;
        c4275a.h(false);
        if (c4275a.f37465g != 8388659) {
            c4275a.f37465g = 8388659;
            c4275a.h(false);
        }
        int[] iArr = K3.a.f3112C;
        j.a(context2, attributeSet, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.attr.textInputStyle, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.style.Widget_Design_TextInputLayout);
        j.b(context2, attributeSet, iArr, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.attr.textInputStyle, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 49);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.attr.textInputStyle, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.style.Widget_Design_TextInputLayout);
        X x10 = new X(context2, typedArrayObtainStyledAttributes);
        p pVar = new p(this, x10);
        this.f23075c = pVar;
        this.f23052D = typedArrayObtainStyledAttributes.getBoolean(48, true);
        setHint(typedArrayObtainStyledAttributes.getText(4));
        this.f23119y0 = typedArrayObtainStyledAttributes.getBoolean(47, true);
        this.f23117x0 = typedArrayObtainStyledAttributes.getBoolean(42, true);
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
        this.f23061M = C5290i.b(context2, attributeSet, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.attr.textInputStyle, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.style.Widget_Design_TextInputLayout).a();
        this.f23063O = context2.getResources().getDimensionPixelOffset(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.f23065Q = typedArrayObtainStyledAttributes.getDimensionPixelOffset(9, 0);
        this.f23067S = typedArrayObtainStyledAttributes.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f23068T = typedArrayObtainStyledAttributes.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.f23066R = this.f23067S;
        float dimension = typedArrayObtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = typedArrayObtainStyledAttributes.getDimension(11, -1.0f);
        C5290i.a aVarE = this.f23061M.e();
        if (dimension >= 0.0f) {
            aVarE.f43815e = new C5282a(dimension);
        }
        if (dimension2 >= 0.0f) {
            aVarE.f43816f = new C5282a(dimension2);
        }
        if (dimension3 >= 0.0f) {
            aVarE.f43817g = new C5282a(dimension3);
        }
        if (dimension4 >= 0.0f) {
            aVarE.f43818h = new C5282a(dimension4);
        }
        this.f23061M = aVarE.a();
        ColorStateList colorStateListB = C4415c.b(context2, x10, 7);
        if (colorStateListB != null) {
            int defaultColor = colorStateListB.getDefaultColor();
            this.f23101p0 = defaultColor;
            this.f23070V = defaultColor;
            if (colorStateListB.isStateful()) {
                this.f23103q0 = colorStateListB.getColorForState(new int[]{-16842910}, -1);
                this.f23105r0 = colorStateListB.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f23107s0 = colorStateListB.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f23105r0 = this.f23101p0;
                ColorStateList colorStateList = C5848a.getColorStateList(context2, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.color.mtrl_filled_background_color);
                this.f23103q0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
                this.f23107s0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f23070V = 0;
            this.f23101p0 = 0;
            this.f23103q0 = 0;
            this.f23105r0 = 0;
            this.f23107s0 = 0;
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            ColorStateList colorStateListA = x10.a(1);
            this.f23091k0 = colorStateListA;
            this.f23089j0 = colorStateListA;
        }
        ColorStateList colorStateListB2 = C4415c.b(context2, x10, 14);
        this.f23097n0 = typedArrayObtainStyledAttributes.getColor(14, 0);
        this.f23093l0 = C5848a.getColor(context2, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.color.mtrl_textinput_default_box_stroke_color);
        this.f23109t0 = C5848a.getColor(context2, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.color.mtrl_textinput_disabled_color);
        this.f23095m0 = C5848a.getColor(context2, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateListB2 != null) {
            setBoxStrokeColorStateList(colorStateListB2);
        }
        if (typedArrayObtainStyledAttributes.hasValue(15)) {
            setBoxStrokeErrorColor(C4415c.b(context2, x10, 15));
        }
        if (typedArrayObtainStyledAttributes.getResourceId(49, -1) != -1) {
            setHintTextAppearance(typedArrayObtainStyledAttributes.getResourceId(49, 0));
        }
        this.f23048B = x10.a(24);
        this.f23050C = x10.a(25);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(40, 0);
        CharSequence text = typedArrayObtainStyledAttributes.getText(35);
        int i = typedArrayObtainStyledAttributes.getInt(34, 1);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(36, false);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(45, 0);
        boolean z11 = typedArrayObtainStyledAttributes.getBoolean(44, false);
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(43);
        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(57, 0);
        CharSequence text3 = typedArrayObtainStyledAttributes.getText(56);
        boolean z12 = typedArrayObtainStyledAttributes.getBoolean(18, false);
        setCounterMaxLength(typedArrayObtainStyledAttributes.getInt(19, -1));
        this.f23104r = typedArrayObtainStyledAttributes.getResourceId(22, 0);
        this.f23102q = typedArrayObtainStyledAttributes.getResourceId(20, 0);
        setBoxBackgroundMode(typedArrayObtainStyledAttributes.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i);
        setCounterOverflowTextAppearance(this.f23102q);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.f23104r);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (typedArrayObtainStyledAttributes.hasValue(41)) {
            setErrorTextColor(x10.a(41));
        }
        if (typedArrayObtainStyledAttributes.hasValue(46)) {
            setHelperTextColor(x10.a(46));
        }
        if (typedArrayObtainStyledAttributes.hasValue(50)) {
            setHintTextColor(x10.a(50));
        }
        if (typedArrayObtainStyledAttributes.hasValue(23)) {
            setCounterTextColor(x10.a(23));
        }
        if (typedArrayObtainStyledAttributes.hasValue(21)) {
            setCounterOverflowTextColor(x10.a(21));
        }
        if (typedArrayObtainStyledAttributes.hasValue(58)) {
            setPlaceholderTextColor(x10.a(58));
        }
        com.google.android.material.textfield.a aVar = new com.google.android.material.textfield.a(this, x10);
        this.f23077d = aVar;
        boolean z13 = typedArrayObtainStyledAttributes.getBoolean(0, true);
        x10.f();
        WeakHashMap<View, S> weakHashMap = I.f3792a;
        setImportantForAccessibility(2);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26 && i10 >= 26) {
            I.f.m(this, 1);
        }
        frameLayout.addView(pVar);
        frameLayout.addView(aVar);
        addView(frameLayout);
        setEnabled(z13);
        setHelperTextEnabled(z11);
        setErrorEnabled(z10);
        setCounterEnabled(z12);
        setHelperText(text2);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f23079e;
        if (!(editText instanceof AutoCompleteTextView) || B7.d.r(editText)) {
            return this.f23055G;
        }
        int iM = B7.d.m(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.attr.colorControlHighlight, this.f23079e);
        int i = this.f23064P;
        int[][] iArr = f23045D0;
        if (i != 2) {
            if (i != 1) {
                return null;
            }
            C5287f c5287f = this.f23055G;
            int i10 = this.f23070V;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{B7.d.s(0.1f, iM, i10), i10}), c5287f, c5287f);
        }
        Context context = getContext();
        C5287f c5287f2 = this.f23055G;
        TypedValue typedValueC = C4414b.c(context, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.attr.colorSurface, "TextInputLayout");
        int i11 = typedValueC.resourceId;
        int color = i11 != 0 ? C5848a.getColor(context, i11) : typedValueC.data;
        C5287f c5287f3 = new C5287f(c5287f2.f43759b.f43782a);
        int iS = B7.d.s(0.1f, iM, color);
        c5287f3.k(new ColorStateList(iArr, new int[]{iS, 0}));
        c5287f3.setTint(color);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iS, color});
        C5287f c5287f4 = new C5287f(c5287f2.f43759b.f43782a);
        c5287f4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, c5287f3, c5287f4), c5287f2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f23057I == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f23057I = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.f23057I.addState(new int[0], f(false));
        }
        return this.f23057I;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f23056H == null) {
            this.f23056H = f(true);
        }
        return this.f23056H;
    }

    public static void k(ViewGroup viewGroup, boolean z10) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z10);
            if (childAt instanceof ViewGroup) {
                k((ViewGroup) childAt, z10);
            }
        }
    }

    private void setEditText(EditText editText) throws Resources.NotFoundException {
        if (this.f23079e != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f23079e = editText;
        int i = this.f23083g;
        if (i != -1) {
            setMinEms(i);
        } else {
            setMinWidth(this.i);
        }
        int i10 = this.f23085h;
        if (i10 != -1) {
            setMaxEms(i10);
        } else {
            setMaxWidth(this.f23088j);
        }
        this.f23058J = false;
        i();
        setTextInputAccessibilityDelegate(new d(this));
        Typeface typeface = this.f23079e.getTypeface();
        C4275a c4275a = this.f23115w0;
        c4275a.m(typeface);
        float textSize = this.f23079e.getTextSize();
        if (c4275a.f37466h != textSize) {
            c4275a.f37466h = textSize;
            c4275a.h(false);
        }
        int i11 = Build.VERSION.SDK_INT;
        float letterSpacing = this.f23079e.getLetterSpacing();
        if (c4275a.f37449W != letterSpacing) {
            c4275a.f37449W = letterSpacing;
            c4275a.h(false);
        }
        int gravity = this.f23079e.getGravity();
        int i12 = (gravity & (-113)) | 48;
        if (c4275a.f37465g != i12) {
            c4275a.f37465g = i12;
            c4275a.h(false);
        }
        if (c4275a.f37463f != gravity) {
            c4275a.f37463f = gravity;
            c4275a.h(false);
        }
        WeakHashMap<View, S> weakHashMap = I.f3792a;
        this.f23111u0 = editText.getMinimumHeight();
        this.f23079e.addTextChangedListener(new a(editText));
        if (this.f23089j0 == null) {
            this.f23089j0 = this.f23079e.getHintTextColors();
        }
        if (this.f23052D) {
            if (TextUtils.isEmpty(this.f23053E)) {
                CharSequence hint = this.f23079e.getHint();
                this.f23081f = hint;
                setHint(hint);
                this.f23079e.setHint((CharSequence) null);
            }
            this.f23054F = true;
        }
        if (i11 >= 29) {
            p();
        }
        if (this.f23100p != null) {
            n(this.f23079e.getText());
        }
        r();
        this.f23090k.b();
        this.f23075c.bringToFront();
        com.google.android.material.textfield.a aVar = this.f23077d;
        aVar.bringToFront();
        Iterator<f> it = this.f23082f0.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
        aVar.m();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        u(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f23053E)) {
            return;
        }
        this.f23053E = charSequence;
        C4275a c4275a = this.f23115w0;
        if (charSequence == null || !TextUtils.equals(c4275a.f37427A, charSequence)) {
            c4275a.f37427A = charSequence;
            c4275a.f37428B = null;
            Bitmap bitmap = c4275a.f37431E;
            if (bitmap != null) {
                bitmap.recycle();
                c4275a.f37431E = null;
            }
            c4275a.h(false);
        }
        if (this.f23113v0) {
            return;
        }
        j();
    }

    private void setPlaceholderTextEnabled(boolean z10) {
        if (this.f23108t == z10) {
            return;
        }
        if (z10) {
            AppCompatTextView appCompatTextView = this.f23110u;
            if (appCompatTextView != null) {
                this.f23073b.addView(appCompatTextView);
                this.f23110u.setVisibility(0);
            }
        } else {
            AppCompatTextView appCompatTextView2 = this.f23110u;
            if (appCompatTextView2 != null) {
                appCompatTextView2.setVisibility(8);
            }
            this.f23110u = null;
        }
        this.f23108t = z10;
    }

    public final void a(float f10) {
        C4275a c4275a = this.f23115w0;
        if (c4275a.f37455b == f10) {
            return;
        }
        if (this.f23121z0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f23121z0 = valueAnimator;
            valueAnimator.setInterpolator(C4334b.d(getContext(), com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.attr.motionEasingEmphasizedInterpolator, L3.a.f4035b));
            this.f23121z0.setDuration(C4334b.c(getContext(), com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.attr.motionDurationMedium4, 167));
            this.f23121z0.addUpdateListener(new c());
        }
        this.f23121z0.setFloatValues(c4275a.f37455b, f10);
        this.f23121z0.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) throws Resources.NotFoundException {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f23073b;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        t();
        setEditText((EditText) view);
    }

    public final void b() {
        int i;
        int i10;
        C5287f c5287f = this.f23055G;
        if (c5287f == null) {
            return;
        }
        C5290i c5290i = c5287f.f43759b.f43782a;
        C5290i c5290i2 = this.f23061M;
        if (c5290i != c5290i2) {
            c5287f.setShapeAppearanceModel(c5290i2);
        }
        if (this.f23064P == 2 && (i = this.f23066R) > -1 && (i10 = this.f23069U) != 0) {
            C5287f c5287f2 = this.f23055G;
            c5287f2.f43759b.f43790j = i;
            c5287f2.invalidateSelf();
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(i10);
            C5287f.b bVar = c5287f2.f43759b;
            if (bVar.f43785d != colorStateListValueOf) {
                bVar.f43785d = colorStateListValueOf;
                c5287f2.onStateChange(c5287f2.getState());
            }
        }
        int iC = this.f23070V;
        if (this.f23064P == 1) {
            iC = C0.d.c(this.f23070V, B7.d.o(getContext(), com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.attr.colorSurface, 0));
        }
        this.f23070V = iC;
        this.f23055G.k(ColorStateList.valueOf(iC));
        C5287f c5287f3 = this.f23059K;
        if (c5287f3 != null && this.f23060L != null) {
            if (this.f23066R > -1 && this.f23069U != 0) {
                c5287f3.k(this.f23079e.isFocused() ? ColorStateList.valueOf(this.f23093l0) : ColorStateList.valueOf(this.f23069U));
                this.f23060L.k(ColorStateList.valueOf(this.f23069U));
            }
            invalidate();
        }
        s();
    }

    public final int c() {
        float fD;
        if (!this.f23052D) {
            return 0;
        }
        int i = this.f23064P;
        C4275a c4275a = this.f23115w0;
        if (i == 0) {
            fD = c4275a.d();
        } else {
            if (i != 2) {
                return 0;
            }
            fD = c4275a.d() / 2.0f;
        }
        return (int) fD;
    }

    public final K1.c d() {
        K1.c cVar = new K1.c();
        cVar.f2981d = C4334b.c(getContext(), com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.attr.motionDurationShort2, 87);
        cVar.f2982e = C4334b.d(getContext(), com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.attr.motionEasingLinearInterpolator, L3.a.f4034a);
        return cVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(26)
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.f23079e;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.f23081f != null) {
            boolean z10 = this.f23054F;
            this.f23054F = false;
            CharSequence hint = editText.getHint();
            this.f23079e.setHint(this.f23081f);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.f23079e.setHint(hint);
                this.f23054F = z10;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.f23073b;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i10 = 0; i10 < frameLayout.getChildCount(); i10++) {
            View childAt = frameLayout.getChildAt(i10);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i10);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i);
            if (childAt == this.f23079e) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.f23049B0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f23049B0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        C5287f c5287f;
        Canvas canvas2 = canvas;
        super.draw(canvas);
        boolean z10 = this.f23052D;
        C4275a c4275a = this.f23115w0;
        if (z10) {
            c4275a.getClass();
            int iSave = canvas2.save();
            if (c4275a.f37428B != null) {
                RectF rectF = c4275a.f37461e;
                if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
                    TextPaint textPaint = c4275a.f37440N;
                    textPaint.setTextSize(c4275a.f37433G);
                    float f10 = c4275a.f37473p;
                    float f11 = c4275a.f37474q;
                    float f12 = c4275a.f37432F;
                    if (f12 != 1.0f) {
                        canvas2.scale(f12, f12, f10, f11);
                    }
                    if (c4275a.f37460d0 <= 1 || c4275a.f37429C) {
                        canvas2.translate(f10, f11);
                        c4275a.f37451Y.draw(canvas2);
                    } else {
                        float lineStart = c4275a.f37473p - c4275a.f37451Y.getLineStart(0);
                        int alpha = textPaint.getAlpha();
                        canvas2.translate(lineStart, f11);
                        float f13 = alpha;
                        textPaint.setAlpha((int) (c4275a.f37456b0 * f13));
                        int i = Build.VERSION.SDK_INT;
                        if (i >= 31) {
                            float f14 = c4275a.f37434H;
                            float f15 = c4275a.f37435I;
                            float f16 = c4275a.f37436J;
                            int i10 = c4275a.f37437K;
                            textPaint.setShadowLayer(f14, f15, f16, C0.d.e(i10, (textPaint.getAlpha() * Color.alpha(i10)) / KotlinVersion.MAX_COMPONENT_VALUE));
                        }
                        c4275a.f37451Y.draw(canvas2);
                        textPaint.setAlpha((int) (c4275a.f37454a0 * f13));
                        if (i >= 31) {
                            float f17 = c4275a.f37434H;
                            float f18 = c4275a.f37435I;
                            float f19 = c4275a.f37436J;
                            int i11 = c4275a.f37437K;
                            textPaint.setShadowLayer(f17, f18, f19, C0.d.e(i11, (Color.alpha(i11) * textPaint.getAlpha()) / KotlinVersion.MAX_COMPONENT_VALUE));
                        }
                        int lineBaseline = c4275a.f37451Y.getLineBaseline(0);
                        CharSequence charSequence = c4275a.f37458c0;
                        float f20 = lineBaseline;
                        canvas2.drawText(charSequence, 0, charSequence.length(), 0.0f, f20, textPaint);
                        if (i >= 31) {
                            textPaint.setShadowLayer(c4275a.f37434H, c4275a.f37435I, c4275a.f37436J, c4275a.f37437K);
                        }
                        String strTrim = c4275a.f37458c0.toString().trim();
                        if (strTrim.endsWith("…")) {
                            strTrim = strTrim.substring(0, strTrim.length() - 1);
                        }
                        String str = strTrim;
                        textPaint.setAlpha(alpha);
                        canvas2 = canvas;
                        canvas2.drawText(str, 0, Math.min(c4275a.f37451Y.getLineEnd(0), str.length()), 0.0f, f20, (Paint) textPaint);
                    }
                    canvas2.restoreToCount(iSave);
                }
            }
        }
        if (this.f23060L == null || (c5287f = this.f23059K) == null) {
            return;
        }
        c5287f.draw(canvas2);
        if (this.f23079e.isFocused()) {
            Rect bounds = this.f23060L.getBounds();
            Rect bounds2 = this.f23059K.getBounds();
            float f21 = c4275a.f37455b;
            int iCenterX = bounds2.centerX();
            bounds.left = L3.a.c(f21, iCenterX, bounds2.left);
            bounds.right = L3.a.c(f21, iCenterX, bounds2.right);
            this.f23060L.draw(canvas2);
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
            boolean r0 = r4.f23047A0
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r4.f23047A0 = r0
            super.drawableStateChanged()
            int[] r1 = r4.getDrawableState()
            r2 = 0
            d4.a r3 = r4.f23115w0
            if (r3 == 0) goto L2f
            r3.f37438L = r1
            android.content.res.ColorStateList r1 = r3.f37468k
            if (r1 == 0) goto L20
            boolean r1 = r1.isStateful()
            if (r1 != 0) goto L2a
        L20:
            android.content.res.ColorStateList r1 = r3.f37467j
            if (r1 == 0) goto L2f
            boolean r1 = r1.isStateful()
            if (r1 == 0) goto L2f
        L2a:
            r3.h(r2)
            r1 = r0
            goto L30
        L2f:
            r1 = r2
        L30:
            android.widget.EditText r3 = r4.f23079e
            if (r3 == 0) goto L47
            java.util.WeakHashMap<android.view.View, L0.S> r3 = L0.I.f3792a
            boolean r3 = r4.isLaidOut()
            if (r3 == 0) goto L43
            boolean r3 = r4.isEnabled()
            if (r3 == 0) goto L43
            goto L44
        L43:
            r0 = r2
        L44:
            r4.u(r0, r2)
        L47:
            r4.r()
            r4.x()
            if (r1 == 0) goto L52
            r4.invalidate()
        L52:
            r4.f23047A0 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.drawableStateChanged():void");
    }

    public final boolean e() {
        return this.f23052D && !TextUtils.isEmpty(this.f23053E) && (this.f23055G instanceof C5454d);
    }

    public final C5287f f(boolean z10) throws Resources.NotFoundException {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.dimen.mtrl_shape_corner_size_small_component);
        float f10 = z10 ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f23079e;
        float popupElevation = editText instanceof C5463m ? ((C5463m) editText).getPopupElevation() : getResources().getDimensionPixelOffset(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        C5289h c5289h = new C5289h();
        C5289h c5289h2 = new C5289h();
        C5289h c5289h3 = new C5289h();
        C5289h c5289h4 = new C5289h();
        C5286e c5286e = new C5286e();
        C5286e c5286e2 = new C5286e();
        C5286e c5286e3 = new C5286e();
        C5286e c5286e4 = new C5286e();
        C5282a c5282a = new C5282a(f10);
        C5282a c5282a2 = new C5282a(f10);
        C5282a c5282a3 = new C5282a(dimensionPixelOffset);
        C5282a c5282a4 = new C5282a(dimensionPixelOffset);
        C5290i c5290i = new C5290i();
        c5290i.f43800a = c5289h;
        c5290i.f43801b = c5289h2;
        c5290i.f43802c = c5289h3;
        c5290i.f43803d = c5289h4;
        c5290i.f43804e = c5282a;
        c5290i.f43805f = c5282a2;
        c5290i.f43806g = c5282a4;
        c5290i.f43807h = c5282a3;
        c5290i.i = c5286e;
        c5290i.f43808j = c5286e2;
        c5290i.f43809k = c5286e3;
        c5290i.f43810l = c5286e4;
        EditText editText2 = this.f23079e;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof C5463m ? ((C5463m) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = C5287f.f43758y;
            TypedValue typedValueC = C4414b.c(context, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.attr.colorSurface, C5287f.class.getSimpleName());
            int i = typedValueC.resourceId;
            dropDownBackgroundTintList = ColorStateList.valueOf(i != 0 ? C5848a.getColor(context, i) : typedValueC.data);
        }
        C5287f c5287f = new C5287f();
        c5287f.i(context);
        c5287f.k(dropDownBackgroundTintList);
        c5287f.j(popupElevation);
        c5287f.setShapeAppearanceModel(c5290i);
        C5287f.b bVar = c5287f.f43759b;
        if (bVar.f43788g == null) {
            bVar.f43788g = new Rect();
        }
        c5287f.f43759b.f43788g.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        c5287f.invalidateSelf();
        return c5287f;
    }

    public final int g(int i, boolean z10) {
        return ((z10 || getPrefixText() == null) ? (!z10 || getSuffixText() == null) ? this.f23079e.getCompoundPaddingLeft() : this.f23077d.c() : this.f23075c.a()) + i;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f23079e;
        if (editText == null) {
            return super.getBaseline();
        }
        return c() + getPaddingTop() + editText.getBaseline();
    }

    public C5287f getBoxBackground() {
        int i = this.f23064P;
        if (i == 1 || i == 2) {
            return this.f23055G;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f23070V;
    }

    public int getBoxBackgroundMode() {
        return this.f23064P;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f23065Q;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean zA = n.a(this);
        RectF rectF = this.f23074b0;
        return zA ? this.f23061M.f43807h.a(rectF) : this.f23061M.f43806g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean zA = n.a(this);
        RectF rectF = this.f23074b0;
        return zA ? this.f23061M.f43806g.a(rectF) : this.f23061M.f43807h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean zA = n.a(this);
        RectF rectF = this.f23074b0;
        return zA ? this.f23061M.f43804e.a(rectF) : this.f23061M.f43805f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean zA = n.a(this);
        RectF rectF = this.f23074b0;
        return zA ? this.f23061M.f43805f.a(rectF) : this.f23061M.f43804e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.f23097n0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f23099o0;
    }

    public int getBoxStrokeWidth() {
        return this.f23067S;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f23068T;
    }

    public int getCounterMaxLength() {
        return this.f23094m;
    }

    public CharSequence getCounterOverflowDescription() {
        AppCompatTextView appCompatTextView;
        if (this.f23092l && this.f23096n && (appCompatTextView = this.f23100p) != null) {
            return appCompatTextView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f23046A;
    }

    public ColorStateList getCounterTextColor() {
        return this.f23120z;
    }

    public ColorStateList getCursorColor() {
        return this.f23048B;
    }

    public ColorStateList getCursorErrorColor() {
        return this.f23050C;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f23089j0;
    }

    public EditText getEditText() {
        return this.f23079e;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f23077d.f23136h.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f23077d.f23136h.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f23077d.f23141n;
    }

    public int getEndIconMode() {
        return this.f23077d.f23137j;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f23077d.f23142o;
    }

    public CheckableImageButton getEndIconView() {
        return this.f23077d.f23136h;
    }

    public CharSequence getError() {
        C5460j c5460j = this.f23090k;
        if (c5460j.f45169q) {
            return c5460j.f45168p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f23090k.f45172t;
    }

    public CharSequence getErrorContentDescription() {
        return this.f23090k.f45171s;
    }

    public int getErrorCurrentTextColors() {
        AppCompatTextView appCompatTextView = this.f23090k.f45170r;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f23077d.f23132d.getDrawable();
    }

    public CharSequence getHelperText() {
        C5460j c5460j = this.f23090k;
        if (c5460j.f45176x) {
            return c5460j.f45175w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        AppCompatTextView appCompatTextView = this.f23090k.f45177y;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.f23052D) {
            return this.f23053E;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f23115w0.d();
    }

    public final int getHintCurrentCollapsedTextColor() {
        C4275a c4275a = this.f23115w0;
        return c4275a.e(c4275a.f37468k);
    }

    public ColorStateList getHintTextColor() {
        return this.f23091k0;
    }

    public e getLengthCounter() {
        return this.f23098o;
    }

    public int getMaxEms() {
        return this.f23085h;
    }

    public int getMaxWidth() {
        return this.f23088j;
    }

    public int getMinEms() {
        return this.f23083g;
    }

    public int getMinWidth() {
        return this.i;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f23077d.f23136h.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f23077d.f23136h.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f23108t) {
            return this.f23106s;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f23114w;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f23112v;
    }

    public CharSequence getPrefixText() {
        return this.f23075c.f45201d;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f23075c.f45200c.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f23075c.f45200c;
    }

    public C5290i getShapeAppearanceModel() {
        return this.f23061M;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f23075c.f45202e.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f23075c.f45202e.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f23075c.f45205h;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f23075c.i;
    }

    public CharSequence getSuffixText() {
        return this.f23077d.f23144q;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f23077d.f23145r.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f23077d.f23145r;
    }

    public Typeface getTypeface() {
        return this.f23076c0;
    }

    public final int h(int i, boolean z10) {
        return i - ((z10 || getSuffixText() == null) ? (!z10 || getPrefixText() == null) ? this.f23079e.getCompoundPaddingRight() : this.f23075c.a() : this.f23077d.c());
    }

    public final void i() throws Resources.NotFoundException {
        int i = this.f23064P;
        if (i == 0) {
            this.f23055G = null;
            this.f23059K = null;
            this.f23060L = null;
        } else if (i == 1) {
            this.f23055G = new C5287f(this.f23061M);
            this.f23059K = new C5287f();
            this.f23060L = new C5287f();
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(i.j(new StringBuilder(), this.f23064P, " is illegal; only @BoxBackgroundMode constants are supported."));
            }
            if (!this.f23052D || (this.f23055G instanceof C5454d)) {
                this.f23055G = new C5287f(this.f23061M);
            } else {
                C5290i c5290i = this.f23061M;
                int i10 = C5454d.f45130A;
                if (c5290i == null) {
                    c5290i = new C5290i();
                }
                C5454d.a aVar = new C5454d.a(c5290i, new RectF());
                C5454d.b bVar = new C5454d.b(aVar);
                bVar.f45131z = aVar;
                this.f23055G = bVar;
            }
            this.f23059K = null;
            this.f23060L = null;
        }
        s();
        x();
        if (this.f23064P == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.f23065Q = getResources().getDimensionPixelSize(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (C4415c.d(getContext())) {
                this.f23065Q = getResources().getDimensionPixelSize(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.f23079e != null && this.f23064P == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText = this.f23079e;
                WeakHashMap<View, S> weakHashMap = I.f3792a;
                editText.setPaddingRelative(editText.getPaddingStart(), getResources().getDimensionPixelSize(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.dimen.material_filled_edittext_font_2_0_padding_top), this.f23079e.getPaddingEnd(), getResources().getDimensionPixelSize(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (C4415c.d(getContext())) {
                EditText editText2 = this.f23079e;
                WeakHashMap<View, S> weakHashMap2 = I.f3792a;
                editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.dimen.material_filled_edittext_font_1_3_padding_top), this.f23079e.getPaddingEnd(), getResources().getDimensionPixelSize(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.f23064P != 0) {
            t();
        }
        EditText editText3 = this.f23079e;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i11 = this.f23064P;
                if (i11 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i11 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() {
        /*
            Method dump skipped, instructions count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.j():void");
    }

    public final void l(AppCompatTextView appCompatTextView, int i) {
        try {
            appCompatTextView.setTextAppearance(i);
            if (appCompatTextView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        appCompatTextView.setTextAppearance(2132017668);
        appCompatTextView.setTextColor(C5848a.getColor(getContext(), com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.color.design_error));
    }

    public final boolean m() {
        C5460j c5460j = this.f23090k;
        return (c5460j.f45167o != 1 || c5460j.f45170r == null || TextUtils.isEmpty(c5460j.f45168p)) ? false : true;
    }

    public final void n(Editable editable) throws Resources.NotFoundException {
        ((com.google.android.gms.measurement.internal.a) this.f23098o).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z10 = this.f23096n;
        int i = this.f23094m;
        String string = null;
        if (i == -1) {
            this.f23100p.setText(String.valueOf(length));
            this.f23100p.setContentDescription(null);
            this.f23096n = false;
        } else {
            this.f23096n = length > i;
            Context context = getContext();
            this.f23100p.setContentDescription(context.getString(this.f23096n ? com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.string.character_counter_overflowed_content_description : com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.f23094m)));
            if (z10 != this.f23096n) {
                o();
            }
            String str = J0.a.f2693b;
            J0.a aVar = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? J0.a.f2696e : J0.a.f2695d;
            AppCompatTextView appCompatTextView = this.f23100p;
            String string2 = getContext().getString(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.f23094m));
            if (string2 == null) {
                aVar.getClass();
            } else {
                aVar.getClass();
                i.c cVar = J0.i.f2708a;
                string = aVar.c(string2).toString();
            }
            appCompatTextView.setText(string);
        }
        if (this.f23079e == null || z10 == this.f23096n) {
            return;
        }
        u(false, false);
        x();
        r();
    }

    public final void o() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        AppCompatTextView appCompatTextView = this.f23100p;
        if (appCompatTextView != null) {
            l(appCompatTextView, this.f23096n ? this.f23102q : this.f23104r);
            if (!this.f23096n && (colorStateList2 = this.f23120z) != null) {
                this.f23100p.setTextColor(colorStateList2);
            }
            if (!this.f23096n || (colorStateList = this.f23046A) == null) {
                return;
            }
            this.f23100p.setTextColor(colorStateList);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f23115w0.g(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int iMax;
        com.google.android.material.textfield.a aVar = this.f23077d;
        aVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z10 = false;
        this.f23051C0 = false;
        if (this.f23079e != null && this.f23079e.getMeasuredHeight() < (iMax = Math.max(aVar.getMeasuredHeight(), this.f23075c.getMeasuredHeight()))) {
            this.f23079e.setMinimumHeight(iMax);
            z10 = true;
        }
        boolean zQ = q();
        if (z10 || zQ) {
            this.f23079e.post(new com.vungle.ads.internal.util.a(this, 9));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i, int i10, int i11, int i12) {
        super.onLayout(z10, i, i10, i11, i12);
        EditText editText = this.f23079e;
        if (editText != null) {
            Rect rect = this.f23071W;
            d4.b.a(this, editText, rect);
            C5287f c5287f = this.f23059K;
            if (c5287f != null) {
                int i13 = rect.bottom;
                c5287f.setBounds(rect.left, i13 - this.f23067S, rect.right, i13);
            }
            C5287f c5287f2 = this.f23060L;
            if (c5287f2 != null) {
                int i14 = rect.bottom;
                c5287f2.setBounds(rect.left, i14 - this.f23068T, rect.right, i14);
            }
            if (this.f23052D) {
                float textSize = this.f23079e.getTextSize();
                C4275a c4275a = this.f23115w0;
                if (c4275a.f37466h != textSize) {
                    c4275a.f37466h = textSize;
                    c4275a.h(false);
                }
                int gravity = this.f23079e.getGravity();
                int i15 = (gravity & (-113)) | 48;
                if (c4275a.f37465g != i15) {
                    c4275a.f37465g = i15;
                    c4275a.h(false);
                }
                if (c4275a.f37463f != gravity) {
                    c4275a.f37463f = gravity;
                    c4275a.h(false);
                }
                if (this.f23079e == null) {
                    throw new IllegalStateException();
                }
                boolean zA = n.a(this);
                int i16 = rect.bottom;
                Rect rect2 = this.f23072a0;
                rect2.bottom = i16;
                int i17 = this.f23064P;
                if (i17 == 1) {
                    rect2.left = g(rect.left, zA);
                    rect2.top = rect.top + this.f23065Q;
                    rect2.right = h(rect.right, zA);
                } else if (i17 != 2) {
                    rect2.left = g(rect.left, zA);
                    rect2.top = getPaddingTop();
                    rect2.right = h(rect.right, zA);
                } else {
                    rect2.left = this.f23079e.getPaddingLeft() + rect.left;
                    rect2.top = rect.top - c();
                    rect2.right = rect.right - this.f23079e.getPaddingRight();
                }
                int i18 = rect2.left;
                int i19 = rect2.top;
                int i20 = rect2.right;
                int i21 = rect2.bottom;
                Rect rect3 = c4275a.f37459d;
                if (rect3.left != i18 || rect3.top != i19 || rect3.right != i20 || rect3.bottom != i21) {
                    rect3.set(i18, i19, i20, i21);
                    c4275a.f37439M = true;
                }
                if (this.f23079e == null) {
                    throw new IllegalStateException();
                }
                TextPaint textPaint = c4275a.f37441O;
                textPaint.setTextSize(c4275a.f37466h);
                textPaint.setTypeface(c4275a.f37478u);
                textPaint.setLetterSpacing(c4275a.f37449W);
                float f10 = -textPaint.ascent();
                rect2.left = this.f23079e.getCompoundPaddingLeft() + rect.left;
                rect2.top = (this.f23064P != 1 || this.f23079e.getMinLines() > 1) ? rect.top + this.f23079e.getCompoundPaddingTop() : (int) (rect.centerY() - (f10 / 2.0f));
                rect2.right = rect.right - this.f23079e.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.f23064P != 1 || this.f23079e.getMinLines() > 1) ? rect.bottom - this.f23079e.getCompoundPaddingBottom() : (int) (rect2.top + f10);
                rect2.bottom = compoundPaddingBottom;
                int i22 = rect2.left;
                int i23 = rect2.top;
                int i24 = rect2.right;
                Rect rect4 = c4275a.f37457c;
                if (rect4.left != i22 || rect4.top != i23 || rect4.right != i24 || rect4.bottom != compoundPaddingBottom) {
                    rect4.set(i22, i23, i24, compoundPaddingBottom);
                    c4275a.f37439M = true;
                }
                c4275a.h(false);
                if (!e() || this.f23113v0) {
                    return;
                }
                j();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i10) {
        EditText editText;
        super.onMeasure(i, i10);
        boolean z10 = this.f23051C0;
        com.google.android.material.textfield.a aVar = this.f23077d;
        if (!z10) {
            aVar.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f23051C0 = true;
        }
        if (this.f23110u != null && (editText = this.f23079e) != null) {
            this.f23110u.setGravity(editText.getGravity());
            this.f23110u.setPadding(this.f23079e.getCompoundPaddingLeft(), this.f23079e.getCompoundPaddingTop(), this.f23079e.getCompoundPaddingRight(), this.f23079e.getCompoundPaddingBottom());
        }
        aVar.m();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) throws Resources.NotFoundException {
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.f12348b);
        setError(hVar.f23128d);
        if (hVar.f23129e) {
            post(new b());
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z10 = i == 1;
        if (z10 != this.f23062N) {
            InterfaceC5284c interfaceC5284c = this.f23061M.f43804e;
            RectF rectF = this.f23074b0;
            float fA = interfaceC5284c.a(rectF);
            float fA2 = this.f23061M.f43805f.a(rectF);
            float fA3 = this.f23061M.f43807h.a(rectF);
            float fA4 = this.f23061M.f43806g.a(rectF);
            C5290i c5290i = this.f23061M;
            B b10 = c5290i.f43800a;
            B b11 = c5290i.f43801b;
            B b12 = c5290i.f43803d;
            B b13 = c5290i.f43802c;
            new C5289h();
            new C5289h();
            new C5289h();
            new C5289h();
            C5286e c5286e = new C5286e();
            C5286e c5286e2 = new C5286e();
            C5286e c5286e3 = new C5286e();
            C5286e c5286e4 = new C5286e();
            C5290i.a.b(b11);
            C5290i.a.b(b10);
            C5290i.a.b(b13);
            C5290i.a.b(b12);
            C5282a c5282a = new C5282a(fA2);
            C5282a c5282a2 = new C5282a(fA);
            C5282a c5282a3 = new C5282a(fA4);
            C5282a c5282a4 = new C5282a(fA3);
            C5290i c5290i2 = new C5290i();
            c5290i2.f43800a = b11;
            c5290i2.f43801b = b10;
            c5290i2.f43802c = b12;
            c5290i2.f43803d = b13;
            c5290i2.f43804e = c5282a;
            c5290i2.f43805f = c5282a2;
            c5290i2.f43806g = c5282a4;
            c5290i2.f43807h = c5282a3;
            c5290i2.i = c5286e;
            c5290i2.f43808j = c5286e2;
            c5290i2.f43809k = c5286e3;
            c5290i2.f43810l = c5286e4;
            this.f23062N = z10;
            setShapeAppearanceModel(c5290i2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        h hVar = new h(super.onSaveInstanceState());
        if (m()) {
            hVar.f23128d = getError();
        }
        com.google.android.material.textfield.a aVar = this.f23077d;
        hVar.f23129e = aVar.f23137j != 0 && aVar.f23136h.f22976e;
        return hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p() throws android.content.res.Resources.NotFoundException {
        /*
            r4 = this;
            android.content.res.ColorStateList r0 = r4.f23048B
            if (r0 == 0) goto L5
            goto L26
        L5:
            android.content.Context r0 = r4.getContext()
            r1 = 2130968849(0x7f040111, float:1.7546363E38)
            android.util.TypedValue r1 = h4.C4414b.a(r0, r1)
            r2 = 0
            if (r1 != 0) goto L15
        L13:
            r0 = r2
            goto L26
        L15:
            int r3 = r1.resourceId
            if (r3 == 0) goto L1e
            android.content.res.ColorStateList r0 = z0.C5848a.getColorStateList(r0, r3)
            goto L26
        L1e:
            int r0 = r1.data
            if (r0 == 0) goto L13
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
        L26:
            android.widget.EditText r1 = r4.f23079e
            if (r1 == 0) goto L51
            android.graphics.drawable.Drawable r1 = H2.e.c(r1)
            if (r1 != 0) goto L31
            goto L51
        L31:
            android.widget.EditText r1 = r4.f23079e
            android.graphics.drawable.Drawable r1 = H2.e.c(r1)
            android.graphics.drawable.Drawable r1 = r1.mutate()
            boolean r2 = r4.m()
            if (r2 != 0) goto L49
            androidx.appcompat.widget.AppCompatTextView r2 = r4.f23100p
            if (r2 == 0) goto L4e
            boolean r2 = r4.f23096n
            if (r2 == 0) goto L4e
        L49:
            android.content.res.ColorStateList r2 = r4.f23050C
            if (r2 == 0) goto L4e
            r0 = r2
        L4e:
            D0.a.C0009a.h(r1, r0)
        L51:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.p():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean q() {
        /*
            Method dump skipped, instructions count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.q():boolean");
    }

    public final void r() {
        Drawable background;
        AppCompatTextView appCompatTextView;
        EditText editText = this.f23079e;
        if (editText == null || this.f23064P != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = C5375C.f44490a;
        Drawable drawableMutate = background.mutate();
        if (m()) {
            drawableMutate.setColorFilter(C5390h.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f23096n && (appCompatTextView = this.f23100p) != null) {
            drawableMutate.setColorFilter(C5390h.c(appCompatTextView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            drawableMutate.clearColorFilter();
            this.f23079e.refreshDrawableState();
        }
    }

    public final void s() {
        EditText editText = this.f23079e;
        if (editText == null || this.f23055G == null) {
            return;
        }
        if ((this.f23058J || editText.getBackground() == null) && this.f23064P != 0) {
            Drawable editTextBoxBackground = getEditTextBoxBackground();
            EditText editText2 = this.f23079e;
            WeakHashMap<View, S> weakHashMap = I.f3792a;
            editText2.setBackground(editTextBoxBackground);
            this.f23058J = true;
        }
    }

    public void setBoxBackgroundColor(int i) {
        if (this.f23070V != i) {
            this.f23070V = i;
            this.f23101p0 = i;
            this.f23105r0 = i;
            this.f23107s0 = i;
            b();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(C5848a.getColor(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f23101p0 = defaultColor;
        this.f23070V = defaultColor;
        this.f23103q0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f23105r0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f23107s0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        b();
    }

    public void setBoxBackgroundMode(int i) throws Resources.NotFoundException {
        if (i == this.f23064P) {
            return;
        }
        this.f23064P = i;
        if (this.f23079e != null) {
            i();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.f23065Q = i;
    }

    public void setBoxCornerFamily(int i) {
        C5290i.a aVarE = this.f23061M.e();
        InterfaceC5284c interfaceC5284c = this.f23061M.f43804e;
        B bT = u.t(i);
        aVarE.f43811a = bT;
        C5290i.a.b(bT);
        aVarE.f43815e = interfaceC5284c;
        InterfaceC5284c interfaceC5284c2 = this.f23061M.f43805f;
        B bT2 = u.t(i);
        aVarE.f43812b = bT2;
        C5290i.a.b(bT2);
        aVarE.f43816f = interfaceC5284c2;
        InterfaceC5284c interfaceC5284c3 = this.f23061M.f43807h;
        B bT3 = u.t(i);
        aVarE.f43814d = bT3;
        C5290i.a.b(bT3);
        aVarE.f43818h = interfaceC5284c3;
        InterfaceC5284c interfaceC5284c4 = this.f23061M.f43806g;
        B bT4 = u.t(i);
        aVarE.f43813c = bT4;
        C5290i.a.b(bT4);
        aVarE.f43817g = interfaceC5284c4;
        this.f23061M = aVarE.a();
        b();
    }

    public void setBoxStrokeColor(int i) throws Resources.NotFoundException {
        if (this.f23097n0 != i) {
            this.f23097n0 = i;
            x();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) throws Resources.NotFoundException {
        if (colorStateList.isStateful()) {
            this.f23093l0 = colorStateList.getDefaultColor();
            this.f23109t0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f23095m0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f23097n0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f23097n0 != colorStateList.getDefaultColor()) {
            this.f23097n0 = colorStateList.getDefaultColor();
        }
        x();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) throws Resources.NotFoundException {
        if (this.f23099o0 != colorStateList) {
            this.f23099o0 = colorStateList;
            x();
        }
    }

    public void setBoxStrokeWidth(int i) throws Resources.NotFoundException {
        this.f23067S = i;
        x();
    }

    public void setBoxStrokeWidthFocused(int i) throws Resources.NotFoundException {
        this.f23068T = i;
        x();
    }

    public void setBoxStrokeWidthFocusedResource(int i) throws Resources.NotFoundException {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) throws Resources.NotFoundException {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z10) throws Resources.NotFoundException {
        if (this.f23092l != z10) {
            C5460j c5460j = this.f23090k;
            if (z10) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
                this.f23100p = appCompatTextView;
                appCompatTextView.setId(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.id.textinput_counter);
                Typeface typeface = this.f23076c0;
                if (typeface != null) {
                    this.f23100p.setTypeface(typeface);
                }
                this.f23100p.setMaxLines(1);
                c5460j.a(this.f23100p, 2);
                ((ViewGroup.MarginLayoutParams) this.f23100p.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.dimen.mtrl_textinput_counter_margin_start));
                o();
                if (this.f23100p != null) {
                    EditText editText = this.f23079e;
                    n(editText != null ? editText.getText() : null);
                }
            } else {
                c5460j.g(this.f23100p, 2);
                this.f23100p = null;
            }
            this.f23092l = z10;
        }
    }

    public void setCounterMaxLength(int i) throws Resources.NotFoundException {
        if (this.f23094m != i) {
            if (i > 0) {
                this.f23094m = i;
            } else {
                this.f23094m = -1;
            }
            if (!this.f23092l || this.f23100p == null) {
                return;
            }
            EditText editText = this.f23079e;
            n(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f23102q != i) {
            this.f23102q = i;
            o();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f23046A != colorStateList) {
            this.f23046A = colorStateList;
            o();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.f23104r != i) {
            this.f23104r = i;
            o();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f23120z != colorStateList) {
            this.f23120z = colorStateList;
            o();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) throws Resources.NotFoundException {
        if (this.f23048B != colorStateList) {
            this.f23048B = colorStateList;
            p();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) throws Resources.NotFoundException {
        if (this.f23050C != colorStateList) {
            this.f23050C = colorStateList;
            if (m() || (this.f23100p != null && this.f23096n)) {
                p();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f23089j0 = colorStateList;
        this.f23091k0 = colorStateList;
        if (this.f23079e != null) {
            u(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        k(this, z10);
        super.setEnabled(z10);
    }

    public void setEndIconActivated(boolean z10) {
        this.f23077d.f23136h.setActivated(z10);
    }

    public void setEndIconCheckable(boolean z10) {
        this.f23077d.f23136h.setCheckable(z10);
    }

    public void setEndIconContentDescription(int i) {
        com.google.android.material.textfield.a aVar = this.f23077d;
        CharSequence text = i != 0 ? aVar.getResources().getText(i) : null;
        CheckableImageButton checkableImageButton = aVar.f23136h;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i) {
        com.google.android.material.textfield.a aVar = this.f23077d;
        Drawable drawableW = i != 0 ? A9.I.w(aVar.getContext(), i) : null;
        CheckableImageButton checkableImageButton = aVar.f23136h;
        checkableImageButton.setImageDrawable(drawableW);
        if (drawableW != null) {
            ColorStateList colorStateList = aVar.f23139l;
            PorterDuff.Mode mode = aVar.f23140m;
            TextInputLayout textInputLayout = aVar.f23130b;
            C5459i.a(textInputLayout, checkableImageButton, colorStateList, mode);
            C5459i.c(textInputLayout, checkableImageButton, aVar.f23139l);
        }
    }

    public void setEndIconMinSize(int i) {
        com.google.android.material.textfield.a aVar = this.f23077d;
        if (i < 0) {
            aVar.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i != aVar.f23141n) {
            aVar.f23141n = i;
            CheckableImageButton checkableImageButton = aVar.f23136h;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
            CheckableImageButton checkableImageButton2 = aVar.f23132d;
            checkableImageButton2.setMinimumWidth(i);
            checkableImageButton2.setMinimumHeight(i);
        }
    }

    public void setEndIconMode(int i) {
        this.f23077d.g(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        com.google.android.material.textfield.a aVar = this.f23077d;
        View.OnLongClickListener onLongClickListener = aVar.f23143p;
        CheckableImageButton checkableImageButton = aVar.f23136h;
        checkableImageButton.setOnClickListener(onClickListener);
        C5459i.d(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        com.google.android.material.textfield.a aVar = this.f23077d;
        aVar.f23143p = onLongClickListener;
        CheckableImageButton checkableImageButton = aVar.f23136h;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        C5459i.d(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        com.google.android.material.textfield.a aVar = this.f23077d;
        aVar.f23142o = scaleType;
        aVar.f23136h.setScaleType(scaleType);
        aVar.f23132d.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        com.google.android.material.textfield.a aVar = this.f23077d;
        if (aVar.f23139l != colorStateList) {
            aVar.f23139l = colorStateList;
            C5459i.a(aVar.f23130b, aVar.f23136h, colorStateList, aVar.f23140m);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        com.google.android.material.textfield.a aVar = this.f23077d;
        if (aVar.f23140m != mode) {
            aVar.f23140m = mode;
            C5459i.a(aVar.f23130b, aVar.f23136h, aVar.f23139l, mode);
        }
    }

    public void setEndIconVisible(boolean z10) {
        this.f23077d.h(z10);
    }

    public void setError(CharSequence charSequence) throws Resources.NotFoundException {
        C5460j c5460j = this.f23090k;
        if (!c5460j.f45169q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            c5460j.f();
            return;
        }
        c5460j.c();
        c5460j.f45168p = charSequence;
        c5460j.f45170r.setText(charSequence);
        int i = c5460j.f45166n;
        if (i != 1) {
            c5460j.f45167o = 1;
        }
        c5460j.i(i, c5460j.f45167o, c5460j.h(c5460j.f45170r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        C5460j c5460j = this.f23090k;
        c5460j.f45172t = i;
        AppCompatTextView appCompatTextView = c5460j.f45170r;
        if (appCompatTextView != null) {
            WeakHashMap<View, S> weakHashMap = I.f3792a;
            appCompatTextView.setAccessibilityLiveRegion(i);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        C5460j c5460j = this.f23090k;
        c5460j.f45171s = charSequence;
        AppCompatTextView appCompatTextView = c5460j.f45170r;
        if (appCompatTextView != null) {
            appCompatTextView.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z10) throws Resources.NotFoundException {
        C5460j c5460j = this.f23090k;
        if (c5460j.f45169q == z10) {
            return;
        }
        c5460j.c();
        TextInputLayout textInputLayout = c5460j.f45161h;
        if (z10) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(c5460j.f45160g, null);
            c5460j.f45170r = appCompatTextView;
            appCompatTextView.setId(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.id.textinput_error);
            c5460j.f45170r.setTextAlignment(5);
            Typeface typeface = c5460j.f45153B;
            if (typeface != null) {
                c5460j.f45170r.setTypeface(typeface);
            }
            int i = c5460j.f45173u;
            c5460j.f45173u = i;
            AppCompatTextView appCompatTextView2 = c5460j.f45170r;
            if (appCompatTextView2 != null) {
                textInputLayout.l(appCompatTextView2, i);
            }
            ColorStateList colorStateList = c5460j.f45174v;
            c5460j.f45174v = colorStateList;
            AppCompatTextView appCompatTextView3 = c5460j.f45170r;
            if (appCompatTextView3 != null && colorStateList != null) {
                appCompatTextView3.setTextColor(colorStateList);
            }
            CharSequence charSequence = c5460j.f45171s;
            c5460j.f45171s = charSequence;
            AppCompatTextView appCompatTextView4 = c5460j.f45170r;
            if (appCompatTextView4 != null) {
                appCompatTextView4.setContentDescription(charSequence);
            }
            int i10 = c5460j.f45172t;
            c5460j.f45172t = i10;
            AppCompatTextView appCompatTextView5 = c5460j.f45170r;
            if (appCompatTextView5 != null) {
                WeakHashMap<View, S> weakHashMap = I.f3792a;
                appCompatTextView5.setAccessibilityLiveRegion(i10);
            }
            c5460j.f45170r.setVisibility(4);
            c5460j.a(c5460j.f45170r, 0);
        } else {
            c5460j.f();
            c5460j.g(c5460j.f45170r, 0);
            c5460j.f45170r = null;
            textInputLayout.r();
            textInputLayout.x();
        }
        c5460j.f45169q = z10;
    }

    public void setErrorIconDrawable(int i) {
        com.google.android.material.textfield.a aVar = this.f23077d;
        aVar.i(i != 0 ? A9.I.w(aVar.getContext(), i) : null);
        C5459i.c(aVar.f23130b, aVar.f23132d, aVar.f23133e);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        com.google.android.material.textfield.a aVar = this.f23077d;
        CheckableImageButton checkableImageButton = aVar.f23132d;
        View.OnLongClickListener onLongClickListener = aVar.f23135g;
        checkableImageButton.setOnClickListener(onClickListener);
        C5459i.d(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        com.google.android.material.textfield.a aVar = this.f23077d;
        aVar.f23135g = onLongClickListener;
        CheckableImageButton checkableImageButton = aVar.f23132d;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        C5459i.d(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        com.google.android.material.textfield.a aVar = this.f23077d;
        if (aVar.f23133e != colorStateList) {
            aVar.f23133e = colorStateList;
            C5459i.a(aVar.f23130b, aVar.f23132d, colorStateList, aVar.f23134f);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        com.google.android.material.textfield.a aVar = this.f23077d;
        if (aVar.f23134f != mode) {
            aVar.f23134f = mode;
            C5459i.a(aVar.f23130b, aVar.f23132d, aVar.f23133e, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        C5460j c5460j = this.f23090k;
        c5460j.f45173u = i;
        AppCompatTextView appCompatTextView = c5460j.f45170r;
        if (appCompatTextView != null) {
            c5460j.f45161h.l(appCompatTextView, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        C5460j c5460j = this.f23090k;
        c5460j.f45174v = colorStateList;
        AppCompatTextView appCompatTextView = c5460j.f45170r;
        if (appCompatTextView == null || colorStateList == null) {
            return;
        }
        appCompatTextView.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z10) {
        if (this.f23117x0 != z10) {
            this.f23117x0 = z10;
            u(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) throws Resources.NotFoundException {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        C5460j c5460j = this.f23090k;
        if (zIsEmpty) {
            if (c5460j.f45176x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!c5460j.f45176x) {
            setHelperTextEnabled(true);
        }
        c5460j.c();
        c5460j.f45175w = charSequence;
        c5460j.f45177y.setText(charSequence);
        int i = c5460j.f45166n;
        if (i != 2) {
            c5460j.f45167o = 2;
        }
        c5460j.i(i, c5460j.f45167o, c5460j.h(c5460j.f45177y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        C5460j c5460j = this.f23090k;
        c5460j.f45152A = colorStateList;
        AppCompatTextView appCompatTextView = c5460j.f45177y;
        if (appCompatTextView == null || colorStateList == null) {
            return;
        }
        appCompatTextView.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z10) throws Resources.NotFoundException {
        C5460j c5460j = this.f23090k;
        if (c5460j.f45176x == z10) {
            return;
        }
        c5460j.c();
        if (z10) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(c5460j.f45160g, null);
            c5460j.f45177y = appCompatTextView;
            appCompatTextView.setId(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.id.textinput_helper_text);
            c5460j.f45177y.setTextAlignment(5);
            Typeface typeface = c5460j.f45153B;
            if (typeface != null) {
                c5460j.f45177y.setTypeface(typeface);
            }
            c5460j.f45177y.setVisibility(4);
            AppCompatTextView appCompatTextView2 = c5460j.f45177y;
            WeakHashMap<View, S> weakHashMap = I.f3792a;
            appCompatTextView2.setAccessibilityLiveRegion(1);
            int i = c5460j.f45178z;
            c5460j.f45178z = i;
            AppCompatTextView appCompatTextView3 = c5460j.f45177y;
            if (appCompatTextView3 != null) {
                appCompatTextView3.setTextAppearance(i);
            }
            ColorStateList colorStateList = c5460j.f45152A;
            c5460j.f45152A = colorStateList;
            AppCompatTextView appCompatTextView4 = c5460j.f45177y;
            if (appCompatTextView4 != null && colorStateList != null) {
                appCompatTextView4.setTextColor(colorStateList);
            }
            c5460j.a(c5460j.f45177y, 1);
            c5460j.f45177y.setAccessibilityDelegate(new C5461k(c5460j));
        } else {
            c5460j.c();
            int i10 = c5460j.f45166n;
            if (i10 == 2) {
                c5460j.f45167o = 0;
            }
            c5460j.i(i10, c5460j.f45167o, c5460j.h(c5460j.f45177y, ""));
            c5460j.g(c5460j.f45177y, 1);
            c5460j.f45177y = null;
            TextInputLayout textInputLayout = c5460j.f45161h;
            textInputLayout.r();
            textInputLayout.x();
        }
        c5460j.f45176x = z10;
    }

    public void setHelperTextTextAppearance(int i) {
        C5460j c5460j = this.f23090k;
        c5460j.f45178z = i;
        AppCompatTextView appCompatTextView = c5460j.f45177y;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.f23052D) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z10) {
        this.f23119y0 = z10;
    }

    public void setHintEnabled(boolean z10) {
        if (z10 != this.f23052D) {
            this.f23052D = z10;
            if (z10) {
                CharSequence hint = this.f23079e.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f23053E)) {
                        setHint(hint);
                    }
                    this.f23079e.setHint((CharSequence) null);
                }
                this.f23054F = true;
            } else {
                this.f23054F = false;
                if (!TextUtils.isEmpty(this.f23053E) && TextUtils.isEmpty(this.f23079e.getHint())) {
                    this.f23079e.setHint(this.f23053E);
                }
                setHintInternal(null);
            }
            if (this.f23079e != null) {
                t();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        C4275a c4275a = this.f23115w0;
        TextInputLayout textInputLayout = c4275a.f37453a;
        C4416d c4416d = new C4416d(textInputLayout.getContext(), i);
        ColorStateList colorStateList = c4416d.f38232j;
        if (colorStateList != null) {
            c4275a.f37468k = colorStateList;
        }
        float f10 = c4416d.f38233k;
        if (f10 != 0.0f) {
            c4275a.i = f10;
        }
        ColorStateList colorStateList2 = c4416d.f38224a;
        if (colorStateList2 != null) {
            c4275a.f37447U = colorStateList2;
        }
        c4275a.f37445S = c4416d.f38228e;
        c4275a.f37446T = c4416d.f38229f;
        c4275a.f37444R = c4416d.f38230g;
        c4275a.f37448V = c4416d.i;
        C4413a c4413a = c4275a.f37482y;
        if (c4413a != null) {
            c4413a.f38223d = true;
        }
        F3.f fVar = new F3.f(c4275a);
        c4416d.a();
        c4275a.f37482y = new C4413a(fVar, c4416d.f38236n);
        c4416d.c(textInputLayout.getContext(), c4275a.f37482y);
        c4275a.h(false);
        this.f23091k0 = c4275a.f37468k;
        if (this.f23079e != null) {
            u(false, false);
            t();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f23091k0 != colorStateList) {
            if (this.f23089j0 == null) {
                C4275a c4275a = this.f23115w0;
                if (c4275a.f37468k != colorStateList) {
                    c4275a.f37468k = colorStateList;
                    c4275a.h(false);
                }
            }
            this.f23091k0 = colorStateList;
            if (this.f23079e != null) {
                u(false, false);
            }
        }
    }

    public void setLengthCounter(e eVar) {
        this.f23098o = eVar;
    }

    public void setMaxEms(int i) {
        this.f23085h = i;
        EditText editText = this.f23079e;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public void setMaxWidth(int i) {
        this.f23088j = i;
        EditText editText = this.f23079e;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.f23083g = i;
        EditText editText = this.f23079e;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public void setMinWidth(int i) {
        this.i = i;
        EditText editText = this.f23079e;
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
        com.google.android.material.textfield.a aVar = this.f23077d;
        aVar.f23136h.setContentDescription(i != 0 ? aVar.getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        com.google.android.material.textfield.a aVar = this.f23077d;
        aVar.f23136h.setImageDrawable(i != 0 ? A9.I.w(aVar.getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z10) {
        com.google.android.material.textfield.a aVar = this.f23077d;
        if (z10 && aVar.f23137j != 1) {
            aVar.g(1);
        } else if (z10) {
            aVar.getClass();
        } else {
            aVar.g(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        com.google.android.material.textfield.a aVar = this.f23077d;
        aVar.f23139l = colorStateList;
        C5459i.a(aVar.f23130b, aVar.f23136h, colorStateList, aVar.f23140m);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        com.google.android.material.textfield.a aVar = this.f23077d;
        aVar.f23140m = mode;
        C5459i.a(aVar.f23130b, aVar.f23136h, aVar.f23139l, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f23110u == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
            this.f23110u = appCompatTextView;
            appCompatTextView.setId(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.id.textinput_placeholder);
            AppCompatTextView appCompatTextView2 = this.f23110u;
            WeakHashMap<View, S> weakHashMap = I.f3792a;
            appCompatTextView2.setImportantForAccessibility(2);
            K1.c cVarD = d();
            this.f23116x = cVarD;
            cVarD.f2980c = 67L;
            this.f23118y = d();
            setPlaceholderTextAppearance(this.f23114w);
            setPlaceholderTextColor(this.f23112v);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f23108t) {
                setPlaceholderTextEnabled(true);
            }
            this.f23106s = charSequence;
        }
        EditText editText = this.f23079e;
        v(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.f23114w = i;
        AppCompatTextView appCompatTextView = this.f23110u;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f23112v != colorStateList) {
            this.f23112v = colorStateList;
            AppCompatTextView appCompatTextView = this.f23110u;
            if (appCompatTextView == null || colorStateList == null) {
                return;
            }
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        p pVar = this.f23075c;
        pVar.getClass();
        pVar.f45201d = TextUtils.isEmpty(charSequence) ? null : charSequence;
        pVar.f45200c.setText(charSequence);
        pVar.e();
    }

    public void setPrefixTextAppearance(int i) {
        this.f23075c.f45200c.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f23075c.f45200c.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(C5290i c5290i) {
        C5287f c5287f = this.f23055G;
        if (c5287f == null || c5287f.f43759b.f43782a == c5290i) {
            return;
        }
        this.f23061M = c5290i;
        b();
    }

    public void setStartIconCheckable(boolean z10) {
        this.f23075c.f45202e.setCheckable(z10);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f23075c.f45202e;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? A9.I.w(getContext(), i) : null);
    }

    public void setStartIconMinSize(int i) {
        p pVar = this.f23075c;
        if (i < 0) {
            pVar.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i != pVar.f45205h) {
            pVar.f45205h = i;
            CheckableImageButton checkableImageButton = pVar.f45202e;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        p pVar = this.f23075c;
        View.OnLongClickListener onLongClickListener = pVar.f45206j;
        CheckableImageButton checkableImageButton = pVar.f45202e;
        checkableImageButton.setOnClickListener(onClickListener);
        C5459i.d(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        p pVar = this.f23075c;
        pVar.f45206j = onLongClickListener;
        CheckableImageButton checkableImageButton = pVar.f45202e;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        C5459i.d(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        p pVar = this.f23075c;
        pVar.i = scaleType;
        pVar.f45202e.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        p pVar = this.f23075c;
        if (pVar.f45203f != colorStateList) {
            pVar.f45203f = colorStateList;
            C5459i.a(pVar.f45199b, pVar.f45202e, colorStateList, pVar.f45204g);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        p pVar = this.f23075c;
        if (pVar.f45204g != mode) {
            pVar.f45204g = mode;
            C5459i.a(pVar.f45199b, pVar.f45202e, pVar.f45203f, mode);
        }
    }

    public void setStartIconVisible(boolean z10) {
        this.f23075c.c(z10);
    }

    public void setSuffixText(CharSequence charSequence) {
        com.google.android.material.textfield.a aVar = this.f23077d;
        aVar.getClass();
        aVar.f23144q = TextUtils.isEmpty(charSequence) ? null : charSequence;
        aVar.f23145r.setText(charSequence);
        aVar.n();
    }

    public void setSuffixTextAppearance(int i) {
        this.f23077d.f23145r.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f23077d.f23145r.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(d dVar) {
        EditText editText = this.f23079e;
        if (editText != null) {
            I.o(editText, dVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f23076c0) {
            this.f23076c0 = typeface;
            this.f23115w0.m(typeface);
            C5460j c5460j = this.f23090k;
            if (typeface != c5460j.f45153B) {
                c5460j.f45153B = typeface;
                AppCompatTextView appCompatTextView = c5460j.f45170r;
                if (appCompatTextView != null) {
                    appCompatTextView.setTypeface(typeface);
                }
                AppCompatTextView appCompatTextView2 = c5460j.f45177y;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTypeface(typeface);
                }
            }
            AppCompatTextView appCompatTextView3 = this.f23100p;
            if (appCompatTextView3 != null) {
                appCompatTextView3.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        if (this.f23064P != 1) {
            FrameLayout frameLayout = this.f23073b;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int iC = c();
            if (iC != layoutParams.topMargin) {
                layoutParams.topMargin = iC;
                frameLayout.requestLayout();
            }
        }
    }

    public final void u(boolean z10, boolean z11) {
        ColorStateList colorStateList;
        AppCompatTextView appCompatTextView;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f23079e;
        boolean z12 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f23079e;
        boolean z13 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.f23089j0;
        C4275a c4275a = this.f23115w0;
        if (colorStateList2 != null) {
            c4275a.i(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.f23089j0;
            c4275a.i(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f23109t0) : this.f23109t0));
        } else if (m()) {
            AppCompatTextView appCompatTextView2 = this.f23090k.f45170r;
            c4275a.i(appCompatTextView2 != null ? appCompatTextView2.getTextColors() : null);
        } else if (this.f23096n && (appCompatTextView = this.f23100p) != null) {
            c4275a.i(appCompatTextView.getTextColors());
        } else if (z13 && (colorStateList = this.f23091k0) != null && c4275a.f37468k != colorStateList) {
            c4275a.f37468k = colorStateList;
            c4275a.h(false);
        }
        com.google.android.material.textfield.a aVar = this.f23077d;
        p pVar = this.f23075c;
        if (z12 || !this.f23117x0 || (isEnabled() && z13)) {
            if (z11 || this.f23113v0) {
                ValueAnimator valueAnimator = this.f23121z0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f23121z0.cancel();
                }
                if (z10 && this.f23119y0) {
                    a(1.0f);
                } else {
                    c4275a.k(1.0f);
                }
                this.f23113v0 = false;
                if (e()) {
                    j();
                }
                EditText editText3 = this.f23079e;
                v(editText3 != null ? editText3.getText() : null);
                pVar.f45207k = false;
                pVar.e();
                aVar.f23146s = false;
                aVar.n();
                return;
            }
            return;
        }
        if (z11 || !this.f23113v0) {
            ValueAnimator valueAnimator2 = this.f23121z0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f23121z0.cancel();
            }
            if (z10 && this.f23119y0) {
                a(0.0f);
            } else {
                c4275a.k(0.0f);
            }
            if (e() && !((C5454d) this.f23055G).f45131z.f45132r.isEmpty() && e()) {
                ((C5454d) this.f23055G).o(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.f23113v0 = true;
            AppCompatTextView appCompatTextView3 = this.f23110u;
            if (appCompatTextView3 != null && this.f23108t) {
                appCompatTextView3.setText((CharSequence) null);
                m.a(this.f23073b, this.f23118y);
                this.f23110u.setVisibility(4);
            }
            pVar.f45207k = true;
            pVar.e();
            aVar.f23146s = true;
            aVar.n();
        }
    }

    public final void v(Editable editable) {
        ((com.google.android.gms.measurement.internal.a) this.f23098o).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.f23073b;
        if (length != 0 || this.f23113v0) {
            AppCompatTextView appCompatTextView = this.f23110u;
            if (appCompatTextView == null || !this.f23108t) {
                return;
            }
            appCompatTextView.setText((CharSequence) null);
            m.a(frameLayout, this.f23118y);
            this.f23110u.setVisibility(4);
            return;
        }
        if (this.f23110u == null || !this.f23108t || TextUtils.isEmpty(this.f23106s)) {
            return;
        }
        this.f23110u.setText(this.f23106s);
        m.a(frameLayout, this.f23116x);
        this.f23110u.setVisibility(0);
        this.f23110u.bringToFront();
        announceForAccessibility(this.f23106s);
    }

    public final void w(boolean z10, boolean z11) {
        int defaultColor = this.f23099o0.getDefaultColor();
        int colorForState = this.f23099o0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f23099o0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z10) {
            this.f23069U = colorForState2;
        } else if (z11) {
            this.f23069U = colorForState;
        } else {
            this.f23069U = defaultColor;
        }
    }

    public final void x() throws Resources.NotFoundException {
        AppCompatTextView appCompatTextView;
        EditText editText;
        EditText editText2;
        if (this.f23055G == null || this.f23064P == 0) {
            return;
        }
        boolean z10 = false;
        boolean z11 = isFocused() || ((editText2 = this.f23079e) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f23079e) != null && editText.isHovered())) {
            z10 = true;
        }
        if (!isEnabled()) {
            this.f23069U = this.f23109t0;
        } else if (m()) {
            if (this.f23099o0 != null) {
                w(z11, z10);
            } else {
                this.f23069U = getErrorCurrentTextColors();
            }
        } else if (!this.f23096n || (appCompatTextView = this.f23100p) == null) {
            if (z11) {
                this.f23069U = this.f23097n0;
            } else if (z10) {
                this.f23069U = this.f23095m0;
            } else {
                this.f23069U = this.f23093l0;
            }
        } else if (this.f23099o0 != null) {
            w(z11, z10);
        } else {
            this.f23069U = appCompatTextView.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            p();
        }
        com.google.android.material.textfield.a aVar = this.f23077d;
        aVar.l();
        CheckableImageButton checkableImageButton = aVar.f23132d;
        ColorStateList colorStateList = aVar.f23133e;
        TextInputLayout textInputLayout = aVar.f23130b;
        C5459i.c(textInputLayout, checkableImageButton, colorStateList);
        ColorStateList colorStateList2 = aVar.f23139l;
        CheckableImageButton checkableImageButton2 = aVar.f23136h;
        C5459i.c(textInputLayout, checkableImageButton2, colorStateList2);
        if (aVar.b() instanceof C5457g) {
            if (!textInputLayout.m() || checkableImageButton2.getDrawable() == null) {
                C5459i.a(textInputLayout, checkableImageButton2, aVar.f23139l, aVar.f23140m);
            } else {
                Drawable drawableMutate = checkableImageButton2.getDrawable().mutate();
                a.C0009a.g(drawableMutate, textInputLayout.getErrorCurrentTextColors());
                checkableImageButton2.setImageDrawable(drawableMutate);
            }
        }
        p pVar = this.f23075c;
        C5459i.c(pVar.f45199b, pVar.f45202e, pVar.f45203f);
        if (this.f23064P == 2) {
            int i = this.f23066R;
            if (z11 && isEnabled()) {
                this.f23066R = this.f23068T;
            } else {
                this.f23066R = this.f23067S;
            }
            if (this.f23066R != i && e() && !this.f23113v0) {
                if (e()) {
                    ((C5454d) this.f23055G).o(0.0f, 0.0f, 0.0f, 0.0f);
                }
                j();
            }
        }
        if (this.f23064P == 1) {
            if (!isEnabled()) {
                this.f23070V = this.f23103q0;
            } else if (z10 && !z11) {
                this.f23070V = this.f23107s0;
            } else if (z11) {
                this.f23070V = this.f23105r0;
            } else {
                this.f23070V = this.f23101p0;
            }
        }
        b();
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f23075c.b(drawable);
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f23077d.f23136h.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f23077d.f23136h.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f23077d.i(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f23077d.f23136h;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        com.google.android.material.textfield.a aVar = this.f23077d;
        CheckableImageButton checkableImageButton = aVar.f23136h;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = aVar.f23139l;
            PorterDuff.Mode mode = aVar.f23140m;
            TextInputLayout textInputLayout = aVar.f23130b;
            C5459i.a(textInputLayout, checkableImageButton, colorStateList, mode);
            C5459i.c(textInputLayout, checkableImageButton, aVar.f23139l);
        }
    }

    public class a implements TextWatcher {

        /* renamed from: b, reason: collision with root package name */
        public int f23122b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ EditText f23123c;

        public a(EditText editText) {
            this.f23123c = editText;
            this.f23122b = editText.getLineCount();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) throws Resources.NotFoundException {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.u(!textInputLayout.f23049B0, false);
            if (textInputLayout.f23092l) {
                textInputLayout.n(editable);
            }
            if (textInputLayout.f23108t) {
                textInputLayout.v(editable);
            }
            EditText editText = this.f23123c;
            int lineCount = editText.getLineCount();
            int i = this.f23122b;
            if (lineCount != i) {
                if (lineCount < i) {
                    WeakHashMap<View, S> weakHashMap = I.f3792a;
                    int minimumHeight = editText.getMinimumHeight();
                    int i10 = textInputLayout.f23111u0;
                    if (minimumHeight != i10) {
                        editText.setMinimumHeight(i10);
                    }
                }
                this.f23122b = lineCount;
            }
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i10, int i11) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i10, int i11) {
        }
    }
}
