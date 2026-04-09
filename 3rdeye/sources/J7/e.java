package j7;

import N7.B8;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.l;

/* compiled from: RoundedRectDrawable.kt */
/* loaded from: classes.dex */
public final class e extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final a f43109a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f43110b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f43111c;

    /* renamed from: d, reason: collision with root package name */
    public final float f43112d;

    /* renamed from: e, reason: collision with root package name */
    public final float f43113e;

    /* renamed from: f, reason: collision with root package name */
    public final float f43114f;

    /* renamed from: g, reason: collision with root package name */
    public final float f43115g;

    /* renamed from: h, reason: collision with root package name */
    public final RectF f43116h;

    /* compiled from: RoundedRectDrawable.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final float f43117a;

        /* renamed from: b, reason: collision with root package name */
        public final float f43118b;

        /* renamed from: c, reason: collision with root package name */
        public final int f43119c;

        /* renamed from: d, reason: collision with root package name */
        public final float f43120d;

        /* renamed from: e, reason: collision with root package name */
        public final Integer f43121e;

        /* renamed from: f, reason: collision with root package name */
        public final Float f43122f;

        public a(float f10, float f11, int i, float f12, Integer num, Float f13) {
            this.f43117a = f10;
            this.f43118b = f11;
            this.f43119c = i;
            this.f43120d = f12;
            this.f43121e = num;
            this.f43122f = f13;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.f43117a, aVar.f43117a) == 0 && Float.compare(this.f43118b, aVar.f43118b) == 0 && this.f43119c == aVar.f43119c && Float.compare(this.f43120d, aVar.f43120d) == 0 && l.b(this.f43121e, aVar.f43121e) && l.b(this.f43122f, aVar.f43122f);
        }

        public final int hashCode() {
            int iG = B8.g(this.f43120d, (B8.g(this.f43118b, Float.floatToIntBits(this.f43117a) * 31, 31) + this.f43119c) * 31, 31);
            Integer num = this.f43121e;
            int iHashCode = (iG + (num == null ? 0 : num.hashCode())) * 31;
            Float f10 = this.f43122f;
            return iHashCode + (f10 != null ? f10.hashCode() : 0);
        }

        public final String toString() {
            return "Params(width=" + this.f43117a + ", height=" + this.f43118b + ", color=" + this.f43119c + ", radius=" + this.f43120d + ", strokeColor=" + this.f43121e + ", strokeWidth=" + this.f43122f + ')';
        }
    }

    public e(a aVar) {
        Float f10;
        this.f43109a = aVar;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(aVar.f43119c);
        this.f43110b = paint;
        float f11 = 2;
        float f12 = aVar.f43118b;
        float f13 = f12 / f11;
        float f14 = aVar.f43120d;
        this.f43114f = f14 - (f14 >= f13 ? this.f43112d : 0.0f);
        float f15 = aVar.f43117a;
        this.f43115g = f14 - (f14 >= f15 / f11 ? this.f43112d : 0.0f);
        RectF rectF = new RectF(0.0f, 0.0f, f15, f12);
        this.f43116h = rectF;
        Integer num = aVar.f43121e;
        if (num == null || (f10 = aVar.f43122f) == null) {
            this.f43111c = null;
            this.f43112d = 0.0f;
            this.f43113e = 0.0f;
        } else {
            Paint paint2 = new Paint(1);
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setColor(num.intValue());
            paint2.setStrokeWidth(f10.floatValue());
            this.f43111c = paint2;
            this.f43112d = f10.floatValue() / f11;
            this.f43113e = 1.0f;
        }
        Rect rect = new Rect();
        rectF.roundOut(rect);
        setBounds(rect);
    }

    public final void a(float f10) {
        Rect bounds = getBounds();
        this.f43116h.set(bounds.left + f10, bounds.top + f10, bounds.right - f10, bounds.bottom - f10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        l.f(canvas, "canvas");
        a(this.f43113e);
        RectF rectF = this.f43116h;
        canvas.drawRoundRect(rectF, this.f43114f, this.f43115g, this.f43110b);
        Paint paint = this.f43111c;
        if (paint != null) {
            a(this.f43112d);
            float f10 = this.f43109a.f43120d;
            canvas.drawRoundRect(rectF, f10, f10, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f43109a.f43118b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return (int) this.f43109a.f43117a;
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
