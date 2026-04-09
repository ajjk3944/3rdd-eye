package u0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f34890a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f34891b;

    public o0(Integer num, Object obj) {
        this.f34890a = num;
        this.f34891b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return this.f34890a.equals(o0Var.f34890a) && nk.k.a(this.f34891b, o0Var.f34891b);
    }

    public final int hashCode() {
        int iHashCode = this.f34890a.hashCode() * 31;
        Object obj = this.f34891b;
        return (obj instanceof Enum ? ((Enum) obj).ordinal() : obj != null ? obj.hashCode() : 0) + iHashCode;
    }

    public final String toString() {
        return "JoinedKey(left=" + this.f34890a + ", right=" + this.f34891b + ')';
    }
}
