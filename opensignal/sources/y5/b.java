package y5;

import a5.v;
import u5.j;
import u5.k;
import u5.l;
import u5.m;

/* loaded from: classes.dex */
public final class b implements k {

    /* renamed from: a, reason: collision with root package name */
    public final v f25849a = new v(4);

    /* renamed from: b, reason: collision with root package name */
    public final v f25850b = new v(9);

    /* renamed from: c, reason: collision with root package name */
    public final v f25851c = new v(11);

    /* renamed from: d, reason: collision with root package name */
    public final v f25852d = new v();

    /* renamed from: e, reason: collision with root package name */
    public final c f25853e;

    /* renamed from: f, reason: collision with root package name */
    public m f25854f;

    /* renamed from: g, reason: collision with root package name */
    public int f25855g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f25856h;

    /* renamed from: i, reason: collision with root package name */
    public long f25857i;
    public int j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public int f25858l;

    /* renamed from: m, reason: collision with root package name */
    public long f25859m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f25860n;

    /* renamed from: o, reason: collision with root package name */
    public a f25861o;

    /* renamed from: p, reason: collision with root package name */
    public d f25862p;

    public b() {
        c cVar = new c(13, new j());
        cVar.f25863g = -9223372036854775807L;
        cVar.f25864r = new long[0];
        cVar.f25865x = new long[0];
        this.f25853e = cVar;
        this.f25855g = 1;
    }

    public final v a(l lVar) {
        int i10 = this.f25858l;
        v vVar = this.f25852d;
        byte[] bArr = vVar.f165a;
        if (i10 > bArr.length) {
            vVar.C(0, new byte[Math.max(bArr.length * 2, i10)]);
        } else {
            vVar.E(0);
        }
        vVar.D(this.f25858l);
        lVar.readFully(vVar.f165a, 0, this.f25858l);
        return vVar;
    }

    @Override // u5.k
    public final void c(long j, long j7) {
        if (j == 0) {
            this.f25855g = 1;
            this.f25856h = false;
        } else {
            this.f25855g = 3;
        }
        this.j = 0;
    }

    @Override // u5.k
    public final void f(m mVar) {
        this.f25854f = mVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x039d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0007 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0167  */
    @Override // u5.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(u5.l r32, ca.n r33) throws androidx.media3.common.k0, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 1109
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y5.b.g(u5.l, ca.n):int");
    }

    @Override // u5.k
    public final boolean h(l lVar) {
        v vVar = this.f25849a;
        lVar.p(vVar.f165a, 0, 3);
        vVar.E(0);
        if (vVar.v() == 4607062) {
            lVar.p(vVar.f165a, 0, 2);
            vVar.E(0);
            if ((vVar.y() & 250) == 0) {
                lVar.p(vVar.f165a, 0, 4);
                vVar.E(0);
                int iG = vVar.g();
                lVar.l();
                lVar.g(iG);
                lVar.p(vVar.f165a, 0, 4);
                vVar.E(0);
                if (vVar.g() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // u5.k
    public final void release() {
    }
}
