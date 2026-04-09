package com.bytedance.sdk.openadsdk.yu.ouw;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
final class le implements com.bytedance.sdk.component.le.ouw.fkw.yu {
    private final com.bytedance.sdk.component.ra.vt ouw;

    public le(com.bytedance.sdk.component.ra.vt vtVar) {
        this.ouw = vtVar;
    }

    @Override // com.bytedance.sdk.component.le.ouw.fkw.yu
    public final String lh() {
        com.bytedance.sdk.component.ra.vt vtVar = this.ouw;
        return vtVar != null ? vtVar.vt : "";
    }

    @Override // com.bytedance.sdk.component.le.ouw.fkw.yu
    public final boolean ouw() {
        com.bytedance.sdk.component.ra.vt vtVar = this.ouw;
        if (vtVar != null) {
            return vtVar.pno;
        }
        return false;
    }

    @Override // com.bytedance.sdk.component.le.ouw.fkw.yu
    public final int vt() {
        com.bytedance.sdk.component.ra.vt vtVar = this.ouw;
        if (vtVar != null) {
            return vtVar.ouw;
        }
        return -1;
    }
}
