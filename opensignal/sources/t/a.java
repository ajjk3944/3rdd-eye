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

/* loaded from: classes.dex */
public final class a extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public float f22364a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f22365b;

    /* renamed from: c, reason: collision with root package name */
    public final RectF f22366c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f22367d;

    /* renamed from: e, reason: collision with root package name */
    public float f22368e;

    /* renamed from: h, reason: collision with root package name */
    public ColorStateList f22371h;

    /* renamed from: i, reason: collision with root package name */
    public PorterDuffColorFilter f22372i;
    public ColorStateList j;

    /* renamed from: f, reason: collision with root package name */
    public boolean f22369f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f22370g = true;
    public PorterDuff.Mode k = PorterDuff.Mode.SRC_IN;

    public a(ColorStateList colorStateList, float f10) {
        this.f22364a = f10;
        Paint paint = new Paint(5);
        this.f22365b = paint;
        colorStateList = colorStateList == null ? ColorStateList.valueOf(0) : colorStateList;
        this.f22371h = colorStateList;
        paint.setColor(colorStateList.getColorForState(getState(), this.f22371h.getDefaultColor()));
        this.f22366c = new RectF();
        this.f22367d = new Rect();
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
        float f10 = rect.left;
        float f11 = rect.top;
        float f12 = rect.right;
        float f13 = rect.bottom;
        RectF rectF = this.f22366c;
        rectF.set(f10, f11, f12, f13);
        Rect rect2 = this.f22367d;
        rect2.set(rect);
        if (this.f22369f) {
            rect2.inset((int) Math.ceil(b.a(this.f22368e, this.f22364a, this.f22370g)), (int) Math.ceil(b.b(this.f22368e, this.f22364a, this.f22370g)));
            rectF.set(rect2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z10;
        PorterDuffColorFilter porterDuffColorFilter = this.f22372i;
        Paint paint = this.f22365b;
        if (porterDuffColorFilter == null || paint.getColorFilter() != null) {
            z10 = false;
        } else {
            paint.setColorFilter(this.f22372i);
            z10 = true;
        }
        RectF rectF = this.f22366c;
        float f10 = this.f22364a;
        canvas.drawRoundRect(rectF, f10, f10, paint);
        if (z10) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.f22367d, this.f22364a);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.j;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f22371h;
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
        ColorStateList colorStateList = this.f22371h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.f22365b;
        boolean z10 = colorForState != paint.getColor();
        if (z10) {
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.j;
        if (colorStateList2 == null || (mode = this.k) == null) {
            return z10;
        }
        this.f22372i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.f22365b.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f22365b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.j = colorStateList;
        this.f22372i = a(colorStateList, this.k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.k = mode;
        this.f22372i = a(this.j, mode);
        invalidateSelf();
    }
}
