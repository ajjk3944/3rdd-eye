package q4;

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
import b5.k;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.a;
import g5.e;
import g5.j;
import j4.f;
import j4.l;
import p.c;
import p.d;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: y, reason: collision with root package name */
    public static final double f24019y = Math.cos(Math.toRadians(45.0d));

    /* renamed from: z, reason: collision with root package name */
    public static final Drawable f24020z;

    /* renamed from: a, reason: collision with root package name */
    public final MaterialCardView f24021a;

    /* renamed from: c, reason: collision with root package name */
    public final MaterialShapeDrawable f24023c;

    /* renamed from: d, reason: collision with root package name */
    public final MaterialShapeDrawable f24024d;

    /* renamed from: e, reason: collision with root package name */
    public int f24025e;

    /* renamed from: f, reason: collision with root package name */
    public int f24026f;

    /* renamed from: g, reason: collision with root package name */
    public int f24027g;

    /* renamed from: h, reason: collision with root package name */
    public int f24028h;

    /* renamed from: i, reason: collision with root package name */
    public Drawable f24029i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f24030j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f24031k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f24032l;

    /* renamed from: m, reason: collision with root package name */
    public com.google.android.material.shape.a f24033m;

    /* renamed from: n, reason: collision with root package name */
    public ColorStateList f24034n;

    /* renamed from: o, reason: collision with root package name */
    public Drawable f24035o;

    /* renamed from: p, reason: collision with root package name */
    public LayerDrawable f24036p;

    /* renamed from: q, reason: collision with root package name */
    public MaterialShapeDrawable f24037q;

    /* renamed from: s, reason: collision with root package name */
    public boolean f24039s;

    /* renamed from: t, reason: collision with root package name */
    public ValueAnimator f24040t;

    /* renamed from: u, reason: collision with root package name */
    public final TimeInterpolator f24041u;

    /* renamed from: v, reason: collision with root package name */
    public final int f24042v;

    /* renamed from: w, reason: collision with root package name */
    public final int f24043w;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f24022b = new Rect();

    /* renamed from: r, reason: collision with root package name */
    public boolean f24038r = false;

    /* renamed from: x, reason: collision with root package name */
    public float f24044x = 0.0f;

    public class a extends InsetDrawable {
        public a(Drawable drawable, int i10, int i11, int i12, int i13) {
            super(drawable, i10, i11, i12, i13);
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumHeight() {
            return -1;
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumWidth() {
            return -1;
        }

        @Override // android.graphics.drawable.InsetDrawable, android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
        public boolean getPadding(Rect rect) {
            return false;
        }
    }

    static {
        f24020z = Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null;
    }

    public b(MaterialCardView materialCardView, AttributeSet attributeSet, int i10, int i11) {
        this.f24021a = materialCardView;
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(materialCardView.getContext(), attributeSet, i10, i11);
        this.f24023c = materialShapeDrawable;
        materialShapeDrawable.W(materialCardView.getContext());
        materialShapeDrawable.p0(-12303292);
        a.b bVarW = materialShapeDrawable.K().w();
        TypedArray typedArrayObtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, d.CardView, i10, c.CardView);
        int i12 = d.CardView_cardCornerRadius;
        if (typedArrayObtainStyledAttributes.hasValue(i12)) {
            bVarW.o(typedArrayObtainStyledAttributes.getDimension(i12, 0.0f));
        }
        this.f24024d = new MaterialShapeDrawable();
        W(bVarW.m());
        this.f24041u = k.g(materialCardView.getContext(), j4.b.motionEasingLinearInterpolator, k4.a.f21834a);
        this.f24042v = k.f(materialCardView.getContext(), j4.b.motionDurationShort2, 300);
        this.f24043w = k.f(materialCardView.getContext(), j4.b.motionDurationShort1, 300);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static /* synthetic */ void a(b bVar, ValueAnimator valueAnimator) {
        bVar.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        bVar.f24030j.setAlpha((int) (255.0f * fFloatValue));
        bVar.f24044x = fFloatValue;
    }

    public Rect A() {
        return this.f24022b;
    }

    public final Drawable B(Drawable drawable) {
        int iCeil;
        int iCeil2;
        if (this.f24021a.getUseCompatPadding()) {
            iCeil2 = (int) Math.ceil(f());
            iCeil = (int) Math.ceil(e());
        } else {
            iCeil = 0;
            iCeil2 = 0;
        }
        return new a(drawable, iCeil, iCeil2, iCeil, iCeil2);
    }

    public boolean C() {
        return this.f24038r;
    }

    public boolean D() {
        return this.f24039s;
    }

    public final boolean E() {
        return (this.f24027g & 80) == 80;
    }

    public final boolean F() {
        return (this.f24027g & 8388613) == 8388613;
    }

    public void G(TypedArray typedArray) {
        ColorStateList colorStateListA = d5.c.a(this.f24021a.getContext(), typedArray, l.MaterialCardView_strokeColor);
        this.f24034n = colorStateListA;
        if (colorStateListA == null) {
            this.f24034n = ColorStateList.valueOf(-1);
        }
        this.f24028h = typedArray.getDimensionPixelSize(l.MaterialCardView_strokeWidth, 0);
        boolean z10 = typedArray.getBoolean(l.MaterialCardView_android_checkable, false);
        this.f24039s = z10;
        this.f24021a.setLongClickable(z10);
        this.f24032l = d5.c.a(this.f24021a.getContext(), typedArray, l.MaterialCardView_checkedIconTint);
        O(d5.c.d(this.f24021a.getContext(), typedArray, l.MaterialCardView_checkedIcon));
        R(typedArray.getDimensionPixelSize(l.MaterialCardView_checkedIconSize, 0));
        Q(typedArray.getDimensionPixelSize(l.MaterialCardView_checkedIconMargin, 0));
        this.f24027g = typedArray.getInteger(l.MaterialCardView_checkedIconGravity, 8388661);
        ColorStateList colorStateListA2 = d5.c.a(this.f24021a.getContext(), typedArray, l.MaterialCardView_rippleColor);
        this.f24031k = colorStateListA2;
        if (colorStateListA2 == null) {
            this.f24031k = ColorStateList.valueOf(u4.a.d(this.f24021a, c.a.colorControlHighlight));
        }
        K(d5.c.a(this.f24021a.getContext(), typedArray, l.MaterialCardView_cardForegroundColor));
        i0();
        f0();
        j0();
        this.f24021a.setBackgroundInternal(B(this.f24023c));
        Drawable drawableR = c0() ? r() : this.f24024d;
        this.f24029i = drawableR;
        this.f24021a.setForeground(B(drawableR));
    }

    public void H(int i10, int i11) {
        int iCeil;
        int iCeil2;
        int i12;
        int i13;
        if (this.f24036p != null) {
            if (this.f24021a.getUseCompatPadding()) {
                iCeil = (int) Math.ceil(f() * 2.0f);
                iCeil2 = (int) Math.ceil(e() * 2.0f);
            } else {
                iCeil = 0;
                iCeil2 = 0;
            }
            int i14 = F() ? ((i10 - this.f24025e) - this.f24026f) - iCeil2 : this.f24025e;
            int i15 = E() ? this.f24025e : ((i11 - this.f24025e) - this.f24026f) - iCeil;
            int i16 = F() ? this.f24025e : ((i10 - this.f24025e) - this.f24026f) - iCeil2;
            int i17 = E() ? ((i11 - this.f24025e) - this.f24026f) - iCeil : this.f24025e;
            if (this.f24021a.getLayoutDirection() == 1) {
                i13 = i16;
                i12 = i14;
            } else {
                i12 = i16;
                i13 = i14;
            }
            this.f24036p.setLayerInset(2, i13, i17, i12, i15);
        }
    }

    public void I(boolean z10) {
        this.f24038r = z10;
    }

    public void J(ColorStateList colorStateList) {
        this.f24023c.i0(colorStateList);
    }

    public void K(ColorStateList colorStateList) {
        MaterialShapeDrawable materialShapeDrawable = this.f24024d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        materialShapeDrawable.i0(colorStateList);
    }

    public void L(boolean z10) {
        this.f24039s = z10;
    }

    public void M(boolean z10) {
        N(z10, false);
    }

    public void N(boolean z10, boolean z11) {
        Drawable drawable = this.f24030j;
        if (drawable != null) {
            if (z11) {
                b(z10);
            } else {
                drawable.setAlpha(z10 ? 255 : 0);
                this.f24044x = z10 ? 1.0f : 0.0f;
            }
        }
    }

    public void O(Drawable drawable) {
        if (drawable != null) {
            Drawable drawableMutate = k0.a.r(drawable).mutate();
            this.f24030j = drawableMutate;
            drawableMutate.setTintList(this.f24032l);
            M(this.f24021a.isChecked());
        } else {
            this.f24030j = f24020z;
        }
        LayerDrawable layerDrawable = this.f24036p;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(f.mtrl_card_checked_layer_id, this.f24030j);
        }
    }

    public void P(int i10) {
        this.f24027g = i10;
        H(this.f24021a.getMeasuredWidth(), this.f24021a.getMeasuredHeight());
    }

    public void Q(int i10) {
        this.f24025e = i10;
    }

    public void R(int i10) {
        this.f24026f = i10;
    }

    public void S(ColorStateList colorStateList) {
        this.f24032l = colorStateList;
        Drawable drawable = this.f24030j;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
    }

    public void T(float f10) {
        W(this.f24033m.x(f10));
        this.f24029i.invalidateSelf();
        if (b0() || a0()) {
            e0();
        }
        if (b0()) {
            h0();
        }
    }

    public void U(float f10) {
        this.f24023c.j0(f10);
        MaterialShapeDrawable materialShapeDrawable = this.f24024d;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.j0(f10);
        }
        MaterialShapeDrawable materialShapeDrawable2 = this.f24037q;
        if (materialShapeDrawable2 != null) {
            materialShapeDrawable2.j0(f10);
        }
    }

    public void V(ColorStateList colorStateList) {
        this.f24031k = colorStateList;
        i0();
    }

    public void W(com.google.android.material.shape.a aVar) {
        this.f24033m = aVar;
        this.f24023c.setShapeAppearanceModel(aVar);
        this.f24023c.o0(!r0.Z());
        MaterialShapeDrawable materialShapeDrawable = this.f24024d;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setShapeAppearanceModel(aVar);
        }
        MaterialShapeDrawable materialShapeDrawable2 = this.f24037q;
        if (materialShapeDrawable2 != null) {
            materialShapeDrawable2.setShapeAppearanceModel(aVar);
        }
    }

    public void X(ColorStateList colorStateList) {
        if (this.f24034n == colorStateList) {
            return;
        }
        this.f24034n = colorStateList;
        j0();
    }

    public void Y(int i10) {
        if (i10 == this.f24028h) {
            return;
        }
        this.f24028h = i10;
        j0();
    }

    public void Z(int i10, int i11, int i12, int i13) {
        this.f24022b.set(i10, i11, i12, i13);
        e0();
    }

    public final boolean a0() {
        return this.f24021a.getPreventCornerOverlap() && !g();
    }

    public void b(boolean z10) {
        float f10 = z10 ? 1.0f : 0.0f;
        float f11 = z10 ? 1.0f - this.f24044x : this.f24044x;
        ValueAnimator valueAnimator = this.f24040t;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f24040t = null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f24044x, f10);
        this.f24040t = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: q4.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                b.a(this.f24018a, valueAnimator2);
            }
        });
        this.f24040t.setInterpolator(this.f24041u);
        this.f24040t.setDuration((long) ((z10 ? this.f24042v : this.f24043w) * f11));
        this.f24040t.start();
    }

    public final boolean b0() {
        return this.f24021a.getPreventCornerOverlap() && g() && this.f24021a.getUseCompatPadding();
    }

    public final float c() {
        return Math.max(Math.max(d(this.f24033m.q(), this.f24023c.P()), d(this.f24033m.s(), this.f24023c.Q())), Math.max(d(this.f24033m.k(), this.f24023c.y()), d(this.f24033m.i(), this.f24023c.x())));
    }

    public final boolean c0() {
        if (this.f24021a.isClickable()) {
            return true;
        }
        View view = this.f24021a;
        while (view.isDuplicateParentStateEnabled() && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        return view.isClickable();
    }

    public final float d(e eVar, float f10) {
        if (eVar instanceof j) {
            return (float) ((1.0d - f24019y) * f10);
        }
        if (eVar instanceof g5.f) {
            return f10 / 2.0f;
        }
        return 0.0f;
    }

    public void d0() {
        Drawable drawable = this.f24029i;
        Drawable drawableR = c0() ? r() : this.f24024d;
        this.f24029i = drawableR;
        if (drawable != drawableR) {
            g0(drawableR);
        }
    }

    public final float e() {
        return this.f24021a.getMaxCardElevation() + (b0() ? c() : 0.0f);
    }

    public void e0() {
        int iC = (int) (((a0() || b0()) ? c() : 0.0f) - t());
        MaterialCardView materialCardView = this.f24021a;
        Rect rect = this.f24022b;
        materialCardView.k(rect.left + iC, rect.top + iC, rect.right + iC, rect.bottom + iC);
    }

    public final float f() {
        return (this.f24021a.getMaxCardElevation() * 1.5f) + (b0() ? c() : 0.0f);
    }

    public void f0() {
        this.f24023c.h0(this.f24021a.getCardElevation());
    }

    public final boolean g() {
        return this.f24023c.Z();
    }

    public final void g0(Drawable drawable) {
        if (this.f24021a.getForeground() instanceof InsetDrawable) {
            ((InsetDrawable) this.f24021a.getForeground()).setDrawable(drawable);
        } else {
            this.f24021a.setForeground(B(drawable));
        }
    }

    public final Drawable h() {
        this.f24037q = new MaterialShapeDrawable(this.f24033m);
        return new RippleDrawable(this.f24031k, null, this.f24037q);
    }

    public void h0() {
        if (!C()) {
            this.f24021a.setBackgroundInternal(B(this.f24023c));
        }
        this.f24021a.setForeground(B(this.f24029i));
    }

    public void i() {
        Drawable drawable = this.f24035o;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int i10 = bounds.bottom;
            this.f24035o.setBounds(bounds.left, bounds.top, bounds.right, i10 - 1);
            this.f24035o.setBounds(bounds.left, bounds.top, bounds.right, i10);
        }
    }

    public final void i0() {
        Drawable drawable = this.f24035o;
        if (drawable != null) {
            ((RippleDrawable) drawable).setColor(this.f24031k);
        }
    }

    public MaterialShapeDrawable j() {
        return this.f24023c;
    }

    public void j0() {
        this.f24024d.t0(this.f24028h, this.f24034n);
    }

    public ColorStateList k() {
        return this.f24023c.D();
    }

    public ColorStateList l() {
        return this.f24024d.D();
    }

    public Drawable m() {
        return this.f24030j;
    }

    public int n() {
        return this.f24027g;
    }

    public int o() {
        return this.f24025e;
    }

    public int p() {
        return this.f24026f;
    }

    public ColorStateList q() {
        return this.f24032l;
    }

    public final Drawable r() {
        if (this.f24035o == null) {
            this.f24035o = h();
        }
        if (this.f24036p == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f24035o, this.f24024d, this.f24030j});
            this.f24036p = layerDrawable;
            layerDrawable.setId(2, f.mtrl_card_checked_layer_id);
        }
        return this.f24036p;
    }

    public float s() {
        return this.f24023c.P();
    }

    public final float t() {
        if (this.f24021a.getPreventCornerOverlap() && this.f24021a.getUseCompatPadding()) {
            return (float) ((1.0d - f24019y) * this.f24021a.getCardViewRadius());
        }
        return 0.0f;
    }

    public float u() {
        return this.f24023c.E();
    }

    public ColorStateList v() {
        return this.f24031k;
    }

    public com.google.android.material.shape.a w() {
        return this.f24033m;
    }

    public int x() {
        ColorStateList colorStateList = this.f24034n;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    public ColorStateList y() {
        return this.f24034n;
    }

    public int z() {
        return this.f24028h;
    }
}
