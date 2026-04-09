package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.z0;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes2.dex */
public class s extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f11363a;

    /* renamed from: b, reason: collision with root package name */
    public final FrameLayout f11364b;

    /* renamed from: c, reason: collision with root package name */
    public final CheckableImageButton f11365c;

    /* renamed from: d, reason: collision with root package name */
    public ColorStateList f11366d;

    /* renamed from: e, reason: collision with root package name */
    public PorterDuff.Mode f11367e;

    /* renamed from: f, reason: collision with root package name */
    public View.OnLongClickListener f11368f;

    /* renamed from: g, reason: collision with root package name */
    public final CheckableImageButton f11369g;

    /* renamed from: h, reason: collision with root package name */
    public final d f11370h;

    /* renamed from: i, reason: collision with root package name */
    public int f11371i;

    /* renamed from: j, reason: collision with root package name */
    public final LinkedHashSet f11372j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f11373k;

    /* renamed from: l, reason: collision with root package name */
    public PorterDuff.Mode f11374l;

    /* renamed from: m, reason: collision with root package name */
    public int f11375m;

    /* renamed from: n, reason: collision with root package name */
    public ImageView.ScaleType f11376n;

    /* renamed from: o, reason: collision with root package name */
    public View.OnLongClickListener f11377o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f11378p;

    /* renamed from: q, reason: collision with root package name */
    public final TextView f11379q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f11380r;

    /* renamed from: s, reason: collision with root package name */
    public EditText f11381s;

    /* renamed from: t, reason: collision with root package name */
    public final AccessibilityManager f11382t;

    /* renamed from: u, reason: collision with root package name */
    public AccessibilityManager.TouchExplorationStateChangeListener f11383u;

    /* renamed from: v, reason: collision with root package name */
    public final TextWatcher f11384v;

    /* renamed from: w, reason: collision with root package name */
    public final TextInputLayout.g f11385w;

    public class a extends com.google.android.material.internal.z {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            s.this.m().a(editable);
        }

        @Override // com.google.android.material.internal.z, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            s.this.m().b(charSequence, i10, i11, i12);
        }
    }

    public class b implements TextInputLayout.g {
        public b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public void a(TextInputLayout textInputLayout) {
            if (s.this.f11381s == textInputLayout.getEditText()) {
                return;
            }
            if (s.this.f11381s != null) {
                s.this.f11381s.removeTextChangedListener(s.this.f11384v);
                if (s.this.f11381s.getOnFocusChangeListener() == s.this.m().e()) {
                    s.this.f11381s.setOnFocusChangeListener(null);
                }
            }
            s.this.f11381s = textInputLayout.getEditText();
            if (s.this.f11381s != null) {
                s.this.f11381s.addTextChangedListener(s.this.f11384v);
            }
            s.this.m().n(s.this.f11381s);
            s sVar = s.this;
            sVar.h0(sVar.m());
        }
    }

    public class c implements View.OnAttachStateChangeListener {
        public c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            s.this.g();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            s.this.M();
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final SparseArray f11389a = new SparseArray();

        /* renamed from: b, reason: collision with root package name */
        public final s f11390b;

        /* renamed from: c, reason: collision with root package name */
        public final int f11391c;

        /* renamed from: d, reason: collision with root package name */
        public final int f11392d;

        public d(s sVar, z0 z0Var) {
            this.f11390b = sVar;
            this.f11391c = z0Var.n(j4.l.TextInputLayout_endIconDrawable, 0);
            this.f11392d = z0Var.n(j4.l.TextInputLayout_passwordToggleDrawable, 0);
        }

        public final t b(int i10) {
            if (i10 == -1) {
                return new g(this.f11390b);
            }
            if (i10 == 0) {
                return new x(this.f11390b);
            }
            if (i10 == 1) {
                return new z(this.f11390b, this.f11392d);
            }
            if (i10 == 2) {
                return new f(this.f11390b);
            }
            if (i10 == 3) {
                return new q(this.f11390b);
            }
            throw new IllegalArgumentException("Invalid end icon mode: " + i10);
        }

        public t c(int i10) {
            t tVar = (t) this.f11389a.get(i10);
            if (tVar != null) {
                return tVar;
            }
            t tVarB = b(i10);
            this.f11389a.append(i10, tVarB);
            return tVarB;
        }
    }

    public s(TextInputLayout textInputLayout, z0 z0Var) {
        super(textInputLayout.getContext());
        this.f11371i = 0;
        this.f11372j = new LinkedHashSet();
        this.f11384v = new a();
        b bVar = new b();
        this.f11385w = bVar;
        this.f11382t = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f11363a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f11364b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonI = i(this, layoutInflaterFrom, j4.f.text_input_error_icon);
        this.f11365c = checkableImageButtonI;
        CheckableImageButton checkableImageButtonI2 = i(frameLayout, layoutInflaterFrom, j4.f.text_input_end_icon);
        this.f11369g = checkableImageButtonI2;
        this.f11370h = new d(this, z0Var);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f11379q = appCompatTextView;
        C(z0Var);
        B(z0Var);
        D(z0Var);
        frameLayout.addView(checkableImageButtonI2);
        addView(appCompatTextView);
        addView(frameLayout);
        addView(checkableImageButtonI);
        textInputLayout.j(bVar);
        addOnAttachStateChangeListener(new c());
    }

    public boolean A() {
        return this.f11371i != 0;
    }

    public final void B(z0 z0Var) {
        int i10 = j4.l.TextInputLayout_passwordToggleEnabled;
        if (!z0Var.s(i10)) {
            int i11 = j4.l.TextInputLayout_endIconTint;
            if (z0Var.s(i11)) {
                this.f11373k = d5.c.b(getContext(), z0Var, i11);
            }
            int i12 = j4.l.TextInputLayout_endIconTintMode;
            if (z0Var.s(i12)) {
                this.f11374l = com.google.android.material.internal.d0.m(z0Var.k(i12, -1), null);
            }
        }
        int i13 = j4.l.TextInputLayout_endIconMode;
        if (z0Var.s(i13)) {
            U(z0Var.k(i13, 0));
            int i14 = j4.l.TextInputLayout_endIconContentDescription;
            if (z0Var.s(i14)) {
                Q(z0Var.p(i14));
            }
            O(z0Var.a(j4.l.TextInputLayout_endIconCheckable, true));
        } else if (z0Var.s(i10)) {
            int i15 = j4.l.TextInputLayout_passwordToggleTint;
            if (z0Var.s(i15)) {
                this.f11373k = d5.c.b(getContext(), z0Var, i15);
            }
            int i16 = j4.l.TextInputLayout_passwordToggleTintMode;
            if (z0Var.s(i16)) {
                this.f11374l = com.google.android.material.internal.d0.m(z0Var.k(i16, -1), null);
            }
            U(z0Var.a(i10, false) ? 1 : 0);
            Q(z0Var.p(j4.l.TextInputLayout_passwordToggleContentDescription));
        }
        T(z0Var.f(j4.l.TextInputLayout_endIconMinSize, getResources().getDimensionPixelSize(j4.d.mtrl_min_touch_target_size)));
        int i17 = j4.l.TextInputLayout_endIconScaleType;
        if (z0Var.s(i17)) {
            X(u.b(z0Var.k(i17, -1)));
        }
    }

    public final void C(z0 z0Var) {
        int i10 = j4.l.TextInputLayout_errorIconTint;
        if (z0Var.s(i10)) {
            this.f11366d = d5.c.b(getContext(), z0Var, i10);
        }
        int i11 = j4.l.TextInputLayout_errorIconTintMode;
        if (z0Var.s(i11)) {
            this.f11367e = com.google.android.material.internal.d0.m(z0Var.k(i11, -1), null);
        }
        int i12 = j4.l.TextInputLayout_errorIconDrawable;
        if (z0Var.s(i12)) {
            c0(z0Var.g(i12));
        }
        this.f11365c.setContentDescription(getResources().getText(j4.j.error_icon_content_description));
        this.f11365c.setImportantForAccessibility(2);
        this.f11365c.setClickable(false);
        this.f11365c.setPressable(false);
        this.f11365c.setCheckable(false);
        this.f11365c.setFocusable(false);
    }

    public final void D(z0 z0Var) {
        this.f11379q.setVisibility(8);
        this.f11379q.setId(j4.f.textinput_suffix_text);
        this.f11379q.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        this.f11379q.setAccessibilityLiveRegion(1);
        q0(z0Var.n(j4.l.TextInputLayout_suffixTextAppearance, 0));
        int i10 = j4.l.TextInputLayout_suffixTextColor;
        if (z0Var.s(i10)) {
            r0(z0Var.c(i10));
        }
        p0(z0Var.p(j4.l.TextInputLayout_suffixText));
    }

    public boolean E() {
        return A() && this.f11369g.isChecked();
    }

    public boolean F() {
        return this.f11364b.getVisibility() == 0 && this.f11369g.getVisibility() == 0;
    }

    public boolean G() {
        return this.f11365c.getVisibility() == 0;
    }

    public void H(boolean z10) {
        this.f11380r = z10;
        y0();
    }

    public void I() {
        w0();
        K();
        J();
        if (m().t()) {
            u0(this.f11363a.d0());
        }
    }

    public void J() {
        u.d(this.f11363a, this.f11369g, this.f11373k);
    }

    public void K() {
        u.d(this.f11363a, this.f11365c, this.f11366d);
    }

    public void L(boolean z10) {
        boolean z11;
        boolean zIsActivated;
        boolean zIsChecked;
        t tVarM = m();
        boolean z12 = true;
        if (!tVarM.l() || (zIsChecked = this.f11369g.isChecked()) == tVarM.m()) {
            z11 = false;
        } else {
            this.f11369g.setChecked(!zIsChecked);
            z11 = true;
        }
        if (!tVarM.j() || (zIsActivated = this.f11369g.isActivated()) == tVarM.k()) {
            z12 = z11;
        } else {
            N(!zIsActivated);
        }
        if (z10 || z12) {
            J();
        }
    }

    public final void M() {
        AccessibilityManager accessibilityManager;
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.f11383u;
        if (touchExplorationStateChangeListener == null || (accessibilityManager = this.f11382t) == null) {
            return;
        }
        accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
    }

    public void N(boolean z10) {
        this.f11369g.setActivated(z10);
    }

    public void O(boolean z10) {
        this.f11369g.setCheckable(z10);
    }

    public void P(int i10) {
        Q(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void Q(CharSequence charSequence) {
        if (l() != charSequence) {
            this.f11369g.setContentDescription(charSequence);
        }
    }

    public void R(int i10) {
        S(i10 != 0 ? d.a.b(getContext(), i10) : null);
    }

    public void S(Drawable drawable) {
        this.f11369g.setImageDrawable(drawable);
        if (drawable != null) {
            u.a(this.f11363a, this.f11369g, this.f11373k, this.f11374l);
            J();
        }
    }

    public void T(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i10 != this.f11375m) {
            this.f11375m = i10;
            u.g(this.f11369g, i10);
            u.g(this.f11365c, i10);
        }
    }

    public void U(int i10) {
        if (this.f11371i == i10) {
            return;
        }
        t0(m());
        int i11 = this.f11371i;
        this.f11371i = i10;
        j(i11);
        a0(i10 != 0);
        t tVarM = m();
        R(t(tVarM));
        P(tVarM.c());
        O(tVarM.l());
        if (!tVarM.i(this.f11363a.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + this.f11363a.getBoxBackgroundMode() + " is not supported by the end icon mode " + i10);
        }
        s0(tVarM);
        V(tVarM.f());
        EditText editText = this.f11381s;
        if (editText != null) {
            tVarM.n(editText);
            h0(tVarM);
        }
        u.a(this.f11363a, this.f11369g, this.f11373k, this.f11374l);
        L(true);
    }

    public void V(View.OnClickListener onClickListener) {
        u.h(this.f11369g, onClickListener, this.f11377o);
    }

    public void W(View.OnLongClickListener onLongClickListener) {
        this.f11377o = onLongClickListener;
        u.i(this.f11369g, onLongClickListener);
    }

    public void X(ImageView.ScaleType scaleType) {
        this.f11376n = scaleType;
        u.j(this.f11369g, scaleType);
        u.j(this.f11365c, scaleType);
    }

    public void Y(ColorStateList colorStateList) {
        if (this.f11373k != colorStateList) {
            this.f11373k = colorStateList;
            u.a(this.f11363a, this.f11369g, colorStateList, this.f11374l);
        }
    }

    public void Z(PorterDuff.Mode mode) {
        if (this.f11374l != mode) {
            this.f11374l = mode;
            u.a(this.f11363a, this.f11369g, this.f11373k, mode);
        }
    }

    public void a0(boolean z10) {
        if (F() != z10) {
            this.f11369g.setVisibility(z10 ? 0 : 8);
            v0();
            x0();
            this.f11363a.p0();
        }
    }

    public void b0(int i10) {
        c0(i10 != 0 ? d.a.b(getContext(), i10) : null);
        K();
    }

    public void c0(Drawable drawable) {
        this.f11365c.setImageDrawable(drawable);
        w0();
        u.a(this.f11363a, this.f11365c, this.f11366d, this.f11367e);
    }

    public void d0(View.OnClickListener onClickListener) {
        u.h(this.f11365c, onClickListener, this.f11368f);
    }

    public void e0(View.OnLongClickListener onLongClickListener) {
        this.f11368f = onLongClickListener;
        u.i(this.f11365c, onLongClickListener);
    }

    public void f0(ColorStateList colorStateList) {
        if (this.f11366d != colorStateList) {
            this.f11366d = colorStateList;
            u.a(this.f11363a, this.f11365c, colorStateList, this.f11367e);
        }
    }

    public final void g() {
        if (this.f11383u == null || this.f11382t == null || !isAttachedToWindow()) {
            return;
        }
        this.f11382t.addTouchExplorationStateChangeListener(this.f11383u);
    }

    public void g0(PorterDuff.Mode mode) {
        if (this.f11367e != mode) {
            this.f11367e = mode;
            u.a(this.f11363a, this.f11365c, this.f11366d, mode);
        }
    }

    public void h() {
        this.f11369g.performClick();
        this.f11369g.jumpDrawablesToCurrentState();
    }

    public final void h0(t tVar) {
        if (this.f11381s == null) {
            return;
        }
        if (tVar.e() != null) {
            this.f11381s.setOnFocusChangeListener(tVar.e());
        }
        if (tVar.g() != null) {
            this.f11369g.setOnFocusChangeListener(tVar.g());
        }
    }

    public final CheckableImageButton i(ViewGroup viewGroup, LayoutInflater layoutInflater, int i10) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(j4.h.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i10);
        u.e(checkableImageButton);
        if (d5.c.h(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public void i0(int i10) {
        j0(i10 != 0 ? getResources().getText(i10) : null);
    }

    public final void j(int i10) {
        Iterator it = this.f11372j.iterator();
        if (it.hasNext()) {
            androidx.appcompat.app.z.a(it.next());
            throw null;
        }
    }

    public void j0(CharSequence charSequence) {
        this.f11369g.setContentDescription(charSequence);
    }

    public CheckableImageButton k() {
        if (G()) {
            return this.f11365c;
        }
        if (A() && F()) {
            return this.f11369g;
        }
        return null;
    }

    public void k0(int i10) {
        l0(i10 != 0 ? d.a.b(getContext(), i10) : null);
    }

    public CharSequence l() {
        return this.f11369g.getContentDescription();
    }

    public void l0(Drawable drawable) {
        this.f11369g.setImageDrawable(drawable);
    }

    public t m() {
        return this.f11370h.c(this.f11371i);
    }

    public void m0(boolean z10) {
        if (z10 && this.f11371i != 1) {
            U(1);
        } else {
            if (z10) {
                return;
            }
            U(0);
        }
    }

    public Drawable n() {
        return this.f11369g.getDrawable();
    }

    public void n0(ColorStateList colorStateList) {
        this.f11373k = colorStateList;
        u.a(this.f11363a, this.f11369g, colorStateList, this.f11374l);
    }

    public int o() {
        return this.f11375m;
    }

    public void o0(PorterDuff.Mode mode) {
        this.f11374l = mode;
        u.a(this.f11363a, this.f11369g, this.f11373k, mode);
    }

    public int p() {
        return this.f11371i;
    }

    public void p0(CharSequence charSequence) {
        this.f11378p = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f11379q.setText(charSequence);
        y0();
    }

    public ImageView.ScaleType q() {
        return this.f11376n;
    }

    public void q0(int i10) {
        TextViewCompat.m(this.f11379q, i10);
    }

    public CheckableImageButton r() {
        return this.f11369g;
    }

    public void r0(ColorStateList colorStateList) {
        this.f11379q.setTextColor(colorStateList);
    }

    public Drawable s() {
        return this.f11365c.getDrawable();
    }

    public final void s0(t tVar) {
        tVar.s();
        this.f11383u = tVar.h();
        g();
    }

    public final int t(t tVar) {
        int i10 = this.f11370h.f11391c;
        return i10 == 0 ? tVar.d() : i10;
    }

    public final void t0(t tVar) {
        M();
        this.f11383u = null;
        tVar.u();
    }

    public CharSequence u() {
        return this.f11369g.getContentDescription();
    }

    public final void u0(boolean z10) {
        if (!z10 || n() == null) {
            u.a(this.f11363a, this.f11369g, this.f11373k, this.f11374l);
            return;
        }
        Drawable drawableMutate = k0.a.r(n()).mutate();
        drawableMutate.setTint(this.f11363a.getErrorCurrentTextColors());
        this.f11369g.setImageDrawable(drawableMutate);
    }

    public Drawable v() {
        return this.f11369g.getDrawable();
    }

    public final void v0() {
        this.f11364b.setVisibility((this.f11369g.getVisibility() != 0 || G()) ? 8 : 0);
        setVisibility((F() || G() || !((this.f11378p == null || this.f11380r) ? 8 : false)) ? 0 : 8);
    }

    public CharSequence w() {
        return this.f11378p;
    }

    public final void w0() {
        this.f11365c.setVisibility(s() != null && this.f11363a.O() && this.f11363a.d0() ? 0 : 8);
        v0();
        x0();
        if (A()) {
            return;
        }
        this.f11363a.p0();
    }

    public ColorStateList x() {
        return this.f11379q.getTextColors();
    }

    public void x0() {
        if (this.f11363a.f11259e == null) {
            return;
        }
        this.f11379q.setPaddingRelative(getContext().getResources().getDimensionPixelSize(j4.d.material_input_text_to_prefix_suffix_padding), this.f11363a.f11259e.getPaddingTop(), (F() || G()) ? 0 : this.f11363a.f11259e.getPaddingEnd(), this.f11363a.f11259e.getPaddingBottom());
    }

    public int y() {
        return getPaddingEnd() + this.f11379q.getPaddingEnd() + ((F() || G()) ? this.f11369g.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) this.f11369g.getLayoutParams()).getMarginStart() : 0);
    }

    public final void y0() {
        int visibility = this.f11379q.getVisibility();
        int i10 = (this.f11378p == null || this.f11380r) ? 8 : 0;
        if (visibility != i10) {
            m().q(i10 == 0);
        }
        v0();
        this.f11379q.setVisibility(i10);
        this.f11363a.p0();
    }

    public TextView z() {
        return this.f11379q;
    }
}
