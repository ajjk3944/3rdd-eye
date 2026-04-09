package com.bytedance.sdk.openadsdk.activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.sdk.component.utils.cf;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.dg.uym;
import com.bytedance.sdk.openadsdk.core.dr;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.qh;
import com.bytedance.sdk.openadsdk.core.sf;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class TTDelegateActivity extends TTBaseActivity {
    private static final Map<String, uym.emc> dg = DesugarCollections.synchronizedMap(new HashMap());
    rie emc = null;
    private dr xq;
    private Intent ypw;

    private void bw() {
        String strWdp;
        String strEmc;
        String stringExtra;
        int intExtra = this.ypw.getIntExtra("type", 0);
        if (intExtra != 1) {
            if (intExtra != 6) {
                finish();
                return;
            }
            if (com.bytedance.sdk.openadsdk.multipro.ypw.xq()) {
                strWdp = this.ypw.getStringExtra("ext_info");
                strEmc = this.ypw.getStringExtra("filter_words");
                stringExtra = this.ypw.getStringExtra("creative_info");
            } else {
                if (this.emc == null) {
                    this.emc = sf.emc().emc(sf.emc(this.ypw));
                }
                rie rieVar = this.emc;
                if (rieVar == null) {
                    finish();
                    return;
                } else {
                    strWdp = rieVar.wdp();
                    strEmc = com.bytedance.sdk.openadsdk.tool.emc.emc(this.emc.pz());
                    stringExtra = "";
                }
            }
            emc(strWdp, strEmc, this.ypw.getStringExtra("closed_listener_key"), stringExtra, this.emc);
        }
    }

    private void dg() {
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.alpha = 0.0f;
        window.setAttributes(attributes);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!qh.bw()) {
            finish();
            return;
        }
        dg();
        this.ypw = getIntent();
        if (aa.emc() == null) {
            aa.ypw(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        dr drVar = this.xq;
        if (drVar != null) {
            drVar.ypw();
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (aa.emc() == null) {
            aa.ypw(this);
        }
        setIntent(intent);
        this.ypw = intent;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onResume() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        super.onResume();
        dr drVar = this.xq;
        if ((drVar == null || ((com.bytedance.sdk.openadsdk.xq.xq) drVar).emc == null || !((com.bytedance.sdk.openadsdk.xq.xq) drVar).emc.isShowing()) && this.ypw != null) {
            bw();
        }
    }

    public static void emc(rie rieVar, String str, uym.emc emcVar) {
        if (rieVar == null) {
            return;
        }
        Intent intent = new Intent(aa.emc(), (Class<?>) TTDelegateActivity.class);
        intent.addFlags(268435456);
        intent.putExtra("type", 6);
        intent.putExtra("closed_listener_key", str);
        if (com.bytedance.sdk.openadsdk.multipro.ypw.xq()) {
            intent.putExtra("ext_info", rieVar.wdp());
            intent.putExtra("filter_words", com.bytedance.sdk.openadsdk.tool.emc.emc(rieVar.pz()));
            intent.putExtra("creative_info", rieVar.uie().toString());
        } else {
            intent.putExtra("meta_index", sf.emc().emc(rieVar));
        }
        if (emcVar != null) {
            if (com.bytedance.sdk.openadsdk.multipro.ypw.xq()) {
                com.bytedance.sdk.openadsdk.core.zz.ypw().emc(str, emcVar);
            } else {
                dg.put(str, emcVar);
            }
        }
        com.bytedance.sdk.component.utils.ypw.emc(aa.emc(), intent, null);
    }

    public static void emc(rie rieVar, String str) {
        emc(rieVar, str, null);
    }

    private void emc(String str, String str2, final String str3, String str4, rie rieVar) {
        TTDelegateActivity tTDelegateActivity;
        if (str2 == null || str == null || this.xq != null) {
            tTDelegateActivity = this;
        } else {
            tTDelegateActivity = this;
            com.bytedance.sdk.openadsdk.xq.xq xqVar = new com.bytedance.sdk.openadsdk.xq.xq(tTDelegateActivity, str, com.bytedance.sdk.openadsdk.tool.emc.emc(str2), str4, rieVar);
            tTDelegateActivity.xq = xqVar;
            xqVar.emc(str3);
            tTDelegateActivity.xq.emc(new dr.emc() { // from class: com.bytedance.sdk.openadsdk.activity.TTDelegateActivity.1
                @Override // com.bytedance.sdk.openadsdk.core.dr.emc
                public void emc(int i, String str5) {
                    uym.emc emcVarBw;
                    if (TTDelegateActivity.dg != null && TTDelegateActivity.dg.size() > 0 && !TextUtils.isEmpty(str3) && !com.bytedance.sdk.openadsdk.multipro.ypw.xq()) {
                        uym.emc emcVar = (uym.emc) TTDelegateActivity.dg.get(str3);
                        if (emcVar != null) {
                            emcVar.emc();
                        }
                    } else if (!TextUtils.isEmpty(str3) && (emcVarBw = com.bytedance.sdk.openadsdk.core.zz.ypw().bw(str3)) != null) {
                        emcVarBw.emc();
                        com.bytedance.sdk.openadsdk.core.zz.ypw().ycc(str3);
                    }
                    TTDelegateActivity.this.emc(str3);
                    TTDelegateActivity.this.finish();
                }

                @Override // com.bytedance.sdk.openadsdk.core.dr.emc
                public void emc() {
                    if (!((com.bytedance.sdk.openadsdk.xq.xq) TTDelegateActivity.this.xq).xq()) {
                        TTDelegateActivity.this.emc(str3);
                        TTDelegateActivity.this.finish();
                    }
                    ((com.bytedance.sdk.openadsdk.xq.xq) TTDelegateActivity.this.xq).emc(false);
                }
            });
        }
        dr drVar = tTDelegateActivity.xq;
        if (drVar != null) {
            drVar.emc();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc(String str) {
        Map<String, uym.emc> map = dg;
        if (map == null || TextUtils.isEmpty(str)) {
            return;
        }
        map.remove(str);
        if (cf.dg()) {
            map.size();
        }
    }
}
