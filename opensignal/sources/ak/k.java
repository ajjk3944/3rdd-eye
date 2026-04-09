package ak;

import java.util.List;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final long f599a;

    /* renamed from: b, reason: collision with root package name */
    public final List f600b;

    /* renamed from: c, reason: collision with root package name */
    public final String f601c;

    public k(long j, String str, List list) {
        br.l.e(list, "triggers");
        this.f599a = j;
        this.f600b = list;
        this.f601c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f599a == kVar.f599a && br.l.a(this.f600b, kVar.f600b) && br.l.a(this.f601c, kVar.f601c);
    }

    public final int hashCode() {
        return this.f601c.hashCode() + h0.b.c(Long.hashCode(this.f599a) * 31, 31, this.f600b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CrossTaskDelayConfig(delayInMillis=");
        sb2.append(this.f599a);
        sb2.append(", triggers=");
        sb2.append(this.f600b);
        sb2.append(", group=");
        return h0.b.r(sb2, this.f601c, ')');
    }
}
