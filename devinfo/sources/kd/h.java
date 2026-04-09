package kd;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class h extends ed.j {
    public static final /* synthetic */ int I = 0;
    public f H;

    @Override // ed.j, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.H = new f(this.H);
        return this;
    }

    public final void w(float f10, float f11, float f12, float f13) {
        RectF rectF = this.H.f28157s;
        if (f10 == rectF.left && f11 == rectF.top && f12 == rectF.right && f13 == rectF.bottom) {
            return;
        }
        rectF.set(f10, f11, f12, f13);
        invalidateSelf();
    }
}
