package p3;

import android.os.OutcomeReceiver;
import java.util.concurrent.atomic.AtomicBoolean;
import lf.t1;
import wt.g;

/* loaded from: classes.dex */
public final class b extends AtomicBoolean implements OutcomeReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final g f20242a;

    public b(g gVar) {
        super(false);
        this.f20242a = gVar;
    }

    public final void onError(Throwable th2) {
        if (compareAndSet(false, true)) {
            this.f20242a.g(t1.k(th2));
        }
    }

    public final void onResult(Object obj) {
        if (compareAndSet(false, true)) {
            this.f20242a.g(obj);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public final String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
