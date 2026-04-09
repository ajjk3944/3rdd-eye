package defpackage;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class o30 {
    public static final String[] j = {"UPDATE", "DELETE", "INSERT"};
    public final String[] b;
    public final WorkDatabase_Impl c;
    public volatile px f;
    public final m30 g;
    public final AtomicBoolean d = new AtomicBoolean(false);
    public volatile boolean e = false;
    public final os0 h = new os0();
    public final a9 i = new a9(9, this);
    public final HashMap a = new HashMap();

    public o30(WorkDatabase_Impl workDatabase_Impl, HashMap map, HashMap map2, String... strArr) {
        this.c = workDatabase_Impl;
        this.g = new m30(strArr.length);
        Collections.newSetFromMap(new IdentityHashMap());
        int length = strArr.length;
        this.b = new String[length];
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.a.put(lowerCase, Integer.valueOf(i));
            String str2 = (String) map.get(strArr[i]);
            if (str2 != null) {
                this.b[i] = str2.toLowerCase(locale);
            } else {
                this.b[i] = lowerCase;
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.US;
            String lowerCase2 = str3.toLowerCase(locale2);
            if (this.a.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(locale2);
                HashMap map3 = this.a;
                map3.put(lowerCase3, map3.get(lowerCase2));
            }
        }
    }

    public final boolean a() {
        lx lxVar = this.c.a;
        if (lxVar == null || !((SQLiteDatabase) lxVar.g).isOpen()) {
            return false;
        }
        if (!this.e) {
            this.c.c.j();
        }
        if (this.e) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    public final void b(lx lxVar, int i) throws SQLException {
        lxVar.m("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i + ", 0)");
        String str = this.b[i];
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < 3; i2++) {
            String str2 = j[i2];
            sb.setLength(0);
            sb.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            sb.append("`");
            sb.append("room_table_modification_trigger_");
            ex0.q(sb, str, "_", str2, "`");
            ex0.q(sb, " AFTER ", str2, " ON `", str);
            ex0.q(sb, "` BEGIN UPDATE ", "room_table_modification_log", " SET ", "invalidated");
            ex0.q(sb, " = 1", " WHERE ", "table_id", " = ");
            sb.append(i);
            sb.append(" AND ");
            sb.append("invalidated");
            sb.append(" = 0");
            sb.append("; END");
            lxVar.m(sb.toString());
        }
    }

    public final void c(lx lxVar) {
        if (((SQLiteDatabase) lxVar.g).inTransaction()) {
            return;
        }
        while (true) {
            try {
                ReentrantReadWriteLock.ReadLock lock = this.c.h.readLock();
                lock.lock();
                try {
                    int[] iArrA = this.g.a();
                    if (iArrA == null) {
                        lock.unlock();
                        return;
                    }
                    int length = iArrA.length;
                    lxVar.a();
                    for (int i = 0; i < length; i++) {
                        try {
                            int i2 = iArrA[i];
                            if (i2 == 1) {
                                b(lxVar, i);
                            } else if (i2 == 2) {
                                String str = this.b[i];
                                StringBuilder sb = new StringBuilder();
                                String[] strArr = j;
                                for (int i3 = 0; i3 < 3; i3++) {
                                    String str2 = strArr[i3];
                                    sb.setLength(0);
                                    sb.append("DROP TRIGGER IF EXISTS ");
                                    sb.append("`");
                                    sb.append("room_table_modification_trigger_");
                                    sb.append(str);
                                    sb.append("_");
                                    sb.append(str2);
                                    sb.append("`");
                                    lxVar.m(sb.toString());
                                }
                            }
                        } catch (Throwable th) {
                            lxVar.k();
                            throw th;
                        }
                    }
                    lxVar.q();
                    lxVar.k();
                    m30 m30Var = this.g;
                    synchronized (m30Var) {
                        m30Var.g = false;
                    }
                    lock.unlock();
                } catch (Throwable th2) {
                    lock.unlock();
                    throw th2;
                }
            } catch (SQLiteException | IllegalStateException e) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
                return;
            }
        }
    }
}
