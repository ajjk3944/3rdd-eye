package c2;

import br.l;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final m1.d f3130a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3131b;

    public a(m1.d dVar, int i10) {
        this.f3130a = dVar;
        this.f3131b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f3130a, aVar.f3130a) && this.f3131b == aVar.f3131b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3131b) + (this.f3130a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImageVectorEntry(imageVector=");
        sb2.append(this.f3130a);
        sb2.append(", configFlags=");
        return c7.a.q(sb2, this.f3131b, ')');
    }
}
