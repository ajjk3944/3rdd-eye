package yc;

import a4.l;
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
import com.google.android.gms.internal.ads.wj0;
import ed.o;
import ed.p;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a extends Drawable {

    /* renamed from: b, reason: collision with root package name */
    public final Paint f37519b;

    /* renamed from: h, reason: collision with root package name */
    public float f37524h;

    /* renamed from: i, reason: collision with root package name */
    public int f37525i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public int f37526k;

    /* renamed from: l, reason: collision with root package name */
    public int f37527l;

    /* renamed from: m, reason: collision with root package name */
    public int f37528m;

    /* renamed from: o, reason: collision with root package name */
    public o f37530o;

    /* renamed from: p, reason: collision with root package name */
    public ColorStateList f37531p;

    /* renamed from: a, reason: collision with root package name */
    public final wj0 f37518a = p.f23363a;

    /* renamed from: c, reason: collision with root package name */
    public final Path f37520c = new Path();

    /* renamed from: d, reason: collision with root package name */
    public final Rect f37521d = new Rect();

    /* renamed from: e, reason: collision with root package name */
    public final RectF f37522e = new RectF();

    /* renamed from: f, reason: collision with root package name */
    public final RectF f37523f = new RectF();
    public final k6.d g = new k6.d(this);

    /* renamed from: n, reason: collision with root package name */
    public boolean f37529n = true;

    public a(o oVar) {
        this.f37530o = oVar;
        Paint paint = new Paint(1);
        this.f37519b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z3 = this.f37529n;
        Rect rect = this.f37521d;
        Paint paint = this.f37519b;
        if (z3) {
            copyBounds(rect);
            float fHeight = this.f37524h / rect.height();
            paint.setShader(new LinearGradient(0.0f, rect.top, 0.0f, rect.bottom, new int[]{v3.a.b(this.f37525i, this.f37528m), v3.a.b(this.j, this.f37528m), v3.a.b(v3.a.d(this.j, 0), this.f37528m), v3.a.b(v3.a.d(this.f37527l, 0), this.f37528m), v3.a.b(this.f37527l, this.f37528m), v3.a.b(this.f37526k, this.f37528m)}, new float[]{0.0f, fHeight, 0.5f, 0.5f, 1.0f - fHeight, 1.0f}, Shader.TileMode.CLAMP));
            this.f37529n = false;
        }
        float strokeWidth = paint.getStrokeWidth() / 2.0f;
        copyBounds(rect);
        RectF rectF = this.f37522e;
        rectF.set(rect);
        ed.d dVar = this.f37530o.f23357e;
        Rect bounds = getBounds();
        RectF rectF2 = this.f37523f;
        rectF2.set(bounds);
        float fMin = Math.min(dVar.a(rectF2), rectF.width() / 2.0f);
        o oVar = this.f37530o;
        rectF2.set(getBounds());
        if (oVar.f(rectF2)) {
            rectF.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(rectF, fMin, fMin, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.g;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f37524h > 0.0f ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        o oVar = this.f37530o;
        Rect bounds = getBounds();
        RectF rectF = this.f37523f;
        rectF.set(bounds);
        if (oVar.f(rectF)) {
            ed.d dVar = this.f37530o.f23357e;
            rectF.set(getBounds());
            outline.setRoundRect(getBounds(), dVar.a(rectF));
            return;
        }
        Rect rect = this.f37521d;
        copyBounds(rect);
        RectF rectF2 = this.f37522e;
        rectF2.set(rect);
        o oVar2 = this.f37530o;
        wj0 wj0Var = this.f37518a;
        Path path = this.f37520c;
        wj0Var.b(oVar2, null, 1.0f, rectF2, null, path);
        l.i(outline, path);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        o oVar = this.f37530o;
        Rect bounds = getBounds();
        RectF rectF = this.f37523f;
        rectF.set(bounds);
        if (!oVar.f(rectF)) {
            return true;
        }
        int iRound = Math.round(this.f37524h);
        rect.set(iRound, iRound, iRound, iRound);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.f37531p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f37529n = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f37531p;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.f37528m)) != this.f37528m) {
            this.f37529n = true;
            this.f37528m = colorForState;
        }
        if (this.f37529n) {
            invalidateSelf();
        }
        return this.f37529n;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i4) {
        this.f37519b.setAlpha(i4);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f37519b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
