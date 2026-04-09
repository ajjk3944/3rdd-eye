package com.bytedance.sdk.component.fkw.fkw;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class yu extends ouw {
    @Override // com.bytedance.sdk.component.fkw.fkw.bly
    public final String ouw() {
        return "cache_policy";
    }

    @Override // com.bytedance.sdk.component.fkw.fkw.bly
    public final void ouw(com.bytedance.sdk.component.fkw.lh.lh lhVar) {
        com.bytedance.sdk.component.fkw.vt vtVar = lhVar.tc;
        if (vtVar != null) {
            if (vtVar.fkw()) {
                lhVar.ouw(new tlj());
                return;
            } else if (vtVar.ra()) {
                lhVar.ouw(new le());
                return;
            }
        }
        lhVar.ouw(new cf());
    }
}
