package com.mbridge.msdk.config.component.common.file;

import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.download.download.ResourceManager;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.c1;
import com.mbridge.msdk.foundation.tools.q0;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.util.List;

/* loaded from: classes3.dex */
public class a {
    /* JADX WARN: Removed duplicated region for block: B:21:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.mbridge.msdk.config.component.common.file.b a(java.lang.String r4, int r5, java.lang.String r6) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.lang.String r0 = d(r4)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r2 = f(r4)     // Catch: java.lang.Throwable -> L5d
            com.mbridge.msdk.config.component.common.file.b r3 = new com.mbridge.msdk.config.component.common.file.b     // Catch: java.lang.Throwable -> L5d
            r3.<init>()     // Catch: java.lang.Throwable -> L5d
            java.lang.String r1 = a()     // Catch: java.lang.Throwable -> L4d
            r3.a(r1)     // Catch: java.lang.Throwable -> L4d
            r3.c(r0)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r1 = "mp4"
            boolean r1 = r0.contains(r1)     // Catch: java.lang.Throwable -> L4d
            if (r1 == 0) goto L28
            goto L2c
        L28:
            java.lang.String r2 = r2.concat(r0)     // Catch: java.lang.Throwable -> L4d
        L2c:
            r3.b(r2)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r1 = "zip"
            boolean r0 = r0.contains(r1)     // Catch: java.lang.Throwable -> L4d
            if (r0 == 0) goto L4f
            java.lang.String r0 = j(r4)     // Catch: java.lang.Throwable -> L4d
            r3.d(r0)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r4 = b(r4, r5, r6)     // Catch: java.lang.Throwable -> L4d
            boolean r5 = b(r4)     // Catch: java.lang.Throwable -> L4d
            r3.a(r5)     // Catch: java.lang.Throwable -> L4d
            r3.e(r4)     // Catch: java.lang.Throwable -> L4d
            goto L68
        L4d:
            r4 = move-exception
            goto L5b
        L4f:
            java.lang.String r4 = r3.a()     // Catch: java.lang.Throwable -> L4d
            boolean r4 = b(r4)     // Catch: java.lang.Throwable -> L4d
            r3.a(r4)     // Catch: java.lang.Throwable -> L4d
            goto L68
        L5b:
            r1 = r3
            goto L5e
        L5d:
            r4 = move-exception
        L5e:
            java.lang.String r4 = r4.getMessage()
            java.lang.String r5 = "ComponentFileUtil"
            com.mbridge.msdk.foundation.tools.q0.b(r5, r4)
            r3 = r1
        L68:
            if (r3 == 0) goto L71
            java.lang.String r4 = r3.a()
            a(r4)
        L71:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.config.component.common.file.a.a(java.lang.String, int, java.lang.String):com.mbridge.msdk.config.component.common.file.b");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0132 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x014e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x013c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0158 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:181:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.io.FileOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.io.FileOutputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean b(java.lang.String r12, java.lang.String r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 353
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.config.component.common.file.a.b(java.lang.String, java.lang.String):boolean");
    }

    public static String c(String str) {
        String strHexEncode = "";
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        File file = new File(str);
        if (file.exists() && file.length() > 0) {
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int i10 = fileInputStream.read(bArr);
                        if (i10 == -1) {
                            strHexEncode = SameMD5.hexEncode(messageDigest.digest());
                            messageDigest.reset();
                            fileInputStream.close();
                            return strHexEncode;
                        }
                        messageDigest.update(bArr, 0, i10);
                    }
                } finally {
                }
            } catch (Throwable th) {
                q0.b("ComponentFileUtil", th.getMessage());
            }
        }
        return strHexEncode;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String d(java.lang.String r3) {
        /*
            java.lang.String r0 = ""
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r3 = r3.getLastPathSegment()     // Catch: java.lang.Throwable -> L1f
            boolean r1 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L1f
            if (r1 != 0) goto L21
            java.lang.String r1 = "\\."
            java.lang.String[] r3 = r3.split(r1)     // Catch: java.lang.Throwable -> L1f
            int r1 = r3.length     // Catch: java.lang.Throwable -> L1f
            if (r1 <= 0) goto L21
            int r1 = r3.length     // Catch: java.lang.Throwable -> L1f
            int r1 = r1 + (-1)
            r3 = r3[r1]     // Catch: java.lang.Throwable -> L1f
            goto L22
        L1f:
            r3 = move-exception
            goto L34
        L21:
            r3 = r0
        L22:
            boolean r1 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L30
            if (r1 == 0) goto L29
            return r0
        L29:
            java.lang.String r0 = "."
            java.lang.String r3 = r0.concat(r3)     // Catch: java.lang.Throwable -> L30
            return r3
        L30:
            r0 = move-exception
            r2 = r0
            r0 = r3
            r3 = r2
        L34:
            java.lang.String r3 = r3.getMessage()
            java.lang.String r1 = "ComponentFileUtil"
            com.mbridge.msdk.foundation.tools.q0.b(r1, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.config.component.common.file.a.d(java.lang.String):java.lang.String");
    }

    public static b e(String str) {
        return a(str, 0, null);
    }

    public static String f(String str) {
        return !TextUtils.isEmpty(str) ? SameMD5.getMD5(c1.b(str.trim())) : "";
    }

    public static String g(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return a() + "/" + f(str) + "/";
    }

    private static String h(String str) {
        List<String> queryParameters;
        if (!TextUtils.isEmpty(str) && (queryParameters = Uri.parse(str).getQueryParameters("filename")) != null && !queryParameters.isEmpty()) {
            String str2 = queryParameters.get(0);
            if (!TextUtils.isEmpty(str2)) {
                return str2;
            }
        }
        return "";
    }

    private static String i(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                Uri uri = Uri.parse(str);
                List<String> queryParameters = uri.getQueryParameters(ResourceManager.KEY_INDEX_HTML);
                if (queryParameters != null && !queryParameters.isEmpty()) {
                    return queryParameters.get(0);
                }
                String path = uri.getPath();
                if (!TextUtils.isEmpty(path)) {
                    String strSubstring = path.substring(path.lastIndexOf(47) + 1);
                    if (!TextUtils.isEmpty(strSubstring)) {
                        return strSubstring.replace(".zip", "");
                    }
                }
            } catch (Exception unused) {
            }
        }
        return "";
    }

    public static String j(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String strA = a();
        String strF = f(str);
        String strI = i(str);
        if (!TextUtils.isEmpty(strI)) {
            String str2 = strA + strF + "/" + strI + "/";
            if (!TextUtils.isEmpty(str2)) {
                return str2;
            }
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void k(String str) {
        com.mbridge.msdk.config.component.database.a.a().c("UPDATE FileDB SET touchTime=" + System.currentTimeMillis() + " WHERE filePath='" + str + "'");
    }

    public static String a() {
        File file = new File(c.n().d().getFilesDir(), "mbCache");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath().concat(File.separator);
    }

    private static void a(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        File file = new File(str);
        if (!file.exists() || file.length() <= 0) {
            return;
        }
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new Runnable() { // from class: r6.a
            @Override // java.lang.Runnable
            public final void run() {
                com.mbridge.msdk.config.component.common.file.a.k(str);
            }
        });
    }

    public static String a(String str, String str2) {
        String str3 = "";
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String strSubstring = str.substring(str.indexOf("?") + 1);
        if (!TextUtils.isEmpty(strSubstring)) {
            str3 = "?" + strSubstring;
        }
        return q7.a.FILE_SCHEME + str2 + str3;
    }

    private static String b(String str, int i10, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String strJ = j(str);
        String strI = i(str);
        String strH = h(str);
        if (!TextUtils.isEmpty(strI)) {
            if (i10 == 0) {
                return strJ + strI + "/" + strH;
            }
            if (i10 == 1) {
                return strJ + strI + ".html";
            }
            if (i10 == 2) {
                StringBuilder sb = new StringBuilder();
                sb.append(strJ);
                if (!TextUtils.isEmpty(strH)) {
                    strI = strH;
                }
                sb.append(strI);
                sb.append("_");
                if (str2.equals(MBridgeConstans.ENDCARD_URL_TYPE_PL)) {
                    str2 = "";
                }
                sb.append(str2);
                sb.append(".xml");
                return sb.toString();
            }
        }
        return "";
    }

    private static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
        } catch (Throwable th) {
            q0.b("ComponentFileUtil", th.getMessage(), th);
        }
        return new File(str).exists();
    }
}
