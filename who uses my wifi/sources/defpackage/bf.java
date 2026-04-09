package defpackage;

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
import android.util.TypedValue;
import com.google.android.material.chip.Chip;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class bf extends nc0 implements Drawable.Callback, x01 {
    public static final int[] U0 = {R.attr.state_enabled};
    public static final ShapeDrawable V0 = new ShapeDrawable(new OvalShape());
    public int A0;
    public int B0;
    public int C0;
    public int D0;
    public int E0;
    public int F0;
    public boolean G0;
    public int H0;
    public int I0;
    public ColorFilter J0;
    public PorterDuffColorFilter K0;
    public ColorStateList L0;
    public ColorStateList M;
    public PorterDuff.Mode M0;
    public ColorStateList N;
    public int[] N0;
    public float O;
    public ColorStateList O0;
    public float P;
    public WeakReference P0;
    public ColorStateList Q;
    public TextUtils.TruncateAt Q0;
    public float R;
    public boolean R0;
    public ColorStateList S;
    public int S0;
    public CharSequence T;
    public boolean T0;
    public boolean U;
    public Drawable V;
    public ColorStateList W;
    public float X;
    public boolean Y;
    public boolean Z;
    public Drawable a0;
    public RippleDrawable b0;
    public ColorStateList c0;
    public float d0;
    public SpannableStringBuilder e0;
    public boolean f0;
    public boolean g0;
    public Drawable h0;
    public ColorStateList i0;
    public ze0 j0;
    public ze0 k0;
    public float l0;
    public float m0;
    public float n0;
    public float o0;
    public float p0;
    public float q0;
    public float r0;
    public float s0;
    public final Context t0;
    public final Paint u0;
    public final Paint.FontMetrics v0;
    public final RectF w0;
    public final PointF x0;
    public final Path y0;
    public final al0 z0;

    public bf(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.phuongpn.whousemywifi.networkscanner.R.attr.chipStyle, com.phuongpn.whousemywifi.networkscanner.R.style.Widget_MaterialComponents_Chip_Action);
        this.P = -1.0f;
        this.u0 = new Paint(1);
        this.v0 = new Paint.FontMetrics();
        this.w0 = new RectF();
        this.x0 = new PointF();
        this.y0 = new Path();
        this.I0 = 255;
        this.M0 = PorterDuff.Mode.SRC_IN;
        this.P0 = new WeakReference(null);
        m(context);
        this.t0 = context;
        al0 al0Var = new al0(this);
        this.z0 = al0Var;
        this.T = "";
        ((TextPaint) al0Var.d).density = context.getResources().getDisplayMetrics().density;
        int[] iArr = U0;
        setState(iArr);
        Y(iArr);
        this.R0 = true;
        V0.setTint(-1);
    }

    public static boolean F(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean G(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public static void i0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public final void A(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        tp.b(drawable, tp.a(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.a0) {
            if (drawable.isStateful()) {
                drawable.setState(this.N0);
            }
            drawable.setTintList(this.c0);
            return;
        }
        Drawable drawable2 = this.V;
        if (drawable == drawable2 && this.Y) {
            drawable2.setTintList(this.W);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public final void B(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (g0() || f0()) {
            float f = this.l0 + this.m0;
            Drawable drawable = this.G0 ? this.h0 : this.V;
            float intrinsicWidth = this.X;
            if (intrinsicWidth <= 0.0f && drawable != null) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
            if (tp.a(this) == 0) {
                float f2 = rect.left + f;
                rectF.left = f2;
                rectF.right = f2 + intrinsicWidth;
            } else {
                float f3 = rect.right - f;
                rectF.right = f3;
                rectF.left = f3 - intrinsicWidth;
            }
            Drawable drawable2 = this.G0 ? this.h0 : this.V;
            float fCeil = this.X;
            if (fCeil <= 0.0f && drawable2 != null) {
                fCeil = (float) Math.ceil(TypedValue.applyDimension(1, 24, this.t0.getResources().getDisplayMetrics()));
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
        if (!g0() && !f0()) {
            return 0.0f;
        }
        float f = this.m0;
        Drawable drawable = this.G0 ? this.h0 : this.V;
        float intrinsicWidth = this.X;
        if (intrinsicWidth <= 0.0f && drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        return intrinsicWidth + f + this.n0;
    }

    public final float D() {
        if (h0()) {
            return this.q0 + this.d0 + this.r0;
        }
        return 0.0f;
    }

    public final float E() {
        return this.T0 ? k() : this.P;
    }

    public final void H() {
        af afVar = (af) this.P0.get();
        if (afVar != null) {
            Chip chip = (Chip) afVar;
            chip.b(chip.u);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean I(int[] r10, int[] r11) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bf.I(int[], int[]):boolean");
    }

    public final void J(boolean z) {
        if (this.f0 != z) {
            this.f0 = z;
            float fC = C();
            if (!z && this.G0) {
                this.G0 = false;
            }
            float fC2 = C();
            invalidateSelf();
            if (fC != fC2) {
                H();
            }
        }
    }

    public final void K(Drawable drawable) {
        if (this.h0 != drawable) {
            float fC = C();
            this.h0 = drawable;
            float fC2 = C();
            i0(this.h0);
            A(this.h0);
            invalidateSelf();
            if (fC != fC2) {
                H();
            }
        }
    }

    public final void L(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.i0 != colorStateList) {
            this.i0 = colorStateList;
            if (this.g0 && (drawable = this.h0) != null && this.f0) {
                drawable.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void M(boolean z) {
        if (this.g0 != z) {
            boolean zF0 = f0();
            this.g0 = z;
            boolean zF02 = f0();
            if (zF0 != zF02) {
                if (zF02) {
                    A(this.h0);
                } else {
                    i0(this.h0);
                }
                invalidateSelf();
                H();
            }
        }
    }

    public final void N(float f) {
        if (this.P != f) {
            this.P = f;
            f2 f2VarF = this.g.a.f();
            f2VarF.e = new l(f);
            f2VarF.f = new l(f);
            f2VarF.g = new l(f);
            f2VarF.h = new l(f);
            setShapeAppearanceModel(f2VarF.a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void O(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.V;
        if (drawable3 != 0) {
            boolean z = drawable3 instanceof xa1;
            drawable2 = drawable3;
            if (z) {
                drawable2 = null;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float fC = C();
            this.V = drawable != null ? drawable.mutate() : null;
            float fC2 = C();
            i0(drawable2);
            if (g0()) {
                A(this.V);
            }
            invalidateSelf();
            if (fC != fC2) {
                H();
            }
        }
    }

    public final void P(float f) {
        if (this.X != f) {
            float fC = C();
            this.X = f;
            float fC2 = C();
            invalidateSelf();
            if (fC != fC2) {
                H();
            }
        }
    }

    public final void Q(ColorStateList colorStateList) {
        this.Y = true;
        if (this.W != colorStateList) {
            this.W = colorStateList;
            if (g0()) {
                this.V.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void R(boolean z) {
        if (this.U != z) {
            boolean zG0 = g0();
            this.U = z;
            boolean zG02 = g0();
            if (zG0 != zG02) {
                if (zG02) {
                    A(this.V);
                } else {
                    i0(this.V);
                }
                invalidateSelf();
                H();
            }
        }
    }

    public final void S(ColorStateList colorStateList) {
        if (this.Q != colorStateList) {
            this.Q = colorStateList;
            if (this.T0) {
                lc0 lc0Var = this.g;
                if (lc0Var.e != colorStateList) {
                    lc0Var.e = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void T(float f) {
        if (this.R != f) {
            this.R = f;
            this.u0.setStrokeWidth(f);
            if (this.T0) {
                this.g.k = f;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void U(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.a0;
        if (drawable3 != 0) {
            boolean z = drawable3 instanceof xa1;
            drawable2 = drawable3;
            if (z) {
                drawable2 = null;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float fD = D();
            this.a0 = drawable != null ? drawable.mutate() : null;
            this.b0 = new RippleDrawable(pu1.m(this.S), this.a0, V0);
            float fD2 = D();
            i0(drawable2);
            if (h0()) {
                A(this.a0);
            }
            invalidateSelf();
            if (fD != fD2) {
                H();
            }
        }
    }

    public final void V(float f) {
        if (this.r0 != f) {
            this.r0 = f;
            invalidateSelf();
            if (h0()) {
                H();
            }
        }
    }

    public final void W(float f) {
        if (this.d0 != f) {
            this.d0 = f;
            invalidateSelf();
            if (h0()) {
                H();
            }
        }
    }

    public final void X(float f) {
        if (this.q0 != f) {
            this.q0 = f;
            invalidateSelf();
            if (h0()) {
                H();
            }
        }
    }

    public final boolean Y(int[] iArr) {
        if (Arrays.equals(this.N0, iArr)) {
            return false;
        }
        this.N0 = iArr;
        if (h0()) {
            return I(getState(), iArr);
        }
        return false;
    }

    public final void Z(ColorStateList colorStateList) {
        if (this.c0 != colorStateList) {
            this.c0 = colorStateList;
            if (h0()) {
                this.a0.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void a0(boolean z) {
        if (this.Z != z) {
            boolean zH0 = h0();
            this.Z = z;
            boolean zH02 = h0();
            if (zH0 != zH02) {
                if (zH02) {
                    A(this.a0);
                } else {
                    i0(this.a0);
                }
                invalidateSelf();
                H();
            }
        }
    }

    public final void b0(float f) {
        if (this.n0 != f) {
            float fC = C();
            this.n0 = f;
            float fC2 = C();
            invalidateSelf();
            if (fC != fC2) {
                H();
            }
        }
    }

    public final void c0(float f) {
        if (this.m0 != f) {
            float fC = C();
            this.m0 = f;
            float fC2 = C();
            invalidateSelf();
            if (fC != fC2) {
                H();
            }
        }
    }

    public final void d0(ColorStateList colorStateList) {
        if (this.S != colorStateList) {
            this.S = colorStateList;
            this.O0 = null;
            onStateChange(getState());
        }
    }

    @Override // defpackage.nc0, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        Canvas canvas2;
        int iSaveLayerAlpha;
        float f;
        int i2;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.I0) == 0) {
            return;
        }
        if (i < 255) {
            canvas2 = canvas;
            iSaveLayerAlpha = canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i);
        } else {
            canvas2 = canvas;
            iSaveLayerAlpha = 0;
        }
        boolean z = this.T0;
        Paint paint = this.u0;
        RectF rectF = this.w0;
        if (!z) {
            paint.setColor(this.A0);
            paint.setStyle(Paint.Style.FILL);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, E(), E(), paint);
        }
        if (!this.T0) {
            paint.setColor(this.B0);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.J0;
            if (colorFilter == null) {
                colorFilter = this.K0;
            }
            paint.setColorFilter(colorFilter);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, E(), E(), paint);
        }
        if (this.T0) {
            super.draw(canvas);
        }
        if (this.R > 0.0f && !this.T0) {
            paint.setColor(this.D0);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.T0) {
                ColorFilter colorFilter2 = this.J0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.K0;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f2 = bounds.left;
            float f3 = this.R / 2.0f;
            rectF.set(f2 + f3, bounds.top + f3, bounds.right - f3, bounds.bottom - f3);
            float f4 = this.P - (this.R / 2.0f);
            canvas2.drawRoundRect(rectF, f4, f4, paint);
        }
        paint.setColor(this.E0);
        paint.setStyle(Paint.Style.FILL);
        rectF.set(bounds);
        if (this.T0) {
            RectF rectF2 = new RectF(bounds);
            lc0 lc0Var = this.g;
            su0 su0Var = lc0Var.a;
            float[] fArr = this.H;
            float f5 = lc0Var.j;
            f20 f20Var = this.w;
            uu0 uu0Var = this.x;
            f = 2.0f;
            Path path = this.y0;
            uu0Var.a(su0Var, fArr, f5, rectF2, f20Var, path);
            e(canvas2, paint, path, this.g.a, this.H, g());
        } else {
            canvas2.drawRoundRect(rectF, E(), E(), paint);
            f = 2.0f;
        }
        if (g0()) {
            B(bounds, rectF);
            float f6 = rectF.left;
            float f7 = rectF.top;
            canvas2.translate(f6, f7);
            this.V.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.V.draw(canvas2);
            canvas2.translate(-f6, -f7);
        }
        if (f0()) {
            B(bounds, rectF);
            float f8 = rectF.left;
            float f9 = rectF.top;
            canvas2.translate(f8, f9);
            this.h0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.h0.draw(canvas2);
            canvas2.translate(-f8, -f9);
        }
        if (this.R0 && this.T != null) {
            PointF pointF = this.x0;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.T;
            al0 al0Var = this.z0;
            if (charSequence != null) {
                float fC = C() + this.l0 + this.o0;
                if (tp.a(this) == 0) {
                    pointF.x = bounds.left + fC;
                } else {
                    pointF.x = bounds.right - fC;
                    align = Paint.Align.RIGHT;
                }
                float fCenterY = bounds.centerY();
                TextPaint textPaint = (TextPaint) al0Var.d;
                Paint.FontMetrics fontMetrics = this.v0;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / f);
            }
            rectF.setEmpty();
            if (this.T != null) {
                float fC2 = C() + this.l0 + this.o0;
                float fD = D() + this.s0 + this.p0;
                if (tp.a(this) == 0) {
                    rectF.left = bounds.left + fC2;
                    rectF.right = bounds.right - fD;
                } else {
                    rectF.left = bounds.left + fD;
                    rectF.right = bounds.right - fC2;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
            u01 u01Var = (u01) al0Var.g;
            TextPaint textPaint2 = (TextPaint) al0Var.d;
            if (u01Var != null) {
                textPaint2.drawableState = getState();
                ((u01) al0Var.g).d(this.t0, textPaint2, (xe) al0Var.e);
            }
            textPaint2.setTextAlign(align);
            boolean z2 = Math.round(al0Var.a(this.T.toString())) > Math.round(rectF.width());
            if (z2) {
                int iSave = canvas2.save();
                canvas2.clipRect(rectF);
                i2 = iSave;
            } else {
                i2 = 0;
            }
            CharSequence charSequenceEllipsize = this.T;
            if (z2 && this.Q0 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint2, rectF.width(), this.Q0);
            }
            canvas.drawText(charSequenceEllipsize, 0, charSequenceEllipsize.length(), pointF.x, pointF.y, textPaint2);
            canvas2 = canvas;
            if (z2) {
                canvas2.restoreToCount(i2);
            }
        }
        if (h0()) {
            rectF.setEmpty();
            if (h0()) {
                float f10 = this.s0 + this.r0;
                if (tp.a(this) == 0) {
                    float f11 = bounds.right - f10;
                    rectF.right = f11;
                    rectF.left = f11 - this.d0;
                } else {
                    float f12 = bounds.left + f10;
                    rectF.left = f12;
                    rectF.right = f12 + this.d0;
                }
                float fExactCenterY = bounds.exactCenterY();
                float f13 = this.d0;
                float f14 = fExactCenterY - (f13 / f);
                rectF.top = f14;
                rectF.bottom = f14 + f13;
            }
            float f15 = rectF.left;
            float f16 = rectF.top;
            canvas2.translate(f15, f16);
            this.a0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.b0.setBounds(this.a0.getBounds());
            this.b0.jumpToCurrentState();
            this.b0.draw(canvas2);
            canvas2.translate(-f15, -f16);
        }
        if (this.I0 < 255) {
            canvas2.restoreToCount(iSaveLayerAlpha);
        }
    }

    public final void e0(u01 u01Var) {
        al0 al0Var = this.z0;
        xe xeVar = (xe) al0Var.e;
        TextPaint textPaint = (TextPaint) al0Var.d;
        if (((u01) al0Var.g) != u01Var) {
            al0Var.g = u01Var;
            if (u01Var != null) {
                Context context = this.t0;
                u01Var.e(context, textPaint, xeVar);
                x01 x01Var = (x01) ((WeakReference) al0Var.f).get();
                if (x01Var != null) {
                    textPaint.drawableState = x01Var.getState();
                }
                u01Var.d(context, textPaint, xeVar);
                al0Var.c = true;
            }
            x01 x01Var2 = (x01) ((WeakReference) al0Var.f).get();
            if (x01Var2 != null) {
                bf bfVar = (bf) x01Var2;
                bfVar.H();
                bfVar.invalidateSelf();
                bfVar.onStateChange(x01Var2.getState());
            }
        }
    }

    public final boolean f0() {
        return this.g0 && this.h0 != null && this.G0;
    }

    public final boolean g0() {
        return this.U && this.V != null;
    }

    @Override // defpackage.nc0, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.I0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.J0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.O;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(D() + this.z0.a(this.T.toString()) + C() + this.l0 + this.o0 + this.p0 + this.s0), this.S0);
    }

    @Override // defpackage.nc0, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // defpackage.nc0, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Outline outline2;
        if (this.T0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.O, this.P);
        } else {
            outline.setRoundRect(bounds, this.P);
            outline2 = outline;
        }
        outline2.setAlpha(this.I0 / 255.0f);
    }

    public final boolean h0() {
        return this.Z && this.a0 != null;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // defpackage.nc0, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (F(this.M) || F(this.N) || F(this.Q)) {
            return true;
        }
        u01 u01Var = (u01) this.z0.g;
        if (u01Var == null || (colorStateList = u01Var.k) == null || !colorStateList.isStateful()) {
            return (this.g0 && this.h0 != null && this.f0) || G(this.V) || G(this.h0) || F(this.L0);
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (g0()) {
            zOnLayoutDirectionChanged |= tp.b(this.V, i);
        }
        if (f0()) {
            zOnLayoutDirectionChanged |= tp.b(this.h0, i);
        }
        if (h0()) {
            zOnLayoutDirectionChanged |= tp.b(this.a0, i);
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
        if (g0()) {
            zOnLevelChange |= this.V.setLevel(i);
        }
        if (f0()) {
            zOnLevelChange |= this.h0.setLevel(i);
        }
        if (h0()) {
            zOnLevelChange |= this.a0.setLevel(i);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // defpackage.nc0, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.T0) {
            super.onStateChange(iArr);
        }
        return I(iArr, this.N0);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // defpackage.nc0, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.I0 != i) {
            this.I0 = i;
            invalidateSelf();
        }
    }

    @Override // defpackage.nc0, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.J0 != colorFilter) {
            this.J0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // defpackage.nc0, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.L0 != colorStateList) {
            this.L0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // defpackage.nc0, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.M0 != mode) {
            this.M0 = mode;
            ColorStateList colorStateList = this.L0;
            this.K0 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (g0()) {
            visible |= this.V.setVisible(z, z2);
        }
        if (f0()) {
            visible |= this.h0.setVisible(z, z2);
        }
        if (h0()) {
            visible |= this.a0.setVisible(z, z2);
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
