package d8;

import java.io.Closeable;
import tt.k;

/* loaded from: classes.dex */
public final class c implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final b f7160a;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7161d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f f7162g;

    public c(f fVar, b bVar) {
        this.f7162g = fVar;
        this.f7160a = bVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f7161d) {
            return;
        }
        this.f7161d = true;
        f fVar = this.f7162g;
        synchronized (fVar) {
            b bVar = this.f7160a;
            int i10 = bVar.f7158h - 1;
            bVar.f7158h = i10;
            if (i10 == 0 && bVar.f7156f) {
                k kVar = f.M;
                fVar.R(bVar);
            }
        }
    }
}
