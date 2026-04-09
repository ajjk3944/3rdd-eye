package P9;

import I9.g;
import kotlin.jvm.internal.l;

/* compiled from: Encoding.kt */
/* loaded from: classes3.dex */
public interface e {

    /* compiled from: Encoding.kt */
    public static final class a {
        public static <T> void a(e eVar, M9.b serializer, T t10) {
            l.f(serializer, "serializer");
            if (serializer.getDescriptor().c()) {
                eVar.x(serializer, t10);
            } else if (t10 == null) {
                eVar.f();
            } else {
                eVar.r();
                eVar.x(serializer, t10);
            }
        }
    }

    void C(int i);

    void D(long j4);

    void G(String str);

    g a();

    c d(O9.e eVar);

    void f();

    void g(double d10);

    void h(short s10);

    void j(byte b10);

    void l(boolean z10);

    void o(float f10);

    void p(O9.e eVar, int i);

    void q(char c10);

    void r();

    c v(O9.e eVar, int i);

    <T> void x(M9.b bVar, T t10);

    e z(O9.e eVar);
}
