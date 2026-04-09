package com.bytedance.sdk.component.uym.ypw;

import android.text.TextUtils;
import com.bytedance.sdk.component.ypw.emc.gbl;
import com.bytedance.sdk.component.ypw.emc.sup;
import com.mbridge.msdk.foundation.download.Command;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes.dex */
public class emc extends xq {
    public File emc;
    private volatile boolean ru;
    public File ypw;

    public emc(gbl gblVar) {
        super(gblVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean bw(Map<String, String> map) {
        if (TextUtils.equals(map.get("Accept-Ranges"), "bytes") || TextUtils.equals(map.get("accept-ranges"), "bytes")) {
            return true;
        }
        String str = map.get("Content-Range");
        if (TextUtils.isEmpty(str)) {
            str = map.get("content-range");
        }
        return str != null && str.startsWith("bytes");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean uym(Map<String, String> map) {
        return TextUtils.equals(map.get("Content-Encoding"), "gzip");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long ycc(Map<String, String> map) {
        String str = map.containsKey("content-length") ? map.get("content-length") : map.containsKey("Content-Length") ? map.get("Content-Length") : null;
        if (!TextUtils.isEmpty(str) && str != null) {
            try {
                return Long.valueOf(str).longValue();
            } catch (Throwable unused) {
            }
        }
        return 0L;
    }

    public void emc(String str, String str2) {
        File file = new File(str);
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        this.emc = new File(str, str2);
        this.ypw = new File(str, str2 + ".temp");
    }

    @Override // com.bytedance.sdk.component.uym.ypw.xq
    public void ypw() {
        this.ru = true;
        super.ypw();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bw() {
        try {
            this.emc.delete();
        } catch (Throwable unused) {
        }
        try {
            this.ypw.delete();
        } catch (Throwable unused2) {
        }
    }

    public void emc(final com.bytedance.sdk.component.uym.emc.emc emcVar) {
        File file = this.emc;
        if (file == null || this.ypw == null) {
            if (emcVar != null) {
                emcVar.emc(this, new IOException("File info is null, please exec setFileInfo(String dir, String fileName)"));
                return;
            }
            return;
        }
        if (file.exists() && this.emc.length() != 0 && emcVar != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            com.bytedance.sdk.component.uym.ypw ypwVar = new com.bytedance.sdk.component.uym.ypw(true, 200, "Success", null, null, jCurrentTimeMillis, jCurrentTimeMillis);
            ypwVar.emc(this.emc);
            emcVar.emc(this, ypwVar);
            return;
        }
        long length = this.ypw.length();
        final long j10 = length >= 0 ? length : 0L;
        sup.emc emcVar2 = new sup.emc();
        emcVar2.emc((Object) xq());
        ypw(Command.HTTP_HEADER_RANGE, "bytes=" + j10 + "-");
        if (TextUtils.isEmpty(this.msw)) {
            emcVar.emc(this, new IOException("Url is Empty"));
            return;
        }
        try {
            emcVar2.ypw(this.msw);
            if (!TextUtils.isEmpty(this.bw)) {
                emcVar2.emc(this.bw);
            }
            int i10 = this.ycc;
            if (i10 > 0) {
                emcVar2.emc(i10);
            }
            emc(emcVar2);
            com.bytedance.sdk.component.ypw.emc.ypw ypwVarEmc = this.xq.emc(emcVar2.emc().ypw());
            if (ypwVarEmc == null) {
                emcVar.emc(this, new IOException("new call error"));
            } else {
                ypwVarEmc.emc(new com.bytedance.sdk.component.ypw.emc.xq() { // from class: com.bytedance.sdk.component.uym.ypw.emc.1
                    @Override // com.bytedance.sdk.component.ypw.emc.xq
                    public void emc(com.bytedance.sdk.component.ypw.emc.ypw ypwVar2, IOException iOException) {
                        com.bytedance.sdk.component.uym.emc.emc emcVar3 = emcVar;
                        if (emcVar3 != null) {
                            emcVar3.emc(emc.this, iOException);
                        }
                        emc.this.bw();
                    }

                    /* JADX WARN: Removed duplicated region for block: B:127:0x018c A[SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:54:0x015c A[Catch: all -> 0x0148, TryCatch #3 {all -> 0x0148, blocks: (B:44:0x012f, B:46:0x013d, B:48:0x0141, B:51:0x014b, B:52:0x0152, B:54:0x015c, B:56:0x0168, B:59:0x0179, B:62:0x0184, B:63:0x018b, B:58:0x0170, B:65:0x018e, B:67:0x0196, B:70:0x01a2, B:72:0x01ac, B:74:0x01b8, B:76:0x01c4, B:77:0x01d3, B:78:0x01e0, B:81:0x01fa), top: B:114:0x012f }] */
                    @Override // com.bytedance.sdk.component.ypw.emc.xq
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public void emc(com.bytedance.sdk.component.ypw.emc.ypw r21, com.bytedance.sdk.component.ypw.emc.qh r22) throws java.io.IOException {
                        /*
                            Method dump skipped, instructions count: 580
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.uym.ypw.emc.AnonymousClass1.emc(com.bytedance.sdk.component.ypw.emc.ypw, com.bytedance.sdk.component.ypw.emc.qh):void");
                    }
                });
            }
        } catch (IllegalArgumentException unused) {
            emcVar.emc(this, new IOException("Url is not a valid HTTP or HTTPS URL"));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:188:0x01d6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0133 A[PHI: r10
  0x0133: PHI (r10v4 long) = (r10v3 long), (r10v8 long) binds: [B:41:0x00f9, B:44:0x0108] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.bytedance.sdk.component.uym.ypw emc() {
        /*
            Method dump skipped, instructions count: 601
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.uym.ypw.emc.emc():com.bytedance.sdk.component.uym.ypw");
    }
}
