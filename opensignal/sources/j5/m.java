package j5;

import a5.d0;
import android.net.Uri;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Metadata;
import androidx.media3.common.b1;
import androidx.media3.common.j0;
import androidx.media3.common.k0;
import b5.b0;
import d5.x0;
import e5.o0;
import h7.h0;
import i.g0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import lf.t1;
import o5.e0;
import o5.h1;
import o5.w;
import o5.x;
import o5.z0;

/* loaded from: classes.dex */
public final class m implements x, k5.r {
    public final r5.h B;
    public final e0 D;
    public final r5.b E;
    public final IdentityHashMap F;
    public final g0 G;
    public final o5.k H;
    public final boolean I;
    public final int J;
    public final boolean K;
    public final o0 L;
    public final h0 M = new h0(this);
    public w N;
    public int O;
    public h1 P;
    public s[] Q;
    public s[] R;
    public int S;
    public o2.g T;

    /* renamed from: a, reason: collision with root package name */
    public final i f13297a;

    /* renamed from: d, reason: collision with root package name */
    public final k5.t f13298d;

    /* renamed from: g, reason: collision with root package name */
    public final h f13299g;

    /* renamed from: r, reason: collision with root package name */
    public final b0 f13300r;

    /* renamed from: x, reason: collision with root package name */
    public final i5.j f13301x;

    /* renamed from: y, reason: collision with root package name */
    public final i5.f f13302y;

    public m(i iVar, k5.t tVar, h hVar, b0 b0Var, i5.j jVar, i5.f fVar, r5.h hVar2, e0 e0Var, r5.b bVar, o5.k kVar, boolean z10, int i10, boolean z11, o0 o0Var) {
        this.f13297a = iVar;
        this.f13298d = tVar;
        this.f13299g = hVar;
        this.f13300r = b0Var;
        this.f13301x = jVar;
        this.f13302y = fVar;
        this.B = hVar2;
        this.D = e0Var;
        this.E = bVar;
        this.H = kVar;
        this.I = z10;
        this.J = i10;
        this.K = z11;
        this.L = o0Var;
        ((et.d) kVar).getClass();
        this.T = new o2.g(1, new z0[0]);
        this.F = new IdentityHashMap();
        this.G = new g0(9);
        this.Q = new s[0];
        this.R = new s[0];
    }

    public static androidx.media3.common.r h(androidx.media3.common.r rVar, androidx.media3.common.r rVar2, boolean z10) {
        String strO;
        Metadata metadata;
        int i10;
        String str;
        int i11;
        int i12;
        String str2;
        if (rVar2 != null) {
            strO = rVar2.E;
            metadata = rVar2.F;
            i11 = rVar2.U;
            i10 = rVar2.f1787r;
            i12 = rVar2.f1788x;
            str = rVar2.f1786g;
            str2 = rVar2.f1784d;
        } else {
            strO = d0.o(1, rVar.E);
            metadata = rVar.F;
            if (z10) {
                i11 = rVar.U;
                i10 = rVar.f1787r;
                i12 = rVar.f1788x;
                str = rVar.f1786g;
                str2 = rVar.f1784d;
            } else {
                i10 = 0;
                str = null;
                i11 = -1;
                i12 = 0;
                str2 = null;
            }
        }
        String strC = j0.c(strO);
        int i13 = z10 ? rVar.f1789y : -1;
        int i14 = z10 ? rVar.B : -1;
        androidx.media3.common.q qVar = new androidx.media3.common.q();
        qVar.f1734a = rVar.f1780a;
        qVar.f1735b = str2;
        qVar.j = rVar.G;
        qVar.k = strC;
        qVar.f1741h = strO;
        qVar.f1742i = metadata;
        qVar.f1739f = i13;
        qVar.f1740g = i14;
        qVar.f1755x = i11;
        qVar.f1737d = i10;
        qVar.f1738e = i12;
        qVar.f1736c = str;
        return new androidx.media3.common.r(qVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02d8  */
    /* JADX WARN: Type inference failed for: r27v0 */
    /* JADX WARN: Type inference failed for: r28v2 */
    /* JADX WARN: Type inference failed for: r6v41 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    @Override // o5.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long C(androidx.media3.exoplayer.trackselection.v[] r38, boolean[] r39, o5.x0[] r40, boolean[] r41, long r42) {
        /*
            Method dump skipped, instructions count: 811
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j5.m.C(androidx.media3.exoplayer.trackselection.v[], boolean[], o5.x0[], boolean[], long):long");
    }

    @Override // k5.r
    public final void a() {
        for (s sVar : this.Q) {
            r5.n nVar = sVar.F;
            ArrayList arrayList = sVar.J;
            if (!arrayList.isEmpty()) {
                k kVar = (k) oe.s.i(arrayList);
                int iB = sVar.f13336r.b(kVar);
                if (iB == 1) {
                    kVar.f13296h0 = true;
                } else if (iB == 2 && !sVar.f13334p0 && nVar.d()) {
                    nVar.b();
                }
            }
        }
        this.N.r(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x005a A[SYNTHETIC] */
    @Override // k5.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(android.net.Uri r19, pb.e0 r20, boolean r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            j5.s[] r2 = r0.Q
            int r3 = r2.length
            r6 = 0
            r7 = 1
        L9:
            if (r6 >= r3) goto La6
            r8 = r2[r6]
            j5.g r9 = r8.f13336r
            android.net.Uri[] r10 = r9.f13274e
            boolean r11 = a5.d0.j(r10, r1)
            if (r11 != 0) goto L1d
            r14 = r20
            r4 = 1
            r13 = 1
            goto La1
        L1d:
            if (r21 != 0) goto L3c
            r5.h r8 = r8.E
            androidx.media3.exoplayer.trackselection.v r13 = r9.f13284q
            pb.d0 r13 = lf.t1.l(r13)
            df.c r8 = (df.c) r8
            r14 = r20
            h9.t r8 = r8.s(r13, r14)
            if (r8 == 0) goto L3a
            int r13 = r8.f10477a
            r15 = 2
            if (r13 != r15) goto L3a
            r13 = 1
            long r4 = r8.f10478b
            goto L44
        L3a:
            r13 = 1
            goto L3f
        L3c:
            r14 = r20
            goto L3a
        L3f:
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L44:
            r8 = 0
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L4a:
            int r11 = r10.length
            r12 = -1
            if (r8 >= r11) goto L5a
            r11 = r10[r8]
            boolean r11 = r11.equals(r1)
            if (r11 == 0) goto L57
            goto L5b
        L57:
            int r8 = r8 + 1
            goto L4a
        L5a:
            r8 = r12
        L5b:
            if (r8 != r12) goto L5f
        L5d:
            r8 = r13
            goto L98
        L5f:
            androidx.media3.exoplayer.trackselection.v r10 = r9.f13284q
            int r8 = r10.indexOf(r8)
            if (r8 != r12) goto L68
            goto L5d
        L68:
            boolean r10 = r9.f13286s
            android.net.Uri r11 = r9.f13282o
            boolean r11 = r1.equals(r11)
            r10 = r10 | r11
            r9.f13286s = r10
            int r10 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r10 == 0) goto L5d
            androidx.media3.exoplayer.trackselection.v r10 = r9.f13284q
            boolean r8 = r10.j(r8, r4)
            if (r8 == 0) goto L97
            k5.t r8 = r9.f13276g
            k5.c r8 = (k5.c) r8
            java.util.HashMap r8 = r8.f14051r
            java.lang.Object r8 = r8.get(r1)
            k5.b r8 = (k5.b) r8
            if (r8 == 0) goto L93
            boolean r8 = k5.b.a(r8, r4)
            r8 = r8 ^ r13
            goto L94
        L93:
            r8 = 0
        L94:
            if (r8 == 0) goto L97
            goto L5d
        L97:
            r8 = 0
        L98:
            if (r8 == 0) goto La0
            int r4 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r4 == 0) goto La0
            r4 = r13
            goto La1
        La0:
            r4 = 0
        La1:
            r7 = r7 & r4
            int r6 = r6 + 1
            goto L9
        La6:
            o5.w r1 = r0.N
            r1.r(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: j5.m.b(android.net.Uri, pb.e0, boolean):boolean");
    }

    public final s c(String str, int i10, Uri[] uriArr, androidx.media3.common.r[] rVarArr, androidx.media3.common.r rVar, List list, Map map, long j) {
        return new s(str, i10, this.M, new g(this.f13297a, this.f13298d, uriArr, rVarArr, this.f13299g, this.f13300r, this.G, list, this.L), map, this.E, j, rVar, this.f13301x, this.f13302y, this.B, this.D, this.J);
    }

    @Override // o5.z0
    public final long d() {
        return this.T.d();
    }

    @Override // o5.x
    public final void e() throws IOException {
        for (s sVar : this.Q) {
            sVar.D();
            if (sVar.f13334p0 && !sVar.Z) {
                throw k0.a(null, "Loading finished before preparation is complete.");
            }
        }
    }

    @Override // o5.x
    public final long f(long j) {
        s[] sVarArr = this.R;
        if (sVarArr.length > 0) {
            boolean zG = sVarArr[0].G(j, false);
            int i10 = 1;
            while (true) {
                s[] sVarArr2 = this.R;
                if (i10 >= sVarArr2.length) {
                    break;
                }
                sVarArr2[i10].G(j, zG);
                i10++;
            }
            if (zG) {
                ((SparseArray) this.G.f11051a).clear();
            }
        }
        return j;
    }

    @Override // o5.x
    public final void g(long j) throws Throwable {
        for (s sVar : this.R) {
            if (sVar.Y && !sVar.A()) {
                int length = sVar.R.length;
                for (int i10 = 0; i10 < length; i10++) {
                    sVar.R[i10].f(j, sVar.f13328j0[i10]);
                }
            }
        }
    }

    @Override // o5.z0
    public final boolean i(long j) {
        if (this.P != null) {
            return this.T.i(j);
        }
        for (s sVar : this.Q) {
            if (!sVar.Z) {
                sVar.i(sVar.f13330l0);
            }
        }
        return false;
    }

    @Override // o5.z0
    public final boolean isLoading() {
        return this.T.isLoading();
    }

    @Override // o5.x
    public final long k() {
        return -9223372036854775807L;
    }

    @Override // o5.x
    public final h1 l() {
        h1 h1Var = this.P;
        h1Var.getClass();
        return h1Var;
    }

    @Override // o5.z0
    public final long m() {
        return this.T.m();
    }

    @Override // o5.z0
    public final void o(long j) {
        this.T.o(j);
    }

    @Override // o5.x
    public final long p(long j, x0 x0Var) {
        s[] sVarArr = this.R;
        int length = sVarArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            s sVar = sVarArr[i10];
            if (sVar.W == 2) {
                g gVar = sVar.f13336r;
                k5.t tVar = gVar.f13276g;
                int iA = gVar.f13284q.a();
                Uri[] uriArr = gVar.f13274e;
                k5.i iVarA = (iA >= uriArr.length || iA == -1) ? null : ((k5.c) tVar).a(true, uriArr[gVar.f13284q.m()]);
                if (iVarA != null) {
                    oe.h0 h0Var = iVarA.f14075r;
                    if (!h0Var.isEmpty() && iVarA.f14100c) {
                        long j7 = iVarA.f14067h - ((k5.c) tVar).J;
                        long j10 = j - j7;
                        int iC = d0.c(h0Var, Long.valueOf(j10), true);
                        long j11 = ((k5.g) h0Var.get(iC)).f14061x;
                        return x0Var.a(j10, j11, iC != h0Var.size() - 1 ? ((k5.g) h0Var.get(iC + 1)).f14061x : j11) + j7;
                    }
                }
            } else {
                i10++;
            }
        }
        return j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v59, types: [java.util.HashMap] */
    @Override // o5.x
    public final void t(w wVar, long j) {
        ?? map;
        boolean z10;
        List list;
        List list2;
        int i10;
        boolean z11;
        int i11;
        boolean z12;
        boolean z13;
        Uri[] uriArr;
        this.N = wVar;
        k5.c cVar = (k5.c) this.f13298d;
        cVar.getClass();
        cVar.f14052x.add(this);
        k5.l lVar = cVar.F;
        lVar.getClass();
        List list3 = lVar.f14093g;
        List list4 = lVar.f14091e;
        if (this.K) {
            List list5 = lVar.f14097m;
            ArrayList arrayList = new ArrayList(list5);
            map = new HashMap();
            int i12 = 0;
            while (i12 < arrayList.size()) {
                DrmInitData drmInitData = (DrmInitData) list5.get(i12);
                String str = drmInitData.f1542g;
                i12++;
                int i13 = i12;
                while (i13 < arrayList.size()) {
                    DrmInitData drmInitData2 = (DrmInitData) arrayList.get(i13);
                    String str2 = drmInitData2.f1542g;
                    if (TextUtils.equals(str2, str)) {
                        String str3 = drmInitData.f1542g;
                        a5.a.i(str3 == null || str2 == null || TextUtils.equals(str3, str2));
                        if (str3 != null) {
                            str2 = str3;
                        }
                        DrmInitData.SchemeData[] schemeDataArr = drmInitData.f1540a;
                        DrmInitData.SchemeData[] schemeDataArr2 = drmInitData2.f1540a;
                        int i14 = d0.f105a;
                        Object[] objArrCopyOf = Arrays.copyOf(schemeDataArr, schemeDataArr.length + schemeDataArr2.length);
                        System.arraycopy(schemeDataArr2, 0, objArrCopyOf, schemeDataArr.length, schemeDataArr2.length);
                        drmInitData = new DrmInitData(str2, true, (DrmInitData.SchemeData[]) objArrCopyOf);
                        arrayList.remove(i13);
                    } else {
                        i13++;
                    }
                }
                map.put(str, drmInitData);
            }
        } else {
            map = Collections.EMPTY_MAP;
        }
        Map map2 = map;
        boolean zIsEmpty = list4.isEmpty();
        List list6 = lVar.f14094h;
        this.O = 0;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        boolean z14 = this.I;
        if (zIsEmpty) {
            z10 = z14;
            list = list3;
            list2 = list6;
        } else {
            androidx.media3.common.r rVar = lVar.j;
            int size = list4.size();
            int[] iArr = new int[size];
            int i15 = 0;
            int i16 = 0;
            int i17 = 0;
            while (true) {
                list2 = list6;
                if (i15 >= list4.size()) {
                    break;
                }
                androidx.media3.common.r rVar2 = ((k5.k) list4.get(i15)).f14084b;
                int i18 = rVar2.N;
                String str4 = rVar2.E;
                if (i18 > 0 || d0.o(2, str4) != null) {
                    iArr[i15] = 2;
                    i16++;
                } else if (d0.o(1, str4) != null) {
                    iArr[i15] = 1;
                    i17++;
                } else {
                    iArr[i15] = -1;
                }
                i15++;
                list6 = list2;
            }
            if (i16 > 0) {
                i11 = i16;
                z13 = false;
                z12 = true;
                z11 = z14;
            } else if (i17 < size) {
                z11 = z14;
                i11 = size - i17;
                z12 = false;
                z13 = true;
            } else {
                z11 = z14;
                i11 = size;
                z12 = false;
                z13 = false;
            }
            Uri[] uriArr2 = new Uri[i11];
            boolean z15 = z12;
            androidx.media3.common.r[] rVarArr = new androidx.media3.common.r[i11];
            int[] iArr2 = new int[i11];
            int i19 = 0;
            int i20 = 0;
            while (i19 < list4.size()) {
                if (z15) {
                    uriArr = uriArr2;
                    if (iArr[i19] == 2) {
                    }
                    i19++;
                    uriArr2 = uriArr;
                } else {
                    uriArr = uriArr2;
                }
                if (!z13 || iArr[i19] != 1) {
                    k5.k kVar = (k5.k) list4.get(i19);
                    uriArr[i20] = kVar.f14083a;
                    rVarArr[i20] = kVar.f14084b;
                    iArr2[i20] = i19;
                    i20++;
                }
                i19++;
                uriArr2 = uriArr;
            }
            Uri[] uriArr3 = uriArr2;
            String str5 = rVarArr[0].E;
            int iN = d0.n(2, str5);
            int iN2 = d0.n(1, str5);
            boolean z16 = (iN2 == 1 || (iN2 == 0 && list3.isEmpty())) && iN <= 1 && iN2 + iN > 0;
            z10 = z11;
            list = list3;
            s sVarC = c("main", (z15 || iN2 <= 0) ? 0 : 1, uriArr3, rVarArr, lVar.j, lVar.k, map2, j);
            arrayList2.add(sVarC);
            arrayList3.add(iArr2);
            if (z10 && z16) {
                ArrayList arrayList4 = new ArrayList();
                if (iN > 0) {
                    androidx.media3.common.r[] rVarArr2 = new androidx.media3.common.r[i11];
                    int i21 = 0;
                    while (i21 < i11) {
                        androidx.media3.common.r rVar3 = rVarArr[i21];
                        String strO = d0.o(2, rVar3.E);
                        String strC = j0.c(strO);
                        androidx.media3.common.q qVar = new androidx.media3.common.q();
                        qVar.f1734a = rVar3.f1780a;
                        qVar.f1735b = rVar3.f1784d;
                        qVar.j = rVar3.G;
                        qVar.k = strC;
                        qVar.f1741h = strO;
                        qVar.f1742i = rVar3.F;
                        qVar.f1739f = rVar3.f1789y;
                        qVar.f1740g = rVar3.B;
                        qVar.f1747p = rVar3.M;
                        qVar.f1748q = rVar3.N;
                        qVar.f1749r = rVar3.O;
                        qVar.f1737d = rVar3.f1787r;
                        qVar.f1738e = rVar3.f1788x;
                        rVarArr2[i21] = new androidx.media3.common.r(qVar);
                        i21++;
                        rVarArr = rVarArr;
                    }
                    androidx.media3.common.r[] rVarArr3 = rVarArr;
                    arrayList4.add(new b1("main", rVarArr2));
                    if (iN2 > 0 && (rVar != null || list.isEmpty())) {
                        arrayList4.add(new b1("main:audio", h(rVarArr3[0], rVar, false)));
                    }
                    List list7 = lVar.k;
                    if (list7 != null) {
                        for (int i22 = 0; i22 < list7.size(); i22++) {
                            arrayList4.add(new b1(h0.b.h(i22, "main:cc:"), (androidx.media3.common.r) list7.get(i22)));
                        }
                    }
                } else {
                    androidx.media3.common.r[] rVarArr4 = new androidx.media3.common.r[i11];
                    for (int i23 = 0; i23 < i11; i23++) {
                        rVarArr4[i23] = h(rVarArr[i23], rVar, true);
                    }
                    arrayList4.add(new b1("main", rVarArr4));
                }
                androidx.media3.common.q qVar2 = new androidx.media3.common.q();
                qVar2.f1734a = "ID3";
                qVar2.k = "application/id3";
                b1 b1Var = new b1("main:id3", new androidx.media3.common.r(qVar2));
                arrayList4.add(b1Var);
                sVarC.E((b1[]) arrayList4.toArray(new b1[0]), arrayList4.indexOf(b1Var));
            }
        }
        ArrayList arrayList5 = new ArrayList(list.size());
        ArrayList arrayList6 = new ArrayList(list.size());
        ArrayList arrayList7 = new ArrayList(list.size());
        HashSet hashSet = new HashSet();
        int i24 = 0;
        while (i24 < list.size()) {
            List list8 = list;
            String str6 = ((k5.j) list8.get(i24)).f14082c;
            if (hashSet.add(str6)) {
                arrayList5.clear();
                arrayList6.clear();
                arrayList7.clear();
                boolean z17 = true;
                for (int i25 = 0; i25 < list8.size(); i25++) {
                    String str7 = ((k5.j) list8.get(i25)).f14082c;
                    int i26 = d0.f105a;
                    if (str6.equals(str7)) {
                        k5.j jVar = (k5.j) list8.get(i25);
                        arrayList7.add(Integer.valueOf(i25));
                        Uri uri = jVar.f14080a;
                        androidx.media3.common.r rVar4 = jVar.f14081b;
                        arrayList5.add(uri);
                        arrayList6.add(rVar4);
                        z17 &= d0.n(1, rVar4.E) == 1;
                    }
                }
                String strConcat = "audio:".concat(str6);
                int i27 = d0.f105a;
                list = list8;
                i10 = i24;
                s sVarC2 = c(strConcat, 1, (Uri[]) arrayList5.toArray(new Uri[0]), (androidx.media3.common.r[]) arrayList6.toArray(new androidx.media3.common.r[0]), null, Collections.EMPTY_LIST, map2, j);
                arrayList3.add(t1.H(arrayList7));
                arrayList2.add(sVarC2);
                if (z10 && z17) {
                    sVarC2.E(new b1[]{new b1(strConcat, (androidx.media3.common.r[]) arrayList6.toArray(new androidx.media3.common.r[0]))}, new int[0]);
                }
            } else {
                i10 = i24;
                list = list8;
            }
            i24 = i10 + 1;
        }
        this.S = arrayList2.size();
        for (int i28 = 0; i28 < list2.size(); i28++) {
            k5.j jVar2 = (k5.j) list2.get(i28);
            StringBuilder sbU = h0.b.u("subtitle:", i28, ":");
            String str8 = jVar2.f14082c;
            androidx.media3.common.r rVar5 = jVar2.f14081b;
            sbU.append(str8);
            String string = sbU.toString();
            s sVarC3 = c(string, 3, new Uri[]{jVar2.f14080a}, new androidx.media3.common.r[]{rVar5}, null, Collections.EMPTY_LIST, map2, j);
            arrayList3.add(new int[]{i28});
            arrayList2.add(sVarC3);
            sVarC3.E(new b1[]{new b1(string, rVar5)}, new int[0]);
        }
        this.Q = (s[]) arrayList2.toArray(new s[0]);
        this.O = this.Q.length;
        for (int i29 = 0; i29 < this.S; i29++) {
            this.Q[i29].f13336r.f13279l = true;
        }
        for (s sVar : this.Q) {
            if (!sVar.Z) {
                sVar.i(sVar.f13330l0);
            }
        }
        this.R = this.Q;
    }
}
