package M3;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* loaded from: classes.dex */
public final class g extends G3.j {

    /* renamed from: W, reason: collision with root package name */
    public static final /* synthetic */ int f2847W = 0;

    /* renamed from: V, reason: collision with root package name */
    public f f2848V;

    public final void A(float f2, float f5, float f6, float f7) {
        RectF rectF = this.f2848V.f2846s;
        if (f2 == rectF.left && f5 == rectF.top && f6 == rectF.right && f7 == rectF.bottom) {
            return;
        }
        rectF.set(f2, f5, f6, f7);
        invalidateSelf();
    }

    @Override // G3.j
    public final void g(Canvas canvas) {
        if (this.f2848V.f2846s.isEmpty()) {
            super.g(canvas);
            return;
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutRect(this.f2848V.f2846s);
        } else {
            canvas.clipRect(this.f2848V.f2846s, Region.Op.DIFFERENCE);
        }
        super.g(canvas);
        canvas.restore();
    }

    @Override // G3.j, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f2848V = new f(this.f2848V);
        return this;
    }
}
