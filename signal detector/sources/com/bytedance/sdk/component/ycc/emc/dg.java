package com.bytedance.sdk.component.ycc.emc;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.ylm;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class dg {
    public static final dg emc = new dg();

    private boolean xq() {
        return Thread.currentThread() == Looper.getMainLooper().getThread();
    }

    private void ypw(emc emcVar, Context context) {
        xq.emc(context, "context == null");
        xq.emc(emcVar, "AdLogConfig == null");
        xq.emc(emcVar.dg(), "AdLogDepend ==null");
    }

    public void emc(emc emcVar, Context context) {
        ypw(emcVar, context);
        msw.uym().emc(context);
        msw.uym().emc(emcVar.ru());
        msw.uym().ypw(emcVar.uym());
        msw.uym().xq(emcVar.msw());
        msw.uym().emc(emcVar.ypw());
        msw.uym().dg(emcVar.zz());
        msw.uym().bw(emcVar.ycc());
        msw.uym().emc(emcVar.emc() == null ? com.bytedance.sdk.component.ycc.emc.emc.emc.bw.emc : emcVar.emc());
        msw.uym().ypw(emcVar.gbl());
        msw.uym().emc(emcVar.dg());
        msw.uym().emc(emcVar.xq());
        msw.uym().emc(emcVar.bw());
        com.bytedance.sdk.component.ycc.emc.ypw.xq.xq.emc(emcVar.sz());
        com.bytedance.sdk.component.ycc.emc.ypw.xq.xq.ypw(emcVar.sup());
        emc(emcVar);
    }

    public void ypw() {
        final bw bwVarVk = msw.uym().vk();
        if (bwVarVk == null || msw.uym().ycc() == null || bwVarVk.dg() == null) {
            return;
        }
        if (msw.uym().ypw()) {
            if (emc(msw.uym().ycc(), bwVarVk)) {
                msw.uym().gbl();
                return;
            } else if (xq()) {
                bwVarVk.dg().execute(new com.bytedance.sdk.component.ycc.emc.bw.bw("stop") { // from class: com.bytedance.sdk.component.ycc.emc.dg.3
                    @Override // java.lang.Runnable
                    public void run() {
                        dg.this.ypw(bwVarVk.ycc());
                    }
                });
                return;
            } else {
                ypw(bwVarVk.ycc());
                return;
            }
        }
        msw.uym().gbl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ypw(int i) {
        if (i == 0) {
            com.bytedance.sdk.component.ycc.emc.ypw.ypw.emc.ypw();
        } else if (i == 1) {
            com.bytedance.sdk.component.ycc.emc.ypw.ypw.ypw.ypw();
        }
    }

    private void ypw(final com.bytedance.sdk.component.ycc.emc.dg.emc emcVar) {
        final bw bwVarVk = msw.uym().vk();
        if (emcVar == null || bwVarVk == null || msw.uym().ycc() == null || bwVarVk.dg() == null) {
            return;
        }
        if (msw.uym().ypw()) {
            if (emc(msw.uym().ycc(), bwVarVk)) {
                msw.uym().emc(emcVar);
                return;
            }
            xq();
            if (xq()) {
                bwVarVk.dg().execute(new com.bytedance.sdk.component.ycc.emc.bw.bw("dispatchEvent") { // from class: com.bytedance.sdk.component.ycc.emc.dg.4
                    @Override // java.lang.Runnable
                    public void run() {
                        dg.this.emc(emcVar, bwVarVk.ycc());
                    }
                });
                return;
            } else {
                emc(emcVar, bwVarVk.ycc());
                return;
            }
        }
        msw.uym().emc(emcVar);
    }

    private void emc(emc emcVar) {
        Executor executorBw;
        if (Looper.myLooper() != Looper.getMainLooper() && com.bytedance.sdk.component.ycc.emc.xq.emc.ypw()) {
            com.bytedance.sdk.component.ycc.emc.xq.emc.emc();
            return;
        }
        bw bwVarDg = emcVar.dg();
        if (bwVarDg == null || !com.bytedance.sdk.component.ycc.emc.xq.emc.ypw() || (executorBw = bwVarDg.bw()) == null) {
            return;
        }
        executorBw.execute(new Runnable() { // from class: com.bytedance.sdk.component.ycc.emc.dg.1
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.component.ycc.emc.xq.emc.emc();
            }
        });
    }

    public void emc(boolean z6) {
        msw.uym().emc(z6);
    }

    private boolean emc(Context context, bw bwVar) {
        if (context == null || bwVar == null) {
            return false;
        }
        if (bwVar.ycc() == 2) {
            return true;
        }
        if (bwVar.ycc() == 1) {
            return bwVar.sz();
        }
        try {
            return ylm.emc(context);
        } catch (Throwable th) {
            th.getMessage();
            return true;
        }
    }

    public void emc() {
        final bw bwVarVk = msw.uym().vk();
        if (bwVarVk == null || msw.uym().ycc() == null || bwVarVk.dg() == null) {
            return;
        }
        if (msw.uym().ypw()) {
            if (emc(msw.uym().ycc(), bwVarVk)) {
                msw.uym().zz();
                return;
            } else if (xq()) {
                bwVarVk.dg().execute(new com.bytedance.sdk.component.ycc.emc.bw.bw("start") { // from class: com.bytedance.sdk.component.ycc.emc.dg.2
                    @Override // java.lang.Runnable
                    public void run() {
                        dg.this.emc(bwVarVk.ycc());
                    }
                });
                return;
            } else {
                emc(bwVarVk.ycc());
                return;
            }
        }
        msw.uym().zz();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc(int i) {
        if (i == 0) {
            com.bytedance.sdk.component.ycc.emc.ypw.ypw.emc.emc();
        } else if (i == 1) {
            com.bytedance.sdk.component.ycc.emc.ypw.ypw.ypw.emc();
        }
    }

    public void emc(com.bytedance.sdk.component.ycc.emc.dg.emc emcVar) {
        ypw(emcVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc(com.bytedance.sdk.component.ycc.emc.dg.emc emcVar, int i) {
        if (i == 0) {
            com.bytedance.sdk.component.ycc.emc.ypw.ypw.emc.emc(emcVar);
        } else if (i == 1) {
            com.bytedance.sdk.component.ycc.emc.ypw.ypw.ypw.emc(emcVar);
        }
    }

    public void emc(final String str, final List<String> list, final boolean z6, Map<String, String> map, final int i, final String str2) {
        final bw bwVarVk = msw.uym().vk();
        if (bwVarVk == null || msw.uym().ycc() == null || bwVarVk.dg() == null || !bwVarVk.msw()) {
            return;
        }
        if (bwVarVk.ycc() == 1) {
            if (list == null || list.isEmpty()) {
                return;
            }
        } else if (bwVarVk.ycc() == 0 && (TextUtils.isEmpty(str) || list == null || list.isEmpty())) {
            return;
        }
        if (msw.uym().ypw() && !emc(msw.uym().ycc(), bwVarVk)) {
            if (xq()) {
                bwVarVk.dg().execute(new com.bytedance.sdk.component.ycc.emc.bw.bw("trackFailed") { // from class: com.bytedance.sdk.component.ycc.emc.dg.5
                    @Override // java.lang.Runnable
                    public void run() {
                        dg.this.emc(str, (List<String>) list, z6, bwVarVk.ycc(), i, str2);
                    }
                });
                return;
            } else {
                emc(str, list, z6, bwVarVk.ycc(), i, str2);
                return;
            }
        }
        msw.uym().emc(str, list, z6, map, i, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc(String str, List<String> list, boolean z6, int i, int i3, String str2) {
        if (i == 0) {
            com.bytedance.sdk.component.ycc.emc.ypw.ypw.emc.emc(str, list, z6);
        } else if (i == 1) {
            com.bytedance.sdk.component.ycc.emc.ypw.ypw.ypw.emc(str, list, z6, i3, str2);
        }
    }

    public void emc(final String str, final boolean z6) {
        final bw bwVarVk = msw.uym().vk();
        if (bwVarVk == null || msw.uym().ycc() == null || bwVarVk.dg() == null || !bwVarVk.msw() || (bwVarVk.ycc() == 0 && TextUtils.isEmpty(str))) {
            return;
        }
        if (msw.uym().ypw() && !emc(msw.uym().ycc(), bwVarVk)) {
            if (xq()) {
                bwVarVk.dg().execute(new com.bytedance.sdk.component.ycc.emc.bw.bw("trackFailed") { // from class: com.bytedance.sdk.component.ycc.emc.dg.6
                    @Override // java.lang.Runnable
                    public void run() {
                        dg.this.emc(str, bwVarVk.ycc(), z6);
                    }
                });
                return;
            } else {
                emc(str, bwVarVk.ycc(), z6);
                return;
            }
        }
        msw.uym().emc(str, z6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc(String str, int i, boolean z6) {
        if (i == 0) {
            com.bytedance.sdk.component.ycc.emc.ypw.ypw.emc.emc(str);
        } else if (i == 1) {
            com.bytedance.sdk.component.ycc.emc.ypw.ypw.ypw.emc(str, z6);
        }
    }
}
