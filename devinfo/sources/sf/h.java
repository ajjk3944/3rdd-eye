package sf;

import java.io.FileInputStream;
import java.io.IOException;
import p4.w0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class h implements w0 {

    /* renamed from: a, reason: collision with root package name */
    public static final h f33581a = new h();

    /* renamed from: b, reason: collision with root package name */
    public static final g f33582b = new g(null, null, null, null, null);

    @Override // p4.w0
    public final /* bridge */ /* synthetic */ Object a() {
        return f33582b;
    }

    @Override // p4.w0
    public final Object b(FileInputStream fileInputStream) throws p4.b {
        try {
            nl.b bVar = nl.b.f29990d;
            String str = new String(ci.b.w(fileInputStream), vk.a.f36267a);
            bVar.getClass();
            return (g) bVar.a(g.Companion.serializer(), str);
        } catch (Exception e2) {
            throw new p4.b("Cannot parse session configs", e2);
        }
    }

    @Override // p4.w0
    public final void c(Object obj, hm.d dVar) throws IOException {
        byte[] bytes = nl.b.f29990d.b(g.Companion.serializer(), (g) obj).getBytes(vk.a.f36267a);
        nk.k.d(bytes, "getBytes(...)");
        dVar.write(bytes);
    }
}
