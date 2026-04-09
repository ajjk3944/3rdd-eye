package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class re extends ls {
    public final /* synthetic */ int H = 0;
    public Long I;
    public Object J;
    public Object K;

    public /* synthetic */ re() {
        super(25);
    }

    @Override // com.google.android.gms.internal.ads.ls
    public final HashMap f() {
        switch (this.H) {
            case 0:
                HashMap map = new HashMap();
                map.put(0, this.I);
                map.put(1, (Long) this.J);
                map.put(2, (Long) this.K);
                return map;
            default:
                HashMap map2 = new HashMap();
                map2.put(0, this.I);
                map2.put(1, (Boolean) this.J);
                map2.put(2, (Boolean) this.K);
                return map2;
        }
    }

    public re(String str) {
        super(25);
        HashMap mapM = ls.m(str);
        if (mapM != null) {
            this.I = (Long) mapM.get(0);
            this.J = (Boolean) mapM.get(1);
            this.K = (Boolean) mapM.get(2);
        }
    }
}
