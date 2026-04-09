package j7;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.l;

/* compiled from: CircleDrawable.kt */
/* renamed from: j7.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5198a extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final C0479a f43072a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f43073b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f43074c;

    /* renamed from: d, reason: collision with root package name */
    public final RectF f43075d;

    /* compiled from: CircleDrawable.kt */
    /* renamed from: j7.a$a, reason: collision with other inner class name */
    public static final class C0479a {

        /* renamed from: a, reason: collision with root package name */
        public final float f43076a;

        /* renamed from: b, reason: collision with root package name */
        public final int f43077b;

        /* renamed from: c, reason: collision with root package name */
        public final Integer f43078c;

        /* renamed from: d, reason: collision with root package name */
        public final Float f43079d;

        public C0479a(float f10, int i, Integer num, Float f11) {
            this.f43076a = f10;
            this.f43077b = i;
            this.f43078c = num;
            this.f43079d = f11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0479a)) {
                return false;
            }
            C0479a c0479a = (C0479a) obj;
            return Float.compare(this.f43076a, c0479a.f43076a) == 0 && this.f43077b == c0479a.f43077b && l.b(this.f43078c, c0479a.f43078c) && l.b(this.f43079d, c0479a.f43079d);
        }

        public final int hashCode() {
            int iFloatToIntBits = ((Float.floatToIntBits(this.f43076a) * 31) + this.f43077b) * 31;
            Integer num = this.f43078c;
            int iHashCode = (iFloatToIntBits + (num == null ? 0 : num.hashCode())) * 31;
            Float f10 = this.f43079d;
            return iHashCode + (f10 != null ? f10.hashCode() : 0);
        }

        public final String toString() {
            return "Params(radius=" + this.f43076a + ", color=" + this.f43077b + ", strokeColor=" + this.f43078c + ", strokeWidth=" + this.f43079d + ')';
        }
    }

    public C5198a(C0479a c0479a) {
        Paint paint;
        Float f10;
        this.f43072a = c0479a;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(c0479a.f43077b);
        this.f43073b = paint2;
        Integer num = c0479a.f43078c;
        if (num == null || (f10 = c0479a.f43079d) == null) {
            paint = null;
        } else {
            paint = new Paint(1);
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(num.intValue());
            paint.setStrokeWidth(f10.floatValue());
        }
        this.f43074c = paint;
        float f11 = c0479a.f43076a * 2;
        RectF rectF = new RectF(0.0f, 0.0f, f11, f11);
        this.f43075d = rectF;
        Rect rect = new Rect();
        rectF.roundOut(rect);
        setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        l.f(canvas, "canvas");
        Paint paint = this.f43073b;
        C0479a c0479a = this.f43072a;
        paint.setColor(c0479a.f43077b);
        RectF rectF = this.f43075d;
        rectF.set(getBounds());
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), c0479a.f43076a, paint);
        Paint paint2 = this.f43074c;
        if (paint2 != null) {
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), c0479a.f43076a, paint2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return ((int) this.f43072a.f43076a) * 2;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return ((int) this.f43072a.f43076a) * 2;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
