package K0;

import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: AtomicFile.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final File f2937a;

    /* renamed from: b, reason: collision with root package name */
    public final File f2938b;

    /* renamed from: c, reason: collision with root package name */
    public final File f2939c;

    public a(File file) {
        this.f2937a = file;
        this.f2938b = new File(file.getPath() + ".new");
        this.f2939c = new File(file.getPath() + ".bak");
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

    public final void a(FileOutputStream fileOutputStream) throws IOException {
        boolean z10;
        if (fileOutputStream == null) {
            return;
        }
        try {
            fileOutputStream.getFD().sync();
            z10 = true;
        } catch (IOException unused) {
            z10 = false;
        }
        if (!z10) {
            Log.e("AtomicFile", "Failed to sync file output stream");
        }
        try {
            fileOutputStream.close();
        } catch (IOException e4) {
            Log.e("AtomicFile", "Failed to close file output stream", e4);
        }
        File file = this.f2938b;
        if (file.delete()) {
            return;
        }
        Log.e("AtomicFile", "Failed to delete new file " + file);
    }

    public final void b(FileOutputStream fileOutputStream) throws IOException {
        boolean z10;
        if (fileOutputStream == null) {
            return;
        }
        try {
            fileOutputStream.getFD().sync();
            z10 = true;
        } catch (IOException unused) {
            z10 = false;
        }
        if (!z10) {
            Log.e("AtomicFile", "Failed to sync file output stream");
        }
        try {
            fileOutputStream.close();
        } catch (IOException e4) {
            Log.e("AtomicFile", "Failed to close file output stream", e4);
        }
        c(this.f2938b, this.f2937a);
    }

    public final FileOutputStream d() throws IOException {
        File file = this.f2938b;
        File file2 = this.f2939c;
        if (file2.exists()) {
            c(file2, this.f2937a);
        }
        try {
            return new FileOutputStream(file);
        } catch (FileNotFoundException unused) {
            if (!file.getParentFile().mkdirs()) {
                throw new IOException("Failed to create directory for " + file);
            }
            try {
                return new FileOutputStream(file);
            } catch (FileNotFoundException e4) {
                throw new IOException("Failed to create new file " + file, e4);
            }
        }
    }
}
