package com.bytedance.sdk.openadsdk.rie;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class bw implements dg {
    Handler emc = null;
    private dg ypw;

    public bw(dg dgVar) {
        this.ypw = dgVar;
    }

    private Context msw() {
        try {
            Method method = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", null);
            method.setAccessible(true);
            Object objInvoke = method.invoke(null, null);
            return (Application) objInvoke.getClass().getMethod("getApplication", null).invoke(objInvoke, null);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.rie.dg
    public String bw() {
        dg dgVar = this.ypw;
        if (dgVar != null) {
            return dgVar.bw();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.rie.dg
    public Handler dg() {
        dg dgVar = this.ypw;
        if (dgVar != null && dgVar.uym() != null) {
            return this.ypw.dg();
        }
        Handler handler = new Handler(emc("pag_strategy", -1).getLooper());
        this.emc = handler;
        return handler;
    }

    @Override // com.bytedance.sdk.openadsdk.rie.dg
    public ExecutorService emc() {
        dg dgVar = this.ypw;
        return (dgVar == null || dgVar.emc() == null) ? Executors.newCachedThreadPool() : this.ypw.emc();
    }

    @Override // com.bytedance.sdk.openadsdk.rie.dg
    public Map<String, String> uym() {
        dg dgVar = this.ypw;
        return (dgVar == null || dgVar.uym() == null) ? new HashMap() : this.ypw.uym();
    }

    @Override // com.bytedance.sdk.openadsdk.rie.dg
    public String xq() {
        dg dgVar = this.ypw;
        return (dgVar == null || TextUtils.isEmpty(dgVar.xq())) ? "null" : this.ypw.xq();
    }

    @Override // com.bytedance.sdk.openadsdk.rie.dg
    public JSONObject ycc() {
        dg dgVar = this.ypw;
        if (dgVar != null) {
            return dgVar.ycc();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.rie.dg
    public Context ypw() {
        dg dgVar = this.ypw;
        return (dgVar == null || dgVar.ypw() == null) ? msw() : this.ypw.ypw();
    }

    @Override // com.bytedance.sdk.openadsdk.rie.dg
    public JSONObject emc(JSONObject jSONObject) {
        dg dgVar = this.ypw;
        return dgVar != null ? dgVar.emc(jSONObject) : jSONObject;
    }

    @Override // com.bytedance.sdk.openadsdk.rie.dg
    public HandlerThread emc(String str, int i) {
        HandlerThread handlerThreadEmc;
        dg dgVar = this.ypw;
        if (dgVar != null && (handlerThreadEmc = dgVar.emc(str, i)) != null) {
            return handlerThreadEmc;
        }
        HandlerThread handlerThread = new HandlerThread("pag_strategy", -1);
        handlerThread.start();
        return handlerThread;
    }
}
