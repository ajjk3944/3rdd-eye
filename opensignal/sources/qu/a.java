package qu;

import br.l;
import cv.f0;
import cv.h0;
import cv.i;
import cv.y;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class a implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f21063a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f21064d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g1.f f21065g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y f21066r;

    public a(i iVar, g1.f fVar, y yVar) {
        this.f21064d = iVar;
        this.f21065g = fVar;
        this.f21066r = yVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        boolean zT;
        if (!this.f21063a) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            byte[] bArr = pu.b.f20645a;
            l.e(timeUnit, "timeUnit");
            try {
                zT = pu.b.t(this, 100);
            } catch (IOException unused) {
                zT = false;
            }
            if (!zT) {
                this.f21063a = true;
                this.f21065g.p();
            }
        }
        this.f21064d.close();
    }

    @Override // cv.f0
    public final h0 g() {
        return this.f21064d.g();
    }

    @Override // cv.f0
    public final long u(cv.g gVar, long j) throws Throwable {
        l.e(gVar, "sink");
        try {
            long jU = this.f21064d.u(gVar, j);
            y yVar = this.f21066r;
            if (jU != -1) {
                gVar.h(yVar.f6751d, gVar.f6706d - jU, jU);
                yVar.b();
                return jU;
            }
            if (!this.f21063a) {
                this.f21063a = true;
                yVar.close();
            }
            return -1L;
        } catch (IOException e4) {
            if (this.f21063a) {
                throw e4;
            }
            this.f21063a = true;
            this.f21065g.p();
            throw e4;
        }
    }
}
