package defpackage;

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
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.phuongpn.whousemywifi.networkscanner.R;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class us extends LinearLayout {
    public final rs A;
    public final TextInputLayout f;
    public final FrameLayout g;
    public final CheckableImageButton h;
    public ColorStateList i;
    public PorterDuff.Mode j;
    public View.OnLongClickListener k;
    public final CheckableImageButton l;
    public final ts m;
    public int n;
    public final LinkedHashSet o;
    public ColorStateList p;
    public PorterDuff.Mode q;
    public int r;
    public ImageView.ScaleType s;
    public View.OnLongClickListener t;
    public CharSequence u;
    public final s7 v;
    public boolean w;
    public EditText x;
    public final AccessibilityManager y;
    public AccessibilityManager.TouchExplorationStateChangeListener z;

    public us(TextInputLayout textInputLayout, xb4 xb4Var) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.n = 0;
        this.o = new LinkedHashSet();
        this.A = new rs(this);
        ss ssVar = new ss(this);
        this.y = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.g = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonA = a(this, layoutInflaterFrom, R.id.text_input_error_icon);
        this.h = checkableImageButtonA;
        CheckableImageButton checkableImageButtonA2 = a(frameLayout, layoutInflaterFrom, R.id.text_input_end_icon);
        this.l = checkableImageButtonA2;
        ts tsVar = new ts();
        tsVar.c = new SparseArray();
        tsVar.d = this;
        TypedArray typedArray = (TypedArray) xb4Var.h;
        tsVar.a = typedArray.getResourceId(28, 0);
        tsVar.b = typedArray.getResourceId(53, 0);
        this.m = tsVar;
        s7 s7Var = new s7(getContext(), null);
        this.v = s7Var;
        TypedArray typedArray2 = (TypedArray) xb4Var.h;
        if (typedArray2.hasValue(38)) {
            this.i = ob1.f(getContext(), xb4Var, 38);
        }
        if (typedArray2.hasValue(39)) {
            this.j = qb1.m(typedArray2.getInt(39, -1), null);
        }
        if (typedArray2.hasValue(37)) {
            i(xb4Var.m(37));
        }
        checkableImageButtonA.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        checkableImageButtonA.setImportantForAccessibility(2);
        checkableImageButtonA.setClickable(false);
        checkableImageButtonA.setPressable(false);
        checkableImageButtonA.setCheckable(false);
        checkableImageButtonA.setFocusable(false);
        if (!typedArray2.hasValue(54)) {
            if (typedArray2.hasValue(32)) {
                this.p = ob1.f(getContext(), xb4Var, 32);
            }
            if (typedArray2.hasValue(33)) {
                this.q = qb1.m(typedArray2.getInt(33, -1), null);
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
                this.p = ob1.f(getContext(), xb4Var, 55);
            }
            if (typedArray2.hasValue(56)) {
                this.q = qb1.m(typedArray2.getInt(56, -1), null);
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
        if (dimensionPixelSize != this.r) {
            this.r = dimensionPixelSize;
            checkableImageButtonA2.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonA2.setMinimumHeight(dimensionPixelSize);
            checkableImageButtonA.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonA.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray2.hasValue(31)) {
            ImageView.ScaleType scaleTypeJ = bd2.j(typedArray2.getInt(31, -1));
            this.s = scaleTypeJ;
            checkableImageButtonA2.setScaleType(scaleTypeJ);
            checkableImageButtonA.setScaleType(scaleTypeJ);
        }
        s7Var.setVisibility(8);
        s7Var.setId(R.id.textinput_suffix_text);
        s7Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        s7Var.setAccessibilityLiveRegion(1);
        s7Var.setTextAppearance(typedArray2.getResourceId(73, 0));
        if (typedArray2.hasValue(74)) {
            s7Var.setTextColor(xb4Var.k(74));
        }
        CharSequence text3 = typedArray2.getText(72);
        this.u = TextUtils.isEmpty(text3) ? null : text3;
        s7Var.setText(text3);
        n();
        frameLayout.addView(checkableImageButtonA2);
        addView(s7Var);
        addView(frameLayout);
        addView(checkableImageButtonA);
        textInputLayout.k0.add(ssVar);
        if (textInputLayout.j != null) {
            ssVar.a(textInputLayout);
        }
        addOnAttachStateChangeListener(new ud(1, this));
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (ob1.o(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final vs b() {
        vs dlVar;
        int i = this.n;
        ts tsVar = this.m;
        SparseArray sparseArray = (SparseArray) tsVar.c;
        vs vsVar = (vs) sparseArray.get(i);
        if (vsVar != null) {
            return vsVar;
        }
        us usVar = (us) tsVar.d;
        if (i == -1) {
            dlVar = new dl(usVar, 0);
        } else if (i == 0) {
            dlVar = new dl(usVar, 1);
        } else if (i == 1) {
            dlVar = new jk0(usVar, tsVar.b);
        } else if (i == 2) {
            dlVar = new qf(usVar);
        } else {
            if (i != 3) {
                throw new IllegalArgumentException(ex0.f("Invalid end icon mode: ", i));
            }
            dlVar = new tq(usVar);
        }
        sparseArray.append(i, dlVar);
        return dlVar;
    }

    public final int c() {
        int marginStart;
        if (d() || e()) {
            CheckableImageButton checkableImageButton = this.l;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        return this.v.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final boolean d() {
        return this.g.getVisibility() == 0 && this.l.getVisibility() == 0;
    }

    public final boolean e() {
        return this.h.getVisibility() == 0;
    }

    public final void f(boolean z) {
        boolean z2;
        boolean zIsActivated;
        boolean z3;
        vs vsVarB = b();
        boolean zJ = vsVarB.j();
        CheckableImageButton checkableImageButton = this.l;
        boolean z4 = true;
        if (!zJ || (z3 = checkableImageButton.i) == vsVarB.k()) {
            z2 = false;
        } else {
            checkableImageButton.setChecked(!z3);
            z2 = true;
        }
        if (!(vsVarB instanceof tq) || (zIsActivated = checkableImageButton.isActivated()) == ((tq) vsVarB).l) {
            z4 = z2;
        } else {
            checkableImageButton.setActivated(!zIsActivated);
        }
        if (z || z4) {
            bd2.t(this.f, checkableImageButton, this.p);
        }
    }

    public final void g(int i) {
        if (this.n == i) {
            return;
        }
        vs vsVarB = b();
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.z;
        AccessibilityManager accessibilityManager = this.y;
        if (touchExplorationStateChangeListener != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        }
        this.z = null;
        vsVarB.r();
        this.n = i;
        Iterator it = this.o.iterator();
        if (it.hasNext()) {
            throw ex0.e(it);
        }
        h(i != 0);
        vs vsVarB2 = b();
        int iD = this.m.a;
        if (iD == 0) {
            iD = vsVarB2.d();
        }
        Drawable drawableH = iD != 0 ? ob1.h(getContext(), iD) : null;
        CheckableImageButton checkableImageButton = this.l;
        checkableImageButton.setImageDrawable(drawableH);
        TextInputLayout textInputLayout = this.f;
        if (drawableH != null) {
            bd2.b(textInputLayout, checkableImageButton, this.p, this.q);
            bd2.t(textInputLayout, checkableImageButton, this.p);
        }
        int iC = vsVarB2.c();
        CharSequence text = iC != 0 ? getResources().getText(iC) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        checkableImageButton.setCheckable(vsVarB2.j());
        if (!vsVarB2.i(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
        }
        vsVarB2.q();
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListenerH = vsVarB2.h();
        this.z = touchExplorationStateChangeListenerH;
        if (touchExplorationStateChangeListenerH != null && accessibilityManager != null && isAttachedToWindow()) {
            accessibilityManager.addTouchExplorationStateChangeListener(this.z);
        }
        View.OnClickListener onClickListenerF = vsVarB2.f();
        View.OnLongClickListener onLongClickListener = this.t;
        checkableImageButton.setOnClickListener(onClickListenerF);
        bd2.w(checkableImageButton, onLongClickListener);
        EditText editText = this.x;
        if (editText != null) {
            vsVarB2.l(editText);
            j(vsVarB2);
        }
        bd2.b(textInputLayout, checkableImageButton, this.p, this.q);
        f(true);
    }

    public final void h(boolean z) {
        if (d() != z) {
            this.l.setVisibility(z ? 0 : 8);
            k();
            m();
            this.f.s();
        }
    }

    public final void i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.h;
        checkableImageButton.setImageDrawable(drawable);
        l();
        bd2.b(this.f, checkableImageButton, this.i, this.j);
    }

    public final void j(vs vsVar) {
        if (this.x == null) {
            return;
        }
        if (vsVar.e() != null) {
            this.x.setOnFocusChangeListener(vsVar.e());
        }
        if (vsVar.g() != null) {
            this.l.setOnFocusChangeListener(vsVar.g());
        }
    }

    public final void k() {
        this.g.setVisibility((this.l.getVisibility() != 0 || e()) ? 8 : 0);
        setVisibility((d() || e() || !((this.u == null || this.w) ? 8 : false)) ? 0 : 8);
    }

    public final void l() {
        CheckableImageButton checkableImageButton = this.h;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.p.q && textInputLayout.o()) ? 0 : 8);
        k();
        m();
        if (this.n != 0) {
            return;
        }
        textInputLayout.s();
    }

    public final void m() {
        TextInputLayout textInputLayout = this.f;
        if (textInputLayout.j == null) {
            return;
        }
        this.v.setPaddingRelative(getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), textInputLayout.j.getPaddingTop(), (d() || e()) ? 0 : textInputLayout.j.getPaddingEnd(), textInputLayout.j.getPaddingBottom());
    }

    public final void n() {
        s7 s7Var = this.v;
        int visibility = s7Var.getVisibility();
        int i = (this.u == null || this.w) ? 8 : 0;
        if (visibility != i) {
            b().o(i == 0);
        }
        k();
        s7Var.setVisibility(i);
        this.f.s();
    }
}
