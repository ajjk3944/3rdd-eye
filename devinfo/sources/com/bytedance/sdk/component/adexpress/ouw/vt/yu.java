package com.bytedance.sdk.component.adexpress.ouw.vt;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.ouw.lh.ouw;
import com.bytedance.sdk.component.pno.pno;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.zin;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class yu extends lh {
    private static volatile yu fkw;
    private static File yu;

    /* renamed from: le, reason: collision with root package name */
    private AtomicBoolean f7388le = new AtomicBoolean(true);
    public AtomicBoolean ouw = new AtomicBoolean(false);
    public boolean vt = false;

    /* renamed from: lh, reason: collision with root package name */
    public AtomicBoolean f7389lh = new AtomicBoolean(false);
    private AtomicInteger ra = new AtomicInteger(0);
    private AtomicLong pno = new AtomicLong();

    private yu() {
        lh();
    }

    public static com.bytedance.sdk.component.adexpress.ouw.lh.ouw fkw() {
        return ra.ouw();
    }

    public static File le() {
        if (yu == null) {
            try {
                File file = new File(new File(com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().f7383lh.vt().getCacheDir(), "tt_tmpl_pkg"), "template");
                file.mkdirs();
                yu = file;
            } catch (Throwable th2) {
                ko.lh("TemplateManager", "getTemplateDir error", th2);
            }
        }
        return yu;
    }

    public static yu vt() {
        if (fkw == null) {
            synchronized (yu.class) {
                try {
                    if (fkw == null) {
                        fkw = new yu();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return fkw;
    }

    public final void lh() {
        com.bytedance.sdk.component.adexpress.yu.yu.ouw(new pno("init") { // from class: com.bytedance.sdk.component.adexpress.ouw.vt.yu.1
            @Override // java.lang.Runnable
            public final void run() throws IOException {
                FileInputStream fileInputStream;
                Throwable th2;
                FileInputStream fileInputStream2 = null;
                try {
                    try {
                        File file = new File(yu.le(), "temp_pkg_info.json");
                        long length = file.length();
                        Long lValueOf = Long.valueOf(length);
                        if (length > 0 && file.exists() && file.isFile()) {
                            byte[] bArr = new byte[lValueOf.intValue()];
                            fileInputStream = new FileInputStream(file);
                            try {
                                fileInputStream.read(bArr);
                                com.bytedance.sdk.component.adexpress.ouw.lh.ouw ouwVarOuw = com.bytedance.sdk.component.adexpress.ouw.lh.ouw.ouw(new JSONObject(new String(bArr, "utf-8")));
                                if (ouwVarOuw != null) {
                                    ra.ouw = ouwVarOuw;
                                    ko.vt("Version", "old version read success: " + ra.ouw.ouw);
                                }
                                fileInputStream2 = fileInputStream;
                            } catch (Throwable th3) {
                                th2 = th3;
                                try {
                                    ko.lh("Version", "version init error", th2);
                                    if (fileInputStream != null) {
                                        fileInputStream.close();
                                    }
                                    yu.this.f7388le.set(false);
                                    yu.this.yu();
                                    yu.this.ouw(false);
                                    if (com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().f7383lh == null) {
                                        return;
                                    } else {
                                        return;
                                    }
                                } catch (Throwable th4) {
                                    if (fileInputStream != null) {
                                        try {
                                            fileInputStream.close();
                                        } catch (IOException unused) {
                                        }
                                    }
                                    throw th4;
                                }
                            }
                        } else {
                            ko.vt("Version", "version pkg json file does not exist");
                        }
                    } catch (Throwable th5) {
                        fileInputStream = null;
                        th2 = th5;
                    }
                    if (fileInputStream2 != null) {
                        fileInputStream2.close();
                    }
                } catch (IOException unused2) {
                }
                yu.this.f7388le.set(false);
                yu.this.yu();
                yu.this.ouw(false);
                if (com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().f7383lh == null && zin.ouw(com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().f7383lh.vt()) && com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().f7383lh != null) {
                    com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().f7383lh.yu();
                }
            }
        });
    }

    public final void yu() {
        com.bytedance.sdk.component.adexpress.ouw.lh.ouw ouwVarOuw = ra.ouw();
        if (ouwVarOuw == null || !ouwVarOuw.vt()) {
            return;
        }
        boolean zOuw = ouw(ouwVarOuw);
        if (!zOuw) {
            ra.vt();
        }
        this.vt = zOuw;
    }

    @Override // com.bytedance.sdk.component.adexpress.ouw.vt.lh
    public final File ouw() {
        return le();
    }

    public final void ouw(boolean z3) {
        List<ouw.C0048ouw> listOuw;
        boolean z10;
        if (this.f7388le.get()) {
            ko.vt("TemplateManager", "loadTemplate error1");
            return;
        }
        try {
            if (this.ouw.get()) {
                if (z3) {
                    this.ra.getAndIncrement();
                }
                ko.vt("TemplateManager", "loadTemplate error2: ".concat(String.valueOf(z3)));
                return;
            }
            boolean z11 = true;
            this.ouw.set(true);
            com.bytedance.sdk.component.adexpress.ouw.lh.ouw ouwVarFkw = com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().f7383lh.fkw();
            com.bytedance.sdk.component.adexpress.ouw.lh.ouw ouwVarOuw = ra.ouw();
            if (ouwVarFkw != null && ouwVarFkw.vt()) {
                if (!lh.lh(ra.ouw(), ouwVarFkw)) {
                    this.ouw.set(false);
                    this.pno.set(System.currentTimeMillis());
                    ko.vt("TemplateManager", "loadTemplate error4");
                    return;
                }
                if (com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().f7383lh != null) {
                    com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().f7383lh.lh().post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.ouw.vt.yu.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.bytedance.sdk.component.adexpress.fkw.fkw.ouw().vt();
                        }
                    });
                }
                ra.ouw(ouwVarFkw);
                ouw.vt vtVar = ouwVarFkw.f7375lh;
                boolean zOuw = (vtVar == null || TextUtils.isEmpty(vtVar.ouw)) ? false : ouw(ouwVarFkw.f7375lh.ouw);
                if (ouwVarFkw.fkw.size() != 0) {
                    listOuw = ouw(ouwVarFkw, ouwVarOuw);
                    z10 = listOuw != null;
                } else {
                    listOuw = null;
                    z10 = zOuw;
                }
                if (!zOuw) {
                    List<ouw.C0048ouw> listVt = vt(ouwVarFkw, ouwVarOuw);
                    if (listOuw == null || listVt == null) {
                        listOuw = listVt;
                    } else {
                        listOuw.addAll(listVt);
                    }
                    if (listVt == null) {
                        z11 = false;
                    }
                    if (listVt == null) {
                        this.ouw.set(false);
                    }
                    z10 = z11;
                }
                if (z10 && ouw(ouwVarFkw)) {
                    ra.ouw(ouwVarFkw);
                    lh.ouw(le(), ra.ouw(), "temp_pkg_info.json");
                    if (listOuw != null && !listOuw.isEmpty()) {
                        Iterator<ouw.C0048ouw> it = listOuw.iterator();
                        while (it.hasNext()) {
                            File file = new File(ouw(), com.bytedance.sdk.component.utils.fkw.ouw(it.next().ouw));
                            File file2 = new File(file + ".tmp");
                            if (file.exists()) {
                                try {
                                    file.delete();
                                } catch (Throwable unused) {
                                }
                            }
                            if (file2.exists()) {
                                try {
                                    file2.delete();
                                } catch (Throwable unused2) {
                                }
                            }
                        }
                    }
                }
                yu();
                this.ouw.set(false);
                this.pno.set(System.currentTimeMillis());
                if (this.ra.getAndSet(0) <= 0 || System.currentTimeMillis() - this.pno.get() <= TTAdConstant.AD_MAX_EVENT_TIME) {
                    return;
                }
                ouw(false);
                return;
            }
            this.ouw.set(false);
            if (com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().vt != null) {
                com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().vt.ouw();
            }
        } catch (Throwable th2) {
            ko.ouw("TemplateManager", "loadTemplate error: ", th2);
        }
    }

    private boolean ouw(com.bytedance.sdk.component.adexpress.ouw.lh.ouw ouwVar) {
        if (ouwVar == null) {
            return false;
        }
        return ouw(ouwVar.fkw) || ouw(ouwVar.f7375lh) || ouw(ouwVar.ouw());
    }
}
