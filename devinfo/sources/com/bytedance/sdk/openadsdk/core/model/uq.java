package com.bytedance.sdk.openadsdk.core.model;

import com.bytedance.sdk.openadsdk.utils.fak;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class uq {
    public boolean bly;
    public long fkw;

    /* renamed from: le, reason: collision with root package name */
    public long f8284le;

    /* renamed from: lh, reason: collision with root package name */
    public long f8285lh;
    public int pno;
    public long ra;
    public long tlj;
    public long vt;
    public long yu;
    public fak ouw = fak.vt();

    /* renamed from: cf, reason: collision with root package name */
    private fak f8283cf = fak.vt();

    public final void ouw(fak fakVar, fak fakVar2, int i4, fak fakVar3) {
        this.vt = fakVar.ouw(this.ouw);
        this.f8285lh = fakVar2.ouw(fakVar);
        this.yu = i4;
        this.fkw = fakVar3.ouw(fakVar2);
    }

    public final void ouw(fak fakVar) {
        this.f8283cf = fakVar;
        this.f8284le = fakVar.ouw(this.ouw);
    }
}
