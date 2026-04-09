package com.bytedance.sdk.openadsdk;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.sdk.openadsdk.vm.vt;
import com.bytedance.sdk.openadsdk.vm.vt.ouw;
import java.lang.reflect.Method;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class BusMonitorDependWrapper implements vt {
    private vt ouw;
    private Handler vt;

    public BusMonitorDependWrapper(vt vtVar) {
        this.ouw = vtVar;
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

    @Override // com.bytedance.sdk.openadsdk.vm.vt
    public Context getContext() {
        vt vtVar = this.ouw;
        return (vtVar == null || vtVar.getContext() == null) ? getReflectContext() : this.ouw.getContext();
    }

    @Override // com.bytedance.sdk.openadsdk.vm.vt
    public Handler getHandler() {
        vt vtVar = this.ouw;
        if (vtVar != null && vtVar.getHandler() != null) {
            return this.ouw.getHandler();
        }
        if (this.vt == null) {
            this.vt = new Handler(getSafeHandlerThread("pag_monitor", 0).getLooper());
        }
        return this.vt;
    }

    @Override // com.bytedance.sdk.openadsdk.vm.vt
    public int getOnceLogCount() {
        vt vtVar = this.ouw;
        if (vtVar != null) {
            return vtVar.getOnceLogCount();
        }
        return 20;
    }

    @Override // com.bytedance.sdk.openadsdk.vm.vt
    public int getOnceLogInterval() {
        vt vtVar = this.ouw;
        if (vtVar != null) {
            return vtVar.getOnceLogInterval();
        }
        return 1000;
    }

    @Override // com.bytedance.sdk.openadsdk.vm.vt
    public HandlerThread getSafeHandlerThread(String str, int i4) {
        HandlerThread safeHandlerThread;
        vt vtVar = this.ouw;
        if (vtVar != null && (safeHandlerThread = vtVar.getSafeHandlerThread(str, i4)) != null) {
            return safeHandlerThread;
        }
        HandlerThread handlerThread = new HandlerThread("pag_monitor");
        handlerThread.start();
        return handlerThread;
    }

    @Override // com.bytedance.sdk.openadsdk.vm.vt
    public int getUploadIntervalTime() {
        int uploadIntervalTime;
        vt vtVar = this.ouw;
        if (vtVar == null || (uploadIntervalTime = vtVar.getUploadIntervalTime()) < 3600000) {
            return 86400000;
        }
        return uploadIntervalTime;
    }

    @Override // com.bytedance.sdk.openadsdk.vm.vt
    public boolean isMonitorOpen() {
        vt vtVar = this.ouw;
        if (vtVar != null) {
            return vtVar.isMonitorOpen();
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.vm.vt
    public void onMonitorUpload(List<ouw> list) {
        vt vtVar = this.ouw;
        if (vtVar != null) {
            vtVar.onMonitorUpload(list);
        }
    }
}
