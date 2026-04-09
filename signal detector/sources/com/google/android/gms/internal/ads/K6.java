package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class K6 extends AbstractC2022vd {

    /* renamed from: H, reason: collision with root package name */
    public final /* synthetic */ int f9448H = 0;

    /* renamed from: I, reason: collision with root package name */
    public Long f9449I;

    /* renamed from: J, reason: collision with root package name */
    public Object f9450J;

    /* renamed from: K, reason: collision with root package name */
    public Object f9451K;

    public /* synthetic */ K6() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2022vd
    public final HashMap e() {
        switch (this.f9448H) {
            case 0:
                HashMap map = new HashMap();
                map.put(0, this.f9449I);
                map.put(1, (Long) this.f9450J);
                map.put(2, (Long) this.f9451K);
                return map;
            default:
                HashMap map2 = new HashMap();
                map2.put(0, this.f9449I);
                map2.put(1, (Boolean) this.f9450J);
                map2.put(2, (Boolean) this.f9451K);
                return map2;
        }
    }

    public K6(String str) {
        HashMap mapO = AbstractC2022vd.o(str);
        if (mapO != null) {
            this.f9449I = (Long) mapO.get(0);
            this.f9450J = (Boolean) mapO.get(1);
            this.f9451K = (Boolean) mapO.get(2);
        }
    }
}
