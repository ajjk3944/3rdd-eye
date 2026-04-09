package r0;

import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SyncFailedException;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final File f24131a;

    /* renamed from: b, reason: collision with root package name */
    public final File f24132b;

    /* renamed from: c, reason: collision with root package name */
    public final File f24133c;

    public a(File file) {
        this.f24131a = file;
        this.f24132b = new File(file.getPath() + ".new");
        this.f24133c = new File(file.getPath() + ".bak");
    }

    public static void c(File file, File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            Log.e("AtomicFile", "Failed to delete file which is a directory " + file2);
        }
        if (file.renameTo(file2)) {
            return;
        }
        Log.e("AtomicFile", "Failed to rename " + file + " to " + file2);
    }

    public static boolean e(FileOutputStream fileOutputStream) throws SyncFailedException {
        try {
            fileOutputStream.getFD().sync();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public void a(FileOutputStream fileOutputStream) throws IOException {
        if (fileOutputStream == null) {
            return;
        }
        if (!e(fileOutputStream)) {
            Log.e("AtomicFile", "Failed to sync file output stream");
        }
        try {
            fileOutputStream.close();
        } catch (IOException e10) {
            Log.e("AtomicFile", "Failed to close file output stream", e10);
        }
        if (this.f24132b.delete()) {
            return;
        }
        Log.e("AtomicFile", "Failed to delete new file " + this.f24132b);
    }

    public void b(FileOutputStream fileOutputStream) throws IOException {
        if (fileOutputStream == null) {
            return;
        }
        if (!e(fileOutputStream)) {
            Log.e("AtomicFile", "Failed to sync file output stream");
        }
        try {
            fileOutputStream.close();
        } catch (IOException e10) {
            Log.e("AtomicFile", "Failed to close file output stream", e10);
        }
        c(this.f24132b, this.f24131a);
    }

    public FileOutputStream d() throws IOException {
        if (this.f24133c.exists()) {
            c(this.f24133c, this.f24131a);
        }
        try {
            return new FileOutputStream(this.f24132b);
        } catch (FileNotFoundException unused) {
            if (!this.f24132b.getParentFile().mkdirs()) {
                throw new IOException("Failed to create directory for " + this.f24132b);
            }
            try {
                return new FileOutputStream(this.f24132b);
            } catch (FileNotFoundException e10) {
                throw new IOException("Failed to create new file " + this.f24132b, e10);
            }
        }
    }
}
