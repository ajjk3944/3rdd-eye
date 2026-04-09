package bn;

import br.l;
import w.g;

/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final String f2832a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2833b;

    public a(String str, long j) {
        this.f2832a = str;
        this.f2833b = j;
    }

    @Override // bn.d
    public final String a() {
        return this.f2832a;
    }

    @Override // bn.d
    public final long b() {
        return this.f2833b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f2832a, aVar.f2832a) && this.f2833b == aVar.f2833b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f2833b) + (this.f2832a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Error(entityId=");
        sb2.append(this.f2832a);
        sb2.append(", jobDurationInMillis=");
        return g.h(sb2, this.f2833b, ')');
    }
}
