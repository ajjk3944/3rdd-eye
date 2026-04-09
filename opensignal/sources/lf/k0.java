package lf;

/* loaded from: classes.dex */
public final class k0 extends u1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f15316a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15317b;

    /* renamed from: c, reason: collision with root package name */
    public final String f15318c;

    /* renamed from: d, reason: collision with root package name */
    public final String f15319d;

    /* renamed from: e, reason: collision with root package name */
    public final String f15320e;

    /* renamed from: f, reason: collision with root package name */
    public final String f15321f;

    public k0(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f15316a = str;
        this.f15317b = str2;
        this.f15318c = str3;
        this.f15319d = str4;
        this.f15320e = str5;
        this.f15321f = str6;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        if (obj == this) {
            return true;
        }
        if (obj instanceof u1) {
            k0 k0Var = (k0) ((u1) obj);
            String str5 = k0Var.f15321f;
            String str6 = k0Var.f15320e;
            String str7 = k0Var.f15319d;
            String str8 = k0Var.f15318c;
            if (this.f15316a.equals(k0Var.f15316a) && this.f15317b.equals(k0Var.f15317b) && ((str = this.f15318c) != null ? str.equals(str8) : str8 == null) && ((str2 = this.f15319d) != null ? str2.equals(str7) : str7 == null) && ((str3 = this.f15320e) != null ? str3.equals(str6) : str6 == null) && ((str4 = this.f15321f) != null ? str4.equals(str5) : str5 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f15316a.hashCode() ^ 1000003) * 1000003) ^ this.f15317b.hashCode()) * 1000003;
        String str = this.f15318c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * (-721379959);
        String str2 = this.f15319d;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f15320e;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f15321f;
        return iHashCode4 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Application{identifier=");
        sb2.append(this.f15316a);
        sb2.append(", version=");
        sb2.append(this.f15317b);
        sb2.append(", displayVersion=");
        sb2.append(this.f15318c);
        sb2.append(", organization=null, installationUuid=");
        sb2.append(this.f15319d);
        sb2.append(", developmentPlatform=");
        sb2.append(this.f15320e);
        sb2.append(", developmentPlatformVersion=");
        return w.g.j(sb2, this.f15321f, "}");
    }
}
