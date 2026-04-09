package com.bytedance.sdk.openadsdk.core.sz.xq;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import android.webkit.WebResourceResponse;
import com.bytedance.sdk.component.msw.msw;
import com.bytedance.sdk.component.utils.bw;
import com.bytedance.sdk.component.utils.lt;
import com.bytedance.sdk.component.utils.ul;
import com.bytedance.sdk.component.utils.uym;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.model.dr;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.zz;
import com.bytedance.sdk.openadsdk.utils.iyl;
import com.bytedance.sdk.openadsdk.ylm.emc.dg;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import o4.AbstractC2763b;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class emc {
    private static volatile emc emc;
    private String ypw;
    private final Map<rie, ypw> xq = new ConcurrentHashMap();
    private final Map<String, JSONObject> dg = new ConcurrentHashMap();
    private final AtomicBoolean bw = new AtomicBoolean(false);
    private final Set<String> ycc = Collections.synchronizedSet(new HashSet());
    private final ConcurrentHashMap<String, com.bytedance.sdk.component.uym.ypw.emc> uym = new ConcurrentHashMap<>();
    private final Map<String, String> msw = new ConcurrentHashMap();

    /* renamed from: com.bytedance.sdk.openadsdk.core.sz.xq.emc$emc, reason: collision with other inner class name */
    public interface InterfaceC0078emc {
        void emc(boolean z6);
    }

    public static class ypw {
        long dg;
        long emc;
        long xq;
        long ypw;

        private ypw() {
        }

        public ypw dg(long j6) {
            this.dg = j6;
            return this;
        }

        public long emc() {
            return this.ypw - this.emc;
        }

        public ypw xq(long j6) {
            this.xq = j6;
            return this;
        }

        public long ypw() {
            return this.dg - this.xq;
        }

        public ypw emc(long j6) {
            this.emc = j6;
            return this;
        }

        public ypw ypw(long j6) {
            this.ypw = j6;
            return this;
        }
    }

    private emc() {
    }

    private boolean bw(File file) {
        return file != null && file.exists() && file.isFile() && file.canRead();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public File dg(File file) {
        File file2 = new File(file, "tt_open_ad_sdk_check_res.dat");
        return bw(file2) ? file2 : new File(file, "tt_open_ad_sdk_check_res.dat");
    }

    public static void xq(File file) {
        try {
            if (!file.exists() || file.setLastModified(System.currentTimeMillis())) {
                return;
            }
            file.renameTo(file);
            file.lastModified();
        } catch (Throwable unused) {
        }
    }

    public void ypw() {
        if (this.bw.get()) {
            return;
        }
        iyl.emc(new msw("PlayableCache_init") { // from class: com.bytedance.sdk.openadsdk.core.sz.xq.emc.1
            @Override // java.lang.Runnable
            public void run() {
                File[] fileArrListFiles;
                try {
                    String strDg = emc.this.dg();
                    if (!TextUtils.isEmpty(strDg)) {
                        File file = new File(strDg);
                        if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
                            for (File file2 : fileArrListFiles) {
                                if (file2 != null) {
                                    try {
                                        File fileEmc = emc.emc(file2);
                                        if (fileEmc != null && fileEmc.exists()) {
                                            emc.this.msw.put(file2.getName(), fileEmc.getAbsolutePath());
                                        }
                                        emc.this.emc(emc.this.dg(fileEmc), true);
                                    } catch (Throwable unused) {
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable unused2) {
                }
                com.bytedance.sdk.openadsdk.ylm.emc.xq.emc().emc(emc.this.msw);
                emc.this.bw.set(true);
            }
        });
    }

    private String bw() {
        if (TextUtils.isEmpty(this.ypw)) {
            try {
                File file = new File(aa.emc().getCacheDir(), "playable");
                if (!file.exists()) {
                    file.mkdirs();
                }
                this.ypw = file.getAbsolutePath();
            } catch (Throwable th) {
                ul.xq("PlayableCache", "init root path error: ".concat(String.valueOf(th)));
            }
        }
        return this.ypw;
    }

    public static void ypw(File file) {
        xq(file);
        try {
            zz.ypw().qh().emc(file);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String dg() {
        File file = new File(bw(), "games");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath();
    }

    public static emc emc() {
        if (emc == null) {
            synchronized (emc.class) {
                try {
                    if (emc == null) {
                        emc = new emc();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return emc;
    }

    public void ypw(rie rieVar) {
        if (rieVar == null || rieVar.iat() == null || TextUtils.isEmpty(rieVar.iat().i) || !com.bytedance.sdk.openadsdk.sra.emc.emc("can_cancel_playable", false)) {
            return;
        }
        com.bytedance.sdk.component.uym.ypw.emc emcVar = this.uym.get(rieVar.iat().i);
        if (emcVar != null) {
            emcVar.ypw();
        }
    }

    public Map<String, String> xq() {
        return this.msw;
    }

    public boolean emc(rie rieVar) {
        if (this.bw.get() && rieVar != null && rieVar.iat() != null && rieVar.iat().i != null) {
            try {
                if (!TextUtils.isEmpty(this.msw.get(bw.emc(rieVar.iat().i)))) {
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject emc(File file, boolean z6) {
        byte[] bArrDg;
        String strYpw;
        try {
            if (!bw(file) || (bArrDg = uym.dg(file)) == null || bArrDg.length <= 0) {
                return null;
            }
            if (TextUtils.equals(file.getName(), "tt_open_ad_sdk_check_res.dat")) {
                strYpw = com.bytedance.sdk.component.utils.emc.xq(new String(bArrDg));
            } else {
                strYpw = com.bytedance.sdk.component.dg.emc.ypw(new String(bArrDg), com.bytedance.sdk.openadsdk.core.emc.ypw());
            }
            if (TextUtils.isEmpty(strYpw)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(strYpw);
            if (z6 && jSONObject.length() > 0) {
                this.dg.put(file.getParentFile().getName(), jSONObject);
            }
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    public WebResourceResponse emc(String str, String str2, String str3) {
        WebResourceResponse webResourceResponseEmc;
        String mimeTypeFromExtension;
        File fileEmc;
        try {
            webResourceResponseEmc = com.bytedance.sdk.openadsdk.ylm.emc.xq.emc().emc(str3);
        } catch (Throwable th) {
            ul.emc("PlayableCache", "playable intercept error: ", th);
        }
        if (webResourceResponseEmc != null) {
            return webResourceResponseEmc;
        }
        if (this.bw.get() && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            try {
                if ((str3.startsWith("http://") || str3.startsWith("https://")) && str3.contains("?")) {
                    str3 = str3.split("\\?")[0];
                    if (str3.endsWith("/")) {
                        str3 = str3.substring(0, str3.length() - 1);
                    }
                }
                mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(str3));
            } catch (Throwable unused) {
                mimeTypeFromExtension = null;
            }
            if (TextUtils.isEmpty(mimeTypeFromExtension)) {
                return null;
            }
            String strEmc = bw.emc(str);
            if (TextUtils.isEmpty(strEmc)) {
                return null;
            }
            String str4 = this.msw.get(strEmc);
            if (!TextUtils.isEmpty(str4)) {
                fileEmc = new File(str4);
            } else {
                fileEmc = emc(new File(dg(), strEmc));
                if (fileEmc != null && fileEmc.exists()) {
                    this.msw.put(strEmc, fileEmc.getAbsolutePath());
                }
            }
            if (fileEmc != null && fileEmc.exists()) {
                String strEmc2 = emc(str2);
                if (TextUtils.isEmpty(strEmc2)) {
                    return null;
                }
                String strReplace = str3.replace(strEmc2, "");
                if (!TextUtils.isEmpty(strReplace) && !strReplace.startsWith("https://") && !strReplace.startsWith("http://")) {
                    File file = new File(fileEmc, strReplace);
                    if (file.exists() && emc(strEmc, strReplace, file) && file.getCanonicalPath().startsWith(fileEmc.getCanonicalPath())) {
                        return new WebResourceResponse(mimeTypeFromExtension, "utf-8", new FileInputStream(file));
                    }
                }
            }
            return null;
        }
        return null;
    }

    public static File emc(File file) {
        File[] fileArrListFiles;
        if (file != null && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null && fileArrListFiles.length != 0) {
            for (File file2 : fileArrListFiles) {
                if (file2 != null && file2.isFile() && "index.html".equals(file2.getName())) {
                    return file;
                }
            }
            for (File file3 : fileArrListFiles) {
                if (file3 != null && file3.isDirectory()) {
                    return emc(file3);
                }
            }
        }
        return null;
    }

    private String emc(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split("\\?");
        if (strArrSplit != null && strArrSplit.length == 2) {
            String str2 = strArrSplit[0];
            if (str2 != null && str2.endsWith("/")) {
                str = str.substring(0, strArrSplit.length - 1);
            }
            String str3 = strArrSplit[0];
            if (str3 != null && str3.endsWith("index.html")) {
                str = strArrSplit[0];
            }
        }
        return str.replace("index.html", "");
    }

    private boolean emc(String str, String str2, File file) {
        if (file != null && file.exists()) {
            JSONObject jSONObject = this.dg.get(str);
            if (jSONObject == null) {
                return true;
            }
            String strOptString = jSONObject.optString(str2);
            if (strOptString != null && strOptString.equalsIgnoreCase(bw.emc(file))) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"[ByDesign4.2]BadDomainNameVerifier"})
    public void emc(final rie rieVar, final InterfaceC0078emc interfaceC0078emc) {
        File file;
        if (dg.emc().ypw() && rieVar != null && dr.ycc(rieVar) && rieVar.vaf() != null && !TextUtils.isEmpty(rieVar.vaf().getBidAdm())) {
            com.bytedance.sdk.openadsdk.core.sz.xq.ypw.emc(rieVar, -705, "server bidding pre render");
            emc(interfaceC0078emc, false);
            return;
        }
        if (rieVar != null && rieVar.iat() != null && !TextUtils.isEmpty(rieVar.iat().i)) {
            final String str = rieVar.iat().i;
            if (this.ycc.contains(str)) {
                return;
            }
            this.xq.put(rieVar, new ypw().emc(System.currentTimeMillis()));
            com.bytedance.sdk.openadsdk.core.sz.xq.ypw.emc(rieVar);
            String strEmc = bw.emc(str);
            final File file2 = new File(dg(), strEmc);
            String str2 = this.msw.get(strEmc);
            if (TextUtils.isEmpty(str2)) {
                file = emc(file2);
                if (file != null && file.exists()) {
                    this.msw.put(strEmc, file.getAbsolutePath());
                }
            } else {
                file = new File(str2);
            }
            if (file != null && file.exists()) {
                com.bytedance.sdk.openadsdk.core.sz.xq.ypw.emc(rieVar, -702, (String) null);
                xq(file2);
                this.xq.remove(rieVar);
                emc(interfaceC0078emc, true);
                return;
            }
            try {
                uym.xq(file2);
            } catch (Throwable unused) {
            }
            this.ycc.add(str);
            File file3 = new File(bw(), AbstractC2763b.e(strEmc, ".zip"));
            com.bytedance.sdk.component.uym.ypw.emc emcVarDg = com.bytedance.sdk.openadsdk.yzg.ypw.ypw().xq().dg();
            this.uym.put(str, emcVarDg);
            emcVarDg.ypw(str);
            emcVarDg.emc(file3.getParent(), file3.getName());
            emcVarDg.emc(7);
            emcVarDg.emc("playable_download");
            emcVarDg.emc(new com.bytedance.sdk.component.uym.emc.emc() { // from class: com.bytedance.sdk.openadsdk.core.sz.xq.emc.2
                @Override // com.bytedance.sdk.component.uym.emc.emc
                public void emc(com.bytedance.sdk.component.uym.ypw.xq xqVar, final com.bytedance.sdk.component.uym.ypw ypwVar) {
                    emc.this.ycc.remove(str);
                    emc.this.uym.remove(str);
                    final ypw ypwVar2 = (ypw) emc.this.xq.remove(rieVar);
                    if (ypwVar2 != null) {
                        ypwVar2.ypw(System.currentTimeMillis());
                    }
                    if (ypwVar.ycc() && ypwVar.bw() != null && ypwVar.bw().exists()) {
                        iyl.ypw(new msw("downloadZip") { // from class: com.bytedance.sdk.openadsdk.core.sz.xq.emc.2.1
                            @Override // java.lang.Runnable
                            public void run() {
                                boolean z6;
                                long jEmc;
                                long jYpw;
                                try {
                                    ypw ypwVar3 = ypwVar2;
                                    if (ypwVar3 != null) {
                                        ypwVar3.xq(System.currentTimeMillis());
                                    }
                                    lt.emc(ypwVar.bw().getAbsolutePath(), file2.getAbsolutePath());
                                    ypw ypwVar4 = ypwVar2;
                                    if (ypwVar4 != null) {
                                        ypwVar4.dg(System.currentTimeMillis());
                                    }
                                    ypw ypwVar5 = ypwVar2;
                                    if (ypwVar5 != null) {
                                        jEmc = ypwVar5.emc();
                                        jYpw = ypwVar2.ypw();
                                    } else {
                                        jEmc = 0;
                                        jYpw = 0;
                                    }
                                    com.bytedance.sdk.openadsdk.core.sz.xq.ypw.emc(rieVar, jEmc, jYpw);
                                    emc.ypw(file2);
                                    z6 = true;
                                    try {
                                        File fileEmc = emc.emc(file2);
                                        if (fileEmc != null && fileEmc.exists()) {
                                            emc.this.msw.put(file2.getName(), fileEmc.getAbsolutePath());
                                        }
                                        emc.this.emc(emc.this.dg(fileEmc), true);
                                    } catch (Throwable unused2) {
                                    }
                                } catch (Throwable th) {
                                    ul.emc("PlayableCache", "unzip error: ", th);
                                    com.bytedance.sdk.openadsdk.core.sz.xq.ypw.emc(rieVar, -704, th.getMessage());
                                    z6 = false;
                                }
                                try {
                                    ypwVar.bw().delete();
                                } catch (Throwable unused3) {
                                }
                                AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                emc.this.emc(interfaceC0078emc, z6);
                            }
                        });
                    } else {
                        com.bytedance.sdk.openadsdk.core.sz.xq.ypw.emc(rieVar, ypwVar.emc() != 0 ? ypwVar.emc() : -700, (String) null);
                        emc.this.emc(interfaceC0078emc, false);
                    }
                }

                @Override // com.bytedance.sdk.component.uym.emc.emc
                public void emc(com.bytedance.sdk.component.uym.ypw.xq xqVar, IOException iOException) {
                    emc.this.ycc.remove(str);
                    emc.this.uym.remove(str);
                    emc.this.xq.remove(rieVar);
                    com.bytedance.sdk.openadsdk.core.sz.xq.ypw.emc(rieVar, -700, iOException.getMessage());
                    emc.this.emc(interfaceC0078emc, false);
                }
            });
            return;
        }
        com.bytedance.sdk.openadsdk.core.sz.xq.ypw.emc(rieVar, -701, (String) null);
        emc(interfaceC0078emc, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc(final InterfaceC0078emc interfaceC0078emc, final boolean z6) {
        iyl.emc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.sz.xq.emc.3
            @Override // java.lang.Runnable
            public void run() {
                InterfaceC0078emc interfaceC0078emc2 = interfaceC0078emc;
                if (interfaceC0078emc2 != null) {
                    interfaceC0078emc2.emc(z6);
                }
            }
        });
    }
}
