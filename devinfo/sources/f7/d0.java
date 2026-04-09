package f7;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d0 extends FutureTask {

    /* renamed from: a, reason: collision with root package name */
    public e0 f23719a;

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        try {
            if (isCancelled()) {
                return;
            }
            try {
                this.f23719a.f((c0) get());
            } catch (InterruptedException | ExecutionException e2) {
                this.f23719a.f(new c0(e2));
            }
        } finally {
            this.f23719a = null;
        }
    }
}
