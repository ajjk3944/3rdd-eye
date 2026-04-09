package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import com.bytedance.sdk.openadsdk.AdSlot;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;

/* loaded from: classes.dex */
public class cuf implements Thread.UncaughtExceptionHandler {
    public static volatile boolean emc;
    private String xq;
    private final Thread.UncaughtExceptionHandler ypw = Thread.getDefaultUncaughtExceptionHandler();

    private cuf() {
        Thread.setDefaultUncaughtExceptionHandler(this);
        ypw();
    }

    public static cuf emc() {
        return new cuf();
    }

    private void xq() {
        try {
            com.bytedance.sdk.openadsdk.component.uym.emc.emc(com.bytedance.sdk.openadsdk.core.aa.emc());
        } catch (Throwable unused) {
        }
        try {
            if (ypw.ypw()) {
                com.bytedance.sdk.openadsdk.component.reward.aa.emc(com.bytedance.sdk.openadsdk.core.aa.emc()).bw();
            } else {
                com.bytedance.sdk.openadsdk.component.reward.vk.emc(com.bytedance.sdk.openadsdk.core.aa.emc()).emc();
            }
        } catch (Throwable unused2) {
        }
        try {
            if (ypw.ypw()) {
                com.bytedance.sdk.openadsdk.component.reward.uym.emc(com.bytedance.sdk.openadsdk.core.aa.emc()).bw();
            } else {
                com.bytedance.sdk.openadsdk.component.reward.ycc.emc(com.bytedance.sdk.openadsdk.core.aa.emc()).emc();
            }
        } catch (Throwable unused3) {
        }
        try {
            com.bytedance.sdk.openadsdk.core.settings.gbl.xq().emc();
        } catch (Throwable unused4) {
        }
        try {
            com.bytedance.sdk.component.adexpress.emc.ypw.ypw.ypw();
        } catch (Throwable unused5) {
        }
    }

    private void ypw() {
        Context contextEmc = com.bytedance.sdk.openadsdk.core.aa.emc();
        if (contextEmc == null) {
            return;
        }
        try {
            File file = new File(contextEmc.getFilesDir(), "TTCache");
            file.mkdirs();
            this.xq = file.getPath();
        } catch (Throwable unused) {
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        emc = true;
        com.bytedance.sdk.component.msw.zz.dg = true;
        com.bytedance.sdk.component.msw.xq.dg.xq = true;
        boolean zContains = false;
        com.bytedance.sdk.component.msw.ycc.emc(false);
        try {
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            String string = stringWriter.toString();
            if (string != null) {
                zContains = string.contains(AdSlot.class.getPackage().getName());
            }
        } catch (Throwable unused) {
        }
        if (zContains) {
            emc(thread, th);
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.ypw;
        if (uncaughtExceptionHandler == null || uncaughtExceptionHandler == this) {
            return;
        }
        uncaughtExceptionHandler.uncaughtException(thread, th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00d7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00eb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v14, types: [java.io.FileOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.util.Properties] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.Properties] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.FileOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.io.FileOutputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void emc(java.lang.Thread r12, java.lang.Throwable r13) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.utils.cuf.emc(java.lang.Thread, java.lang.Throwable):void");
    }
}
