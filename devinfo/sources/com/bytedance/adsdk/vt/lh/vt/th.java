package com.bytedance.adsdk.vt.lh.vt;

import com.bytedance.adsdk.vt.ouw.ouw.zin;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class th implements lh {
    public final com.bytedance.adsdk.vt.lh.ouw.vt fkw;

    /* renamed from: le, reason: collision with root package name */
    public final boolean f7123le;

    /* renamed from: lh, reason: collision with root package name */
    public final com.bytedance.adsdk.vt.lh.ouw.vt f7124lh;
    public final String ouw;
    public final ouw vt;
    public final com.bytedance.adsdk.vt.lh.ouw.vt yu;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public enum ouw {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static ouw ouw(int i4) {
            if (i4 == 1) {
                return SIMULTANEOUSLY;
            }
            if (i4 == 2) {
                return INDIVIDUALLY;
            }
            throw new IllegalArgumentException("Unknown trim path type ".concat(String.valueOf(i4)));
        }
    }

    public th(String str, ouw ouwVar, com.bytedance.adsdk.vt.lh.ouw.vt vtVar, com.bytedance.adsdk.vt.lh.ouw.vt vtVar2, com.bytedance.adsdk.vt.lh.ouw.vt vtVar3, boolean z3) {
        this.ouw = str;
        this.vt = ouwVar;
        this.f7124lh = vtVar;
        this.yu = vtVar2;
        this.fkw = vtVar3;
        this.f7123le = z3;
    }

    @Override // com.bytedance.adsdk.vt.lh.vt.lh
    public final com.bytedance.adsdk.vt.ouw.ouw.lh ouw(com.bytedance.adsdk.vt.bly blyVar, com.bytedance.adsdk.vt.ra raVar, com.bytedance.adsdk.vt.lh.lh.ouw ouwVar) {
        return new zin(ouwVar, this);
    }

    public final String toString() {
        return "Trim Path: {start: " + this.f7124lh + ", end: " + this.yu + ", offset: " + this.fkw + "}";
    }
}
