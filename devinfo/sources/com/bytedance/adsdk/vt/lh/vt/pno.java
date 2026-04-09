package com.bytedance.adsdk.vt.lh.vt;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class pno {

    /* renamed from: lh, reason: collision with root package name */
    public final com.bytedance.adsdk.vt.lh.ouw.yu f7118lh;
    public final ouw ouw;
    public final com.bytedance.adsdk.vt.lh.ouw.pno vt;
    public final boolean yu;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public enum ouw {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public pno(ouw ouwVar, com.bytedance.adsdk.vt.lh.ouw.pno pnoVar, com.bytedance.adsdk.vt.lh.ouw.yu yuVar, boolean z3) {
        this.ouw = ouwVar;
        this.vt = pnoVar;
        this.f7118lh = yuVar;
        this.yu = z3;
    }
}
