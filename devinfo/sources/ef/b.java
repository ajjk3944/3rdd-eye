package ef;

import d.h;
import i3.e;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f23440h = 0;

    /* renamed from: a, reason: collision with root package name */
    public final String f23441a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23442b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23443c;

    /* renamed from: d, reason: collision with root package name */
    public final String f23444d;

    /* renamed from: e, reason: collision with root package name */
    public final long f23445e;

    /* renamed from: f, reason: collision with root package name */
    public final long f23446f;
    public final String g;

    static {
        byte b10 = (byte) (((byte) (0 | 2)) | 1);
        if (b10 == 3) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        if ((b10 & 1) == 0) {
            sb2.append(" expiresInSecs");
        }
        if ((b10 & 2) == 0) {
            sb2.append(" tokenCreationEpochInSecs");
        }
        throw new IllegalStateException(h.v(sb2, "Missing required properties:"));
    }

    public b(String str, int i4, String str2, String str3, long j, long j8, String str4) {
        this.f23441a = str;
        this.f23442b = i4;
        this.f23443c = str2;
        this.f23444d = str3;
        this.f23445e = j;
        this.f23446f = j8;
        this.g = str4;
    }

    public final a a() {
        a aVar = new a();
        aVar.f23433a = this.f23441a;
        aVar.f23434b = this.f23442b;
        aVar.f23435c = this.f23443c;
        aVar.f23436d = this.f23444d;
        aVar.f23437e = this.f23445e;
        aVar.f23438f = this.f23446f;
        aVar.g = this.g;
        aVar.f23439h = (byte) 3;
        return aVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        String str = bVar.g;
        String str2 = bVar.f23444d;
        String str3 = bVar.f23443c;
        String str4 = bVar.f23441a;
        String str5 = this.f23441a;
        if (str5 == null) {
            if (str4 != null) {
                return false;
            }
        } else if (!str5.equals(str4)) {
            return false;
        }
        if (!e.a(this.f23442b, bVar.f23442b)) {
            return false;
        }
        String str6 = this.f23443c;
        if (str6 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str6.equals(str3)) {
            return false;
        }
        String str7 = this.f23444d;
        if (str7 == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str7.equals(str2)) {
            return false;
        }
        if (this.f23445e != bVar.f23445e || this.f23446f != bVar.f23446f) {
            return false;
        }
        String str8 = this.g;
        return str8 == null ? str == null : str8.equals(str);
    }

    public final int hashCode() {
        String str = this.f23441a;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ e.c(this.f23442b)) * 1000003;
        String str2 = this.f23443c;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f23444d;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j = this.f23445e;
        int i4 = (iHashCode3 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j8 = this.f23446f;
        int i10 = (i4 ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003;
        String str4 = this.g;
        return (str4 != null ? str4.hashCode() : 0) ^ i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb2.append(this.f23441a);
        sb2.append(", registrationStatus=");
        int i4 = this.f23442b;
        sb2.append(i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? i4 != 5 ? "null" : "REGISTER_ERROR" : "REGISTERED" : "UNREGISTERED" : "NOT_GENERATED" : "ATTEMPT_MIGRATION");
        sb2.append(", authToken=");
        sb2.append(this.f23443c);
        sb2.append(", refreshToken=");
        sb2.append(this.f23444d);
        sb2.append(", expiresInSecs=");
        sb2.append(this.f23445e);
        sb2.append(", tokenCreationEpochInSecs=");
        sb2.append(this.f23446f);
        sb2.append(", fisError=");
        return h.w(sb2, this.g, "}");
    }
}
