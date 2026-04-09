package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class wl extends nc0 {
    public static final /* synthetic */ int N = 0;
    public vl M;

    public final void A(float f, float f2, float f3, float f4) {
        RectF rectF = this.M.s;
        if (f == rectF.left && f2 == rectF.top && f3 == rectF.right && f4 == rectF.bottom) {
            return;
        }
        rectF.set(f, f2, f3, f4);
        invalidateSelf();
    }

    @Override // defpackage.nc0
    public final void f(Canvas canvas) {
        if (this.M.s.isEmpty()) {
            super.f(canvas);
            return;
        }
        canvas.save();
        canvas.clipOutRect(this.M.s);
        super.f(canvas);
        canvas.restore();
    }

    @Override // defpackage.nc0, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.M = new vl(this.M);
        return this;
    }
}
