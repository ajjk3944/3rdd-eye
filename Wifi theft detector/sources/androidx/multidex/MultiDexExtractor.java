package androidx.multidex;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;
import m1.b;

/* loaded from: classes.dex */
public final class MultiDexExtractor implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final File f3564a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3565b;

    /* renamed from: c, reason: collision with root package name */
    public final File f3566c;

    /* renamed from: d, reason: collision with root package name */
    public final RandomAccessFile f3567d;

    /* renamed from: e, reason: collision with root package name */
    public final FileChannel f3568e;

    /* renamed from: f, reason: collision with root package name */
    public final FileLock f3569f;

    public static class ExtractedDex extends File {
        public long crc;

        public ExtractedDex(File file, String str) {
            super(file, str);
            this.crc = -1L;
        }
    }

    public class a implements FileFilter {
        public a() {
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return !file.getName().equals("MultiDex.lock");
        }
    }

    public MultiDexExtractor(File file, File file2) throws Throwable {
        Log.i("MultiDex", "MultiDexExtractor(" + file.getPath() + ", " + file2.getPath() + ")");
        this.f3564a = file;
        this.f3566c = file2;
        this.f3565b = j(file);
        File file3 = new File(file2, "MultiDex.lock");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.f3567d = randomAccessFile;
        try {
            FileChannel channel = randomAccessFile.getChannel();
            this.f3568e = channel;
            try {
                Log.i("MultiDex", "Blocking on lock " + file3.getPath());
                this.f3569f = channel.lock();
                Log.i("MultiDex", file3.getPath() + " locked");
            } catch (IOException e10) {
                e = e10;
                e(this.f3568e);
                throw e;
            } catch (Error e11) {
                e = e11;
                e(this.f3568e);
                throw e;
            } catch (RuntimeException e12) {
                e = e12;
                e(this.f3568e);
                throw e;
            }
        } catch (IOException e13) {
            e = e13;
            e(this.f3567d);
            throw e;
        } catch (Error e14) {
            e = e14;
            e(this.f3567d);
            throw e;
        } catch (RuntimeException e15) {
            e = e15;
            e(this.f3567d);
            throw e;
        }
    }

    public static void e(Closeable closeable) throws IOException {
        try {
            closeable.close();
        } catch (IOException e10) {
            Log.w("MultiDex", "Failed to close resource", e10);
        }
    }

    public static void f(ZipFile zipFile, ZipEntry zipEntry, File file, String str) throws IOException {
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File fileCreateTempFile = File.createTempFile("tmp-" + str, ".zip", file.getParentFile());
        Log.i("MultiDex", "Extracting " + fileCreateTempFile.getPath());
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(fileCreateTempFile)));
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
                    throw new IOException("Failed to mark readonly \"" + fileCreateTempFile.getAbsolutePath() + "\" (tmp of \"" + file.getAbsolutePath() + "\")");
                }
                Log.i("MultiDex", "Renaming to " + file.getPath());
                if (fileCreateTempFile.renameTo(file)) {
                    e(inputStream);
                    fileCreateTempFile.delete();
                    return;
                }
                throw new IOException("Failed to rename \"" + fileCreateTempFile.getAbsolutePath() + "\" to \"" + file.getAbsolutePath() + "\"");
            } catch (Throwable th) {
                zipOutputStream.close();
                throw th;
            }
        } catch (Throwable th2) {
            e(inputStream);
            fileCreateTempFile.delete();
            throw th2;
        }
    }

    public static SharedPreferences g(Context context) {
        return context.getSharedPreferences("multidex.version", 4);
    }

    public static long h(File file) {
        long jLastModified = file.lastModified();
        return jLastModified == -1 ? jLastModified - 1 : jLastModified;
    }

    public static long j(File file) throws IOException {
        long jC = b.c(file);
        return jC == -1 ? jC - 1 : jC;
    }

    public static boolean k(Context context, File file, long j10, String str) {
        SharedPreferences sharedPreferencesG = g(context);
        if (sharedPreferencesG.getLong(str + CampaignEx.JSON_KEY_TIMESTAMP, -1L) != h(file)) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("crc");
        return sharedPreferencesG.getLong(sb.toString(), -1L) != j10;
    }

    public static void o(Context context, String str, long j10, long j11, List list) {
        SharedPreferences.Editor editorEdit = g(context).edit();
        editorEdit.putLong(str + CampaignEx.JSON_KEY_TIMESTAMP, j10);
        editorEdit.putLong(str + "crc", j11);
        editorEdit.putInt(str + "dex.number", list.size() + 1);
        Iterator it = list.iterator();
        int i10 = 2;
        while (it.hasNext()) {
            ExtractedDex extractedDex = (ExtractedDex) it.next();
            editorEdit.putLong(str + "dex.crc." + i10, extractedDex.crc);
            editorEdit.putLong(str + "dex.time." + i10, extractedDex.lastModified());
            i10++;
        }
        editorEdit.commit();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f3569f.release();
        this.f3568e.close();
        this.f3567d.close();
    }

    public final void d() {
        File[] fileArrListFiles = this.f3566c.listFiles(new a());
        if (fileArrListFiles == null) {
            Log.w("MultiDex", "Failed to list secondary dex dir content (" + this.f3566c.getPath() + ").");
            return;
        }
        for (File file : fileArrListFiles) {
            Log.i("MultiDex", "Trying to delete old file " + file.getPath() + " of size " + file.length());
            if (file.delete()) {
                Log.i("MultiDex", "Deleted old file " + file.getPath());
            } else {
                Log.w("MultiDex", "Failed to delete old file " + file.getPath());
            }
        }
    }

    public List l(Context context, String str, boolean z10) throws IOException {
        List listN;
        List listM;
        Log.i("MultiDex", "MultiDexExtractor.load(" + this.f3564a.getPath() + ", " + z10 + ", " + str + ")");
        if (!this.f3569f.isValid()) {
            throw new IllegalStateException("MultiDexExtractor was closed");
        }
        if (!z10 && !k(context, this.f3564a, this.f3565b, str)) {
            try {
                listM = m(context, str);
            } catch (IOException e10) {
                Log.w("MultiDex", "Failed to reload existing extracted secondary dex files, falling back to fresh extraction", e10);
                listN = n();
                o(context, str, h(this.f3564a), this.f3565b, listN);
            }
            Log.i("MultiDex", "load found " + listM.size() + " secondary dex files");
            return listM;
        }
        if (z10) {
            Log.i("MultiDex", "Forced extraction must be performed.");
        } else {
            Log.i("MultiDex", "Detected that extraction must be performed.");
        }
        listN = n();
        o(context, str, h(this.f3564a), this.f3565b, listN);
        listM = listN;
        Log.i("MultiDex", "load found " + listM.size() + " secondary dex files");
        return listM;
    }

    public final List m(Context context, String str) throws IOException {
        Log.i("MultiDex", "loading existing secondary dex files");
        String str2 = this.f3564a.getName() + ".classes";
        SharedPreferences sharedPreferencesG = g(context);
        int i10 = sharedPreferencesG.getInt(str + "dex.number", 1);
        ArrayList arrayList = new ArrayList(i10 + (-1));
        int i11 = 2;
        while (i11 <= i10) {
            ExtractedDex extractedDex = new ExtractedDex(this.f3566c, str2 + i11 + ".zip");
            if (!extractedDex.isFile()) {
                throw new IOException("Missing extracted secondary dex file '" + extractedDex.getPath() + "'");
            }
            extractedDex.crc = j(extractedDex);
            long j10 = sharedPreferencesG.getLong(str + "dex.crc." + i11, -1L);
            long j11 = sharedPreferencesG.getLong(str + "dex.time." + i11, -1L);
            long jLastModified = extractedDex.lastModified();
            if (j11 == jLastModified) {
                String str3 = str2;
                SharedPreferences sharedPreferences = sharedPreferencesG;
                if (j10 == extractedDex.crc) {
                    arrayList.add(extractedDex);
                    i11++;
                    sharedPreferencesG = sharedPreferences;
                    str2 = str3;
                }
            }
            throw new IOException("Invalid extracted dex: " + extractedDex + " (key \"" + str + "\"), expected modification time: " + j11 + ", modification time: " + jLastModified + ", expected crc: " + j10 + ", file crc: " + extractedDex.crc);
        }
        return arrayList;
    }

    public final List n() throws IOException {
        boolean z10;
        String str = this.f3564a.getName() + ".classes";
        d();
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(this.f3564a);
        try {
            int i10 = 2;
            ZipEntry entry = zipFile.getEntry("classes2.dex");
            while (entry != null) {
                ExtractedDex extractedDex = new ExtractedDex(this.f3566c, str + i10 + ".zip");
                arrayList.add(extractedDex);
                Log.i("MultiDex", "Extraction is needed for file " + extractedDex);
                int i11 = 0;
                boolean z11 = false;
                while (i11 < 3 && !z11) {
                    int i12 = i11 + 1;
                    f(zipFile, entry, extractedDex, str);
                    try {
                        extractedDex.crc = j(extractedDex);
                        z10 = true;
                    } catch (IOException e10) {
                        Log.w("MultiDex", "Failed to read crc from " + extractedDex.getAbsolutePath(), e10);
                        z10 = false;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Extraction ");
                    sb.append(z10 ? "succeeded" : "failed");
                    sb.append(" '");
                    sb.append(extractedDex.getAbsolutePath());
                    sb.append("': length ");
                    sb.append(extractedDex.length());
                    sb.append(" - crc: ");
                    sb.append(extractedDex.crc);
                    Log.i("MultiDex", sb.toString());
                    if (!z10) {
                        extractedDex.delete();
                        if (extractedDex.exists()) {
                            Log.w("MultiDex", "Failed to delete corrupted secondary dex '" + extractedDex.getPath() + "'");
                        }
                    }
                    z11 = z10;
                    i11 = i12;
                }
                if (!z11) {
                    throw new IOException("Could not create zip file " + extractedDex.getAbsolutePath() + " for secondary dex (" + i10 + ")");
                }
                i10++;
                entry = zipFile.getEntry("classes" + i10 + ".dex");
            }
            try {
                zipFile.close();
            } catch (IOException e11) {
                Log.w("MultiDex", "Failed to close resource", e11);
            }
            return arrayList;
        } finally {
        }
    }
}
