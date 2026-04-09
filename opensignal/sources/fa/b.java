package fa;

import ca.j;
import ca.k;
import ca.l;
import ca.m;
import fb.f;

/* loaded from: classes.dex */
public final class b implements k {

    /* renamed from: a, reason: collision with root package name */
    public final f f8724a = new f(4);

    /* renamed from: b, reason: collision with root package name */
    public final f f8725b = new f(9);

    /* renamed from: c, reason: collision with root package name */
    public final f f8726c = new f(11);

    /* renamed from: d, reason: collision with root package name */
    public final f f8727d = new f();

    /* renamed from: e, reason: collision with root package name */
    public final c f8728e;

    /* renamed from: f, reason: collision with root package name */
    public m f8729f;

    /* renamed from: g, reason: collision with root package name */
    public int f8730g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f8731h;

    /* renamed from: i, reason: collision with root package name */
    public long f8732i;
    public int j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public int f8733l;

    /* renamed from: m, reason: collision with root package name */
    public long f8734m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f8735n;

    /* renamed from: o, reason: collision with root package name */
    public a f8736o;

    /* renamed from: p, reason: collision with root package name */
    public e f8737p;

    public b() {
        c cVar = new c(6, new j());
        cVar.f8738g = -9223372036854775807L;
        cVar.f8739r = new long[0];
        cVar.f8740x = new long[0];
        this.f8728e = cVar;
        this.f8730g = 1;
    }

    public final f a(l lVar) {
        int i10 = this.f8733l;
        f fVar = this.f8727d;
        byte[] bArr = fVar.f8800a;
        if (i10 > bArr.length) {
            fVar.w(0, new byte[Math.max(bArr.length * 2, i10)]);
        } else {
            fVar.y(0);
        }
        fVar.x(this.f8733l);
        lVar.readFully(fVar.f8800a, 0, this.f8733l);
        return fVar;
    }

    @Override // ca.k
    public final void c(long j, long j7) {
        if (j == 0) {
            this.f8730g = 1;
            this.f8731h = false;
        } else {
            this.f8730g = 3;
        }
        this.j = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0391 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0007 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0161  */
    @Override // ca.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f(ca.l r32, ca.n r33) throws com.google.android.exoplayer2.y0, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 1096
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fa.b.f(ca.l, ca.n):int");
    }

    @Override // ca.k
    public final boolean g(l lVar) {
        f fVar = this.f8724a;
        lVar.p(fVar.f8800a, 0, 3);
        fVar.y(0);
        if (fVar.q() == 4607062) {
            lVar.p(fVar.f8800a, 0, 2);
            fVar.y(0);
            if ((fVar.t() & 250) == 0) {
                lVar.p(fVar.f8800a, 0, 4);
                fVar.y(0);
                int iD = fVar.d();
                lVar.l();
                lVar.g(iD);
                lVar.p(fVar.f8800a, 0, 4);
                fVar.y(0);
                if (fVar.d() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // ca.k
    public final void h(m mVar) {
        this.f8729f = mVar;
    }

    @Override // ca.k
    public final void release() {
    }
}
