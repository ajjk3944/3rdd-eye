package U8;

import S8.c;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: DisposableHelper.java */
/* loaded from: classes3.dex */
public enum b implements R8.a {
    DISPOSED;

    public static boolean dispose(AtomicReference<R8.a> atomicReference) {
        R8.a andSet;
        R8.a aVar = atomicReference.get();
        b bVar = DISPOSED;
        if (aVar == bVar || (andSet = atomicReference.getAndSet(bVar)) == bVar) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.dispose();
        return true;
    }

    public static boolean isDisposed(R8.a aVar) {
        return aVar == DISPOSED;
    }

    public static boolean replace(AtomicReference<R8.a> atomicReference, R8.a aVar) {
        while (true) {
            R8.a aVar2 = atomicReference.get();
            if (aVar2 == DISPOSED) {
                if (aVar == null) {
                    return false;
                }
                aVar.dispose();
                return false;
            }
            while (!atomicReference.compareAndSet(aVar2, aVar)) {
                if (atomicReference.get() != aVar2) {
                    break;
                }
            }
            return true;
        }
    }

    public static void reportDisposableSet() {
        Z8.a.a(new c("Disposable already set!"));
    }

    public static boolean set(AtomicReference<R8.a> atomicReference, R8.a aVar) {
        while (true) {
            R8.a aVar2 = atomicReference.get();
            if (aVar2 == DISPOSED) {
                if (aVar == null) {
                    return false;
                }
                aVar.dispose();
                return false;
            }
            while (!atomicReference.compareAndSet(aVar2, aVar)) {
                if (atomicReference.get() != aVar2) {
                    break;
                }
            }
            if (aVar2 == null) {
                return true;
            }
            aVar2.dispose();
            return true;
        }
    }

    public static boolean setOnce(AtomicReference<R8.a> atomicReference, R8.a aVar) {
        if (aVar == null) {
            throw new NullPointerException("d is null");
        }
        while (!atomicReference.compareAndSet(null, aVar)) {
            if (atomicReference.get() != null) {
                aVar.dispose();
                if (atomicReference.get() == DISPOSED) {
                    return false;
                }
                reportDisposableSet();
                return false;
            }
        }
        return true;
    }

    public static boolean trySet(AtomicReference<R8.a> atomicReference, R8.a aVar) {
        while (!atomicReference.compareAndSet(null, aVar)) {
            if (atomicReference.get() != null) {
                if (atomicReference.get() != DISPOSED) {
                    return false;
                }
                aVar.dispose();
                return false;
            }
        }
        return true;
    }

    public static boolean validate(R8.a aVar, R8.a aVar2) {
        if (aVar2 == null) {
            Z8.a.a(new NullPointerException("next is null"));
            return false;
        }
        if (aVar == null) {
            return true;
        }
        aVar2.dispose();
        reportDisposableSet();
        return false;
    }

    public boolean isDisposed() {
        return true;
    }

    @Override // R8.a
    public void dispose() {
    }
}
