package com.bytedance.sdk.openadsdk.ylm.emc;

import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import android.webkit.WebResourceResponse;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.msw.msw;
import com.bytedance.sdk.component.utils.lt;
import com.bytedance.sdk.component.utils.ul;
import com.bytedance.sdk.component.utils.vk;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.qh;
import com.bytedance.sdk.openadsdk.core.settings.uym;
import com.bytedance.sdk.openadsdk.utils.iyl;
import com.bytedance.sdk.openadsdk.ylm.ypw.emc;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.File;
import java.io.FileInputStream;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class xq {
    private static volatile xq emc;
    private final Set<String> bw = Collections.synchronizedSet(new HashSet());
    private String dg;
    private String xq;
    private String ypw;

    private String bw() {
        if (TextUtils.isEmpty(this.xq)) {
            String str = dg() + File.separator + "common";
            File file = new File(str);
            if (!file.exists()) {
                file.mkdirs();
            }
            this.xq = str;
        }
        return this.xq;
    }

    private String dg() {
        if (TextUtils.isEmpty(this.ypw)) {
            try {
                File file = new File(aa.emc().getCacheDir(), "playable");
                if (!file.exists()) {
                    file.mkdirs();
                }
                this.ypw = file.getAbsolutePath();
            } catch (Throwable th) {
                ul.xq("PlayableResManager", "init root path error: ".concat(String.valueOf(th)));
            }
        }
        return this.ypw;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void xq() {
        iyl.emc(new msw("pag_plb_res_check") { // from class: com.bytedance.sdk.openadsdk.ylm.emc.xq.2
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.ylm.ypw.emc emcVarYpw = com.bytedance.sdk.openadsdk.ylm.ypw.emc.ypw(com.bytedance.sdk.openadsdk.multipro.dg.dg.ypw("pag_plb_config", "model", ""));
                if (emcVarYpw != null) {
                    xq.this.emc(emcVarYpw, null, 0);
                }
            }
        });
    }

    private String ycc() {
        if (TextUtils.isEmpty(this.dg)) {
            String str = dg() + File.separator + "pregames";
            File file = new File(str);
            if (!file.exists()) {
                file.mkdirs();
            }
            this.dg = str;
        }
        return this.dg;
    }

    public void ypw() {
        if (uym.emc()) {
            long jCurrentTimeMillis = System.currentTimeMillis() - com.bytedance.sdk.openadsdk.multipro.dg.dg.emc("pag_plb_config", "last_update_time", 0L);
            final String strEmc = com.bytedance.sdk.openadsdk.sra.emc.emc("plb_res", "");
            long jEmc = com.bytedance.sdk.openadsdk.sra.emc.emc("plb_res_fetch_interval", 3600000);
            if (jEmc <= 0 || jEmc > 259200000) {
                jEmc = 3600000;
            }
            if (jCurrentTimeMillis < jEmc || TextUtils.isEmpty(strEmc)) {
                return;
            }
            int iEmc = com.bytedance.sdk.openadsdk.sra.emc.emc("plb_res_delay_fetch_time", 0);
            if (iEmc <= 0) {
                ypw(strEmc);
            } else {
                qh.ypw().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ylm.emc.xq.3
                    @Override // java.lang.Runnable
                    public void run() {
                        xq.this.ypw(strEmc);
                    }
                }, iEmc);
            }
        }
    }

    private static String xq(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int iIndexOf = str.indexOf("?");
        if (iIndexOf != -1) {
            str = str.substring(0, iIndexOf);
        }
        int iLastIndexOf = str.lastIndexOf(".");
        if (iLastIndexOf == -1) {
            return "";
        }
        return "." + str.substring(iLastIndexOf + 1);
    }

    public static xq emc() {
        if (emc == null) {
            synchronized (xq.class) {
                try {
                    if (emc == null) {
                        emc = new xq();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return emc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ypw(final String str) {
        iyl.emc(new msw("pag_plb_update_config") { // from class: com.bytedance.sdk.openadsdk.ylm.emc.xq.4
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.component.uym.ypw.ypw ypwVarXq = com.bytedance.sdk.openadsdk.yzg.ypw.ypw().xq().xq();
                try {
                    ypwVarXq.ypw(com.bytedance.sdk.openadsdk.zz.dg.emc(ypwVarXq, str));
                    com.bytedance.sdk.component.uym.ypw ypwVarEmc = ypwVarXq.emc();
                    if (ypwVarEmc == null || !ypwVarEmc.ycc()) {
                        return;
                    }
                    String strDg = ypwVarEmc.dg();
                    com.bytedance.sdk.openadsdk.ylm.ypw.emc emcVarYpw = com.bytedance.sdk.openadsdk.ylm.ypw.emc.ypw(strDg);
                    com.bytedance.sdk.openadsdk.multipro.dg.dg.emc("pag_plb_config", "last_update_time", Long.valueOf(System.currentTimeMillis()));
                    if (emcVarYpw != null) {
                        com.bytedance.sdk.openadsdk.ylm.ypw.emc emcVarYpw2 = com.bytedance.sdk.openadsdk.ylm.ypw.emc.ypw(com.bytedance.sdk.openadsdk.multipro.dg.dg.ypw("pag_plb_config", "model", ""));
                        if (emcVarYpw2 != null && emcVarYpw.emc().equals(emcVarYpw2.emc())) {
                            return;
                        }
                        com.bytedance.sdk.openadsdk.multipro.dg.dg.emc("pag_plb_config", "model", strDg);
                        xq.this.emc(emcVarYpw, emcVarYpw2, 1);
                    }
                } catch (Exception e10) {
                    ul.xq("PlayableResManager", e10.getMessage());
                }
            }
        });
    }

    public void emc(Map<String, String> map) {
        File[] fileArrListFiles;
        if (uym.emc()) {
            String strYcc = ycc();
            if (!TextUtils.isEmpty(strYcc)) {
                File file = new File(strYcc);
                if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
                    for (File file2 : fileArrListFiles) {
                        if (file2 != null) {
                            try {
                                File fileEmc = com.bytedance.sdk.openadsdk.core.sz.xq.emc.emc(file2);
                                if (fileEmc != null && fileEmc.exists()) {
                                    map.put(file2.getName(), fileEmc.getAbsolutePath());
                                }
                            } catch (Throwable unused) {
                            }
                        }
                    }
                }
            }
            int iEmc = com.bytedance.sdk.openadsdk.sra.emc.emc("plb_res_delay_fetch_time", 0);
            if (iEmc <= 0) {
                xq();
            } else {
                qh.ypw().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ylm.emc.xq.1
                    @Override // java.lang.Runnable
                    public void run() {
                        xq.this.xq();
                    }
                }, iEmc);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void emc(com.bytedance.sdk.openadsdk.ylm.ypw.emc emcVar, @Nullable com.bytedance.sdk.openadsdk.ylm.ypw.emc emcVar2, int i10) {
        List<emc.C0189emc> listXq = null;
        emc(emcVar.ypw(), emcVar2 == null ? null : emcVar2.ypw(), 1, i10);
        List<emc.C0189emc> listXq2 = emcVar.xq();
        if (emcVar2 != null) {
            listXq = emcVar2.xq();
        }
        emc(listXq2, listXq, 2, i10);
    }

    private void emc(@Nullable List<emc.C0189emc> list, @Nullable List<emc.C0189emc> list2, int i10, int i11) throws NoSuchAlgorithmException {
        if (list == null || list.isEmpty()) {
            return;
        }
        String strBw = i10 == 1 ? bw() : ycc();
        for (emc.C0189emc c0189emc : list) {
            String strEmc = c0189emc.emc();
            String strEmc2 = vk.emc(strEmc);
            if (!TextUtils.isEmpty(strEmc2)) {
                if (i10 == 1) {
                    strEmc2 = strEmc2 + xq(strEmc);
                }
                String str = strEmc2;
                File file = new File(strBw, str);
                boolean zExists = file.exists();
                if (i11 == 1) {
                    if (zExists && list2 != null && list2.contains(c0189emc)) {
                        com.bytedance.sdk.openadsdk.core.sz.xq.emc.xq(file);
                    } else {
                        int i12 = i10;
                        emc(strEmc, strBw, str, i12, file, zExists);
                        i10 = i12;
                    }
                } else if (!zExists) {
                    int i122 = i10;
                    emc(strEmc, strBw, str, i122, file, zExists);
                    i10 = i122;
                }
            }
        }
    }

    private void emc(final String str, final String str2, final String str3, final int i10, final File file, final boolean z10) {
        String strConcat;
        if (this.bw.contains(str)) {
            return;
        }
        if (i10 == 2) {
            strConcat = str3 + ".zip";
        } else {
            strConcat = z10 ? "tmp".concat(String.valueOf(str3)) : str3;
        }
        this.bw.add(str);
        com.bytedance.sdk.component.uym.ypw.emc emcVarDg = com.bytedance.sdk.openadsdk.yzg.ypw.ypw().xq().dg();
        emcVarDg.ypw(str);
        emcVarDg.emc(str2, strConcat);
        final com.bytedance.sdk.component.uym.ypw ypwVarEmc = emcVarDg.emc();
        this.bw.remove(str);
        if (ypwVarEmc != null && ypwVarEmc.ycc() && ypwVarEmc.bw() != null && ypwVarEmc.bw().exists()) {
            if (i10 == 2) {
                iyl.ypw(new msw("downloadZip") { // from class: com.bytedance.sdk.openadsdk.ylm.emc.xq.5
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            if (z10) {
                                file.delete();
                            }
                            String str4 = str2 + File.separator + str3;
                            lt.emc(ypwVarEmc.bw().getAbsolutePath(), str4);
                            File file2 = new File(str4);
                            File fileEmc = com.bytedance.sdk.openadsdk.core.sz.xq.emc.emc(file2);
                            if (fileEmc != null && fileEmc.exists()) {
                                com.bytedance.sdk.openadsdk.core.sz.xq.emc.emc().xq().put(file2.getName(), fileEmc.getAbsolutePath());
                            }
                            com.bytedance.sdk.openadsdk.core.sz.xq.emc.ypw(file2);
                        } catch (Throwable th) {
                            ul.xq("PlayableResManager", "unzip error: ", th, "tp=", Integer.valueOf(i10), ", url=", str);
                        }
                        try {
                            ypwVarEmc.bw().delete();
                        } catch (Throwable unused) {
                        }
                    }
                });
                return;
            } else {
                if (z10) {
                    file.delete();
                    ypwVarEmc.bw().renameTo(file);
                    return;
                }
                return;
            }
        }
        File file2 = new File(str2 + File.separator + str3 + ".tmp");
        if (file2.exists()) {
            try {
                file2.delete();
            } catch (Throwable unused) {
            }
        }
    }

    public WebResourceResponse emc(String str) throws NoSuchAlgorithmException {
        if (!uym.emc()) {
            return null;
        }
        String strEmc = vk.emc(str);
        if (TextUtils.isEmpty(strEmc)) {
            return null;
        }
        File file = new File(bw(), strEmc + xq(str));
        if (file.exists()) {
            try {
                String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(str));
                if (TextUtils.isEmpty(mimeTypeFromExtension)) {
                    return null;
                }
                return new WebResourceResponse(mimeTypeFromExtension, C.UTF8_NAME, new FileInputStream(file));
            } catch (Throwable unused) {
            }
        }
        return null;
    }
}
