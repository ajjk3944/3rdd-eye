package ng;

import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f29942a;

    /* renamed from: b, reason: collision with root package name */
    public final String f29943b = null;

    public a(boolean z3) {
        this.f29942a = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f29942a == aVar.f29942a && k.a(this.f29943b, aVar.f29943b);
    }

    public final int hashCode() {
        int i4 = (this.f29942a ? 1231 : 1237) * 31;
        String str = this.f29943b;
        return i4 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "LoadingData(show=" + this.f29942a + ", msg=" + this.f29943b + ")";
    }
}
