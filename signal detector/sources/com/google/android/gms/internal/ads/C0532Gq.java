package com.google.android.gms.internal.ads;

import android.content.Context;
import f4.InterfaceFutureC2326a;
import q2.C2841s;
import u2.C2951a;

/* renamed from: com.google.android.gms.internal.ads.Gq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0532Gq implements InterfaceC0956bq {

    /* renamed from: a, reason: collision with root package name */
    public final C0693Qh f8446a;

    /* renamed from: b, reason: collision with root package name */
    public final ID f8447b;

    /* renamed from: c, reason: collision with root package name */
    public final C1431kf f8448c;

    /* renamed from: d, reason: collision with root package name */
    public final C1446ku f8449d;

    /* renamed from: e, reason: collision with root package name */
    public final C1709pn f8450e;

    /* renamed from: f, reason: collision with root package name */
    public final C0750Tn f8451f;

    /* renamed from: g, reason: collision with root package name */
    public final C2951a f8452g;

    /* renamed from: h, reason: collision with root package name */
    public final Context f8453h;

    public C0532Gq(C0693Qh c0693Qh, ID id, C1431kf c1431kf, C1446ku c1446ku, C1709pn c1709pn, C0750Tn c0750Tn, C2951a c2951a, Context context, W9 w9) {
        this.f8452g = c2951a;
        this.f8453h = context;
        this.f8446a = c0693Qh;
        this.f8447b = id;
        this.f8448c = c1431kf;
        this.f8449d = c1446ku;
        this.f8450e = c1709pn;
        this.f8451f = c0750Tn;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0956bq
    public final boolean a(Xt xt, Qt qt) {
        Ut ut = qt.f10791s;
        return (ut == null || ut.f11813c == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0956bq
    public final InterfaceFutureC2326a b(Xt xt, Qt qt) {
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8578D2)).booleanValue()) {
            A.f.r(p2.j.f22785C.f22797k, this.f8451f.f11461e, "rendering-native-ads-native-js-webview-start");
        }
        InterfaceFutureC2326a interfaceFutureC2326aB = this.f8449d.b();
        C0467Dc c0467Dc = new C0467Dc(this, 11, qt);
        ID id = this.f8447b;
        return AbstractC1984ut.F(AbstractC1984ut.F(interfaceFutureC2326aB, c0467Dc, id), new C2028vj(this, xt, qt, 8), id);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x039d A[EDGE_INSN: B:173:0x039d->B:107:0x039d BREAK  A[LOOP:0: B:109:0x03a1->B:121:0x0401], PHI: r26
  0x039d: PHI (r26v5 com.google.android.gms.internal.ads.Tn) = 
  (r26v4 com.google.android.gms.internal.ads.Tn)
  (r26v4 com.google.android.gms.internal.ads.Tn)
  (r26v4 com.google.android.gms.internal.ads.Tn)
  (r26v4 com.google.android.gms.internal.ads.Tn)
  (r26v7 com.google.android.gms.internal.ads.Tn)
  (r26v7 com.google.android.gms.internal.ads.Tn)
  (r26v7 com.google.android.gms.internal.ads.Tn)
 binds: [B:100:0x0383, B:102:0x0389, B:104:0x0395, B:106:0x039b, B:173:0x039d, B:170:0x039d, B:116:0x03c5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x039d A[PHI: r26
  0x039d: PHI (r26v5 com.google.android.gms.internal.ads.Tn) = 
  (r26v4 com.google.android.gms.internal.ads.Tn)
  (r26v4 com.google.android.gms.internal.ads.Tn)
  (r26v4 com.google.android.gms.internal.ads.Tn)
  (r26v4 com.google.android.gms.internal.ads.Tn)
  (r26v7 com.google.android.gms.internal.ads.Tn)
  (r26v7 com.google.android.gms.internal.ads.Tn)
  (r26v7 com.google.android.gms.internal.ads.Tn)
 binds: [B:100:0x0383, B:102:0x0389, B:104:0x0395, B:106:0x039b, B:173:0x039d, B:170:0x039d, B:116:0x03c5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0362  */
    /* JADX WARN: Type inference failed for: r6v61, types: [com.google.android.gms.internal.ads.Of, f4.a] */
    /* JADX WARN: Type inference failed for: r7v27, types: [com.google.android.gms.internal.ads.ED] */
    /* JADX WARN: Type inference failed for: r8v2, types: [com.google.android.gms.internal.ads.kf] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.C2005vD c(final com.google.android.gms.internal.ads.Xt r33, final com.google.android.gms.internal.ads.Qt r34, final org.json.JSONObject r35) {
        /*
            Method dump skipped, instructions count: 1534
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0532Gq.c(com.google.android.gms.internal.ads.Xt, com.google.android.gms.internal.ads.Qt, org.json.JSONObject):com.google.android.gms.internal.ads.vD");
    }
}
