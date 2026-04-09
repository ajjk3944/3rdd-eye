package com.pgl.ssdk;

import com.applovin.shadow.okio.internal.Buffer;
import java.io.BufferedInputStream;
import java.io.IOException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class af {
    private static void a(byte[] bArr, int i4, byte[] bArr2) {
        for (int i10 = 0; i10 < i4; i10++) {
            bArr[i10] = (byte) (bArr[i10] ^ bArr2[i10 % bArr2.length]);
        }
    }

    private static String a(BufferedInputStream bufferedInputStream) throws IOException {
        int i4;
        if (bufferedInputStream == null) {
            return "";
        }
        byte[] bArr = new byte[Buffer.SEGMENTING_THRESHOLD];
        StringBuilder sb2 = new StringBuilder();
        do {
            try {
                i4 = bufferedInputStream.read(bArr);
                if (i4 > 0) {
                    sb2.append(new String(bArr, 0, i4));
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        } while (i4 >= 4096);
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0080 A[PHI: r0 r1
  0x0080: PHI (r0v9 java.lang.String) = (r0v13 java.lang.String), (r0v11 java.lang.String), (r0v11 java.lang.String) binds: [B:46:0x007d, B:14:0x0043, B:11:0x003e] A[DONT_GENERATE, DONT_INLINE]
  0x0080: PHI (r1v10 java.lang.Process) = (r1v9 java.lang.Process), (r1v12 java.lang.Process), (r1v12 java.lang.Process) binds: [B:46:0x007d, B:14:0x0043, B:11:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0090 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x006b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0086 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String a(java.lang.String r6) throws java.lang.Throwable {
        /*
            r0 = 0
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5e
            java.lang.String r2 = "sh"
            java.lang.Process r1 = r1.exec(r2)     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5e
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L59
            java.io.OutputStream r3 = r1.getOutputStream()     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L59
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L59
            java.io.BufferedInputStream r3 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            java.io.InputStream r4 = r1.getInputStream()     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            byte[] r6 = r6.getBytes()     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4a
            r2.write(r6)     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4a
            r6 = 10
            r2.write(r6)     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4a
            r2.flush()     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4a
            r2.close()     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4a
            r1.waitFor()     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4a
            java.lang.String r0 = a(r3)     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4a
            r2.close()     // Catch: java.io.IOException -> L3a
            goto L3e
        L3a:
            r6 = move-exception
            r6.printStackTrace()
        L3e:
            r3.close()     // Catch: java.io.IOException -> L42
            goto L80
        L42:
            r6 = move-exception
            r6.printStackTrace()
            goto L80
        L47:
            r6 = move-exception
            r0 = r3
            goto L50
        L4a:
            r6 = move-exception
            goto L66
        L4c:
            r6 = move-exception
            goto L50
        L4e:
            r6 = move-exception
            goto L55
        L50:
            r5 = r1
            r1 = r0
            r0 = r2
            r2 = r5
            goto L84
        L55:
            r3 = r0
            goto L66
        L57:
            r6 = move-exception
            goto L61
        L59:
            r6 = move-exception
            goto L64
        L5b:
            r6 = move-exception
            r1 = r0
            goto L61
        L5e:
            r6 = move-exception
            r1 = r0
            goto L64
        L61:
            r2 = r1
            r1 = r0
            goto L84
        L64:
            r2 = r0
            r3 = r2
        L66:
            r6.printStackTrace()     // Catch: java.lang.Throwable -> L47
            if (r2 == 0) goto L73
            r2.close()     // Catch: java.io.IOException -> L6f
            goto L73
        L6f:
            r6 = move-exception
            r6.printStackTrace()
        L73:
            if (r3 == 0) goto L7d
            r3.close()     // Catch: java.io.IOException -> L79
            goto L7d
        L79:
            r6 = move-exception
            r6.printStackTrace()
        L7d:
            if (r1 != 0) goto L80
            goto L83
        L80:
            r1.destroy()
        L83:
            return r0
        L84:
            if (r0 == 0) goto L8e
            r0.close()     // Catch: java.io.IOException -> L8a
            goto L8e
        L8a:
            r0 = move-exception
            r0.printStackTrace()
        L8e:
            if (r1 == 0) goto L98
            r1.close()     // Catch: java.io.IOException -> L94
            goto L98
        L94:
            r0 = move-exception
            r0.printStackTrace()
        L98:
            if (r2 == 0) goto L9d
            r2.destroy()
        L9d:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pgl.ssdk.af.a(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized java.lang.String a(android.content.Context r9) {
        /*
            java.lang.Class<com.pgl.ssdk.af> r0 = com.pgl.ssdk.af.class
            monitor-enter(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld5
            r1.<init>()     // Catch: java.lang.Throwable -> Ld5
            java.io.File r2 = r9.getFilesDir()     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r2 = r2.getAbsolutePath()     // Catch: java.lang.Throwable -> Ld5
            r1.append(r2)     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r2 = "/dic"
            r1.append(r2)     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Ld5
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> Ld5
            r2.<init>(r1)     // Catch: java.lang.Throwable -> Ld5
            boolean r2 = r2.exists()     // Catch: java.lang.Throwable -> Ld5
            if (r2 == 0) goto L4f
            java.lang.String r2 = "chmod 777 "
            java.lang.String r3 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r2 = r2.concat(r3)     // Catch: java.lang.Throwable -> Ld5
            a(r2)     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r2 = a(r1)     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r3 = "chmod 600 "
            java.lang.String r4 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r3 = r3.concat(r4)     // Catch: java.lang.Throwable -> Ld5
            a(r3)     // Catch: java.lang.Throwable -> Ld5
            if (r2 == 0) goto L4f
            int r3 = r2.length()     // Catch: java.lang.Throwable -> Ld5
            if (r3 <= 0) goto L4f
            monitor-exit(r0)
            return r2
        L4f:
            android.content.res.Resources r9 = r9.getResources()     // Catch: java.lang.Throwable -> Ld5
            android.content.res.AssetManager r9 = r9.getAssets()     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r2 = "dic"
            java.io.InputStream r9 = r9.open(r2)     // Catch: java.lang.Throwable -> Ld5
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> Ld5
            r2.<init>()     // Catch: java.lang.Throwable -> Ld5
            r3 = 4096(0x1000, float:5.74E-42)
            byte[] r4 = new byte[r3]     // Catch: java.lang.Throwable -> Ld5
        L66:
            r5 = 0
            int r6 = r9.read(r4, r5, r3)     // Catch: java.lang.Throwable -> Ld5
            r7 = -1
            if (r6 == r7) goto L83
            java.lang.String r7 = "dic"
            java.lang.String r8 = "UTF-8"
            java.nio.charset.Charset r8 = java.nio.charset.Charset.forName(r8)     // Catch: java.lang.Throwable -> Ld5
            byte[] r7 = r7.getBytes(r8)     // Catch: java.lang.Throwable -> Ld5
            a(r4, r6, r7)     // Catch: java.lang.Throwable -> Ld5
            r2.write(r4, r5, r6)     // Catch: java.lang.Throwable -> Ld5
            goto L66
        L81:
            r9 = move-exception
            goto Le3
        L83:
            java.io.FileOutputStream r9 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> Ld5
            r9.<init>(r1)     // Catch: java.lang.Throwable -> Ld5
            byte[] r2 = r2.toByteArray()     // Catch: java.lang.Throwable -> Ld5
            r9.write(r2)     // Catch: java.lang.Throwable -> Ld5
            r9.close()     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r9 = "chmod 777 "
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r9 = r9.concat(r2)     // Catch: java.lang.Throwable -> Ld5
            a(r9)     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r9 = a(r1)     // Catch: java.lang.Throwable -> Ld5
            if (r9 == 0) goto Lab
            int r2 = r9.length()     // Catch: java.lang.Throwable -> Ld5
            if (r2 != 0) goto Lc7
        Lab:
            java.io.RandomAccessFile r9 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r2 = "rw"
            r9.<init>(r1, r2)     // Catch: java.lang.Throwable -> Ld5
            r2 = 1
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> Ld5
            r3 = 2
            r2[r5] = r3     // Catch: java.lang.Throwable -> Ld5
            r3 = 16
            r9.seek(r3)     // Catch: java.lang.Throwable -> Ld5
            r9.write(r2)     // Catch: java.lang.Throwable -> Ld5
            r9.close()     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r9 = a(r1)     // Catch: java.lang.Throwable -> Ld5
        Lc7:
            java.lang.String r2 = "chmod 600 "
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r1 = r2.concat(r1)     // Catch: java.lang.Throwable -> Ld5
            a(r1)     // Catch: java.lang.Throwable -> Ld5
            goto Ld7
        Ld5:
            java.lang.String r9 = "0[<!>]EXCEPTION[<!>]"
        Ld7:
            if (r9 == 0) goto Ldf
            int r1 = r9.length()     // Catch: java.lang.Throwable -> L81
            if (r1 != 0) goto Le1
        Ldf:
            java.lang.String r9 = "0[<!>]ERROR[<!>]"
        Le1:
            monitor-exit(r0)
            return r9
        Le3:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L81
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pgl.ssdk.af.a(android.content.Context):java.lang.String");
    }
}
