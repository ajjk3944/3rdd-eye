package Ki;

import dh.InterfaceC5380e;
import mh.InterfaceC6835l;

/* loaded from: classes4.dex */
public interface w {

    public static final class a {
        public static /* synthetic */ boolean a(w wVar, Throwable th2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
            }
            if ((i10 & 1) != 0) {
                th2 = null;
            }
            return wVar.f(th2);
        }
    }

    Object b(Object obj, InterfaceC5380e interfaceC5380e);

    void e(InterfaceC6835l interfaceC6835l);

    boolean f(Throwable th2);

    Object k(Object obj);

    boolean l();
}
