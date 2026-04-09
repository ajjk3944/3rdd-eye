package dv;

import br.l;
import cv.f0;
import cv.n;
import java.io.IOException;

/* loaded from: classes.dex */
public final class e extends n {

    /* renamed from: d, reason: collision with root package name */
    public final long f7599d;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f7600g;

    /* renamed from: r, reason: collision with root package name */
    public long f7601r;

    public e(f0 f0Var, long j, boolean z10) {
        super(f0Var);
        this.f7599d = j;
        this.f7600g = z10;
    }

    @Override // cv.n, cv.f0
    public final long u(cv.g gVar, long j) throws IOException {
        l.e(gVar, "sink");
        long j7 = this.f7601r;
        long j10 = this.f7599d;
        if (j7 > j10) {
            j = 0;
        } else if (this.f7600g) {
            long j11 = j10 - j7;
            if (j11 == 0) {
                return -1L;
            }
            j = Math.min(j, j11);
        }
        long jU = super.u(gVar, j);
        if (jU != -1) {
            this.f7601r += jU;
        }
        long j12 = this.f7601r;
        if ((j12 >= j10 || jU != -1) && j12 <= j10) {
            return jU;
        }
        if (jU > 0 && j12 > j10) {
            long j13 = gVar.f6706d - (j12 - j10);
            cv.g gVar2 = new cv.g();
            gVar2.o0(gVar);
            gVar.d0(gVar2, j13);
            gVar2.b();
        }
        StringBuilder sbK = w.g.k(j10, "expected ", " bytes but got ");
        sbK.append(this.f7601r);
        throw new IOException(sbK.toString());
    }
}
