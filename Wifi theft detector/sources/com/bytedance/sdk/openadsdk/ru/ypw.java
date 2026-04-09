package com.bytedance.sdk.openadsdk.ru;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.bw.gbl;
import com.bytedance.sdk.component.bw.vk;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.utils.tp;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ypw<T> implements vk<T> {
    private final rie dg;
    private final long emc = SystemClock.elapsedRealtime();
    private final vk<T> xq;
    private final String ypw;

    public ypw(final rie rieVar, String str, vk<T> vkVar) {
        this.xq = vkVar;
        this.dg = rieVar;
        this.ypw = str;
        if (dg.ypw()) {
            com.bytedance.sdk.openadsdk.sba.xq.emc(new com.bytedance.sdk.openadsdk.sba.dg() { // from class: com.bytedance.sdk.openadsdk.ru.ypw.1
                @Override // com.bytedance.sdk.openadsdk.sba.dg
                public com.bytedance.sdk.openadsdk.sba.ypw.emc emc() {
                    com.bytedance.sdk.openadsdk.sba.ypw.emc emcVar = new com.bytedance.sdk.openadsdk.sba.ypw.emc();
                    emcVar.ypw("load_img");
                    rie rieVar2 = rieVar;
                    if (rieVar2 != null) {
                        emcVar.xq(rieVar2.lt("-1"));
                        emcVar.dg(tp.xq(rieVar.blf()));
                    }
                    emcVar.emc(BuildConfig.VERSION_NAME);
                    return emcVar;
                }
            });
        }
    }

    @Override // com.bytedance.sdk.component.bw.vk
    public void emc(gbl<T> gblVar) {
        vk<T> vkVar = this.xq;
        if (vkVar != null) {
            vkVar.emc(gblVar);
        }
        if (this.dg != null) {
            final long jElapsedRealtime = SystemClock.elapsedRealtime() - this.emc;
            final int iUym = gblVar.uym() / 1024;
            final int i10 = gblVar.ycc() ? 1 : 0;
            com.bytedance.sdk.openadsdk.vk.xq.emc("load_image_success", false, new com.bytedance.sdk.openadsdk.vk.ypw() { // from class: com.bytedance.sdk.openadsdk.ru.ypw.2
                @Override // com.bytedance.sdk.openadsdk.vk.ypw
                @Nullable
                public com.bytedance.sdk.openadsdk.vk.emc.xq emc() throws Exception {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("duration", jElapsedRealtime);
                    jSONObject.put("url", ypw.this.ypw);
                    jSONObject.put("preload_size", iUym);
                    jSONObject.put("local_cache", i10);
                    jSONObject.put("image_mode", ypw.this.dg.in());
                    jSONObject.put("use_new_img", dg.ypw() ? 1 : 0);
                    return com.bytedance.sdk.openadsdk.vk.emc.dg.ypw().emc("load_image_success").emc(ypw.this.dg.blf()).ypw(jSONObject.toString());
                }
            });
            if (dg.ypw()) {
                com.bytedance.sdk.openadsdk.sba.xq.ypw(new com.bytedance.sdk.openadsdk.sba.dg() { // from class: com.bytedance.sdk.openadsdk.ru.ypw.3
                    @Override // com.bytedance.sdk.openadsdk.sba.dg
                    public com.bytedance.sdk.openadsdk.sba.ypw.emc emc() {
                        com.bytedance.sdk.openadsdk.sba.ypw.emc emcVar = new com.bytedance.sdk.openadsdk.sba.ypw.emc();
                        emcVar.ypw("load_img");
                        if (ypw.this.dg != null) {
                            emcVar.xq(ypw.this.dg.lt("-1"));
                            emcVar.dg(tp.xq(ypw.this.dg.blf()));
                        }
                        emcVar.emc(BuildConfig.VERSION_NAME);
                        return emcVar;
                    }
                });
            }
        }
    }

    @Override // com.bytedance.sdk.component.bw.vk
    public void emc(final int i10, final String str, @Nullable final Throwable th) {
        vk<T> vkVar = this.xq;
        if (vkVar != null) {
            vkVar.emc(i10, str, th);
        }
        rie rieVar = this.dg;
        if (rieVar != null) {
            if (!TextUtils.isEmpty(tp.emc(rieVar))) {
                final long jElapsedRealtime = SystemClock.elapsedRealtime() - this.emc;
                com.bytedance.sdk.openadsdk.vk.xq.emc("load_image_error", false, new com.bytedance.sdk.openadsdk.vk.ypw() { // from class: com.bytedance.sdk.openadsdk.ru.ypw.4
                    @Override // com.bytedance.sdk.openadsdk.vk.ypw
                    @Nullable
                    public com.bytedance.sdk.openadsdk.vk.emc.xq emc() throws Exception {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("duration", jElapsedRealtime);
                        jSONObject.put("url", ypw.this.ypw);
                        jSONObject.put("error_code", i10);
                        Throwable th2 = th;
                        if (th2 instanceof NullPointerException) {
                            ApmHelper.reportCustomError("image load fail", "image_load", th2);
                        }
                        jSONObject.put("error_message", str);
                        jSONObject.put("image_mode", ypw.this.dg.in());
                        jSONObject.put("use_new_img", dg.ypw() ? 1 : 0);
                        return com.bytedance.sdk.openadsdk.vk.emc.dg.ypw().emc("load_image_error").emc(ypw.this.dg.blf()).ypw(jSONObject.toString());
                    }
                });
            }
            if (dg.ypw()) {
                com.bytedance.sdk.openadsdk.sba.xq.xq(new com.bytedance.sdk.openadsdk.sba.dg() { // from class: com.bytedance.sdk.openadsdk.ru.ypw.5
                    @Override // com.bytedance.sdk.openadsdk.sba.dg
                    public com.bytedance.sdk.openadsdk.sba.ypw.emc emc() {
                        com.bytedance.sdk.openadsdk.sba.ypw.emc emcVar = new com.bytedance.sdk.openadsdk.sba.ypw.emc();
                        emcVar.ypw("load_img");
                        if (ypw.this.dg != null) {
                            emcVar.xq(ypw.this.dg.lt("-1"));
                            emcVar.dg(tp.xq(ypw.this.dg.blf()));
                        }
                        emcVar.emc(BuildConfig.VERSION_NAME);
                        return emcVar;
                    }
                });
            }
        }
    }
}
