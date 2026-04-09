package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import java.io.File;
import java.lang.Thread;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class uq implements Thread.UncaughtExceptionHandler {
    public static volatile boolean ouw;

    /* renamed from: lh, reason: collision with root package name */
    private String f8742lh;
    private final Thread.UncaughtExceptionHandler vt = Thread.getDefaultUncaughtExceptionHandler();

    private uq() {
        Thread.setDefaultUncaughtExceptionHandler(this);
        vt();
    }

    public static uq ouw() {
        return new uq();
    }

    private void vt() {
        Context contextOuw = com.bytedance.sdk.openadsdk.core.zih.ouw();
        if (contextOuw == null) {
            return;
        }
        try {
            File file = new File(contextOuw.getFilesDir(), "TTCache");
            file.mkdirs();
            this.f8742lh = file.getPath();
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01be A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01d2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:143:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01c3 A[Catch: all -> 0x01e7, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x01e7, blocks: (B:75:0x01c3, B:83:0x01d7), top: B:118:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01d7 A[Catch: all -> 0x01e7, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x01e7, blocks: (B:75:0x01c3, B:83:0x01d7), top: B:118:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01eb A[ADDED_TO_REGION] */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void uncaughtException(java.lang.Thread r21, java.lang.Throwable r22) {
        /*
            Method dump skipped, instructions count: 499
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.utils.uq.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
    }
}
