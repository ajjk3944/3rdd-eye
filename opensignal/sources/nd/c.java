package nd;

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
import androidx.cardview.widget.CardView;
import bk.f;
import com.google.android.material.card.MaterialCardView;
import ee.e;
import ee.i;
import ee.k;
import ee.l;
import ir.f0;
import lf.t1;
import s.d;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: y, reason: collision with root package name */
    public static final double f17494y = Math.cos(Math.toRadians(45.0d));

    /* renamed from: z, reason: collision with root package name */
    public static final ColorDrawable f17495z;

    /* renamed from: a, reason: collision with root package name */
    public final MaterialCardView f17496a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f17497b;

    /* renamed from: c, reason: collision with root package name */
    public final i f17498c;

    /* renamed from: d, reason: collision with root package name */
    public final i f17499d;

    /* renamed from: e, reason: collision with root package name */
    public int f17500e;

    /* renamed from: f, reason: collision with root package name */
    public int f17501f;

    /* renamed from: g, reason: collision with root package name */
    public int f17502g;

    /* renamed from: h, reason: collision with root package name */
    public int f17503h;

    /* renamed from: i, reason: collision with root package name */
    public Drawable f17504i;
    public Drawable j;
    public ColorStateList k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f17505l;

    /* renamed from: m, reason: collision with root package name */
    public l f17506m;

    /* renamed from: n, reason: collision with root package name */
    public ColorStateList f17507n;

    /* renamed from: o, reason: collision with root package name */
    public RippleDrawable f17508o;

    /* renamed from: p, reason: collision with root package name */
    public LayerDrawable f17509p;

    /* renamed from: q, reason: collision with root package name */
    public i f17510q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f17511r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f17512s;

    /* renamed from: t, reason: collision with root package name */
    public ValueAnimator f17513t;

    /* renamed from: u, reason: collision with root package name */
    public final TimeInterpolator f17514u;

    /* renamed from: v, reason: collision with root package name */
    public final int f17515v;

    /* renamed from: w, reason: collision with root package name */
    public final int f17516w;

    /* renamed from: x, reason: collision with root package name */
    public float f17517x;

    static {
        f17495z = Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null;
    }

    public c(MaterialCardView materialCardView, AttributeSet attributeSet, int i10) {
        int i11 = MaterialCardView.K;
        this.f17497b = new Rect();
        this.f17511r = false;
        this.f17517x = 0.0f;
        this.f17496a = materialCardView;
        i iVar = new i(materialCardView.getContext(), attributeSet, i10, i11);
        this.f17498c = iVar;
        iVar.m(materialCardView.getContext());
        iVar.s();
        f fVarG = iVar.f8117d.f8097a.g();
        TypedArray typedArrayObtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, d.CardView, i10, s.c.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(d.CardView_cardCornerRadius)) {
            float dimension = typedArrayObtainStyledAttributes.getDimension(d.CardView_cardCornerRadius, 0.0f);
            fVarG.f2807e = new ee.a(dimension);
            fVarG.f2808f = new ee.a(dimension);
            fVarG.f2809g = new ee.a(dimension);
            fVarG.f2810h = new ee.a(dimension);
        }
        this.f17499d = new i();
        h(fVarG.b());
        this.f17514u = f0.V(materialCardView.getContext(), ed.b.motionEasingLinearInterpolator, fd.a.f8822a);
        this.f17515v = f0.U(materialCardView.getContext(), ed.b.motionDurationShort2, 300);
        this.f17516w = f0.U(materialCardView.getContext(), ed.b.motionDurationShort1, 300);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static float b(t1 t1Var, float f10) {
        if (t1Var instanceof k) {
            return (float) ((1.0d - f17494y) * f10);
        }
        if (t1Var instanceof e) {
            return f10 / 2.0f;
        }
        return 0.0f;
    }

    public final float a() {
        t1 t1Var = this.f17506m.f8124a;
        i iVar = this.f17498c;
        float fB = b(t1Var, iVar.k());
        t1 t1Var2 = this.f17506m.f8125b;
        float[] fArr = iVar.Y;
        float fMax = Math.max(fB, b(t1Var2, fArr != null ? fArr[0] : iVar.f8117d.f8097a.f8129f.a(iVar.h())));
        t1 t1Var3 = this.f17506m.f8126c;
        float[] fArr2 = iVar.Y;
        float fB2 = b(t1Var3, fArr2 != null ? fArr2[1] : iVar.f8117d.f8097a.f8130g.a(iVar.h()));
        t1 t1Var4 = this.f17506m.f8127d;
        float[] fArr3 = iVar.Y;
        return Math.max(fMax, Math.max(fB2, b(t1Var4, fArr3 != null ? fArr3[2] : iVar.f8117d.f8097a.f8131h.a(iVar.h()))));
    }

    public final LayerDrawable c() {
        if (this.f17508o == null) {
            this.f17510q = new i(this.f17506m);
            this.f17508o = new RippleDrawable(this.k, null, this.f17510q);
        }
        if (this.f17509p == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f17508o, this.f17499d, this.j});
            this.f17509p = layerDrawable;
            layerDrawable.setId(2, ed.f.mtrl_card_checked_layer_id);
        }
        return this.f17509p;
    }

    public final b d(Drawable drawable) {
        int iCeil;
        int i10;
        if (this.f17496a.getUseCompatPadding()) {
            int iCeil2 = (int) Math.ceil((r0.getMaxCardElevation() * 1.5f) + (i() ? a() : 0.0f));
            iCeil = (int) Math.ceil(r0.getMaxCardElevation() + (i() ? a() : 0.0f));
            i10 = iCeil2;
        } else {
            iCeil = 0;
            i10 = 0;
        }
        return new b(drawable, iCeil, i10, iCeil, i10);
    }

    public final void e(int i10, int i11) {
        int iCeil;
        int iCeil2;
        int i12;
        int i13;
        if (this.f17509p != null) {
            MaterialCardView materialCardView = this.f17496a;
            if (materialCardView.getUseCompatPadding()) {
                iCeil = (int) Math.ceil(((materialCardView.getMaxCardElevation() * 1.5f) + (i() ? a() : 0.0f)) * 2.0f);
                iCeil2 = (int) Math.ceil((materialCardView.getMaxCardElevation() + (i() ? a() : 0.0f)) * 2.0f);
            } else {
                iCeil = 0;
                iCeil2 = 0;
            }
            int i14 = this.f17502g;
            int i15 = (i14 & 8388613) == 8388613 ? ((i10 - this.f17500e) - this.f17501f) - iCeil2 : this.f17500e;
            int i16 = (i14 & 80) == 80 ? this.f17500e : ((i11 - this.f17500e) - this.f17501f) - iCeil;
            int i17 = (i14 & 8388613) == 8388613 ? this.f17500e : ((i10 - this.f17500e) - this.f17501f) - iCeil2;
            int i18 = (i14 & 80) == 80 ? ((i11 - this.f17500e) - this.f17501f) - iCeil : this.f17500e;
            if (materialCardView.getLayoutDirection() == 1) {
                i13 = i17;
                i12 = i15;
            } else {
                i12 = i17;
                i13 = i15;
            }
            this.f17509p.setLayerInset(2, i13, i18, i12, i16);
        }
    }

    public final void f(boolean z10, boolean z11) {
        Drawable drawable = this.j;
        if (drawable != null) {
            if (!z11) {
                drawable.setAlpha(z10 ? 255 : 0);
                this.f17517x = z10 ? 1.0f : 0.0f;
                return;
            }
            float f10 = z10 ? 1.0f : 0.0f;
            float f11 = z10 ? 1.0f - this.f17517x : this.f17517x;
            ValueAnimator valueAnimator = this.f17513t;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f17513t = null;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f17517x, f10);
            this.f17513t = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new bq.b(3, this));
            this.f17513t.setInterpolator(this.f17514u);
            this.f17513t.setDuration((long) ((z10 ? this.f17515v : this.f17516w) * f11));
            this.f17513t.start();
        }
    }

    public final void g(Drawable drawable) {
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.j = drawableMutate;
            drawableMutate.setTintList(this.f17505l);
            f(this.f17496a.F, false);
        } else {
            this.j = f17495z;
        }
        LayerDrawable layerDrawable = this.f17509p;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(ed.f.mtrl_card_checked_layer_id, this.j);
        }
    }

    public final void h(l lVar) {
        this.f17506m = lVar;
        i iVar = this.f17498c;
        iVar.setShapeAppearanceModel(lVar);
        iVar.T = !iVar.n();
        i iVar2 = this.f17499d;
        if (iVar2 != null) {
            iVar2.setShapeAppearanceModel(lVar);
        }
        i iVar3 = this.f17510q;
        if (iVar3 != null) {
            iVar3.setShapeAppearanceModel(lVar);
        }
    }

    public final boolean i() {
        MaterialCardView materialCardView = this.f17496a;
        return materialCardView.getPreventCornerOverlap() && this.f17498c.n() && materialCardView.getUseCompatPadding();
    }

    public final boolean j() {
        View view = this.f17496a;
        if (view.isClickable()) {
            return true;
        }
        while (view.isDuplicateParentStateEnabled() && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        return view.isClickable();
    }

    public final void k() {
        Drawable drawable = this.f17504i;
        Drawable drawableC = j() ? c() : this.f17499d;
        this.f17504i = drawableC;
        if (drawable != drawableC) {
            MaterialCardView materialCardView = this.f17496a;
            if (materialCardView.getForeground() instanceof InsetDrawable) {
                ((InsetDrawable) materialCardView.getForeground()).setDrawable(drawableC);
            } else {
                materialCardView.setForeground(d(drawableC));
            }
        }
    }

    public final void l() {
        MaterialCardView materialCardView = this.f17496a;
        float cardViewRadius = 0.0f;
        float fA = ((!materialCardView.getPreventCornerOverlap() || this.f17498c.n()) && !i()) ? 0.0f : a();
        if (materialCardView.getPreventCornerOverlap() && materialCardView.getUseCompatPadding()) {
            cardViewRadius = (float) ((1.0d - f17494y) * materialCardView.getCardViewRadius());
        }
        int i10 = (int) (fA - cardViewRadius);
        Rect rect = this.f17497b;
        materialCardView.f1058g.set(rect.left + i10, rect.top + i10, rect.right + i10, rect.bottom + i10);
        q3.a aVar = materialCardView.f1060x;
        if (!((CardView) aVar.f20680g).getUseCompatPadding()) {
            aVar.Q0(0, 0, 0, 0);
            return;
        }
        t.a aVar2 = (t.a) ((Drawable) aVar.f20679d);
        float f10 = aVar2.f22368e;
        float f11 = aVar2.f22364a;
        int iCeil = (int) Math.ceil(t.b.a(f10, f11, r1.getPreventCornerOverlap()));
        int iCeil2 = (int) Math.ceil(t.b.b(f10, f11, r1.getPreventCornerOverlap()));
        aVar.Q0(iCeil, iCeil2, iCeil, iCeil2);
    }

    public final void m() {
        boolean z10 = this.f17511r;
        MaterialCardView materialCardView = this.f17496a;
        if (!z10) {
            materialCardView.setBackgroundInternal(d(this.f17498c));
        }
        materialCardView.setForeground(d(this.f17504i));
    }
}
