package com.bytedance.sdk.openadsdk.yu.ouw;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
final class yu implements com.bytedance.sdk.component.le.ouw.fkw.lh {
    private final com.bytedance.sdk.component.ra.vt.vt ouw;

    public yu() {
        com.bytedance.sdk.component.ra.vt.vt vtVarVt = com.bytedance.sdk.openadsdk.th.vt.ouw().ouw.vt();
        this.ouw = vtVarVt;
        vtVarVt.ra = 7;
        vtVarVt.f7626le = "track_url";
    }

    @Override // com.bytedance.sdk.component.le.ouw.fkw.lh
    public final void ouw(String str) {
        this.ouw.ouw(str);
    }

    @Override // com.bytedance.sdk.component.le.ouw.fkw.lh
    public final void ouw(String str, String str2) {
        this.ouw.vt(str, str2);
    }

    @Override // com.bytedance.sdk.component.le.ouw.fkw.lh
    public final com.bytedance.sdk.component.le.ouw.fkw.yu ouw() {
        return new le(this.ouw.ouw());
    }
}
