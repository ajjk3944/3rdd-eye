package p3;

import G3.C0154h;
import G3.j;
import G3.n;
import G3.o;
import G3.q;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.material.chip.Chip;
import e3.e;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import x3.AbstractC2993B;
import x3.x;
import x3.y;

/* loaded from: classes.dex */
public final class d extends j implements Drawable.Callback, x {

    /* renamed from: d1, reason: collision with root package name */
    public static final int[] f22816d1 = {R.attr.state_enabled};

    /* renamed from: e1, reason: collision with root package name */
    public static final ShapeDrawable f22817e1 = new ShapeDrawable(new OvalShape());

    /* renamed from: A0, reason: collision with root package name */
    public float f22818A0;

    /* renamed from: B0, reason: collision with root package name */
    public float f22819B0;

    /* renamed from: C0, reason: collision with root package name */
    public final Context f22820C0;

    /* renamed from: D0, reason: collision with root package name */
    public final Paint f22821D0;

    /* renamed from: E0, reason: collision with root package name */
    public final Paint.FontMetrics f22822E0;

    /* renamed from: F0, reason: collision with root package name */
    public final RectF f22823F0;

    /* renamed from: G0, reason: collision with root package name */
    public final PointF f22824G0;

    /* renamed from: H0, reason: collision with root package name */
    public final Path f22825H0;

    /* renamed from: I0, reason: collision with root package name */
    public final y f22826I0;

    /* renamed from: J0, reason: collision with root package name */
    public int f22827J0;

    /* renamed from: K0, reason: collision with root package name */
    public int f22828K0;

    /* renamed from: L0, reason: collision with root package name */
    public int f22829L0;

    /* renamed from: M0, reason: collision with root package name */
    public int f22830M0;

    /* renamed from: N0, reason: collision with root package name */
    public int f22831N0;

    /* renamed from: O0, reason: collision with root package name */
    public int f22832O0;

    /* renamed from: P0, reason: collision with root package name */
    public boolean f22833P0;

    /* renamed from: Q0, reason: collision with root package name */
    public int f22834Q0;

    /* renamed from: R0, reason: collision with root package name */
    public int f22835R0;

    /* renamed from: S0, reason: collision with root package name */
    public ColorFilter f22836S0;

    /* renamed from: T0, reason: collision with root package name */
    public PorterDuffColorFilter f22837T0;

    /* renamed from: U0, reason: collision with root package name */
    public ColorStateList f22838U0;

    /* renamed from: V, reason: collision with root package name */
    public ColorStateList f22839V;

    /* renamed from: V0, reason: collision with root package name */
    public PorterDuff.Mode f22840V0;

    /* renamed from: W, reason: collision with root package name */
    public ColorStateList f22841W;

    /* renamed from: W0, reason: collision with root package name */
    public int[] f22842W0;

    /* renamed from: X, reason: collision with root package name */
    public float f22843X;

    /* renamed from: X0, reason: collision with root package name */
    public ColorStateList f22844X0;

    /* renamed from: Y, reason: collision with root package name */
    public float f22845Y;

    /* renamed from: Y0, reason: collision with root package name */
    public WeakReference f22846Y0;

    /* renamed from: Z, reason: collision with root package name */
    public ColorStateList f22847Z;

    /* renamed from: Z0, reason: collision with root package name */
    public TextUtils.TruncateAt f22848Z0;

    /* renamed from: a0, reason: collision with root package name */
    public float f22849a0;

    /* renamed from: a1, reason: collision with root package name */
    public boolean f22850a1;
    public ColorStateList b0;

    /* renamed from: b1, reason: collision with root package name */
    public int f22851b1;

    /* renamed from: c0, reason: collision with root package name */
    public CharSequence f22852c0;

    /* renamed from: c1, reason: collision with root package name */
    public boolean f22853c1;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f22854d0;

    /* renamed from: e0, reason: collision with root package name */
    public Drawable f22855e0;

    /* renamed from: f0, reason: collision with root package name */
    public ColorStateList f22856f0;

    /* renamed from: g0, reason: collision with root package name */
    public float f22857g0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f22858h0;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f22859i0;

    /* renamed from: j0, reason: collision with root package name */
    public Drawable f22860j0;

    /* renamed from: k0, reason: collision with root package name */
    public RippleDrawable f22861k0;

    /* renamed from: l0, reason: collision with root package name */
    public ColorStateList f22862l0;

    /* renamed from: m0, reason: collision with root package name */
    public float f22863m0;

    /* renamed from: n0, reason: collision with root package name */
    public SpannableStringBuilder f22864n0;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f22865o0;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f22866p0;

    /* renamed from: q0, reason: collision with root package name */
    public Drawable f22867q0;

    /* renamed from: r0, reason: collision with root package name */
    public ColorStateList f22868r0;

    /* renamed from: s0, reason: collision with root package name */
    public e f22869s0;

    /* renamed from: t0, reason: collision with root package name */
    public e f22870t0;

    /* renamed from: u0, reason: collision with root package name */
    public float f22871u0;
    public float v0;

    /* renamed from: w0, reason: collision with root package name */
    public float f22872w0;

    /* renamed from: x0, reason: collision with root package name */
    public float f22873x0;

    /* renamed from: y0, reason: collision with root package name */
    public float f22874y0;

    /* renamed from: z0, reason: collision with root package name */
    public float f22875z0;

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.apm.insight.R.attr.chipStyle, com.apm.insight.R.style.Widget_MaterialComponents_Chip_Action);
        this.f22845Y = -1.0f;
        this.f22821D0 = new Paint(1);
        this.f22822E0 = new Paint.FontMetrics();
        this.f22823F0 = new RectF();
        this.f22824G0 = new PointF();
        this.f22825H0 = new Path();
        this.f22835R0 = 255;
        this.f22840V0 = PorterDuff.Mode.SRC_IN;
        this.f22846Y0 = new WeakReference(null);
        m(context);
        this.f22820C0 = context;
        y yVar = new y(this);
        this.f22826I0 = yVar;
        this.f22852c0 = "";
        yVar.f24176a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f22816d1;
        setState(iArr);
        Y(iArr);
        this.f22850a1 = true;
        f22817e1.setTint(-1);
    }

    public static boolean F(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean G(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public static void h0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public final void A(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        drawable.setLayoutDirection(getLayoutDirection());
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f22860j0) {
            if (drawable.isStateful()) {
                drawable.setState(this.f22842W0);
            }
            drawable.setTintList(this.f22862l0);
            return;
        }
        Drawable drawable2 = this.f22855e0;
        if (drawable == drawable2 && this.f22858h0) {
            drawable2.setTintList(this.f22856f0);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public final void B(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (f0() || e0()) {
            float f2 = this.f22871u0 + this.v0;
            Drawable drawable = this.f22833P0 ? this.f22867q0 : this.f22855e0;
            float intrinsicWidth = this.f22857g0;
            if (intrinsicWidth <= 0.0f && drawable != null) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
            if (getLayoutDirection() == 0) {
                float f5 = rect.left + f2;
                rectF.left = f5;
                rectF.right = f5 + intrinsicWidth;
            } else {
                float f6 = rect.right - f2;
                rectF.right = f6;
                rectF.left = f6 - intrinsicWidth;
            }
            Drawable drawable2 = this.f22833P0 ? this.f22867q0 : this.f22855e0;
            float fCeil = this.f22857g0;
            if (fCeil <= 0.0f && drawable2 != null) {
                fCeil = (float) Math.ceil(AbstractC2993B.e(this.f22820C0, 24));
                if (drawable2.getIntrinsicHeight() <= fCeil) {
                    fCeil = drawable2.getIntrinsicHeight();
                }
            }
            float fExactCenterY = rect.exactCenterY() - (fCeil / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fCeil;
        }
    }

    public final float C() {
        if (!f0() && !e0()) {
            return 0.0f;
        }
        float f2 = this.v0;
        Drawable drawable = this.f22833P0 ? this.f22867q0 : this.f22855e0;
        float intrinsicWidth = this.f22857g0;
        if (intrinsicWidth <= 0.0f && drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        return intrinsicWidth + f2 + this.f22872w0;
    }

    public final float D() {
        if (g0()) {
            return this.f22875z0 + this.f22863m0 + this.f22818A0;
        }
        return 0.0f;
    }

    public final float E() {
        return this.f22853c1 ? k() : this.f22845Y;
    }

    public final void H() {
        c cVar = (c) this.f22846Y0.get();
        if (cVar != null) {
            Chip chip = (Chip) cVar;
            chip.c(chip.f18240D);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean I(int[] r10, int[] r11) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p3.d.I(int[], int[]):boolean");
    }

    public final void J(boolean z6) {
        if (this.f22865o0 != z6) {
            this.f22865o0 = z6;
            float fC = C();
            if (!z6 && this.f22833P0) {
                this.f22833P0 = false;
            }
            float fC2 = C();
            invalidateSelf();
            if (fC != fC2) {
                H();
            }
        }
    }

    public final void K(Drawable drawable) {
        if (this.f22867q0 != drawable) {
            float fC = C();
            this.f22867q0 = drawable;
            float fC2 = C();
            h0(this.f22867q0);
            A(this.f22867q0);
            invalidateSelf();
            if (fC != fC2) {
                H();
            }
        }
    }

    public final void L(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f22868r0 != colorStateList) {
            this.f22868r0 = colorStateList;
            if (this.f22866p0 && (drawable = this.f22867q0) != null && this.f22865o0) {
                drawable.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void M(boolean z6) {
        if (this.f22866p0 != z6) {
            boolean zE0 = e0();
            this.f22866p0 = z6;
            boolean zE02 = e0();
            if (zE0 != zE02) {
                if (zE02) {
                    A(this.f22867q0);
                } else {
                    h0(this.f22867q0);
                }
                invalidateSelf();
                H();
            }
        }
    }

    public final void N(float f2) {
        if (this.f22845Y != f2) {
            this.f22845Y = f2;
            n nVarG = this.f1597b.f1560a.g();
            nVarG.c(f2);
            setShapeAppearanceModel(nVarG.a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void O(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f22855e0;
        if (drawable3 != 0) {
            boolean z6 = drawable3 instanceof K.c;
            drawable2 = drawable3;
            if (z6) {
                drawable2 = null;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float fC = C();
            this.f22855e0 = drawable != null ? drawable.mutate() : null;
            float fC2 = C();
            h0(drawable2);
            if (f0()) {
                A(this.f22855e0);
            }
            invalidateSelf();
            if (fC != fC2) {
                H();
            }
        }
    }

    public final void P(float f2) {
        if (this.f22857g0 != f2) {
            float fC = C();
            this.f22857g0 = f2;
            float fC2 = C();
            invalidateSelf();
            if (fC != fC2) {
                H();
            }
        }
    }

    public final void Q(ColorStateList colorStateList) {
        this.f22858h0 = true;
        if (this.f22856f0 != colorStateList) {
            this.f22856f0 = colorStateList;
            if (f0()) {
                this.f22855e0.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void R(boolean z6) {
        if (this.f22854d0 != z6) {
            boolean zF0 = f0();
            this.f22854d0 = z6;
            boolean zF02 = f0();
            if (zF0 != zF02) {
                if (zF02) {
                    A(this.f22855e0);
                } else {
                    h0(this.f22855e0);
                }
                invalidateSelf();
                H();
            }
        }
    }

    public final void S(ColorStateList colorStateList) {
        if (this.f22847Z != colorStateList) {
            this.f22847Z = colorStateList;
            if (this.f22853c1) {
                v(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void T(float f2) {
        if (this.f22849a0 != f2) {
            this.f22849a0 = f2;
            this.f22821D0.setStrokeWidth(f2);
            if (this.f22853c1) {
                this.f1597b.f1569k = f2;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void U(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f22860j0;
        if (drawable3 != 0) {
            boolean z6 = drawable3 instanceof K.c;
            drawable2 = drawable3;
            if (z6) {
                drawable2 = null;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float fD = D();
            this.f22860j0 = drawable != null ? drawable.mutate() : null;
            this.f22861k0 = new RippleDrawable(E3.a.c(this.b0), this.f22860j0, f22817e1);
            float fD2 = D();
            h0(drawable2);
            if (g0()) {
                A(this.f22860j0);
            }
            invalidateSelf();
            if (fD != fD2) {
                H();
            }
        }
    }

    public final void V(float f2) {
        if (this.f22818A0 != f2) {
            this.f22818A0 = f2;
            invalidateSelf();
            if (g0()) {
                H();
            }
        }
    }

    public final void W(float f2) {
        if (this.f22863m0 != f2) {
            this.f22863m0 = f2;
            invalidateSelf();
            if (g0()) {
                H();
            }
        }
    }

    public final void X(float f2) {
        if (this.f22875z0 != f2) {
            this.f22875z0 = f2;
            invalidateSelf();
            if (g0()) {
                H();
            }
        }
    }

    public final boolean Y(int[] iArr) {
        if (Arrays.equals(this.f22842W0, iArr)) {
            return false;
        }
        this.f22842W0 = iArr;
        if (g0()) {
            return I(getState(), iArr);
        }
        return false;
    }

    public final void Z(ColorStateList colorStateList) {
        if (this.f22862l0 != colorStateList) {
            this.f22862l0 = colorStateList;
            if (g0()) {
                this.f22860j0.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    @Override // G3.j, x3.x
    public final void a() {
        H();
        invalidateSelf();
    }

    public final void a0(boolean z6) {
        if (this.f22859i0 != z6) {
            boolean zG0 = g0();
            this.f22859i0 = z6;
            boolean zG02 = g0();
            if (zG0 != zG02) {
                if (zG02) {
                    A(this.f22860j0);
                } else {
                    h0(this.f22860j0);
                }
                invalidateSelf();
                H();
            }
        }
    }

    public final void b0(float f2) {
        if (this.f22872w0 != f2) {
            float fC = C();
            this.f22872w0 = f2;
            float fC2 = C();
            invalidateSelf();
            if (fC != fC2) {
                H();
            }
        }
    }

    public final void c0(float f2) {
        if (this.v0 != f2) {
            float fC = C();
            this.v0 = f2;
            float fC2 = C();
            invalidateSelf();
            if (fC != fC2) {
                H();
            }
        }
    }

    public final void d0(ColorStateList colorStateList) {
        if (this.b0 != colorStateList) {
            this.b0 = colorStateList;
            this.f22844X0 = null;
            onStateChange(getState());
        }
    }

    @Override // G3.j, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        Canvas canvas2;
        int iSaveLayerAlpha;
        float f2;
        int i3;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.f22835R0) == 0) {
            return;
        }
        if (i < 255) {
            canvas2 = canvas;
            iSaveLayerAlpha = canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i);
        } else {
            canvas2 = canvas;
            iSaveLayerAlpha = 0;
        }
        boolean z6 = this.f22853c1;
        Paint paint = this.f22821D0;
        RectF rectF = this.f22823F0;
        if (!z6) {
            paint.setColor(this.f22827J0);
            paint.setStyle(Paint.Style.FILL);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, E(), E(), paint);
        }
        if (!this.f22853c1) {
            paint.setColor(this.f22828K0);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.f22836S0;
            if (colorFilter == null) {
                colorFilter = this.f22837T0;
            }
            paint.setColorFilter(colorFilter);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, E(), E(), paint);
        }
        if (this.f22853c1) {
            super.draw(canvas);
        }
        if (this.f22849a0 > 0.0f && !this.f22853c1) {
            paint.setColor(this.f22830M0);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.f22853c1) {
                ColorFilter colorFilter2 = this.f22836S0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.f22837T0;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f5 = bounds.left;
            float f6 = this.f22849a0 / 2.0f;
            rectF.set(f5 + f6, bounds.top + f6, bounds.right - f6, bounds.bottom - f6);
            float f7 = this.f22845Y - (this.f22849a0 / 2.0f);
            canvas2.drawRoundRect(rectF, f7, f7, paint);
        }
        paint.setColor(this.f22831N0);
        paint.setStyle(Paint.Style.FILL);
        rectF.set(bounds);
        if (this.f22853c1) {
            RectF rectF2 = new RectF(bounds);
            C0154h c0154h = this.f1597b;
            o oVar = c0154h.f1560a;
            float[] fArr = this.f1593Q;
            float f8 = c0154h.f1568j;
            U0.j jVar = this.f1583F;
            q qVar = this.f1584G;
            f2 = 2.0f;
            Path path = this.f22825H0;
            qVar.a(oVar, fArr, f8, rectF2, jVar, path);
            f(canvas2, paint, path, this.f1597b.f1560a, this.f1593Q, h());
        } else {
            canvas2.drawRoundRect(rectF, E(), E(), paint);
            f2 = 2.0f;
        }
        if (f0()) {
            B(bounds, rectF);
            float f9 = rectF.left;
            float f10 = rectF.top;
            canvas2.translate(f9, f10);
            this.f22855e0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f22855e0.draw(canvas2);
            canvas2.translate(-f9, -f10);
        }
        if (e0()) {
            B(bounds, rectF);
            float f11 = rectF.left;
            float f12 = rectF.top;
            canvas2.translate(f11, f12);
            this.f22867q0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f22867q0.draw(canvas2);
            canvas2.translate(-f11, -f12);
        }
        if (this.f22850a1 && this.f22852c0 != null) {
            PointF pointF = this.f22824G0;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.f22852c0;
            y yVar = this.f22826I0;
            if (charSequence != null) {
                float fC = C() + this.f22871u0 + this.f22873x0;
                if (getLayoutDirection() == 0) {
                    pointF.x = bounds.left + fC;
                } else {
                    pointF.x = bounds.right - fC;
                    align = Paint.Align.RIGHT;
                }
                float fCenterY = bounds.centerY();
                TextPaint textPaint = yVar.f24176a;
                Paint.FontMetrics fontMetrics = this.f22822E0;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / f2);
            }
            rectF.setEmpty();
            if (this.f22852c0 != null) {
                float fC2 = C() + this.f22871u0 + this.f22873x0;
                float fD = D() + this.f22819B0 + this.f22874y0;
                if (getLayoutDirection() == 0) {
                    rectF.left = bounds.left + fC2;
                    rectF.right = bounds.right - fD;
                } else {
                    rectF.left = bounds.left + fD;
                    rectF.right = bounds.right - fC2;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
            D3.e eVar = yVar.f24182g;
            TextPaint textPaint2 = yVar.f24176a;
            if (eVar != null) {
                textPaint2.drawableState = getState();
                yVar.f24182g.d(this.f22820C0, textPaint2, yVar.f24177b);
            }
            textPaint2.setTextAlign(align);
            boolean z7 = Math.round(yVar.a(this.f22852c0.toString())) > Math.round(rectF.width());
            if (z7) {
                int iSave = canvas2.save();
                canvas2.clipRect(rectF);
                i3 = iSave;
            } else {
                i3 = 0;
            }
            CharSequence charSequenceEllipsize = this.f22852c0;
            if (z7 && this.f22848Z0 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint2, rectF.width(), this.f22848Z0);
            }
            canvas.drawText(charSequenceEllipsize, 0, charSequenceEllipsize.length(), pointF.x, pointF.y, textPaint2);
            canvas2 = canvas;
            if (z7) {
                canvas2.restoreToCount(i3);
            }
        }
        if (g0()) {
            rectF.setEmpty();
            if (g0()) {
                float f13 = this.f22819B0 + this.f22818A0;
                if (getLayoutDirection() == 0) {
                    float f14 = bounds.right - f13;
                    rectF.right = f14;
                    rectF.left = f14 - this.f22863m0;
                } else {
                    float f15 = bounds.left + f13;
                    rectF.left = f15;
                    rectF.right = f15 + this.f22863m0;
                }
                float fExactCenterY = bounds.exactCenterY();
                float f16 = this.f22863m0;
                float f17 = fExactCenterY - (f16 / f2);
                rectF.top = f17;
                rectF.bottom = f17 + f16;
            }
            float f18 = rectF.left;
            float f19 = rectF.top;
            canvas2.translate(f18, f19);
            this.f22860j0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f22861k0.setBounds(this.f22860j0.getBounds());
            this.f22861k0.jumpToCurrentState();
            this.f22861k0.draw(canvas2);
            canvas2.translate(-f18, -f19);
        }
        if (this.f22835R0 < 255) {
            canvas2.restoreToCount(iSaveLayerAlpha);
        }
    }

    public final boolean e0() {
        return this.f22866p0 && this.f22867q0 != null && this.f22833P0;
    }

    public final boolean f0() {
        return this.f22854d0 && this.f22855e0 != null;
    }

    public final boolean g0() {
        return this.f22859i0 && this.f22860j0 != null;
    }

    @Override // G3.j, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f22835R0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f22836S0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f22843X;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(D() + this.f22826I0.a(this.f22852c0.toString()) + C() + this.f22871u0 + this.f22873x0 + this.f22874y0 + this.f22819B0), this.f22851b1);
    }

    @Override // G3.j, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // G3.j, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Outline outline2;
        if (this.f22853c1) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f22843X, this.f22845Y);
        } else {
            outline.setRoundRect(bounds, this.f22845Y);
            outline2 = outline;
        }
        outline2.setAlpha(this.f22835R0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // G3.j, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (F(this.f22839V) || F(this.f22841W) || F(this.f22847Z)) {
            return true;
        }
        D3.e eVar = this.f22826I0.f24182g;
        if (eVar == null || (colorStateList = eVar.f1276k) == null || !colorStateList.isStateful()) {
            return (this.f22866p0 && this.f22867q0 != null && this.f22865o0) || G(this.f22855e0) || G(this.f22867q0) || F(this.f22838U0);
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (f0()) {
            zOnLayoutDirectionChanged |= this.f22855e0.setLayoutDirection(i);
        }
        if (e0()) {
            zOnLayoutDirectionChanged |= this.f22867q0.setLayoutDirection(i);
        }
        if (g0()) {
            zOnLayoutDirectionChanged |= this.f22860j0.setLayoutDirection(i);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean zOnLevelChange = super.onLevelChange(i);
        if (f0()) {
            zOnLevelChange |= this.f22855e0.setLevel(i);
        }
        if (e0()) {
            zOnLevelChange |= this.f22867q0.setLevel(i);
        }
        if (g0()) {
            zOnLevelChange |= this.f22860j0.setLevel(i);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // G3.j, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.f22853c1) {
            super.onStateChange(iArr);
        }
        return I(iArr, this.f22842W0);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j6) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j6);
        }
    }

    @Override // G3.j, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f22835R0 != i) {
            this.f22835R0 = i;
            invalidateSelf();
        }
    }

    @Override // G3.j, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f22836S0 != colorFilter) {
            this.f22836S0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // G3.j, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.f22838U0 != colorStateList) {
            this.f22838U0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // G3.j, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.f22840V0 != mode) {
            this.f22840V0 = mode;
            ColorStateList colorStateList = this.f22838U0;
            this.f22837T0 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z6, boolean z7) {
        boolean visible = super.setVisible(z6, z7);
        if (f0()) {
            visible |= this.f22855e0.setVisible(z6, z7);
        }
        if (e0()) {
            visible |= this.f22867q0.setVisible(z6, z7);
        }
        if (g0()) {
            visible |= this.f22860j0.setVisible(z6, z7);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }
}
