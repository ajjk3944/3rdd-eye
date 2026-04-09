package p7;

import android.content.Context;
import bc.f0;
import br.l;
import lq.q;

/* loaded from: classes.dex */
public final class i implements o7.b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f20329a;

    /* renamed from: d, reason: collision with root package name */
    public final String f20330d;

    /* renamed from: g, reason: collision with root package name */
    public final f0 f20331g;

    /* renamed from: r, reason: collision with root package name */
    public final q f20332r;

    /* renamed from: x, reason: collision with root package name */
    public boolean f20333x;

    public i(Context context, String str, f0 f0Var) {
        l.e(f0Var, "callback");
        this.f20329a = context;
        this.f20330d = str;
        this.f20331g = f0Var;
        this.f20332r = kc.f.F(new ht.g(29, this));
    }

    @Override // o7.b
    public final o7.a F() {
        return ((h) this.f20332r.getValue()).b(false);
    }

    @Override // o7.b
    public final o7.a I() {
        return ((h) this.f20332r.getValue()).b(true);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        q qVar = this.f20332r;
        if (qVar.a()) {
            ((h) qVar.getValue()).close();
        }
    }

    @Override // o7.b
    public final String getDatabaseName() {
        return this.f20330d;
    }

    @Override // o7.b
    public final void setWriteAheadLoggingEnabled(boolean z10) {
        q qVar = this.f20332r;
        if (qVar.a()) {
            h hVar = (h) qVar.getValue();
            l.e(hVar, "sQLiteOpenHelper");
            hVar.setWriteAheadLoggingEnabled(z10);
        }
        this.f20333x = z10;
    }
}
