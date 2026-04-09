package kd;

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
import b5.a1;
import com.google.android.gms.internal.ads.k5;
import com.google.android.gms.internal.measurement.z3;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.liuzh.deviceinfo.R;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class o extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f28175a;

    /* renamed from: b, reason: collision with root package name */
    public final FrameLayout f28176b;

    /* renamed from: c, reason: collision with root package name */
    public final CheckableImageButton f28177c;

    /* renamed from: d, reason: collision with root package name */
    public ColorStateList f28178d;

    /* renamed from: e, reason: collision with root package name */
    public PorterDuff.Mode f28179e;

    /* renamed from: f, reason: collision with root package name */
    public View.OnLongClickListener f28180f;
    public final CheckableImageButton g;

    /* renamed from: h, reason: collision with root package name */
    public final k5 f28181h;

    /* renamed from: i, reason: collision with root package name */
    public int f28182i;
    public final LinkedHashSet j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f28183k;

    /* renamed from: l, reason: collision with root package name */
    public PorterDuff.Mode f28184l;

    /* renamed from: m, reason: collision with root package name */
    public int f28185m;

    /* renamed from: n, reason: collision with root package name */
    public ImageView.ScaleType f28186n;

    /* renamed from: o, reason: collision with root package name */
    public View.OnLongClickListener f28187o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f28188p;

    /* renamed from: q, reason: collision with root package name */
    public final AppCompatTextView f28189q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f28190r;

    /* renamed from: s, reason: collision with root package name */
    public EditText f28191s;

    /* renamed from: t, reason: collision with root package name */
    public final AccessibilityManager f28192t;

    /* renamed from: u, reason: collision with root package name */
    public AccessibilityManager.TouchExplorationStateChangeListener f28193u;

    /* renamed from: v, reason: collision with root package name */
    public final m f28194v;

    public o(TextInputLayout textInputLayout, i0.f fVar) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.f28182i = 0;
        this.j = new LinkedHashSet();
        this.f28194v = new m(this);
        n nVar = new n(this);
        this.f28192t = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f28175a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f28176b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonA = a(R.id.text_input_error_icon, layoutInflaterFrom, this);
        this.f28177c = checkableImageButtonA;
        CheckableImageButton checkableImageButtonA2 = a(R.id.text_input_end_icon, layoutInflaterFrom, frameLayout);
        this.g = checkableImageButtonA2;
        k5 k5Var = new k5();
        k5Var.f13030c = new SparseArray();
        k5Var.f13031d = this;
        TypedArray typedArray = (TypedArray) fVar.f25417c;
        k5Var.f13028a = typedArray.getResourceId(28, 0);
        k5Var.f13029b = typedArray.getResourceId(53, 0);
        this.f28181h = k5Var;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
        this.f28189q = appCompatTextView;
        TypedArray typedArray2 = (TypedArray) fVar.f25417c;
        if (typedArray2.hasValue(38)) {
            this.f28178d = jm.a.k(getContext(), fVar, 38);
        }
        if (typedArray2.hasValue(39)) {
            this.f28179e = zc.m.h(typedArray2.getInt(39, -1), null);
        }
        if (typedArray2.hasValue(37)) {
            i(fVar.A(37));
        }
        checkableImageButtonA.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        checkableImageButtonA.setImportantForAccessibility(2);
        checkableImageButtonA.setClickable(false);
        checkableImageButtonA.setPressable(false);
        checkableImageButtonA.setCheckable(false);
        checkableImageButtonA.setFocusable(false);
        if (!typedArray2.hasValue(54)) {
            if (typedArray2.hasValue(32)) {
                this.f28183k = jm.a.k(getContext(), fVar, 32);
            }
            if (typedArray2.hasValue(33)) {
                this.f28184l = zc.m.h(typedArray2.getInt(33, -1), null);
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
                this.f28183k = jm.a.k(getContext(), fVar, 55);
            }
            if (typedArray2.hasValue(56)) {
                this.f28184l = zc.m.h(typedArray2.getInt(56, -1), null);
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
        if (dimensionPixelSize != this.f28185m) {
            this.f28185m = dimensionPixelSize;
            checkableImageButtonA2.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonA2.setMinimumHeight(dimensionPixelSize);
            checkableImageButtonA.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonA.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray2.hasValue(31)) {
            ImageView.ScaleType scaleTypeC = z3.c(typedArray2.getInt(31, -1));
            this.f28186n = scaleTypeC;
            checkableImageButtonA2.setScaleType(scaleTypeC);
            checkableImageButtonA.setScaleType(scaleTypeC);
        }
        appCompatTextView.setVisibility(8);
        appCompatTextView.setId(R.id.textinput_suffix_text);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        appCompatTextView.setAccessibilityLiveRegion(1);
        appCompatTextView.setTextAppearance(typedArray2.getResourceId(73, 0));
        if (typedArray2.hasValue(74)) {
            appCompatTextView.setTextColor(fVar.y(74));
        }
        CharSequence text3 = typedArray2.getText(72);
        this.f28188p = TextUtils.isEmpty(text3) ? null : text3;
        appCompatTextView.setText(text3);
        n();
        frameLayout.addView(checkableImageButtonA2);
        addView(appCompatTextView);
        addView(frameLayout);
        addView(checkableImageButtonA);
        textInputLayout.f20606f0.add(nVar);
        if (textInputLayout.f20603e != null) {
            nVar.a(textInputLayout);
        }
        addOnAttachStateChangeListener(new a1(3, this));
    }

    public final CheckableImageButton a(int i4, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i4);
        if (jm.a.q(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final p b() {
        p eVar;
        int i4 = this.f28182i;
        k5 k5Var = this.f28181h;
        SparseArray sparseArray = (SparseArray) k5Var.f13030c;
        p pVar = (p) sparseArray.get(i4);
        if (pVar != null) {
            return pVar;
        }
        o oVar = (o) k5Var.f13031d;
        if (i4 == -1) {
            eVar = new e(oVar, 0);
        } else if (i4 == 0) {
            eVar = new e(oVar, 1);
        } else if (i4 == 1) {
            eVar = new w(oVar, k5Var.f13029b);
        } else if (i4 == 2) {
            eVar = new d(oVar);
        } else {
            if (i4 != 3) {
                throw new IllegalArgumentException(je.u.r(i4, "Invalid end icon mode: "));
            }
            eVar = new l(oVar);
        }
        sparseArray.append(i4, eVar);
        return eVar;
    }

    public final int c() {
        int marginStart;
        if (d() || e()) {
            CheckableImageButton checkableImageButton = this.g;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        return this.f28189q.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final boolean d() {
        return this.f28176b.getVisibility() == 0 && this.g.getVisibility() == 0;
    }

    public final boolean e() {
        return this.f28177c.getVisibility() == 0;
    }

    public final void f(boolean z3) {
        boolean z10;
        boolean zIsActivated;
        boolean z11;
        p pVarB = b();
        boolean zJ = pVarB.j();
        CheckableImageButton checkableImageButton = this.g;
        boolean z12 = true;
        if (!zJ || (z11 = checkableImageButton.f20533d) == pVarB.k()) {
            z10 = false;
        } else {
            checkableImageButton.setChecked(!z11);
            z10 = true;
        }
        if (!(pVarB instanceof l) || (zIsActivated = checkableImageButton.isActivated()) == ((l) pVarB).f28166l) {
            z12 = z10;
        } else {
            checkableImageButton.setActivated(!zIsActivated);
        }
        if (z3 || z12) {
            z3.s(this.f28175a, checkableImageButton, this.f28183k);
        }
    }

    public final void g(int i4) {
        if (this.f28182i == i4) {
            return;
        }
        p pVarB = b();
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.f28193u;
        AccessibilityManager accessibilityManager = this.f28192t;
        if (touchExplorationStateChangeListener != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        }
        this.f28193u = null;
        pVarB.r();
        this.f28182i = i4;
        Iterator it = this.j.iterator();
        if (it.hasNext()) {
            throw je.u.o(it);
        }
        h(i4 != 0);
        p pVarB2 = b();
        int iD = this.f28181h.f13028a;
        if (iD == 0) {
            iD = pVarB2.d();
        }
        Drawable drawableL = iD != 0 ? jm.a.l(iD, getContext()) : null;
        CheckableImageButton checkableImageButton = this.g;
        checkableImageButton.setImageDrawable(drawableL);
        TextInputLayout textInputLayout = this.f28175a;
        if (drawableL != null) {
            z3.a(textInputLayout, checkableImageButton, this.f28183k, this.f28184l);
            z3.s(textInputLayout, checkableImageButton, this.f28183k);
        }
        int iC = pVarB2.c();
        CharSequence text = iC != 0 ? getResources().getText(iC) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        checkableImageButton.setCheckable(pVarB2.j());
        if (!pVarB2.i(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i4);
        }
        pVarB2.q();
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListenerH = pVarB2.h();
        this.f28193u = touchExplorationStateChangeListenerH;
        if (touchExplorationStateChangeListenerH != null && accessibilityManager != null && isAttachedToWindow()) {
            accessibilityManager.addTouchExplorationStateChangeListener(this.f28193u);
        }
        View.OnClickListener onClickListenerF = pVarB2.f();
        View.OnLongClickListener onLongClickListener = this.f28187o;
        checkableImageButton.setOnClickListener(onClickListenerF);
        z3.t(checkableImageButton, onLongClickListener);
        EditText editText = this.f28191s;
        if (editText != null) {
            pVarB2.l(editText);
            j(pVarB2);
        }
        z3.a(textInputLayout, checkableImageButton, this.f28183k, this.f28184l);
        f(true);
    }

    public final void h(boolean z3) {
        if (d() != z3) {
            this.g.setVisibility(z3 ? 0 : 8);
            k();
            m();
            this.f28175a.s();
        }
    }

    public final void i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f28177c;
        checkableImageButton.setImageDrawable(drawable);
        l();
        z3.a(this.f28175a, checkableImageButton, this.f28178d, this.f28179e);
    }

    public final void j(p pVar) {
        if (this.f28191s == null) {
            return;
        }
        if (pVar.e() != null) {
            this.f28191s.setOnFocusChangeListener(pVar.e());
        }
        if (pVar.g() != null) {
            this.g.setOnFocusChangeListener(pVar.g());
        }
    }

    public final void k() {
        this.f28176b.setVisibility((this.g.getVisibility() != 0 || e()) ? 8 : 0);
        setVisibility((d() || e() || !((this.f28188p == null || this.f28190r) ? 8 : false)) ? 0 : 8);
    }

    public final void l() {
        CheckableImageButton checkableImageButton = this.f28177c;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f28175a;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.f20613k.f28219q && textInputLayout.o()) ? 0 : 8);
        k();
        m();
        if (this.f28182i != 0) {
            return;
        }
        textInputLayout.s();
    }

    public final void m() {
        TextInputLayout textInputLayout = this.f28175a;
        if (textInputLayout.f20603e == null) {
            return;
        }
        this.f28189q.setPaddingRelative(getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), textInputLayout.f20603e.getPaddingTop(), (d() || e()) ? 0 : textInputLayout.f20603e.getPaddingEnd(), textInputLayout.f20603e.getPaddingBottom());
    }

    public final void n() {
        AppCompatTextView appCompatTextView = this.f28189q;
        int visibility = appCompatTextView.getVisibility();
        int i4 = (this.f28188p == null || this.f28190r) ? 8 : 0;
        if (visibility != i4) {
            b().o(i4 == 0);
        }
        k();
        appCompatTextView.setVisibility(i4);
        this.f28175a.s();
    }
}
