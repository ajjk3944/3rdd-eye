package Q4;

import Q4.f0;

/* compiled from: AutoValue_CrashlyticsReport_Session_Application.java */
/* loaded from: classes2.dex */
public final class H extends f0.e.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f11021a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11022b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11023c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11024d;

    /* renamed from: e, reason: collision with root package name */
    public final String f11025e;

    /* renamed from: f, reason: collision with root package name */
    public final String f11026f;

    public H(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f11021a = str;
        this.f11022b = str2;
        this.f11023c = str3;
        this.f11024d = str4;
        this.f11025e = str5;
        this.f11026f = str6;
    }

    @Override // Q4.f0.e.a
    public final String a() {
        return this.f11025e;
    }

    @Override // Q4.f0.e.a
    public final String b() {
        return this.f11026f;
    }

    @Override // Q4.f0.e.a
    public final String c() {
        return this.f11023c;
    }

    @Override // Q4.f0.e.a
    public final String d() {
        return this.f11021a;
    }

    @Override // Q4.f0.e.a
    public final String e() {
        return this.f11024d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.e.a)) {
            return false;
        }
        f0.e.a aVar = (f0.e.a) obj;
        if (!this.f11021a.equals(aVar.d()) || !this.f11022b.equals(aVar.g())) {
            return false;
        }
        String str = this.f11023c;
        if (str == null) {
            if (aVar.c() != null) {
                return false;
            }
        } else if (!str.equals(aVar.c())) {
            return false;
        }
        if (aVar.f() != null) {
            return false;
        }
        String str2 = this.f11024d;
        if (str2 == null) {
            if (aVar.e() != null) {
                return false;
            }
        } else if (!str2.equals(aVar.e())) {
            return false;
        }
        String str3 = this.f11025e;
        if (str3 == null) {
            if (aVar.a() != null) {
                return false;
            }
        } else if (!str3.equals(aVar.a())) {
            return false;
        }
        String str4 = this.f11026f;
        return str4 == null ? aVar.b() == null : str4.equals(aVar.b());
    }

    @Override // Q4.f0.e.a
    public final f0.e.a.AbstractC0136a f() {
        return null;
    }

    @Override // Q4.f0.e.a
    public final String g() {
        return this.f11022b;
    }

    public final int hashCode() {
        int iHashCode = (((this.f11021a.hashCode() ^ 1000003) * 1000003) ^ this.f11022b.hashCode()) * 1000003;
        String str = this.f11023c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * (-721379959);
        String str2 = this.f11024d;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f11025e;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f11026f;
        return iHashCode4 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Application{identifier=");
        sb.append(this.f11021a);
        sb.append(", version=");
        sb.append(this.f11022b);
        sb.append(", displayVersion=");
        sb.append(this.f11023c);
        sb.append(", organization=null, installationUuid=");
        sb.append(this.f11024d);
        sb.append(", developmentPlatform=");
        sb.append(this.f11025e);
        sb.append(", developmentPlatformVersion=");
        return B4.f.c(sb, this.f11026f, "}");
    }
}
