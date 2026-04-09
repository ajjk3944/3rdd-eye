package j;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.apm.insight.R;
import com.google.android.gms.internal.ads.AbstractC1135f5;
import g.AbstractC2327a;

/* renamed from: j.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2540f extends Drawable {

    /* renamed from: l, reason: collision with root package name */
    public static final float f21281l = (float) Math.toRadians(45.0d);

    /* renamed from: a, reason: collision with root package name */
    public final Paint f21282a;

    /* renamed from: b, reason: collision with root package name */
    public final float f21283b;

    /* renamed from: c, reason: collision with root package name */
    public final float f21284c;

    /* renamed from: d, reason: collision with root package name */
    public final float f21285d;

    /* renamed from: e, reason: collision with root package name */
    public final float f21286e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f21287f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f21288g;

    /* renamed from: h, reason: collision with root package name */
    public final int f21289h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public final float f21290j;

    /* renamed from: k, reason: collision with root package name */
    public final int f21291k;

    public C2540f(Context context) {
        Paint paint = new Paint();
        this.f21282a = paint;
        this.f21288g = new Path();
        this.f21291k = 2;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, AbstractC2327a.f20126n, R.attr.drawerArrowStyle, R.style.Base_Widget_AppCompat_DrawerArrowToggle);
        int color = typedArrayObtainStyledAttributes.getColor(3, 0);
        if (color != paint.getColor()) {
            paint.setColor(color);
            invalidateSelf();
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(7, 0.0f);
        if (paint.getStrokeWidth() != dimension) {
            paint.setStrokeWidth(dimension);
            this.f21290j = (float) (Math.cos(f21281l) * (dimension / 2.0f));
            invalidateSelf();
        }
        boolean z6 = typedArrayObtainStyledAttributes.getBoolean(6, true);
        if (this.f21287f != z6) {
            this.f21287f = z6;
            invalidateSelf();
        }
        float fRound = Math.round(typedArrayObtainStyledAttributes.getDimension(5, 0.0f));
        if (fRound != this.f21286e) {
            this.f21286e = fRound;
            invalidateSelf();
        }
        this.f21289h = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0);
        this.f21284c = Math.round(typedArrayObtainStyledAttributes.getDimension(2, 0.0f));
        this.f21283b = Math.round(typedArrayObtainStyledAttributes.getDimension(0, 0.0f));
        this.f21285d = typedArrayObtainStyledAttributes.getDimension(1, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static float a(float f2, float f5, float f6) {
        return AbstractC1135f5.h(f5, f2, f6, f2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        boolean z6 = false;
        int i = this.f21291k;
        if (i != 0 && (i == 1 || (i == 3 ? getLayoutDirection() == 0 : getLayoutDirection() == 1))) {
            z6 = true;
        }
        float f2 = this.f21283b;
        float fSqrt = (float) Math.sqrt(f2 * f2 * 2.0f);
        float f5 = this.i;
        float f6 = this.f21284c;
        float fA = a(f6, fSqrt, f5);
        float fA2 = a(f6, this.f21285d, this.i);
        float fRound = Math.round(a(0.0f, this.f21290j, this.i));
        float fA3 = a(0.0f, f21281l, this.i);
        float fA4 = a(z6 ? 0.0f : -180.0f, z6 ? 180.0f : 0.0f, this.i);
        double d6 = fA;
        double d7 = fA3;
        float fRound2 = Math.round(Math.cos(d7) * d6);
        float fRound3 = Math.round(Math.sin(d7) * d6);
        Path path = this.f21288g;
        path.rewind();
        float f7 = this.f21286e;
        Paint paint = this.f21282a;
        float fA5 = a(f7 + paint.getStrokeWidth(), -this.f21290j, this.i);
        float f8 = (-fA2) / 2.0f;
        path.moveTo(f8 + fRound, 0.0f);
        path.rLineTo(fA2 - (fRound * 2.0f), 0.0f);
        path.moveTo(f8, fA5);
        path.rLineTo(fRound2, fRound3);
        path.moveTo(f8, -fA5);
        path.rLineTo(fRound2, -fRound3);
        path.close();
        canvas.save();
        float strokeWidth = paint.getStrokeWidth();
        float fHeight = bounds.height() - (3.0f * strokeWidth);
        canvas.translate(bounds.centerX(), (strokeWidth * 1.5f) + this.f21286e + ((((int) (fHeight - (r7 * 2.0f))) / 4) * 2));
        if (this.f21287f) {
            canvas.rotate(fA4 * (z6 ? -1 : 1));
        } else if (z6) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(path, paint);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f21289h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f21289h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Paint paint = this.f21282a;
        if (i != paint.getAlpha()) {
            paint.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f21282a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setProgress(float f2) {
        if (this.i != f2) {
            this.i = f2;
            invalidateSelf();
        }
    }
}
