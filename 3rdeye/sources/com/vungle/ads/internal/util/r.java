package com.vungle.ads.internal.util;

import com.vungle.ads.internal.util.k;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* compiled from: UnzipUtility.kt */
/* loaded from: classes2.dex */
public final class r {
    private static final int BUFFER_SIZE = 4096;
    public static final r INSTANCE = new r();
    private static final String TAG = r.class.getCanonicalName();

    /* compiled from: UnzipUtility.kt */
    public interface a {
        boolean matches(String str);
    }

    /* compiled from: UnzipUtility.kt */
    public static final class b extends IOException {
        public b(String str) {
            super(str);
        }
    }

    private r() {
    }

    public static /* synthetic */ List unzip$default(r rVar, String str, String str2, a aVar, int i, Object obj) throws IOException {
        if ((i & 4) != 0) {
            aVar = null;
        }
        return rVar.unzip(str, str2, aVar);
    }

    private final String validateFilename(String str, String str2) throws IOException {
        String canonicalPath = new File(str).getCanonicalPath();
        String canonicalID = new File(str2).getCanonicalPath();
        kotlin.jvm.internal.l.e(canonicalPath, "canonicalPath");
        kotlin.jvm.internal.l.e(canonicalID, "canonicalID");
        if (y9.n.a0(canonicalPath, canonicalID, false)) {
            return canonicalPath;
        }
        k.a aVar = k.Companion;
        String TAG2 = TAG;
        kotlin.jvm.internal.l.e(TAG2, "TAG");
        aVar.e(TAG2, "File is outside extraction target directory.");
        throw new b("File is outside extraction target directory.");
    }

    public final void extractFile(InputStream zipIn, String str) throws Throwable {
        FileOutputStream fileOutputStream;
        Throwable th;
        BufferedOutputStream bufferedOutputStream;
        kotlin.jvm.internal.l.f(zipIn, "zipIn");
        File file = new File(str);
        f.delete(file);
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists()) {
            parentFile.mkdirs();
        }
        try {
            fileOutputStream = new FileOutputStream(str);
            try {
                bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int i = zipIn.read(bArr);
                        if (i == -1) {
                            f fVar = f.INSTANCE;
                            fVar.closeQuietly(zipIn);
                            fVar.closeQuietly(bufferedOutputStream);
                            fVar.closeQuietly(fileOutputStream);
                            return;
                        }
                        bufferedOutputStream.write(bArr, 0, i);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    f fVar2 = f.INSTANCE;
                    fVar2.closeQuietly(zipIn);
                    fVar2.closeQuietly(bufferedOutputStream);
                    fVar2.closeQuietly(fileOutputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedOutputStream = null;
            }
        } catch (Throwable th4) {
            fileOutputStream = null;
            th = th4;
            bufferedOutputStream = null;
        }
    }

    public final List<File> unzip(String str, String destDirectory) throws IOException {
        kotlin.jvm.internal.l.f(destDirectory, "destDirectory");
        return unzip$default(this, str, destDirectory, null, 4, null);
    }

    public final List<File> unzip(String str, String destDirectory, a aVar) throws IOException {
        ZipFile zipFile;
        kotlin.jvm.internal.l.f(destDirectory, "destDirectory");
        if (str == null || str.length() == 0) {
            throw new IOException("Path is empty");
        }
        File file = new File(str);
        if (!file.exists()) {
            throw new IOException("File does not exist");
        }
        File file2 = new File(destDirectory);
        if (!file2.exists()) {
            file2.mkdirs();
        }
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile2 = null;
        try {
            zipFile = new ZipFile(file);
        } catch (Throwable th) {
            th = th;
        }
        try {
            Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
            while (enumerationEntries.hasMoreElements()) {
                ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                String str2 = destDirectory + File.separator + zipEntryNextElement.getName();
                if (aVar == null || aVar.matches(str2)) {
                    validateFilename(str2, destDirectory);
                    if (zipEntryNextElement.isDirectory()) {
                        File file3 = new File(str2);
                        if (!file3.exists()) {
                            file3.mkdirs();
                        }
                    } else {
                        InputStream inputStream = zipFile.getInputStream(zipEntryNextElement);
                        kotlin.jvm.internal.l.e(inputStream, "zipFile.getInputStream(entry)");
                        extractFile(inputStream, str2);
                        arrayList.add(new File(str2));
                    }
                }
            }
            try {
                zipFile.close();
            } catch (IOException unused) {
            }
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            zipFile2 = zipFile;
            if (zipFile2 != null) {
                try {
                    zipFile2.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }
}
