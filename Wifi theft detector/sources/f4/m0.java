package f4;

import a4.a;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import g4.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.inject.Provider;
import x3.i;

/* loaded from: classes2.dex */
public class m0 implements f4.d, g4.a, f4.c {

    /* renamed from: f, reason: collision with root package name */
    public static final u3.b f21087f = u3.b.b("proto");

    /* renamed from: a, reason: collision with root package name */
    public final t0 f21088a;

    /* renamed from: b, reason: collision with root package name */
    public final h4.a f21089b;

    /* renamed from: c, reason: collision with root package name */
    public final h4.a f21090c;

    /* renamed from: d, reason: collision with root package name */
    public final e f21091d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider f21092e;

    public interface b {
        Object apply(Object obj);
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final String f21093a;

        /* renamed from: b, reason: collision with root package name */
        public final String f21094b;

        public c(String str, String str2) {
            this.f21093a = str;
            this.f21094b = str2;
        }
    }

    public interface d {
        Object a();
    }

    public m0(h4.a aVar, h4.a aVar2, e eVar, t0 t0Var, Provider provider) {
        this.f21088a = t0Var;
        this.f21089b = aVar;
        this.f21090c = aVar2;
        this.f21091d = eVar;
        this.f21092e = provider;
    }

    public static /* synthetic */ Long I(m0 m0Var, x3.i iVar, x3.o oVar, SQLiteDatabase sQLiteDatabase) {
        if (m0Var.p0()) {
            m0Var.j(1L, LogEventDropped.Reason.CACHE_FULL, iVar.j());
            return -1L;
        }
        long jG0 = m0Var.g0(sQLiteDatabase, oVar);
        int iE = m0Var.f21091d.e();
        byte[] bArrA = iVar.e().a();
        boolean z10 = bArrA.length <= iE;
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(jG0));
        contentValues.put("transport_name", iVar.j());
        contentValues.put("timestamp_ms", Long.valueOf(iVar.f()));
        contentValues.put("uptime_ms", Long.valueOf(iVar.k()));
        contentValues.put("payload_encoding", iVar.e().b().a());
        contentValues.put("code", iVar.d());
        contentValues.put("num_attempts", (Integer) 0);
        contentValues.put("inline", Boolean.valueOf(z10));
        contentValues.put("payload", z10 ? bArrA : new byte[0]);
        long jInsert = sQLiteDatabase.insert("events", null, contentValues);
        if (!z10) {
            int iCeil = (int) Math.ceil(bArrA.length / iE);
            for (int i10 = 1; i10 <= iCeil; i10++) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrA, (i10 - 1) * iE, Math.min(i10 * iE, bArrA.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(jInsert));
                contentValues2.put("sequence_num", Integer.valueOf(i10));
                contentValues2.put("bytes", bArrCopyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues2);
            }
        }
        for (Map.Entry entry : iVar.i().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(jInsert));
            contentValues3.put("name", (String) entry.getKey());
            contentValues3.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, (String) entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues3);
        }
        return Long.valueOf(jInsert);
    }

    public static /* synthetic */ Object P(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        return null;
    }

    public static /* synthetic */ Long U(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return null;
    }

    public static /* synthetic */ Object V(Throwable th) {
        throw new SynchronizationException("Timed out while trying to acquire the lock.", th);
    }

    public static /* synthetic */ Object W(String str, LogEventDropped.Reason reason, long j10, SQLiteDatabase sQLiteDatabase) throws SQLException {
        if (((Boolean) z0(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(reason.getNumber())}), new b() { // from class: f4.y
            @Override // f4.m0.b
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Cursor) obj).getCount() > 0);
            }
        })).booleanValue()) {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j10 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(reason.getNumber())});
            return null;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("log_source", str);
        contentValues.put("reason", Integer.valueOf(reason.getNumber()));
        contentValues.put("events_dropped_count", Long.valueOf(j10));
        sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        return null;
    }

    public static /* synthetic */ Object X(Map map, Cursor cursor) {
        while (true) {
            if (!cursor.moveToNext()) {
                return null;
            }
            long j10 = cursor.getLong(0);
            Set hashSet = (Set) map.get(Long.valueOf(j10));
            if (hashSet == null) {
                hashSet = new HashSet();
                map.put(Long.valueOf(j10), hashSet);
            }
            hashSet.add(new c(cursor.getString(1), cursor.getString(2)));
        }
    }

    public static /* synthetic */ Integer Y(final m0 m0Var, long j10, SQLiteDatabase sQLiteDatabase) {
        m0Var.getClass();
        String[] strArr = {String.valueOf(j10)};
        z0(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new b() { // from class: f4.s
            @Override // f4.m0.b
            public final Object apply(Object obj) {
                return m0.l(this.f21108a, (Cursor) obj);
            }
        });
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    public static /* synthetic */ Object Z(m0 m0Var, List list, x3.o oVar, Cursor cursor) {
        m0Var.getClass();
        while (cursor.moveToNext()) {
            long j10 = cursor.getLong(0);
            boolean z10 = cursor.getInt(7) != 0;
            i.a aVarK = x3.i.a().j(cursor.getString(1)).i(cursor.getLong(2)).k(cursor.getLong(3));
            if (z10) {
                aVarK.h(new x3.h(x0(cursor.getString(4)), cursor.getBlob(5)));
            } else {
                aVarK.h(new x3.h(x0(cursor.getString(4)), m0Var.v0(j10)));
            }
            if (!cursor.isNull(6)) {
                aVarK.g(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(k.a(j10, oVar, aVarK.d()));
        }
        return null;
    }

    public static /* synthetic */ Object a0(m0 m0Var, SQLiteDatabase sQLiteDatabase) {
        m0Var.getClass();
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + m0Var.f21089b.a()).execute();
        return null;
    }

    public static /* synthetic */ a4.e b(long j10, Cursor cursor) {
        cursor.moveToNext();
        return a4.e.c().c(cursor.getLong(0)).b(j10).a();
    }

    public static /* synthetic */ a4.a b0(final m0 m0Var, String str, final Map map, final a.C0001a c0001a, SQLiteDatabase sQLiteDatabase) {
        m0Var.getClass();
        return (a4.a) z0(sQLiteDatabase.rawQuery(str, new String[0]), new b() { // from class: f4.a0
            @Override // f4.m0.b
            public final Object apply(Object obj) {
                return m0.r(this.f21062a, map, c0001a, (Cursor) obj);
            }
        });
    }

    public static /* synthetic */ Long c0(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    public static /* synthetic */ a4.e d0(final long j10, SQLiteDatabase sQLiteDatabase) {
        return (a4.e) z0(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new b() { // from class: f4.d0
            @Override // f4.m0.b
            public final Object apply(Object obj) {
                return m0.b(j10, (Cursor) obj);
            }
        });
    }

    public static /* synthetic */ List e(m0 m0Var, x3.o oVar, SQLiteDatabase sQLiteDatabase) {
        List listR0 = m0Var.r0(sQLiteDatabase, oVar, m0Var.f21091d.d());
        for (Priority priority : Priority.values()) {
            if (priority != oVar.d()) {
                int iD = m0Var.f21091d.d() - listR0.size();
                if (iD <= 0) {
                    break;
                }
                listR0.addAll(m0Var.r0(sQLiteDatabase, oVar.f(priority), iD));
            }
        }
        return m0Var.q0(listR0, m0Var.s0(sQLiteDatabase, listR0));
    }

    public static /* synthetic */ List f(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(x3.o.a().b(cursor.getString(1)).d(i4.a.b(cursor.getInt(2))).c(t0(cursor.getString(3))).a());
        }
        return arrayList;
    }

    public static /* synthetic */ Object g(m0 m0Var, Cursor cursor) {
        m0Var.getClass();
        while (cursor.moveToNext()) {
            m0Var.j(cursor.getInt(0), LogEventDropped.Reason.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    public static /* synthetic */ SQLiteDatabase k(Throwable th) {
        throw new SynchronizationException("Timed out while trying to open db.", th);
    }

    public static /* synthetic */ Object l(m0 m0Var, Cursor cursor) {
        m0Var.getClass();
        while (cursor.moveToNext()) {
            m0Var.j(cursor.getInt(0), LogEventDropped.Reason.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    public static /* synthetic */ Object m(final m0 m0Var, String str, String str2, SQLiteDatabase sQLiteDatabase) {
        m0Var.getClass();
        sQLiteDatabase.compileStatement(str).execute();
        z0(sQLiteDatabase.rawQuery(str2, null), new b() { // from class: f4.v
            @Override // f4.m0.b
            public final Object apply(Object obj) {
                return m0.g(this.f21126a, (Cursor) obj);
            }
        });
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    public static /* synthetic */ Boolean n(m0 m0Var, x3.o oVar, SQLiteDatabase sQLiteDatabase) {
        Long lN0 = m0Var.n0(sQLiteDatabase, oVar);
        return lN0 == null ? Boolean.FALSE : (Boolean) z0(m0Var.i0().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lN0.toString()}), new b() { // from class: f4.u
            @Override // f4.m0.b
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            }
        });
    }

    public static /* synthetic */ Object o(long j10, x3.o oVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j10));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{oVar.b(), String.valueOf(i4.a.a(oVar.d()))}) < 1) {
            contentValues.put("backend_name", oVar.b());
            contentValues.put(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, Integer.valueOf(i4.a.a(oVar.d())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    public static /* synthetic */ byte[] p(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int length = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            length += blob.length;
        }
        byte[] bArr = new byte[length];
        int length2 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            byte[] bArr2 = (byte[]) arrayList.get(i10);
            System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
            length2 += bArr2.length;
        }
        return bArr;
    }

    public static /* synthetic */ List q(SQLiteDatabase sQLiteDatabase) {
        return (List) z0(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new b() { // from class: f4.k0
            @Override // f4.m0.b
            public final Object apply(Object obj) {
                return m0.f((Cursor) obj);
            }
        });
    }

    public static /* synthetic */ a4.a r(m0 m0Var, Map map, a.C0001a c0001a, Cursor cursor) {
        m0Var.getClass();
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            LogEventDropped.Reason reasonE0 = m0Var.e0(cursor.getInt(1));
            long j10 = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(LogEventDropped.c().c(reasonE0).b(j10).a());
        }
        m0Var.u0(c0001a, map);
        c0001a.e(m0Var.m0());
        c0001a.d(m0Var.j0());
        c0001a.c((String) m0Var.f21092e.get());
        return c0001a.b();
    }

    public static byte[] t0(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    public static u3.b x0(String str) {
        return str == null ? f21087f : u3.b.b(str);
    }

    public static String y0(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((k) it.next()).c());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static Object z0(Cursor cursor, b bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    @Override // f4.d
    public Iterable A() {
        return (Iterable) o0(new b() { // from class: f4.g0
            @Override // f4.m0.b
            public final Object apply(Object obj) {
                return m0.q((SQLiteDatabase) obj);
            }
        });
    }

    @Override // f4.d
    public Iterable D(final x3.o oVar) {
        return (Iterable) o0(new b() { // from class: f4.m
            @Override // f4.m0.b
            public final Object apply(Object obj) {
                return m0.e(this.f21085a, oVar, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // f4.d
    public k F(final x3.o oVar, final x3.i iVar) {
        b4.a.c("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", oVar.d(), iVar.j(), oVar.b());
        long jLongValue = ((Long) o0(new b() { // from class: f4.i0
            @Override // f4.m0.b
            public final Object apply(Object obj) {
                return m0.I(this.f21075a, iVar, oVar, (SQLiteDatabase) obj);
            }
        })).longValue();
        if (jLongValue < 1) {
            return null;
        }
        return k.a(jLongValue, oVar, iVar);
    }

    @Override // f4.d
    public void G(Iterable iterable) {
        if (iterable.iterator().hasNext()) {
            final String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + y0(iterable);
            final String str2 = "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name";
            o0(new b() { // from class: f4.l0
                @Override // f4.m0.b
                public final Object apply(Object obj) {
                    return m0.m(this.f21082a, str, str2, (SQLiteDatabase) obj);
                }
            });
        }
    }

    @Override // f4.d
    public boolean K(final x3.o oVar) {
        return ((Boolean) o0(new b() { // from class: f4.o
            @Override // f4.m0.b
            public final Object apply(Object obj) {
                return m0.n(this.f21100a, oVar, (SQLiteDatabase) obj);
            }
        })).booleanValue();
    }

    @Override // f4.d
    public long L(x3.o oVar) {
        return ((Long) z0(i0().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{oVar.b(), String.valueOf(i4.a.a(oVar.d()))}), new b() { // from class: f4.h0
            @Override // f4.m0.b
            public final Object apply(Object obj) {
                return m0.c0((Cursor) obj);
            }
        })).longValue();
    }

    @Override // f4.d
    public void Q(final x3.o oVar, final long j10) {
        o0(new b() { // from class: f4.p
            @Override // f4.m0.b
            public final Object apply(Object obj) {
                return m0.o(j10, oVar, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // g4.a
    public Object a(a.InterfaceC0402a interfaceC0402a) {
        SQLiteDatabase sQLiteDatabaseI0 = i0();
        f0(sQLiteDatabaseI0);
        try {
            Object objExecute = interfaceC0402a.execute();
            sQLiteDatabaseI0.setTransactionSuccessful();
            return objExecute;
        } finally {
            sQLiteDatabaseI0.endTransaction();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f21088a.close();
    }

    @Override // f4.c
    public void d() {
        o0(new b() { // from class: f4.q
            @Override // f4.m0.b
            public final Object apply(Object obj) {
                return m0.a0(this.f21104a, (SQLiteDatabase) obj);
            }
        });
    }

    public final LogEventDropped.Reason e0(int i10) {
        LogEventDropped.Reason reason = LogEventDropped.Reason.REASON_UNKNOWN;
        if (i10 == reason.getNumber()) {
            return reason;
        }
        LogEventDropped.Reason reason2 = LogEventDropped.Reason.MESSAGE_TOO_OLD;
        if (i10 == reason2.getNumber()) {
            return reason2;
        }
        LogEventDropped.Reason reason3 = LogEventDropped.Reason.CACHE_FULL;
        if (i10 == reason3.getNumber()) {
            return reason3;
        }
        LogEventDropped.Reason reason4 = LogEventDropped.Reason.PAYLOAD_TOO_BIG;
        if (i10 == reason4.getNumber()) {
            return reason4;
        }
        LogEventDropped.Reason reason5 = LogEventDropped.Reason.MAX_RETRIES_REACHED;
        if (i10 == reason5.getNumber()) {
            return reason5;
        }
        LogEventDropped.Reason reason6 = LogEventDropped.Reason.INVALID_PAYLOD;
        if (i10 == reason6.getNumber()) {
            return reason6;
        }
        LogEventDropped.Reason reason7 = LogEventDropped.Reason.SERVER_ERROR;
        if (i10 == reason7.getNumber()) {
            return reason7;
        }
        b4.a.b("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i10));
        return reason;
    }

    public final void f0(final SQLiteDatabase sQLiteDatabase) {
        w0(new d() { // from class: f4.l
            @Override // f4.m0.d
            public final Object a() {
                return m0.P(sQLiteDatabase);
            }
        }, new b() { // from class: f4.w
            @Override // f4.m0.b
            public final Object apply(Object obj) {
                return m0.V((Throwable) obj);
            }
        });
    }

    public final long g0(SQLiteDatabase sQLiteDatabase, x3.o oVar) {
        Long lN0 = n0(sQLiteDatabase, oVar);
        if (lN0 != null) {
            return lN0.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", oVar.b());
        contentValues.put(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, Integer.valueOf(i4.a.a(oVar.d())));
        contentValues.put("next_request_ms", (Integer) 0);
        if (oVar.c() != null) {
            contentValues.put("extras", Base64.encodeToString(oVar.c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    @Override // f4.c
    public a4.a h() {
        final a.C0001a c0001aE = a4.a.e();
        final HashMap map = new HashMap();
        final String str = "SELECT log_source, reason, events_dropped_count FROM log_event_dropped";
        return (a4.a) o0(new b() { // from class: f4.t
            @Override // f4.m0.b
            public final Object apply(Object obj) {
                return m0.b0(this.f21109a, str, map, c0001aE, (SQLiteDatabase) obj);
            }
        });
    }

    public long h0() {
        return k0() * l0();
    }

    public SQLiteDatabase i0() {
        final t0 t0Var = this.f21088a;
        Objects.requireNonNull(t0Var);
        return (SQLiteDatabase) w0(new d() { // from class: f4.e0
            @Override // f4.m0.d
            public final Object a() {
                return t0Var.getWritableDatabase();
            }
        }, new b() { // from class: f4.f0
            @Override // f4.m0.b
            public final Object apply(Object obj) {
                return m0.k((Throwable) obj);
            }
        });
    }

    @Override // f4.c
    public void j(final long j10, final LogEventDropped.Reason reason, final String str) {
        o0(new b() { // from class: f4.r
            @Override // f4.m0.b
            public final Object apply(Object obj) {
                return m0.W(str, reason, j10, (SQLiteDatabase) obj);
            }
        });
    }

    public final a4.b j0() {
        return a4.b.b().b(a4.d.c().b(h0()).c(e.f21070a.f()).a()).a();
    }

    public final long k0() {
        return i0().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    public final long l0() {
        return i0().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    public final a4.e m0() {
        final long jA = this.f21089b.a();
        return (a4.e) o0(new b() { // from class: f4.c0
            @Override // f4.m0.b
            public final Object apply(Object obj) {
                return m0.d0(jA, (SQLiteDatabase) obj);
            }
        });
    }

    public final Long n0(SQLiteDatabase sQLiteDatabase, x3.o oVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(oVar.b(), String.valueOf(i4.a.a(oVar.d()))));
        if (oVar.c() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(oVar.c(), 0));
        } else {
            sb.append(" and extras is null");
        }
        return (Long) z0(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new b() { // from class: f4.n
            @Override // f4.m0.b
            public final Object apply(Object obj) {
                return m0.U((Cursor) obj);
            }
        });
    }

    public Object o0(b bVar) {
        SQLiteDatabase sQLiteDatabaseI0 = i0();
        sQLiteDatabaseI0.beginTransaction();
        try {
            Object objApply = bVar.apply(sQLiteDatabaseI0);
            sQLiteDatabaseI0.setTransactionSuccessful();
            return objApply;
        } finally {
            sQLiteDatabaseI0.endTransaction();
        }
    }

    public final boolean p0() {
        return k0() * l0() >= this.f21091d.f();
    }

    public final List q0(List list, Map map) {
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            k kVar = (k) listIterator.next();
            if (map.containsKey(Long.valueOf(kVar.c()))) {
                i.a aVarL = kVar.b().l();
                for (c cVar : (Set) map.get(Long.valueOf(kVar.c()))) {
                    aVarL.c(cVar.f21093a, cVar.f21094b);
                }
                listIterator.set(k.a(kVar.c(), kVar.d(), aVarL.d()));
            }
        }
        return list;
    }

    public final List r0(SQLiteDatabase sQLiteDatabase, final x3.o oVar, int i10) {
        final ArrayList arrayList = new ArrayList();
        Long lN0 = n0(sQLiteDatabase, oVar);
        if (lN0 == null) {
            return arrayList;
        }
        z0(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{lN0.toString()}, null, null, null, String.valueOf(i10)), new b() { // from class: f4.x
            @Override // f4.m0.b
            public final Object apply(Object obj) {
                return m0.Z(this.f21127a, arrayList, oVar, (Cursor) obj);
            }
        });
        return arrayList;
    }

    public final Map s0(SQLiteDatabase sQLiteDatabase, List list) {
        final HashMap map = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i10 = 0; i10 < list.size(); i10++) {
            sb.append(((k) list.get(i10)).c());
            if (i10 < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        z0(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", AppMeasurementSdk.ConditionalUserProperty.VALUE}, sb.toString(), null, null, null, null), new b() { // from class: f4.z
            @Override // f4.m0.b
            public final Object apply(Object obj) {
                return m0.X(map, (Cursor) obj);
            }
        });
        return map;
    }

    public final void u0(a.C0001a c0001a, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            c0001a.a(a4.c.c().c((String) entry.getKey()).b((List) entry.getValue()).a());
        }
    }

    @Override // f4.d
    public int v() {
        final long jA = this.f21089b.a() - this.f21091d.c();
        return ((Integer) o0(new b() { // from class: f4.j0
            @Override // f4.m0.b
            public final Object apply(Object obj) {
                return m0.Y(this.f21079a, jA, (SQLiteDatabase) obj);
            }
        })).intValue();
    }

    public final byte[] v0(long j10) {
        return (byte[]) z0(i0().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j10)}, null, null, "sequence_num"), new b() { // from class: f4.b0
            @Override // f4.m0.b
            public final Object apply(Object obj) {
                return m0.p((Cursor) obj);
            }
        });
    }

    @Override // f4.d
    public void w(Iterable iterable) {
        if (iterable.iterator().hasNext()) {
            i0().compileStatement("DELETE FROM events WHERE _id in " + y0(iterable)).execute();
        }
    }

    public final Object w0(d dVar, b bVar) {
        long jA = this.f21090c.a();
        while (true) {
            try {
                return dVar.a();
            } catch (SQLiteDatabaseLockedException e10) {
                if (this.f21090c.a() >= this.f21091d.b() + jA) {
                    return bVar.apply(e10);
                }
                SystemClock.sleep(50L);
            }
        }
    }
}
