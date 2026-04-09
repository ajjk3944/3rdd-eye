package ee;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements h, ma.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23400a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23401b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f23402c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f23403d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f23404e;

    public /* synthetic */ c(com.google.android.gms.internal.consent_sdk.d dVar, Iterable iterable, ea.i iVar, long j) {
        this.f23400a = 2;
        this.f23401b = dVar;
        this.f23404e = iterable;
        this.f23403d = iVar;
        this.f23402c = j;
    }

    @Override // ee.h
    public ScheduledFuture a(o7.c cVar) {
        switch (this.f23400a) {
            case 0:
                g gVar = (g) this.f23401b;
                Runnable runnable = (Runnable) this.f23404e;
                return gVar.f23420b.schedule(new e(gVar, runnable, cVar, 1), this.f23402c, (TimeUnit) this.f23403d);
            default:
                g gVar2 = (g) this.f23401b;
                Callable callable = (Callable) this.f23404e;
                return gVar2.f23420b.schedule(new f(gVar2, callable, cVar, 0), this.f23402c, (TimeUnit) this.f23403d);
        }
    }

    @Override // ma.b
    public Object execute() {
        com.google.android.gms.internal.consent_sdk.d dVar = (com.google.android.gms.internal.consent_sdk.d) this.f23401b;
        Iterable iterable = (Iterable) this.f23404e;
        ea.i iVar = (ea.i) this.f23403d;
        la.h hVar = (la.h) ((la.d) dVar.f19297c);
        hVar.getClass();
        if (iterable.iterator().hasNext()) {
            String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + la.h.w(iterable);
            SQLiteDatabase sQLiteDatabaseC = hVar.c();
            sQLiteDatabaseC.beginTransaction();
            try {
                sQLiteDatabaseC.compileStatement(str).execute();
                Cursor cursorRawQuery = sQLiteDatabaseC.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (cursorRawQuery.moveToNext()) {
                    try {
                        hVar.p(cursorRawQuery.getInt(0), ha.c.MAX_RETRIES_REACHED, cursorRawQuery.getString(1));
                    } catch (Throwable th2) {
                        cursorRawQuery.close();
                        throw th2;
                    }
                }
                cursorRawQuery.close();
                sQLiteDatabaseC.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                sQLiteDatabaseC.setTransactionSuccessful();
            } finally {
                sQLiteDatabaseC.endTransaction();
            }
        }
        hVar.g(new la.e(((na.a) dVar.g).i() + this.f23402c, iVar));
        return null;
    }

    public /* synthetic */ c(g gVar, Object obj, long j, TimeUnit timeUnit, int i4) {
        this.f23400a = i4;
        this.f23401b = gVar;
        this.f23404e = obj;
        this.f23402c = j;
        this.f23403d = timeUnit;
    }
}
