package me;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class l1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f29215a;

    /* renamed from: b, reason: collision with root package name */
    public final String f29216b;

    /* renamed from: c, reason: collision with root package name */
    public final String f29217c;

    /* renamed from: d, reason: collision with root package name */
    public final String f29218d;

    /* renamed from: e, reason: collision with root package name */
    public final int f29219e;

    /* renamed from: f, reason: collision with root package name */
    public final yb.i f29220f;

    public l1(String str, String str2, String str3, String str4, int i4, yb.i iVar) {
        if (str == null) {
            throw new NullPointerException("Null appIdentifier");
        }
        this.f29215a = str;
        if (str2 == null) {
            throw new NullPointerException("Null versionCode");
        }
        this.f29216b = str2;
        if (str3 == null) {
            throw new NullPointerException("Null versionName");
        }
        this.f29217c = str3;
        if (str4 == null) {
            throw new NullPointerException("Null installUuid");
        }
        this.f29218d = str4;
        this.f29219e = i4;
        this.f29220f = iVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj;
        return this.f29215a.equals(l1Var.f29215a) && this.f29216b.equals(l1Var.f29216b) && this.f29217c.equals(l1Var.f29217c) && this.f29218d.equals(l1Var.f29218d) && this.f29219e == l1Var.f29219e && this.f29220f.equals(l1Var.f29220f);
    }

    public final int hashCode() {
        return ((((((((((this.f29215a.hashCode() ^ 1000003) * 1000003) ^ this.f29216b.hashCode()) * 1000003) ^ this.f29217c.hashCode()) * 1000003) ^ this.f29218d.hashCode()) * 1000003) ^ this.f29219e) * 1000003) ^ this.f29220f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f29215a + ", versionCode=" + this.f29216b + ", versionName=" + this.f29217c + ", installUuid=" + this.f29218d + ", deliveryMechanism=" + this.f29219e + ", developmentPlatformProvider=" + this.f29220f + "}";
    }
}
