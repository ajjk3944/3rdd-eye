package defpackage;

import android.os.OutcomeReceiver;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class sj extends AtomicBoolean implements OutcomeReceiver {
    public final kd f;

    public sj(kd kdVar) {
        super(false);
        this.f = kdVar;
    }

    public final void onError(Throwable th) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (compareAndSet(false, true)) {
            this.f.e(bd2.k(th));
        }
    }

    public final void onResult(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (compareAndSet(false, true)) {
            this.f.e(obj);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public final String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
