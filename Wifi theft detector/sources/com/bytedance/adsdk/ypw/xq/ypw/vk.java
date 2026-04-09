package com.bytedance.adsdk.ypw.xq.ypw;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class vk implements xq {
    private final String emc;
    private final boolean xq;
    private final List<xq> ypw;

    public vk(String str, List<xq> list, boolean z10) {
        this.emc = str;
        this.ypw = list;
        this.xq = z10;
    }

    public String emc() {
        return this.emc;
    }

    public String toString() {
        return "ShapeGroup{name='" + this.emc + "' Shapes: " + Arrays.toString(this.ypw.toArray()) + '}';
    }

    public boolean xq() {
        return this.xq;
    }

    public List<xq> ypw() {
        return this.ypw;
    }

    @Override // com.bytedance.adsdk.ypw.xq.ypw.xq
    public com.bytedance.adsdk.ypw.emc.emc.xq emc(com.bytedance.adsdk.ypw.zz zzVar, com.bytedance.adsdk.ypw.uym uymVar, com.bytedance.adsdk.ypw.xq.xq.emc emcVar) {
        return new com.bytedance.adsdk.ypw.emc.emc.dg(zzVar, emcVar, this, uymVar);
    }
}
