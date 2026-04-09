package androidx.sqlite.db;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.util.Pair;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.t;
import net.sqlcipher.database.SQLiteDatabase;
import r2.C7559b;

/* loaded from: classes.dex */
public interface SupportSQLiteOpenHelper extends Closeable {

    public static final class Configuration {

        /* renamed from: f, reason: collision with root package name */
        public static final b f32345f = new b(null);

        /* renamed from: a, reason: collision with root package name */
        public final Context f32346a;

        /* renamed from: b, reason: collision with root package name */
        public final String f32347b;

        /* renamed from: c, reason: collision with root package name */
        public final a f32348c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f32349d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f32350e;

        public static class a {

            /* renamed from: a, reason: collision with root package name */
            private final Context f32351a;

            /* renamed from: b, reason: collision with root package name */
            private String f32352b;

            /* renamed from: c, reason: collision with root package name */
            private a f32353c;

            /* renamed from: d, reason: collision with root package name */
            private boolean f32354d;

            /* renamed from: e, reason: collision with root package name */
            private boolean f32355e;

            public a(Context context) {
                AbstractC6492s.i(context, "context");
                this.f32351a = context;
            }

            public Configuration a() {
                String str;
                a aVar = this.f32353c;
                if (aVar == null) {
                    throw new IllegalArgumentException("Must set a callback to create the configuration.");
                }
                if (this.f32354d && ((str = this.f32352b) == null || str.length() == 0)) {
                    throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
                }
                return new Configuration(this.f32351a, this.f32352b, aVar, this.f32354d, this.f32355e);
            }

            public a b(a callback) {
                AbstractC6492s.i(callback, "callback");
                this.f32353c = callback;
                return this;
            }

            public a c(String str) {
                this.f32352b = str;
                return this;
            }
        }

        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a(Context context) {
                AbstractC6492s.i(context, "context");
                return new a(context);
            }

            private b() {
            }
        }

        public Configuration(Context context, String str, a callback, boolean z10, boolean z11) {
            AbstractC6492s.i(context, "context");
            AbstractC6492s.i(callback, "callback");
            this.f32346a = context;
            this.f32347b = str;
            this.f32348c = callback;
            this.f32349d = z10;
            this.f32350e = z11;
        }

        public static final a a(Context context) {
            return f32345f.a(context);
        }
    }

    public static abstract class a {

        /* renamed from: b, reason: collision with root package name */
        public static final C1129a f32356b = new C1129a(null);

        /* renamed from: a, reason: collision with root package name */
        public final int f32357a;

        /* renamed from: androidx.sqlite.db.SupportSQLiteOpenHelper$a$a, reason: collision with other inner class name */
        public static final class C1129a {
            public /* synthetic */ C1129a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C1129a() {
            }
        }

        public a(int i10) {
            this.f32357a = i10;
        }

        private final void a(String str) {
            if (t.C(str, SQLiteDatabase.MEMORY, true)) {
                return;
            }
            int length = str.length() - 1;
            int i10 = 0;
            boolean z10 = false;
            while (i10 <= length) {
                boolean z11 = AbstractC6492s.k(str.charAt(!z10 ? i10 : length), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z11) {
                    i10++;
                } else {
                    z10 = true;
                }
            }
            if (str.subSequence(i10, length + 1).toString().length() == 0) {
                return;
            }
            Log.w("SupportSQLite", "deleting the database file: " + str);
            try {
                C7559b.a(new File(str));
            } catch (Exception e10) {
                Log.w("SupportSQLite", "delete failed: ", e10);
            }
        }

        public void b(SupportSQLiteDatabase db2) {
            AbstractC6492s.i(db2, "db");
        }

        public void c(SupportSQLiteDatabase db2) {
            AbstractC6492s.i(db2, "db");
            Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + db2 + ".path");
            if (!db2.isOpen()) {
                String path = db2.getPath();
                if (path != null) {
                    a(path);
                    return;
                }
                return;
            }
            List attachedDbs = null;
            try {
                try {
                    attachedDbs = db2.getAttachedDbs();
                } finally {
                    if (attachedDbs != null) {
                        Iterator it = attachedDbs.iterator();
                        while (it.hasNext()) {
                            Object obj = ((Pair) it.next()).second;
                            AbstractC6492s.h(obj, "p.second");
                            a((String) obj);
                        }
                    } else {
                        String path2 = db2.getPath();
                        if (path2 != null) {
                            a(path2);
                        }
                    }
                }
            } catch (SQLiteException unused) {
            }
            try {
                db2.close();
            } catch (IOException unused2) {
            }
            if (attachedDbs != null) {
                return;
            }
        }

        public abstract void d(SupportSQLiteDatabase supportSQLiteDatabase);

        public abstract void e(SupportSQLiteDatabase supportSQLiteDatabase, int i10, int i11);

        public void f(SupportSQLiteDatabase db2) {
            AbstractC6492s.i(db2, "db");
        }

        public abstract void g(SupportSQLiteDatabase supportSQLiteDatabase, int i10, int i11);
    }

    public interface b {
        SupportSQLiteOpenHelper create(Configuration configuration);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    String getDatabaseName();

    SupportSQLiteDatabase getWritableDatabase();

    void setWriteAheadLoggingEnabled(boolean z10);
}
