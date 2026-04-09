package ia;

import ca.t;
import qb.v;

/* loaded from: classes.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f11306a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f11307b;

    /* renamed from: c, reason: collision with root package name */
    public final long f11308c;

    /* renamed from: d, reason: collision with root package name */
    public final long f11309d;

    public f(long[] jArr, long[] jArr2, long j, long j7) {
        this.f11306a = jArr;
        this.f11307b = jArr2;
        this.f11308c = j;
        this.f11309d = j7;
    }

    @Override // ia.e
    public final long a() {
        return this.f11309d;
    }

    @Override // ca.u
    public final boolean b() {
        return true;
    }

    @Override // ca.u
    public final t d(long j) {
        long[] jArr = this.f11306a;
        int iE = v.e(jArr, j, true);
        long j7 = jArr[iE];
        long[] jArr2 = this.f11307b;
        ca.v vVar = new ca.v(j7, jArr2[iE]);
        if (j7 >= j || iE == jArr.length - 1) {
            return new t(vVar, vVar);
        }
        int i10 = iE + 1;
        return new t(vVar, new ca.v(jArr[i10], jArr2[i10]));
    }

    @Override // ca.u
    public final long e() {
        return this.f11308c;
    }

    @Override // ia.e
    public final long getTimeUs(long j) {
        return this.f11306a[v.e(this.f11307b, j, true)];
    }
}
