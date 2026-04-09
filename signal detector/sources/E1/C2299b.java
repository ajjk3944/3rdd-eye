package e1;

/* renamed from: e1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2299b {

    /* renamed from: a, reason: collision with root package name */
    public final String f19898a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f19899b;

    public C2299b(String str, long j6) {
        this.f19898a = str;
        this.f19899b = Long.valueOf(j6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2299b)) {
            return false;
        }
        C2299b c2299b = (C2299b) obj;
        String str = c2299b.f19898a;
        Long l2 = c2299b.f19899b;
        if (!this.f19898a.equals(str)) {
            return false;
        }
        Long l6 = this.f19899b;
        return l6 != null ? l6.equals(l2) : l2 == null;
    }

    public final int hashCode() {
        int iHashCode = this.f19898a.hashCode() * 31;
        Long l2 = this.f19899b;
        return iHashCode + (l2 != null ? l2.hashCode() : 0);
    }
}
