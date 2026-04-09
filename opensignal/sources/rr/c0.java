package rr;

import java.util.List;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final qs.b f21678a;

    /* renamed from: b, reason: collision with root package name */
    public final List f21679b;

    public c0(qs.b bVar, List list) {
        br.l.e(bVar, "classId");
        this.f21678a = bVar;
        this.f21679b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return br.l.a(this.f21678a, c0Var.f21678a) && br.l.a(this.f21679b, c0Var.f21679b);
    }

    public final int hashCode() {
        return this.f21679b.hashCode() + (this.f21678a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ClassRequest(classId=");
        sb2.append(this.f21678a);
        sb2.append(", typeParametersCount=");
        return h0.b.t(sb2, this.f21679b, ')');
    }
}
