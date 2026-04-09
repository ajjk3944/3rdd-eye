package cb;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final long f3568a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3569b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3570c;

    /* renamed from: d, reason: collision with root package name */
    public int f3571d;

    public i(String str, long j, long j7) {
        this.f3570c = str == null ? "" : str;
        this.f3568a = j;
        this.f3569b = j7;
    }

    public final i a(i iVar, String str) {
        i iVar2;
        String strF = qb.b.F(str, this.f3570c);
        if (iVar != null) {
            long j = iVar.f3569b;
            if (strF.equals(qb.b.F(str, iVar.f3570c))) {
                long j7 = this.f3569b;
                if (j7 != -1) {
                    long j10 = this.f3568a;
                    iVar2 = null;
                    if (j10 + j7 == iVar.f3568a) {
                        return new i(strF, j10, j != -1 ? j7 + j : -1L);
                    }
                } else {
                    iVar2 = null;
                }
                if (j == -1) {
                    return iVar2;
                }
                long j11 = iVar.f3568a;
                if (j11 + j == this.f3568a) {
                    return new i(strF, j11, j7 != -1 ? j + j7 : -1L);
                }
                return iVar2;
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            i iVar = (i) obj;
            if (this.f3568a == iVar.f3568a && this.f3569b == iVar.f3569b && this.f3570c.equals(iVar.f3570c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f3571d == 0) {
            this.f3571d = this.f3570c.hashCode() + ((((527 + ((int) this.f3568a)) * 31) + ((int) this.f3569b)) * 31);
        }
        return this.f3571d;
    }

    public final String toString() {
        String str = this.f3570c;
        StringBuilder sb2 = new StringBuilder(c7.a.d(81, str));
        sb2.append("RangedUri(referenceUri=");
        sb2.append(str);
        sb2.append(", start=");
        sb2.append(this.f3568a);
        sb2.append(", length=");
        sb2.append(this.f3569b);
        sb2.append(")");
        return sb2.toString();
    }
}
