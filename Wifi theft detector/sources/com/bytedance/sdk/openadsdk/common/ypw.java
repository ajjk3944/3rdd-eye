package com.bytedance.sdk.openadsdk.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.model.dr;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.mbridge.msdk.MBridgeConstans;
import java.io.File;
import java.io.FileFilter;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class ypw {
    private static final HashMap<String, ypw> emc = new HashMap<>();
    private static final HashMap<String, emc> ypw = new HashMap<>();
    private final String bw;
    private final emc dg;

    @SuppressLint({"StaticFieldLeak"})
    private final Context xq;
    private final Map<rie, Long> ycc = Collections.synchronizedMap(new HashMap());

    private ypw(Context context, String str) {
        this.xq = context;
        emc emcVar = ypw.get(str);
        this.dg = emcVar == null ? new emc(str) : emcVar;
        this.bw = str;
    }

    public boolean dg(String str) {
        return this.dg.uym(str);
    }

    public void xq(String str) {
        this.dg.ycc(str);
    }

    public String ypw(String str) {
        try {
            String strYpw = this.dg.ypw(str);
            if (TextUtils.isEmpty(strYpw)) {
                return null;
            }
            return strYpw;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static class emc {
        protected final String emc;
        private final HashSet<String> uym = new HashSet<>();
        String ypw = "material_data";
        String xq = "has_played";
        String dg = "create_time";
        String bw = "in_use_process";
        String ycc = "req_id";

        public emc(String str) {
            this.emc = TextUtils.isEmpty(str) ? "" : str;
        }

        public boolean bw(String str) {
            try {
                return com.bytedance.sdk.openadsdk.multipro.dg.dg.emc(emc(str), this.xq, true);
            } catch (Throwable unused) {
                return true;
            }
        }

        public long dg(String str) {
            try {
                return com.bytedance.sdk.openadsdk.multipro.dg.dg.emc(emc(str), this.dg, 0L);
            } catch (Throwable unused) {
                return 0L;
            }
        }

        public String emc(String str) {
            if (TextUtils.isEmpty(str)) {
                str = MBridgeConstans.ENDCARD_URL_TYPE_PL;
            }
            return this.emc + "_cache_" + str;
        }

        public void msw(String str) {
            try {
                com.bytedance.sdk.openadsdk.multipro.dg.dg.emc(emc(str));
                this.uym.remove(str);
            } catch (Throwable unused) {
            }
        }

        public boolean uym(String str) {
            String strEmc;
            String strYpw;
            try {
                strEmc = emc(str);
                strYpw = com.bytedance.sdk.openadsdk.multipro.dg.dg.ypw(strEmc, this.bw, "");
            } catch (Throwable unused) {
            }
            if (TextUtils.isEmpty(strYpw)) {
                return false;
            }
            if (strYpw.equals(com.bytedance.sdk.component.utils.ylm.ypw(com.bytedance.sdk.openadsdk.core.aa.emc())) && !this.uym.contains(str)) {
                com.bytedance.sdk.openadsdk.multipro.dg.dg.emc(strEmc, this.bw, "");
                return false;
            }
            return true;
        }

        public String xq(String str) {
            try {
                return com.bytedance.sdk.openadsdk.multipro.dg.dg.ypw(emc(str), this.ycc, null);
            } catch (Throwable unused) {
                return null;
            }
        }

        public void ycc(String str) {
            try {
                com.bytedance.sdk.openadsdk.multipro.dg.dg.emc(emc(str), this.bw, com.bytedance.sdk.component.utils.ylm.ypw(com.bytedance.sdk.openadsdk.core.aa.emc()));
                this.uym.add(str);
            } catch (Throwable unused) {
            }
        }

        public String ypw(String str) {
            try {
                return com.bytedance.sdk.openadsdk.multipro.dg.dg.ypw(emc(str), this.ypw, null);
            } catch (Throwable unused) {
                return null;
            }
        }

        public void emc(AdSlot adSlot, String str, String str2) {
            try {
                String codeId = adSlot.getCodeId();
                String strEmc = emc(codeId);
                com.bytedance.sdk.openadsdk.multipro.dg.dg.emc(strEmc, this.xq, Boolean.FALSE);
                com.bytedance.sdk.openadsdk.multipro.dg.dg.emc(strEmc, this.dg, Long.valueOf(System.currentTimeMillis()));
                com.bytedance.sdk.openadsdk.multipro.dg.dg.emc(strEmc, this.ypw, str);
                com.bytedance.sdk.openadsdk.multipro.dg.dg.emc(strEmc, this.bw, "");
                com.bytedance.sdk.openadsdk.multipro.dg.dg.emc(strEmc, this.ycc, str2);
                this.uym.remove(codeId);
            } catch (Throwable unused) {
            }
        }
    }

    public static ypw emc(String str) {
        ypw ypwVar;
        HashMap<String, ypw> map = emc;
        ypw ypwVar2 = map.get(str);
        if (ypwVar2 != null) {
            return ypwVar2;
        }
        synchronized (ypw.class) {
            try {
                ypwVar = map.get(str);
                if (ypwVar == null) {
                    ypwVar = new ypw(com.bytedance.sdk.openadsdk.core.aa.emc(), str);
                    map.put(str, ypwVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return ypwVar;
    }

    private String ypw() {
        return CacheDirFactory.getICacheDir(0).emc();
    }

    public static void emc(String str, emc emcVar) {
        ypw.put(str, emcVar);
    }

    public void emc(String str, rie rieVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String strXq = this.dg.xq(str);
        String strLvs = rieVar != null ? rieVar.lvs() : "";
        if (TextUtils.isEmpty(strXq) || TextUtils.isEmpty(strLvs) || strXq.equals(strLvs)) {
            this.dg.msw(str);
        }
    }

    public void emc() {
        String str;
        File file;
        File[] fileArrListFiles;
        try {
            int i10 = Build.VERSION.SDK_INT;
            boolean zUym = com.bytedance.sdk.openadsdk.core.zz.uym(this.bw);
            if (zUym) {
                str = "files";
            } else {
                str = "shared_prefs";
            }
            if (i10 >= 24) {
                file = new File(this.xq.getDataDir(), str);
            } else {
                file = new File(this.xq.getDatabasePath("1").getParentFile().getParentFile(), str);
            }
            if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles(new FileFilter() { // from class: com.bytedance.sdk.openadsdk.common.ypw.1
                @Override // java.io.FileFilter
                public boolean accept(File file2) {
                    if (file2 != null) {
                        return file2.getName().contains(ypw.this.bw);
                    }
                    return false;
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
                            this.xq.deleteSharedPreferences(strReplace);
                        } else {
                            this.xq.getSharedPreferences(strReplace, 0).edit().clear().apply();
                            com.bytedance.sdk.component.utils.uym.xq(file2);
                        }
                    }
                }
            }
        } catch (Throwable unused2) {
        }
        try {
            File file3 = new File(ypw());
            if (file3.exists() && file3.isDirectory()) {
                com.bytedance.sdk.component.utils.uym.xq(file3);
            }
        } catch (Throwable unused3) {
        }
    }

    public void emc(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.emc emcVar) {
        rie rieVarYcc;
        if ((emcVar != null && emcVar.ycc() != null && emcVar.ycc().wh()) || emcVar == null || adSlot == null || !TextUtils.isEmpty(adSlot.getBidAdm()) || (rieVarYcc = emcVar.ycc()) == null || rieVarYcc.lad() == 2) {
            return;
        }
        try {
            this.dg.emc(adSlot, emcVar.qh(), emcVar.ypw());
        } catch (Throwable unused) {
        }
    }

    public boolean emc(com.bytedance.sdk.openadsdk.core.model.emc emcVar, boolean z10) {
        if (emcVar == null || !emcVar.bw()) {
            return false;
        }
        if (z10) {
            Iterator<rie> it = emcVar.dg().iterator();
            while (it.hasNext()) {
                if (!emc(it.next())) {
                    it.remove();
                }
            }
        }
        return emcVar.bw();
    }

    public String emc(String str, long j10) {
        long jDg = this.dg.dg(str);
        boolean zBw = this.dg.bw(str);
        if (System.currentTimeMillis() - jDg >= j10 || zBw) {
            return null;
        }
        return ypw(str);
    }

    private boolean emc(rie rieVar) {
        if (rieVar != null) {
            return dr.xq(rieVar) || rieVar.iat() != null;
        }
        return false;
    }
}
