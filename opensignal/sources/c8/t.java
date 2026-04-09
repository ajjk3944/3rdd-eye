package c8;

import java.io.EOFException;

/* loaded from: classes.dex */
public final class t extends cv.n {

    /* renamed from: g, reason: collision with root package name */
    public static final cv.j f3364g;

    /* renamed from: d, reason: collision with root package name */
    public final cv.g f3365d;

    static {
        cv.j jVar = cv.j.f6715r;
        f3364g = sm.m.l("0021F904");
    }

    public t(cv.i iVar) {
        super(iVar);
        this.f3365d = new cv.g();
    }

    public final boolean b(long j) {
        cv.g gVar = this.f3365d;
        long j7 = gVar.f6706d;
        if (j7 >= j) {
            return true;
        }
        long j10 = j - j7;
        return super.u(gVar, j10) == j10;
    }

    @Override // cv.n, cv.f0
    public final long u(cv.g gVar, long j) throws EOFException {
        long j7;
        long j10;
        b(j);
        cv.g gVar2 = this.f3365d;
        long j11 = 0;
        if (gVar2.f6706d == 0) {
            return j == 0 ? 0L : -1L;
        }
        long j12 = 0;
        while (true) {
            long jX = -1;
            while (true) {
                cv.j jVar = f3364g;
                jX = this.f3365d.x(jVar.f6716a[0], jX + 1, Long.MAX_VALUE);
                if (jX == -1) {
                    j7 = j11;
                    break;
                }
                j7 = j11;
                if (b(jVar.f6716a.length) && gVar2.m0(jX, jVar)) {
                    break;
                }
                j11 = j7;
            }
            if (jX == -1) {
                break;
            }
            long jU = gVar2.u(gVar, jX + 4);
            if (jU < j7) {
                jU = j7;
            }
            j12 += jU;
            if (b(5L) && gVar2.q(4L) == 0 && (((gVar2.q(2L) & 255) << 8) | (gVar2.q(1L) & 255)) < 2) {
                gVar.p0(gVar2.q(j7));
                gVar.p0(10);
                gVar.p0(0);
                gVar2.skip(3L);
            }
            j11 = 0;
        }
        if (j12 < j) {
            long jU2 = gVar2.u(gVar, j - j12);
            j10 = 0;
            if (jU2 < 0) {
                jU2 = 0;
            }
            j12 += jU2;
        } else {
            j10 = 0;
        }
        if (j12 == j10) {
            return -1L;
        }
        return j12;
    }
}
