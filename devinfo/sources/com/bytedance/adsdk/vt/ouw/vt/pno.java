package com.bytedance.adsdk.vt.ouw.vt;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class pno {

    /* renamed from: lh, reason: collision with root package name */
    public final List<com.bytedance.adsdk.vt.lh.vt.pno> f7184lh;
    public final List<ouw<com.bytedance.adsdk.vt.lh.vt.jg, Path>> ouw;
    public final List<ouw<Integer, Integer>> vt;

    public pno(List<com.bytedance.adsdk.vt.lh.vt.pno> list) {
        this.f7184lh = list;
        this.ouw = new ArrayList(list.size());
        this.vt = new ArrayList(list.size());
        for (int i4 = 0; i4 < list.size(); i4++) {
            this.ouw.add(list.get(i4).vt.ouw());
            this.vt.add(list.get(i4).f7118lh.ouw());
        }
    }
}
