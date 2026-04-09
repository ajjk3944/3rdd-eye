package com.bytedance.sdk.component.adexpress.emc.ypw;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class msw {
    private static com.bytedance.sdk.component.adexpress.emc.xq.emc emc;

    public static void dg() {
        xq.ypw(bw.msw(), ypw(), "temp_pkg_info.json");
        emc = null;
    }

    public static void emc() throws IOException {
        FileInputStream fileInputStream = null;
        try {
            try {
                File file = new File(bw.msw(), "temp_pkg_info.json");
                long length = file.length();
                Long lValueOf = Long.valueOf(length);
                if (length > 0 && file.exists() && file.isFile()) {
                    byte[] bArr = new byte[lValueOf.intValue()];
                    FileInputStream fileInputStream2 = new FileInputStream(file);
                    try {
                        fileInputStream2.read(bArr);
                        com.bytedance.sdk.component.adexpress.emc.xq.emc emcVarEmc = com.bytedance.sdk.component.adexpress.emc.xq.emc.emc(new JSONObject(new String(bArr, "utf-8")));
                        if (emcVarEmc != null) {
                            emc = emcVarEmc;
                            emc.xq();
                        }
                        fileInputStream = fileInputStream2;
                    } catch (Throwable unused) {
                        fileInputStream = fileInputStream2;
                        if (fileInputStream != null) {
                            fileInputStream.close();
                            return;
                        }
                        return;
                    }
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (Throwable unused2) {
            }
        } catch (IOException unused3) {
        }
    }

    public static void xq() throws IOException {
        xq.emc(bw.msw(), ypw(), "temp_pkg_info.json");
    }

    public static synchronized com.bytedance.sdk.component.adexpress.emc.xq.emc ypw() {
        return emc;
    }

    public static boolean ypw(com.bytedance.sdk.component.adexpress.emc.xq.emc emcVar) {
        return xq.xq(ypw(), emcVar);
    }

    public static synchronized void emc(com.bytedance.sdk.component.adexpress.emc.xq.emc emcVar) {
        if (emcVar != null) {
            if (emcVar.msw()) {
                emc = emcVar;
            }
        }
    }

    public static boolean emc(String str) {
        return xq.emc(ypw(), str);
    }
}
