package com.bytedance.adsdk.ypw.emc.ypw;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class msw {
    private final List<emc<com.bytedance.adsdk.ypw.xq.ypw.qh, Path>> emc;
    private final List<com.bytedance.adsdk.ypw.xq.ypw.msw> xq;
    private final List<emc<Integer, Integer>> ypw;

    public msw(List<com.bytedance.adsdk.ypw.xq.ypw.msw> list) {
        this.xq = list;
        this.emc = new ArrayList(list.size());
        this.ypw = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.emc.add(list.get(i10).ypw().emc());
            this.ypw.add(list.get(i10).xq().emc());
        }
    }

    public List<com.bytedance.adsdk.ypw.xq.ypw.msw> emc() {
        return this.xq;
    }

    public List<emc<Integer, Integer>> xq() {
        return this.ypw;
    }

    public List<emc<com.bytedance.adsdk.ypw.xq.ypw.qh, Path>> ypw() {
        return this.emc;
    }
}
