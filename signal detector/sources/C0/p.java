package C0;

import android.database.Cursor;
import android.os.Looper;
import android.util.Log;
import j$.util.DesugarCollections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public volatile H0.c f1087a;

    /* renamed from: b, reason: collision with root package name */
    public Executor f1088b;

    /* renamed from: c, reason: collision with root package name */
    public G0.b f1089c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1091e;

    /* renamed from: f, reason: collision with root package name */
    public List f1092f;

    /* renamed from: j, reason: collision with root package name */
    public final LinkedHashMap f1095j;

    /* renamed from: d, reason: collision with root package name */
    public final l f1090d = d();

    /* renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f1093g = new LinkedHashMap();

    /* renamed from: h, reason: collision with root package name */
    public final ReentrantReadWriteLock f1094h = new ReentrantReadWriteLock();
    public final ThreadLocal i = new ThreadLocal();

    public p() {
        q5.i.d(DesugarCollections.synchronizedMap(new LinkedHashMap()), "synchronizedMap(mutableMapOf())");
        this.f1095j = new LinkedHashMap();
    }

    public static Object n(Class cls, G0.b bVar) {
        if (cls.isInstance(bVar)) {
            return bVar;
        }
        if (bVar instanceof c) {
            return n(cls, ((c) bVar).a());
        }
        return null;
    }

    public final void a() {
        if (!this.f1091e && Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void b() {
        if (!g().i().m() && this.i.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public final void c() {
        a();
        a();
        H0.c cVarI = g().i();
        this.f1090d.e(cVarI);
        if (cVarI.n()) {
            cVarI.b();
        } else {
            cVarI.a();
        }
    }

    public abstract l d();

    public abstract G0.b e(C0146b c0146b);

    public List f(Map map) {
        q5.i.e(map, "autoMigrationSpecs");
        return d5.s.f19824a;
    }

    public final G0.b g() {
        G0.b bVar = this.f1089c;
        if (bVar != null) {
            return bVar;
        }
        q5.i.g("internalOpenHelper");
        throw null;
    }

    public Set h() {
        return d5.u.f19826a;
    }

    public Map i() {
        return d5.t.f19825a;
    }

    public final void j() {
        g().i().e();
        if (g().i().m()) {
            return;
        }
        l lVar = this.f1090d;
        if (lVar.f1060f.compareAndSet(false, true)) {
            Executor executor = lVar.f1055a.f1088b;
            if (executor != null) {
                executor.execute(lVar.f1067n);
            } else {
                q5.i.g("internalQueryExecutor");
                throw null;
            }
        }
    }

    public final void k(H0.c cVar) {
        q5.i.e(cVar, "db");
        l lVar = this.f1090d;
        lVar.getClass();
        synchronized (lVar.f1066m) {
            if (lVar.f1061g) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            cVar.h("PRAGMA temp_store = MEMORY;");
            cVar.h("PRAGMA recursive_triggers='ON';");
            cVar.h("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            lVar.e(cVar);
            lVar.f1062h = cVar.d("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
            lVar.f1061g = true;
        }
    }

    public final Cursor l(G0.d dVar) {
        a();
        b();
        return g().i().o(dVar);
    }

    public final void m() {
        g().i().q();
    }
}
