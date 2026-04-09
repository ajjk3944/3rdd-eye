package com.bytedance.sdk.openadsdk.zin.ouw;

import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import android.webkit.WebResourceResponse;
import com.bytedance.sdk.component.pno.pno;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.component.utils.rn;
import com.bytedance.sdk.component.utils.uq;
import com.bytedance.sdk.openadsdk.core.jg;
import com.bytedance.sdk.openadsdk.core.settings.ra;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.zin.vt.ouw;
import d.h;
import j$.util.DesugarCollections;
import java.io.File;
import java.io.FileInputStream;
import java.security.NoSuchAlgorithmException;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import r5.c;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class lh {
    private static volatile lh ouw;
    private final Set<String> fkw = DesugarCollections.synchronizedSet(new HashSet());

    /* renamed from: lh, reason: collision with root package name */
    private String f8866lh;
    private String vt;
    private String yu;

    private String fkw() {
        if (TextUtils.isEmpty(this.yu)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(lh());
            String strW = h.w(sb2, File.separator, "pregames");
            File file = new File(strW);
            if (!file.exists()) {
                file.mkdirs();
            }
            this.yu = strW;
        }
        return this.yu;
    }

    private static String lh(String str) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public void vt() {
        bs.ouw(new pno("pag_plb_res_check") { // from class: com.bytedance.sdk.openadsdk.zin.ouw.lh.2
            @Override // java.lang.Runnable
            public final void run() {
                com.bytedance.sdk.openadsdk.zin.vt.ouw ouwVarOuw = com.bytedance.sdk.openadsdk.zin.vt.ouw.ouw(com.bytedance.sdk.openadsdk.multipro.yu.yu.vt("pag_plb_config", "model", ""));
                if (ouwVarOuw != null) {
                    lh.this.ouw(ouwVarOuw, null, 0);
                }
            }
        });
    }

    private String yu() {
        if (TextUtils.isEmpty(this.f8866lh)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(lh());
            String strW = h.w(sb2, File.separator, "common");
            File file = new File(strW);
            if (!file.exists()) {
                file.mkdirs();
            }
            this.f8866lh = strW;
        }
        return this.f8866lh;
    }

    public final WebResourceResponse vt(String str) throws NoSuchAlgorithmException {
        if (!ra.ouw()) {
            return null;
        }
        String strOuw = rn.ouw(str);
        if (TextUtils.isEmpty(strOuw)) {
            return null;
        }
        String strYu = yu();
        StringBuilder sbZ = h.z(strOuw);
        sbZ.append(lh(str));
        File file = new File(strYu, sbZ.toString());
        if (file.exists()) {
            try {
                String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(str));
                if (TextUtils.isEmpty(mimeTypeFromExtension)) {
                    return null;
                }
                return new WebResourceResponse(mimeTypeFromExtension, "UTF-8", new FileInputStream(file));
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
        return null;
    }

    public static lh ouw() {
        if (ouw == null) {
            synchronized (lh.class) {
                try {
                    if (ouw == null) {
                        ouw = new lh();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return ouw;
    }

    private String lh() {
        if (TextUtils.isEmpty(this.vt)) {
            try {
                File file = new File(zih.ouw().getCacheDir(), "playable");
                if (!file.exists()) {
                    file.mkdirs();
                }
                this.vt = file.getAbsolutePath();
            } catch (Throwable th2) {
                qbp.lh("PlayableResManager", "init root path error: ".concat(String.valueOf(th2)));
            }
        }
        return this.vt;
    }

    public final void ouw(Map<String, String> map) {
        File[] fileArrListFiles;
        if (ra.ouw()) {
            ko.vt("PlayableResManager", "initLocalPlayableRes");
            String strFkw = fkw();
            if (!TextUtils.isEmpty(strFkw)) {
                File file = new File(strFkw);
                if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
                    for (File file2 : fileArrListFiles) {
                        if (file2 != null) {
                            try {
                                File fileOuw = com.bytedance.sdk.openadsdk.core.mwh.lh.ouw.ouw(file2);
                                if (fileOuw != null && fileOuw.exists()) {
                                    map.put(file2.getName(), fileOuw.getAbsolutePath());
                                }
                            } catch (Throwable unused) {
                            }
                        }
                    }
                }
            }
            int iOuw = com.bytedance.sdk.openadsdk.vpp.ouw.ouw("plb_res_delay_fetch_time", 0);
            if (iOuw <= 0) {
                vt();
            } else {
                jg.vt().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.zin.ouw.lh.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        lh.this.vt();
                    }
                }, iOuw);
            }
        }
    }

    public final void ouw(final String str) {
        bs.ouw(new pno("pag_plb_update_config") { // from class: com.bytedance.sdk.openadsdk.zin.ouw.lh.4
            @Override // java.lang.Runnable
            public final void run() {
                com.bytedance.sdk.component.ra.vt.vt vtVarVt = com.bytedance.sdk.openadsdk.th.vt.ouw().ouw.vt();
                try {
                    vtVarVt.ouw(com.bytedance.sdk.openadsdk.bly.lh.ouw(str));
                    com.bytedance.sdk.component.ra.vt vtVarOuw = vtVarVt.ouw();
                    if (vtVarOuw == null || !vtVarOuw.pno) {
                        return;
                    }
                    String str2 = vtVarOuw.yu;
                    com.bytedance.sdk.openadsdk.zin.vt.ouw ouwVarOuw = com.bytedance.sdk.openadsdk.zin.vt.ouw.ouw(str2);
                    com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("pag_plb_config", "last_update_time", Long.valueOf(System.currentTimeMillis()));
                    if (ouwVarOuw != null) {
                        com.bytedance.sdk.openadsdk.zin.vt.ouw ouwVarOuw2 = com.bytedance.sdk.openadsdk.zin.vt.ouw.ouw(com.bytedance.sdk.openadsdk.multipro.yu.yu.vt("pag_plb_config", "model", ""));
                        if (ouwVarOuw2 != null && ouwVarOuw.ouw.equals(ouwVarOuw2.ouw)) {
                            return;
                        }
                        com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("pag_plb_config", "model", str2);
                        lh.this.ouw(ouwVarOuw, ouwVarOuw2, 1);
                    }
                } catch (Exception e2) {
                    qbp.lh("PlayableResManager", e2.getMessage());
                }
            }
        });
    }

    private void ouw(List<ouw.C0125ouw> list, List<ouw.C0125ouw> list2, int i4, int i10) throws NoSuchAlgorithmException {
        int i11 = i4;
        if (list == null || list.isEmpty()) {
            return;
        }
        String strYu = i11 == 1 ? yu() : fkw();
        for (ouw.C0125ouw c0125ouw : list) {
            String str = c0125ouw.ouw;
            String strOuw = rn.ouw(str);
            if (!TextUtils.isEmpty(strOuw)) {
                if (i11 == 1) {
                    StringBuilder sbZ = h.z(strOuw);
                    sbZ.append(lh(str));
                    strOuw = sbZ.toString();
                }
                File file = new File(strYu, strOuw);
                boolean zExists = file.exists();
                if (i10 == 1) {
                    if (zExists && list2 != null && list2.contains(c0125ouw)) {
                        ko.ouw("PlayableResManager", "file exists, no need to download: tp= ", Integer.valueOf(i11), ", url=", str);
                        com.bytedance.sdk.openadsdk.core.mwh.lh.ouw.lh(file);
                    } else {
                        ouw(str, strYu, strOuw, i11, file, zExists);
                    }
                } else if (zExists) {
                    ko.ouw("PlayableResManager", "file exists, no need to download: tp= ", Integer.valueOf(i11), ", url=", str);
                } else {
                    ouw(str, strYu, strOuw, i11, file, zExists);
                }
            }
            i11 = i4;
        }
    }

    private void ouw(final String str, final String str2, final String str3, final int i4, final File file, final boolean z3) {
        String strConcat;
        File file2;
        if (this.fkw.contains(str)) {
            ko.ouw("PlayableResManager", "Downloading, no repeat downloading, url: ", str);
            return;
        }
        if (i4 == 2) {
            strConcat = h.s(str3, ".zip");
        } else {
            strConcat = z3 ? "tmp".concat(String.valueOf(str3)) : str3;
        }
        this.fkw.add(str);
        com.bytedance.sdk.component.ra.vt.ouw ouwVarLh = com.bytedance.sdk.openadsdk.th.vt.ouw().ouw.lh();
        ouwVarLh.ouw(str);
        ouwVarLh.ouw(str2, strConcat);
        final com.bytedance.sdk.component.ra.vt vtVarOuw = ouwVarLh.ouw();
        this.fkw.remove(str);
        if (vtVarOuw == null || !vtVarOuw.pno || (file2 = vtVarOuw.ra) == null || !file2.exists()) {
            File file3 = new File(c.m(h.z(str2), File.separator, str3, ".tmp"));
            if (file3.exists()) {
                try {
                    file3.delete();
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
            }
            ko.vt("PlayableResManager", "really download error");
            return;
        }
        if (i4 == 2) {
            ko.lh("PlayableResManager", "onResponse: Playable zip download success");
            bs.vt(new pno("downloadZip") { // from class: com.bytedance.sdk.openadsdk.zin.ouw.lh.5
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        if (z3) {
                            file.delete();
                        }
                        String str4 = str2 + File.separator + str3;
                        uq.ouw(vtVarOuw.ra.getAbsolutePath(), str4, (String) null);
                        File file4 = new File(str4);
                        File fileOuw = com.bytedance.sdk.openadsdk.core.mwh.lh.ouw.ouw(file4);
                        if (fileOuw != null && fileOuw.exists()) {
                            com.bytedance.sdk.openadsdk.core.mwh.lh.ouw.ouw().vt.put(file4.getName(), fileOuw.getAbsolutePath());
                        }
                        com.bytedance.sdk.openadsdk.core.mwh.lh.ouw.vt(file4);
                    } catch (Throwable th3) {
                        qbp.yu("PlayableResManager", "unzip error: ", th3, "tp=", Integer.valueOf(i4), ", url=", str);
                    }
                    try {
                        vtVarOuw.ra.delete();
                    } catch (Throwable unused) {
                    }
                }
            });
            return;
        }
        ko.lh("PlayableResManager", "onResponse: Playable res download success");
        if (z3) {
            file.delete();
            vtVarOuw.ra.renameTo(file);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void ouw(com.bytedance.sdk.openadsdk.zin.vt.ouw ouwVar, com.bytedance.sdk.openadsdk.zin.vt.ouw ouwVar2, int i4) {
        List<ouw.C0125ouw> list = null;
        ouw(ouwVar.vt, ouwVar2 == null ? null : ouwVar2.vt, 1, i4);
        List<ouw.C0125ouw> list2 = ouwVar.f8902lh;
        if (ouwVar2 != null) {
            list = ouwVar2.f8902lh;
        }
        ouw(list2, list, 2, i4);
    }
}
