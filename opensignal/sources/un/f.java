package un;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class f extends j {

    /* renamed from: a, reason: collision with root package name */
    public final long f23604a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f23605b;

    public f(long j, ArrayList arrayList) {
        this.f23604a = j;
        this.f23605b = arrayList;
    }

    @Override // un.j
    public final long a() {
        return this.f23604a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f23604a == fVar.f23604a && this.f23605b.equals(fVar.f23605b);
    }

    public final int hashCode() {
        return this.f23605b.hashCode() + (Long.hashCode(this.f23604a) * 31);
    }

    public final String toString() {
        return "Multiple(pointId=" + this.f23604a + ", answersIds=" + this.f23605b + ')';
    }
}
