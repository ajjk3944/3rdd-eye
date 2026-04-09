package lg;

import hg.InterfaceC6043c;
import io.reactivex.rxjava3.exceptions.ProtocolViolationException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import r.Y;

/* renamed from: lg.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public enum EnumC6592b implements InterfaceC6043c {
    DISPOSED;

    public static boolean dispose(AtomicReference<InterfaceC6043c> atomicReference) {
        InterfaceC6043c andSet;
        InterfaceC6043c interfaceC6043c = atomicReference.get();
        EnumC6592b enumC6592b = DISPOSED;
        if (interfaceC6043c == enumC6592b || (andSet = atomicReference.getAndSet(enumC6592b)) == enumC6592b) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.dispose();
        return true;
    }

    public static boolean isDisposed(InterfaceC6043c interfaceC6043c) {
        return interfaceC6043c == DISPOSED;
    }

    public static boolean replace(AtomicReference<InterfaceC6043c> atomicReference, InterfaceC6043c interfaceC6043c) {
        InterfaceC6043c interfaceC6043c2;
        do {
            interfaceC6043c2 = atomicReference.get();
            if (interfaceC6043c2 == DISPOSED) {
                if (interfaceC6043c == null) {
                    return false;
                }
                interfaceC6043c.dispose();
                return false;
            }
        } while (!Y.a(atomicReference, interfaceC6043c2, interfaceC6043c));
        return true;
    }

    public static void reportDisposableSet() {
        Eg.a.v(new ProtocolViolationException("Disposable already set!"));
    }

    public static boolean set(AtomicReference<InterfaceC6043c> atomicReference, InterfaceC6043c interfaceC6043c) {
        InterfaceC6043c interfaceC6043c2;
        do {
            interfaceC6043c2 = atomicReference.get();
            if (interfaceC6043c2 == DISPOSED) {
                if (interfaceC6043c == null) {
                    return false;
                }
                interfaceC6043c.dispose();
                return false;
            }
        } while (!Y.a(atomicReference, interfaceC6043c2, interfaceC6043c));
        if (interfaceC6043c2 == null) {
            return true;
        }
        interfaceC6043c2.dispose();
        return true;
    }

    public static boolean setOnce(AtomicReference<InterfaceC6043c> atomicReference, InterfaceC6043c interfaceC6043c) {
        Objects.requireNonNull(interfaceC6043c, "d is null");
        if (Y.a(atomicReference, null, interfaceC6043c)) {
            return true;
        }
        interfaceC6043c.dispose();
        if (atomicReference.get() == DISPOSED) {
            return false;
        }
        reportDisposableSet();
        return false;
    }

    public static boolean trySet(AtomicReference<InterfaceC6043c> atomicReference, InterfaceC6043c interfaceC6043c) {
        if (Y.a(atomicReference, null, interfaceC6043c)) {
            return true;
        }
        if (atomicReference.get() != DISPOSED) {
            return false;
        }
        interfaceC6043c.dispose();
        return false;
    }

    public static boolean validate(InterfaceC6043c interfaceC6043c, InterfaceC6043c interfaceC6043c2) {
        if (interfaceC6043c2 == null) {
            Eg.a.v(new NullPointerException("next is null"));
            return false;
        }
        if (interfaceC6043c == null) {
            return true;
        }
        interfaceC6043c2.dispose();
        reportDisposableSet();
        return false;
    }

    @Override // hg.InterfaceC6043c
    public boolean isDisposed() {
        return true;
    }

    @Override // hg.InterfaceC6043c
    public void dispose() {
    }
}
