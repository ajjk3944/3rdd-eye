package l1;

import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class h implements InterfaceC2639e {

    /* renamed from: b, reason: collision with root package name */
    public final H1.c f21823b = new H1.c(0);

    @Override // l1.InterfaceC2639e
    public final void a(MessageDigest messageDigest) {
        int i = 0;
        while (true) {
            H1.c cVar = this.f21823b;
            if (i >= cVar.f23705c) {
                return;
            }
            C2641g c2641g = (C2641g) cVar.f(i);
            Object objJ = this.f21823b.j(i);
            InterfaceC2640f interfaceC2640f = c2641g.f21820b;
            if (c2641g.f21822d == null) {
                c2641g.f21822d = c2641g.f21821c.getBytes(InterfaceC2639e.f21817a);
            }
            interfaceC2640f.d(c2641g.f21822d, objJ, messageDigest);
            i++;
        }
    }

    public final Object c(C2641g c2641g) {
        H1.c cVar = this.f21823b;
        return cVar.containsKey(c2641g) ? cVar.get(c2641g) : c2641g.f21819a;
    }

    @Override // l1.InterfaceC2639e
    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f21823b.equals(((h) obj).f21823b);
        }
        return false;
    }

    @Override // l1.InterfaceC2639e
    public final int hashCode() {
        return this.f21823b.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.f21823b + '}';
    }
}
