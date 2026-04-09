package j7;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import k7.C5248a;
import kotlin.jvm.internal.l;

/* compiled from: LinearGradientDrawable.kt */
/* loaded from: classes.dex */
public final class b extends Drawable {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f43080e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final float f43081a;

    /* renamed from: b, reason: collision with root package name */
    public final C5248a f43082b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f43083c;

    /* renamed from: d, reason: collision with root package name */
    public final RectF f43084d;

    /* compiled from: LinearGradientDrawable.kt */
    public static final class a {
        public static LinearGradient a(float f10, int[] colors, float[] fArr, int i, int i10) {
            l.f(colors, "colors");
            float f11 = i;
            float f12 = f11 / 2.0f;
            float f13 = i10;
            float f14 = f13 / 2.0f;
            double d10 = (float) ((f10 * 3.141592653589793d) / 180.0f);
            float fAbs = Math.abs(f13 * ((float) Math.sin(d10))) + Math.abs(f11 * ((float) Math.cos(d10)));
            float fCos = (((float) Math.cos(d10)) * fAbs) / 2.0f;
            if (Math.abs(0.0f - fCos) <= 1.0E-4f) {
                fCos = 0.0f;
            }
            float fSin = (((float) Math.sin(d10)) * fAbs) / 2.0f;
            float f15 = Math.abs(0.0f - fSin) > 1.0E-4f ? fSin : 0.0f;
            return new LinearGradient(f12 - fCos, f14 + f15, f12 + fCos, f14 - f15, colors, fArr, Shader.TileMode.CLAMP);
        }
    }

    public b(float f10, C5248a colormap) {
        l.f(colormap, "colormap");
        this.f43081a = f10;
        this.f43082b = colormap;
        this.f43083c = new Paint();
        this.f43084d = new RectF();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        l.f(canvas, "canvas");
        canvas.drawRect(this.f43084d, this.f43083c);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f43083c.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect bounds) {
        l.f(bounds, "bounds");
        super.onBoundsChange(bounds);
        Paint paint = this.f43083c;
        C5248a c5248a = this.f43082b;
        paint.setShader(a.a(this.f43081a, c5248a.f43428a, c5248a.f43429b, bounds.width(), bounds.height()));
        this.f43084d.set(bounds);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f43083c.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
