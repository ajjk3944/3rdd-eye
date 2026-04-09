package defpackage;

import java.util.HashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class kt1 extends a30 {
    public final Long A;
    public final Long B;
    public final Long C;
    public final Long D;
    public final Long t;
    public final Long u;
    public final Long v;
    public final Long w;
    public final Long x;
    public final Long y;
    public final Long z;

    public kt1(String str) {
        super(18);
        HashMap mapT = a30.t(str);
        if (mapT != null) {
            this.t = (Long) mapT.get(0);
            this.u = (Long) mapT.get(1);
            this.v = (Long) mapT.get(2);
            this.w = (Long) mapT.get(3);
            this.x = (Long) mapT.get(4);
            this.y = (Long) mapT.get(5);
            this.z = (Long) mapT.get(6);
            this.A = (Long) mapT.get(7);
            this.B = (Long) mapT.get(8);
            this.C = (Long) mapT.get(9);
            this.D = (Long) mapT.get(10);
        }
    }

    @Override // defpackage.a30
    public final HashMap l() {
        HashMap map = new HashMap();
        map.put(0, this.t);
        map.put(1, this.u);
        map.put(2, this.v);
        map.put(3, this.w);
        map.put(4, this.x);
        map.put(5, this.y);
        map.put(6, this.z);
        map.put(7, this.A);
        map.put(8, this.B);
        map.put(9, this.C);
        map.put(10, this.D);
        return map;
    }
}
