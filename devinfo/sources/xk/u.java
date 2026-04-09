package xk;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class u extends ck.a {

    /* renamed from: c, reason: collision with root package name */
    public static final s f37240c = new s();

    /* renamed from: b, reason: collision with root package name */
    public final String f37241b;

    public u() {
        super(f37240c);
        this.f37241b = "Room Invalidation Tracker Refresh";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && nk.k.a(this.f37241b, ((u) obj).f37241b);
    }

    public final int hashCode() {
        return this.f37241b.hashCode();
    }

    public final String toString() {
        return r5.c.l(new StringBuilder("CoroutineName("), this.f37241b, ')');
    }
}
