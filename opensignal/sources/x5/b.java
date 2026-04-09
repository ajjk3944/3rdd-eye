package x5;

import a5.v;
import androidx.media3.common.Metadata;
import ca.n;
import u5.a0;
import u5.k;
import u5.l;
import u5.m;
import u5.o;

/* loaded from: classes.dex */
public final class b implements k {

    /* renamed from: e, reason: collision with root package name */
    public m f25026e;

    /* renamed from: f, reason: collision with root package name */
    public a0 f25027f;

    /* renamed from: h, reason: collision with root package name */
    public Metadata f25029h;

    /* renamed from: i, reason: collision with root package name */
    public o f25030i;
    public int j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public w6.m f25031l;

    /* renamed from: m, reason: collision with root package name */
    public int f25032m;

    /* renamed from: n, reason: collision with root package name */
    public long f25033n;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f25022a = new byte[42];

    /* renamed from: b, reason: collision with root package name */
    public final v f25023b = new v(0, new byte[32768]);

    /* renamed from: c, reason: collision with root package name */
    public final boolean f25024c = false;

    /* renamed from: d, reason: collision with root package name */
    public final n f25025d = new n();

    /* renamed from: g, reason: collision with root package name */
    public int f25028g = 0;

    @Override // u5.k
    public final void c(long j, long j7) {
        if (j == 0) {
            this.f25028g = 0;
        } else {
            w6.m mVar = this.f25031l;
            if (mVar != null) {
                mVar.e(j7);
            }
        }
        this.f25033n = j7 != 0 ? -1L : 0L;
        this.f25032m = 0;
        this.f25023b.B(0);
    }

    @Override // u5.k
    public final void f(m mVar) {
        this.f25026e = mVar;
        this.f25027f = mVar.mo36n(0, 1);
        mVar.j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0302  */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [boolean, byte, int] */
    @Override // u5.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(u5.l r32, ca.n r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1095
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x5.b.g(u5.l, ca.n):int");
    }

    @Override // u5.k
    public final boolean h(l lVar) throws Throwable {
        u5.b.r(lVar, false);
        v vVar = new v(4);
        lVar.p(vVar.f165a, 0, 4);
        return vVar.u() == 1716281667;
    }

    @Override // u5.k
    public final void release() {
    }
}
