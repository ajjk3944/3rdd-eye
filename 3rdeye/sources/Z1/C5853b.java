package z1;

import java.io.IOException;
import p9.p;
import y1.InterfaceC5791b;

/* compiled from: SupportSQLiteConnectionPool.android.kt */
/* renamed from: z1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5853b implements InterfaceC5791b {

    /* renamed from: b, reason: collision with root package name */
    public final A3.c f48411b;

    public C5853b(A3.c cVar) {
        this.f48411b = cVar;
    }

    @Override // y1.InterfaceC5791b
    public final Object Z(boolean z10, p pVar, h9.c cVar) {
        F1.c cVar2 = (F1.c) this.f48411b.f36c;
        cVar2.getDatabaseName();
        return pVar.invoke(new C5854c(new C5852a(cVar2.getWritableDatabase())), cVar);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        ((F1.c) this.f48411b.f36c).close();
    }
}
