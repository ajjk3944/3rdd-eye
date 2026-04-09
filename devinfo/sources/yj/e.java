package yj;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public static final e f37633b = new e();

    /* renamed from: a, reason: collision with root package name */
    public final int f37634a = 131605;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        e eVar = (e) obj;
        nk.k.e(eVar, "other");
        return this.f37634a - eVar.f37634a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        e eVar = obj instanceof e ? (e) obj : null;
        return eVar != null && this.f37634a == eVar.f37634a;
    }

    public final int hashCode() {
        return this.f37634a;
    }

    public final String toString() {
        return "2.2.21";
    }
}
