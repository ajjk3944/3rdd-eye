package Yi;

import Vi.InterfaceC3627a;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public interface c {

    /* renamed from: a, reason: collision with root package name */
    public static final a f25059a = a.f25060a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f25060a = new a();

        private a() {
        }
    }

    static /* synthetic */ Object j(c cVar, Xi.f fVar, int i10, InterfaceC3627a interfaceC3627a, Object obj, int i11, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeSerializableElement");
        }
        if ((i11 & 8) != 0) {
            obj = null;
        }
        return cVar.p(fVar, i10, interfaceC3627a, obj);
    }

    float A(Xi.f fVar, int i10);

    default boolean B() {
        return false;
    }

    short C(Xi.f fVar, int i10);

    e E(Xi.f fVar, int i10);

    byte H(Xi.f fVar, int i10);

    cj.e a();

    void b(Xi.f fVar);

    Object h(Xi.f fVar, int i10, InterfaceC3627a interfaceC3627a, Object obj);

    int i(Xi.f fVar, int i10);

    int k(Xi.f fVar);

    double o(Xi.f fVar, int i10);

    Object p(Xi.f fVar, int i10, InterfaceC3627a interfaceC3627a, Object obj);

    long q(Xi.f fVar, int i10);

    boolean u(Xi.f fVar, int i10);

    String w(Xi.f fVar, int i10);

    default int x(Xi.f descriptor) {
        AbstractC6492s.i(descriptor, "descriptor");
        return -1;
    }

    char z(Xi.f fVar, int i10);
}
