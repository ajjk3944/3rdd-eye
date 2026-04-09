package kotlin.coroutines;

import kotlin.coroutines.c;
import kotlin.coroutines.d;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public interface d {

    public static final class a {
        public static d b(d dVar, d context) {
            p.e(context, "context");
            return context == EmptyCoroutineContext.f21979a ? dVar : (d) context.fold(dVar, new l9.p() { // from class: c9.e
                @Override // l9.p
                public final Object invoke(Object obj, Object obj2) {
                    return d.a.c((kotlin.coroutines.d) obj, (d.b) obj2);
                }
            });
        }

        public static d c(d acc, b element) {
            p.e(acc, "acc");
            p.e(element, "element");
            d dVarMinusKey = acc.minusKey(element.getKey());
            EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.f21979a;
            if (dVarMinusKey == emptyCoroutineContext) {
                return element;
            }
            c.b bVar = kotlin.coroutines.c.F8;
            kotlin.coroutines.c cVar = (kotlin.coroutines.c) dVarMinusKey.get(bVar);
            if (cVar == null) {
                return new CombinedContext(dVarMinusKey, element);
            }
            d dVarMinusKey2 = dVarMinusKey.minusKey(bVar);
            return dVarMinusKey2 == emptyCoroutineContext ? new CombinedContext(element, cVar) : new CombinedContext(new CombinedContext(dVarMinusKey2, element), cVar);
        }
    }

    public interface b extends d {

        public static final class a {
            public static Object a(b bVar, Object obj, l9.p operation) {
                p.e(operation, "operation");
                return operation.invoke(obj, bVar);
            }

            public static b b(b bVar, c key) {
                p.e(key, "key");
                if (!p.a(bVar.getKey(), key)) {
                    return null;
                }
                p.c(bVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                return bVar;
            }

            public static d c(b bVar, c key) {
                p.e(key, "key");
                return p.a(bVar.getKey(), key) ? EmptyCoroutineContext.f21979a : bVar;
            }

            public static d d(b bVar, d context) {
                p.e(context, "context");
                return a.b(bVar, context);
            }
        }

        @Override // kotlin.coroutines.d
        b get(c cVar);

        c getKey();
    }

    public interface c {
    }

    Object fold(Object obj, l9.p pVar);

    b get(c cVar);

    d minusKey(c cVar);

    d plus(d dVar);
}
