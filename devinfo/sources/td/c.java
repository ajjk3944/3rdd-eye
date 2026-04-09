package td;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c extends b {

    /* renamed from: a, reason: collision with root package name */
    public final Object f34541a;

    public c(Object obj) {
        this.f34541a = obj;
    }

    @Override // td.b
    public final Object a() {
        return this.f34541a;
    }

    @Override // td.b
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            return this.f34541a.equals(((c) obj).f34541a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f34541a.hashCode() + 1502476572;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f34541a);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 13);
        sb2.append("Optional.of(");
        sb2.append(strValueOf);
        sb2.append(")");
        return sb2.toString();
    }
}
