package com.bytedance.sdk.component.adexpress.emc.ypw;

import android.text.TextUtils;
import android.util.Pair;
import android.webkit.WebResourceResponse;
import com.bytedance.sdk.component.adexpress.dg.zz;
import com.bytedance.sdk.component.adexpress.emc.xq.emc;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ypw {
    static Object emc = new Object();

    public static boolean bw() {
        return bw.ypw().bw();
    }

    public static com.bytedance.sdk.component.adexpress.emc.xq.emc dg() {
        return bw.ypw().ycc();
    }

    public static void emc() {
        bw.ypw();
    }

    private static File uym(String str) {
        List<Pair<String, String>> listYpw;
        emc.ypw ypwVarBw = dg().bw();
        if (ypwVarBw != null && (listYpw = ypwVarBw.ypw()) != null && listYpw.size() > 0) {
            for (Pair<String, String> pair : listYpw) {
                Object obj = pair.second;
                if (obj != null && ((String) obj).equals(str)) {
                    return new File(bw.msw(), (String) pair.first);
                }
            }
        }
        return null;
    }

    public static String xq() {
        return ycc.xq();
    }

    private static String ycc() {
        com.bytedance.sdk.component.adexpress.emc.xq.emc emcVarDg = dg();
        if (emcVarDg == null) {
            return null;
        }
        return emcVarDg.dg();
    }

    public static void ypw() {
        try {
            msw.dg();
            File fileMsw = bw.msw();
            if (fileMsw == null || !fileMsw.exists()) {
                return;
            }
            if (fileMsw.getParentFile() != null) {
                com.bytedance.sdk.component.utils.uym.xq(fileMsw.getParentFile());
            } else {
                com.bytedance.sdk.component.utils.uym.xq(fileMsw);
            }
        } catch (Throwable unused) {
        }
    }

    private static boolean bw(String str) {
        com.bytedance.sdk.component.adexpress.emc.xq.emc emcVarDg;
        List<emc.C0109emc> listYcc;
        if (!bw() || (emcVarDg = dg()) == null || (listYcc = emcVarDg.ycc()) == null) {
            return false;
        }
        for (emc.C0109emc c0109emc : listYcc) {
            if (c0109emc != null && TextUtils.equals(str, c0109emc.emc())) {
                return true;
            }
        }
        return false;
    }

    public static String dg(String str) {
        com.bytedance.sdk.component.adexpress.emc.xq.emc emcVar;
        com.bytedance.sdk.component.adexpress.emc.xq.emc emcVarDg = dg();
        if (emcVarDg == null) {
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            return ycc();
        }
        Map<String, com.bytedance.sdk.component.adexpress.emc.xq.emc> mapEmc = emcVarDg.emc();
        if (mapEmc == null || mapEmc.size() <= 0 || (emcVar = mapEmc.get(str)) == null) {
            return null;
        }
        return emcVar.dg();
    }

    public static com.bytedance.sdk.component.adexpress.emc.xq.ypw emc(String str) {
        return uym.emc().emc(str);
    }

    public static com.bytedance.sdk.component.adexpress.emc.xq.ypw xq(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        com.bytedance.sdk.component.adexpress.emc.xq.ypw ypwVarEmc = uym.emc().emc(str);
        if (ypwVarEmc != null) {
            ypwVarEmc.emc(Long.valueOf(System.currentTimeMillis()));
            emc(ypwVarEmc);
        }
        return ypwVarEmc;
    }

    public static void emc(com.bytedance.sdk.component.adexpress.emc.xq.dg dgVar) {
        uym.emc().emc(dgVar, dgVar.ycc);
    }

    private static File ycc(String str) throws IOException {
        if (bw()) {
            Iterator<emc.C0109emc> it = dg().ycc().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                emc.C0109emc next = it.next();
                if (next.emc() != null && next.emc().equals(str)) {
                    File file = new File(bw.msw(), com.bytedance.sdk.component.utils.bw.emc(next.emc()));
                    String strEmc = com.bytedance.sdk.component.utils.bw.emc(file);
                    if (next.ypw() == null || !next.ypw().equals(strEmc)) {
                        break;
                    }
                    return file;
                }
            }
        }
        return null;
    }

    private static void emc(final com.bytedance.sdk.component.adexpress.emc.xq.ypw ypwVar) {
        com.bytedance.sdk.component.adexpress.dg.dg.emc(new com.bytedance.sdk.component.msw.msw("updateTmplTime") { // from class: com.bytedance.sdk.component.adexpress.emc.ypw.ypw.1
            @Override // java.lang.Runnable
            public void run() {
                synchronized (ypw.emc) {
                    ycc.emc().emc(ypwVar, true);
                }
            }
        }, 10);
    }

    public static emc emc(String str, zz.emc emcVar, String str2, String str3) throws IOException {
        File fileYcc;
        emc emcVar2 = new emc();
        if (TextUtils.isEmpty(str3)) {
            fileYcc = null;
        } else {
            fileYcc = ypw(str3, str);
            if (fileYcc != null) {
                emcVar2.emc(1);
            }
        }
        if (fileYcc == null && (fileYcc = uym(str)) != null) {
            emcVar2.emc(3);
        }
        if (fileYcc == null && (fileYcc = ycc(str)) != null) {
            emcVar2.emc(2);
        }
        if (!TextUtils.isEmpty(str3)) {
            if (!emc(str, str3)) {
                emcVar2.emc(4);
            }
        } else if (!bw(str)) {
            emcVar2.emc(6);
        }
        emcVar2.ypw();
        if (fileYcc != null) {
            try {
                emcVar2.emc(new WebResourceResponse(emcVar.emc(), "utf-8", new FileInputStream(fileYcc)));
            } catch (Throwable unused) {
            }
        }
        return emcVar2;
    }

    public static Set<String> ypw(String str) {
        return uym.emc().ypw(str);
    }

    private static File ypw(String str, String str2) throws IOException {
        com.bytedance.sdk.component.adexpress.emc.xq.emc emcVar;
        com.bytedance.sdk.component.adexpress.emc.xq.emc emcVarDg = dg();
        if (emcVarDg != null && bw()) {
            Map<String, com.bytedance.sdk.component.adexpress.emc.xq.emc> mapEmc = emcVarDg.emc();
            if (mapEmc.size() != 0 && (emcVar = mapEmc.get(str)) != null) {
                Iterator<emc.C0109emc> it = emcVar.ycc().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    emc.C0109emc next = it.next();
                    if (next.emc() != null && next.emc().equals(str2)) {
                        File file = new File(bw.msw(), com.bytedance.sdk.component.utils.bw.emc(next.emc()));
                        String strEmc = com.bytedance.sdk.component.utils.bw.emc(file);
                        if (next.ypw() == null || !next.ypw().equals(strEmc)) {
                            break;
                        }
                        return file;
                    }
                }
            }
        }
        return null;
    }

    public static boolean ypw(JSONObject jSONObject) {
        Object objOpt;
        return (jSONObject == null || (objOpt = jSONObject.opt("xTemplate")) == null || TextUtils.isEmpty(objOpt.toString())) ? false : true;
    }

    private static boolean emc(String str, String str2) {
        com.bytedance.sdk.component.adexpress.emc.xq.emc emcVarDg;
        com.bytedance.sdk.component.adexpress.emc.xq.emc emcVar;
        if (!bw() || (emcVarDg = dg()) == null) {
            return false;
        }
        Map<String, com.bytedance.sdk.component.adexpress.emc.xq.emc> mapEmc = emcVarDg.emc();
        if (mapEmc.size() == 0 || (emcVar = mapEmc.get(str2)) == null) {
            return false;
        }
        for (emc.C0109emc c0109emc : emcVar.ycc()) {
            if (c0109emc != null && TextUtils.equals(str, c0109emc.emc())) {
                return true;
            }
        }
        return false;
    }

    public static boolean emc(JSONObject jSONObject) {
        Object objOpt;
        return (jSONObject == null || (objOpt = jSONObject.opt("template_Plugin")) == null || TextUtils.isEmpty(objOpt.toString())) ? false : true;
    }
}
