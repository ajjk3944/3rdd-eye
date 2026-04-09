package bb;

import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.g0;
import com.google.android.exoplayer2.n1;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.dash.DashSegmentIndex;
import com.google.android.exoplayer2.source.dash.manifest.Representation;
import d5.y0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lf.t1;
import p.l2;
import pb.f0;
import pb.o0;
import pb.u0;
import qb.v;
import ya.a0;
import ya.r0;
import ya.s;
import ya.t;
import ya.t0;

/* loaded from: classes.dex */
public final class d implements t, t0, ab.i {
    public static final Pattern T = Pattern.compile("CC([1-4])=(.+)");
    public static final Pattern U = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    public final long B;
    public final o0 D;
    public final pb.b E;
    public final TrackGroupArray F;
    public final c[] G;
    public final ya.h H;
    public final r I;
    public final a0 K;
    public final ba.d L;
    public s M;
    public l2 P;
    public cb.c Q;
    public int R;
    public List S;

    /* renamed from: a, reason: collision with root package name */
    public final int f2511a;

    /* renamed from: d, reason: collision with root package name */
    public final b f2512d;

    /* renamed from: g, reason: collision with root package name */
    public final u0 f2513g;

    /* renamed from: r, reason: collision with root package name */
    public final ba.h f2514r;

    /* renamed from: x, reason: collision with root package name */
    public final f0 f2515x;

    /* renamed from: y, reason: collision with root package name */
    public final a f2516y;
    public ab.j[] N = new ab.j[0];
    public n[] O = new n[0];
    public final IdentityHashMap J = new IdentityHashMap();

    public d(int i10, cb.c cVar, a aVar, int i11, b bVar, u0 u0Var, ba.h hVar, ba.d dVar, f0 f0Var, a0 a0Var, long j, o0 o0Var, pb.b bVar2, ya.h hVar2, p pVar) throws NumberFormatException {
        int i12;
        int i13;
        List list;
        int[][] iArr;
        boolean[] zArr;
        Format[] formatArrJ;
        cb.e eVarA;
        this.f2511a = i10;
        this.Q = cVar;
        this.f2516y = aVar;
        this.R = i11;
        this.f2512d = bVar;
        this.f2513g = u0Var;
        this.f2514r = hVar;
        this.L = dVar;
        this.f2515x = f0Var;
        this.K = a0Var;
        this.B = j;
        this.D = o0Var;
        this.E = bVar2;
        this.H = hVar2;
        this.I = new r(cVar, pVar, bVar2);
        int i14 = 0;
        ab.j[] jVarArr = this.N;
        ((sm.m) hVar2).getClass();
        this.P = new l2(27, jVarArr);
        cb.g gVarC = cVar.c(i11);
        List list2 = gVarC.f3562d;
        this.S = list2;
        List list3 = gVarC.f3561c;
        int size = list3.size();
        SparseIntArray sparseIntArray = new SparseIntArray(size);
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i15 = 0; i15 < size; i15++) {
            sparseIntArray.put(((cb.a) list3.get(i15)).f3524a, i15);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i15));
            arrayList.add(arrayList2);
            sparseArray.put(i15, arrayList2);
        }
        for (int i16 = 0; i16 < size; i16++) {
            cb.a aVar2 = (cb.a) list3.get(i16);
            List list4 = aVar2.f3528e;
            List list5 = aVar2.f3529f;
            cb.e eVarA2 = a("http://dashif.org/guidelines/trickmode", list4);
            eVarA2 = eVarA2 == null ? a("http://dashif.org/guidelines/trickmode", list5) : eVarA2;
            int iMin = (eVarA2 == null || (iMin = sparseIntArray.get(Integer.parseInt(eVarA2.f3553b), -1)) == -1) ? i16 : iMin;
            if (iMin == i16 && (eVarA = a("urn:mpeg:dash:adaptation-set-switching:2016", list5)) != null) {
                String str = eVarA.f3553b;
                int i17 = v.f20828a;
                for (String str2 : str.split(",", -1)) {
                    int i18 = sparseIntArray.get(Integer.parseInt(str2), -1);
                    if (i18 != -1) {
                        iMin = Math.min(iMin, i18);
                    }
                }
            }
            if (iMin != i16) {
                List list6 = (List) sparseArray.get(i16);
                List list7 = (List) sparseArray.get(iMin);
                list7.addAll(list6);
                sparseArray.put(i16, list7);
                arrayList.remove(list6);
            }
        }
        int size2 = arrayList.size();
        int[][] iArr2 = new int[size2][];
        for (int i19 = 0; i19 < size2; i19++) {
            int[] iArrH = t1.H((Collection) arrayList.get(i19));
            iArr2[i19] = iArrH;
            Arrays.sort(iArrH);
        }
        boolean[] zArr2 = new boolean[size2];
        Format[][] formatArr = new Format[size2][];
        int i20 = 0;
        int i21 = 0;
        while (i20 < size2) {
            int[] iArr3 = iArr2[i20];
            int length = iArr3.length;
            int i22 = i14;
            while (true) {
                if (i22 >= length) {
                    break;
                }
                List list8 = ((cb.a) list3.get(iArr3[i22])).f3526c;
                for (int i23 = i14; i23 < list8.size(); i23++) {
                    if (!((Representation) list8.get(i23)).inbandEventStreams.isEmpty()) {
                        zArr2[i20] = true;
                        i21++;
                        break;
                    }
                }
                i22++;
                i14 = 0;
            }
            int[] iArr4 = iArr2[i20];
            int length2 = iArr4.length;
            int i24 = 0;
            while (true) {
                if (i24 >= length2) {
                    iArr = iArr2;
                    zArr = zArr2;
                    formatArrJ = new Format[0];
                    break;
                }
                int i25 = iArr4[i24];
                cb.a aVar3 = (cb.a) list3.get(i25);
                List list9 = ((cb.a) list3.get(i25)).f3527d;
                int[] iArr5 = iArr4;
                int i26 = 0;
                while (i26 < list9.size()) {
                    cb.e eVar = (cb.e) list9.get(i26);
                    iArr = iArr2;
                    zArr = zArr2;
                    if ("urn:scte:dash:cc:cea-608:2015".equals(eVar.f3552a)) {
                        g0 g0Var = new g0();
                        g0Var.k = "application/cea-608";
                        int i27 = aVar3.f3524a;
                        StringBuilder sb2 = new StringBuilder(18);
                        sb2.append(i27);
                        sb2.append(":cea608");
                        g0Var.f4142a = sb2.toString();
                        formatArrJ = j(eVar, T, new Format(g0Var));
                        break;
                    }
                    if ("urn:scte:dash:cc:cea-708:2015".equals(eVar.f3552a)) {
                        g0 g0Var2 = new g0();
                        g0Var2.k = "application/cea-708";
                        int i28 = aVar3.f3524a;
                        StringBuilder sb3 = new StringBuilder(18);
                        sb3.append(i28);
                        sb3.append(":cea708");
                        g0Var2.f4142a = sb3.toString();
                        formatArrJ = j(eVar, U, new Format(g0Var2));
                        break;
                    }
                    i26++;
                    iArr2 = iArr;
                    zArr2 = zArr;
                }
                i24++;
                iArr4 = iArr5;
            }
            formatArr[i20] = formatArrJ;
            if (formatArrJ.length != 0) {
                i21++;
            }
            i20++;
            iArr2 = iArr;
            zArr2 = zArr;
            i14 = 0;
        }
        int[][] iArr6 = iArr2;
        boolean[] zArr3 = zArr2;
        int size3 = list2.size() + i21 + size2;
        TrackGroup[] trackGroupArr = new TrackGroup[size3];
        c[] cVarArr = new c[size3];
        int i29 = 0;
        int i30 = 0;
        while (i29 < size2) {
            int[] iArr7 = iArr6[i29];
            ArrayList arrayList3 = new ArrayList();
            for (int i31 : iArr7) {
                arrayList3.addAll(((cb.a) list3.get(i31)).f3526c);
            }
            int size4 = arrayList3.size();
            Format[] formatArr2 = new Format[size4];
            int i32 = 0;
            while (i32 < size4) {
                int i33 = size2;
                Format format = ((Representation) arrayList3.get(i32)).format;
                int i34 = i29;
                Class clsB = hVar.b(format);
                g0 g0VarD = format.d();
                g0VarD.D = clsB;
                formatArr2[i32] = new Format(g0VarD);
                i32++;
                size2 = i33;
                i29 = i34;
            }
            int i35 = size2;
            int i36 = i29;
            cb.a aVar4 = (cb.a) list3.get(iArr7[0]);
            int i37 = i30 + 1;
            if (zArr3[i36]) {
                i12 = i30 + 2;
            } else {
                i12 = i37;
                i37 = -1;
            }
            if (formatArr[i36].length != 0) {
                i13 = i12 + 1;
            } else {
                i13 = i12;
                i12 = -1;
            }
            trackGroupArr[i30] = new TrackGroup(formatArr2);
            int i38 = i37;
            int i39 = i30;
            cVarArr[i39] = new c(aVar4.f3525b, 0, iArr7, i39, i38, i12, -1);
            int i40 = -1;
            if (i38 != -1) {
                g0 g0Var3 = new g0();
                int i41 = aVar4.f3524a;
                list = list3;
                StringBuilder sb4 = new StringBuilder(16);
                sb4.append(i41);
                sb4.append(":emsg");
                g0Var3.f4142a = sb4.toString();
                g0Var3.k = "application/x-emsg";
                trackGroupArr[i38] = new TrackGroup(new Format(g0Var3));
                cVarArr[i38] = new c(5, 1, iArr7, i39, -1, -1, -1);
                i40 = -1;
            } else {
                list = list3;
            }
            if (i12 != i40) {
                trackGroupArr[i12] = new TrackGroup(formatArr[i36]);
                cVarArr[i12] = new c(3, 1, iArr7, i39, -1, -1, -1);
            }
            i29 = i36 + 1;
            size2 = i35;
            i30 = i13;
            list3 = list;
        }
        int i42 = 0;
        while (i42 < list2.size()) {
            cb.f fVar = (cb.f) list2.get(i42);
            g0 g0Var4 = new g0();
            g0Var4.f4142a = fVar.a();
            g0Var4.k = "application/x-emsg";
            trackGroupArr[i30] = new TrackGroup(new Format(g0Var4));
            cVarArr[i30] = new c(5, 2, new int[0], -1, -1, -1, i42);
            i42++;
            i30++;
        }
        Pair pairCreate = Pair.create(new TrackGroupArray(trackGroupArr), cVarArr);
        this.F = (TrackGroupArray) pairCreate.first;
        this.G = (c[]) pairCreate.second;
    }

    public static cb.e a(String str, List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            cb.e eVar = (cb.e) list.get(i10);
            if (str.equals(eVar.f3552a)) {
                return eVar;
            }
        }
        return null;
    }

    public static Format[] j(cb.e eVar, Pattern pattern, Format format) throws NumberFormatException {
        String str = eVar.f3553b;
        if (str == null) {
            return new Format[]{format};
        }
        int i10 = v.f20828a;
        String[] strArrSplit = str.split(";", -1);
        Format[] formatArr = new Format[strArrSplit.length];
        for (int i11 = 0; i11 < strArrSplit.length; i11++) {
            Matcher matcher = pattern.matcher(strArrSplit[i11]);
            if (!matcher.matches()) {
                return new Format[]{format};
            }
            int i12 = Integer.parseInt(matcher.group(1));
            g0 g0VarD = format.d();
            String str2 = format.f4020a;
            StringBuilder sb2 = new StringBuilder(c7.a.d(12, str2));
            sb2.append(str2);
            sb2.append(":");
            sb2.append(i12);
            g0VarD.f4142a = sb2.toString();
            g0VarD.C = i12;
            g0VarD.f4144c = matcher.group(2);
            formatArr[i11] = new Format(g0VarD);
        }
        return formatArr;
    }

    @Override // ya.t0
    public final void c(ya.u0 u0Var) {
        this.M.c(this);
    }

    @Override // ya.u0
    public final long d() {
        return this.P.d();
    }

    @Override // ya.t
    public final void e() {
        this.D.a();
    }

    @Override // ya.t
    public final long f(long j) throws Throwable {
        ab.a aVar;
        boolean zY;
        for (ab.j jVar : this.N) {
            jVar.P = j;
            if (jVar.v()) {
                jVar.O = j;
            } else {
                for (int i10 = 0; i10 < jVar.G.size(); i10++) {
                    aVar = (ab.a) jVar.G.get(i10);
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
                    r0 r0Var = jVar.I;
                    int iE = aVar.e(0);
                    synchronized (r0Var) {
                        synchronized (r0Var) {
                            r0Var.f26170t = 0;
                            o5.t0 t0Var = r0Var.f26153a;
                            t0Var.f19061g = (y0) t0Var.f19060f;
                        }
                    }
                    int i11 = r0Var.f26168r;
                    if (iE < i11 || iE > r0Var.f26167q + i11) {
                        zY = false;
                    } else {
                        r0Var.f26171u = Long.MIN_VALUE;
                        r0Var.f26170t = iE - i11;
                        zY = true;
                    }
                } else {
                    zY = jVar.I.y(j, j < jVar.d());
                }
                if (zY) {
                    jVar.Q = jVar.y(jVar.I.n(), 0);
                    r0[] r0VarArr = jVar.J;
                    for (r0 r0Var2 : r0VarArr) {
                        r0Var2.y(j, true);
                    }
                } else {
                    jVar.O = j;
                    jVar.R = false;
                    jVar.G.clear();
                    jVar.Q = 0;
                    if (jVar.E.d()) {
                        jVar.I.h();
                        for (r0 r0Var3 : jVar.J) {
                            r0Var3.h();
                        }
                        jVar.E.b();
                    } else {
                        jVar.E.f20395g = null;
                        jVar.I.x(false);
                        for (r0 r0Var4 : jVar.J) {
                            r0Var4.x(false);
                        }
                    }
                }
            }
        }
        for (n nVar : this.O) {
            int iB = v.b(nVar.f2554g, j, true);
            nVar.B = iB;
            nVar.D = (nVar.f2555r && iB == nVar.f2554g.length) ? j : -9223372036854775807L;
        }
        return j;
    }

    @Override // ya.t
    public final void g(long j) throws Throwable {
        long j7;
        for (ab.j jVar : this.N) {
            if (!jVar.v()) {
                r0 r0Var = jVar.I;
                int i10 = r0Var.f26168r;
                r0Var.g(j, true);
                r0 r0Var2 = jVar.I;
                int i11 = r0Var2.f26168r;
                if (i11 > i10) {
                    synchronized (r0Var2) {
                        j7 = r0Var2.f26167q == 0 ? Long.MIN_VALUE : r0Var2.f26165o[r0Var2.f26169s];
                    }
                    int i12 = 0;
                    while (true) {
                        r0[] r0VarArr = jVar.J;
                        if (i12 >= r0VarArr.length) {
                            break;
                        }
                        r0VarArr[i12].g(j7, jVar.f318r[i12]);
                        i12++;
                    }
                }
                int iMin = Math.min(jVar.y(i11, 0), jVar.Q);
                if (iMin > 0) {
                    v.G(jVar.G, 0, iMin);
                    jVar.Q -= iMin;
                }
            }
        }
    }

    public final int h(int[] iArr, int i10) {
        int i11 = iArr[i10];
        if (i11 != -1) {
            c[] cVarArr = this.G;
            int i12 = cVarArr[i11].f2508e;
            for (int i13 = 0; i13 < iArr.length; i13++) {
                int i14 = iArr[i13];
                if (i14 == i12 && cVarArr[i14].f2506c == 0) {
                    return i13;
                }
            }
        }
        return -1;
    }

    @Override // ya.u0
    public final boolean i(long j) {
        return this.P.i(j);
    }

    @Override // ya.u0
    public final boolean isLoading() {
        return this.P.isLoading();
    }

    @Override // ya.t
    public final long k() {
        return -9223372036854775807L;
    }

    @Override // ya.t
    public final TrackGroupArray l() {
        return this.F;
    }

    @Override // ya.u0
    public final long m() {
        return this.P.m();
    }

    @Override // ya.u0
    public final void o(long j) {
        this.P.o(j);
    }

    @Override // ya.t
    public final long p(long j, n1 n1Var) {
        long j7 = j;
        ab.j[] jVarArr = this.N;
        int length = jVarArr.length;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                break;
            }
            ab.j jVar = jVarArr[i11];
            if (jVar.f315a == 2) {
                k[] kVarArr = (k[]) jVar.f319x.k;
                int length2 = kVarArr.length;
                while (i10 < length2) {
                    k kVar = kVarArr[i10];
                    DashSegmentIndex dashSegmentIndex = (DashSegmentIndex) kVar.f2538g;
                    DashSegmentIndex dashSegmentIndex2 = (DashSegmentIndex) kVar.f2538g;
                    long j10 = kVar.f2534c;
                    long j11 = kVar.f2533b;
                    if (dashSegmentIndex != null) {
                        long segmentNum = dashSegmentIndex.getSegmentNum(j7, j11) + j10;
                        long jE = kVar.e(segmentNum);
                        long segmentCount = dashSegmentIndex2.getSegmentCount(j11);
                        return n1Var.a(j7, jE, (jE >= j7 || (segmentCount != -1 && segmentNum >= ((dashSegmentIndex2.getFirstSegmentNum() + j10) + segmentCount) - 1)) ? jE : kVar.e(segmentNum + 1));
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x024b  */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [int] */
    @Override // ya.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long s(ob.f[] r35, boolean[] r36, ya.s0[] r37, boolean[] r38, long r39) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 677
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bb.d.s(ob.f[], boolean[], ya.s0[], boolean[], long):long");
    }

    @Override // ya.t
    public final void u(s sVar, long j) {
        this.M = sVar;
        sVar.b(this);
    }
}
