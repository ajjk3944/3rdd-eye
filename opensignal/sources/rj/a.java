package rj;

import ak.u;
import br.l;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f21545a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21546b;

    /* renamed from: c, reason: collision with root package name */
    public final long f21547c;

    /* renamed from: d, reason: collision with root package name */
    public final u f21548d;

    public a(long j, String str, long j7, u uVar) {
        l.e(str, "ipAddress");
        l.e(uVar, "location");
        this.f21545a = j;
        this.f21546b = str;
        this.f21547c = j7;
        this.f21548d = uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f21545a == aVar.f21545a && l.a(this.f21546b, aVar.f21546b) && this.f21547c == aVar.f21547c && l.a(this.f21548d, aVar.f21548d);
    }

    public final int hashCode() {
        return this.f21548d.hashCode() + h0.b.b(c7.a.g(this.f21546b, Long.hashCode(this.f21545a) * 31, 31), 31, this.f21547c);
    }

    public final String toString() {
        return "IpCacheTableRow(id=" + this.f21545a + ", ipAddress=" + this.f21546b + ", lastModificationDate=" + this.f21547c + ", location=" + this.f21548d + ')';
    }
}
