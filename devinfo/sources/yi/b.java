package yi;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import nk.k;
import zj.o;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final File f37625a;

    public b(String str) {
        k.e(str, "path");
        this.f37625a = new File(str);
    }

    @Override // yi.d
    public final boolean a() {
        return this.f37625a.exists();
    }

    @Override // yi.d
    public final String b() {
        return this.f37625a.getAbsolutePath();
    }

    @Override // yi.d
    public final boolean c() {
        return this.f37625a.isFile();
    }

    @Override // yi.d
    public final long d() {
        return this.f37625a.lastModified();
    }

    @Override // yi.d
    public final boolean e() {
        return this.f37625a.delete();
    }

    @Override // yi.d
    public final ArrayList f() {
        File file;
        File[] fileArrListFiles;
        if (!isDirectory() || (fileArrListFiles = (file = this.f37625a).listFiles()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        for (File file2 : fileArrListFiles) {
            if (!k.a(file2.getAbsolutePath(), file.getAbsolutePath())) {
                arrayList.add(file2);
            }
        }
        ArrayList arrayList2 = new ArrayList(o.T(arrayList, 10));
        int size = arrayList.size();
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            wb.e eVar = g.f37630a;
            String absolutePath = ((File) obj).getAbsolutePath();
            k.d(absolutePath, "getAbsolutePath(...)");
            arrayList2.add(eVar.h(absolutePath));
        }
        return arrayList2;
    }

    @Override // yi.d
    public final InputStream g() {
        File file = this.f37625a;
        if (file.exists()) {
            return new FileInputStream(file);
        }
        return null;
    }

    @Override // yi.d
    public final long getLength() {
        return this.f37625a.length();
    }

    @Override // yi.d
    public final String getName() {
        return this.f37625a.getName();
    }

    @Override // yi.d
    public final boolean isDirectory() {
        File file = this.f37625a;
        boolean zIsDirectory = file.isDirectory();
        return zIsDirectory == file.isFile() ? new File(file.getAbsolutePath()).isDirectory() : zIsDirectory;
    }
}
