package tg;

import d4.h1;
import java.io.FileInputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public final class g0 implements d4.z0 {

    /* renamed from: a, reason: collision with root package name */
    public final q0 f22782a;

    public g0(q0 q0Var) {
        br.l.e(q0Var, "sessionGenerator");
        this.f22782a = q0Var;
    }

    @Override // d4.z0
    public final Object a() {
        return new f0(this.f22782a.a(null), null, null);
    }

    @Override // d4.z0
    public final Object b(FileInputStream fileInputStream) throws d4.b {
        try {
            lu.b bVar = lu.c.f15933d;
            String str = new String(i3.g.C(fileInputStream), tt.a.f22975a);
            bVar.getClass();
            return (f0) bVar.a(f0.Companion.serializer(), str);
        } catch (Exception e4) {
            throw new d4.b("Cannot parse session data", e4);
        }
    }

    @Override // d4.z0
    public final void c(Object obj, h1 h1Var) throws IOException {
        byte[] bytes = lu.c.f15933d.b(f0.Companion.serializer(), (f0) obj).getBytes(tt.a.f22975a);
        br.l.d(bytes, "getBytes(...)");
        h1Var.write(bytes);
    }
}
