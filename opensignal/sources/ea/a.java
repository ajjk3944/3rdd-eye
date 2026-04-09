package ea;

import ca.d;
import ca.e;
import ca.l;
import ca.n;
import ca.q;
import fb.f;
import i3.g;

/* loaded from: classes.dex */
public final class a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final q f8025a;

    /* renamed from: d, reason: collision with root package name */
    public final int f8026d;

    /* renamed from: g, reason: collision with root package name */
    public final n f8027g = new n();

    public a(q qVar, int i10) {
        this.f8025a = qVar;
        this.f8026d = i10;
    }

    public final long a(l lVar) {
        n nVar;
        q qVar;
        int i10;
        while (true) {
            long jD = lVar.d();
            long length = lVar.getLength() - 6;
            nVar = this.f8027g;
            qVar = this.f8025a;
            if (jD >= length) {
                break;
            }
            long jD2 = lVar.d();
            byte[] bArr = new byte[2];
            int i11 = 0;
            boolean zC = false;
            lVar.p(bArr, 0, 2);
            int i12 = ((bArr[0] & 255) << 8) | (bArr[1] & 255);
            int i13 = this.f8026d;
            if (i12 != i13) {
                lVar.l();
                lVar.g((int) (jD2 - lVar.getPosition()));
            } else {
                f fVar = new f(16);
                System.arraycopy(bArr, 0, fVar.f8800a, 0, 2);
                byte[] bArr2 = fVar.f8800a;
                while (i11 < 14 && (i10 = lVar.i(bArr2, 2 + i11, 14 - i11)) != -1) {
                    i11 += i10;
                }
                fVar.x(i11);
                lVar.l();
                lVar.g((int) (jD2 - lVar.getPosition()));
                zC = g.c(fVar, qVar, i13, nVar);
            }
            if (zC) {
                break;
            }
            lVar.g(1);
        }
        if (lVar.d() < lVar.getLength() - 6) {
            return nVar.f3485a;
        }
        lVar.g((int) (lVar.getLength() - lVar.d()));
        return qVar.j;
    }

    @Override // ca.e
    public final d k(l lVar, long j) {
        long position = lVar.getPosition();
        long jA = a(lVar);
        long jD = lVar.d();
        lVar.g(Math.max(6, this.f8025a.f3493c));
        long jA2 = a(lVar);
        return (jA > j || jA2 <= j) ? jA2 <= j ? new d(-2, jA2, lVar.d()) : new d(-1, jA, position) : new d(0, -9223372036854775807L, jD);
    }
}
