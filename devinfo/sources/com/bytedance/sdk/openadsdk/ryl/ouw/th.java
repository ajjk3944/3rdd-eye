package com.bytedance.sdk.openadsdk.ryl.ouw;

import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.core.bs;
import com.bytedance.sdk.openadsdk.core.fak;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class th extends com.bytedance.sdk.component.ouw.yu<JSONObject, JSONObject> {
    private vpp fkw;

    /* renamed from: le, reason: collision with root package name */
    private String f8656le;

    /* renamed from: lh, reason: collision with root package name */
    com.bytedance.sdk.component.bly.le f8657lh;
    private bs yu;

    public th(com.bytedance.sdk.component.bly.le leVar, String str, bs bsVar, vpp vppVar) {
        this.f8657lh = leVar;
        this.f8656le = str;
        this.yu = bsVar;
        this.fkw = vppVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.bytedance.sdk.component.ouw.yu
    public final /* synthetic */ JSONObject ouw(String str, JSONObject jSONObject) throws Exception {
        JSONObject jSONObject2;
        jSONObject2 = new JSONObject();
        String str2 = this.f8656le;
        str2.getClass();
        switch (str2) {
            case "getCurrentVisibleState":
                vpp vppVar = this.fkw;
                if (vppVar != null) {
                    jSONObject2.put("visibleState", !fak.ouw(this.f8657lh, 20, vppVar.lna, false) ? 1 : 0);
                }
                return jSONObject2;
            case "closeWebview":
                com.bytedance.sdk.openadsdk.utils.bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ryl.ouw.th.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.bytedance.sdk.component.bly.le leVar = th.this.f8657lh;
                        if (leVar != null) {
                            leVar.setVisibility(8);
                            ViewGroup viewGroup = (ViewGroup) th.this.f8657lh.getParent();
                            if (viewGroup != null) {
                                viewGroup.removeView(th.this.f8657lh);
                            }
                        }
                    }
                });
                jSONObject2.put("success", true);
                return jSONObject2;
            case "makeVisible":
                if (this.f8657lh == null) {
                    jSONObject2.put("success", false);
                    return jSONObject2;
                }
                jSONObject2.put("success", true);
                com.bytedance.sdk.openadsdk.utils.bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ryl.ouw.th.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.bytedance.sdk.component.bly.le leVar = th.this.f8657lh;
                        if (leVar != null) {
                            leVar.setVisibility(0);
                        }
                    }
                });
                return jSONObject2;
            default:
                return jSONObject2;
        }
    }
}
