package t;

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

/* renamed from: t.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2900b extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public float f23510a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f23511b;

    /* renamed from: c, reason: collision with root package name */
    public final RectF f23512c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f23513d;

    /* renamed from: e, reason: collision with root package name */
    public float f23514e;

    /* renamed from: h, reason: collision with root package name */
    public ColorStateList f23517h;
    public PorterDuffColorFilter i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f23518j;

    /* renamed from: f, reason: collision with root package name */
    public boolean f23515f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f23516g = true;

    /* renamed from: k, reason: collision with root package name */
    public PorterDuff.Mode f23519k = PorterDuff.Mode.SRC_IN;

    public C2900b(ColorStateList colorStateList, float f2) {
        this.f23510a = f2;
        Paint paint = new Paint(5);
        this.f23511b = paint;
        colorStateList = colorStateList == null ? ColorStateList.valueOf(0) : colorStateList;
        this.f23517h = colorStateList;
        paint.setColor(colorStateList.getColorForState(getState(), this.f23517h.getDefaultColor()));
        this.f23512c = new RectF();
        this.f23513d = new Rect();
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public final void b(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        float f2 = rect.left;
        float f5 = rect.top;
        float f6 = rect.right;
        float f7 = rect.bottom;
        RectF rectF = this.f23512c;
        rectF.set(f2, f5, f6, f7);
        Rect rect2 = this.f23513d;
        rect2.set(rect);
        if (this.f23515f) {
            rect2.inset((int) Math.ceil(AbstractC2901c.a(this.f23514e, this.f23510a, this.f23516g)), (int) Math.ceil(AbstractC2901c.b(this.f23514e, this.f23510a, this.f23516g)));
            rectF.set(rect2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z6;
        PorterDuffColorFilter porterDuffColorFilter = this.i;
        Paint paint = this.f23511b;
        if (porterDuffColorFilter == null || paint.getColorFilter() != null) {
            z6 = false;
        } else {
            paint.setColorFilter(this.i);
            z6 = true;
        }
        RectF rectF = this.f23512c;
        float f2 = this.f23510a;
        canvas.drawRoundRect(rectF, f2, f2, paint);
        if (z6) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.f23513d, this.f23510a);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.f23518j;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f23517h;
        return (colorStateList2 != null && colorStateList2.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        b(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f23517h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.f23511b;
        boolean z6 = colorForState != paint.getColor();
        if (z6) {
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f23518j;
        if (colorStateList2 == null || (mode = this.f23519k) == null) {
            return z6;
        }
        this.i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f23511b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f23511b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f23518j = colorStateList;
        this.i = a(colorStateList, this.f23519k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f23519k = mode;
        this.i = a(this.f23518j, mode);
        invalidateSelf();
    }
}
