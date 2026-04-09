package dh;

import dh.InterfaceC5381f;
import dh.InterfaceC5384i;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6839p;

/* renamed from: dh.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC5384i {

    /* renamed from: dh.i$a */
    public static final class a {
        public static InterfaceC5384i b(InterfaceC5384i interfaceC5384i, InterfaceC5384i context) {
            AbstractC6492s.i(context, "context");
            return context == C5385j.f46088a ? interfaceC5384i : (InterfaceC5384i) context.fold(interfaceC5384i, new InterfaceC6839p() { // from class: dh.h
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return InterfaceC5384i.a.c((InterfaceC5384i) obj, (InterfaceC5384i.b) obj2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static InterfaceC5384i c(InterfaceC5384i acc, b element) {
            C5379d c5379d;
            AbstractC6492s.i(acc, "acc");
            AbstractC6492s.i(element, "element");
            InterfaceC5384i interfaceC5384iMinusKey = acc.minusKey(element.getKey());
            C5385j c5385j = C5385j.f46088a;
            if (interfaceC5384iMinusKey == c5385j) {
                return element;
            }
            InterfaceC5381f.b bVar = InterfaceC5381f.f46086m0;
            InterfaceC5381f interfaceC5381f = (InterfaceC5381f) interfaceC5384iMinusKey.get(bVar);
            if (interfaceC5381f == null) {
                c5379d = new C5379d(interfaceC5384iMinusKey, element);
            } else {
                InterfaceC5384i interfaceC5384iMinusKey2 = interfaceC5384iMinusKey.minusKey(bVar);
                if (interfaceC5384iMinusKey2 == c5385j) {
                    return new C5379d(element, interfaceC5381f);
                }
                c5379d = new C5379d(new C5379d(interfaceC5384iMinusKey2, element), interfaceC5381f);
            }
            return c5379d;
        }
    }

    /* renamed from: dh.i$b */
    public interface b extends InterfaceC5384i {

        /* renamed from: dh.i$b$a */
        public static final class a {
            public static Object a(b bVar, Object obj, InterfaceC6839p operation) {
                AbstractC6492s.i(operation, "operation");
                return operation.invoke(obj, bVar);
            }

            public static b b(b bVar, c key) {
                AbstractC6492s.i(key, "key");
                if (!AbstractC6492s.d(bVar.getKey(), key)) {
                    return null;
                }
                AbstractC6492s.g(bVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                return bVar;
            }

            public static InterfaceC5384i c(b bVar, c key) {
                AbstractC6492s.i(key, "key");
                return AbstractC6492s.d(bVar.getKey(), key) ? C5385j.f46088a : bVar;
            }

            public static InterfaceC5384i d(b bVar, InterfaceC5384i context) {
                AbstractC6492s.i(context, "context");
                return a.b(bVar, context);
            }
        }

        @Override // dh.InterfaceC5384i
        Object fold(Object obj, InterfaceC6839p interfaceC6839p);

        @Override // dh.InterfaceC5384i
        b get(c cVar);

        c getKey();

        @Override // dh.InterfaceC5384i
        InterfaceC5384i minusKey(c cVar);
    }

    /* renamed from: dh.i$c */
    public interface c {
    }

    Object fold(Object obj, InterfaceC6839p interfaceC6839p);

    b get(c cVar);

    InterfaceC5384i minusKey(c cVar);

    InterfaceC5384i plus(InterfaceC5384i interfaceC5384i);
}
