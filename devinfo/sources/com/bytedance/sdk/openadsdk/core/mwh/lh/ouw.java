package com.bytedance.sdk.openadsdk.core.mwh.lh;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import android.webkit.WebResourceResponse;
import com.bykv.vk.openvk.ouw.ouw.ouw.lh.c;
import com.bytedance.sdk.component.pno.pno;
import com.bytedance.sdk.component.utils.fkw;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.component.utils.ra;
import com.bytedance.sdk.component.utils.uq;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.bly;
import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.zin.ouw.yu;
import d.h;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class ouw {

    /* renamed from: lh, reason: collision with root package name */
    private static volatile ouw f8327lh;
    private String yu;
    private final Map<vpp, vt> fkw = new ConcurrentHashMap();

    /* renamed from: le, reason: collision with root package name */
    private final Map<String, JSONObject> f8328le = new ConcurrentHashMap();
    private final AtomicBoolean ra = new AtomicBoolean(false);
    private final Set<String> pno = DesugarCollections.synchronizedSet(new HashSet());
    public final ConcurrentHashMap<String, com.bytedance.sdk.component.ra.vt.ouw> ouw = new ConcurrentHashMap<>();
    public final Map<String, String> vt = new ConcurrentHashMap();

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    /* renamed from: com.bytedance.sdk.openadsdk.core.mwh.lh.ouw$ouw, reason: collision with other inner class name */
    public interface InterfaceC0089ouw {
        void ouw(boolean z3);
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class vt {

        /* renamed from: lh, reason: collision with root package name */
        long f8332lh;
        long ouw;
        long vt;
        long yu;

        private vt() {
        }

        public /* synthetic */ vt(byte b10) {
            this();
        }
    }

    private ouw() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject fkw(File file) {
        byte[] bArrYu;
        try {
            if (!le(file) || (bArrYu = ra.yu(file)) == null || bArrYu.length <= 0) {
                return null;
            }
            String strVt = TextUtils.equals(file.getName(), "tt_open_ad_sdk_check_res.dat") ? com.bytedance.sdk.component.utils.ouw.vt(new String(bArrYu)) : com.bytedance.sdk.component.yu.ouw.vt(new String(bArrYu), com.bytedance.sdk.openadsdk.core.ouw.vt());
            if (TextUtils.isEmpty(strVt)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(strVt);
            if (jSONObject.length() > 0) {
                this.f8328le.put(file.getParentFile().getName(), jSONObject);
            }
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean le(File file) {
        return file != null && file.exists() && file.isFile() && file.canRead();
    }

    public static void lh(File file) {
        try {
            if (!file.exists() || file.setLastModified(System.currentTimeMillis())) {
                return;
            }
            file.renameTo(file);
            file.lastModified();
        } catch (Throwable unused) {
        }
    }

    private String yu() {
        if (TextUtils.isEmpty(this.yu)) {
            try {
                File file = new File(zih.ouw().getCacheDir(), "playable");
                if (!file.exists()) {
                    file.mkdirs();
                }
                this.yu = file.getAbsolutePath();
            } catch (Throwable th2) {
                qbp.lh("PlayableCache", "init root path error: ".concat(String.valueOf(th2)));
            }
        }
        return this.yu;
    }

    public final void vt() {
        if (this.ra.get()) {
            return;
        }
        bs.ouw(new pno("PlayableCache_init") { // from class: com.bytedance.sdk.openadsdk.core.mwh.lh.ouw.1
            @Override // java.lang.Runnable
            public final void run() {
                File[] fileArrListFiles;
                try {
                    String strLh = ouw.this.lh();
                    if (!TextUtils.isEmpty(strLh)) {
                        File file = new File(strLh);
                        if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
                            for (File file2 : fileArrListFiles) {
                                if (file2 != null) {
                                    try {
                                        File fileOuw = ouw.ouw(file2);
                                        if (fileOuw != null && fileOuw.exists()) {
                                            ouw.this.vt.put(file2.getName(), fileOuw.getAbsolutePath());
                                        }
                                        ouw.this.fkw(ouw.yu(fileOuw));
                                    } catch (Throwable unused) {
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable unused2) {
                }
                com.bytedance.sdk.openadsdk.zin.ouw.lh.ouw().ouw(ouw.this.vt);
                ouw.this.ra.set(true);
            }
        });
    }

    public static ouw ouw() {
        if (f8327lh == null) {
            synchronized (ouw.class) {
                try {
                    if (f8327lh == null) {
                        f8327lh = new ouw();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f8327lh;
    }

    public static void vt(File file) {
        lh(file);
        try {
            bly blyVarOuw = bly.ouw();
            if (blyVarOuw.ryl == null) {
                blyVarOuw.ryl = new lh((byte) 0);
            }
            blyVarOuw.ryl.ouw(file);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String lh() {
        File file = new File(yu(), "games");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath();
    }

    public static /* synthetic */ File yu(File file) {
        File file2 = new File(file, "tt_open_ad_sdk_check_res.dat");
        return le(file2) ? file2 : new File(file, "tt_open_ad_sdk_check_res.dat");
    }

    public final boolean ouw(vpp vppVar) {
        c cVar;
        String str;
        if (this.ra.get() && vppVar != null && (cVar = vppVar.f8309sd) != null && (str = cVar.f6580i) != null) {
            try {
                if (!TextUtils.isEmpty(this.vt.get(fkw.ouw(str)))) {
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public final WebResourceResponse ouw(String str, String str2, String str3) {
        WebResourceResponse webResourceResponseVt;
        String mimeTypeFromExtension;
        File fileOuw;
        String strReplace;
        JSONObject jSONObject;
        String strOptString;
        try {
            webResourceResponseVt = com.bytedance.sdk.openadsdk.zin.ouw.lh.ouw().vt(str3);
        } catch (Throwable th2) {
            qbp.ouw("PlayableCache", "playable intercept error: ", th2);
        }
        if (webResourceResponseVt != null) {
            return webResourceResponseVt;
        }
        if (this.ra.get() && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
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
            String strOuw = fkw.ouw(str);
            if (TextUtils.isEmpty(strOuw)) {
                return null;
            }
            String str4 = this.vt.get(strOuw);
            if (!TextUtils.isEmpty(str4)) {
                fileOuw = new File(str4);
            } else {
                fileOuw = ouw(new File(lh(), strOuw));
                if (fileOuw != null && fileOuw.exists()) {
                    this.vt.put(strOuw, fileOuw.getAbsolutePath());
                }
            }
            if (fileOuw != null && fileOuw.exists()) {
                if (TextUtils.isEmpty(str2)) {
                    strReplace = null;
                } else {
                    String[] strArrSplit = str2.split("\\?");
                    if (strArrSplit != null && strArrSplit.length == 2) {
                        String str5 = strArrSplit[0];
                        if (str5 != null && str5.endsWith("/")) {
                            str2 = str2.substring(0, strArrSplit.length - 1);
                        }
                        String str6 = strArrSplit[0];
                        if (str6 != null && str6.endsWith("index.html")) {
                            str2 = strArrSplit[0];
                        }
                    }
                    strReplace = str2.replace("index.html", "");
                }
                if (TextUtils.isEmpty(strReplace)) {
                    return null;
                }
                String strReplace2 = str3.replace(strReplace, "");
                if (!TextUtils.isEmpty(strReplace2) && !strReplace2.startsWith("https://") && !strReplace2.startsWith("http://")) {
                    File file = new File(fileOuw, strReplace2);
                    if (file.exists() && file.exists() && ((jSONObject = this.f8328le.get(strOuw)) == null || ((strOptString = jSONObject.optString(strReplace2)) != null && strOptString.equalsIgnoreCase(fkw.ouw(file))))) {
                        if (file.getCanonicalPath().startsWith(fileOuw.getCanonicalPath())) {
                            return new WebResourceResponse(mimeTypeFromExtension, "utf-8", new FileInputStream(file));
                        }
                    }
                }
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x003f, code lost:
    
        r7 = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.io.File ouw(java.io.File r7) {
        /*
        L0:
            r0 = 0
            if (r7 == 0) goto L44
            boolean r1 = r7.isDirectory()
            if (r1 == 0) goto L44
            java.io.File[] r1 = r7.listFiles()
            if (r1 == 0) goto L44
            int r2 = r1.length
            if (r2 != 0) goto L13
            goto L44
        L13:
            int r2 = r1.length
            r3 = 0
            r4 = r3
        L16:
            if (r4 >= r2) goto L32
            r5 = r1[r4]
            if (r5 == 0) goto L2f
            boolean r6 = r5.isFile()
            if (r6 == 0) goto L2f
            java.lang.String r6 = "index.html"
            java.lang.String r5 = r5.getName()
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L2f
            return r7
        L2f:
            int r4 = r4 + 1
            goto L16
        L32:
            int r7 = r1.length
        L33:
            if (r3 >= r7) goto L44
            r2 = r1[r3]
            if (r2 == 0) goto L41
            boolean r4 = r2.isDirectory()
            if (r4 == 0) goto L41
            r7 = r2
            goto L0
        L41:
            int r3 = r3 + 1
            goto L33
        L44:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.mwh.lh.ouw.ouw(java.io.File):java.io.File");
    }

    @SuppressLint({"[ByDesign4.2]BadDomainNameVerifier"})
    public final void ouw(final vpp vppVar, final InterfaceC0089ouw interfaceC0089ouw) {
        c cVar;
        File file;
        AdSlot adSlot;
        byte b10 = 0;
        if (yu.ouw().vt() && vppVar != null && od.le(vppVar) && (adSlot = vppVar.yiz) != null && !TextUtils.isEmpty(adSlot.getBidAdm())) {
            com.bytedance.sdk.openadsdk.core.mwh.lh.vt.ouw(vppVar, -705, "server bidding pre render");
            ouw(interfaceC0089ouw, false);
            return;
        }
        if (vppVar != null && (cVar = vppVar.f8309sd) != null && !TextUtils.isEmpty(cVar.f6580i)) {
            final String str = vppVar.f8309sd.f6580i;
            if (this.pno.contains(str)) {
                return;
            }
            Map<vpp, vt> map = this.fkw;
            vt vtVar = new vt(b10);
            vtVar.ouw = System.currentTimeMillis();
            map.put(vppVar, vtVar);
            com.bytedance.sdk.openadsdk.core.mwh.lh.vt.ouw(vppVar);
            String strOuw = fkw.ouw(str);
            final File file2 = new File(lh(), strOuw);
            String str2 = this.vt.get(strOuw);
            if (TextUtils.isEmpty(str2)) {
                file = ouw(file2);
                if (file != null && file.exists()) {
                    this.vt.put(strOuw, file.getAbsolutePath());
                }
            } else {
                file = new File(str2);
            }
            if (file != null && file.exists()) {
                com.bytedance.sdk.openadsdk.core.mwh.lh.vt.ouw(vppVar, -702, null);
                lh(file2);
                this.fkw.remove(vppVar);
                ouw(interfaceC0089ouw, true);
                return;
            }
            try {
                ra.lh(file2);
            } catch (Throwable unused) {
            }
            this.pno.add(str);
            File file3 = new File(yu(), h.s(strOuw, ".zip"));
            com.bytedance.sdk.component.ra.vt.ouw ouwVarLh = com.bytedance.sdk.openadsdk.th.vt.ouw().ouw.lh();
            this.ouw.put(str, ouwVarLh);
            ouwVarLh.ouw(str);
            ouwVarLh.ouw(file3.getParent(), file3.getName());
            ouwVarLh.ra = 7;
            ouwVarLh.f7626le = "playable_download";
            ouwVarLh.ouw(new com.bytedance.sdk.component.ra.ouw.ouw() { // from class: com.bytedance.sdk.openadsdk.core.mwh.lh.ouw.2
                @Override // com.bytedance.sdk.component.ra.ouw.ouw
                public final void ouw(com.bytedance.sdk.component.ra.vt.lh lhVar, final com.bytedance.sdk.component.ra.vt vtVar2) {
                    File file4;
                    ouw.this.pno.remove(str);
                    ouw.this.ouw.remove(str);
                    final vt vtVar3 = (vt) ouw.this.fkw.remove(vppVar);
                    if (vtVar3 != null) {
                        vtVar3.vt = System.currentTimeMillis();
                    }
                    if (vtVar2.pno && (file4 = vtVar2.ra) != null && file4.exists()) {
                        ko.lh("PlayableCache", "onResponse: Playable zip download success");
                        bs.vt(new pno("downloadZip") { // from class: com.bytedance.sdk.openadsdk.core.mwh.lh.ouw.2.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean z3;
                                long j;
                                long j8;
                                try {
                                    vt vtVar4 = vtVar3;
                                    if (vtVar4 != null) {
                                        vtVar4.f8332lh = System.currentTimeMillis();
                                    }
                                    uq.ouw(vtVar2.ra.getAbsolutePath(), file2.getAbsolutePath(), (String) null);
                                    vt vtVar5 = vtVar3;
                                    if (vtVar5 != null) {
                                        vtVar5.yu = System.currentTimeMillis();
                                    }
                                    vt vtVar6 = vtVar3;
                                    if (vtVar6 != null) {
                                        j = vtVar6.vt - vtVar6.ouw;
                                        j8 = vtVar6.yu - vtVar6.f8332lh;
                                    } else {
                                        j = 0;
                                        j8 = 0;
                                    }
                                    vpp vppVar2 = vppVar;
                                    if (vppVar2 != null && (od.lh(vppVar2) || od.vt(vppVar2))) {
                                        JSONObject jSONObject = new JSONObject();
                                        try {
                                            jSONObject.put("loadzip_success_time", j);
                                            jSONObject.put("unzip_success_time", j8);
                                        } catch (JSONException e2) {
                                            qbp.ouw("PlayableEvent", "onSuccess json error", e2);
                                        }
                                        com.bytedance.sdk.openadsdk.yu.lh.vt(vppVar2, "playable_preload", "preload_success", jSONObject);
                                    }
                                    ouw.vt(file2);
                                    try {
                                        File fileOuw = ouw.ouw(file2);
                                        if (fileOuw != null && fileOuw.exists()) {
                                            ouw.this.vt.put(file2.getName(), fileOuw.getAbsolutePath());
                                        }
                                        ouw.this.fkw(ouw.yu(fileOuw));
                                    } catch (Throwable unused2) {
                                    }
                                    z3 = true;
                                } catch (Throwable th2) {
                                    qbp.ouw("PlayableCache", "unzip error: ", th2);
                                    com.bytedance.sdk.openadsdk.core.mwh.lh.vt.ouw(vppVar, -704, th2.getMessage());
                                    z3 = false;
                                }
                                try {
                                    vtVar2.ra.delete();
                                } catch (Throwable unused3) {
                                }
                                AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                ouw.this.ouw(interfaceC0089ouw, z3);
                            }
                        });
                        return;
                    }
                    int i4 = vtVar2.ouw;
                    if (i4 == 0) {
                        i4 = -700;
                    }
                    com.bytedance.sdk.openadsdk.core.mwh.lh.vt.ouw(vppVar, i4, null);
                    ko.lh("PlayableCache", "onResponse: Playable zip download fail");
                    ouw.this.ouw(interfaceC0089ouw, false);
                }

                @Override // com.bytedance.sdk.component.ra.ouw.ouw
                public final void ouw(com.bytedance.sdk.component.ra.vt.lh lhVar, IOException iOException) {
                    ouw.this.pno.remove(str);
                    ouw.this.ouw.remove(str);
                    ouw.this.fkw.remove(vppVar);
                    com.bytedance.sdk.openadsdk.core.mwh.lh.vt.ouw(vppVar, -700, iOException.getMessage());
                    ouw.this.ouw(interfaceC0089ouw, false);
                    ko.lh("PlayableCache", "onFailure: Playable zip download fail");
                }
            });
            return;
        }
        com.bytedance.sdk.openadsdk.core.mwh.lh.vt.ouw(vppVar, -701, null);
        ouw(interfaceC0089ouw, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ouw(final InterfaceC0089ouw interfaceC0089ouw, final boolean z3) {
        bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mwh.lh.ouw.3
            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC0089ouw interfaceC0089ouw2 = interfaceC0089ouw;
                if (interfaceC0089ouw2 != null) {
                    interfaceC0089ouw2.ouw(z3);
                }
            }
        });
    }
}
