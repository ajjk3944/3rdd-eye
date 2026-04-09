package k3;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
final class W extends SQLiteOpenHelper {

    /* renamed from: c, reason: collision with root package name */
    private static final String f51143c = "INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")";

    /* renamed from: d, reason: collision with root package name */
    static int f51144d = 7;

    /* renamed from: e, reason: collision with root package name */
    private static final a f51145e;

    /* renamed from: f, reason: collision with root package name */
    private static final a f51146f;

    /* renamed from: g, reason: collision with root package name */
    private static final a f51147g;

    /* renamed from: h, reason: collision with root package name */
    private static final a f51148h;

    /* renamed from: i, reason: collision with root package name */
    private static final a f51149i;

    /* renamed from: j, reason: collision with root package name */
    private static final a f51150j;

    /* renamed from: k, reason: collision with root package name */
    private static final a f51151k;

    /* renamed from: l, reason: collision with root package name */
    private static final List f51152l;

    /* renamed from: a, reason: collision with root package name */
    private final int f51153a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f51154b;

    public interface a {
        void a(SQLiteDatabase sQLiteDatabase);
    }

    static {
        a aVar = new a() { // from class: k3.O
            @Override // k3.W.a
            public final void a(SQLiteDatabase sQLiteDatabase) throws SQLException {
                W.C(sQLiteDatabase);
            }
        };
        f51145e = aVar;
        a aVar2 = new a() { // from class: k3.P
            @Override // k3.W.a
            public final void a(SQLiteDatabase sQLiteDatabase) throws SQLException {
                W.J(sQLiteDatabase);
            }
        };
        f51146f = aVar2;
        a aVar3 = new a() { // from class: k3.Q
            @Override // k3.W.a
            public final void a(SQLiteDatabase sQLiteDatabase) throws SQLException {
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
            }
        };
        f51147g = aVar3;
        a aVar4 = new a() { // from class: k3.S
            @Override // k3.W.a
            public final void a(SQLiteDatabase sQLiteDatabase) throws SQLException {
                W.S(sQLiteDatabase);
            }
        };
        f51148h = aVar4;
        a aVar5 = new a() { // from class: k3.T
            @Override // k3.W.a
            public final void a(SQLiteDatabase sQLiteDatabase) throws SQLException {
                W.T(sQLiteDatabase);
            }
        };
        f51149i = aVar5;
        a aVar6 = new a() { // from class: k3.U
            @Override // k3.W.a
            public final void a(SQLiteDatabase sQLiteDatabase) throws SQLException {
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN product_id INTEGER");
            }
        };
        f51150j = aVar6;
        a aVar7 = new a() { // from class: k3.V
            @Override // k3.W.a
            public final void a(SQLiteDatabase sQLiteDatabase) throws SQLException {
                W.b0(sQLiteDatabase);
            }
        };
        f51151k = aVar7;
        f51152l = Arrays.asList(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
    }

    W(Context context, String str, int i10) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i10);
        this.f51154b = false;
        this.f51153a = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void C(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void J(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void S(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void T(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
        sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
        sQLiteDatabase.execSQL(f51143c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b0(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN pseudonymous_id TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN experiment_ids_clear_blob BLOB");
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN experiment_ids_encrypted_blob BLOB");
    }

    private void d0(SQLiteDatabase sQLiteDatabase, int i10) {
        y(sQLiteDatabase);
        f0(sQLiteDatabase, 0, i10);
    }

    private void f0(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        List list = f51152l;
        if (i11 <= list.size()) {
            while (i10 < i11) {
                ((a) f51152l.get(i10)).a(sQLiteDatabase);
                i10++;
            }
            return;
        }
        throw new IllegalArgumentException("Migration from " + i10 + " to " + i11 + " was requested, but cannot be performed. Only " + list.size() + " migrations are provided");
    }

    private void y(SQLiteDatabase sQLiteDatabase) {
        if (this.f51154b) {
            return;
        }
        onConfigure(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f51154b = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        d0(sQLiteDatabase, this.f51153a);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        d0(sQLiteDatabase, i11);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        y(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        y(sQLiteDatabase);
        f0(sQLiteDatabase, i10, i11);
    }
}
