package lf;

/* loaded from: classes.dex */
public final class l1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f15330a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15331b;

    /* renamed from: c, reason: collision with root package name */
    public final String f15332c;

    /* renamed from: d, reason: collision with root package name */
    public final String f15333d;

    /* renamed from: e, reason: collision with root package name */
    public final int f15334e;

    /* renamed from: f, reason: collision with root package name */
    public final io.sentry.internal.debugmeta.c f15335f;

    public l1(String str, String str2, String str3, String str4, int i10, io.sentry.internal.debugmeta.c cVar) {
        if (str == null) {
            throw new NullPointerException("Null appIdentifier");
        }
        this.f15330a = str;
        if (str2 == null) {
            throw new NullPointerException("Null versionCode");
        }
        this.f15331b = str2;
        if (str3 == null) {
            throw new NullPointerException("Null versionName");
        }
        this.f15332c = str3;
        if (str4 == null) {
            throw new NullPointerException("Null installUuid");
        }
        this.f15333d = str4;
        this.f15334e = i10;
        this.f15335f = cVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l1) {
            l1 l1Var = (l1) obj;
            if (this.f15330a.equals(l1Var.f15330a) && this.f15331b.equals(l1Var.f15331b) && this.f15332c.equals(l1Var.f15332c) && this.f15333d.equals(l1Var.f15333d) && this.f15334e == l1Var.f15334e && this.f15335f.equals(l1Var.f15335f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.f15330a.hashCode() ^ 1000003) * 1000003) ^ this.f15331b.hashCode()) * 1000003) ^ this.f15332c.hashCode()) * 1000003) ^ this.f15333d.hashCode()) * 1000003) ^ this.f15334e) * 1000003) ^ this.f15335f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f15330a + ", versionCode=" + this.f15331b + ", versionName=" + this.f15332c + ", installUuid=" + this.f15333d + ", deliveryMechanism=" + this.f15334e + ", developmentPlatformProvider=" + this.f15335f + "}";
    }
}
