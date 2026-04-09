package L2;

import L2.g;
import java.security.MessageDigest;

/* compiled from: Options.java */
/* loaded from: classes.dex */
public final class h implements f {

    /* renamed from: b, reason: collision with root package name */
    public final h3.b f4033b = new h3.b();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // L2.f
    public final void b(MessageDigest messageDigest) {
        int i = 0;
        while (true) {
            h3.b bVar = this.f4033b;
            if (i >= bVar.f44030d) {
                return;
            }
            g gVar = (g) bVar.g(i);
            V vL = this.f4033b.l(i);
            g.b<T> bVar2 = gVar.f4030b;
            if (gVar.f4032d == null) {
                gVar.f4032d = gVar.f4031c.getBytes(f.f4027a);
            }
            bVar2.a(gVar.f4032d, vL, messageDigest);
            i++;
        }
    }

    public final <T> T c(g<T> gVar) {
        h3.b bVar = this.f4033b;
        return bVar.containsKey(gVar) ? (T) bVar.get(gVar) : gVar.f4029a;
    }

    @Override // L2.f
    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f4033b.equals(((h) obj).f4033b);
        }
        return false;
    }

    @Override // L2.f
    public final int hashCode() {
        return this.f4033b.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.f4033b + '}';
    }
}
