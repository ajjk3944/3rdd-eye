package com.bytedance.adsdk.ypw.xq.ypw;

/* loaded from: classes.dex */
public class zz implements xq {
    private final String emc;
    private final boolean xq;
    private final emc ypw;

    public enum emc {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static emc emc(int i) {
            return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? MERGE : EXCLUDE_INTERSECTIONS : INTERSECT : SUBTRACT : ADD : MERGE;
        }
    }

    public zz(String str, emc emcVar, boolean z6) {
        this.emc = str;
        this.ypw = emcVar;
        this.xq = z6;
    }

    public String emc() {
        return this.emc;
    }

    public String toString() {
        return "MergePaths{mode=" + this.ypw + '}';
    }

    public boolean xq() {
        return this.xq;
    }

    public emc ypw() {
        return this.ypw;
    }

    @Override // com.bytedance.adsdk.ypw.xq.ypw.xq
    public com.bytedance.adsdk.ypw.emc.emc.xq emc(com.bytedance.adsdk.ypw.zz zzVar, com.bytedance.adsdk.ypw.uym uymVar, com.bytedance.adsdk.ypw.xq.xq.emc emcVar) {
        return new com.bytedance.adsdk.ypw.emc.emc.sup(this);
    }
}
