package G2;

import G2.a;
import java.io.File;

/* loaded from: classes.dex */
public abstract class d implements a.InterfaceC0274a {

    /* renamed from: a, reason: collision with root package name */
    private final long f6828a;

    /* renamed from: b, reason: collision with root package name */
    private final a f6829b;

    public interface a {
        File a();
    }

    public d(a aVar, long j10) {
        this.f6828a = j10;
        this.f6829b = aVar;
    }

    @Override // G2.a.InterfaceC0274a
    public G2.a a() {
        File fileA = this.f6829b.a();
        if (fileA == null) {
            return null;
        }
        if (fileA.isDirectory() || fileA.mkdirs()) {
            return e.c(fileA, this.f6828a);
        }
        return null;
    }
}
