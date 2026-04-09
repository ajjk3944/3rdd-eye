package com.bytedance.sdk.component.adexpress.emc.ypw;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class uym {
    private static volatile uym emc;
    private AtomicBoolean ypw = new AtomicBoolean(false);

    private uym() {
    }

    private JSONObject xq(String str) {
        com.bytedance.sdk.component.adexpress.emc.emc.xq xqVarXq = com.bytedance.sdk.component.adexpress.emc.emc.emc.emc().xq();
        if (xqVarXq == null) {
            return null;
        }
        com.bytedance.sdk.component.uym.ypw.ypw ypwVarUym = xqVarXq.uym();
        ypwVarUym.ypw(str);
        com.bytedance.sdk.component.uym.ypw ypwVarEmc = ypwVarUym.emc();
        if (ypwVarEmc != null) {
            try {
                if (ypwVarEmc.ycc() && ypwVarEmc.dg() != null) {
                    return new JSONObject(ypwVarEmc.dg());
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public Set<String> ypw(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return ycc.emc().ypw(str);
    }

    public static uym emc() {
        if (emc == null) {
            synchronized (uym.class) {
                try {
                    if (emc == null) {
                        emc = new uym();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return emc;
    }

    private void ypw() {
        if (com.bytedance.sdk.component.adexpress.emc.emc.emc.emc().xq() == null) {
            return;
        }
        int iEmc = com.bytedance.sdk.component.adexpress.emc.emc.emc.emc().xq().emc();
        if (iEmc <= 0) {
            iEmc = 100;
        }
        List<com.bytedance.sdk.component.adexpress.emc.xq.ypw> listYpw = ycc.emc().ypw();
        if (listYpw == null || listYpw.isEmpty() || iEmc >= listYpw.size()) {
            if (listYpw == null) {
                return;
            }
            listYpw.size();
            return;
        }
        TreeMap treeMap = new TreeMap();
        for (com.bytedance.sdk.component.adexpress.emc.xq.ypw ypwVar : listYpw) {
            treeMap.put(ypwVar.uym(), ypwVar);
        }
        HashSet hashSet = new HashSet();
        int size = (int) (listYpw.size() - (iEmc * 0.75f));
        int i = 0;
        for (Map.Entry entry : treeMap.entrySet()) {
            if (entry != null && i < size) {
                i++;
                ((Long) entry.getKey()).getClass();
                com.bytedance.sdk.component.adexpress.emc.xq.ypw ypwVar2 = (com.bytedance.sdk.component.adexpress.emc.xq.ypw) entry.getValue();
                if (ypwVar2 != null) {
                    hashSet.add(ypwVar2.ypw());
                }
            }
        }
        emc(hashSet);
        this.ypw.set(false);
    }

    public com.bytedance.sdk.component.adexpress.emc.xq.ypw emc(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return ycc.emc().emc(str);
    }

    public void emc(com.bytedance.sdk.component.adexpress.emc.xq.dg dgVar, String str) {
        String strMsw;
        if (dgVar == null) {
            return;
        }
        final String str2 = dgVar.emc;
        final String str3 = dgVar.xq;
        final String str4 = dgVar.ypw;
        final String str5 = dgVar.dg;
        final String str6 = dgVar.bw;
        if (com.bytedance.sdk.component.adexpress.emc.emc.emc.emc().xq() != null) {
            strMsw = com.bytedance.sdk.component.adexpress.emc.emc.emc.emc().xq().msw();
        } else {
            strMsw = "";
        }
        final String str7 = TextUtils.isEmpty(str) ? strMsw : str;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        com.bytedance.sdk.component.adexpress.dg.dg.emc(new com.bytedance.sdk.component.msw.msw("saveTemplate") { // from class: com.bytedance.sdk.component.adexpress.emc.ypw.uym.1
            @Override // java.lang.Runnable
            public void run() throws Throwable {
                uym.this.emc(str2, str3, str4, str5, str6, str7);
            }
        }, 10);
    }

    private void ypw(String str, String str2, String str3, String str4, String str5, String str6) {
        ycc.emc().emc(new com.bytedance.sdk.component.adexpress.emc.xq.ypw().emc(str).ypw(str2).xq(str3).dg(str4).bw(str5).ycc(str6).emc(Long.valueOf(System.currentTimeMillis())), false);
        ypw();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void emc(String str, String str2, String str3, String str4, String str5, String str6) throws Throwable {
        String str7;
        try {
            try {
                if (emc(str) != null) {
                    if (!TextUtils.isEmpty(str4)) {
                        if (!TextUtils.isEmpty(str3)) {
                            str7 = str5;
                            ypw(str6, str, str3, str2, str4, str7);
                        }
                    }
                    return;
                }
                str7 = str5;
                if (TextUtils.isEmpty(str4) || TextUtils.isEmpty(str3)) {
                    emc(str2, str6, str);
                } else {
                    ypw(str6, str, str3, str2, str4, str7);
                }
                boolean zEmc = msw.emc(str7);
                if (!ypw.bw() || zEmc) {
                    bw.ypw().emc(true);
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    private void emc(String str, String str2, String str3) {
        JSONObject jSONObjectXq;
        if (TextUtils.isEmpty(str) || (jSONObjectXq = xq(str)) == null) {
            return;
        }
        String strOptString = jSONObjectXq.optString("md5");
        String strOptString2 = jSONObjectXq.optString("version");
        String strOptString3 = jSONObjectXq.optString("data");
        if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2) || TextUtils.isEmpty(strOptString3)) {
            return;
        }
        com.bytedance.sdk.component.adexpress.emc.xq.ypw ypwVarEmc = new com.bytedance.sdk.component.adexpress.emc.xq.ypw().emc(str2).ypw(str3).xq(strOptString).dg(str).bw(strOptString3).ycc(strOptString2).emc(Long.valueOf(System.currentTimeMillis()));
        ycc.emc().emc(ypwVarEmc, false);
        ypw();
        if (msw.emc(strOptString2)) {
            ypwVarEmc.ycc(strOptString2);
            bw.ypw().emc(true);
        }
    }

    public void emc(Set<String> set) {
        try {
            ycc.emc().emc(set);
        } catch (Throwable th) {
            th.getMessage();
        }
    }
}
