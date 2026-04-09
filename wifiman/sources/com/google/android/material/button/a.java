package com.google.android.material.button;

import F1.W;
import O3.j;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import c4.c;
import com.google.android.material.internal.n;
import d4.AbstractC5301b;
import d4.C5300a;
import f4.C5527g;
import f4.C5531k;
import f4.InterfaceC5534n;
import x1.AbstractC8416a;

/* loaded from: classes3.dex */
class a {

    /* renamed from: u, reason: collision with root package name */
    private static final boolean f37155u = true;

    /* renamed from: v, reason: collision with root package name */
    private static final boolean f37156v = false;

    /* renamed from: a, reason: collision with root package name */
    private final MaterialButton f37157a;

    /* renamed from: b, reason: collision with root package name */
    private C5531k f37158b;

    /* renamed from: c, reason: collision with root package name */
    private int f37159c;

    /* renamed from: d, reason: collision with root package name */
    private int f37160d;

    /* renamed from: e, reason: collision with root package name */
    private int f37161e;

    /* renamed from: f, reason: collision with root package name */
    private int f37162f;

    /* renamed from: g, reason: collision with root package name */
    private int f37163g;

    /* renamed from: h, reason: collision with root package name */
    private int f37164h;

    /* renamed from: i, reason: collision with root package name */
    private PorterDuff.Mode f37165i;

    /* renamed from: j, reason: collision with root package name */
    private ColorStateList f37166j;

    /* renamed from: k, reason: collision with root package name */
    private ColorStateList f37167k;

    /* renamed from: l, reason: collision with root package name */
    private ColorStateList f37168l;

    /* renamed from: m, reason: collision with root package name */
    private Drawable f37169m;

    /* renamed from: q, reason: collision with root package name */
    private boolean f37173q;

    /* renamed from: s, reason: collision with root package name */
    private LayerDrawable f37175s;

    /* renamed from: t, reason: collision with root package name */
    private int f37176t;

    /* renamed from: n, reason: collision with root package name */
    private boolean f37170n = false;

    /* renamed from: o, reason: collision with root package name */
    private boolean f37171o = false;

    /* renamed from: p, reason: collision with root package name */
    private boolean f37172p = false;

    /* renamed from: r, reason: collision with root package name */
    private boolean f37174r = true;

    a(MaterialButton materialButton, C5531k c5531k) {
        this.f37157a = materialButton;
        this.f37158b = c5531k;
    }

    private void G(int i10, int i11) {
        int iE = W.E(this.f37157a);
        int paddingTop = this.f37157a.getPaddingTop();
        int iD = W.D(this.f37157a);
        int paddingBottom = this.f37157a.getPaddingBottom();
        int i12 = this.f37161e;
        int i13 = this.f37162f;
        this.f37162f = i11;
        this.f37161e = i10;
        if (!this.f37171o) {
            H();
        }
        W.z0(this.f37157a, iE, (paddingTop + i10) - i12, iD, (paddingBottom + i11) - i13);
    }

    private void H() {
        this.f37157a.setInternalBackground(a());
        C5527g c5527gF = f();
        if (c5527gF != null) {
            c5527gF.S(this.f37176t);
            c5527gF.setState(this.f37157a.getDrawableState());
        }
    }

    private void I(C5531k c5531k) {
        if (f37156v && !this.f37171o) {
            int iE = W.E(this.f37157a);
            int paddingTop = this.f37157a.getPaddingTop();
            int iD = W.D(this.f37157a);
            int paddingBottom = this.f37157a.getPaddingBottom();
            H();
            W.z0(this.f37157a, iE, paddingTop, iD, paddingBottom);
            return;
        }
        if (f() != null) {
            f().setShapeAppearanceModel(c5531k);
        }
        if (n() != null) {
            n().setShapeAppearanceModel(c5531k);
        }
        if (e() != null) {
            e().setShapeAppearanceModel(c5531k);
        }
    }

    private void J() {
        C5527g c5527gF = f();
        C5527g c5527gN = n();
        if (c5527gF != null) {
            c5527gF.Y(this.f37164h, this.f37167k);
            if (c5527gN != null) {
                c5527gN.X(this.f37164h, this.f37170n ? V3.a.d(this.f37157a, O3.a.f16972k) : 0);
            }
        }
    }

    private InsetDrawable K(Drawable drawable) {
        return new InsetDrawable(drawable, this.f37159c, this.f37161e, this.f37160d, this.f37162f);
    }

    private Drawable a() {
        C5527g c5527g = new C5527g(this.f37158b);
        c5527g.J(this.f37157a.getContext());
        AbstractC8416a.o(c5527g, this.f37166j);
        PorterDuff.Mode mode = this.f37165i;
        if (mode != null) {
            AbstractC8416a.p(c5527g, mode);
        }
        c5527g.Y(this.f37164h, this.f37167k);
        C5527g c5527g2 = new C5527g(this.f37158b);
        c5527g2.setTint(0);
        c5527g2.X(this.f37164h, this.f37170n ? V3.a.d(this.f37157a, O3.a.f16972k) : 0);
        if (f37155u) {
            C5527g c5527g3 = new C5527g(this.f37158b);
            this.f37169m = c5527g3;
            AbstractC8416a.n(c5527g3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(AbstractC5301b.a(this.f37168l), K(new LayerDrawable(new Drawable[]{c5527g2, c5527g})), this.f37169m);
            this.f37175s = rippleDrawable;
            return rippleDrawable;
        }
        C5300a c5300a = new C5300a(this.f37158b);
        this.f37169m = c5300a;
        AbstractC8416a.o(c5300a, AbstractC5301b.a(this.f37168l));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{c5527g2, c5527g, this.f37169m});
        this.f37175s = layerDrawable;
        return K(layerDrawable);
    }

    private C5527g g(boolean z10) {
        LayerDrawable layerDrawable = this.f37175s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return f37155u ? (C5527g) ((LayerDrawable) ((InsetDrawable) this.f37175s.getDrawable(0)).getDrawable()).getDrawable(!z10 ? 1 : 0) : (C5527g) this.f37175s.getDrawable(!z10 ? 1 : 0);
    }

    private C5527g n() {
        return g(true);
    }

    void A(boolean z10) {
        this.f37170n = z10;
        J();
    }

    void B(ColorStateList colorStateList) {
        if (this.f37167k != colorStateList) {
            this.f37167k = colorStateList;
            J();
        }
    }

    void C(int i10) {
        if (this.f37164h != i10) {
            this.f37164h = i10;
            J();
        }
    }

    void D(ColorStateList colorStateList) {
        if (this.f37166j != colorStateList) {
            this.f37166j = colorStateList;
            if (f() != null) {
                AbstractC8416a.o(f(), this.f37166j);
            }
        }
    }

    void E(PorterDuff.Mode mode) {
        if (this.f37165i != mode) {
            this.f37165i = mode;
            if (f() == null || this.f37165i == null) {
                return;
            }
            AbstractC8416a.p(f(), this.f37165i);
        }
    }

    void F(boolean z10) {
        this.f37174r = z10;
    }

    int b() {
        return this.f37163g;
    }

    public int c() {
        return this.f37162f;
    }

    public int d() {
        return this.f37161e;
    }

    public InterfaceC5534n e() {
        LayerDrawable layerDrawable = this.f37175s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f37175s.getNumberOfLayers() > 2 ? (InterfaceC5534n) this.f37175s.getDrawable(2) : (InterfaceC5534n) this.f37175s.getDrawable(1);
    }

    C5527g f() {
        return g(false);
    }

    ColorStateList h() {
        return this.f37168l;
    }

    C5531k i() {
        return this.f37158b;
    }

    ColorStateList j() {
        return this.f37167k;
    }

    int k() {
        return this.f37164h;
    }

    ColorStateList l() {
        return this.f37166j;
    }

    PorterDuff.Mode m() {
        return this.f37165i;
    }

    boolean o() {
        return this.f37171o;
    }

    boolean p() {
        return this.f37173q;
    }

    boolean q() {
        return this.f37174r;
    }

    void r(TypedArray typedArray) {
        this.f37159c = typedArray.getDimensionPixelOffset(j.f17375c2, 0);
        this.f37160d = typedArray.getDimensionPixelOffset(j.f17383d2, 0);
        this.f37161e = typedArray.getDimensionPixelOffset(j.f17391e2, 0);
        this.f37162f = typedArray.getDimensionPixelOffset(j.f17399f2, 0);
        int i10 = j.f17431j2;
        if (typedArray.hasValue(i10)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(i10, -1);
            this.f37163g = dimensionPixelSize;
            z(this.f37158b.w(dimensionPixelSize));
            this.f37172p = true;
        }
        this.f37164h = typedArray.getDimensionPixelSize(j.f17511t2, 0);
        this.f37165i = n.i(typedArray.getInt(j.f17423i2, -1), PorterDuff.Mode.SRC_IN);
        this.f37166j = c.a(this.f37157a.getContext(), typedArray, j.f17415h2);
        this.f37167k = c.a(this.f37157a.getContext(), typedArray, j.f17503s2);
        this.f37168l = c.a(this.f37157a.getContext(), typedArray, j.f17495r2);
        this.f37173q = typedArray.getBoolean(j.f17407g2, false);
        this.f37176t = typedArray.getDimensionPixelSize(j.f17439k2, 0);
        this.f37174r = typedArray.getBoolean(j.f17519u2, true);
        int iE = W.E(this.f37157a);
        int paddingTop = this.f37157a.getPaddingTop();
        int iD = W.D(this.f37157a);
        int paddingBottom = this.f37157a.getPaddingBottom();
        if (typedArray.hasValue(j.f17367b2)) {
            t();
        } else {
            H();
        }
        W.z0(this.f37157a, iE + this.f37159c, paddingTop + this.f37161e, iD + this.f37160d, paddingBottom + this.f37162f);
    }

    void s(int i10) {
        if (f() != null) {
            f().setTint(i10);
        }
    }

    void t() {
        this.f37171o = true;
        this.f37157a.setSupportBackgroundTintList(this.f37166j);
        this.f37157a.setSupportBackgroundTintMode(this.f37165i);
    }

    void u(boolean z10) {
        this.f37173q = z10;
    }

    void v(int i10) {
        if (this.f37172p && this.f37163g == i10) {
            return;
        }
        this.f37163g = i10;
        this.f37172p = true;
        z(this.f37158b.w(i10));
    }

    public void w(int i10) {
        G(this.f37161e, i10);
    }

    public void x(int i10) {
        G(i10, this.f37162f);
    }

    void y(ColorStateList colorStateList) {
        if (this.f37168l != colorStateList) {
            this.f37168l = colorStateList;
            boolean z10 = f37155u;
            if (z10 && (this.f37157a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f37157a.getBackground()).setColor(AbstractC5301b.a(colorStateList));
            } else {
                if (z10 || !(this.f37157a.getBackground() instanceof C5300a)) {
                    return;
                }
                ((C5300a) this.f37157a.getBackground()).setTintList(AbstractC5301b.a(colorStateList));
            }
        }
    }

    void z(C5531k c5531k) {
        this.f37158b = c5531k;
        I(c5531k);
    }
}
