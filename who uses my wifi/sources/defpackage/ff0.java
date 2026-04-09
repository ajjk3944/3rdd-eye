package defpackage;

import android.content.SharedPreferences;
import com.phuongpn.whousemywifi.networkscanner.global.BaseApplication;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ff0 implements Closeable {
    public final File f;
    public final long g;
    public final File h;
    public final RandomAccessFile i;
    public final FileChannel j;
    public final FileLock k;

    public ff0(File file, File file2) throws Throwable {
        file.getPath();
        file2.getPath();
        this.f = file;
        this.h = file2;
        this.g = c(file);
        File file3 = new File(file2, "MultiDex.lock");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.i = randomAccessFile;
        try {
            try {
                FileChannel channel = randomAccessFile.getChannel();
                this.j = channel;
                try {
                    file3.getPath();
                    this.k = channel.lock();
                    file3.getPath();
                } catch (IOException e) {
                    e = e;
                    try {
                        this.j.close();
                    } catch (IOException unused) {
                    }
                    throw e;
                } catch (Error e2) {
                    e = e2;
                    this.j.close();
                    throw e;
                } catch (RuntimeException e3) {
                    e = e3;
                    this.j.close();
                    throw e;
                }
            } catch (Error e4) {
                e = e4;
                try {
                    this.i.close();
                } catch (IOException unused2) {
                }
                throw e;
            } catch (RuntimeException e5) {
                e = e5;
                this.i.close();
                throw e;
            }
        } catch (IOException e6) {
            e = e6;
            this.i.close();
            throw e;
        }
    }

    public static void a(ZipFile zipFile, ZipEntry zipEntry, ef0 ef0Var, String str) throws IOException {
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File fileCreateTempFile = File.createTempFile("tmp-" + str, ".zip", ef0Var.getParentFile());
        fileCreateTempFile.getPath();
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(fileCreateTempFile)));
            try {
                ZipEntry zipEntry2 = new ZipEntry("classes.dex");
                zipEntry2.setTime(zipEntry.getTime());
                zipOutputStream.putNextEntry(zipEntry2);
                byte[] bArr = new byte[16384];
                for (int i = inputStream.read(bArr); i != -1; i = inputStream.read(bArr)) {
                    zipOutputStream.write(bArr, 0, i);
                }
                zipOutputStream.closeEntry();
                zipOutputStream.close();
                if (!fileCreateTempFile.setReadOnly()) {
                    throw new IOException("Failed to mark readonly \"" + fileCreateTempFile.getAbsolutePath() + "\" (tmp of \"" + ef0Var.getAbsolutePath() + "\")");
                }
                ef0Var.getPath();
                if (fileCreateTempFile.renameTo(ef0Var)) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                    fileCreateTempFile.delete();
                    return;
                }
                throw new IOException("Failed to rename \"" + fileCreateTempFile.getAbsolutePath() + "\" to \"" + ef0Var.getAbsolutePath() + "\"");
            } catch (Throwable th) {
                zipOutputStream.close();
                throw th;
            }
        } catch (Throwable th2) {
            try {
                inputStream.close();
            } catch (IOException unused2) {
            }
            fileCreateTempFile.delete();
            throw th2;
        }
    }

    public static long c(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            ib1 ib1VarE = m54.e(randomAccessFile);
            CRC32 crc32 = new CRC32();
            long j = ib1VarE.b;
            randomAccessFile.seek(ib1VarE.a);
            byte[] bArr = new byte[16384];
            int i = randomAccessFile.read(bArr, 0, (int) Math.min(16384L, j));
            while (i != -1) {
                crc32.update(bArr, 0, i);
                j -= i;
                if (j == 0) {
                    break;
                }
                i = randomAccessFile.read(bArr, 0, (int) Math.min(16384L, j));
            }
            long value = crc32.getValue();
            randomAccessFile.close();
            return value == -1 ? value - 1 : value;
        } catch (Throwable th) {
            randomAccessFile.close();
            throw th;
        }
    }

    public static void i(BaseApplication baseApplication, long j, long j2, ArrayList arrayList) {
        SharedPreferences.Editor editorEdit = baseApplication.getSharedPreferences("multidex.version", 4).edit();
        editorEdit.putLong("timestamp", j);
        editorEdit.putLong("crc", j2);
        editorEdit.putInt("dex.number", arrayList.size() + 1);
        int size = arrayList.size();
        int i = 2;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ef0 ef0Var = (ef0) obj;
            editorEdit.putLong(ex0.f("dex.crc.", i), ef0Var.f);
            editorEdit.putLong("dex.time." + i, ef0Var.lastModified());
            i++;
        }
        editorEdit.commit();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.k.release();
        this.j.close();
        this.i.close();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.ArrayList f(com.phuongpn.whousemywifi.networkscanner.global.BaseApplication r13, boolean r14) throws java.io.IOException {
        /*
            r12 = this;
            java.io.File r0 = r12.f
            r0.getPath()
            java.nio.channels.FileLock r1 = r12.k
            boolean r1 = r1.isValid()
            if (r1 == 0) goto L6e
            r1 = 1
            r3 = -1
            if (r14 != 0) goto L55
            java.lang.String r14 = "multidex.version"
            r5 = 4
            android.content.SharedPreferences r14 = r13.getSharedPreferences(r14, r5)
            java.lang.String r5 = "timestamp"
            long r5 = r14.getLong(r5, r3)
            long r7 = r0.lastModified()
            int r9 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r9 != 0) goto L29
            long r7 = r7 - r1
        L29:
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L55
            java.lang.String r5 = "crc"
            long r5 = r14.getLong(r5, r3)
            long r7 = r12.g
            int r14 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r14 == 0) goto L3a
            goto L55
        L3a:
            java.util.ArrayList r13 = r12.g(r13)     // Catch: java.io.IOException -> L3f
            goto L6a
        L3f:
            java.util.ArrayList r5 = r12.h()
            long r6 = r0.lastModified()
            int r14 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r14 != 0) goto L4c
            long r6 = r6 - r1
        L4c:
            r1 = r6
            long r3 = r12.g
            r0 = r13
            i(r0, r1, r3, r5)
            r13 = r5
            goto L6a
        L55:
            r6 = r13
            java.util.ArrayList r11 = r12.h()
            long r13 = r0.lastModified()
            int r0 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r0 != 0) goto L63
            long r13 = r13 - r1
        L63:
            r7 = r13
            long r9 = r12.g
            i(r6, r7, r9, r11)
            r13 = r11
        L6a:
            r13.size()
            return r13
        L6e:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "MultiDexExtractor was closed"
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ff0.f(com.phuongpn.whousemywifi.networkscanner.global.BaseApplication, boolean):java.util.ArrayList");
    }

    public final ArrayList g(BaseApplication baseApplication) throws IOException {
        String str = this.f.getName() + ".classes";
        SharedPreferences sharedPreferences = baseApplication.getSharedPreferences("multidex.version", 4);
        int i = sharedPreferences.getInt("dex.number", 1);
        ArrayList arrayList = new ArrayList(i - 1);
        for (int i2 = 2; i2 <= i; i2++) {
            ef0 ef0Var = new ef0(this.h, str + i2 + ".zip");
            if (!ef0Var.isFile()) {
                throw new IOException("Missing extracted secondary dex file '" + ef0Var.getPath() + "'");
            }
            ef0Var.f = c(ef0Var);
            long j = sharedPreferences.getLong("dex.crc." + i2, -1L);
            long j2 = sharedPreferences.getLong("dex.time." + i2, -1L);
            long jLastModified = ef0Var.lastModified();
            if (j2 != jLastModified || j != ef0Var.f) {
                StringBuilder sb = new StringBuilder("Invalid extracted dex: ");
                sb.append(ef0Var);
                sb.append(" (key \"\"), expected modification time: ");
                sb.append(j2);
                ex0.p(sb, ", modification time: ", jLastModified, ", expected crc: ");
                sb.append(j);
                sb.append(", file crc: ");
                sb.append(ef0Var.f);
                throw new IOException(sb.toString());
            }
            arrayList.add(ef0Var);
        }
        return arrayList;
    }

    public final ArrayList h() throws IOException {
        StringBuilder sb = new StringBuilder();
        File file = this.f;
        sb.append(file.getName());
        sb.append(".classes");
        String string = sb.toString();
        df0 df0Var = new df0();
        File file2 = this.h;
        File[] fileArrListFiles = file2.listFiles(df0Var);
        if (fileArrListFiles == null) {
            file2.getPath();
        } else {
            for (File file3 : fileArrListFiles) {
                file3.getPath();
                file3.length();
                if (file3.delete()) {
                    file3.getPath();
                } else {
                    file3.getPath();
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(file);
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("classes");
            int i = 2;
            sb2.append(2);
            sb2.append(".dex");
            ZipEntry entry = zipFile.getEntry(sb2.toString());
            while (entry != null) {
                ef0 ef0Var = new ef0(file2, string + i + ".zip");
                arrayList.add(ef0Var);
                ef0Var.toString();
                int i2 = 0;
                boolean z = false;
                while (i2 < 3 && !z) {
                    i2++;
                    a(zipFile, entry, ef0Var, string);
                    try {
                        ef0Var.f = c(ef0Var);
                        z = true;
                    } catch (IOException unused) {
                        ef0Var.getAbsolutePath();
                        z = false;
                    }
                    ef0Var.getAbsolutePath();
                    ef0Var.length();
                    if (!z) {
                        ef0Var.delete();
                        if (ef0Var.exists()) {
                            ef0Var.getPath();
                        }
                    }
                }
                if (!z) {
                    throw new IOException("Could not create zip file " + ef0Var.getAbsolutePath() + " for secondary dex (" + i + ")");
                }
                i++;
                entry = zipFile.getEntry("classes" + i + ".dex");
            }
            return arrayList;
        } finally {
            try {
                zipFile.close();
            } catch (IOException unused2) {
            }
        }
    }
}
