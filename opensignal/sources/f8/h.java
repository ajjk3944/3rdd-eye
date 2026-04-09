package f8;

import android.webkit.MimeTypeMap;
import c8.s;
import cv.w;
import java.io.File;

/* loaded from: classes.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    public final File f8684a;

    public h(File file) {
        this.f8684a = file;
    }

    @Override // f8.g
    public final Object a(pq.c cVar) {
        String str = w.f6742d;
        File file = this.f8684a;
        s sVar = new s(cg.e.r(file), cv.l.f6722a, null, null);
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        String name = file.getName();
        br.l.d(name, "getName(...)");
        return new m(sVar, singleton.getMimeTypeFromExtension(tt.l.T0('.', name, "")), c8.h.DISK);
    }
}
