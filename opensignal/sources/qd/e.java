package qd;

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
import bk.f;
import com.google.android.material.chip.Chip;
import d5.o0;
import ee.i;
import ee.l;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import xd.g;
import xd.h;

/* loaded from: classes.dex */
public final class e extends i implements Drawable.Callback, g {

    /* renamed from: l1, reason: collision with root package name */
    public static final int[] f20848l1 = {R.attr.state_enabled};

    /* renamed from: m1, reason: collision with root package name */
    public static final ShapeDrawable f20849m1 = new ShapeDrawable(new OvalShape());
    public fd.d A0;
    public fd.d B0;
    public float C0;
    public float D0;
    public float E0;
    public float F0;
    public float G0;
    public float H0;
    public float I0;
    public float J0;
    public final Context K0;
    public final Paint L0;
    public final Paint.FontMetrics M0;
    public final RectF N0;
    public final PointF O0;
    public final Path P0;
    public final h Q0;
    public int R0;
    public int S0;
    public int T0;
    public int U0;
    public int V0;
    public int W0;
    public boolean X0;
    public int Y0;
    public int Z0;

    /* renamed from: a1, reason: collision with root package name */
    public ColorFilter f20850a1;

    /* renamed from: b1, reason: collision with root package name */
    public PorterDuffColorFilter f20851b1;

    /* renamed from: c1, reason: collision with root package name */
    public ColorStateList f20852c1;

    /* renamed from: d0, reason: collision with root package name */
    public ColorStateList f20853d0;

    /* renamed from: d1, reason: collision with root package name */
    public PorterDuff.Mode f20854d1;

    /* renamed from: e0, reason: collision with root package name */
    public ColorStateList f20855e0;

    /* renamed from: e1, reason: collision with root package name */
    public int[] f20856e1;

    /* renamed from: f0, reason: collision with root package name */
    public float f20857f0;

    /* renamed from: f1, reason: collision with root package name */
    public ColorStateList f20858f1;

    /* renamed from: g0, reason: collision with root package name */
    public float f20859g0;

    /* renamed from: g1, reason: collision with root package name */
    public WeakReference f20860g1;

    /* renamed from: h0, reason: collision with root package name */
    public ColorStateList f20861h0;

    /* renamed from: h1, reason: collision with root package name */
    public TextUtils.TruncateAt f20862h1;

    /* renamed from: i0, reason: collision with root package name */
    public float f20863i0;

    /* renamed from: i1, reason: collision with root package name */
    public boolean f20864i1;

    /* renamed from: j0, reason: collision with root package name */
    public ColorStateList f20865j0;

    /* renamed from: j1, reason: collision with root package name */
    public int f20866j1;

    /* renamed from: k0, reason: collision with root package name */
    public CharSequence f20867k0;

    /* renamed from: k1, reason: collision with root package name */
    public boolean f20868k1;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f20869l0;

    /* renamed from: m0, reason: collision with root package name */
    public Drawable f20870m0;

    /* renamed from: n0, reason: collision with root package name */
    public ColorStateList f20871n0;

    /* renamed from: o0, reason: collision with root package name */
    public float f20872o0;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f20873p0;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f20874q0;

    /* renamed from: r0, reason: collision with root package name */
    public Drawable f20875r0;

    /* renamed from: s0, reason: collision with root package name */
    public RippleDrawable f20876s0;

    /* renamed from: t0, reason: collision with root package name */
    public ColorStateList f20877t0;

    /* renamed from: u0, reason: collision with root package name */
    public float f20878u0;

    /* renamed from: v0, reason: collision with root package name */
    public SpannableStringBuilder f20879v0;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f20880w0;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f20881x0;

    /* renamed from: y0, reason: collision with root package name */
    public Drawable f20882y0;

    /* renamed from: z0, reason: collision with root package name */
    public ColorStateList f20883z0;

    public e(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10, Chip.S);
        this.f20859g0 = -1.0f;
        this.L0 = new Paint(1);
        this.M0 = new Paint.FontMetrics();
        this.N0 = new RectF();
        this.O0 = new PointF();
        this.P0 = new Path();
        this.Z0 = 255;
        this.f20854d1 = PorterDuff.Mode.SRC_IN;
        this.f20860g1 = new WeakReference(null);
        m(context);
        this.K0 = context;
        h hVar = new h(this);
        this.Q0 = hVar;
        this.f20867k0 = "";
        hVar.f25288a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f20848l1;
        setState(iArr);
        W(iArr);
        this.f20864i1 = true;
        f20849m1.setTint(-1);
    }

    public static boolean D(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean E(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public static void f0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public final float A() {
        if (!d0() && !c0()) {
            return 0.0f;
        }
        float f10 = this.D0;
        Drawable drawable = this.X0 ? this.f20882y0 : this.f20870m0;
        float intrinsicWidth = this.f20872o0;
        if (intrinsicWidth <= 0.0f && drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        return intrinsicWidth + f10 + this.E0;
    }

    public final float B() {
        if (e0()) {
            return this.H0 + this.f20878u0 + this.I0;
        }
        return 0.0f;
    }

    public final float C() {
        return this.f20868k1 ? k() : this.f20859g0;
    }

    public final void F() {
        d dVar = (d) this.f20860g1.get();
        if (dVar != null) {
            Chip chip = (Chip) dVar;
            chip.b(chip.L);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean G(int[] r10, int[] r11) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: qd.e.G(int[], int[]):boolean");
    }

    public final void H(boolean z10) {
        if (this.f20880w0 != z10) {
            this.f20880w0 = z10;
            float fA = A();
            if (!z10 && this.X0) {
                this.X0 = false;
            }
            float fA2 = A();
            invalidateSelf();
            if (fA != fA2) {
                F();
            }
        }
    }

    public final void I(Drawable drawable) {
        if (this.f20882y0 != drawable) {
            float fA = A();
            this.f20882y0 = drawable;
            float fA2 = A();
            f0(this.f20882y0);
            y(this.f20882y0);
            invalidateSelf();
            if (fA != fA2) {
                F();
            }
        }
    }

    public final void J(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f20883z0 != colorStateList) {
            this.f20883z0 = colorStateList;
            if (this.f20881x0 && (drawable = this.f20882y0) != null && this.f20880w0) {
                drawable.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void K(boolean z10) {
        if (this.f20881x0 != z10) {
            boolean zC0 = c0();
            this.f20881x0 = z10;
            boolean zC02 = c0();
            if (zC0 != zC02) {
                if (zC02) {
                    y(this.f20882y0);
                } else {
                    f0(this.f20882y0);
                }
                invalidateSelf();
                F();
            }
        }
    }

    public final void L(float f10) {
        if (this.f20859g0 != f10) {
            this.f20859g0 = f10;
            f fVarG = this.f8117d.f8097a.g();
            fVarG.f2807e = new ee.a(f10);
            fVarG.f2808f = new ee.a(f10);
            fVarG.f2809g = new ee.a(f10);
            fVarG.f2810h = new ee.a(f10);
            setShapeAppearanceModel(fVarG.b());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void M(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f20870m0;
        if (drawable3 != 0) {
            boolean z10 = drawable3 instanceof l3.a;
            drawable2 = drawable3;
            if (z10) {
                drawable2 = null;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float fA = A();
            this.f20870m0 = drawable != null ? drawable.mutate() : null;
            float fA2 = A();
            f0(drawable2);
            if (d0()) {
                y(this.f20870m0);
            }
            invalidateSelf();
            if (fA != fA2) {
                F();
            }
        }
    }

    public final void N(float f10) {
        if (this.f20872o0 != f10) {
            float fA = A();
            this.f20872o0 = f10;
            float fA2 = A();
            invalidateSelf();
            if (fA != fA2) {
                F();
            }
        }
    }

    public final void O(ColorStateList colorStateList) {
        this.f20873p0 = true;
        if (this.f20871n0 != colorStateList) {
            this.f20871n0 = colorStateList;
            if (d0()) {
                this.f20870m0.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void P(boolean z10) {
        if (this.f20869l0 != z10) {
            boolean zD0 = d0();
            this.f20869l0 = z10;
            boolean zD02 = d0();
            if (zD0 != zD02) {
                if (zD02) {
                    y(this.f20870m0);
                } else {
                    f0(this.f20870m0);
                }
                invalidateSelf();
                F();
            }
        }
    }

    public final void Q(ColorStateList colorStateList) {
        if (this.f20861h0 != colorStateList) {
            this.f20861h0 = colorStateList;
            if (this.f20868k1) {
                ee.g gVar = this.f8117d;
                if (gVar.f8101e != colorStateList) {
                    gVar.f8101e = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void R(float f10) {
        if (this.f20863i0 != f10) {
            this.f20863i0 = f10;
            this.L0.setStrokeWidth(f10);
            if (this.f20868k1) {
                this.f8117d.k = f10;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void S(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f20875r0;
        if (drawable3 != 0) {
            boolean z10 = drawable3 instanceof l3.a;
            drawable2 = drawable3;
            if (z10) {
                drawable2 = null;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float fB = B();
            this.f20875r0 = drawable != null ? drawable.mutate() : null;
            this.f20876s0 = new RippleDrawable(ce.a.c(this.f20865j0), this.f20875r0, f20849m1);
            float fB2 = B();
            f0(drawable2);
            if (e0()) {
                y(this.f20875r0);
            }
            invalidateSelf();
            if (fB != fB2) {
                F();
            }
        }
    }

    public final void T(float f10) {
        if (this.I0 != f10) {
            this.I0 = f10;
            invalidateSelf();
            if (e0()) {
                F();
            }
        }
    }

    public final void U(float f10) {
        if (this.f20878u0 != f10) {
            this.f20878u0 = f10;
            invalidateSelf();
            if (e0()) {
                F();
            }
        }
    }

    public final void V(float f10) {
        if (this.H0 != f10) {
            this.H0 = f10;
            invalidateSelf();
            if (e0()) {
                F();
            }
        }
    }

    public final boolean W(int[] iArr) {
        if (Arrays.equals(this.f20856e1, iArr)) {
            return false;
        }
        this.f20856e1 = iArr;
        if (e0()) {
            return G(getState(), iArr);
        }
        return false;
    }

    public final void X(ColorStateList colorStateList) {
        if (this.f20877t0 != colorStateList) {
            this.f20877t0 = colorStateList;
            if (e0()) {
                this.f20875r0.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void Y(boolean z10) {
        if (this.f20874q0 != z10) {
            boolean zE0 = e0();
            this.f20874q0 = z10;
            boolean zE02 = e0();
            if (zE0 != zE02) {
                if (zE02) {
                    y(this.f20875r0);
                } else {
                    f0(this.f20875r0);
                }
                invalidateSelf();
                F();
            }
        }
    }

    public final void Z(float f10) {
        if (this.E0 != f10) {
            float fA = A();
            this.E0 = f10;
            float fA2 = A();
            invalidateSelf();
            if (fA != fA2) {
                F();
            }
        }
    }

    @Override // xd.g
    public final void a() {
        F();
        invalidateSelf();
    }

    public final void a0(float f10) {
        if (this.D0 != f10) {
            float fA = A();
            this.D0 = f10;
            float fA2 = A();
            invalidateSelf();
            if (fA != fA2) {
                F();
            }
        }
    }

    public final void b0(ColorStateList colorStateList) {
        if (this.f20865j0 != colorStateList) {
            this.f20865j0 = colorStateList;
            this.f20858f1 = null;
            onStateChange(getState());
        }
    }

    public final boolean c0() {
        return this.f20881x0 && this.f20882y0 != null && this.X0;
    }

    public final boolean d0() {
        return this.f20869l0 && this.f20870m0 != null;
    }

    @Override // ee.i, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i10;
        Canvas canvas2;
        int iSaveLayerAlpha;
        float f10;
        float f11;
        int i11;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i10 = this.Z0) == 0) {
            return;
        }
        if (i10 < 255) {
            canvas2 = canvas;
            iSaveLayerAlpha = canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i10);
        } else {
            canvas2 = canvas;
            iSaveLayerAlpha = 0;
        }
        boolean z10 = this.f20868k1;
        Paint paint = this.L0;
        RectF rectF = this.N0;
        if (!z10) {
            paint.setColor(this.R0);
            paint.setStyle(Paint.Style.FILL);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, C(), C(), paint);
        }
        if (!this.f20868k1) {
            paint.setColor(this.S0);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.f20850a1;
            if (colorFilter == null) {
                colorFilter = this.f20851b1;
            }
            paint.setColorFilter(colorFilter);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, C(), C(), paint);
        }
        if (this.f20868k1) {
            super.draw(canvas);
        }
        if (this.f20863i0 > 0.0f && !this.f20868k1) {
            paint.setColor(this.U0);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.f20868k1) {
                ColorFilter colorFilter2 = this.f20850a1;
                if (colorFilter2 == null) {
                    colorFilter2 = this.f20851b1;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f12 = bounds.left;
            float f13 = this.f20863i0 / 2.0f;
            rectF.set(f12 + f13, bounds.top + f13, bounds.right - f13, bounds.bottom - f13);
            float f14 = this.f20859g0 - (this.f20863i0 / 2.0f);
            canvas2.drawRoundRect(rectF, f14, f14, paint);
        }
        paint.setColor(this.V0);
        paint.setStyle(Paint.Style.FILL);
        rectF.set(bounds);
        if (this.f20868k1) {
            RectF rectF2 = new RectF(bounds);
            ee.g gVar = this.f8117d;
            l lVar = gVar.f8097a;
            float[] fArr = this.Y;
            float f15 = gVar.j;
            b9.c cVar = this.N;
            o0 o0Var = this.O;
            f10 = 2.0f;
            Path path = this.P0;
            o0Var.b(lVar, fArr, f15, rectF2, cVar, path);
            f(canvas2, paint, path, this.f8117d.f8097a, this.Y, h());
        } else {
            canvas2.drawRoundRect(rectF, C(), C(), paint);
            f10 = 2.0f;
        }
        if (d0()) {
            z(bounds, rectF);
            float f16 = rectF.left;
            float f17 = rectF.top;
            canvas2.translate(f16, f17);
            this.f20870m0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f20870m0.draw(canvas2);
            canvas2.translate(-f16, -f17);
        }
        if (c0()) {
            z(bounds, rectF);
            float f18 = rectF.left;
            float f19 = rectF.top;
            canvas2.translate(f18, f19);
            this.f20882y0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f20882y0.draw(canvas2);
            canvas2.translate(-f18, -f19);
        }
        if (this.f20864i1 && this.f20867k0 != null) {
            PointF pointF = this.O0;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.f20867k0;
            h hVar = this.Q0;
            if (charSequence != null) {
                float fA = A() + this.C0 + this.F0;
                if (getLayoutDirection() == 0) {
                    pointF.x = bounds.left + fA;
                } else {
                    pointF.x = bounds.right - fA;
                    align = Paint.Align.RIGHT;
                }
                float fCenterY = bounds.centerY();
                TextPaint textPaint = hVar.f25288a;
                Paint.FontMetrics fontMetrics = this.M0;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / f10);
            }
            rectF.setEmpty();
            if (this.f20867k0 != null) {
                float fA2 = A() + this.C0 + this.F0;
                float fB = B() + this.J0 + this.G0;
                if (getLayoutDirection() == 0) {
                    rectF.left = bounds.left + fA2;
                    rectF.right = bounds.right - fB;
                } else {
                    rectF.left = bounds.left + fB;
                    rectF.right = bounds.right - fA2;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
            be.d dVar = hVar.f25294g;
            TextPaint textPaint2 = hVar.f25288a;
            if (dVar != null) {
                textPaint2.drawableState = getState();
                hVar.f25294g.d(this.K0, textPaint2, hVar.f25289b);
            }
            textPaint2.setTextAlign(align);
            String string = this.f20867k0.toString();
            if (hVar.f25292e) {
                hVar.a(string);
                f11 = hVar.f25290c;
            } else {
                f11 = hVar.f25290c;
            }
            boolean z11 = Math.round(f11) > Math.round(rectF.width());
            if (z11) {
                int iSave = canvas2.save();
                canvas2.clipRect(rectF);
                i11 = iSave;
            } else {
                i11 = 0;
            }
            CharSequence charSequenceEllipsize = this.f20867k0;
            if (z11 && this.f20862h1 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint2, rectF.width(), this.f20862h1);
            }
            canvas.drawText(charSequenceEllipsize, 0, charSequenceEllipsize.length(), pointF.x, pointF.y, textPaint2);
            canvas2 = canvas;
            if (z11) {
                canvas2.restoreToCount(i11);
            }
        }
        if (e0()) {
            rectF.setEmpty();
            if (e0()) {
                float f20 = this.J0 + this.I0;
                if (getLayoutDirection() == 0) {
                    float f21 = bounds.right - f20;
                    rectF.right = f21;
                    rectF.left = f21 - this.f20878u0;
                } else {
                    float f22 = bounds.left + f20;
                    rectF.left = f22;
                    rectF.right = f22 + this.f20878u0;
                }
                float fExactCenterY = bounds.exactCenterY();
                float f23 = this.f20878u0;
                float f24 = fExactCenterY - (f23 / f10);
                rectF.top = f24;
                rectF.bottom = f24 + f23;
            }
            float f25 = rectF.left;
            float f26 = rectF.top;
            canvas2.translate(f25, f26);
            this.f20875r0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f20876s0.setBounds(this.f20875r0.getBounds());
            this.f20876s0.jumpToCurrentState();
            this.f20876s0.draw(canvas2);
            canvas2.translate(-f25, -f26);
        }
        if (this.Z0 < 255) {
            canvas2.restoreToCount(iSaveLayerAlpha);
        }
    }

    public final boolean e0() {
        return this.f20874q0 && this.f20875r0 != null;
    }

    @Override // ee.i, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.Z0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f20850a1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f20857f0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float f10;
        float fA = A() + this.C0 + this.F0;
        String string = this.f20867k0.toString();
        h hVar = this.Q0;
        if (hVar.f25292e) {
            hVar.a(string);
            f10 = hVar.f25290c;
        } else {
            f10 = hVar.f25290c;
        }
        return Math.min(Math.round(B() + f10 + fA + this.G0 + this.J0), this.f20866j1);
    }

    @Override // ee.i, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // ee.i, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Outline outline2;
        if (this.f20868k1) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f20857f0, this.f20859g0);
        } else {
            outline.setRoundRect(bounds, this.f20859g0);
            outline2 = outline;
        }
        outline2.setAlpha(this.Z0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // ee.i, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (D(this.f20853d0) || D(this.f20855e0) || D(this.f20861h0)) {
            return true;
        }
        be.d dVar = this.Q0.f25294g;
        if (dVar == null || (colorStateList = dVar.k) == null || !colorStateList.isStateful()) {
            return (this.f20881x0 && this.f20882y0 != null && this.f20880w0) || E(this.f20870m0) || E(this.f20882y0) || D(this.f20852c1);
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i10) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i10);
        if (d0()) {
            zOnLayoutDirectionChanged |= this.f20870m0.setLayoutDirection(i10);
        }
        if (c0()) {
            zOnLayoutDirectionChanged |= this.f20882y0.setLayoutDirection(i10);
        }
        if (e0()) {
            zOnLayoutDirectionChanged |= this.f20875r0.setLayoutDirection(i10);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i10) {
        boolean zOnLevelChange = super.onLevelChange(i10);
        if (d0()) {
            zOnLevelChange |= this.f20870m0.setLevel(i10);
        }
        if (c0()) {
            zOnLevelChange |= this.f20882y0.setLevel(i10);
        }
        if (e0()) {
            zOnLevelChange |= this.f20875r0.setLevel(i10);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // ee.i, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.f20868k1) {
            super.onStateChange(iArr);
        }
        return G(iArr, this.f20856e1);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // ee.i, android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        if (this.Z0 != i10) {
            this.Z0 = i10;
            invalidateSelf();
        }
    }

    @Override // ee.i, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f20850a1 != colorFilter) {
            this.f20850a1 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // ee.i, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.f20852c1 != colorStateList) {
            this.f20852c1 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // ee.i, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.f20854d1 != mode) {
            this.f20854d1 = mode;
            ColorStateList colorStateList = this.f20852c1;
            this.f20851b1 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        if (d0()) {
            visible |= this.f20870m0.setVisible(z10, z11);
        }
        if (c0()) {
            visible |= this.f20882y0.setVisible(z10, z11);
        }
        if (e0()) {
            visible |= this.f20875r0.setVisible(z10, z11);
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

    public final void y(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        drawable.setLayoutDirection(getLayoutDirection());
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f20875r0) {
            if (drawable.isStateful()) {
                drawable.setState(this.f20856e1);
            }
            drawable.setTintList(this.f20877t0);
            return;
        }
        Drawable drawable2 = this.f20870m0;
        if (drawable == drawable2 && this.f20873p0) {
            drawable2.setTintList(this.f20871n0);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public final void z(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (d0() || c0()) {
            float f10 = this.C0 + this.D0;
            Drawable drawable = this.X0 ? this.f20882y0 : this.f20870m0;
            float intrinsicWidth = this.f20872o0;
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
            Drawable drawable2 = this.X0 ? this.f20882y0 : this.f20870m0;
            float fCeil = this.f20872o0;
            if (fCeil <= 0.0f && drawable2 != null) {
                fCeil = (float) Math.ceil(xd.l.b(this.K0, 24));
                if (drawable2.getIntrinsicHeight() <= fCeil) {
                    fCeil = drawable2.getIntrinsicHeight();
                }
            }
            float fExactCenterY = rect.exactCenterY() - (fCeil / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fCeil;
        }
    }
}
