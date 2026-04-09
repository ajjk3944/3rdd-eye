package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import io.sentry.android.core.e0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import oe.h0;
import pb.b0;
import pb.d0;
import pb.f0;
import pb.g0;
import pb.j0;
import pb.k0;
import pb.n0;
import pb.t0;
import ya.a0;
import ya.q0;
import ya.u0;

/* loaded from: classes.dex */
public final class u implements g0, k0, u0, ca.m, q0 {

    /* renamed from: t0, reason: collision with root package name */
    public static final Set f4516t0 = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
    public final ba.d B;
    public final f0 D;
    public final n0 E = new n0("Loader:HlsSampleStreamWrapper");
    public final a0 F;
    public final int G;
    public final f H;
    public final ArrayList I;
    public final List J;
    public final r K;
    public final r L;
    public final Handler M;
    public final ArrayList N;
    public final Map O;
    public ab.f P;
    public t[] Q;
    public int[] R;
    public final HashSet S;
    public final SparseIntArray T;
    public s U;
    public int V;
    public int W;
    public boolean X;
    public boolean Y;
    public int Z;

    /* renamed from: a, reason: collision with root package name */
    public final int f4517a;

    /* renamed from: a0, reason: collision with root package name */
    public Format f4518a0;

    /* renamed from: b0, reason: collision with root package name */
    public Format f4519b0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f4520c0;

    /* renamed from: d, reason: collision with root package name */
    public final o f4521d;

    /* renamed from: d0, reason: collision with root package name */
    public TrackGroupArray f4522d0;

    /* renamed from: e0, reason: collision with root package name */
    public Set f4523e0;

    /* renamed from: f0, reason: collision with root package name */
    public int[] f4524f0;

    /* renamed from: g, reason: collision with root package name */
    public final HlsChunkSource f4525g;

    /* renamed from: g0, reason: collision with root package name */
    public int f4526g0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f4527h0;

    /* renamed from: i0, reason: collision with root package name */
    public boolean[] f4528i0;

    /* renamed from: j0, reason: collision with root package name */
    public boolean[] f4529j0;

    /* renamed from: k0, reason: collision with root package name */
    public long f4530k0;

    /* renamed from: l0, reason: collision with root package name */
    public long f4531l0;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f4532m0;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f4533n0;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f4534o0;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f4535p0;

    /* renamed from: q0, reason: collision with root package name */
    public long f4536q0;

    /* renamed from: r, reason: collision with root package name */
    public final pb.b f4537r;

    /* renamed from: r0, reason: collision with root package name */
    public DrmInitData f4538r0;

    /* renamed from: s0, reason: collision with root package name */
    public m f4539s0;

    /* renamed from: x, reason: collision with root package name */
    public final Format f4540x;

    /* renamed from: y, reason: collision with root package name */
    public final ba.h f4541y;

    /* JADX WARN: Type inference failed for: r1v12, types: [com.google.android.exoplayer2.source.hls.r] */
    /* JADX WARN: Type inference failed for: r1v13, types: [com.google.android.exoplayer2.source.hls.r] */
    public u(int i10, o oVar, HlsChunkSource hlsChunkSource, Map map, pb.b bVar, long j, Format format, ba.h hVar, ba.d dVar, f0 f0Var, a0 a0Var, int i11) {
        this.f4517a = i10;
        this.f4521d = oVar;
        this.f4525g = hlsChunkSource;
        this.O = map;
        this.f4537r = bVar;
        this.f4540x = format;
        this.f4541y = hVar;
        this.B = dVar;
        this.D = f0Var;
        this.F = a0Var;
        this.G = i11;
        f fVar = new f();
        fVar.f4479a = null;
        final int i12 = 0;
        fVar.f4480b = false;
        fVar.f4481c = null;
        this.H = fVar;
        this.R = new int[0];
        Set set = f4516t0;
        this.S = new HashSet(set.size());
        this.T = new SparseIntArray(set.size());
        this.Q = new t[0];
        this.f4529j0 = new boolean[0];
        this.f4528i0 = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.I = arrayList;
        this.J = Collections.unmodifiableList(arrayList);
        this.N = new ArrayList();
        this.K = new Runnable(this) { // from class: com.google.android.exoplayer2.source.hls.r

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ u f4508d;

            {
                this.f4508d = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        this.f4508d.B();
                        break;
                    default:
                        u uVar = this.f4508d;
                        uVar.X = true;
                        uVar.B();
                        break;
                }
            }
        };
        final int i13 = 1;
        this.L = new Runnable(this) { // from class: com.google.android.exoplayer2.source.hls.r

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ u f4508d;

            {
                this.f4508d = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        this.f4508d.B();
                        break;
                    default:
                        u uVar = this.f4508d;
                        uVar.X = true;
                        uVar.B();
                        break;
                }
            }
        };
        this.M = qb.v.l(null);
        this.f4530k0 = j;
        this.f4531l0 = j;
    }

    public static ca.j h(int i10, int i11) {
        StringBuilder sb2 = new StringBuilder(54);
        sb2.append("Unmapped track with id ");
        sb2.append(i10);
        sb2.append(" of type ");
        sb2.append(i11);
        e0.p("HlsSampleStreamWrapper", sb2.toString());
        return new ca.j();
    }

    public static Format v(Format format, Format format2, boolean z10) {
        String strA;
        if (format == null) {
            return format2;
        }
        String str = format.E;
        String strC = format2.H;
        int iG = qb.m.g(strC);
        if (qb.v.o(iG, str) == 1) {
            strA = qb.v.p(iG, str);
            strC = qb.m.c(strA);
        } else {
            strA = qb.m.a(str, strC);
        }
        com.google.android.exoplayer2.g0 g0VarD = format2.d();
        g0VarD.f4142a = format.f4020a;
        g0VarD.f4143b = format.f4023d;
        g0VarD.f4144c = format.f4024g;
        g0VarD.f4145d = format.f4025r;
        g0VarD.f4146e = format.f4026x;
        g0VarD.f4147f = z10 ? format.f4027y : -1;
        g0VarD.f4148g = z10 ? format.B : -1;
        g0VarD.f4149h = strA;
        if (iG == 2) {
            g0VarD.f4155p = format.M;
            g0VarD.f4156q = format.N;
            g0VarD.f4157r = format.O;
        }
        if (strC != null) {
            g0VarD.k = strC;
        }
        int i10 = format.U;
        if (i10 != -1 && iG == 1) {
            g0VarD.f4163x = i10;
        }
        Metadata metadata = format.F;
        if (metadata != null) {
            Metadata metadata2 = format2.F;
            if (metadata2 != null) {
                Metadata.Entry[] entryArr = metadata.f4241a;
                if (entryArr.length == 0) {
                    metadata = metadata2;
                } else {
                    Metadata.Entry[] entryArr2 = metadata2.f4241a;
                    Object[] objArrCopyOf = Arrays.copyOf(entryArr2, entryArr2.length + entryArr.length);
                    System.arraycopy(entryArr, 0, objArrCopyOf, entryArr2.length, entryArr.length);
                    metadata = new Metadata((Metadata.Entry[]) objArrCopyOf);
                }
            }
            g0VarD.f4150i = metadata;
        }
        return new Format(g0VarD);
    }

    public static int z(int i10) {
        if (i10 == 1) {
            return 2;
        }
        if (i10 != 2) {
            return i10 != 3 ? 0 : 1;
        }
        return 3;
    }

    public final boolean A() {
        return this.f4531l0 != -9223372036854775807L;
    }

    public final void B() {
        if (!this.f4520c0 && this.f4524f0 == null && this.X) {
            for (t tVar : this.Q) {
                if (tVar.q() == null) {
                    return;
                }
            }
            TrackGroupArray trackGroupArray = this.f4522d0;
            if (trackGroupArray != null) {
                int i10 = trackGroupArray.f4457a;
                int[] iArr = new int[i10];
                this.f4524f0 = iArr;
                Arrays.fill(iArr, -1);
                for (int i11 = 0; i11 < i10; i11++) {
                    int i12 = 0;
                    while (true) {
                        t[] tVarArr = this.Q;
                        if (i12 < tVarArr.length) {
                            Format formatQ = tVarArr[i12].q();
                            qb.b.k(formatQ);
                            Format format = this.f4522d0.f4458d[i11].f4454d[0];
                            String str = formatQ.H;
                            String str2 = format.H;
                            int iG = qb.m.g(str);
                            if (iG != 3) {
                                if (iG == qb.m.g(str2)) {
                                    break;
                                } else {
                                    i12++;
                                }
                            } else if (qb.v.a(str, str2) && (!("application/cea-608".equals(str) || "application/cea-708".equals(str)) || formatQ.Z == format.Z)) {
                                break;
                            } else {
                                i12++;
                            }
                        }
                    }
                    this.f4524f0[i11] = i12;
                }
                Iterator it = this.N.iterator();
                while (it.hasNext()) {
                    ((q) it.next()).c();
                }
                return;
            }
            int length = this.Q.length;
            int i13 = 0;
            int i14 = -1;
            int i15 = 7;
            while (true) {
                int i16 = 1;
                if (i13 >= length) {
                    break;
                }
                Format formatQ2 = this.Q[i13].q();
                qb.b.k(formatQ2);
                String str3 = formatQ2.H;
                if (qb.m.j(str3)) {
                    i16 = 2;
                } else if (!qb.m.h(str3)) {
                    i16 = qb.m.i(str3) ? 3 : 7;
                }
                if (z(i16) > z(i15)) {
                    i14 = i13;
                    i15 = i16;
                } else if (i16 == i15 && i14 != -1) {
                    i14 = -1;
                }
                i13++;
            }
            TrackGroup trackGroup = this.f4525g.getTrackGroup();
            int i17 = trackGroup.f4453a;
            Format[] formatArr = trackGroup.f4454d;
            this.f4526g0 = -1;
            this.f4524f0 = new int[length];
            for (int i18 = 0; i18 < length; i18++) {
                this.f4524f0[i18] = i18;
            }
            TrackGroup[] trackGroupArr = new TrackGroup[length];
            for (int i19 = 0; i19 < length; i19++) {
                Format formatQ3 = this.Q[i19].q();
                qb.b.k(formatQ3);
                if (i19 == i14) {
                    Format[] formatArr2 = new Format[i17];
                    if (i17 == 1) {
                        formatArr2[0] = formatQ3.g(formatArr[0]);
                    } else {
                        for (int i20 = 0; i20 < i17; i20++) {
                            formatArr2[i20] = v(formatArr[i20], formatQ3, true);
                        }
                    }
                    trackGroupArr[i19] = new TrackGroup(formatArr2);
                    this.f4526g0 = i19;
                } else {
                    trackGroupArr[i19] = new TrackGroup(v((i15 == 2 && qb.m.h(formatQ3.H)) ? this.f4540x : null, formatQ3, false));
                }
            }
            this.f4522d0 = t(trackGroupArr);
            qb.b.j(this.f4523e0 == null);
            this.f4523e0 = Collections.EMPTY_SET;
            this.Y = true;
            this.f4521d.q();
        }
    }

    public final void C(TrackGroup[] trackGroupArr, int... iArr) {
        this.f4522d0 = t(trackGroupArr);
        this.f4523e0 = new HashSet();
        for (int i10 : iArr) {
            this.f4523e0.add(this.f4522d0.f4458d[i10]);
        }
        this.f4526g0 = 0;
        this.M.post(new androidx.lifecycle.f0(7, this.f4521d));
        this.Y = true;
    }

    public final void D() {
        for (t tVar : this.Q) {
            tVar.x(this.f4532m0);
        }
        this.f4532m0 = false;
    }

    public final boolean E(long j, boolean z10) {
        this.f4530k0 = j;
        if (A()) {
            this.f4531l0 = j;
            return true;
        }
        if (this.X && !z10) {
            int length = this.Q.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (this.Q[i10].y(j, false) || (!this.f4529j0[i10] && this.f4527h0)) {
                }
            }
            return false;
        }
        this.f4531l0 = j;
        this.f4534o0 = false;
        this.I.clear();
        n0 n0Var = this.E;
        if (!n0Var.d()) {
            n0Var.f20395g = null;
            D();
            return true;
        }
        if (this.X) {
            for (t tVar : this.Q) {
                tVar.h();
            }
        }
        n0Var.b();
        return true;
    }

    @Override // pb.g0
    public final void K(j0 j0Var, long j, long j7) {
        ab.f fVar = (ab.f) j0Var;
        this.P = null;
        this.f4525g.onChunkLoadCompleted(fVar);
        long j10 = fVar.f301a;
        na.c cVar = fVar.f302d;
        t0 t0Var = fVar.E;
        Uri uri = t0Var.f20432g;
        ya.m mVar = new ya.m(cVar, j, j7, t0Var.f20431d);
        this.D.getClass();
        this.F.f(mVar, fVar.f303g, this.f4517a, fVar.f304r, fVar.f305x, fVar.f306y, fVar.B, fVar.D);
        if (this.Y) {
            this.f4521d.c(this);
        } else {
            i(this.f4530k0);
        }
    }

    @Override // ya.q0
    public final void a() {
        this.M.post(this.K);
    }

    public final void b() {
        qb.b.j(this.Y);
        this.f4522d0.getClass();
        this.f4523e0.getClass();
    }

    @Override // pb.k0
    public final void c() {
        for (t tVar : this.Q) {
            tVar.x(true);
            b9.e eVar = tVar.f26161i;
            if (eVar != null) {
                eVar.D(tVar.f26157e);
                tVar.f26161i = null;
                tVar.f26160h = null;
            }
        }
    }

    @Override // ya.u0
    public final long d() {
        if (A()) {
            return this.f4531l0;
        }
        if (this.f4534o0) {
            return Long.MIN_VALUE;
        }
        return y().D;
    }

    @Override // ya.u0
    public final boolean i(long j) {
        long jMax;
        List<m> list;
        if (!this.f4534o0) {
            n0 n0Var = this.E;
            if (!n0Var.d() && !n0Var.c()) {
                if (A()) {
                    list = Collections.EMPTY_LIST;
                    jMax = this.f4531l0;
                    for (t tVar : this.Q) {
                        tVar.f26171u = this.f4531l0;
                    }
                } else {
                    m mVarY = y();
                    jMax = mVarY.f4494d0 ? mVarY.D : Math.max(this.f4530k0, mVarY.B);
                    list = this.J;
                }
                List<m> list2 = list;
                long j7 = jMax;
                f fVar = this.H;
                fVar.f4479a = null;
                fVar.f4480b = false;
                fVar.f4481c = null;
                this.f4525g.getNextChunk(j, j7, list2, this.Y || !list2.isEmpty(), this.H);
                boolean z10 = fVar.f4480b;
                ab.f fVar2 = fVar.f4479a;
                Uri uri = fVar.f4481c;
                if (z10) {
                    this.f4531l0 = -9223372036854775807L;
                    this.f4534o0 = true;
                    return true;
                }
                if (fVar2 != null) {
                    if (fVar2 instanceof m) {
                        m mVar = (m) fVar2;
                        this.f4539s0 = mVar;
                        this.f4518a0 = mVar.f304r;
                        this.f4531l0 = -9223372036854775807L;
                        this.I.add(mVar);
                        oe.f0 f0Var = h0.f19336d;
                        oe.s.c(4, "initialCapacity");
                        Object[] objArrCopyOf = new Object[4];
                        t[] tVarArr = this.Q;
                        int length = tVarArr.length;
                        int i10 = 0;
                        int i11 = 0;
                        while (i10 < length) {
                            t tVar2 = tVarArr[i10];
                            Integer numValueOf = Integer.valueOf(tVar2.f26168r + tVar2.f26167q);
                            int i12 = i11 + 1;
                            if (objArrCopyOf.length < i12) {
                                objArrCopyOf = Arrays.copyOf(objArrCopyOf, oe.e0.e(objArrCopyOf.length, i12));
                            }
                            objArrCopyOf[i11] = numValueOf;
                            i10++;
                            i11 = i12;
                        }
                        oe.u0 u0VarK = h0.k(i11, objArrCopyOf);
                        mVar.Z = this;
                        mVar.f4495e0 = u0VarK;
                        for (t tVar3 : this.Q) {
                            tVar3.getClass();
                            tVar3.D = mVar.G;
                            if (mVar.J) {
                                tVar3.H = true;
                            }
                        }
                    }
                    this.P = fVar2;
                    this.F.k(new ya.m(fVar2.f302d, n0Var.f(fVar2, this, ((sm.m) this.D).q(fVar2.f303g))), fVar2.f303g, this.f4517a, fVar2.f304r, fVar2.f305x, fVar2.f306y, fVar2.B, fVar2.D);
                    return true;
                }
                if (uri != null) {
                    db.b bVar = (db.b) ((db.c) this.f4521d.f4499d).f7208r.get(uri);
                    bVar.c(bVar.f7199a);
                    return false;
                }
            }
        }
        return false;
    }

    @Override // ya.u0
    public final boolean isLoading() {
        return this.E.d();
    }

    @Override // ca.m
    public final void j() {
        this.f4535p0 = true;
        this.M.post(this.L);
    }

    @Override // ya.u0
    public final long m() {
        long j;
        ArrayList arrayList = this.I;
        if (this.f4534o0) {
            return Long.MIN_VALUE;
        }
        if (A()) {
            return this.f4531l0;
        }
        long jMax = this.f4530k0;
        m mVarY = y();
        if (!mVarY.f4494d0) {
            mVarY = arrayList.size() > 1 ? (m) h0.b.f(2, arrayList) : null;
        }
        if (mVarY != null) {
            jMax = Math.max(jMax, mVarY.D);
        }
        if (this.X) {
            for (t tVar : this.Q) {
                synchronized (tVar) {
                    j = tVar.f26173w;
                }
                jMax = Math.max(jMax, j);
            }
        }
        return jMax;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [com.google.android.exoplayer2.source.hls.t[]] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.exoplayer2.source.hls.t[]] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [ca.x] */
    /* JADX WARN: Type inference failed for: r5v4, types: [com.google.android.exoplayer2.source.hls.t, ya.r0] */
    /* JADX WARN: Type inference failed for: r5v6, types: [ca.j] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // ca.m
    public final ca.x n(int i10, int i11) {
        Integer numValueOf = Integer.valueOf(i11);
        Set set = f4516t0;
        boolean zContains = set.contains(numValueOf);
        HashSet hashSet = this.S;
        SparseIntArray sparseIntArray = this.T;
        ?? tVar = 0;
        tVar = 0;
        if (zContains) {
            qb.b.g(set.contains(Integer.valueOf(i11)));
            int i12 = sparseIntArray.get(i11, -1);
            if (i12 != -1) {
                if (hashSet.add(Integer.valueOf(i11))) {
                    this.R[i12] = i10;
                }
                tVar = this.R[i12] == i10 ? this.Q[i12] : h(i10, i11);
            }
        } else {
            int i13 = 0;
            while (true) {
                ?? r12 = this.Q;
                if (i13 >= r12.length) {
                    break;
                }
                if (this.R[i13] == i10) {
                    tVar = r12[i13];
                    break;
                }
                i13++;
            }
        }
        if (tVar == 0) {
            if (this.f4535p0) {
                return h(i10, i11);
            }
            int length = this.Q.length;
            boolean z10 = i11 == 1 || i11 == 2;
            tVar = new t(this.f4537r, this.M.getLooper(), this.f4541y, this.B, this.O);
            tVar.f26171u = this.f4530k0;
            if (z10) {
                tVar.J = this.f4538r0;
                tVar.A = true;
            }
            long j = this.f4536q0;
            if (tVar.G != j) {
                tVar.G = j;
                tVar.A = true;
            }
            m mVar = this.f4539s0;
            if (mVar != null) {
                tVar.D = mVar.G;
            }
            tVar.f26159g = this;
            int i14 = length + 1;
            int[] iArrCopyOf = Arrays.copyOf(this.R, i14);
            this.R = iArrCopyOf;
            iArrCopyOf[length] = i10;
            t[] tVarArr = this.Q;
            int i15 = qb.v.f20828a;
            ?? CopyOf = Arrays.copyOf(tVarArr, tVarArr.length + 1);
            CopyOf[tVarArr.length] = tVar;
            this.Q = (t[]) CopyOf;
            boolean[] zArrCopyOf = Arrays.copyOf(this.f4529j0, i14);
            this.f4529j0 = zArrCopyOf;
            zArrCopyOf[length] = z10;
            this.f4527h0 |= z10;
            hashSet.add(Integer.valueOf(i11));
            sparseIntArray.append(i11, length);
            if (z(i11) > z(this.V)) {
                this.W = length;
                this.V = i11;
            }
            this.f4528i0 = Arrays.copyOf(this.f4528i0, i14);
        }
        if (i11 != 5) {
            return tVar;
        }
        if (this.U == null) {
            this.U = new s(tVar, this.G);
        }
        return this.U;
    }

    @Override // ya.u0
    public final void o(long j) {
        n0 n0Var = this.E;
        if (n0Var.c() || A()) {
            return;
        }
        boolean zD = n0Var.d();
        HlsChunkSource hlsChunkSource = this.f4525g;
        List<? extends ab.m> list = this.J;
        if (zD) {
            this.P.getClass();
            if (hlsChunkSource.shouldCancelLoad(j, this.P, list)) {
                n0Var.b();
                return;
            }
            return;
        }
        int size = list.size();
        while (size > 0 && hlsChunkSource.getChunkPublicationState((m) list.get(size - 1)) == 2) {
            size--;
        }
        if (size < list.size()) {
            w(size);
        }
        int preferredQueueSize = hlsChunkSource.getPreferredQueueSize(j, list);
        if (preferredQueueSize < this.I.size()) {
            w(preferredQueueSize);
        }
    }

    @Override // pb.g0
    public final pb.h0 q(j0 j0Var, long j, long j7, IOException iOException, int i10) {
        pb.h0 h0Var;
        int i11;
        ab.f fVar = (ab.f) j0Var;
        boolean z10 = fVar instanceof m;
        if (z10 && !((m) fVar).f4497g0 && (iOException instanceof b0) && ((i11 = ((b0) iOException).f20355d) == 410 || i11 == 404)) {
            return n0.f20390r;
        }
        long j10 = fVar.E.f20431d;
        na.c cVar = fVar.f302d;
        Uri uri = fVar.E.f20432g;
        ya.m mVar = new ya.m(cVar, j, j7, j10);
        com.google.android.exoplayer2.h.d(fVar.B);
        com.google.android.exoplayer2.h.d(fVar.D);
        pb.e0 e0Var = new pb.e0(iOException, i10);
        HlsChunkSource hlsChunkSource = this.f4525g;
        d0 d0VarA = com.google.android.exoplayer2.trackselection.g.a(hlsChunkSource.getTrackSelection());
        f0 f0Var = this.D;
        sm.m mVar2 = (sm.m) f0Var;
        h9.t tVarO = mVar2.o(d0VarA, e0Var);
        boolean zMaybeExcludeTrack = (tVarO == null || tVarO.f10477a != 2) ? false : hlsChunkSource.maybeExcludeTrack(fVar, tVarO.f10478b);
        if (zMaybeExcludeTrack) {
            if (z10 && j10 == 0) {
                ArrayList arrayList = this.I;
                qb.b.j(((m) arrayList.remove(arrayList.size() - 1)) == fVar);
                if (arrayList.isEmpty()) {
                    this.f4531l0 = this.f4530k0;
                } else {
                    ((m) oe.s.i(arrayList)).f4496f0 = true;
                }
            }
            h0Var = n0.f20391x;
        } else {
            long jS = mVar2.s(e0Var);
            h0Var = jS != -9223372036854775807L ? new pb.h0(0, jS) : n0.f20392y;
        }
        pb.h0 h0Var2 = h0Var;
        boolean zA = h0Var2.a();
        this.F.h(mVar, fVar.f303g, this.f4517a, fVar.f304r, fVar.f305x, fVar.f306y, fVar.B, fVar.D, iOException, !zA);
        if (!zA) {
            this.P = null;
            f0Var.getClass();
        }
        if (zMaybeExcludeTrack) {
            if (!this.Y) {
                i(this.f4530k0);
                return h0Var2;
            }
            this.f4521d.c(this);
        }
        return h0Var2;
    }

    public final TrackGroupArray t(TrackGroup[] trackGroupArr) {
        for (int i10 = 0; i10 < trackGroupArr.length; i10++) {
            TrackGroup trackGroup = trackGroupArr[i10];
            Format[] formatArr = new Format[trackGroup.f4453a];
            for (int i11 = 0; i11 < trackGroup.f4453a; i11++) {
                Format format = trackGroup.f4454d[i11];
                Class clsB = this.f4541y.b(format);
                com.google.android.exoplayer2.g0 g0VarD = format.d();
                g0VarD.D = clsB;
                formatArr[i11] = new Format(g0VarD);
            }
            trackGroupArr[i10] = new TrackGroup(formatArr);
        }
        return new TrackGroupArray(trackGroupArr);
    }

    public final void w(int i10) {
        ArrayList arrayList;
        qb.b.j(!this.E.d());
        int i11 = i10;
        loop0: while (true) {
            arrayList = this.I;
            if (i11 >= arrayList.size()) {
                i11 = -1;
                break;
            }
            int i12 = i11;
            while (true) {
                if (i12 >= arrayList.size()) {
                    m mVar = (m) arrayList.get(i11);
                    for (int i13 = 0; i13 < this.Q.length; i13++) {
                        if (this.Q[i13].n() > mVar.g(i13)) {
                            break;
                        }
                    }
                    break loop0;
                }
                if (((m) arrayList.get(i12)).J) {
                    break;
                } else {
                    i12++;
                }
            }
            i11++;
        }
        if (i11 == -1) {
            return;
        }
        long j = y().D;
        m mVar2 = (m) arrayList.get(i11);
        qb.v.G(arrayList, i11, arrayList.size());
        for (int i14 = 0; i14 < this.Q.length; i14++) {
            this.Q[i14].j(mVar2.g(i14));
        }
        if (arrayList.isEmpty()) {
            this.f4531l0 = this.f4530k0;
        } else {
            ((m) oe.s.i(arrayList)).f4496f0 = true;
        }
        this.f4534o0 = false;
        int i15 = this.V;
        long j7 = mVar2.B;
        a0 a0Var = this.F;
        a0Var.m(new ya.r(1, i15, null, 3, null, a0Var.a(j7), a0Var.a(j)));
    }

    @Override // pb.g0
    public final void x(j0 j0Var, long j, long j7, boolean z10) {
        ab.f fVar = (ab.f) j0Var;
        this.P = null;
        long j10 = fVar.f301a;
        na.c cVar = fVar.f302d;
        t0 t0Var = fVar.E;
        Uri uri = t0Var.f20432g;
        ya.m mVar = new ya.m(cVar, j, j7, t0Var.f20431d);
        this.D.getClass();
        this.F.d(mVar, fVar.f303g, this.f4517a, fVar.f304r, fVar.f305x, fVar.f306y, fVar.B, fVar.D);
        if (z10) {
            return;
        }
        if (A() || this.Z == 0) {
            D();
        }
        if (this.Z > 0) {
            this.f4521d.c(this);
        }
    }

    public final m y() {
        return (m) h0.b.f(1, this.I);
    }

    @Override // ca.m
    public final void r(ca.u uVar) {
    }
}
