package la;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class h implements d, ma.c, c {

    /* renamed from: f, reason: collision with root package name */
    public static final ba.b f28640f = new ba.b("proto");

    /* renamed from: a, reason: collision with root package name */
    public final j f28641a;

    /* renamed from: b, reason: collision with root package name */
    public final na.a f28642b;

    /* renamed from: c, reason: collision with root package name */
    public final na.a f28643c;

    /* renamed from: d, reason: collision with root package name */
    public final a f28644d;

    /* renamed from: e, reason: collision with root package name */
    public final xj.a f28645e;

    public h(na.a aVar, na.a aVar2, a aVar3, j jVar, xj.a aVar4) {
        this.f28641a = jVar;
        this.f28642b = aVar;
        this.f28643c = aVar2;
        this.f28644d = aVar3;
        this.f28645e = aVar4;
    }

    public static Long e(SQLiteDatabase sQLiteDatabase, ea.i iVar) {
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(iVar.f22494a, String.valueOf(oa.a.a(iVar.f22496c))));
        byte[] bArr = iVar.f22495b;
        if (bArr != null) {
            sb2.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb2.append(" and extras is null");
        }
        Cursor cursorQuery = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb2.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return !cursorQuery.moveToNext() ? null : Long.valueOf(cursorQuery.getLong(0));
        } finally {
            cursorQuery.close();
        }
    }

    public static String w(Iterable iterable) {
        StringBuilder sb2 = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb2.append(((b) it.next()).f28633a);
            if (it.hasNext()) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    public static Object y(Cursor cursor, f fVar) {
        try {
            return fVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public final SQLiteDatabase c() {
        j jVar = this.f28641a;
        Objects.requireNonNull(jVar);
        na.a aVar = this.f28643c;
        long jI = aVar.i();
        while (true) {
            try {
                return jVar.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e2) {
                if (aVar.i() >= this.f28644d.f28630c + jI) {
                    throw new ma.a("Timed out while trying to open db.", e2);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f28641a.close();
    }

    public final Object g(f fVar) {
        SQLiteDatabase sQLiteDatabaseC = c();
        sQLiteDatabaseC.beginTransaction();
        try {
            Object objApply = fVar.apply(sQLiteDatabaseC);
            sQLiteDatabaseC.setTransactionSuccessful();
            return objApply;
        } finally {
            sQLiteDatabaseC.endTransaction();
        }
    }

    public final ArrayList m(SQLiteDatabase sQLiteDatabase, ea.i iVar, int i4) {
        ArrayList arrayList = new ArrayList();
        Long lE = e(sQLiteDatabase, iVar);
        if (lE == null) {
            return arrayList;
        }
        y(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"}, "context_id = ?", new String[]{lE.toString()}, null, null, null, String.valueOf(i4)), new ah.d(this, arrayList, iVar, 11));
        return arrayList;
    }

    public final void p(long j, ha.c cVar, String str) {
        g(new ge.a(str, cVar, j));
    }

    public final Object v(ma.b bVar) {
        SQLiteDatabase sQLiteDatabaseC = c();
        na.a aVar = this.f28643c;
        long jI = aVar.i();
        while (true) {
            try {
                sQLiteDatabaseC.beginTransaction();
                try {
                    Object objExecute = bVar.execute();
                    sQLiteDatabaseC.setTransactionSuccessful();
                    return objExecute;
                } finally {
                    sQLiteDatabaseC.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e2) {
                if (aVar.i() >= this.f28644d.f28630c + jI) {
                    throw new ma.a("Timed out while trying to acquire the lock.", e2);
                }
                SystemClock.sleep(50L);
            }
        }
    }
}
