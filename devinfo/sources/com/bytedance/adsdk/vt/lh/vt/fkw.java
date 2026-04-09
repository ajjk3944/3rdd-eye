package com.bytedance.adsdk.vt.lh.vt;

import android.graphics.Path;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class fkw implements lh {
    private final com.bytedance.adsdk.vt.lh.ouw.vt bly;
    public final com.bytedance.adsdk.vt.lh.ouw.le fkw;

    /* renamed from: le, reason: collision with root package name */
    public final com.bytedance.adsdk.vt.lh.ouw.le f7109le;

    /* renamed from: lh, reason: collision with root package name */
    public final com.bytedance.adsdk.vt.lh.ouw.lh f7110lh;
    public final ra ouw;
    public final boolean pno;
    public final String ra;
    private final com.bytedance.adsdk.vt.lh.ouw.vt tlj;
    public final Path.FillType vt;
    public final com.bytedance.adsdk.vt.lh.ouw.yu yu;

    public fkw(String str, ra raVar, Path.FillType fillType, com.bytedance.adsdk.vt.lh.ouw.lh lhVar, com.bytedance.adsdk.vt.lh.ouw.yu yuVar, com.bytedance.adsdk.vt.lh.ouw.le leVar, com.bytedance.adsdk.vt.lh.ouw.le leVar2, com.bytedance.adsdk.vt.lh.ouw.vt vtVar, com.bytedance.adsdk.vt.lh.ouw.vt vtVar2, boolean z3) {
        this.ouw = raVar;
        this.vt = fillType;
        this.f7110lh = lhVar;
        this.yu = yuVar;
        this.fkw = leVar;
        this.f7109le = leVar2;
        this.ra = str;
        this.bly = vtVar;
        this.tlj = vtVar2;
        this.pno = z3;
    }

    @Override // com.bytedance.adsdk.vt.lh.vt.lh
    public final com.bytedance.adsdk.vt.ouw.ouw.lh ouw(com.bytedance.adsdk.vt.bly blyVar, com.bytedance.adsdk.vt.ra raVar, com.bytedance.adsdk.vt.lh.lh.ouw ouwVar) {
        return new com.bytedance.adsdk.vt.ouw.ouw.pno(blyVar, raVar, ouwVar, this);
    }
}
