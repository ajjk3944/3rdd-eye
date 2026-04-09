package defpackage;

import java.util.HashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class es1 extends a30 {
    public String t;
    public final long u;
    public final String v;
    public final String w;
    public final String x;

    public es1(String str) {
        super(18);
        this.t = "E";
        this.u = -1L;
        this.v = "E";
        this.w = "E";
        this.x = "E";
        HashMap mapT = a30.t(str);
        if (mapT != null) {
            this.t = mapT.get(0) == null ? "E" : (String) mapT.get(0);
            this.u = mapT.get(1) != null ? ((Long) mapT.get(1)).longValue() : -1L;
            this.v = mapT.get(2) == null ? "E" : (String) mapT.get(2);
            this.w = mapT.get(3) == null ? "E" : (String) mapT.get(3);
            this.x = mapT.get(4) != null ? (String) mapT.get(4) : "E";
        }
    }

    @Override // defpackage.a30
    public final HashMap l() {
        HashMap map = new HashMap();
        map.put(0, this.t);
        map.put(4, this.x);
        map.put(3, this.w);
        map.put(2, this.v);
        map.put(1, Long.valueOf(this.u));
        return map;
    }
}
