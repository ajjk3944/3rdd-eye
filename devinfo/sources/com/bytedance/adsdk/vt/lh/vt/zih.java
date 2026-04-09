package com.bytedance.adsdk.vt.lh.vt;

import d.h;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class zih implements lh {

    /* renamed from: lh, reason: collision with root package name */
    public final boolean f7135lh;
    public final String ouw;
    public final com.bytedance.adsdk.vt.lh.ouw.pno vt;
    private final int yu;

    public zih(String str, int i4, com.bytedance.adsdk.vt.lh.ouw.pno pnoVar, boolean z3) {
        this.ouw = str;
        this.yu = i4;
        this.vt = pnoVar;
        this.f7135lh = z3;
    }

    @Override // com.bytedance.adsdk.vt.lh.vt.lh
    public final com.bytedance.adsdk.vt.ouw.ouw.lh ouw(com.bytedance.adsdk.vt.bly blyVar, com.bytedance.adsdk.vt.ra raVar, com.bytedance.adsdk.vt.lh.lh.ouw ouwVar) {
        return new com.bytedance.adsdk.vt.ouw.ouw.vm(blyVar, ouwVar, this);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ShapePath{name=");
        sb2.append(this.ouw);
        sb2.append(", index=");
        return h.u(sb2, this.yu, '}');
    }
}
