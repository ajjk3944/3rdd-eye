package m4;

/* renamed from: m4.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6770i extends AbstractC6768g {

    /* renamed from: a, reason: collision with root package name */
    private final Object f53132a;

    C6770i(Object obj) {
        this.f53132a = obj;
    }

    @Override // m4.AbstractC6768g
    public Object c() {
        return this.f53132a;
    }

    @Override // m4.AbstractC6768g
    public boolean d() {
        return true;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C6770i) {
            return this.f53132a.equals(((C6770i) obj).f53132a);
        }
        return false;
    }

    public int hashCode() {
        return this.f53132a.hashCode() + 1502476572;
    }

    public String toString() {
        String strValueOf = String.valueOf(this.f53132a);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 13);
        sb2.append("Optional.of(");
        sb2.append(strValueOf);
        sb2.append(")");
        return sb2.toString();
    }
}
