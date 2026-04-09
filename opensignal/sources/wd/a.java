package wd;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import d5.o0;
import ee.l;
import ee.m;

/* loaded from: classes.dex */
public final class a extends Drawable {

    /* renamed from: b, reason: collision with root package name */
    public final Paint f24417b;

    /* renamed from: h, reason: collision with root package name */
    public float f24423h;

    /* renamed from: i, reason: collision with root package name */
    public int f24424i;
    public int j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public int f24425l;

    /* renamed from: m, reason: collision with root package name */
    public int f24426m;

    /* renamed from: o, reason: collision with root package name */
    public l f24428o;

    /* renamed from: p, reason: collision with root package name */
    public ColorStateList f24429p;

    /* renamed from: a, reason: collision with root package name */
    public final o0 f24416a = m.f8134a;

    /* renamed from: c, reason: collision with root package name */
    public final Path f24418c = new Path();

    /* renamed from: d, reason: collision with root package name */
    public final Rect f24419d = new Rect();

    /* renamed from: e, reason: collision with root package name */
    public final RectF f24420e = new RectF();

    /* renamed from: f, reason: collision with root package name */
    public final RectF f24421f = new RectF();

    /* renamed from: g, reason: collision with root package name */
    public final u7.e f24422g = new u7.e(this);

    /* renamed from: n, reason: collision with root package name */
    public boolean f24427n = true;

    public a(l lVar) {
        this.f24428o = lVar;
        Paint paint = new Paint(1);
        this.f24417b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z10 = this.f24427n;
        Rect rect = this.f24419d;
        Paint paint = this.f24417b;
        if (z10) {
            copyBounds(rect);
            float fHeight = this.f24423h / rect.height();
            paint.setShader(new LinearGradient(0.0f, rect.top, 0.0f, rect.bottom, new int[]{k3.c.b(this.f24424i, this.f24426m), k3.c.b(this.j, this.f24426m), k3.c.b(k3.c.d(this.j, 0), this.f24426m), k3.c.b(k3.c.d(this.f24425l, 0), this.f24426m), k3.c.b(this.f24425l, this.f24426m), k3.c.b(this.k, this.f24426m)}, new float[]{0.0f, fHeight, 0.5f, 0.5f, 1.0f - fHeight, 1.0f}, Shader.TileMode.CLAMP));
            this.f24427n = false;
        }
        float strokeWidth = paint.getStrokeWidth() / 2.0f;
        copyBounds(rect);
        RectF rectF = this.f24420e;
        rectF.set(rect);
        ee.d dVar = this.f24428o.f8128e;
        Rect bounds = getBounds();
        RectF rectF2 = this.f24421f;
        rectF2.set(bounds);
        float fMin = Math.min(dVar.a(rectF2), rectF.width() / 2.0f);
        l lVar = this.f24428o;
        rectF2.set(getBounds());
        if (lVar.f(rectF2)) {
            rectF.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(rectF, fMin, fMin, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f24422g;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f24423h > 0.0f ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        l lVar = this.f24428o;
        Rect bounds = getBounds();
        RectF rectF = this.f24421f;
        rectF.set(bounds);
        if (lVar.f(rectF)) {
            ee.d dVar = this.f24428o.f8128e;
            rectF.set(getBounds());
            outline.setRoundRect(getBounds(), dVar.a(rectF));
            return;
        }
        Rect rect = this.f24419d;
        copyBounds(rect);
        RectF rectF2 = this.f24420e;
        rectF2.set(rect);
        l lVar2 = this.f24428o;
        o0 o0Var = this.f24416a;
        Path path = this.f24418c;
        o0Var.b(lVar2, null, 1.0f, rectF2, null, path);
        ba.m.Q(outline, path);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        l lVar = this.f24428o;
        Rect bounds = getBounds();
        RectF rectF = this.f24421f;
        rectF.set(bounds);
        if (!lVar.f(rectF)) {
            return true;
        }
        int iRound = Math.round(this.f24423h);
        rect.set(iRound, iRound, iRound, iRound);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.f24429p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f24427n = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f24429p;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.f24426m)) != this.f24426m) {
            this.f24427n = true;
            this.f24426m = colorForState;
        }
        if (this.f24427n) {
            invalidateSelf();
        }
        return this.f24427n;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.f24417b.setAlpha(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f24417b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
