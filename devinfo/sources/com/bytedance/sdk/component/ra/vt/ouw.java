package com.bytedance.sdk.component.ra.vt;

import android.text.TextUtils;
import com.bytedance.sdk.component.vt.ouw.cf;
import com.bytedance.sdk.component.vt.ouw.mwh;
import com.bytedance.sdk.component.vt.ouw.ryl;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import d.h;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw extends lh {

    /* renamed from: lh, reason: collision with root package name */
    volatile boolean f7627lh;
    public File ouw;
    public File vt;

    public ouw(cf cfVar) {
        super(cfVar);
    }

    public static boolean lh(Map<String, String> map) {
        return TextUtils.equals(map.get("Content-Encoding"), "gzip");
    }

    public static long vt(Map<String, String> map) {
        String str = map.containsKey("content-length") ? map.get("content-length") : map.containsKey("Content-Length") ? map.get("Content-Length") : null;
        if (!TextUtils.isEmpty(str) && str != null) {
            try {
                return Long.valueOf(str).longValue();
            } catch (Throwable unused) {
            }
        }
        return 0L;
    }

    public final void ouw(String str, String str2) {
        File file = new File(str);
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        this.ouw = new File(str, str2);
        this.vt = new File(str, h.s(str2, ".temp"));
    }

    @Override // com.bytedance.sdk.component.ra.vt.lh
    public final void lh() {
        this.f7627lh = true;
        super.lh();
    }

    public final void vt() {
        try {
            this.ouw.delete();
        } catch (Throwable unused) {
        }
        try {
            this.vt.delete();
        } catch (Throwable unused2) {
        }
    }

    public final void ouw(final com.bytedance.sdk.component.ra.ouw.ouw ouwVar) {
        File file = this.ouw;
        if (file != null && this.vt != null) {
            if (file.exists() && this.ouw.length() != 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                com.bytedance.sdk.component.ra.vt vtVar = new com.bytedance.sdk.component.ra.vt(true, TTAdConstant.MATE_VALID, "Success", null, null, jCurrentTimeMillis, jCurrentTimeMillis);
                vtVar.ra = this.ouw;
                ouwVar.ouw(this, vtVar);
                return;
            }
            long length = this.vt.length();
            final long j = length >= 0 ? length : 0L;
            ryl.ouw ouwVar2 = new ryl.ouw();
            ouwVar2.fkw = yu();
            vt("Range", "bytes=" + j + "-");
            if (TextUtils.isEmpty(this.bly)) {
                ouwVar.ouw(this, new IOException("Url is Empty"));
                return;
            }
            try {
                ouwVar2.ouw(this.bly);
                if (!TextUtils.isEmpty(this.f7626le)) {
                    ouwVar2.pno = this.f7626le;
                }
                int i4 = this.ra;
                if (i4 > 0) {
                    ouwVar2.ra = i4;
                }
                ouw(ouwVar2);
                com.bytedance.sdk.component.vt.ouw.vt vtVarOuw = this.yu.ouw(ouwVar2.ouw("GET", (mwh) null).ouw());
                if (vtVarOuw == null) {
                    ouwVar.ouw(this, new IOException("new call error"));
                    return;
                } else {
                    vtVarOuw.ouw(new com.bytedance.sdk.component.vt.ouw.lh() { // from class: com.bytedance.sdk.component.ra.vt.ouw.1
                        @Override // com.bytedance.sdk.component.vt.ouw.lh
                        public final void ouw(IOException iOException) {
                            com.bytedance.sdk.component.ra.ouw.ouw ouwVar3 = ouwVar;
                            if (ouwVar3 != null) {
                                ouwVar3.ouw(ouw.this, iOException);
                            }
                            ouw.this.vt();
                        }

                        /* JADX WARN: Removed duplicated region for block: B:144:0x0188 A[SYNTHETIC] */
                        /* JADX WARN: Removed duplicated region for block: B:53:0x014f  */
                        @Override // com.bytedance.sdk.component.vt.ouw.lh
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final void ouw(com.bytedance.sdk.component.vt.ouw.jg r22) throws java.io.IOException {
                            /*
                                Method dump skipped, instructions count: 616
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.ra.vt.ouw.AnonymousClass1.ouw(com.bytedance.sdk.component.vt.ouw.jg):void");
                        }
                    });
                    return;
                }
            } catch (IllegalArgumentException unused) {
                ouwVar.ouw(this, new IOException("Url is not a valid HTTP or HTTPS URL"));
                return;
            }
        }
        ouwVar.ouw(this, new IOException("File info is null, please exec setFileInfo(String dir, String fileName)"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0225, code lost:
    
        if (r15 == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0229, code lost:
    
        if (r7 != 0) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x022b, code lost:
    
        r13 = r27.vt.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0233, code lost:
    
        if (r13 <= 0) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x023b, code lost:
    
        if (r27.vt.exists() == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0245, code lost:
    
        if (r27.vt.length() != r13) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x024f, code lost:
    
        if (r27.vt.renameTo(r27.ouw) == false) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0251, code lost:
    
        r12.ra = r27.ouw;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0255, code lost:
    
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0259, code lost:
    
        com.bytedance.sdk.component.ra.lh.yu.ouw(r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0264, code lost:
    
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0268, code lost:
    
        com.bytedance.sdk.component.ra.lh.yu.ouw(r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0273, code lost:
    
        r0 = new java.lang.StringBuilder(" tempFile.length() == fileSize is");
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0282, code lost:
    
        if (r27.vt.length() != r13) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0284, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0286, code lost:
    
        r13 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0287, code lost:
    
        r0.append(r13);
        com.bytedance.sdk.component.ra.lh.yu.ouw("DownloadExecutor", r0.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0291, code lost:
    
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0295, code lost:
    
        com.bytedance.sdk.component.ra.lh.yu.ouw(r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0218, code lost:
    
        if (r10 == 0) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x021a, code lost:
    
        r2.seek(r4);
        r4 = false;
        r2.write(r0, 0, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0222, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0218 A[EDGE_INSN: B:205:0x0218->B:96:0x0218 BREAK  A[LOOP:1: B:78:0x01d5->B:91:0x020a], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0164 A[PHI: r13
  0x0164: PHI (r13v5 long) = (r13v4 long), (r13v12 long) binds: [B:43:0x0104, B:45:0x0113] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01be A[Catch: all -> 0x01c9, TryCatch #4 {all -> 0x01c9, blocks: (B:70:0x01b8, B:72:0x01be, B:74:0x01c2, B:77:0x01ce, B:78:0x01d5), top: B:177:0x01b8 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01e0  */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.io.RandomAccessFile] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.bytedance.sdk.component.ra.vt ouw() {
        /*
            Method dump skipped, instructions count: 745
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.ra.vt.ouw.ouw():com.bytedance.sdk.component.ra.vt");
    }

    public static boolean ouw(Map<String, String> map) {
        if (TextUtils.equals(map.get("Accept-Ranges"), "bytes") || TextUtils.equals(map.get("accept-ranges"), "bytes")) {
            return true;
        }
        String str = map.get("Content-Range");
        if (TextUtils.isEmpty(str)) {
            str = map.get("content-range");
        }
        return str != null && str.startsWith("bytes");
    }
}
