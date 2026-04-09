package N;

import android.os.OutcomeReceiver;
import java.util.concurrent.atomic.AtomicBoolean;
import z5.C3030f;

/* loaded from: classes.dex */
public final class f extends AtomicBoolean implements OutcomeReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final C3030f f2963a;

    public f(C3030f c3030f) {
        super(false);
        this.f2963a = c3030f;
    }

    public final void onError(Throwable th) {
        if (compareAndSet(false, true)) {
            this.f2963a.e(R2.a.d(th));
        }
    }

    public final void onResult(Object obj) {
        if (compareAndSet(false, true)) {
            this.f2963a.e(obj);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public final String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
