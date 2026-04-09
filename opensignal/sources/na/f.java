package na;

import ca.t;
import ca.u;
import qb.v;

/* loaded from: classes.dex */
public final class f implements u {

    /* renamed from: a, reason: collision with root package name */
    public final e f17437a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17438b;

    /* renamed from: c, reason: collision with root package name */
    public final long f17439c;

    /* renamed from: d, reason: collision with root package name */
    public final long f17440d;

    /* renamed from: e, reason: collision with root package name */
    public final long f17441e;

    public f(e eVar, int i10, long j, long j7) {
        this.f17437a = eVar;
        this.f17438b = i10;
        this.f17439c = j;
        long j10 = (j7 - j) / eVar.f17434d;
        this.f17440d = j10;
        this.f17441e = v.H(j10 * i10, 1000000L, eVar.f17433c);
    }

    @Override // ca.u
    public final boolean b() {
        return true;
    }

    @Override // ca.u
    public final t d(long j) {
        e eVar = this.f17437a;
        int i10 = this.f17438b;
        long j7 = this.f17440d - 1;
        long j10 = v.j((eVar.f17433c * j) / (i10 * 1000000), 0L, j7);
        int i11 = eVar.f17434d;
        long j11 = this.f17439c;
        long jH = v.H(j10 * i10, 1000000L, eVar.f17433c);
        ca.v vVar = new ca.v(jH, (i11 * j10) + j11);
        if (jH >= j || j10 == j7) {
            return new t(vVar, vVar);
        }
        long j12 = j10 + 1;
        return new t(vVar, new ca.v(v.H(j12 * i10, 1000000L, eVar.f17433c), (i11 * j12) + j11));
    }

    @Override // ca.u
    public final long e() {
        return this.f17441e;
    }
}
