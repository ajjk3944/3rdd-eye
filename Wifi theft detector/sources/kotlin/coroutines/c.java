package kotlin.coroutines;

import androidx.activity.o;
import kotlin.coroutines.d;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public interface c extends d.b {
    public static final b F8 = b.f21982a;

    public static final class a {
        public static d.b a(c cVar, d.c key) {
            p.e(key, "key");
            if (!(key instanceof kotlin.coroutines.b)) {
                if (c.F8 != key) {
                    return null;
                }
                p.c(cVar, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return cVar;
            }
            kotlin.coroutines.b bVar = (kotlin.coroutines.b) key;
            if (bVar.a(cVar.getKey())) {
                d.b bVarB = bVar.b(cVar);
                if (o.a(bVarB)) {
                    return bVarB;
                }
            }
            return null;
        }

        public static d b(c cVar, d.c key) {
            p.e(key, "key");
            if (!(key instanceof kotlin.coroutines.b)) {
                return c.F8 == key ? EmptyCoroutineContext.f21979a : cVar;
            }
            kotlin.coroutines.b bVar = (kotlin.coroutines.b) key;
            return (!bVar.a(cVar.getKey()) || bVar.b(cVar) == null) ? cVar : EmptyCoroutineContext.f21979a;
        }
    }

    public static final class b implements d.c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ b f21982a = new b();
    }

    void I(c9.c cVar);

    c9.c P(c9.c cVar);
}
