package Sh;

import Bh.g0;
import di.C5397f;

/* loaded from: classes4.dex */
public interface x {

    public interface a {
        void a();

        void b(Zh.f fVar, C5397f c5397f);

        void c(Zh.f fVar, Object obj);

        b d(Zh.f fVar);

        void e(Zh.f fVar, Zh.b bVar, Zh.f fVar2);

        a f(Zh.f fVar, Zh.b bVar);
    }

    public interface b {
        void a();

        void b(C5397f c5397f);

        void c(Zh.b bVar, Zh.f fVar);

        void d(Object obj);

        a e(Zh.b bVar);
    }

    public interface c {
        void a();

        a b(Zh.b bVar, g0 g0Var);
    }

    public interface d {
        e a(Zh.f fVar, String str);

        c b(Zh.f fVar, String str, Object obj);
    }

    public interface e extends c {
        a c(int i10, Zh.b bVar, g0 g0Var);
    }

    Th.a a();

    Zh.b b();

    void c(d dVar, byte[] bArr);

    void d(c cVar, byte[] bArr);

    String getLocation();
}
