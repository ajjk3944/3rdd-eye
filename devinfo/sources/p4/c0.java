package p4;

import java.io.File;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c0 extends nk.l implements mk.c {

    /* renamed from: a, reason: collision with root package name */
    public static final c0 f31176a = new c0(1);

    @Override // mk.c
    public final Object invoke(Object obj) {
        File file = (File) obj;
        nk.k.e(file, "it");
        String absolutePath = file.getCanonicalFile().getAbsolutePath();
        nk.k.d(absolutePath, "file.canonicalFile.absolutePath");
        return new a1(absolutePath);
    }
}
