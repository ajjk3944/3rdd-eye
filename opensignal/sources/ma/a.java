package ma;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* loaded from: classes.dex */
public final class a implements ca.k {

    /* renamed from: a, reason: collision with root package name */
    public final b f16375a = new b(null, 0);

    /* renamed from: b, reason: collision with root package name */
    public final fb.f f16376b = new fb.f(2786);

    /* renamed from: c, reason: collision with root package name */
    public boolean f16377c;

    @Override // ca.k
    public final void c(long j, long j7) {
        this.f16377c = false;
        this.f16375a.a();
    }

    @Override // ca.k
    public final int f(ca.l lVar, ca.n nVar) throws EOFException, InterruptedIOException {
        fb.f fVar = this.f16376b;
        int i10 = ((ca.h) lVar).read(fVar.f8800a, 0, 2786);
        if (i10 == -1) {
            return -1;
        }
        fVar.y(0);
        fVar.x(i10);
        boolean z10 = this.f16377c;
        b bVar = this.f16375a;
        if (!z10) {
            bVar.e(4, 0L);
            this.f16377c = true;
        }
        bVar.c(fVar);
        return 0;
    }

    @Override // ca.k
    public final boolean g(ca.l lVar) {
        int iB;
        fb.f fVar = new fb.f(10);
        int i10 = 0;
        while (true) {
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
        int i11 = 0;
        int i12 = i10;
        while (true) {
            lVar.p(fVar.f8800a, 0, 6);
            fVar.y(0);
            if (fVar.t() != 2935) {
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
                byte[] bArr = fVar.f8800a;
                if (bArr.length < 6) {
                    iB = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    iB = ((((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1) * 2;
                } else {
                    byte b2 = bArr[4];
                    iB = y9.a.b((b2 & 192) >> 6, b2 & 63);
                }
                if (iB == -1) {
                    break;
                }
                lVar.g(iB - 6);
            }
        }
        return false;
    }

    @Override // ca.k
    public final void h(ca.m mVar) {
        this.f16375a.f(mVar, new g0(0, 1, 0, (byte) 0));
        mVar.j();
        mVar.r(new ca.o(-9223372036854775807L));
    }

    @Override // ca.k
    public final void release() {
    }
}
