package lf;

/* loaded from: classes.dex */
public final class e0 extends o1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f15229a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15230b;

    /* renamed from: c, reason: collision with root package name */
    public final String f15231c;

    public e0(String str, String str2, String str3) {
        this.f15229a = str;
        this.f15230b = str2;
        this.f15231c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o1) {
            e0 e0Var = (e0) ((o1) obj);
            if (this.f15229a.equals(e0Var.f15229a) && this.f15230b.equals(e0Var.f15230b) && this.f15231c.equals(e0Var.f15231c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f15229a.hashCode() ^ 1000003) * 1000003) ^ this.f15230b.hashCode()) * 1000003) ^ this.f15231c.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BuildIdMappingForArch{arch=");
        sb2.append(this.f15229a);
        sb2.append(", libraryName=");
        sb2.append(this.f15230b);
        sb2.append(", buildId=");
        return w.g.j(sb2, this.f15231c, "}");
    }
}
