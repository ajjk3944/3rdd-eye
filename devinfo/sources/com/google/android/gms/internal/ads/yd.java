package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class yd extends ls {
    public String H;
    public final long I;
    public final String J;
    public final String K;
    public final String L;

    public yd(String str) {
        super(25);
        this.H = "E";
        this.I = -1L;
        this.J = "E";
        this.K = "E";
        this.L = "E";
        HashMap mapM = ls.m(str);
        if (mapM != null) {
            this.H = mapM.get(0) == null ? "E" : (String) mapM.get(0);
            this.I = mapM.get(1) != null ? ((Long) mapM.get(1)).longValue() : -1L;
            this.J = mapM.get(2) == null ? "E" : (String) mapM.get(2);
            this.K = mapM.get(3) == null ? "E" : (String) mapM.get(3);
            this.L = mapM.get(4) != null ? (String) mapM.get(4) : "E";
        }
    }

    @Override // com.google.android.gms.internal.ads.ls
    public final HashMap f() {
        HashMap map = new HashMap();
        map.put(0, this.H);
        map.put(4, this.L);
        map.put(3, this.K);
        map.put(2, this.J);
        map.put(1, Long.valueOf(this.I));
        return map;
    }
}
