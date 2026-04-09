package ia;

import ca.j;
import ca.k;
import ca.l;
import ca.m;
import ca.r;
import ca.x;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.y0;
import java.io.EOFException;
import u5.s;

/* loaded from: classes.dex */
public final class c implements k {

    /* renamed from: a, reason: collision with root package name */
    public final long f11292a;

    /* renamed from: b, reason: collision with root package name */
    public final fb.f f11293b;

    /* renamed from: c, reason: collision with root package name */
    public final s f11294c;

    /* renamed from: d, reason: collision with root package name */
    public final r f11295d;

    /* renamed from: e, reason: collision with root package name */
    public final a2.g f11296e;

    /* renamed from: f, reason: collision with root package name */
    public m f11297f;

    /* renamed from: g, reason: collision with root package name */
    public x f11298g;

    /* renamed from: h, reason: collision with root package name */
    public x f11299h;

    /* renamed from: i, reason: collision with root package name */
    public int f11300i;
    public Metadata j;
    public long k;

    /* renamed from: l, reason: collision with root package name */
    public long f11301l;

    /* renamed from: m, reason: collision with root package name */
    public long f11302m;

    /* renamed from: n, reason: collision with root package name */
    public int f11303n;

    /* renamed from: o, reason: collision with root package name */
    public e f11304o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f11305p;

    public c(int i10) {
        this(-9223372036854775807L);
    }

    public final a a(l lVar) {
        fb.f fVar = this.f11293b;
        lVar.p(fVar.f8800a, 0, 4);
        fVar.y(0);
        int iD = fVar.d();
        s sVar = this.f11294c;
        sVar.a(iD);
        return new a(sVar.f23329g, sVar.f23326d, lVar.getLength(), lVar.getPosition());
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(ca.l r9) {
        /*
            r8 = this;
            ia.e r0 = r8.f11304o
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
            fb.f r0 = r8.f11293b     // Catch: java.io.EOFException -> L27
            byte[] r0 = r0.f8800a     // Catch: java.io.EOFException -> L27
            r2 = 0
            r3 = 4
            boolean r9 = r9.c(r0, r2, r3, r1)     // Catch: java.io.EOFException -> L27
            r9 = r9 ^ r1
            return r9
        L27:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ia.c.b(ca.l):boolean");
    }

    @Override // ca.k
    public final void c(long j, long j7) {
        this.f11300i = 0;
        this.k = -9223372036854775807L;
        this.f11301l = 0L;
        this.f11303n = 0;
    }

    public final boolean d(l lVar, boolean z10) throws y0, EOFException {
        int iD;
        int i10;
        int iE;
        int i11 = z10 ? 32768 : 131072;
        lVar.l();
        if (lVar.getPosition() == 0) {
            fb.f fVar = (fb.f) this.f11296e.f31a;
            Metadata metadataS = null;
            int i12 = 0;
            while (true) {
                try {
                    lVar.p(fVar.f8800a, 0, 10);
                    fVar.y(0);
                    if (fVar.q() != 4801587) {
                        break;
                    }
                    fVar.z(3);
                    int iN = fVar.n();
                    int i13 = iN + 10;
                    if (metadataS == null) {
                        byte[] bArr = new byte[i13];
                        System.arraycopy(fVar.f8800a, 0, bArr, 0, 10);
                        lVar.p(bArr, 10, iN);
                        metadataS = new ua.b(null).S(i13, bArr);
                    } else {
                        lVar.g(iN);
                    }
                    i12 += i13;
                } catch (EOFException unused) {
                }
            }
            lVar.l();
            lVar.g(i12);
            this.j = metadataS;
            if (metadataS != null) {
                this.f11295d.b(metadataS);
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
                fb.f fVar2 = this.f11293b;
                fVar2.y(0);
                int iD2 = fVar2.d();
                if ((i10 == 0 || ((-128000) & iD2) == (i10 & (-128000))) && (iE = y9.a.e(iD2)) != -1) {
                    i14++;
                    if (i14 != 1) {
                        if (i14 == 4) {
                            break;
                        }
                    } else {
                        this.f11294c.a(iD2);
                        i10 = iD2;
                    }
                    lVar.g(iE - 4);
                } else {
                    int i16 = i15 + 1;
                    if (i15 == i11) {
                        if (z10) {
                            return false;
                        }
                        throw y0.a(null, "Searched too many bytes.");
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
        this.f11300i = i10;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0077  */
    @Override // ca.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f(ca.l r43, ca.n r44) throws com.google.android.exoplayer2.y0, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 1000
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ia.c.f(ca.l, ca.n):int");
    }

    @Override // ca.k
    public final boolean g(l lVar) {
        return d(lVar, true);
    }

    @Override // ca.k
    public final void h(m mVar) {
        this.f11297f = mVar;
        x xVarN = mVar.n(0, 1);
        this.f11298g = xVarN;
        this.f11299h = xVarN;
        this.f11297f.j();
    }

    public c(long j) {
        this.f11292a = j;
        this.f11293b = new fb.f(10);
        this.f11294c = new s(1);
        this.f11295d = new r();
        this.k = -9223372036854775807L;
        this.f11296e = new a2.g(7);
        this.f11299h = new j();
    }

    @Override // ca.k
    public final void release() {
    }
}
