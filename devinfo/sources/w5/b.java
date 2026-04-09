package w5;

import java.io.IOException;
import km.i;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b implements v5.b {

    /* renamed from: a, reason: collision with root package name */
    public final i f36471a;

    public b(i iVar) {
        this.f36471a = iVar;
    }

    @Override // v5.b
    public final Object I(boolean z3, mk.e eVar, ek.c cVar) {
        e6.c cVar2 = (e6.c) this.f36471a.f28426b;
        cVar2.getClass();
        return eVar.invoke(new d(new a(cVar2.z())), cVar);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        ((e6.c) this.f36471a.f28426b).close();
    }
}
