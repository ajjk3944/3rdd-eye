package t9;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final a f22665f = new a(10485760, 200, 10000, 604800000, 81920);

    /* renamed from: a, reason: collision with root package name */
    public final long f22666a;

    /* renamed from: b, reason: collision with root package name */
    public final int f22667b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22668c;

    /* renamed from: d, reason: collision with root package name */
    public final long f22669d;

    /* renamed from: e, reason: collision with root package name */
    public final int f22670e;

    public a(long j, int i10, int i11, long j7, int i12) {
        this.f22666a = j;
        this.f22667b = i10;
        this.f22668c = i11;
        this.f22669d = j7;
        this.f22670e = i12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f22666a == aVar.f22666a && this.f22667b == aVar.f22667b && this.f22668c == aVar.f22668c && this.f22669d == aVar.f22669d && this.f22670e == aVar.f22670e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f22666a;
        int i10 = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f22667b) * 1000003) ^ this.f22668c) * 1000003;
        long j7 = this.f22669d;
        return ((i10 ^ ((int) ((j7 >>> 32) ^ j7))) * 1000003) ^ this.f22670e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb2.append(this.f22666a);
        sb2.append(", loadBatchSize=");
        sb2.append(this.f22667b);
        sb2.append(", criticalSectionEnterTimeoutMs=");
        sb2.append(this.f22668c);
        sb2.append(", eventCleanUpAge=");
        sb2.append(this.f22669d);
        sb2.append(", maxBlobByteSizePerRow=");
        return h0.b.i(this.f22670e, "}", sb2);
    }
}
