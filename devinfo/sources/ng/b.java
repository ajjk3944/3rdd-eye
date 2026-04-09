package ng;

import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f29944a;

    /* renamed from: b, reason: collision with root package name */
    public final String f29945b;

    public /* synthetic */ b() {
        this(false, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f29944a == bVar.f29944a && k.a(this.f29945b, bVar.f29945b);
    }

    public final int hashCode() {
        int i4 = (this.f29944a ? 1231 : 1237) * 31;
        String str = this.f29945b;
        return i4 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "SearchData(searching=" + this.f29944a + ", query=" + this.f29945b + ")";
    }

    public b(boolean z3, String str) {
        this.f29944a = z3;
        this.f29945b = str;
    }
}
