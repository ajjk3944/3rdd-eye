package dj;

import br.l;
import cj.n;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class d implements n {

    /* renamed from: a, reason: collision with root package name */
    public final ch.d f7394a;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f7395d;

    public d(ch.d dVar, boolean z10) {
        l.e(dVar, "serviceLocator");
        this.f7394a = dVar;
        this.f7395d = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return l.a(this.f7394a, dVar.f7394a) && this.f7395d == dVar.f7395d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f7395d) + (this.f7394a.hashCode() * 31);
    }

    @Override // cj.n
    public final void run() {
        ch.n.b("SetAppOpenCommand", "Set App is visible to " + this.f7395d);
        xi.a aVarC = this.f7394a.c();
        boolean z10 = this.f7395d;
        aVarC.f25314d = z10;
        if (z10) {
            aVarC.f25312b = true;
            synchronized (aVarC.f25311a) {
                Iterator it = aVarC.f25311a.iterator();
                while (it.hasNext()) {
                    ((jj.e) it.next()).a1();
                }
            }
            return;
        }
        aVarC.f25313c = true;
        synchronized (aVarC.f25311a) {
            Iterator it2 = aVarC.f25311a.iterator();
            while (it2.hasNext()) {
                ((jj.e) it2.next()).a1();
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SetAppVisibilityCommand(serviceLocator=");
        sb2.append(this.f7394a);
        sb2.append(", appVisible=");
        return c7.a.r(sb2, this.f7395d, ')');
    }
}
