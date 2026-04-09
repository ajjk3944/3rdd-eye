package com.ubnt.net.arp;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: classes3.dex */
abstract class a {
    public static boolean a(Context context, String str, File file) throws IOException {
        HashSet hashSet = new HashSet();
        if (context.getApplicationInfo().sourceDir != null) {
            hashSet.add(context.getApplicationInfo().sourceDir);
        }
        if (context.getApplicationInfo().splitSourceDirs != null) {
            hashSet.addAll(Arrays.asList(context.getApplicationInfo().splitSourceDirs));
        }
        for (String str2 : Build.SUPPORTED_ABIS) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ZipFile zipFile = new ZipFile(new File((String) it.next()), 1);
                try {
                    String strMapLibraryName = System.mapLibraryName(str);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("lib");
                    char c10 = File.separatorChar;
                    sb2.append(c10);
                    sb2.append(str2);
                    sb2.append(c10);
                    sb2.append(strMapLibraryName);
                    String string = sb2.toString();
                    ZipEntry entry = zipFile.getEntry(string);
                    if (entry == null) {
                        zipFile.close();
                    } else {
                        Log.d("SharedLibraryLoader", "Extracting apk:/" + string + " to " + file.getAbsolutePath());
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            InputStream inputStream = zipFile.getInputStream(entry);
                            try {
                                byte[] bArr = new byte[32768];
                                while (true) {
                                    int i10 = inputStream.read(bArr);
                                    if (i10 == -1) {
                                        fileOutputStream.getFD().sync();
                                        inputStream.close();
                                        fileOutputStream.close();
                                        zipFile.close();
                                        return true;
                                    }
                                    fileOutputStream.write(bArr, 0, i10);
                                }
                            } finally {
                            }
                        } finally {
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        zipFile.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034 A[DONT_GENERATE, PHI: r0 r1
  0x0034: PHI (r0v4 'e' java.lang.Throwable) = (r0v1 'e' java.lang.Throwable), (r0v0 'e' java.lang.Throwable) binds: [B:18:0x004d, B:15:0x0032] A[DONT_GENERATE, DONT_INLINE]
  0x0034: PHI (r1v4 java.io.File) = (r1v3 java.io.File), (r1v5 java.io.File) binds: [B:18:0x004d, B:15:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(android.content.Context r6, java.lang.String r7) {
        /*
            java.lang.System.loadLibrary(r7)     // Catch: java.lang.UnsatisfiedLinkError -> L4
            return
        L4:
            r0 = move-exception
            java.lang.String r1 = "Failed to load library normally, so attempting to extract from apk"
            java.lang.String r2 = "SharedLibraryLoader"
            android.util.Log.d(r2, r1, r0)
            r1 = 0
            java.lang.String r3 = "lib"
            java.lang.String r4 = ".so"
            java.io.File r5 = r6.getCodeCacheDir()     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            java.io.File r1 = java.io.File.createTempFile(r3, r4, r5)     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            boolean r6 = a(r6, r7, r1)     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            if (r6 == 0) goto L32
            java.lang.String r6 = r1.getAbsolutePath()     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            java.lang.System.load(r6)     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            r1.delete()
            return
        L2d:
            r6 = move-exception
            goto L5d
        L2f:
            r6 = move-exception
            r0 = r6
            goto L38
        L32:
            if (r1 == 0) goto L50
        L34:
            r1.delete()
            goto L50
        L38:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2d
            r6.<init>()     // Catch: java.lang.Throwable -> L2d
            java.lang.String r3 = "Failed to load library apk:/"
            r6.append(r3)     // Catch: java.lang.Throwable -> L2d
            r6.append(r7)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L2d
            android.util.Log.d(r2, r6, r0)     // Catch: java.lang.Throwable -> L2d
            if (r1 == 0) goto L50
            goto L34
        L50:
            boolean r6 = r0 instanceof java.lang.RuntimeException
            if (r6 == 0) goto L57
            java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0
            throw r0
        L57:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            r6.<init>(r0)
            throw r6
        L5d:
            if (r1 == 0) goto L62
            r1.delete()
        L62:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ubnt.net.arp.a.b(android.content.Context, java.lang.String):void");
    }
}
