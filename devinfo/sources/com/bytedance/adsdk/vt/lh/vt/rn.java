package com.bytedance.adsdk.vt.lh.vt;

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class rn implements lh {

    /* renamed from: lh, reason: collision with root package name */
    public final boolean f7121lh;
    public final String ouw;
    public final List<lh> vt;

    public rn(String str, List<lh> list, boolean z3) {
        this.ouw = str;
        this.vt = list;
        this.f7121lh = z3;
    }

    @Override // com.bytedance.adsdk.vt.lh.vt.lh
    public final com.bytedance.adsdk.vt.ouw.ouw.lh ouw(com.bytedance.adsdk.vt.bly blyVar, com.bytedance.adsdk.vt.ra raVar, com.bytedance.adsdk.vt.lh.lh.ouw ouwVar) {
        return new com.bytedance.adsdk.vt.ouw.ouw.yu(blyVar, ouwVar, this, raVar);
    }

    public final String toString() {
        return "ShapeGroup{name='" + this.ouw + "' Shapes: " + Arrays.toString(this.vt.toArray()) + '}';
    }
}
