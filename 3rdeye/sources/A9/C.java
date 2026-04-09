package A9;

import A9.B;
import f9.InterfaceC4350h;

/* compiled from: CoroutineExceptionHandler.kt */
/* loaded from: classes3.dex */
public final class C {
    public static final void a(InterfaceC4350h interfaceC4350h, Throwable th) {
        try {
            B b10 = (B) interfaceC4350h.get(B.a.f182b);
            if (b10 != null) {
                b10.handleException(interfaceC4350h, th);
            } else {
                E.u.E(interfaceC4350h, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                b9.x.a(runtimeException, th);
                th = runtimeException;
            }
            E.u.E(interfaceC4350h, th);
        }
    }
}
