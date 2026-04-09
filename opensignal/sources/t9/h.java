package t9;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import e5.w;
import io.sentry.h4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public final class h implements d, u9.c, c {

    /* renamed from: y, reason: collision with root package name */
    public static final j9.c f22678y = new j9.c("proto");

    /* renamed from: a, reason: collision with root package name */
    public final j f22679a;

    /* renamed from: d, reason: collision with root package name */
    public final v9.a f22680d;

    /* renamed from: g, reason: collision with root package name */
    public final v9.a f22681g;

    /* renamed from: r, reason: collision with root package name */
    public final a f22682r;

    /* renamed from: x, reason: collision with root package name */
    public final kq.a f22683x;

    public h(v9.a aVar, v9.a aVar2, a aVar3, j jVar, kq.a aVar4) {
        this.f22679a = jVar;
        this.f22680d = aVar;
        this.f22681g = aVar2;
        this.f22682r = aVar3;
        this.f22683x = aVar4;
    }

    public static Object G(Cursor cursor, f fVar) {
        try {
            return fVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public static Long f(SQLiteDatabase sQLiteDatabase, m9.i iVar) {
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(iVar.f16360a, String.valueOf(w9.a.a(iVar.f16362c))));
        byte[] bArr = iVar.f16361b;
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

    public static String y(Iterable iterable) {
        StringBuilder sb2 = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb2.append(((b) it.next()).f22671a);
            if (it.hasNext()) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    public final SQLiteDatabase b() {
        j jVar = this.f22679a;
        Objects.requireNonNull(jVar);
        v9.a aVar = this.f22681g;
        long jE = aVar.e();
        while (true) {
            try {
                return jVar.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e4) {
                if (aVar.e() >= this.f22682r.f22668c + jE) {
                    throw new u9.a("Timed out while trying to open db.", e4);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f22679a.close();
    }

    public final Object h(f fVar) {
        SQLiteDatabase sQLiteDatabaseB = b();
        sQLiteDatabaseB.beginTransaction();
        try {
            Object objApply = fVar.apply(sQLiteDatabaseB);
            sQLiteDatabaseB.setTransactionSuccessful();
            return objApply;
        } finally {
            sQLiteDatabaseB.endTransaction();
        }
    }

    public final ArrayList i(SQLiteDatabase sQLiteDatabase, m9.i iVar, int i10) {
        ArrayList arrayList = new ArrayList();
        Long lF = f(sQLiteDatabase, iVar);
        if (lF == null) {
            return arrayList;
        }
        G(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"}, "context_id = ?", new String[]{lF.toString()}, null, null, null, String.valueOf(i10)), new h4(this, arrayList, iVar, 12));
        return arrayList;
    }

    public final void q(long j, p9.c cVar, String str) {
        h(new w(str, cVar, j, 4));
    }

    public final Object w(u9.b bVar) {
        SQLiteDatabase sQLiteDatabaseB = b();
        v9.a aVar = this.f22681g;
        long jE = aVar.e();
        while (true) {
            try {
                sQLiteDatabaseB.beginTransaction();
                try {
                    Object objG = bVar.g();
                    sQLiteDatabaseB.setTransactionSuccessful();
                    return objG;
                } finally {
                    sQLiteDatabaseB.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e4) {
                if (aVar.e() >= this.f22682r.f22668c + jE) {
                    throw new u9.a("Timed out while trying to acquire the lock.", e4);
                }
                SystemClock.sleep(50L);
            }
        }
    }
}
