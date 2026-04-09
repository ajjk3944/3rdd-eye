package mj;

import br.l;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final long f16851a;

    /* renamed from: b, reason: collision with root package name */
    public final long f16852b;

    /* renamed from: c, reason: collision with root package name */
    public final b f16853c;

    public e(long j, long j7, b bVar) {
        l.e(bVar, "appStatusMode");
        this.f16851a = j;
        this.f16852b = j7;
        this.f16853c = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f16851a == eVar.f16851a && this.f16852b == eVar.f16852b && this.f16853c == eVar.f16853c;
    }

    public final int hashCode() {
        return this.f16853c.hashCode() + h0.b.b(Long.hashCode(this.f16851a) * 31, 31, this.f16852b);
    }

    public final String toString() {
        return "SdkDataUsageLimits(kilobytes=" + this.f16851a + ", days=" + this.f16852b + ", appStatusMode=" + this.f16853c + ')';
    }
}
