package uu;

import br.l;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import ou.t;
import su.k;

/* loaded from: classes.dex */
public final class c extends a {
    public final /* synthetic */ ks.c B;

    /* renamed from: r, reason: collision with root package name */
    public final t f23707r;

    /* renamed from: x, reason: collision with root package name */
    public long f23708x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f23709y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ks.c cVar, t tVar) {
        super(cVar);
        l.e(tVar, "url");
        this.B = cVar;
        this.f23707r = tVar;
        this.f23708x = -1L;
        this.f23709y = true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zT;
        if (this.f23702d) {
            return;
        }
        if (this.f23709y) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            byte[] bArr = pu.b.f20645a;
            l.e(timeUnit, "timeUnit");
            try {
                zT = pu.b.t(this, 100);
            } catch (IOException unused) {
                zT = false;
            }
            if (!zT) {
                ((k) this.B.f14490d).k();
                b();
            }
        }
        this.f23702d = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00af, code lost:
    
        if (r11.f23709y == false) goto L34;
     */
    @Override // uu.a, cv.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long u(cv.g r12, long r13) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: uu.c.u(cv.g, long):long");
    }
}
