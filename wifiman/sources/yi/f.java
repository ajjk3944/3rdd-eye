package Yi;

import Vi.o;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public interface f {
    void A(int i10);

    f B(Xi.f fVar);

    void D(Xi.f fVar, int i10);

    void E(long j10);

    void G(String str);

    cj.e a();

    d c(Xi.f fVar);

    void f();

    default void g(o serializer, Object obj) {
        AbstractC6492s.i(serializer, "serializer");
        if (serializer.a().c()) {
            z(serializer, obj);
        } else if (obj == null) {
            f();
        } else {
            v();
            z(serializer, obj);
        }
    }

    void j(double d10);

    void k(short s10);

    void l(byte b10);

    void m(boolean z10);

    void r(float f10);

    void u(char c10);

    default void v() {
    }

    default d x(Xi.f descriptor, int i10) {
        AbstractC6492s.i(descriptor, "descriptor");
        return c(descriptor);
    }

    default void z(o serializer, Object obj) {
        AbstractC6492s.i(serializer, "serializer");
        serializer.e(this, obj);
    }
}
