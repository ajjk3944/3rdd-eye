package com.bytedance.sdk.component.fkw.vt;

import com.bytedance.sdk.component.fkw.fkw;
import com.bytedance.sdk.component.fkw.jg;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class vt implements fkw {

    /* renamed from: lh, reason: collision with root package name */
    private boolean f7489lh;
    private String ouw;
    private boolean vt;
    private jg yu;

    public vt(String str, boolean z3, boolean z10, jg jgVar) {
        this.ouw = str;
        this.vt = z3;
        this.f7489lh = z10;
        this.yu = jgVar;
    }

    @Override // com.bytedance.sdk.component.fkw.fkw
    public final boolean lh() {
        return this.f7489lh;
    }

    @Override // com.bytedance.sdk.component.fkw.fkw
    public final String ouw() {
        return this.ouw;
    }

    @Override // com.bytedance.sdk.component.fkw.fkw
    public final boolean vt() {
        return this.vt;
    }
}
