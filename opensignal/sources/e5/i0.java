package e5;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final a f7832a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.media3.common.r f7833b;

    public i0(a aVar, androidx.media3.common.r rVar) {
        this.f7832a = aVar;
        this.f7833b = rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i0.class == obj.getClass()) {
            i0 i0Var = (i0) obj;
            androidx.media3.common.r rVar = i0Var.f7833b;
            if (!this.f7832a.equals(i0Var.f7832a)) {
                return false;
            }
            androidx.media3.common.r rVar2 = this.f7833b;
            if (rVar2 != null) {
                return rVar2.equals(rVar);
            }
            if (rVar == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f7832a.hashCode() * 31;
        androidx.media3.common.r rVar = this.f7833b;
        return iHashCode + (rVar != null ? rVar.hashCode() : 0);
    }
}
