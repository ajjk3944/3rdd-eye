package com.bytedance.sdk.openadsdk.core.ru;

import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class ypw {
    private static com.bytedance.sdk.openadsdk.core.ru.emc emc;
    private String ypw;

    public static class emc {
        private static final ypw emc = new ypw();
    }

    public String bw() {
        com.bytedance.sdk.openadsdk.core.ru.emc emcVar = emc;
        return emcVar != null ? emcVar.bw() : "";
    }

    public String dg() {
        String strDg;
        com.bytedance.sdk.openadsdk.core.ru.emc emcVar = emc;
        return (emcVar == null || (strDg = emcVar.dg()) == null) ? "" : strDg;
    }

    public void emc(String str) {
        com.bytedance.sdk.openadsdk.core.ru.emc emcVar;
        if (TextUtils.isEmpty(str) || (emcVar = emc) == null) {
            return;
        }
        emcVar.emc(str);
    }

    public int uym() {
        com.bytedance.sdk.openadsdk.core.ru.emc emcVar = emc;
        if (emcVar != null) {
            return emcVar.uym();
        }
        return 1;
    }

    public boolean xq() {
        com.bytedance.sdk.openadsdk.core.ru.emc emcVar = emc;
        if (emcVar == null) {
            return false;
        }
        return emcVar.ypw();
    }

    public long ycc() {
        com.bytedance.sdk.openadsdk.core.ru.emc emcVar = emc;
        if (emcVar != null) {
            return emcVar.ycc();
        }
        return 0L;
    }

    public void ypw(String str) {
        com.bytedance.sdk.openadsdk.core.ru.emc emcVar;
        if (TextUtils.isEmpty(str) || (emcVar = emc) == null) {
            return;
        }
        emcVar.ypw(str);
    }

    private ypw() {
        this.ypw = null;
        emc = new com.bytedance.sdk.openadsdk.core.ru.emc();
    }

    public static ypw ypw() {
        return emc.emc;
    }

    public void emc(Map<String, Object> map) {
        com.bytedance.sdk.openadsdk.core.ru.emc emcVar = emc;
        if (emcVar != null) {
            emcVar.emc(map);
        }
    }

    public void emc() {
        com.bytedance.sdk.openadsdk.core.ru.emc emcVar = emc;
        if (emcVar != null) {
            emcVar.xq();
        }
    }

    public void emc(String str, Map<String, Object> map) {
        com.bytedance.sdk.openadsdk.core.ru.emc emcVar = emc;
        if (emcVar != null) {
            emcVar.emc(str, map);
        }
    }

    public Map<String, String> emc(String str, byte[] bArr) {
        com.bytedance.sdk.openadsdk.core.ru.emc emcVar = emc;
        if (emcVar != null) {
            return emcVar.emc(str, bArr);
        }
        return new HashMap();
    }

    public void emc(MotionEvent motionEvent) {
        com.bytedance.sdk.openadsdk.core.ru.emc emcVar = emc;
        if (emcVar != null) {
            emcVar.emc(motionEvent);
        }
    }
}
