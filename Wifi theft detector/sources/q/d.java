package q;

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
public class d extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public float f23929a;

    /* renamed from: c, reason: collision with root package name */
    public final RectF f23931c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f23932d;

    /* renamed from: e, reason: collision with root package name */
    public float f23933e;

    /* renamed from: h, reason: collision with root package name */
    public ColorStateList f23936h;

    /* renamed from: i, reason: collision with root package name */
    public PorterDuffColorFilter f23937i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f23938j;

    /* renamed from: f, reason: collision with root package name */
    public boolean f23934f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f23935g = true;

    /* renamed from: k, reason: collision with root package name */
    public PorterDuff.Mode f23939k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f23930b = new Paint(5);

    public d(ColorStateList colorStateList, float f10) {
        this.f23929a = f10;
        e(colorStateList);
        this.f23931c = new RectF();
        this.f23932d = new Rect();
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public ColorStateList b() {
        return this.f23936h;
    }

    public float c() {
        return this.f23933e;
    }

    public float d() {
        return this.f23929a;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z10;
        Paint paint = this.f23930b;
        if (this.f23937i == null || paint.getColorFilter() != null) {
            z10 = false;
        } else {
            paint.setColorFilter(this.f23937i);
            z10 = true;
        }
        RectF rectF = this.f23931c;
        float f10 = this.f23929a;
        canvas.drawRoundRect(rectF, f10, f10, paint);
        if (z10) {
            paint.setColorFilter(null);
        }
    }

    public final void e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f23936h = colorStateList;
        this.f23930b.setColor(colorStateList.getColorForState(getState(), this.f23936h.getDefaultColor()));
    }

    public void f(ColorStateList colorStateList) {
        e(colorStateList);
        invalidateSelf();
    }

    public void g(float f10, boolean z10, boolean z11) {
        if (f10 == this.f23933e && this.f23934f == z10 && this.f23935g == z11) {
            return;
        }
        this.f23933e = f10;
        this.f23934f = z10;
        this.f23935g = z11;
        i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f23932d, this.f23929a);
    }

    public void h(float f10) {
        if (f10 == this.f23929a) {
            return;
        }
        this.f23929a = f10;
        i(null);
        invalidateSelf();
    }

    public final void i(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f23931c.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f23932d.set(rect);
        if (this.f23934f) {
            this.f23932d.inset((int) Math.ceil(e.a(this.f23933e, this.f23929a, this.f23935g)), (int) Math.ceil(e.b(this.f23933e, this.f23929a, this.f23935g)));
            this.f23931c.set(this.f23932d);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f23938j;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f23936h;
        return (colorStateList2 != null && colorStateList2.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        i(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f23936h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z10 = colorForState != this.f23930b.getColor();
        if (z10) {
            this.f23930b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f23938j;
        if (colorStateList2 == null || (mode = this.f23939k) == null) {
            return z10;
        }
        this.f23937i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f23930b.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f23930b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f23938j = colorStateList;
        this.f23937i = a(colorStateList, this.f23939k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f23939k = mode;
        this.f23937i = a(this.f23938j, mode);
        invalidateSelf();
    }
}
