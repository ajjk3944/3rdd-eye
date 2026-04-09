package kotlinx.coroutines;

import kotlin.coroutines.d;

/* loaded from: classes4.dex */
public interface g0 extends d.b {
    public static final b G8 = b.f22497a;

    public static final class a {
        public static Object a(g0 g0Var, Object obj, l9.p pVar) {
            return d.b.a.a(g0Var, obj, pVar);
        }

        public static d.b b(g0 g0Var, d.c cVar) {
            return d.b.a.b(g0Var, cVar);
        }

        public static kotlin.coroutines.d c(g0 g0Var, d.c cVar) {
            return d.b.a.c(g0Var, cVar);
        }

        public static kotlin.coroutines.d d(g0 g0Var, kotlin.coroutines.d dVar) {
            return d.b.a.d(g0Var, dVar);
        }
    }

    public static final class b implements d.c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ b f22497a = new b();
    }

    void handleException(kotlin.coroutines.d dVar, Throwable th);
}
