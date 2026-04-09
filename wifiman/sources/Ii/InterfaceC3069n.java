package Ii;

import dh.InterfaceC5380e;
import mh.InterfaceC6835l;

/* renamed from: Ii.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC3069n extends InterfaceC5380e {

    /* renamed from: Ii.n$a */
    public static final class a {
        public static /* synthetic */ boolean a(InterfaceC3069n interfaceC3069n, Throwable th2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i10 & 1) != 0) {
                th2 = null;
            }
            return interfaceC3069n.cancel(th2);
        }
    }

    void B(InterfaceC6835l interfaceC6835l);

    void C0(Object obj);

    void J(J j10, Object obj);

    void b0(Object obj, mh.q qVar);

    boolean cancel(Throwable th2);

    boolean isCompleted();

    Object p(Object obj, Object obj2, mh.q qVar);

    Object r(Throwable th2);
}
