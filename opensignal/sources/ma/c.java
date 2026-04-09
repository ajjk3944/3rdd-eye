package ma;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* loaded from: classes.dex */
public final class c implements ca.k {

    /* renamed from: a, reason: collision with root package name */
    public final b f16395a = new b(null, 1);

    /* renamed from: b, reason: collision with root package name */
    public final fb.f f16396b = new fb.f(16384);

    /* renamed from: c, reason: collision with root package name */
    public boolean f16397c;

    @Override // ca.k
    public final void c(long j, long j7) {
        this.f16397c = false;
        this.f16395a.a();
    }

    @Override // ca.k
    public final int f(ca.l lVar, ca.n nVar) throws EOFException, InterruptedIOException {
        fb.f fVar = this.f16396b;
        int i10 = ((ca.h) lVar).read(fVar.f8800a, 0, 16384);
        if (i10 == -1) {
            return -1;
        }
        fVar.y(0);
        fVar.x(i10);
        boolean z10 = this.f16397c;
        b bVar = this.f16395a;
        if (!z10) {
            bVar.e(4, 0L);
            this.f16397c = true;
        }
        bVar.c(fVar);
        return 0;
    }

    @Override // ca.k
    public final boolean g(ca.l lVar) {
        int i10;
        fb.f fVar = new fb.f(10);
        int i11 = 0;
        while (true) {
            lVar.p(fVar.f8800a, 0, 10);
            fVar.y(0);
            if (fVar.q() != 4801587) {
                break;
            }
            fVar.z(3);
            int iN = fVar.n();
            i11 += iN + 10;
            lVar.g(iN);
        }
        lVar.l();
        lVar.g(i11);
        int i12 = 0;
        int i13 = i11;
        while (true) {
            int i14 = 7;
            lVar.p(fVar.f8800a, 0, 7);
            fVar.y(0);
            int iT = fVar.t();
            if (iT == 44096 || iT == 44097) {
                i12++;
                if (i12 >= 4) {
                    return true;
                }
                byte[] bArr = fVar.f8800a;
                if (bArr.length < 7) {
                    i10 = -1;
                } else {
                    int i15 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    if (i15 == 65535) {
                        i15 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
                    } else {
                        i14 = 4;
                    }
                    if (iT == 44097) {
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

    @Override // ca.k
    public final void h(ca.m mVar) {
        this.f16395a.f(mVar, new g0(0, 1, 0, (byte) 0));
        mVar.j();
        mVar.r(new ca.o(-9223372036854775807L));
    }

    @Override // ca.k
    public final void release() {
    }
}
