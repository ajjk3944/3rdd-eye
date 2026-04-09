package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.common.ypw;
import com.bytedance.sdk.openadsdk.core.model.dr;
import com.bytedance.sdk.openadsdk.core.model.rie;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.FileFilter;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class qh {
    private static final ConcurrentHashMap<emc, qh> emc = new ConcurrentHashMap<>();
    private final emc dg;
    private final ypw.emc xq;
    private final Context ypw;

    public enum emc {
        REWARD_VIDEO("sp_reward_video", "sp_reward_video_new", "reward_video_cache"),
        FULL_SCREEN_VIDEO("sp_full_screen_video", "sp_full_screen_video_new", "full_screen_video_cache");

        final String bw;
        final String dg;
        final String xq;

        emc(String str, String str2, String str3) {
            this.xq = str;
            this.dg = str2;
            this.bw = str3;
        }
    }

    private qh(Context context, emc emcVar) {
        this.ypw = context == null ? com.bytedance.sdk.openadsdk.core.aa.emc() : context.getApplicationContext();
        this.dg = emcVar;
        this.xq = new ypw.emc(emcVar.xq);
    }

    private void xq() {
        File[] fileArrListFiles;
        try {
            File cacheDir = this.ypw.getCacheDir();
            if (cacheDir == null || !cacheDir.exists() || !cacheDir.isDirectory() || (fileArrListFiles = cacheDir.listFiles(new FileFilter() { // from class: com.bytedance.sdk.openadsdk.component.reward.qh.2
                @Override // java.io.FileFilter
                public boolean accept(File file) {
                    return file != null && file.getName().contains(qh.this.dg.bw);
                }
            })) == null) {
                return;
            }
            for (File file : fileArrListFiles) {
                try {
                    com.bytedance.sdk.component.utils.uym.xq(file);
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
        }
    }

    public com.bytedance.sdk.openadsdk.core.model.emc ypw(String str, boolean z6) {
        long jDg = this.xq.dg(str);
        boolean zBw = this.xq.bw(str);
        boolean zUym = this.xq.uym(str);
        if (System.currentTimeMillis() - jDg >= 10500000 || zBw) {
            return null;
        }
        if (z6 && zUym) {
            return null;
        }
        try {
            String strYpw = this.xq.ypw(str);
            if (TextUtils.isEmpty(strYpw)) {
                return null;
            }
            return ypw(strYpw);
        } catch (Exception unused) {
            return null;
        }
    }

    public static qh emc(Context context, emc emcVar) {
        ConcurrentHashMap<emc, qh> concurrentHashMap = emc;
        if (!concurrentHashMap.containsKey(emcVar)) {
            synchronized (qh.class) {
                try {
                    if (!concurrentHashMap.containsKey(emcVar)) {
                        concurrentHashMap.put(emcVar, new qh(context, emcVar));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return concurrentHashMap.get(emcVar);
    }

    private com.bytedance.sdk.openadsdk.core.model.emc ypw(String str) {
        com.bytedance.sdk.openadsdk.core.model.emc emcVarYpw;
        JSONObject jSONObject = new JSONObject(str);
        if (jSONObject.has("cypher")) {
            jSONObject = com.bytedance.sdk.openadsdk.core.aa.xq().emc(jSONObject);
        }
        if (jSONObject.has("creatives")) {
            emcVarYpw = com.bytedance.sdk.openadsdk.core.model.emc.ypw(jSONObject);
        } else {
            rie rieVarEmc = com.bytedance.sdk.openadsdk.core.ypw.emc(jSONObject);
            com.bytedance.sdk.openadsdk.core.model.emc emcVar = new com.bytedance.sdk.openadsdk.core.model.emc();
            emcVar.emc(rieVarEmc);
            emcVarYpw = emcVar;
        }
        if (emcVarYpw != null && emcVarYpw.bw()) {
            Iterator<rie> it = emcVarYpw.dg().iterator();
            while (it.hasNext()) {
                if (!emc(it.next())) {
                    it.remove();
                }
            }
            if (emcVarYpw.bw() && emcVarYpw.ycc() != null && emcVarYpw.ycc().vaf() != null) {
                return emcVarYpw;
            }
        }
        return null;
    }

    public void emc(String str, rie rieVar) {
        if (com.bytedance.sdk.openadsdk.utils.ypw.emc()) {
            com.bytedance.sdk.openadsdk.common.ypw.emc(this.dg.dg).emc(str, rieVar);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String strXq = this.xq.xq(str);
        String strLvs = rieVar != null ? rieVar.lvs() : "";
        if (TextUtils.isEmpty(strXq) || TextUtils.isEmpty(strLvs) || strXq.equals(strLvs)) {
            this.xq.msw(str);
        }
    }

    public void emc() {
        if (com.bytedance.sdk.openadsdk.utils.ypw.emc()) {
            com.bytedance.sdk.openadsdk.common.ypw.emc(this.dg.dg).emc();
        } else {
            ypw();
            xq();
        }
    }

    public void emc(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.emc emcVar) {
        rie rieVarYcc;
        if (emcVar == null || emcVar.ycc() == null || !emcVar.ycc().wh()) {
            if (com.bytedance.sdk.openadsdk.utils.ypw.emc()) {
                com.bytedance.sdk.openadsdk.common.ypw.emc(this.dg.dg).emc(adSlot, emcVar);
                return;
            }
            if (emcVar == null || adSlot == null || !TextUtils.isEmpty(adSlot.getBidAdm()) || (rieVarYcc = emcVar.ycc()) == null || rieVarYcc.lad() == 2) {
                return;
            }
            String strYpw = emcVar.ypw();
            if (this.dg == emc.REWARD_VIDEO && emcVar.msw()) {
                return;
            }
            try {
                this.xq.emc(adSlot, emcVar.sz().toString(), strYpw);
            } catch (Throwable unused) {
                if (this.dg == emc.REWARD_VIDEO) {
                    emcVar.zz();
                }
            }
        }
    }

    private void ypw() {
        File file;
        File[] fileArrListFiles;
        try {
            int i = Build.VERSION.SDK_INT;
            boolean zUym = com.bytedance.sdk.openadsdk.core.zz.uym(this.dg.xq);
            String str = zUym ? "files" : "shared_prefs";
            if (i >= 24) {
                file = new File(this.ypw.getDataDir(), str);
            } else {
                file = new File(this.ypw.getDatabasePath("1").getParentFile().getParentFile(), str);
            }
            if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles(new FileFilter() { // from class: com.bytedance.sdk.openadsdk.component.reward.qh.1
                @Override // java.io.FileFilter
                public boolean accept(File file2) {
                    return file2 != null && file2.getName().contains(qh.this.dg.xq);
                }
            })) != null) {
                for (File file2 : fileArrListFiles) {
                    if (zUym) {
                        try {
                            com.bytedance.sdk.component.utils.uym.xq(file2);
                        } catch (Throwable unused) {
                        }
                    } else {
                        String strReplace = file2.getName().replace(".xml", "");
                        if (Build.VERSION.SDK_INT >= 24) {
                            this.ypw.deleteSharedPreferences(strReplace);
                        } else {
                            this.ypw.getSharedPreferences(strReplace, 0).edit().clear().apply();
                            com.bytedance.sdk.component.utils.uym.xq(file2);
                        }
                    }
                }
            }
        } catch (Throwable unused2) {
        }
    }

    public String emc(String str, boolean z6) {
        com.bytedance.sdk.openadsdk.common.ypw ypwVarEmc = com.bytedance.sdk.openadsdk.common.ypw.emc(this.dg.dg);
        String strEmc = ypwVarEmc.emc(str, 10500000L);
        if (z6 && !TextUtils.isEmpty(strEmc) && ypwVarEmc.dg(str)) {
            return null;
        }
        return strEmc;
    }

    public boolean emc(com.bytedance.sdk.openadsdk.core.model.emc emcVar) {
        return com.bytedance.sdk.openadsdk.common.ypw.emc(this.dg.dg).emc(emcVar, true);
    }

    public void emc(String str) {
        if (com.bytedance.sdk.openadsdk.utils.ypw.emc()) {
            com.bytedance.sdk.openadsdk.common.ypw.emc(this.dg.dg).xq(str);
        } else {
            this.xq.ycc(str);
        }
    }

    private boolean emc(rie rieVar) {
        if (rieVar == null) {
            return false;
        }
        return dr.xq(rieVar) || rieVar.iat() != null;
    }
}
