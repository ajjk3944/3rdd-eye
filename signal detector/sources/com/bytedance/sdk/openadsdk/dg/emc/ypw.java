package com.bytedance.sdk.openadsdk.dg.emc;

import android.content.Context;
import com.bytedance.sdk.component.utils.ul;
import com.bytedance.sdk.component.ycc.emc.emc;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.sup;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class ypw {
    public static AtomicInteger emc = new AtomicInteger(0);
    public static final AtomicBoolean ypw = new AtomicBoolean(false);

    public static void emc(Context context, boolean z6) {
        try {
            if (ypw.compareAndSet(false, true)) {
                com.bytedance.sdk.component.ycc.emc.ypw.emc(new emc.C0040emc().emc(new uym()).ypw(com.bytedance.sdk.component.ycc.emc.dg.ypw.emc.xq()).xq(com.bytedance.sdk.component.ycc.emc.dg.ypw.emc.bw()).emc(com.bytedance.sdk.component.ycc.emc.dg.ypw.emc.dg()).emc(z6).emc(new msw()).emc(bw.emc).ypw(aa.dg().cf()).emc(aa.dg().vk()).emc(aa.dg().jxk()).emc(), context);
                ypw();
            }
        } catch (Throwable unused) {
            ypw.set(false);
        }
    }

    public static void xq() {
        try {
            com.bytedance.sdk.component.ycc.emc.ypw.dg();
            com.bytedance.sdk.component.ycc.emc.ypw.bw();
        } catch (Throwable th) {
            ul.xq("AdLogSwitchUtils", th.getMessage());
        }
    }

    public static void ypw() {
        com.bytedance.sdk.component.ycc.emc.ypw.xq();
    }

    public static void emc(com.bytedance.sdk.openadsdk.dg.emc emcVar) {
        com.bytedance.sdk.component.ycc.emc.dg.emc.emc emcVar2 = new com.bytedance.sdk.component.ycc.emc.dg.emc.emc(emcVar.dg(), emcVar);
        emcVar2.ypw(emcVar.bw() ? (byte) 1 : (byte) 2);
        emcVar2.emc((byte) 0);
        if (com.bytedance.sdk.component.ycc.emc.ypw.ypw()) {
            emc(aa.emc(), com.bytedance.sdk.openadsdk.multipro.ypw.xq());
        }
        com.bytedance.sdk.component.ycc.emc.ypw.emc(emcVar2);
    }

    public static com.bytedance.sdk.openadsdk.vk.xq.xq emc() {
        return zz.emc;
    }

    public static void emc(final List<String> list, final int i, final String str) {
        if (list == null || list.isEmpty()) {
            return;
        }
        com.bytedance.sdk.openadsdk.dg.xq.emc(new com.bytedance.sdk.component.msw.msw("track") { // from class: com.bytedance.sdk.openadsdk.dg.emc.ypw.1
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.component.ycc.emc.ypw.ypw()) {
                    ypw.emc(aa.emc(), com.bytedance.sdk.openadsdk.multipro.ypw.xq());
                }
                com.bytedance.sdk.component.ycc.emc.ypw.emc(sup.emc(aa.emc()), list, true, i, str);
            }
        });
    }

    public static void emc(String str) {
        emc(str, false);
    }

    public static void emc(String str, boolean z6) {
        if (com.bytedance.sdk.component.ycc.emc.ypw.ypw()) {
            emc(aa.emc(), com.bytedance.sdk.openadsdk.multipro.ypw.xq());
        }
        com.bytedance.sdk.component.ycc.emc.ypw.emc(str, z6);
    }
}
