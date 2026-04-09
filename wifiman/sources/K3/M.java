package k3;

import a3.C3754b;
import a3.EnumC3757e;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import c3.AbstractC4208i;
import c3.AbstractC4215p;
import c3.C4207h;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import f3.C5515a;
import f3.C5516b;
import f3.C5517c;
import f3.C5518d;
import f3.C5519e;
import f3.C5520f;
import g3.AbstractC5861a;
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
import l3.InterfaceC6542a;
import m3.InterfaceC6756a;
import n3.AbstractC6868a;

/* loaded from: classes.dex */
public class M implements InterfaceC6370d, InterfaceC6542a, InterfaceC6369c {

    /* renamed from: f, reason: collision with root package name */
    private static final C3754b f51130f = C3754b.b("proto");

    /* renamed from: a, reason: collision with root package name */
    private final W f51131a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6756a f51132b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC6756a f51133c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC6371e f51134d;

    /* renamed from: e, reason: collision with root package name */
    private final Jg.a f51135e;

    interface b {
        Object apply(Object obj);
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        final String f51136a;

        /* renamed from: b, reason: collision with root package name */
        final String f51137b;

        private c(String str, String str2) {
            this.f51136a = str;
            this.f51137b = str2;
        }
    }

    interface d {
        Object a();
    }

    M(InterfaceC6756a interfaceC6756a, InterfaceC6756a interfaceC6756a2, AbstractC6371e abstractC6371e, W w10, Jg.a aVar) {
        this.f51131a = w10;
        this.f51132b = interfaceC6756a;
        this.f51133c = interfaceC6756a2;
        this.f51134d = abstractC6371e;
        this.f51135e = aVar;
    }

    private long A0(SQLiteDatabase sQLiteDatabase, AbstractC4215p abstractC4215p) {
        Long lH0 = H0(sQLiteDatabase, abstractC4215p);
        if (lH0 != null) {
            return lH0.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", abstractC4215p.b());
        contentValues.put("priority", Integer.valueOf(AbstractC6868a.a(abstractC4215p.d())));
        contentValues.put("next_request_ms", (Integer) 0);
        if (abstractC4215p.c() != null) {
            contentValues.put("extras", Base64.encodeToString(abstractC4215p.c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    private C5516b D0() {
        return C5516b.b().b(C5519e.c().b(B0()).c(AbstractC6371e.f51171a.f()).a()).a();
    }

    private long E0() {
        return C0().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    private long F0() {
        return C0().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    private C5520f G0() {
        final long jA = this.f51132b.a();
        return (C5520f) I0(new b() { // from class: k3.C
            @Override // k3.M.b
            public final Object apply(Object obj) {
                return M.S0(jA, (SQLiteDatabase) obj);
            }
        });
    }

    private Long H0(SQLiteDatabase sQLiteDatabase, AbstractC4215p abstractC4215p) {
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(abstractC4215p.b(), String.valueOf(AbstractC6868a.a(abstractC4215p.d()))));
        if (abstractC4215p.c() != null) {
            sb2.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(abstractC4215p.c(), 0));
        } else {
            sb2.append(" and extras is null");
        }
        return (Long) s1(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb2.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new b() { // from class: k3.x
            @Override // k3.M.b
            public final Object apply(Object obj) {
                return M.T0((Cursor) obj);
            }
        });
    }

    private boolean J0() {
        return E0() * F0() >= this.f51134d.f();
    }

    private List K0(List list, Map map) {
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            AbstractC6377k abstractC6377k = (AbstractC6377k) listIterator.next();
            if (map.containsKey(Long.valueOf(abstractC6377k.c()))) {
                AbstractC4208i.a aVarP = abstractC6377k.b().p();
                for (c cVar : (Set) map.get(Long.valueOf(abstractC6377k.c()))) {
                    aVarP.c(cVar.f51136a, cVar.f51137b);
                }
                listIterator.set(AbstractC6377k.a(abstractC6377k.c(), abstractC6377k.d(), aVarP.d()));
            }
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object L0(Cursor cursor) {
        while (cursor.moveToNext()) {
            a(cursor.getInt(0), C5517c.b.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer M0(long j10, SQLiteDatabase sQLiteDatabase) {
        String[] strArr = {String.valueOf(j10)};
        s1(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new b() { // from class: k3.r
            @Override // k3.M.b
            public final Object apply(Object obj) {
                return this.f51188a.L0((Cursor) obj);
            }
        });
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object N0(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object O0(Throwable th2) {
        throw new SynchronizationException("Timed out while trying to acquire the lock.", th2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ SQLiteDatabase P0(Throwable th2) {
        throw new SynchronizationException("Timed out while trying to open db.", th2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long Q0(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C5520f R0(long j10, Cursor cursor) {
        cursor.moveToNext();
        return C5520f.c().c(cursor.getLong(0)).b(j10).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C5520f S0(final long j10, SQLiteDatabase sQLiteDatabase) {
        return (C5520f) s1(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new b() { // from class: k3.D
            @Override // k3.M.b
            public final Object apply(Object obj) {
                return M.R0(j10, (Cursor) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long T0(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean U0(AbstractC4215p abstractC4215p, SQLiteDatabase sQLiteDatabase) {
        Long lH0 = H0(sQLiteDatabase, abstractC4215p);
        return lH0 == null ? Boolean.FALSE : (Boolean) s1(C0().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lH0.toString()}), new b() { // from class: k3.t
            @Override // k3.M.b
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List V0(SQLiteDatabase sQLiteDatabase) {
        return (List) s1(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new b() { // from class: k3.J
            @Override // k3.M.b
            public final Object apply(Object obj) {
                return M.W0((Cursor) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List W0(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(AbstractC4215p.a().b(cursor.getString(1)).d(AbstractC6868a.b(cursor.getInt(2))).c(m1(cursor.getString(3))).a());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List X0(AbstractC4215p abstractC4215p, SQLiteDatabase sQLiteDatabase) {
        List listK1 = k1(sQLiteDatabase, abstractC4215p, this.f51134d.d());
        for (EnumC3757e enumC3757e : EnumC3757e.values()) {
            if (enumC3757e != abstractC4215p.d()) {
                int iD = this.f51134d.d() - listK1.size();
                if (iD <= 0) {
                    break;
                }
                listK1.addAll(k1(sQLiteDatabase, abstractC4215p.f(enumC3757e), iD));
            }
        }
        return K0(listK1, l1(sQLiteDatabase, listK1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C5515a Y0(Map map, C5515a.C1758a c1758a, Cursor cursor) {
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            C5517c.b bVarY0 = y0(cursor.getInt(1));
            long j10 = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(C5517c.c().c(bVarY0).b(j10).a());
        }
        n1(c1758a, map);
        return c1758a.e(G0()).d(D0()).c((String) this.f51135e.get()).b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C5515a Z0(String str, final Map map, final C5515a.C1758a c1758a, SQLiteDatabase sQLiteDatabase) {
        return (C5515a) s1(sQLiteDatabase.rawQuery(str, new String[0]), new b() { // from class: k3.A
            @Override // k3.M.b
            public final Object apply(Object obj) {
                return this.f51117a.Y0(map, c1758a, (Cursor) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object a1(List list, AbstractC4215p abstractC4215p, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j10 = cursor.getLong(0);
            boolean z10 = cursor.getInt(7) != 0;
            AbstractC4208i.a aVarO = AbstractC4208i.a().n(cursor.getString(1)).i(cursor.getLong(2)).o(cursor.getLong(3));
            if (z10) {
                aVarO.h(new C4207h(q1(cursor.getString(4)), cursor.getBlob(5)));
            } else {
                aVarO.h(new C4207h(q1(cursor.getString(4)), o1(j10)));
            }
            if (!cursor.isNull(6)) {
                aVarO.g(Integer.valueOf(cursor.getInt(6)));
            }
            if (!cursor.isNull(8)) {
                aVarO.l(Integer.valueOf(cursor.getInt(8)));
            }
            if (!cursor.isNull(9)) {
                aVarO.m(cursor.getString(9));
            }
            if (!cursor.isNull(10)) {
                aVarO.j(cursor.getBlob(10));
            }
            if (!cursor.isNull(11)) {
                aVarO.k(cursor.getBlob(11));
            }
            list.add(AbstractC6377k.a(j10, abstractC4215p, aVarO.d()));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object b1(Map map, Cursor cursor) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Long c1(AbstractC4208i abstractC4208i, AbstractC4215p abstractC4215p, SQLiteDatabase sQLiteDatabase) {
        if (J0()) {
            a(1L, C5517c.b.CACHE_FULL, abstractC4208i.n());
            return -1L;
        }
        long jA0 = A0(sQLiteDatabase, abstractC4215p);
        int iE = this.f51134d.e();
        byte[] bArrA = abstractC4208i.e().a();
        boolean z10 = bArrA.length <= iE;
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(jA0));
        contentValues.put("transport_name", abstractC4208i.n());
        contentValues.put("timestamp_ms", Long.valueOf(abstractC4208i.f()));
        contentValues.put("uptime_ms", Long.valueOf(abstractC4208i.o()));
        contentValues.put("payload_encoding", abstractC4208i.e().b().a());
        contentValues.put("code", abstractC4208i.d());
        contentValues.put("num_attempts", (Integer) 0);
        contentValues.put("inline", Boolean.valueOf(z10));
        contentValues.put("payload", z10 ? bArrA : new byte[0]);
        contentValues.put("product_id", abstractC4208i.l());
        contentValues.put("pseudonymous_id", abstractC4208i.m());
        contentValues.put("experiment_ids_clear_blob", abstractC4208i.g());
        contentValues.put("experiment_ids_encrypted_blob", abstractC4208i.h());
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
        for (Map.Entry entry : abstractC4208i.k().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(jInsert));
            contentValues3.put("name", (String) entry.getKey());
            contentValues3.put("value", (String) entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues3);
        }
        return Long.valueOf(jInsert);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] d1(Cursor cursor) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object e1(Cursor cursor) {
        while (cursor.moveToNext()) {
            a(cursor.getInt(0), C5517c.b.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object f1(String str, String str2, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        s1(sQLiteDatabase.rawQuery(str2, null), new b() { // from class: k3.u
            @Override // k3.M.b
            public final Object apply(Object obj) {
                return this.f51193a.e1((Cursor) obj);
            }
        });
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean g1(Cursor cursor) {
        return Boolean.valueOf(cursor.getCount() > 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object h1(String str, C5517c.b bVar, long j10, SQLiteDatabase sQLiteDatabase) throws SQLException {
        if (((Boolean) s1(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.getNumber())}), new b() { // from class: k3.y
            @Override // k3.M.b
            public final Object apply(Object obj) {
                return M.g1((Cursor) obj);
            }
        })).booleanValue()) {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j10 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.getNumber())});
        } else {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(bVar.getNumber()));
            contentValues.put("events_dropped_count", Long.valueOf(j10));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object i1(long j10, AbstractC4215p abstractC4215p, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j10));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{abstractC4215p.b(), String.valueOf(AbstractC6868a.a(abstractC4215p.d()))}) < 1) {
            contentValues.put("backend_name", abstractC4215p.b());
            contentValues.put("priority", Integer.valueOf(AbstractC6868a.a(abstractC4215p.d())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object j1(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + this.f51132b.a()).execute();
        return null;
    }

    private List k1(SQLiteDatabase sQLiteDatabase, final AbstractC4215p abstractC4215p, int i10) {
        final ArrayList arrayList = new ArrayList();
        Long lH0 = H0(sQLiteDatabase, abstractC4215p);
        if (lH0 == null) {
            return arrayList;
        }
        s1(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"}, "context_id = ?", new String[]{lH0.toString()}, null, null, null, String.valueOf(i10)), new b() { // from class: k3.v
            @Override // k3.M.b
            public final Object apply(Object obj) {
                return this.f51194a.a1(arrayList, abstractC4215p, (Cursor) obj);
            }
        });
        return arrayList;
    }

    private Map l1(SQLiteDatabase sQLiteDatabase, List list) {
        final HashMap map = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i10 = 0; i10 < list.size(); i10++) {
            sb2.append(((AbstractC6377k) list.get(i10)).c());
            if (i10 < list.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        s1(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb2.toString(), null, null, null, null), new b() { // from class: k3.z
            @Override // k3.M.b
            public final Object apply(Object obj) {
                return M.b1(map, (Cursor) obj);
            }
        });
        return map;
    }

    private static byte[] m1(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    private void n1(C5515a.C1758a c1758a, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            c1758a.a(C5518d.c().c((String) entry.getKey()).b((List) entry.getValue()).a());
        }
    }

    private byte[] o1(long j10) {
        return (byte[]) s1(C0().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j10)}, null, null, "sequence_num"), new b() { // from class: k3.B
            @Override // k3.M.b
            public final Object apply(Object obj) {
                return M.d1((Cursor) obj);
            }
        });
    }

    private Object p1(d dVar, b bVar) {
        long jA = this.f51133c.a();
        while (true) {
            try {
                return dVar.a();
            } catch (SQLiteDatabaseLockedException e10) {
                if (this.f51133c.a() >= this.f51134d.b() + jA) {
                    return bVar.apply(e10);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    private static C3754b q1(String str) {
        return str == null ? f51130f : C3754b.b(str);
    }

    private static String r1(Iterable iterable) {
        StringBuilder sb2 = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb2.append(((AbstractC6377k) it.next()).c());
            if (it.hasNext()) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    static Object s1(Cursor cursor, b bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    private C5517c.b y0(int i10) {
        C5517c.b bVar = C5517c.b.REASON_UNKNOWN;
        if (i10 == bVar.getNumber()) {
            return bVar;
        }
        C5517c.b bVar2 = C5517c.b.MESSAGE_TOO_OLD;
        if (i10 == bVar2.getNumber()) {
            return bVar2;
        }
        C5517c.b bVar3 = C5517c.b.CACHE_FULL;
        if (i10 == bVar3.getNumber()) {
            return bVar3;
        }
        C5517c.b bVar4 = C5517c.b.PAYLOAD_TOO_BIG;
        if (i10 == bVar4.getNumber()) {
            return bVar4;
        }
        C5517c.b bVar5 = C5517c.b.MAX_RETRIES_REACHED;
        if (i10 == bVar5.getNumber()) {
            return bVar5;
        }
        C5517c.b bVar6 = C5517c.b.INVALID_PAYLOD;
        if (i10 == bVar6.getNumber()) {
            return bVar6;
        }
        C5517c.b bVar7 = C5517c.b.SERVER_ERROR;
        if (i10 == bVar7.getNumber()) {
            return bVar7;
        }
        AbstractC5861a.a("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i10));
        return bVar;
    }

    private void z0(final SQLiteDatabase sQLiteDatabase) {
        p1(new d() { // from class: k3.l
            @Override // k3.M.d
            public final Object a() {
                return M.N0(sQLiteDatabase);
            }
        }, new b() { // from class: k3.w
            @Override // k3.M.b
            public final Object apply(Object obj) {
                return M.O0((Throwable) obj);
            }
        });
    }

    long B0() {
        return E0() * F0();
    }

    SQLiteDatabase C0() {
        final W w10 = this.f51131a;
        Objects.requireNonNull(w10);
        return (SQLiteDatabase) p1(new d() { // from class: k3.E
            @Override // k3.M.d
            public final Object a() {
                return w10.getWritableDatabase();
            }
        }, new b() { // from class: k3.F
            @Override // k3.M.b
            public final Object apply(Object obj) {
                return M.P0((Throwable) obj);
            }
        });
    }

    @Override // k3.InterfaceC6370d
    public Iterable I(final AbstractC4215p abstractC4215p) {
        return (Iterable) I0(new b() { // from class: k3.L
            @Override // k3.M.b
            public final Object apply(Object obj) {
                return this.f51128a.X0(abstractC4215p, (SQLiteDatabase) obj);
            }
        });
    }

    Object I0(b bVar) {
        SQLiteDatabase sQLiteDatabaseC0 = C0();
        sQLiteDatabaseC0.beginTransaction();
        try {
            Object objApply = bVar.apply(sQLiteDatabaseC0);
            sQLiteDatabaseC0.setTransactionSuccessful();
            return objApply;
        } finally {
            sQLiteDatabaseC0.endTransaction();
        }
    }

    @Override // k3.InterfaceC6370d
    public AbstractC6377k N(final AbstractC4215p abstractC4215p, final AbstractC4208i abstractC4208i) {
        AbstractC5861a.b("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", abstractC4215p.d(), abstractC4208i.n(), abstractC4215p.b());
        long jLongValue = ((Long) I0(new b() { // from class: k3.m
            @Override // k3.M.b
            public final Object apply(Object obj) {
                return this.f51177a.c1(abstractC4208i, abstractC4215p, (SQLiteDatabase) obj);
            }
        })).longValue();
        if (jLongValue < 1) {
            return null;
        }
        return AbstractC6377k.a(jLongValue, abstractC4215p, abstractC4208i);
    }

    @Override // k3.InterfaceC6370d
    public void O(final AbstractC4215p abstractC4215p, final long j10) {
        I0(new b() { // from class: k3.o
            @Override // k3.M.b
            public final Object apply(Object obj) {
                return M.i1(j10, abstractC4215p, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // k3.InterfaceC6369c
    public void a(final long j10, final C5517c.b bVar, final String str) {
        I0(new b() { // from class: k3.q
            @Override // k3.M.b
            public final Object apply(Object obj) {
                return M.h1(str, bVar, j10, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // k3.InterfaceC6370d
    public long a0(AbstractC4215p abstractC4215p) {
        return ((Long) s1(C0().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{abstractC4215p.b(), String.valueOf(AbstractC6868a.a(abstractC4215p.d()))}), new b() { // from class: k3.H
            @Override // k3.M.b
            public final Object apply(Object obj) {
                return M.Q0((Cursor) obj);
            }
        })).longValue();
    }

    @Override // k3.InterfaceC6370d
    public void c0(Iterable iterable) {
        if (iterable.iterator().hasNext()) {
            final String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + r1(iterable);
            final String str2 = "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name";
            I0(new b() { // from class: k3.K
                @Override // k3.M.b
                public final Object apply(Object obj) {
                    return this.f51125a.f1(str, str2, (SQLiteDatabase) obj);
                }
            });
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f51131a.close();
    }

    @Override // k3.InterfaceC6370d
    public boolean e(final AbstractC4215p abstractC4215p) {
        return ((Boolean) I0(new b() { // from class: k3.n
            @Override // k3.M.b
            public final Object apply(Object obj) {
                return this.f51180a.U0(abstractC4215p, (SQLiteDatabase) obj);
            }
        })).booleanValue();
    }

    @Override // k3.InterfaceC6370d
    public int f() {
        final long jA = this.f51132b.a() - this.f51134d.c();
        return ((Integer) I0(new b() { // from class: k3.I
            @Override // k3.M.b
            public final Object apply(Object obj) {
                return this.f51123a.M0(jA, (SQLiteDatabase) obj);
            }
        })).intValue();
    }

    @Override // k3.InterfaceC6369c
    public void g() {
        I0(new b() { // from class: k3.p
            @Override // k3.M.b
            public final Object apply(Object obj) {
                return this.f51184a.j1((SQLiteDatabase) obj);
            }
        });
    }

    @Override // l3.InterfaceC6542a
    public Object h(InterfaceC6542a.InterfaceC1933a interfaceC1933a) {
        SQLiteDatabase sQLiteDatabaseC0 = C0();
        z0(sQLiteDatabaseC0);
        try {
            Object objG = interfaceC1933a.g();
            sQLiteDatabaseC0.setTransactionSuccessful();
            return objG;
        } finally {
            sQLiteDatabaseC0.endTransaction();
        }
    }

    @Override // k3.InterfaceC6370d
    public void i(Iterable iterable) {
        if (iterable.iterator().hasNext()) {
            C0().compileStatement("DELETE FROM events WHERE _id in " + r1(iterable)).execute();
        }
    }

    @Override // k3.InterfaceC6369c
    public C5515a j() {
        final C5515a.C1758a c1758aE = C5515a.e();
        final HashMap map = new HashMap();
        final String str = "SELECT log_source, reason, events_dropped_count FROM log_event_dropped";
        return (C5515a) I0(new b() { // from class: k3.s
            @Override // k3.M.b
            public final Object apply(Object obj) {
                return this.f51189a.Z0(str, map, c1758aE, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // k3.InterfaceC6370d
    public Iterable x() {
        return (Iterable) I0(new b() { // from class: k3.G
            @Override // k3.M.b
            public final Object apply(Object obj) {
                return M.V0((SQLiteDatabase) obj);
            }
        });
    }
}
