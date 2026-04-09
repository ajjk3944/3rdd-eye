package w;

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

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public float f36380a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f36381b;

    /* renamed from: c, reason: collision with root package name */
    public final RectF f36382c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f36383d;

    /* renamed from: e, reason: collision with root package name */
    public float f36384e;

    /* renamed from: h, reason: collision with root package name */
    public ColorStateList f36386h;

    /* renamed from: i, reason: collision with root package name */
    public PorterDuffColorFilter f36387i;
    public ColorStateList j;

    /* renamed from: f, reason: collision with root package name */
    public boolean f36385f = false;
    public boolean g = true;

    /* renamed from: k, reason: collision with root package name */
    public PorterDuff.Mode f36388k = PorterDuff.Mode.SRC_IN;

    public a(ColorStateList colorStateList, float f10) {
        this.f36380a = f10;
        Paint paint = new Paint(5);
        this.f36381b = paint;
        colorStateList = colorStateList == null ? ColorStateList.valueOf(0) : colorStateList;
        this.f36386h = colorStateList;
        paint.setColor(colorStateList.getColorForState(getState(), this.f36386h.getDefaultColor()));
        this.f36382c = new RectF();
        this.f36383d = new Rect();
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
        RectF rectF = this.f36382c;
        rectF.set(f10, f11, f12, f13);
        Rect rect2 = this.f36383d;
        rect2.set(rect);
        if (this.f36385f) {
            rect2.inset((int) Math.ceil(b.a(this.f36384e, this.f36380a, this.g)), (int) Math.ceil(b.b(this.f36384e, this.f36380a, this.g)));
            rectF.set(rect2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z3;
        PorterDuffColorFilter porterDuffColorFilter = this.f36387i;
        Paint paint = this.f36381b;
        if (porterDuffColorFilter == null || paint.getColorFilter() != null) {
            z3 = false;
        } else {
            paint.setColorFilter(this.f36387i);
            z3 = true;
        }
        RectF rectF = this.f36382c;
        float f10 = this.f36380a;
        canvas.drawRoundRect(rectF, f10, f10, paint);
        if (z3) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.f36383d, this.f36380a);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.j;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f36386h;
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
        ColorStateList colorStateList = this.f36386h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.f36381b;
        boolean z3 = colorForState != paint.getColor();
        if (z3) {
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.j;
        if (colorStateList2 == null || (mode = this.f36388k) == null) {
            return z3;
        }
        this.f36387i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i4) {
        this.f36381b.setAlpha(i4);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f36381b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.j = colorStateList;
        this.f36387i = a(colorStateList, this.f36388k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f36388k = mode;
        this.f36387i = a(this.j, mode);
        invalidateSelf();
    }
}
