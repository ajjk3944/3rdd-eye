package ea;

import ca.k;
import ca.l;
import ca.m;
import ca.n;
import ca.q;
import ca.x;
import com.google.android.exoplayer2.metadata.Metadata;
import fb.f;

/* loaded from: classes.dex */
public final class c implements k {

    /* renamed from: e, reason: collision with root package name */
    public m f8032e;

    /* renamed from: f, reason: collision with root package name */
    public x f8033f;

    /* renamed from: h, reason: collision with root package name */
    public Metadata f8035h;

    /* renamed from: i, reason: collision with root package name */
    public q f8036i;
    public int j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public b f8037l;

    /* renamed from: m, reason: collision with root package name */
    public int f8038m;

    /* renamed from: n, reason: collision with root package name */
    public long f8039n;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f8028a = new byte[42];

    /* renamed from: b, reason: collision with root package name */
    public final f f8029b = new f(0, new byte[32768]);

    /* renamed from: c, reason: collision with root package name */
    public final boolean f8030c = false;

    /* renamed from: d, reason: collision with root package name */
    public final n f8031d = new n();

    /* renamed from: g, reason: collision with root package name */
    public int f8034g = 0;

    @Override // ca.k
    public final void c(long j, long j7) {
        if (j == 0) {
            this.f8034g = 0;
        } else {
            b bVar = this.f8037l;
            if (bVar != null) {
                bVar.e(j7);
            }
        }
        this.f8039n = j7 != 0 ? -1L : 0L;
        this.f8038m = 0;
        this.f8029b.v(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03ae  */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [boolean, byte, int] */
    @Override // ca.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f(ca.l r34, ca.n r35) throws com.google.android.exoplayer2.y0, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 1179
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ea.c.f(ca.l, ca.n):int");
    }

    @Override // ca.k
    public final boolean g(l lVar) {
        ic.a.E(lVar, false);
        byte[] bArr = new byte[4];
        lVar.p(bArr, 0, 4);
        return ((((long) bArr[3]) & 255) | ((((((long) bArr[0]) & 255) << 24) | ((((long) bArr[1]) & 255) << 16)) | ((((long) bArr[2]) & 255) << 8))) == 1716281667;
    }

    @Override // ca.k
    public final void h(m mVar) {
        this.f8032e = mVar;
        this.f8033f = mVar.n(0, 1);
        mVar.j();
    }

    @Override // ca.k
    public final void release() {
    }
}
