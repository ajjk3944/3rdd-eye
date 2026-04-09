package com.google.android.material.textfield;

import L0.I;
import L0.S;
import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import d4.i;
import d4.n;
import g0.C4356c;
import h4.C4415c;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import o.X;
import p4.AbstractC5458h;
import p4.C5452b;
import p4.C5453c;
import p4.C5457g;
import p4.C5459i;
import p4.C5464n;
import p4.C5465o;

/* compiled from: EndCompoundLayout.java */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class a extends LinearLayout {

    /* renamed from: b, reason: collision with root package name */
    public final TextInputLayout f23130b;

    /* renamed from: c, reason: collision with root package name */
    public final FrameLayout f23131c;

    /* renamed from: d, reason: collision with root package name */
    public final CheckableImageButton f23132d;

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f23133e;

    /* renamed from: f, reason: collision with root package name */
    public PorterDuff.Mode f23134f;

    /* renamed from: g, reason: collision with root package name */
    public View.OnLongClickListener f23135g;

    /* renamed from: h, reason: collision with root package name */
    public final CheckableImageButton f23136h;
    public final d i;

    /* renamed from: j, reason: collision with root package name */
    public int f23137j;

    /* renamed from: k, reason: collision with root package name */
    public final LinkedHashSet<TextInputLayout.g> f23138k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f23139l;

    /* renamed from: m, reason: collision with root package name */
    public PorterDuff.Mode f23140m;

    /* renamed from: n, reason: collision with root package name */
    public int f23141n;

    /* renamed from: o, reason: collision with root package name */
    public ImageView.ScaleType f23142o;

    /* renamed from: p, reason: collision with root package name */
    public View.OnLongClickListener f23143p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f23144q;

    /* renamed from: r, reason: collision with root package name */
    public final AppCompatTextView f23145r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f23146s;

    /* renamed from: t, reason: collision with root package name */
    public EditText f23147t;

    /* renamed from: u, reason: collision with root package name */
    public final AccessibilityManager f23148u;

    /* renamed from: v, reason: collision with root package name */
    public D7.c f23149v;

    /* renamed from: w, reason: collision with root package name */
    public final C0347a f23150w;

    /* compiled from: EndCompoundLayout.java */
    /* renamed from: com.google.android.material.textfield.a$a, reason: collision with other inner class name */
    public class C0347a extends i {
        public C0347a() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            a.this.b().a();
        }

        @Override // d4.i, android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i10, int i11) {
            a.this.b().b();
        }
    }

    /* compiled from: EndCompoundLayout.java */
    public class b implements TextInputLayout.f {
        public b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public final void a(TextInputLayout textInputLayout) {
            a aVar = a.this;
            if (aVar.f23147t == textInputLayout.getEditText()) {
                return;
            }
            EditText editText = aVar.f23147t;
            C0347a c0347a = aVar.f23150w;
            if (editText != null) {
                editText.removeTextChangedListener(c0347a);
                if (aVar.f23147t.getOnFocusChangeListener() == aVar.b().e()) {
                    aVar.f23147t.setOnFocusChangeListener(null);
                }
            }
            EditText editText2 = textInputLayout.getEditText();
            aVar.f23147t = editText2;
            if (editText2 != null) {
                editText2.addTextChangedListener(c0347a);
            }
            aVar.b().m(aVar.f23147t);
            aVar.j(aVar.b());
        }
    }

    /* compiled from: EndCompoundLayout.java */
    public class c implements View.OnAttachStateChangeListener {
        public c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            AccessibilityManager accessibilityManager;
            a aVar = a.this;
            if (aVar.f23149v == null || (accessibilityManager = aVar.f23148u) == null) {
                return;
            }
            WeakHashMap<View, S> weakHashMap = I.f3792a;
            if (aVar.isAttachedToWindow()) {
                accessibilityManager.addTouchExplorationStateChangeListener(new M0.b(aVar.f23149v));
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            AccessibilityManager accessibilityManager;
            a aVar = a.this;
            D7.c cVar = aVar.f23149v;
            if (cVar == null || (accessibilityManager = aVar.f23148u) == null) {
                return;
            }
            accessibilityManager.removeTouchExplorationStateChangeListener(new M0.b(cVar));
        }
    }

    /* compiled from: EndCompoundLayout.java */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final SparseArray<AbstractC5458h> f23154a = new SparseArray<>();

        /* renamed from: b, reason: collision with root package name */
        public final a f23155b;

        /* renamed from: c, reason: collision with root package name */
        public final int f23156c;

        /* renamed from: d, reason: collision with root package name */
        public final int f23157d;

        public d(a aVar, X x10) {
            this.f23155b = aVar;
            TypedArray typedArray = x10.f44608b;
            this.f23156c = typedArray.getResourceId(28, 0);
            this.f23157d = typedArray.getResourceId(52, 0);
        }
    }

    public a(TextInputLayout textInputLayout, X x10) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.f23137j = 0;
        this.f23138k = new LinkedHashSet<>();
        this.f23150w = new C0347a();
        b bVar = new b();
        this.f23148u = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f23130b = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f23131c = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonA = a(this, layoutInflaterFrom, R.id.text_input_error_icon);
        this.f23132d = checkableImageButtonA;
        CheckableImageButton checkableImageButtonA2 = a(frameLayout, layoutInflaterFrom, R.id.text_input_end_icon);
        this.f23136h = checkableImageButtonA2;
        this.i = new d(this, x10);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
        this.f23145r = appCompatTextView;
        TypedArray typedArray = x10.f44608b;
        if (typedArray.hasValue(38)) {
            this.f23133e = C4415c.b(getContext(), x10, 38);
        }
        if (typedArray.hasValue(39)) {
            this.f23134f = n.b(typedArray.getInt(39, -1), null);
        }
        if (typedArray.hasValue(37)) {
            i(x10.b(37));
        }
        checkableImageButtonA.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        WeakHashMap<View, S> weakHashMap = I.f3792a;
        checkableImageButtonA.setImportantForAccessibility(2);
        checkableImageButtonA.setClickable(false);
        checkableImageButtonA.setPressable(false);
        checkableImageButtonA.setFocusable(false);
        if (!typedArray.hasValue(53)) {
            if (typedArray.hasValue(32)) {
                this.f23139l = C4415c.b(getContext(), x10, 32);
            }
            if (typedArray.hasValue(33)) {
                this.f23140m = n.b(typedArray.getInt(33, -1), null);
            }
        }
        if (typedArray.hasValue(30)) {
            g(typedArray.getInt(30, 0));
            if (typedArray.hasValue(27) && checkableImageButtonA2.getContentDescription() != (text = typedArray.getText(27))) {
                checkableImageButtonA2.setContentDescription(text);
            }
            checkableImageButtonA2.setCheckable(typedArray.getBoolean(26, true));
        } else if (typedArray.hasValue(53)) {
            if (typedArray.hasValue(54)) {
                this.f23139l = C4415c.b(getContext(), x10, 54);
            }
            if (typedArray.hasValue(55)) {
                this.f23140m = n.b(typedArray.getInt(55, -1), null);
            }
            g(typedArray.getBoolean(53, false) ? 1 : 0);
            CharSequence text2 = typedArray.getText(51);
            if (checkableImageButtonA2.getContentDescription() != text2) {
                checkableImageButtonA2.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f23141n) {
            this.f23141n = dimensionPixelSize;
            checkableImageButtonA2.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonA2.setMinimumHeight(dimensionPixelSize);
            checkableImageButtonA.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonA.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(31)) {
            ImageView.ScaleType scaleTypeB = C5459i.b(typedArray.getInt(31, -1));
            this.f23142o = scaleTypeB;
            checkableImageButtonA2.setScaleType(scaleTypeB);
            checkableImageButtonA.setScaleType(scaleTypeB);
        }
        appCompatTextView.setVisibility(8);
        appCompatTextView.setId(R.id.textinput_suffix_text);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        appCompatTextView.setAccessibilityLiveRegion(1);
        appCompatTextView.setTextAppearance(typedArray.getResourceId(72, 0));
        if (typedArray.hasValue(73)) {
            appCompatTextView.setTextColor(x10.a(73));
        }
        CharSequence text3 = typedArray.getText(71);
        this.f23144q = TextUtils.isEmpty(text3) ? null : text3;
        appCompatTextView.setText(text3);
        n();
        frameLayout.addView(checkableImageButtonA2);
        addView(appCompatTextView);
        addView(frameLayout);
        addView(checkableImageButtonA);
        textInputLayout.f23082f0.add(bVar);
        if (textInputLayout.f23079e != null) {
            bVar.a(textInputLayout);
        }
        addOnAttachStateChangeListener(new c());
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (C4415c.d(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final AbstractC5458h b() {
        AbstractC5458h c5453c;
        int i = this.f23137j;
        d dVar = this.i;
        SparseArray<AbstractC5458h> sparseArray = dVar.f23154a;
        AbstractC5458h abstractC5458h = sparseArray.get(i);
        if (abstractC5458h != null) {
            return abstractC5458h;
        }
        a aVar = dVar.f23155b;
        if (i == -1) {
            c5453c = new C5453c(aVar);
        } else if (i == 0) {
            c5453c = new C5464n(aVar);
        } else if (i == 1) {
            c5453c = new C5465o(aVar, dVar.f23157d);
        } else if (i == 2) {
            c5453c = new C5452b(aVar);
        } else {
            if (i != 3) {
                throw new IllegalArgumentException(C4356c.h(i, "Invalid end icon mode: "));
            }
            c5453c = new C5457g(aVar);
        }
        sparseArray.append(i, c5453c);
        return c5453c;
    }

    public final int c() {
        int marginStart;
        if (d() || e()) {
            CheckableImageButton checkableImageButton = this.f23136h;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        WeakHashMap<View, S> weakHashMap = I.f3792a;
        return this.f23145r.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final boolean d() {
        return this.f23131c.getVisibility() == 0 && this.f23136h.getVisibility() == 0;
    }

    public final boolean e() {
        return this.f23132d.getVisibility() == 0;
    }

    public final void f(boolean z10) {
        boolean z11;
        boolean zIsActivated;
        boolean z12;
        AbstractC5458h abstractC5458hB = b();
        boolean zK = abstractC5458hB.k();
        CheckableImageButton checkableImageButton = this.f23136h;
        boolean z13 = true;
        if (!zK || (z12 = checkableImageButton.f22976e) == abstractC5458hB.l()) {
            z11 = false;
        } else {
            checkableImageButton.setChecked(!z12);
            z11 = true;
        }
        if (!(abstractC5458hB instanceof C5457g) || (zIsActivated = checkableImageButton.isActivated()) == abstractC5458hB.j()) {
            z13 = z11;
        } else {
            checkableImageButton.setActivated(!zIsActivated);
        }
        if (z10 || z13) {
            C5459i.c(this.f23130b, checkableImageButton, this.f23139l);
        }
    }

    public final void g(int i) {
        if (this.f23137j == i) {
            return;
        }
        AbstractC5458h abstractC5458hB = b();
        D7.c cVar = this.f23149v;
        AccessibilityManager accessibilityManager = this.f23148u;
        if (cVar != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(new M0.b(cVar));
        }
        this.f23149v = null;
        abstractC5458hB.s();
        this.f23137j = i;
        Iterator<TextInputLayout.g> it = this.f23138k.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        h(i != 0);
        AbstractC5458h abstractC5458hB2 = b();
        int iD = this.i.f23156c;
        if (iD == 0) {
            iD = abstractC5458hB2.d();
        }
        Drawable drawableW = iD != 0 ? A9.I.w(getContext(), iD) : null;
        CheckableImageButton checkableImageButton = this.f23136h;
        checkableImageButton.setImageDrawable(drawableW);
        TextInputLayout textInputLayout = this.f23130b;
        if (drawableW != null) {
            C5459i.a(textInputLayout, checkableImageButton, this.f23139l, this.f23140m);
            C5459i.c(textInputLayout, checkableImageButton, this.f23139l);
        }
        int iC = abstractC5458hB2.c();
        CharSequence text = iC != 0 ? getResources().getText(iC) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        checkableImageButton.setCheckable(abstractC5458hB2.k());
        if (!abstractC5458hB2.i(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
        }
        abstractC5458hB2.r();
        D7.c cVarH = abstractC5458hB2.h();
        this.f23149v = cVarH;
        if (cVarH != null && accessibilityManager != null) {
            WeakHashMap<View, S> weakHashMap = I.f3792a;
            if (isAttachedToWindow()) {
                accessibilityManager.addTouchExplorationStateChangeListener(new M0.b(this.f23149v));
            }
        }
        View.OnClickListener onClickListenerF = abstractC5458hB2.f();
        View.OnLongClickListener onLongClickListener = this.f23143p;
        checkableImageButton.setOnClickListener(onClickListenerF);
        C5459i.d(checkableImageButton, onLongClickListener);
        EditText editText = this.f23147t;
        if (editText != null) {
            abstractC5458hB2.m(editText);
            j(abstractC5458hB2);
        }
        C5459i.a(textInputLayout, checkableImageButton, this.f23139l, this.f23140m);
        f(true);
    }

    public final void h(boolean z10) {
        if (d() != z10) {
            this.f23136h.setVisibility(z10 ? 0 : 8);
            k();
            m();
            this.f23130b.q();
        }
    }

    public final void i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f23132d;
        checkableImageButton.setImageDrawable(drawable);
        l();
        C5459i.a(this.f23130b, checkableImageButton, this.f23133e, this.f23134f);
    }

    public final void j(AbstractC5458h abstractC5458h) {
        if (this.f23147t == null) {
            return;
        }
        if (abstractC5458h.e() != null) {
            this.f23147t.setOnFocusChangeListener(abstractC5458h.e());
        }
        if (abstractC5458h.g() != null) {
            this.f23136h.setOnFocusChangeListener(abstractC5458h.g());
        }
    }

    public final void k() {
        this.f23131c.setVisibility((this.f23136h.getVisibility() != 0 || e()) ? 8 : 0);
        setVisibility((d() || e() || !((this.f23144q == null || this.f23146s) ? 8 : false)) ? 0 : 8);
    }

    public final void l() {
        CheckableImageButton checkableImageButton = this.f23132d;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f23130b;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.f23090k.f45169q && textInputLayout.m()) ? 0 : 8);
        k();
        m();
        if (this.f23137j != 0) {
            return;
        }
        textInputLayout.q();
    }

    public final void m() {
        int paddingEnd;
        TextInputLayout textInputLayout = this.f23130b;
        if (textInputLayout.f23079e == null) {
            return;
        }
        if (d() || e()) {
            paddingEnd = 0;
        } else {
            EditText editText = textInputLayout.f23079e;
            WeakHashMap<View, S> weakHashMap = I.f3792a;
            paddingEnd = editText.getPaddingEnd();
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = textInputLayout.f23079e.getPaddingTop();
        int paddingBottom = textInputLayout.f23079e.getPaddingBottom();
        WeakHashMap<View, S> weakHashMap2 = I.f3792a;
        this.f23145r.setPaddingRelative(dimensionPixelSize, paddingTop, paddingEnd, paddingBottom);
    }

    public final void n() {
        AppCompatTextView appCompatTextView = this.f23145r;
        int visibility = appCompatTextView.getVisibility();
        int i = (this.f23144q == null || this.f23146s) ? 8 : 0;
        if (visibility != i) {
            b().p(i == 0);
        }
        k();
        appCompatTextView.setVisibility(i);
        this.f23130b.q();
    }
}
