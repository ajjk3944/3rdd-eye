package gg;

import w.g;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f9569h = 0;

    /* renamed from: a, reason: collision with root package name */
    public final String f9570a;

    /* renamed from: b, reason: collision with root package name */
    public final d f9571b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9572c;

    /* renamed from: d, reason: collision with root package name */
    public final String f9573d;

    /* renamed from: e, reason: collision with root package name */
    public final long f9574e;

    /* renamed from: f, reason: collision with root package name */
    public final long f9575f;

    /* renamed from: g, reason: collision with root package name */
    public final String f9576g;

    static {
        a aVar = new a();
        aVar.f9566f = 0L;
        aVar.f9568h = (byte) (aVar.f9568h | 2);
        aVar.b(d.ATTEMPT_MIGRATION);
        aVar.f9565e = 0L;
        aVar.f9568h = (byte) (aVar.f9568h | 1);
        aVar.a();
    }

    public b(String str, d dVar, String str2, String str3, long j, long j7, String str4) {
        this.f9570a = str;
        this.f9571b = dVar;
        this.f9572c = str2;
        this.f9573d = str3;
        this.f9574e = j;
        this.f9575f = j7;
        this.f9576g = str4;
    }

    public final a a() {
        a aVar = new a();
        aVar.f9561a = this.f9570a;
        aVar.f9562b = this.f9571b;
        aVar.f9563c = this.f9572c;
        aVar.f9564d = this.f9573d;
        aVar.f9565e = this.f9574e;
        aVar.f9566f = this.f9575f;
        aVar.f9567g = this.f9576g;
        aVar.f9568h = (byte) 3;
        return aVar;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            String str4 = bVar.f9576g;
            String str5 = bVar.f9573d;
            String str6 = bVar.f9572c;
            String str7 = bVar.f9570a;
            String str8 = this.f9570a;
            if (str8 != null ? str8.equals(str7) : str7 == null) {
                if (this.f9571b.equals(bVar.f9571b) && ((str = this.f9572c) != null ? str.equals(str6) : str6 == null) && ((str2 = this.f9573d) != null ? str2.equals(str5) : str5 == null) && this.f9574e == bVar.f9574e && this.f9575f == bVar.f9575f && ((str3 = this.f9576g) != null ? str3.equals(str4) : str4 == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f9570a;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f9571b.hashCode()) * 1000003;
        String str2 = this.f9572c;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f9573d;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j = this.f9574e;
        int i10 = (iHashCode3 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j7 = this.f9575f;
        int i11 = (i10 ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003;
        String str4 = this.f9576g;
        return (str4 != null ? str4.hashCode() : 0) ^ i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb2.append(this.f9570a);
        sb2.append(", registrationStatus=");
        sb2.append(this.f9571b);
        sb2.append(", authToken=");
        sb2.append(this.f9572c);
        sb2.append(", refreshToken=");
        sb2.append(this.f9573d);
        sb2.append(", expiresInSecs=");
        sb2.append(this.f9574e);
        sb2.append(", tokenCreationEpochInSecs=");
        sb2.append(this.f9575f);
        sb2.append(", fisError=");
        return g.j(sb2, this.f9576g, "}");
    }
}
