package ne;

/* loaded from: classes.dex */
public final class l extends i {

    /* renamed from: a, reason: collision with root package name */
    public final Object f17529a;

    public l(Object obj) {
        this.f17529a = obj;
    }

    @Override // ne.i
    public final Object a() {
        return this.f17529a;
    }

    @Override // ne.i
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            return this.f17529a.equals(((l) obj).f17529a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17529a.hashCode() + 1502476572;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f17529a);
        return c7.a.k(strValueOf.length() + 13, "Optional.of(", strValueOf, ")");
    }
}
