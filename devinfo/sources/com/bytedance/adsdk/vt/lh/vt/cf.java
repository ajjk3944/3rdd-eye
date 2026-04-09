package com.bytedance.adsdk.vt.lh.vt;

import android.graphics.PointF;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class cf implements lh {
    public final boolean fkw;

    /* renamed from: lh, reason: collision with root package name */
    public final com.bytedance.adsdk.vt.lh.ouw.mwh<PointF, PointF> f7108lh;
    public final String ouw;
    public final com.bytedance.adsdk.vt.lh.ouw.mwh<PointF, PointF> vt;
    public final com.bytedance.adsdk.vt.lh.ouw.vt yu;

    public cf(String str, com.bytedance.adsdk.vt.lh.ouw.mwh<PointF, PointF> mwhVar, com.bytedance.adsdk.vt.lh.ouw.mwh<PointF, PointF> mwhVar2, com.bytedance.adsdk.vt.lh.ouw.vt vtVar, boolean z3) {
        this.ouw = str;
        this.vt = mwhVar;
        this.f7108lh = mwhVar2;
        this.yu = vtVar;
        this.fkw = z3;
    }

    @Override // com.bytedance.adsdk.vt.lh.vt.lh
    public final com.bytedance.adsdk.vt.ouw.ouw.lh ouw(com.bytedance.adsdk.vt.bly blyVar, com.bytedance.adsdk.vt.ra raVar, com.bytedance.adsdk.vt.lh.lh.ouw ouwVar) {
        return new com.bytedance.adsdk.vt.ouw.ouw.ko(blyVar, ouwVar, this);
    }

    public final String toString() {
        return "RectangleShape{position=" + this.vt + ", size=" + this.f7108lh + '}';
    }
}
