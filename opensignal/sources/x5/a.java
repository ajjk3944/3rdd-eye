package x5;

import a5.v;
import ca.n;
import u5.e;
import u5.f;
import u5.l;
import u5.o;

/* loaded from: classes.dex */
public final class a implements f {

    /* renamed from: a, reason: collision with root package name */
    public final o f25019a;

    /* renamed from: b, reason: collision with root package name */
    public final int f25020b;

    /* renamed from: c, reason: collision with root package name */
    public final n f25021c = new n();

    public a(o oVar, int i10) {
        this.f25019a = oVar;
        this.f25020b = i10;
    }

    @Override // u5.f
    public final e a(l lVar, long j) {
        long position = lVar.getPosition();
        long jC = c(lVar);
        long jD = lVar.d();
        lVar.g(Math.max(6, this.f25019a.f23301c));
        long jC2 = c(lVar);
        return (jC > j || jC2 <= j) ? jC2 <= j ? new e(-2, jC2, lVar.d()) : new e(-1, jC, position) : new e(0, -9223372036854775807L, jD);
    }

    public final long c(l lVar) {
        n nVar;
        o oVar;
        int i10;
        while (true) {
            long jD = lVar.d();
            long length = lVar.getLength() - 6;
            nVar = this.f25021c;
            oVar = this.f25019a;
            if (jD >= length) {
                break;
            }
            long jD2 = lVar.d();
            byte[] bArr = new byte[2];
            int i11 = 0;
            boolean zB = false;
            lVar.p(bArr, 0, 2);
            int i12 = ((bArr[0] & 255) << 8) | (bArr[1] & 255);
            int i13 = this.f25020b;
            if (i12 != i13) {
                lVar.l();
                lVar.g((int) (jD2 - lVar.getPosition()));
            } else {
                v vVar = new v(16);
                System.arraycopy(bArr, 0, vVar.f165a, 0, 2);
                byte[] bArr2 = vVar.f165a;
                while (i11 < 14 && (i10 = lVar.i(bArr2, 2 + i11, 14 - i11)) != -1) {
                    i11 += i10;
                }
                vVar.D(i11);
                lVar.l();
                lVar.g((int) (jD2 - lVar.getPosition()));
                zB = u5.b.b(vVar, oVar, i13, nVar);
            }
            if (zB) {
                break;
            }
            lVar.g(1);
        }
        if (lVar.d() < lVar.getLength() - 6) {
            return nVar.f3485a;
        }
        lVar.g((int) (lVar.getLength() - lVar.d()));
        return oVar.j;
    }
}
