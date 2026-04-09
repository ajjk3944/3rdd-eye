package w6;

import java.io.EOFException;
import java.io.InterruptedIOException;
import ma.g0;

/* loaded from: classes.dex */
public final class d implements u5.k {

    /* renamed from: c, reason: collision with root package name */
    public final a5.v f24251c;

    /* renamed from: d, reason: collision with root package name */
    public final a5.u f24252d;

    /* renamed from: e, reason: collision with root package name */
    public u5.m f24253e;

    /* renamed from: f, reason: collision with root package name */
    public long f24254f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f24256h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f24257i;

    /* renamed from: a, reason: collision with root package name */
    public final e f24249a = new e(true, null);

    /* renamed from: b, reason: collision with root package name */
    public final a5.v f24250b = new a5.v(2048);

    /* renamed from: g, reason: collision with root package name */
    public long f24255g = -1;

    public d(int i10) {
        a5.v vVar = new a5.v(10);
        this.f24251c = vVar;
        byte[] bArr = vVar.f165a;
        this.f24252d = new a5.u(bArr, bArr.length, 0, (byte) 0);
    }

    @Override // u5.k
    public final void c(long j, long j7) {
        this.f24256h = false;
        this.f24249a.a();
        this.f24254f = j7;
    }

    @Override // u5.k
    public final void f(u5.m mVar) {
        this.f24253e = mVar;
        this.f24249a.g(mVar, new g0(0, 1, 1, (byte) 0));
        mVar.j();
    }

    @Override // u5.k
    public final int g(u5.l lVar, ca.n nVar) throws EOFException, InterruptedIOException {
        a5.a.j(this.f24253e);
        long j = ((u5.h) lVar).f23287g;
        a5.v vVar = this.f24250b;
        int i10 = ((u5.h) lVar).read(vVar.f165a, 0, 2048);
        boolean z10 = i10 == -1;
        if (!this.f24257i) {
            this.f24253e.u(new u5.n(-9223372036854775807L));
            this.f24257i = true;
        }
        if (z10) {
            return -1;
        }
        vVar.E(0);
        vVar.D(i10);
        boolean z11 = this.f24256h;
        e eVar = this.f24249a;
        if (!z11) {
            eVar.e(4, this.f24254f);
            this.f24256h = true;
        }
        eVar.b(vVar);
        return 0;
    }

    @Override // u5.k
    public final boolean h(u5.l lVar) {
        int i10 = 0;
        while (true) {
            a5.v vVar = this.f24251c;
            lVar.p(vVar.f165a, 0, 10);
            vVar.E(0);
            if (vVar.v() != 4801587) {
                break;
            }
            vVar.F(3);
            int iS = vVar.s();
            i10 += iS + 10;
            lVar.g(iS);
        }
        lVar.l();
        lVar.g(i10);
        if (this.f24255g == -1) {
            this.f24255g = i10;
        }
        int i11 = i10;
        int i12 = 0;
        int i13 = 0;
        do {
            a5.v vVar2 = this.f24251c;
            lVar.p(vVar2.f165a, 0, 2);
            vVar2.E(0);
            if ((vVar2.y() & 65526) == 65520) {
                i12++;
                if (i12 >= 4 && i13 > 188) {
                    return true;
                }
                lVar.p(vVar2.f165a, 0, 4);
                a5.u uVar = this.f24252d;
                uVar.p(14);
                int i14 = uVar.i(13);
                if (i14 <= 6) {
                    i11++;
                    lVar.l();
                    lVar.g(i11);
                } else {
                    lVar.g(i14 - 6);
                    i13 += i14;
                }
            } else {
                i11++;
                lVar.l();
                lVar.g(i11);
            }
            i12 = 0;
            i13 = 0;
        } while (i11 - i10 < 8192);
        return false;
    }

    @Override // u5.k
    public final void release() {
    }
}
