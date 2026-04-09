package cq;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f6610a;

    /* renamed from: b, reason: collision with root package name */
    public final long f6611b;

    public b(String str, long j) {
        this.f6610a = str;
        this.f6611b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return br.l.a(this.f6610a, bVar.f6610a) && this.f6611b == bVar.f6611b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f6611b) + (this.f6610a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActiveScreen(screenName=");
        sb2.append(this.f6610a);
        sb2.append(", timeOfCreationMs=");
        return w.g.h(sb2, this.f6611b, ')');
    }
}
