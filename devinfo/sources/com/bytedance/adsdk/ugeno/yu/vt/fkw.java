package com.bytedance.adsdk.ugeno.yu.vt;

import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.yu.le;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.Map;
import org.json.JSONException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class fkw extends ouw {
    public fkw(com.bytedance.adsdk.ugeno.vt.lh lhVar, String str, le.ouw ouwVar) {
        super(lhVar, str, ouwVar);
    }

    @Override // com.bytedance.adsdk.ugeno.yu.vt.ouw
    public final void ouw() throws JSONException {
        Map<String, String> map = this.f7011le;
        if (map == null || map.size() <= 0) {
            return;
        }
        String str = this.f7011le.get(FacebookMediationAdapter.KEY_ID);
        if (TextUtils.isEmpty(str)) {
            ouw(this.f7012lh);
            return;
        }
        com.bytedance.adsdk.ugeno.vt.lh lhVarVt = com.bytedance.adsdk.ugeno.vt.lh.vt(this.f7012lh);
        if (lhVarVt == null) {
            return;
        }
        ouw(lhVarVt.fkw(str));
    }

    private void ouw(com.bytedance.adsdk.ugeno.vt.lh lhVar) throws JSONException {
        if (lhVar == null) {
            return;
        }
        for (String str : this.f7011le.keySet()) {
            if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, FacebookMediationAdapter.KEY_ID)) {
                lhVar.ouw(str, this.f7011le.get(str));
            }
        }
        lhVar.ouw(this.f7011le.containsKey("width"), this.f7011le.containsKey("height"));
        lhVar.vt();
    }
}
