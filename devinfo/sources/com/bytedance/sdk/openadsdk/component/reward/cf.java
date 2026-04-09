package com.bytedance.sdk.openadsdk.component.reward;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.common.vt;
import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.zih;
import java.util.Iterator;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class cf {

    /* renamed from: lh, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static volatile cf f7913lh;
    final Context ouw;
    final vt.ouw vt;

    private cf(Context context) {
        this.ouw = context == null ? zih.ouw() : context.getApplicationContext();
        this.vt = new vt.ouw("sp_reward_video");
    }

    public final void ouw(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.ouw ouwVar) {
        vpp vppVarLh;
        if (ouwVar == null || ouwVar.lh() == null || !ouwVar.lh().zn) {
            if (com.bytedance.sdk.openadsdk.utils.vt.ouw()) {
                com.bytedance.sdk.openadsdk.common.vt.ouw("sp_reward_video_new").ouw(adSlot, ouwVar);
                return;
            }
            if (ouwVar == null || ouwVar.pno || adSlot == null || !TextUtils.isEmpty(adSlot.getBidAdm()) || (vppVarLh = ouwVar.lh()) == null || vppVarLh.yhj() == 2) {
                return;
            }
            String strOuw = ouwVar.ouw();
            synchronized (ouwVar) {
                try {
                    if (!ouwVar.pno) {
                        try {
                            this.vt.ouw(adSlot, ouwVar.fkw().toString(), strOuw);
                        } catch (Throwable unused) {
                            ouwVar.pno = false;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final com.bytedance.sdk.openadsdk.core.model.ouw vt(String str, boolean z3) {
        com.bytedance.sdk.openadsdk.core.model.ouw ouwVarOuw;
        long jYu = this.vt.yu(str);
        boolean zFkw = this.vt.fkw(str);
        boolean zRa = this.vt.ra(str);
        if (System.currentTimeMillis() - jYu < 10500000 && !zFkw && (!z3 || !zRa)) {
            try {
                String strVt = this.vt.vt(str);
                if (!TextUtils.isEmpty(strVt)) {
                    JSONObject jSONObject = new JSONObject(strVt);
                    if (jSONObject.has("cypher")) {
                        jSONObject = zih.lh().ouw(jSONObject);
                    }
                    if (jSONObject.has("creatives")) {
                        ouwVarOuw = com.bytedance.sdk.openadsdk.core.model.ouw.ouw(jSONObject);
                    } else {
                        vpp vppVarOuw = com.bytedance.sdk.openadsdk.core.vt.ouw(jSONObject);
                        com.bytedance.sdk.openadsdk.core.model.ouw ouwVar = new com.bytedance.sdk.openadsdk.core.model.ouw();
                        ouwVar.ouw(vppVarOuw);
                        ouwVarOuw = ouwVar;
                    }
                    if (ouwVarOuw != null && ouwVarOuw.vt()) {
                        Iterator<vpp> it = ouwVarOuw.yu.iterator();
                        while (it.hasNext()) {
                            vpp next = it.next();
                            if (next == null || (!od.lh(next) && next.f8309sd == null)) {
                                it.remove();
                            }
                        }
                        if (ouwVarOuw.vt() && ouwVarOuw.lh() != null) {
                            if (ouwVarOuw.lh().yiz != null) {
                                return ouwVarOuw;
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static cf ouw(Context context) {
        if (f7913lh == null) {
            synchronized (cf.class) {
                try {
                    if (f7913lh == null) {
                        f7913lh = new cf(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f7913lh;
    }

    public static String ouw(String str, boolean z3) {
        com.bytedance.sdk.openadsdk.common.vt vtVarOuw = com.bytedance.sdk.openadsdk.common.vt.ouw("sp_reward_video_new");
        String strLh = vtVarOuw.lh(str);
        if (z3 && !TextUtils.isEmpty(strLh) && vtVarOuw.fkw(str)) {
            return null;
        }
        return strLh;
    }

    public static boolean ouw(com.bytedance.sdk.openadsdk.core.model.ouw ouwVar) {
        com.bytedance.sdk.openadsdk.common.vt.ouw("sp_reward_video_new");
        return com.bytedance.sdk.openadsdk.common.vt.ouw(ouwVar);
    }
}
