package Jd;

import Yg.J;
import android.database.Cursor;
import androidx.sqlite.db.SupportSQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import jh.AbstractC6329b;
import kotlin.jvm.internal.AbstractC6492s;
import n2.AbstractC6867a;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f10003a = new d();

    public static final class a extends AbstractC6867a {
        a() {
            super(1, 2);
        }

        @Override // n2.AbstractC6867a
        public void a(SupportSQLiteDatabase db2) {
            AbstractC6492s.i(db2, "db");
            db2.execSQL("DROP TABLE IF EXISTS config");
        }
    }

    public static final class b extends AbstractC6867a {
        b() {
            super(2, 3);
        }

        @Override // n2.AbstractC6867a
        public void a(SupportSQLiteDatabase db2) {
            AbstractC6492s.i(db2, "db");
            db2.execSQL("DROP TABLE IF EXISTS config");
            db2.execSQL("CREATE TABLE IF NOT EXISTS config (`id` INTEGER NOT NULL, `cloudToken` TEXT NOT NULL, PRIMARY KEY(`id`))");
            db2.execSQL("CREATE TABLE IF NOT EXISTS site (`id` INTEGER NOT NULL, `name` TEXT, `wanIP` TEXT, `imgResId` INTEGER, `imgEngineId` INTEGER, `gatewayProductSku` TEXT, PRIMARY KEY(`id`))");
        }
    }

    public static final class c extends AbstractC6867a {
        c() {
            super(3, 4);
        }

        @Override // n2.AbstractC6867a
        public void a(SupportSQLiteDatabase db2) {
            AbstractC6492s.i(db2, "db");
            db2.execSQL("DROP TABLE IF EXISTS config");
            db2.execSQL("CREATE TABLE IF NOT EXISTS config (`id` INTEGER NOT NULL, `cloudToken` TEXT NOT NULL, `cloudSecret` TEXT NOT NULL, `publicSecret` TEXT NOT NULL, PRIMARY KEY(`id`))");
        }
    }

    /* renamed from: Jd.d$d, reason: collision with other inner class name */
    public static final class C0406d extends AbstractC6867a {
        C0406d() {
            super(4, 5);
        }

        @Override // n2.AbstractC6867a
        public void a(SupportSQLiteDatabase db2) {
            AbstractC6492s.i(db2, "db");
            db2.execSQL("ALTER TABLE site ADD COLUMN locationLat REAL");
            db2.execSQL("ALTER TABLE site ADD COLUMN locationLon REAL");
            db2.execSQL("ALTER TABLE site ADD COLUMN locationText TEXT");
        }
    }

    public static final class e extends AbstractC6867a {
        e() {
            super(5, 6);
        }

        @Override // n2.AbstractC6867a
        public void a(SupportSQLiteDatabase db2) {
            AbstractC6492s.i(db2, "db");
            db2.execSQL("CREATE TABLE IF NOT EXISTS config_temp (`id` INTEGER NOT NULL, `cloudToken` TEXT NOT NULL, `cloudSecret` TEXT NOT NULL, `key` TEXT NOT NULL, PRIMARY KEY(`id`))");
            db2.execSQL("CREATE UNIQUE INDEX index_key ON config_temp (key)");
            db2.execSQL("INSERT INTO config_temp (id, cloudToken, cloudSecret, key) SELECT id, cloudToken, cloudSecret, publicSecret FROM config");
            db2.execSQL("DROP TABLE config");
            db2.execSQL("ALTER TABLE config_temp RENAME to config");
        }
    }

    public static final class f extends AbstractC6867a {
        f() {
            super(6, 7);
        }

        @Override // n2.AbstractC6867a
        public void a(SupportSQLiteDatabase db2) {
            AbstractC6492s.i(db2, "db");
            db2.execSQL("DROP TABLE IF EXISTS site");
            db2.execSQL("DROP TABLE IF EXISTS status");
        }
    }

    public static final class g extends AbstractC6867a {
        g() {
            super(7, 8);
        }

        @Override // n2.AbstractC6867a
        public void a(SupportSQLiteDatabase db2) {
            AbstractC6492s.i(db2, "db");
            ArrayList arrayList = new ArrayList();
            Cursor cursorQuery = db2.query("SELECT id, key FROM config");
            try {
                if (cursorQuery.moveToFirst()) {
                    int columnIndex = cursorQuery.getColumnIndex("id");
                    int columnIndex2 = cursorQuery.getColumnIndex("key");
                    do {
                        long j10 = cursorQuery.getLong(columnIndex);
                        String string = cursorQuery.getString(columnIndex2);
                        d dVar = d.f10003a;
                        AbstractC6492s.f(string);
                        if (!dVar.h(string)) {
                            arrayList.add(Long.valueOf(j10));
                        }
                    } while (cursorQuery.moveToNext());
                }
                J j11 = J.f24997a;
                AbstractC6329b.a(cursorQuery, null);
                Z7.b.h("SSO Hotfix Migration - deleting " + arrayList.size() + " tunnel tokens", null, 2, null);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    db2.execSQL("DELETE FROM config WHERE id=" + ((Number) it.next()).longValue());
                }
            } finally {
            }
        }
    }

    private d() {
    }

    public final AbstractC6867a a() {
        return new a();
    }

    public final AbstractC6867a b() {
        return new b();
    }

    public final AbstractC6867a c() {
        return new c();
    }

    public final AbstractC6867a d() {
        return new C0406d();
    }

    public final AbstractC6867a e() {
        return new e();
    }

    public final AbstractC6867a f() {
        return new f();
    }

    public final AbstractC6867a g() {
        return new g();
    }

    public final boolean h(String string) {
        AbstractC6492s.i(string, "string");
        try {
            UUID.fromString(string);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
