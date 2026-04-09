package T;

import dh.InterfaceC5380e;
import dh.InterfaceC5384i;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;

/* renamed from: T.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC3530g0 extends InterfaceC5384i.b {

    /* renamed from: a0, reason: collision with root package name */
    public static final b f21076a0 = b.f21077a;

    /* renamed from: T.g0$a */
    public static final class a {
        public static Object a(InterfaceC3530g0 interfaceC3530g0, Object obj, InterfaceC6839p interfaceC6839p) {
            return InterfaceC5384i.b.a.a(interfaceC3530g0, obj, interfaceC6839p);
        }

        public static InterfaceC5384i.b b(InterfaceC3530g0 interfaceC3530g0, InterfaceC5384i.c cVar) {
            return InterfaceC5384i.b.a.b(interfaceC3530g0, cVar);
        }

        public static InterfaceC5384i c(InterfaceC3530g0 interfaceC3530g0, InterfaceC5384i.c cVar) {
            return InterfaceC5384i.b.a.c(interfaceC3530g0, cVar);
        }

        public static InterfaceC5384i d(InterfaceC3530g0 interfaceC3530g0, InterfaceC5384i interfaceC5384i) {
            return InterfaceC5384i.b.a.d(interfaceC3530g0, interfaceC5384i);
        }
    }

    /* renamed from: T.g0$b */
    public static final class b implements InterfaceC5384i.c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ b f21077a = new b();

        private b() {
        }
    }

    @Override // dh.InterfaceC5384i.b
    default InterfaceC5384i.c getKey() {
        return f21076a0;
    }

    Object j(InterfaceC6835l interfaceC6835l, InterfaceC5380e interfaceC5380e);
}
