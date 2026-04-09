package com.bytedance.sdk.openadsdk.jqy;

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

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class fkw implements yu {
    Handler ouw = null;
    private yu vt;

    public fkw(yu yuVar) {
        this.vt = yuVar;
    }

    private static Context pno() {
        try {
            Method method = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", null);
            method.setAccessible(true);
            Object objInvoke = method.invoke(null, null);
            return (Application) objInvoke.getClass().getMethod("getApplication", null).invoke(objInvoke, null);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.jqy.yu
    public final String fkw() {
        yu yuVar = this.vt;
        if (yuVar != null) {
            return yuVar.fkw();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.jqy.yu
    public final JSONObject le() {
        yu yuVar = this.vt;
        if (yuVar != null) {
            return yuVar.le();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.jqy.yu
    public final String lh() {
        yu yuVar = this.vt;
        return (yuVar == null || TextUtils.isEmpty(yuVar.lh())) ? "null" : this.vt.lh();
    }

    @Override // com.bytedance.sdk.openadsdk.jqy.yu
    public final ExecutorService ouw() {
        yu yuVar = this.vt;
        return (yuVar == null || yuVar.ouw() == null) ? Executors.newCachedThreadPool() : this.vt.ouw();
    }

    @Override // com.bytedance.sdk.openadsdk.jqy.yu
    public final Map<String, String> ra() {
        yu yuVar = this.vt;
        return (yuVar == null || yuVar.ra() == null) ? new HashMap() : this.vt.ra();
    }

    @Override // com.bytedance.sdk.openadsdk.jqy.yu
    public final Context vt() {
        yu yuVar = this.vt;
        return (yuVar == null || yuVar.vt() == null) ? pno() : this.vt.vt();
    }

    @Override // com.bytedance.sdk.openadsdk.jqy.yu
    public final Handler yu() {
        yu yuVar = this.vt;
        if (yuVar != null && yuVar.ra() != null) {
            return this.vt.yu();
        }
        Handler handler = new Handler(ouw("pag_strategy", -1).getLooper());
        this.ouw = handler;
        return handler;
    }

    @Override // com.bytedance.sdk.openadsdk.jqy.yu
    public final JSONObject ouw(JSONObject jSONObject) {
        yu yuVar = this.vt;
        return yuVar != null ? yuVar.ouw(jSONObject) : jSONObject;
    }

    @Override // com.bytedance.sdk.openadsdk.jqy.yu
    public final HandlerThread ouw(String str, int i4) {
        HandlerThread handlerThreadOuw;
        yu yuVar = this.vt;
        if (yuVar != null && (handlerThreadOuw = yuVar.ouw(str, i4)) != null) {
            return handlerThreadOuw;
        }
        HandlerThread handlerThread = new HandlerThread("pag_strategy", -1);
        handlerThread.start();
        return handlerThread;
    }
}
