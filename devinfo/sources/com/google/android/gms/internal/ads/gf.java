package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class gf extends ls {
    public final Long H;
    public final Long I;
    public final Long J;
    public final Long K;
    public final Long L;
    public final Long M;
    public final Long N;
    public final Long O;
    public final Long P;
    public final Long Q;
    public final Long R;

    public gf(String str) {
        super(25);
        HashMap mapM = ls.m(str);
        if (mapM != null) {
            this.H = (Long) mapM.get(0);
            this.I = (Long) mapM.get(1);
            this.J = (Long) mapM.get(2);
            this.K = (Long) mapM.get(3);
            this.L = (Long) mapM.get(4);
            this.M = (Long) mapM.get(5);
            this.N = (Long) mapM.get(6);
            this.O = (Long) mapM.get(7);
            this.P = (Long) mapM.get(8);
            this.Q = (Long) mapM.get(9);
            this.R = (Long) mapM.get(10);
        }
    }

    @Override // com.google.android.gms.internal.ads.ls
    public final HashMap f() {
        HashMap map = new HashMap();
        map.put(0, this.H);
        map.put(1, this.I);
        map.put(2, this.J);
        map.put(3, this.K);
        map.put(4, this.L);
        map.put(5, this.M);
        map.put(6, this.N);
        map.put(7, this.O);
        map.put(8, this.P);
        map.put(9, this.Q);
        map.put(10, this.R);
        return map;
    }
}
