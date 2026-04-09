package w1;

import b9.C1992A;
import b9.m;
import d9.C4284b;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import k8.F;
import w1.k;
import w1.l;
import z1.C5852a;

/* compiled from: RoomConnectionManager.kt */
/* renamed from: w1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5715a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f47193a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f47194b;

    /* compiled from: RoomConnectionManager.kt */
    /* renamed from: w1.a$a, reason: collision with other inner class name */
    public final class C0543a implements E1.b {

        /* renamed from: b, reason: collision with root package name */
        public final E1.b f47195b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i f47196c;

        public C0543a(i iVar, E1.b actual) {
            kotlin.jvm.internal.l.f(actual, "actual");
            this.f47196c = iVar;
            this.f47195b = actual;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x004c A[Catch: all -> 0x00a0, TRY_LEAVE, TryCatch #2 {all -> 0x00a0, blocks: (B:20:0x0048, B:22:0x004c, B:25:0x005b, B:29:0x0062, B:31:0x006c, B:33:0x0077, B:32:0x0072, B:27:0x005f, B:28:0x0061, B:45:0x0098, B:46:0x009f, B:24:0x0056), top: B:71:0x0048, outer: #4, inners: #6 }] */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0098 A[Catch: all -> 0x00a0, TRY_ENTER, TryCatch #2 {all -> 0x00a0, blocks: (B:20:0x0048, B:22:0x004c, B:25:0x005b, B:29:0x0062, B:31:0x006c, B:33:0x0077, B:32:0x0072, B:27:0x005f, B:28:0x0061, B:45:0x0098, B:46:0x009f, B:24:0x0056), top: B:71:0x0048, outer: #4, inners: #6 }] */
        @Override // E1.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final E1.a a(java.lang.String r9) {
            /*
                Method dump skipped, instructions count: 216
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: w1.AbstractC5715a.C0543a.a(java.lang.String):E1.a");
        }
    }

    /* compiled from: RoomConnectionManager.kt */
    /* renamed from: w1.a$b */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f47197a;

        static {
            int[] iArr = new int[k.c.values().length];
            try {
                iArr[k.c.TRUNCATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k.c.WRITE_AHEAD_LOGGING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f47197a = iArr;
        }
    }

    public static final void a(i iVar, E1.a aVar) throws Exception {
        Object objA;
        k.c cVar = iVar.f47225c.f47204g;
        k.c cVar2 = k.c.WRITE_AHEAD_LOGGING;
        if (cVar == cVar2) {
            A2.l.v(aVar, "PRAGMA journal_mode = WAL");
        } else {
            A2.l.v(aVar, "PRAGMA journal_mode = TRUNCATE");
        }
        if (iVar.d().f47204g == cVar2) {
            A2.l.v(aVar, "PRAGMA synchronous = NORMAL");
        } else {
            A2.l.v(aVar, "PRAGMA synchronous = FULL");
        }
        b(aVar);
        E1.c cVarK0 = aVar.K0("PRAGMA user_version");
        try {
            cVarK0.x();
            int i = (int) cVarK0.getLong(0);
            cVarK0.close();
            l lVar = iVar.f47226d;
            if (i != lVar.f47260a) {
                A2.l.v(aVar, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    if (i == 0) {
                        iVar.f(aVar);
                    } else {
                        iVar.g(aVar, i, lVar.f47260a);
                    }
                    A2.l.v(aVar, "PRAGMA user_version = " + lVar.f47260a);
                    objA = C1992A.f18074a;
                } catch (Throwable th) {
                    objA = b9.n.a(th);
                }
                if (!(objA instanceof m.a)) {
                    A2.l.v(aVar, "END TRANSACTION");
                }
                Throwable thA = b9.m.a(objA);
                if (thA != null) {
                    A2.l.v(aVar, "ROLLBACK TRANSACTION");
                    throw thA;
                }
            }
            iVar.h(aVar);
        } finally {
        }
    }

    public static void b(E1.a aVar) throws Exception {
        E1.c cVarK0 = aVar.K0("PRAGMA busy_timeout");
        try {
            cVarK0.x();
            long j4 = cVarK0.getLong(0);
            cVarK0.close();
            if (j4 < 3000) {
                A2.l.v(aVar, "PRAGMA busy_timeout = 3000");
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                F.d(cVarK0, th);
                throw th2;
            }
        }
    }

    public abstract List<k.b> c();

    public abstract C5716b d();

    public abstract l e();

    public final void f(E1.a connection) {
        kotlin.jvm.internal.l.f(connection, "connection");
        E1.c cVarK0 = connection.K0("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z10 = false;
            if (cVarK0.x()) {
                if (cVarK0.getLong(0) == 0) {
                    z10 = true;
                }
            }
            cVarK0.close();
            e().a(connection);
            if (!z10) {
                l.a aVarG = e().g(connection);
                if (!aVarG.f47263a) {
                    throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + aVarG.f47264b).toString());
                }
            }
            i(connection);
            e().c(connection);
            Iterator<T> it = c().iterator();
            while (it.hasNext()) {
                ((k.b) it.next()).getClass();
                if (connection instanceof C5852a) {
                    F1.b db = ((C5852a) connection).f48410b;
                    kotlin.jvm.internal.l.f(db, "db");
                }
            }
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(E1.a connection, int i, int i10) {
        kotlin.jvm.internal.l.f(connection, "connection");
        List<A1.a> listA = C1.e.a(d().f47201d, i, i10);
        if (listA != null) {
            e().f(connection);
            for (A1.a aVar : listA) {
                aVar.getClass();
                if (!(connection instanceof C5852a)) {
                    throw new b9.k("Migration functionality with a provided SQLiteDriver requires overriding the migrate(SQLiteConnection) function.");
                }
                aVar.a(((C5852a) connection).f48410b);
            }
            l.a aVarG = e().g(connection);
            if (!aVarG.f47263a) {
                throw new IllegalStateException(("Migration didn't properly handle: " + aVarG.f47264b).toString());
            }
            e().e(connection);
            i(connection);
            return;
        }
        if (C1.e.b(d(), i, i10)) {
            throw new IllegalStateException(("A migration from " + i + " to " + i10 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* functions.").toString());
        }
        if (d().f47215s) {
            E1.c cVarK0 = connection.K0("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
            try {
                C4284b c4284bU = E.u.u();
                while (cVarK0.x()) {
                    String strG0 = cVarK0.g0(0);
                    if (!y9.n.a0(strG0, "sqlite_", false) && !strG0.equals("android_metadata")) {
                        c4284bU.add(new b9.l(strG0, Boolean.valueOf(kotlin.jvm.internal.l.b(cVarK0.g0(1), "view"))));
                    }
                }
                C4284b c4284bM = E.u.m(c4284bU);
                cVarK0.close();
                ListIterator listIterator = c4284bM.listIterator(0);
                while (true) {
                    C4284b.C0442b c0442b = (C4284b.C0442b) listIterator;
                    if (!c0442b.hasNext()) {
                        break;
                    }
                    b9.l lVar = (b9.l) c0442b.next();
                    String str = (String) lVar.f18083b;
                    if (((Boolean) lVar.f18084c).booleanValue()) {
                        A2.l.v(connection, "DROP VIEW IF EXISTS " + str);
                    } else {
                        A2.l.v(connection, "DROP TABLE IF EXISTS " + str);
                    }
                }
            } finally {
            }
        } else {
            e().b(connection);
        }
        Iterator<T> it = c().iterator();
        while (it.hasNext()) {
            ((k.b) it.next()).getClass();
            if (connection instanceof C5852a) {
                F1.b db = ((C5852a) connection).f48410b;
                kotlin.jvm.internal.l.f(db, "db");
            }
        }
        e().a(connection);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(E1.a r10) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.AbstractC5715a.h(E1.a):void");
    }

    public final void i(E1.a aVar) {
        A2.l.v(aVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        A2.l.v(aVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + e().f47261b + "')");
    }
}
