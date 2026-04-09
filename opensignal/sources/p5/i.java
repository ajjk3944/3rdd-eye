package p5;

import a5.d0;
import android.net.Uri;
import androidx.media3.common.r;
import androidx.media3.exoplayer.dash.DashSegmentIndex;
import androidx.media3.exoplayer.dash.DashWrappingSegmentIndex;
import androidx.media3.exoplayer.trackselection.v;
import b5.a0;
import h7.h0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o5.e0;
import o5.q;
import o5.w0;
import o5.x0;
import o5.z0;
import r5.o;
import u5.x;

/* loaded from: classes.dex */
public final class i implements x0, z0, r5.i, r5.l {
    public final e0 B;
    public final r5.h D;
    public final r5.n E = new r5.n("ChunkSampleStream");
    public final ab.g F = new ab.g(11);
    public final ArrayList G;
    public final List H;
    public final w0 I;
    public final w0[] J;
    public final om.f K;
    public e L;
    public r M;
    public h N;
    public long O;
    public long P;
    public int Q;
    public a R;
    public boolean S;

    /* renamed from: a, reason: collision with root package name */
    public final int f20275a;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f20276d;

    /* renamed from: g, reason: collision with root package name */
    public final r[] f20277g;

    /* renamed from: r, reason: collision with root package name */
    public final boolean[] f20278r;

    /* renamed from: x, reason: collision with root package name */
    public final bb.m f20279x;

    /* renamed from: y, reason: collision with root package name */
    public final g5.d f20280y;

    public i(int i10, int[] iArr, r[] rVarArr, bb.m mVar, g5.d dVar, r5.b bVar, long j, i5.j jVar, i5.f fVar, r5.h hVar, e0 e0Var) {
        this.f20275a = i10;
        this.f20276d = iArr;
        this.f20277g = rVarArr;
        this.f20279x = mVar;
        this.f20280y = dVar;
        this.B = e0Var;
        this.D = hVar;
        ArrayList arrayList = new ArrayList();
        this.G = arrayList;
        this.H = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.J = new w0[length];
        this.f20278r = new boolean[length];
        int i11 = length + 1;
        int[] iArr2 = new int[i11];
        w0[] w0VarArr = new w0[i11];
        jVar.getClass();
        fVar.getClass();
        w0 w0Var = new w0(bVar, jVar, fVar);
        this.I = w0Var;
        int i12 = 0;
        iArr2[0] = i10;
        w0VarArr[0] = w0Var;
        while (i12 < length) {
            w0 w0Var2 = new w0(bVar, null, null);
            this.J[i12] = w0Var2;
            int i13 = i12 + 1;
            w0VarArr[i13] = w0Var2;
            iArr2[i13] = this.f20276d[i12];
            i12 = i13;
        }
        this.K = new om.f(iArr2, 2, w0VarArr);
        this.O = j;
        this.P = j;
    }

    @Override // o5.x0
    public final void a() throws i5.d, o5.b {
        r5.n nVar = this.E;
        nVar.a();
        this.I.s();
        if (nVar.d()) {
            return;
        }
        bb.m mVar = this.f20279x;
        o5.b bVar = (o5.b) mVar.f2551n;
        if (bVar != null) {
            throw bVar;
        }
        ((o) mVar.f2546g).a();
    }

    @Override // o5.x0
    public final boolean b() {
        return !w() && this.I.q(this.S);
    }

    @Override // r5.l
    public final void c() {
        w0 w0Var = this.I;
        w0Var.w(true);
        h0 h0Var = w0Var.f19085h;
        if (h0Var != null) {
            h0Var.U(w0Var.f19082e);
            w0Var.f19085h = null;
            w0Var.f19084g = null;
        }
        for (w0 w0Var2 : this.J) {
            w0Var2.w(true);
            h0 h0Var2 = w0Var2.f19085h;
            if (h0Var2 != null) {
                h0Var2.U(w0Var2.f19082e);
                w0Var2.f19085h = null;
                w0Var2.f19084g = null;
            }
        }
        for (bb.k kVar : (bb.k[]) this.f20279x.k) {
            f fVar = (f) kVar.f2535d;
            if (fVar != null) {
                ((d) fVar).f20258a.release();
            }
        }
        h hVar = this.N;
        if (hVar != null) {
            g5.d dVar = (g5.d) hVar;
            synchronized (dVar) {
                g5.n nVar = (g5.n) dVar.J.remove(this);
                if (nVar != null) {
                    w0 w0Var3 = nVar.f9369a;
                    w0Var3.w(true);
                    h0 h0Var3 = w0Var3.f19085h;
                    if (h0Var3 != null) {
                        h0Var3.U(w0Var3.f19082e);
                        w0Var3.f19085h = null;
                        w0Var3.f19084g = null;
                    }
                }
            }
        }
    }

    @Override // o5.z0
    public final long d() {
        if (w()) {
            return this.O;
        }
        if (this.S) {
            return Long.MIN_VALUE;
        }
        return u().D;
    }

    @Override // o5.x0
    public final int h(long j) throws Throwable {
        if (w()) {
            return 0;
        }
        boolean z10 = this.S;
        w0 w0Var = this.I;
        int iO = w0Var.o(j, z10);
        a aVar = this.R;
        if (aVar != null) {
            iO = Math.min(iO, aVar.e(0) - w0Var.m());
        }
        w0Var.y(iO);
        x();
        return iO;
    }

    /* JADX WARN: Removed duplicated region for block: B:170:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01a6  */
    @Override // o5.z0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i(long r58) {
        /*
            Method dump skipped, instructions count: 1137
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p5.i.i(long):boolean");
    }

    @Override // o5.z0
    public final boolean isLoading() {
        return this.E.d();
    }

    @Override // o5.x0
    public final int j(io.sentry.internal.debugmeta.c cVar, c5.g gVar, int i10) {
        if (w()) {
            return -3;
        }
        a aVar = this.R;
        w0 w0Var = this.I;
        if (aVar != null && aVar.e(0) <= w0Var.m()) {
            return -3;
        }
        x();
        return w0Var.v(cVar, gVar, i10, this.S);
    }

    @Override // o5.z0
    public final long m() {
        long j;
        ArrayList arrayList = this.G;
        if (this.S) {
            return Long.MIN_VALUE;
        }
        if (w()) {
            return this.O;
        }
        long jMax = this.P;
        a aVarU = u();
        if (!aVarU.b()) {
            aVarU = arrayList.size() > 1 ? (a) h0.b.f(2, arrayList) : null;
        }
        if (aVarU != null) {
            jMax = Math.max(jMax, aVarU.D);
        }
        w0 w0Var = this.I;
        synchronized (w0Var) {
            j = w0Var.f19097v;
        }
        return Math.max(jMax, j);
    }

    public final a n(int i10) {
        ArrayList arrayList = this.G;
        a aVar = (a) arrayList.get(i10);
        d0.L(arrayList, i10, arrayList.size());
        this.Q = Math.max(this.Q, arrayList.size());
        int i11 = 0;
        this.I.i(aVar.e(0));
        while (true) {
            w0[] w0VarArr = this.J;
            if (i11 >= w0VarArr.length) {
                return aVar;
            }
            w0 w0Var = w0VarArr[i11];
            i11++;
            w0Var.i(aVar.e(i11));
        }
    }

    @Override // o5.z0
    public final void o(long j) {
        r5.n nVar = this.E;
        if (nVar.c() || w()) {
            return;
        }
        boolean zD = nVar.d();
        List list = this.H;
        bb.m mVar = this.f20279x;
        ArrayList arrayList = this.G;
        if (zD) {
            e eVar = this.L;
            eVar.getClass();
            boolean z10 = eVar instanceof a;
            if (z10 && v(arrayList.size() - 1)) {
                return;
            }
            if (((o5.b) mVar.f2551n) == null ? ((v) mVar.f2549l).i(j, eVar, list) : false) {
                nVar.b();
                if (z10) {
                    this.R = (a) eVar;
                    return;
                }
                return;
            }
            return;
        }
        int size = (((o5.b) mVar.f2551n) != null || ((v) mVar.f2549l).length() < 2) ? list.size() : ((v) mVar.f2549l).c(j, list);
        if (size < arrayList.size()) {
            a5.a.i(!nVar.d());
            int size2 = arrayList.size();
            while (true) {
                if (size >= size2) {
                    size = -1;
                    break;
                } else if (!v(size)) {
                    break;
                } else {
                    size++;
                }
            }
            if (size == -1) {
                return;
            }
            long j7 = u().D;
            a aVarN = n(size);
            if (arrayList.isEmpty()) {
                this.O = this.P;
            }
            this.S = false;
            long j10 = aVarN.B;
            e0 e0Var = this.B;
            e0Var.m(new o5.v(1, this.f20275a, null, 3, null, e0Var.a(j10), e0Var.a(j7)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0174 A[LOOP:1: B:66:0x016e->B:68:0x0174, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x019c A[LOOP:2: B:70:0x0196->B:72:0x019c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01e3  */
    @Override // r5.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final r5.j q(r5.k r29, long r30, long r32, java.io.IOException r34, int r35) {
        /*
            Method dump skipped, instructions count: 691
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p5.i.q(r5.k, long, long, java.io.IOException, int):r5.j");
    }

    @Override // r5.i
    public final void r(r5.k kVar, long j, long j7) {
        e eVar = (e) kVar;
        this.L = null;
        bb.m mVar = this.f20279x;
        bb.k[] kVarArr = (bb.k[]) mVar.k;
        if (eVar instanceof k) {
            int iIndexOf = ((v) mVar.f2549l).indexOf(((k) eVar).f20267r);
            bb.k kVar2 = kVarArr[iIndexOf];
            if (((DashSegmentIndex) kVar2.f2538g) == null) {
                x xVar = ((d) ((f) kVar2.f2535d)).D;
                u5.g gVar = xVar instanceof u5.g ? (u5.g) xVar : null;
                if (gVar != null) {
                    kVarArr[iIndexOf] = new bb.k(kVar2.f2533b, (h5.l) kVar2.f2536e, (h5.b) kVar2.f2537f, (f) kVar2.f2535d, kVar2.f2534c, new DashWrappingSegmentIndex(gVar, ((h5.l) kVar2.f2536e).f9949g), 1);
                }
            }
        }
        g5.n nVar = (g5.n) mVar.j;
        if (nVar != null) {
            long j10 = nVar.f9372d;
            if (j10 == -9223372036854775807L || eVar.D > j10) {
                nVar.f9372d = eVar.D;
            }
            nVar.f9373e.f2568r = true;
        }
        long j11 = eVar.f20264a;
        b5.k kVar3 = eVar.f20265d;
        a0 a0Var = eVar.E;
        Uri uri = a0Var.f2421g;
        q qVar = new q(kVar3, j, j7, a0Var.f2420d);
        this.D.getClass();
        this.B.f(qVar, eVar.f20266g, this.f20275a, eVar.f20267r, eVar.f20268x, eVar.f20269y, eVar.B, eVar.D);
        this.f20280y.r(this);
    }

    @Override // r5.i
    public final void s(r5.k kVar, long j, long j7, boolean z10) {
        e eVar = (e) kVar;
        this.L = null;
        this.R = null;
        long j10 = eVar.f20264a;
        b5.k kVar2 = eVar.f20265d;
        a0 a0Var = eVar.E;
        Uri uri = a0Var.f2421g;
        q qVar = new q(kVar2, j, j7, a0Var.f2420d);
        this.D.getClass();
        this.B.d(qVar, eVar.f20266g, this.f20275a, eVar.f20267r, eVar.f20268x, eVar.f20269y, eVar.B, eVar.D);
        if (z10) {
            return;
        }
        if (w()) {
            this.I.w(false);
            for (w0 w0Var : this.J) {
                w0Var.w(false);
            }
        } else if (eVar instanceof a) {
            ArrayList arrayList = this.G;
            n(arrayList.size() - 1);
            if (arrayList.isEmpty()) {
                this.O = this.P;
            }
        }
        this.f20280y.r(this);
    }

    public final a u() {
        return (a) h0.b.f(1, this.G);
    }

    public final boolean v(int i10) {
        int iM;
        a aVar = (a) this.G.get(i10);
        if (this.I.m() > aVar.e(0)) {
            return true;
        }
        int i11 = 0;
        do {
            w0[] w0VarArr = this.J;
            if (i11 >= w0VarArr.length) {
                return false;
            }
            iM = w0VarArr[i11].m();
            i11++;
        } while (iM <= aVar.e(i11));
        return true;
    }

    public final boolean w() {
        return this.O != -9223372036854775807L;
    }

    public final void x() {
        int iY = y(this.I.m(), this.Q - 1);
        while (true) {
            int i10 = this.Q;
            if (i10 > iY) {
                return;
            }
            this.Q = i10 + 1;
            a aVar = (a) this.G.get(i10);
            r rVar = aVar.f20267r;
            if (!rVar.equals(this.M)) {
                this.B.b(this.f20275a, rVar, aVar.f20268x, aVar.f20269y, aVar.B);
            }
            this.M = rVar;
        }
    }

    public final int y(int i10, int i11) {
        ArrayList arrayList;
        do {
            i11++;
            arrayList = this.G;
            if (i11 >= arrayList.size()) {
                return arrayList.size() - 1;
            }
        } while (((a) arrayList.get(i11)).e(0) <= i10);
        return i11 - 1;
    }

    public final void z(g5.d dVar) {
        this.N = dVar;
        w0 w0Var = this.I;
        w0Var.g();
        h0 h0Var = w0Var.f19085h;
        if (h0Var != null) {
            h0Var.U(w0Var.f19082e);
            w0Var.f19085h = null;
            w0Var.f19084g = null;
        }
        for (w0 w0Var2 : this.J) {
            w0Var2.g();
            h0 h0Var2 = w0Var2.f19085h;
            if (h0Var2 != null) {
                h0Var2.U(w0Var2.f19082e);
                w0Var2.f19085h = null;
                w0Var2.f19084g = null;
            }
        }
        this.E.e(this);
    }
}
