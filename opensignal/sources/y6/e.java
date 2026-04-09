package y6;

import android.content.SharedPreferences;
import io.sentry.android.core.e0;
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
import java.util.Iterator;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;
import xu.l;

/* loaded from: classes.dex */
public final class e implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final File f25873a;

    /* renamed from: d, reason: collision with root package name */
    public final long f25874d;

    /* renamed from: g, reason: collision with root package name */
    public final File f25875g;

    /* renamed from: r, reason: collision with root package name */
    public final RandomAccessFile f25876r;

    /* renamed from: x, reason: collision with root package name */
    public final FileChannel f25877x;

    /* renamed from: y, reason: collision with root package name */
    public final FileLock f25878y;

    public e(File file, File file2) throws Throwable {
        file.getPath();
        file2.getPath();
        this.f25873a = file;
        this.f25875g = file2;
        this.f25874d = h(file);
        File file3 = new File(file2, "MultiDex.lock");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.f25876r = randomAccessFile;
        try {
            FileChannel channel = randomAccessFile.getChannel();
            this.f25877x = channel;
            try {
                file3.getPath();
                this.f25878y = channel.lock();
                file3.getPath();
            } catch (IOException e4) {
                e = e4;
                b(this.f25877x);
                throw e;
            } catch (Error e10) {
                e = e10;
                b(this.f25877x);
                throw e;
            } catch (RuntimeException e11) {
                e = e11;
                b(this.f25877x);
                throw e;
            }
        } catch (IOException e12) {
            e = e12;
            b(this.f25876r);
            throw e;
        } catch (Error e13) {
            e = e13;
            b(this.f25876r);
            throw e;
        } catch (RuntimeException e14) {
            e = e14;
            b(this.f25876r);
            throw e;
        }
    }

    public static void b(Closeable closeable) throws IOException {
        try {
            closeable.close();
        } catch (IOException e4) {
            e0.q("MultiDex", "Failed to close resource", e4);
        }
    }

    public static void f(ZipFile zipFile, ZipEntry zipEntry, d dVar, String str) throws IOException {
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File fileCreateTempFile = File.createTempFile(c7.a.p("tmp-", str), ".zip", dVar.getParentFile());
        fileCreateTempFile.getPath();
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(l.k(new FileOutputStream(fileCreateTempFile), fileCreateTempFile)));
            try {
                ZipEntry zipEntry2 = new ZipEntry("classes.dex");
                zipEntry2.setTime(zipEntry.getTime());
                zipOutputStream.putNextEntry(zipEntry2);
                byte[] bArr = new byte[16384];
                for (int i10 = inputStream.read(bArr); i10 != -1; i10 = inputStream.read(bArr)) {
                    zipOutputStream.write(bArr, 0, i10);
                }
                zipOutputStream.closeEntry();
                zipOutputStream.close();
                if (!fileCreateTempFile.setReadOnly()) {
                    throw new IOException("Failed to mark readonly \"" + fileCreateTempFile.getAbsolutePath() + "\" (tmp of \"" + dVar.getAbsolutePath() + "\")");
                }
                dVar.getPath();
                if (fileCreateTempFile.renameTo(dVar)) {
                    b(inputStream);
                    fileCreateTempFile.delete();
                    return;
                }
                throw new IOException("Failed to rename \"" + fileCreateTempFile.getAbsolutePath() + "\" to \"" + dVar.getAbsolutePath() + "\"");
            } catch (Throwable th2) {
                zipOutputStream.close();
                throw th2;
            }
        } catch (Throwable th3) {
            b(inputStream);
            fileCreateTempFile.delete();
            throw th3;
        }
    }

    public static long h(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            dv.d dVarO = io.sentry.config.a.O(randomAccessFile);
            CRC32 crc32 = new CRC32();
            long j = dVarO.f7598b;
            randomAccessFile.seek(dVarO.f7597a);
            byte[] bArr = new byte[16384];
            int i10 = randomAccessFile.read(bArr, 0, (int) Math.min(16384L, j));
            while (i10 != -1) {
                crc32.update(bArr, 0, i10);
                j -= i10;
                if (j == 0) {
                    break;
                }
                i10 = randomAccessFile.read(bArr, 0, (int) Math.min(16384L, j));
            }
            long value = crc32.getValue();
            randomAccessFile.close();
            return value == -1 ? value - 1 : value;
        } catch (Throwable th2) {
            randomAccessFile.close();
            throw th2;
        }
    }

    public static void y(b bVar, long j, long j7, ArrayList arrayList) {
        SharedPreferences.Editor editorEdit = bVar.getSharedPreferences("multidex.version", 4).edit();
        editorEdit.putLong("timestamp", j);
        editorEdit.putLong("crc", j7);
        editorEdit.putInt("dex.number", arrayList.size() + 1);
        Iterator it = arrayList.iterator();
        int i10 = 2;
        while (it.hasNext()) {
            d dVar = (d) it.next();
            editorEdit.putLong(h0.b.h(i10, "dex.crc."), dVar.f25872a);
            editorEdit.putLong("dex.time." + i10, dVar.lastModified());
            i10++;
        }
        editorEdit.commit();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f25878y.release();
        this.f25877x.close();
        this.f25876r.close();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.ArrayList i(y6.b r14, boolean r15) throws java.lang.Throwable {
        /*
            r13 = this;
            java.io.File r1 = r13.f25873a
            r1.getPath()
            java.nio.channels.FileLock r0 = r13.f25878y
            boolean r0 = r0.isValid()
            if (r0 == 0) goto L78
            r2 = 1
            r4 = -1
            if (r15 != 0) goto L5e
            java.lang.String r15 = "multidex.version"
            r0 = 4
            android.content.SharedPreferences r15 = r14.getSharedPreferences(r15, r0)
            java.lang.String r0 = "timestamp"
            long r6 = r15.getLong(r0, r4)
            long r8 = r1.lastModified()
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 != 0) goto L29
            long r8 = r8 - r2
        L29:
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 != 0) goto L5e
            java.lang.String r0 = "crc"
            long r6 = r15.getLong(r0, r4)
            long r8 = r13.f25874d
            int r15 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r15 == 0) goto L3a
            goto L5e
        L3a:
            java.util.ArrayList r14 = r13.q(r14)     // Catch: java.io.IOException -> L3f
            goto L74
        L3f:
            r0 = move-exception
            r15 = r0
            java.lang.String r0 = "MultiDex"
            java.lang.String r6 = "Failed to reload existing extracted secondary dex files, falling back to fresh extraction"
            io.sentry.android.core.e0.q(r0, r6, r15)
            java.util.ArrayList r12 = r13.w()
            long r0 = r1.lastModified()
            int r15 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r15 != 0) goto L55
            long r0 = r0 - r2
        L55:
            r8 = r0
            long r10 = r13.f25874d
            r7 = r14
            y(r7, r8, r10, r12)
            r14 = r12
            goto L74
        L5e:
            r7 = r14
            java.util.ArrayList r6 = r13.w()
            long r14 = r1.lastModified()
            int r0 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r0 != 0) goto L6c
            long r14 = r14 - r2
        L6c:
            r2 = r14
            long r4 = r13.f25874d
            r1 = r7
            y(r1, r2, r4, r6)
            r14 = r6
        L74:
            r14.size()
            return r14
        L78:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "MultiDexExtractor was closed"
            r14.<init>(r15)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: y6.e.i(y6.b, boolean):java.util.ArrayList");
    }

    public final ArrayList q(b bVar) throws IOException {
        String str = this.f25873a.getName() + ".classes";
        SharedPreferences sharedPreferences = bVar.getSharedPreferences("multidex.version", 4);
        int i10 = sharedPreferences.getInt("dex.number", 1);
        ArrayList arrayList = new ArrayList(i10 - 1);
        for (int i11 = 2; i11 <= i10; i11++) {
            d dVar = new d(this.f25875g, str + i11 + ".zip");
            if (!dVar.isFile()) {
                throw new IOException("Missing extracted secondary dex file '" + dVar.getPath() + "'");
            }
            dVar.f25872a = h(dVar);
            long j = sharedPreferences.getLong("dex.crc." + i11, -1L);
            long j7 = sharedPreferences.getLong("dex.time." + i11, -1L);
            long jLastModified = dVar.lastModified();
            if (j7 != jLastModified || j != dVar.f25872a) {
                throw new IOException("Invalid extracted dex: " + dVar + " (key \"\"), expected modification time: " + j7 + ", modification time: " + jLastModified + ", expected crc: " + j + ", file crc: " + dVar.f25872a);
            }
            arrayList.add(dVar);
        }
        return arrayList;
    }

    public final ArrayList w() throws Throwable {
        Throwable th2;
        boolean z10;
        StringBuilder sb2 = new StringBuilder();
        File file = this.f25873a;
        sb2.append(file.getName());
        sb2.append(".classes");
        String string = sb2.toString();
        c cVar = new c();
        File file2 = this.f25875g;
        File[] fileArrListFiles = file2.listFiles(cVar);
        String str = "MultiDex";
        if (fileArrListFiles == null) {
            e0.p("MultiDex", "Failed to list secondary dex dir content (" + file2.getPath() + ").");
        } else {
            for (File file3 : fileArrListFiles) {
                file3.getPath();
                file3.length();
                if (file3.delete()) {
                    file3.getPath();
                } else {
                    e0.p("MultiDex", "Failed to delete old file " + file3.getPath());
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(file);
        try {
            int i10 = 2;
            ZipEntry entry = zipFile.getEntry("classes2.dex");
            while (entry != null) {
                d dVar = new d(file2, string + i10 + ".zip");
                arrayList.add(dVar);
                dVar.toString();
                int i11 = 0;
                boolean z11 = false;
                while (i11 < 3 && !z11) {
                    int i12 = i11 + 1;
                    f(zipFile, entry, dVar, string);
                    String str2 = str;
                    try {
                        dVar.f25872a = h(dVar);
                        z10 = true;
                        str = str2;
                    } catch (IOException e4) {
                        try {
                            str = str2;
                            e0.q(str, "Failed to read crc from " + dVar.getAbsolutePath(), e4);
                            z10 = false;
                        } catch (Throwable th3) {
                            th = th3;
                            str = str2;
                            th2 = th;
                            try {
                                zipFile.close();
                                throw th2;
                            } catch (IOException e10) {
                                e0.q(str, "Failed to close resource", e10);
                                throw th2;
                            }
                        }
                    } catch (Throwable th4) {
                        th2 = th4;
                        str = str2;
                        zipFile.close();
                        throw th2;
                    }
                    dVar.getAbsolutePath();
                    dVar.length();
                    if (!z10) {
                        dVar.delete();
                        if (dVar.exists()) {
                            e0.p(str, "Failed to delete corrupted secondary dex '" + dVar.getPath() + "'");
                        }
                    }
                    z11 = z10;
                    i11 = i12;
                }
                if (!z11) {
                    throw new IOException("Could not create zip file " + dVar.getAbsolutePath() + " for secondary dex (" + i10 + ")");
                }
                i10++;
                entry = zipFile.getEntry("classes" + i10 + ".dex");
            }
            try {
                zipFile.close();
            } catch (IOException e11) {
                e0.q(str, "Failed to close resource", e11);
            }
            return arrayList;
        } catch (Throwable th5) {
            th = th5;
        }
    }
}
