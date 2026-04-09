package ab;

import android.net.Uri;
import android.os.Looper;
import bb.q;
import ca.u;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.dash.DashSegmentIndex;
import com.google.android.exoplayer2.source.dash.DashWrappingSegmentIndex;
import com.google.android.exoplayer2.source.dash.manifest.Representation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import pb.f0;
import pb.g0;
import pb.j0;
import pb.k0;
import pb.n0;
import pb.o0;
import pb.t0;
import qb.v;
import ya.a0;
import ya.r0;
import ya.s0;
import ya.u0;

/* loaded from: classes.dex */
public final class j implements s0, u0, g0, k0 {
    public final a0 B;
    public final f0 D;
    public final n0 E = new n0("ChunkSampleStream");
    public final g F = new g(0);
    public final ArrayList G;
    public final List H;
    public final r0 I;
    public final r0[] J;
    public final io.sentry.internal.debugmeta.c K;
    public f L;
    public Format M;
    public i N;
    public long O;
    public long P;
    public int Q;
    public boolean R;

    /* renamed from: a, reason: collision with root package name */
    public final int f315a;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f316d;

    /* renamed from: g, reason: collision with root package name */
    public final Format[] f317g;

    /* renamed from: r, reason: collision with root package name */
    public final boolean[] f318r;

    /* renamed from: x, reason: collision with root package name */
    public final bb.m f319x;

    /* renamed from: y, reason: collision with root package name */
    public final bb.d f320y;

    public j(int i10, int[] iArr, Format[] formatArr, bb.m mVar, bb.d dVar, pb.b bVar, long j, ba.h hVar, ba.d dVar2, f0 f0Var, a0 a0Var) {
        this.f315a = i10;
        this.f316d = iArr;
        this.f317g = formatArr;
        this.f319x = mVar;
        this.f320y = dVar;
        this.B = a0Var;
        this.D = f0Var;
        ArrayList arrayList = new ArrayList();
        this.G = arrayList;
        this.H = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.J = new r0[length];
        this.f318r = new boolean[length];
        int i11 = length + 1;
        int[] iArr2 = new int[i11];
        r0[] r0VarArr = new r0[i11];
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        hVar.getClass();
        dVar2.getClass();
        r0 r0Var = new r0(bVar, looperMyLooper, hVar, dVar2);
        this.I = r0Var;
        int i12 = 0;
        iArr2[0] = i10;
        r0VarArr[0] = r0Var;
        while (i12 < length) {
            r0 r0Var2 = new r0(bVar, null, null, null);
            this.J[i12] = r0Var2;
            int i13 = i12 + 1;
            r0VarArr[i13] = r0Var2;
            iArr2[i13] = this.f316d[i12];
            i12 = i13;
        }
        this.K = new io.sentry.internal.debugmeta.c(iArr2, 1, r0VarArr);
        this.O = j;
        this.P = j;
    }

    @Override // pb.g0
    public final void K(j0 j0Var, long j, long j7) {
        f fVar = (f) j0Var;
        this.L = null;
        boolean z10 = fVar instanceof l;
        bb.m mVar = this.f319x;
        if (z10) {
            int iIndexOf = ((ob.c) ((ob.f) mVar.f2549l)).indexOf(((l) fVar).f304r);
            bb.k[] kVarArr = (bb.k[]) mVar.k;
            bb.k kVar = kVarArr[iIndexOf];
            if (((DashSegmentIndex) kVar.f2538g) == null) {
                u uVar = ((e) kVar.f2535d).D;
                ca.g gVar = uVar instanceof ca.g ? (ca.g) uVar : null;
                if (gVar != null) {
                    kVarArr[iIndexOf] = new bb.k(kVar.f2533b, (Representation) kVar.f2536e, (cb.b) kVar.f2537f, (e) kVar.f2535d, kVar.f2534c, new DashWrappingSegmentIndex(gVar, ((Representation) kVar.f2536e).presentationTimeOffsetUs), 0);
                }
            }
        }
        q qVar = (q) mVar.j;
        if (qVar != null) {
            long j10 = qVar.f2563d;
            if (j10 == -9223372036854775807L || fVar.D > j10) {
                qVar.f2563d = fVar.D;
            }
            qVar.f2564e.f2568r = true;
        }
        long j11 = fVar.f301a;
        na.c cVar = fVar.f302d;
        t0 t0Var = fVar.E;
        Uri uri = t0Var.f20432g;
        ya.m mVar2 = new ya.m(cVar, j, j7, t0Var.f20431d);
        this.D.getClass();
        this.B.f(mVar2, fVar.f303g, this.f315a, fVar.f304r, fVar.f305x, fVar.f306y, fVar.B, fVar.D);
        this.f320y.c(this);
    }

    @Override // ya.s0
    public final void a() throws ya.b, ba.b {
        n0 n0Var = this.E;
        n0Var.a();
        this.I.t();
        if (n0Var.d()) {
            return;
        }
        bb.m mVar = this.f319x;
        ya.b bVar = (ya.b) mVar.f2551n;
        if (bVar != null) {
            throw bVar;
        }
        ((o0) mVar.f2546g).a();
    }

    @Override // ya.s0
    public final boolean b() {
        return !v() && this.I.r(this.R);
    }

    @Override // pb.k0
    public final void c() {
        r0 r0Var = this.I;
        r0Var.x(true);
        b9.e eVar = r0Var.f26161i;
        if (eVar != null) {
            eVar.D(r0Var.f26157e);
            r0Var.f26161i = null;
            r0Var.f26160h = null;
        }
        for (r0 r0Var2 : this.J) {
            r0Var2.x(true);
            b9.e eVar2 = r0Var2.f26161i;
            if (eVar2 != null) {
                eVar2.D(r0Var2.f26157e);
                r0Var2.f26161i = null;
                r0Var2.f26160h = null;
            }
        }
        for (bb.k kVar : (bb.k[]) this.f319x.k) {
            e eVar3 = (e) kVar.f2535d;
            if (eVar3 != null) {
                eVar3.f295a.release();
            }
        }
        i iVar = this.N;
        if (iVar != null) {
            bb.d dVar = (bb.d) iVar;
            synchronized (dVar) {
                q qVar = (q) dVar.J.remove(this);
                if (qVar != null) {
                    r0 r0Var3 = qVar.f2560a;
                    r0Var3.x(true);
                    b9.e eVar4 = r0Var3.f26161i;
                    if (eVar4 != null) {
                        eVar4.D(r0Var3.f26157e);
                        r0Var3.f26161i = null;
                        r0Var3.f26160h = null;
                    }
                }
            }
        }
    }

    @Override // ya.u0
    public final long d() {
        if (v()) {
            return this.O;
        }
        if (this.R) {
            return Long.MIN_VALUE;
        }
        return r().D;
    }

    @Override // ya.s0
    public final int h(long j) throws Throwable {
        if (v()) {
            return 0;
        }
        boolean z10 = this.R;
        r0 r0Var = this.I;
        int iP = r0Var.p(j, z10);
        r0Var.z(iP);
        w();
        return iP;
    }

    /* JADX WARN: Removed duplicated region for block: B:174:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0425  */
    @Override // ya.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i(long r59) {
        /*
            Method dump skipped, instructions count: 1198
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ab.j.i(long):boolean");
    }

    @Override // ya.u0
    public final boolean isLoading() {
        return this.E.d();
    }

    @Override // ya.s0
    public final int j(io.sentry.internal.debugmeta.c cVar, z9.d dVar, int i10) {
        if (v()) {
            return -3;
        }
        w();
        return this.I.w(cVar, dVar, i10, this.R);
    }

    @Override // ya.u0
    public final long m() {
        long j;
        ArrayList arrayList = this.G;
        if (this.R) {
            return Long.MIN_VALUE;
        }
        if (v()) {
            return this.O;
        }
        long jMax = this.P;
        a aVarR = r();
        if (!aVarR.b()) {
            aVarR = arrayList.size() > 1 ? (a) h0.b.f(2, arrayList) : null;
        }
        if (aVarR != null) {
            jMax = Math.max(jMax, aVarR.D);
        }
        r0 r0Var = this.I;
        synchronized (r0Var) {
            j = r0Var.f26173w;
        }
        return Math.max(jMax, j);
    }

    public final a n(int i10) {
        ArrayList arrayList = this.G;
        a aVar = (a) arrayList.get(i10);
        v.G(arrayList, i10, arrayList.size());
        this.Q = Math.max(this.Q, arrayList.size());
        int i11 = 0;
        this.I.j(aVar.e(0));
        while (true) {
            r0[] r0VarArr = this.J;
            if (i11 >= r0VarArr.length) {
                return aVar;
            }
            r0 r0Var = r0VarArr[i11];
            i11++;
            r0Var.j(aVar.e(i11));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    @Override // ya.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o(long r14) {
        /*
            r13 = this;
            pb.n0 r0 = r13.E
            boolean r1 = r0.c()
            if (r1 != 0) goto La3
            boolean r1 = r13.v()
            if (r1 == 0) goto L10
            goto La3
        L10:
            boolean r1 = r0.d()
            java.util.ArrayList r2 = r13.G
            if (r1 == 0) goto L2d
            ab.f r14 = r13.L
            r14.getClass()
            boolean r14 = r14 instanceof ab.a
            if (r14 == 0) goto L2c
            int r14 = r2.size()
            int r14 = r14 + (-1)
            r13.t(r14)
            goto La3
        L2c:
            return
        L2d:
            bb.m r1 = r13.f319x
            java.io.IOException r3 = r1.f2551n
            ya.b r3 = (ya.b) r3
            java.util.List r4 = r13.H
            if (r3 != 0) goto L4a
            java.lang.Object r1 = r1.f2549l
            ob.f r1 = (ob.f) r1
            r3 = r1
            ob.c r3 = (ob.c) r3
            int[] r3 = r3.f19230c
            int r3 = r3.length
            r5 = 2
            if (r3 >= r5) goto L45
            goto L4a
        L45:
            int r14 = r1.c(r14, r4)
            goto L4e
        L4a:
            int r14 = r4.size()
        L4e:
            int r15 = r2.size()
            if (r14 >= r15) goto La3
            boolean r15 = r0.d()
            r15 = r15 ^ 1
            qb.b.j(r15)
            int r15 = r2.size()
        L61:
            r0 = -1
            if (r14 >= r15) goto L6e
            boolean r1 = r13.t(r14)
            if (r1 != 0) goto L6b
            goto L6f
        L6b:
            int r14 = r14 + 1
            goto L61
        L6e:
            r14 = r0
        L6f:
            if (r14 != r0) goto L72
            goto La3
        L72:
            ab.a r15 = r13.r()
            long r0 = r15.D
            ab.a r14 = r13.n(r14)
            boolean r15 = r2.isEmpty()
            if (r15 == 0) goto L86
            long r2 = r13.P
            r13.O = r2
        L86:
            r15 = 0
            r13.R = r15
            long r14 = r14.B
            ya.r r2 = new ya.r
            ya.a0 r12 = r13.B
            long r8 = r12.a(r14)
            long r10 = r12.a(r0)
            r3 = 1
            int r4 = r13.f315a
            r5 = 0
            r6 = 3
            r7 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8, r10)
            r12.m(r2)
        La3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ab.j.o(long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0179 A[LOOP:1: B:66:0x0173->B:68:0x0179, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a1 A[LOOP:2: B:70:0x019b->B:72:0x01a1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0251  */
    @Override // pb.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final pb.h0 q(pb.j0 r29, long r30, long r32, java.io.IOException r34, int r35) {
        /*
            Method dump skipped, instructions count: 694
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ab.j.q(pb.j0, long, long, java.io.IOException, int):pb.h0");
    }

    public final a r() {
        return (a) h0.b.f(1, this.G);
    }

    public final boolean t(int i10) {
        int iN;
        a aVar = (a) this.G.get(i10);
        if (this.I.n() > aVar.e(0)) {
            return true;
        }
        int i11 = 0;
        do {
            r0[] r0VarArr = this.J;
            if (i11 >= r0VarArr.length) {
                return false;
            }
            iN = r0VarArr[i11].n();
            i11++;
        } while (iN <= aVar.e(i11));
        return true;
    }

    public final boolean v() {
        return this.O != -9223372036854775807L;
    }

    public final void w() {
        int iY = y(this.I.n(), this.Q - 1);
        while (true) {
            int i10 = this.Q;
            if (i10 > iY) {
                return;
            }
            this.Q = i10 + 1;
            a aVar = (a) this.G.get(i10);
            Format format = aVar.f304r;
            if (!format.equals(this.M)) {
                this.B.b(this.f315a, format, aVar.f305x, aVar.f306y, aVar.B);
            }
            this.M = format;
        }
    }

    @Override // pb.g0
    public final void x(j0 j0Var, long j, long j7, boolean z10) {
        f fVar = (f) j0Var;
        this.L = null;
        long j10 = fVar.f301a;
        na.c cVar = fVar.f302d;
        t0 t0Var = fVar.E;
        Uri uri = t0Var.f20432g;
        ya.m mVar = new ya.m(cVar, j, j7, t0Var.f20431d);
        this.D.getClass();
        this.B.d(mVar, fVar.f303g, this.f315a, fVar.f304r, fVar.f305x, fVar.f306y, fVar.B, fVar.D);
        if (z10) {
            return;
        }
        if (v()) {
            this.I.x(false);
            for (r0 r0Var : this.J) {
                r0Var.x(false);
            }
        } else if (fVar instanceof a) {
            ArrayList arrayList = this.G;
            n(arrayList.size() - 1);
            if (arrayList.isEmpty()) {
                this.O = this.P;
            }
        }
        this.f320y.c(this);
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

    public final void z(bb.d dVar) {
        this.N = dVar;
        r0 r0Var = this.I;
        r0Var.h();
        b9.e eVar = r0Var.f26161i;
        if (eVar != null) {
            eVar.D(r0Var.f26157e);
            r0Var.f26161i = null;
            r0Var.f26160h = null;
        }
        for (r0 r0Var2 : this.J) {
            r0Var2.h();
            b9.e eVar2 = r0Var2.f26161i;
            if (eVar2 != null) {
                eVar2.D(r0Var2.f26157e);
                r0Var2.f26161i = null;
                r0Var2.f26160h = null;
            }
        }
        this.E.e(this);
    }
}
