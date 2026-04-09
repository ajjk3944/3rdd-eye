package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;

/* renamed from: com.google.android.gms.internal.ads.fO, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1154fO {

    /* renamed from: a, reason: collision with root package name */
    public final Object f14065a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f14066b;

    /* renamed from: c, reason: collision with root package name */
    public final MQ[] f14067c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f14068d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f14069e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f14070f;

    /* renamed from: g, reason: collision with root package name */
    public C1209gO f14071g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f14072h;
    public final boolean[] i;

    /* renamed from: j, reason: collision with root package name */
    public final PP[] f14073j;

    /* renamed from: k, reason: collision with root package name */
    public final C0911b f14074k;

    /* renamed from: l, reason: collision with root package name */
    public final G3.q f14075l;

    /* renamed from: m, reason: collision with root package name */
    public C1154fO f14076m;

    /* renamed from: n, reason: collision with root package name */
    public SQ f14077n;

    /* renamed from: o, reason: collision with root package name */
    public C1184g f14078o;

    /* renamed from: p, reason: collision with root package name */
    public long f14079p;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [com.google.android.gms.internal.ads.ZP] */
    public C1154fO(PP[] ppArr, long j6, C0911b c0911b, InterfaceC1292i interfaceC1292i, G3.q qVar, C1209gO c1209gO, C1184g c1184g) {
        this.f14073j = ppArr;
        this.f14079p = j6;
        this.f14074k = c0911b;
        this.f14075l = qVar;
        C1749qQ c1749qQ = c1209gO.f14261a;
        this.f14066b = c1749qQ.f16374a;
        this.f14071g = c1209gO;
        this.f14077n = SQ.f11183d;
        this.f14078o = c1184g;
        this.f14067c = new MQ[2];
        this.i = new boolean[2];
        long j7 = c1209gO.f14262b;
        long j8 = c1209gO.f14264d;
        qVar.getClass();
        int i = C2016vO.f17263k;
        Pair pair = (Pair) c1749qQ.f16374a;
        Object obj = pair.first;
        C1749qQ c1749qQA = c1749qQ.a(pair.second);
        C1585nO c1585nO = (C1585nO) ((HashMap) qVar.f1640e).get(obj);
        c1585nO.getClass();
        ((HashSet) qVar.f1643h).add(c1585nO);
        C1531mO c1531mO = (C1531mO) ((HashMap) qVar.f1642g).get(c1585nO);
        if (c1531mO != null) {
            c1531mO.f15615a.o(c1531mO.f15616b);
        }
        c1585nO.f15773c.add(c1749qQA);
        C1371jQ c1371jQC = c1585nO.f15771a.c(c1749qQA, interfaceC1292i, j7);
        ((IdentityHashMap) qVar.f1639d).put(c1371jQC, c1585nO);
        qVar.m();
        this.f14065a = j8 != -9223372036854775807L ? new ZP(c1371jQC, j8) : c1371jQC;
    }

    public final long a() {
        return this.f14071g.f14262b + this.f14079p;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.google.android.gms.internal.ads.NQ, java.lang.Object] */
    public final boolean b() {
        if (this.f14069e) {
            return !this.f14070f || this.f14065a.j() == Long.MIN_VALUE;
        }
        return false;
    }

    public final boolean c() {
        if (this.f14069e) {
            return b() || d() - this.f14071g.f14262b >= -9223372036854775807L;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.google.android.gms.internal.ads.NQ, java.lang.Object] */
    public final long d() {
        if (!this.f14069e) {
            return this.f14071g.f14262b;
        }
        long j6 = this.f14070f ? this.f14065a.j() : Long.MIN_VALUE;
        return j6 == Long.MIN_VALUE ? this.f14071g.f14265e : j6;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.pQ, java.lang.Object] */
    public final void e(AbstractC1353j8 abstractC1353j8) {
        this.f14069e = true;
        this.f14077n = this.f14065a.m();
        C1184g c1184gF = f(abstractC1353j8);
        C1209gO c1209gO = this.f14071g;
        long jMax = c1209gO.f14262b;
        long j6 = c1209gO.f14265e;
        if (j6 != -9223372036854775807L && jMax >= j6) {
            jMax = Math.max(0L, j6 - 1);
        }
        long jG = g(c1184gF, jMax, false, new boolean[2]);
        long j7 = this.f14079p;
        C1209gO c1209gO2 = this.f14071g;
        this.f14079p = (c1209gO2.f14262b - jG) + j7;
        this.f14071g = c1209gO2.a(jG);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0259  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.C1184g f(com.google.android.gms.internal.ads.AbstractC1353j8 r34) {
        /*
            Method dump skipped, instructions count: 2107
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1154fO.f(com.google.android.gms.internal.ads.j8):com.google.android.gms.internal.ads.g");
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [com.google.android.gms.internal.ads.pQ, java.lang.Object] */
    public final long g(C1184g c1184g, long j6, boolean z6, boolean[] zArr) {
        PP[] ppArr;
        int i = 0;
        while (true) {
            boolean z7 = true;
            if (i >= c1184g.f14179a) {
                break;
            }
            if (z6 || !c1184g.d(this.f14078o, i)) {
                z7 = false;
            }
            this.i[i] = z7;
            i++;
        }
        int i3 = 0;
        while (true) {
            ppArr = this.f14073j;
            if (i3 >= 2) {
                break;
            }
            ppArr[i3].getClass();
            i3++;
        }
        l();
        this.f14078o = c1184g;
        if (this.f14076m == null) {
            int i6 = 0;
            while (true) {
                C1184g c1184g2 = this.f14078o;
                if (i6 >= c1184g2.f14179a) {
                    break;
                }
                c1184g2.c(i6);
                InterfaceC1020d interfaceC1020d = ((InterfaceC1020d[]) this.f14078o.f14181c)[i6];
                i6++;
            }
        }
        InterfaceC1020d[] interfaceC1020dArr = (InterfaceC1020d[]) c1184g.f14181c;
        ?? r52 = this.f14065a;
        boolean[] zArr2 = this.i;
        MQ[] mqArr = this.f14067c;
        long jB = r52.b(interfaceC1020dArr, zArr2, mqArr, zArr, j6);
        for (int i7 = 0; i7 < 2; i7++) {
            ppArr[i7].getClass();
        }
        this.f14070f = false;
        for (int i8 = 0; i8 < 2; i8++) {
            if (mqArr[i8] != null) {
                AbstractC0582Jp.h0(c1184g.c(i8));
                ppArr[i8].getClass();
                this.f14070f = true;
            } else {
                AbstractC0582Jp.h0(interfaceC1020dArr[i8] == null);
            }
        }
        return jB;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.pQ, java.lang.Object] */
    public final void h() {
        l();
        ?? r02 = this.f14065a;
        try {
            boolean z6 = r02 instanceof ZP;
            G3.q qVar = this.f14075l;
            if (z6) {
                qVar.g(((ZP) r02).f12889a);
            } else {
                qVar.g(r02);
            }
        } catch (RuntimeException e6) {
            AbstractC2022vd.K("MediaPeriodHolder", "Period release failed.", e6);
        }
    }

    public final C1154fO i() {
        return this.f14076m;
    }

    public final SQ j() {
        return this.f14077n;
    }

    public final C1184g k() {
        return this.f14078o;
    }

    public final void l() {
        if (this.f14076m != null) {
            return;
        }
        int i = 0;
        while (true) {
            C1184g c1184g = this.f14078o;
            if (i >= c1184g.f14179a) {
                return;
            }
            c1184g.c(i);
            InterfaceC1020d interfaceC1020d = ((InterfaceC1020d[]) this.f14078o.f14181c)[i];
            i++;
        }
    }
}
