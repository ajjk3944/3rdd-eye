package com.bytedance.adsdk.vt.lh.vt;

import android.graphics.Path;
import d.h;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ko implements lh {
    public final boolean fkw;

    /* renamed from: le, reason: collision with root package name */
    private final boolean f7112le;

    /* renamed from: lh, reason: collision with root package name */
    public final com.bytedance.adsdk.vt.lh.ouw.ouw f7113lh;
    public final Path.FillType ouw;
    public final String vt;
    public final com.bytedance.adsdk.vt.lh.ouw.yu yu;

    public ko(String str, boolean z3, Path.FillType fillType, com.bytedance.adsdk.vt.lh.ouw.ouw ouwVar, com.bytedance.adsdk.vt.lh.ouw.yu yuVar, boolean z10) {
        this.vt = str;
        this.f7112le = z3;
        this.ouw = fillType;
        this.f7113lh = ouwVar;
        this.yu = yuVar;
        this.fkw = z10;
    }

    @Override // com.bytedance.adsdk.vt.lh.vt.lh
    public final com.bytedance.adsdk.vt.ouw.ouw.lh ouw(com.bytedance.adsdk.vt.bly blyVar, com.bytedance.adsdk.vt.ra raVar, com.bytedance.adsdk.vt.lh.lh.ouw ouwVar) {
        return new com.bytedance.adsdk.vt.ouw.ouw.ra(blyVar, ouwVar, this);
    }

    public final String toString() {
        return h.x(new StringBuilder("ShapeFill{color=, fillEnabled="), this.f7112le, '}');
    }
}
