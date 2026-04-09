package qu;

import cv.n;
import java.io.IOException;

/* loaded from: classes.dex */
public final class c extends n {

    /* renamed from: d, reason: collision with root package name */
    public boolean f21068d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g f21069g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d f21070r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(cv.c cVar, g gVar, d dVar) {
        super(cVar);
        this.f21069g = gVar;
        this.f21070r = dVar;
    }

    @Override // cv.n, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        if (this.f21068d) {
            return;
        }
        this.f21068d = true;
        g gVar = this.f21069g;
        d dVar = this.f21070r;
        synchronized (gVar) {
            int i10 = dVar.f21078h - 1;
            dVar.f21078h = i10;
            if (i10 == 0 && dVar.f21076f) {
                gVar.Y(dVar);
            }
        }
    }
}
