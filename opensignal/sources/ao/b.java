package ao;

import br.l;
import w.g;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f2162a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2163b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2164c;

    public b(String str, boolean z10, long j) {
        l.e(str, "id");
        this.f2162a = str;
        this.f2163b = z10;
        this.f2164c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f2162a, bVar.f2162a) && this.f2163b == bVar.f2163b && this.f2164c == bVar.f2164c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f2164c) + g.b(this.f2162a.hashCode() * 31, this.f2163b, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CoreBackendTargetingSurveyResult(id=");
        sb2.append(this.f2162a);
        sb2.append(", isSuccess=");
        sb2.append(this.f2163b);
        sb2.append(", cacheUntilMs=");
        return g.h(sb2, this.f2164c, ')');
    }
}
