package u5;

import a5.d0;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class g implements x {

    /* renamed from: a, reason: collision with root package name */
    public final int f23279a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f23280b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f23281c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f23282d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f23283e;

    /* renamed from: f, reason: collision with root package name */
    public final long f23284f;

    public g(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f23280b = iArr;
        this.f23281c = jArr;
        this.f23282d = jArr2;
        this.f23283e = jArr3;
        int length = iArr.length;
        this.f23279a = length;
        if (length > 0) {
            this.f23284f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f23284f = 0L;
        }
    }

    @Override // u5.x
    public final boolean b() {
        return true;
    }

    @Override // u5.x
    public final w d(long j) {
        long[] jArr = this.f23283e;
        int iE = d0.e(jArr, j, true);
        long j7 = jArr[iE];
        long[] jArr2 = this.f23281c;
        y yVar = new y(j7, jArr2[iE]);
        if (j7 >= j || iE == this.f23279a - 1) {
            return new w(yVar, yVar);
        }
        int i10 = iE + 1;
        return new w(yVar, new y(jArr[i10], jArr2[i10]));
    }

    @Override // u5.x
    public final long e() {
        return this.f23284f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f23279a + ", sizes=" + Arrays.toString(this.f23280b) + ", offsets=" + Arrays.toString(this.f23281c) + ", timeUs=" + Arrays.toString(this.f23283e) + ", durationsUs=" + Arrays.toString(this.f23282d) + ")";
    }
}
