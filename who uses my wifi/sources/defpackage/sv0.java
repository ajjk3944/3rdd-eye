package defpackage;

import android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class sv0 {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final pq0 b;
    public volatile px c;

    public sv0(pq0 pq0Var) {
        this.b = pq0Var;
    }

    public final px a() {
        this.b.a();
        if (!this.a.compareAndSet(false, true)) {
            String strB = b();
            pq0 pq0Var = this.b;
            pq0Var.a();
            pq0Var.b();
            return new px(((SQLiteDatabase) pq0Var.c.j().g).compileStatement(strB));
        }
        if (this.c == null) {
            String strB2 = b();
            pq0 pq0Var2 = this.b;
            pq0Var2.a();
            pq0Var2.b();
            this.c = new px(((SQLiteDatabase) pq0Var2.c.j().g).compileStatement(strB2));
        }
        return this.c;
    }

    public abstract String b();

    public final void c(px pxVar) {
        if (pxVar == this.c) {
            this.a.set(false);
        }
    }
}
