package N6;

import com.polidea.rxandroidble3.exceptions.BleScanException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class t implements q {

    /* renamed from: d, reason: collision with root package name */
    private static final long f15374d = TimeUnit.SECONDS.toMillis(30);

    /* renamed from: a, reason: collision with root package name */
    private final long[] f15375a = new long[5];

    /* renamed from: b, reason: collision with root package name */
    private final r f15376b;

    /* renamed from: c, reason: collision with root package name */
    private final gg.y f15377c;

    public t(r rVar, gg.y yVar) {
        this.f15376b = rVar;
        this.f15377c = yVar;
    }

    private int b() {
        long j10 = Long.MAX_VALUE;
        int i10 = -1;
        for (int i11 = 0; i11 < 5; i11++) {
            long j11 = this.f15375a[i11];
            if (j11 < j10) {
                i10 = i11;
                j10 = j11;
            }
        }
        return i10;
    }

    @Override // N6.q
    public void a(boolean z10) {
        this.f15376b.a(z10);
        int iB = b();
        long j10 = this.f15375a[iB];
        long jD = this.f15377c.d(TimeUnit.MILLISECONDS);
        long j11 = jD - j10;
        long j12 = f15374d;
        if (j11 < j12) {
            throw new BleScanException(2147483646, new Date(j10 + j12));
        }
        this.f15375a[iB] = jD;
    }
}
