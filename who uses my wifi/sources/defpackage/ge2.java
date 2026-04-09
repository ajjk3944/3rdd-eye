package defpackage;

import android.graphics.SurfaceTexture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ge2 {
    public long b;
    public final long a = TimeUnit.MILLISECONDS.toNanos(((Long) tw1.e.c.a(mz1.P)).longValue());
    public boolean c = true;

    public final void a(SurfaceTexture surfaceTexture, ee2 ee2Var) {
        if (ee2Var == null) {
            return;
        }
        long timestamp = surfaceTexture.getTimestamp();
        if (!this.c) {
            long j = timestamp - this.b;
            if (Math.abs(j) < this.a) {
                return;
            }
        }
        this.c = false;
        this.b = timestamp;
        lf4.l.post(new fu1(13, ee2Var));
    }
}
