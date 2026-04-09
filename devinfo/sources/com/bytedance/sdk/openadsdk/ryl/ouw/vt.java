package com.bytedance.sdk.openadsdk.ryl.ouw;

import com.bytedance.sdk.openadsdk.core.bs;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class vt extends com.bytedance.sdk.component.ouw.lh<JSONObject, JSONObject> {

    /* renamed from: lh, reason: collision with root package name */
    private final WeakReference<bs> f8658lh;

    public vt(bs bsVar) {
        this.f8658lh = new WeakReference<>(bsVar);
    }

    @Override // com.bytedance.sdk.component.ouw.lh
    public final /* synthetic */ void ouw(JSONObject jSONObject) throws Exception {
        com.bytedance.sdk.openadsdk.core.bly.ouw().jg();
        bs bsVar = this.f8658lh.get();
        if (bsVar == null) {
            com.bytedance.sdk.component.utils.ko.fkw("DoInterstitialWebViewCloseMethod", "invoke error");
            vt();
        } else {
            com.bytedance.sdk.openadsdk.core.bly.ko koVar = bsVar.f8104cf;
            if (koVar != null) {
                koVar.lh();
            }
        }
    }
}
