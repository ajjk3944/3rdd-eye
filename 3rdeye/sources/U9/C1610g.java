package U9;

import c9.C2097r;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p9.InterfaceC5480a;

/* compiled from: CertificatePinner.kt */
/* renamed from: U9.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1610g {

    /* renamed from: c, reason: collision with root package name */
    public static final C1610g f12644c = new C1610g(C2097r.L0(new ArrayList()), null);

    /* renamed from: a, reason: collision with root package name */
    public final Set<a> f12645a;

    /* renamed from: b, reason: collision with root package name */
    public final ga.c f12646b;

    /* compiled from: CertificatePinner.kt */
    /* renamed from: U9.g$a */
    public static final class a {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            aVar.getClass();
            aVar.getClass();
            aVar.getClass();
            return true;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            throw null;
        }
    }

    public C1610g(Set<a> set, ga.c cVar) {
        this.f12645a = set;
        this.f12646b = cVar;
    }

    public final void a(String hostname, InterfaceC5480a<? extends List<? extends X509Certificate>> interfaceC5480a) {
        kotlin.jvm.internal.l.f(hostname, "hostname");
        Iterator<T> it = this.f12645a.iterator();
        if (it.hasNext()) {
            ((a) it.next()).getClass();
            y9.n.a0(null, "**.", false);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1610g)) {
            return false;
        }
        C1610g c1610g = (C1610g) obj;
        return kotlin.jvm.internal.l.b(c1610g.f12645a, this.f12645a) && kotlin.jvm.internal.l.b(c1610g.f12646b, this.f12646b);
    }

    public final int hashCode() {
        int iHashCode = (this.f12645a.hashCode() + 1517) * 41;
        ga.c cVar = this.f12646b;
        return iHashCode + (cVar != null ? cVar.hashCode() : 0);
    }
}
