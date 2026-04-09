package ca;

import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.l;

/* compiled from: FileSystem.kt */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f18589a = new a();

    public final void a(File file) throws IOException {
        l.f(file, "file");
        if (file.delete() || !file.exists()) {
            return;
        }
        throw new IOException("failed to delete " + file);
    }

    public final void b(File directory) throws IOException {
        l.f(directory, "directory");
        File[] fileArrListFiles = directory.listFiles();
        if (fileArrListFiles == null) {
            throw new IOException("not a readable directory: " + directory);
        }
        for (File file : fileArrListFiles) {
            if (file.isDirectory()) {
                b(file);
            }
            if (!file.delete()) {
                throw new IOException("failed to delete " + file);
            }
        }
    }

    public final boolean c(File file) {
        l.f(file, "file");
        return file.exists();
    }

    public final void d(File from, File to) throws IOException {
        l.f(from, "from");
        l.f(to, "to");
        a(to);
        if (from.renameTo(to)) {
            return;
        }
        throw new IOException("failed to rename " + from + " to " + to);
    }

    public final String toString() {
        return "FileSystem.SYSTEM";
    }
}
