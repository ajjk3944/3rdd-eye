package com.bytedance.sdk.openadsdk.sba;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.List;

/* loaded from: classes.dex */
public interface ypw {
    Context getContext();

    Handler getHandler();

    int getOnceLogCount();

    int getOnceLogInterval();

    HandlerThread getSafeHandlerThread(String str, int i);

    int getUploadIntervalTime();

    boolean isMonitorOpen();

    void onMonitorUpload(List<com.bytedance.sdk.openadsdk.sba.ypw.emc> list);
}
