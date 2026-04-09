package f0;

import dh.InterfaceC5384i;
import mh.InterfaceC6839p;

/* loaded from: classes.dex */
public interface g extends InterfaceC5384i.b {

    /* renamed from: n0, reason: collision with root package name */
    public static final b f46598n0 = b.f46599a;

    public static final class a {
        public static Object a(g gVar, Object obj, InterfaceC6839p interfaceC6839p) {
            return InterfaceC5384i.b.a.a(gVar, obj, interfaceC6839p);
        }

        public static InterfaceC5384i.b b(g gVar, InterfaceC5384i.c cVar) {
            return InterfaceC5384i.b.a.b(gVar, cVar);
        }

        public static InterfaceC5384i c(g gVar, InterfaceC5384i.c cVar) {
            return InterfaceC5384i.b.a.c(gVar, cVar);
        }

        public static InterfaceC5384i d(g gVar, InterfaceC5384i interfaceC5384i) {
            return InterfaceC5384i.b.a.d(gVar, interfaceC5384i);
        }
    }

    public static final class b implements InterfaceC5384i.c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ b f46599a = new b();

        private b() {
        }
    }

    @Override // dh.InterfaceC5384i.b
    default InterfaceC5384i.c getKey() {
        return f46598n0;
    }

    float v();
}
