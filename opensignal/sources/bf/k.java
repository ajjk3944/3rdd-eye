package bf;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final u f2725a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2726b;

    public k(u uVar, boolean z10) {
        this.f2725a = uVar;
        this.f2726b = z10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (kVar.f2725a.equals(this.f2725a) && kVar.f2726b == this.f2726b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f2725a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f2726b).hashCode();
    }
}
