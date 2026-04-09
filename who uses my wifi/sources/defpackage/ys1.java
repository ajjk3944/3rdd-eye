package defpackage;

import java.util.HashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ys1 extends a30 {
    public final /* synthetic */ int t = 0;
    public Long u;
    public Object v;
    public Object w;

    public /* synthetic */ ys1() {
        super(18);
    }

    @Override // defpackage.a30
    public final HashMap l() {
        switch (this.t) {
            case 0:
                HashMap map = new HashMap();
                map.put(0, this.u);
                map.put(1, (Long) this.v);
                map.put(2, (Long) this.w);
                return map;
            default:
                HashMap map2 = new HashMap();
                map2.put(0, this.u);
                map2.put(1, (Boolean) this.v);
                map2.put(2, (Boolean) this.w);
                return map2;
        }
    }

    public ys1(String str) {
        super(18);
        HashMap mapT = a30.t(str);
        if (mapT != null) {
            this.u = (Long) mapT.get(0);
            this.v = (Boolean) mapT.get(1);
            this.w = (Boolean) mapT.get(2);
        }
    }
}
