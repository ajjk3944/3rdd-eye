package m3;

import A3.C0133b;
import G3.C0151e;
import G3.j;
import G3.m;
import G3.n;
import G3.o;
import a.AbstractC0241a;
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
import com.apm.insight.R;
import com.bumptech.glide.d;
import com.google.android.material.card.MaterialCardView;
import e3.AbstractC2303a;
import h0.C2351a;
import s.AbstractC2879a;
import t.AbstractC2899a;
import t.AbstractC2901c;
import t.C2900b;

/* renamed from: m3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2663c {

    /* renamed from: y, reason: collision with root package name */
    public static final double f21953y = Math.cos(Math.toRadians(45.0d));

    /* renamed from: z, reason: collision with root package name */
    public static final ColorDrawable f21954z;

    /* renamed from: a, reason: collision with root package name */
    public final MaterialCardView f21955a;

    /* renamed from: c, reason: collision with root package name */
    public final j f21957c;

    /* renamed from: d, reason: collision with root package name */
    public final j f21958d;

    /* renamed from: e, reason: collision with root package name */
    public int f21959e;

    /* renamed from: f, reason: collision with root package name */
    public int f21960f;

    /* renamed from: g, reason: collision with root package name */
    public int f21961g;

    /* renamed from: h, reason: collision with root package name */
    public int f21962h;
    public Drawable i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f21963j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f21964k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f21965l;

    /* renamed from: m, reason: collision with root package name */
    public o f21966m;

    /* renamed from: n, reason: collision with root package name */
    public ColorStateList f21967n;

    /* renamed from: o, reason: collision with root package name */
    public RippleDrawable f21968o;

    /* renamed from: p, reason: collision with root package name */
    public LayerDrawable f21969p;

    /* renamed from: q, reason: collision with root package name */
    public j f21970q;

    /* renamed from: s, reason: collision with root package name */
    public boolean f21972s;

    /* renamed from: t, reason: collision with root package name */
    public ValueAnimator f21973t;

    /* renamed from: u, reason: collision with root package name */
    public final TimeInterpolator f21974u;

    /* renamed from: v, reason: collision with root package name */
    public final int f21975v;

    /* renamed from: w, reason: collision with root package name */
    public final int f21976w;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f21956b = new Rect();

    /* renamed from: r, reason: collision with root package name */
    public boolean f21971r = false;

    /* renamed from: x, reason: collision with root package name */
    public float f21977x = 0.0f;

    static {
        f21954z = Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null;
    }

    public C2663c(MaterialCardView materialCardView, AttributeSet attributeSet) {
        this.f21955a = materialCardView;
        j jVar = new j(materialCardView.getContext(), attributeSet, R.attr.materialCardViewStyle, R.style.Widget_MaterialComponents_CardView);
        this.f21957c = jVar;
        jVar.m(materialCardView.getContext());
        jVar.s();
        n nVarG = jVar.f1597b.f1560a.g();
        TypedArray typedArrayObtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, AbstractC2879a.f23400a, R.attr.materialCardViewStyle, R.style.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            nVarG.c(typedArrayObtainStyledAttributes.getDimension(3, 0.0f));
        }
        this.f21958d = new j();
        h(nVarG.a());
        this.f21974u = d.P(materialCardView.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC2303a.f19927a);
        this.f21975v = d.O(materialCardView.getContext(), R.attr.motionDurationShort2, 300);
        this.f21976w = d.O(materialCardView.getContext(), R.attr.motionDurationShort1, 300);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static float b(AbstractC0241a abstractC0241a, float f2) {
        if (abstractC0241a instanceof m) {
            return (float) ((1.0d - f21953y) * f2);
        }
        if (abstractC0241a instanceof C0151e) {
            return f2 / 2.0f;
        }
        return 0.0f;
    }

    public final float a() {
        AbstractC0241a abstractC0241a = this.f21966m.f1624a;
        j jVar = this.f21957c;
        float fB = b(abstractC0241a, jVar.k());
        AbstractC0241a abstractC0241a2 = this.f21966m.f1625b;
        float[] fArr = jVar.f1593Q;
        float fMax = Math.max(fB, b(abstractC0241a2, fArr != null ? fArr[0] : jVar.f1597b.f1560a.f1629f.a(jVar.h())));
        AbstractC0241a abstractC0241a3 = this.f21966m.f1626c;
        float[] fArr2 = jVar.f1593Q;
        float fB2 = b(abstractC0241a3, fArr2 != null ? fArr2[1] : jVar.f1597b.f1560a.f1630g.a(jVar.h()));
        AbstractC0241a abstractC0241a4 = this.f21966m.f1627d;
        float[] fArr3 = jVar.f1593Q;
        return Math.max(fMax, Math.max(fB2, b(abstractC0241a4, fArr3 != null ? fArr3[2] : jVar.f1597b.f1560a.f1631h.a(jVar.h()))));
    }

    public final LayerDrawable c() {
        if (this.f21968o == null) {
            this.f21970q = new j(this.f21966m);
            this.f21968o = new RippleDrawable(this.f21964k, null, this.f21970q);
        }
        if (this.f21969p == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f21968o, this.f21958d, this.f21963j});
            this.f21969p = layerDrawable;
            layerDrawable.setId(2, R.id.mtrl_card_checked_layer_id);
        }
        return this.f21969p;
    }

    public final C2662b d(Drawable drawable) {
        int iCeil;
        int i;
        if (this.f21955a.getUseCompatPadding()) {
            int iCeil2 = (int) Math.ceil((r0.getMaxCardElevation() * 1.5f) + (i() ? a() : 0.0f));
            iCeil = (int) Math.ceil(r0.getMaxCardElevation() + (i() ? a() : 0.0f));
            i = iCeil2;
        } else {
            iCeil = 0;
            i = 0;
        }
        return new C2662b(drawable, iCeil, i, iCeil, i);
    }

    public final void e(int i, int i3) {
        int iCeil;
        int iCeil2;
        int i6;
        int i7;
        if (this.f21969p != null) {
            MaterialCardView materialCardView = this.f21955a;
            if (materialCardView.getUseCompatPadding()) {
                iCeil = (int) Math.ceil(((materialCardView.getMaxCardElevation() * 1.5f) + (i() ? a() : 0.0f)) * 2.0f);
                iCeil2 = (int) Math.ceil((materialCardView.getMaxCardElevation() + (i() ? a() : 0.0f)) * 2.0f);
            } else {
                iCeil = 0;
                iCeil2 = 0;
            }
            int i8 = this.f21961g;
            int i9 = (i8 & 8388613) == 8388613 ? ((i - this.f21959e) - this.f21960f) - iCeil2 : this.f21959e;
            int i10 = (i8 & 80) == 80 ? this.f21959e : ((i3 - this.f21959e) - this.f21960f) - iCeil;
            int i11 = (i8 & 8388613) == 8388613 ? this.f21959e : ((i - this.f21959e) - this.f21960f) - iCeil2;
            int i12 = (i8 & 80) == 80 ? ((i3 - this.f21959e) - this.f21960f) - iCeil : this.f21959e;
            if (materialCardView.getLayoutDirection() == 1) {
                i7 = i11;
                i6 = i9;
            } else {
                i6 = i11;
                i7 = i9;
            }
            this.f21969p.setLayerInset(2, i7, i12, i6, i10);
        }
    }

    public final void f(boolean z6, boolean z7) {
        Drawable drawable = this.f21963j;
        if (drawable != null) {
            if (!z7) {
                drawable.setAlpha(z6 ? 255 : 0);
                this.f21977x = z6 ? 1.0f : 0.0f;
                return;
            }
            float f2 = z6 ? 1.0f : 0.0f;
            float f5 = z6 ? 1.0f - this.f21977x : this.f21977x;
            ValueAnimator valueAnimator = this.f21973t;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f21973t = null;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f21977x, f2);
            this.f21973t = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new C0133b(8, this));
            this.f21973t.setInterpolator(this.f21974u);
            this.f21973t.setDuration((long) ((z6 ? this.f21975v : this.f21976w) * f5));
            this.f21973t.start();
        }
    }

    public final void g(Drawable drawable) {
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.f21963j = drawableMutate;
            drawableMutate.setTintList(this.f21965l);
            f(this.f21955a.f18210j, false);
        } else {
            this.f21963j = f21954z;
        }
        LayerDrawable layerDrawable = this.f21969p;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(R.id.mtrl_card_checked_layer_id, this.f21963j);
        }
    }

    public final void h(o oVar) {
        this.f21966m = oVar;
        j jVar = this.f21957c;
        jVar.setShapeAppearanceModel(oVar);
        jVar.f1589L = !jVar.n();
        j jVar2 = this.f21958d;
        if (jVar2 != null) {
            jVar2.setShapeAppearanceModel(oVar);
        }
        j jVar3 = this.f21970q;
        if (jVar3 != null) {
            jVar3.setShapeAppearanceModel(oVar);
        }
    }

    public final boolean i() {
        MaterialCardView materialCardView = this.f21955a;
        return materialCardView.getPreventCornerOverlap() && this.f21957c.n() && materialCardView.getUseCompatPadding();
    }

    public final boolean j() {
        View view = this.f21955a;
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
        Drawable drawableC = j() ? c() : this.f21958d;
        this.i = drawableC;
        if (drawable != drawableC) {
            MaterialCardView materialCardView = this.f21955a;
            if (materialCardView.getForeground() instanceof InsetDrawable) {
                ((InsetDrawable) materialCardView.getForeground()).setDrawable(drawableC);
            } else {
                materialCardView.setForeground(d(drawableC));
            }
        }
    }

    public final void l() {
        MaterialCardView materialCardView = this.f21955a;
        float cardViewRadius = 0.0f;
        float fA = ((!materialCardView.getPreventCornerOverlap() || this.f21957c.n()) && !i()) ? 0.0f : a();
        if (materialCardView.getPreventCornerOverlap() && materialCardView.getUseCompatPadding()) {
            cardViewRadius = (float) ((1.0d - f21953y) * materialCardView.getCardViewRadius());
        }
        int i = (int) (fA - cardViewRadius);
        Rect rect = this.f21956b;
        materialCardView.f23507c.set(rect.left + i, rect.top + i, rect.right + i, rect.bottom + i);
        C2351a c2351a = materialCardView.f23509e;
        if (!((AbstractC2899a) c2351a.f20442c).getUseCompatPadding()) {
            c2351a.R(0, 0, 0, 0);
            return;
        }
        C2900b c2900b = (C2900b) ((Drawable) c2351a.f20441b);
        float f2 = c2900b.f23514e;
        float f5 = c2900b.f23510a;
        int iCeil = (int) Math.ceil(AbstractC2901c.a(f2, f5, r1.getPreventCornerOverlap()));
        int iCeil2 = (int) Math.ceil(AbstractC2901c.b(f2, f5, r1.getPreventCornerOverlap()));
        c2351a.R(iCeil, iCeil2, iCeil, iCeil2);
    }

    public final void m() {
        boolean z6 = this.f21971r;
        MaterialCardView materialCardView = this.f21955a;
        if (!z6) {
            materialCardView.setBackgroundInternal(d(this.f21957c));
        }
        materialCardView.setForeground(d(this.i));
    }
}
