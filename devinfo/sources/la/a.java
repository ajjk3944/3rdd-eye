package la;

import com.bytedance.sdk.openadsdk.TTAdConstant;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final a f28627f = new a(TTAdConstant.MATE_VALID, 10000, 10485760, 604800000, 81920);

    /* renamed from: a, reason: collision with root package name */
    public final long f28628a;

    /* renamed from: b, reason: collision with root package name */
    public final int f28629b;

    /* renamed from: c, reason: collision with root package name */
    public final int f28630c;

    /* renamed from: d, reason: collision with root package name */
    public final long f28631d;

    /* renamed from: e, reason: collision with root package name */
    public final int f28632e;

    public a(int i4, int i10, long j, long j8, int i11) {
        this.f28628a = j;
        this.f28629b = i4;
        this.f28630c = i10;
        this.f28631d = j8;
        this.f28632e = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f28628a == aVar.f28628a && this.f28629b == aVar.f28629b && this.f28630c == aVar.f28630c && this.f28631d == aVar.f28631d && this.f28632e == aVar.f28632e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f28628a;
        int i4 = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f28629b) * 1000003) ^ this.f28630c) * 1000003;
        long j8 = this.f28631d;
        return ((i4 ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003) ^ this.f28632e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb2.append(this.f28628a);
        sb2.append(", loadBatchSize=");
        sb2.append(this.f28629b);
        sb2.append(", criticalSectionEnterTimeoutMs=");
        sb2.append(this.f28630c);
        sb2.append(", eventCleanUpAge=");
        sb2.append(this.f28631d);
        sb2.append(", maxBlobByteSizePerRow=");
        return r5.c.j(this.f28632e, "}", sb2);
    }
}
