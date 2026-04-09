package un;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class d extends j {

    /* renamed from: a, reason: collision with root package name */
    public final long f23600a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f23601b;

    public d(long j, ArrayList arrayList) {
        this.f23600a = j;
        this.f23601b = arrayList;
    }

    @Override // un.j
    public final long a() {
        return this.f23600a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f23600a == dVar.f23600a && this.f23601b.equals(dVar.f23601b);
    }

    public final int hashCode() {
        return this.f23601b.hashCode() + (Long.hashCode(this.f23600a) * 31);
    }

    public final String toString() {
        return "Form(pointId=" + this.f23600a + ", answers=" + this.f23601b + ')';
    }
}
