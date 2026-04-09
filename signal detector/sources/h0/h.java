package H0;

import C0.s;
import C0.y;
import android.content.Context;
import c5.C0410g;
import c5.C0411h;

/* loaded from: classes.dex */
public final class h implements G0.b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1745a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1746b;

    /* renamed from: c, reason: collision with root package name */
    public final s f1747c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1748d;

    /* renamed from: e, reason: collision with root package name */
    public final C0410g f1749e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1750f;

    public h(Context context, String str, s sVar, boolean z6) {
        q5.i.e(context, "context");
        q5.i.e(sVar, "callback");
        this.f1745a = context;
        this.f1746b = str;
        this.f1747c = sVar;
        this.f1748d = z6;
        this.f1749e = new C0410g(new y(1, this));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f1749e.f5926b != C0411h.f5928a) {
            ((g) this.f1749e.getValue()).close();
        }
    }

    @Override // G0.b
    public final String getDatabaseName() {
        return this.f1746b;
    }

    @Override // G0.b
    public final c i() {
        return ((g) this.f1749e.getValue()).a(true);
    }

    @Override // G0.b
    public final void setWriteAheadLoggingEnabled(boolean z6) {
        if (this.f1749e.f5926b != C0411h.f5928a) {
            g gVar = (g) this.f1749e.getValue();
            q5.i.e(gVar, "sQLiteOpenHelper");
            gVar.setWriteAheadLoggingEnabled(z6);
        }
        this.f1750f = z6;
    }
}
