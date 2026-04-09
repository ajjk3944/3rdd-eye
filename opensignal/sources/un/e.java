package un;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e extends j {

    /* renamed from: a, reason: collision with root package name */
    public final long f23602a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f23603b;

    public e(long j, ArrayList arrayList) {
        this.f23602a = j;
        this.f23603b = arrayList;
    }

    @Override // un.j
    public final long a() {
        return this.f23602a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f23602a == eVar.f23602a && this.f23603b.equals(eVar.f23603b);
    }

    public final int hashCode() {
        return this.f23603b.hashCode() + (Long.hashCode(this.f23602a) * 31);
    }

    public final String toString() {
        return "Matrix(pointId=" + this.f23602a + ", answers=" + this.f23603b + ')';
    }
}
