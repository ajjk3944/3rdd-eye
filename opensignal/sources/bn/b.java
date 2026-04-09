package bn;

import br.l;
import w.g;

/* loaded from: classes.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final bh.a f2834a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2835b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2836c;

    public b(bh.a aVar, String str, long j) {
        l.e(aVar, "analysisResult");
        this.f2834a = aVar;
        this.f2835b = str;
        this.f2836c = j;
    }

    @Override // bn.d
    public final String a() {
        return this.f2835b;
    }

    @Override // bn.d
    public final long b() {
        return this.f2836c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f2834a, bVar.f2834a) && l.a(this.f2835b, bVar.f2835b) && this.f2836c == bVar.f2836c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f2836c) + c7.a.g(this.f2835b, this.f2834a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IssuesFound(analysisResult=");
        sb2.append(this.f2834a);
        sb2.append(", entityId=");
        sb2.append(this.f2835b);
        sb2.append(", jobDurationInMillis=");
        return g.h(sb2, this.f2836c, ')');
    }
}
