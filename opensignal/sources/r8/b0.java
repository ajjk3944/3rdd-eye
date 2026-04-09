package r8;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* loaded from: classes.dex */
public final class b0 extends FutureTask {

    /* renamed from: a, reason: collision with root package name */
    public c0 f21306a;

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        try {
            if (isCancelled()) {
                return;
            }
            try {
                this.f21306a.d((a0) get());
            } catch (InterruptedException | ExecutionException e4) {
                this.f21306a.d(new a0(e4));
            }
        } finally {
            this.f21306a = null;
        }
    }
}
