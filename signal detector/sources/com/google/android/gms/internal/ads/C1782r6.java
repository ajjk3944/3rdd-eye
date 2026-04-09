package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.r6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1782r6 extends AbstractC2022vd {

    /* renamed from: H, reason: collision with root package name */
    public String f16466H;

    /* renamed from: I, reason: collision with root package name */
    public final long f16467I;

    /* renamed from: J, reason: collision with root package name */
    public final String f16468J;

    /* renamed from: K, reason: collision with root package name */
    public final String f16469K;

    /* renamed from: L, reason: collision with root package name */
    public final String f16470L;

    public C1782r6(String str) {
        this.f16466H = "E";
        this.f16467I = -1L;
        this.f16468J = "E";
        this.f16469K = "E";
        this.f16470L = "E";
        HashMap mapO = AbstractC2022vd.o(str);
        if (mapO != null) {
            this.f16466H = mapO.get(0) == null ? "E" : (String) mapO.get(0);
            this.f16467I = mapO.get(1) != null ? ((Long) mapO.get(1)).longValue() : -1L;
            this.f16468J = mapO.get(2) == null ? "E" : (String) mapO.get(2);
            this.f16469K = mapO.get(3) == null ? "E" : (String) mapO.get(3);
            this.f16470L = mapO.get(4) != null ? (String) mapO.get(4) : "E";
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2022vd
    public final HashMap e() {
        HashMap map = new HashMap();
        map.put(0, this.f16466H);
        map.put(4, this.f16470L);
        map.put(3, this.f16469K);
        map.put(2, this.f16468J);
        map.put(1, Long.valueOf(this.f16467I));
        return map;
    }
}
