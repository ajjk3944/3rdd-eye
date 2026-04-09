package com.google.android.gms.internal.ads;

import q2.C2841s;

/* renamed from: com.google.android.gms.internal.ads.cm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1006cm implements M7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f13666a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1278hm f13667b;

    public C1006cm(C1278hm c1278hm, String str) {
        this.f13666a = str;
        this.f13667b = c1278hm;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [com.google.android.gms.internal.ads.B7, com.google.android.gms.internal.ads.Gm] */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.google.android.gms.internal.ads.B7, com.google.android.gms.internal.ads.Gm] */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.google.android.gms.internal.ads.B7, com.google.android.gms.internal.ads.Gm] */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.google.android.gms.internal.ads.B7, com.google.android.gms.internal.ads.Gm] */
    @Override // com.google.android.gms.internal.ads.M7
    public final void K(L7 l7) {
        if (!((Boolean) C2841s.f23267e.f23270c.a(H9.g2)).booleanValue()) {
            if (l7.f9629j) {
                C1278hm c1278hm = this.f13667b;
                if (c1278hm.f14577w != null) {
                    c1278hm.f14564H.put(this.f13666a, Boolean.TRUE);
                    ?? r02 = c1278hm.f14577w;
                    if (r02 == 0) {
                        return;
                    }
                    c1278hm.A(r02.N1(), r02.h(), r02.k(), true);
                    return;
                }
                return;
            }
            return;
        }
        synchronized (this) {
            try {
                if (l7.f9629j) {
                    C1278hm c1278hm2 = this.f13667b;
                    if (c1278hm2.f14577w != null) {
                        c1278hm2.f14564H.put(this.f13666a, Boolean.TRUE);
                        ?? r03 = c1278hm2.f14577w;
                        if (r03 == 0) {
                        } else {
                            c1278hm2.A(r03.N1(), c1278hm2.f14577w.h(), c1278hm2.f14577w.k(), true);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
