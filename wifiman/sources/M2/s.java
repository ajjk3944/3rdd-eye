package m2;

import android.database.Cursor;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.util.Iterator;
import java.util.List;
import jh.AbstractC6329b;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n2.AbstractC6867a;
import r2.C7558a;

/* loaded from: classes.dex */
public class s extends SupportSQLiteOpenHelper.a {

    /* renamed from: g, reason: collision with root package name */
    public static final a f53081g = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private C6748f f53082c;

    /* renamed from: d, reason: collision with root package name */
    private final b f53083d;

    /* renamed from: e, reason: collision with root package name */
    private final String f53084e;

    /* renamed from: f, reason: collision with root package name */
    private final String f53085f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(SupportSQLiteDatabase db2) {
            AbstractC6492s.i(db2, "db");
            Cursor cursorQuery = db2.query("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
            try {
                boolean z10 = false;
                if (cursorQuery.moveToFirst()) {
                    if (cursorQuery.getInt(0) == 0) {
                        z10 = true;
                    }
                }
                AbstractC6329b.a(cursorQuery, null);
                return z10;
            } finally {
            }
        }

        public final boolean b(SupportSQLiteDatabase db2) {
            AbstractC6492s.i(db2, "db");
            Cursor cursorQuery = db2.query("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
            try {
                boolean z10 = false;
                if (cursorQuery.moveToFirst()) {
                    if (cursorQuery.getInt(0) != 0) {
                        z10 = true;
                    }
                }
                AbstractC6329b.a(cursorQuery, null);
                return z10;
            } finally {
            }
        }

        private a() {
        }
    }

    public static abstract class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f53086a;

        public b(int i10) {
            this.f53086a = i10;
        }

        public abstract void a(SupportSQLiteDatabase supportSQLiteDatabase);

        public abstract void b(SupportSQLiteDatabase supportSQLiteDatabase);

        public abstract void c(SupportSQLiteDatabase supportSQLiteDatabase);

        public abstract void d(SupportSQLiteDatabase supportSQLiteDatabase);

        public abstract void e(SupportSQLiteDatabase supportSQLiteDatabase);

        public abstract void f(SupportSQLiteDatabase supportSQLiteDatabase);

        public abstract c g(SupportSQLiteDatabase supportSQLiteDatabase);
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f53087a;

        /* renamed from: b, reason: collision with root package name */
        public final String f53088b;

        public c(boolean z10, String str) {
            this.f53087a = z10;
            this.f53088b = str;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(C6748f configuration, b delegate, String identityHash, String legacyHash) {
        super(delegate.f53086a);
        AbstractC6492s.i(configuration, "configuration");
        AbstractC6492s.i(delegate, "delegate");
        AbstractC6492s.i(identityHash, "identityHash");
        AbstractC6492s.i(legacyHash, "legacyHash");
        this.f53082c = configuration;
        this.f53083d = delegate;
        this.f53084e = identityHash;
        this.f53085f = legacyHash;
    }

    private final void h(SupportSQLiteDatabase supportSQLiteDatabase) {
        if (!f53081g.b(supportSQLiteDatabase)) {
            c cVarG = this.f53083d.g(supportSQLiteDatabase);
            if (cVarG.f53087a) {
                this.f53083d.e(supportSQLiteDatabase);
                j(supportSQLiteDatabase);
                return;
            } else {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + cVarG.f53088b);
            }
        }
        Cursor cursorQuery = supportSQLiteDatabase.query(new C7558a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
        try {
            String string = cursorQuery.moveToFirst() ? cursorQuery.getString(0) : null;
            AbstractC6329b.a(cursorQuery, null);
            if (AbstractC6492s.d(this.f53084e, string) || AbstractC6492s.d(this.f53085f, string)) {
                return;
            }
            throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + this.f53084e + ", found: " + string);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                AbstractC6329b.a(cursorQuery, th2);
                throw th3;
            }
        }
    }

    private final void i(SupportSQLiteDatabase supportSQLiteDatabase) {
        supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    private final void j(SupportSQLiteDatabase supportSQLiteDatabase) {
        i(supportSQLiteDatabase);
        supportSQLiteDatabase.execSQL(r.a(this.f53084e));
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.a
    public void b(SupportSQLiteDatabase db2) {
        AbstractC6492s.i(db2, "db");
        super.b(db2);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.a
    public void d(SupportSQLiteDatabase db2) {
        AbstractC6492s.i(db2, "db");
        boolean zA = f53081g.a(db2);
        this.f53083d.a(db2);
        if (!zA) {
            c cVarG = this.f53083d.g(db2);
            if (!cVarG.f53087a) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + cVarG.f53088b);
            }
        }
        j(db2);
        this.f53083d.c(db2);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.a
    public void e(SupportSQLiteDatabase db2, int i10, int i11) {
        AbstractC6492s.i(db2, "db");
        g(db2, i10, i11);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.a
    public void f(SupportSQLiteDatabase db2) {
        AbstractC6492s.i(db2, "db");
        super.f(db2);
        h(db2);
        this.f53083d.d(db2);
        this.f53082c = null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.a
    public void g(SupportSQLiteDatabase db2, int i10, int i11) {
        List listD;
        AbstractC6492s.i(db2, "db");
        C6748f c6748f = this.f53082c;
        if (c6748f == null || (listD = c6748f.f53016d.d(i10, i11)) == null) {
            C6748f c6748f2 = this.f53082c;
            if (c6748f2 != null && !c6748f2.a(i10, i11)) {
                this.f53083d.b(db2);
                this.f53083d.a(db2);
                return;
            }
            throw new IllegalStateException("A migration from " + i10 + " to " + i11 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
        }
        this.f53083d.f(db2);
        Iterator it = listD.iterator();
        while (it.hasNext()) {
            ((AbstractC6867a) it.next()).a(db2);
        }
        c cVarG = this.f53083d.g(db2);
        if (cVarG.f53087a) {
            this.f53083d.e(db2);
            j(db2);
        } else {
            throw new IllegalStateException("Migration didn't properly handle: " + cVarG.f53088b);
        }
    }
}
