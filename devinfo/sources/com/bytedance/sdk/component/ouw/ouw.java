package com.bytedance.sdk.component.ouw;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.sdk.component.ouw.jg;
import com.bytedance.sdk.component.ouw.le;
import d.h;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class ouw {
    protected String fkw;

    /* renamed from: lh, reason: collision with root package name */
    protected ra f7604lh;
    protected Context ouw;
    le ra;
    protected cf vt;
    protected Handler yu = new Handler(Looper.getMainLooper());

    /* renamed from: le, reason: collision with root package name */
    protected volatile boolean f7603le = false;
    private final Map<String, le> pno = new HashMap();

    public void invokeMethod(final String str) {
        if (this.f7603le) {
            return;
        }
        pno.ouw("Received call: ".concat(String.valueOf(str)));
        this.yu.post(new Runnable() { // from class: com.bytedance.sdk.component.ouw.ouw.1
            @Override // java.lang.Runnable
            public final void run() {
                jg jgVarOuw;
                if (ouw.this.f7603le) {
                    return;
                }
                try {
                    jgVarOuw = ouw.this.ouw(new JSONObject(str));
                } catch (Exception e2) {
                    pno.vt("Exception thrown while parsing function.", e2);
                    jgVarOuw = null;
                }
                if (jgVarOuw != null && jgVarOuw.ouw == 1 && !TextUtils.isEmpty(jgVarOuw.yu) && !TextUtils.isEmpty(jgVarOuw.fkw)) {
                    ouw.this.ouw(jgVarOuw);
                    return;
                }
                pno.ouw("By pass invalid call: ".concat(String.valueOf(jgVarOuw)));
                if (jgVarOuw != null) {
                    ouw.this.vt(th.ouw(new rn(jgVarOuw.ouw, "Failed to parse invocation.")), jgVarOuw);
                }
            }
        });
    }

    public final void lh(bly blyVar) {
        this.ouw = ouw(blyVar);
        this.f7604lh = blyVar.yu;
        this.vt = blyVar.pno;
        this.ra = new le(blyVar, this);
        this.fkw = blyVar.tlj;
        vt(blyVar);
    }

    public abstract Context ouw(bly blyVar);

    public abstract String ouw();

    public abstract void ouw(String str);

    public void ouw(String str, jg jgVar) {
        ouw(str);
    }

    public void vt() {
        this.ra.ouw();
        Iterator<le> it = this.pno.values().iterator();
        while (it.hasNext()) {
            it.next().ouw();
        }
        this.yu.removeCallbacksAndMessages(null);
        this.f7603le = true;
    }

    public abstract void vt(bly blyVar);

    public final void ouw(jg jgVar) {
        String strOuw;
        if (this.f7603le || (strOuw = ouw()) == null) {
            return;
        }
        String str = jgVar.ra;
        le leVar = (TextUtils.equals(str, this.fkw) || TextUtils.isEmpty(str)) ? this.ra : this.pno.get(str);
        if (leVar == null) {
            pno.vt("Received call with unknown namespace, ".concat(String.valueOf(jgVar)));
            if (this.vt != null) {
                ouw();
            }
            vt(th.ouw(new rn(-4, h.w(new StringBuilder("Namespace "), jgVar.ra, " unknown."))), jgVar);
            return;
        }
        fkw fkwVar = new fkw();
        fkwVar.vt = strOuw;
        fkwVar.ouw = this.ouw;
        fkwVar.f7593lh = leVar;
        try {
            le.ouw ouwVarOuw = leVar.ouw(jgVar, fkwVar);
            if (ouwVarOuw != null) {
                if (ouwVarOuw.ouw) {
                    vt(ouwVarOuw.vt, jgVar);
                }
                if (this.vt != null) {
                    ouw();
                    return;
                }
                return;
            }
            pno.vt("Received call but not registered, ".concat(String.valueOf(jgVar)));
            if (this.vt != null) {
                ouw();
            }
            vt(th.ouw(new rn(-2, "Function " + jgVar.yu + " is not registered.")), jgVar);
        } catch (Exception e2) {
            pno.ouw("call finished with error, ".concat(String.valueOf(jgVar)), e2);
            vt(th.ouw(e2), jgVar);
        }
    }

    public final void vt(String str, jg jgVar) {
        JSONObject jSONObject;
        if (this.f7603le) {
            return;
        }
        if (TextUtils.isEmpty(jgVar.f7594le)) {
            pno.ouw("By passing js callback due to empty callback: ".concat(String.valueOf(str)));
            return;
        }
        if (!str.startsWith("{") || !str.endsWith("}")) {
            pno.ouw(new IllegalArgumentException("Illegal callback data: ".concat(str)));
        }
        pno.ouw("Invoking js callback: " + jgVar.f7594le);
        try {
            jSONObject = new JSONObject(str);
        } catch (Exception unused) {
            jSONObject = new JSONObject();
        }
        ouw(new mwh().ouw("__msg_type", "callback").ouw("__callback_id", jgVar.f7594le).ouw("__params", jSONObject).ouw(), jgVar);
    }

    public final jg ouw(JSONObject jSONObject) throws JSONException {
        String strOptString;
        if (this.f7603le) {
            return null;
        }
        String strOptString2 = jSONObject.optString("__callback_id");
        String strOptString3 = jSONObject.optString("func");
        if (ouw() == null) {
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
            String strOptString5 = jSONObject.optString("__iframe_url");
            byte b10 = 0;
            jg.ouw ouwVar = new jg.ouw(b10);
            ouwVar.ouw = string2;
            ouwVar.vt = string;
            ouwVar.f7597lh = strOptString3;
            ouwVar.yu = strOptString;
            ouwVar.fkw = strOptString2;
            ouwVar.f7596le = strOptString4;
            ouwVar.ra = strOptString5;
            return new jg(ouwVar, b10);
        } catch (JSONException e2) {
            pno.vt("Failed to create call.", e2);
            return new jg(strOptString2);
        }
    }
}
