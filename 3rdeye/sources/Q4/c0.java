package Q4;

import Q4.g0;

/* compiled from: AutoValue_StaticSessionData_AppData.java */
/* loaded from: classes2.dex */
public final class c0 extends g0.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f11167a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11168b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11169c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11170d;

    /* renamed from: e, reason: collision with root package name */
    public final int f11171e;

    /* renamed from: f, reason: collision with root package name */
    public final L4.d f11172f;

    public c0(String str, String str2, String str3, String str4, int i, L4.d dVar) {
        if (str == null) {
            throw new NullPointerException("Null appIdentifier");
        }
        this.f11167a = str;
        if (str2 == null) {
            throw new NullPointerException("Null versionCode");
        }
        this.f11168b = str2;
        if (str3 == null) {
            throw new NullPointerException("Null versionName");
        }
        this.f11169c = str3;
        if (str4 == null) {
            throw new NullPointerException("Null installUuid");
        }
        this.f11170d = str4;
        this.f11171e = i;
        this.f11172f = dVar;
    }

    @Override // Q4.g0.a
    public final String a() {
        return this.f11167a;
    }

    @Override // Q4.g0.a
    public final int b() {
        return this.f11171e;
    }

    @Override // Q4.g0.a
    public final L4.d c() {
        return this.f11172f;
    }

    @Override // Q4.g0.a
    public final String d() {
        return this.f11170d;
    }

    @Override // Q4.g0.a
    public final String e() {
        return this.f11168b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g0.a)) {
            return false;
        }
        g0.a aVar = (g0.a) obj;
        return this.f11167a.equals(aVar.a()) && this.f11168b.equals(aVar.e()) && this.f11169c.equals(aVar.f()) && this.f11170d.equals(aVar.d()) && this.f11171e == aVar.b() && this.f11172f.equals(aVar.c());
    }

    @Override // Q4.g0.a
    public final String f() {
        return this.f11169c;
    }

    public final int hashCode() {
        return ((((((((((this.f11167a.hashCode() ^ 1000003) * 1000003) ^ this.f11168b.hashCode()) * 1000003) ^ this.f11169c.hashCode()) * 1000003) ^ this.f11170d.hashCode()) * 1000003) ^ this.f11171e) * 1000003) ^ this.f11172f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f11167a + ", versionCode=" + this.f11168b + ", versionName=" + this.f11169c + ", installUuid=" + this.f11170d + ", deliveryMechanism=" + this.f11171e + ", developmentPlatformProvider=" + this.f11172f + "}";
    }
}
