package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1884t0 implements InterfaceC2208z0 {

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f16832c = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};

    /* renamed from: d, reason: collision with root package name */
    public static final C0889ae f16833d = new C0889ae(C1994v2.f17216n);

    /* renamed from: e, reason: collision with root package name */
    public static final C0889ae f16834e = new C0889ae(C1994v2.f17215m);

    /* renamed from: a, reason: collision with root package name */
    public C1197gC f16835a;

    /* renamed from: b, reason: collision with root package name */
    public final C1994v2 f16836b = new C1994v2(19);

    public final void a(int i, ArrayList arrayList) {
        C1994v2 c1994v2 = this.f16836b;
        switch (i) {
            case 0:
                arrayList.add(new G2(1));
                break;
            case 1:
                arrayList.add(new G2(2));
                break;
            case 2:
                arrayList.add(new D3());
                break;
            case 3:
                arrayList.add(new W0());
                break;
            case 4:
                InterfaceC1992v0 interfaceC1992v0G = f16833d.g(0);
                if (interfaceC1992v0G == null) {
                    arrayList.add(new C1294i1());
                    break;
                } else {
                    arrayList.add(interfaceC1992v0G);
                    break;
                }
            case 5:
                arrayList.add(new C1400k1());
                break;
            case 6:
                arrayList.add(new V1(new R1(), 0, c1994v2));
                break;
            case 7:
                arrayList.add(new Z1());
                break;
            case 8:
                arrayList.add(new C1725q2(c1994v2, 0, C1197gC.f14227e));
                arrayList.add(new C1940u2(c1994v2, 0));
                break;
            case 9:
                arrayList.add(new G2(0));
                break;
            case 10:
                arrayList.add(new C0861a4());
                break;
            case 11:
                if (this.f16835a == null) {
                    JB jb = LB.f9635b;
                    this.f16835a = C1197gC.f14227e;
                }
                C2038vt c2038vt = new C2038vt();
                C1197gC c1197gC = this.f16835a;
                F3 f32 = new F3();
                f32.f8064a = c1197gC;
                arrayList.add(new C1079e4(c1994v2, c2038vt, f32));
                break;
            case 12:
                C1457l4 c1457l4 = new C1457l4();
                c1457l4.f15344c = 0;
                c1457l4.f15345d = -1L;
                c1457l4.f15347f = -1;
                c1457l4.f15348g = -1L;
                arrayList.add(c1457l4);
                break;
            case 14:
                arrayList.add(new C1670p1(1));
                break;
            case 15:
                InterfaceC1992v0 interfaceC1992v0G2 = f16834e.g(new Object[0]);
                if (interfaceC1992v0G2 != null) {
                    arrayList.add(interfaceC1992v0G2);
                    break;
                }
                break;
            case 16:
                arrayList.add(new Y0(c1994v2));
                break;
            case 17:
                arrayList.add(new C1186g1(1));
                break;
            case 18:
                arrayList.add(new C1131f1(1));
                break;
            case 19:
                arrayList.add(new C1186g1(0));
                break;
            case 20:
                arrayList.add(new C1670p1(0));
                break;
            case 21:
                arrayList.add(new C1131f1(0));
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x020a  */
    @Override // com.google.android.gms.internal.ads.InterfaceC2208z0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized com.google.android.gms.internal.ads.InterfaceC1992v0[] c(android.net.Uri r27, java.util.Map r28) {
        /*
            Method dump skipped, instructions count: 1182
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1884t0.c(android.net.Uri, java.util.Map):com.google.android.gms.internal.ads.v0[]");
    }
}
