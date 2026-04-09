package ja;

import android.util.SparseArray;
import ca.x;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.g0;
import com.google.android.exoplayer2.y0;
import io.sentry.android.core.e0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import qb.u;
import qb.v;

/* loaded from: classes.dex */
public final class i implements ca.k {
    public static final byte[] H = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final Format I;
    public int A;
    public int B;
    public boolean C;
    public boolean G;

    /* renamed from: a, reason: collision with root package name */
    public final int f13460a;

    /* renamed from: b, reason: collision with root package name */
    public final List f13461b;

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f13466g;

    /* renamed from: h, reason: collision with root package name */
    public final fb.f f13467h;

    /* renamed from: i, reason: collision with root package name */
    public final u f13468i;

    /* renamed from: n, reason: collision with root package name */
    public final x f13471n;

    /* renamed from: o, reason: collision with root package name */
    public int f13472o;

    /* renamed from: p, reason: collision with root package name */
    public int f13473p;

    /* renamed from: q, reason: collision with root package name */
    public long f13474q;

    /* renamed from: r, reason: collision with root package name */
    public int f13475r;

    /* renamed from: s, reason: collision with root package name */
    public fb.f f13476s;

    /* renamed from: t, reason: collision with root package name */
    public long f13477t;

    /* renamed from: u, reason: collision with root package name */
    public int f13478u;

    /* renamed from: y, reason: collision with root package name */
    public h f13482y;

    /* renamed from: z, reason: collision with root package name */
    public int f13483z;
    public final om.f j = new om.f(9);
    public final fb.f k = new fb.f(16);

    /* renamed from: d, reason: collision with root package name */
    public final fb.f f13463d = new fb.f(qb.b.f20760c);

    /* renamed from: e, reason: collision with root package name */
    public final fb.f f13464e = new fb.f(5);

    /* renamed from: f, reason: collision with root package name */
    public final fb.f f13465f = new fb.f();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayDeque f13469l = new ArrayDeque();

    /* renamed from: m, reason: collision with root package name */
    public final ArrayDeque f13470m = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public final SparseArray f13462c = new SparseArray();

    /* renamed from: w, reason: collision with root package name */
    public long f13480w = -9223372036854775807L;

    /* renamed from: v, reason: collision with root package name */
    public long f13479v = -9223372036854775807L;

    /* renamed from: x, reason: collision with root package name */
    public long f13481x = -9223372036854775807L;
    public ca.m D = ca.m.f3484e;
    public x[] E = new x[0];
    public x[] F = new x[0];

    static {
        g0 g0Var = new g0();
        g0Var.k = "application/x-emsg";
        I = new Format(g0Var);
    }

    public i(int i10, u uVar, List list, bb.q qVar) {
        this.f13460a = i10;
        this.f13468i = uVar;
        this.f13461b = Collections.unmodifiableList(list);
        this.f13471n = qVar;
        byte[] bArr = new byte[16];
        this.f13466g = bArr;
        this.f13467h = new fb.f(bArr);
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
                byte[] bArr = bVar.f13433g.f8800a;
                m mVarB = p.b(bArr);
                UUID uuid = mVarB == null ? null : mVarB.f13509a;
                if (uuid == null) {
                    e0.p("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
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

    public static void b(fb.f fVar, int i10, s sVar) throws y0 {
        fVar.y(i10 + 8);
        int iD = fVar.d();
        if ((iD & 1) != 0) {
            throw y0.c("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z10 = (iD & 2) != 0;
        int iR = fVar.r();
        if (iR == 0) {
            Arrays.fill(sVar.f13542m, 0, sVar.f13536e, false);
            return;
        }
        int i11 = sVar.f13536e;
        fb.f fVar2 = sVar.f13544o;
        if (iR != i11) {
            StringBuilder sb2 = new StringBuilder(80);
            sb2.append("Senc sample count ");
            sb2.append(iR);
            sb2.append(" is different from fragment sample count");
            sb2.append(i11);
            throw y0.a(null, sb2.toString());
        }
        Arrays.fill(sVar.f13542m, 0, iR, z10);
        fVar2.v(fVar.a());
        sVar.f13541l = true;
        sVar.f13545p = true;
        fVar.c(fVar2.f8800a, 0, fVar2.f8802c);
        fVar2.y(0);
        sVar.f13545p = false;
    }

    @Override // ca.k
    public final void c(long j, long j7) {
        SparseArray sparseArray = this.f13462c;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((h) sparseArray.valueAt(i10)).d();
        }
        this.f13470m.clear();
        this.f13478u = 0;
        this.f13479v = j7;
        this.f13469l.clear();
        this.f13472o = 0;
        this.f13475r = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:322:0x076a, code lost:
    
        r51.f13472o = 0;
        r51.f13475r = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x076f, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:251:0x05d1  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x067a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(long r52) throws com.google.android.exoplayer2.y0 {
        /*
            Method dump skipped, instructions count: 1904
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ja.i.d(long):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0202, code lost:
    
        if ("video/hevc".equals(r5) == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x020c, code lost:
    
        if (((r19 & 126) >> 1) != 39) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x020e, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0210, code lost:
    
        r33 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0213, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0214, code lost:
    
        r31.C = r5;
        r31.A += 5;
        r31.f13483z += r33;
        r4 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0224, code lost:
    
        r12 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x022f, code lost:
    
        throw com.google.android.exoplayer2.y0.a(null, "Invalid NAL length");
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0230, code lost:
    
        r33 = r4;
        r30 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0237, code lost:
    
        if (r31.C == false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0239, code lost:
    
        r12 = r31.f13465f;
        r12.v(r5);
        r19 = r8;
        r22 = r9;
        ((ca.h) r32).b(r12.f8800a, 0, r31.B, false);
        r7.a(r31.B, r12);
        r4 = r31.B;
        r5 = qb.b.I(r12.f8802c, r12.f8800a);
        r12.y("video/hevc".equals(r6.H) ? 1 : 0);
        r12.x(r5);
        com.google.android.gms.internal.measurement.e5.o(r13, r12, r31.F);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x026e, code lost:
    
        r19 = r8;
        r22 = r9;
        r4 = r7.c(r32, r5, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0277, code lost:
    
        r31.A += r4;
        r31.B -= r4;
        r4 = r33;
        r8 = r19;
        r9 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0288, code lost:
    
        r30 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x028b, code lost:
    
        r30 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x028d, code lost:
    
        r4 = r31.A;
        r5 = r31.f13483z;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0291, code lost:
    
        if (r4 >= r5) goto L432;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0293, code lost:
    
        r31.A += r7.c(r32, r5 - r4, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x02a1, code lost:
    
        if (r2.f13459l != false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x02a3, code lost:
    
        r11 = r2.f13453d.f13554g[r2.f13455f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x02b2, code lost:
    
        if (r3.k[r2.f13455f] == false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x02b4, code lost:
    
        r11 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x02b6, code lost:
    
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02bb, code lost:
    
        if (r2.a() == null) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02bd, code lost:
    
        r11 = r11 | 1073741824;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02c0, code lost:
    
        r25 = r11;
        r1 = r2.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02c6, code lost:
    
        if (r1 == null) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02c8, code lost:
    
        r28 = r1.f13529c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02cd, code lost:
    
        r28 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02cf, code lost:
    
        r23 = r13;
        r7.d(r23, r25, r31.f13483z, 0, r28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02e0, code lost:
    
        if (r30.isEmpty() != false) goto L428;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02e2, code lost:
    
        r1 = (ja.g) r30.removeFirst();
        r31.f13478u -= r1.f13449b;
        r13 = r23 + r1.f13448a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02f3, code lost:
    
        if (r15 == null) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02f5, code lost:
    
        r13 = r15.a(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02f9, code lost:
    
        r4 = r13;
        r10 = r31.E;
        r11 = r10.length;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02fe, code lost:
    
        if (r12 >= r11) goto L431;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0300, code lost:
    
        r10[r12].d(r4, 1, r1.f13449b, r31.f13478u, null);
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0312, code lost:
    
        if (r2.b() != false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0314, code lost:
    
        r31.f13482y = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0317, code lost:
    
        r31.f13472o = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x031c, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ca, code lost:
    
        r3 = r2.f13451b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d0, code lost:
    
        if (r31.f13472o != 3) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d4, code lost:
    
        if (r2.f13459l != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d6, code lost:
    
        r4 = r2.f13453d.f13551d[r2.f13455f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00df, code lost:
    
        r4 = r3.f13539h[r2.f13455f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e5, code lost:
    
        r31.f13483z = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00eb, code lost:
    
        if (r2.f13455f >= r2.f13458i) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ed, code lost:
    
        ((ca.h) r32).m(r4);
        r1 = r2.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f6, code lost:
    
        if (r1 != null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f9, code lost:
    
        r4 = r3.f13544o;
        r1 = r1.f13530d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00fd, code lost:
    
        if (r1 == 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ff, code lost:
    
        r4.z(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0102, code lost:
    
        r1 = r2.f13455f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0106, code lost:
    
        if (r3.f13541l == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x010c, code lost:
    
        if (r3.f13542m[r1] == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x010e, code lost:
    
        r4.z(r4.t() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x011a, code lost:
    
        if (r2.b() != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x011c, code lost:
    
        r31.f13482y = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x011e, code lost:
    
        r31.f13472o = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0121, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0129, code lost:
    
        if (r2.f13453d.f13548a.f13524g != 1) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x012b, code lost:
    
        r31.f13483z = r4 - 8;
        ((ca.h) r32).m(r19);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0145, code lost:
    
        if ("audio/ac4".equals(r2.f13453d.f13548a.f13523f.H) == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0147, code lost:
    
        r31.A = r2.c(r31.f13483z, 7);
        r4 = r31.f13483z;
        r7 = r31.f13467h;
        y9.a.c(r4, r7);
        r2.f13450a.a(7, r7);
        r31.A += 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0162, code lost:
    
        r31.A = r2.c(r31.f13483z, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x016a, code lost:
    
        r31.f13483z += r31.A;
        r31.f13472o = 4;
        r31.B = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0176, code lost:
    
        r4 = r2.f13453d;
        r6 = r4.f13548a;
        r7 = r2.f13450a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x017e, code lost:
    
        if (r2.f13459l != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0180, code lost:
    
        r13 = r4.f13553f[r2.f13455f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0187, code lost:
    
        r13 = r3.j[r2.f13455f] + r3.f13540i[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0193, code lost:
    
        if (r15 == null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0195, code lost:
    
        r13 = r15.a(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0199, code lost:
    
        r4 = r6.j;
        r6 = r6.f13523f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x019d, code lost:
    
        if (r4 == 0) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x019f, code lost:
    
        r8 = r31.f13464e;
        r9 = r8.f8800a;
        r9[0] = 0;
        r9[1] = 0;
        r9[r33] = 0;
        r11 = r4 + 1;
        r4 = 4 - r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01b5, code lost:
    
        if (r31.A >= r31.f13483z) goto L424;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01b7, code lost:
    
        r5 = r31.B;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01bb, code lost:
    
        if (r5 != 0) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01bd, code lost:
    
        r30 = r12;
        ((ca.h) r32).b(r9, r4, r11, false);
        r8.y(0);
        r5 = r8.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01ce, code lost:
    
        if (r5 < 1) goto L425;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01d0, code lost:
    
        r31.B = r5 - 1;
        r5 = r31.f13463d;
        r5.y(0);
        r7.a(4, r5);
        r7.a(1, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01e5, code lost:
    
        if (r31.F.length <= 0) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01e7, code lost:
    
        r5 = r6.H;
        r19 = r9[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01f1, code lost:
    
        if ("video/avc".equals(r5) == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01f3, code lost:
    
        r33 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01f8, code lost:
    
        if ((r19 & 31) == 6) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01fb, code lost:
    
        r33 = r4;
     */
    @Override // ca.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f(ca.l r32, ca.n r33) throws com.google.android.exoplayer2.y0, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 1903
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ja.i.f(ca.l, ca.n):int");
    }

    @Override // ca.k
    public final boolean g(ca.l lVar) {
        return p.c(lVar, true, false);
    }

    @Override // ca.k
    public final void h(ca.m mVar) {
        int i10;
        this.D = mVar;
        int i11 = 0;
        this.f13472o = 0;
        this.f13475r = 0;
        x[] xVarArr = new x[2];
        this.E = xVarArr;
        x xVar = this.f13471n;
        if (xVar != null) {
            xVarArr[0] = xVar;
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i12 = 100;
        if ((this.f13460a & 4) != 0) {
            xVarArr[i10] = mVar.n(100, 5);
            i12 = 101;
            i10++;
        }
        x[] xVarArr2 = (x[]) v.D(i10, this.E);
        this.E = xVarArr2;
        for (x xVar2 : xVarArr2) {
            xVar2.e(I);
        }
        List list = this.f13461b;
        this.F = new x[list.size()];
        while (i11 < this.F.length) {
            x xVarN = this.D.n(i12, 3);
            xVarN.e((Format) list.get(i11));
            this.F[i11] = xVarN;
            i11++;
            i12++;
        }
    }

    @Override // ca.k
    public final void release() {
    }
}
