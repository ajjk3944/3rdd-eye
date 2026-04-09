package com.bytedance.sdk.openadsdk.core.sup.emc;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
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

    public ypw(Context context, int i10, int i11) {
        this.xq = 0;
        this.dg = 0.0d;
        if (i11 > 0 && i10 > 0) {
            this.dg = i10 / i11;
        }
        float fMsw = vw.msw(context);
        if (fMsw != 0.0f && i10 > 0) {
            this.xq = (int) (i10 / fMsw);
        }
        this.ypw = context.getApplicationContext();
    }

    public abstract com.bytedance.sdk.openadsdk.core.sup.emc emc(String str, File file, List<xq> list);

    public void emc(Exception exc, int i10) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("exception", exc.getMessage());
            jSONObject.put("error_code", i10);
            com.bytedance.sdk.openadsdk.vk.xq.emc().emc("load_vast", jSONObject);
        } catch (Exception unused) {
        }
    }

    public boolean emc(@Nullable String str) {
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
        int i10 = this.emc;
        String strDg = null;
        if (i10 >= 5) {
            return null;
        }
        this.emc = i10 + 1;
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
        } catch (Exception e10) {
            emc(e10, 0);
            if (!list.isEmpty()) {
                xq.ypw((rie) null, list, com.bytedance.sdk.openadsdk.core.sup.emc.emc.WRAPPER_TIMEOUT, -1L, (String) null, (String) null);
            }
            return strDg;
        }
    }
}
