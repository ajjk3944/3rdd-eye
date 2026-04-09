package cf;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements h, u9.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3709a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3710d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f3711g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f3712r;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f3713x;

    public /* synthetic */ b(al.b bVar, Iterable iterable, m9.i iVar, long j) {
        this.f3709a = 2;
        this.f3710d = bVar;
        this.f3713x = iterable;
        this.f3712r = iVar;
        this.f3711g = j;
    }

    @Override // cf.h
    public ScheduledFuture a(a2.g gVar) {
        switch (this.f3709a) {
            case 0:
                g gVar2 = (g) this.f3710d;
                Runnable runnable = (Runnable) this.f3713x;
                return gVar2.f3732d.schedule(new e(gVar2, runnable, gVar, 1), this.f3711g, (TimeUnit) this.f3712r);
            default:
                g gVar3 = (g) this.f3710d;
                Callable callable = (Callable) this.f3713x;
                return gVar3.f3732d.schedule(new f(gVar3, callable, gVar, 0), this.f3711g, (TimeUnit) this.f3712r);
        }
    }

    @Override // u9.b
    public Object g() {
        al.b bVar = (al.b) this.f3710d;
        Iterable iterable = (Iterable) this.f3713x;
        m9.i iVar = (m9.i) this.f3712r;
        t9.h hVar = (t9.h) ((t9.d) bVar.f812d);
        hVar.getClass();
        if (iterable.iterator().hasNext()) {
            String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + t9.h.y(iterable);
            SQLiteDatabase sQLiteDatabaseB = hVar.b();
            sQLiteDatabaseB.beginTransaction();
            try {
                sQLiteDatabaseB.compileStatement(str).execute();
                Cursor cursorRawQuery = sQLiteDatabaseB.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (cursorRawQuery.moveToNext()) {
                    try {
                        hVar.q(cursorRawQuery.getInt(0), p9.c.MAX_RETRIES_REACHED, cursorRawQuery.getString(1));
                    } catch (Throwable th2) {
                        cursorRawQuery.close();
                        throw th2;
                    }
                }
                cursorRawQuery.close();
                sQLiteDatabaseB.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                sQLiteDatabaseB.setTransactionSuccessful();
            } finally {
                sQLiteDatabaseB.endTransaction();
            }
        }
        hVar.h(new io.sentry.instrumentation.file.c(((v9.a) bVar.f816h).e() + this.f3711g, iVar));
        return null;
    }

    public /* synthetic */ b(g gVar, Object obj, long j, TimeUnit timeUnit, int i10) {
        this.f3709a = i10;
        this.f3710d = gVar;
        this.f3713x = obj;
        this.f3711g = j;
        this.f3712r = timeUnit;
    }
}
