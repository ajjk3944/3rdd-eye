package md;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;
import ee.i;
import ee.l;
import ee.v;
import ee.y;
import i4.g;
import io.sentry.android.replay.capture.e;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final MaterialButton f16677a;

    /* renamed from: b, reason: collision with root package name */
    public l f16678b;

    /* renamed from: c, reason: collision with root package name */
    public y f16679c;

    /* renamed from: d, reason: collision with root package name */
    public g f16680d;

    /* renamed from: e, reason: collision with root package name */
    public e f16681e;

    /* renamed from: f, reason: collision with root package name */
    public int f16682f;

    /* renamed from: g, reason: collision with root package name */
    public int f16683g;

    /* renamed from: h, reason: collision with root package name */
    public int f16684h;

    /* renamed from: i, reason: collision with root package name */
    public int f16685i;
    public int j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public PorterDuff.Mode f16686l;

    /* renamed from: m, reason: collision with root package name */
    public ColorStateList f16687m;

    /* renamed from: n, reason: collision with root package name */
    public ColorStateList f16688n;

    /* renamed from: o, reason: collision with root package name */
    public ColorStateList f16689o;

    /* renamed from: p, reason: collision with root package name */
    public i f16690p;

    /* renamed from: t, reason: collision with root package name */
    public boolean f16694t;

    /* renamed from: v, reason: collision with root package name */
    public RippleDrawable f16696v;

    /* renamed from: w, reason: collision with root package name */
    public int f16697w;

    /* renamed from: q, reason: collision with root package name */
    public boolean f16691q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f16692r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f16693s = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f16695u = true;

    public c(MaterialButton materialButton, l lVar) {
        this.f16677a = materialButton;
        this.f16678b = lVar;
    }

    public final i a(boolean z10) {
        RippleDrawable rippleDrawable = this.f16696v;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (i) ((LayerDrawable) ((InsetDrawable) this.f16696v.getDrawable(0)).getDrawable()).getDrawable(!z10 ? 1 : 0);
    }

    public final void b(int i10, int i11) {
        MaterialButton materialButton = this.f16677a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i12 = this.f16684h;
        int i13 = this.f16685i;
        this.f16685i = i11;
        this.f16684h = i10;
        if (!this.f16692r) {
            c();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i10) - i12, paddingEnd, (paddingBottom + i11) - i13);
    }

    public final void c() {
        i iVar = new i(this.f16678b);
        y yVar = this.f16679c;
        if (yVar != null) {
            iVar.t(yVar);
        }
        g gVar = this.f16680d;
        if (gVar != null) {
            iVar.o(gVar);
        }
        e eVar = this.f16681e;
        if (eVar != null) {
            iVar.f8116a0 = eVar;
        }
        MaterialButton materialButton = this.f16677a;
        iVar.m(materialButton.getContext());
        iVar.setTintList(this.f16687m);
        PorterDuff.Mode mode = this.f16686l;
        if (mode != null) {
            iVar.setTintMode(mode);
        }
        float f10 = this.k;
        ColorStateList colorStateList = this.f16688n;
        iVar.f8117d.k = f10;
        iVar.invalidateSelf();
        ee.g gVar2 = iVar.f8117d;
        if (gVar2.f8101e != colorStateList) {
            gVar2.f8101e = colorStateList;
            iVar.onStateChange(iVar.getState());
        }
        i iVar2 = new i(this.f16678b);
        y yVar2 = this.f16679c;
        if (yVar2 != null) {
            iVar2.t(yVar2);
        }
        g gVar3 = this.f16680d;
        if (gVar3 != null) {
            iVar2.o(gVar3);
        }
        iVar2.setTint(0);
        float f11 = this.k;
        int iV = this.f16691q ? io.sentry.config.a.V(materialButton, ed.b.colorSurface) : 0;
        iVar2.f8117d.k = f11;
        iVar2.invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iV);
        ee.g gVar4 = iVar2.f8117d;
        if (gVar4.f8101e != colorStateListValueOf) {
            gVar4.f8101e = colorStateListValueOf;
            iVar2.onStateChange(iVar2.getState());
        }
        i iVar3 = new i(this.f16678b);
        this.f16690p = iVar3;
        y yVar3 = this.f16679c;
        if (yVar3 != null) {
            iVar3.t(yVar3);
        }
        g gVar5 = this.f16680d;
        if (gVar5 != null) {
            this.f16690p.o(gVar5);
        }
        this.f16690p.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(ce.a.c(this.f16689o), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{iVar2, iVar}), this.f16682f, this.f16684h, this.f16683g, this.f16685i), this.f16690p);
        this.f16696v = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        i iVarA = a(false);
        if (iVarA != null) {
            iVarA.p(this.f16697w);
            iVarA.setState(materialButton.getDrawableState());
        }
    }

    public final void d() {
        i iVarA = a(false);
        if (iVarA != null) {
            y yVar = this.f16679c;
            if (yVar != null) {
                iVarA.t(yVar);
            } else {
                iVarA.setShapeAppearanceModel(this.f16678b);
            }
            g gVar = this.f16680d;
            if (gVar != null) {
                iVarA.o(gVar);
            }
        }
        i iVarA2 = a(true);
        if (iVarA2 != null) {
            y yVar2 = this.f16679c;
            if (yVar2 != null) {
                iVarA2.t(yVar2);
            } else {
                iVarA2.setShapeAppearanceModel(this.f16678b);
            }
            g gVar2 = this.f16680d;
            if (gVar2 != null) {
                iVarA2.o(gVar2);
            }
        }
        RippleDrawable rippleDrawable = this.f16696v;
        v vVar = (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) ? null : this.f16696v.getNumberOfLayers() > 2 ? (v) this.f16696v.getDrawable(2) : (v) this.f16696v.getDrawable(1);
        if (vVar != null) {
            vVar.setShapeAppearanceModel(this.f16678b);
            if (vVar instanceof i) {
                i iVar = (i) vVar;
                y yVar3 = this.f16679c;
                if (yVar3 != null) {
                    iVar.t(yVar3);
                }
                g gVar3 = this.f16680d;
                if (gVar3 != null) {
                    iVar.o(gVar3);
                }
            }
        }
    }

    public final void e() {
        i iVarA = a(false);
        i iVarA2 = a(true);
        if (iVarA != null) {
            float f10 = this.k;
            ColorStateList colorStateList = this.f16688n;
            iVarA.f8117d.k = f10;
            iVarA.invalidateSelf();
            ee.g gVar = iVarA.f8117d;
            if (gVar.f8101e != colorStateList) {
                gVar.f8101e = colorStateList;
                iVarA.onStateChange(iVarA.getState());
            }
            if (iVarA2 != null) {
                float f11 = this.k;
                int iV = this.f16691q ? io.sentry.config.a.V(this.f16677a, ed.b.colorSurface) : 0;
                iVarA2.f8117d.k = f11;
                iVarA2.invalidateSelf();
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(iV);
                ee.g gVar2 = iVarA2.f8117d;
                if (gVar2.f8101e != colorStateListValueOf) {
                    gVar2.f8101e = colorStateListValueOf;
                    iVarA2.onStateChange(iVarA2.getState());
                }
            }
        }
    }
}
