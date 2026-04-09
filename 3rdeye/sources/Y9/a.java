package Y9;

import U9.E;
import U9.u;
import U9.x;
import b9.C1992A;
import java.io.IOException;

/* compiled from: ConnectInterceptor.kt */
/* loaded from: classes3.dex */
public final class a implements u {

    /* renamed from: a, reason: collision with root package name */
    public static final a f13806a = new a();

    @Override // U9.u
    public final E intercept(u.a aVar) throws IOException {
        Z9.f fVar = (Z9.f) aVar;
        e eVar = fVar.f14068a;
        eVar.getClass();
        synchronized (eVar) {
            if (!eVar.f13848o) {
                throw new IllegalStateException("released");
            }
            if (eVar.f13847n) {
                throw new IllegalStateException("Check failed.");
            }
            if (eVar.f13846m) {
                throw new IllegalStateException("Check failed.");
            }
            C1992A c1992a = C1992A.f18074a;
        }
        d dVar = eVar.i;
        kotlin.jvm.internal.l.c(dVar);
        x client = eVar.f13836b;
        kotlin.jvm.internal.l.f(client, "client");
        try {
            c cVar = new c(eVar, eVar.f13839e, dVar, dVar.a(fVar.f14073f, fVar.f14074g, fVar.f14075h, client.f12755g, !kotlin.jvm.internal.l.b(fVar.f14072e.f12796b, "GET")).k(client, fVar));
            eVar.f13845l = cVar;
            eVar.f13850q = cVar;
            synchronized (eVar) {
                eVar.f13846m = true;
                eVar.f13847n = true;
            }
            if (eVar.f13849p) {
                throw new IOException("Canceled");
            }
            return Z9.f.b(fVar, 0, cVar, null, 61).a(fVar.f14072e);
        } catch (k e4) {
            dVar.c(e4.f13882c);
            throw e4;
        } catch (IOException e10) {
            dVar.c(e10);
            throw new k(e10);
        }
    }
}
