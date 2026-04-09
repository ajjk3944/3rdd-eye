package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class lu0 implements Executor {
    public final Executor g;
    public volatile Runnable i;
    public final ArrayDeque f = new ArrayDeque();
    public final Object h = new Object();

    public lu0(Executor executor) {
        this.g = executor;
    }

    public final void a() {
        synchronized (this.h) {
            try {
                Runnable runnable = (Runnable) this.f.poll();
                this.i = runnable;
                if (runnable != null) {
                    this.g.execute(this.i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.h) {
            try {
                this.f.add(new jq3(this, runnable, 15));
                if (this.i == null) {
                    a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
