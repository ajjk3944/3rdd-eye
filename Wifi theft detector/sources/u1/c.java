package u1;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public interface c extends Closeable {

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final Context f24488a;

        /* renamed from: b, reason: collision with root package name */
        public final String f24489b;

        /* renamed from: c, reason: collision with root package name */
        public final a f24490c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f24491d;

        public static class a {

            /* renamed from: a, reason: collision with root package name */
            public Context f24492a;

            /* renamed from: b, reason: collision with root package name */
            public String f24493b;

            /* renamed from: c, reason: collision with root package name */
            public a f24494c;

            /* renamed from: d, reason: collision with root package name */
            public boolean f24495d;

            public a(Context context) {
                this.f24492a = context;
            }

            public b a() {
                if (this.f24494c == null) {
                    throw new IllegalArgumentException("Must set a callback to create the configuration.");
                }
                if (this.f24492a == null) {
                    throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
                }
                if (this.f24495d && TextUtils.isEmpty(this.f24493b)) {
                    throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
                }
                return new b(this.f24492a, this.f24493b, this.f24494c, this.f24495d);
            }

            public a b(a aVar) {
                this.f24494c = aVar;
                return this;
            }

            public a c(String str) {
                this.f24493b = str;
                return this;
            }

            public a d(boolean z10) {
                this.f24495d = z10;
                return this;
            }
        }

        public b(Context context, String str, a aVar, boolean z10) {
            this.f24488a = context;
            this.f24489b = str;
            this.f24490c = aVar;
            this.f24491d = z10;
        }

        public static a a(Context context) {
            return new a(context);
        }
    }

    /* renamed from: u1.c$c, reason: collision with other inner class name */
    public interface InterfaceC0488c {
        c a(b bVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    String getDatabaseName();

    u1.b getWritableDatabase();

    void setWriteAheadLoggingEnabled(boolean z10);

    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f24487a;

        public a(int i10) {
            this.f24487a = i10;
        }

        public final void a(String str) {
            if (str.equalsIgnoreCase(":memory:") || str.trim().length() == 0) {
                return;
            }
            Log.w("SupportSQLite", "deleting the database file: " + str);
            try {
                SQLiteDatabase.deleteDatabase(new File(str));
            } catch (Exception e10) {
                Log.w("SupportSQLite", "delete failed: ", e10);
            }
        }

        public void c(u1.b bVar) {
            Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + bVar.getPath());
            if (!bVar.isOpen()) {
                a(bVar.getPath());
                return;
            }
            List listX = null;
            try {
                try {
                    listX = bVar.x();
                } finally {
                    if (listX != null) {
                        Iterator it = listX.iterator();
                        while (it.hasNext()) {
                            a((String) ((Pair) it.next()).second);
                        }
                    } else {
                        a(bVar.getPath());
                    }
                }
            } catch (SQLiteException unused) {
            }
            try {
                bVar.close();
            } catch (IOException unused2) {
            }
        }

        public abstract void d(u1.b bVar);

        public abstract void e(u1.b bVar, int i10, int i11);

        public abstract void g(u1.b bVar, int i10, int i11);

        public void b(u1.b bVar) {
        }

        public void f(u1.b bVar) {
        }
    }
}
