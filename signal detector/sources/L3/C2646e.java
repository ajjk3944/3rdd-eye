package l3;

import G3.G;
import G3.j;
import G3.o;
import G3.z;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.apm.insight.R;
import com.google.android.material.button.MaterialButton;
import e0.f;

/* renamed from: l3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2646e {

    /* renamed from: a, reason: collision with root package name */
    public final MaterialButton f21837a;

    /* renamed from: b, reason: collision with root package name */
    public o f21838b;

    /* renamed from: c, reason: collision with root package name */
    public G f21839c;

    /* renamed from: d, reason: collision with root package name */
    public f f21840d;

    /* renamed from: e, reason: collision with root package name */
    public F4.c f21841e;

    /* renamed from: f, reason: collision with root package name */
    public int f21842f;

    /* renamed from: g, reason: collision with root package name */
    public int f21843g;

    /* renamed from: h, reason: collision with root package name */
    public int f21844h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f21845j;

    /* renamed from: k, reason: collision with root package name */
    public int f21846k;

    /* renamed from: l, reason: collision with root package name */
    public PorterDuff.Mode f21847l;

    /* renamed from: m, reason: collision with root package name */
    public ColorStateList f21848m;

    /* renamed from: n, reason: collision with root package name */
    public ColorStateList f21849n;

    /* renamed from: o, reason: collision with root package name */
    public ColorStateList f21850o;

    /* renamed from: p, reason: collision with root package name */
    public j f21851p;

    /* renamed from: t, reason: collision with root package name */
    public boolean f21855t;

    /* renamed from: v, reason: collision with root package name */
    public RippleDrawable f21857v;

    /* renamed from: w, reason: collision with root package name */
    public int f21858w;

    /* renamed from: q, reason: collision with root package name */
    public boolean f21852q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f21853r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f21854s = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f21856u = true;

    public C2646e(MaterialButton materialButton, o oVar) {
        this.f21837a = materialButton;
        this.f21838b = oVar;
    }

    public final j a(boolean z6) {
        RippleDrawable rippleDrawable = this.f21857v;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (j) ((LayerDrawable) ((InsetDrawable) this.f21857v.getDrawable(0)).getDrawable()).getDrawable(!z6 ? 1 : 0);
    }

    public final void b(int i, int i3) {
        MaterialButton materialButton = this.f21837a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i6 = this.f21844h;
        int i7 = this.i;
        this.i = i3;
        this.f21844h = i;
        if (!this.f21853r) {
            c();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i) - i6, paddingEnd, (paddingBottom + i3) - i7);
    }

    public final void c() {
        j jVar = new j(this.f21838b);
        G g2 = this.f21839c;
        if (g2 != null) {
            jVar.u(g2);
        }
        f fVar = this.f21840d;
        if (fVar != null) {
            jVar.o(fVar);
        }
        F4.c cVar = this.f21841e;
        if (cVar != null) {
            jVar.f1595S = cVar;
        }
        MaterialButton materialButton = this.f21837a;
        jVar.m(materialButton.getContext());
        jVar.setTintList(this.f21848m);
        PorterDuff.Mode mode = this.f21847l;
        if (mode != null) {
            jVar.setTintMode(mode);
        }
        float f2 = this.f21846k;
        ColorStateList colorStateList = this.f21849n;
        jVar.f1597b.f1569k = f2;
        jVar.invalidateSelf();
        jVar.v(colorStateList);
        j jVar2 = new j(this.f21838b);
        G g6 = this.f21839c;
        if (g6 != null) {
            jVar2.u(g6);
        }
        f fVar2 = this.f21840d;
        if (fVar2 != null) {
            jVar2.o(fVar2);
        }
        jVar2.setTint(0);
        float f5 = this.f21846k;
        int iM = this.f21852q ? com.bumptech.glide.e.m(R.attr.colorSurface, materialButton) : 0;
        jVar2.f1597b.f1569k = f5;
        jVar2.invalidateSelf();
        jVar2.v(ColorStateList.valueOf(iM));
        j jVar3 = new j(this.f21838b);
        this.f21851p = jVar3;
        G g7 = this.f21839c;
        if (g7 != null) {
            jVar3.u(g7);
        }
        f fVar3 = this.f21840d;
        if (fVar3 != null) {
            this.f21851p.o(fVar3);
        }
        this.f21851p.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(E3.a.c(this.f21850o), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{jVar2, jVar}), this.f21842f, this.f21844h, this.f21843g, this.i), this.f21851p);
        this.f21857v = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        j jVarA = a(false);
        if (jVarA != null) {
            jVarA.p(this.f21858w);
            jVarA.setState(materialButton.getDrawableState());
        }
    }

    public final void d() {
        j jVarA = a(false);
        if (jVarA != null) {
            G g2 = this.f21839c;
            if (g2 != null) {
                jVarA.u(g2);
            } else {
                jVarA.setShapeAppearanceModel(this.f21838b);
            }
            f fVar = this.f21840d;
            if (fVar != null) {
                jVarA.o(fVar);
            }
        }
        j jVarA2 = a(true);
        if (jVarA2 != null) {
            G g6 = this.f21839c;
            if (g6 != null) {
                jVarA2.u(g6);
            } else {
                jVarA2.setShapeAppearanceModel(this.f21838b);
            }
            f fVar2 = this.f21840d;
            if (fVar2 != null) {
                jVarA2.o(fVar2);
            }
        }
        RippleDrawable rippleDrawable = this.f21857v;
        z zVar = (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) ? null : this.f21857v.getNumberOfLayers() > 2 ? (z) this.f21857v.getDrawable(2) : (z) this.f21857v.getDrawable(1);
        if (zVar != null) {
            zVar.setShapeAppearanceModel(this.f21838b);
            if (zVar instanceof j) {
                j jVar = (j) zVar;
                G g7 = this.f21839c;
                if (g7 != null) {
                    jVar.u(g7);
                }
                f fVar3 = this.f21840d;
                if (fVar3 != null) {
                    jVar.o(fVar3);
                }
            }
        }
    }

    public final void e() {
        j jVarA = a(false);
        j jVarA2 = a(true);
        if (jVarA != null) {
            float f2 = this.f21846k;
            ColorStateList colorStateList = this.f21849n;
            jVarA.f1597b.f1569k = f2;
            jVarA.invalidateSelf();
            jVarA.v(colorStateList);
            if (jVarA2 != null) {
                float f5 = this.f21846k;
                int iM = this.f21852q ? com.bumptech.glide.e.m(R.attr.colorSurface, this.f21837a) : 0;
                jVarA2.f1597b.f1569k = f5;
                jVarA2.invalidateSelf();
                jVarA2.v(ColorStateList.valueOf(iM));
            }
        }
    }
}
