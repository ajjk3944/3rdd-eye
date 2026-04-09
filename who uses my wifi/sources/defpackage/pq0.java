package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Looper;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class pq0 {
    public volatile lx a;
    public Executor b;
    public kz0 c;
    public final o30 d;
    public boolean e;
    public boolean f;
    public List g;
    public final ReentrantReadWriteLock h = new ReentrantReadWriteLock();
    public final ThreadLocal i = new ThreadLocal();

    public pq0() {
        new ConcurrentHashMap();
        this.d = d();
    }

    public final void a() {
        if (!this.e && Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void b() {
        if (!((SQLiteDatabase) this.c.j().g).inTransaction() && this.i.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public final void c() {
        a();
        lx lxVarJ = this.c.j();
        this.d.c(lxVarJ);
        lxVarJ.a();
    }

    public abstract o30 d();

    public abstract kz0 e(qm qmVar);

    public final void f() {
        this.c.j().k();
        if (((SQLiteDatabase) this.c.j().g).inTransaction()) {
            return;
        }
        o30 o30Var = this.d;
        if (o30Var.d.compareAndSet(false, true)) {
            o30Var.c.b.execute(o30Var.i);
        }
    }

    public final Cursor g(lz0 lz0Var) {
        a();
        b();
        return this.c.j().o(lz0Var);
    }

    public final void h() {
        this.c.j().q();
    }
}
