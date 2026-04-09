package l0;

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

/* compiled from: RoundRectDrawable.java */
/* renamed from: l0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5264b extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public float f43664a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f43665b;

    /* renamed from: c, reason: collision with root package name */
    public final RectF f43666c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f43667d;

    /* renamed from: e, reason: collision with root package name */
    public float f43668e;

    /* renamed from: h, reason: collision with root package name */
    public ColorStateList f43671h;
    public PorterDuffColorFilter i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f43672j;

    /* renamed from: f, reason: collision with root package name */
    public boolean f43669f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f43670g = true;

    /* renamed from: k, reason: collision with root package name */
    public PorterDuff.Mode f43673k = PorterDuff.Mode.SRC_IN;

    public C5264b(ColorStateList colorStateList, float f10) {
        this.f43664a = f10;
        Paint paint = new Paint(5);
        this.f43665b = paint;
        colorStateList = colorStateList == null ? ColorStateList.valueOf(0) : colorStateList;
        this.f43671h = colorStateList;
        paint.setColor(colorStateList.getColorForState(getState(), this.f43671h.getDefaultColor()));
        this.f43666c = new RectF();
        this.f43667d = new Rect();
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
        RectF rectF = this.f43666c;
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
        Rect rect2 = this.f43667d;
        rect2.set(rect);
        if (this.f43669f) {
            rect2.inset((int) Math.ceil(C5265c.a(this.f43668e, this.f43664a, this.f43670g)), (int) Math.ceil(C5265c.b(this.f43668e, this.f43664a, this.f43670g)));
            rectF.set(rect2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z10;
        Paint paint = this.f43665b;
        if (this.i == null || paint.getColorFilter() != null) {
            z10 = false;
        } else {
            paint.setColorFilter(this.i);
            z10 = true;
        }
        RectF rectF = this.f43666c;
        float f10 = this.f43664a;
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
        outline.setRoundRect(this.f43667d, this.f43664a);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.f43672j;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f43671h;
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
        ColorStateList colorStateList = this.f43671h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.f43665b;
        boolean z10 = colorForState != paint.getColor();
        if (z10) {
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f43672j;
        if (colorStateList2 == null || (mode = this.f43673k) == null) {
            return z10;
        }
        this.i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f43665b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f43665b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f43672j = colorStateList;
        this.i = a(colorStateList, this.f43673k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f43673k = mode;
        this.i = a(this.f43672j, mode);
        invalidateSelf();
    }
}
