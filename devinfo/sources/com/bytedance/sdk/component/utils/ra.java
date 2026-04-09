package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.text.TextUtils;
import d.h;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import r5.c;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ra {

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static final class ouw implements Comparator<File> {
        private ouw() {
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(File file, File file2) {
            long jLastModified = file.lastModified();
            long jLastModified2 = file2.lastModified();
            if (jLastModified < jLastModified2) {
                return -1;
            }
            return jLastModified == jLastModified2 ? 0 : 1;
        }

        public /* synthetic */ ouw(byte b10) {
            this();
        }
    }

    private static void fkw(File file) throws IOException {
        RandomAccessFile randomAccessFile;
        long length = file.length();
        if (length == 0) {
            le(file);
            return;
        }
        try {
            randomAccessFile = new RandomAccessFile(file, "rwd");
            long j = length - 1;
            try {
                randomAccessFile.seek(j);
                byte b10 = randomAccessFile.readByte();
                randomAccessFile.seek(j);
                randomAccessFile.write(b10);
                randomAccessFile.close();
            } catch (Throwable unused) {
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            }
        } catch (Throwable unused2) {
            randomAccessFile = null;
        }
    }

    private static void le(File file) throws IOException {
        if (!file.delete() || !file.createNewFile()) {
            throw new IOException("Error recreate zero-size file ".concat(String.valueOf(file)));
        }
    }

    public static void lh(File file) {
        if (file == null || !file.exists()) {
            return;
        }
        try {
            if (file.isFile()) {
                file.delete();
                return;
            }
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null && fileArrListFiles.length > 0) {
                for (File file2 : fileArrListFiles) {
                    if (file2.isDirectory()) {
                        lh(file2);
                    } else {
                        try {
                            file2.delete();
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
            file.delete();
        } catch (Throwable unused2) {
        }
    }

    public static File ouw(Context context, boolean z3, String str, String str2) {
        String strOuw = ouw(context);
        if (z3) {
            str = c.m(new StringBuilder(), ouw(), "-", str);
        }
        if (strOuw != null) {
            String str3 = File.separator;
            if (!strOuw.endsWith(str3)) {
                strOuw = h.s(strOuw, str3);
            }
        }
        String strS = h.s(strOuw, str);
        File file = new File(strS);
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(strS, str2);
    }

    public static void vt(File file) throws IOException {
        if (file.exists()) {
            ko.fkw("splashLoadAd", "update file modify time");
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (file.setLastModified(jCurrentTimeMillis)) {
                return;
            }
            fkw(file);
            if (file.lastModified() < jCurrentTimeMillis) {
                ko.yu("Files", "Last modified date " + new Date(file.lastModified()) + " is not set for file " + file.getAbsolutePath());
            }
        }
    }

    public static byte[] yu(File file) {
        FileInputStream fileInputStream;
        if (file != null && file.isFile() && file.exists() && file.canRead() && file.length() > 0) {
            try {
                long length = file.length();
                Long lValueOf = Long.valueOf(length);
                fileInputStream = new FileInputStream(file);
                try {
                    byte[] bArr = new byte[lValueOf.intValue()];
                    if (fileInputStream.read(bArr) == length) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable unused) {
                        }
                        return bArr;
                    }
                } catch (Throwable unused2) {
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    return null;
                }
            } catch (Throwable unused3) {
                fileInputStream = null;
            }
            try {
                fileInputStream.close();
            } catch (Throwable unused4) {
            }
        }
        return null;
    }

    public static File ouw(Context context, boolean z3, String str) {
        String absolutePath = context.getCacheDir().getAbsolutePath();
        if (z3) {
            str = c.m(new StringBuilder(), ouw(), "-", str);
        }
        if (absolutePath != null) {
            String str2 = File.separator;
            if (!absolutePath.endsWith(str2)) {
                absolutePath = h.s(absolutePath, str2);
            }
        }
        File file = new File(h.s(absolutePath, str));
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    private static String ouw(Context context) {
        File cacheDir;
        if (context == null || (cacheDir = context.getCacheDir()) == null) {
            return null;
        }
        return cacheDir.getPath();
    }

    public static List<File> ouw(File file) {
        LinkedList linkedList = new LinkedList();
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return linkedList;
        }
        List<File> listAsList = Arrays.asList(fileArrListFiles);
        Collections.sort(listAsList, new ouw((byte) 0));
        return listAsList;
    }

    private static String ouw() {
        String strOuw = zin.ouw();
        return (TextUtils.isEmpty(strOuw) || !strOuw.contains(":")) ? strOuw : strOuw.replace(":", "-");
    }
}
