package x6;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f36980a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f36981b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f36982c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f36983d;

    public e(boolean z3, boolean z10, boolean z11, boolean z12) {
        this.f36980a = z3;
        this.f36981b = z10;
        this.f36982c = z11;
        this.f36983d = z12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f36980a == eVar.f36980a && this.f36981b == eVar.f36981b && this.f36982c == eVar.f36982c && this.f36983d == eVar.f36983d;
    }

    public final int hashCode() {
        return ((((((this.f36980a ? 1231 : 1237) * 31) + (this.f36981b ? 1231 : 1237)) * 31) + (this.f36982c ? 1231 : 1237)) * 31) + (this.f36983d ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NetworkState(isConnected=");
        sb2.append(this.f36980a);
        sb2.append(", isValidated=");
        sb2.append(this.f36981b);
        sb2.append(", isMetered=");
        sb2.append(this.f36982c);
        sb2.append(", isNotRoaming=");
        return d.h.x(sb2, this.f36983d, ')');
    }
}
