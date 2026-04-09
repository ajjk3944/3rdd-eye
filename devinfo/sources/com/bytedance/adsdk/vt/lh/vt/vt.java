package com.bytedance.adsdk.vt.lh.vt;

import android.graphics.PointF;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class vt implements lh {
    public final boolean fkw;

    /* renamed from: lh, reason: collision with root package name */
    public final com.bytedance.adsdk.vt.lh.ouw.le f7134lh;
    public final String ouw;
    public final com.bytedance.adsdk.vt.lh.ouw.mwh<PointF, PointF> vt;
    public final boolean yu;

    public vt(String str, com.bytedance.adsdk.vt.lh.ouw.mwh<PointF, PointF> mwhVar, com.bytedance.adsdk.vt.lh.ouw.le leVar, boolean z3, boolean z10) {
        this.ouw = str;
        this.vt = mwhVar;
        this.f7134lh = leVar;
        this.yu = z3;
        this.fkw = z10;
    }

    @Override // com.bytedance.adsdk.vt.lh.vt.lh
    public final com.bytedance.adsdk.vt.ouw.ouw.lh ouw(com.bytedance.adsdk.vt.bly blyVar, com.bytedance.adsdk.vt.ra raVar, com.bytedance.adsdk.vt.lh.lh.ouw ouwVar) {
        return new com.bytedance.adsdk.vt.ouw.ouw.le(blyVar, ouwVar, this);
    }
}
