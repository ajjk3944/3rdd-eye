package w5;

import a5.d0;
import a5.v;
import u5.k;
import u5.l;
import u5.m;

/* loaded from: classes.dex */
public final class b implements k {

    /* renamed from: c, reason: collision with root package name */
    public int f24200c;

    /* renamed from: e, reason: collision with root package name */
    public c f24202e;

    /* renamed from: h, reason: collision with root package name */
    public long f24205h;

    /* renamed from: i, reason: collision with root package name */
    public e f24206i;

    /* renamed from: m, reason: collision with root package name */
    public int f24208m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f24209n;

    /* renamed from: a, reason: collision with root package name */
    public final v f24198a = new v(12);

    /* renamed from: b, reason: collision with root package name */
    public final kc.c f24199b = new kc.c();

    /* renamed from: d, reason: collision with root package name */
    public m f24201d = new et.d();

    /* renamed from: g, reason: collision with root package name */
    public e[] f24204g = new e[0];
    public long k = -1;

    /* renamed from: l, reason: collision with root package name */
    public long f24207l = -1;
    public int j = -1;

    /* renamed from: f, reason: collision with root package name */
    public long f24203f = -9223372036854775807L;

    @Override // u5.k
    public final void c(long j, long j7) {
        this.f24205h = -1L;
        this.f24206i = null;
        for (e eVar : this.f24204g) {
            if (eVar.j == 0) {
                eVar.f24225h = 0;
            } else {
                eVar.f24225h = eVar.f24227l[d0.e(eVar.k, j, true)];
            }
        }
        if (j != 0) {
            this.f24200c = 6;
        } else if (this.f24204g.length == 0) {
            this.f24200c = 0;
        } else {
            this.f24200c = 3;
        }
    }

    @Override // u5.k
    public final void f(m mVar) {
        this.f24200c = 0;
        this.f24201d = mVar;
        this.f24205h = -1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:159:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010f  */
    @Override // u5.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(u5.l r23, ca.n r24) throws androidx.media3.common.k0, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 1082
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w5.b.g(u5.l, ca.n):int");
    }

    @Override // u5.k
    public final boolean h(l lVar) {
        v vVar = this.f24198a;
        lVar.p(vVar.f165a, 0, 12);
        vVar.E(0);
        if (vVar.i() == 1179011410) {
            vVar.F(4);
            if (vVar.i() == 541677121) {
                return true;
            }
        }
        return false;
    }

    @Override // u5.k
    public final void release() {
    }
}
