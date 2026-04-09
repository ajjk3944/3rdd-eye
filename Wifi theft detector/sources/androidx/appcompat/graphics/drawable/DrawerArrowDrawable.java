package androidx.appcompat.graphics.drawable;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.RestrictTo;
import c.a;
import c.i;
import c.j;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public class DrawerArrowDrawable extends Drawable {

    /* renamed from: m, reason: collision with root package name */
    public static final float f604m = (float) Math.toRadians(45.0d);

    /* renamed from: a, reason: collision with root package name */
    public final Paint f605a;

    /* renamed from: b, reason: collision with root package name */
    public float f606b;

    /* renamed from: c, reason: collision with root package name */
    public float f607c;

    /* renamed from: d, reason: collision with root package name */
    public float f608d;

    /* renamed from: e, reason: collision with root package name */
    public float f609e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f610f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f611g;

    /* renamed from: h, reason: collision with root package name */
    public final int f612h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f613i;

    /* renamed from: j, reason: collision with root package name */
    public float f614j;

    /* renamed from: k, reason: collision with root package name */
    public float f615k;

    /* renamed from: l, reason: collision with root package name */
    public int f616l;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface ArrowDirection {
    }

    public DrawerArrowDrawable(Context context) {
        Paint paint = new Paint();
        this.f605a = paint;
        this.f611g = new Path();
        this.f613i = false;
        this.f616l = 2;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, j.DrawerArrowToggle, a.drawerArrowStyle, i.Base_Widget_AppCompat_DrawerArrowToggle);
        c(typedArrayObtainStyledAttributes.getColor(j.DrawerArrowToggle_color, 0));
        b(typedArrayObtainStyledAttributes.getDimension(j.DrawerArrowToggle_thickness, 0.0f));
        f(typedArrayObtainStyledAttributes.getBoolean(j.DrawerArrowToggle_spinBars, true));
        d(Math.round(typedArrayObtainStyledAttributes.getDimension(j.DrawerArrowToggle_gapBetweenBars, 0.0f)));
        this.f612h = typedArrayObtainStyledAttributes.getDimensionPixelSize(j.DrawerArrowToggle_drawableSize, 0);
        this.f607c = Math.round(typedArrayObtainStyledAttributes.getDimension(j.DrawerArrowToggle_barLength, 0.0f));
        this.f606b = Math.round(typedArrayObtainStyledAttributes.getDimension(j.DrawerArrowToggle_arrowHeadLength, 0.0f));
        this.f608d = typedArrayObtainStyledAttributes.getDimension(j.DrawerArrowToggle_arrowShaftLength, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static float a(float f10, float f11, float f12) {
        return f10 + ((f11 - f10) * f12);
    }

    public void b(float f10) {
        if (this.f605a.getStrokeWidth() != f10) {
            this.f605a.setStrokeWidth(f10);
            this.f615k = (float) ((f10 / 2.0f) * Math.cos(f604m));
            invalidateSelf();
        }
    }

    public void c(int i10) {
        if (i10 != this.f605a.getColor()) {
            this.f605a.setColor(i10);
            invalidateSelf();
        }
    }

    public void d(float f10) {
        if (f10 != this.f609e) {
            this.f609e = f10;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int i10 = this.f616l;
        boolean z10 = false;
        if (i10 != 0 && (i10 == 1 || (i10 == 3 ? k0.a.f(this) == 0 : k0.a.f(this) == 1))) {
            z10 = true;
        }
        float f10 = this.f606b;
        float fA = a(this.f607c, (float) Math.sqrt(f10 * f10 * 2.0f), this.f614j);
        float fA2 = a(this.f607c, this.f608d, this.f614j);
        float fRound = Math.round(a(0.0f, this.f615k, this.f614j));
        float fA3 = a(0.0f, f604m, this.f614j);
        float fA4 = a(z10 ? 0.0f : -180.0f, z10 ? 180.0f : 0.0f, this.f614j);
        double d10 = fA;
        double d11 = fA3;
        boolean z11 = z10;
        float fRound2 = Math.round(Math.cos(d11) * d10);
        float fRound3 = Math.round(d10 * Math.sin(d11));
        this.f611g.rewind();
        float fA5 = a(this.f609e + this.f605a.getStrokeWidth(), -this.f615k, this.f614j);
        float f11 = (-fA2) / 2.0f;
        this.f611g.moveTo(f11 + fRound, 0.0f);
        this.f611g.rLineTo(fA2 - (fRound * 2.0f), 0.0f);
        this.f611g.moveTo(f11, fA5);
        this.f611g.rLineTo(fRound2, fRound3);
        this.f611g.moveTo(f11, -fA5);
        this.f611g.rLineTo(fRound2, -fRound3);
        this.f611g.close();
        canvas.save();
        float strokeWidth = this.f605a.getStrokeWidth();
        float fHeight = bounds.height() - (3.0f * strokeWidth);
        canvas.translate(bounds.centerX(), ((((int) (fHeight - (r5 * 2.0f))) / 4) * 2) + (strokeWidth * 1.5f) + this.f609e);
        if (this.f610f) {
            canvas.rotate(fA4 * (this.f613i ^ z11 ? -1 : 1));
        } else if (z11) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(this.f611g, this.f605a);
        canvas.restore();
    }

    public void e(float f10) {
        if (this.f614j != f10) {
            this.f614j = f10;
            invalidateSelf();
        }
    }

    public void f(boolean z10) {
        if (this.f610f != z10) {
            this.f610f = z10;
            invalidateSelf();
        }
    }

    public void g(boolean z10) {
        if (this.f613i != z10) {
            this.f613i = z10;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f612h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f612h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (i10 != this.f605a.getAlpha()) {
            this.f605a.setAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f605a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
