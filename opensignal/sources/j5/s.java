package j5;

import a5.d0;
import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Metadata;
import androidx.media3.common.b1;
import androidx.media3.common.j0;
import androidx.media3.exoplayer.trackselection.v;
import b5.w;
import com.google.android.gms.internal.measurement.h4;
import h7.h0;
import h7.r1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import lf.t1;
import o5.e0;
import o5.h1;
import o5.v0;
import o5.z0;
import u5.a0;
import u5.x;

/* loaded from: classes.dex */
public final class s implements r5.i, r5.l, z0, u5.m, v0 {

    /* renamed from: u0, reason: collision with root package name */
    public static final Set f13315u0 = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
    public final i5.j B;
    public final i5.f D;
    public final r5.h E;
    public final r5.n F = new r5.n("Loader:HlsSampleStreamWrapper");
    public final e0 G;
    public final int H;
    public final h4 I;
    public final ArrayList J;
    public final List K;
    public final p L;
    public final p M;
    public final Handler N;
    public final ArrayList O;
    public final Map P;
    public p5.e Q;
    public r[] R;
    public int[] S;
    public final HashSet T;
    public final SparseIntArray U;
    public q V;
    public int W;
    public int X;
    public boolean Y;
    public boolean Z;

    /* renamed from: a, reason: collision with root package name */
    public final String f13316a;

    /* renamed from: a0, reason: collision with root package name */
    public int f13317a0;

    /* renamed from: b0, reason: collision with root package name */
    public androidx.media3.common.r f13318b0;

    /* renamed from: c0, reason: collision with root package name */
    public androidx.media3.common.r f13319c0;

    /* renamed from: d, reason: collision with root package name */
    public final int f13320d;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f13321d0;

    /* renamed from: e0, reason: collision with root package name */
    public h1 f13322e0;

    /* renamed from: f0, reason: collision with root package name */
    public Set f13323f0;

    /* renamed from: g, reason: collision with root package name */
    public final h0 f13324g;

    /* renamed from: g0, reason: collision with root package name */
    public int[] f13325g0;

    /* renamed from: h0, reason: collision with root package name */
    public int f13326h0;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f13327i0;

    /* renamed from: j0, reason: collision with root package name */
    public boolean[] f13328j0;

    /* renamed from: k0, reason: collision with root package name */
    public boolean[] f13329k0;

    /* renamed from: l0, reason: collision with root package name */
    public long f13330l0;

    /* renamed from: m0, reason: collision with root package name */
    public long f13331m0;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f13332n0;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f13333o0;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f13334p0;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f13335q0;

    /* renamed from: r, reason: collision with root package name */
    public final g f13336r;

    /* renamed from: r0, reason: collision with root package name */
    public long f13337r0;

    /* renamed from: s0, reason: collision with root package name */
    public DrmInitData f13338s0;

    /* renamed from: t0, reason: collision with root package name */
    public k f13339t0;

    /* renamed from: x, reason: collision with root package name */
    public final r5.b f13340x;

    /* renamed from: y, reason: collision with root package name */
    public final androidx.media3.common.r f13341y;

    /* JADX WARN: Type inference failed for: r1v12, types: [j5.p] */
    /* JADX WARN: Type inference failed for: r1v13, types: [j5.p] */
    public s(String str, int i10, h0 h0Var, g gVar, Map map, r5.b bVar, long j, androidx.media3.common.r rVar, i5.j jVar, i5.f fVar, r5.h hVar, e0 e0Var, int i11) {
        this.f13316a = str;
        this.f13320d = i10;
        this.f13324g = h0Var;
        this.f13336r = gVar;
        this.P = map;
        this.f13340x = bVar;
        this.f13341y = rVar;
        this.B = jVar;
        this.D = fVar;
        this.E = hVar;
        this.G = e0Var;
        this.H = i11;
        h4 h4Var = new h4();
        h4Var.f5056d = null;
        final int i12 = 0;
        h4Var.f5055a = false;
        h4Var.f5057g = null;
        this.I = h4Var;
        this.S = new int[0];
        Set set = f13315u0;
        this.T = new HashSet(set.size());
        this.U = new SparseIntArray(set.size());
        this.R = new r[0];
        this.f13329k0 = new boolean[0];
        this.f13328j0 = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.J = arrayList;
        this.K = Collections.unmodifiableList(arrayList);
        this.O = new ArrayList();
        this.L = new Runnable(this) { // from class: j5.p

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ s f13307d;

            {
                this.f13307d = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        this.f13307d.B();
                        break;
                    default:
                        s sVar = this.f13307d;
                        sVar.Y = true;
                        sVar.B();
                        break;
                }
            }
        };
        final int i13 = 1;
        this.M = new Runnable(this) { // from class: j5.p

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ s f13307d;

            {
                this.f13307d = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        this.f13307d.B();
                        break;
                    default:
                        s sVar = this.f13307d;
                        sVar.Y = true;
                        sVar.B();
                        break;
                }
            }
        };
        this.N = d0.k(null);
        this.f13330l0 = j;
        this.f13331m0 = j;
    }

    public static u5.j h(int i10, int i11) {
        a5.a.B("HlsSampleStreamWrapper", "Unmapped track with id " + i10 + " of type " + i11);
        return new u5.j();
    }

    public static androidx.media3.common.r w(androidx.media3.common.r rVar, androidx.media3.common.r rVar2, boolean z10) {
        String strA;
        if (rVar == null) {
            return rVar2;
        }
        String str = rVar.E;
        String strC = rVar2.H;
        int iG = j0.g(strC);
        if (d0.n(iG, str) == 1) {
            strA = d0.o(iG, str);
            strC = j0.c(strA);
        } else {
            strA = j0.a(str, strC);
        }
        androidx.media3.common.q qVarA = rVar2.a();
        qVarA.f1734a = rVar.f1780a;
        qVarA.f1735b = rVar.f1784d;
        qVarA.f1736c = rVar.f1786g;
        qVarA.f1737d = rVar.f1787r;
        qVarA.f1738e = rVar.f1788x;
        qVarA.f1739f = z10 ? rVar.f1789y : -1;
        qVarA.f1740g = z10 ? rVar.B : -1;
        qVarA.f1741h = strA;
        if (iG == 2) {
            qVarA.f1747p = rVar.M;
            qVarA.f1748q = rVar.N;
            qVarA.f1749r = rVar.O;
        }
        if (strC != null) {
            qVarA.k = strC;
        }
        int i10 = rVar.U;
        if (i10 != -1 && iG == 1) {
            qVarA.f1755x = i10;
        }
        Metadata metadata = rVar.F;
        if (metadata != null) {
            Metadata metadata2 = rVar2.F;
            if (metadata2 != null) {
                Metadata.Entry[] entryArr = metadata.f1549a;
                if (entryArr.length == 0) {
                    metadata = metadata2;
                } else {
                    long j = metadata2.f1550d;
                    Metadata.Entry[] entryArr2 = metadata2.f1549a;
                    Object[] objArrCopyOf = Arrays.copyOf(entryArr2, entryArr2.length + entryArr.length);
                    System.arraycopy(entryArr, 0, objArrCopyOf, entryArr2.length, entryArr.length);
                    metadata = new Metadata(j, (Metadata.Entry[]) objArrCopyOf);
                }
            }
            qVarA.f1742i = metadata;
        }
        return new androidx.media3.common.r(qVarA);
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
        return this.f13331m0 != -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void B() {
        int i10;
        if (!this.f13321d0 && this.f13325g0 == null && this.Y) {
            int i11 = 0;
            for (r rVar : this.R) {
                if (rVar.p() == null) {
                    return;
                }
            }
            h1 h1Var = this.f13322e0;
            if (h1Var != null) {
                int i12 = h1Var.f18958a;
                int[] iArr = new int[i12];
                this.f13325g0 = iArr;
                Arrays.fill(iArr, -1);
                for (int i13 = 0; i13 < i12; i13++) {
                    int i14 = 0;
                    while (true) {
                        r[] rVarArr = this.R;
                        if (i14 < rVarArr.length) {
                            androidx.media3.common.r rVarP = rVarArr[i14].p();
                            a5.a.j(rVarP);
                            androidx.media3.common.r rVar2 = this.f13322e0.a(i13).f1575r[0];
                            String str = rVarP.H;
                            String str2 = rVar2.H;
                            int iG = j0.g(str);
                            if (iG != 3) {
                                if (iG == j0.g(str2)) {
                                    break;
                                } else {
                                    i14++;
                                }
                            } else if (d0.a(str, str2) && (!("application/cea-608".equals(str) || "application/cea-708".equals(str)) || rVarP.Z == rVar2.Z)) {
                                break;
                            } else {
                                i14++;
                            }
                        }
                    }
                    this.f13325g0[i13] = i14;
                }
                Iterator it = this.O.iterator();
                while (it.hasNext()) {
                    ((o) it.next()).c();
                }
                return;
            }
            int length = this.R.length;
            int i15 = 0;
            int i16 = -1;
            int i17 = -2;
            while (true) {
                int i18 = 1;
                if (i15 >= length) {
                    break;
                }
                androidx.media3.common.r rVarP2 = this.R[i15].p();
                a5.a.j(rVarP2);
                String str3 = rVarP2.H;
                if (j0.j(str3)) {
                    i18 = 2;
                } else if (!j0.h(str3)) {
                    i18 = j0.i(str3) ? 3 : -2;
                }
                if (z(i18) > z(i17)) {
                    i16 = i15;
                    i17 = i18;
                } else if (i18 == i17 && i16 != -1) {
                    i16 = -1;
                }
                i15++;
            }
            b1 b1Var = this.f13336r.f13277h;
            int i19 = b1Var.f1572a;
            this.f13326h0 = -1;
            this.f13325g0 = new int[length];
            for (int i20 = 0; i20 < length; i20++) {
                this.f13325g0[i20] = i20;
            }
            b1[] b1VarArr = new b1[length];
            int i21 = 0;
            while (i21 < length) {
                androidx.media3.common.r rVarP3 = this.R[i21].p();
                a5.a.j(rVarP3);
                String str4 = this.f13316a;
                androidx.media3.common.r rVar3 = this.f13341y;
                if (i21 == i16) {
                    androidx.media3.common.r[] rVarArr2 = new androidx.media3.common.r[i19];
                    for (int i22 = i11; i22 < i19; i22++) {
                        androidx.media3.common.r rVarD = b1Var.f1575r[i22];
                        if (i17 == 1 && rVar3 != null) {
                            rVarD = rVarD.d(rVar3);
                        }
                        rVarArr2[i22] = i19 == 1 ? rVarP3.d(rVarD) : w(rVarD, rVarP3, true);
                    }
                    b1VarArr[i21] = new b1(str4, rVarArr2);
                    this.f13326h0 = i21;
                    i10 = 0;
                } else {
                    if (i17 != 2 || !j0.h(rVarP3.H)) {
                        rVar3 = null;
                    }
                    StringBuilder sbL = w.g.l(str4, ":muxed:");
                    sbL.append(i21 < i16 ? i21 : i21 - 1);
                    i10 = 0;
                    b1VarArr[i21] = new b1(sbL.toString(), w(rVar3, rVarP3, false));
                }
                i21++;
                i11 = i10;
            }
            int i23 = i11;
            this.f13322e0 = v(b1VarArr);
            a5.a.i(this.f13323f0 == null ? 1 : i23);
            this.f13323f0 = Collections.EMPTY_SET;
            this.Z = true;
            this.f13324g.R();
        }
    }

    public final void D() throws IOException {
        this.F.a();
        g gVar = this.f13336r;
        o5.b bVar = gVar.f13281n;
        if (bVar != null) {
            throw bVar;
        }
        Uri uri = gVar.f13282o;
        if (uri == null || !gVar.f13286s) {
            return;
        }
        k5.b bVar2 = (k5.b) ((k5.c) gVar.f13276g).f14051r.get(uri);
        bVar2.f14043d.a();
        IOException iOException = bVar2.F;
        if (iOException != null) {
            throw iOException;
        }
    }

    public final void E(b1[] b1VarArr, int... iArr) {
        this.f13322e0 = v(b1VarArr);
        this.f13323f0 = new HashSet();
        for (int i10 : iArr) {
            this.f13323f0.add(this.f13322e0.a(i10));
        }
        this.f13326h0 = 0;
        this.N.post(new j4.o(1, this.f13324g));
        this.Z = true;
    }

    public final void F() {
        for (r rVar : this.R) {
            rVar.w(this.f13332n0);
        }
        this.f13332n0 = false;
    }

    public final boolean G(long j, boolean z10) {
        this.f13330l0 = j;
        if (A()) {
            this.f13331m0 = j;
            return true;
        }
        if (this.Y && !z10) {
            int length = this.R.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (this.R[i10].x(j, false) || (!this.f13329k0[i10] && this.f13327i0)) {
                }
            }
            return false;
        }
        this.f13331m0 = j;
        this.f13334p0 = false;
        this.J.clear();
        r5.n nVar = this.F;
        if (!nVar.d()) {
            nVar.f21252g = null;
            F();
            return true;
        }
        if (this.Y) {
            for (r rVar : this.R) {
                rVar.g();
            }
        }
        nVar.b();
        return true;
    }

    @Override // o5.v0
    public final void a() {
        this.N.post(this.L);
    }

    public final void b() {
        a5.a.i(this.Z);
        this.f13322e0.getClass();
        this.f13323f0.getClass();
    }

    @Override // r5.l
    public final void c() {
        for (r rVar : this.R) {
            rVar.w(true);
            h0 h0Var = rVar.f19085h;
            if (h0Var != null) {
                h0Var.U(rVar.f19082e);
                rVar.f19085h = null;
                rVar.f19084g = null;
            }
        }
    }

    @Override // o5.z0
    public final long d() {
        if (A()) {
            return this.f13331m0;
        }
        if (this.f13334p0) {
            return Long.MIN_VALUE;
        }
        return y().D;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0271 A[PHI: r0
  0x0271: PHI (r0v16 j5.f) = (r0v15 j5.f), (r0v21 j5.f) binds: [B:94:0x0235, B:102:0x0257] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02e8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0237  */
    @Override // o5.z0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i(long r59) {
        /*
            Method dump skipped, instructions count: 1372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j5.s.i(long):boolean");
    }

    @Override // o5.z0
    public final boolean isLoading() {
        return this.F.d();
    }

    @Override // u5.m
    public final void j() {
        this.f13335q0 = true;
        this.N.post(this.M);
    }

    @Override // o5.z0
    public final long m() {
        long j;
        ArrayList arrayList = this.J;
        if (this.f13334p0) {
            return Long.MIN_VALUE;
        }
        if (A()) {
            return this.f13331m0;
        }
        long jMax = this.f13330l0;
        k kVarY = y();
        if (!kVarY.f13293e0) {
            kVarY = arrayList.size() > 1 ? (k) h0.b.f(2, arrayList) : null;
        }
        if (kVarY != null) {
            jMax = Math.max(jMax, kVarY.D);
        }
        if (this.Y) {
            for (r rVar : this.R) {
                synchronized (rVar) {
                    j = rVar.f19097v;
                }
                jMax = Math.max(jMax, j);
            }
        }
        return jMax;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [j5.r[]] */
    /* JADX WARN: Type inference failed for: r1v1, types: [j5.r[]] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [u5.a0] */
    /* JADX WARN: Type inference failed for: r5v4, types: [j5.r, o5.w0] */
    /* JADX WARN: Type inference failed for: r5v6, types: [u5.j] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // u5.m
    /* renamed from: n */
    public final a0 mo36n(int i10, int i11) {
        Integer numValueOf = Integer.valueOf(i11);
        Set set = f13315u0;
        boolean zContains = set.contains(numValueOf);
        HashSet hashSet = this.T;
        SparseIntArray sparseIntArray = this.U;
        ?? rVar = 0;
        rVar = 0;
        if (zContains) {
            a5.a.e(set.contains(Integer.valueOf(i11)));
            int i12 = sparseIntArray.get(i11, -1);
            if (i12 != -1) {
                if (hashSet.add(Integer.valueOf(i11))) {
                    this.S[i12] = i10;
                }
                rVar = this.S[i12] == i10 ? this.R[i12] : h(i10, i11);
            }
        } else {
            int i13 = 0;
            while (true) {
                ?? r12 = this.R;
                if (i13 >= r12.length) {
                    break;
                }
                if (this.S[i13] == i10) {
                    rVar = r12[i13];
                    break;
                }
                i13++;
            }
        }
        if (rVar == 0) {
            if (this.f13335q0) {
                return h(i10, i11);
            }
            int length = this.R.length;
            boolean z10 = i11 == 1 || i11 == 2;
            rVar = new r(this.f13340x, this.B, this.D, this.P);
            rVar.f19095t = this.f13330l0;
            if (z10) {
                rVar.I = this.f13338s0;
                rVar.f19101z = true;
            }
            long j = this.f13337r0;
            if (rVar.F != j) {
                rVar.F = j;
                rVar.f19101z = true;
            }
            k kVar = this.f13339t0;
            if (kVar != null) {
                rVar.C = kVar.G;
            }
            rVar.f19083f = this;
            int i14 = length + 1;
            int[] iArrCopyOf = Arrays.copyOf(this.S, i14);
            this.S = iArrCopyOf;
            iArrCopyOf[length] = i10;
            r[] rVarArr = this.R;
            int i15 = d0.f105a;
            ?? CopyOf = Arrays.copyOf(rVarArr, rVarArr.length + 1);
            CopyOf[rVarArr.length] = rVar;
            this.R = (r[]) CopyOf;
            boolean[] zArrCopyOf = Arrays.copyOf(this.f13329k0, i14);
            this.f13329k0 = zArrCopyOf;
            zArrCopyOf[length] = z10;
            this.f13327i0 |= z10;
            hashSet.add(Integer.valueOf(i11));
            sparseIntArray.append(i11, length);
            if (z(i11) > z(this.W)) {
                this.X = length;
                this.W = i11;
            }
            this.f13328j0 = Arrays.copyOf(this.f13328j0, i14);
        }
        if (i11 != 5) {
            return rVar;
        }
        if (this.V == null) {
            this.V = new q(rVar, this.H);
        }
        return this.V;
    }

    @Override // o5.z0
    public final void o(long j) {
        r5.n nVar = this.F;
        if (nVar.c() || A()) {
            return;
        }
        boolean zD = nVar.d();
        g gVar = this.f13336r;
        List list = this.K;
        if (zD) {
            this.Q.getClass();
            if (gVar.f13281n != null ? false : gVar.f13284q.i(j, this.Q, list)) {
                nVar.b();
                return;
            }
            return;
        }
        int size = list.size();
        while (size > 0 && gVar.b((k) list.get(size - 1)) == 2) {
            size--;
        }
        if (size < list.size()) {
            x(size);
        }
        int size2 = (gVar.f13281n != null || gVar.f13284q.length() < 2) ? list.size() : gVar.f13284q.c(j, list);
        if (size2 < this.J.size()) {
            x(size2);
        }
    }

    @Override // r5.i
    public final r5.j q(r5.k kVar, long j, long j7, IOException iOException, int i10) {
        boolean zJ;
        r5.j jVar;
        int i11;
        p5.e eVar = (p5.e) kVar;
        boolean z10 = eVar instanceof k;
        if (z10 && !((k) eVar).f13296h0 && (iOException instanceof w) && ((i11 = ((w) iOException).f2468r) == 410 || i11 == 404)) {
            return r5.n.f21247r;
        }
        long j10 = eVar.E.f2420d;
        b5.k kVar2 = eVar.f20265d;
        Uri uri = eVar.E.f2421g;
        o5.q qVar = new o5.q(kVar2, j, j7, j10);
        d0.P(eVar.B);
        d0.P(eVar.D);
        pb.e0 e0Var = new pb.e0(iOException, i10);
        g gVar = this.f13336r;
        pb.d0 d0VarL = t1.l(gVar.f13284q);
        r5.h hVar = this.E;
        df.c cVar = (df.c) hVar;
        h9.t tVarS = cVar.s(d0VarL, e0Var);
        if (tVarS == null || tVarS.f10477a != 2) {
            zJ = false;
        } else {
            long j11 = tVarS.f10478b;
            v vVar = gVar.f13284q;
            zJ = vVar.j(vVar.indexOf(gVar.f13277h.a(eVar.f20267r)), j11);
        }
        if (zJ) {
            if (z10 && j10 == 0) {
                ArrayList arrayList = this.J;
                a5.a.i(((k) arrayList.remove(arrayList.size() - 1)) == eVar);
                if (arrayList.isEmpty()) {
                    this.f13331m0 = this.f13330l0;
                } else {
                    ((k) oe.s.i(arrayList)).f13295g0 = true;
                }
            }
            jVar = r5.n.f21248x;
        } else {
            long jX = cVar.x(e0Var);
            jVar = jX != -9223372036854775807L ? new r5.j(0, jX) : r5.n.f21249y;
        }
        r5.j jVar2 = jVar;
        boolean zA = jVar2.a();
        this.G.h(qVar, eVar.f20266g, this.f13320d, eVar.f20267r, eVar.f20268x, eVar.f20269y, eVar.B, eVar.D, iOException, !zA);
        if (!zA) {
            this.Q = null;
            hVar.getClass();
        }
        if (zJ) {
            if (!this.Z) {
                i(this.f13330l0);
                return jVar2;
            }
            this.f13324g.r(this);
        }
        return jVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // r5.i
    public final void r(r5.k kVar, long j, long j7) {
        p5.e eVar = (p5.e) kVar;
        this.Q = null;
        if (eVar instanceof c) {
            c cVar = (c) eVar;
            byte[] bArr = cVar.F;
            g gVar = this.f13336r;
            gVar.f13280m = bArr;
            r1 r1Var = gVar.j;
            Uri uri = cVar.f20265d.f2443a;
            byte[] bArr2 = cVar.H;
            bArr2.getClass();
            com.google.android.exoplayer2.source.hls.c cVar2 = (com.google.android.exoplayer2.source.hls.c) r1Var.f10199d;
            uri.getClass();
        }
        long j10 = eVar.f20264a;
        b5.k kVar2 = eVar.f20265d;
        b5.a0 a0Var = eVar.E;
        Uri uri2 = a0Var.f2421g;
        o5.q qVar = new o5.q(kVar2, j, j7, a0Var.f2420d);
        this.E.getClass();
        this.G.f(qVar, eVar.f20266g, this.f13320d, eVar.f20267r, eVar.f20268x, eVar.f20269y, eVar.B, eVar.D);
        if (this.Z) {
            this.f13324g.r(this);
        } else {
            i(this.f13330l0);
        }
    }

    @Override // r5.i
    public final void s(r5.k kVar, long j, long j7, boolean z10) {
        p5.e eVar = (p5.e) kVar;
        this.Q = null;
        long j10 = eVar.f20264a;
        b5.k kVar2 = eVar.f20265d;
        b5.a0 a0Var = eVar.E;
        Uri uri = a0Var.f2421g;
        o5.q qVar = new o5.q(kVar2, j, j7, a0Var.f2420d);
        this.E.getClass();
        this.G.d(qVar, eVar.f20266g, this.f13320d, eVar.f20267r, eVar.f20268x, eVar.f20269y, eVar.B, eVar.D);
        if (z10) {
            return;
        }
        if (A() || this.f13317a0 == 0) {
            F();
        }
        if (this.f13317a0 > 0) {
            this.f13324g.r(this);
        }
    }

    public final h1 v(b1[] b1VarArr) {
        for (int i10 = 0; i10 < b1VarArr.length; i10++) {
            b1 b1Var = b1VarArr[i10];
            androidx.media3.common.r[] rVarArr = new androidx.media3.common.r[b1Var.f1572a];
            for (int i11 = 0; i11 < b1Var.f1572a; i11++) {
                androidx.media3.common.r rVar = b1Var.f1575r[i11];
                int iC = this.B.c(rVar);
                androidx.media3.common.q qVarA = rVar.a();
                qVarA.F = iC;
                rVarArr[i11] = new androidx.media3.common.r(qVarA);
            }
            b1VarArr[i10] = new b1(b1Var.f1573d, rVarArr);
        }
        return new h1(b1VarArr);
    }

    public final void x(int i10) {
        ArrayList arrayList;
        a5.a.i(!this.F.d());
        int i11 = i10;
        loop0: while (true) {
            arrayList = this.J;
            if (i11 >= arrayList.size()) {
                i11 = -1;
                break;
            }
            int i12 = i11;
            while (true) {
                if (i12 >= arrayList.size()) {
                    k kVar = (k) arrayList.get(i11);
                    for (int i13 = 0; i13 < this.R.length; i13++) {
                        if (this.R[i13].m() > kVar.g(i13)) {
                            break;
                        }
                    }
                    break loop0;
                }
                if (((k) arrayList.get(i12)).J) {
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
        k kVar2 = (k) arrayList.get(i11);
        d0.L(arrayList, i11, arrayList.size());
        for (int i14 = 0; i14 < this.R.length; i14++) {
            this.R[i14].i(kVar2.g(i14));
        }
        if (arrayList.isEmpty()) {
            this.f13331m0 = this.f13330l0;
        } else {
            ((k) oe.s.i(arrayList)).f13295g0 = true;
        }
        this.f13334p0 = false;
        int i15 = this.W;
        long j7 = kVar2.B;
        e0 e0Var = this.G;
        e0Var.m(new o5.v(1, i15, null, 3, null, e0Var.a(j7), e0Var.a(j)));
    }

    public final k y() {
        return (k) h0.b.f(1, this.J);
    }

    @Override // u5.m
    public final void u(x xVar) {
    }
}
