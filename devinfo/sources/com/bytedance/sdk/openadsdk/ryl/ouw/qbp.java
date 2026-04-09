package com.bytedance.sdk.openadsdk.ryl.ouw;

import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.core.bs;
import com.bytedance.sdk.openadsdk.core.fak;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class qbp extends com.bytedance.sdk.component.ouw.vm<JSONObject, JSONObject> {
    public static final HashSet<String> yu = new HashSet<>(Arrays.asList("closeWebview", "makeVisible", "getCurrentVisibleState"));
    private com.bytedance.sdk.component.bly.le fkw;

    /* renamed from: le, reason: collision with root package name */
    private bs f8653le;
    private vpp ra;

    private qbp(com.bytedance.sdk.component.bly.le leVar, bs bsVar, vpp vppVar) {
        this.fkw = leVar;
        this.f8653le = bsVar;
        this.ra = vppVar;
    }

    public static void ouw(com.bytedance.sdk.component.ouw.ko koVar, com.bytedance.sdk.component.bly.le leVar, bs bsVar, vpp vppVar) {
        koVar.ouw(yu, new qbp(leVar, bsVar, vppVar));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.bytedance.sdk.component.ouw.yu
    public final /* synthetic */ Object ouw(String str, Object obj) throws Exception {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        str.getClass();
        switch (str) {
            case "getCurrentVisibleState":
                vpp vppVar = this.ra;
                if (vppVar != null) {
                    jSONObject.put("visibleState", !fak.ouw(this.fkw, 20, vppVar.lna, false) ? 1 : 0);
                }
                return jSONObject;
            case "closeWebview":
                com.bytedance.sdk.openadsdk.utils.bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ryl.ouw.qbp.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (qbp.this.fkw != null) {
                            qbp.this.fkw.setVisibility(8);
                            ViewGroup viewGroup = (ViewGroup) qbp.this.fkw.getParent();
                            if (viewGroup != null) {
                                viewGroup.removeView(qbp.this.fkw);
                            }
                        }
                    }
                });
                jSONObject.put("success", true);
                return jSONObject;
            case "makeVisible":
                if (this.fkw != null) {
                    jSONObject.put("success", true);
                    com.bytedance.sdk.openadsdk.utils.bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ryl.ouw.qbp.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (qbp.this.fkw != null) {
                                qbp.this.fkw.setVisibility(0);
                            }
                        }
                    });
                    return jSONObject;
                }
                jSONObject.put("success", false);
                return jSONObject;
            default:
                return jSONObject;
        }
    }
}
