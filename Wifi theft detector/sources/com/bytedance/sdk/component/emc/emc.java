package com.bytedance.sdk.component.emc;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.sdk.component.emc.ycc;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class emc {
    protected String bw;
    protected Context emc;
    ycc uym;
    protected uym xq;
    protected gbl ypw;
    protected Handler dg = new Handler(Looper.getMainLooper());
    protected volatile boolean ycc = false;
    private final Map<String, ycc> msw = new HashMap();

    public abstract Context emc(zz zzVar);

    public abstract String emc();

    public abstract void emc(String str);

    public void invokeMethod(final String str) {
        if (this.ycc) {
            return;
        }
        this.dg.post(new Runnable() { // from class: com.bytedance.sdk.component.emc.emc.1
            @Override // java.lang.Runnable
            public void run() {
                qh qhVarEmc;
                if (emc.this.ycc) {
                    return;
                }
                try {
                    qhVarEmc = emc.this.emc(new JSONObject(str));
                } catch (Exception unused) {
                    qhVarEmc = null;
                }
                if (!qh.emc(qhVarEmc)) {
                    emc.this.emc(qhVarEmc);
                    return;
                }
                Objects.toString(qhVarEmc);
                if (qhVarEmc != null) {
                    emc.this.ypw(yzg.emc(new vk(qhVarEmc.emc, "Failed to parse invocation.")), qhVarEmc);
                }
            }
        });
    }

    public final void xq(zz zzVar) {
        this.emc = emc(zzVar);
        this.xq = zzVar.dg;
        this.ypw = zzVar.msw;
        this.uym = new ycc(zzVar, this);
        this.bw = zzVar.ru;
        ypw(zzVar);
    }

    public void ypw() {
        this.uym.emc();
        Iterator<ycc> it = this.msw.values().iterator();
        while (it.hasNext()) {
            it.next().emc();
        }
        this.dg.removeCallbacksAndMessages(null);
        this.ycc = true;
    }

    public abstract void ypw(zz zzVar);

    public void emc(String str, qh qhVar) {
        emc(str);
    }

    public final void emc(qh qhVar) {
        String strEmc;
        if (this.ycc || (strEmc = emc()) == null) {
            return;
        }
        ycc yccVarYpw = ypw(qhVar.uym);
        if (yccVarYpw == null) {
            qhVar.toString();
            if (this.ypw != null) {
                emc();
            }
            ypw(yzg.emc(new vk(-4, "Namespace " + qhVar.uym + " unknown.")), qhVar);
            return;
        }
        bw bwVar = new bw();
        bwVar.ypw = strEmc;
        bwVar.emc = this.emc;
        bwVar.xq = yccVarYpw;
        try {
            ycc.emc emcVarEmc = yccVarYpw.emc(qhVar, bwVar);
            if (emcVarEmc == null) {
                qhVar.toString();
                if (this.ypw != null) {
                    emc();
                }
                ypw(yzg.emc(new vk(-2, "Function " + qhVar.dg + " is not registered.")), qhVar);
                return;
            }
            if (emcVarEmc.emc) {
                ypw(emcVarEmc.ypw, qhVar);
            }
            if (this.ypw != null) {
                emc();
            }
        } catch (Exception e10) {
            qhVar.toString();
            ypw(yzg.emc(e10), qhVar);
        }
    }

    public final void ypw(String str, qh qhVar) {
        JSONObject jSONObject;
        if (this.ycc || TextUtils.isEmpty(qhVar.ycc)) {
            return;
        }
        if (!str.startsWith("{") || !str.endsWith("}")) {
            msw.emc(new IllegalArgumentException("Illegal callback data: ".concat(str)));
        }
        try {
            jSONObject = new JSONObject(str);
        } catch (Exception unused) {
            jSONObject = new JSONObject();
        }
        emc(sz.emc().emc("__msg_type", "callback").emc("__callback_id", qhVar.ycc).emc("__params", jSONObject).ypw(), qhVar);
    }

    private ycc ypw(String str) {
        if (!TextUtils.equals(str, this.bw) && !TextUtils.isEmpty(str)) {
            return this.msw.get(str);
        }
        return this.uym;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public qh emc(JSONObject jSONObject) throws JSONException {
        String strOptString;
        if (this.ycc) {
            return null;
        }
        String strOptString2 = jSONObject.optString("__callback_id");
        String strOptString3 = jSONObject.optString("func");
        if (emc() == null) {
            return null;
        }
        try {
            String string = jSONObject.getString("__msg_type");
            String strValueOf = "";
            try {
                Object objOpt = jSONObject.opt("params");
                if (objOpt == null) {
                    strOptString = strValueOf;
                } else if (objOpt instanceof JSONObject) {
                    strOptString = String.valueOf((JSONObject) objOpt);
                } else {
                    if (objOpt instanceof String) {
                        strValueOf = (String) objOpt;
                    } else {
                        strValueOf = String.valueOf(objOpt);
                    }
                    strOptString = strValueOf;
                }
            } catch (Throwable unused) {
                strOptString = jSONObject.optString("params");
            }
            String string2 = jSONObject.getString("JSSDK");
            String strOptString4 = jSONObject.optString("namespace");
            return qh.emc().emc(string2).ypw(string).xq(strOptString3).dg(strOptString).bw(strOptString2).ycc(strOptString4).uym(jSONObject.optString("__iframe_url")).emc();
        } catch (JSONException unused2) {
            return qh.emc(strOptString2, -1);
        }
    }
}
