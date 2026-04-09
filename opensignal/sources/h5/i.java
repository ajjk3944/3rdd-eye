package h5;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final long f9941a;

    /* renamed from: b, reason: collision with root package name */
    public final long f9942b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9943c;

    /* renamed from: d, reason: collision with root package name */
    public int f9944d;

    public i(String str, long j, long j7) {
        this.f9943c = str == null ? "" : str;
        this.f9941a = j;
        this.f9942b = j7;
    }

    public final i a(i iVar, String str) {
        i iVar2;
        String strY = a5.a.y(str, this.f9943c);
        if (iVar != null) {
            long j = iVar.f9942b;
            if (strY.equals(a5.a.y(str, iVar.f9943c))) {
                long j7 = this.f9942b;
                if (j7 != -1) {
                    long j10 = this.f9941a;
                    iVar2 = null;
                    if (j10 + j7 == iVar.f9941a) {
                        return new i(strY, j10, j != -1 ? j7 + j : -1L);
                    }
                } else {
                    iVar2 = null;
                }
                if (j == -1) {
                    return iVar2;
                }
                long j11 = iVar.f9941a;
                if (j11 + j == this.f9941a) {
                    return new i(strY, j11, j7 != -1 ? j + j7 : -1L);
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
            if (this.f9941a == iVar.f9941a && this.f9942b == iVar.f9942b && this.f9943c.equals(iVar.f9943c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f9944d == 0) {
            this.f9944d = this.f9943c.hashCode() + ((((527 + ((int) this.f9941a)) * 31) + ((int) this.f9942b)) * 31);
        }
        return this.f9944d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RangedUri(referenceUri=");
        sb2.append(this.f9943c);
        sb2.append(", start=");
        sb2.append(this.f9941a);
        sb2.append(", length=");
        return c7.a.n(this.f9942b, ")", sb2);
    }
}
