package y9;

import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public interface f {
    void B(int i10);

    void G(String str);

    aa.c a();

    d b(kotlinx.serialization.descriptors.f fVar);

    void e(kotlinx.serialization.e eVar, Object obj);

    void g(double d10);

    void h(byte b10);

    d j(kotlinx.serialization.descriptors.f fVar, int i10);

    void k(kotlinx.serialization.descriptors.f fVar, int i10);

    f l(kotlinx.serialization.descriptors.f fVar);

    void m(long j10);

    void o();

    void q(short s10);

    void r(boolean z10);

    void t(float f10);

    void u(char c10);

    void v();

    public static final class a {
        public static d a(f fVar, kotlinx.serialization.descriptors.f descriptor, int i10) {
            p.e(descriptor, "descriptor");
            return fVar.b(descriptor);
        }

        public static void c(f fVar, kotlinx.serialization.e serializer, Object obj) {
            p.e(serializer, "serializer");
            if (serializer.getDescriptor().b()) {
                fVar.e(serializer, obj);
            } else if (obj == null) {
                fVar.o();
            } else {
                fVar.v();
                fVar.e(serializer, obj);
            }
        }

        public static void d(f fVar, kotlinx.serialization.e serializer, Object obj) {
            p.e(serializer, "serializer");
            serializer.serialize(fVar, obj);
        }

        public static void b(f fVar) {
        }
    }
}
