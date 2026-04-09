package com.bykv.vk.openvk.preload.geckox.utils;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private static byte[] f6810a = {80, 75, 3, 4};

    /* renamed from: b, reason: collision with root package name */
    private static byte[] f6811b = {80, 75, 5, 6};

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.io.Closeable, java.io.FileOutputStream, java.io.OutputStream] */
    public static void a(InputStream inputStream, String str, String str2) throws Exception {
        ?? fileOutputStream;
        ZipInputStream zipInputStream = null;
        try {
            String canonicalPath = new File(str).getCanonicalPath();
            ZipInputStream zipInputStream2 = new ZipInputStream(inputStream);
            boolean z3 = false;
            while (true) {
                try {
                    ZipEntry nextEntry = zipInputStream2.getNextEntry();
                    if (nextEntry == null) {
                        if (z3) {
                            CloseableUtils.close(zipInputStream2);
                            return;
                        }
                        inputStream.reset();
                        if (!a(inputStream)) {
                            throw new RuntimeException("not zip file  channel:".concat(String.valueOf(str2)));
                        }
                        throw new RuntimeException("unzip file: channel:".concat(String.valueOf(str2)));
                    }
                    String name = nextEntry.getName();
                    if (!name.startsWith("__MACOSX/") && !name.equals(".DS_Store") && !name.contains("../")) {
                        if (!name.startsWith(str2 + File.separator)) {
                            throw new RuntimeException("the zip package outermost folder is not named by channel channel:".concat(String.valueOf(str2)));
                        }
                        if (nextEntry.isDirectory()) {
                            File file = new File(canonicalPath, name);
                            if (!file.getCanonicalPath().startsWith(canonicalPath)) {
                                throw new RuntimeException("directory traversal, dir:" + name + ", channel:" + str2);
                            }
                            file.mkdirs();
                        } else {
                            String canonicalPath2 = new File(canonicalPath, name).getCanonicalPath();
                            if (!canonicalPath2.startsWith(canonicalPath)) {
                                throw new RuntimeException("directory traversal, file name:".concat(name));
                            }
                            File file2 = new File(canonicalPath2);
                            file2.getParentFile().mkdirs();
                            try {
                                fileOutputStream = new FileOutputStream(file2);
                            } catch (Throwable th2) {
                                th = th2;
                            }
                            try {
                                b.a(zipInputStream2, fileOutputStream);
                                CloseableUtils.close((Closeable) fileOutputStream);
                            } catch (Throwable th3) {
                                th = th3;
                                zipInputStream = fileOutputStream;
                                CloseableUtils.close(zipInputStream);
                                throw th;
                            }
                        }
                    }
                    z3 = true;
                } catch (Throwable th4) {
                    th = th4;
                    zipInputStream = zipInputStream2;
                    CloseableUtils.close(zipInputStream);
                    throw th;
                }
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean a(java.io.InputStream r4) throws java.lang.Exception {
        /*
            r0 = 4
            byte[] r1 = new byte[r0]     // Catch: java.lang.Throwable -> L1b
            r2 = 0
            int r3 = r4.read(r1, r2, r0)     // Catch: java.lang.Throwable -> L1b
            if (r3 != r0) goto L22
            byte[] r0 = com.bykv.vk.openvk.preload.geckox.utils.h.f6810a     // Catch: java.lang.Throwable -> L1b
            boolean r0 = java.util.Arrays.equals(r0, r1)     // Catch: java.lang.Throwable -> L1b
            if (r0 != 0) goto L1d
            byte[] r0 = com.bykv.vk.openvk.preload.geckox.utils.h.f6811b     // Catch: java.lang.Throwable -> L1b
            boolean r0 = java.util.Arrays.equals(r0, r1)     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L1e
            goto L1d
        L1b:
            r0 = move-exception
            goto L26
        L1d:
            r2 = 1
        L1e:
            com.bykv.vk.openvk.preload.geckox.utils.CloseableUtils.close(r4)
            return r2
        L22:
            com.bykv.vk.openvk.preload.geckox.utils.CloseableUtils.close(r4)
            return r2
        L26:
            com.bykv.vk.openvk.preload.geckox.utils.CloseableUtils.close(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bykv.vk.openvk.preload.geckox.utils.h.a(java.io.InputStream):boolean");
    }
}
