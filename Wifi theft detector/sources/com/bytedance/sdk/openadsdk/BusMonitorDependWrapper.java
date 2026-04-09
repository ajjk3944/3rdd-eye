package com.bytedance.sdk.openadsdk;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.sdk.openadsdk.sba.ypw;
import com.bytedance.sdk.openadsdk.sba.ypw.emc;
import java.lang.reflect.Method;
import java.util.List;

/* loaded from: classes.dex */
public class BusMonitorDependWrapper implements ypw {
    private ypw emc;
    private Handler ypw;

    public BusMonitorDependWrapper(ypw ypwVar) {
        this.emc = ypwVar;
    }

    public static Context getReflectContext() {
        try {
            Method method = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", null);
            method.setAccessible(true);
            Object objInvoke = method.invoke(null, null);
            return (Application) objInvoke.getClass().getMethod("getApplication", null).invoke(objInvoke, null);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.sba.ypw
    public Context getContext() {
        ypw ypwVar = this.emc;
        return (ypwVar == null || ypwVar.getContext() == null) ? getReflectContext() : this.emc.getContext();
    }

    @Override // com.bytedance.sdk.openadsdk.sba.ypw
    public Handler getHandler() {
        ypw ypwVar = this.emc;
        if (ypwVar != null && ypwVar.getHandler() != null) {
            return this.emc.getHandler();
        }
        if (this.ypw == null) {
            this.ypw = new Handler(getSafeHandlerThread("pag_monitor", 0).getLooper());
        }
        return this.ypw;
    }

    @Override // com.bytedance.sdk.openadsdk.sba.ypw
    public int getOnceLogCount() {
        ypw ypwVar = this.emc;
        if (ypwVar != null) {
            return ypwVar.getOnceLogCount();
        }
        return 20;
    }

    @Override // com.bytedance.sdk.openadsdk.sba.ypw
    public int getOnceLogInterval() {
        ypw ypwVar = this.emc;
        if (ypwVar != null) {
            return ypwVar.getOnceLogInterval();
        }
        return 1000;
    }

    @Override // com.bytedance.sdk.openadsdk.sba.ypw
    public HandlerThread getSafeHandlerThread(String str, int i10) {
        HandlerThread safeHandlerThread;
        ypw ypwVar = this.emc;
        if (ypwVar != null && (safeHandlerThread = ypwVar.getSafeHandlerThread(str, i10)) != null) {
            return safeHandlerThread;
        }
        HandlerThread handlerThread = new HandlerThread("pag_monitor");
        handlerThread.start();
        return handlerThread;
    }

    @Override // com.bytedance.sdk.openadsdk.sba.ypw
    public int getUploadIntervalTime() {
        int uploadIntervalTime;
        ypw ypwVar = this.emc;
        if (ypwVar == null || (uploadIntervalTime = ypwVar.getUploadIntervalTime()) < 3600000) {
            return 86400000;
        }
        return uploadIntervalTime;
    }

    @Override // com.bytedance.sdk.openadsdk.sba.ypw
    public boolean isMonitorOpen() {
        ypw ypwVar = this.emc;
        if (ypwVar != null) {
            return ypwVar.isMonitorOpen();
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.sba.ypw
    public void onMonitorUpload(List<emc> list) {
        ypw ypwVar = this.emc;
        if (ypwVar != null) {
            ypwVar.onMonitorUpload(list);
        }
    }
}
