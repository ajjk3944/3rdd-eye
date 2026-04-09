package com.google.android.gms.internal.ads;

import f4.InterfaceFutureC2326a;
import java.util.ArrayList;
import q2.C2841s;

/* renamed from: com.google.android.gms.internal.ads.fu, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1178fu {

    /* renamed from: a, reason: collision with root package name */
    public final Qt f14169a;

    /* renamed from: b, reason: collision with root package name */
    public final St f14170b;

    /* renamed from: c, reason: collision with root package name */
    public final C2202yv f14171c;

    /* renamed from: d, reason: collision with root package name */
    public final C2094wv f14172d;

    /* renamed from: e, reason: collision with root package name */
    public final Xu f14173e;

    /* renamed from: f, reason: collision with root package name */
    public final C2189yi f14174f;

    public C1178fu(C2202yv c2202yv, C2094wv c2094wv, Qt qt, St st, C2189yi c2189yi, Xu xu) {
        this.f14169a = qt;
        this.f14170b = st;
        this.f14171c = c2202yv;
        this.f14172d = c2094wv;
        this.f14174f = c2189yi;
        this.f14173e = xu;
    }

    public final void a(ArrayList arrayList, C0560Ik c0560Ik) {
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str = (String) obj;
            Qt qt = this.f14169a;
            if (qt.f10772i0) {
                String str2 = this.f14170b.f11269b;
                C2094wv c2094wv = this.f14172d;
                c2094wv.getClass();
                p2.j.f22785C.f22797k.getClass();
                N4 n42 = new N4(System.currentTimeMillis(), str2, str, 2);
                C0633Mp c0633Mp = c2094wv.f17517a;
                c0633Mp.getClass();
                c0633Mp.a(new C0889ae(c0633Mp, 25, n42));
            } else {
                Xu xu = this.f14173e;
                this.f14171c.b(str, qt.f10801x0, xu, c0560Ik);
            }
        }
    }

    public final void b(int i, ArrayList arrayList) {
        InterfaceFutureC2326a interfaceFutureC2326aE;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            String str = (String) obj;
            if (((Boolean) C2841s.f23267e.f23270c.a(H9.mb)).booleanValue() && C2189yi.b(str)) {
                interfaceFutureC2326aE = this.f14174f.a(str, q2.r.f23260g.f23265e);
            } else {
                interfaceFutureC2326aE = AbstractC1984ut.e(str);
            }
            L2.w wVar = new L2.w(i, 10, this);
            interfaceFutureC2326aE.a(new CD(interfaceFutureC2326aE, 0, wVar), AbstractC0640Nf.f10005a);
        }
    }
}
