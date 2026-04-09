package d4;

import java.io.File;

/* loaded from: classes.dex */
public final class f0 extends br.n implements ar.k {

    /* renamed from: d, reason: collision with root package name */
    public static final f0 f6804d = new f0(1);

    @Override // ar.k
    public final Object a(Object obj) {
        File file = (File) obj;
        br.l.e(file, "it");
        String absolutePath = file.getCanonicalFile().getAbsolutePath();
        br.l.d(absolutePath, "file.canonicalFile.absolutePath");
        return new e1(absolutePath);
    }
}
