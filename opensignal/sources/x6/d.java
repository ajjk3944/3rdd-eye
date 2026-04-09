package x6;

import a5.d0;
import com.google.android.material.datepicker.n;
import u5.w;
import u5.x;
import u5.y;

/* loaded from: classes.dex */
public final class d implements x {

    /* renamed from: a, reason: collision with root package name */
    public final n f25053a;

    /* renamed from: b, reason: collision with root package name */
    public final int f25054b;

    /* renamed from: c, reason: collision with root package name */
    public final long f25055c;

    /* renamed from: d, reason: collision with root package name */
    public final long f25056d;

    /* renamed from: e, reason: collision with root package name */
    public final long f25057e;

    public d(n nVar, int i10, long j, long j7) {
        this.f25053a = nVar;
        this.f25054b = i10;
        this.f25055c = j;
        long j10 = (j7 - j) / nVar.f5610r;
        this.f25056d = j10;
        this.f25057e = d0.M(j10 * i10, 1000000L, nVar.f5609g);
    }

    @Override // u5.x
    public final boolean b() {
        return true;
    }

    @Override // u5.x
    public final w d(long j) {
        n nVar = this.f25053a;
        int i10 = this.f25054b;
        long j7 = this.f25056d - 1;
        long jI = d0.i((nVar.f5609g * j) / (i10 * 1000000), 0L, j7);
        int i11 = nVar.f5610r;
        long j10 = this.f25055c;
        long jM = d0.M(jI * i10, 1000000L, nVar.f5609g);
        y yVar = new y(jM, (i11 * jI) + j10);
        if (jM >= j || jI == j7) {
            return new w(yVar, yVar);
        }
        long j11 = jI + 1;
        return new w(yVar, new y(d0.M(j11 * i10, 1000000L, nVar.f5609g), (i11 * j11) + j10));
    }

    @Override // u5.x
    public final long e() {
        return this.f25057e;
    }
}
