package com.bytedance.sdk.openadsdk.component.reward;

import A.f;
import R2.a;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.bytedance.sdk.component.utils.ypw;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.xmt;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class sz {
    protected final AtomicBoolean bw = new AtomicBoolean(false);
    protected boolean dg;
    protected final Context emc;
    private final emc msw;
    protected boolean uym;
    protected final String xq;
    protected boolean ycc;
    protected final com.bytedance.sdk.openadsdk.core.model.emc ypw;

    public interface emc {
        Intent emc(Context context, rie rieVar, Activity activity);

        void emc(Intent intent, Activity activity, rie rieVar, boolean z6);

        void emc(rie rieVar);

        void emc(boolean z6);
    }

    public sz(Context context, com.bytedance.sdk.openadsdk.core.model.emc emcVar, String str, emc emcVar2) {
        this.emc = context == null ? com.bytedance.sdk.openadsdk.core.aa.emc() : context;
        this.ypw = emcVar;
        this.xq = str;
        this.dg = false;
        this.msw = emcVar2;
    }

    private void dg() {
        List<rie> listDg = this.ypw.dg();
        if (listDg != null) {
            Iterator<rie> it = listDg.iterator();
            while (it.hasNext()) {
                IPBroadcastReceiver.ypw(this.emc, it.next());
            }
        }
    }

    public boolean xq() {
        return this.dg;
    }

    public Map<String, Object> ypw() {
        com.bytedance.sdk.openadsdk.core.model.emc emcVar = this.ypw;
        if (emcVar == null || emcVar.ycc() == null) {
            return null;
        }
        return this.ypw.ycc().zek();
    }

    public void emc() {
        if (this.bw.get()) {
            return;
        }
        this.dg = true;
    }

    public Object emc(String str) {
        com.bytedance.sdk.openadsdk.core.model.emc emcVar = this.ypw;
        if (emcVar == null || emcVar.ycc() == null || this.ypw.ycc().zek() == null) {
            return null;
        }
        try {
            return this.ypw.ycc().zek().get(str);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.ul.xq(this.xq, th.getMessage());
            return null;
        }
    }

    public void emc(Double d6) {
        if (this.ycc) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.model.emc emcVar = this.ypw;
        if (emcVar != null && emcVar.ycc() != null) {
            xmt.emc(this.ypw.ycc(), d6);
        }
        this.ycc = true;
    }

    public void emc(Double d6, String str, String str2) {
        if (this.uym) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.model.emc emcVar = this.ypw;
        if (emcVar != null && emcVar.ycc() != null) {
            xmt.emc(this.ypw.ycc(), d6, str, str2);
        }
        this.uym = true;
    }

    public void emc(Activity activity) {
        if (activity != null && activity.isFinishing()) {
            activity = null;
        }
        com.bytedance.sdk.openadsdk.core.model.emc emcVar = this.ypw;
        if (emcVar == null || !emcVar.bw()) {
            return;
        }
        rie rieVarYcc = this.ypw.ycc();
        if (rieVarYcc == null) {
            com.bytedance.sdk.openadsdk.dg.ru.emc(rieVarYcc, "show_ad_fail", this.xq, "video_or_image_empty");
            return;
        }
        if (a.i()) {
            dg();
            if (!this.bw.compareAndSet(false, true)) {
                com.bytedance.sdk.openadsdk.dg.ru.emc(rieVarYcc, "show_ad_fail", this.xq, "repeat_play");
                return;
            }
            if (rieVarYcc.iat() == null && rieVarYcc.rr().isEmpty()) {
                com.bytedance.sdk.openadsdk.dg.ru.emc(rieVarYcc, "show_ad_fail", this.xq, "video_or_image_empty");
                return;
            }
            com.bytedance.sdk.openadsdk.dg.ru.emc(rieVarYcc, "show_start", this.xq, (String) null);
            Context contextEmc = activity == null ? this.emc : activity;
            if (contextEmc == null) {
                contextEmc = com.bytedance.sdk.openadsdk.core.aa.emc();
            }
            Intent intentEmc = this.msw.emc(contextEmc, rieVarYcc, activity);
            if (intentEmc == null) {
                return;
            }
            intentEmc.putExtra("start_show_time", SystemClock.elapsedRealtime());
            boolean zZz = com.bytedance.sdk.openadsdk.sra.emc.zz();
            intentEmc.putExtra("enable_new_arch", zZz);
            this.msw.emc(intentEmc, activity, rieVarYcc, zZz);
            if (!com.bytedance.sdk.openadsdk.multipro.ypw.xq()) {
                this.msw.emc(zZz);
            }
            emc(contextEmc, intentEmc, rieVarYcc, zZz);
            this.msw.emc(rieVarYcc);
            return;
        }
        com.bytedance.sdk.openadsdk.dg.ru.emc(rieVarYcc, "show_ad_fail", this.xq, "not_called_on_main_thread");
        throw new IllegalStateException(f.p(new StringBuilder("Cannot be called in a child thread —— "), this.xq, ".show"));
    }

    private void emc(Context context, Intent intent, final rie rieVar, boolean z6) {
        final boolean z7 = com.bytedance.sdk.openadsdk.sra.emc.emc("start_activity_async", 0) == 1;
        if (z7) {
            com.bytedance.sdk.openadsdk.sba.xq.emc(new com.bytedance.sdk.openadsdk.sba.dg() { // from class: com.bytedance.sdk.openadsdk.component.reward.sz.1
                @Override // com.bytedance.sdk.openadsdk.sba.dg
                public com.bytedance.sdk.openadsdk.sba.ypw.emc emc() {
                    com.bytedance.sdk.openadsdk.sba.ypw.emc emcVarE = f.e("start_activity");
                    emcVarE.dg(sz.this.xq);
                    return emcVarE;
                }
            });
        }
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        com.bytedance.sdk.component.utils.ypw.emc(context, intent, new ypw.InterfaceC0037ypw() { // from class: com.bytedance.sdk.openadsdk.component.reward.sz.2
            @Override // com.bytedance.sdk.component.utils.ypw.InterfaceC0037ypw
            public void emc() {
                if (z7) {
                    sz.this.emc(jElapsedRealtime);
                }
            }

            @Override // com.bytedance.sdk.component.utils.ypw.InterfaceC0037ypw
            public void emc(Throwable th) {
                com.bytedance.sdk.openadsdk.dg.ru.emc(rieVar, "show_ad_fail", sz.this.xq, "activity_start_fail");
                if (z7) {
                    com.bytedance.sdk.openadsdk.sba.xq.xq(new com.bytedance.sdk.openadsdk.sba.dg() { // from class: com.bytedance.sdk.openadsdk.component.reward.sz.2.1
                        @Override // com.bytedance.sdk.openadsdk.sba.dg
                        public com.bytedance.sdk.openadsdk.sba.ypw.emc emc() {
                            com.bytedance.sdk.openadsdk.sba.ypw.emc emcVarE = f.e("start_activity");
                            emcVarE.dg(sz.this.xq);
                            return emcVarE;
                        }
                    });
                }
            }
        }, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc(long j6) {
        com.bytedance.sdk.openadsdk.sba.xq.ypw(new com.bytedance.sdk.openadsdk.sba.dg() { // from class: com.bytedance.sdk.openadsdk.component.reward.sz.3
            @Override // com.bytedance.sdk.openadsdk.sba.dg
            public com.bytedance.sdk.openadsdk.sba.ypw.emc emc() {
                com.bytedance.sdk.openadsdk.sba.ypw.emc emcVarE = f.e("start_activity");
                emcVarE.dg(sz.this.xq);
                return emcVarE;
            }
        });
        final long jElapsedRealtime = SystemClock.elapsedRealtime() - j6;
        com.bytedance.sdk.openadsdk.vk.xq.emc("start_activity_action", false, new com.bytedance.sdk.openadsdk.vk.ypw() { // from class: com.bytedance.sdk.openadsdk.component.reward.sz.4
            @Override // com.bytedance.sdk.openadsdk.vk.ypw
            public com.bytedance.sdk.openadsdk.vk.emc.xq emc() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("duration", jElapsedRealtime);
                return com.bytedance.sdk.openadsdk.vk.emc.dg.ypw().emc("start_activity_action").ypw(jSONObject.toString());
            }
        });
    }
}
