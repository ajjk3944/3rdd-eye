package kotlinx.serialization.internal;

/* loaded from: classes4.dex */
public final class e0 {

    /* renamed from: e, reason: collision with root package name */
    public static final a f22842e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    public static final long[] f22843f = new long[0];

    /* renamed from: a, reason: collision with root package name */
    public final kotlinx.serialization.descriptors.f f22844a;

    /* renamed from: b, reason: collision with root package name */
    public final l9.p f22845b;

    /* renamed from: c, reason: collision with root package name */
    public long f22846c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f22847d;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i iVar) {
            this();
        }

        public a() {
        }
    }

    public e0(kotlinx.serialization.descriptors.f descriptor, l9.p readIfAbsent) {
        kotlin.jvm.internal.p.e(descriptor, "descriptor");
        kotlin.jvm.internal.p.e(readIfAbsent, "readIfAbsent");
        this.f22844a = descriptor;
        this.f22845b = readIfAbsent;
        int iD = descriptor.d();
        if (iD <= 64) {
            this.f22846c = iD != 64 ? (-1) << iD : 0L;
            this.f22847d = f22843f;
        } else {
            this.f22846c = 0L;
            this.f22847d = e(iD);
        }
    }

    public final void a(int i10) {
        if (i10 < 64) {
            this.f22846c |= 1 << i10;
        } else {
            b(i10);
        }
    }

    public final void b(int i10) {
        int i11 = (i10 >>> 6) - 1;
        long[] jArr = this.f22847d;
        jArr[i11] = jArr[i11] | (1 << (i10 & 63));
    }

    public final int c() {
        int length = this.f22847d.length;
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            int i12 = i11 * 64;
            long j10 = this.f22847d[i10];
            while (j10 != -1) {
                int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j10);
                j10 |= 1 << iNumberOfTrailingZeros;
                int i13 = iNumberOfTrailingZeros + i12;
                if (((Boolean) this.f22845b.invoke(this.f22844a, Integer.valueOf(i13))).booleanValue()) {
                    this.f22847d[i10] = j10;
                    return i13;
                }
            }
            this.f22847d[i10] = j10;
            i10 = i11;
        }
        return -1;
    }

    public final int d() {
        int iNumberOfTrailingZeros;
        int iD = this.f22844a.d();
        do {
            long j10 = this.f22846c;
            if (j10 == -1) {
                if (iD > 64) {
                    return c();
                }
                return -1;
            }
            iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j10);
            this.f22846c |= 1 << iNumberOfTrailingZeros;
        } while (!((Boolean) this.f22845b.invoke(this.f22844a, Integer.valueOf(iNumberOfTrailingZeros))).booleanValue());
        return iNumberOfTrailingZeros;
    }

    public final long[] e(int i10) {
        long[] jArr = new long[(i10 - 1) >>> 6];
        if ((i10 & 63) != 0) {
            jArr[z8.o.C(jArr)] = (-1) << i10;
        }
        return jArr;
    }
}
