package z1;

import java.io.IOException;
import java.util.Locale;
import kotlin.jvm.internal.l;
import y9.q;
import z1.AbstractC5856e;

/* compiled from: SupportSQLiteConnection.android.kt */
/* renamed from: z1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5852a implements E1.a {

    /* renamed from: b, reason: collision with root package name */
    public final F1.b f48410b;

    public C5852a(F1.b db) {
        l.f(db, "db");
        this.f48410b = db;
    }

    @Override // E1.a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final AbstractC5856e K0(String sql) {
        l.f(sql, "sql");
        F1.b db = this.f48410b;
        l.f(db, "db");
        String string = q.w0(sql).toString();
        if (string.length() >= 3) {
            String strSubstring = string.substring(0, 3);
            l.e(strSubstring, "substring(...)");
            String upperCase = strSubstring.toUpperCase(Locale.ROOT);
            l.e(upperCase, "toUpperCase(...)");
            int iHashCode = upperCase.hashCode();
            if (iHashCode == 79487 ? upperCase.equals("PRA") : !(iHashCode == 81978 ? !upperCase.equals("SEL") : !(iHashCode == 85954 && upperCase.equals("WIT")))) {
                AbstractC5856e.a aVar = new AbstractC5856e.a(db, sql);
                aVar.f48423e = new int[0];
                aVar.f48424f = new long[0];
                aVar.f48425g = new double[0];
                aVar.f48426h = new String[0];
                aVar.i = new byte[0][];
                return aVar;
            }
        }
        return new AbstractC5856e.b(db, sql);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f48410b.close();
    }
}
