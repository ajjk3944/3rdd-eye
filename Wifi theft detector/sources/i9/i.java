package i9;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import kotlin.io.FileAlreadyExistsException;
import kotlin.io.FileSystemException;
import kotlin.io.NoSuchFileException;
import kotlin.jvm.internal.p;
import s9.u;

/* loaded from: classes4.dex */
public abstract class i extends h {
    public static final File s(File file, File target, boolean z10, int i10) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        p.e(file, "<this>");
        p.e(target, "target");
        if (!file.exists()) {
            throw new NoSuchFileException(file, null, "The source file doesn't exist.", 2, null);
        }
        if (target.exists()) {
            if (!z10) {
                throw new FileAlreadyExistsException(file, target, "The destination file already exists.");
            }
            if (!target.delete()) {
                throw new FileAlreadyExistsException(file, target, "Tried to overwrite the destination, but failed to delete it.");
            }
        }
        if (file.isDirectory()) {
            if (target.mkdirs()) {
                return target;
            }
            throw new FileSystemException(file, target, "Failed to create target directory.");
        }
        File parentFile = target.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(target);
            try {
                a.a(fileInputStream, fileOutputStream, i10);
                b.a(fileOutputStream, null);
                b.a(fileInputStream, null);
                return target;
            } finally {
            }
        } finally {
        }
    }

    public static /* synthetic */ File t(File file, File file2, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 8192;
        }
        return s(file, file2, z10, i10);
    }

    public static final File u(File file, File relative) {
        p.e(file, "<this>");
        p.e(relative, "relative");
        if (e.b(relative)) {
            return relative;
        }
        String string = file.toString();
        p.d(string, "toString(...)");
        if (string.length() != 0) {
            char c10 = File.separatorChar;
            if (!u.S(string, c10, false, 2, null)) {
                return new File(string + c10 + relative);
            }
        }
        return new File(string + relative);
    }

    public static File v(File file, String relative) {
        p.e(file, "<this>");
        p.e(relative, "relative");
        return u(file, new File(relative));
    }
}
