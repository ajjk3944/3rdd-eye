package k3;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import je.u;
import l3.l;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class d {
    public int A;
    public float B;
    public final int[] C;
    public float D;
    public boolean E;
    public boolean F;
    public int G;
    public int H;
    public final c I;
    public final c J;
    public final c K;
    public final c L;
    public final c M;
    public final c N;
    public final c O;
    public final c P;
    public final c[] Q;
    public final ArrayList R;
    public final boolean[] S;
    public d T;
    public int U;
    public int V;
    public float W;
    public int X;
    public int Y;
    public int Z;

    /* renamed from: a0, reason: collision with root package name */
    public int f27840a0;

    /* renamed from: b, reason: collision with root package name */
    public l3.c f27841b;

    /* renamed from: b0, reason: collision with root package name */
    public int f27842b0;

    /* renamed from: c, reason: collision with root package name */
    public l3.c f27843c;

    /* renamed from: c0, reason: collision with root package name */
    public int f27844c0;

    /* renamed from: d0, reason: collision with root package name */
    public float f27846d0;

    /* renamed from: e0, reason: collision with root package name */
    public float f27848e0;

    /* renamed from: f0, reason: collision with root package name */
    public View f27850f0;

    /* renamed from: g0, reason: collision with root package name */
    public int f27851g0;

    /* renamed from: h0, reason: collision with root package name */
    public String f27853h0;

    /* renamed from: i0, reason: collision with root package name */
    public int f27855i0;
    public String j;

    /* renamed from: j0, reason: collision with root package name */
    public int f27856j0;

    /* renamed from: k, reason: collision with root package name */
    public boolean f27857k;

    /* renamed from: k0, reason: collision with root package name */
    public final float[] f27858k0;

    /* renamed from: l, reason: collision with root package name */
    public boolean f27859l;

    /* renamed from: l0, reason: collision with root package name */
    public final d[] f27860l0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f27861m;

    /* renamed from: m0, reason: collision with root package name */
    public final d[] f27862m0;

    /* renamed from: n, reason: collision with root package name */
    public boolean f27863n;

    /* renamed from: n0, reason: collision with root package name */
    public int f27864n0;

    /* renamed from: o, reason: collision with root package name */
    public int f27865o;

    /* renamed from: o0, reason: collision with root package name */
    public int f27866o0;

    /* renamed from: p, reason: collision with root package name */
    public int f27867p;

    /* renamed from: p0, reason: collision with root package name */
    public final int[] f27868p0;

    /* renamed from: q, reason: collision with root package name */
    public int f27869q;

    /* renamed from: r, reason: collision with root package name */
    public int f27870r;

    /* renamed from: s, reason: collision with root package name */
    public int f27871s;

    /* renamed from: t, reason: collision with root package name */
    public final int[] f27872t;

    /* renamed from: u, reason: collision with root package name */
    public int f27873u;

    /* renamed from: v, reason: collision with root package name */
    public int f27874v;

    /* renamed from: w, reason: collision with root package name */
    public float f27875w;

    /* renamed from: x, reason: collision with root package name */
    public int f27876x;

    /* renamed from: y, reason: collision with root package name */
    public int f27877y;

    /* renamed from: z, reason: collision with root package name */
    public float f27878z;

    /* renamed from: a, reason: collision with root package name */
    public boolean f27839a = false;

    /* renamed from: d, reason: collision with root package name */
    public l3.j f27845d = null;

    /* renamed from: e, reason: collision with root package name */
    public l f27847e = null;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f27849f = {true, true};
    public boolean g = true;

    /* renamed from: h, reason: collision with root package name */
    public int f27852h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f27854i = -1;

    public d() {
        new HashMap();
        this.f27857k = false;
        this.f27859l = false;
        this.f27861m = false;
        this.f27863n = false;
        this.f27865o = -1;
        this.f27867p = -1;
        this.f27869q = 0;
        this.f27870r = 0;
        this.f27871s = 0;
        this.f27872t = new int[2];
        this.f27873u = 0;
        this.f27874v = 0;
        this.f27875w = 1.0f;
        this.f27876x = 0;
        this.f27877y = 0;
        this.f27878z = 1.0f;
        this.A = -1;
        this.B = 1.0f;
        this.C = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.D = Float.NaN;
        this.E = false;
        this.F = false;
        this.G = 0;
        this.H = 0;
        c cVar = new c(this, 2);
        this.I = cVar;
        c cVar2 = new c(this, 3);
        this.J = cVar2;
        c cVar3 = new c(this, 4);
        this.K = cVar3;
        c cVar4 = new c(this, 5);
        this.L = cVar4;
        c cVar5 = new c(this, 6);
        this.M = cVar5;
        c cVar6 = new c(this, 8);
        this.N = cVar6;
        c cVar7 = new c(this, 9);
        this.O = cVar7;
        c cVar8 = new c(this, 7);
        this.P = cVar8;
        this.Q = new c[]{cVar, cVar3, cVar2, cVar4, cVar5, cVar8};
        ArrayList arrayList = new ArrayList();
        this.R = arrayList;
        this.S = new boolean[2];
        this.f27868p0 = new int[]{1, 1};
        this.T = null;
        this.U = 0;
        this.V = 0;
        this.W = 0.0f;
        this.X = -1;
        this.Y = 0;
        this.Z = 0;
        this.f27840a0 = 0;
        this.f27846d0 = 0.5f;
        this.f27848e0 = 0.5f;
        this.f27851g0 = 0;
        this.f27853h0 = null;
        this.f27855i0 = 0;
        this.f27856j0 = 0;
        this.f27858k0 = new float[]{-1.0f, -1.0f};
        this.f27860l0 = new d[]{null, null};
        this.f27862m0 = new d[]{null, null};
        this.f27864n0 = -1;
        this.f27866o0 = -1;
        arrayList.add(cVar);
        arrayList.add(cVar2);
        arrayList.add(cVar3);
        arrayList.add(cVar4);
        arrayList.add(cVar6);
        arrayList.add(cVar7);
        arrayList.add(cVar8);
        arrayList.add(cVar5);
    }

    public static void G(int i4, int i10, String str, StringBuilder sb2) {
        if (i4 == i10) {
            return;
        }
        sb2.append(str);
        sb2.append(" :   ");
        sb2.append(i4);
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

    public static void o(StringBuilder sb2, String str, int i4, int i10, int i11, int i12, int i13, float f10, int i14) {
        String str2;
        sb2.append(str);
        sb2.append(" :  {\n");
        if (i14 == 1) {
            str2 = "FIXED";
        } else if (i14 == 2) {
            str2 = "WRAP_CONTENT";
        } else if (i14 == 3) {
            str2 = "MATCH_CONSTRAINT";
        } else {
            if (i14 != 4) {
                throw null;
            }
            str2 = "MATCH_PARENT";
        }
        if (!"FIXED".equals(str2)) {
            u.B(sb2, "      behavior", " :   ", str2, ",\n");
        }
        G(i4, 0, "      size", sb2);
        G(i10, 0, "      min", sb2);
        G(i11, Integer.MAX_VALUE, "      max", sb2);
        G(i12, 0, "      matchMin", sb2);
        G(i13, 0, "      matchDef", sb2);
        H(sb2, "      matchPercent", f10, 1.0f);
        sb2.append("    },\n");
    }

    public static void p(StringBuilder sb2, String str, c cVar) {
        if (cVar.f27836f == null) {
            return;
        }
        sb2.append("    ");
        sb2.append(str);
        sb2.append(" : [ '");
        sb2.append(cVar.f27836f);
        sb2.append("'");
        if (cVar.f27837h != Integer.MIN_VALUE || cVar.g != 0) {
            sb2.append(",");
            sb2.append(cVar.g);
            if (cVar.f27837h != Integer.MIN_VALUE) {
                sb2.append(",");
                sb2.append(cVar.f27837h);
                sb2.append(",");
            }
        }
        sb2.append(" ] ,\n");
    }

    public boolean A() {
        if (this.f27857k) {
            return true;
        }
        return this.I.f27833c && this.K.f27833c;
    }

    public boolean B() {
        if (this.f27859l) {
            return true;
        }
        return this.J.f27833c && this.L.f27833c;
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
        this.T = null;
        this.D = Float.NaN;
        this.U = 0;
        this.V = 0;
        this.W = 0.0f;
        this.X = -1;
        this.Y = 0;
        this.Z = 0;
        this.f27840a0 = 0;
        this.f27842b0 = 0;
        this.f27844c0 = 0;
        this.f27846d0 = 0.5f;
        this.f27848e0 = 0.5f;
        int[] iArr = this.f27868p0;
        iArr[0] = 1;
        iArr[1] = 1;
        this.f27850f0 = null;
        this.f27851g0 = 0;
        this.f27855i0 = 0;
        this.f27856j0 = 0;
        float[] fArr = this.f27858k0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f27865o = -1;
        this.f27867p = -1;
        int[] iArr2 = this.C;
        iArr2[0] = Integer.MAX_VALUE;
        iArr2[1] = Integer.MAX_VALUE;
        this.f27870r = 0;
        this.f27871s = 0;
        this.f27875w = 1.0f;
        this.f27878z = 1.0f;
        this.f27874v = Integer.MAX_VALUE;
        this.f27877y = Integer.MAX_VALUE;
        this.f27873u = 0;
        this.f27876x = 0;
        this.A = -1;
        this.B = 1.0f;
        boolean[] zArr = this.f27849f;
        zArr[0] = true;
        zArr[1] = true;
        this.F = false;
        boolean[] zArr2 = this.S;
        zArr2[0] = false;
        zArr2[1] = false;
        this.g = true;
        int[] iArr3 = this.f27872t;
        iArr3[0] = 0;
        iArr3[1] = 0;
        this.f27852h = -1;
        this.f27854i = -1;
    }

    public final void D() {
        d dVar = this.T;
        if (dVar != null && (dVar instanceof e)) {
            ((e) dVar).getClass();
        }
        ArrayList arrayList = this.R;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((c) arrayList.get(i4)).j();
        }
    }

    public final void E() {
        this.f27857k = false;
        this.f27859l = false;
        this.f27861m = false;
        this.f27863n = false;
        ArrayList arrayList = this.R;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            c cVar = (c) arrayList.get(i4);
            cVar.f27833c = false;
            cVar.f27832b = 0;
        }
    }

    public void F(i0.f fVar) {
        this.I.k();
        this.J.k();
        this.K.k();
        this.L.k();
        this.M.k();
        this.P.k();
        this.N.k();
        this.O.k();
    }

    public final void I(int i4) {
        this.f27840a0 = i4;
        this.E = i4 > 0;
    }

    public final void J(int i4, int i10) {
        if (this.f27857k) {
            return;
        }
        this.I.l(i4);
        this.K.l(i10);
        this.Y = i4;
        this.U = i10 - i4;
        this.f27857k = true;
    }

    public final void K(int i4, int i10) {
        if (this.f27859l) {
            return;
        }
        this.J.l(i4);
        this.L.l(i10);
        this.Z = i4;
        this.V = i10 - i4;
        if (this.E) {
            this.M.l(i4 + this.f27840a0);
        }
        this.f27859l = true;
    }

    public final void L(int i4) {
        this.V = i4;
        int i10 = this.f27844c0;
        if (i4 < i10) {
            this.V = i10;
        }
    }

    public final void M(int i4) {
        this.f27868p0[0] = i4;
    }

    public final void N(int i4) {
        this.f27868p0[1] = i4;
    }

    public final void O(int i4) {
        this.U = i4;
        int i10 = this.f27842b0;
        if (i4 < i10) {
            this.U = i10;
        }
    }

    public void P(boolean z3, boolean z10) {
        int i4;
        int i10;
        l3.j jVar = this.f27845d;
        boolean z11 = z3 & jVar.g;
        l lVar = this.f27847e;
        boolean z12 = z10 & lVar.g;
        int i11 = jVar.f28586h.g;
        int i12 = lVar.f28586h.g;
        int i13 = jVar.f28587i.g;
        int i14 = lVar.f28587i.g;
        int i15 = i14 - i12;
        if (i13 - i11 < 0 || i15 < 0 || i11 == Integer.MIN_VALUE || i11 == Integer.MAX_VALUE || i12 == Integer.MIN_VALUE || i12 == Integer.MAX_VALUE || i13 == Integer.MIN_VALUE || i13 == Integer.MAX_VALUE || i14 == Integer.MIN_VALUE || i14 == Integer.MAX_VALUE) {
            i13 = 0;
            i14 = 0;
            i11 = 0;
            i12 = 0;
        }
        int i16 = i13 - i11;
        int i17 = i14 - i12;
        if (z11) {
            this.Y = i11;
        }
        if (z12) {
            this.Z = i12;
        }
        if (this.f27851g0 == 8) {
            this.U = 0;
            this.V = 0;
            return;
        }
        int[] iArr = this.f27868p0;
        if (z11) {
            if (iArr[0] == 1 && i16 < (i10 = this.U)) {
                i16 = i10;
            }
            this.U = i16;
            int i18 = this.f27842b0;
            if (i16 < i18) {
                this.U = i18;
            }
        }
        if (z12) {
            if (iArr[1] == 1 && i17 < (i4 = this.V)) {
                i17 = i4;
            }
            this.V = i17;
            int i19 = this.f27844c0;
            if (i17 < i19) {
                this.V = i19;
            }
        }
    }

    public void Q(i3.c cVar, boolean z3) {
        int i4;
        int i10;
        l lVar;
        l3.j jVar;
        cVar.getClass();
        int iN = i3.c.n(this.I);
        int iN2 = i3.c.n(this.J);
        int iN3 = i3.c.n(this.K);
        int iN4 = i3.c.n(this.L);
        if (z3 && (jVar = this.f27845d) != null) {
            l3.e eVar = jVar.f28586h;
            if (eVar.j) {
                l3.e eVar2 = jVar.f28587i;
                if (eVar2.j) {
                    iN = eVar.g;
                    iN3 = eVar2.g;
                }
            }
        }
        if (z3 && (lVar = this.f27847e) != null) {
            l3.e eVar3 = lVar.f28586h;
            if (eVar3.j) {
                l3.e eVar4 = lVar.f28587i;
                if (eVar4.j) {
                    iN2 = eVar3.g;
                    iN4 = eVar4.g;
                }
            }
        }
        int i11 = iN4 - iN2;
        if (iN3 - iN < 0 || i11 < 0 || iN == Integer.MIN_VALUE || iN == Integer.MAX_VALUE || iN2 == Integer.MIN_VALUE || iN2 == Integer.MAX_VALUE || iN3 == Integer.MIN_VALUE || iN3 == Integer.MAX_VALUE || iN4 == Integer.MIN_VALUE || iN4 == Integer.MAX_VALUE) {
            iN = 0;
            iN2 = 0;
            iN3 = 0;
            iN4 = 0;
        }
        int i12 = iN3 - iN;
        int i13 = iN4 - iN2;
        this.Y = iN;
        this.Z = iN2;
        if (this.f27851g0 == 8) {
            this.U = 0;
            this.V = 0;
            return;
        }
        int[] iArr = this.f27868p0;
        int i14 = iArr[0];
        if (i14 == 1 && i12 < (i10 = this.U)) {
            i12 = i10;
        }
        if (iArr[1] == 1 && i13 < (i4 = this.V)) {
            i13 = i4;
        }
        this.U = i12;
        this.V = i13;
        int i15 = this.f27844c0;
        if (i13 < i15) {
            this.V = i15;
        }
        int i16 = this.f27842b0;
        if (i12 < i16) {
            this.U = i16;
        }
        int i17 = this.f27874v;
        if (i17 > 0 && i14 == 3) {
            this.U = Math.min(this.U, i17);
        }
        int i18 = this.f27877y;
        if (i18 > 0 && iArr[1] == 3) {
            this.V = Math.min(this.V, i18);
        }
        int i19 = this.U;
        if (i12 != i19) {
            this.f27852h = i19;
        }
        int i20 = this.V;
        if (i13 != i20) {
            this.f27854i = i20;
        }
    }

    public final void a(e eVar, i3.c cVar, HashSet hashSet, int i4, boolean z3) {
        if (z3) {
            if (!hashSet.contains(this)) {
                return;
            }
            j.b(eVar, cVar, this);
            hashSet.remove(this);
            b(cVar, eVar.W(64));
        }
        if (i4 == 0) {
            HashSet hashSet2 = this.I.f27831a;
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ((c) it.next()).f27834d.a(eVar, cVar, hashSet, i4, true);
                }
            }
            HashSet hashSet3 = this.K.f27831a;
            if (hashSet3 != null) {
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    ((c) it2.next()).f27834d.a(eVar, cVar, hashSet, i4, true);
                }
                return;
            }
            return;
        }
        HashSet hashSet4 = this.J.f27831a;
        if (hashSet4 != null) {
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                ((c) it3.next()).f27834d.a(eVar, cVar, hashSet, i4, true);
            }
        }
        HashSet hashSet5 = this.L.f27831a;
        if (hashSet5 != null) {
            Iterator it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                ((c) it4.next()).f27834d.a(eVar, cVar, hashSet, i4, true);
            }
        }
        HashSet hashSet6 = this.M.f27831a;
        if (hashSet6 != null) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                ((c) it5.next()).f27834d.a(eVar, cVar, hashSet, i4, true);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x059c  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0661  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0667  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x06c5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00fd  */
    /* JADX WARN: Type inference failed for: r17v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r17v16 */
    /* JADX WARN: Type inference failed for: r17v17 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v20 */
    /* JADX WARN: Type inference failed for: r18v25 */
    /* JADX WARN: Type inference failed for: r18v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r27v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v6 */
    /* JADX WARN: Type inference failed for: r27v7 */
    /* JADX WARN: Type inference failed for: r27v8 */
    /* JADX WARN: Type inference failed for: r58v0, types: [k3.d] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(i3.c r59, boolean r60) {
        /*
            Method dump skipped, instructions count: 1912
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k3.d.b(i3.c, boolean):void");
    }

    public boolean c() {
        return this.f27851g0 != 8;
    }

    /* JADX WARN: Removed duplicated region for block: B:217:0x03bc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0493 A[PHI: r3
  0x0493: PHI (r3v17 int) = (r3v16 int), (r3v21 int), (r3v21 int), (r3v21 int) binds: [B:280:0x0483, B:282:0x0489, B:283:0x048b, B:285:0x048f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:290:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x04d4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:345:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(i3.c r30, boolean r31, boolean r32, boolean r33, boolean r34, i3.f r35, i3.f r36, int r37, boolean r38, k3.c r39, k3.c r40, int r41, int r42, int r43, int r44, float r45, boolean r46, boolean r47, boolean r48, boolean r49, boolean r50, int r51, int r52, int r53, int r54, float r55, boolean r56) {
        /*
            Method dump skipped, instructions count: 1323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k3.d.d(i3.c, boolean, boolean, boolean, boolean, i3.f, i3.f, int, boolean, k3.c, k3.c, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    public final void e(int i4, d dVar, int i10, int i11) {
        boolean z3;
        if (i4 == 7) {
            if (i10 != 7) {
                if (i10 == 2 || i10 == 4) {
                    e(2, dVar, i10, 0);
                    e(4, dVar, i10, 0);
                    i(7).a(dVar.i(i10), 0);
                    return;
                } else {
                    if (i10 == 3 || i10 == 5) {
                        e(3, dVar, i10, 0);
                        e(5, dVar, i10, 0);
                        i(7).a(dVar.i(i10), 0);
                        return;
                    }
                    return;
                }
            }
            c cVarI = i(2);
            c cVarI2 = i(4);
            c cVarI3 = i(3);
            c cVarI4 = i(5);
            boolean z10 = true;
            if ((cVarI == null || !cVarI.h()) && (cVarI2 == null || !cVarI2.h())) {
                e(2, dVar, 2, 0);
                e(4, dVar, 4, 0);
                z3 = true;
            } else {
                z3 = false;
            }
            if ((cVarI3 == null || !cVarI3.h()) && (cVarI4 == null || !cVarI4.h())) {
                e(3, dVar, 3, 0);
                e(5, dVar, 5, 0);
            } else {
                z10 = false;
            }
            if (z3 && z10) {
                i(7).a(dVar.i(7), 0);
                return;
            } else if (z3) {
                i(8).a(dVar.i(8), 0);
                return;
            } else {
                if (z10) {
                    i(9).a(dVar.i(9), 0);
                    return;
                }
                return;
            }
        }
        if (i4 == 8 && (i10 == 2 || i10 == 4)) {
            c cVarI5 = i(2);
            c cVarI6 = dVar.i(i10);
            c cVarI7 = i(4);
            cVarI5.a(cVarI6, 0);
            cVarI7.a(cVarI6, 0);
            i(8).a(cVarI6, 0);
            return;
        }
        if (i4 == 9 && (i10 == 3 || i10 == 5)) {
            c cVarI8 = dVar.i(i10);
            i(3).a(cVarI8, 0);
            i(5).a(cVarI8, 0);
            i(9).a(cVarI8, 0);
            return;
        }
        if (i4 == 8 && i10 == 8) {
            i(2).a(dVar.i(2), 0);
            i(4).a(dVar.i(4), 0);
            i(8).a(dVar.i(i10), 0);
            return;
        }
        if (i4 == 9 && i10 == 9) {
            i(3).a(dVar.i(3), 0);
            i(5).a(dVar.i(5), 0);
            i(9).a(dVar.i(i10), 0);
            return;
        }
        c cVarI9 = i(i4);
        c cVarI10 = dVar.i(i10);
        if (cVarI9.i(cVarI10)) {
            if (i4 == 6) {
                c cVarI11 = i(3);
                c cVarI12 = i(5);
                if (cVarI11 != null) {
                    cVarI11.j();
                }
                if (cVarI12 != null) {
                    cVarI12.j();
                }
            } else if (i4 == 3 || i4 == 5) {
                c cVarI13 = i(6);
                if (cVarI13 != null) {
                    cVarI13.j();
                }
                c cVarI14 = i(7);
                if (cVarI14.f27836f != cVarI10) {
                    cVarI14.j();
                }
                c cVarF = i(i4).f();
                c cVarI15 = i(9);
                if (cVarI15.h()) {
                    cVarF.j();
                    cVarI15.j();
                }
            } else if (i4 == 2 || i4 == 4) {
                c cVarI16 = i(7);
                if (cVarI16.f27836f != cVarI10) {
                    cVarI16.j();
                }
                c cVarF2 = i(i4).f();
                c cVarI17 = i(8);
                if (cVarI17.h()) {
                    cVarF2.j();
                    cVarI17.j();
                }
            }
            cVarI9.a(cVarI10, i11);
        }
    }

    public final void f(c cVar, c cVar2, int i4) {
        if (cVar.f27834d == this) {
            e(cVar.f27835e, cVar2.f27834d, cVar2.f27835e, i4);
        }
    }

    public final void g(i3.c cVar) {
        cVar.k(this.I);
        cVar.k(this.J);
        cVar.k(this.K);
        cVar.k(this.L);
        if (this.f27840a0 > 0) {
            cVar.k(this.M);
        }
    }

    public final void h() {
        if (this.f27845d == null) {
            l3.j jVar = new l3.j(this);
            jVar.f28586h.f28561e = 4;
            jVar.f28587i.f28561e = 5;
            jVar.f28585f = 0;
            this.f27845d = jVar;
        }
        if (this.f27847e == null) {
            l lVar = new l(this);
            l3.e eVar = new l3.e(lVar);
            lVar.f28572k = eVar;
            lVar.f28573l = null;
            lVar.f28586h.f28561e = 6;
            lVar.f28587i.f28561e = 7;
            eVar.f28561e = 8;
            lVar.f28585f = 1;
            this.f27847e = lVar;
        }
    }

    public c i(int i4) {
        switch (i3.e.c(i4)) {
            case 0:
                return null;
            case 1:
                return this.I;
            case 2:
                return this.J;
            case 3:
                return this.K;
            case 4:
                return this.L;
            case 5:
                return this.M;
            case 6:
                return this.P;
            case 7:
                return this.N;
            case 8:
                return this.O;
            default:
                throw new AssertionError(u.C(i4));
        }
    }

    public final int j(int i4) {
        int[] iArr = this.f27868p0;
        if (i4 == 0) {
            return iArr[0];
        }
        if (i4 == 1) {
            return iArr[1];
        }
        return 0;
    }

    public final int k() {
        if (this.f27851g0 == 8) {
            return 0;
        }
        return this.V;
    }

    public final d l(int i4) {
        c cVar;
        c cVar2;
        if (i4 != 0) {
            if (i4 == 1 && (cVar2 = (cVar = this.L).f27836f) != null && cVar2.f27836f == cVar) {
                return cVar2.f27834d;
            }
            return null;
        }
        c cVar3 = this.K;
        c cVar4 = cVar3.f27836f;
        if (cVar4 == null || cVar4.f27836f != cVar3) {
            return null;
        }
        return cVar4.f27834d;
    }

    public final d m(int i4) {
        c cVar;
        c cVar2;
        if (i4 != 0) {
            if (i4 == 1 && (cVar2 = (cVar = this.J).f27836f) != null && cVar2.f27836f == cVar) {
                return cVar2.f27834d;
            }
            return null;
        }
        c cVar3 = this.I;
        c cVar4 = cVar3.f27836f;
        if (cVar4 == null || cVar4.f27836f != cVar3) {
            return null;
        }
        return cVar4.f27834d;
    }

    public void n(StringBuilder sb2) {
        sb2.append("  " + this.j + ":{\n");
        StringBuilder sb3 = new StringBuilder("    actualWidth:");
        sb3.append(this.U);
        sb2.append(sb3.toString());
        sb2.append("\n");
        sb2.append("    actualHeight:" + this.V);
        sb2.append("\n");
        sb2.append("    actualLeft:" + this.Y);
        sb2.append("\n");
        sb2.append("    actualTop:" + this.Z);
        sb2.append("\n");
        p(sb2, "left", this.I);
        p(sb2, "top", this.J);
        p(sb2, "right", this.K);
        p(sb2, "bottom", this.L);
        p(sb2, "baseline", this.M);
        p(sb2, "centerX", this.N);
        p(sb2, "centerY", this.O);
        int i4 = this.U;
        int i10 = this.f27842b0;
        int[] iArr = this.C;
        int i11 = iArr[0];
        int i12 = this.f27873u;
        int i13 = this.f27870r;
        float f10 = this.f27875w;
        int[] iArr2 = this.f27868p0;
        int i14 = iArr2[0];
        float[] fArr = this.f27858k0;
        float f11 = fArr[0];
        o(sb2, "    width", i4, i10, i11, i12, i13, f10, i14);
        int i15 = this.V;
        int i16 = this.f27844c0;
        int i17 = iArr[1];
        int i18 = this.f27876x;
        int i19 = this.f27871s;
        float f12 = this.f27878z;
        int i20 = iArr2[1];
        float f13 = fArr[1];
        o(sb2, "    height", i15, i16, i17, i18, i19, f12, i20);
        float f14 = this.W;
        int i21 = this.X;
        if (f14 != 0.0f) {
            sb2.append("    dimensionRatio");
            sb2.append(" :  [");
            sb2.append(f14);
            sb2.append(",");
            sb2.append(i21);
            sb2.append("");
            sb2.append("],\n");
        }
        H(sb2, "    horizontalBias", this.f27846d0, 0.5f);
        H(sb2, "    verticalBias", this.f27848e0, 0.5f);
        G(this.f27855i0, 0, "    horizontalChainStyle", sb2);
        G(this.f27856j0, 0, "    verticalChainStyle", sb2);
        sb2.append("  }");
    }

    public final int q() {
        if (this.f27851g0 == 8) {
            return 0;
        }
        return this.U;
    }

    public final int r() {
        d dVar = this.T;
        return (dVar == null || !(dVar instanceof e)) ? this.Y : ((e) dVar).f27886x0 + this.Y;
    }

    public final int s() {
        d dVar = this.T;
        return (dVar == null || !(dVar instanceof e)) ? this.Z : ((e) dVar).f27887y0 + this.Z;
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
            k3.c r5 = r4.I
            k3.c r5 = r5.f27836f
            if (r5 == 0) goto Ld
            r5 = r2
            goto Le
        Ld:
            r5 = r1
        Le:
            k3.c r3 = r4.K
            k3.c r3 = r3.f27836f
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
            k3.c r5 = r4.J
            k3.c r5 = r5.f27836f
            if (r5 == 0) goto L23
            r5 = r2
            goto L24
        L23:
            r5 = r1
        L24:
            k3.c r3 = r4.L
            k3.c r3 = r3.f27836f
            if (r3 == 0) goto L2c
            r3 = r2
            goto L2d
        L2c:
            r3 = r1
        L2d:
            int r5 = r5 + r3
            k3.c r3 = r4.M
            k3.c r3 = r3.f27836f
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
        throw new UnsupportedOperationException("Method not decompiled: k3.d.t(int):boolean");
    }

    public String toString() {
        StringBuilder sbZ = d.h.z("");
        sbZ.append(this.f27853h0 != null ? d.h.w(new StringBuilder("id: "), this.f27853h0, " ") : "");
        sbZ.append("(");
        sbZ.append(this.Y);
        sbZ.append(", ");
        sbZ.append(this.Z);
        sbZ.append(") - (");
        sbZ.append(this.U);
        sbZ.append(" x ");
        return r5.c.j(this.V, ")", sbZ);
    }

    public final boolean u(int i4, int i10) {
        c cVar;
        c cVar2;
        c cVar3;
        c cVar4;
        if (i4 == 0) {
            c cVar5 = this.I;
            c cVar6 = cVar5.f27836f;
            if (cVar6 == null || !cVar6.f27833c || (cVar4 = (cVar3 = this.K).f27836f) == null || !cVar4.f27833c) {
                return false;
            }
            return (cVar4.d() - cVar3.e()) - (cVar5.e() + cVar5.f27836f.d()) >= i10;
        }
        c cVar7 = this.J;
        c cVar8 = cVar7.f27836f;
        if (cVar8 == null || !cVar8.f27833c || (cVar2 = (cVar = this.L).f27836f) == null || !cVar2.f27833c) {
            return false;
        }
        return (cVar2.d() - cVar.e()) - (cVar7.e() + cVar7.f27836f.d()) >= i10;
    }

    public final void v(int i4, int i10, int i11, int i12, d dVar) {
        i(i4).b(dVar.i(i10), i11, i12, true);
    }

    public final boolean w(int i4) {
        c cVar;
        c cVar2;
        int i10 = i4 * 2;
        c[] cVarArr = this.Q;
        c cVar3 = cVarArr[i10];
        c cVar4 = cVar3.f27836f;
        return (cVar4 == null || cVar4.f27836f == cVar3 || (cVar2 = (cVar = cVarArr[i10 + 1]).f27836f) == null || cVar2.f27836f != cVar) ? false : true;
    }

    public final boolean x() {
        c cVar = this.I;
        c cVar2 = cVar.f27836f;
        if (cVar2 != null && cVar2.f27836f == cVar) {
            return true;
        }
        c cVar3 = this.K;
        c cVar4 = cVar3.f27836f;
        return cVar4 != null && cVar4.f27836f == cVar3;
    }

    public final boolean y() {
        c cVar = this.J;
        c cVar2 = cVar.f27836f;
        if (cVar2 != null && cVar2.f27836f == cVar) {
            return true;
        }
        c cVar3 = this.L;
        c cVar4 = cVar3.f27836f;
        return cVar4 != null && cVar4.f27836f == cVar3;
    }

    public final boolean z() {
        return this.g && this.f27851g0 != 8;
    }
}
