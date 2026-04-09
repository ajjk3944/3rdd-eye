package f9;

import kotlin.jvm.internal.l;
import p9.p;

/* compiled from: CoroutineContext.kt */
/* renamed from: f9.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC4350h {

    /* compiled from: CoroutineContext.kt */
    /* renamed from: f9.h$a */
    public interface a extends InterfaceC4350h {

        /* compiled from: CoroutineContext.kt */
        /* renamed from: f9.h$a$a, reason: collision with other inner class name */
        public static final class C0456a {
            public static <R> R a(a aVar, R r9, p<? super R, ? super a, ? extends R> operation) {
                l.f(operation, "operation");
                return operation.invoke(r9, aVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static <E extends a> E b(a aVar, b<E> key) {
                l.f(key, "key");
                if (l.b(aVar.getKey(), key)) {
                    return aVar;
                }
                return null;
            }

            public static InterfaceC4350h c(a aVar, b<?> key) {
                l.f(key, "key");
                return l.b(aVar.getKey(), key) ? C4351i.f37871b : aVar;
            }

            public static InterfaceC4350h d(a aVar, InterfaceC4350h context) {
                l.f(context, "context");
                return context == C4351i.f37871b ? aVar : (InterfaceC4350h) context.fold(aVar, new C4349g());
            }
        }

        b<?> getKey();
    }

    /* compiled from: CoroutineContext.kt */
    /* renamed from: f9.h$b */
    public interface b<E extends a> {
    }

    <R> R fold(R r9, p<? super R, ? super a, ? extends R> pVar);

    <E extends a> E get(b<E> bVar);

    InterfaceC4350h minusKey(b<?> bVar);

    InterfaceC4350h plus(InterfaceC4350h interfaceC4350h);
}
