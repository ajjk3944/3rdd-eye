package j5;

import B4.f;
import j5.c;
import j5.d;

/* compiled from: AutoValue_PersistedInstallationEntry.java */
/* renamed from: j5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5194a extends d {

    /* renamed from: b, reason: collision with root package name */
    public final String f42956b;

    /* renamed from: c, reason: collision with root package name */
    public final c.a f42957c;

    /* renamed from: d, reason: collision with root package name */
    public final String f42958d;

    /* renamed from: e, reason: collision with root package name */
    public final String f42959e;

    /* renamed from: f, reason: collision with root package name */
    public final long f42960f;

    /* renamed from: g, reason: collision with root package name */
    public final long f42961g;

    /* renamed from: h, reason: collision with root package name */
    public final String f42962h;

    /* compiled from: AutoValue_PersistedInstallationEntry.java */
    /* renamed from: j5.a$a, reason: collision with other inner class name */
    public static final class C0477a extends d.a {

        /* renamed from: a, reason: collision with root package name */
        public String f42963a;

        /* renamed from: b, reason: collision with root package name */
        public c.a f42964b;

        /* renamed from: c, reason: collision with root package name */
        public String f42965c;

        /* renamed from: d, reason: collision with root package name */
        public String f42966d;

        /* renamed from: e, reason: collision with root package name */
        public Long f42967e;

        /* renamed from: f, reason: collision with root package name */
        public Long f42968f;

        /* renamed from: g, reason: collision with root package name */
        public String f42969g;

        public final C5194a a() {
            String strConcat = this.f42964b == null ? " registrationStatus" : "";
            if (this.f42967e == null) {
                strConcat = strConcat.concat(" expiresInSecs");
            }
            if (strConcat.isEmpty()) {
                return new C5194a(this.f42963a, this.f42964b, this.f42965c, this.f42966d, this.f42967e.longValue(), this.f42968f.longValue(), this.f42969g);
            }
            throw new IllegalStateException("Missing required properties:".concat(strConcat));
        }

        public final C0477a b(c.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null registrationStatus");
            }
            this.f42964b = aVar;
            return this;
        }
    }

    public C5194a(String str, c.a aVar, String str2, String str3, long j4, long j10, String str4) {
        this.f42956b = str;
        this.f42957c = aVar;
        this.f42958d = str2;
        this.f42959e = str3;
        this.f42960f = j4;
        this.f42961g = j10;
        this.f42962h = str4;
    }

    @Override // j5.d
    public final String a() {
        return this.f42958d;
    }

    @Override // j5.d
    public final long b() {
        return this.f42960f;
    }

    @Override // j5.d
    public final String c() {
        return this.f42956b;
    }

    @Override // j5.d
    public final String d() {
        return this.f42962h;
    }

    @Override // j5.d
    public final String e() {
        return this.f42959e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str = this.f42956b;
        if (str == null) {
            if (dVar.c() != null) {
                return false;
            }
        } else if (!str.equals(dVar.c())) {
            return false;
        }
        if (!this.f42957c.equals(dVar.f())) {
            return false;
        }
        String str2 = this.f42958d;
        if (str2 == null) {
            if (dVar.a() != null) {
                return false;
            }
        } else if (!str2.equals(dVar.a())) {
            return false;
        }
        String str3 = this.f42959e;
        if (str3 == null) {
            if (dVar.e() != null) {
                return false;
            }
        } else if (!str3.equals(dVar.e())) {
            return false;
        }
        if (this.f42960f != dVar.b() || this.f42961g != dVar.g()) {
            return false;
        }
        String str4 = this.f42962h;
        return str4 == null ? dVar.d() == null : str4.equals(dVar.d());
    }

    @Override // j5.d
    public final c.a f() {
        return this.f42957c;
    }

    @Override // j5.d
    public final long g() {
        return this.f42961g;
    }

    public final C0477a h() {
        C0477a c0477a = new C0477a();
        c0477a.f42963a = this.f42956b;
        c0477a.f42964b = this.f42957c;
        c0477a.f42965c = this.f42958d;
        c0477a.f42966d = this.f42959e;
        c0477a.f42967e = Long.valueOf(this.f42960f);
        c0477a.f42968f = Long.valueOf(this.f42961g);
        c0477a.f42969g = this.f42962h;
        return c0477a;
    }

    public final int hashCode() {
        String str = this.f42956b;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f42957c.hashCode()) * 1000003;
        String str2 = this.f42958d;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f42959e;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j4 = this.f42960f;
        int i = (iHashCode3 ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003;
        long j10 = this.f42961g;
        int i10 = (i ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        String str4 = this.f42962h;
        return (str4 != null ? str4.hashCode() : 0) ^ i10;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb.append(this.f42956b);
        sb.append(", registrationStatus=");
        sb.append(this.f42957c);
        sb.append(", authToken=");
        sb.append(this.f42958d);
        sb.append(", refreshToken=");
        sb.append(this.f42959e);
        sb.append(", expiresInSecs=");
        sb.append(this.f42960f);
        sb.append(", tokenCreationEpochInSecs=");
        sb.append(this.f42961g);
        sb.append(", fisError=");
        return f.c(sb, this.f42962h, "}");
    }
}
