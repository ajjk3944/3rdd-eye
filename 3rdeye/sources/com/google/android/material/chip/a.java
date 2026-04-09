package com.google.android.material.chip;

import C0.d;
import D0.a;
import D0.c;
import L3.g;
import android.R;
import android.annotation.TargetApi;
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
import d4.h;
import h4.C4416d;
import i4.C4456a;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import kotlin.KotlinVersion;
import l4.C5282a;
import l4.C5287f;
import l4.C5290i;

/* compiled from: ChipDrawable.java */
/* loaded from: classes2.dex */
public final class a extends C5287f implements Drawable.Callback, h.b {

    /* renamed from: H0, reason: collision with root package name */
    public static final int[] f22708H0 = {R.attr.state_enabled};

    /* renamed from: I0, reason: collision with root package name */
    public static final ShapeDrawable f22709I0 = new ShapeDrawable(new OvalShape());

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f22710A;

    /* renamed from: A0, reason: collision with root package name */
    public int[] f22711A0;

    /* renamed from: B, reason: collision with root package name */
    public float f22712B;

    /* renamed from: B0, reason: collision with root package name */
    public ColorStateList f22713B0;

    /* renamed from: C, reason: collision with root package name */
    public float f22714C;

    /* renamed from: C0, reason: collision with root package name */
    public WeakReference<InterfaceC0341a> f22715C0;

    /* renamed from: D, reason: collision with root package name */
    public ColorStateList f22716D;

    /* renamed from: D0, reason: collision with root package name */
    public TextUtils.TruncateAt f22717D0;

    /* renamed from: E, reason: collision with root package name */
    public float f22718E;

    /* renamed from: E0, reason: collision with root package name */
    public boolean f22719E0;

    /* renamed from: F, reason: collision with root package name */
    public ColorStateList f22720F;
    public int F0;

    /* renamed from: G, reason: collision with root package name */
    public CharSequence f22721G;

    /* renamed from: G0, reason: collision with root package name */
    public boolean f22722G0;

    /* renamed from: H, reason: collision with root package name */
    public boolean f22723H;

    /* renamed from: I, reason: collision with root package name */
    public Drawable f22724I;

    /* renamed from: J, reason: collision with root package name */
    public ColorStateList f22725J;

    /* renamed from: K, reason: collision with root package name */
    public float f22726K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f22727L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f22728M;

    /* renamed from: N, reason: collision with root package name */
    public Drawable f22729N;

    /* renamed from: O, reason: collision with root package name */
    public RippleDrawable f22730O;

    /* renamed from: P, reason: collision with root package name */
    public ColorStateList f22731P;

    /* renamed from: Q, reason: collision with root package name */
    public float f22732Q;

    /* renamed from: R, reason: collision with root package name */
    public SpannableStringBuilder f22733R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f22734S;

    /* renamed from: T, reason: collision with root package name */
    public boolean f22735T;

    /* renamed from: U, reason: collision with root package name */
    public Drawable f22736U;

    /* renamed from: V, reason: collision with root package name */
    public ColorStateList f22737V;

    /* renamed from: W, reason: collision with root package name */
    public g f22738W;

    /* renamed from: X, reason: collision with root package name */
    public g f22739X;

    /* renamed from: Y, reason: collision with root package name */
    public float f22740Y;

    /* renamed from: Z, reason: collision with root package name */
    public float f22741Z;

    /* renamed from: a0, reason: collision with root package name */
    public float f22742a0;

    /* renamed from: b0, reason: collision with root package name */
    public float f22743b0;

    /* renamed from: c0, reason: collision with root package name */
    public float f22744c0;

    /* renamed from: d0, reason: collision with root package name */
    public float f22745d0;

    /* renamed from: e0, reason: collision with root package name */
    public float f22746e0;

    /* renamed from: f0, reason: collision with root package name */
    public float f22747f0;

    /* renamed from: g0, reason: collision with root package name */
    public final Context f22748g0;

    /* renamed from: h0, reason: collision with root package name */
    public final Paint f22749h0;

    /* renamed from: i0, reason: collision with root package name */
    public final Paint.FontMetrics f22750i0;

    /* renamed from: j0, reason: collision with root package name */
    public final RectF f22751j0;

    /* renamed from: k0, reason: collision with root package name */
    public final PointF f22752k0;

    /* renamed from: l0, reason: collision with root package name */
    public final Path f22753l0;

    /* renamed from: m0, reason: collision with root package name */
    public final h f22754m0;

    /* renamed from: n0, reason: collision with root package name */
    public int f22755n0;

    /* renamed from: o0, reason: collision with root package name */
    public int f22756o0;

    /* renamed from: p0, reason: collision with root package name */
    public int f22757p0;

    /* renamed from: q0, reason: collision with root package name */
    public int f22758q0;

    /* renamed from: r0, reason: collision with root package name */
    public int f22759r0;

    /* renamed from: s0, reason: collision with root package name */
    public int f22760s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f22761t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f22762u0;

    /* renamed from: v0, reason: collision with root package name */
    public int f22763v0;

    /* renamed from: w0, reason: collision with root package name */
    public ColorFilter f22764w0;

    /* renamed from: x0, reason: collision with root package name */
    public PorterDuffColorFilter f22765x0;

    /* renamed from: y0, reason: collision with root package name */
    public ColorStateList f22766y0;

    /* renamed from: z, reason: collision with root package name */
    public ColorStateList f22767z;

    /* renamed from: z0, reason: collision with root package name */
    public PorterDuff.Mode f22768z0;

    /* compiled from: ChipDrawable.java */
    /* renamed from: com.google.android.material.chip.a$a, reason: collision with other inner class name */
    public interface InterfaceC0341a {
        void a();
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.attr.chipStyle, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.style.Widget_MaterialComponents_Chip_Action);
        this.f22714C = -1.0f;
        this.f22749h0 = new Paint(1);
        this.f22750i0 = new Paint.FontMetrics();
        this.f22751j0 = new RectF();
        this.f22752k0 = new PointF();
        this.f22753l0 = new Path();
        this.f22763v0 = KotlinVersion.MAX_COMPONENT_VALUE;
        this.f22768z0 = PorterDuff.Mode.SRC_IN;
        this.f22715C0 = new WeakReference<>(null);
        i(context);
        this.f22748g0 = context;
        h hVar = new h(this);
        this.f22754m0 = hVar;
        this.f22721G = "";
        hVar.f37510a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f22708H0;
        setState(iArr);
        if (!Arrays.equals(this.f22711A0, iArr)) {
            this.f22711A0 = iArr;
            if (U()) {
                w(getState(), iArr);
            }
        }
        this.f22719E0 = true;
        int[] iArr2 = C4456a.f38452a;
        f22709I0.setTint(-1);
    }

    public static void V(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public static boolean t(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean u(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public final void A(boolean z10) {
        if (this.f22735T != z10) {
            boolean zS = S();
            this.f22735T = z10;
            boolean zS2 = S();
            if (zS != zS2) {
                if (zS2) {
                    o(this.f22736U);
                } else {
                    V(this.f22736U);
                }
                invalidateSelf();
                v();
            }
        }
    }

    @Deprecated
    public final void B(float f10) {
        if (this.f22714C != f10) {
            this.f22714C = f10;
            C5290i.a aVarE = this.f43759b.f43782a.e();
            aVarE.f43815e = new C5282a(f10);
            aVarE.f43816f = new C5282a(f10);
            aVarE.f43817g = new C5282a(f10);
            aVarE.f43818h = new C5282a(f10);
            setShapeAppearanceModel(aVarE.a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void C(Drawable drawable) {
        Drawable drawableB;
        Drawable drawable2 = this.f22724I;
        if (drawable2 != 0) {
            boolean z10 = drawable2 instanceof c;
            drawableB = drawable2;
            if (z10) {
                drawableB = ((c) drawable2).b();
            }
        } else {
            drawableB = null;
        }
        if (drawableB != drawable) {
            float fQ = q();
            this.f22724I = drawable != null ? drawable.mutate() : null;
            float fQ2 = q();
            V(drawableB);
            if (T()) {
                o(this.f22724I);
            }
            invalidateSelf();
            if (fQ != fQ2) {
                v();
            }
        }
    }

    public final void D(float f10) {
        if (this.f22726K != f10) {
            float fQ = q();
            this.f22726K = f10;
            float fQ2 = q();
            invalidateSelf();
            if (fQ != fQ2) {
                v();
            }
        }
    }

    public final void E(ColorStateList colorStateList) {
        this.f22727L = true;
        if (this.f22725J != colorStateList) {
            this.f22725J = colorStateList;
            if (T()) {
                a.C0009a.h(this.f22724I, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void F(boolean z10) {
        if (this.f22723H != z10) {
            boolean zT = T();
            this.f22723H = z10;
            boolean zT2 = T();
            if (zT != zT2) {
                if (zT2) {
                    o(this.f22724I);
                } else {
                    V(this.f22724I);
                }
                invalidateSelf();
                v();
            }
        }
    }

    public final void G(ColorStateList colorStateList) {
        if (this.f22716D != colorStateList) {
            this.f22716D = colorStateList;
            if (this.f22722G0) {
                C5287f.b bVar = this.f43759b;
                if (bVar.f43785d != colorStateList) {
                    bVar.f43785d = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void H(float f10) {
        if (this.f22718E != f10) {
            this.f22718E = f10;
            this.f22749h0.setStrokeWidth(f10);
            if (this.f22722G0) {
                this.f43759b.f43790j = f10;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void I(Drawable drawable) {
        Drawable drawableB;
        Drawable drawable2 = this.f22729N;
        if (drawable2 != 0) {
            boolean z10 = drawable2 instanceof c;
            drawableB = drawable2;
            if (z10) {
                drawableB = ((c) drawable2).b();
            }
        } else {
            drawableB = null;
        }
        if (drawableB != drawable) {
            float fR = r();
            this.f22729N = drawable != null ? drawable.mutate() : null;
            int[] iArr = C4456a.f38452a;
            this.f22730O = new RippleDrawable(C4456a.a(this.f22720F), this.f22729N, f22709I0);
            float fR2 = r();
            V(drawableB);
            if (U()) {
                o(this.f22729N);
            }
            invalidateSelf();
            if (fR != fR2) {
                v();
            }
        }
    }

    public final void J(float f10) {
        if (this.f22746e0 != f10) {
            this.f22746e0 = f10;
            invalidateSelf();
            if (U()) {
                v();
            }
        }
    }

    public final void K(float f10) {
        if (this.f22732Q != f10) {
            this.f22732Q = f10;
            invalidateSelf();
            if (U()) {
                v();
            }
        }
    }

    public final void L(float f10) {
        if (this.f22745d0 != f10) {
            this.f22745d0 = f10;
            invalidateSelf();
            if (U()) {
                v();
            }
        }
    }

    public final void M(ColorStateList colorStateList) {
        if (this.f22731P != colorStateList) {
            this.f22731P = colorStateList;
            if (U()) {
                a.C0009a.h(this.f22729N, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void N(boolean z10) {
        if (this.f22728M != z10) {
            boolean zU = U();
            this.f22728M = z10;
            boolean zU2 = U();
            if (zU != zU2) {
                if (zU2) {
                    o(this.f22729N);
                } else {
                    V(this.f22729N);
                }
                invalidateSelf();
                v();
            }
        }
    }

    public final void O(float f10) {
        if (this.f22742a0 != f10) {
            float fQ = q();
            this.f22742a0 = f10;
            float fQ2 = q();
            invalidateSelf();
            if (fQ != fQ2) {
                v();
            }
        }
    }

    public final void P(float f10) {
        if (this.f22741Z != f10) {
            float fQ = q();
            this.f22741Z = f10;
            float fQ2 = q();
            invalidateSelf();
            if (fQ != fQ2) {
                v();
            }
        }
    }

    public final void Q(ColorStateList colorStateList) {
        if (this.f22720F != colorStateList) {
            this.f22720F = colorStateList;
            this.f22713B0 = null;
            onStateChange(getState());
        }
    }

    public final void R(C4416d c4416d) {
        h hVar = this.f22754m0;
        if (hVar.f37515f != c4416d) {
            hVar.f37515f = c4416d;
            if (c4416d != null) {
                TextPaint textPaint = hVar.f37510a;
                Context context = this.f22748g0;
                h.a aVar = hVar.f37511b;
                c4416d.f(context, textPaint, aVar);
                h.b bVar = hVar.f37514e.get();
                if (bVar != null) {
                    textPaint.drawableState = bVar.getState();
                }
                c4416d.e(context, textPaint, aVar);
                hVar.f37513d = true;
            }
            h.b bVar2 = hVar.f37514e.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    public final boolean S() {
        return this.f22735T && this.f22736U != null && this.f22761t0;
    }

    public final boolean T() {
        return this.f22723H && this.f22724I != null;
    }

    public final boolean U() {
        return this.f22728M && this.f22729N != null;
    }

    @Override // d4.h.b
    public final void a() {
        v();
        invalidateSelf();
    }

    @Override // l4.C5287f, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        Canvas canvas2;
        int iSaveLayerAlpha;
        int i10;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.f22763v0) == 0) {
            return;
        }
        if (i < 255) {
            canvas2 = canvas;
            iSaveLayerAlpha = canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i);
        } else {
            canvas2 = canvas;
            iSaveLayerAlpha = 0;
        }
        boolean z10 = this.f22722G0;
        Paint paint = this.f22749h0;
        RectF rectF = this.f22751j0;
        if (!z10) {
            paint.setColor(this.f22755n0);
            paint.setStyle(Paint.Style.FILL);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, s(), s(), paint);
        }
        if (!this.f22722G0) {
            paint.setColor(this.f22756o0);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.f22764w0;
            if (colorFilter == null) {
                colorFilter = this.f22765x0;
            }
            paint.setColorFilter(colorFilter);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, s(), s(), paint);
        }
        if (this.f22722G0) {
            super.draw(canvas);
        }
        if (this.f22718E > 0.0f && !this.f22722G0) {
            paint.setColor(this.f22758q0);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.f22722G0) {
                ColorFilter colorFilter2 = this.f22764w0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.f22765x0;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f10 = bounds.left;
            float f11 = this.f22718E / 2.0f;
            rectF.set(f10 + f11, bounds.top + f11, bounds.right - f11, bounds.bottom - f11);
            float f12 = this.f22714C - (this.f22718E / 2.0f);
            canvas2.drawRoundRect(rectF, f12, f12, paint);
        }
        paint.setColor(this.f22759r0);
        paint.setStyle(Paint.Style.FILL);
        rectF.set(bounds);
        if (this.f22722G0) {
            RectF rectF2 = new RectF(bounds);
            Path path = this.f22753l0;
            C5287f.b bVar = this.f43759b;
            this.f43775s.a(bVar.f43782a, bVar.i, rectF2, this.f43774r, path);
            e(canvas2, paint, path, this.f43759b.f43782a, g());
        } else {
            canvas2.drawRoundRect(rectF, s(), s(), paint);
        }
        if (T()) {
            p(bounds, rectF);
            float f13 = rectF.left;
            float f14 = rectF.top;
            canvas2.translate(f13, f14);
            this.f22724I.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f22724I.draw(canvas2);
            canvas2.translate(-f13, -f14);
        }
        if (S()) {
            p(bounds, rectF);
            float f15 = rectF.left;
            float f16 = rectF.top;
            canvas2.translate(f15, f16);
            this.f22736U.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f22736U.draw(canvas2);
            canvas2.translate(-f15, -f16);
        }
        if (this.f22719E0 && this.f22721G != null) {
            PointF pointF = this.f22752k0;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.f22721G;
            h hVar = this.f22754m0;
            if (charSequence != null) {
                float fQ = q() + this.f22740Y + this.f22743b0;
                if (a.b.a(this) == 0) {
                    pointF.x = bounds.left + fQ;
                } else {
                    pointF.x = bounds.right - fQ;
                    align = Paint.Align.RIGHT;
                }
                float fCenterY = bounds.centerY();
                TextPaint textPaint = hVar.f37510a;
                Paint.FontMetrics fontMetrics = this.f22750i0;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            rectF.setEmpty();
            if (this.f22721G != null) {
                float fQ2 = q() + this.f22740Y + this.f22743b0;
                float fR = r() + this.f22747f0 + this.f22744c0;
                if (a.b.a(this) == 0) {
                    rectF.left = bounds.left + fQ2;
                    rectF.right = bounds.right - fR;
                } else {
                    rectF.left = bounds.left + fR;
                    rectF.right = bounds.right - fQ2;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
            C4416d c4416d = hVar.f37515f;
            TextPaint textPaint2 = hVar.f37510a;
            if (c4416d != null) {
                textPaint2.drawableState = getState();
                hVar.f37515f.e(this.f22748g0, textPaint2, hVar.f37511b);
            }
            textPaint2.setTextAlign(align);
            boolean z11 = Math.round(hVar.a(this.f22721G.toString())) > Math.round(rectF.width());
            if (z11) {
                int iSave = canvas2.save();
                canvas2.clipRect(rectF);
                i10 = iSave;
            } else {
                i10 = 0;
            }
            CharSequence charSequenceEllipsize = this.f22721G;
            if (z11 && this.f22717D0 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint2, rectF.width(), this.f22717D0);
            }
            canvas.drawText(charSequenceEllipsize, 0, charSequenceEllipsize.length(), pointF.x, pointF.y, textPaint2);
            canvas2 = canvas;
            if (z11) {
                canvas2.restoreToCount(i10);
            }
        }
        if (U()) {
            rectF.setEmpty();
            if (U()) {
                float f17 = this.f22747f0 + this.f22746e0;
                if (a.b.a(this) == 0) {
                    float f18 = bounds.right - f17;
                    rectF.right = f18;
                    rectF.left = f18 - this.f22732Q;
                } else {
                    float f19 = bounds.left + f17;
                    rectF.left = f19;
                    rectF.right = f19 + this.f22732Q;
                }
                float fExactCenterY = bounds.exactCenterY();
                float f20 = this.f22732Q;
                float f21 = fExactCenterY - (f20 / 2.0f);
                rectF.top = f21;
                rectF.bottom = f21 + f20;
            }
            float f22 = rectF.left;
            float f23 = rectF.top;
            canvas2.translate(f22, f23);
            this.f22729N.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            int[] iArr = C4456a.f38452a;
            this.f22730O.setBounds(this.f22729N.getBounds());
            this.f22730O.jumpToCurrentState();
            this.f22730O.draw(canvas2);
            canvas2.translate(-f22, -f23);
        }
        if (this.f22763v0 < 255) {
            canvas2.restoreToCount(iSaveLayerAlpha);
        }
    }

    @Override // l4.C5287f, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f22763v0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f22764w0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f22712B;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(r() + this.f22754m0.a(this.f22721G.toString()) + q() + this.f22740Y + this.f22743b0 + this.f22744c0 + this.f22747f0), this.F0);
    }

    @Override // l4.C5287f, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // l4.C5287f, android.graphics.drawable.Drawable
    @TargetApi(21)
    public final void getOutline(Outline outline) {
        Outline outline2;
        if (this.f22722G0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f22712B, this.f22714C);
        } else {
            outline.setRoundRect(bounds, this.f22714C);
            outline2 = outline;
        }
        outline2.setAlpha(this.f22763v0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // l4.C5287f, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (t(this.f22767z) || t(this.f22710A) || t(this.f22716D)) {
            return true;
        }
        C4416d c4416d = this.f22754m0.f37515f;
        if (c4416d == null || (colorStateList = c4416d.f38232j) == null || !colorStateList.isStateful()) {
            return (this.f22735T && this.f22736U != null && this.f22734S) || u(this.f22724I) || u(this.f22736U) || t(this.f22766y0);
        }
        return true;
    }

    public final void o(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        a.b.b(drawable, a.b.a(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f22729N) {
            if (drawable.isStateful()) {
                drawable.setState(this.f22711A0);
            }
            a.C0009a.h(drawable, this.f22731P);
            return;
        }
        Drawable drawable2 = this.f22724I;
        if (drawable == drawable2 && this.f22727L) {
            a.C0009a.h(drawable2, this.f22725J);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (T()) {
            zOnLayoutDirectionChanged |= a.b.b(this.f22724I, i);
        }
        if (S()) {
            zOnLayoutDirectionChanged |= a.b.b(this.f22736U, i);
        }
        if (U()) {
            zOnLayoutDirectionChanged |= a.b.b(this.f22729N, i);
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
        if (T()) {
            zOnLevelChange |= this.f22724I.setLevel(i);
        }
        if (S()) {
            zOnLevelChange |= this.f22736U.setLevel(i);
        }
        if (U()) {
            zOnLevelChange |= this.f22729N.setLevel(i);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // l4.C5287f, android.graphics.drawable.Drawable, d4.h.b
    public final boolean onStateChange(int[] iArr) {
        if (this.f22722G0) {
            super.onStateChange(iArr);
        }
        return w(iArr, this.f22711A0);
    }

    public final void p(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (T() || S()) {
            float f10 = this.f22740Y + this.f22741Z;
            Drawable drawable = this.f22761t0 ? this.f22736U : this.f22724I;
            float intrinsicWidth = this.f22726K;
            if (intrinsicWidth <= 0.0f && drawable != null) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
            if (a.b.a(this) == 0) {
                float f11 = rect.left + f10;
                rectF.left = f11;
                rectF.right = f11 + intrinsicWidth;
            } else {
                float f12 = rect.right - f10;
                rectF.right = f12;
                rectF.left = f12 - intrinsicWidth;
            }
            Drawable drawable2 = this.f22761t0 ? this.f22736U : this.f22724I;
            float fCeil = this.f22726K;
            if (fCeil <= 0.0f && drawable2 != null) {
                fCeil = (float) Math.ceil(TypedValue.applyDimension(1, 24, this.f22748g0.getResources().getDisplayMetrics()));
                if (drawable2.getIntrinsicHeight() <= fCeil) {
                    fCeil = drawable2.getIntrinsicHeight();
                }
            }
            float fExactCenterY = rect.exactCenterY() - (fCeil / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fCeil;
        }
    }

    public final float q() {
        if (!T() && !S()) {
            return 0.0f;
        }
        float f10 = this.f22741Z;
        Drawable drawable = this.f22761t0 ? this.f22736U : this.f22724I;
        float intrinsicWidth = this.f22726K;
        if (intrinsicWidth <= 0.0f && drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        return intrinsicWidth + f10 + this.f22742a0;
    }

    public final float r() {
        if (U()) {
            return this.f22745d0 + this.f22732Q + this.f22746e0;
        }
        return 0.0f;
    }

    public final float s() {
        return this.f22722G0 ? this.f43759b.f43782a.f43804e.a(g()) : this.f22714C;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j4) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j4);
        }
    }

    @Override // l4.C5287f, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f22763v0 != i) {
            this.f22763v0 = i;
            invalidateSelf();
        }
    }

    @Override // l4.C5287f, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f22764w0 != colorFilter) {
            this.f22764w0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // l4.C5287f, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.f22766y0 != colorStateList) {
            this.f22766y0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // l4.C5287f, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.f22768z0 != mode) {
            this.f22768z0 = mode;
            ColorStateList colorStateList = this.f22766y0;
            this.f22765x0 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        if (T()) {
            visible |= this.f22724I.setVisible(z10, z11);
        }
        if (S()) {
            visible |= this.f22736U.setVisible(z10, z11);
        }
        if (U()) {
            visible |= this.f22729N.setVisible(z10, z11);
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

    public final void v() {
        InterfaceC0341a interfaceC0341a = this.f22715C0.get();
        if (interfaceC0341a != null) {
            interfaceC0341a.a();
        }
    }

    public final boolean w(int[] iArr, int[] iArr2) {
        boolean z10;
        boolean z11;
        ColorStateList colorStateList;
        boolean state = true;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.f22767z;
        int iC = c(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f22755n0) : 0);
        if (this.f22755n0 != iC) {
            this.f22755n0 = iC;
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.f22710A;
        int iC2 = c(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f22756o0) : 0);
        if (this.f22756o0 != iC2) {
            this.f22756o0 = iC2;
            zOnStateChange = true;
        }
        int iC3 = d.c(iC2, iC);
        if ((this.f22757p0 != iC3) | (this.f43759b.f43784c == null)) {
            this.f22757p0 = iC3;
            k(ColorStateList.valueOf(iC3));
            zOnStateChange = true;
        }
        ColorStateList colorStateList4 = this.f22716D;
        int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f22758q0) : 0;
        if (this.f22758q0 != colorForState) {
            this.f22758q0 = colorForState;
            zOnStateChange = true;
        }
        int colorForState2 = (this.f22713B0 == null || !C4456a.b(iArr)) ? 0 : this.f22713B0.getColorForState(iArr, this.f22759r0);
        if (this.f22759r0 != colorForState2) {
            this.f22759r0 = colorForState2;
        }
        C4416d c4416d = this.f22754m0.f37515f;
        int colorForState3 = (c4416d == null || (colorStateList = c4416d.f38232j) == null) ? 0 : colorStateList.getColorForState(iArr, this.f22760s0);
        if (this.f22760s0 != colorForState3) {
            this.f22760s0 = colorForState3;
            zOnStateChange = true;
        }
        int[] state2 = getState();
        if (state2 == null) {
            z10 = false;
        } else {
            int length = state2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (state2[i] != 16842912) {
                    i++;
                } else if (this.f22734S) {
                    z10 = true;
                }
            }
            z10 = false;
        }
        if (this.f22761t0 == z10 || this.f22736U == null) {
            z11 = false;
        } else {
            float fQ = q();
            this.f22761t0 = z10;
            if (fQ != q()) {
                zOnStateChange = true;
                z11 = true;
            } else {
                zOnStateChange = true;
                z11 = false;
            }
        }
        ColorStateList colorStateList5 = this.f22766y0;
        int colorForState4 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.f22762u0) : 0;
        if (this.f22762u0 != colorForState4) {
            this.f22762u0 = colorForState4;
            ColorStateList colorStateList6 = this.f22766y0;
            PorterDuff.Mode mode = this.f22768z0;
            this.f22765x0 = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
        } else {
            state = zOnStateChange;
        }
        if (u(this.f22724I)) {
            state |= this.f22724I.setState(iArr);
        }
        if (u(this.f22736U)) {
            state |= this.f22736U.setState(iArr);
        }
        if (u(this.f22729N)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.f22729N.setState(iArr3);
        }
        int[] iArr4 = C4456a.f38452a;
        if (u(this.f22730O)) {
            state |= this.f22730O.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z11) {
            v();
        }
        return state;
    }

    public final void x(boolean z10) {
        if (this.f22734S != z10) {
            this.f22734S = z10;
            float fQ = q();
            if (!z10 && this.f22761t0) {
                this.f22761t0 = false;
            }
            float fQ2 = q();
            invalidateSelf();
            if (fQ != fQ2) {
                v();
            }
        }
    }

    public final void y(Drawable drawable) {
        if (this.f22736U != drawable) {
            float fQ = q();
            this.f22736U = drawable;
            float fQ2 = q();
            V(this.f22736U);
            o(this.f22736U);
            invalidateSelf();
            if (fQ != fQ2) {
                v();
            }
        }
    }

    public final void z(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f22737V != colorStateList) {
            this.f22737V = colorStateList;
            if (this.f22735T && (drawable = this.f22736U) != null && this.f22734S) {
                a.C0009a.h(drawable, colorStateList);
            }
            onStateChange(getState());
        }
    }
}
