package k5;

import k5.f;

/* compiled from: AutoValue_TokenResult.java */
/* renamed from: k5.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5218b extends f {

    /* renamed from: a, reason: collision with root package name */
    public final String f43393a;

    /* renamed from: b, reason: collision with root package name */
    public final long f43394b;

    /* renamed from: c, reason: collision with root package name */
    public final f.b f43395c;

    /* compiled from: AutoValue_TokenResult.java */
    /* renamed from: k5.b$a */
    public static final class a extends f.a {

        /* renamed from: a, reason: collision with root package name */
        public String f43396a;

        /* renamed from: b, reason: collision with root package name */
        public Long f43397b;

        /* renamed from: c, reason: collision with root package name */
        public f.b f43398c;

        public final C5218b a() {
            if ("".isEmpty()) {
                return new C5218b(this.f43396a, this.f43397b.longValue(), this.f43398c);
            }
            throw new IllegalStateException("Missing required properties:".concat(""));
        }
    }

    public C5218b(String str, long j4, f.b bVar) {
        this.f43393a = str;
        this.f43394b = j4;
        this.f43395c = bVar;
    }

    @Override // k5.f
    public final f.b b() {
        return this.f43395c;
    }

    @Override // k5.f
    public final String c() {
        return this.f43393a;
    }

    @Override // k5.f
    public final long d() {
        return this.f43394b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        String str = this.f43393a;
        if (str == null) {
            if (fVar.c() != null) {
                return false;
            }
        } else if (!str.equals(fVar.c())) {
            return false;
        }
        if (this.f43394b != fVar.d()) {
            return false;
        }
        f.b bVar = this.f43395c;
        return bVar == null ? fVar.b() == null : bVar.equals(fVar.b());
    }

    public final int hashCode() {
        String str = this.f43393a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j4 = this.f43394b;
        int i = (((iHashCode ^ 1000003) * 1000003) ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003;
        f.b bVar = this.f43395c;
        return (bVar != null ? bVar.hashCode() : 0) ^ i;
    }

    public final String toString() {
        return "TokenResult{token=" + this.f43393a + ", tokenExpirationTimestamp=" + this.f43394b + ", responseCode=" + this.f43395c + "}";
    }
}
