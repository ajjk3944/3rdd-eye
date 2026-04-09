package l6;

import a5.b0;
import a5.d0;
import a5.v;
import android.util.SparseArray;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.k0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import u5.a0;

/* loaded from: classes.dex */
public final class h implements u5.k {
    public static final byte[] H = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final androidx.media3.common.r I;
    public int A;
    public int B;
    public boolean C;
    public u5.m D;
    public a0[] E;
    public a0[] F;
    public boolean G;

    /* renamed from: a, reason: collision with root package name */
    public final int f14798a;

    /* renamed from: b, reason: collision with root package name */
    public final List f14799b;

    /* renamed from: c, reason: collision with root package name */
    public final SparseArray f14800c;

    /* renamed from: d, reason: collision with root package name */
    public final v f14801d;

    /* renamed from: e, reason: collision with root package name */
    public final v f14802e;

    /* renamed from: f, reason: collision with root package name */
    public final v f14803f;

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f14804g;

    /* renamed from: h, reason: collision with root package name */
    public final v f14805h;

    /* renamed from: i, reason: collision with root package name */
    public final b0 f14806i;
    public final bm.e j;
    public final v k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayDeque f14807l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayDeque f14808m;

    /* renamed from: n, reason: collision with root package name */
    public final a0 f14809n;

    /* renamed from: o, reason: collision with root package name */
    public int f14810o;

    /* renamed from: p, reason: collision with root package name */
    public int f14811p;

    /* renamed from: q, reason: collision with root package name */
    public long f14812q;

    /* renamed from: r, reason: collision with root package name */
    public int f14813r;

    /* renamed from: s, reason: collision with root package name */
    public v f14814s;

    /* renamed from: t, reason: collision with root package name */
    public long f14815t;

    /* renamed from: u, reason: collision with root package name */
    public int f14816u;

    /* renamed from: v, reason: collision with root package name */
    public long f14817v;

    /* renamed from: w, reason: collision with root package name */
    public long f14818w;

    /* renamed from: x, reason: collision with root package name */
    public long f14819x;

    /* renamed from: y, reason: collision with root package name */
    public g f14820y;

    /* renamed from: z, reason: collision with root package name */
    public int f14821z;

    static {
        androidx.media3.common.q qVar = new androidx.media3.common.q();
        qVar.k = "application/x-emsg";
        I = new androidx.media3.common.r(qVar);
    }

    public h(int i10) {
        this(0, null, Collections.EMPTY_LIST, null);
    }

    public static DrmInitData a(List list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = (b) list.get(i10);
            if (bVar.f3295d == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = bVar.f14779g.f165a;
                ja.m mVarB = n.b(bArr);
                UUID uuid = mVarB == null ? null : mVarB.f13509a;
                if (uuid == null) {
                    a5.a.B("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new DrmInitData.SchemeData(uuid, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new DrmInitData(null, false, (DrmInitData.SchemeData[]) arrayList.toArray(new DrmInitData.SchemeData[0]));
    }

    public static void b(v vVar, int i10, q qVar) throws k0 {
        vVar.E(i10 + 8);
        int iG = vVar.g();
        if ((iG & 1) != 0) {
            throw k0.c("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z10 = (iG & 2) != 0;
        int iW = vVar.w();
        if (iW == 0) {
            Arrays.fill(qVar.f14879l, 0, qVar.f14874e, false);
            return;
        }
        int i11 = qVar.f14874e;
        v vVar2 = qVar.f14881n;
        if (iW != i11) {
            StringBuilder sbU = h0.b.u("Senc sample count ", iW, " is different from fragment sample count");
            sbU.append(qVar.f14874e);
            throw k0.a(null, sbU.toString());
        }
        Arrays.fill(qVar.f14879l, 0, iW, z10);
        vVar2.B(vVar.a());
        qVar.k = true;
        qVar.f14882o = true;
        vVar.e(vVar2.f165a, 0, vVar2.f167c);
        vVar2.E(0);
        qVar.f14882o = false;
    }

    @Override // u5.k
    public final void c(long j, long j7) {
        SparseArray sparseArray = this.f14800c;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((g) sparseArray.valueAt(i10)).d();
        }
        this.f14808m.clear();
        this.f14816u = 0;
        this.f14817v = j7;
        this.f14807l.clear();
        this.f14810o = 0;
        this.f14813r = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:328:0x074d, code lost:
    
        r51.f14810o = 0;
        r51.f14813r = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x0752, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(long r52) throws androidx.media3.common.k0 {
        /*
            Method dump skipped, instructions count: 1875
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.h.d(long):void");
    }

    @Override // u5.k
    public final void f(u5.m mVar) {
        int i10;
        this.D = mVar;
        int i11 = 0;
        this.f14810o = 0;
        this.f14813r = 0;
        a0[] a0VarArr = new a0[2];
        this.E = a0VarArr;
        a0 a0Var = this.f14809n;
        if (a0Var != null) {
            a0VarArr[0] = a0Var;
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i12 = 100;
        if ((this.f14798a & 4) != 0) {
            a0VarArr[i10] = mVar.mo36n(100, 5);
            i12 = 101;
            i10++;
        }
        a0[] a0VarArr2 = (a0[]) d0.I(i10, this.E);
        this.E = a0VarArr2;
        for (a0 a0Var2 : a0VarArr2) {
            a0Var2.c(I);
        }
        List list = this.f14799b;
        this.F = new a0[list.size()];
        while (i11 < this.F.length) {
            a0 a0VarMo36n = this.D.mo36n(i12, 3);
            a0VarMo36n.c((androidx.media3.common.r) list.get(i11));
            this.F[i11] = a0VarMo36n;
            i11++;
            i12++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01fc, code lost:
    
        if ("video/hevc".equals(r5) == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0206, code lost:
    
        if (((r19 & 126) >> 1) != 39) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0208, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x020a, code lost:
    
        r35 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x020d, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x020e, code lost:
    
        r33.C = r5;
        r33.A += 5;
        r33.f14821z += r35;
        r4 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x021e, code lost:
    
        r12 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0229, code lost:
    
        throw androidx.media3.common.k0.a(null, "Invalid NAL length");
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x022a, code lost:
    
        r35 = r4;
        r30 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0231, code lost:
    
        if (r33.C == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0233, code lost:
    
        r12 = r33.f14803f;
        r12.B(r5);
        r19 = r8;
        r22 = r9;
        ((u5.h) r34).b(r12.f165a, 0, r33.B, false);
        r7.d(r33.B, r12);
        r4 = r33.B;
        r5 = u5.b.u(r12.f167c, r12.f165a);
        r12.E("video/hevc".equals(r6.H) ? 1 : 0);
        r12.D(r5);
        u5.b.e(r13, r12, r33.F);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0268, code lost:
    
        r19 = r8;
        r22 = r9;
        r4 = r7.b(r34, r5, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0271, code lost:
    
        r33.A += r4;
        r33.B -= r4;
        r4 = r35;
        r8 = r19;
        r9 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0282, code lost:
    
        r30 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0285, code lost:
    
        r30 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0287, code lost:
    
        r4 = r33.A;
        r5 = r33.f14821z;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x028b, code lost:
    
        if (r4 >= r5) goto L433;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x028d, code lost:
    
        r33.A += r7.b(r34, r5 - r4, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x029b, code lost:
    
        if (r2.f14797l != false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x029d, code lost:
    
        r11 = r2.f14791d.f14891g[r2.f14793f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x02ac, code lost:
    
        if (r3.j[r2.f14793f] == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x02ae, code lost:
    
        r11 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02b0, code lost:
    
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02b5, code lost:
    
        if (r2.a() == null) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02b7, code lost:
    
        r11 = r11 | 1073741824;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02ba, code lost:
    
        r25 = r11;
        r1 = r2.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02c0, code lost:
    
        if (r1 == null) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02c2, code lost:
    
        r28 = r1.f14867c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02c7, code lost:
    
        r28 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02c9, code lost:
    
        r23 = r13;
        r7.a(r23, r25, r33.f14821z, 0, r28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02da, code lost:
    
        if (r30.isEmpty() != false) goto L429;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02dc, code lost:
    
        r1 = (l6.f) r30.removeFirst();
        r33.f14816u -= r1.f14787c;
        r3 = r1.f14785a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02ed, code lost:
    
        if (r1.f14786b == false) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02ef, code lost:
    
        r3 = r3 + r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02f1, code lost:
    
        if (r15 == null) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02f3, code lost:
    
        r3 = r15.a(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02f7, code lost:
    
        r6 = r3;
        r3 = r33.E;
        r4 = r3.length;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02fc, code lost:
    
        if (r12 >= r4) goto L432;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02fe, code lost:
    
        r3[r12].a(r6, 1, r1.f14787c, r33.f14816u, null);
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0310, code lost:
    
        if (r2.b() != false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0312, code lost:
    
        r33.f14820y = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0315, code lost:
    
        r33.f14810o = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x031a, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ca, code lost:
    
        r3 = r2.f14789b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d0, code lost:
    
        if (r33.f14810o != 3) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d4, code lost:
    
        if (r2.f14797l != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d6, code lost:
    
        r4 = r2.f14791d.f14888d[r2.f14793f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00df, code lost:
    
        r4 = r3.f14877h[r2.f14793f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e5, code lost:
    
        r33.f14821z = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00eb, code lost:
    
        if (r2.f14793f >= r2.f14796i) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ed, code lost:
    
        ((u5.h) r34).m(r4);
        r1 = r2.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f6, code lost:
    
        if (r1 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f9, code lost:
    
        r4 = r3.f14881n;
        r1 = r1.f14868d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00fd, code lost:
    
        if (r1 == 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ff, code lost:
    
        r4.F(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0102, code lost:
    
        r1 = r2.f14793f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0106, code lost:
    
        if (r3.k == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x010c, code lost:
    
        if (r3.f14879l[r1] == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x010e, code lost:
    
        r4.F(r4.y() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x011a, code lost:
    
        if (r2.b() != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x011c, code lost:
    
        r33.f14820y = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x011e, code lost:
    
        r33.f14810o = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0121, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0129, code lost:
    
        if (r2.f14791d.f14885a.f14862g != 1) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x012b, code lost:
    
        r33.f14821z = r4 - 8;
        ((u5.h) r34).m(r19);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0145, code lost:
    
        if ("audio/ac4".equals(r2.f14791d.f14885a.f14861f.H) == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0147, code lost:
    
        r33.A = r2.c(r33.f14821z, 7);
        r4 = r33.f14821z;
        r7 = r33.f14805h;
        u5.b.i(r4, r7);
        r2.f14788a.d(7, r7);
        r33.A += 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0162, code lost:
    
        r33.A = r2.c(r33.f14821z, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x016a, code lost:
    
        r33.f14821z += r33.A;
        r33.f14810o = 4;
        r33.B = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0176, code lost:
    
        r4 = r2.f14791d;
        r6 = r4.f14885a;
        r7 = r2.f14788a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x017e, code lost:
    
        if (r2.f14797l != false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0180, code lost:
    
        r13 = r4.f14890f[r2.f14793f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0187, code lost:
    
        r13 = r3.f14878i[r2.f14793f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x018d, code lost:
    
        if (r15 == null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x018f, code lost:
    
        r13 = r15.a(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0193, code lost:
    
        r4 = r6.j;
        r6 = r6.f14861f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0197, code lost:
    
        if (r4 == 0) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0199, code lost:
    
        r9 = r33.f14802e;
        r11 = r9.f165a;
        r11[0] = 0;
        r11[1] = 0;
        r11[r35] = 0;
        r8 = r4 + 1;
        r4 = 4 - r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01af, code lost:
    
        if (r33.A >= r33.f14821z) goto L425;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01b1, code lost:
    
        r5 = r33.B;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01b5, code lost:
    
        if (r5 != 0) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01b7, code lost:
    
        r30 = r12;
        ((u5.h) r34).b(r11, r4, r8, false);
        r9.E(0);
        r5 = r9.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01c8, code lost:
    
        if (r5 < 1) goto L426;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01ca, code lost:
    
        r33.B = r5 - 1;
        r5 = r33.f14801d;
        r5.E(0);
        r7.d(4, r5);
        r7.d(1, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01df, code lost:
    
        if (r33.F.length <= 0) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01e1, code lost:
    
        r5 = r6.H;
        r19 = r11[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01eb, code lost:
    
        if ("video/avc".equals(r5) == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01ed, code lost:
    
        r35 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01f2, code lost:
    
        if ((r19 & 31) == 6) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01f5, code lost:
    
        r35 = r4;
     */
    @Override // u5.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(u5.l r34, ca.n r35) throws androidx.media3.common.k0, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 1954
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.h.g(u5.l, ca.n):int");
    }

    @Override // u5.k
    public final boolean h(u5.l lVar) {
        return n.c(lVar, true, false);
    }

    public h(int i10, b0 b0Var, List list, g5.n nVar) {
        this.f14798a = i10;
        this.f14806i = b0Var;
        this.f14799b = Collections.unmodifiableList(list);
        this.f14809n = nVar;
        this.j = new bm.e(8);
        this.k = new v(16);
        this.f14801d = new v(u5.b.f23265t);
        this.f14802e = new v(5);
        this.f14803f = new v();
        byte[] bArr = new byte[16];
        this.f14804g = bArr;
        this.f14805h = new v(bArr);
        this.f14807l = new ArrayDeque();
        this.f14808m = new ArrayDeque();
        this.f14800c = new SparseArray();
        this.f14818w = -9223372036854775807L;
        this.f14817v = -9223372036854775807L;
        this.f14819x = -9223372036854775807L;
        this.D = u5.m.A;
        this.E = new a0[0];
        this.F = new a0[0];
    }

    @Override // u5.k
    public final void release() {
    }
}
