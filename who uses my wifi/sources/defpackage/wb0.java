package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;
import com.phuongpn.whousemywifi.networkscanner.R;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class wb0 {
    public final MaterialButton a;
    public su0 b;
    public dy0 c;
    public ox0 d;
    public dk e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public PorterDuff.Mode l;
    public ColorStateList m;
    public ColorStateList n;
    public ColorStateList o;
    public nc0 p;
    public boolean t;
    public RippleDrawable v;
    public int w;
    public boolean q = false;
    public boolean r = false;
    public boolean s = false;
    public boolean u = true;

    public wb0(MaterialButton materialButton, su0 su0Var) {
        this.a = materialButton;
        this.b = su0Var;
    }

    public final nc0 a(boolean z) {
        RippleDrawable rippleDrawable = this.v;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (nc0) ((LayerDrawable) ((InsetDrawable) this.v.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }

    public final void b(int i, int i2) {
        MaterialButton materialButton = this.a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i3 = this.h;
        int i4 = this.i;
        this.i = i2;
        this.h = i;
        if (!this.r) {
            c();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i) - i3, paddingEnd, (paddingBottom + i2) - i4);
    }

    public final void c() {
        nc0 nc0Var = new nc0(this.b);
        dy0 dy0Var = this.c;
        if (dy0Var != null) {
            nc0Var.v(dy0Var);
        }
        ox0 ox0Var = this.d;
        if (ox0Var != null) {
            nc0Var.o(ox0Var);
        }
        dk dkVar = this.e;
        if (dkVar != null) {
            nc0Var.J = dkVar;
        }
        MaterialButton materialButton = this.a;
        nc0Var.m(materialButton.getContext());
        nc0Var.setTintList(this.m);
        PorterDuff.Mode mode = this.l;
        if (mode != null) {
            nc0Var.setTintMode(mode);
        }
        float f = this.k;
        ColorStateList colorStateList = this.n;
        nc0Var.g.k = f;
        nc0Var.invalidateSelf();
        lc0 lc0Var = nc0Var.g;
        if (lc0Var.e != colorStateList) {
            lc0Var.e = colorStateList;
            nc0Var.onStateChange(nc0Var.getState());
        }
        nc0 nc0Var2 = new nc0(this.b);
        dy0 dy0Var2 = this.c;
        if (dy0Var2 != null) {
            nc0Var2.v(dy0Var2);
        }
        ox0 ox0Var2 = this.d;
        if (ox0Var2 != null) {
            nc0Var2.o(ox0Var2);
        }
        nc0Var2.setTint(0);
        float f2 = this.k;
        int i = this.q ? i41.i(materialButton, R.attr.colorSurface) : 0;
        nc0Var2.g.k = f2;
        nc0Var2.invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i);
        lc0 lc0Var2 = nc0Var2.g;
        if (lc0Var2.e != colorStateListValueOf) {
            lc0Var2.e = colorStateListValueOf;
            nc0Var2.onStateChange(nc0Var2.getState());
        }
        nc0 nc0Var3 = new nc0(this.b);
        this.p = nc0Var3;
        dy0 dy0Var3 = this.c;
        if (dy0Var3 != null) {
            nc0Var3.v(dy0Var3);
        }
        ox0 ox0Var3 = this.d;
        if (ox0Var3 != null) {
            this.p.o(ox0Var3);
        }
        this.p.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(pu1.m(this.o), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{nc0Var2, nc0Var}), this.f, this.h, this.g, this.i), this.p);
        this.v = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        nc0 nc0VarA = a(false);
        if (nc0VarA != null) {
            nc0VarA.p(this.w);
            nc0VarA.setState(materialButton.getDrawableState());
        }
    }

    public final void d() {
        nc0 nc0VarA = a(false);
        if (nc0VarA != null) {
            dy0 dy0Var = this.c;
            if (dy0Var != null) {
                nc0VarA.v(dy0Var);
            } else {
                nc0VarA.setShapeAppearanceModel(this.b);
            }
            ox0 ox0Var = this.d;
            if (ox0Var != null) {
                nc0VarA.o(ox0Var);
            }
        }
        nc0 nc0VarA2 = a(true);
        if (nc0VarA2 != null) {
            dy0 dy0Var2 = this.c;
            if (dy0Var2 != null) {
                nc0VarA2.v(dy0Var2);
            } else {
                nc0VarA2.setShapeAppearanceModel(this.b);
            }
            ox0 ox0Var2 = this.d;
            if (ox0Var2 != null) {
                nc0VarA2.o(ox0Var2);
            }
        }
        RippleDrawable rippleDrawable = this.v;
        rv0 rv0Var = (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) ? null : this.v.getNumberOfLayers() > 2 ? (rv0) this.v.getDrawable(2) : (rv0) this.v.getDrawable(1);
        if (rv0Var != null) {
            rv0Var.setShapeAppearanceModel(this.b);
            if (rv0Var instanceof nc0) {
                nc0 nc0Var = (nc0) rv0Var;
                dy0 dy0Var3 = this.c;
                if (dy0Var3 != null) {
                    nc0Var.v(dy0Var3);
                }
                ox0 ox0Var3 = this.d;
                if (ox0Var3 != null) {
                    nc0Var.o(ox0Var3);
                }
            }
        }
    }

    public final void e() {
        nc0 nc0VarA = a(false);
        nc0 nc0VarA2 = a(true);
        if (nc0VarA != null) {
            float f = this.k;
            ColorStateList colorStateList = this.n;
            nc0VarA.g.k = f;
            nc0VarA.invalidateSelf();
            lc0 lc0Var = nc0VarA.g;
            if (lc0Var.e != colorStateList) {
                lc0Var.e = colorStateList;
                nc0VarA.onStateChange(nc0VarA.getState());
            }
            if (nc0VarA2 != null) {
                float f2 = this.k;
                int i = this.q ? i41.i(this.a, R.attr.colorSurface) : 0;
                nc0VarA2.g.k = f2;
                nc0VarA2.invalidateSelf();
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(i);
                lc0 lc0Var2 = nc0VarA2.g;
                if (lc0Var2.e != colorStateListValueOf) {
                    lc0Var2.e = colorStateListValueOf;
                    nc0VarA2.onStateChange(nc0VarA2.getState());
                }
            }
        }
    }
}
