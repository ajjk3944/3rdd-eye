package com.bytedance.sdk.component.fkw.fkw;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ryl extends ouw {
    @Override // com.bytedance.sdk.component.fkw.fkw.bly
    public final String ouw() {
        return "raw_cache";
    }

    @Override // com.bytedance.sdk.component.fkw.fkw.bly
    public final void ouw(com.bytedance.sdk.component.fkw.lh.lh lhVar) {
        byte[] bArrOuw = lhVar.jqy.ouw(lhVar.tc).ouw(lhVar.f7456lh);
        if (bArrOuw == null) {
            lhVar.ouw(new le());
        } else {
            lhVar.ouw(new vt(bArrOuw, null));
        }
    }
}
