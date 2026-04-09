package I0;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: MaskedDrawable.kt */
/* loaded from: classes.dex */
public final class a extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f2380a;

    /* renamed from: b, reason: collision with root package name */
    public final Path f2381b;

    public a(Drawable drawable, float f10) {
        kotlin.jvm.internal.l.f(drawable, "drawable");
        this.f2380a = drawable;
        Path path = new Path();
        path.addCircle(0.0f, 0.0f, f10 / 2.0f, Path.Direction.CW);
        this.f2381b = path;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        kotlin.jvm.internal.l.f(canvas, "canvas");
        canvas.clipPath(this.f2381b);
        this.f2380a.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f2380a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect bounds) {
        kotlin.jvm.internal.l.f(bounds, "bounds");
        super.onBoundsChange(bounds);
        this.f2380a.setBounds(bounds);
        this.f2381b.offset(bounds.exactCenterX(), bounds.exactCenterY());
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f2380a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f2380a.setColorFilter(colorFilter);
    }
}
