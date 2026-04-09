package ma;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* loaded from: classes.dex */
public final class d implements ca.k {

    /* renamed from: c, reason: collision with root package name */
    public final fb.f f16403c;

    /* renamed from: d, reason: collision with root package name */
    public final a5.u f16404d;

    /* renamed from: e, reason: collision with root package name */
    public ca.m f16405e;

    /* renamed from: f, reason: collision with root package name */
    public long f16406f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f16408h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f16409i;

    /* renamed from: a, reason: collision with root package name */
    public final e f16401a = new e(true, null);

    /* renamed from: b, reason: collision with root package name */
    public final fb.f f16402b = new fb.f(2048);

    /* renamed from: g, reason: collision with root package name */
    public long f16407g = -1;

    public d(int i10) {
        fb.f fVar = new fb.f(10);
        this.f16403c = fVar;
        byte[] bArr = fVar.f8800a;
        this.f16404d = new a5.u(bArr, bArr.length, 3, (byte) 0);
    }

    @Override // ca.k
    public final void c(long j, long j7) {
        this.f16408h = false;
        this.f16401a.a();
        this.f16406f = j7;
    }

    @Override // ca.k
    public final int f(ca.l lVar, ca.n nVar) throws EOFException, InterruptedIOException {
        qb.b.k(this.f16405e);
        lVar.getClass();
        fb.f fVar = this.f16402b;
        int i10 = ((ca.h) lVar).read(fVar.f8800a, 0, 2048);
        boolean z10 = i10 == -1;
        if (!this.f16409i) {
            this.f16405e.r(new ca.o(-9223372036854775807L));
            this.f16409i = true;
        }
        if (z10) {
            return -1;
        }
        fVar.y(0);
        fVar.x(i10);
        boolean z11 = this.f16408h;
        e eVar = this.f16401a;
        if (!z11) {
            eVar.e(4, this.f16406f);
            this.f16408h = true;
        }
        eVar.c(fVar);
        return 0;
    }

    @Override // ca.k
    public final boolean g(ca.l lVar) {
        fb.f fVar;
        int i10 = 0;
        while (true) {
            fVar = this.f16403c;
            lVar.p(fVar.f8800a, 0, 10);
            fVar.y(0);
            if (fVar.q() != 4801587) {
                break;
            }
            fVar.z(3);
            int iN = fVar.n();
            i10 += iN + 10;
            lVar.g(iN);
        }
        lVar.l();
        lVar.g(i10);
        if (this.f16407g == -1) {
            this.f16407g = i10;
        }
        int i11 = 0;
        int i12 = 0;
        int i13 = i10;
        do {
            lVar.p(fVar.f8800a, 0, 2);
            fVar.y(0);
            if ((fVar.t() & 65526) == 65520) {
                i11++;
                if (i11 >= 4 && i12 > 188) {
                    return true;
                }
                lVar.p(fVar.f8800a, 0, 4);
                a5.u uVar = this.f16404d;
                uVar.p(14);
                int i14 = uVar.i(13);
                if (i14 <= 6) {
                    i13++;
                    lVar.l();
                    lVar.g(i13);
                } else {
                    lVar.g(i14 - 6);
                    i12 += i14;
                }
            } else {
                i13++;
                lVar.l();
                lVar.g(i13);
            }
            i11 = 0;
            i12 = 0;
        } while (i13 - i10 < 8192);
        return false;
    }

    @Override // ca.k
    public final void h(ca.m mVar) {
        this.f16405e = mVar;
        this.f16401a.f(mVar, new g0(0, 1, 0, (byte) 0));
        mVar.j();
    }

    @Override // ca.k
    public final void release() {
    }
}
