package gm;

import br.l;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final b f9627a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f9628b;

    public a(b bVar, boolean z10) {
        l.e(bVar, "step");
        this.f9627a = bVar;
        this.f9628b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f9627a == aVar.f9627a && this.f9628b == aVar.f9628b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f9628b) + (this.f9627a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SpeedTestStatus(step=");
        sb2.append(this.f9627a);
        sb2.append(", hasError=");
        return c7.a.r(sb2, this.f9628b, ')');
    }
}
