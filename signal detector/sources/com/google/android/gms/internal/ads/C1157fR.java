package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.ads.fR, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1157fR extends AbstractC1102eR {

    /* renamed from: C, reason: collision with root package name */
    public final int f14084C;

    /* renamed from: D, reason: collision with root package name */
    public final int f14085D;

    /* renamed from: E, reason: collision with root package name */
    public final boolean f14086E;

    /* renamed from: F, reason: collision with root package name */
    public final int f14087F;

    /* renamed from: G, reason: collision with root package name */
    public final int f14088G;

    /* renamed from: H, reason: collision with root package name */
    public final boolean f14089H;

    /* renamed from: I, reason: collision with root package name */
    public final boolean f14090I;

    /* renamed from: J, reason: collision with root package name */
    public final int f14091J;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f14092e;

    /* renamed from: f, reason: collision with root package name */
    public final C0884aR f14093f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f14094g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f14095h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final int f14096j;

    /* renamed from: k, reason: collision with root package name */
    public final int f14097k;

    /* renamed from: l, reason: collision with root package name */
    public final int f14098l;

    /* renamed from: m, reason: collision with root package name */
    public final int f14099m;

    /* renamed from: n, reason: collision with root package name */
    public final int f14100n;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:100:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1157fR(int r8, com.google.android.gms.internal.ads.C2108x8 r9, int r10, com.google.android.gms.internal.ads.C0884aR r11, int r12, java.lang.String r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 460
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1157fR.<init>(int, com.google.android.gms.internal.ads.x8, int, com.google.android.gms.internal.ads.aR, int, java.lang.String, boolean):void");
    }

    public static int c(C1157fR c1157fR, C1157fR c1157fR2) {
        EB ebD = EB.f7923a.d(c1157fR.f14095h, c1157fR2.f14095h);
        Integer numValueOf = Integer.valueOf(c1157fR.f14099m);
        Integer numValueOf2 = Integer.valueOf(c1157fR2.f14099m);
        C1033dC c1033dC = C1033dC.f13742c;
        EB ebA = ebD.a(numValueOf, numValueOf2, c1033dC).b(c1157fR.f14100n, c1157fR2.f14100n).b(c1157fR.f14084C, c1157fR2.f14084C).a(Integer.valueOf(c1157fR.f14085D), Integer.valueOf(c1157fR2.f14085D), c1033dC).d(c1157fR.f14086E, c1157fR2.f14086E).b(c1157fR.f14087F, c1157fR2.f14087F).d(c1157fR.i, c1157fR2.i).d(c1157fR.f14092e, c1157fR2.f14092e).d(c1157fR.f14094g, c1157fR2.f14094g).a(Integer.valueOf(c1157fR.f14098l), Integer.valueOf(c1157fR2.f14098l), c1033dC);
        boolean z6 = c1157fR.f14089H;
        EB ebD2 = ebA.d(z6, c1157fR2.f14089H);
        boolean z7 = c1157fR.f14090I;
        EB ebD3 = ebD2.d(z7, c1157fR2.f14090I);
        if (z6 && z7) {
            ebD3 = ebD3.b(c1157fR.f14091J, c1157fR2.f14091J);
        }
        return ebD3.e();
    }

    public static int d(C1157fR c1157fR, C1157fR c1157fR2) {
        Comparator c1573nC = (c1157fR.f14092e && c1157fR.f14095h) ? C0911b.f13269k : new C1573nC();
        c1157fR.f14093f.getClass();
        return CB.f(c1573nC.compare(Integer.valueOf(c1157fR.f14097k), Integer.valueOf(c1157fR2.f14097k))).a(Integer.valueOf(c1157fR.f14096j), Integer.valueOf(c1157fR2.f14096j), c1573nC).e();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1102eR
    public final int a() {
        return this.f14088G;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1102eR
    public final /* bridge */ /* synthetic */ boolean b(AbstractC1102eR abstractC1102eR) {
        C1157fR c1157fR = (C1157fR) abstractC1102eR;
        if (!Objects.equals(this.f13905d.f11397m, c1157fR.f13905d.f11397m)) {
            return false;
        }
        this.f14093f.getClass();
        return this.f14089H == c1157fR.f14089H && this.f14090I == c1157fR.f14090I;
    }
}
