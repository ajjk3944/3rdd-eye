package G0;

import A9.C0583j;
import android.os.OutcomeReceiver;
import java.lang.Throwable;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: OutcomeReceiver.kt */
/* loaded from: classes.dex */
public final class g<R, E extends Throwable> extends AtomicBoolean implements OutcomeReceiver {

    /* renamed from: b, reason: collision with root package name */
    public final C0583j f1849b;

    public g(C0583j c0583j) {
        super(false);
        this.f1849b = c0583j;
    }

    public final void onError(E e4) {
        if (compareAndSet(false, true)) {
            this.f1849b.resumeWith(b9.n.a(e4));
        }
    }

    public final void onResult(R r9) {
        if (compareAndSet(false, true)) {
            this.f1849b.resumeWith(r9);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public final String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
