package zg;

import hg.InterfaceC6043c;
import io.reactivex.rxjava3.exceptions.ProtocolViolationException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import lg.EnumC6592b;
import r.Y;

/* renamed from: zg.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC8753f {
    public static String a(String str) {
        return "It is not allowed to subscribe with a(n) " + str + " multiple times. Please create a fresh instance of " + str + " and subscribe that to the target source instead.";
    }

    public static void b(Class cls) {
        Eg.a.v(new ProtocolViolationException(a(cls.getName())));
    }

    public static boolean c(AtomicReference atomicReference, InterfaceC6043c interfaceC6043c, Class cls) {
        Objects.requireNonNull(interfaceC6043c, "next is null");
        if (Y.a(atomicReference, null, interfaceC6043c)) {
            return true;
        }
        interfaceC6043c.dispose();
        if (atomicReference.get() == EnumC6592b.DISPOSED) {
            return false;
        }
        b(cls);
        return false;
    }
}
