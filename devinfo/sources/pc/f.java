package pc;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;
import com.liuzh.deviceinfo.R;
import ed.b0;
import ed.j;
import ed.o;
import ed.y;
import t6.i0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final MaterialButton f31691a;

    /* renamed from: b, reason: collision with root package name */
    public o f31692b;

    /* renamed from: c, reason: collision with root package name */
    public b0 f31693c;

    /* renamed from: d, reason: collision with root package name */
    public v4.f f31694d;

    /* renamed from: e, reason: collision with root package name */
    public lf.e f31695e;

    /* renamed from: f, reason: collision with root package name */
    public int f31696f;
    public int g;

    /* renamed from: h, reason: collision with root package name */
    public int f31697h;

    /* renamed from: i, reason: collision with root package name */
    public int f31698i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public int f31699k;

    /* renamed from: l, reason: collision with root package name */
    public PorterDuff.Mode f31700l;

    /* renamed from: m, reason: collision with root package name */
    public ColorStateList f31701m;

    /* renamed from: n, reason: collision with root package name */
    public ColorStateList f31702n;

    /* renamed from: o, reason: collision with root package name */
    public ColorStateList f31703o;

    /* renamed from: p, reason: collision with root package name */
    public j f31704p;

    /* renamed from: t, reason: collision with root package name */
    public boolean f31708t;

    /* renamed from: v, reason: collision with root package name */
    public RippleDrawable f31710v;

    /* renamed from: w, reason: collision with root package name */
    public int f31711w;

    /* renamed from: q, reason: collision with root package name */
    public boolean f31705q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f31706r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f31707s = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f31709u = true;

    public f(MaterialButton materialButton, o oVar) {
        this.f31691a = materialButton;
        this.f31692b = oVar;
    }

    public final j a(boolean z3) {
        RippleDrawable rippleDrawable = this.f31710v;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (j) ((LayerDrawable) ((InsetDrawable) this.f31710v.getDrawable(0)).getDrawable()).getDrawable(!z3 ? 1 : 0);
    }

    public final void b(int i4, int i10) {
        MaterialButton materialButton = this.f31691a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i11 = this.f31697h;
        int i12 = this.f31698i;
        this.f31698i = i10;
        this.f31697h = i4;
        if (!this.f31706r) {
            c();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i4) - i11, paddingEnd, (paddingBottom + i10) - i12);
    }

    public final void c() {
        j jVar = new j(this.f31692b);
        b0 b0Var = this.f31693c;
        if (b0Var != null) {
            jVar.q(b0Var);
        }
        v4.f fVar = this.f31694d;
        if (fVar != null) {
            jVar.m(fVar);
        }
        lf.e eVar = this.f31695e;
        if (eVar != null) {
            jVar.E = eVar;
        }
        MaterialButton materialButton = this.f31691a;
        jVar.l(materialButton.getContext());
        jVar.setTintList(this.f31701m);
        PorterDuff.Mode mode = this.f31700l;
        if (mode != null) {
            jVar.setTintMode(mode);
        }
        float f10 = this.f31699k;
        ColorStateList colorStateList = this.f31702n;
        jVar.f23316b.f23306k = f10;
        jVar.invalidateSelf();
        jVar.r(colorStateList);
        j jVar2 = new j(this.f31692b);
        b0 b0Var2 = this.f31693c;
        if (b0Var2 != null) {
            jVar2.q(b0Var2);
        }
        v4.f fVar2 = this.f31694d;
        if (fVar2 != null) {
            jVar2.m(fVar2);
        }
        jVar2.setTint(0);
        float f11 = this.f31699k;
        int i4 = this.f31705q ? i0.i(R.attr.colorSurface, materialButton) : 0;
        jVar2.f23316b.f23306k = f11;
        jVar2.invalidateSelf();
        jVar2.r(ColorStateList.valueOf(i4));
        j jVar3 = new j(this.f31692b);
        this.f31704p = jVar3;
        b0 b0Var3 = this.f31693c;
        if (b0Var3 != null) {
            jVar3.q(b0Var3);
        }
        v4.f fVar3 = this.f31694d;
        if (fVar3 != null) {
            this.f31704p.m(fVar3);
        }
        this.f31704p.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(cd.a.b(this.f31703o), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{jVar2, jVar}), this.f31696f, this.f31697h, this.g, this.f31698i), this.f31704p);
        this.f31710v = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        j jVarA = a(false);
        if (jVarA != null) {
            jVarA.n(this.f31711w);
            jVarA.setState(materialButton.getDrawableState());
        }
    }

    public final void d() {
        j jVarA = a(false);
        if (jVarA != null) {
            b0 b0Var = this.f31693c;
            if (b0Var != null) {
                jVarA.q(b0Var);
            } else {
                jVarA.setShapeAppearanceModel(this.f31692b);
            }
            v4.f fVar = this.f31694d;
            if (fVar != null) {
                jVarA.m(fVar);
            }
        }
        j jVarA2 = a(true);
        if (jVarA2 != null) {
            b0 b0Var2 = this.f31693c;
            if (b0Var2 != null) {
                jVarA2.q(b0Var2);
            } else {
                jVarA2.setShapeAppearanceModel(this.f31692b);
            }
            v4.f fVar2 = this.f31694d;
            if (fVar2 != null) {
                jVarA2.m(fVar2);
            }
        }
        RippleDrawable rippleDrawable = this.f31710v;
        y yVar = (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) ? null : this.f31710v.getNumberOfLayers() > 2 ? (y) this.f31710v.getDrawable(2) : (y) this.f31710v.getDrawable(1);
        if (yVar != null) {
            yVar.setShapeAppearanceModel(this.f31692b);
            if (yVar instanceof j) {
                j jVar = (j) yVar;
                b0 b0Var3 = this.f31693c;
                if (b0Var3 != null) {
                    jVar.q(b0Var3);
                }
                v4.f fVar3 = this.f31694d;
                if (fVar3 != null) {
                    jVar.m(fVar3);
                }
            }
        }
    }

    public final void e() {
        j jVarA = a(false);
        j jVarA2 = a(true);
        if (jVarA != null) {
            float f10 = this.f31699k;
            ColorStateList colorStateList = this.f31702n;
            jVarA.f23316b.f23306k = f10;
            jVarA.invalidateSelf();
            jVarA.r(colorStateList);
            if (jVarA2 != null) {
                float f11 = this.f31699k;
                int i4 = this.f31705q ? i0.i(R.attr.colorSurface, this.f31691a) : 0;
                jVarA2.f23316b.f23306k = f11;
                jVarA2.invalidateSelf();
                jVarA2.r(ColorStateList.valueOf(i4));
            }
        }
    }
}
