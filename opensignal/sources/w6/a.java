package w6;

import java.io.EOFException;
import java.io.InterruptedIOException;
import ma.g0;

/* loaded from: classes.dex */
public final class a implements u5.k {

    /* renamed from: a, reason: collision with root package name */
    public final b f24232a = new b(null, 0);

    /* renamed from: b, reason: collision with root package name */
    public final a5.v f24233b = new a5.v(2786);

    /* renamed from: c, reason: collision with root package name */
    public boolean f24234c;

    @Override // u5.k
    public final void c(long j, long j7) {
        this.f24234c = false;
        this.f24232a.a();
    }

    @Override // u5.k
    public final void f(u5.m mVar) {
        this.f24232a.g(mVar, new g0(0, 1, 1, (byte) 0));
        mVar.j();
        mVar.u(new u5.n(-9223372036854775807L));
    }

    @Override // u5.k
    public final int g(u5.l lVar, ca.n nVar) throws EOFException, InterruptedIOException {
        a5.v vVar = this.f24233b;
        int i10 = ((u5.h) lVar).read(vVar.f165a, 0, 2786);
        if (i10 == -1) {
            return -1;
        }
        vVar.E(0);
        vVar.D(i10);
        boolean z10 = this.f24234c;
        b bVar = this.f24232a;
        if (!z10) {
            bVar.e(4, 0L);
            this.f24234c = true;
        }
        bVar.b(vVar);
        return 0;
    }

    @Override // u5.k
    public final boolean h(u5.l lVar) {
        int iH;
        a5.v vVar = new a5.v(10);
        int i10 = 0;
        while (true) {
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
        int i11 = 0;
        int i12 = i10;
        while (true) {
            lVar.p(vVar.f165a, 0, 6);
            vVar.E(0);
            if (vVar.y() != 2935) {
                lVar.l();
                i12++;
                if (i12 - i10 >= 8192) {
                    break;
                }
                lVar.g(i12);
                i11 = 0;
            } else {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                byte[] bArr = vVar.f165a;
                if (bArr.length < 6) {
                    iH = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    iH = ((((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1) * 2;
                } else {
                    byte b2 = bArr[4];
                    iH = u5.b.h((b2 & 192) >> 6, b2 & 63);
                }
                if (iH == -1) {
                    break;
                }
                lVar.g(iH - 6);
            }
        }
        return false;
    }

    @Override // u5.k
    public final void release() {
    }
}
