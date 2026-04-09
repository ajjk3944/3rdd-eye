package A1;

import Yg.u;
import Yg.v;
import android.os.OutcomeReceiver;
import dh.InterfaceC5380e;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
final class g extends AtomicBoolean implements OutcomeReceiver {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC5380e f223a;

    public g(InterfaceC5380e interfaceC5380e) {
        super(false);
        this.f223a = interfaceC5380e;
    }

    public void onError(Throwable th2) {
        if (compareAndSet(false, true)) {
            InterfaceC5380e interfaceC5380e = this.f223a;
            u.a aVar = u.f25017b;
            interfaceC5380e.resumeWith(u.c(v.a(th2)));
        }
    }

    public void onResult(Object obj) {
        if (compareAndSet(false, true)) {
            this.f223a.resumeWith(u.c(obj));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
