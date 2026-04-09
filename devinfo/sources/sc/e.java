package sc;

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
import com.google.android.gms.internal.ads.wj0;
import com.google.android.material.chip.Chip;
import ed.j;
import ed.n;
import ed.o;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import p6.i;
import zc.k;
import zc.m;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e extends j implements Drawable.Callback, zc.j {
    public static final int[] P0 = {R.attr.state_enabled};
    public static final ShapeDrawable Q0 = new ShapeDrawable(new OvalShape());
    public int A0;
    public boolean B0;
    public int C0;
    public int D0;
    public ColorFilter E0;
    public PorterDuffColorFilter F0;
    public ColorStateList G0;
    public ColorStateList H;
    public PorterDuff.Mode H0;
    public ColorStateList I;
    public int[] I0;
    public float J;
    public ColorStateList J0;
    public float K;
    public WeakReference K0;
    public ColorStateList L;
    public TextUtils.TruncateAt L0;
    public float M;
    public boolean M0;
    public ColorStateList N;
    public int N0;
    public CharSequence O;
    public boolean O0;
    public boolean P;
    public Drawable Q;
    public ColorStateList R;
    public float S;
    public boolean T;
    public boolean U;
    public Drawable V;
    public RippleDrawable W;
    public ColorStateList X;
    public float Y;
    public SpannableStringBuilder Z;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f33528a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f33529b0;

    /* renamed from: c0, reason: collision with root package name */
    public Drawable f33530c0;

    /* renamed from: d0, reason: collision with root package name */
    public ColorStateList f33531d0;

    /* renamed from: e0, reason: collision with root package name */
    public jc.d f33532e0;

    /* renamed from: f0, reason: collision with root package name */
    public jc.d f33533f0;

    /* renamed from: g0, reason: collision with root package name */
    public float f33534g0;

    /* renamed from: h0, reason: collision with root package name */
    public float f33535h0;

    /* renamed from: i0, reason: collision with root package name */
    public float f33536i0;

    /* renamed from: j0, reason: collision with root package name */
    public float f33537j0;

    /* renamed from: k0, reason: collision with root package name */
    public float f33538k0;

    /* renamed from: l0, reason: collision with root package name */
    public float f33539l0;

    /* renamed from: m0, reason: collision with root package name */
    public float f33540m0;

    /* renamed from: n0, reason: collision with root package name */
    public float f33541n0;

    /* renamed from: o0, reason: collision with root package name */
    public final Context f33542o0;

    /* renamed from: p0, reason: collision with root package name */
    public final Paint f33543p0;

    /* renamed from: q0, reason: collision with root package name */
    public final Paint.FontMetrics f33544q0;

    /* renamed from: r0, reason: collision with root package name */
    public final RectF f33545r0;

    /* renamed from: s0, reason: collision with root package name */
    public final PointF f33546s0;

    /* renamed from: t0, reason: collision with root package name */
    public final Path f33547t0;

    /* renamed from: u0, reason: collision with root package name */
    public final k f33548u0;

    /* renamed from: v0, reason: collision with root package name */
    public int f33549v0;

    /* renamed from: w0, reason: collision with root package name */
    public int f33550w0;

    /* renamed from: x0, reason: collision with root package name */
    public int f33551x0;

    /* renamed from: y0, reason: collision with root package name */
    public int f33552y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f33553z0;

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.liuzh.deviceinfo.R.attr.chipStyle, com.liuzh.deviceinfo.R.style.Widget_MaterialComponents_Chip_Action);
        this.K = -1.0f;
        this.f33543p0 = new Paint(1);
        this.f33544q0 = new Paint.FontMetrics();
        this.f33545r0 = new RectF();
        this.f33546s0 = new PointF();
        this.f33547t0 = new Path();
        this.D0 = 255;
        this.H0 = PorterDuff.Mode.SRC_IN;
        this.K0 = new WeakReference(null);
        l(context);
        this.f33542o0 = context;
        k kVar = new k(this);
        this.f33548u0 = kVar;
        this.O = "";
        kVar.f38228a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = P0;
        setState(iArr);
        U(iArr);
        this.M0 = true;
        Q0.setTint(-1);
    }

    public static boolean B(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean C(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public static void d0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public final float A() {
        if (!this.O0) {
            return this.K;
        }
        float[] fArr = this.C;
        return fArr != null ? fArr[3] : this.f23316b.f23298a.f23357e.a(h());
    }

    public final void D() {
        d dVar = (d) this.K0.get();
        if (dVar != null) {
            Chip chip = (Chip) dVar;
            chip.c(chip.f20425q);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean E(int[] r10, int[] r11) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sc.e.E(int[], int[]):boolean");
    }

    public final void F(boolean z3) {
        if (this.f33528a0 != z3) {
            this.f33528a0 = z3;
            float fY = y();
            if (!z3 && this.B0) {
                this.B0 = false;
            }
            float fY2 = y();
            invalidateSelf();
            if (fY != fY2) {
                D();
            }
        }
    }

    public final void G(Drawable drawable) {
        if (this.f33530c0 != drawable) {
            float fY = y();
            this.f33530c0 = drawable;
            float fY2 = y();
            d0(this.f33530c0);
            w(this.f33530c0);
            invalidateSelf();
            if (fY != fY2) {
                D();
            }
        }
    }

    public final void H(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f33531d0 != colorStateList) {
            this.f33531d0 = colorStateList;
            if (this.f33529b0 && (drawable = this.f33530c0) != null && this.f33528a0) {
                drawable.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void I(boolean z3) {
        if (this.f33529b0 != z3) {
            boolean zA0 = a0();
            this.f33529b0 = z3;
            boolean zA02 = a0();
            if (zA0 != zA02) {
                if (zA02) {
                    w(this.f33530c0);
                } else {
                    d0(this.f33530c0);
                }
                invalidateSelf();
                D();
            }
        }
    }

    public final void J(float f10) {
        if (this.K != f10) {
            this.K = f10;
            n nVarG = this.f23316b.f23298a.g();
            nVarG.f23346e = new ed.a(f10);
            nVarG.f23347f = new ed.a(f10);
            nVarG.g = new ed.a(f10);
            nVarG.f23348h = new ed.a(f10);
            setShapeAppearanceModel(nVarG.a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void K(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.Q;
        if (drawable3 != 0) {
            boolean z3 = drawable3 instanceof w3.a;
            drawable2 = drawable3;
            if (z3) {
                drawable2 = null;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float fY = y();
            this.Q = drawable != null ? drawable.mutate() : null;
            float fY2 = y();
            d0(drawable2);
            if (b0()) {
                w(this.Q);
            }
            invalidateSelf();
            if (fY != fY2) {
                D();
            }
        }
    }

    public final void L(float f10) {
        if (this.S != f10) {
            float fY = y();
            this.S = f10;
            float fY2 = y();
            invalidateSelf();
            if (fY != fY2) {
                D();
            }
        }
    }

    public final void M(ColorStateList colorStateList) {
        this.T = true;
        if (this.R != colorStateList) {
            this.R = colorStateList;
            if (b0()) {
                this.Q.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void N(boolean z3) {
        if (this.P != z3) {
            boolean zB0 = b0();
            this.P = z3;
            boolean zB02 = b0();
            if (zB0 != zB02) {
                if (zB02) {
                    w(this.Q);
                } else {
                    d0(this.Q);
                }
                invalidateSelf();
                D();
            }
        }
    }

    public final void O(ColorStateList colorStateList) {
        if (this.L != colorStateList) {
            this.L = colorStateList;
            if (this.O0) {
                r(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void P(float f10) {
        if (this.M != f10) {
            this.M = f10;
            this.f33543p0.setStrokeWidth(f10);
            if (this.O0) {
                this.f23316b.f23306k = f10;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Q(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.V;
        if (drawable3 != 0) {
            boolean z3 = drawable3 instanceof w3.a;
            drawable2 = drawable3;
            if (z3) {
                drawable2 = null;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float fZ = z();
            this.V = drawable != null ? drawable.mutate() : null;
            this.W = new RippleDrawable(cd.a.b(this.N), this.V, Q0);
            float fZ2 = z();
            d0(drawable2);
            if (c0()) {
                w(this.V);
            }
            invalidateSelf();
            if (fZ != fZ2) {
                D();
            }
        }
    }

    public final void R(float f10) {
        if (this.f33540m0 != f10) {
            this.f33540m0 = f10;
            invalidateSelf();
            if (c0()) {
                D();
            }
        }
    }

    public final void S(float f10) {
        if (this.Y != f10) {
            this.Y = f10;
            invalidateSelf();
            if (c0()) {
                D();
            }
        }
    }

    public final void T(float f10) {
        if (this.f33539l0 != f10) {
            this.f33539l0 = f10;
            invalidateSelf();
            if (c0()) {
                D();
            }
        }
    }

    public final boolean U(int[] iArr) {
        if (Arrays.equals(this.I0, iArr)) {
            return false;
        }
        this.I0 = iArr;
        if (c0()) {
            return E(getState(), iArr);
        }
        return false;
    }

    public final void V(ColorStateList colorStateList) {
        if (this.X != colorStateList) {
            this.X = colorStateList;
            if (c0()) {
                this.V.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void W(boolean z3) {
        if (this.U != z3) {
            boolean zC0 = c0();
            this.U = z3;
            boolean zC02 = c0();
            if (zC0 != zC02) {
                if (zC02) {
                    w(this.V);
                } else {
                    d0(this.V);
                }
                invalidateSelf();
                D();
            }
        }
    }

    public final void X(float f10) {
        if (this.f33536i0 != f10) {
            float fY = y();
            this.f33536i0 = f10;
            float fY2 = y();
            invalidateSelf();
            if (fY != fY2) {
                D();
            }
        }
    }

    public final void Y(float f10) {
        if (this.f33535h0 != f10) {
            float fY = y();
            this.f33535h0 = f10;
            float fY2 = y();
            invalidateSelf();
            if (fY != fY2) {
                D();
            }
        }
    }

    public final void Z(ColorStateList colorStateList) {
        if (this.N != colorStateList) {
            this.N = colorStateList;
            this.J0 = null;
            onStateChange(getState());
        }
    }

    @Override // ed.j, zc.j
    public final void a() {
        D();
        invalidateSelf();
    }

    public final boolean a0() {
        return this.f33529b0 && this.f33530c0 != null && this.B0;
    }

    public final boolean b0() {
        return this.P && this.Q != null;
    }

    public final boolean c0() {
        return this.U && this.V != null;
    }

    @Override // ed.j, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i4;
        Canvas canvas2;
        int iSaveLayerAlpha;
        float f10;
        int i10;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i4 = this.D0) == 0) {
            return;
        }
        if (i4 < 255) {
            canvas2 = canvas;
            iSaveLayerAlpha = canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i4);
        } else {
            canvas2 = canvas;
            iSaveLayerAlpha = 0;
        }
        boolean z3 = this.O0;
        Paint paint = this.f33543p0;
        RectF rectF = this.f33545r0;
        if (!z3) {
            paint.setColor(this.f33549v0);
            paint.setStyle(Paint.Style.FILL);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, A(), A(), paint);
        }
        if (!this.O0) {
            paint.setColor(this.f33550w0);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.E0;
            if (colorFilter == null) {
                colorFilter = this.F0;
            }
            paint.setColorFilter(colorFilter);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, A(), A(), paint);
        }
        if (this.O0) {
            super.draw(canvas);
        }
        if (this.M > 0.0f && !this.O0) {
            paint.setColor(this.f33552y0);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.O0) {
                ColorFilter colorFilter2 = this.E0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.F0;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f11 = bounds.left;
            float f12 = this.M / 2.0f;
            rectF.set(f11 + f12, bounds.top + f12, bounds.right - f12, bounds.bottom - f12);
            float f13 = this.K - (this.M / 2.0f);
            canvas2.drawRoundRect(rectF, f13, f13, paint);
        }
        paint.setColor(this.f33553z0);
        paint.setStyle(Paint.Style.FILL);
        rectF.set(bounds);
        if (this.O0) {
            RectF rectF2 = new RectF(bounds);
            ed.h hVar = this.f23316b;
            o oVar = hVar.f23298a;
            float[] fArr = this.C;
            float f14 = hVar.j;
            i iVar = this.f23330r;
            wj0 wj0Var = this.f23331s;
            f10 = 2.0f;
            Path path = this.f33547t0;
            wj0Var.b(oVar, fArr, f14, rectF2, iVar, path);
            f(canvas2, paint, path, this.f23316b.f23298a, this.C, h());
        } else {
            canvas2.drawRoundRect(rectF, A(), A(), paint);
            f10 = 2.0f;
        }
        if (b0()) {
            x(rectF, bounds);
            float f15 = rectF.left;
            float f16 = rectF.top;
            canvas2.translate(f15, f16);
            this.Q.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.Q.draw(canvas2);
            canvas2.translate(-f15, -f16);
        }
        if (a0()) {
            x(rectF, bounds);
            float f17 = rectF.left;
            float f18 = rectF.top;
            canvas2.translate(f17, f18);
            this.f33530c0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f33530c0.draw(canvas2);
            canvas2.translate(-f17, -f18);
        }
        if (this.M0 && this.O != null) {
            PointF pointF = this.f33546s0;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.O;
            k kVar = this.f33548u0;
            if (charSequence != null) {
                float fY = y() + this.f33534g0 + this.f33537j0;
                if (getLayoutDirection() == 0) {
                    pointF.x = bounds.left + fY;
                } else {
                    pointF.x = bounds.right - fY;
                    align = Paint.Align.RIGHT;
                }
                float fCenterY = bounds.centerY();
                TextPaint textPaint = kVar.f38228a;
                Paint.FontMetrics fontMetrics = this.f33544q0;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / f10);
            }
            rectF.setEmpty();
            if (this.O != null) {
                float fY2 = y() + this.f33534g0 + this.f33537j0;
                float fZ = z() + this.f33541n0 + this.f33538k0;
                if (getLayoutDirection() == 0) {
                    rectF.left = bounds.left + fY2;
                    rectF.right = bounds.right - fZ;
                } else {
                    rectF.left = bounds.left + fZ;
                    rectF.right = bounds.right - fY2;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
            bd.d dVar = kVar.g;
            TextPaint textPaint2 = kVar.f38228a;
            if (dVar != null) {
                textPaint2.drawableState = getState();
                kVar.g.d(this.f33542o0, textPaint2, kVar.f38229b);
            }
            textPaint2.setTextAlign(align);
            boolean z10 = Math.round(kVar.a(this.O.toString())) > Math.round(rectF.width());
            if (z10) {
                int iSave = canvas2.save();
                canvas2.clipRect(rectF);
                i10 = iSave;
            } else {
                i10 = 0;
            }
            CharSequence charSequenceEllipsize = this.O;
            if (z10 && this.L0 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint2, rectF.width(), this.L0);
            }
            canvas.drawText(charSequenceEllipsize, 0, charSequenceEllipsize.length(), pointF.x, pointF.y, textPaint2);
            canvas2 = canvas;
            if (z10) {
                canvas2.restoreToCount(i10);
            }
        }
        if (c0()) {
            rectF.setEmpty();
            if (c0()) {
                float f19 = this.f33541n0 + this.f33540m0;
                if (getLayoutDirection() == 0) {
                    float f20 = bounds.right - f19;
                    rectF.right = f20;
                    rectF.left = f20 - this.Y;
                } else {
                    float f21 = bounds.left + f19;
                    rectF.left = f21;
                    rectF.right = f21 + this.Y;
                }
                float fExactCenterY = bounds.exactCenterY();
                float f22 = this.Y;
                float f23 = fExactCenterY - (f22 / f10);
                rectF.top = f23;
                rectF.bottom = f23 + f22;
            }
            float f24 = rectF.left;
            float f25 = rectF.top;
            canvas2.translate(f24, f25);
            this.V.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.W.setBounds(this.V.getBounds());
            this.W.jumpToCurrentState();
            this.W.draw(canvas2);
            canvas2.translate(-f24, -f25);
        }
        if (this.D0 < 255) {
            canvas2.restoreToCount(iSaveLayerAlpha);
        }
    }

    @Override // ed.j, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.D0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.E0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.J;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(z() + this.f33548u0.a(this.O.toString()) + y() + this.f33534g0 + this.f33537j0 + this.f33538k0 + this.f33541n0), this.N0);
    }

    @Override // ed.j, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // ed.j, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Outline outline2;
        if (this.O0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.J, this.K);
        } else {
            outline.setRoundRect(bounds, this.K);
            outline2 = outline;
        }
        outline2.setAlpha(this.D0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // ed.j, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (B(this.H) || B(this.I) || B(this.L)) {
            return true;
        }
        bd.d dVar = this.f33548u0.g;
        if (dVar == null || (colorStateList = dVar.f2134k) == null || !colorStateList.isStateful()) {
            return (this.f33529b0 && this.f33530c0 != null && this.f33528a0) || C(this.Q) || C(this.f33530c0) || B(this.G0);
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i4) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i4);
        if (b0()) {
            zOnLayoutDirectionChanged |= this.Q.setLayoutDirection(i4);
        }
        if (a0()) {
            zOnLayoutDirectionChanged |= this.f33530c0.setLayoutDirection(i4);
        }
        if (c0()) {
            zOnLayoutDirectionChanged |= this.V.setLayoutDirection(i4);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i4) {
        boolean zOnLevelChange = super.onLevelChange(i4);
        if (b0()) {
            zOnLevelChange |= this.Q.setLevel(i4);
        }
        if (a0()) {
            zOnLevelChange |= this.f33530c0.setLevel(i4);
        }
        if (c0()) {
            zOnLevelChange |= this.V.setLevel(i4);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // ed.j, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.O0) {
            super.onStateChange(iArr);
        }
        return E(iArr, this.I0);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // ed.j, android.graphics.drawable.Drawable
    public final void setAlpha(int i4) {
        if (this.D0 != i4) {
            this.D0 = i4;
            invalidateSelf();
        }
    }

    @Override // ed.j, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.E0 != colorFilter) {
            this.E0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // ed.j, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.G0 != colorStateList) {
            this.G0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // ed.j, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.H0 != mode) {
            this.H0 = mode;
            ColorStateList colorStateList = this.G0;
            this.F0 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z3, boolean z10) {
        boolean visible = super.setVisible(z3, z10);
        if (b0()) {
            visible |= this.Q.setVisible(z3, z10);
        }
        if (a0()) {
            visible |= this.f33530c0.setVisible(z3, z10);
        }
        if (c0()) {
            visible |= this.V.setVisible(z3, z10);
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

    public final void w(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        drawable.setLayoutDirection(getLayoutDirection());
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.V) {
            if (drawable.isStateful()) {
                drawable.setState(this.I0);
            }
            drawable.setTintList(this.X);
            return;
        }
        Drawable drawable2 = this.Q;
        if (drawable == drawable2 && this.T) {
            drawable2.setTintList(this.R);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public final void x(RectF rectF, Rect rect) {
        rectF.setEmpty();
        if (b0() || a0()) {
            float f10 = this.f33534g0 + this.f33535h0;
            Drawable drawable = this.B0 ? this.f33530c0 : this.Q;
            float intrinsicWidth = this.S;
            if (intrinsicWidth <= 0.0f && drawable != null) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
            if (getLayoutDirection() == 0) {
                float f11 = rect.left + f10;
                rectF.left = f11;
                rectF.right = f11 + intrinsicWidth;
            } else {
                float f12 = rect.right - f10;
                rectF.right = f12;
                rectF.left = f12 - intrinsicWidth;
            }
            Drawable drawable2 = this.B0 ? this.f33530c0 : this.Q;
            float fCeil = this.S;
            if (fCeil <= 0.0f && drawable2 != null) {
                fCeil = (float) Math.ceil(m.d(24, this.f33542o0));
                if (drawable2.getIntrinsicHeight() <= fCeil) {
                    fCeil = drawable2.getIntrinsicHeight();
                }
            }
            float fExactCenterY = rect.exactCenterY() - (fCeil / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fCeil;
        }
    }

    public final float y() {
        if (!b0() && !a0()) {
            return 0.0f;
        }
        float f10 = this.f33535h0;
        Drawable drawable = this.B0 ? this.f33530c0 : this.Q;
        float intrinsicWidth = this.S;
        if (intrinsicWidth <= 0.0f && drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        return intrinsicWidth + f10 + this.f33536i0;
    }

    public final float z() {
        if (c0()) {
            return this.f33539l0 + this.Y + this.f33540m0;
        }
        return 0.0f;
    }
}
