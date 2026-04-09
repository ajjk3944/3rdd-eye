package z;

import A.l;
import A.n;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import o.a1;
import o4.AbstractC2763b;
import x.AbstractC2984e;
import x.C2982c;

/* loaded from: classes.dex */
public class d {

    /* renamed from: A, reason: collision with root package name */
    public int f24292A;

    /* renamed from: B, reason: collision with root package name */
    public float f24293B;

    /* renamed from: C, reason: collision with root package name */
    public final int[] f24294C;

    /* renamed from: D, reason: collision with root package name */
    public float f24295D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f24296E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f24297F;

    /* renamed from: G, reason: collision with root package name */
    public int f24298G;

    /* renamed from: H, reason: collision with root package name */
    public int f24299H;

    /* renamed from: I, reason: collision with root package name */
    public final c f24300I;

    /* renamed from: J, reason: collision with root package name */
    public final c f24301J;

    /* renamed from: K, reason: collision with root package name */
    public final c f24302K;

    /* renamed from: L, reason: collision with root package name */
    public final c f24303L;
    public final c M;

    /* renamed from: N, reason: collision with root package name */
    public final c f24304N;

    /* renamed from: O, reason: collision with root package name */
    public final c f24305O;

    /* renamed from: P, reason: collision with root package name */
    public final c f24306P;

    /* renamed from: Q, reason: collision with root package name */
    public final c[] f24307Q;

    /* renamed from: R, reason: collision with root package name */
    public final ArrayList f24308R;

    /* renamed from: S, reason: collision with root package name */
    public final boolean[] f24309S;

    /* renamed from: T, reason: collision with root package name */
    public d f24310T;

    /* renamed from: U, reason: collision with root package name */
    public int f24311U;

    /* renamed from: V, reason: collision with root package name */
    public int f24312V;

    /* renamed from: W, reason: collision with root package name */
    public float f24313W;

    /* renamed from: X, reason: collision with root package name */
    public int f24314X;

    /* renamed from: Y, reason: collision with root package name */
    public int f24315Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f24316Z;

    /* renamed from: a0, reason: collision with root package name */
    public int f24318a0;

    /* renamed from: b, reason: collision with root package name */
    public A.c f24319b;
    public int b0;

    /* renamed from: c, reason: collision with root package name */
    public A.c f24320c;

    /* renamed from: c0, reason: collision with root package name */
    public int f24321c0;

    /* renamed from: d0, reason: collision with root package name */
    public float f24323d0;

    /* renamed from: e0, reason: collision with root package name */
    public float f24325e0;

    /* renamed from: f0, reason: collision with root package name */
    public View f24327f0;

    /* renamed from: g0, reason: collision with root package name */
    public int f24329g0;

    /* renamed from: h0, reason: collision with root package name */
    public String f24331h0;

    /* renamed from: i0, reason: collision with root package name */
    public int f24332i0;

    /* renamed from: j, reason: collision with root package name */
    public String f24333j;

    /* renamed from: j0, reason: collision with root package name */
    public int f24334j0;

    /* renamed from: k, reason: collision with root package name */
    public boolean f24335k;

    /* renamed from: k0, reason: collision with root package name */
    public final float[] f24336k0;

    /* renamed from: l, reason: collision with root package name */
    public boolean f24337l;

    /* renamed from: l0, reason: collision with root package name */
    public final d[] f24338l0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f24339m;

    /* renamed from: m0, reason: collision with root package name */
    public final d[] f24340m0;

    /* renamed from: n, reason: collision with root package name */
    public boolean f24341n;

    /* renamed from: n0, reason: collision with root package name */
    public int f24342n0;

    /* renamed from: o, reason: collision with root package name */
    public int f24343o;

    /* renamed from: o0, reason: collision with root package name */
    public int f24344o0;

    /* renamed from: p, reason: collision with root package name */
    public int f24345p;

    /* renamed from: p0, reason: collision with root package name */
    public final int[] f24346p0;

    /* renamed from: q, reason: collision with root package name */
    public int f24347q;

    /* renamed from: r, reason: collision with root package name */
    public int f24348r;

    /* renamed from: s, reason: collision with root package name */
    public int f24349s;

    /* renamed from: t, reason: collision with root package name */
    public final int[] f24350t;

    /* renamed from: u, reason: collision with root package name */
    public int f24351u;

    /* renamed from: v, reason: collision with root package name */
    public int f24352v;

    /* renamed from: w, reason: collision with root package name */
    public float f24353w;

    /* renamed from: x, reason: collision with root package name */
    public int f24354x;

    /* renamed from: y, reason: collision with root package name */
    public int f24355y;

    /* renamed from: z, reason: collision with root package name */
    public float f24356z;

    /* renamed from: a, reason: collision with root package name */
    public boolean f24317a = false;

    /* renamed from: d, reason: collision with root package name */
    public l f24322d = null;

    /* renamed from: e, reason: collision with root package name */
    public n f24324e = null;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f24326f = {true, true};

    /* renamed from: g, reason: collision with root package name */
    public boolean f24328g = true;

    /* renamed from: h, reason: collision with root package name */
    public int f24330h = -1;
    public int i = -1;

    public d() {
        new HashMap();
        this.f24335k = false;
        this.f24337l = false;
        this.f24339m = false;
        this.f24341n = false;
        this.f24343o = -1;
        this.f24345p = -1;
        this.f24347q = 0;
        this.f24348r = 0;
        this.f24349s = 0;
        this.f24350t = new int[2];
        this.f24351u = 0;
        this.f24352v = 0;
        this.f24353w = 1.0f;
        this.f24354x = 0;
        this.f24355y = 0;
        this.f24356z = 1.0f;
        this.f24292A = -1;
        this.f24293B = 1.0f;
        this.f24294C = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.f24295D = 0.0f;
        this.f24296E = false;
        this.f24297F = false;
        this.f24298G = 0;
        this.f24299H = 0;
        c cVar = new c(this, 2);
        this.f24300I = cVar;
        c cVar2 = new c(this, 3);
        this.f24301J = cVar2;
        c cVar3 = new c(this, 4);
        this.f24302K = cVar3;
        c cVar4 = new c(this, 5);
        this.f24303L = cVar4;
        c cVar5 = new c(this, 6);
        this.M = cVar5;
        c cVar6 = new c(this, 8);
        this.f24304N = cVar6;
        c cVar7 = new c(this, 9);
        this.f24305O = cVar7;
        c cVar8 = new c(this, 7);
        this.f24306P = cVar8;
        this.f24307Q = new c[]{cVar, cVar3, cVar2, cVar4, cVar5, cVar8};
        ArrayList arrayList = new ArrayList();
        this.f24308R = arrayList;
        this.f24309S = new boolean[2];
        this.f24346p0 = new int[]{1, 1};
        this.f24310T = null;
        this.f24311U = 0;
        this.f24312V = 0;
        this.f24313W = 0.0f;
        this.f24314X = -1;
        this.f24315Y = 0;
        this.f24316Z = 0;
        this.f24318a0 = 0;
        this.f24323d0 = 0.5f;
        this.f24325e0 = 0.5f;
        this.f24329g0 = 0;
        this.f24331h0 = null;
        this.f24332i0 = 0;
        this.f24334j0 = 0;
        this.f24336k0 = new float[]{-1.0f, -1.0f};
        this.f24338l0 = new d[]{null, null};
        this.f24340m0 = new d[]{null, null};
        this.f24342n0 = -1;
        this.f24344o0 = -1;
        arrayList.add(cVar);
        arrayList.add(cVar2);
        arrayList.add(cVar3);
        arrayList.add(cVar4);
        arrayList.add(cVar6);
        arrayList.add(cVar7);
        arrayList.add(cVar8);
        arrayList.add(cVar5);
    }

    public static void G(int i, int i3, String str, StringBuilder sb) {
        if (i == i3) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(i);
        sb.append(",\n");
    }

    public static void H(StringBuilder sb, String str, float f2, float f5) {
        if (f2 == f5) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(f2);
        sb.append(",\n");
    }

    public static void o(StringBuilder sb, String str, int i, int i3, int i6, int i7, int i8, float f2) {
        sb.append(str);
        sb.append(" :  {\n");
        G(i, 0, "      size", sb);
        G(i3, 0, "      min", sb);
        G(i6, Integer.MAX_VALUE, "      max", sb);
        G(i7, 0, "      matchMin", sb);
        G(i8, 0, "      matchDef", sb);
        H(sb, "      matchPercent", f2, 1.0f);
        sb.append("    },\n");
    }

    public static void p(StringBuilder sb, String str, c cVar) {
        if (cVar.f24289f == null) {
            return;
        }
        sb.append("    ");
        sb.append(str);
        sb.append(" : [ '");
        sb.append(cVar.f24289f);
        sb.append("'");
        if (cVar.f24291h != Integer.MIN_VALUE || cVar.f24290g != 0) {
            sb.append(",");
            sb.append(cVar.f24290g);
            if (cVar.f24291h != Integer.MIN_VALUE) {
                sb.append(",");
                sb.append(cVar.f24291h);
                sb.append(",");
            }
        }
        sb.append(" ] ,\n");
    }

    public boolean A() {
        if (this.f24335k) {
            return true;
        }
        return this.f24300I.f24286c && this.f24302K.f24286c;
    }

    public boolean B() {
        if (this.f24337l) {
            return true;
        }
        return this.f24301J.f24286c && this.f24303L.f24286c;
    }

    public void C() {
        this.f24300I.j();
        this.f24301J.j();
        this.f24302K.j();
        this.f24303L.j();
        this.M.j();
        this.f24304N.j();
        this.f24305O.j();
        this.f24306P.j();
        this.f24310T = null;
        this.f24295D = 0.0f;
        this.f24311U = 0;
        this.f24312V = 0;
        this.f24313W = 0.0f;
        this.f24314X = -1;
        this.f24315Y = 0;
        this.f24316Z = 0;
        this.f24318a0 = 0;
        this.b0 = 0;
        this.f24321c0 = 0;
        this.f24323d0 = 0.5f;
        this.f24325e0 = 0.5f;
        int[] iArr = this.f24346p0;
        iArr[0] = 1;
        iArr[1] = 1;
        this.f24327f0 = null;
        this.f24329g0 = 0;
        this.f24332i0 = 0;
        this.f24334j0 = 0;
        float[] fArr = this.f24336k0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f24343o = -1;
        this.f24345p = -1;
        int[] iArr2 = this.f24294C;
        iArr2[0] = Integer.MAX_VALUE;
        iArr2[1] = Integer.MAX_VALUE;
        this.f24348r = 0;
        this.f24349s = 0;
        this.f24353w = 1.0f;
        this.f24356z = 1.0f;
        this.f24352v = Integer.MAX_VALUE;
        this.f24355y = Integer.MAX_VALUE;
        this.f24351u = 0;
        this.f24354x = 0;
        this.f24292A = -1;
        this.f24293B = 1.0f;
        boolean[] zArr = this.f24326f;
        zArr[0] = true;
        zArr[1] = true;
        this.f24297F = false;
        boolean[] zArr2 = this.f24309S;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f24328g = true;
        int[] iArr3 = this.f24350t;
        iArr3[0] = 0;
        iArr3[1] = 0;
        this.f24330h = -1;
        this.i = -1;
    }

    public final void D() {
        d dVar = this.f24310T;
        if (dVar != null && (dVar instanceof e)) {
            ((e) dVar).getClass();
        }
        ArrayList arrayList = this.f24308R;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((c) arrayList.get(i)).j();
        }
    }

    public final void E() {
        this.f24335k = false;
        this.f24337l = false;
        this.f24339m = false;
        this.f24341n = false;
        ArrayList arrayList = this.f24308R;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            c cVar = (c) arrayList.get(i);
            cVar.f24286c = false;
            cVar.f24285b = 0;
        }
    }

    public void F(a1 a1Var) {
        this.f24300I.k();
        this.f24301J.k();
        this.f24302K.k();
        this.f24303L.k();
        this.M.k();
        this.f24306P.k();
        this.f24304N.k();
        this.f24305O.k();
    }

    public final void I(int i) {
        this.f24318a0 = i;
        this.f24296E = i > 0;
    }

    public final void J(int i, int i3) {
        if (this.f24335k) {
            return;
        }
        this.f24300I.l(i);
        this.f24302K.l(i3);
        this.f24315Y = i;
        this.f24311U = i3 - i;
        this.f24335k = true;
    }

    public final void K(int i, int i3) {
        if (this.f24337l) {
            return;
        }
        this.f24301J.l(i);
        this.f24303L.l(i3);
        this.f24316Z = i;
        this.f24312V = i3 - i;
        if (this.f24296E) {
            this.M.l(i + this.f24318a0);
        }
        this.f24337l = true;
    }

    public final void L(int i) {
        this.f24312V = i;
        int i3 = this.f24321c0;
        if (i < i3) {
            this.f24312V = i3;
        }
    }

    public final void M(int i) {
        this.f24346p0[0] = i;
    }

    public final void N(int i) {
        this.f24346p0[1] = i;
    }

    public final void O(int i) {
        this.f24311U = i;
        int i3 = this.b0;
        if (i < i3) {
            this.f24311U = i3;
        }
    }

    public void P(boolean z6, boolean z7) {
        int i;
        int i3;
        l lVar = this.f24322d;
        boolean z8 = z6 & lVar.f49g;
        n nVar = this.f24324e;
        boolean z9 = z7 & nVar.f49g;
        int i6 = lVar.f50h.f25g;
        int i7 = nVar.f50h.f25g;
        int i8 = lVar.i.f25g;
        int i9 = nVar.i.f25g;
        int i10 = i9 - i7;
        if (i8 - i6 < 0 || i10 < 0 || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE || i7 == Integer.MIN_VALUE || i7 == Integer.MAX_VALUE || i8 == Integer.MIN_VALUE || i8 == Integer.MAX_VALUE || i9 == Integer.MIN_VALUE || i9 == Integer.MAX_VALUE) {
            i8 = 0;
            i9 = 0;
            i6 = 0;
            i7 = 0;
        }
        int i11 = i8 - i6;
        int i12 = i9 - i7;
        if (z8) {
            this.f24315Y = i6;
        }
        if (z9) {
            this.f24316Z = i7;
        }
        if (this.f24329g0 == 8) {
            this.f24311U = 0;
            this.f24312V = 0;
            return;
        }
        int[] iArr = this.f24346p0;
        if (z8) {
            if (iArr[0] == 1 && i11 < (i3 = this.f24311U)) {
                i11 = i3;
            }
            this.f24311U = i11;
            int i13 = this.b0;
            if (i11 < i13) {
                this.f24311U = i13;
            }
        }
        if (z9) {
            if (iArr[1] == 1 && i12 < (i = this.f24312V)) {
                i12 = i;
            }
            this.f24312V = i12;
            int i14 = this.f24321c0;
            if (i12 < i14) {
                this.f24312V = i14;
            }
        }
    }

    public void Q(C2982c c2982c, boolean z6) {
        int i;
        int i3;
        n nVar;
        l lVar;
        c2982c.getClass();
        int iN = C2982c.n(this.f24300I);
        int iN2 = C2982c.n(this.f24301J);
        int iN3 = C2982c.n(this.f24302K);
        int iN4 = C2982c.n(this.f24303L);
        if (z6 && (lVar = this.f24322d) != null) {
            A.g gVar = lVar.f50h;
            if (gVar.f27j) {
                A.g gVar2 = lVar.i;
                if (gVar2.f27j) {
                    iN = gVar.f25g;
                    iN3 = gVar2.f25g;
                }
            }
        }
        if (z6 && (nVar = this.f24324e) != null) {
            A.g gVar3 = nVar.f50h;
            if (gVar3.f27j) {
                A.g gVar4 = nVar.i;
                if (gVar4.f27j) {
                    iN2 = gVar3.f25g;
                    iN4 = gVar4.f25g;
                }
            }
        }
        int i6 = iN4 - iN2;
        if (iN3 - iN < 0 || i6 < 0 || iN == Integer.MIN_VALUE || iN == Integer.MAX_VALUE || iN2 == Integer.MIN_VALUE || iN2 == Integer.MAX_VALUE || iN3 == Integer.MIN_VALUE || iN3 == Integer.MAX_VALUE || iN4 == Integer.MIN_VALUE || iN4 == Integer.MAX_VALUE) {
            iN = 0;
            iN2 = 0;
            iN3 = 0;
            iN4 = 0;
        }
        int i7 = iN3 - iN;
        int i8 = iN4 - iN2;
        this.f24315Y = iN;
        this.f24316Z = iN2;
        if (this.f24329g0 == 8) {
            this.f24311U = 0;
            this.f24312V = 0;
            return;
        }
        int[] iArr = this.f24346p0;
        int i9 = iArr[0];
        if (i9 == 1 && i7 < (i3 = this.f24311U)) {
            i7 = i3;
        }
        if (iArr[1] == 1 && i8 < (i = this.f24312V)) {
            i8 = i;
        }
        this.f24311U = i7;
        this.f24312V = i8;
        int i10 = this.f24321c0;
        if (i8 < i10) {
            this.f24312V = i10;
        }
        int i11 = this.b0;
        if (i7 < i11) {
            this.f24311U = i11;
        }
        int i12 = this.f24352v;
        if (i12 > 0 && i9 == 3) {
            this.f24311U = Math.min(this.f24311U, i12);
        }
        int i13 = this.f24355y;
        if (i13 > 0 && iArr[1] == 3) {
            this.f24312V = Math.min(this.f24312V, i13);
        }
        int i14 = this.f24311U;
        if (i7 != i14) {
            this.f24330h = i14;
        }
        int i15 = this.f24312V;
        if (i8 != i15) {
            this.i = i15;
        }
    }

    public final void a(e eVar, C2982c c2982c, HashSet hashSet, int i, boolean z6) {
        if (z6) {
            if (!hashSet.contains(this)) {
                return;
            }
            j.b(eVar, c2982c, this);
            hashSet.remove(this);
            b(c2982c, eVar.W(64));
        }
        if (i == 0) {
            HashSet hashSet2 = this.f24300I.f24284a;
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ((c) it.next()).f24287d.a(eVar, c2982c, hashSet, i, true);
                }
            }
            HashSet hashSet3 = this.f24302K.f24284a;
            if (hashSet3 != null) {
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    ((c) it2.next()).f24287d.a(eVar, c2982c, hashSet, i, true);
                }
                return;
            }
            return;
        }
        HashSet hashSet4 = this.f24301J.f24284a;
        if (hashSet4 != null) {
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                ((c) it3.next()).f24287d.a(eVar, c2982c, hashSet, i, true);
            }
        }
        HashSet hashSet5 = this.f24303L.f24284a;
        if (hashSet5 != null) {
            Iterator it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                ((c) it4.next()).f24287d.a(eVar, c2982c, hashSet, i, true);
            }
        }
        HashSet hashSet6 = this.M.f24284a;
        if (hashSet6 != null) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                ((c) it5.next()).f24287d.a(eVar, c2982c, hashSet, i, true);
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
    /* JADX WARN: Type inference failed for: r58v0, types: [z.d] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(x.C2982c r59, boolean r60) {
        /*
            Method dump skipped, instructions count: 1912
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z.d.b(x.c, boolean):void");
    }

    public boolean c() {
        return this.f24329g0 != 8;
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
    public final void d(x.C2982c r30, boolean r31, boolean r32, boolean r33, boolean r34, x.C2985f r35, x.C2985f r36, int r37, boolean r38, z.c r39, z.c r40, int r41, int r42, int r43, int r44, float r45, boolean r46, boolean r47, boolean r48, boolean r49, boolean r50, int r51, int r52, int r53, int r54, float r55, boolean r56) {
        /*
            Method dump skipped, instructions count: 1323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z.d.d(x.c, boolean, boolean, boolean, boolean, x.f, x.f, int, boolean, z.c, z.c, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    public final void e(int i, d dVar, int i3, int i6) {
        boolean z6;
        if (i == 7) {
            if (i3 != 7) {
                if (i3 == 2 || i3 == 4) {
                    e(2, dVar, i3, 0);
                    e(4, dVar, i3, 0);
                    i(7).a(dVar.i(i3), 0);
                    return;
                } else {
                    if (i3 == 3 || i3 == 5) {
                        e(3, dVar, i3, 0);
                        e(5, dVar, i3, 0);
                        i(7).a(dVar.i(i3), 0);
                        return;
                    }
                    return;
                }
            }
            c cVarI = i(2);
            c cVarI2 = i(4);
            c cVarI3 = i(3);
            c cVarI4 = i(5);
            boolean z7 = true;
            if ((cVarI == null || !cVarI.h()) && (cVarI2 == null || !cVarI2.h())) {
                e(2, dVar, 2, 0);
                e(4, dVar, 4, 0);
                z6 = true;
            } else {
                z6 = false;
            }
            if ((cVarI3 == null || !cVarI3.h()) && (cVarI4 == null || !cVarI4.h())) {
                e(3, dVar, 3, 0);
                e(5, dVar, 5, 0);
            } else {
                z7 = false;
            }
            if (z6 && z7) {
                i(7).a(dVar.i(7), 0);
                return;
            } else if (z6) {
                i(8).a(dVar.i(8), 0);
                return;
            } else {
                if (z7) {
                    i(9).a(dVar.i(9), 0);
                    return;
                }
                return;
            }
        }
        if (i == 8 && (i3 == 2 || i3 == 4)) {
            c cVarI5 = i(2);
            c cVarI6 = dVar.i(i3);
            c cVarI7 = i(4);
            cVarI5.a(cVarI6, 0);
            cVarI7.a(cVarI6, 0);
            i(8).a(cVarI6, 0);
            return;
        }
        if (i == 9 && (i3 == 3 || i3 == 5)) {
            c cVarI8 = dVar.i(i3);
            i(3).a(cVarI8, 0);
            i(5).a(cVarI8, 0);
            i(9).a(cVarI8, 0);
            return;
        }
        if (i == 8 && i3 == 8) {
            i(2).a(dVar.i(2), 0);
            i(4).a(dVar.i(4), 0);
            i(8).a(dVar.i(i3), 0);
            return;
        }
        if (i == 9 && i3 == 9) {
            i(3).a(dVar.i(3), 0);
            i(5).a(dVar.i(5), 0);
            i(9).a(dVar.i(i3), 0);
            return;
        }
        c cVarI9 = i(i);
        c cVarI10 = dVar.i(i3);
        if (cVarI9.i(cVarI10)) {
            if (i == 6) {
                c cVarI11 = i(3);
                c cVarI12 = i(5);
                if (cVarI11 != null) {
                    cVarI11.j();
                }
                if (cVarI12 != null) {
                    cVarI12.j();
                }
            } else if (i == 3 || i == 5) {
                c cVarI13 = i(6);
                if (cVarI13 != null) {
                    cVarI13.j();
                }
                c cVarI14 = i(7);
                if (cVarI14.f24289f != cVarI10) {
                    cVarI14.j();
                }
                c cVarF = i(i).f();
                c cVarI15 = i(9);
                if (cVarI15.h()) {
                    cVarF.j();
                    cVarI15.j();
                }
            } else if (i == 2 || i == 4) {
                c cVarI16 = i(7);
                if (cVarI16.f24289f != cVarI10) {
                    cVarI16.j();
                }
                c cVarF2 = i(i).f();
                c cVarI17 = i(8);
                if (cVarI17.h()) {
                    cVarF2.j();
                    cVarI17.j();
                }
            }
            cVarI9.a(cVarI10, i6);
        }
    }

    public final void f(c cVar, c cVar2, int i) {
        if (cVar.f24287d == this) {
            e(cVar.f24288e, cVar2.f24287d, cVar2.f24288e, i);
        }
    }

    public final void g(C2982c c2982c) {
        c2982c.k(this.f24300I);
        c2982c.k(this.f24301J);
        c2982c.k(this.f24302K);
        c2982c.k(this.f24303L);
        if (this.f24318a0 > 0) {
            c2982c.k(this.M);
        }
    }

    public final void h() {
        if (this.f24322d == null) {
            l lVar = new l(this);
            lVar.f50h.f23e = 4;
            lVar.i.f23e = 5;
            lVar.f48f = 0;
            this.f24322d = lVar;
        }
        if (this.f24324e == null) {
            n nVar = new n(this);
            A.g gVar = new A.g(nVar);
            nVar.f35k = gVar;
            nVar.f36l = null;
            nVar.f50h.f23e = 6;
            nVar.i.f23e = 7;
            gVar.f23e = 8;
            nVar.f48f = 1;
            this.f24324e = nVar;
        }
    }

    public c i(int i) {
        switch (AbstractC2984e.c(i)) {
            case 0:
                return null;
            case 1:
                return this.f24300I;
            case 2:
                return this.f24301J;
            case 3:
                return this.f24302K;
            case 4:
                return this.f24303L;
            case 5:
                return this.M;
            case 6:
                return this.f24306P;
            case 7:
                return this.f24304N;
            case 8:
                return this.f24305O;
            default:
                throw new AssertionError(AbstractC2763b.i(i));
        }
    }

    public final int j(int i) {
        int[] iArr = this.f24346p0;
        if (i == 0) {
            return iArr[0];
        }
        if (i == 1) {
            return iArr[1];
        }
        return 0;
    }

    public final int k() {
        if (this.f24329g0 == 8) {
            return 0;
        }
        return this.f24312V;
    }

    public final d l(int i) {
        c cVar;
        c cVar2;
        if (i != 0) {
            if (i == 1 && (cVar2 = (cVar = this.f24303L).f24289f) != null && cVar2.f24289f == cVar) {
                return cVar2.f24287d;
            }
            return null;
        }
        c cVar3 = this.f24302K;
        c cVar4 = cVar3.f24289f;
        if (cVar4 == null || cVar4.f24289f != cVar3) {
            return null;
        }
        return cVar4.f24287d;
    }

    public final d m(int i) {
        c cVar;
        c cVar2;
        if (i != 0) {
            if (i == 1 && (cVar2 = (cVar = this.f24301J).f24289f) != null && cVar2.f24289f == cVar) {
                return cVar2.f24287d;
            }
            return null;
        }
        c cVar3 = this.f24300I;
        c cVar4 = cVar3.f24289f;
        if (cVar4 == null || cVar4.f24289f != cVar3) {
            return null;
        }
        return cVar4.f24287d;
    }

    public void n(StringBuilder sb) {
        sb.append("  " + this.f24333j + ":{\n");
        StringBuilder sb2 = new StringBuilder("    actualWidth:");
        sb2.append(this.f24311U);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("    actualHeight:" + this.f24312V);
        sb.append("\n");
        sb.append("    actualLeft:" + this.f24315Y);
        sb.append("\n");
        sb.append("    actualTop:" + this.f24316Z);
        sb.append("\n");
        p(sb, "left", this.f24300I);
        p(sb, "top", this.f24301J);
        p(sb, "right", this.f24302K);
        p(sb, "bottom", this.f24303L);
        p(sb, "baseline", this.M);
        p(sb, "centerX", this.f24304N);
        p(sb, "centerY", this.f24305O);
        int i = this.f24311U;
        int i3 = this.b0;
        int[] iArr = this.f24294C;
        int i6 = iArr[0];
        int i7 = this.f24351u;
        int i8 = this.f24348r;
        float f2 = this.f24353w;
        float[] fArr = this.f24336k0;
        float f5 = fArr[0];
        o(sb, "    width", i, i3, i6, i7, i8, f2);
        int i9 = this.f24312V;
        int i10 = this.f24321c0;
        int i11 = iArr[1];
        int i12 = this.f24354x;
        int i13 = this.f24349s;
        float f6 = this.f24356z;
        float f7 = fArr[1];
        o(sb, "    height", i9, i10, i11, i12, i13, f6);
        float f8 = this.f24313W;
        int i14 = this.f24314X;
        if (f8 != 0.0f) {
            sb.append("    dimensionRatio");
            sb.append(" :  [");
            sb.append(f8);
            sb.append(",");
            sb.append(i14);
            sb.append("");
            sb.append("],\n");
        }
        H(sb, "    horizontalBias", this.f24323d0, 0.5f);
        H(sb, "    verticalBias", this.f24325e0, 0.5f);
        G(this.f24332i0, 0, "    horizontalChainStyle", sb);
        G(this.f24334j0, 0, "    verticalChainStyle", sb);
        sb.append("  }");
    }

    public final int q() {
        if (this.f24329g0 == 8) {
            return 0;
        }
        return this.f24311U;
    }

    public final int r() {
        d dVar = this.f24310T;
        return (dVar == null || !(dVar instanceof e)) ? this.f24315Y : ((e) dVar).f24375x0 + this.f24315Y;
    }

    public final int s() {
        d dVar = this.f24310T;
        return (dVar == null || !(dVar instanceof e)) ? this.f24316Z : ((e) dVar).f24376y0 + this.f24316Z;
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
            z.c r5 = r4.f24300I
            z.c r5 = r5.f24289f
            if (r5 == 0) goto Ld
            r5 = r2
            goto Le
        Ld:
            r5 = r1
        Le:
            z.c r3 = r4.f24302K
            z.c r3 = r3.f24289f
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
            z.c r5 = r4.f24301J
            z.c r5 = r5.f24289f
            if (r5 == 0) goto L23
            r5 = r2
            goto L24
        L23:
            r5 = r1
        L24:
            z.c r3 = r4.f24303L
            z.c r3 = r3.f24289f
            if (r3 == 0) goto L2c
            r3 = r2
            goto L2d
        L2c:
            r3 = r1
        L2d:
            int r5 = r5 + r3
            z.c r3 = r4.M
            z.c r3 = r3.f24289f
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
        throw new UnsupportedOperationException("Method not decompiled: z.d.t(int):boolean");
    }

    public String toString() {
        StringBuilder sbA = AbstractC2984e.a("");
        sbA.append(this.f24331h0 != null ? A.f.p(new StringBuilder("id: "), this.f24331h0, " ") : "");
        sbA.append("(");
        sbA.append(this.f24315Y);
        sbA.append(", ");
        sbA.append(this.f24316Z);
        sbA.append(") - (");
        sbA.append(this.f24311U);
        sbA.append(" x ");
        return AbstractC2763b.d(this.f24312V, ")", sbA);
    }

    public final boolean u(int i, int i3) {
        c cVar;
        c cVar2;
        c cVar3;
        c cVar4;
        if (i == 0) {
            c cVar5 = this.f24300I;
            c cVar6 = cVar5.f24289f;
            if (cVar6 == null || !cVar6.f24286c || (cVar4 = (cVar3 = this.f24302K).f24289f) == null || !cVar4.f24286c) {
                return false;
            }
            return (cVar4.d() - cVar3.e()) - (cVar5.e() + cVar5.f24289f.d()) >= i3;
        }
        c cVar7 = this.f24301J;
        c cVar8 = cVar7.f24289f;
        if (cVar8 == null || !cVar8.f24286c || (cVar2 = (cVar = this.f24303L).f24289f) == null || !cVar2.f24286c) {
            return false;
        }
        return (cVar2.d() - cVar.e()) - (cVar7.e() + cVar7.f24289f.d()) >= i3;
    }

    public final void v(int i, int i3, int i6, int i7, d dVar) {
        i(i).b(dVar.i(i3), i6, i7, true);
    }

    public final boolean w(int i) {
        c cVar;
        c cVar2;
        int i3 = i * 2;
        c[] cVarArr = this.f24307Q;
        c cVar3 = cVarArr[i3];
        c cVar4 = cVar3.f24289f;
        return (cVar4 == null || cVar4.f24289f == cVar3 || (cVar2 = (cVar = cVarArr[i3 + 1]).f24289f) == null || cVar2.f24289f != cVar) ? false : true;
    }

    public final boolean x() {
        c cVar = this.f24300I;
        c cVar2 = cVar.f24289f;
        if (cVar2 != null && cVar2.f24289f == cVar) {
            return true;
        }
        c cVar3 = this.f24302K;
        c cVar4 = cVar3.f24289f;
        return cVar4 != null && cVar4.f24289f == cVar3;
    }

    public final boolean y() {
        c cVar = this.f24301J;
        c cVar2 = cVar.f24289f;
        if (cVar2 != null && cVar2.f24289f == cVar) {
            return true;
        }
        c cVar3 = this.f24303L;
        c cVar4 = cVar3.f24289f;
        return cVar4 != null && cVar4.f24289f == cVar3;
    }

    public final boolean z() {
        return this.f24328g && this.f24329g0 != 8;
    }
}
