package M4;

/* loaded from: classes3.dex */
final class b extends j {

    /* renamed from: b, reason: collision with root package name */
    private final String f12494b;

    /* renamed from: c, reason: collision with root package name */
    private final String f12495c;

    /* renamed from: d, reason: collision with root package name */
    private final String f12496d;

    /* renamed from: e, reason: collision with root package name */
    private final String f12497e;

    /* renamed from: f, reason: collision with root package name */
    private final long f12498f;

    b(String str, String str2, String str3, String str4, long j10) {
        if (str == null) {
            throw new NullPointerException("Null rolloutId");
        }
        this.f12494b = str;
        if (str2 == null) {
            throw new NullPointerException("Null parameterKey");
        }
        this.f12495c = str2;
        if (str3 == null) {
            throw new NullPointerException("Null parameterValue");
        }
        this.f12496d = str3;
        if (str4 == null) {
            throw new NullPointerException("Null variantId");
        }
        this.f12497e = str4;
        this.f12498f = j10;
    }

    @Override // M4.j
    public String c() {
        return this.f12495c;
    }

    @Override // M4.j
    public String d() {
        return this.f12496d;
    }

    @Override // M4.j
    public String e() {
        return this.f12494b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f12494b.equals(jVar.e()) && this.f12495c.equals(jVar.c()) && this.f12496d.equals(jVar.d()) && this.f12497e.equals(jVar.g()) && this.f12498f == jVar.f();
    }

    @Override // M4.j
    public long f() {
        return this.f12498f;
    }

    @Override // M4.j
    public String g() {
        return this.f12497e;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f12494b.hashCode() ^ 1000003) * 1000003) ^ this.f12495c.hashCode()) * 1000003) ^ this.f12496d.hashCode()) * 1000003) ^ this.f12497e.hashCode()) * 1000003;
        long j10 = this.f12498f;
        return iHashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "RolloutAssignment{rolloutId=" + this.f12494b + ", parameterKey=" + this.f12495c + ", parameterValue=" + this.f12496d + ", variantId=" + this.f12497e + ", templateVersion=" + this.f12498f + "}";
    }
}
