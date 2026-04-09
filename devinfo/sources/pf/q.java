package pf;

import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.FileAttribute;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class q {
    public static p4.z a(p4.w0 w0Var, m1.g gVar, cl.d dVar, mk.a aVar) {
        zj.s sVar = zj.s.f38317a;
        try {
            System.loadLibrary("datastore_shared_counter");
            return new p4.z(new p4.d0(w0Var, new c2.l0(24, dVar), aVar), cm.g.s(new al.p(sVar, (ck.c) null, 26)), gVar, dVar);
        } catch (SecurityException | UnsatisfiedLinkError unused) {
            return t6.i0.e(w0Var, gVar, sVar, dVar, aVar);
        }
    }

    public static void b(File file) throws IOException {
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            return;
        }
        if (parentFile.exists() && !parentFile.isDirectory() && nk.k.a(parentFile.getName(), "firebaseSessions") && !parentFile.delete()) {
            throw new IOException("Failed to delete conflicting file: " + parentFile);
        }
        if (parentFile.isDirectory()) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                Files.createDirectories(parentFile.toPath(), new FileAttribute[0]);
                return;
            } catch (Exception e2) {
                throw new IOException("Failed to create directory: " + parentFile, e2);
            }
        }
        if (parentFile.mkdirs() || parentFile.isDirectory()) {
            return;
        }
        throw new IOException("Failed to create directory: " + parentFile);
    }
}
