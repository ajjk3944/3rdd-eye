package cv;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public class s extends l {
    @Override // cv.l
    public final d0 a(w wVar) {
        br.l.e(wVar, "file");
        File file = wVar.toFile();
        Logger logger = u.f6739a;
        return new b(xu.l.j(file, new FileOutputStream(file, true), true), new h0());
    }

    @Override // cv.l
    public void b(w wVar, w wVar2) throws IOException {
        br.l.e(wVar, "source");
        br.l.e(wVar2, "target");
        if (wVar.toFile().renameTo(wVar2.toFile())) {
            return;
        }
        throw new IOException("failed to move " + wVar + " to " + wVar2);
    }

    @Override // cv.l
    public final void c(w wVar) throws IOException {
        if (wVar.toFile().mkdir()) {
            return;
        }
        a3.e eVarI = i(wVar);
        if (eVarI == null || !eVarI.f44c) {
            throw new IOException("failed to create directory: " + wVar);
        }
    }

    @Override // cv.l
    public final void d(w wVar) throws IOException {
        br.l.e(wVar, "path");
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File file = wVar.toFile();
        if (file.delete() || !file.exists()) {
            return;
        }
        throw new IOException("failed to delete " + wVar);
    }

    @Override // cv.l
    public final List g(w wVar) throws IOException {
        File file = wVar.toFile();
        String[] list = file.list();
        if (list == null) {
            if (file.exists()) {
                throw new IOException("failed to list " + wVar);
            }
            throw new FileNotFoundException("no such file: " + wVar);
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            br.l.b(str);
            arrayList.add(wVar.d(str));
        }
        mq.s.b0(arrayList);
        return arrayList;
    }

    @Override // cv.l
    public a3.e i(w wVar) {
        br.l.e(wVar, "path");
        File file = wVar.toFile();
        boolean zIsFile = file.isFile();
        boolean zIsDirectory = file.isDirectory();
        long jLastModified = file.lastModified();
        long length = file.length();
        if (!zIsFile && !zIsDirectory && jLastModified == 0 && length == 0 && !file.exists()) {
            return null;
        }
        return new a3.e(zIsFile, zIsDirectory, null, Long.valueOf(length), null, Long.valueOf(jLastModified), null);
    }

    @Override // cv.l
    public final r j(w wVar) {
        return new r(new RandomAccessFile(wVar.toFile(), "r"));
    }

    @Override // cv.l
    public final d0 k(w wVar) {
        br.l.e(wVar, "file");
        File file = wVar.toFile();
        Logger logger = u.f6739a;
        return new b(xu.l.j(file, new FileOutputStream(file, false), false), new h0());
    }

    @Override // cv.l
    public final f0 l(w wVar) {
        br.l.e(wVar, "file");
        File file = wVar.toFile();
        Logger logger = u.f6739a;
        return new c(xu.d.j(file, new FileInputStream(file)), h0.f6707d);
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}
