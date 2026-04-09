package kd;

import android.graphics.Canvas;
import android.graphics.Region;
import android.os.Build;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class g extends h {
    @Override // ed.j
    public final void g(Canvas canvas) {
        if (this.H.f28157s.isEmpty()) {
            super.g(canvas);
            return;
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutRect(this.H.f28157s);
        } else {
            canvas.clipRect(this.H.f28157s, Region.Op.DIFFERENCE);
        }
        super.g(canvas);
        canvas.restore();
    }
}
