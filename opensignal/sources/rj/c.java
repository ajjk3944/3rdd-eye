package rj;

import br.l;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f21555a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21556b;

    public c(String str, String str2) {
        l.e(str2, "value");
        this.f21555a = str;
        this.f21556b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.f21555a, cVar.f21555a) && l.a(this.f21556b, cVar.f21556b);
    }

    public final int hashCode() {
        return this.f21556b.hashCode() + (this.f21555a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("KeyValueTableRow(key=");
        sb2.append(this.f21555a);
        sb2.append(", value=");
        return h0.b.r(sb2, this.f21556b, ')');
    }
}
