package ni;

/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f18119a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f18120b;

    public r0(String str, Long l10) {
        this.f18119a = str;
        this.f18120b = l10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return br.l.a(this.f18119a, r0Var.f18119a) && br.l.a(this.f18120b, r0Var.f18120b);
    }

    public final int hashCode() {
        String str = this.f18119a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l10 = this.f18120b;
        return iHashCode + (l10 != null ? l10.hashCode() : 0);
    }

    public final String toString() {
        return "TelephonyPhysicalChannelConfigCoreResult(physicalChannelConfigString=" + this.f18119a + ", timestamp=" + this.f18120b + ')';
    }
}
