package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
class f extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    private float f1244a;

    /* renamed from: c, reason: collision with root package name */
    private final RectF f1246c;

    /* renamed from: d, reason: collision with root package name */
    private final Rect f1247d;

    /* renamed from: e, reason: collision with root package name */
    private float f1248e;

    /* renamed from: h, reason: collision with root package name */
    private ColorStateList f1251h;

    /* renamed from: i, reason: collision with root package name */
    private PorterDuffColorFilter f1252i;

    /* renamed from: j, reason: collision with root package name */
    private ColorStateList f1253j;

    /* renamed from: f, reason: collision with root package name */
    private boolean f1249f = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f1250g = true;

    /* renamed from: k, reason: collision with root package name */
    private PorterDuff.Mode f1254k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    private final Paint f1245b = new Paint(5);

    f(ColorStateList colorStateList, float f2) {
        this.f1244a = f2;
        e(colorStateList);
        this.f1246c = new RectF();
        this.f1247d = new Rect();
    }

    private PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    private void e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f1251h = colorStateList;
        this.f1245b.setColor(colorStateList.getColorForState(getState(), this.f1251h.getDefaultColor()));
    }

    private void i(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f1246c.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f1247d.set(rect);
        if (this.f1249f) {
            this.f1247d.inset((int) Math.ceil(g.c(this.f1248e, this.f1244a, this.f1250g)), (int) Math.ceil(g.d(this.f1248e, this.f1244a, this.f1250g)));
            this.f1246c.set(this.f1247d);
        }
    }

    public ColorStateList b() {
        return this.f1251h;
    }

    float c() {
        return this.f1248e;
    }

    public float d() {
        return this.f1244a;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z2;
        Paint paint = this.f1245b;
        if (this.f1252i == null || paint.getColorFilter() != null) {
            z2 = false;
        } else {
            paint.setColorFilter(this.f1252i);
            z2 = true;
        }
        RectF rectF = this.f1246c;
        float f2 = this.f1244a;
        canvas.drawRoundRect(rectF, f2, f2, paint);
        if (z2) {
            paint.setColorFilter(null);
        }
    }

    public void f(ColorStateList colorStateList) {
        e(colorStateList);
        invalidateSelf();
    }

    void g(float f2, boolean z2, boolean z3) {
        if (f2 == this.f1248e && this.f1249f == z2 && this.f1250g == z3) {
            return;
        }
        this.f1248e = f2;
        this.f1249f = z2;
        this.f1250g = z3;
        i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f1247d, this.f1244a);
    }

    void h(float f2) {
        if (f2 == this.f1244a) {
            return;
        }
        this.f1244a = f2;
        i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f1253j;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f1251h) != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        i(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f1251h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z2 = colorForState != this.f1245b.getColor();
        if (z2) {
            this.f1245b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f1253j;
        if (colorStateList2 == null || (mode = this.f1254k) == null) {
            return z2;
        }
        this.f1252i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.f1245b.setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f1245b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f1253j = colorStateList;
        this.f1252i = a(colorStateList, this.f1254k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f1254k = mode;
        this.f1252i = a(this.f1253j, mode);
        invalidateSelf();
    }
}
