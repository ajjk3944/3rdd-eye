package com.google.android.material.textfield;

import F1.AbstractC2777v;
import F1.W;
import G1.c;
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
import androidx.appcompat.widget.D;
import androidx.appcompat.widget.b0;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import f.AbstractC5487d;
import i.AbstractC6050a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import x1.AbstractC8416a;

/* loaded from: classes3.dex */
class r extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    final TextInputLayout f37808a;

    /* renamed from: b, reason: collision with root package name */
    private final FrameLayout f37809b;

    /* renamed from: c, reason: collision with root package name */
    private final CheckableImageButton f37810c;

    /* renamed from: d, reason: collision with root package name */
    private ColorStateList f37811d;

    /* renamed from: e, reason: collision with root package name */
    private PorterDuff.Mode f37812e;

    /* renamed from: f, reason: collision with root package name */
    private View.OnLongClickListener f37813f;

    /* renamed from: g, reason: collision with root package name */
    private final CheckableImageButton f37814g;

    /* renamed from: h, reason: collision with root package name */
    private final d f37815h;

    /* renamed from: i, reason: collision with root package name */
    private int f37816i;

    /* renamed from: j, reason: collision with root package name */
    private final LinkedHashSet f37817j;

    /* renamed from: k, reason: collision with root package name */
    private ColorStateList f37818k;

    /* renamed from: l, reason: collision with root package name */
    private PorterDuff.Mode f37819l;

    /* renamed from: m, reason: collision with root package name */
    private int f37820m;

    /* renamed from: n, reason: collision with root package name */
    private ImageView.ScaleType f37821n;

    /* renamed from: o, reason: collision with root package name */
    private View.OnLongClickListener f37822o;

    /* renamed from: p, reason: collision with root package name */
    private CharSequence f37823p;

    /* renamed from: q, reason: collision with root package name */
    private final TextView f37824q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f37825r;

    /* renamed from: s, reason: collision with root package name */
    private EditText f37826s;

    /* renamed from: t, reason: collision with root package name */
    private final AccessibilityManager f37827t;

    /* renamed from: u, reason: collision with root package name */
    private c.a f37828u;

    /* renamed from: v, reason: collision with root package name */
    private final TextWatcher f37829v;

    /* renamed from: w, reason: collision with root package name */
    private final TextInputLayout.f f37830w;

    class a extends com.google.android.material.internal.j {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            r.this.m().a(editable);
        }

        @Override // com.google.android.material.internal.j, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            r.this.m().b(charSequence, i10, i11, i12);
        }
    }

    class b implements TextInputLayout.f {
        b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(TextInputLayout textInputLayout) {
            if (r.this.f37826s == textInputLayout.getEditText()) {
                return;
            }
            if (r.this.f37826s != null) {
                r.this.f37826s.removeTextChangedListener(r.this.f37829v);
                if (r.this.f37826s.getOnFocusChangeListener() == r.this.m().e()) {
                    r.this.f37826s.setOnFocusChangeListener(null);
                }
            }
            r.this.f37826s = textInputLayout.getEditText();
            if (r.this.f37826s != null) {
                r.this.f37826s.addTextChangedListener(r.this.f37829v);
            }
            r.this.m().n(r.this.f37826s);
            r rVar = r.this;
            rVar.h0(rVar.m());
        }
    }

    class c implements View.OnAttachStateChangeListener {
        c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            r.this.g();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            r.this.M();
        }
    }

    private static class d {

        /* renamed from: a, reason: collision with root package name */
        private final SparseArray f37834a = new SparseArray();

        /* renamed from: b, reason: collision with root package name */
        private final r f37835b;

        /* renamed from: c, reason: collision with root package name */
        private final int f37836c;

        /* renamed from: d, reason: collision with root package name */
        private final int f37837d;

        d(r rVar, b0 b0Var) {
            this.f37835b = rVar;
            this.f37836c = b0Var.n(O3.j.f17280P5, 0);
            this.f37837d = b0Var.n(O3.j.f17467n6, 0);
        }

        private s b(int i10) {
            if (i10 == -1) {
                return new g(this.f37835b);
            }
            if (i10 == 0) {
                return new w(this.f37835b);
            }
            if (i10 == 1) {
                return new y(this.f37835b, this.f37837d);
            }
            if (i10 == 2) {
                return new f(this.f37835b);
            }
            if (i10 == 3) {
                return new p(this.f37835b);
            }
            throw new IllegalArgumentException("Invalid end icon mode: " + i10);
        }

        s c(int i10) {
            s sVar = (s) this.f37834a.get(i10);
            if (sVar != null) {
                return sVar;
            }
            s sVarB = b(i10);
            this.f37834a.append(i10, sVarB);
            return sVarB;
        }
    }

    r(TextInputLayout textInputLayout, b0 b0Var) {
        super(textInputLayout.getContext());
        this.f37816i = 0;
        this.f37817j = new LinkedHashSet();
        this.f37829v = new a();
        b bVar = new b();
        this.f37830w = bVar;
        this.f37827t = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f37808a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f37809b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonI = i(this, layoutInflaterFrom, O3.e.f17063I);
        this.f37810c = checkableImageButtonI;
        CheckableImageButton checkableImageButtonI2 = i(frameLayout, layoutInflaterFrom, O3.e.f17062H);
        this.f37814g = checkableImageButtonI2;
        this.f37815h = new d(this, b0Var);
        D d10 = new D(getContext());
        this.f37824q = d10;
        C(b0Var);
        B(b0Var);
        D(b0Var);
        frameLayout.addView(checkableImageButtonI2);
        addView(d10);
        addView(frameLayout);
        addView(checkableImageButtonI);
        textInputLayout.i(bVar);
        addOnAttachStateChangeListener(new c());
    }

    private void B(b0 b0Var) {
        int i10 = O3.j.f17475o6;
        if (!b0Var.s(i10)) {
            int i11 = O3.j.f17312T5;
            if (b0Var.s(i11)) {
                this.f37818k = c4.c.b(getContext(), b0Var, i11);
            }
            int i12 = O3.j.f17320U5;
            if (b0Var.s(i12)) {
                this.f37819l = com.google.android.material.internal.n.i(b0Var.k(i12, -1), null);
            }
        }
        int i13 = O3.j.f17296R5;
        if (b0Var.s(i13)) {
            U(b0Var.k(i13, 0));
            int i14 = O3.j.f17272O5;
            if (b0Var.s(i14)) {
                Q(b0Var.p(i14));
            }
            O(b0Var.a(O3.j.f17264N5, true));
        } else if (b0Var.s(i10)) {
            int i15 = O3.j.f17483p6;
            if (b0Var.s(i15)) {
                this.f37818k = c4.c.b(getContext(), b0Var, i15);
            }
            int i16 = O3.j.f17491q6;
            if (b0Var.s(i16)) {
                this.f37819l = com.google.android.material.internal.n.i(b0Var.k(i16, -1), null);
            }
            U(b0Var.a(i10, false) ? 1 : 0);
            Q(b0Var.p(O3.j.f17459m6));
        }
        T(b0Var.f(O3.j.f17288Q5, getResources().getDimensionPixelSize(O3.c.f17012S)));
        int i17 = O3.j.f17304S5;
        if (b0Var.s(i17)) {
            X(t.b(b0Var.k(i17, -1)));
        }
    }

    private void C(b0 b0Var) {
        int i10 = O3.j.f17355Z5;
        if (b0Var.s(i10)) {
            this.f37811d = c4.c.b(getContext(), b0Var, i10);
        }
        int i11 = O3.j.f17363a6;
        if (b0Var.s(i11)) {
            this.f37812e = com.google.android.material.internal.n.i(b0Var.k(i11, -1), null);
        }
        int i12 = O3.j.f17348Y5;
        if (b0Var.s(i12)) {
            c0(b0Var.g(i12));
        }
        this.f37810c.setContentDescription(getResources().getText(O3.h.f17121f));
        W.u0(this.f37810c, 2);
        this.f37810c.setClickable(false);
        this.f37810c.setPressable(false);
        this.f37810c.setFocusable(false);
    }

    private void D(b0 b0Var) {
        this.f37824q.setVisibility(8);
        this.f37824q.setId(O3.e.f17069O);
        this.f37824q.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        W.o0(this.f37824q, 1);
        q0(b0Var.n(O3.j.f17201F6, 0));
        int i10 = O3.j.f17209G6;
        if (b0Var.s(i10)) {
            r0(b0Var.c(i10));
        }
        p0(b0Var.p(O3.j.f17193E6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M() {
        AccessibilityManager accessibilityManager;
        c.a aVar = this.f37828u;
        if (aVar == null || (accessibilityManager = this.f37827t) == null) {
            return;
        }
        G1.c.b(accessibilityManager, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.f37828u == null || this.f37827t == null || !W.P(this)) {
            return;
        }
        G1.c.a(this.f37827t, this.f37828u);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0(s sVar) {
        if (this.f37826s == null) {
            return;
        }
        if (sVar.e() != null) {
            this.f37826s.setOnFocusChangeListener(sVar.e());
        }
        if (sVar.g() != null) {
            this.f37814g.setOnFocusChangeListener(sVar.g());
        }
    }

    private CheckableImageButton i(ViewGroup viewGroup, LayoutInflater layoutInflater, int i10) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(O3.g.f17099b, viewGroup, false);
        checkableImageButton.setId(i10);
        t.e(checkableImageButton);
        if (c4.c.g(getContext())) {
            AbstractC2777v.d((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        return checkableImageButton;
    }

    private void j(int i10) {
        Iterator it = this.f37817j.iterator();
        if (it.hasNext()) {
            AbstractC5487d.a(it.next());
            throw null;
        }
    }

    private void s0(s sVar) {
        sVar.s();
        this.f37828u = sVar.h();
        g();
    }

    private int t(s sVar) {
        int i10 = this.f37815h.f37836c;
        return i10 == 0 ? sVar.d() : i10;
    }

    private void t0(s sVar) {
        M();
        this.f37828u = null;
        sVar.u();
    }

    private void u0(boolean z10) {
        if (!z10 || n() == null) {
            t.a(this.f37808a, this.f37814g, this.f37818k, this.f37819l);
            return;
        }
        Drawable drawableMutate = AbstractC8416a.r(n()).mutate();
        AbstractC8416a.n(drawableMutate, this.f37808a.getErrorCurrentTextColors());
        this.f37814g.setImageDrawable(drawableMutate);
    }

    private void v0() {
        this.f37809b.setVisibility((this.f37814g.getVisibility() != 0 || G()) ? 8 : 0);
        setVisibility((F() || G() || !((this.f37823p == null || this.f37825r) ? 8 : false)) ? 0 : 8);
    }

    private void w0() {
        this.f37810c.setVisibility(s() != null && this.f37808a.N() && this.f37808a.d0() ? 0 : 8);
        v0();
        x0();
        if (A()) {
            return;
        }
        this.f37808a.o0();
    }

    private void y0() {
        int visibility = this.f37824q.getVisibility();
        int i10 = (this.f37823p == null || this.f37825r) ? 8 : 0;
        if (visibility != i10) {
            m().q(i10 == 0);
        }
        v0();
        this.f37824q.setVisibility(i10);
        this.f37808a.o0();
    }

    boolean A() {
        return this.f37816i != 0;
    }

    boolean E() {
        return A() && this.f37814g.isChecked();
    }

    boolean F() {
        return this.f37809b.getVisibility() == 0 && this.f37814g.getVisibility() == 0;
    }

    boolean G() {
        return this.f37810c.getVisibility() == 0;
    }

    void H(boolean z10) {
        this.f37825r = z10;
        y0();
    }

    void I() {
        w0();
        K();
        J();
        if (m().t()) {
            u0(this.f37808a.d0());
        }
    }

    void J() {
        t.d(this.f37808a, this.f37814g, this.f37818k);
    }

    void K() {
        t.d(this.f37808a, this.f37810c, this.f37811d);
    }

    void L(boolean z10) {
        boolean z11;
        boolean zIsActivated;
        boolean zIsChecked;
        s sVarM = m();
        boolean z12 = true;
        if (!sVarM.l() || (zIsChecked = this.f37814g.isChecked()) == sVarM.m()) {
            z11 = false;
        } else {
            this.f37814g.setChecked(!zIsChecked);
            z11 = true;
        }
        if (!sVarM.j() || (zIsActivated = this.f37814g.isActivated()) == sVarM.k()) {
            z12 = z11;
        } else {
            N(!zIsActivated);
        }
        if (z10 || z12) {
            J();
        }
    }

    void N(boolean z10) {
        this.f37814g.setActivated(z10);
    }

    void O(boolean z10) {
        this.f37814g.setCheckable(z10);
    }

    void P(int i10) {
        Q(i10 != 0 ? getResources().getText(i10) : null);
    }

    void Q(CharSequence charSequence) {
        if (l() != charSequence) {
            this.f37814g.setContentDescription(charSequence);
        }
    }

    void R(int i10) {
        S(i10 != 0 ? AbstractC6050a.b(getContext(), i10) : null);
    }

    void S(Drawable drawable) {
        this.f37814g.setImageDrawable(drawable);
        if (drawable != null) {
            t.a(this.f37808a, this.f37814g, this.f37818k, this.f37819l);
            J();
        }
    }

    void T(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i10 != this.f37820m) {
            this.f37820m = i10;
            t.g(this.f37814g, i10);
            t.g(this.f37810c, i10);
        }
    }

    void U(int i10) {
        if (this.f37816i == i10) {
            return;
        }
        t0(m());
        int i11 = this.f37816i;
        this.f37816i = i10;
        j(i11);
        a0(i10 != 0);
        s sVarM = m();
        R(t(sVarM));
        P(sVarM.c());
        O(sVarM.l());
        if (!sVarM.i(this.f37808a.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + this.f37808a.getBoxBackgroundMode() + " is not supported by the end icon mode " + i10);
        }
        s0(sVarM);
        V(sVarM.f());
        EditText editText = this.f37826s;
        if (editText != null) {
            sVarM.n(editText);
            h0(sVarM);
        }
        t.a(this.f37808a, this.f37814g, this.f37818k, this.f37819l);
        L(true);
    }

    void V(View.OnClickListener onClickListener) {
        t.h(this.f37814g, onClickListener, this.f37822o);
    }

    void W(View.OnLongClickListener onLongClickListener) {
        this.f37822o = onLongClickListener;
        t.i(this.f37814g, onLongClickListener);
    }

    void X(ImageView.ScaleType scaleType) {
        this.f37821n = scaleType;
        t.j(this.f37814g, scaleType);
        t.j(this.f37810c, scaleType);
    }

    void Y(ColorStateList colorStateList) {
        if (this.f37818k != colorStateList) {
            this.f37818k = colorStateList;
            t.a(this.f37808a, this.f37814g, colorStateList, this.f37819l);
        }
    }

    void Z(PorterDuff.Mode mode) {
        if (this.f37819l != mode) {
            this.f37819l = mode;
            t.a(this.f37808a, this.f37814g, this.f37818k, mode);
        }
    }

    void a0(boolean z10) {
        if (F() != z10) {
            this.f37814g.setVisibility(z10 ? 0 : 8);
            v0();
            x0();
            this.f37808a.o0();
        }
    }

    void b0(int i10) {
        c0(i10 != 0 ? AbstractC6050a.b(getContext(), i10) : null);
        K();
    }

    void c0(Drawable drawable) {
        this.f37810c.setImageDrawable(drawable);
        w0();
        t.a(this.f37808a, this.f37810c, this.f37811d, this.f37812e);
    }

    void d0(View.OnClickListener onClickListener) {
        t.h(this.f37810c, onClickListener, this.f37813f);
    }

    void e0(View.OnLongClickListener onLongClickListener) {
        this.f37813f = onLongClickListener;
        t.i(this.f37810c, onLongClickListener);
    }

    void f0(ColorStateList colorStateList) {
        if (this.f37811d != colorStateList) {
            this.f37811d = colorStateList;
            t.a(this.f37808a, this.f37810c, colorStateList, this.f37812e);
        }
    }

    void g0(PorterDuff.Mode mode) {
        if (this.f37812e != mode) {
            this.f37812e = mode;
            t.a(this.f37808a, this.f37810c, this.f37811d, mode);
        }
    }

    void h() {
        this.f37814g.performClick();
        this.f37814g.jumpDrawablesToCurrentState();
    }

    void i0(int i10) {
        j0(i10 != 0 ? getResources().getText(i10) : null);
    }

    void j0(CharSequence charSequence) {
        this.f37814g.setContentDescription(charSequence);
    }

    CheckableImageButton k() {
        if (G()) {
            return this.f37810c;
        }
        if (A() && F()) {
            return this.f37814g;
        }
        return null;
    }

    void k0(int i10) {
        l0(i10 != 0 ? AbstractC6050a.b(getContext(), i10) : null);
    }

    CharSequence l() {
        return this.f37814g.getContentDescription();
    }

    void l0(Drawable drawable) {
        this.f37814g.setImageDrawable(drawable);
    }

    s m() {
        return this.f37815h.c(this.f37816i);
    }

    void m0(boolean z10) {
        if (z10 && this.f37816i != 1) {
            U(1);
        } else {
            if (z10) {
                return;
            }
            U(0);
        }
    }

    Drawable n() {
        return this.f37814g.getDrawable();
    }

    void n0(ColorStateList colorStateList) {
        this.f37818k = colorStateList;
        t.a(this.f37808a, this.f37814g, colorStateList, this.f37819l);
    }

    int o() {
        return this.f37820m;
    }

    void o0(PorterDuff.Mode mode) {
        this.f37819l = mode;
        t.a(this.f37808a, this.f37814g, this.f37818k, mode);
    }

    int p() {
        return this.f37816i;
    }

    void p0(CharSequence charSequence) {
        this.f37823p = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f37824q.setText(charSequence);
        y0();
    }

    ImageView.ScaleType q() {
        return this.f37821n;
    }

    void q0(int i10) {
        androidx.core.widget.h.o(this.f37824q, i10);
    }

    CheckableImageButton r() {
        return this.f37814g;
    }

    void r0(ColorStateList colorStateList) {
        this.f37824q.setTextColor(colorStateList);
    }

    Drawable s() {
        return this.f37810c.getDrawable();
    }

    CharSequence u() {
        return this.f37814g.getContentDescription();
    }

    Drawable v() {
        return this.f37814g.getDrawable();
    }

    CharSequence w() {
        return this.f37823p;
    }

    ColorStateList x() {
        return this.f37824q.getTextColors();
    }

    void x0() {
        if (this.f37808a.f37715d == null) {
            return;
        }
        W.z0(this.f37824q, getContext().getResources().getDimensionPixelSize(O3.c.f16996C), this.f37808a.f37715d.getPaddingTop(), (F() || G()) ? 0 : W.D(this.f37808a.f37715d), this.f37808a.f37715d.getPaddingBottom());
    }

    int y() {
        return W.D(this) + W.D(this.f37824q) + ((F() || G()) ? this.f37814g.getMeasuredWidth() + AbstractC2777v.b((ViewGroup.MarginLayoutParams) this.f37814g.getLayoutParams()) : 0);
    }

    TextView z() {
        return this.f37824q;
    }
}
