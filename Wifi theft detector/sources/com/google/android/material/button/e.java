package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.internal.d0;
import com.google.android.material.shape.MaterialShapeDrawable;
import d1.l;
import g5.k;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final MaterialButton f10101a;

    /* renamed from: b, reason: collision with root package name */
    public com.google.android.material.shape.a f10102b;

    /* renamed from: c, reason: collision with root package name */
    public com.google.android.material.shape.e f10103c;

    /* renamed from: d, reason: collision with root package name */
    public l f10104d;

    /* renamed from: e, reason: collision with root package name */
    public MaterialShapeDrawable.d f10105e;

    /* renamed from: f, reason: collision with root package name */
    public int f10106f;

    /* renamed from: g, reason: collision with root package name */
    public int f10107g;

    /* renamed from: h, reason: collision with root package name */
    public int f10108h;

    /* renamed from: i, reason: collision with root package name */
    public int f10109i;

    /* renamed from: j, reason: collision with root package name */
    public int f10110j;

    /* renamed from: k, reason: collision with root package name */
    public int f10111k;

    /* renamed from: l, reason: collision with root package name */
    public PorterDuff.Mode f10112l;

    /* renamed from: m, reason: collision with root package name */
    public ColorStateList f10113m;

    /* renamed from: n, reason: collision with root package name */
    public ColorStateList f10114n;

    /* renamed from: o, reason: collision with root package name */
    public ColorStateList f10115o;

    /* renamed from: p, reason: collision with root package name */
    public Drawable f10116p;

    /* renamed from: t, reason: collision with root package name */
    public boolean f10120t;

    /* renamed from: v, reason: collision with root package name */
    public LayerDrawable f10122v;

    /* renamed from: w, reason: collision with root package name */
    public int f10123w;

    /* renamed from: q, reason: collision with root package name */
    public boolean f10117q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f10118r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f10119s = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f10121u = true;

    public e(MaterialButton materialButton, com.google.android.material.shape.a aVar) {
        this.f10101a = materialButton;
        this.f10102b = aVar;
    }

    public void A(int i10) {
        L(this.f10108h, i10);
    }

    public void B(int i10) {
        L(i10, this.f10109i);
    }

    public void C(ColorStateList colorStateList) {
        if (this.f10115o != colorStateList) {
            this.f10115o = colorStateList;
            if (this.f10101a.getBackground() instanceof RippleDrawable) {
                ((RippleDrawable) this.f10101a.getBackground()).setColor(e5.a.d(colorStateList));
            }
        }
    }

    public void D(com.google.android.material.shape.a aVar) {
        this.f10102b = aVar;
        this.f10103c = null;
        N();
    }

    public void E(boolean z10) {
        this.f10117q = z10;
        O();
    }

    public void F(com.google.android.material.shape.e eVar) {
        this.f10103c = eVar;
        N();
    }

    public void G(ColorStateList colorStateList) {
        if (this.f10114n != colorStateList) {
            this.f10114n = colorStateList;
            O();
        }
    }

    public void H(int i10) {
        if (this.f10111k != i10) {
            this.f10111k = i10;
            O();
        }
    }

    public void I(ColorStateList colorStateList) {
        if (this.f10113m != colorStateList) {
            this.f10113m = colorStateList;
            if (g() != null) {
                g().setTintList(this.f10113m);
            }
        }
    }

    public void J(PorterDuff.Mode mode) {
        if (this.f10112l != mode) {
            this.f10112l = mode;
            if (g() == null || this.f10112l == null) {
                return;
            }
            g().setTintMode(this.f10112l);
        }
    }

    public void K(boolean z10) {
        this.f10121u = z10;
    }

    public final void L(int i10, int i11) {
        int paddingStart = this.f10101a.getPaddingStart();
        int paddingTop = this.f10101a.getPaddingTop();
        int paddingEnd = this.f10101a.getPaddingEnd();
        int paddingBottom = this.f10101a.getPaddingBottom();
        int i12 = this.f10108h;
        int i13 = this.f10109i;
        this.f10109i = i11;
        this.f10108h = i10;
        if (!this.f10118r) {
            M();
        }
        this.f10101a.setPaddingRelative(paddingStart, (paddingTop + i10) - i12, paddingEnd, (paddingBottom + i11) - i13);
    }

    public final void M() {
        this.f10101a.setInternalBackground(a());
        MaterialShapeDrawable materialShapeDrawableG = g();
        if (materialShapeDrawableG != null) {
            materialShapeDrawableG.h0(this.f10123w);
            materialShapeDrawableG.setState(this.f10101a.getDrawableState());
        }
    }

    public final void N() {
        MaterialShapeDrawable materialShapeDrawableG = g();
        if (materialShapeDrawableG != null) {
            com.google.android.material.shape.e eVar = this.f10103c;
            if (eVar != null) {
                materialShapeDrawableG.r0(eVar);
            } else {
                materialShapeDrawableG.setShapeAppearanceModel(this.f10102b);
            }
            l lVar = this.f10104d;
            if (lVar != null) {
                materialShapeDrawableG.g0(lVar);
            }
        }
        MaterialShapeDrawable materialShapeDrawableP = p();
        if (materialShapeDrawableP != null) {
            com.google.android.material.shape.e eVar2 = this.f10103c;
            if (eVar2 != null) {
                materialShapeDrawableP.r0(eVar2);
            } else {
                materialShapeDrawableP.setShapeAppearanceModel(this.f10102b);
            }
            l lVar2 = this.f10104d;
            if (lVar2 != null) {
                materialShapeDrawableP.g0(lVar2);
            }
        }
        k kVarF = f();
        if (kVarF != null) {
            kVarF.setShapeAppearanceModel(this.f10102b);
            if (kVarF instanceof MaterialShapeDrawable) {
                MaterialShapeDrawable materialShapeDrawable = (MaterialShapeDrawable) kVarF;
                com.google.android.material.shape.e eVar3 = this.f10103c;
                if (eVar3 != null) {
                    materialShapeDrawable.r0(eVar3);
                }
                l lVar3 = this.f10104d;
                if (lVar3 != null) {
                    materialShapeDrawable.g0(lVar3);
                }
            }
        }
    }

    public final void O() {
        MaterialShapeDrawable materialShapeDrawableG = g();
        MaterialShapeDrawable materialShapeDrawableP = p();
        if (materialShapeDrawableG != null) {
            materialShapeDrawableG.t0(this.f10111k, this.f10114n);
            if (materialShapeDrawableP != null) {
                materialShapeDrawableP.s0(this.f10111k, this.f10117q ? u4.a.d(this.f10101a, j4.b.colorSurface) : 0);
            }
        }
    }

    public final InsetDrawable P(Drawable drawable) {
        return new InsetDrawable(drawable, this.f10106f, this.f10108h, this.f10107g, this.f10109i);
    }

    public final Drawable a() {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this.f10102b);
        com.google.android.material.shape.e eVar = this.f10103c;
        if (eVar != null) {
            materialShapeDrawable.r0(eVar);
        }
        l lVar = this.f10104d;
        if (lVar != null) {
            materialShapeDrawable.g0(lVar);
        }
        MaterialShapeDrawable.d dVar = this.f10105e;
        if (dVar != null) {
            materialShapeDrawable.k0(dVar);
        }
        materialShapeDrawable.W(this.f10101a.getContext());
        materialShapeDrawable.setTintList(this.f10113m);
        PorterDuff.Mode mode = this.f10112l;
        if (mode != null) {
            materialShapeDrawable.setTintMode(mode);
        }
        materialShapeDrawable.t0(this.f10111k, this.f10114n);
        MaterialShapeDrawable materialShapeDrawable2 = new MaterialShapeDrawable(this.f10102b);
        com.google.android.material.shape.e eVar2 = this.f10103c;
        if (eVar2 != null) {
            materialShapeDrawable2.r0(eVar2);
        }
        l lVar2 = this.f10104d;
        if (lVar2 != null) {
            materialShapeDrawable2.g0(lVar2);
        }
        materialShapeDrawable2.setTint(0);
        materialShapeDrawable2.s0(this.f10111k, this.f10117q ? u4.a.d(this.f10101a, j4.b.colorSurface) : 0);
        MaterialShapeDrawable materialShapeDrawable3 = new MaterialShapeDrawable(this.f10102b);
        this.f10116p = materialShapeDrawable3;
        com.google.android.material.shape.e eVar3 = this.f10103c;
        if (eVar3 != null) {
            materialShapeDrawable3.r0(eVar3);
        }
        l lVar3 = this.f10104d;
        if (lVar3 != null) {
            ((MaterialShapeDrawable) this.f10116p).g0(lVar3);
        }
        this.f10116p.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(e5.a.d(this.f10115o), P(new LayerDrawable(new Drawable[]{materialShapeDrawable2, materialShapeDrawable})), this.f10116p);
        this.f10122v = rippleDrawable;
        return rippleDrawable;
    }

    public int b() {
        return this.f10110j;
    }

    public l c() {
        return this.f10104d;
    }

    public int d() {
        return this.f10109i;
    }

    public int e() {
        return this.f10108h;
    }

    public k f() {
        LayerDrawable layerDrawable = this.f10122v;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f10122v.getNumberOfLayers() > 2 ? (k) this.f10122v.getDrawable(2) : (k) this.f10122v.getDrawable(1);
    }

    public MaterialShapeDrawable g() {
        return h(false);
    }

    public final MaterialShapeDrawable h(boolean z10) {
        LayerDrawable layerDrawable = this.f10122v;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (MaterialShapeDrawable) ((LayerDrawable) ((InsetDrawable) this.f10122v.getDrawable(0)).getDrawable()).getDrawable(!z10 ? 1 : 0);
    }

    public ColorStateList i() {
        return this.f10115o;
    }

    public com.google.android.material.shape.a j() {
        return this.f10102b;
    }

    public com.google.android.material.shape.e k() {
        return this.f10103c;
    }

    public ColorStateList l() {
        return this.f10114n;
    }

    public int m() {
        return this.f10111k;
    }

    public ColorStateList n() {
        return this.f10113m;
    }

    public PorterDuff.Mode o() {
        return this.f10112l;
    }

    public final MaterialShapeDrawable p() {
        return h(true);
    }

    public boolean q() {
        return this.f10118r;
    }

    public boolean r() {
        return this.f10120t;
    }

    public boolean s() {
        return this.f10121u;
    }

    public void t(TypedArray typedArray) {
        this.f10106f = typedArray.getDimensionPixelOffset(j4.l.MaterialButton_android_insetLeft, 0);
        this.f10107g = typedArray.getDimensionPixelOffset(j4.l.MaterialButton_android_insetRight, 0);
        this.f10108h = typedArray.getDimensionPixelOffset(j4.l.MaterialButton_android_insetTop, 0);
        this.f10109i = typedArray.getDimensionPixelOffset(j4.l.MaterialButton_android_insetBottom, 0);
        int i10 = j4.l.MaterialButton_cornerRadius;
        if (typedArray.hasValue(i10)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(i10, -1);
            this.f10110j = dimensionPixelSize;
            D(this.f10102b.x(dimensionPixelSize));
            this.f10119s = true;
        }
        this.f10111k = typedArray.getDimensionPixelSize(j4.l.MaterialButton_strokeWidth, 0);
        this.f10112l = d0.m(typedArray.getInt(j4.l.MaterialButton_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.f10113m = d5.c.a(this.f10101a.getContext(), typedArray, j4.l.MaterialButton_backgroundTint);
        this.f10114n = d5.c.a(this.f10101a.getContext(), typedArray, j4.l.MaterialButton_strokeColor);
        this.f10115o = d5.c.a(this.f10101a.getContext(), typedArray, j4.l.MaterialButton_rippleColor);
        this.f10120t = typedArray.getBoolean(j4.l.MaterialButton_android_checkable, false);
        this.f10123w = typedArray.getDimensionPixelSize(j4.l.MaterialButton_elevation, 0);
        this.f10121u = typedArray.getBoolean(j4.l.MaterialButton_toggleCheckedStateOnClick, true);
        int paddingStart = this.f10101a.getPaddingStart();
        int paddingTop = this.f10101a.getPaddingTop();
        int paddingEnd = this.f10101a.getPaddingEnd();
        int paddingBottom = this.f10101a.getPaddingBottom();
        if (typedArray.hasValue(j4.l.MaterialButton_android_background)) {
            v();
        } else {
            M();
        }
        this.f10101a.setPaddingRelative(paddingStart + this.f10106f, paddingTop + this.f10108h, paddingEnd + this.f10107g, paddingBottom + this.f10109i);
    }

    public void u(int i10) {
        if (g() != null) {
            g().setTint(i10);
        }
    }

    public void v() {
        this.f10118r = true;
        this.f10101a.setSupportBackgroundTintList(this.f10113m);
        this.f10101a.setSupportBackgroundTintMode(this.f10112l);
    }

    public void w(boolean z10) {
        this.f10120t = z10;
    }

    public void x(int i10) {
        if (this.f10119s && this.f10110j == i10) {
            return;
        }
        this.f10110j = i10;
        this.f10119s = true;
        D(this.f10102b.x(i10));
    }

    public void y(MaterialShapeDrawable.d dVar) {
        this.f10105e = dVar;
        MaterialShapeDrawable materialShapeDrawableG = g();
        if (materialShapeDrawableG != null) {
            materialShapeDrawableG.k0(dVar);
        }
    }

    public void z(l lVar) {
        this.f10104d = lVar;
        if (this.f10103c != null) {
            N();
        }
    }
}
