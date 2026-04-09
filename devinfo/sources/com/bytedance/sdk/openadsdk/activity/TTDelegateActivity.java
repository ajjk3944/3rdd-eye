package com.bytedance.sdk.openadsdk.activity;

import a0.g;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.openadsdk.core.cd;
import com.bytedance.sdk.openadsdk.core.jg;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.od;
import com.bytedance.sdk.openadsdk.core.yu.ra;
import com.bytedance.sdk.openadsdk.core.zih;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class TTDelegateActivity extends TTBaseActivity {
    private static final Map<String, ra.ouw> yu = g.r();

    /* renamed from: lh, reason: collision with root package name */
    private cd f7707lh;
    vpp ouw = null;
    private Intent vt;

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!jg.fkw()) {
            finish();
            return;
        }
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.alpha = 0.0f;
        window.setAttributes(attributes);
        this.vt = getIntent();
        if (zih.ouw() == null) {
            zih.vt(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        cd cdVar = this.f7707lh;
        if (cdVar != null) {
            cdVar.vt();
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (zih.ouw() == null) {
            zih.vt(this);
        }
        setIntent(intent);
        this.vt = intent;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onResume() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        Intent intent;
        int intExtra;
        String stringExtra;
        String str;
        String strOuw;
        TTDelegateActivity tTDelegateActivity;
        super.onResume();
        cd cdVar = this.f7707lh;
        if ((cdVar != null && ((com.bytedance.sdk.openadsdk.lh.lh) cdVar).vt != null && ((com.bytedance.sdk.openadsdk.lh.lh) cdVar).vt.isShowing()) || (intent = this.vt) == null || (intExtra = intent.getIntExtra("type", 0)) == 1) {
            return;
        }
        if (intExtra == 6) {
            if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
                String stringExtra2 = this.vt.getStringExtra("ext_info");
                strOuw = this.vt.getStringExtra("filter_words");
                stringExtra = this.vt.getStringExtra("creative_info");
                str = stringExtra2;
            } else {
                if (this.ouw == null) {
                    this.ouw = od.ouw().ouw(od.ouw(this.vt));
                }
                vpp vppVar = this.ouw;
                if (vppVar != null) {
                    stringExtra = "";
                    str = vppVar.yhj;
                    strOuw = com.bytedance.sdk.openadsdk.tool.ouw.ouw(vppVar.jae);
                }
            }
            String str2 = stringExtra;
            final String stringExtra3 = this.vt.getStringExtra("closed_listener_key");
            vpp vppVar2 = this.ouw;
            if (strOuw == null || str == null || this.f7707lh != null) {
                tTDelegateActivity = this;
            } else {
                tTDelegateActivity = this;
                com.bytedance.sdk.openadsdk.lh.lh lhVar = new com.bytedance.sdk.openadsdk.lh.lh(tTDelegateActivity, str, com.bytedance.sdk.openadsdk.tool.ouw.ouw(strOuw), str2, vppVar2);
                tTDelegateActivity.f7707lh = lhVar;
                com.bytedance.sdk.openadsdk.lh.yu yuVar = lhVar.ouw;
                if (yuVar != null) {
                    yuVar.fkw = stringExtra3;
                }
                lhVar.ouw(new cd.ouw() { // from class: com.bytedance.sdk.openadsdk.activity.TTDelegateActivity.1
                    @Override // com.bytedance.sdk.openadsdk.core.cd.ouw
                    public final void ouw(String str3) {
                        ra.ouw ouwVarLh;
                        ko.lh("showDislike", "closedListenerKey=" + stringExtra3 + ",onSelected->position=0,value=" + str3);
                        if (TTDelegateActivity.yu != null && TTDelegateActivity.yu.size() > 0 && !TextUtils.isEmpty(stringExtra3) && !com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
                            ra.ouw ouwVar = (ra.ouw) TTDelegateActivity.yu.get(stringExtra3);
                            if (ouwVar != null) {
                                ouwVar.ouw();
                            }
                        } else if (!TextUtils.isEmpty(stringExtra3) && (ouwVarLh = com.bytedance.sdk.openadsdk.core.bly.ouw().lh(stringExtra3)) != null) {
                            ouwVarLh.ouw();
                            com.bytedance.sdk.openadsdk.core.bly.ouw().yu(stringExtra3);
                        }
                        TTDelegateActivity.ouw(stringExtra3);
                        TTDelegateActivity.this.finish();
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.cd.ouw
                    public final void ouw() {
                        if (!((com.bytedance.sdk.openadsdk.lh.lh) TTDelegateActivity.this.f7707lh).f8577lh) {
                            TTDelegateActivity.ouw(stringExtra3);
                            TTDelegateActivity.this.finish();
                        }
                        ((com.bytedance.sdk.openadsdk.lh.lh) TTDelegateActivity.this.f7707lh).f8577lh = false;
                    }
                });
            }
            cd cdVar2 = tTDelegateActivity.f7707lh;
            if (cdVar2 != null) {
                cdVar2.ouw();
                return;
            }
            return;
        }
        finish();
    }

    public static void ouw(vpp vppVar, String str, ra.ouw ouwVar) {
        if (vppVar == null) {
            return;
        }
        Intent intent = new Intent(zih.ouw(), (Class<?>) TTDelegateActivity.class);
        intent.addFlags(268435456);
        intent.putExtra("type", 6);
        intent.putExtra("closed_listener_key", str);
        if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            intent.putExtra("ext_info", vppVar.yhj);
            intent.putExtra("filter_words", com.bytedance.sdk.openadsdk.tool.ouw.ouw(vppVar.jae));
            intent.putExtra("creative_info", vppVar.ouw(true).toString());
        } else {
            intent.putExtra("meta_index", od.ouw().ouw(vppVar));
        }
        if (ouwVar != null) {
            if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
                com.bytedance.sdk.openadsdk.core.bly.ouw().ouw(str, ouwVar);
            } else {
                yu.put(str, ouwVar);
            }
        }
        com.bytedance.sdk.component.utils.vt.ouw(zih.ouw(), intent, null);
    }

    public static void ouw(vpp vppVar, String str) {
        ouw(vppVar, str, null);
    }

    public static /* synthetic */ void ouw(String str) {
        ko.lh("showDislike", "removeDislikeListener....closedListenerKey=".concat(String.valueOf(str)));
        Map<String, ra.ouw> map = yu;
        if (map == null || TextUtils.isEmpty(str)) {
            return;
        }
        map.remove(str);
        if (ko.yu()) {
            ko.lh("showDislike", "removeDislikeListener....mListenerMap.size:" + map.size());
        }
    }
}
