package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class cj0 implements zh0 {

    /* renamed from: a, reason: collision with root package name */
    public final j10 f10137a;

    /* renamed from: b, reason: collision with root package name */
    public final w81 f10138b;

    /* renamed from: c, reason: collision with root package name */
    public final aw f10139c;

    /* renamed from: d, reason: collision with root package name */
    public final rq0 f10140d;

    /* renamed from: e, reason: collision with root package name */
    public final lc0 f10141e;

    /* renamed from: f, reason: collision with root package name */
    public final od0 f10142f;
    public final za.a g;

    /* renamed from: h, reason: collision with root package name */
    public final Context f10143h;

    public cj0(j10 j10Var, w81 w81Var, aw awVar, rq0 rq0Var, lc0 lc0Var, od0 od0Var, za.a aVar, Context context, hl hlVar) {
        this.g = aVar;
        this.f10143h = context;
        this.f10137a = j10Var;
        this.f10138b = w81Var;
        this.f10139c = awVar;
        this.f10140d = rq0Var;
        this.f10141e = lc0Var;
        this.f10142f = od0Var;
    }

    @Override // com.google.android.gms.internal.ads.zh0
    public final boolean a(dq0 dq0Var, wp0 wp0Var) {
        aq0 aq0Var = wp0Var.f18106s;
        return (aq0Var == null || aq0Var.f9388c == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zh0
    public final vd.b b(dq0 dq0Var, wp0 wp0Var) {
        if (((Boolean) va.s.f36163e.f36166c.a(sk.D2)).booleanValue()) {
            d.h.D(ua.j.C.f35267k, this.f10142f.f14678e, "rendering-native-ads-native-js-webview-start");
        }
        vd.b bVarB = this.f10140d.b();
        sq sqVar = new sq(11, this, wp0Var);
        w81 w81Var = this.f10138b;
        return yo0.F(yo0.F(bVarB, sqVar, w81Var), new s40(this, dq0Var, wp0Var, 8), w81Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x039d A[EDGE_INSN: B:173:0x039d->B:107:0x039d BREAK  A[LOOP:0: B:109:0x03a1->B:121:0x0401], PHI: r26
  0x039d: PHI (r26v5 com.google.android.gms.internal.ads.od0) = 
  (r26v4 com.google.android.gms.internal.ads.od0)
  (r26v4 com.google.android.gms.internal.ads.od0)
  (r26v4 com.google.android.gms.internal.ads.od0)
  (r26v4 com.google.android.gms.internal.ads.od0)
  (r26v7 com.google.android.gms.internal.ads.od0)
  (r26v7 com.google.android.gms.internal.ads.od0)
  (r26v7 com.google.android.gms.internal.ads.od0)
 binds: [B:100:0x0383, B:102:0x0389, B:104:0x0395, B:106:0x039b, B:173:0x039d, B:170:0x039d, B:116:0x03c5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x039d A[PHI: r26
  0x039d: PHI (r26v5 com.google.android.gms.internal.ads.od0) = 
  (r26v4 com.google.android.gms.internal.ads.od0)
  (r26v4 com.google.android.gms.internal.ads.od0)
  (r26v4 com.google.android.gms.internal.ads.od0)
  (r26v4 com.google.android.gms.internal.ads.od0)
  (r26v7 com.google.android.gms.internal.ads.od0)
  (r26v7 com.google.android.gms.internal.ads.od0)
  (r26v7 com.google.android.gms.internal.ads.od0)
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
    /* JADX WARN: Type inference failed for: r6v61, types: [com.google.android.gms.internal.ads.gx, vd.b] */
    /* JADX WARN: Type inference failed for: r7v27, types: [com.google.android.gms.internal.ads.s81] */
    /* JADX WARN: Type inference failed for: r8v2, types: [com.google.android.gms.internal.ads.aw] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.j81 c(final com.google.android.gms.internal.ads.dq0 r33, final com.google.android.gms.internal.ads.wp0 r34, final org.json.JSONObject r35) {
        /*
            Method dump skipped, instructions count: 1534
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.cj0.c(com.google.android.gms.internal.ads.dq0, com.google.android.gms.internal.ads.wp0, org.json.JSONObject):com.google.android.gms.internal.ads.j81");
    }
}
