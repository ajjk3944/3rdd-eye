package k5;

import k5.AbstractC5220d;

/* compiled from: AutoValue_InstallationResponse.java */
/* renamed from: k5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5217a extends AbstractC5220d {

    /* renamed from: a, reason: collision with root package name */
    public final String f43388a;

    /* renamed from: b, reason: collision with root package name */
    public final String f43389b;

    /* renamed from: c, reason: collision with root package name */
    public final String f43390c;

    /* renamed from: d, reason: collision with root package name */
    public final C5218b f43391d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC5220d.a f43392e;

    public C5217a(String str, String str2, String str3, C5218b c5218b, AbstractC5220d.a aVar) {
        this.f43388a = str;
        this.f43389b = str2;
        this.f43390c = str3;
        this.f43391d = c5218b;
        this.f43392e = aVar;
    }

    @Override // k5.AbstractC5220d
    public final f a() {
        return this.f43391d;
    }

    @Override // k5.AbstractC5220d
    public final String b() {
        return this.f43389b;
    }

    @Override // k5.AbstractC5220d
    public final String c() {
        return this.f43390c;
    }

    @Override // k5.AbstractC5220d
    public final AbstractC5220d.a d() {
        return this.f43392e;
    }

    @Override // k5.AbstractC5220d
    public final String e() {
        return this.f43388a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5220d)) {
            return false;
        }
        AbstractC5220d abstractC5220d = (AbstractC5220d) obj;
        String str = this.f43388a;
        if (str == null) {
            if (abstractC5220d.e() != null) {
                return false;
            }
        } else if (!str.equals(abstractC5220d.e())) {
            return false;
        }
        String str2 = this.f43389b;
        if (str2 == null) {
            if (abstractC5220d.b() != null) {
                return false;
            }
        } else if (!str2.equals(abstractC5220d.b())) {
            return false;
        }
        String str3 = this.f43390c;
        if (str3 == null) {
            if (abstractC5220d.c() != null) {
                return false;
            }
        } else if (!str3.equals(abstractC5220d.c())) {
            return false;
        }
        C5218b c5218b = this.f43391d;
        if (c5218b == null) {
            if (abstractC5220d.a() != null) {
                return false;
            }
        } else if (!c5218b.equals(abstractC5220d.a())) {
            return false;
        }
        AbstractC5220d.a aVar = this.f43392e;
        return aVar == null ? abstractC5220d.d() == null : aVar.equals(abstractC5220d.d());
    }

    public final int hashCode() {
        String str = this.f43388a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f43389b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f43390c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        C5218b c5218b = this.f43391d;
        int iHashCode4 = (iHashCode3 ^ (c5218b == null ? 0 : c5218b.hashCode())) * 1000003;
        AbstractC5220d.a aVar = this.f43392e;
        return (aVar != null ? aVar.hashCode() : 0) ^ iHashCode4;
    }

    public final String toString() {
        return "InstallationResponse{uri=" + this.f43388a + ", fid=" + this.f43389b + ", refreshToken=" + this.f43390c + ", authToken=" + this.f43391d + ", responseCode=" + this.f43392e + "}";
    }
}
