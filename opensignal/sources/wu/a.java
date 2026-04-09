package wu;

import br.l;
import cv.b;
import cv.h0;
import cv.u;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f24680a = new a();

    public final void a(File file) {
        l.e(file, "file");
        if (file.delete() || !file.exists()) {
            return;
        }
        throw new IOException("failed to delete " + file);
    }

    public final void b(File file) throws IOException {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            throw new IOException("not a readable directory: " + file);
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                b(file2);
            }
            if (!file2.delete()) {
                throw new IOException("failed to delete " + file2);
            }
        }
    }

    public final boolean c(File file) {
        l.e(file, "file");
        return file.exists();
    }

    public final void d(File file, File file2) throws IOException {
        l.e(file, "from");
        l.e(file2, "to");
        a(file2);
        if (file.renameTo(file2)) {
            return;
        }
        throw new IOException("failed to rename " + file + " to " + file2);
    }

    public final b e(File file) {
        l.e(file, "file");
        try {
            Logger logger = u.f6739a;
            return new b(xu.l.j(file, new FileOutputStream(file, false), false), new h0());
        } catch (FileNotFoundException unused) {
            file.getParentFile().mkdirs();
            Logger logger2 = u.f6739a;
            return new b(xu.l.j(file, new FileOutputStream(file, false), false), new h0());
        }
    }

    public final String toString() {
        return "FileSystem.SYSTEM";
    }
}
