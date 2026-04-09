package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.card.MaterialCardView;
import com.phuongpn.whousemywifi.networkscanner.R;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class fc0 {
    public static final double y = Math.cos(Math.toRadians(45.0d));
    public static final ColorDrawable z;
    public final MaterialCardView a;
    public final nc0 c;
    public final nc0 d;
    public int e;
    public int f;
    public int g;
    public int h;
    public Drawable i;
    public Drawable j;
    public ColorStateList k;
    public ColorStateList l;
    public su0 m;
    public ColorStateList n;
    public RippleDrawable o;
    public LayerDrawable p;
    public nc0 q;
    public boolean s;
    public ValueAnimator t;
    public final TimeInterpolator u;
    public final int v;
    public final int w;
    public final Rect b = new Rect();
    public boolean r = false;
    public float x = 0.0f;

    static {
        z = Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null;
    }

    public fc0(MaterialCardView materialCardView, AttributeSet attributeSet) {
        this.a = materialCardView;
        nc0 nc0Var = new nc0(materialCardView.getContext(), attributeSet, R.attr.materialCardViewStyle, R.style.Widget_MaterialComponents_CardView);
        this.c = nc0Var;
        nc0Var.m(materialCardView.getContext());
        nc0Var.t();
        f2 f2VarF = nc0Var.g.a.f();
        TypedArray typedArrayObtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, ym0.a, R.attr.materialCardViewStyle, R.style.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            float dimension = typedArrayObtainStyledAttributes.getDimension(3, 0.0f);
            f2VarF.e = new l(dimension);
            f2VarF.f = new l(dimension);
            f2VarF.g = new l(dimension);
            f2VarF.h = new l(dimension);
        }
        this.d = new nc0();
        h(f2VarF.a());
        this.u = wl2.u(materialCardView.getContext(), R.attr.motionEasingLinearInterpolator, r4.a);
        this.v = wl2.t(materialCardView.getContext(), R.attr.motionDurationShort2, 300);
        this.w = wl2.t(materialCardView.getContext(), R.attr.motionDurationShort1, 300);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static float b(ou1 ou1Var, float f) {
        if (ou1Var instanceof wq0) {
            return (float) ((1.0d - y) * f);
        }
        if (ou1Var instanceof ul) {
            return f / 2.0f;
        }
        return 0.0f;
    }

    public final float a() {
        ou1 ou1Var = this.m.a;
        nc0 nc0Var = this.c;
        float fB = b(ou1Var, nc0Var.k());
        ou1 ou1Var2 = this.m.b;
        float[] fArr = nc0Var.H;
        float fMax = Math.max(fB, b(ou1Var2, fArr != null ? fArr[0] : nc0Var.g.a.f.a(nc0Var.g())));
        ou1 ou1Var3 = this.m.c;
        float[] fArr2 = nc0Var.H;
        float fB2 = b(ou1Var3, fArr2 != null ? fArr2[1] : nc0Var.g.a.g.a(nc0Var.g()));
        ou1 ou1Var4 = this.m.d;
        float[] fArr3 = nc0Var.H;
        return Math.max(fMax, Math.max(fB2, b(ou1Var4, fArr3 != null ? fArr3[2] : nc0Var.g.a.h.a(nc0Var.g()))));
    }

    public final LayerDrawable c() {
        if (this.o == null) {
            this.q = new nc0(this.m);
            this.o = new RippleDrawable(this.k, null, this.q);
        }
        if (this.p == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.o, this.d, this.j});
            this.p = layerDrawable;
            layerDrawable.setId(2, R.id.mtrl_card_checked_layer_id);
        }
        return this.p;
    }

    public final ec0 d(Drawable drawable) {
        int iCeil;
        int i;
        if (this.a.getUseCompatPadding()) {
            int iCeil2 = (int) Math.ceil((r0.getMaxCardElevation() * 1.5f) + (i() ? a() : 0.0f));
            iCeil = (int) Math.ceil(r0.getMaxCardElevation() + (i() ? a() : 0.0f));
            i = iCeil2;
        } else {
            iCeil = 0;
            i = 0;
        }
        return new ec0(drawable, iCeil, i, iCeil, i);
    }

    public final void e(int i, int i2) {
        int iCeil;
        int iCeil2;
        int i3;
        int i4;
        if (this.p != null) {
            MaterialCardView materialCardView = this.a;
            if (materialCardView.getUseCompatPadding()) {
                iCeil = (int) Math.ceil(((materialCardView.getMaxCardElevation() * 1.5f) + (i() ? a() : 0.0f)) * 2.0f);
                iCeil2 = (int) Math.ceil((materialCardView.getMaxCardElevation() + (i() ? a() : 0.0f)) * 2.0f);
            } else {
                iCeil = 0;
                iCeil2 = 0;
            }
            int i5 = this.g;
            int i6 = (i5 & 8388613) == 8388613 ? ((i - this.e) - this.f) - iCeil2 : this.e;
            int i7 = (i5 & 80) == 80 ? this.e : ((i2 - this.e) - this.f) - iCeil;
            int i8 = (i5 & 8388613) == 8388613 ? this.e : ((i - this.e) - this.f) - iCeil2;
            int i9 = (i5 & 80) == 80 ? ((i2 - this.e) - this.f) - iCeil : this.e;
            if (materialCardView.getLayoutDirection() == 1) {
                i4 = i8;
                i3 = i6;
            } else {
                i3 = i8;
                i4 = i6;
            }
            this.p.setLayerInset(2, i4, i9, i3, i7);
        }
    }

    public final void f(boolean z2, boolean z3) {
        Drawable drawable = this.j;
        if (drawable != null) {
            if (!z3) {
                drawable.setAlpha(z2 ? 255 : 0);
                this.x = z2 ? 1.0f : 0.0f;
                return;
            }
            float f = z2 ? 1.0f : 0.0f;
            float f2 = z2 ? 1.0f - this.x : this.x;
            ValueAnimator valueAnimator = this.t;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.t = null;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.x, f);
            this.t = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new mo(3, this));
            this.t.setInterpolator(this.u);
            this.t.setDuration((long) ((z2 ? this.v : this.w) * f2));
            this.t.start();
        }
    }

    public final void g(Drawable drawable) {
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.j = drawableMutate;
            drawableMutate.setTintList(this.l);
            f(this.a.o, false);
        } else {
            this.j = z;
        }
        LayerDrawable layerDrawable = this.p;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(R.id.mtrl_card_checked_layer_id, this.j);
        }
    }

    public final void h(su0 su0Var) {
        this.m = su0Var;
        nc0 nc0Var = this.c;
        nc0Var.setShapeAppearanceModel(su0Var);
        nc0Var.C = !nc0Var.n();
        nc0 nc0Var2 = this.d;
        if (nc0Var2 != null) {
            nc0Var2.setShapeAppearanceModel(su0Var);
        }
        nc0 nc0Var3 = this.q;
        if (nc0Var3 != null) {
            nc0Var3.setShapeAppearanceModel(su0Var);
        }
    }

    public final boolean i() {
        MaterialCardView materialCardView = this.a;
        return materialCardView.getPreventCornerOverlap() && this.c.n() && materialCardView.getUseCompatPadding();
    }

    public final boolean j() {
        View view = this.a;
        if (view.isClickable()) {
            return true;
        }
        while (view.isDuplicateParentStateEnabled() && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        return view.isClickable();
    }

    public final void k() {
        Drawable drawable = this.i;
        Drawable drawableC = j() ? c() : this.d;
        this.i = drawableC;
        if (drawable != drawableC) {
            MaterialCardView materialCardView = this.a;
            if (materialCardView.getForeground() instanceof InsetDrawable) {
                ((InsetDrawable) materialCardView.getForeground()).setDrawable(drawableC);
            } else {
                materialCardView.setForeground(d(drawableC));
            }
        }
    }

    public final void l() {
        MaterialCardView materialCardView = this.a;
        float cardViewRadius = 0.0f;
        float fA = ((!materialCardView.getPreventCornerOverlap() || this.c.n()) && !i()) ? 0.0f : a();
        if (materialCardView.getPreventCornerOverlap() && materialCardView.getUseCompatPadding()) {
            cardViewRadius = (float) ((1.0d - y) * materialCardView.getCardViewRadius());
        }
        int i = (int) (fA - cardViewRadius);
        Rect rect = this.b;
        materialCardView.h.set(rect.left + i, rect.top + i, rect.right + i, rect.bottom + i);
        l92 l92Var = materialCardView.j;
        if (!((od) l92Var.g).getUseCompatPadding()) {
            l92Var.H(0, 0, 0, 0);
            return;
        }
        uq0 uq0Var = (uq0) ((Drawable) l92Var.f);
        float f = uq0Var.e;
        float f2 = uq0Var.a;
        int iCeil = (int) Math.ceil(vq0.a(f, f2, r1.getPreventCornerOverlap()));
        int iCeil2 = (int) Math.ceil(vq0.b(f, f2, r1.getPreventCornerOverlap()));
        l92Var.H(iCeil, iCeil2, iCeil, iCeil2);
    }

    public final void m() {
        boolean z2 = this.r;
        MaterialCardView materialCardView = this.a;
        if (!z2) {
            materialCardView.setBackgroundInternal(d(this.c));
        }
        materialCardView.setForeground(d(this.i));
    }
}
