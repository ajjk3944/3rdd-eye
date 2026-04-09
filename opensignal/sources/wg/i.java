package wg;

import d4.h1;
import d4.z0;
import java.io.FileInputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public final class i implements z0 {

    /* renamed from: a, reason: collision with root package name */
    public static final i f24509a = new i();

    /* renamed from: b, reason: collision with root package name */
    public static final h f24510b = new h(null, null, null, null, null);

    @Override // d4.z0
    public final /* bridge */ /* synthetic */ Object a() {
        return f24510b;
    }

    @Override // d4.z0
    public final Object b(FileInputStream fileInputStream) throws d4.b {
        try {
            lu.b bVar = lu.c.f15933d;
            String str = new String(i3.g.C(fileInputStream), tt.a.f22975a);
            bVar.getClass();
            return (h) bVar.a(h.Companion.serializer(), str);
        } catch (Exception e4) {
            throw new d4.b("Cannot parse session configs", e4);
        }
    }

    @Override // d4.z0
    public final void c(Object obj, h1 h1Var) throws IOException {
        byte[] bytes = lu.c.f15933d.b(h.Companion.serializer(), (h) obj).getBytes(tt.a.f22975a);
        br.l.d(bytes, "getBytes(...)");
        h1Var.write(bytes);
    }
}
