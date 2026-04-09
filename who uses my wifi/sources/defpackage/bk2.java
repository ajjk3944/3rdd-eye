package defpackage;

import android.os.SystemClock;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class bk2 implements wv1 {
    public final ScheduledExecutorService f;
    public final ym g;
    public ScheduledFuture h;
    public long i = -1;
    public long j = -1;
    public x63 k = null;
    public boolean l = false;

    public bk2(ScheduledExecutorService scheduledExecutorService, ym ymVar) {
        this.f = scheduledExecutorService;
        this.g = ymVar;
        hg4.C.g.f(this);
    }

    @Override // defpackage.wv1
    public final void T(boolean z) {
        ScheduledFuture scheduledFuture;
        if (z) {
            synchronized (this) {
                try {
                    if (this.l) {
                        if (this.j > 0 && (scheduledFuture = this.h) != null && scheduledFuture.isCancelled()) {
                            this.h = this.f.schedule(this.k, this.j, TimeUnit.MILLISECONDS);
                        }
                        this.l = false;
                        return;
                    }
                    return;
                } finally {
                }
            }
        }
        synchronized (this) {
            try {
                if (this.l) {
                    return;
                }
                ScheduledFuture scheduledFuture2 = this.h;
                if (scheduledFuture2 == null || scheduledFuture2.isDone()) {
                    this.j = -1L;
                } else {
                    this.h.cancel(true);
                    long j = this.i;
                    this.g.getClass();
                    this.j = j - SystemClock.elapsedRealtime();
                }
                this.l = true;
            } finally {
            }
        }
    }
}
