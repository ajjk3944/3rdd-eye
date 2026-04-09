package Ti;

import dh.InterfaceC5380e;

/* loaded from: classes4.dex */
public interface a {

    /* renamed from: Ti.a$a, reason: collision with other inner class name */
    public static final class C0811a {
        public static /* synthetic */ Object a(a aVar, Object obj, InterfaceC5380e interfaceC5380e, int i10, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lock");
            }
            if ((i10 & 1) != 0) {
                obj = null;
            }
            return aVar.a(obj, interfaceC5380e);
        }

        public static /* synthetic */ boolean b(a aVar, Object obj, int i10, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryLock");
            }
            if ((i10 & 1) != 0) {
                obj = null;
            }
            return aVar.b(obj);
        }

        public static /* synthetic */ void c(a aVar, Object obj, int i10, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unlock");
            }
            if ((i10 & 1) != 0) {
                obj = null;
            }
            aVar.d(obj);
        }
    }

    Object a(Object obj, InterfaceC5380e interfaceC5380e);

    boolean b(Object obj);

    boolean c();

    void d(Object obj);
}
