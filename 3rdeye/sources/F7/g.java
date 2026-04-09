package F7;

import C.C0635w;
import H6.I;
import H7.b;
import J7.a;
import N7.C1154e9;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import b9.C1992A;
import b9.C2001h;
import c9.C2077A;
import io.appmetrica.analytics.impl.Oo;
import java.io.Closeable;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;
import p9.InterfaceC5480a;

/* compiled from: DivStorageImpl.kt */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final H7.b f1680a;

    /* renamed from: b, reason: collision with root package name */
    public final H7.k f1681b;

    /* renamed from: c, reason: collision with root package name */
    public final I f1682c;

    /* renamed from: d, reason: collision with root package name */
    public final Map<b9.l<Integer, Integer>, H7.f> f1683d;

    /* renamed from: e, reason: collision with root package name */
    public final f f1684e;

    /* compiled from: DivStorageImpl.kt */
    public final class a implements J7.a, Closeable {

        /* renamed from: b, reason: collision with root package name */
        public final Cursor f1685b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f1686c;

        /* renamed from: d, reason: collision with root package name */
        public final String f1687d;

        /* renamed from: e, reason: collision with root package name */
        public final Object f1688e;

        /* compiled from: DivStorageImpl.kt */
        /* renamed from: F7.g$a$a, reason: collision with other inner class name */
        public static final class C0029a extends kotlin.jvm.internal.m implements InterfaceC5480a<JSONObject> {

            /* renamed from: h, reason: collision with root package name */
            public final /* synthetic */ g f1690h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0029a(g gVar) {
                super(0);
                this.f1690h = gVar;
            }

            @Override // p9.InterfaceC5480a
            public final JSONObject invoke() {
                a aVar = a.this;
                if (aVar.f1686c) {
                    throw new IllegalStateException("Data no longer valid!");
                }
                Cursor cursor = aVar.f1685b;
                byte[] blob = cursor.getBlob(g.a(this.f1690h, cursor, "raw_json_data"));
                kotlin.jvm.internal.l.e(blob, "cursor.getBlob(cursor.in…Of(COLUMN_RAW_JSON_DATA))");
                Charset UTF_8 = StandardCharsets.UTF_8;
                kotlin.jvm.internal.l.e(UTF_8, "UTF_8");
                return new JSONObject(new String(blob, UTF_8));
            }
        }

        public a(g gVar, Cursor cursor) {
            this.f1685b = cursor;
            String string = cursor.getString(g.a(gVar, cursor, "raw_json_id"));
            kotlin.jvm.internal.l.e(string, "cursor.getString(cursor.…exOf(COLUMN_RAW_JSON_ID))");
            this.f1687d = string;
            this.f1688e = C2001h.a(b9.i.NONE, new C0029a(gVar));
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.f1686c = true;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [b9.g, java.lang.Object] */
        @Override // J7.a
        public final JSONObject getData() {
            return (JSONObject) this.f1688e.getValue();
        }

        @Override // J7.a
        public final String getId() {
            return this.f1687d;
        }
    }

    public g(Context context, Oo oo, String str) {
        kotlin.jvm.internal.l.f(context, "context");
        String name = str.length() == 0 ? "div-storage.db" : str.concat("-div-storage.db");
        j jVar = new j(this);
        k kVar = new k(this);
        kotlin.jvm.internal.l.f(name, "name");
        this.f1680a = new H7.b(context, name, jVar, kVar);
        H7.k kVar2 = new H7.k(new m(this, 0));
        this.f1681b = kVar2;
        this.f1682c = new I(kVar2, 1);
        this.f1683d = C2077A.m(new b9.l(new b9.l(2, 3), new e()));
        this.f1684e = new f(this);
    }

    public static final int a(g gVar, Cursor cursor, String str) {
        gVar.getClass();
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        throw new IllegalStateException(C1154e9.i("Column '", str, "' not found in cursor"));
    }

    public static void c(b.a aVar) throws SQLException {
        SQLiteDatabase sQLiteDatabase = aVar.f2279b;
        try {
            sQLiteDatabase.execSQL("\n    CREATE TABLE IF NOT EXISTS cards(\n    layout_id TEXT NOT NULL PRIMARY KEY,\n    card_data BLOB NULLABLE,\n    metadata BLOB NULLABLE,\n    group_id TEXT NOT NULL)");
            sQLiteDatabase.execSQL("\n    CREATE TABLE IF NOT EXISTS template_references(\n    group_id TEXT NOT NULL,\n    template_id TEXT NOT NULL,\n    template_hash TEXT NOT NULL,\n    PRIMARY KEY(group_id, template_id))");
            sQLiteDatabase.execSQL("\n    CREATE TABLE IF NOT EXISTS templates(\n    template_hash TEXT NOT NULL PRIMARY KEY,\n    template_data BLOB NULLABLE)");
            sQLiteDatabase.execSQL("\n    CREATE TABLE IF NOT EXISTS raw_json(\n    raw_json_id TEXT NOT NULL PRIMARY KEY,\n    raw_json_data BLOB NULLABLE)");
        } catch (SQLException e4) {
            throw new SQLException("Create tables", e4);
        }
    }

    public static d d(g gVar, RuntimeException runtimeException, String str) {
        gVar.getClass();
        return new d("Unexpected exception on database access: " + str, runtimeException);
    }

    public final ArrayList b(Set set) throws SQLException {
        SQLiteDatabase sQLiteDatabase;
        ArrayList arrayList = new ArrayList(set.size());
        int i = 0;
        h hVar = new h(set, 0);
        H7.b bVar = this.f1680a;
        b.C0038b c0038b = bVar.f2276a;
        synchronized (c0038b) {
            c0038b.f2284d = c0038b.f2281a.getReadableDatabase();
            c0038b.f2283c++;
            LinkedHashSet linkedHashSet = c0038b.f2282b;
            Thread threadCurrentThread = Thread.currentThread();
            kotlin.jvm.internal.l.e(threadCurrentThread, "currentThread()");
            linkedHashSet.add(threadCurrentThread);
            sQLiteDatabase = c0038b.f2284d;
            kotlin.jvm.internal.l.c(sQLiteDatabase);
        }
        b.a aVarA = bVar.a(sQLiteDatabase);
        H7.h hVar2 = new H7.h(new l(aVarA, i), new C0635w(2, aVarA, hVar));
        try {
            Cursor cursorA = hVar2.a();
            if (cursorA.getCount() != 0 && cursorA.moveToFirst()) {
                do {
                    a aVar = new a(this, cursorA);
                    arrayList.add(new a.C0050a(aVar.f1687d, aVar.getData()));
                    aVar.f1686c = true;
                } while (cursorA.moveToNext());
            }
            C1992A c1992a = C1992A.f18074a;
            hVar2.close();
            return arrayList;
        } finally {
        }
    }
}
