package com.bytedance.adsdk.ugeno.core.vt;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.core.ko;
import com.bytedance.adsdk.ugeno.core.mwh;
import com.bytedance.adsdk.ugeno.core.tlj;
import com.bytedance.adsdk.ugeno.ra.pno;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class vt implements pno.ouw {
    public Handler fkw = new pno(Looper.getMainLooper(), this);

    /* renamed from: le, reason: collision with root package name */
    private Context f6874le;

    /* renamed from: lh, reason: collision with root package name */
    public mwh f6875lh;
    public int ouw;
    public ko vt;
    public com.bytedance.adsdk.ugeno.vt.lh yu;

    public vt(Context context, mwh mwhVar, com.bytedance.adsdk.ugeno.vt.lh lhVar) {
        this.f6874le = context;
        this.f6875lh = mwhVar;
        this.yu = lhVar;
    }

    @Override // com.bytedance.adsdk.ugeno.ra.pno.ouw
    public final void ouw(Message message) throws JSONException {
        if (message.what != 1001) {
            return;
        }
        JSONObject jSONObject = this.f6875lh.f6850lh;
        if (TextUtils.equals(jSONObject.optString("type"), "onAnimation")) {
            com.bytedance.adsdk.ugeno.vt.lh lhVarFkw = com.bytedance.adsdk.ugeno.vt.lh.vt(this.yu).fkw(jSONObject.optString("nodeId"));
            new tlj(lhVarFkw.fkw, com.bytedance.adsdk.ugeno.core.ouw.ouw(jSONObject.optJSONObject("animatorSet"), null, lhVarFkw)).ouw();
        } else {
            ko koVar = this.vt;
            if (koVar != null) {
                koVar.ouw(this.f6875lh, this.yu);
            }
        }
        this.fkw.removeMessages(1001);
    }
}
