package ca;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class g implements u {

    /* renamed from: a, reason: collision with root package name */
    public final int f3469a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f3470b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f3471c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f3472d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f3473e;

    /* renamed from: f, reason: collision with root package name */
    public final long f3474f;

    public g(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f3470b = iArr;
        this.f3471c = jArr;
        this.f3472d = jArr2;
        this.f3473e = jArr3;
        int length = iArr.length;
        this.f3469a = length;
        if (length > 0) {
            this.f3474f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f3474f = 0L;
        }
    }

    @Override // ca.u
    public final boolean b() {
        return true;
    }

    @Override // ca.u
    public final t d(long j) {
        long[] jArr = this.f3473e;
        int iE = qb.v.e(jArr, j, true);
        long j7 = jArr[iE];
        long[] jArr2 = this.f3471c;
        v vVar = new v(j7, jArr2[iE]);
        if (j7 >= j || iE == this.f3469a - 1) {
            return new t(vVar, vVar);
        }
        int i10 = iE + 1;
        return new t(vVar, new v(jArr[i10], jArr2[i10]));
    }

    @Override // ca.u
    public final long e() {
        return this.f3474f;
    }

    public final String toString() {
        String string = Arrays.toString(this.f3470b);
        String string2 = Arrays.toString(this.f3471c);
        String string3 = Arrays.toString(this.f3473e);
        String string4 = Arrays.toString(this.f3472d);
        StringBuilder sb2 = new StringBuilder(c7.a.d(c7.a.d(c7.a.d(c7.a.d(71, string), string2), string3), string4));
        sb2.append("ChunkIndex(length=");
        sb2.append(this.f3469a);
        sb2.append(", sizes=");
        sb2.append(string);
        w.g.q(sb2, ", offsets=", string2, ", timeUs=", string3);
        return h0.b.s(sb2, ", durationsUs=", string4, ")");
    }
}
