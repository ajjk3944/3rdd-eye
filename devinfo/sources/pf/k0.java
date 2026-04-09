package pf;

import java.io.FileInputStream;
import java.io.IOException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class k0 implements p4.w0 {

    /* renamed from: a, reason: collision with root package name */
    public final u0 f31861a;

    public k0(u0 u0Var) {
        nk.k.e(u0Var, "sessionGenerator");
        this.f31861a = u0Var;
    }

    @Override // p4.w0
    public final Object a() {
        return new j0(this.f31861a.a(null), null, null);
    }

    @Override // p4.w0
    public final Object b(FileInputStream fileInputStream) throws p4.b {
        try {
            nl.b bVar = nl.b.f29990d;
            String str = new String(ci.b.w(fileInputStream), vk.a.f36267a);
            bVar.getClass();
            return (j0) bVar.a(j0.Companion.serializer(), str);
        } catch (Exception e2) {
            throw new p4.b("Cannot parse session data", e2);
        }
    }

    @Override // p4.w0
    public final void c(Object obj, hm.d dVar) throws IOException {
        byte[] bytes = nl.b.f29990d.b(j0.Companion.serializer(), (j0) obj).getBytes(vk.a.f36267a);
        nk.k.d(bytes, "getBytes(...)");
        dVar.write(bytes);
    }
}
