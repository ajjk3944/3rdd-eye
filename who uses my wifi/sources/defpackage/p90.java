package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class p90 extends FutureTask {
    public q90 f;

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        try {
            if (isCancelled()) {
                return;
            }
            try {
                this.f.d((o90) get());
            } catch (InterruptedException | ExecutionException e) {
                this.f.d(new o90(e));
            }
        } finally {
            this.f = null;
        }
    }
}
