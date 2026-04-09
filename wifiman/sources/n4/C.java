package N4;

import N4.G;

/* loaded from: classes3.dex */
final class C extends G.a {

    /* renamed from: a, reason: collision with root package name */
    private final String f14902a;

    /* renamed from: b, reason: collision with root package name */
    private final String f14903b;

    /* renamed from: c, reason: collision with root package name */
    private final String f14904c;

    /* renamed from: d, reason: collision with root package name */
    private final String f14905d;

    /* renamed from: e, reason: collision with root package name */
    private final int f14906e;

    /* renamed from: f, reason: collision with root package name */
    private final I4.f f14907f;

    C(String str, String str2, String str3, String str4, int i10, I4.f fVar) {
        if (str == null) {
            throw new NullPointerException("Null appIdentifier");
        }
        this.f14902a = str;
        if (str2 == null) {
            throw new NullPointerException("Null versionCode");
        }
        this.f14903b = str2;
        if (str3 == null) {
            throw new NullPointerException("Null versionName");
        }
        this.f14904c = str3;
        if (str4 == null) {
            throw new NullPointerException("Null installUuid");
        }
        this.f14905d = str4;
        this.f14906e = i10;
        if (fVar == null) {
            throw new NullPointerException("Null developmentPlatformProvider");
        }
        this.f14907f = fVar;
    }

    @Override // N4.G.a
    public String a() {
        return this.f14902a;
    }

    @Override // N4.G.a
    public int c() {
        return this.f14906e;
    }

    @Override // N4.G.a
    public I4.f d() {
        return this.f14907f;
    }

    @Override // N4.G.a
    public String e() {
        return this.f14905d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof G.a)) {
            return false;
        }
        G.a aVar = (G.a) obj;
        return this.f14902a.equals(aVar.a()) && this.f14903b.equals(aVar.f()) && this.f14904c.equals(aVar.g()) && this.f14905d.equals(aVar.e()) && this.f14906e == aVar.c() && this.f14907f.equals(aVar.d());
    }

    @Override // N4.G.a
    public String f() {
        return this.f14903b;
    }

    @Override // N4.G.a
    public String g() {
        return this.f14904c;
    }

    public int hashCode() {
        return ((((((((((this.f14902a.hashCode() ^ 1000003) * 1000003) ^ this.f14903b.hashCode()) * 1000003) ^ this.f14904c.hashCode()) * 1000003) ^ this.f14905d.hashCode()) * 1000003) ^ this.f14906e) * 1000003) ^ this.f14907f.hashCode();
    }

    public String toString() {
        return "AppData{appIdentifier=" + this.f14902a + ", versionCode=" + this.f14903b + ", versionName=" + this.f14904c + ", installUuid=" + this.f14905d + ", deliveryMechanism=" + this.f14906e + ", developmentPlatformProvider=" + this.f14907f + "}";
    }
}
