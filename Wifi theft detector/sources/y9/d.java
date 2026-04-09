package y9;

import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public interface d {

    public static final class a {
        public static boolean a(d dVar, kotlinx.serialization.descriptors.f descriptor, int i10) {
            p.e(descriptor, "descriptor");
            return true;
        }
    }

    void C(kotlinx.serialization.descriptors.f fVar, int i10, kotlinx.serialization.e eVar, Object obj);

    void D(kotlinx.serialization.descriptors.f fVar, int i10, short s10);

    void E(kotlinx.serialization.descriptors.f fVar, int i10, double d10);

    void F(kotlinx.serialization.descriptors.f fVar, int i10, long j10);

    void c(kotlinx.serialization.descriptors.f fVar);

    f f(kotlinx.serialization.descriptors.f fVar, int i10);

    void i(kotlinx.serialization.descriptors.f fVar, int i10, kotlinx.serialization.e eVar, Object obj);

    void n(kotlinx.serialization.descriptors.f fVar, int i10, char c10);

    void p(kotlinx.serialization.descriptors.f fVar, int i10, byte b10);

    void s(kotlinx.serialization.descriptors.f fVar, int i10, float f10);

    void w(kotlinx.serialization.descriptors.f fVar, int i10, int i11);

    void x(kotlinx.serialization.descriptors.f fVar, int i10, boolean z10);

    void y(kotlinx.serialization.descriptors.f fVar, int i10, String str);

    boolean z(kotlinx.serialization.descriptors.f fVar, int i10);
}
