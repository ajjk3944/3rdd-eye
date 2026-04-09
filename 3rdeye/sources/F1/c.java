package F1;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import kotlin.jvm.internal.l;

/* compiled from: SupportSQLiteOpenHelper.android.kt */
/* loaded from: classes.dex */
public interface c extends Closeable {

    /* compiled from: SupportSQLiteOpenHelper.android.kt */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Context f1579a;

        /* renamed from: b, reason: collision with root package name */
        public final String f1580b;

        /* renamed from: c, reason: collision with root package name */
        public final a f1581c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f1582d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f1583e;

        public b(Context context, String str, a callback, boolean z10, boolean z11) {
            l.f(context, "context");
            l.f(callback, "callback");
            this.f1579a = context;
            this.f1580b = str;
            this.f1581c = callback;
            this.f1582d = z10;
            this.f1583e = z11;
        }
    }

    /* compiled from: SupportSQLiteOpenHelper.android.kt */
    /* renamed from: F1.c$c, reason: collision with other inner class name */
    public interface InterfaceC0026c {
        c a(b bVar);
    }

    String getDatabaseName();

    F1.b getWritableDatabase();

    void setWriteAheadLoggingEnabled(boolean z10);

    /* compiled from: SupportSQLiteOpenHelper.android.kt */
    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f1578a;

        public a(int i) {
            this.f1578a = i;
        }

        public static void a(String str) {
            if (str.equalsIgnoreCase(":memory:")) {
                return;
            }
            int length = str.length() - 1;
            int i = 0;
            boolean z10 = false;
            while (i <= length) {
                boolean z11 = l.h(str.charAt(!z10 ? i : length), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z11) {
                    i++;
                } else {
                    z10 = true;
                }
            }
            if (str.subSequence(i, length + 1).toString().length() == 0) {
                return;
            }
            Log.w("SupportSQLite", "deleting the database file: ".concat(str));
            try {
                SQLiteDatabase.deleteDatabase(new File(str));
            } catch (Exception e4) {
                Log.w("SupportSQLite", "delete failed: ", e4);
            }
        }

        public abstract void c(G1.d dVar);

        public abstract void d(G1.d dVar, int i, int i10);

        public abstract void e(G1.d dVar);

        public abstract void f(G1.d dVar, int i, int i10);

        public void b(G1.d dVar) {
        }
    }
}
