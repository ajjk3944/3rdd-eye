package com.bytedance.sdk.openadsdk.core.sup.emc;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.sup.ypw.xq;
import com.bytedance.sdk.openadsdk.utils.vw;
import java.io.File;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class ypw {
    public int bw;
    protected double dg;
    public int emc;
    protected int xq;
    public emc ycc;
    protected final Context ypw;

    public static class emc {
        public int emc;
        public boolean xq;
        public int ypw;
    }

    public ypw(Context context, int i, int i3) {
        this.xq = 0;
        this.dg = 0.0d;
        if (i3 > 0 && i > 0) {
            this.dg = i / i3;
        }
        float fMsw = vw.msw(context);
        if (fMsw != 0.0f && i > 0) {
            this.xq = (int) (i / fMsw);
        }
        this.ypw = context.getApplicationContext();
    }

    public abstract com.bytedance.sdk.openadsdk.core.sup.emc emc(String str, File file, List<xq> list);

    public void emc(Exception exc, int i) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("exception", exc.getMessage());
            jSONObject.put("error_code", i);
            com.bytedance.sdk.openadsdk.vk.xq.emc().emc("load_vast", jSONObject);
        } catch (Exception unused) {
        }
    }

    public boolean emc(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        try {
            return Integer.parseInt(str) < 2;
        } catch (NumberFormatException unused) {
            return true;
        }
    }

    public String emc(String str, List<xq> list) throws JSONException {
        int i = this.emc;
        String strDg = null;
        if (i >= 5) {
            return null;
        }
        this.emc = i + 1;
        if (str == null) {
            return null;
        }
        try {
            com.bytedance.sdk.component.uym.ypw.ypw ypwVarXq = com.bytedance.sdk.openadsdk.yzg.ypw.ypw().xq().xq();
            ypwVarXq.ypw(str);
            com.bytedance.sdk.component.uym.ypw ypwVarEmc = ypwVarXq.emc();
            strDg = ypwVarEmc.dg();
            ypwVarEmc.emc();
            return strDg;
        } catch (Exception e6) {
            emc(e6, 0);
            if (!list.isEmpty()) {
                xq.ypw((rie) null, list, com.bytedance.sdk.openadsdk.core.sup.emc.emc.WRAPPER_TIMEOUT, -1L, (String) null, (String) null);
            }
            return strDg;
        }
    }
}
