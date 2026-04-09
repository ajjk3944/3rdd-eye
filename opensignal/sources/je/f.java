package je;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* loaded from: classes.dex */
public final class f extends ee.i {

    /* renamed from: e0, reason: collision with root package name */
    public static final /* synthetic */ int f13621e0 = 0;

    /* renamed from: d0, reason: collision with root package name */
    public e f13622d0;

    @Override // ee.i
    public final void g(Canvas canvas) {
        if (this.f13622d0.f13620r.isEmpty()) {
            super.g(canvas);
            return;
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutRect(this.f13622d0.f13620r);
        } else {
            canvas.clipRect(this.f13622d0.f13620r, Region.Op.DIFFERENCE);
        }
        super.g(canvas);
        canvas.restore();
    }

    @Override // ee.i, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f13622d0 = new e(this.f13622d0);
        return this;
    }

    public final void y(float f10, float f11, float f12, float f13) {
        RectF rectF = this.f13622d0.f13620r;
        if (f10 == rectF.left && f11 == rectF.top && f12 == rectF.right && f13 == rectF.bottom) {
            return;
        }
        rectF.set(f10, f11, f12, f13);
        invalidateSelf();
    }
}
