package me;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class k0 extends u1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f29201a;

    /* renamed from: b, reason: collision with root package name */
    public final String f29202b;

    /* renamed from: c, reason: collision with root package name */
    public final String f29203c;

    /* renamed from: d, reason: collision with root package name */
    public final String f29204d;

    /* renamed from: e, reason: collision with root package name */
    public final String f29205e;

    /* renamed from: f, reason: collision with root package name */
    public final String f29206f;

    public k0(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f29201a = str;
        this.f29202b = str2;
        this.f29203c = str3;
        this.f29204d = str4;
        this.f29205e = str5;
        this.f29206f = str6;
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
            String str5 = k0Var.f29206f;
            String str6 = k0Var.f29205e;
            String str7 = k0Var.f29204d;
            String str8 = k0Var.f29203c;
            if (this.f29201a.equals(k0Var.f29201a) && this.f29202b.equals(k0Var.f29202b) && ((str = this.f29203c) != null ? str.equals(str8) : str8 == null) && ((str2 = this.f29204d) != null ? str2.equals(str7) : str7 == null) && ((str3 = this.f29205e) != null ? str3.equals(str6) : str6 == null) && ((str4 = this.f29206f) != null ? str4.equals(str5) : str5 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f29201a.hashCode() ^ 1000003) * 1000003) ^ this.f29202b.hashCode()) * 1000003;
        String str = this.f29203c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * (-721379959);
        String str2 = this.f29204d;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f29205e;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f29206f;
        return iHashCode4 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Application{identifier=");
        sb2.append(this.f29201a);
        sb2.append(", version=");
        sb2.append(this.f29202b);
        sb2.append(", displayVersion=");
        sb2.append(this.f29203c);
        sb2.append(", organization=null, installationUuid=");
        sb2.append(this.f29204d);
        sb2.append(", developmentPlatform=");
        sb2.append(this.f29205e);
        sb2.append(", developmentPlatformVersion=");
        return d.h.w(sb2, this.f29206f, "}");
    }
}
