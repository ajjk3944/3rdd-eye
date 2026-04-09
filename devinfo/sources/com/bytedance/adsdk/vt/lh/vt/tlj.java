package com.bytedance.adsdk.vt.lh.vt;

import android.graphics.PointF;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class tlj implements lh {
    public final com.bytedance.adsdk.vt.lh.ouw.vt bly;

    /* renamed from: cf, reason: collision with root package name */
    public final boolean f7126cf;
    public final com.bytedance.adsdk.vt.lh.ouw.vt fkw;

    /* renamed from: le, reason: collision with root package name */
    public final com.bytedance.adsdk.vt.lh.ouw.vt f7127le;

    /* renamed from: lh, reason: collision with root package name */
    public final com.bytedance.adsdk.vt.lh.ouw.vt f7128lh;
    public final String ouw;
    public final com.bytedance.adsdk.vt.lh.ouw.vt pno;
    public final com.bytedance.adsdk.vt.lh.ouw.vt ra;
    public final boolean tlj;
    public final ouw vt;
    public final com.bytedance.adsdk.vt.lh.ouw.mwh<PointF, PointF> yu;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public enum ouw {
        STAR(1),
        POLYGON(2);


        /* renamed from: lh, reason: collision with root package name */
        private final int f7129lh;

        ouw(int i4) {
            this.f7129lh = i4;
        }

        public static ouw ouw(int i4) {
            for (ouw ouwVar : values()) {
                if (ouwVar.f7129lh == i4) {
                    return ouwVar;
                }
            }
            return null;
        }
    }

    public tlj(String str, ouw ouwVar, com.bytedance.adsdk.vt.lh.ouw.vt vtVar, com.bytedance.adsdk.vt.lh.ouw.mwh<PointF, PointF> mwhVar, com.bytedance.adsdk.vt.lh.ouw.vt vtVar2, com.bytedance.adsdk.vt.lh.ouw.vt vtVar3, com.bytedance.adsdk.vt.lh.ouw.vt vtVar4, com.bytedance.adsdk.vt.lh.ouw.vt vtVar5, com.bytedance.adsdk.vt.lh.ouw.vt vtVar6, boolean z3, boolean z10) {
        this.ouw = str;
        this.vt = ouwVar;
        this.f7128lh = vtVar;
        this.yu = mwhVar;
        this.fkw = vtVar2;
        this.f7127le = vtVar3;
        this.ra = vtVar4;
        this.pno = vtVar5;
        this.bly = vtVar6;
        this.tlj = z3;
        this.f7126cf = z10;
    }

    @Override // com.bytedance.adsdk.vt.lh.vt.lh
    public final com.bytedance.adsdk.vt.ouw.ouw.lh ouw(com.bytedance.adsdk.vt.bly blyVar, com.bytedance.adsdk.vt.ra raVar, com.bytedance.adsdk.vt.lh.lh.ouw ouwVar) {
        return new com.bytedance.adsdk.vt.ouw.ouw.jg(blyVar, ouwVar, this);
    }
}
