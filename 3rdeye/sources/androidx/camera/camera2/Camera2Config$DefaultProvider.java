package androidx.camera.camera2;

import C.A;
import androidx.camera.core.impl.C1683d;
import androidx.camera.core.impl.C1710q0;
import androidx.camera.core.impl.C1717u0;
import t.C5590a;
import t.C5591b;
import t.c;

/* loaded from: classes.dex */
public final class Camera2Config$DefaultProvider implements A.b {
    @Override // C.A.b
    public A getCameraXConfig() {
        C5590a c5590a = new C5590a();
        C5591b c5591b = new C5591b();
        c cVar = new c();
        A.a aVar = new A.a();
        C1683d c1683d = A.f602H;
        C1710q0 c1710q0 = aVar.f613a;
        c1710q0.N(c1683d, c5590a);
        c1710q0.N(A.f603I, c5591b);
        c1710q0.N(A.f604J, cVar);
        return new A(C1717u0.J(c1710q0));
    }
}
