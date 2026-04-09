package com.bytedance.sdk.openadsdk.dg.emc;

import android.content.Context;
import android.os.HandlerThread;
import com.bytedance.sdk.component.utils.sba;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.sup;
import com.bytedance.sdk.openadsdk.multipro.aidl.BinderPoolService;
import com.bytedance.sdk.openadsdk.utils.iyl;
import com.bytedance.sdk.openadsdk.utils.tp;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class msw implements com.bytedance.sdk.component.ycc.emc.bw {
    private final String emc = "[7852]";

    @Override // com.bytedance.sdk.component.ycc.emc.bw
    public int aa() {
        return com.bytedance.sdk.openadsdk.sra.emc.emc("batch_log_config", "once_max", 10);
    }

    @Override // com.bytedance.sdk.component.ycc.emc.bw
    public Executor bw() {
        return iyl.msw();
    }

    @Override // com.bytedance.sdk.component.ycc.emc.bw
    public boolean cf() {
        return com.bytedance.sdk.openadsdk.sra.emc.emc("batch_log_config", "enable", 0) == 1;
    }

    @Override // com.bytedance.sdk.component.ycc.emc.bw
    public Executor dg() {
        return iyl.dg();
    }

    @Override // com.bytedance.sdk.component.ycc.emc.bw
    public com.bytedance.sdk.component.ycc.emc.dg.emc emc(JSONObject jSONObject) {
        return null;
    }

    @Override // com.bytedance.sdk.component.ycc.emc.bw
    public com.bytedance.sdk.component.ycc.emc.ycc gbl() {
        com.bytedance.sdk.component.ycc.emc.ycc yccVarEmc;
        synchronized (this) {
            yccVarEmc = com.bytedance.sdk.openadsdk.multipro.emc.emc.emc(aa.emc());
        }
        return yccVarEmc;
    }

    @Override // com.bytedance.sdk.component.ycc.emc.bw
    public boolean msw() {
        return true;
    }

    @Override // com.bytedance.sdk.component.ycc.emc.bw
    public long qh() {
        long jEmc = com.bytedance.sdk.openadsdk.sra.emc.emc("log_queue_timeout", 40000);
        if (jEmc < 30000 || jEmc > 120000) {
            return 40000L;
        }
        return jEmc;
    }

    @Override // com.bytedance.sdk.component.ycc.emc.bw
    public com.bytedance.sdk.component.ycc.emc.bw.xq ru() {
        return new dg();
    }

    @Override // com.bytedance.sdk.component.ycc.emc.bw
    public com.bytedance.sdk.component.ycc.emc.uym sup() {
        return null;
    }

    @Override // com.bytedance.sdk.component.ycc.emc.bw
    public boolean sz() {
        return BinderPoolService.emc;
    }

    @Override // com.bytedance.sdk.component.ycc.emc.bw
    public boolean uym() {
        return false;
    }

    @Override // com.bytedance.sdk.component.ycc.emc.bw
    public boolean vk() {
        return com.bytedance.sdk.openadsdk.sra.emc.emc("batch_log_config", "log_list_reuse", 0) == 1;
    }

    @Override // com.bytedance.sdk.component.ycc.emc.bw
    public boolean xq() {
        return true;
    }

    @Override // com.bytedance.sdk.component.ycc.emc.bw
    public int ycc() {
        return 1;
    }

    @Override // com.bytedance.sdk.component.ycc.emc.bw
    public boolean ypw() {
        return false;
    }

    @Override // com.bytedance.sdk.component.ycc.emc.bw
    public String zz() {
        return tp.dg();
    }

    @Override // com.bytedance.sdk.component.ycc.emc.bw
    public boolean emc() {
        return false;
    }

    @Override // com.bytedance.sdk.component.ycc.emc.bw
    public int xq(String str) {
        gbl gblVarXxs = com.bytedance.sdk.openadsdk.core.settings.gbl.xq().xxs();
        if (gblVarXxs == null) {
            return 3;
        }
        return gblVarXxs.emc(str);
    }

    @Override // com.bytedance.sdk.component.ycc.emc.bw
    public String ypw(String str) {
        return com.bytedance.sdk.component.dg.emc.emc(str, com.bytedance.sdk.openadsdk.core.emc.emc());
    }

    @Override // com.bytedance.sdk.component.ycc.emc.bw
    public boolean emc(Context context) {
        return sba.emc(context);
    }

    @Override // com.bytedance.sdk.component.ycc.emc.bw
    public String emc(String str) {
        return com.bytedance.sdk.component.dg.emc.ypw(str, com.bytedance.sdk.openadsdk.core.emc.emc());
    }

    @Override // com.bytedance.sdk.component.ycc.emc.bw
    public void emc(boolean z6, int i, long j6, com.bytedance.sdk.component.ycc.emc.ycc.dg dgVar) {
        Runnable runnableEmc;
        if (dgVar == null) {
            return;
        }
        if (z6) {
            com.bytedance.sdk.openadsdk.vk.xq.emc("track_link_result", false, new ru(true, dgVar));
            return;
        }
        gbl gblVarXxs = com.bytedance.sdk.openadsdk.core.settings.gbl.xq().xxs();
        if (gblVarXxs == null || dgVar.dg() >= gblVarXxs.emc(dgVar.ycc())) {
            com.bytedance.sdk.openadsdk.vk.xq.emc("track_link_result", false, new ru(false, dgVar));
        } else {
            if (!gblVarXxs.emc() || (runnableEmc = dgVar.emc(sup.emc(aa.emc()), null)) == null) {
                return;
            }
            iyl.emc().schedule(runnableEmc, gblVarXxs.ypw(dgVar.ycc()), TimeUnit.SECONDS);
        }
    }

    @Override // com.bytedance.sdk.component.ycc.emc.bw
    public HandlerThread emc(String str, int i) {
        return com.bytedance.sdk.component.utils.msw.emc(str, i);
    }
}
