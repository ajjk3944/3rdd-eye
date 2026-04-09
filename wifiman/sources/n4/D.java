package N4;

import N4.G;

/* loaded from: classes3.dex */
final class D extends G.b {

    /* renamed from: a, reason: collision with root package name */
    private final int f14908a;

    /* renamed from: b, reason: collision with root package name */
    private final String f14909b;

    /* renamed from: c, reason: collision with root package name */
    private final int f14910c;

    /* renamed from: d, reason: collision with root package name */
    private final long f14911d;

    /* renamed from: e, reason: collision with root package name */
    private final long f14912e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f14913f;

    /* renamed from: g, reason: collision with root package name */
    private final int f14914g;

    /* renamed from: h, reason: collision with root package name */
    private final String f14915h;

    /* renamed from: i, reason: collision with root package name */
    private final String f14916i;

    D(int i10, String str, int i11, long j10, long j11, boolean z10, int i12, String str2, String str3) {
        this.f14908a = i10;
        if (str == null) {
            throw new NullPointerException("Null model");
        }
        this.f14909b = str;
        this.f14910c = i11;
        this.f14911d = j10;
        this.f14912e = j11;
        this.f14913f = z10;
        this.f14914g = i12;
        if (str2 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        this.f14915h = str2;
        if (str3 == null) {
            throw new NullPointerException("Null modelClass");
        }
        this.f14916i = str3;
    }

    @Override // N4.G.b
    public int a() {
        return this.f14908a;
    }

    @Override // N4.G.b
    public int b() {
        return this.f14910c;
    }

    @Override // N4.G.b
    public long d() {
        return this.f14912e;
    }

    @Override // N4.G.b
    public boolean e() {
        return this.f14913f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof G.b)) {
            return false;
        }
        G.b bVar = (G.b) obj;
        return this.f14908a == bVar.a() && this.f14909b.equals(bVar.g()) && this.f14910c == bVar.b() && this.f14911d == bVar.j() && this.f14912e == bVar.d() && this.f14913f == bVar.e() && this.f14914g == bVar.i() && this.f14915h.equals(bVar.f()) && this.f14916i.equals(bVar.h());
    }

    @Override // N4.G.b
    public String f() {
        return this.f14915h;
    }

    @Override // N4.G.b
    public String g() {
        return this.f14909b;
    }

    @Override // N4.G.b
    public String h() {
        return this.f14916i;
    }

    public int hashCode() {
        int iHashCode = (((((this.f14908a ^ 1000003) * 1000003) ^ this.f14909b.hashCode()) * 1000003) ^ this.f14910c) * 1000003;
        long j10 = this.f14911d;
        int i10 = (iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f14912e;
        return ((((((((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ (this.f14913f ? 1231 : 1237)) * 1000003) ^ this.f14914g) * 1000003) ^ this.f14915h.hashCode()) * 1000003) ^ this.f14916i.hashCode();
    }

    @Override // N4.G.b
    public int i() {
        return this.f14914g;
    }

    @Override // N4.G.b
    public long j() {
        return this.f14911d;
    }

    public String toString() {
        return "DeviceData{arch=" + this.f14908a + ", model=" + this.f14909b + ", availableProcessors=" + this.f14910c + ", totalRam=" + this.f14911d + ", diskSpace=" + this.f14912e + ", isEmulator=" + this.f14913f + ", state=" + this.f14914g + ", manufacturer=" + this.f14915h + ", modelClass=" + this.f14916i + "}";
    }
}
