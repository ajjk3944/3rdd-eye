package O4;

/* compiled from: AutoValue_InstallIdProvider_InstallIds.java */
/* renamed from: O4.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1457c extends Q {

    /* renamed from: a, reason: collision with root package name */
    public final String f10301a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10302b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10303c;

    public C1457c(String str, String str2, String str3) {
        if (str == null) {
            throw new NullPointerException("Null crashlyticsInstallId");
        }
        this.f10301a = str;
        this.f10302b = str2;
        this.f10303c = str3;
    }

    @Override // O4.Q
    public final String a() {
        return this.f10301a;
    }

    @Override // O4.Q
    public final String b() {
        return this.f10303c;
    }

    @Override // O4.Q
    public final String c() {
        return this.f10302b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Q)) {
            return false;
        }
        Q q10 = (Q) obj;
        if (!this.f10301a.equals(q10.a())) {
            return false;
        }
        String str = this.f10302b;
        if (str == null) {
            if (q10.c() != null) {
                return false;
            }
        } else if (!str.equals(q10.c())) {
            return false;
        }
        String str2 = this.f10303c;
        return str2 == null ? q10.b() == null : str2.equals(q10.b());
    }

    public final int hashCode() {
        int iHashCode = (this.f10301a.hashCode() ^ 1000003) * 1000003;
        String str = this.f10302b;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f10303c;
        return iHashCode2 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallIds{crashlyticsInstallId=");
        sb.append(this.f10301a);
        sb.append(", firebaseInstallationId=");
        sb.append(this.f10302b);
        sb.append(", firebaseAuthenticationToken=");
        return B4.f.c(sb, this.f10303c, "}");
    }
}
