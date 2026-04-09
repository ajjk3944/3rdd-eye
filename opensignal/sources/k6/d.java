package k6;

import a5.v;
import androidx.media3.common.Metadata;
import androidx.media3.common.k0;
import java.io.EOFException;
import u5.a0;
import u5.j;
import u5.k;
import u5.l;
import u5.m;
import u5.p;
import u5.s;

/* loaded from: classes.dex */
public final class d implements k {

    /* renamed from: a, reason: collision with root package name */
    public final long f14141a;

    /* renamed from: b, reason: collision with root package name */
    public final v f14142b;

    /* renamed from: c, reason: collision with root package name */
    public final s f14143c;

    /* renamed from: d, reason: collision with root package name */
    public final p f14144d;

    /* renamed from: e, reason: collision with root package name */
    public final oh.p f14145e;

    /* renamed from: f, reason: collision with root package name */
    public final j f14146f;

    /* renamed from: g, reason: collision with root package name */
    public m f14147g;

    /* renamed from: h, reason: collision with root package name */
    public a0 f14148h;

    /* renamed from: i, reason: collision with root package name */
    public a0 f14149i;
    public int j;
    public Metadata k;

    /* renamed from: l, reason: collision with root package name */
    public long f14150l;

    /* renamed from: m, reason: collision with root package name */
    public long f14151m;

    /* renamed from: n, reason: collision with root package name */
    public long f14152n;

    /* renamed from: o, reason: collision with root package name */
    public int f14153o;

    /* renamed from: p, reason: collision with root package name */
    public f f14154p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f14155q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f14156r;

    /* renamed from: s, reason: collision with root package name */
    public long f14157s;

    public d(int i10) {
        this(-9223372036854775807L);
    }

    public final a a(l lVar, boolean z10) {
        v vVar = this.f14142b;
        lVar.p(vVar.f165a, 0, 4);
        vVar.E(0);
        int iG = vVar.g();
        s sVar = this.f14143c;
        sVar.a(iG);
        return new a(lVar.getLength(), lVar.getPosition(), sVar.f23329g, sVar.f23326d, z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(u5.l r9) {
        /*
            r8 = this;
            k6.f r0 = r8.f14154p
            r1 = 1
            if (r0 == 0) goto L1b
            long r2 = r0.a()
            r4 = -1
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L1b
            long r4 = r9.d()
            r6 = 4
            long r2 = r2 - r6
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L1b
            goto L27
        L1b:
            a5.v r0 = r8.f14142b     // Catch: java.io.EOFException -> L27
            byte[] r0 = r0.f165a     // Catch: java.io.EOFException -> L27
            r2 = 0
            r3 = 4
            boolean r9 = r9.c(r0, r2, r3, r1)     // Catch: java.io.EOFException -> L27
            r9 = r9 ^ r1
            return r9
        L27:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: k6.d.b(u5.l):boolean");
    }

    @Override // u5.k
    public final void c(long j, long j7) {
        this.j = 0;
        this.f14150l = -9223372036854775807L;
        this.f14151m = 0L;
        this.f14153o = 0;
        this.f14157s = j7;
        f fVar = this.f14154p;
        if (!(fVar instanceof b) || ((b) fVar).c(j7)) {
            return;
        }
        this.f14156r = true;
        this.f14149i = this.f14146f;
    }

    public final boolean d(l lVar, boolean z10) throws Throwable {
        int iD;
        int i10;
        int iJ;
        int i11 = z10 ? 32768 : 131072;
        lVar.l();
        if (lVar.getPosition() == 0) {
            v vVar = (v) this.f14145e.f19481d;
            Metadata metadataK0 = null;
            int i12 = 0;
            while (true) {
                try {
                    lVar.p(vVar.f165a, 0, 10);
                    vVar.E(0);
                    if (vVar.v() != 4801587) {
                        break;
                    }
                    vVar.F(3);
                    int iS = vVar.s();
                    int i13 = iS + 10;
                    if (metadataK0 == null) {
                        byte[] bArr = new byte[i13];
                        System.arraycopy(vVar.f165a, 0, bArr, 0, 10);
                        lVar.p(bArr, 10, iS);
                        metadataK0 = new f6.c(null).k0(i13, bArr);
                    } else {
                        lVar.g(iS);
                    }
                    i12 += i13;
                } catch (EOFException unused) {
                }
            }
            lVar.l();
            lVar.g(i12);
            this.k = metadataK0;
            if (metadataK0 != null) {
                this.f14144d.b(metadataK0);
            }
            iD = (int) lVar.d();
            if (!z10) {
                lVar.m(iD);
            }
            i10 = 0;
        } else {
            iD = 0;
            i10 = 0;
        }
        int i14 = i10;
        int i15 = i14;
        while (true) {
            if (!b(lVar)) {
                v vVar2 = this.f14142b;
                vVar2.E(0);
                int iG = vVar2.g();
                if ((i10 == 0 || ((-128000) & iG) == (i10 & (-128000))) && (iJ = u5.b.j(iG)) != -1) {
                    i14++;
                    if (i14 != 1) {
                        if (i14 == 4) {
                            break;
                        }
                    } else {
                        this.f14143c.a(iG);
                        i10 = iG;
                    }
                    lVar.g(iJ - 4);
                } else {
                    int i16 = i15 + 1;
                    if (i15 == i11) {
                        if (z10) {
                            return false;
                        }
                        throw k0.a(null, "Searched too many bytes.");
                    }
                    if (z10) {
                        lVar.l();
                        lVar.g(iD + i16);
                    } else {
                        lVar.m(1);
                    }
                    i14 = 0;
                    i15 = i16;
                    i10 = 0;
                }
            } else if (i14 <= 0) {
                throw new EOFException();
            }
        }
        if (z10) {
            lVar.m(iD + i15);
        } else {
            lVar.l();
        }
        this.j = i10;
        return true;
    }

    @Override // u5.k
    public final void f(m mVar) {
        this.f14147g = mVar;
        a0 a0VarMo36n = mVar.mo36n(0, 1);
        this.f14148h = a0VarMo36n;
        this.f14149i = a0VarMo36n;
        this.f14147g.j();
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x02a7 A[LOOP:2: B:124:0x02a5->B:125:0x02a7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // u5.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(u5.l r42, ca.n r43) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1124
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k6.d.g(u5.l, ca.n):int");
    }

    @Override // u5.k
    public final boolean h(l lVar) {
        return d(lVar, true);
    }

    public d(long j) {
        this.f14141a = j;
        this.f14142b = new v(10);
        this.f14143c = new s(0);
        this.f14144d = new p();
        this.f14150l = -9223372036854775807L;
        this.f14145e = new oh.p(18);
        j jVar = new j();
        this.f14146f = jVar;
        this.f14149i = jVar;
    }

    @Override // u5.k
    public final void release() {
    }
}
