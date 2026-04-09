package h8;

import java.io.File;
import l8.n;

/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f10300a;

    public a(boolean z10) {
        this.f10300a = z10;
    }

    @Override // h8.b
    public final String a(Object obj, n nVar) {
        File file = (File) obj;
        if (!this.f10300a) {
            return file.getPath();
        }
        return file.getPath() + ':' + file.lastModified();
    }
}
