package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.text.TextUtils;
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
import o4.AbstractC2763b;

/* loaded from: classes.dex */
public class uym {

    /* renamed from: com.bytedance.sdk.component.utils.uym$1, reason: invalid class name */
    public static class AnonymousClass1 implements Comparator<File> {
        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(File file, File file2) {
            throw null;
        }
    }

    public static final class emc implements Comparator<File> {
        private emc() {
        }

        private int emc(long j6, long j7) {
            if (j6 < j7) {
                return -1;
            }
            return j6 == j7 ? 0 : 1;
        }

        public /* synthetic */ emc(AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // java.util.Comparator
        /* renamed from: emc, reason: merged with bridge method [inline-methods] */
        public int compare(File file, File file2) {
            return emc(file.lastModified(), file2.lastModified());
        }
    }

    private static void bw(File file) throws IOException {
        RandomAccessFile randomAccessFile;
        long length = file.length();
        if (length == 0) {
            ycc(file);
            return;
        }
        try {
            randomAccessFile = new RandomAccessFile(file, "rwd");
            long j6 = length - 1;
            try {
                randomAccessFile.seek(j6);
                byte b5 = randomAccessFile.readByte();
                randomAccessFile.seek(j6);
                randomAccessFile.write(b5);
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

    public static byte[] dg(File file) {
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

    public static File emc(Context context, boolean z6, String str, String str2) {
        String strYpw = ypw(context);
        if (z6) {
            str = emc(context) + "-" + str;
        }
        if (strYpw != null) {
            String str3 = File.separator;
            if (!strYpw.endsWith(str3)) {
                strYpw = AbstractC2763b.e(strYpw, str3);
            }
        }
        String strE = AbstractC2763b.e(strYpw, str);
        File file = new File(strE);
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(strE, str2);
    }

    public static void xq(File file) {
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
                        xq(file2);
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

    private static void ycc(File file) throws IOException {
        if (!file.delete() || !file.createNewFile()) {
            throw new IOException("Error recreate zero-size file ".concat(String.valueOf(file)));
        }
    }

    private static String ypw(Context context) {
        File cacheDir;
        if (context == null || (cacheDir = context.getCacheDir()) == null) {
            return null;
        }
        return cacheDir.getPath();
    }

    public static void ypw(File file) throws IOException {
        if (file.exists()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (file.setLastModified(jCurrentTimeMillis)) {
                return;
            }
            bw(file);
            if (file.lastModified() < jCurrentTimeMillis) {
                new Date(file.lastModified()).toString();
                file.getAbsolutePath();
            }
        }
    }

    public static File emc(Context context, boolean z6, String str) {
        String absolutePath = context.getCacheDir().getAbsolutePath();
        if (z6) {
            str = emc(context) + "-" + str;
        }
        if (absolutePath != null) {
            String str2 = File.separator;
            if (!absolutePath.endsWith(str2)) {
                absolutePath = AbstractC2763b.e(absolutePath, str2);
            }
        }
        File file = new File(AbstractC2763b.e(absolutePath, str));
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static List<File> emc(File file) {
        LinkedList linkedList = new LinkedList();
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return linkedList;
        }
        List<File> listAsList = Arrays.asList(fileArrListFiles);
        Collections.sort(listAsList, new emc(null));
        return listAsList;
    }

    public static String emc(Context context) {
        String strEmc = sra.emc(context);
        return (TextUtils.isEmpty(strEmc) || !strEmc.contains(":")) ? strEmc : strEmc.replace(":", "-");
    }
}
