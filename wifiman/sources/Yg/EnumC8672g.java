package yg;

import io.reactivex.rxjava3.exceptions.ProtocolViolationException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import r.Y;
import zg.AbstractC8751d;

/* renamed from: yg.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public enum EnumC8672g implements Dj.c {
    CANCELLED;

    public static void deferredRequest(AtomicReference<Dj.c> atomicReference, AtomicLong atomicLong, long j10) {
        Dj.c cVar = atomicReference.get();
        if (cVar != null) {
            cVar.request(j10);
            return;
        }
        if (validate(j10)) {
            AbstractC8751d.a(atomicLong, j10);
            Dj.c cVar2 = atomicReference.get();
            if (cVar2 != null) {
                long andSet = atomicLong.getAndSet(0L);
                if (andSet != 0) {
                    cVar2.request(andSet);
                }
            }
        }
    }

    public static boolean deferredSetOnce(AtomicReference<Dj.c> atomicReference, AtomicLong atomicLong, Dj.c cVar) {
        if (!setOnce(atomicReference, cVar)) {
            return false;
        }
        long andSet = atomicLong.getAndSet(0L);
        if (andSet == 0) {
            return true;
        }
        cVar.request(andSet);
        return true;
    }

    public static boolean replace(AtomicReference<Dj.c> atomicReference, Dj.c cVar) {
        Dj.c cVar2;
        do {
            cVar2 = atomicReference.get();
            if (cVar2 == CANCELLED) {
                if (cVar == null) {
                    return false;
                }
                cVar.cancel();
                return false;
            }
        } while (!Y.a(atomicReference, cVar2, cVar));
        return true;
    }

    public static void reportMoreProduced(long j10) {
        Eg.a.v(new ProtocolViolationException("More produced than requested: " + j10));
    }

    public static void reportSubscriptionSet() {
        Eg.a.v(new ProtocolViolationException("Subscription already set!"));
    }

    public static boolean set(AtomicReference<Dj.c> atomicReference, Dj.c cVar) {
        Dj.c cVar2;
        do {
            cVar2 = atomicReference.get();
            if (cVar2 == CANCELLED) {
                if (cVar == null) {
                    return false;
                }
                cVar.cancel();
                return false;
            }
        } while (!Y.a(atomicReference, cVar2, cVar));
        if (cVar2 == null) {
            return true;
        }
        cVar2.cancel();
        return true;
    }

    public static boolean setOnce(AtomicReference<Dj.c> atomicReference, Dj.c cVar) {
        Objects.requireNonNull(cVar, "s is null");
        if (Y.a(atomicReference, null, cVar)) {
            return true;
        }
        cVar.cancel();
        if (atomicReference.get() == CANCELLED) {
            return false;
        }
        reportSubscriptionSet();
        return false;
    }

    public static boolean validate(Dj.c cVar, Dj.c cVar2) {
        if (cVar2 == null) {
            Eg.a.v(new NullPointerException("next is null"));
            return false;
        }
        if (cVar == null) {
            return true;
        }
        cVar2.cancel();
        reportSubscriptionSet();
        return false;
    }

    @Override // Dj.c
    public void cancel() {
    }

    @Override // Dj.c
    public void request(long j10) {
    }

    public static boolean cancel(AtomicReference<Dj.c> atomicReference) {
        Dj.c andSet;
        Dj.c cVar = atomicReference.get();
        EnumC8672g enumC8672g = CANCELLED;
        if (cVar == enumC8672g || (andSet = atomicReference.getAndSet(enumC8672g)) == enumC8672g) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.cancel();
        return true;
    }

    public static boolean validate(long j10) {
        if (j10 > 0) {
            return true;
        }
        Eg.a.v(new IllegalArgumentException("n > 0 required but it was " + j10));
        return false;
    }

    public static boolean setOnce(AtomicReference<Dj.c> atomicReference, Dj.c cVar, long j10) {
        if (!setOnce(atomicReference, cVar)) {
            return false;
        }
        cVar.request(j10);
        return true;
    }
}
