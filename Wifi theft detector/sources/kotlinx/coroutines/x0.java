package kotlinx.coroutines;

import java.util.concurrent.Future;

/* loaded from: classes4.dex */
public final class x0 implements y0 {

    /* renamed from: a, reason: collision with root package name */
    public final Future f22703a;

    public x0(Future future) {
        this.f22703a = future;
    }

    @Override // kotlinx.coroutines.y0
    public void d() {
        this.f22703a.cancel(false);
    }

    public String toString() {
        return "DisposableFutureHandle[" + this.f22703a + ']';
    }
}
