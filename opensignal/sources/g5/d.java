package g5;

import a5.d0;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import androidx.media3.common.b1;
import androidx.media3.common.q;
import androidx.media3.exoplayer.dash.DashSegmentIndex;
import b5.b0;
import bb.r;
import d5.x0;
import e5.o0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lf.t1;
import o5.e0;
import o5.h1;
import o5.t0;
import o5.w;
import o5.w0;
import o5.x;
import o5.y0;
import o5.z0;
import r5.o;

/* loaded from: classes.dex */
public final class d implements x, y0, p5.h {
    public static final Pattern T = Pattern.compile("CC([1-4])=(.+)");
    public static final Pattern U = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    public final long B;
    public final o D;
    public final r5.b E;
    public final h1 F;
    public final c[] G;
    public final o5.k H;
    public final r I;
    public final e0 K;
    public final i5.f L;
    public w M;
    public o2.g P;
    public h5.c Q;
    public int R;
    public List S;

    /* renamed from: a, reason: collision with root package name */
    public final int f9344a;

    /* renamed from: d, reason: collision with root package name */
    public final b f9345d;

    /* renamed from: g, reason: collision with root package name */
    public final b0 f9346g;

    /* renamed from: r, reason: collision with root package name */
    public final i5.j f9347r;

    /* renamed from: x, reason: collision with root package name */
    public final r5.h f9348x;

    /* renamed from: y, reason: collision with root package name */
    public final a f9349y;
    public p5.i[] N = new p5.i[0];
    public k[] O = new k[0];
    public final IdentityHashMap J = new IdentityHashMap();

    public d(int i10, h5.c cVar, a aVar, int i11, b bVar, b0 b0Var, i5.j jVar, i5.f fVar, r5.h hVar, e0 e0Var, long j, o oVar, r5.b bVar2, o5.k kVar, m mVar, o0 o0Var) throws NumberFormatException {
        int i12;
        int i13;
        int[][] iArr;
        boolean[] zArr;
        androidx.media3.common.r[] rVarArrC;
        h5.e eVarA;
        this.f9344a = i10;
        this.Q = cVar;
        this.f9349y = aVar;
        this.R = i11;
        this.f9345d = bVar;
        this.f9346g = b0Var;
        this.f9347r = jVar;
        this.L = fVar;
        this.f9348x = hVar;
        this.K = e0Var;
        this.B = j;
        this.D = oVar;
        this.E = bVar2;
        this.H = kVar;
        this.I = new r(cVar, mVar, bVar2);
        int i14 = 0;
        p5.i[] iVarArr = this.N;
        ((et.d) kVar).getClass();
        boolean z10 = true;
        this.P = new o2.g((int) (true ? 1 : 0), (Object) iVarArr);
        h5.g gVarB = cVar.b(i11);
        List list = gVarB.f9935d;
        this.S = list;
        List list2 = gVarB.f9934c;
        int size = list2.size();
        SparseIntArray sparseIntArray = new SparseIntArray(size);
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i15 = 0; i15 < size; i15++) {
            sparseIntArray.put(((h5.a) list2.get(i15)).f9898a, i15);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i15));
            arrayList.add(arrayList2);
            sparseArray.put(i15, arrayList2);
        }
        int i16 = 0;
        while (i16 < size) {
            h5.a aVar2 = (h5.a) list2.get(i16);
            List list3 = aVar2.f9902e;
            List list4 = aVar2.f9903f;
            h5.e eVarA2 = a("http://dashif.org/guidelines/trickmode", list3);
            eVarA2 = eVarA2 == null ? a("http://dashif.org/guidelines/trickmode", list4) : eVarA2;
            int iMin = (eVarA2 == null || (iMin = sparseIntArray.get(Integer.parseInt(eVarA2.f9926b), -1)) == -1) ? i16 : iMin;
            if (iMin == i16 && (eVarA = a("urn:mpeg:dash:adaptation-set-switching:2016", list4)) != null) {
                String str = eVarA.f9926b;
                int i17 = d0.f105a;
                String[] strArrSplit = str.split(",", -1);
                int length = strArrSplit.length;
                int i18 = 0;
                while (i18 < length) {
                    boolean z11 = z10;
                    int i19 = sparseIntArray.get(Integer.parseInt(strArrSplit[i18]), -1);
                    if (i19 != -1) {
                        iMin = Math.min(iMin, i19);
                    }
                    i18++;
                    z10 = z11;
                }
            }
            boolean z12 = z10;
            if (iMin != i16) {
                List list5 = (List) sparseArray.get(i16);
                List list6 = (List) sparseArray.get(iMin);
                list6.addAll(list5);
                sparseArray.put(i16, list6);
                arrayList.remove(list5);
            }
            i16++;
            z10 = z12;
        }
        boolean z13 = z10;
        int size2 = arrayList.size();
        int[][] iArr2 = new int[size2][];
        for (int i20 = 0; i20 < size2; i20++) {
            int[] iArrH = t1.H((Collection) arrayList.get(i20));
            iArr2[i20] = iArrH;
            Arrays.sort(iArrH);
        }
        boolean[] zArr2 = new boolean[size2];
        androidx.media3.common.r[][] rVarArr = new androidx.media3.common.r[size2][];
        int i21 = 0;
        int i22 = 0;
        while (i21 < size2) {
            int[] iArr3 = iArr2[i21];
            int length2 = iArr3.length;
            int i23 = i14;
            while (true) {
                if (i23 >= length2) {
                    break;
                }
                List list7 = ((h5.a) list2.get(iArr3[i23])).f9900c;
                for (int i24 = i14; i24 < list7.size(); i24++) {
                    if (!((h5.l) list7.get(i24)).f9950r.isEmpty()) {
                        zArr2[i21] = z13;
                        i22++;
                        break;
                    }
                }
                i23++;
                i14 = 0;
            }
            int[] iArr4 = iArr2[i21];
            int length3 = iArr4.length;
            int i25 = 0;
            while (true) {
                if (i25 >= length3) {
                    iArr = iArr2;
                    zArr = zArr2;
                    rVarArrC = new androidx.media3.common.r[0];
                    break;
                }
                int i26 = iArr4[i25];
                h5.a aVar3 = (h5.a) list2.get(i26);
                List list8 = ((h5.a) list2.get(i26)).f9901d;
                int[] iArr5 = iArr4;
                int i27 = 0;
                while (i27 < list8.size()) {
                    h5.e eVar = (h5.e) list8.get(i27);
                    iArr = iArr2;
                    zArr = zArr2;
                    if ("urn:scte:dash:cc:cea-608:2015".equals(eVar.f9925a)) {
                        q qVar = new q();
                        qVar.k = "application/cea-608";
                        qVar.f1734a = h0.b.i(aVar3.f9898a, ":cea608", new StringBuilder());
                        rVarArrC = c(eVar, T, new androidx.media3.common.r(qVar));
                        break;
                    }
                    if ("urn:scte:dash:cc:cea-708:2015".equals(eVar.f9925a)) {
                        q qVar2 = new q();
                        qVar2.k = "application/cea-708";
                        qVar2.f1734a = h0.b.i(aVar3.f9898a, ":cea708", new StringBuilder());
                        rVarArrC = c(eVar, U, new androidx.media3.common.r(qVar2));
                        break;
                    }
                    i27++;
                    zArr2 = zArr;
                    iArr2 = iArr;
                }
                i25++;
                iArr4 = iArr5;
            }
            rVarArr[i21] = rVarArrC;
            if (rVarArrC.length != 0) {
                i22++;
            }
            i21++;
            zArr2 = zArr;
            iArr2 = iArr;
            i14 = 0;
        }
        int[][] iArr6 = iArr2;
        boolean[] zArr3 = zArr2;
        int size3 = list.size() + i22 + size2;
        b1[] b1VarArr = new b1[size3];
        c[] cVarArr = new c[size3];
        int i28 = 0;
        int i29 = 0;
        while (i28 < size2) {
            int[] iArr7 = iArr6[i28];
            ArrayList arrayList3 = new ArrayList();
            for (int i30 : iArr7) {
                arrayList3.addAll(((h5.a) list2.get(i30)).f9900c);
            }
            int size4 = arrayList3.size();
            androidx.media3.common.r[] rVarArr2 = new androidx.media3.common.r[size4];
            int i31 = 0;
            while (i31 < size4) {
                int i32 = size2;
                androidx.media3.common.r rVar = ((h5.l) arrayList3.get(i31)).f9947a;
                androidx.media3.common.r[][] rVarArr3 = rVarArr;
                int iC = jVar.c(rVar);
                q qVarA = rVar.a();
                qVarA.F = iC;
                rVarArr2[i31] = new androidx.media3.common.r(qVarA);
                i31++;
                size2 = i32;
                rVarArr = rVarArr3;
            }
            int i33 = size2;
            androidx.media3.common.r[][] rVarArr4 = rVarArr;
            h5.a aVar4 = (h5.a) list2.get(iArr7[0]);
            int i34 = aVar4.f9898a;
            String string = i34 != -1 ? Integer.toString(i34) : h0.b.h(i28, "unset:");
            int i35 = i29 + 1;
            if (zArr3[i28]) {
                i12 = i29 + 2;
            } else {
                i12 = i35;
                i35 = -1;
            }
            if (rVarArr4[i28].length != 0) {
                i13 = i12 + 1;
            } else {
                i13 = i12;
                i12 = -1;
            }
            List list9 = list2;
            b1VarArr[i29] = new b1(string, rVarArr2);
            int i36 = i29;
            cVarArr[i36] = new c(aVar4.f9899b, 0, iArr7, i36, i35, i12, -1);
            int i37 = -1;
            if (i35 != -1) {
                String strF = w.g.f(string, ":emsg");
                q qVar3 = new q();
                qVar3.f1734a = strF;
                qVar3.k = "application/x-emsg";
                b1VarArr[i35] = new b1(strF, new androidx.media3.common.r(qVar3));
                cVarArr[i35] = new c(5, 1, iArr7, i36, -1, -1, -1);
                i37 = -1;
            }
            if (i12 != i37) {
                b1VarArr[i12] = new b1(w.g.f(string, ":cc"), rVarArr4[i28]);
                cVarArr[i12] = new c(3, 1, iArr7, i36, -1, -1, -1);
            }
            i28++;
            size2 = i33;
            list2 = list9;
            i29 = i13;
            rVarArr = rVarArr4;
        }
        int i38 = 0;
        while (i38 < list.size()) {
            h5.f fVar2 = (h5.f) list.get(i38);
            q qVar4 = new q();
            qVar4.f1734a = fVar2.a();
            qVar4.k = "application/x-emsg";
            b1VarArr[i29] = new b1(fVar2.a() + ":" + i38, new androidx.media3.common.r(qVar4));
            cVarArr[i29] = new c(5, 2, new int[0], -1, -1, -1, i38);
            i38++;
            i29++;
        }
        Pair pairCreate = Pair.create(new h1(b1VarArr), cVarArr);
        this.F = (h1) pairCreate.first;
        this.G = (c[]) pairCreate.second;
    }

    public static h5.e a(String str, List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            h5.e eVar = (h5.e) list.get(i10);
            if (str.equals(eVar.f9925a)) {
                return eVar;
            }
        }
        return null;
    }

    public static androidx.media3.common.r[] c(h5.e eVar, Pattern pattern, androidx.media3.common.r rVar) throws NumberFormatException {
        String str = eVar.f9926b;
        if (str == null) {
            return new androidx.media3.common.r[]{rVar};
        }
        int i10 = d0.f105a;
        String[] strArrSplit = str.split(";", -1);
        androidx.media3.common.r[] rVarArr = new androidx.media3.common.r[strArrSplit.length];
        for (int i11 = 0; i11 < strArrSplit.length; i11++) {
            Matcher matcher = pattern.matcher(strArrSplit[i11]);
            if (!matcher.matches()) {
                return new androidx.media3.common.r[]{rVar};
            }
            int i12 = Integer.parseInt(matcher.group(1));
            q qVarA = rVar.a();
            qVarA.f1734a = rVar.f1780a + ":" + i12;
            qVarA.C = i12;
            qVarA.f1736c = matcher.group(2);
            rVarArr[i11] = new androidx.media3.common.r(qVarA);
        }
        return rVarArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x024b  */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [int] */
    @Override // o5.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long C(androidx.media3.exoplayer.trackselection.v[] r35, boolean[] r36, o5.x0[] r37, boolean[] r38, long r39) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 676
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.d.C(androidx.media3.exoplayer.trackselection.v[], boolean[], o5.x0[], boolean[], long):long");
    }

    public final int b(int[] iArr, int i10) {
        int i11 = iArr[i10];
        if (i11 != -1) {
            c[] cVarArr = this.G;
            int i12 = cVarArr[i11].f9341e;
            for (int i13 = 0; i13 < iArr.length; i13++) {
                int i14 = iArr[i13];
                if (i14 == i12 && cVarArr[i14].f9339c == 0) {
                    return i13;
                }
            }
        }
        return -1;
    }

    @Override // o5.z0
    public final long d() {
        return this.P.d();
    }

    @Override // o5.x
    public final void e() {
        this.D.a();
    }

    @Override // o5.x
    public final long f(long j) throws Throwable {
        p5.a aVar;
        boolean zX;
        for (p5.i iVar : this.N) {
            iVar.P = j;
            if (iVar.w()) {
                iVar.O = j;
            } else {
                for (int i10 = 0; i10 < iVar.G.size(); i10++) {
                    aVar = (p5.a) iVar.G.get(i10);
                    long j7 = aVar.B;
                    if (j7 == j && aVar.G == -9223372036854775807L) {
                        break;
                    }
                    if (j7 > j) {
                        break;
                    }
                }
                aVar = null;
                if (aVar != null) {
                    w0 w0Var = iVar.I;
                    int iE = aVar.e(0);
                    synchronized (w0Var) {
                        synchronized (w0Var) {
                            w0Var.f19094s = 0;
                            t0 t0Var = w0Var.f19078a;
                            t0Var.f19061g = (io.sentry.android.replay.gestures.c) t0Var.f19060f;
                        }
                    }
                    int i11 = w0Var.f19092q;
                    if (iE < i11 || iE > w0Var.f19091p + i11) {
                        zX = false;
                    } else {
                        w0Var.f19095t = Long.MIN_VALUE;
                        w0Var.f19094s = iE - i11;
                        zX = true;
                    }
                } else {
                    zX = iVar.I.x(j, j < iVar.d());
                }
                if (zX) {
                    iVar.Q = iVar.y(iVar.I.m(), 0);
                    w0[] w0VarArr = iVar.J;
                    for (w0 w0Var2 : w0VarArr) {
                        w0Var2.x(j, true);
                    }
                } else {
                    iVar.O = j;
                    iVar.S = false;
                    iVar.G.clear();
                    iVar.Q = 0;
                    if (iVar.E.d()) {
                        iVar.I.g();
                        for (w0 w0Var3 : iVar.J) {
                            w0Var3.g();
                        }
                        iVar.E.b();
                    } else {
                        iVar.E.f21252g = null;
                        iVar.I.w(false);
                        for (w0 w0Var4 : iVar.J) {
                            w0Var4.w(false);
                        }
                    }
                }
            }
        }
        for (k kVar : this.O) {
            int iB = d0.b(kVar.f9363g, j, true);
            kVar.B = iB;
            kVar.D = (kVar.f9364r && iB == kVar.f9363g.length) ? j : -9223372036854775807L;
        }
        return j;
    }

    @Override // o5.x
    public final void g(long j) throws Throwable {
        long j7;
        for (p5.i iVar : this.N) {
            if (!iVar.w()) {
                w0 w0Var = iVar.I;
                int i10 = w0Var.f19092q;
                w0Var.f(j, true);
                w0 w0Var2 = iVar.I;
                int i11 = w0Var2.f19092q;
                if (i11 > i10) {
                    synchronized (w0Var2) {
                        j7 = w0Var2.f19091p == 0 ? Long.MIN_VALUE : w0Var2.f19089n[w0Var2.f19093r];
                    }
                    int i12 = 0;
                    while (true) {
                        w0[] w0VarArr = iVar.J;
                        if (i12 >= w0VarArr.length) {
                            break;
                        }
                        w0VarArr[i12].f(j7, iVar.f20278r[i12]);
                        i12++;
                    }
                }
                int iMin = Math.min(iVar.y(i11, 0), iVar.Q);
                if (iMin > 0) {
                    d0.L(iVar.G, 0, iMin);
                    iVar.Q -= iMin;
                }
            }
        }
    }

    @Override // o5.z0
    public final boolean i(long j) {
        return this.P.i(j);
    }

    @Override // o5.z0
    public final boolean isLoading() {
        return this.P.isLoading();
    }

    @Override // o5.x
    public final long k() {
        return -9223372036854775807L;
    }

    @Override // o5.x
    public final h1 l() {
        return this.F;
    }

    @Override // o5.z0
    public final long m() {
        return this.P.m();
    }

    @Override // o5.z0
    public final void o(long j) {
        this.P.o(j);
    }

    @Override // o5.x
    public final long p(long j, x0 x0Var) {
        long j7 = j;
        p5.i[] iVarArr = this.N;
        int length = iVarArr.length;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                break;
            }
            p5.i iVar = iVarArr[i11];
            if (iVar.f20275a == 2) {
                bb.k[] kVarArr = (bb.k[]) iVar.f20279x.k;
                int length2 = kVarArr.length;
                while (i10 < length2) {
                    bb.k kVar = kVarArr[i10];
                    DashSegmentIndex dashSegmentIndex = (DashSegmentIndex) kVar.f2538g;
                    long j10 = kVar.f2534c;
                    DashSegmentIndex dashSegmentIndex2 = (DashSegmentIndex) kVar.f2538g;
                    long j11 = kVar.f2533b;
                    if (dashSegmentIndex != null) {
                        long segmentCount = dashSegmentIndex.getSegmentCount(j11);
                        if (segmentCount != 0) {
                            long segmentNum = dashSegmentIndex2.getSegmentNum(j7, j11) + j10;
                            long jE = kVar.e(segmentNum);
                            return x0Var.a(j7, jE, (jE >= j7 || (segmentCount != -1 && segmentNum >= ((dashSegmentIndex2.getFirstSegmentNum() + j10) + segmentCount) - 1)) ? jE : kVar.e(segmentNum + 1));
                        }
                    }
                    i10++;
                    j7 = j;
                }
            } else {
                i11++;
                j7 = j;
            }
        }
        return j;
    }

    @Override // o5.y0
    public final void r(z0 z0Var) {
        this.M.r(this);
    }

    @Override // o5.x
    public final void t(w wVar, long j) {
        this.M = wVar;
        wVar.j(this);
    }
}
