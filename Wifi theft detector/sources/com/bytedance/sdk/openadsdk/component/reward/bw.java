package com.bytedance.sdk.openadsdk.component.reward;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.common.ypw;
import com.bytedance.sdk.openadsdk.core.model.dr;
import com.bytedance.sdk.openadsdk.core.model.rie;
import java.io.File;
import java.io.FileFilter;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes.dex */
class bw {

    @SuppressLint({"StaticFieldLeak"})
    private static volatile bw emc;
    private final ypw.emc xq;
    private final Context ypw;

    private bw(Context context) {
        this.ypw = context == null ? com.bytedance.sdk.openadsdk.core.aa.emc() : context.getApplicationContext();
        this.xq = new ypw.emc("sp_full_screen_video");
    }

    public void emc(String str, rie rieVar) {
        if (com.bytedance.sdk.openadsdk.utils.ypw.emc()) {
            com.bytedance.sdk.openadsdk.common.ypw.emc("sp_full_screen_video_new").emc(str, rieVar);
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

    public com.bytedance.sdk.openadsdk.core.model.emc ypw(String str, boolean z10) {
        com.bytedance.sdk.openadsdk.core.model.emc emcVarYpw;
        long jDg = this.xq.dg(str);
        boolean zBw = this.xq.bw(str);
        boolean zUym = this.xq.uym(str);
        if (System.currentTimeMillis() - jDg < 10500000 && !zBw && (!z10 || !zUym)) {
            try {
                String strYpw = this.xq.ypw(str);
                if (!TextUtils.isEmpty(strYpw)) {
                    JSONObject jSONObject = new JSONObject(strYpw);
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
                        if (emcVarYpw.bw() && emcVarYpw.ycc() != null) {
                            if (emcVarYpw.ycc().vaf() != null) {
                                return emcVarYpw;
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public void emc() {
        File[] fileArrListFiles;
        String str;
        File file;
        File[] fileArrListFiles2;
        if (com.bytedance.sdk.openadsdk.utils.ypw.emc()) {
            com.bytedance.sdk.openadsdk.common.ypw.emc("sp_full_screen_video_new").emc();
            return;
        }
        try {
            int i10 = Build.VERSION.SDK_INT;
            boolean zUym = com.bytedance.sdk.openadsdk.core.zz.uym("sp_full_screen_video");
            if (zUym) {
                str = "files";
            } else {
                str = "shared_prefs";
            }
            if (i10 >= 24) {
                file = new File(this.ypw.getDataDir(), str);
            } else {
                file = new File(this.ypw.getDatabasePath("1").getParentFile().getParentFile(), str);
            }
            if (file.exists() && file.isDirectory() && (fileArrListFiles2 = file.listFiles(new FileFilter() { // from class: com.bytedance.sdk.openadsdk.component.reward.bw.1
                @Override // java.io.FileFilter
                public boolean accept(File file2) {
                    if (file2 != null) {
                        return file2.getName().contains("sp_full_screen_video");
                    }
                    return false;
                }
            })) != null) {
                for (File file2 : fileArrListFiles2) {
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
        try {
            File cacheDir = this.ypw.getCacheDir();
            if (cacheDir == null || !cacheDir.exists() || !cacheDir.isDirectory() || (fileArrListFiles = cacheDir.listFiles(new FileFilter() { // from class: com.bytedance.sdk.openadsdk.component.reward.bw.2
                @Override // java.io.FileFilter
                public boolean accept(File file3) {
                    if (file3 != null) {
                        return file3.getName().contains("full_screen_video_cache");
                    }
                    return false;
                }
            })) == null) {
                return;
            }
            for (File file3 : fileArrListFiles) {
                try {
                    com.bytedance.sdk.component.utils.uym.xq(file3);
                } catch (Throwable unused3) {
                }
            }
        } catch (Throwable unused4) {
        }
    }

    public void emc(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.emc emcVar) {
        rie rieVarYcc;
        if (emcVar == null || emcVar.ycc() == null || !emcVar.ycc().wh()) {
            if (com.bytedance.sdk.openadsdk.utils.ypw.emc()) {
                com.bytedance.sdk.openadsdk.common.ypw.emc("sp_full_screen_video_new").emc(adSlot, emcVar);
                return;
            }
            if (emcVar == null || adSlot == null || !TextUtils.isEmpty(adSlot.getBidAdm()) || (rieVarYcc = emcVar.ycc()) == null || rieVarYcc.lad() == 2) {
                return;
            }
            try {
                this.xq.emc(adSlot, emcVar.sz().toString(), emcVar.ypw());
            } catch (Throwable unused) {
            }
        }
    }

    public static bw emc(Context context) {
        if (emc == null) {
            synchronized (bw.class) {
                try {
                    if (emc == null) {
                        emc = new bw(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return emc;
    }

    public String emc(String str, boolean z10) {
        com.bytedance.sdk.openadsdk.common.ypw ypwVarEmc = com.bytedance.sdk.openadsdk.common.ypw.emc("sp_full_screen_video_new");
        String strEmc = ypwVarEmc.emc(str, 10500000L);
        if (z10 && !TextUtils.isEmpty(strEmc) && ypwVarEmc.dg(str)) {
            return null;
        }
        return strEmc;
    }

    public boolean emc(com.bytedance.sdk.openadsdk.core.model.emc emcVar) {
        return com.bytedance.sdk.openadsdk.common.ypw.emc("sp_full_screen_video_new").emc(emcVar, true);
    }

    private boolean emc(rie rieVar) {
        if (rieVar != null) {
            return dr.xq(rieVar) || rieVar.iat() != null;
        }
        return false;
    }

    public void emc(String str) {
        if (com.bytedance.sdk.openadsdk.utils.ypw.emc()) {
            com.bytedance.sdk.openadsdk.common.ypw.emc("sp_full_screen_video_new").xq(str);
        } else {
            this.xq.ycc(str);
        }
    }
}
