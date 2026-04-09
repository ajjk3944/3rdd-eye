package w6;

import java.io.EOFException;
import java.io.InterruptedIOException;
import ma.g0;

/* loaded from: classes.dex */
public final class c implements u5.k {

    /* renamed from: a, reason: collision with root package name */
    public final b f24246a = new b(null, 1);

    /* renamed from: b, reason: collision with root package name */
    public final a5.v f24247b = new a5.v(16384);

    /* renamed from: c, reason: collision with root package name */
    public boolean f24248c;

    @Override // u5.k
    public final void c(long j, long j7) {
        this.f24248c = false;
        this.f24246a.a();
    }

    @Override // u5.k
    public final void f(u5.m mVar) {
        this.f24246a.g(mVar, new g0(0, 1, 1, (byte) 0));
        mVar.j();
        mVar.u(new u5.n(-9223372036854775807L));
    }

    @Override // u5.k
    public final int g(u5.l lVar, ca.n nVar) throws EOFException, InterruptedIOException {
        a5.v vVar = this.f24247b;
        int i10 = ((u5.h) lVar).read(vVar.f165a, 0, 16384);
        if (i10 == -1) {
            return -1;
        }
        vVar.E(0);
        vVar.D(i10);
        boolean z10 = this.f24248c;
        b bVar = this.f24246a;
        if (!z10) {
            bVar.e(4, 0L);
            this.f24248c = true;
        }
        bVar.b(vVar);
        return 0;
    }

    @Override // u5.k
    public final boolean h(u5.l lVar) {
        int i10;
        a5.v vVar = new a5.v(10);
        int i11 = 0;
        while (true) {
            lVar.p(vVar.f165a, 0, 10);
            vVar.E(0);
            if (vVar.v() != 4801587) {
                break;
            }
            vVar.F(3);
            int iS = vVar.s();
            i11 += iS + 10;
            lVar.g(iS);
        }
        lVar.l();
        lVar.g(i11);
        int i12 = 0;
        int i13 = i11;
        while (true) {
            int i14 = 7;
            lVar.p(vVar.f165a, 0, 7);
            vVar.E(0);
            int iY = vVar.y();
            if (iY == 44096 || iY == 44097) {
                i12++;
                if (i12 >= 4) {
                    return true;
                }
                byte[] bArr = vVar.f165a;
                if (bArr.length < 7) {
                    i10 = -1;
                } else {
                    int i15 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    if (i15 == 65535) {
                        i15 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
                    } else {
                        i14 = 4;
                    }
                    if (iY == 44097) {
                        i14 += 2;
                    }
                    i10 = i15 + i14;
                }
                if (i10 == -1) {
                    break;
                }
                lVar.g(i10 - 7);
            } else {
                lVar.l();
                i13++;
                if (i13 - i11 >= 8192) {
                    break;
                }
                lVar.g(i13);
                i12 = 0;
            }
        }
        return false;
    }

    @Override // u5.k
    public final void release() {
    }
}
