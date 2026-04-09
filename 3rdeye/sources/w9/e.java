package W9;

import W9.d;
import b9.C1992A;
import ia.C;
import ia.k;
import java.io.IOException;

/* compiled from: DiskLruCache.kt */
/* loaded from: classes3.dex */
public final class e extends k {

    /* renamed from: g, reason: collision with root package name */
    public boolean f13408g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ d f13409h;
    public final /* synthetic */ d.b i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(C c10, d dVar, d.b bVar) {
        super(c10);
        this.f13409h = dVar;
        this.i = bVar;
    }

    @Override // ia.k, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        if (this.f13408g) {
            return;
        }
        this.f13408g = true;
        d dVar = this.f13409h;
        d.b bVar = this.i;
        synchronized (dVar) {
            try {
                int i = bVar.f13402h - 1;
                bVar.f13402h = i;
                if (i == 0 && bVar.f13400f) {
                    dVar.F(bVar);
                }
                C1992A c1992a = C1992A.f18074a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
