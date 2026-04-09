package com.bytedance.sdk.openadsdk.core.gbl.emc;

import android.text.TextUtils;
import com.bytedance.sdk.component.msw.msw;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.zz;
import com.bytedance.sdk.openadsdk.utils.iyl;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import o4.AbstractC2763b;
import org.json.JSONException;
import org.json.JSONObject;
import x.AbstractC2984e;

/* loaded from: classes.dex */
public class ypw {
    private static volatile ypw emc;

    public interface emc {
        void emc(int i, String str, String str2);

        void emc(JSONObject jSONObject, String str);
    }

    private void ypw(String str, String str2, String str3, String str4, String str5) {
        com.bytedance.sdk.openadsdk.core.gbl.emc.emc emcVar = new com.bytedance.sdk.openadsdk.core.gbl.emc.emc();
        emcVar.xq(str).bw(str3).dg(str4).ypw(str2).emc(str5).emc(Long.valueOf(System.currentTimeMillis()));
        xq.emc().emc(emcVar);
        ypw();
    }

    public static ypw emc() {
        if (emc == null) {
            synchronized (ypw.class) {
                try {
                    if (emc == null) {
                        emc = new ypw();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return emc;
    }

    public void emc(com.bytedance.sdk.openadsdk.core.gbl.msw.emc emcVar, String str) {
        if (emcVar == null || TextUtils.isEmpty(emcVar.emc())) {
            return;
        }
        StringBuilder sbB = AbstractC2984e.b(str, "_");
        sbB.append(emcVar.emc());
        final String string = sbB.toString();
        final String strXq = emcVar.xq();
        final String strYpw = emcVar.ypw();
        final String strDg = emcVar.dg();
        String strBw = emcVar.bw();
        if (TextUtils.isEmpty(strBw)) {
            if (str.equals("ad")) {
                strBw = zz.ypw().dg();
            } else if (str.equals("adv3")) {
                strBw = zz.ypw().dg() + "_v3";
            }
        }
        final String str2 = strBw;
        iyl.emc(new msw("saveUGenTemplate") { // from class: com.bytedance.sdk.openadsdk.core.gbl.emc.ypw.1
            @Override // java.lang.Runnable
            public void run() {
                ypw.this.emc(string, strXq, strYpw, strDg, str2);
            }
        }, 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ypw() {
        int iYcc = aa.dg().ycc();
        if (iYcc <= 0) {
            iYcc = 100;
        }
        List<com.bytedance.sdk.openadsdk.core.gbl.emc.emc> listYpw = xq.emc().ypw();
        if (listYpw == null || listYpw.isEmpty() || iYcc >= listYpw.size()) {
            if (listYpw == null) {
                return;
            }
            listYpw.size();
            return;
        }
        int size = (int) (listYpw.size() - (iYcc * 0.75f));
        if (size <= 0) {
            return;
        }
        TreeMap treeMap = new TreeMap();
        for (com.bytedance.sdk.openadsdk.core.gbl.emc.emc emcVar : listYpw) {
            treeMap.put(emcVar.dg(), emcVar);
        }
        HashSet hashSet = new HashSet();
        int i = 0;
        for (Map.Entry entry : treeMap.entrySet()) {
            if (entry != null && i < size) {
                i++;
                com.bytedance.sdk.openadsdk.core.gbl.emc.emc emcVar2 = (com.bytedance.sdk.openadsdk.core.gbl.emc.emc) entry.getValue();
                if (emcVar2 != null) {
                    hashSet.add(emcVar2.emc());
                }
            }
        }
        emc(hashSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc(String str, String str2, String str3, String str4, String str5) {
        if (emc(str, str3) != null) {
            if (TextUtils.isEmpty(str4) || TextUtils.isEmpty(str3)) {
                return;
            }
            ypw(str2, str3, str5, str4, str);
            return;
        }
        if (TextUtils.isEmpty(str4)) {
            emc(str2, str, str3, str5, (emc) null);
        } else {
            ypw(str2, str3, str5, str4, str);
        }
    }

    public void emc(String str, String str2, String str3, String str4, String str5, final emc emcVar) {
        if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
            if (emcVar != null) {
                emcVar.emc(1, "id  or md5 is empty", "net");
                return;
            }
            return;
        }
        String strF = AbstractC2763b.f(str, "_", str3);
        com.bytedance.sdk.openadsdk.core.gbl.emc.emc emcVarEmc = emc(strF, str4);
        if (emcVarEmc != null && !TextUtils.isEmpty(emcVarEmc.bw())) {
            emc(emcVarEmc);
            if (emcVar != null) {
                try {
                    emcVar.emc(new JSONObject(emcVarEmc.bw()), "local");
                    return;
                } catch (JSONException unused) {
                    emcVar.emc(2, "parse json exception data is " + emcVarEmc.bw(), "local");
                    return;
                }
            }
            return;
        }
        emc(str2, strF, str4, str5, new emc() { // from class: com.bytedance.sdk.openadsdk.core.gbl.emc.ypw.2
            @Override // com.bytedance.sdk.openadsdk.core.gbl.emc.ypw.emc
            public void emc(JSONObject jSONObject, String str6) {
                emc emcVar2 = emcVar;
                if (emcVar2 != null) {
                    emcVar2.emc(jSONObject, str6);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.gbl.emc.ypw.emc
            public void emc(int i, String str6, String str7) {
                emc emcVar2 = emcVar;
                if (emcVar2 != null) {
                    emcVar2.emc(i, str6, str7);
                }
            }
        });
    }

    private void emc(final String str, final String str2, final String str3, final String str4, final emc emcVar) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            if (emcVar != null) {
                emcVar.emc(1, "template url or id  or md5 is empty", "net");
            }
        } else {
            com.bytedance.sdk.component.uym.ypw.ypw ypwVarXq = com.bytedance.sdk.openadsdk.yzg.ypw.ypw().xq().xq();
            ypwVarXq.ypw(str);
            ypwVarXq.emc(7);
            ypwVarXq.emc("load_ug_t");
            ypwVarXq.emc(new com.bytedance.sdk.component.uym.emc.emc() { // from class: com.bytedance.sdk.openadsdk.core.gbl.emc.ypw.3
                @Override // com.bytedance.sdk.component.uym.emc.emc
                public void emc(com.bytedance.sdk.component.uym.ypw.xq xqVar, com.bytedance.sdk.component.uym.ypw ypwVar) {
                    if (ypwVar == null) {
                        return;
                    }
                    if (!ypwVar.ycc()) {
                        emc emcVar2 = emcVar;
                        if (emcVar2 != null) {
                            emcVar2.emc(3, "net code error code is " + ypwVar.emc() + " message is " + ypwVar.ypw(), "net");
                            return;
                        }
                        return;
                    }
                    String strDg = ypwVar.dg();
                    if (TextUtils.isEmpty(strDg)) {
                        emc emcVar3 = emcVar;
                        if (emcVar3 != null) {
                            emcVar3.emc(3, "net data is null", "net");
                            return;
                        }
                        return;
                    }
                    xq.emc().emc(new com.bytedance.sdk.openadsdk.core.gbl.emc.emc().emc(str2).ypw(str3).xq(str).bw(str4).dg(strDg).emc(Long.valueOf(System.currentTimeMillis())));
                    ypw.this.ypw();
                    if (emcVar != null) {
                        try {
                            emcVar.emc(new JSONObject(strDg), "net");
                        } catch (JSONException unused) {
                            emcVar.emc(2, "parse json exception data is".concat(String.valueOf(strDg)), "net");
                        }
                    }
                }

                @Override // com.bytedance.sdk.component.uym.emc.emc
                public void emc(com.bytedance.sdk.component.uym.ypw.xq xqVar, IOException iOException) {
                    emc emcVar2 = emcVar;
                    if (emcVar2 != null) {
                        emcVar2.emc(3, "net error " + iOException.getMessage(), "net");
                    }
                }
            });
        }
    }

    public Set<com.bytedance.sdk.openadsdk.core.gbl.emc.emc> emc(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return xq.emc().emc(str);
    }

    public String emc(String str, String str2, String str3) {
        com.bytedance.sdk.openadsdk.core.gbl.emc.emc emcVarEmc = emc(AbstractC2763b.f(str, "_", str2), str3);
        if (emcVarEmc == null) {
            return null;
        }
        emc(emcVarEmc);
        return emcVarEmc.bw();
    }

    private com.bytedance.sdk.openadsdk.core.gbl.emc.emc emc(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return xq.emc().emc(str, str2);
    }

    private void emc(final com.bytedance.sdk.openadsdk.core.gbl.emc.emc emcVar) {
        emcVar.emc(Long.valueOf(System.currentTimeMillis()));
        iyl.emc(new msw("updateTmplTime") { // from class: com.bytedance.sdk.openadsdk.core.gbl.emc.ypw.4
            @Override // java.lang.Runnable
            public void run() {
                xq.emc().emc(emcVar);
            }
        }, 10);
    }

    public void emc(Set<String> set) {
        try {
            xq.emc().emc(set);
        } catch (Throwable th) {
            th.getMessage();
        }
    }
}
