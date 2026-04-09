package X2;

import N2.u;
import java.io.File;
import t4.C5606d;

/* compiled from: FileResource.java */
/* loaded from: classes.dex */
public final class b implements u<File> {

    /* renamed from: b, reason: collision with root package name */
    public final File f13558b;

    public b(File file) {
        C5606d.l(file, "Argument must not be null");
        this.f13558b = file;
    }

    @Override // N2.u
    public final Class<File> c() {
        return this.f13558b.getClass();
    }

    @Override // N2.u
    public final File get() {
        return this.f13558b;
    }

    @Override // N2.u
    public final int getSize() {
        return 1;
    }

    @Override // N2.u
    public final void a() {
    }
}
