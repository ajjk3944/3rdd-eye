package kotlinx.coroutines;

import java.util.concurrent.Future;

/* loaded from: classes4.dex */
public final class l extends m {

    /* renamed from: a, reason: collision with root package name */
    public final Future f22574a;

    public l(Future future) {
        this.f22574a = future;
    }

    @Override // kotlinx.coroutines.n
    public void i(Throwable th) {
        if (th != null) {
            this.f22574a.cancel(false);
        }
    }

    @Override // l9.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        i((Throwable) obj);
        return y8.s.f25199a;
    }

    public String toString() {
        return "CancelFutureOnCancel[" + this.f22574a + ']';
    }
}
