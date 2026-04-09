package bn;

import br.l;
import w.g;

/* loaded from: classes.dex */
public final class c implements d {

    /* renamed from: a, reason: collision with root package name */
    public final String f2837a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2838b;

    public c(String str, long j) {
        this.f2837a = str;
        this.f2838b = j;
    }

    @Override // bn.d
    public final String a() {
        return this.f2837a;
    }

    @Override // bn.d
    public final long b() {
        return this.f2838b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.f2837a, cVar.f2837a) && this.f2838b == cVar.f2838b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f2838b) + (this.f2837a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NoIssuesFound(entityId=");
        sb2.append(this.f2837a);
        sb2.append(", jobDurationInMillis=");
        return g.h(sb2, this.f2838b, ')');
    }
}
