package z2;

import a3.p;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class g {
    public int A;
    public float B;
    public final int[] C;
    public float D;
    public boolean E;
    public boolean F;
    public int G;
    public int H;
    public final d I;
    public final d J;
    public final d K;
    public final d L;
    public final d M;
    public final d N;
    public final d O;
    public final d P;
    public final d[] Q;
    public final ArrayList R;
    public final boolean[] S;
    public final f[] T;
    public g U;
    public int V;
    public int W;
    public float X;
    public int Y;
    public int Z;

    /* renamed from: a0, reason: collision with root package name */
    public int f26537a0;

    /* renamed from: b, reason: collision with root package name */
    public a3.c f26538b;

    /* renamed from: b0, reason: collision with root package name */
    public int f26539b0;

    /* renamed from: c, reason: collision with root package name */
    public a3.c f26540c;

    /* renamed from: c0, reason: collision with root package name */
    public int f26541c0;

    /* renamed from: d0, reason: collision with root package name */
    public int f26543d0;

    /* renamed from: e0, reason: collision with root package name */
    public float f26545e0;

    /* renamed from: f0, reason: collision with root package name */
    public float f26547f0;

    /* renamed from: g0, reason: collision with root package name */
    public View f26549g0;

    /* renamed from: h0, reason: collision with root package name */
    public int f26551h0;

    /* renamed from: i0, reason: collision with root package name */
    public String f26553i0;
    public String j;

    /* renamed from: j0, reason: collision with root package name */
    public int f26554j0;
    public boolean k;

    /* renamed from: k0, reason: collision with root package name */
    public int f26555k0;

    /* renamed from: l, reason: collision with root package name */
    public boolean f26556l;

    /* renamed from: l0, reason: collision with root package name */
    public final float[] f26557l0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f26558m;

    /* renamed from: m0, reason: collision with root package name */
    public final g[] f26559m0;

    /* renamed from: n, reason: collision with root package name */
    public boolean f26560n;

    /* renamed from: n0, reason: collision with root package name */
    public final g[] f26561n0;

    /* renamed from: o, reason: collision with root package name */
    public int f26562o;

    /* renamed from: o0, reason: collision with root package name */
    public int f26563o0;

    /* renamed from: p, reason: collision with root package name */
    public int f26564p;

    /* renamed from: p0, reason: collision with root package name */
    public int f26565p0;

    /* renamed from: q, reason: collision with root package name */
    public int f26566q;

    /* renamed from: r, reason: collision with root package name */
    public int f26567r;

    /* renamed from: s, reason: collision with root package name */
    public int f26568s;

    /* renamed from: t, reason: collision with root package name */
    public final int[] f26569t;

    /* renamed from: u, reason: collision with root package name */
    public int f26570u;

    /* renamed from: v, reason: collision with root package name */
    public int f26571v;

    /* renamed from: w, reason: collision with root package name */
    public float f26572w;

    /* renamed from: x, reason: collision with root package name */
    public int f26573x;

    /* renamed from: y, reason: collision with root package name */
    public int f26574y;

    /* renamed from: z, reason: collision with root package name */
    public float f26575z;

    /* renamed from: a, reason: collision with root package name */
    public boolean f26536a = false;

    /* renamed from: d, reason: collision with root package name */
    public a3.m f26542d = null;

    /* renamed from: e, reason: collision with root package name */
    public p f26544e = null;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f26546f = {true, true};

    /* renamed from: g, reason: collision with root package name */
    public boolean f26548g = true;

    /* renamed from: h, reason: collision with root package name */
    public int f26550h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f26552i = -1;

    public g() {
        new HashMap();
        this.k = false;
        this.f26556l = false;
        this.f26558m = false;
        this.f26560n = false;
        this.f26562o = -1;
        this.f26564p = -1;
        this.f26566q = 0;
        this.f26567r = 0;
        this.f26568s = 0;
        this.f26569t = new int[2];
        this.f26570u = 0;
        this.f26571v = 0;
        this.f26572w = 1.0f;
        this.f26573x = 0;
        this.f26574y = 0;
        this.f26575z = 1.0f;
        this.A = -1;
        this.B = 1.0f;
        this.C = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.D = Float.NaN;
        this.E = false;
        this.F = false;
        this.G = 0;
        this.H = 0;
        d dVar = new d(this, c.LEFT);
        this.I = dVar;
        d dVar2 = new d(this, c.TOP);
        this.J = dVar2;
        d dVar3 = new d(this, c.RIGHT);
        this.K = dVar3;
        d dVar4 = new d(this, c.BOTTOM);
        this.L = dVar4;
        d dVar5 = new d(this, c.BASELINE);
        this.M = dVar5;
        d dVar6 = new d(this, c.CENTER_X);
        this.N = dVar6;
        d dVar7 = new d(this, c.CENTER_Y);
        this.O = dVar7;
        d dVar8 = new d(this, c.CENTER);
        this.P = dVar8;
        this.Q = new d[]{dVar, dVar3, dVar2, dVar4, dVar5, dVar8};
        ArrayList arrayList = new ArrayList();
        this.R = arrayList;
        this.S = new boolean[2];
        f fVar = f.FIXED;
        this.T = new f[]{fVar, fVar};
        this.U = null;
        this.V = 0;
        this.W = 0;
        this.X = 0.0f;
        this.Y = -1;
        this.Z = 0;
        this.f26537a0 = 0;
        this.f26539b0 = 0;
        this.f26545e0 = 0.5f;
        this.f26547f0 = 0.5f;
        this.f26551h0 = 0;
        this.f26553i0 = null;
        this.f26554j0 = 0;
        this.f26555k0 = 0;
        this.f26557l0 = new float[]{-1.0f, -1.0f};
        this.f26559m0 = new g[]{null, null};
        this.f26561n0 = new g[]{null, null};
        this.f26563o0 = -1;
        this.f26565p0 = -1;
        arrayList.add(dVar);
        arrayList.add(dVar2);
        arrayList.add(dVar3);
        arrayList.add(dVar4);
        arrayList.add(dVar6);
        arrayList.add(dVar7);
        arrayList.add(dVar8);
        arrayList.add(dVar5);
    }

    public static void G(int i10, int i11, String str, StringBuilder sb2) {
        if (i10 == i11) {
            return;
        }
        sb2.append(str);
        sb2.append(" :   ");
        sb2.append(i10);
        sb2.append(",\n");
    }

    public static void H(StringBuilder sb2, String str, float f10, float f11) {
        if (f10 == f11) {
            return;
        }
        sb2.append(str);
        sb2.append(" :   ");
        sb2.append(f10);
        sb2.append(",\n");
    }

    public static void o(StringBuilder sb2, String str, int i10, int i11, int i12, int i13, int i14, float f10, f fVar) {
        sb2.append(str);
        sb2.append(" :  {\n");
        String string = fVar.toString();
        if (!f.FIXED.toString().equals(string)) {
            w.g.q(sb2, "      behavior", " :   ", string, ",\n");
        }
        G(i10, 0, "      size", sb2);
        G(i11, 0, "      min", sb2);
        G(i12, Integer.MAX_VALUE, "      max", sb2);
        G(i13, 0, "      matchMin", sb2);
        G(i14, 0, "      matchDef", sb2);
        H(sb2, "      matchPercent", f10, 1.0f);
        sb2.append("    },\n");
    }

    public static void p(StringBuilder sb2, String str, d dVar) {
        if (dVar.f26531f == null) {
            return;
        }
        sb2.append("    ");
        sb2.append(str);
        sb2.append(" : [ '");
        sb2.append(dVar.f26531f);
        sb2.append("'");
        if (dVar.f26533h != Integer.MIN_VALUE || dVar.f26532g != 0) {
            sb2.append(",");
            sb2.append(dVar.f26532g);
            if (dVar.f26533h != Integer.MIN_VALUE) {
                sb2.append(",");
                sb2.append(dVar.f26533h);
                sb2.append(",");
            }
        }
        sb2.append(" ] ,\n");
    }

    public boolean A() {
        if (this.k) {
            return true;
        }
        return this.I.f26528c && this.K.f26528c;
    }

    public boolean B() {
        if (this.f26556l) {
            return true;
        }
        return this.J.f26528c && this.L.f26528c;
    }

    public void C() {
        this.I.j();
        this.J.j();
        this.K.j();
        this.L.j();
        this.M.j();
        this.N.j();
        this.O.j();
        this.P.j();
        this.U = null;
        this.D = Float.NaN;
        this.V = 0;
        this.W = 0;
        this.X = 0.0f;
        this.Y = -1;
        this.Z = 0;
        this.f26537a0 = 0;
        this.f26539b0 = 0;
        this.f26541c0 = 0;
        this.f26543d0 = 0;
        this.f26545e0 = 0.5f;
        this.f26547f0 = 0.5f;
        f fVar = f.FIXED;
        f[] fVarArr = this.T;
        fVarArr[0] = fVar;
        fVarArr[1] = fVar;
        this.f26549g0 = null;
        this.f26551h0 = 0;
        this.f26554j0 = 0;
        this.f26555k0 = 0;
        float[] fArr = this.f26557l0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f26562o = -1;
        this.f26564p = -1;
        int[] iArr = this.C;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f26567r = 0;
        this.f26568s = 0;
        this.f26572w = 1.0f;
        this.f26575z = 1.0f;
        this.f26571v = Integer.MAX_VALUE;
        this.f26574y = Integer.MAX_VALUE;
        this.f26570u = 0;
        this.f26573x = 0;
        this.A = -1;
        this.B = 1.0f;
        boolean[] zArr = this.f26546f;
        zArr[0] = true;
        zArr[1] = true;
        this.F = false;
        boolean[] zArr2 = this.S;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f26548g = true;
        int[] iArr2 = this.f26569t;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.f26550h = -1;
        this.f26552i = -1;
    }

    public final void D() {
        g gVar = this.U;
        if (gVar != null && (gVar instanceof h)) {
            ((h) gVar).getClass();
        }
        ArrayList arrayList = this.R;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((d) arrayList.get(i10)).j();
        }
    }

    public final void E() {
        this.k = false;
        this.f26556l = false;
        this.f26558m = false;
        this.f26560n = false;
        ArrayList arrayList = this.R;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = (d) arrayList.get(i10);
            dVar.f26528c = false;
            dVar.f26527b = 0;
        }
    }

    public void F(qm.c cVar) {
        this.I.k();
        this.J.k();
        this.K.k();
        this.L.k();
        this.M.k();
        this.P.k();
        this.N.k();
        this.O.k();
    }

    public final void I(int i10) {
        this.f26539b0 = i10;
        this.E = i10 > 0;
    }

    public final void J(int i10, int i11) {
        if (this.k) {
            return;
        }
        this.I.l(i10);
        this.K.l(i11);
        this.Z = i10;
        this.V = i11 - i10;
        this.k = true;
    }

    public final void K(int i10, int i11) {
        if (this.f26556l) {
            return;
        }
        this.J.l(i10);
        this.L.l(i11);
        this.f26537a0 = i10;
        this.W = i11 - i10;
        if (this.E) {
            this.M.l(i10 + this.f26539b0);
        }
        this.f26556l = true;
    }

    public final void L(int i10) {
        this.W = i10;
        int i11 = this.f26543d0;
        if (i10 < i11) {
            this.W = i11;
        }
    }

    public final void M(f fVar) {
        this.T[0] = fVar;
    }

    public final void N(f fVar) {
        this.T[1] = fVar;
    }

    public final void O(int i10) {
        this.V = i10;
        int i11 = this.f26541c0;
        if (i10 < i11) {
            this.V = i11;
        }
    }

    public void P(boolean z10, boolean z11) {
        int i10;
        int i11;
        a3.m mVar = this.f26542d;
        boolean z12 = z10 & mVar.f81g;
        p pVar = this.f26544e;
        boolean z13 = z11 & pVar.f81g;
        int i12 = mVar.f82h.f57g;
        int i13 = pVar.f82h.f57g;
        int i14 = mVar.f83i.f57g;
        int i15 = pVar.f83i.f57g;
        int i16 = i15 - i13;
        if (i14 - i12 < 0 || i16 < 0 || i12 == Integer.MIN_VALUE || i12 == Integer.MAX_VALUE || i13 == Integer.MIN_VALUE || i13 == Integer.MAX_VALUE || i14 == Integer.MIN_VALUE || i14 == Integer.MAX_VALUE || i15 == Integer.MIN_VALUE || i15 == Integer.MAX_VALUE) {
            i14 = 0;
            i15 = 0;
            i12 = 0;
            i13 = 0;
        }
        int i17 = i14 - i12;
        int i18 = i15 - i13;
        if (z12) {
            this.Z = i12;
        }
        if (z13) {
            this.f26537a0 = i13;
        }
        if (this.f26551h0 == 8) {
            this.V = 0;
            this.W = 0;
            return;
        }
        f[] fVarArr = this.T;
        if (z12) {
            if (fVarArr[0] == f.FIXED && i17 < (i11 = this.V)) {
                i17 = i11;
            }
            this.V = i17;
            int i19 = this.f26541c0;
            if (i17 < i19) {
                this.V = i19;
            }
        }
        if (z13) {
            if (fVarArr[1] == f.FIXED && i18 < (i10 = this.W)) {
                i18 = i10;
            }
            this.W = i18;
            int i20 = this.f26543d0;
            if (i18 < i20) {
                this.W = i20;
            }
        }
    }

    public void Q(x2.c cVar, boolean z10) {
        int i10;
        int i11;
        p pVar;
        a3.m mVar;
        cVar.getClass();
        int iN = x2.c.n(this.I);
        int iN2 = x2.c.n(this.J);
        int iN3 = x2.c.n(this.K);
        int iN4 = x2.c.n(this.L);
        if (z10 && (mVar = this.f26542d) != null) {
            a3.g gVar = mVar.f82h;
            if (gVar.j) {
                a3.g gVar2 = mVar.f83i;
                if (gVar2.j) {
                    iN = gVar.f57g;
                    iN3 = gVar2.f57g;
                }
            }
        }
        if (z10 && (pVar = this.f26544e) != null) {
            a3.g gVar3 = pVar.f82h;
            if (gVar3.j) {
                a3.g gVar4 = pVar.f83i;
                if (gVar4.j) {
                    iN2 = gVar3.f57g;
                    iN4 = gVar4.f57g;
                }
            }
        }
        int i12 = iN4 - iN2;
        if (iN3 - iN < 0 || i12 < 0 || iN == Integer.MIN_VALUE || iN == Integer.MAX_VALUE || iN2 == Integer.MIN_VALUE || iN2 == Integer.MAX_VALUE || iN3 == Integer.MIN_VALUE || iN3 == Integer.MAX_VALUE || iN4 == Integer.MIN_VALUE || iN4 == Integer.MAX_VALUE) {
            iN = 0;
            iN2 = 0;
            iN3 = 0;
            iN4 = 0;
        }
        int i13 = iN3 - iN;
        int i14 = iN4 - iN2;
        this.Z = iN;
        this.f26537a0 = iN2;
        if (this.f26551h0 == 8) {
            this.V = 0;
            this.W = 0;
            return;
        }
        f[] fVarArr = this.T;
        f fVar = fVarArr[0];
        f fVar2 = f.FIXED;
        if (fVar == fVar2 && i13 < (i11 = this.V)) {
            i13 = i11;
        }
        if (fVarArr[1] == fVar2 && i14 < (i10 = this.W)) {
            i14 = i10;
        }
        this.V = i13;
        this.W = i14;
        int i15 = this.f26543d0;
        if (i14 < i15) {
            this.W = i15;
        }
        int i16 = this.f26541c0;
        if (i13 < i16) {
            this.V = i16;
        }
        int i17 = this.f26571v;
        if (i17 > 0 && fVar == f.MATCH_CONSTRAINT) {
            this.V = Math.min(this.V, i17);
        }
        int i18 = this.f26574y;
        if (i18 > 0 && fVarArr[1] == f.MATCH_CONSTRAINT) {
            this.W = Math.min(this.W, i18);
        }
        int i19 = this.V;
        if (i13 != i19) {
            this.f26550h = i19;
        }
        int i20 = this.W;
        if (i14 != i20) {
            this.f26552i = i20;
        }
    }

    public final void a(h hVar, x2.c cVar, HashSet hashSet, int i10, boolean z10) {
        if (z10) {
            if (!hashSet.contains(this)) {
                return;
            }
            n.b(hVar, cVar, this);
            hashSet.remove(this);
            b(cVar, hVar.W(64));
        }
        if (i10 == 0) {
            HashSet hashSet2 = this.I.f26526a;
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).f26529d.a(hVar, cVar, hashSet, i10, true);
                }
            }
            HashSet hashSet3 = this.K.f26526a;
            if (hashSet3 != null) {
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    ((d) it2.next()).f26529d.a(hVar, cVar, hashSet, i10, true);
                }
                return;
            }
            return;
        }
        HashSet hashSet4 = this.J.f26526a;
        if (hashSet4 != null) {
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                ((d) it3.next()).f26529d.a(hVar, cVar, hashSet, i10, true);
            }
        }
        HashSet hashSet5 = this.L.f26526a;
        if (hashSet5 != null) {
            Iterator it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                ((d) it4.next()).f26529d.a(hVar, cVar, hashSet, i10, true);
            }
        }
        HashSet hashSet6 = this.M.f26526a;
        if (hashSet6 != null) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                ((d) it5.next()).f26529d.a(hVar, cVar, hashSet, i10, true);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x05c2  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0687  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x068d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x06eb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0100  */
    /* JADX WARN: Type inference failed for: r12v32 */
    /* JADX WARN: Type inference failed for: r12v33, types: [int] */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r13v45, types: [z2.h] */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v16 */
    /* JADX WARN: Type inference failed for: r17v17 */
    /* JADX WARN: Type inference failed for: r17v19 */
    /* JADX WARN: Type inference failed for: r17v21 */
    /* JADX WARN: Type inference failed for: r17v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v13 */
    /* JADX WARN: Type inference failed for: r19v16 */
    /* JADX WARN: Type inference failed for: r19v17 */
    /* JADX WARN: Type inference failed for: r19v18 */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r27v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v6 */
    /* JADX WARN: Type inference failed for: r27v7 */
    /* JADX WARN: Type inference failed for: r27v8 */
    /* JADX WARN: Type inference failed for: r60v0, types: [z2.g] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(x2.c r61, boolean r62) {
        /*
            Method dump skipped, instructions count: 1954
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z2.g.b(x2.c, boolean):void");
    }

    public boolean c() {
        return this.f26551h0 != 8;
    }

    /* JADX WARN: Removed duplicated region for block: B:218:0x03b8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0490 A[PHI: r3
  0x0490: PHI (r3v17 int) = (r3v16 int), (r3v21 int), (r3v21 int), (r3v21 int) binds: [B:281:0x0480, B:283:0x0486, B:284:0x0488, B:286:0x048c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:291:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x04d1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:346:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(x2.c r30, boolean r31, boolean r32, boolean r33, boolean r34, x2.f r35, x2.f r36, z2.f r37, boolean r38, z2.d r39, z2.d r40, int r41, int r42, int r43, int r44, float r45, boolean r46, boolean r47, boolean r48, boolean r49, boolean r50, int r51, int r52, int r53, int r54, float r55, boolean r56) {
        /*
            Method dump skipped, instructions count: 1322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z2.g.d(x2.c, boolean, boolean, boolean, boolean, x2.f, x2.f, z2.f, boolean, z2.d, z2.d, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    public final void e(c cVar, g gVar, c cVar2, int i10) {
        c cVar3;
        c cVar4;
        boolean z10;
        c cVar5 = c.CENTER;
        if (cVar == cVar5) {
            if (cVar2 != cVar5) {
                c cVar6 = c.LEFT;
                if (cVar2 == cVar6 || cVar2 == c.RIGHT) {
                    e(cVar6, gVar, cVar2, 0);
                    e(c.RIGHT, gVar, cVar2, 0);
                    i(cVar5).a(gVar.i(cVar2), 0);
                    return;
                }
                c cVar7 = c.TOP;
                if (cVar2 == cVar7 || cVar2 == c.BOTTOM) {
                    e(cVar7, gVar, cVar2, 0);
                    e(c.BOTTOM, gVar, cVar2, 0);
                    i(cVar5).a(gVar.i(cVar2), 0);
                    return;
                }
                return;
            }
            c cVar8 = c.LEFT;
            d dVarI = i(cVar8);
            c cVar9 = c.RIGHT;
            d dVarI2 = i(cVar9);
            c cVar10 = c.TOP;
            d dVarI3 = i(cVar10);
            c cVar11 = c.BOTTOM;
            d dVarI4 = i(cVar11);
            boolean z11 = true;
            if ((dVarI == null || !dVarI.h()) && (dVarI2 == null || !dVarI2.h())) {
                e(cVar8, gVar, cVar8, 0);
                e(cVar9, gVar, cVar9, 0);
                z10 = true;
            } else {
                z10 = false;
            }
            if ((dVarI3 == null || !dVarI3.h()) && (dVarI4 == null || !dVarI4.h())) {
                e(cVar10, gVar, cVar10, 0);
                e(cVar11, gVar, cVar11, 0);
            } else {
                z11 = false;
            }
            if (z10 && z11) {
                i(cVar5).a(gVar.i(cVar5), 0);
                return;
            }
            if (z10) {
                c cVar12 = c.CENTER_X;
                i(cVar12).a(gVar.i(cVar12), 0);
                return;
            } else {
                if (z11) {
                    c cVar13 = c.CENTER_Y;
                    i(cVar13).a(gVar.i(cVar13), 0);
                    return;
                }
                return;
            }
        }
        c cVar14 = c.CENTER_X;
        if (cVar == cVar14 && (cVar2 == (cVar4 = c.LEFT) || cVar2 == c.RIGHT)) {
            d dVarI5 = i(cVar4);
            d dVarI6 = gVar.i(cVar2);
            d dVarI7 = i(c.RIGHT);
            dVarI5.a(dVarI6, 0);
            dVarI7.a(dVarI6, 0);
            i(cVar14).a(dVarI6, 0);
            return;
        }
        c cVar15 = c.CENTER_Y;
        if (cVar == cVar15 && (cVar2 == (cVar3 = c.TOP) || cVar2 == c.BOTTOM)) {
            d dVarI8 = gVar.i(cVar2);
            i(cVar3).a(dVarI8, 0);
            i(c.BOTTOM).a(dVarI8, 0);
            i(cVar15).a(dVarI8, 0);
            return;
        }
        if (cVar == cVar14 && cVar2 == cVar14) {
            c cVar16 = c.LEFT;
            i(cVar16).a(gVar.i(cVar16), 0);
            c cVar17 = c.RIGHT;
            i(cVar17).a(gVar.i(cVar17), 0);
            i(cVar14).a(gVar.i(cVar2), 0);
            return;
        }
        if (cVar == cVar15 && cVar2 == cVar15) {
            c cVar18 = c.TOP;
            i(cVar18).a(gVar.i(cVar18), 0);
            c cVar19 = c.BOTTOM;
            i(cVar19).a(gVar.i(cVar19), 0);
            i(cVar15).a(gVar.i(cVar2), 0);
            return;
        }
        d dVarI9 = i(cVar);
        d dVarI10 = gVar.i(cVar2);
        if (dVarI9.i(dVarI10)) {
            c cVar20 = c.BASELINE;
            if (cVar == cVar20) {
                d dVarI11 = i(c.TOP);
                d dVarI12 = i(c.BOTTOM);
                if (dVarI11 != null) {
                    dVarI11.j();
                }
                if (dVarI12 != null) {
                    dVarI12.j();
                }
            } else if (cVar == c.TOP || cVar == c.BOTTOM) {
                d dVarI13 = i(cVar20);
                if (dVarI13 != null) {
                    dVarI13.j();
                }
                d dVarI14 = i(cVar5);
                if (dVarI14.f26531f != dVarI10) {
                    dVarI14.j();
                }
                d dVarF = i(cVar).f();
                d dVarI15 = i(cVar15);
                if (dVarI15.h()) {
                    dVarF.j();
                    dVarI15.j();
                }
            } else if (cVar == c.LEFT || cVar == c.RIGHT) {
                d dVarI16 = i(cVar5);
                if (dVarI16.f26531f != dVarI10) {
                    dVarI16.j();
                }
                d dVarF2 = i(cVar).f();
                d dVarI17 = i(cVar14);
                if (dVarI17.h()) {
                    dVarF2.j();
                    dVarI17.j();
                }
            }
            dVarI9.a(dVarI10, i10);
        }
    }

    public final void f(d dVar, d dVar2, int i10) {
        if (dVar.f26529d == this) {
            e(dVar.f26530e, dVar2.f26529d, dVar2.f26530e, i10);
        }
    }

    public final void g(x2.c cVar) {
        cVar.k(this.I);
        cVar.k(this.J);
        cVar.k(this.K);
        cVar.k(this.L);
        if (this.f26539b0 > 0) {
            cVar.k(this.M);
        }
    }

    public final void h() {
        if (this.f26542d == null) {
            a3.m mVar = new a3.m(this);
            mVar.f82h.f55e = a3.f.LEFT;
            mVar.f83i.f55e = a3.f.RIGHT;
            mVar.f80f = 0;
            this.f26542d = mVar;
        }
        if (this.f26544e == null) {
            p pVar = new p(this);
            a3.g gVar = new a3.g(pVar);
            pVar.k = gVar;
            pVar.f67l = null;
            pVar.f82h.f55e = a3.f.TOP;
            pVar.f83i.f55e = a3.f.BOTTOM;
            gVar.f55e = a3.f.BASELINE;
            pVar.f80f = 1;
            this.f26544e = pVar;
        }
    }

    public d i(c cVar) {
        switch (e.f26535a[cVar.ordinal()]) {
            case 1:
                return this.I;
            case 2:
                return this.J;
            case 3:
                return this.K;
            case 4:
                return this.L;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                return this.M;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return this.P;
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return this.N;
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                return this.O;
            case 9:
                return null;
            default:
                throw new AssertionError(cVar.name());
        }
    }

    public final f j(int i10) {
        f[] fVarArr = this.T;
        if (i10 == 0) {
            return fVarArr[0];
        }
        if (i10 == 1) {
            return fVarArr[1];
        }
        return null;
    }

    public final int k() {
        if (this.f26551h0 == 8) {
            return 0;
        }
        return this.W;
    }

    public final g l(int i10) {
        d dVar;
        d dVar2;
        if (i10 != 0) {
            if (i10 == 1 && (dVar2 = (dVar = this.L).f26531f) != null && dVar2.f26531f == dVar) {
                return dVar2.f26529d;
            }
            return null;
        }
        d dVar3 = this.K;
        d dVar4 = dVar3.f26531f;
        if (dVar4 == null || dVar4.f26531f != dVar3) {
            return null;
        }
        return dVar4.f26529d;
    }

    public final g m(int i10) {
        d dVar;
        d dVar2;
        if (i10 != 0) {
            if (i10 == 1 && (dVar2 = (dVar = this.J).f26531f) != null && dVar2.f26531f == dVar) {
                return dVar2.f26529d;
            }
            return null;
        }
        d dVar3 = this.I;
        d dVar4 = dVar3.f26531f;
        if (dVar4 == null || dVar4.f26531f != dVar3) {
            return null;
        }
        return dVar4.f26529d;
    }

    public void n(StringBuilder sb2) {
        sb2.append("  " + this.j + ":{\n");
        StringBuilder sb3 = new StringBuilder("    actualWidth:");
        sb3.append(this.V);
        sb2.append(sb3.toString());
        sb2.append("\n");
        sb2.append("    actualHeight:" + this.W);
        sb2.append("\n");
        sb2.append("    actualLeft:" + this.Z);
        sb2.append("\n");
        sb2.append("    actualTop:" + this.f26537a0);
        sb2.append("\n");
        p(sb2, "left", this.I);
        p(sb2, "top", this.J);
        p(sb2, "right", this.K);
        p(sb2, "bottom", this.L);
        p(sb2, "baseline", this.M);
        p(sb2, "centerX", this.N);
        p(sb2, "centerY", this.O);
        int i10 = this.V;
        int i11 = this.f26541c0;
        int[] iArr = this.C;
        int i12 = iArr[0];
        int i13 = this.f26570u;
        int i14 = this.f26567r;
        float f10 = this.f26572w;
        f[] fVarArr = this.T;
        f fVar = fVarArr[0];
        float[] fArr = this.f26557l0;
        float f11 = fArr[0];
        o(sb2, "    width", i10, i11, i12, i13, i14, f10, fVar);
        int i15 = this.W;
        int i16 = this.f26543d0;
        int i17 = iArr[1];
        int i18 = this.f26573x;
        int i19 = this.f26568s;
        float f12 = this.f26575z;
        f fVar2 = fVarArr[1];
        float f13 = fArr[1];
        o(sb2, "    height", i15, i16, i17, i18, i19, f12, fVar2);
        float f14 = this.X;
        int i20 = this.Y;
        if (f14 != 0.0f) {
            sb2.append("    dimensionRatio");
            sb2.append(" :  [");
            sb2.append(f14);
            sb2.append(",");
            sb2.append(i20);
            sb2.append("");
            sb2.append("],\n");
        }
        H(sb2, "    horizontalBias", this.f26545e0, 0.5f);
        H(sb2, "    verticalBias", this.f26547f0, 0.5f);
        G(this.f26554j0, 0, "    horizontalChainStyle", sb2);
        G(this.f26555k0, 0, "    verticalChainStyle", sb2);
        sb2.append("  }");
    }

    public final int q() {
        if (this.f26551h0 == 8) {
            return 0;
        }
        return this.V;
    }

    public final int r() {
        g gVar = this.U;
        return (gVar == null || !(gVar instanceof h)) ? this.Z : ((h) gVar).f26583x0 + this.Z;
    }

    public final int s() {
        g gVar = this.U;
        return (gVar == null || !(gVar instanceof h)) ? this.f26537a0 : ((h) gVar).f26584y0 + this.f26537a0;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x003a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean t(int r5) {
        /*
            r4 = this;
            r0 = 2
            r1 = 0
            r2 = 1
            if (r5 != 0) goto L1b
            z2.d r5 = r4.I
            z2.d r5 = r5.f26531f
            if (r5 == 0) goto Ld
            r5 = r2
            goto Le
        Ld:
            r5 = r1
        Le:
            z2.d r3 = r4.K
            z2.d r3 = r3.f26531f
            if (r3 == 0) goto L16
            r3 = r2
            goto L17
        L16:
            r3 = r1
        L17:
            int r5 = r5 + r3
            if (r5 >= r0) goto L3b
            goto L3a
        L1b:
            z2.d r5 = r4.J
            z2.d r5 = r5.f26531f
            if (r5 == 0) goto L23
            r5 = r2
            goto L24
        L23:
            r5 = r1
        L24:
            z2.d r3 = r4.L
            z2.d r3 = r3.f26531f
            if (r3 == 0) goto L2c
            r3 = r2
            goto L2d
        L2c:
            r3 = r1
        L2d:
            int r5 = r5 + r3
            z2.d r3 = r4.M
            z2.d r3 = r3.f26531f
            if (r3 == 0) goto L36
            r3 = r2
            goto L37
        L36:
            r3 = r1
        L37:
            int r5 = r5 + r3
            if (r5 >= r0) goto L3b
        L3a:
            return r2
        L3b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: z2.g.t(int):boolean");
    }

    public String toString() {
        StringBuilder sbT = c7.a.t("");
        sbT.append(this.f26553i0 != null ? w.g.j(new StringBuilder("id: "), this.f26553i0, " ") : "");
        sbT.append("(");
        sbT.append(this.Z);
        sbT.append(", ");
        sbT.append(this.f26537a0);
        sbT.append(") - (");
        sbT.append(this.V);
        sbT.append(" x ");
        return h0.b.i(this.W, ")", sbT);
    }

    public final boolean u(int i10, int i11) {
        d dVar;
        d dVar2;
        d dVar3;
        d dVar4;
        if (i10 == 0) {
            d dVar5 = this.I;
            d dVar6 = dVar5.f26531f;
            if (dVar6 == null || !dVar6.f26528c || (dVar4 = (dVar3 = this.K).f26531f) == null || !dVar4.f26528c) {
                return false;
            }
            return (dVar4.d() - dVar3.e()) - (dVar5.e() + dVar5.f26531f.d()) >= i11;
        }
        d dVar7 = this.J;
        d dVar8 = dVar7.f26531f;
        if (dVar8 == null || !dVar8.f26528c || (dVar2 = (dVar = this.L).f26531f) == null || !dVar2.f26528c) {
            return false;
        }
        return (dVar2.d() - dVar.e()) - (dVar7.e() + dVar7.f26531f.d()) >= i11;
    }

    public final void v(c cVar, g gVar, c cVar2, int i10, int i11) {
        i(cVar).b(gVar.i(cVar2), i10, i11, true);
    }

    public final boolean w(int i10) {
        d dVar;
        d dVar2;
        int i11 = i10 * 2;
        d[] dVarArr = this.Q;
        d dVar3 = dVarArr[i11];
        d dVar4 = dVar3.f26531f;
        return (dVar4 == null || dVar4.f26531f == dVar3 || (dVar2 = (dVar = dVarArr[i11 + 1]).f26531f) == null || dVar2.f26531f != dVar) ? false : true;
    }

    public final boolean x() {
        d dVar = this.I;
        d dVar2 = dVar.f26531f;
        if (dVar2 != null && dVar2.f26531f == dVar) {
            return true;
        }
        d dVar3 = this.K;
        d dVar4 = dVar3.f26531f;
        return dVar4 != null && dVar4.f26531f == dVar3;
    }

    public final boolean y() {
        d dVar = this.J;
        d dVar2 = dVar.f26531f;
        if (dVar2 != null && dVar2.f26531f == dVar) {
            return true;
        }
        d dVar3 = this.L;
        d dVar4 = dVar3.f26531f;
        return dVar4 != null && dVar4.f26531f == dVar3;
    }

    public final boolean z() {
        return this.f26548g && this.f26551h0 != 8;
    }
}
