package F3;

/* compiled from: AutoValue_EventStoreConfig.java */
/* loaded from: classes.dex */
public final class a extends e {

    /* renamed from: b, reason: collision with root package name */
    public final long f1598b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1599c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1600d;

    /* renamed from: e, reason: collision with root package name */
    public final long f1601e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1602f;

    public a(int i, int i10, long j4, long j10, int i11) {
        this.f1598b = j4;
        this.f1599c = i;
        this.f1600d = i10;
        this.f1601e = j10;
        this.f1602f = i11;
    }

    @Override // F3.e
    public final int a() {
        return this.f1600d;
    }

    @Override // F3.e
    public final long b() {
        return this.f1601e;
    }

    @Override // F3.e
    public final int c() {
        return this.f1599c;
    }

    @Override // F3.e
    public final int d() {
        return this.f1602f;
    }

    @Override // F3.e
    public final long e() {
        return this.f1598b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f1598b == eVar.e() && this.f1599c == eVar.c() && this.f1600d == eVar.a() && this.f1601e == eVar.b() && this.f1602f == eVar.d();
    }

    public final int hashCode() {
        long j4 = this.f1598b;
        int i = (((((((int) (j4 ^ (j4 >>> 32))) ^ 1000003) * 1000003) ^ this.f1599c) * 1000003) ^ this.f1600d) * 1000003;
        long j10 = this.f1601e;
        return ((i ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f1602f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb.append(this.f1598b);
        sb.append(", loadBatchSize=");
        sb.append(this.f1599c);
        sb.append(", criticalSectionEnterTimeoutMs=");
        sb.append(this.f1600d);
        sb.append(", eventCleanUpAge=");
        sb.append(this.f1601e);
        sb.append(", maxBlobByteSizePerRow=");
        return B4.i.j(sb, this.f1602f, "}");
    }
}
