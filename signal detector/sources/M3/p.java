package M3;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
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
import com.apm.insight.R;
import com.google.android.gms.internal.ads.AbstractC1135f5;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import o.a1;
import x3.AbstractC2993B;

/* loaded from: classes.dex */
public final class p extends LinearLayout {

    /* renamed from: C, reason: collision with root package name */
    public View.OnLongClickListener f2874C;

    /* renamed from: D, reason: collision with root package name */
    public CharSequence f2875D;

    /* renamed from: E, reason: collision with root package name */
    public final AppCompatTextView f2876E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f2877F;

    /* renamed from: G, reason: collision with root package name */
    public EditText f2878G;

    /* renamed from: H, reason: collision with root package name */
    public final AccessibilityManager f2879H;

    /* renamed from: I, reason: collision with root package name */
    public AccessibilityManager.TouchExplorationStateChangeListener f2880I;

    /* renamed from: J, reason: collision with root package name */
    public final l f2881J;

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f2882a;

    /* renamed from: b, reason: collision with root package name */
    public final FrameLayout f2883b;

    /* renamed from: c, reason: collision with root package name */
    public final CheckableImageButton f2884c;

    /* renamed from: d, reason: collision with root package name */
    public ColorStateList f2885d;

    /* renamed from: e, reason: collision with root package name */
    public PorterDuff.Mode f2886e;

    /* renamed from: f, reason: collision with root package name */
    public View.OnLongClickListener f2887f;

    /* renamed from: g, reason: collision with root package name */
    public final CheckableImageButton f2888g;

    /* renamed from: h, reason: collision with root package name */
    public final o f2889h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public final LinkedHashSet f2890j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f2891k;

    /* renamed from: l, reason: collision with root package name */
    public PorterDuff.Mode f2892l;

    /* renamed from: m, reason: collision with root package name */
    public int f2893m;

    /* renamed from: n, reason: collision with root package name */
    public ImageView.ScaleType f2894n;

    public p(TextInputLayout textInputLayout, a1 a1Var) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.i = 0;
        this.f2890j = new LinkedHashSet();
        this.f2881J = new l(this);
        m mVar = new m(this);
        this.f2879H = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f2882a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f2883b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonA = a(this, layoutInflaterFrom, R.id.text_input_error_icon);
        this.f2884c = checkableImageButtonA;
        CheckableImageButton checkableImageButtonA2 = a(frameLayout, layoutInflaterFrom, R.id.text_input_end_icon);
        this.f2888g = checkableImageButtonA2;
        o oVar = new o();
        oVar.f2872c = new SparseArray();
        oVar.f2873d = this;
        TypedArray typedArray = (TypedArray) a1Var.f22480c;
        oVar.f2870a = typedArray.getResourceId(28, 0);
        oVar.f2871b = typedArray.getResourceId(53, 0);
        this.f2889h = oVar;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
        this.f2876E = appCompatTextView;
        TypedArray typedArray2 = (TypedArray) a1Var.f22480c;
        if (typedArray2.hasValue(38)) {
            this.f2885d = com.bumptech.glide.c.o(getContext(), a1Var, 38);
        }
        if (typedArray2.hasValue(39)) {
            this.f2886e = AbstractC2993B.k(typedArray2.getInt(39, -1), null);
        }
        if (typedArray2.hasValue(37)) {
            i(a1Var.d(37));
        }
        checkableImageButtonA.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        checkableImageButtonA.setImportantForAccessibility(2);
        checkableImageButtonA.setClickable(false);
        checkableImageButtonA.setPressable(false);
        checkableImageButtonA.setCheckable(false);
        checkableImageButtonA.setFocusable(false);
        if (!typedArray2.hasValue(54)) {
            if (typedArray2.hasValue(32)) {
                this.f2891k = com.bumptech.glide.c.o(getContext(), a1Var, 32);
            }
            if (typedArray2.hasValue(33)) {
                this.f2892l = AbstractC2993B.k(typedArray2.getInt(33, -1), null);
            }
        }
        if (typedArray2.hasValue(30)) {
            g(typedArray2.getInt(30, 0));
            if (typedArray2.hasValue(27) && checkableImageButtonA2.getContentDescription() != (text = typedArray2.getText(27))) {
                checkableImageButtonA2.setContentDescription(text);
            }
            checkableImageButtonA2.setCheckable(typedArray2.getBoolean(26, true));
        } else if (typedArray2.hasValue(54)) {
            if (typedArray2.hasValue(55)) {
                this.f2891k = com.bumptech.glide.c.o(getContext(), a1Var, 55);
            }
            if (typedArray2.hasValue(56)) {
                this.f2892l = AbstractC2993B.k(typedArray2.getInt(56, -1), null);
            }
            g(typedArray2.getBoolean(54, false) ? 1 : 0);
            CharSequence text2 = typedArray2.getText(52);
            if (checkableImageButtonA2.getContentDescription() != text2) {
                checkableImageButtonA2.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray2.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f2893m) {
            this.f2893m = dimensionPixelSize;
            checkableImageButtonA2.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonA2.setMinimumHeight(dimensionPixelSize);
            checkableImageButtonA.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonA.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray2.hasValue(31)) {
            ImageView.ScaleType scaleTypeL = com.bumptech.glide.d.l(typedArray2.getInt(31, -1));
            this.f2894n = scaleTypeL;
            checkableImageButtonA2.setScaleType(scaleTypeL);
            checkableImageButtonA.setScaleType(scaleTypeL);
        }
        appCompatTextView.setVisibility(8);
        appCompatTextView.setId(R.id.textinput_suffix_text);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        appCompatTextView.setAccessibilityLiveRegion(1);
        appCompatTextView.setTextAppearance(typedArray2.getResourceId(73, 0));
        if (typedArray2.hasValue(74)) {
            appCompatTextView.setTextColor(a1Var.c(74));
        }
        CharSequence text3 = typedArray2.getText(72);
        this.f2875D = TextUtils.isEmpty(text3) ? null : text3;
        appCompatTextView.setText(text3);
        n();
        frameLayout.addView(checkableImageButtonA2);
        addView(appCompatTextView);
        addView(frameLayout);
        addView(checkableImageButtonA);
        textInputLayout.f18560t0.add(mVar);
        if (textInputLayout.f18536e != null) {
            mVar.a(textInputLayout);
        }
        addOnAttachStateChangeListener(new n(0, this));
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (com.bumptech.glide.c.E(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final q b() {
        q eVar;
        int i = this.i;
        o oVar = this.f2889h;
        SparseArray sparseArray = (SparseArray) oVar.f2872c;
        q qVar = (q) sparseArray.get(i);
        if (qVar != null) {
            return qVar;
        }
        p pVar = (p) oVar.f2873d;
        if (i == -1) {
            eVar = new e(pVar, 0);
        } else if (i == 0) {
            eVar = new e(pVar, 1);
        } else if (i == 1) {
            eVar = new x(pVar, oVar.f2871b);
        } else if (i == 2) {
            eVar = new C0173d(pVar);
        } else {
            if (i != 3) {
                throw new IllegalArgumentException(AbstractC1135f5.l(i, "Invalid end icon mode: "));
            }
            eVar = new k(pVar);
        }
        sparseArray.append(i, eVar);
        return eVar;
    }

    public final int c() {
        int marginStart;
        if (d() || e()) {
            CheckableImageButton checkableImageButton = this.f2888g;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        return this.f2876E.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final boolean d() {
        return this.f2883b.getVisibility() == 0 && this.f2888g.getVisibility() == 0;
    }

    public final boolean e() {
        return this.f2884c.getVisibility() == 0;
    }

    public final void f(boolean z6) {
        boolean z7;
        boolean zIsActivated;
        boolean z8;
        q qVarB = b();
        boolean zK = qVarB.k();
        CheckableImageButton checkableImageButton = this.f2888g;
        boolean z9 = true;
        if (!zK || (z8 = checkableImageButton.f18384d) == qVarB.l()) {
            z7 = false;
        } else {
            checkableImageButton.setChecked(!z8);
            z7 = true;
        }
        if (!(qVarB instanceof k) || (zIsActivated = checkableImageButton.isActivated()) == qVarB.j()) {
            z9 = z7;
        } else {
            checkableImageButton.setActivated(!zIsActivated);
        }
        if (z6 || z9) {
            com.bumptech.glide.d.N(this.f2882a, checkableImageButton, this.f2891k);
        }
    }

    public final void g(int i) {
        if (this.i == i) {
            return;
        }
        q qVarB = b();
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.f2880I;
        AccessibilityManager accessibilityManager = this.f2879H;
        if (touchExplorationStateChangeListener != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        }
        this.f2880I = null;
        qVarB.s();
        this.i = i;
        Iterator it = this.f2890j.iterator();
        if (it.hasNext()) {
            throw A.f.f(it);
        }
        h(i != 0);
        q qVarB2 = b();
        int iD = this.f2889h.f2870a;
        if (iD == 0) {
            iD = qVarB2.d();
        }
        Drawable drawableI = iD != 0 ? a4.t.i(getContext(), iD) : null;
        CheckableImageButton checkableImageButton = this.f2888g;
        checkableImageButton.setImageDrawable(drawableI);
        TextInputLayout textInputLayout = this.f2882a;
        if (drawableI != null) {
            com.bumptech.glide.d.e(textInputLayout, checkableImageButton, this.f2891k, this.f2892l);
            com.bumptech.glide.d.N(textInputLayout, checkableImageButton, this.f2891k);
        }
        int iC = qVarB2.c();
        CharSequence text = iC != 0 ? getResources().getText(iC) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        checkableImageButton.setCheckable(qVarB2.k());
        if (!qVarB2.i(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
        }
        qVarB2.r();
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListenerH = qVarB2.h();
        this.f2880I = touchExplorationStateChangeListenerH;
        if (touchExplorationStateChangeListenerH != null && accessibilityManager != null && isAttachedToWindow()) {
            accessibilityManager.addTouchExplorationStateChangeListener(this.f2880I);
        }
        View.OnClickListener onClickListenerF = qVarB2.f();
        View.OnLongClickListener onLongClickListener = this.f2874C;
        checkableImageButton.setOnClickListener(onClickListenerF);
        com.bumptech.glide.d.V(checkableImageButton, onLongClickListener);
        EditText editText = this.f2878G;
        if (editText != null) {
            qVarB2.m(editText);
            j(qVarB2);
        }
        com.bumptech.glide.d.e(textInputLayout, checkableImageButton, this.f2891k, this.f2892l);
        f(true);
    }

    public final void h(boolean z6) {
        if (d() != z6) {
            this.f2888g.setVisibility(z6 ? 0 : 8);
            k();
            m();
            this.f2882a.s();
        }
    }

    public final void i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f2884c;
        checkableImageButton.setImageDrawable(drawable);
        l();
        com.bumptech.glide.d.e(this.f2882a, checkableImageButton, this.f2885d, this.f2886e);
    }

    public final void j(q qVar) {
        if (this.f2878G == null) {
            return;
        }
        if (qVar.e() != null) {
            this.f2878G.setOnFocusChangeListener(qVar.e());
        }
        if (qVar.g() != null) {
            this.f2888g.setOnFocusChangeListener(qVar.g());
        }
    }

    public final void k() {
        this.f2883b.setVisibility((this.f2888g.getVisibility() != 0 || e()) ? 8 : 0);
        setVisibility((d() || e() || !((this.f2875D == null || this.f2877F) ? 8 : false)) ? 0 : 8);
    }

    public final void l() {
        CheckableImageButton checkableImageButton = this.f2884c;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f2882a;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.f18547k.f2922q && textInputLayout.o()) ? 0 : 8);
        k();
        m();
        if (this.i != 0) {
            return;
        }
        textInputLayout.s();
    }

    public final void m() {
        TextInputLayout textInputLayout = this.f2882a;
        if (textInputLayout.f18536e == null) {
            return;
        }
        this.f2876E.setPaddingRelative(getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), textInputLayout.f18536e.getPaddingTop(), (d() || e()) ? 0 : textInputLayout.f18536e.getPaddingEnd(), textInputLayout.f18536e.getPaddingBottom());
    }

    public final void n() {
        AppCompatTextView appCompatTextView = this.f2876E;
        int visibility = appCompatTextView.getVisibility();
        int i = (this.f2875D == null || this.f2877F) ? 8 : 0;
        if (visibility != i) {
            b().p(i == 0);
        }
        k();
        appCompatTextView.setVisibility(i);
        this.f2882a.s();
    }
}
